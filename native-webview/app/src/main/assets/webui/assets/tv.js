/* ============================================================
 * HDX TV Player — Spatial navigation, video control, helpers.
 * Designed for TV remote only. No mouse support assumed.
 * ============================================================ */
(function () {
    'use strict';

    // Samsung Maple/Orsay (J-series 2015 com Maple 2012) tem quirks de keyCode.
    // Detectado via UA pra ajustar handlers — em particular: o botão MUDO
    // emite c=27 (Esc), igual o Esc/Voltar de browser. Sem essa flag, MUDO
    // dispara isBack() e leva o usuário pra home.
    var IS_MAPLE_ORSAY = /Mapl|SmartHub/i.test(navigator.userAgent || '');

    var FOCUSABLE = [
        'a[href]:not([disabled])',
        'button:not([disabled])',
        'input:not([disabled]):not([type="hidden"])',
        'select:not([disabled])',
        'textarea:not([disabled])',
        '[tabindex]:not([tabindex="-1"]):not([disabled])'
    ].join(',');

    function visible(el) {
        if (!el) return false;
        // Checagem RÁPIDA: offsetParent==null já cobre display:none e qualquer
        // ancestral escondido. Antes chamávamos getComputedStyle por elemento a
        // CADA tecla — com 100+ pôsteres na grade isso travava a navegação na
        // Samsung/LG. Agora o caminho caro (getClientRects) só roda pra
        // position:fixed (offsetParent null mas visível).
        if (el.offsetParent !== null) return true;
        return el.getClientRects().length > 0;
    }
    function focusables(scope) {
        // When the modal keyboard is open, scope to it (focus trap).
        if (!scope && document.body && document.body.classList.contains('vkb-open')) {
            var modal = document.querySelector('.vkb-modal');
            if (modal) scope = modal;
        }
        // Pop-up de aviso (tv-modal): prende o foco nele enquanto aberto.
        // ⚠️ MODAIS EMPILHADOS (ex.: editor de perfil sobre a apresentação):
        // prender no ÚLTIMO .tv-modal do DOM (o de CIMA) — no primeiro, as
        // setas navegavam no modal escondido atrás.
        if (!scope && document.body && document.body.classList.contains('tv-modal-open')) {
            var tvms = document.querySelectorAll('.tv-modal');
            if (tvms.length) scope = tvms[tvms.length - 1];
        }
        var root = scope || document;
        var list = root.querySelectorAll(FOCUSABLE);
        var out = [];
        for (var i = 0; i < list.length; i++) if (visible(list[i])) out.push(list[i]);
        return out;
    }
    function rectOf(el) {
        var r = el.getBoundingClientRect();
        return { el: el, top: r.top, left: r.left, right: r.right, bottom: r.bottom,
                 cx: r.left + r.width / 2, cy: r.top + r.height / 2 };
    }
    function clamp(n, lo, hi) { return Math.max(lo, Math.min(hi, n)); }

    /* ---------- Spatial navigation ---------- */
    function pickSiblingInRow(currentEl, dir) {
        if (!currentEl || (dir !== 'left' && dir !== 'right')) return null;
        // 2D grids (.poster-grid, .poster-grid-tv, .channel-grid-tv) use
        // pure spatial navigation so left from the first column escapes
        // the grid (e.g. lands on the sidebar).
        var row = currentEl.closest && currentEl.closest(
            '.home-grid, .live-categories, .live-channels, .live-days, .live-epg, ' +
            '.live-topbar, .profile-grid, .season-pills, .episode-row, .vkb-row, .dhs-row'
        );
        if (!row) return null;
        var sibs = focusables(row);
        var idx = sibs.indexOf(currentEl);
        if (idx < 0) return null;
        var next = dir === 'right' ? idx + 1 : idx - 1;
        if (next < 0 || next >= sibs.length) return null;
        return sibs[next];
    }
    function pickSiblingInColumn(currentEl, dir) {
        if (!currentEl || (dir !== 'up' && dir !== 'down')) return null;
        // Grids 2D (keypads, tile grids) sempre usam nav puramente espacial,
        // não DOM-order. Sem isso, DOWN num keypad 3x4 vai 1→2→3 ao invés de 1→4.
        if (currentEl.closest && currentEl.closest(
            '.al-keypad, .home-grid, .poster-grid, .poster-grid-tv, .channel-grid-tv'
        )) return null;
        // Vertical lists where DOM order matches visual order
        // .dh-buttons (detalhe): Reproduzir/Favoritos são <a> e <button>
        // empilhados — o <button> encolhe pro conteúdo (cx diferente do <a>),
        // então a nav espacial às vezes "pulava" o Favoritos e ia direto pros
        // recomendados. Forçar ordem-DOM aqui: ▼ vai Reproduzir→Favoritos→(sai
        // pros recomendados), ▲ volta. Determinístico, sem depender da medida.
        var col = currentEl.closest && currentEl.closest(
            '.live-categories, .live-channels, .live-days, .live-epg, .poster-grid, ' +
            '.poster-grid-tv, .cat-sidebar, .settings-menu, .settings-content, .dh-buttons'
        );
        if (!col) return null;
        // 2D grids use spatial nav (left/right within row, up/down across rows)
        if (col.classList.contains('poster-grid') || col.classList.contains('poster-grid-tv') || col.classList.contains('channel-grid-tv')) return null;
        var sibs = focusables(col);
        var idx = sibs.indexOf(currentEl);
        if (idx < 0) return null;
        var next = dir === 'down' ? idx + 1 : idx - 1;
        if (next < 0 || next >= sibs.length) return null;
        return sibs[next];
    }

    // Acha o container de GRADE DE PÔSTER subindo manual (Orsay não tem closest).
    // OBS: a grade de CANAIS (.channel-grid-tv) NÃO entra aqui de propósito —
    // cada tile de canal tem 2 focáveis (o tile + o coração de favoritar), o que
    // bagunçava a contagem de colunas (foco andava de 2 em 2). Canais usam o nav
    // espacial normal abaixo (que pula o coração no ▼ e mantém ele alcançável).
    function gridAncestor(el) {
        var p = el;
        while (p && p.nodeType === 1 && p !== document.body) {
            var c = (typeof p.className === 'string') ? p.className : '';
            if (c.indexOf('poster-grid-tv') !== -1 || c.indexOf('poster-grid') !== -1) return p;
            p = p.parentNode;
        }
        return null;
    }
    // Sobe procurando uma grade VIRTUALIZADA (vgrid.js marca __vnav no container).
    // Manual em vez de closest() — Orsay não tem closest.
    function vnavAncestor(el) {
        var p = el;
        while (p && p.nodeType === 1 && p !== document.body) {
            if (p.__vnav) return p;
            p = p.parentNode;
        }
        return null;
    }
    // Navegação por ÍNDICE na grade: evita medir TODOS os tiles com
    // getBoundingClientRect a cada tecla (era o lag das capas em TV fraca).
    // Lê offsetTop só da 1ª fileira pra achar o nº de colunas (cacheado).
    // Retorna o tile vizinho, 'STOP' (borda direita/baixo → nada) ou
    // 'ESCAPE'/'SKIP' (cai no scan espacial pra sair da grade p/ sidebar/topo).
    function navGridByIndex(currentEl, grid, dir) {
        var tiles = focusables(grid);
        if (!tiles.length) return 'SKIP';
        var idx = -1;
        for (var i = 0; i < tiles.length; i++) { if (tiles[i] === currentEl) { idx = i; break; } }
        if (idx < 0) return 'SKIP';
        var cols = grid.__cols;
        if (!cols) {
            var t0 = tiles[0].offsetTop; cols = 0;
            for (var j = 0; j < tiles.length; j++) { if (tiles[j].offsetTop === t0) cols++; else break; }
            cols = cols || 1; grid.__cols = cols;   // estável: colunas dependem do CSS, não do conteúdo
        }
        var col = idx % cols;
        if (dir === 'right') return (col < cols - 1 && idx + 1 < tiles.length) ? tiles[idx + 1] : 'STOP';
        if (dir === 'left')  return (col > 0) ? tiles[idx - 1] : 'ESCAPE';
        if (dir === 'up')    return (idx - cols >= 0) ? tiles[idx - cols] : 'ESCAPE';
        if (dir === 'down')  return (idx + cols < tiles.length) ? tiles[idx + cols] : 'STOP';
        return 'SKIP';
    }

    function settingsSibling(currentEl, dir) {
        if (!currentEl || (dir !== 'up' && dir !== 'down')) return null;
        var item = currentEl;
        while (item && item !== document.body) {
            var cls = typeof item.className === 'string' ? item.className : '';
            if ((' ' + cls + ' ').indexOf(' sm-item ') >= 0) break;
            item = item.parentNode;
        }
        if (!item || item === document.body) return null;
        var list = document.querySelectorAll('#settings-menu .sm-item[data-pane]');
        var idx = -1;
        for (var i = 0; i < list.length; i++) if (list[i] === item) { idx = i; break; }
        if (idx < 0) return null;
        var next = idx + (dir === 'down' ? 1 : -1);
        return (next >= 0 && next < list.length && visible(list[next])) ? list[next] : null;
    }

    function pickSpatial(currentEl, dir) {
        var settingsNext = settingsSibling(currentEl, dir);
        if (settingsNext) return settingsNext;
        var sib = pickSiblingInRow(currentEl, dir) || pickSiblingInColumn(currentEl, dir);
        if (sib) return sib;

        // Grade VIRTUALIZADA (vgrid.js): se o foco está dentro de uma grade com
        // __vnav, ela calcula o vizinho por ÍNDICE REAL e renderiza o alvo sob
        // demanda (a maioria dos tiles nem existe no DOM). Devolve o nó ou os
        // sentinelas STOP/ESCAPE/SKIP. Tem prioridade sobre o índice-DOM abaixo.
        var vgrid = currentEl ? vnavAncestor(currentEl) : null;
        if (vgrid) {
            var gv = vgrid.__vnav(currentEl, dir);
            if (gv === 'STOP') return null;
            if (gv !== 'ESCAPE' && gv !== 'SKIP') { if (visible(gv)) return gv; }
            // ESCAPE/SKIP → segue pro scan completo (sair da grade)
        } else {
            // Grade de pôster/canal NÃO-virtual: navega por índice DOM (barato).
            // Só nas BORDAS (ESCAPE/STOP) cai no scan espacial completo abaixo.
            var grid = currentEl ? gridAncestor(currentEl) : null;
            if (grid) {
                var g = navGridByIndex(currentEl, grid, dir);
                if (g === 'STOP') return null;
                if (g !== 'ESCAPE' && g !== 'SKIP') { if (visible(g)) return g; }
                // ESCAPE/SKIP → segue pro scan completo (sair da grade)
            }
        }

        var candidates = focusables();
        if (!candidates.length) return null;
        var cur = currentEl ? rectOf(currentEl) : null;
        if (!cur) return candidates[0];

        var best = null, bestScore = Infinity;
        for (var i = 0; i < candidates.length; i++) {
            if (candidates[i] === currentEl) continue;
            var c = rectOf(candidates[i]);
            var primary, cross, valid;
            if (dir === 'up')          { valid = c.bottom <= cur.top + 1;  primary = cur.top - c.bottom; cross = Math.abs(c.cx - cur.cx); }
            else if (dir === 'down')   { valid = c.top >= cur.bottom - 1;  primary = c.top - cur.bottom; cross = Math.abs(c.cx - cur.cx); }
            else if (dir === 'left')   { valid = c.right <= cur.left + 1;  primary = cur.left - c.right; cross = Math.abs(c.cy - cur.cy); }
            else                       { valid = c.left >= cur.right - 1;  primary = c.left - cur.right; cross = Math.abs(c.cy - cur.cy); }
            if (!valid) continue;
            var score = primary + 2 * cross;
            if (score < bestScore) { bestScore = score; best = c.el; }
        }

        // Caso especial: LEFT a partir de poster/canal dentro de .sidebar-content,
        // quando o melhor candidato sai do conteúdo (= ia pra sidebar) → volta
        // pra CATEGORIA ATIVA, não pra primeira categoria (Pesquisar) só pq tá
        // no topo. Cliente espera voltar pra onde tava antes.
        if (dir === 'left' && currentEl && currentEl.closest && currentEl.closest('.sidebar-content')) {
            if (!best || (best.closest && !best.closest('.sidebar-content'))) {
                var active = document.querySelector('.cat-sidebar .cat-pill.is-active');
                if (active && visible(active)) return active;
            }
        }

        // SUBIR/DESCER dentro do conteúdo NUNCA vaza pra sidebar. Segurando
        // ▼ num catálogo grande, quando o foco chegava na última fileira
        // carregada (paginação ainda buscando +100), o "melhor candidato"
        // virava uma categoria da sidebar → cursor pulava pra lá. Agora
        // fica parado esperando os próximos itens; só ◄ leva pra sidebar.
        if ((dir === 'down' || dir === 'up') && currentEl && currentEl.closest
            && currentEl.closest('.sidebar-content')) {
            if (best && best.closest && !best.closest('.sidebar-content')) {
                return null;
            }
        }

        // SUBIR/DESCER numa categoria da sidebar NUNCA pula pro conteúdo. Na
        // ÚLTIMA categoria, ▼ não deve "entrar" na grade que está aberta — fica
        // parado (cruzar pro conteúdo é só com ►; voltar é só com ◄).
        if ((dir === 'down' || dir === 'up') && currentEl && currentEl.closest
            && currentEl.closest('.cat-sidebar')) {
            if (best && best.closest && !best.closest('.cat-sidebar')) {
                return null;
            }
        }

        // DESCER pros recomendados (.dhs-row) entra sempre no PRIMEIRO item — não
        // no que estiver alinhado por geometria (senão "começava no 2º filme").
        if (dir === 'down' && best && best.closest
            && currentEl && currentEl.closest && !currentEl.closest('.dhs-row')) {
            var dhsRow = best.closest('.dhs-row');
            if (dhsRow) {
                var firstTile = focusables(dhsRow)[0];
                if (firstTile) return firstTile;
            }
        }

        // ANDROID: ► NÃO atravessa pra fora da pilha atual — nem da sidebar de
        // categorias pro conteúdo (só OK entra), nem do grid de canais pro EPG
        // (que é só informativo, intocável). ◄ segue valendo (voltar pra sidebar).
        if (isAndroid() && dir === 'right' && currentEl && best && currentEl.closest && best.closest) {
            if (currentEl.closest('.cat-sidebar') && !best.closest('.cat-sidebar')) return null;
            if (currentEl.closest('#content-grid') && !best.closest('#content-grid')) return null;
        }

        return best;
    }

    /** Acha o ancestor scrollável do elemento (sidebar, lista de categorias, etc).
     *  Manual em vez de closest() — Orsay não suporta closest. */
    function findScrollableAncestor(el) {
        var p = el && el.parentNode;
        while (p && p.nodeType === 1 && p !== document.body) {
            var cls = (typeof p.className === 'string') ? p.className : '';
            if (cls.indexOf('cat-sidebar') !== -1
             || cls.indexOf('sidebar-content') !== -1
             || cls.indexOf('settings-menu') !== -1
             || cls.indexOf('settings-content') !== -1
             || cls.indexOf('episode-row') !== -1
             || cls.indexOf('dhs-row') !== -1) {
                return p;
            }
            p = p.parentNode;
        }
        return null;
    }

    /* ===== ANDROID (app empacotado): navegação CONTIDA entre sidebar e conteúdo.
       Só no Android (ponte window.HdxNative); web/Tizen/LG ficam IGUAIS. ===== */
    function isAndroid() { try { return !!(window.HdxNative && window.HdxNative.play); } catch (e) { return false; } }
    /** Foca o 1º item do #content-grid assim que ele existir (a categoria carrega
     *  async). Usado quando o usuário dá OK numa categoria → ENTRA no conteúdo. */
    function focusContentSoon() {
        var tries = 0;
        (function poll() {
            var g = document.getElementById('content-grid');
            var t = g && g.querySelector('.channel-tile-tv, .poster-tile-tv, a[data-href], a[data-i]');
            if (t) { try { t.focus(); } catch (e) {} return; }
            if (++tries < 25) setTimeout(poll, 80);
        })();
    }

    /** Foca o elemento e faz "scroll: nearest" manualmente.
     *
     *  Por que manual: o `el.focus()` nativo em WebKit antigo (Samsung
     *  Maple/Orsay) auto-scrolla alinhando ao TOPO da área visível, então
     *  cada DOWN faz a categoria focada pular pro topo da sidebar — usuário
     *  vê o "indicador branco" preso em cima enquanto a lista desliza.
     *
     *  Solução: salvar scrollTop antes do focus, restaurar depois (cancela
     *  o auto-scroll), e aplicar nossa própria lógica de "só scrolla se
     *  o elemento saiu da área visível". */
    function focusEl(el) {
        if (!el) return;

        // Android (WebView moderno): usa o scrollIntoView NATIVO, que rola TODA a
        // cadeia de ancestrais roláveis. O caminho manual abaixo (offsetTop + só o
        // container MAIS PRÓXIMO) é p/ WebKit antigo da Samsung/LG e tem 2 furos no
        // Android: (a) offsetTop é relativo ao offsetParent — erra quando há um
        // ancestral posicionado no meio (ex.: recomendados do detalhe ficam em
        // .dh-similar position:relative → offsetTop ~33 em vez de ~536, "acha" que
        // já está visível); (b) só rola o container mais próximo (a fileira
        // horizontal .dhs-row), nunca o .detail-screen vertical → o usuário descia
        // o foco pros recomendados mas a tela não rolava. block/inline:'nearest' não
        // "pula pro topo". Web/Tizen/LG seguem IDÊNTICOS (isAndroid=false).
        if (isAndroid()) {
            try { el.focus({ preventScroll: true }); } catch (e) { try { el.focus(); } catch (e2) {} }
            try { el.scrollIntoView({ block: 'nearest', inline: 'nearest' }); } catch (e) {}
            return;
        }

        var container = findScrollableAncestor(el);
        var savedTop  = container ? container.scrollTop  : 0;
        var savedLeft = container ? container.scrollLeft : 0;

        // Foca — em alguns browsers (modernos) preventScroll funciona; em
        // outros (Orsay) é ignorado e o focus auto-scrolla. A gente cobre
        // ambos sempre restaurando o scroll abaixo.
        try { el.focus({ preventScroll: true }); }
        catch (e) { try { el.focus(); } catch (e2) {} }

        // Cancela auto-scroll do focus, se houve (vertical e horizontal)
        if (container) {
            if (container.scrollTop  !== savedTop)  container.scrollTop  = savedTop;
            if (container.scrollLeft !== savedLeft) container.scrollLeft = savedLeft;
        }

        // Aplica scroll "nearest" manual em AMBOS os eixos.
        // Listas verticais (.cat-sidebar, .settings-menu) usam scrollTop;
        // listas horizontais (.episode-row) usam scrollLeft.
        // Compatível com qualquer browser.
        if (container) {
            // Vertical
            var elTop    = el.offsetTop;
            var elBottom = elTop + el.offsetHeight;
            var visTop    = container.scrollTop;
            var visBottom = visTop + container.clientHeight;
            if (elTop < visTop) {
                container.scrollTop = elTop;
            } else if (elBottom > visBottom) {
                container.scrollTop = elBottom - container.clientHeight;
            }

            // Horizontal — pra .episode-row e similares que rolam lateralmente.
            // Sem isso, ao apertar ► no último episódio visível, o foco vai pro
            // próximo (off-screen) e o container não rola — cliente "perde" o
            // cursor.
            var elLeft  = el.offsetLeft;
            var elRight = elLeft + el.offsetWidth;
            var visLeft  = container.scrollLeft;
            var visRight = visLeft + container.clientWidth;
            if (elLeft < visLeft) {
                container.scrollLeft = elLeft;
            } else if (elRight > visRight) {
                container.scrollLeft = elRight - container.clientWidth;
            }
        } else if (el.scrollIntoView) {
            // Sem container conhecido — tenta scrollIntoView padrão.
            // NÃO usa fallback (false) que alinha ao bottom de forma agressiva.
            try { el.scrollIntoView({ block: 'nearest', inline: 'nearest' }); } catch (e) {}
        }
    }

    function ensureInitialFocus() {
        // Modal do 1º uso aberto (idioma/pirataria/Celular-TV)? O foco é DELE —
        // sem isto o refocus caía no [autofocus] da home ATRÁS do modal e a
        // tela de idioma abria sem nada marcado (bug 19/07).
        var zxOv = document.querySelector('.zx-ff-ask');
        if (zxOv) {
            if (zxOv.contains(document.activeElement)) return;
            var zxBtn = zxOv.querySelector('button');
            if (zxBtn) { focusEl(zxBtn); }
            return;
        }
        // Pop-up de AVISO do painel visível? Foco no "Entendi" (mesma razão acima).
        var zxAnn = document.querySelector('.zx-ann-overlay');
        if (zxAnn && zxAnn.style.display !== 'none') {
            if (zxAnn.contains(document.activeElement)) return;
            var zxOk = zxAnn.querySelector('[data-modal-ok]') || zxAnn.querySelector('button');
            if (zxOk) { focusEl(zxOk); }
            return;
        }
        // Telas com sidebar+content (filmes/séries/canais): SEMPRE foca o
        // primeiro item do conteúdo (poster/canal) — usuário clicou na
        // categoria, espera ver/navegar nos filmes, não voltar pro topo
        // da sidebar (Pesquisar). Isso ignora autofocus do navegador.
        var sbContent = document.querySelector('.sidebar-content');
        if (sbContent) {
            var firstContent = sbContent.querySelector('.poster-tile-tv, .channel-tile-tv');
            if (firstContent && visible(firstContent)) { focusEl(firstContent); return; }
            // Conteúdo vazio (categoria sem itens) → vai pra categoria ativa
            var activeCat = document.querySelector('.cat-sidebar .cat-pill.is-active');
            if (activeCat && visible(activeCat)) { focusEl(activeCat); return; }
        }

        if (document.activeElement && document.activeElement !== document.body) return;
        var auto = document.querySelector('[autofocus]');
        if (auto && visible(auto)) { focusEl(auto); return; }
        var first = focusables()[0];
        if (first) focusEl(first);
    }

    /* ---------- Key codes ---------- */
    // Samsung Maple/Orsay (SmartHub legacy 2010-2015) usa keyCodes próprios.
    // Algumas J-series 2015 entry-level (J4300/J5200/J5300/J6200) vieram com
    // Orsay ao invés de Tizen. UA contém "SmartHub; SMART-TV; Linux/SmartTV".
    function isBack(e) {
        var k = e.key, c = e.keyCode;
        if (k === 'Escape' || k === 'Backspace' || k === 'GoBack'
            || k === 'XF86Back' || k === 'BrowserBack' || k === 'Back') return true;
        // Em Maple/Orsay, c=27 é o botão MUDO (não Voltar). Voltar real
        // emite c=88 (KEY_RETURN). Em outras TVs/browsers, c=27 = Esc legítimo.
        if (IS_MAPLE_ORSAY && c === 27) return false;
        return c === 8 || c === 27 || c === 461 || c === 10009
            || (c === 88 && IS_MAPLE_ORSAY);   // 88 = KEY_RETURN só no Maple/Orsay;
                                               // no teclado do PC, 88 é a letra X
    }
    function isOK(e) {
        var k = e.key, c = e.keyCode;
        return k === 'Enter' || k === ' ' || k === 'Spacebar' || k === 'Done' || k === 'Select'
            || c === 13 || c === 32 || c === 65376 || c === 65385
            || c === 29443;  // Maple KEY_ENTER
    }
    // Botão VERMELHO do controle (Samsung ColorF0Red / LG Red / HbbTV VK_RED).
    // Usado pra favoritar o canal focado na TV (Samsung/LG). Roku usa "*".
    function isRed(e) {   // botão VERMELHO/colorido (Tizen/LG/HbbTV 403, Android TV 183)
        var k = e.key, c = e.keyCode;
        return c === 403 || c === 183 || k === 'ColorF0Red' || k === 'Red' || k === 'ColorKeyRed';
    }
    function isPlayKey(e) {   // PLAY/Media — alternativa de favoritar p/ Android TV sem botão de cor
        var k = e.key, c = e.keyCode;
        return c === 415 || c === 179 || k === 'MediaPlay' || k === 'MediaPlayPause' || k === 'Play';
    }
    // Mais 2 alternativas de favoritar (controles de TV box PELADOS, sem botão
    // de cor e sem Play — ex.: LE-7490): tecla "0" (fora de campo de texto,
    // senão digitar 0 na busca viraria favorito) e botão MENU (Android manda
    // keyCode 82; teclado PC manda ContextMenu/93).
    function isFavAltKey(e) {
        var k = e.key, c = e.keyCode;
        if ((k === '0' || c === 48 || c === 96) && !isTextInput(document.activeElement)) return true;
        // ⚠️ 82 também é a letra "r" em teclado físico (PC) → só vale como MENU
        // quando NÃO veio como letra (Android manda key vazio/Unidentified).
        return (c === 82 && k !== 'r' && k !== 'R') || c === 93 || k === 'ContextMenu';
    }
    function isUp(e) {
        var k = e.key, c = e.keyCode;
        return k === 'ArrowUp' || k === 'Up' || c === 38 || c === 29460; // Maple KEY_UP
    }
    function isDown(e) {
        var k = e.key, c = e.keyCode;
        return k === 'ArrowDown' || k === 'Down' || c === 40 || c === 29461; // Maple KEY_DOWN
    }
    function isLeft(e) {
        var k = e.key, c = e.keyCode;
        return k === 'ArrowLeft' || k === 'Left' || c === 37 || c === 4; // Maple KEY_LEFT
    }
    function isRight(e) {
        var k = e.key, c = e.keyCode;
        return k === 'ArrowRight' || k === 'Right' || c === 39 || c === 5; // Maple KEY_RIGHT
    }
    function isPlayPause(e) {
        var k = e.key, c = e.keyCode;
        return k === 'MediaPlayPause' || k === 'MediaPlay' || k === 'MediaPause'
            || c === 415 || c === 19 || c === 179
            || c === 71 || c === 74;  // Maple KEY_PLAY / KEY_PAUSE
    }
    function isVolUp(e) {
        var k = e.key, c = e.keyCode;
        return k === 'AudioVolumeUp' || c === 175      // Padrão moderno
            || c === 7;                                  // Maple KEY_VOL_UP
    }
    function isVolDown(e) {
        var k = e.key, c = e.keyCode;
        return k === 'AudioVolumeDown' || c === 174    // Padrão moderno
            || c === 11;                                 // Maple KEY_VOL_DOWN
    }

    /* ---------- Player keyboard control ---------- */
    function findVideo() {
        return document.querySelector('.player-screen video, video');
    }
    /** Player Orsay (plugin SEF) ativo? Se sim, controle de volume/seek/pause
     *  vai pelo plugin em vez do <video> HTML5. */
    function isOrsayPlayerActive() {
        return !!(window.HdxOrsayPlayer && window.HdxOrsayPlayer.isActive
                  && window.HdxOrsayPlayer.isActive());
    }
    function videoSeek(d) {
        if (isOrsayPlayerActive()) { HdxOrsayPlayer.seek(d); return; }
        var v = findVideo(); if (!v || !isFinite(v.duration)) return;
        v.currentTime = clamp(v.currentTime + d, 0, v.duration);
    }

    /* ---------- Seek "segurou-anda, soltou-toca" ----------
     * Antes: cada repetição do botão (segurar = keydown repetido) já
     * aplicava currentTime → o vídeo bufferizava em CADA passo e ia
     * "tocando aos trancos". Agora: enquanto SEGURA, só movemos um
     * alvo (pausa o vídeo + OSD mostra o tempo/barra do alvo);
     * ao SOLTAR (keyup) aplicamos UMA busca e voltamos a tocar.
     * Fallback de 650ms sem tecla nova cobre controle sem keyup. */
    var seekHold = null;   // { target, wasPaused, timer, startAt }
    function previewSeek(d) {
        if (isOrsayPlayerActive()) { HdxOrsayPlayer.seek(d); return; }
        var v = findVideo(); if (!v || !isFinite(v.duration)) return;
        if (!seekHold) {
            seekHold = { target: v.currentTime || 0, wasPaused: v.paused,
                         timer: null, startAt: Date.now() };
            try { v.pause(); } catch (e) {}
        }
        // ACELERAÇÃO: quanto mais tempo segurando, maior o salto —
        // 0-2s: ±10s | 2-4s: ±30s | 4-6s: ±60s | 6s+: ±120s.
        // Ir de 10min pra 50min de filme leva ~6s de botão segurado.
        var held = Date.now() - seekHold.startAt;
        var mult = held > 6000 ? 12 : held > 4000 ? 6 : held > 2000 ? 3 : 1;
        seekHold.target = clamp(seekHold.target + d * mult, 0, v.duration);
        if (window.HdxSeekPreview) { try { HdxSeekPreview(seekHold.target); } catch (e) {} }
        clearTimeout(seekHold.timer);
        seekHold.timer = setTimeout(applyHeldSeek, 650);
    }
    function applyHeldSeek() {
        if (!seekHold) return;
        var t = seekHold.target, wasPaused = seekHold.wasPaused;
        clearTimeout(seekHold.timer);
        seekHold = null;
        var v = findVideo(); if (!v) return;
        try { v.currentTime = t; } catch (e) {}
        if (!wasPaused) { try { v.play(); } catch (e) {} }
    }
    // Soltou a seta no player → aplica a busca acumulada
    document.addEventListener('keyup', function (e) {
        if (!seekHold || !isInPlayer()) return;
        if (isLeft(e) || isRight(e)) applyHeldSeek();
    }, true);
    function videoVolume(d) {
        var v = findVideo();
        // Em Orsay, faz AMBOS: ajusta v.volume (HTML5 nativo — em Maple
        // esse é o mecanismo que de fato controla o áudio) E chama
        // adjustVolume pra atualizar nosso OSD via tracking local.
        // Plugin SAMSUNG-INFOLINK-AUDIO foi removido — métodos undefined
        // neste TV. v.volume é o caminho correto.
        if (isOrsayPlayerActive()) {
            if (v) {
                try {
                    if (v.muted && d > 0) v.muted = false;
                    v.volume = clamp((v.volume || 0) + d, 0, 1);
                } catch (e) {}
            }
            HdxOrsayPlayer.adjustVolume(Math.round(d * 100));
            return;
        }
        if (!v) return;
        if (v.muted && d > 0) v.muted = false;
        v.volume = clamp(v.volume + d, 0, 1);
        if (window.HdxPlayerVolumeOsd) try { HdxPlayerVolumeOsd(); } catch (e) {}
    }
    function videoTogglePlay() {
        if (isOrsayPlayerActive()) { HdxOrsayPlayer.togglePause(); return; }
        var v = findVideo(); if (!v) return;
        if (v.paused) v.play().catch(function () {}); else v.pause();
    }
    function isInPlayer() {
        return !!document.querySelector('.player-screen');
    }

    /* ---------- Master key handler ---------- */
    function isTextInput(el) {
        if (!el) return false;
        if (el.tagName === 'TEXTAREA') return true;
        if (el.tagName !== 'INPUT') return false;
        var t = (el.type || '').toLowerCase();
        return t === '' || t === 'text' || t === 'password' || t === 'search'
            || t === 'email' || t === 'url' || t === 'tel' || t === 'number';
    }

    function onKey(e) {
        if (e.ctrlKey || e.metaKey || e.altKey) return;
        var k = e.key, c = e.keyCode;

        // ---- Modal aberto (aviso / 1ª abertura): foco PRESO; OK/Back tratados ----
        // ⚠️ Campo de TEXTO dentro do modal (nome do perfil): NÃO interceptar —
        // o isBack engolia o BACKSPACE (não apagava) e o OK o Enter. As teclas
        // caem no bloco de inputs abaixo, igual ao login.
        if (document.body && document.body.classList.contains('tv-modal-open') && !isTextInput(document.activeElement)) {
            var _tms = document.querySelectorAll('.tv-modal');
            var _tm = _tms.length ? _tms[_tms.length - 1] : null;   // o de CIMA (modais empilhados)
            if (_tm) {
                var _ok = _tm.querySelector('[data-modal-ok]');
                if (isOK(e)) {
                    e.preventDefault(); e.stopPropagation();
                    if (_ok) { try { _ok.click(); } catch (err) {} }
                    else { var _ae = document.activeElement; if (_ae && _ae !== document.body && (_ae.tagName === 'BUTTON' || _ae.tagName === 'A' || _ae.getAttribute('role') === 'button')) { try { _ae.click(); } catch (e2) {} } }
                    return;
                }
                if (isBack(e)) {
                    e.preventDefault(); e.stopPropagation();
                    if (_ok) { try { _ok.click(); } catch (err) {} }   // modal dispensável (aviso) -> Back fecha. 1ª abertura sem data-modal-ok -> Back NÃO escapa (no-op)
                    return;
                }
            }
            // setas caem no nav espacial abaixo — focusables() já PRENDE no .tv-modal
        }

        // ---- Botão VERMELHO favorita o canal FOCADO (Samsung/LG) ----
        // (Roku usa "*"; PC/celular clica no coração.) Sobe do elemento focado
        // até o tile do canal e dá toggle no coração .ct-fav.
        if (isRed(e) || isPlayKey(e) || isFavAltKey(e)) {
            var rn = document.activeElement, rfav = null;
            while (rn && rn !== document.body) {
                var rcls = (typeof rn.className === 'string') ? rn.className : '';
                if (rcls.indexOf('ct-fav') !== -1) { rfav = rn; break; }
                if (rcls.indexOf('channel-tile-tv') !== -1) {
                    rfav = rn.querySelector ? rn.querySelector('.ct-fav') : null;
                    break;
                }
                rn = rn.parentNode;
            }
            if (rfav && window.Tv && window.Tv.toggleChannelFav) {
                e.preventDefault();
                e.stopPropagation();
                window.Tv.toggleChannelFav(rfav);
                return;
            }
            // Sem canal focado: a tecla de COR não tem outro uso → engole.
            // PLAY/Media → NÃO engole (o player precisa de play/pause).
            // "0"/MENU fora de canal → também passam (inofensivos).
            if (isRed(e)) return;
        }

        // ---- Player mode: arrows control video, Back goes back ----
        if (isInPlayer()) {
            // Overlay com botões focado (ex: prompt "Próximo episódio")?
            // OK deve CLICAR o botão e as setas navegar entre os botões.
            // Sem isso, OK virava play/pause e o cliente nunca conseguia
            // aceitar o próximo episódio pela TV. (walk manual: Orsay não
            // tem closest())
            var pAe = document.activeElement, pNode = pAe, inOverlay = false;
            while (pNode && pNode !== document) {
                if (pNode.id === 'next-ep-prompt') { inOverlay = true; break; }
                pNode = pNode.parentNode;
            }
            if (inOverlay && !isBack(e)) {
                if (isOK(e)) {
                    e.preventDefault(); e.stopPropagation();
                    try { pAe.click(); } catch (err) {}
                    return;
                }
                var pDir = isUp(e) ? 'up' : isDown(e) ? 'down'
                         : isLeft(e) ? 'left' : isRight(e) ? 'right' : null;
                if (pDir) {
                    var pNext = pickSpatial(pAe, pDir);
                    if (pNext) { e.preventDefault(); focusEl(pNext); }
                    return;
                }
            }
            if (isBack(e)) {
                e.preventDefault(); e.stopPropagation();
                // Acende "Carregando" na hora (voltar do player recarrega o
                // detalhe ~1-2s) — sem isso a tela ficava congelada/parada.
                try { var _lo = document.getElementById('app-loading'); if (_lo) _lo.className = 'is-on'; } catch (e2) {}
                if (history.length > 1) history.back();
                else window.location.href = withBase('/home');
                return;
            }
            // Vol+/- físicos do controle (Maple keyCode 7/11; padrão 174/175).
            // Em Maple/Orsay, plugins de áudio Samsung (AUDIO e TVMW) têm
            // métodos undefined nesse modelo (J-series 2015 com Maple 2012).
            // Único caminho funcional é v.volume HTML5 (atenuador local 0-1)
            // chamado dentro de videoVolume(). preventDefault impede que o
            // firmware processe a tecla em paralelo. Comportamento DVD-like:
            // cliente deixa volume sistema da TV alto e atenua pelo Vol+/-
            // do app.
            if (isVolUp(e))   { e.preventDefault(); videoVolume(0.1); return; }
            if (isVolDown(e)) { e.preventDefault(); videoVolume(-0.1); return; }

            if (isLeft(e))  { e.preventDefault(); previewSeek(-10); return; }
            if (isRight(e)) { e.preventDefault(); previewSeek(10); return; }
            if (isUp(e))    { e.preventDefault(); videoVolume(0.1); return; }
            if (isDown(e))  { e.preventDefault(); videoVolume(-0.1); return; }
            if (isOK(e) || isPlayPause(e)) { e.preventDefault(); videoTogglePlay(); return; }
            return;
        }

        // OK em qualquer trigger ligado ao teclado virtual (input OU button)
        // → abre nosso teclado.
        if (isOK(e) && window.HdxKeyboard && window.HdxKeyboard.optsFor && !recentlyClosedKb()) {
            var act = document.activeElement;
            for (var lv = 0; act && lv < 5; lv++) {
                var kbOpts = window.HdxKeyboard.optsFor(act);
                if (kbOpts) {
                    e.preventDefault();
                    e.stopPropagation();
                    window.HdxKeyboard.open(act, kbOpts);
                    return;
                }
                act = act.parentNode;
            }
        }

        // OK em qualquer <button> ou <a> focado → dispara .click() na mão.
        // Samsung Maple/Orsay (e algumas Tizen 2.x) NÃO sintetizam click
        // automaticamente em buttons/links quando o user aperta OK no controle.
        // Sem isso, todo botão da app fica "morto" — incluindo as teclas do
        // teclado virtual.
        if (isOK(e)) {
            var ae = document.activeElement;
            if (ae && ae !== document.body
                && (ae.tagName === 'BUTTON' || ae.tagName === 'A'
                    || ae.getAttribute('role') === 'button'
                    || ae.hasAttribute('tabindex'))) {
                e.preventDefault();
                e.stopPropagation();
                try { ae.click(); } catch (err) {}
                // ANDROID: OK numa categoria/Recentes/Favoritos da sidebar → ENTRA
                // no conteúdo (foca o 1º item), já que ► não cruza mais. Exclui o
                // "← Voltar" (vai pra home) e a busca (vira input nativo).
                if (isAndroid() && ae.closest && ae.closest('.cat-sidebar')
                    && (' ' + (ae.className || '') + ' ').indexOf(' cat-pill ') >= 0
                    && ae.getAttribute('href') !== '/home') {
                    focusContentSoon();
                }
                return;
            }
        }

        // ---- Inputs: arrows handle text editing, Back blurs ----
        if (isTextInput(document.activeElement)) {
            // Dentro de um campo: Backspace APAGA (não é "Voltar") e as letras
            // DIGITAM. Só o Voltar de verdade do controle sai do campo.
            if (isBack(e) && e.keyCode !== 8 && e.key !== 'Backspace') {
                e.preventDefault();
                e.stopPropagation();
                // Antes a gente fazia blur() + ensureInitialFocus(), mas em
                // páginas com autofocus no input (busca, login) virava loop
                // — re-focava o mesmo input e parecia que nada acontecia.
                // Agora navega de volta no histórico, que é o esperado.
                if (history.length > 1) {
                    history.back();
                } else {
                    // Sem histórico (entrou direto na URL): só blur pra sair
                    // do input — usuário pode então navegar com setas.
                    document.activeElement.blur();
                }
                return;
            }
            // Up/Down always escape single-line inputs
            if (isUp(e) || isDown(e)) {
                var dir = isUp(e) ? 'up' : 'down';
                var n = pickSpatial(document.activeElement, dir);
                if (n) { e.preventDefault(); focusEl(n); }
                return;
            }
            return;
        }

        // ---- Normal pages: spatial navigation ----
        var dir = null;
        if (isUp(e))         dir = 'up';
        else if (isDown(e))  dir = 'down';
        else if (isLeft(e))  dir = 'left';
        else if (isRight(e)) dir = 'right';

        if (dir) {
            var cur = (document.activeElement && document.activeElement !== document.body)
                ? document.activeElement : null;
            var next = pickSpatial(cur, dir);
            if (next) { e.preventDefault(); focusEl(next); }
            // ANDROID: sem próximo (borda/contenção) → AINDA preventDefault, senão
            // o nav NATIVO do WebView move o foco (ex.: pro EPG rolável). tv.js
            // controla 100% no app. Web/Tizen/LG seguem com o fallback nativo.
            else if (isAndroid()) { e.preventDefault(); }
            return;
        }

        if (isBack(e)) {
            if (history.length > 1) {
                e.preventDefault();
                history.back();
            }
        }
    }

    document.addEventListener('keydown', onKey, true);

    /* ---------- Virtual keyboard trigger (rede larga p/ Tizen 2.4 J) ----------
     * O Samsung J series não dispatcha `keydown` confiável em <input readonly>
     * — eventos podem chegar como `keyup`, `click`, ou nem chegar. A gente
     * escuta TUDO no document em capture phase: o primeiro a disparar abre.
     * O guard `isOpen()` impede double-open.
     */
    /** Cooldown — true se o teclado fechou há menos de 500ms.
     *  Usado pra evitar reabrir o teclado por causa do `keyup` (ou click)
     *  que vem DEPOIS do click no botão OK do teclado: sem isso, ao apertar
     *  Buscar o teclado fecha → reabre brevemente → fecha de novo → busca.
     */
    function recentlyClosedKb() {
        if (!window.HdxKeyboard || !window.HdxKeyboard.lastCloseAt) return false;
        return (Date.now() - window.HdxKeyboard.lastCloseAt()) < 500;
    }
    function tryOpenKbForActive(e) {
        if (!window.HdxKeyboard || !window.HdxKeyboard.optsFor) return false;
        if (window.HdxKeyboard.isOpen && window.HdxKeyboard.isOpen()) return false;
        if (recentlyClosedKb()) return false;
        var el = document.activeElement;
        if (!el || el === document.body) return false;
        var opts = window.HdxKeyboard.optsFor(el);
        if (!opts) return false;
        try { e.preventDefault(); e.stopPropagation(); } catch (err) {}
        window.HdxKeyboard.open(el, opts);
        return true;
    }
    // keyup: fallback caso keydown seja capturado pelo SO da TV
    document.addEventListener('keyup', function (e) {
        if (isOK(e)) tryOpenKbForActive(e);
    }, true);
    // click: alguns Tizen sintetizam click ao invés de keydown no OK
    document.addEventListener('click', function (e) {
        if (recentlyClosedKb()) return;
        // Procura o input bound subindo do target (caso seja em <span> filho)
        var t = e.target;
        for (var i = 0; t && i < 5; i++) {
            if (window.HdxKeyboard && window.HdxKeyboard.optsFor) {
                var opts = window.HdxKeyboard.optsFor(t);
                if (opts && !window.HdxKeyboard.isOpen()) {
                    try { e.preventDefault(); e.stopPropagation(); } catch (err) {}
                    window.HdxKeyboard.open(t, opts);
                    return;
                }
            }
            t = t.parentNode;
        }
    }, true);

    /* ---------- Initial focus + clock ---------- */
    function ready(fn) {
        if (document.readyState === 'complete' || document.readyState === 'interactive')
            setTimeout(fn, 0);
        else document.addEventListener('DOMContentLoaded', fn);
    }

    function tickClock() {
        var els = document.querySelectorAll('[data-clock]');
        if (!els.length) return;
        var d = new Date();
        var hh = ('0' + d.getHours()).slice(-2);
        var mm = ('0' + d.getMinutes()).slice(-2);
        var time = hh + ':' + mm;
        var date = d.getFullYear() + '/' + ('0' + (d.getMonth() + 1)).slice(-2) + '/' + ('0' + d.getDate()).slice(-2);
        for (var i = 0; i < els.length; i++) {
            var t = els[i].getAttribute('data-clock');
            els[i].textContent = t === 'date' ? date : (t === 'datetime' ? date + '  ' + time : time);
        }
    }

    ready(function () {
        ensureInitialFocus();
        tickClock();
        setInterval(tickClock, 30 * 1000);
    });

    // Re-establish focus if DOM changes wipe it.
    // Otimização TV antiga: throttle 500ms (era 200) reduz triggers em 60%.
    // Escopo: .app-root quando existir, senão body. .app-root cobre toda a UI
    // funcional mas exclui scripts/links no <head> e elementos fora — ainda
    // captura paginação infinita, modais, alerts, mas com menos overhead.
    var refocusTimer = null;
    var observer = new MutationObserver(function () {
        if (refocusTimer) return;
        refocusTimer = setTimeout(function () {
            refocusTimer = null;
            if (!document.activeElement || document.activeElement === document.body) {
                ensureInitialFocus();
            }
        }, 500);
    });
    ready(function () {
        var target = document.querySelector('.app-root') || document.body;
        observer.observe(target, { childList: true, subtree: true });
    });

    /* ---------- Auto-unmute on TV (no gesture needed for volume API) ---------- */
    document.addEventListener('loadedmetadata', function (e) {
        if (e.target && e.target.tagName === 'VIDEO') {
            try { e.target.muted = false; e.target.volume = 1.0; } catch (err) {}
        }
    }, true);

    /* ---------- Sidebar category links: use replace, not push ----------
     * Category navigation (Filmes | Drama → Filmes | Comédia → ...) shouldn't
     * stack history entries. Otherwise pressing Back forces the user through
     * every category they passed by. Clicks on .cat-pill ou qualquer link com
     * data-replace usam location.replace() em vez de navegar normal.
     *
     * IMPORTANTE: usa traversal manual em vez de Element.closest() porque
     * Samsung Maple/Orsay (legacy SmartHub 2015) NÃO suporta closest().
     * Sem isso o handler falha silencioso e cliente acumula histórico,
     * tendo que apertar voltar várias vezes pra chegar no home. */
    function findAnchor(el) {
        while (el && el !== document) {
            if (el.tagName && el.tagName.toUpperCase() === 'A') return el;
            el = el.parentNode;
        }
        return null;
    }
    document.addEventListener('click', function (e) {
        var a = findAnchor(e.target);
        if (!a || !a.href) return;
        if (a.target === '_blank') return;
        var cls = (typeof a.className === 'string') ? a.className : '';
        var useReplace =
            a.getAttribute('data-replace') === '1' ||
            cls.indexOf('cat-pill') !== -1 ||
            cls.indexOf('season-pill') !== -1;
        if (!useReplace) return;

        // Mesmo sendo cat-pill, NÃO substitui histórico em pseudo-links
        // (Pesquisar, Recentes, Favoritos, Continue Watching). Esses não
        // são categorias — são ações distintas. Sem essa exceção, apertar
        // Voltar na busca pula direto pro home ao invés de voltar pra área.
        var href = a.href || '';

        // Se o category_browser está ATIVO, é ele quem troca a categoria
        // in-place (e já faz history.replaceState próprio). NÃO fazer
        // location.replace aqui — senão recarrega a página inteira. Importa
        // sobretudo APÓS navegação single-page: aí o category_browser é
        // re-executado e registra seu handler DEPOIS deste, então este roda
        // primeiro no capture e o location.replace sequestraria a troca.
        if (window.__hdxCatClick && /\/(movies|series|live)\/category\/\d+(\?|$)/.test(href)) {
            return;
        }

        if (href.indexOf('/search') !== -1
         || href.indexOf('/recent') !== -1
         || href.indexOf('/favorites') !== -1
         || href.indexOf('/continue') !== -1) {
            return;  // navegação normal (com histórico)
        }

        // Same-origin only — comparação simples sem URL constructor
        // (que pode não existir em Maple/Tizen 2.4)
        var origin = location.protocol + '//' + location.host;
        var isAbsolute = /^https?:\/\//i.test(href);
        if (isAbsolute && href.indexOf(origin) !== 0) return;
        e.preventDefault();
        location.replace(a.href);
    }, true);

    // Chamado pelo spa.js logo após trocar o conteúdo (single-page):
    // reposiciona o foco no 1º item e acerta o relógio na hora, sem
    // esperar o MutationObserver (que tem throttle de 500ms).
    function afterSwap() {
        try { ensureInitialFocus(); } catch (e) {}
        try { tickClock(); } catch (e) {}
    }

    window.__hdxTv = { focusables: focusables, pickSpatial: pickSpatial, afterSwap: afterSwap };

    /* ============================================================
     * Tv.post / Tv.get — XHR helpers for old TVs.
     * fetch() and Promise are missing on Tizen 2.x, WebOS 3-, NetTV 4
     * (Saphi). XMLHttpRequest works on every TV WebView since 2010.
     * ============================================================ */
    var Tv = window.Tv || {};
    // Prefixa a base (/leonardo) em URLs absolutas — sem duplicar se já tem.
    function withBase(u) {
        var b = window.__BASE || '';
        if (!b || typeof u !== 'string' || u.charAt(0) !== '/') return u;
        if (u.charAt(1) === '/') return u;                 // // protocolo
        if (u.indexOf(b + '/') === 0 || u === b) return u; // já tem base
        return b + u;
    }
    Tv.url = withBase;
    function serialize(data) {
        var parts = [];
        for (var k in data) {
            if (Object.prototype.hasOwnProperty.call(data, k)) {
                parts.push(encodeURIComponent(k) + '=' + encodeURIComponent(data[k]));
            }
        }
        return parts.join('&');
    }
    Tv.post = function (url, data, cb) {
        try {
            var xhr = new XMLHttpRequest();
            xhr.open('POST', withBase(url), true);
            xhr.onreadystatechange = function () {
                if (xhr.readyState !== 4) return;
                var json = null;
                try { json = JSON.parse(xhr.responseText); } catch (e) {}
                if (cb) cb(json, xhr.status);
            };
            if (typeof FormData !== 'undefined' && data instanceof FormData) {
                xhr.send(data);
            } else if (data) {
                xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                xhr.send(serialize(data));
            } else {
                xhr.send();
            }
        } catch (e) { if (cb) cb(null, 0); }
    };
    Tv.get = function (url, cb) {
        try {
            var xhr = new XMLHttpRequest();
            xhr.open('GET', withBase(url), true);
            xhr.onreadystatechange = function () {
                if (xhr.readyState !== 4) return;
                var json = null;
                try { json = JSON.parse(xhr.responseText); } catch (e) {}
                if (cb) cb(json, xhr.status);
            };
            xhr.send();
        } catch (e) { if (cb) cb(null, 0); }
    };
    /* dispatch a synthetic 'input' event the old way (some TVs lack
     * the Event() constructor). */
    Tv.fireInput = function (el) {
        if (!el) return;
        try {
            var ev = document.createEvent('HTMLEvents');
            ev.initEvent('input', true, false);
            el.dispatchEvent(ev);
        } catch (e) {}
    };
    window.Tv = Tv;

    /* ============================================================
     * Favoritar CANAL pelo coração no tile (.ct-fav). Delegado no
     * document — funciona nos tiles do 1º load E nos carregados por AJAX
     * (troca de categoria). Click no PC/touch; na TV/Roku é a tecla "*".
     * ============================================================ */
    function toggleChannelFav(btn) {
        if (!btn || btn.__busy) return;
        btn.__busy = true;
        var fd = new FormData();
        fd.append('kind', 'live');
        fd.append('item_id', btn.getAttribute('data-sid') || '0');
        fd.append('name', btn.getAttribute('data-name') || '');
        fd.append('poster', btn.getAttribute('data-logo') || '');
        fd.append('_csrf', window.__CSRF || '');
        Tv.post('/api/favorites/toggle', fd, function (j) {
            btn.__busy = false;
            if (j && j.ok) btn.className = j.favorited ? 'ct-fav is-fav' : 'ct-fav';
        });
    }
    Tv.toggleChannelFav = toggleChannelFav;
    document.addEventListener('click', function (e) {
        var t = e.target;
        var btn = t && t.closest ? t.closest('.ct-fav') : null;
        if (!btn) return;
        e.preventDefault();
        e.stopPropagation();
        toggleChannelFav(btn);
    }, true);
})();
