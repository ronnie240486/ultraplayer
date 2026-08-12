/* Tizen (Samsung TV) — init da UI EMPACOTADA. Replica o que o servidor faz pra
 * Samsung (is_tv_browser): liga o modo TV (ui-tv: teclado virtual, OSD do player,
 * fontes de sofa) + viewport 1280 (o design do tv.css e 1280x720) + registra as
 * teclas do controle. A troca clamp()->MAX e feita no BUILD (make_tizen_bundle),
 * porque o Tizen 6 = Chromium 76 NAO suporta clamp(). NO-OP fora do Tizen. */
(function () {
    try { if (typeof window.tizen === 'undefined') return; } catch (e) { return; }
    window.__ZX_TIZEN = 1;
    window.__TV = 1;

    // viewport 1280 (design 1280x720; a TV renderiza nativo em 1920 e amplia ~1.5x)
    try {
        var vp = document.querySelector('meta[name=viewport]');
        if (!vp) { vp = document.createElement('meta'); vp.setAttribute('name', 'viewport'); (document.head || document.documentElement).appendChild(vp); }
        vp.setAttribute('content', 'width=1280,initial-scale=1,user-scalable=no');
    } catch (e) {}

    // ui-tv: layout de TV (teclado virtual no login, OSD D-pad no player, etc.)
    function uiTv() { try { if (document.body) document.body.classList.add('ui-tv'); } catch (e) {} }
    uiTv();
    if (document.readyState !== 'complete') {
        try { document.addEventListener('DOMContentLoaded', uiTv, false); } catch (e) {}
    }

    // teclas do controle Samsung (Media*/Color*) -> chegam nos handlers do tv.js
    try {
        var keys = ['MediaPlayPause', 'MediaPlay', 'MediaPause', 'MediaStop',
                    'MediaFastForward', 'MediaRewind',
                    'ColorF0Red', 'ColorF1Green', 'ColorF2Yellow', 'ColorF3Blue'];
        for (var i = 0; i < keys.length; i++) {
            try { tizen.tvinputdevice.registerKey(keys[i]); } catch (e) {}
        }
    } catch (e) {}
}());
