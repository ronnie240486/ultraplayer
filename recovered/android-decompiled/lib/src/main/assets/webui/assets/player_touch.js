/* ============================================================
 * HDX Player — controles TOUCH/MOUSE do player (celular/PC).
 *
 * Só ativa após interação de ponteiro REAL:
 *  - touchstart (celular/tablet), ou
 *  - movimento de mouse de verdade (PC/notebook — 3 posições
 *    diferentes; controle remoto de TV nunca gera mousemove).
 * TVs com controle remoto → zero efeito (seguem com tv.js).
 * A página define window.__playerKind = 'live' | 'vod' antes.
 *
 * Recursos:
 *  - toque/clique na tela mostra/esconde os controles
 *  - play/pause central
 *  - VOD: ±10s, barra de progresso ARRASTÁVEL (dedo ou mouse),
 *    duplo-toque nas laterais = ±10s (estilo YouTube)
 *  - botão de ajuste de tela: Ajustar → Preencher → Esticar
 *    (salvo em localStorage, vale pros próximos vídeos)
 *  - botão voltar no topo
 * ============================================================ */
(function () {
    'use strict';

    var kind   = window.__playerKind === 'live' ? 'live' : 'vod';
    var video  = document.getElementById('hls-player');
    var screen = document.querySelector('.player-screen');
    if (!video || !screen) return;

    var armed = false;
    var inputMode = null;        // 'touch' | 'mouse'
    var osd, playBtn, barEl, fillEl, knobEl, curEl, totEl, toastEl;
    var hideTimer = null, toastTimer = null;
    var dragging = false;
    var shownAt = 0;             // quando o OSD apareceu (guard anti-click fantasma)

    /** O Android sintetiza um `click` logo após o toque que ABRIU o OSD —
     *  e esse click cai no botão que acabou de aparecer embaixo do dedo
     *  (ex: play/pause no centro), pausando sem querer. Ignoramos cliques
     *  nos controles por 450ms após o OSD aparecer. */
    function justShown() {
        return inputMode === 'touch' && (Date.now() - shownAt) < 450;
    }

    // O 'cover'/'fill' não muda NADA quando o vídeo já preenche a tela (16:9
    // num monitor 16:9) — daí parecia que o botão "não funcia". Por isso o
    // "Aumentar" usa ZOOM REAL (transform: scale) que SEMPRE muda visivelmente.
    var ASPECTS = [
        { fit: 'contain', scale: 1,    label: 'Ajustar à tela' },
        { fit: 'cover',   scale: 1,    label: 'Preencher' },
        { fit: 'cover',   scale: 1.25, label: 'Aumentar (zoom)' }
    ];

    function fmtT(s) {
        s = Math.max(0, Math.floor(s || 0));
        var h = Math.floor(s / 3600);
        var m = Math.floor((s % 3600) / 60);
        var sec = s % 60;
        function p(n) { return n < 10 ? '0' + n : '' + n; }
        if (h > 0) return h + ':' + p(m) + ':' + p(sec);
        return m + ':' + p(sec);
    }

    /* ---------- ícones (SVG inline, sem fontes) ---------- */
    var ICON_PLAY  = '<svg width="34" height="34" viewBox="0 0 24 24" fill="currentColor"><path d="M8 5v14l11-7z"/></svg>';
    var ICON_PAUSE = '<svg width="34" height="34" viewBox="0 0 24 24" fill="currentColor"><path d="M6 4h4v16H6zM14 4h4v16h-4z"/></svg>';
    var ICON_RW    = '<svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2" stroke-linecap="round" stroke-linejoin="round"><polyline points="1 4 1 10 7 10"/><path d="M3.51 15a9 9 0 1 0 2.13-9.36L1 10"/></svg>';
    var ICON_FF    = '<svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2" stroke-linecap="round" stroke-linejoin="round"><polyline points="23 4 23 10 17 10"/><path d="M20.49 15a9 9 0 1 1-2.12-9.36L23 10"/></svg>';
    var ICON_FIT   = '<svg width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2" stroke-linecap="round" stroke-linejoin="round"><path d="M8 3H5a2 2 0 0 0-2 2v3M21 8V5a2 2 0 0 0-2-2h-3M3 16v3a2 2 0 0 0 2 2h3M16 21h3a2 2 0 0 0 2-2v-3"/></svg>';

    /* ---------- montar OSD ---------- */
    function build() {
        var titleEl = document.querySelector('.player-osd .osd-title');
        var title = titleEl ? titleEl.textContent : '';

        osd = document.createElement('div');
        osd.className = 'tp-osd';

        var top = document.createElement('div');
        top.className = 'tp-top';
        var back = document.createElement('button');
        back.type = 'button';
        back.className = 'tp-btn tp-back';
        back.innerHTML = '&#8592; Voltar';
        var t = document.createElement('div');
        t.className = 'tp-title';
        t.textContent = title;
        var aspect = document.createElement('button');
        aspect.type = 'button';
        aspect.className = 'tp-btn tp-aspect';
        aspect.innerHTML = ICON_FIT + '<span>Tela</span>';
        top.appendChild(back); top.appendChild(t); top.appendChild(aspect);

        var center = document.createElement('div');
        center.className = 'tp-center';
        playBtn = document.createElement('button');
        playBtn.type = 'button';
        playBtn.className = 'tp-play';
        playBtn.innerHTML = ICON_PAUSE;
        if (kind === 'vod') {
            var rw = document.createElement('button');
            rw.type = 'button';
            rw.className = 'tp-skip tp-rw';
            rw.innerHTML = ICON_RW + '<span>10s</span>';
            var ff = document.createElement('button');
            ff.type = 'button';
            ff.className = 'tp-skip tp-ff';
            ff.innerHTML = ICON_FF + '<span>10s</span>';
            center.appendChild(rw);
            center.appendChild(playBtn);
            center.appendChild(ff);
            rw.addEventListener('click', function (e) { stop(e); if (justShown()) return; seekBy(-10); });
            ff.addEventListener('click', function (e) { stop(e); if (justShown()) return; seekBy(10); });
        } else {
            center.appendChild(playBtn);
        }

        var bottom = document.createElement('div');
        bottom.className = 'tp-bottom';
        if (kind === 'vod') {
            var times = document.createElement('div');
            times.className = 'tp-times';
            curEl = document.createElement('span'); curEl.textContent = '0:00';
            totEl = document.createElement('span'); totEl.textContent = '0:00';
            times.appendChild(curEl); times.appendChild(totEl);

            barEl = document.createElement('div');
            barEl.className = 'tp-bar';
            var track = document.createElement('div');
            track.className = 'tp-bar-track';
            fillEl = document.createElement('div');
            fillEl.className = 'tp-bar-fill';
            knobEl = document.createElement('div');
            knobEl.className = 'tp-knob';
            track.appendChild(fillEl);
            barEl.appendChild(track);
            barEl.appendChild(knobEl);
            bottom.appendChild(times);
            bottom.appendChild(barEl);
            bindDrag();
        } else {
            var live = document.createElement('div');
            live.className = 'tp-live-tag';
            live.innerHTML = '<span class="dot">&#9679;</span> AO VIVO';
            bottom.appendChild(live);
        }

        toastEl = document.createElement('div');
        toastEl.className = 'tp-toast';

        osd.appendChild(top);
        osd.appendChild(center);
        osd.appendChild(bottom);
        screen.appendChild(osd);
        screen.appendChild(toastEl);

        back.addEventListener('click', function (e) {
            stop(e);
            // Voltar = acao DELIBERADA de fechar -> SEM guard justShown (so e tocavel
            // com a OSD ja visivel). Antes precisava apertar 2x no touch pra fechar.
            // Acende o "Carregando" NA HORA: voltar do player recarrega o detalhe
            // (busca o filme de novo no IPTV ~1-2s) — sem isto a tela ficava
            // congelada nesse tempo, parecendo travada.
            try { var lo = document.getElementById('app-loading'); if (lo) lo.className = 'is-on'; } catch (e2) {}
            if (history.length > 1) history.back();
            else window.location.href = (window.__BASE || '') + '/home';
        });
        aspect.addEventListener('click', function (e) { stop(e); if (justShown()) return; cycleAspect(); });
        playBtn.addEventListener('click', function (e) { stop(e); if (justShown()) return; togglePlay(); });

        video.addEventListener('play',  refreshPlayIcon);
        video.addEventListener('pause', function () { refreshPlayIcon(); show(); });
        video.addEventListener('timeupdate', refreshBar);
        video.addEventListener('durationchange', refreshBar);
        video.addEventListener('seeking', refreshBar);
    }

    function stop(e) { if (e) { e.stopPropagation(); e.preventDefault(); } }

    /* ---------- mostrar / esconder ---------- */
    function show() {
        if (!osd) return;
        if (osd.className.indexOf('is-on') === -1) shownAt = Date.now();
        osd.className = 'tp-osd is-on';
        clearTimeout(hideTimer);
        hideTimer = setTimeout(function () {
            // pausado ou arrastando = controles ficam na tela
            if (!video.paused && !dragging) hide();
        }, 4000);
    }
    function hide() {
        if (osd) osd.className = 'tp-osd';
    }
    function visible() {
        return osd && osd.className.indexOf('is-on') !== -1;
    }

    function toast(msg) {
        if (!toastEl) return;
        toastEl.textContent = msg;
        toastEl.className = 'tp-toast is-on';
        clearTimeout(toastTimer);
        // 1.8s (era 1.1s): feedback claro do modo de tela escolhido. Em filme
        // 16:9 numa tela 16:9 os 3 modos parecem iguais (não há barra pra tirar),
        // então o aviso é o que confirma que mudou.
        toastTimer = setTimeout(function () { toastEl.className = 'tp-toast'; }, 1800);
    }

    /* ---------- player ---------- */
    function togglePlay() {
        if (video.paused) video.play().catch(function () {});
        else video.pause();
        show();
    }
    function refreshPlayIcon() {
        if (playBtn) playBtn.innerHTML = video.paused ? ICON_PLAY : ICON_PAUSE;
    }
    function seekBy(d) {
        if (!isFinite(video.duration)) return;
        var t = Math.max(0, Math.min(video.duration, (video.currentTime || 0) + d));
        try { video.currentTime = t; } catch (e) {}
        toast((d > 0 ? '+' : '') + d + 's');
        show();
    }
    function refreshBar() {
        if (kind !== 'vod' || !fillEl) return;
        var dur = video.duration;
        if (!isFinite(dur) || dur <= 0) return;
        if (dragging) return;                       // durante o arrasto, quem manda é o dedo
        var pct = ((video.currentTime || 0) / dur) * 100;
        fillEl.style.width = pct + '%';
        knobEl.style.left = pct + '%';
        curEl.textContent = fmtT(video.currentTime);
        totEl.textContent = fmtT(dur);
    }

    /* ---------- ajuste de tela (fit + zoom real) ---------- */
    function applyAspect(idx, silent) {
        var a = ASPECTS[idx % ASPECTS.length];
        try {
            video.style.objectFit = a.fit;
            // ZOOM de verdade (transform: scale) — muda visivelmente MESMO quando
            // o vídeo já preenche a tela (object-fit sozinho seria no-op aí). O
            // .player-screen tem overflow:hidden, então o excedente é cortado.
            var tf = (a.scale && a.scale !== 1) ? ('scale(' + a.scale + ')') : '';
            video.style.transform = tf;
            video.style.webkitTransform = tf;
            video.style.transformOrigin = 'center center';
        } catch (e) {}
        try { localStorage.setItem('hdx_aspect', String(idx % ASPECTS.length)); } catch (e) {}
        if (!silent) toast(a.label);
    }
    function cycleAspect() {
        var cur = 0;
        try { cur = parseInt(localStorage.getItem('hdx_aspect') || '0', 10) || 0; } catch (e) {}
        applyAspect(cur + 1);
        show();
    }

    /* ---------- arrastar a barra ---------- */
    function bindDrag() {
        function ratioFromX(x) {
            var r = barEl.getBoundingClientRect();
            var ratio = (x - r.left) / r.width;
            return Math.max(0, Math.min(1, ratio));
        }
        var lastApply = 0;
        function preview(ratio, apply) {
            var dur = video.duration;
            if (!isFinite(dur) || dur <= 0) return;
            var pct = ratio * 100;
            fillEl.style.width = pct + '%';
            knobEl.style.left = pct + '%';
            curEl.textContent = fmtT(ratio * dur);
            if (apply) {
                var now = Date.now();
                if (now - lastApply > 250 || apply === 'final') {
                    lastApply = now;
                    try { video.currentTime = ratio * dur; } catch (e) {}
                }
            }
        }
        barEl.addEventListener('touchstart', function (e) {
            dragging = true;
            barEl.className = 'tp-bar is-dragging';
            preview(ratioFromX(e.touches[0].clientX), true);
            stop(e);
        }, { passive: false });
        barEl.addEventListener('touchmove', function (e) {
            if (!dragging) return;
            preview(ratioFromX(e.touches[0].clientX), true);
            stop(e);
        }, { passive: false });
        barEl.addEventListener('touchend', function (e) {
            if (!dragging) return;
            dragging = false;
            barEl.className = 'tp-bar';
            var x = (e.changedTouches && e.changedTouches[0]) ? e.changedTouches[0].clientX : null;
            if (x !== null) preview(ratioFromX(x), 'final');
            show();
            stop(e);
        });
        barEl.addEventListener('touchcancel', function () {
            dragging = false;
            barEl.className = 'tp-bar';
        });

        /* Mouse (PC/notebook): clicar na barra busca; segurar e arrastar também */
        barEl.addEventListener('mousedown', function (e) {
            if (inputMode !== 'mouse') return;
            dragging = true;
            barEl.className = 'tp-bar is-dragging';
            preview(ratioFromX(e.clientX), true);
            stop(e);
            function onMove(ev) {
                if (!dragging) return;
                preview(ratioFromX(ev.clientX), true);
                ev.preventDefault();
            }
            function onUp(ev) {
                document.removeEventListener('mousemove', onMove);
                document.removeEventListener('mouseup', onUp);
                if (!dragging) return;
                dragging = false;
                barEl.className = 'tp-bar';
                preview(ratioFromX(ev.clientX), 'final');
                show();
            }
            document.addEventListener('mousemove', onMove);
            document.addEventListener('mouseup', onUp);
        });
    }

    /* ---------- toque na tela: mostrar/esconder + duplo-toque ±10s ---------- */
    var lastTap = 0, lastTapX = 0, singleTimer = null;
    function onScreenTap(x) {
        var now = Date.now();
        var w = window.innerWidth || screen.offsetWidth;
        if (kind === 'vod' && now - lastTap < 320 && Math.abs(x - lastTapX) < 80) {
            // Duplo toque: terço esquerdo volta, terço direito avança
            clearTimeout(singleTimer);
            lastTap = 0;
            if (x < w * 0.35)      seekBy(-10);
            else if (x > w * 0.65) seekBy(10);
            else                   togglePlay();
            return;
        }
        lastTap = now;
        lastTapX = x;
        clearTimeout(singleTimer);
        singleTimer = setTimeout(function () {
            if (visible()) hide(); else show();
        }, kind === 'vod' ? 320 : 10);
    }

    /* ---------- ativação: só em interação de ponteiro REAL ---------- */
    function arm(mode) {
        if (armed) return;
        armed = true;
        inputMode = mode;
        screen.className += ' touch-on';
        build();
        // aplica o modo de tela salvo (TV com controle nunca chega aqui)
        var saved = 0;
        try { saved = parseInt(localStorage.getItem('hdx_aspect') || '0', 10) || 0; } catch (e) {}
        if (saved > 0) applyAspect(saved, true);
        refreshPlayIcon();
        refreshBar();
        show();
    }

    /** true se o evento aconteceu num controle nosso (que já se trata sozinho) */
    function onControl(target) {
        var t = target;
        while (t && t !== document) {
            if (t.className && typeof t.className === 'string' &&
                (t.className.indexOf('tp-btn') !== -1 || t.className.indexOf('tp-skip') !== -1 ||
                 t.className.indexOf('tp-play') !== -1 || t.className.indexOf('tp-bar') !== -1 ||
                 t.className.indexOf('btn-tv') !== -1)) return true;
            t = t.parentNode;
        }
        return false;
    }

    document.addEventListener('touchstart', function (e) {
        if (!armed) { arm('touch'); return; }
        if (inputMode !== 'touch') inputMode = 'touch';   // híbrido (notebook touch) — dedo manda
        if (onControl(e.target)) return;
        onScreenTap(e.touches[0].clientX);
    }, { passive: true });

    /* Mouse de verdade (PC/notebook): 3 posições DIFERENTES de mousemove.
       Controle remoto de TV não move ponteiro → nunca ativa na TV. */
    var mmCount = 0, mmX = -1, mmY = -1, mmShownAt = 0;
    document.addEventListener('mousemove', function (e) {
        if (armed) {
            // Mexeu o mouse → MOSTRA os controles (padrão de player). Antes, depois
            // que os controles sumiam (4s), mover o mouse NÃO os trazia de volta —
            // então o 1º clique no botão "Tela" só reaparecia o OSD (não acionava),
            // dando a impressão de que o botão "não funciona". (throttle 200ms)
            if (inputMode === 'mouse') {
                var now = Date.now();
                if (now - mmShownAt > 200) { mmShownAt = now; show(); }
            }
            return;
        }
        if (e.clientX !== mmX || e.clientY !== mmY) {
            mmX = e.clientX; mmY = e.clientY;
            mmCount++;
            if (mmCount >= 3) arm('mouse');
        }
    });

    /* Clique do mouse na área do vídeo mostra/esconde controles */
    document.addEventListener('click', function (e) {
        if (!armed || inputMode !== 'mouse') return;
        if (onControl(e.target)) return;
        if (visible()) hide(); else show();
    });
})();
