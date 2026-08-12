/* ============================================================
 * UltraPlayer — navegador de categorias (filmes/séries/canais).
 *
 * Filosofia (igual o HDX, que NÃO usa biblioteca de virtualização):
 * renderiza os tiles e deixa o NAVEGADOR rolar — o segredo da fluidez
 * é NÃO fazer trabalho pesado por tecla/scroll:
 *   1) Navegação por controle O(1): cada tile tem data-i; ▼/▲/◄/► é só
 *      conta de índice + foca o nó que JÁ existe (sem querySelectorAll
 *      nem getBoundingClientRect por tecla). Exposto via grid.__vnav
 *      (o tv.js usa). Isso também conserta os canais (navega <a>→<a>,
 *      pulando o coração de favoritar).
 *   2) Lazy de imagem por ÍNDICE: calcula as fileiras visíveis a partir
 *      do scrollTop (2 medições por scroll, não 1 por tile).
 *   3) Troca de categoria = página 1 em HTML (rápida, ~30KB) e LIMPA a
 *      tela na hora (sem deixar a categoria velha presa).
 *   4) Paginação por scroll (100/vez) — o DOM cresce só conforme rola.
 *
 * A página define antes: __catKind ('movies'|'series'|'live'),
 * __catId, __catPage, __catHasMore, __catMoreText.
 * Compat universal ES5: XHR, addEventListener. Sem APIs modernas.
 * ============================================================ */
(function () {
    'use strict';

    var KIND = window.__catKind || 'movies';
    var PAGINATED = KIND !== 'live';
    var MORE_TEXT = window.__catMoreText || 'Carregando…';
    var TILE_SEL = (KIND === 'live') ? '.channel-tile-tv' : '.poster-tile-tv';

    var state = {
        catId:   window.__catId || 0,
        page:    window.__catPage || 1,
        hasMore: !!window.__catHasMore,
        loading: false
    };

    var grid       = document.getElementById('content-grid');
    var loadMoreEl = document.getElementById('grid-loadmore');
    var emptyEl    = document.getElementById('grid-empty');
    var titleEl    = document.getElementById('sc-title');
    var contentEl  = document.getElementById('sidebar-content');
    var BUFFER = 600;
    if (!grid || !contentEl) return;

    // ---- cache de navegação O(1) ----
    var tileEls = [];     // todos os tiles renderizados, em ordem
    var cols = 0;         // colunas (medido do layout real)
    var rowH = 0;         // altura de uma fileira (px)
    var fitCols = 0;      // colunas escolhidas pelo fitGrid (caminho não-TV)
    var fitStyleEl = null;

    /* ===== Enche a fileira SEM vão à direita (celular / PC / browser desktop).
       Na TV (body.ui-tv) NÃO roda — lá vale o layout enxuto da Samsung/LG
       (poucos ícones grandes), que NÃO pode ser tocado. Usa só inline-block +
       width:% (universal: roda em WebView de TV box / celular ANTIGO, sem
       grid/flex/clamp/var/calc). Colunas pela largura REAL → 100/cols% = 100%
       exato; a calha vem do padding (box-sizing). Um único <style> reescrito
       (1 write, sem mexer tile a tile) → barato no hardware fraco. ===== */
    function fitGrid() {
        if (TILE_SEL !== '.poster-tile-tv') return;   // canais = LISTA (1 col), sem vão
        try { if (document.body && (' ' + document.body.className + ' ').indexOf(' ui-tv ') >= 0) return; } catch (e) { return; }
        var w = grid.clientWidth || (contentEl && contentEl.clientWidth) || 0;
        if (w < 40) return;
        var c = Math.round(w / (window.__ZX_TILE_TARGET || 210));   // alvo menor (modo Celular) → mais colunas/posters menores
        if (c < 3) c = 3; else if (c > 8) c = 8;
        if (c === fitCols && fitStyleEl) return;        // nada mudou → 0 reflow
        fitCols = c;
        // ⚠️ arredonda pra BAIXO (floor 4 casas): 100/6=16.6667 arredondado p/ CIMA
        // daria 100.0002% → o 6º tile quebraria de linha. 16.6666×6=99.9996 cabe.
        var pct = Math.floor((100 / c) * 10000) / 10000;
        var css = '#content-grid .poster-tile-tv,#search-grid .poster-tile-tv{'
                + 'width:' + pct + '%;margin:0 0 16px;padding:0 7px;'
                + '-webkit-box-sizing:border-box;box-sizing:border-box}';
        if (!fitStyleEl) {
            fitStyleEl = document.getElementById('zx-grid-fit');
            if (!fitStyleEl) { fitStyleEl = document.createElement('style'); fitStyleEl.id = 'zx-grid-fit'; (document.head || document.documentElement).appendChild(fitStyleEl); }
        }
        if (fitStyleEl.styleSheet) fitStyleEl.styleSheet.cssText = css;   // IE/WebKit muito antigo
        else fitStyleEl.textContent = css;
    }

    function curBase() { return window.__BASE || ''; }
    function withBase(u) {
        var BASE = curBase();
        if (!BASE || u.charAt(0) !== '/' || u.charAt(1) === '/') return u;
        if (u.indexOf(BASE + '/') === 0 || u === BASE) return u;
        return BASE + u;
    }
    function stripBase(p) {
        var BASE = curBase();
        return (BASE && p.indexOf(BASE) === 0) ? (p.slice(BASE.length) || '/') : p;
    }

    function fetchJson(url, cb, cacheKey) {
        if (cacheKey && window.HdxCache) {
            var hit = HdxCache.get(cacheKey);
            if (hit) { cb(hit, 200); return; }
        }
        function store(data) {
            if (cacheKey && window.HdxCache && data && typeof data.html === 'string') HdxCache.set(cacheKey, data);
        }
        if (window.Tv && Tv.get) { Tv.get(url, function (data, status) { store(data); cb(data, status); }); return; }
        try {
            var xhr = new XMLHttpRequest();
            xhr.open('GET', withBase(url), true);
            xhr.onreadystatechange = function () {
                if (xhr.readyState !== 4) return;
                var data = null; try { data = JSON.parse(xhr.responseText); } catch (e) {}
                store(data); cb(data, xhr.status);
            };
            xhr.send();
        } catch (e) { cb(null, 0); }
    }
    function cacheKey(catId, page) { return KIND + ':' + catId + ':' + page; }

    function fixLinks(root) {
        var BASE = curBase();
        if (!BASE || !root) return;
        var as = root.getElementsByTagName('a');
        for (var i = 0; i < as.length; i++) {
            var h = as[i].getAttribute('href');
            if (h && h.charAt(0) === '/' && h.charAt(1) !== '/' && h.indexOf(BASE + '/') !== 0 && h !== BASE) {
                as[i].setAttribute('href', BASE + h);
            }
        }
    }

    /* ===== Cache de tiles + geometria (re-medido só ao trocar de pág/categoria/resize) ===== */
    function reindex() {
        var list = grid.querySelectorAll(TILE_SEL);
        tileEls = [];
        for (var i = 0; i < list.length; i++) { list[i].setAttribute('data-i', i); tileEls.push(list[i]); }
        fitGrid();         // largura dos tiles por device (não-TV) ANTES de medir colunas
        measureGeom();
        grid.__cols = cols;
    }
    function measureGeom() {
        cols = 0; rowH = 0;
        if (!tileEls.length) return;
        var t0 = tileEls[0].offsetTop;
        for (var i = 0; i < tileEls.length; i++) { if (tileEls[i].offsetTop === t0) cols++; else break; }
        cols = cols || 1;
        if (tileEls.length > cols) rowH = tileEls[cols].offsetTop - t0;
        if (!rowH || rowH < 1) rowH = tileEls[0].offsetHeight + 14;
    }

    /* ===== Navegação O(1) por índice (tv.js chama via grid.__vnav) =====
       Vale pra pôster (filmes/séries) E canais. Em canais, reindex() pega só
       os <a>.channel-tile-tv (TILE_SEL) — o coração .ct-fav é <button> DENTRO
       do <a>, sem data-i, então a nav vai de <a>→<a> e nunca cai no coração
       (conserta o bug do "anda de 2 em 2" e a trava O(n) do scan espacial). */
    grid.__vnav = function (curEl, dir) {
        var ds = curEl && curEl.getAttribute ? curEl.getAttribute('data-i') : null;
        if (ds === null) return 'SKIP';           // ex.: foco no coração .ct-fav → nav espacial
        var i = parseInt(ds, 10);
        if (isNaN(i) || !cols) return 'SKIP';
        var total = tileEls.length, col = i % cols, t;
        if (dir === 'right')      { if (col < cols - 1 && i + 1 < total) t = i + 1; else return (cols === 1) ? 'ESCAPE' : 'STOP'; }
        else if (dir === 'left')  { if (col > 0) t = i - 1; else return 'ESCAPE'; }
        else if (dir === 'up')    { if (i - cols >= 0) t = i - cols; else return 'ESCAPE'; }
        else if (dir === 'down')  {
            if (i + cols < total) t = i + cols;
            else {                                  // chegou no fim do carregado
                if (PAGINATED && state.hasMore && !state.loading) loadNext();
                return 'STOP';
            }
        } else return 'SKIP';
        // prefetch: descendo perto do fim já pede a próxima página
        if (dir === 'down' && PAGINATED && state.hasMore && !state.loading && t >= total - cols * 3) loadNext();
        return tileEls[t] || 'SKIP';
    };

    /* ===== Lazy de imagem por ÍNDICE (sem getBoundingClientRect por tile) ===== */
    function loadOne(el, src) {
        el.setAttribute('data-loading', '1');
        var im = new Image();
        im.onload = function () { el.style.backgroundImage = "url('" + src + "')"; el.className += ' is-loaded'; };
        im.onerror = function () { el.removeAttribute('data-loading'); };
        im.src = src;
    }
    function loadImgAt(tile) {
        if (!tile) return;
        var img = tile.getElementsByClassName ? (tile.getElementsByClassName('pt-img')[0] || tile.getElementsByClassName('ct-logo')[0]) : null;
        if (!img) return;
        if (img.className.indexOf('is-loaded') !== -1 || img.getAttribute('data-loading')) return;
        var src = img.getAttribute('data-src') || img.getAttribute('data-logo');
        if (src) loadOne(img, src);
    }
    function lazyImages() {
        if (!tileEls.length) return;
        if (!rowH) measureGeom();
        if (!rowH) { for (var z = 0; z < Math.min(tileEls.length, 40); z++) loadImgAt(tileEls[z]); return; }
        // 2 medições só (scroller + 1º tile) → resto é conta de índice.
        // Carrega GRADUAL (igual HDX): fileiras visíveis + 1 acima + 2 abaixo
        // (as 2 de baixo deixam o ▼ chegar com a imagem já pronta). Sem
        // pré-carregar um monte de uma vez (era o "carrega tudo imediatamente").
        var cTop, firstTop;
        try { cTop = contentEl.getBoundingClientRect().top; firstTop = tileEls[0].getBoundingClientRect().top; }
        catch (e) { cTop = 0; firstTop = 0; }
        var viewH = contentEl.clientHeight || 600;
        var topRow = Math.floor((cTop - firstTop) / rowH);
        var visRows = Math.ceil(viewH / rowH);
        var firstRow = topRow - 1;
        var lastRow  = topRow + visRows + 2;
        if (firstRow < 0) firstRow = 0;
        var start = firstRow * cols, end = (lastRow + 1) * cols - 1;
        if (start < 0) start = 0;
        if (end > tileEls.length - 1) end = tileEls.length - 1;
        for (var i = start; i <= end; i++) loadImgAt(tileEls[i]);
    }

    /* ===== Paginação por scroll ===== */
    function checkScroll() {
        if (!PAGINATED || state.loading || !state.hasMore) return;
        var scrollBottom = contentEl.scrollTop + contentEl.clientHeight;
        if (scrollBottom > contentEl.scrollHeight - BUFFER) loadNext();
    }
    function loadNext() {
        if (state.loading || !state.hasMore) return;
        state.loading = true;
        var nextPage = state.page + 1;
        if (loadMoreEl) loadMoreEl.style.display = '';
        fetchJson('/' + KIND + '/category/' + state.catId + '?ajax=1&page=' + nextPage, function (data) {
            state.loading = false;
            if (data && data.html) {
                var tmp = document.createElement('div');
                tmp.innerHTML = data.html;
                fixLinks(tmp);
                while (tmp.firstChild) grid.appendChild(tmp.firstChild);
                state.page = nextPage;
                state.hasMore = !!data.has_more;
                reindex();
            } else { state.hasMore = false; }
            if (!state.hasMore && loadMoreEl) loadMoreEl.style.display = 'none';
            lazyImages();
            setTimeout(checkScroll, 200);
        }, cacheKey(state.catId, nextPage));
    }

    /* ===== Troca de categoria sem recarregar ===== */
    function findAnchor(el) {
        while (el && el !== document) { if (el.tagName && el.tagName.toUpperCase() === 'A') return el; el = el.parentNode; }
        return null;
    }
    var rxCat = new RegExp('^\\/' + KIND + '\\/category\\/(\\d+)$');
    var rxVirtual = new RegExp('^\\/' + KIND + '\\/(favorites|recent|continue)$');
    function onCatClick(e) {
        var a = findAnchor(e.target);
        if (!a) return;
        var href = a.getAttribute('href') || '';
        var path = stripBase(href);
        var m = rxCat.exec(path);
        var v = m ? null : rxVirtual.exec(path);
        if (!m && !v) return;
        if (!history.replaceState) return;
        e.preventDefault();
        if (e.stopImmediatePropagation) e.stopImmediatePropagation(); else e.stopPropagation();
        if (m) {
            var newId = parseInt(m[1], 10);
            if (newId === state.catId && !state.loading) return;
            switchCategory(a, newId, href);
        } else {
            switchVirtual(a, href);   // Favoritos/Recentes/Continue — in-place, sem piscar
        }
    }
    if (window.__hdxCatClick) document.removeEventListener('click', window.__hdxCatClick, true);
    window.__hdxCatClick = onCatClick;
    document.addEventListener('click', onCatClick, true);

    function switchCategory(pill, newId, href) {
        var pills = document.querySelectorAll('.cat-sidebar .cat-pill');
        for (var i = 0; i < pills.length; i++) pills[i].className = pills[i].className.replace(/\s*is-active/g, '');
        pill.className += ' is-active';
        var span = pill.querySelector('span');
        if (titleEl && span) titleEl.textContent = (span.textContent || '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');

        state.catId = newId; state.page = 1; state.hasMore = false; state.loading = true;
        // Android/file://: o replaceState abaixo NÃO grava a URL → o Voltar de um
        // detalhe perdia a categoria. Grava no ZLocal (S.vodBack) pro renderVodSection
        // restaurar (igual S.liveBack dos canais). Só filmes/séries; live já tem o dele.
        try {
            if ((KIND === 'movies' || KIND === 'series') && window.ZLocal && window.ZLocal.S) {
                var zs = window.ZLocal.S; zs.vodBack = zs.vodBack || {}; zs.vodBack[KIND] = String(newId);
            }
        } catch (zerr) {}
        grid.innerHTML = '';                 // LIMPA na hora (sem deixar a velha presa)
        tileEls = []; cols = 0; rowH = 0;
        if (emptyEl) emptyEl.style.display = 'none';
        if (loadMoreEl) { loadMoreEl.textContent = 'Carregando…'; loadMoreEl.style.display = ''; }
        contentEl.scrollTop = 0;
        try { history.replaceState(null, '', href); } catch (err) {}

        fetchJson(href + '?ajax=1&page=1', function (data) {
            state.loading = false;
            if (!data || typeof data.html !== 'string') { window.location.replace(href); return; }
            grid.innerHTML = data.html;
            fixLinks(grid);
            reindex();
            state.hasMore = !!data.has_more;
            if (loadMoreEl) { loadMoreEl.textContent = MORE_TEXT; loadMoreEl.style.display = state.hasMore ? '' : 'none'; }
            if (emptyEl) emptyEl.style.display = (data.html === '') ? '' : 'none';
            lazyImages();
            setTimeout(checkScroll, 150);
            // Selecionar a categoria JÁ leva o foco pro 1º item dela — sem
            // precisar apertar ► depois. (afterSwap do tv.js foca o primeiro
            // poster/canal do conteúdo; categoria vazia mantém o foco na pílula.)
            try { if (window.__hdxTv && window.__hdxTv.afterSwap) window.__hdxTv.afterSwap(); } catch (err) {}
        }, cacheKey(newId, 1));
    }

    /* Atalhos da sidebar (Favoritos / Recentes / Continue / Recém adicionados):
       troca SÓ a grade no lugar, igual às categorias — antes caíam no spa.js que
       recarregava a página inteira (a "piscada"). Reusa o fragmento do SPA e
       extrai só o #content-grid. NÃO cacheia (favoritos/continue mudam sempre). */
    function switchVirtual(pill, href) {
        var pills = document.querySelectorAll('.cat-sidebar .cat-pill');
        for (var i = 0; i < pills.length; i++) pills[i].className = pills[i].className.replace(/\s*is-active/g, '');
        pill.className += ' is-active';
        var span = pill.querySelector('span');
        if (titleEl && span) titleEl.textContent = (span.textContent || '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');

        state.catId = 0; state.page = 1; state.hasMore = false; state.loading = true;
        // Grava a virtual (Favoritos/Recentes/Continue) pro Voltar restaurar — ver switchCategory.
        try {
            if ((KIND === 'movies' || KIND === 'series') && window.ZLocal && window.ZLocal.S) {
                var zvm = (href || '').match(/\/(favorites|recent|continue)$/);
                if (zvm) { var zs2 = window.ZLocal.S; zs2.vodBack = zs2.vodBack || {}; zs2.vodBack[KIND] = 'v:' + zvm[1]; }
            }
        } catch (zerr2) {}
        grid.innerHTML = '';
        tileEls = []; cols = 0; rowH = 0;
        if (emptyEl) emptyEl.style.display = 'none';
        if (loadMoreEl) { loadMoreEl.textContent = 'Carregando…'; loadMoreEl.style.display = ''; }
        contentEl.scrollTop = 0;
        try { history.replaceState(null, '', href); } catch (err) {}

        var xhr = new XMLHttpRequest();
        try { xhr.open('GET', withBase(href), true); } catch (e2) { window.location.replace(href); return; }
        xhr.setRequestHeader('X-Hdx-Spa', '1');
        xhr.onreadystatechange = function () {
            if (xhr.readyState !== 4) return;
            state.loading = false;
            if (xhr.status !== 200 || !xhr.responseText) { window.location.replace(href); return; }
            // O fragmento do SPA é a sidebar-screen inteira; pega só os tiles do
            // #content-grid e troca no lugar (sem mexer no resto da página).
            var tmp = document.createElement('div');
            tmp.innerHTML = xhr.responseText;
            var ng = tmp.querySelector ? tmp.querySelector('#content-grid') : null;
            if (!ng) { window.location.replace(href); return; }
            grid.innerHTML = ng.innerHTML;
            fixLinks(grid);
            reindex();
            if (loadMoreEl) loadMoreEl.style.display = 'none';
            if (emptyEl) emptyEl.style.display = (grid.innerHTML === '') ? '' : 'none';
            lazyImages();
            try { if (window.__hdxTv && window.__hdxTv.afterSwap) window.__hdxTv.afterSwap(); } catch (e3) {}
        };
        try { xhr.send(); } catch (e4) { window.location.replace(href); }
    }

    /* ===== Scroll com throttle ===== */
    var scrollTimer = null;
    contentEl.addEventListener('scroll', function () {
        if (scrollTimer) return;
        scrollTimer = setTimeout(function () { scrollTimer = null; lazyImages(); checkScroll(); }, 80);
    });
    if (window.addEventListener) window.addEventListener('resize', function () {
        fitGrid(); measureGeom(); grid.__cols = cols; lazyImages();
    }, false);

    /* ===== Busca INLINE de canais (SÓ live) — resultados no próprio
       #content-grid, sem sair da lista. Reusa reindex/lazy/nav O(1). A página
       live (views/live/index.php) chama window.__liveSearch ao buscar. ===== */
    if (KIND === 'live') {
        // Busca INSTANTÂNEA (igual HDX): carrega TODOS os canais 1x (em memória)
        // e filtra ao DIGITAR — client-side, sem ir ao servidor a cada tecla.
        var liveAll = null;
        function chEsc(s) { s = (s == null) ? '' : String(s); return s.replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;').replace(/"/g, '&quot;'); }
        function chNorm(s) {
            s = (s || '').toLowerCase();
            return s.replace(/[áàâãä]/g, 'a').replace(/[éèêë]/g, 'e').replace(/[íìîï]/g, 'i').replace(/[óòôõö]/g, 'o').replace(/[úùûü]/g, 'u').replace(/ç/g, 'c');
        }
        function chRow(it) {
            var name = it.name || '', logo = it.logo || '', sid = it.id || 0, num = it.num || 0;
            var href = withBase('/live/channel/' + sid + '?name=' + encodeURIComponent(name) + '&logo=' + encodeURIComponent(logo));
            return '<a class="channel-tile-tv" tabindex="0" data-href="' + chEsc(href) + '" data-sid="' + sid + '" data-name="' + chEsc(name) + '" data-logo="' + chEsc(logo) + '">'
                + '<div class="ct-logo"' + (logo ? ' data-logo="' + chEsc(logo) + '"' : '') + '><span class="ct-fallback">📺</span></div>'
                + '<div class="ct-info"><div class="ct-num">#' + num + '</div><div class="ct-name">' + chEsc(name) + '</div></div>'
                + '<span class="ct-fav' + (it.fav ? ' is-fav' : '') + '" tabindex="-1" data-sid="' + sid + '" data-name="' + chEsc(name) + '" data-logo="' + chEsc(logo) + '" aria-label="Favoritar">'
                + '<svg viewBox="0 0 24 24" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M20.84 4.61a5.5 5.5 0 0 0-7.78 0L12 5.67l-1.06-1.06a5.5 5.5 0 0 0-7.78 7.78l1.06 1.06L12 21.23l7.78-7.78 1.06-1.06a5.5 5.5 0 0 0 0-7.78z"></path></svg></span></a>';
        }
        function loadLiveAll(cb) {
            if (liveAll) { cb(liveAll); return; }
            if (window.Tv && Tv.get) { Tv.get('/api/live/all', function (d) { liveAll = (d && d.items) || []; cb(liveAll); }); return; }
            try {
                var x = new XMLHttpRequest(); x.open('GET', withBase('/api/live/all'), true);
                x.onreadystatechange = function () { if (x.readyState === 4) { var d = null; try { d = JSON.parse(x.responseText); } catch (e) {} liveAll = (d && d.items) || []; cb(liveAll); } };
                x.send();
            } catch (e) { liveAll = []; cb(liveAll); }
        }
        window.__liveSearch = function (q) {
            q = chNorm(q).replace(/^\s+|\s+$/g, '');
            if (q.length < 3) { window.__liveSearchClear(); return; }
            loadLiveAll(function (all) {
                var out = [], i, MAX = 400;
                for (i = 0; i < all.length && out.length < MAX; i++) { if (chNorm(all[i].name).indexOf(q) !== -1) out.push(all[i]); }
                var html = ''; for (i = 0; i < out.length; i++) html += chRow(out[i]);
                if (titleEl) titleEl.textContent = 'Busca (' + out.length + ')';
                if (loadMoreEl) loadMoreEl.style.display = 'none';
                contentEl.scrollTop = 0;
                grid.innerHTML = html; reindex();          // NÃO foca o resultado (não rouba o teclado)
                if (emptyEl) emptyEl.style.display = html ? 'none' : '';
                lazyImages();
            });
        };
        window.__liveSearchClear = function () {
            var act = document.querySelector('.cat-sidebar .cat-pill.is-active span');
            if (titleEl && act) titleEl.textContent = (act.textContent || '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');
            grid.innerHTML = ''; contentEl.scrollTop = 0;
            if (!state.catId) { reindex(); if (emptyEl) emptyEl.style.display = ''; return; }
            fetchJson('/live/category/' + state.catId + '?ajax=1', function (data) {
                var html = (data && data.html) ? data.html : '';
                grid.innerHTML = html; fixLinks(grid); reindex();
                if (emptyEl) emptyEl.style.display = html ? 'none' : '';
                lazyImages();
            }, cacheKey(state.catId, 1));
        };
        loadLiveAll(function () {});   // pré-carrega (1 chamada) → 1ª tecla já filtra na hora
    }

    /* ===== Arranque ===== */
    reindex();
    if (window.HdxCache && grid.children && grid.children.length) {
        HdxCache.set(cacheKey(state.catId, 1), { html: grid.innerHTML, has_more: state.hasMore, next_page: state.page + 1 });
    }
    setTimeout(function () { lazyImages(); checkScroll(); }, 60);
})();
