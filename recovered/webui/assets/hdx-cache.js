/* ============================================================
 * HDX — Cache NO APARELHO (modelo XCIPTV).
 *
 *   • Android / PC / iOS (têm armazenamento): localStorage, TTL 6h, com teto
 *     (LRU). O catálogo fica salvo NO APARELHO do cliente → navegação e
 *     "Voltar" instantâneos. O SERVIDOR (painel) continua com cache = 0.
 *   • Smart TVs (Samsung/LG/Orsay = window.__TV): SÓ MEMÓRIA (RAM). Storage
 *     de TV é pequeno/lento → mantém leve e some ao fechar (como o HDX).
 *
 * window.__TV é setado pelo servidor (is_tv_browser) ANTES deste script —
 * por isso não dependemos de document.body (que ainda não existe no <head>).
 * Tudo em try/catch. ES5 puro (roda em TV antiga).
 * ============================================================ */
(function () {
    'use strict';

    var VERSION = 'v3';                  // bump invalida cache de versão antiga
    var TTL_MS  = 6 * 60 * 60 * 1000;    // 6h
    var BUDGET  = 4 * 1024 * 1024;       // ~4MB de teto no localStorage
    var PREFIX  = 'hdxc:';
    var IS_TV   = !!(window.__TV);

    function ns() { return PREFIX + VERSION + ':' + (window.__DNS || '0') + ':'; }
    function now() { return (new Date()).getTime(); }

    /* ---------- backend MEMÓRIA (smart TVs) ---------- */
    var MEM = {};
    function memGet(key) { var o = MEM[key]; if (!o) return null; if (o.exp < now()) { delete MEM[key]; return null; } return o.v; }
    function memSet(key, v, ttl) { MEM[key] = { exp: now() + (ttl || TTL_MS), v: v }; }
    function memBust() { MEM = {}; }

    /* ---------- backend localStorage (Android/PC/iOS) ---------- */
    function lsOk() { try { localStorage.setItem(PREFIX + 't', '1'); localStorage.removeItem(PREFIX + 't'); return true; } catch (e) { return false; } }
    function lsGet(key) {
        try {
            var raw = localStorage.getItem(ns() + key);
            if (!raw) return null;
            var o = JSON.parse(raw);
            if (!o || o.exp < now()) { localStorage.removeItem(ns() + key); return null; }
            try { localStorage.setItem(ns() + key, JSON.stringify({ exp: o.exp, at: now(), v: o.v })); } catch (e) {}  // marca último acesso (LRU)
            return o.v;
        } catch (e) { return null; }
    }
    function lsSet(key, value, ttlMs) {
        var payload = JSON.stringify({ exp: now() + (ttlMs || TTL_MS), at: now(), v: value });
        try { localStorage.setItem(ns() + key, payload); }
        catch (e) { if (lsTrim(payload.length + key.length + 64)) { try { localStorage.setItem(ns() + key, payload); } catch (e2) {} } }
    }
    function lsTrim(need) {
        try {
            var items = [], total = 0;
            for (var i = 0; i < localStorage.length; i++) {
                var k = localStorage.key(i);
                if (k && k.indexOf(PREFIX) === 0) {
                    var val = localStorage.getItem(k) || '';
                    total += val.length + k.length;
                    var at = 0; try { at = (JSON.parse(val) || {}).at || 0; } catch (e) {}
                    items.push({ k: k, at: at, size: val.length + k.length });
                }
            }
            items.sort(function (a, b) { return a.at - b.at; });   // mais antigo primeiro
            var freed = 0;
            for (var j = 0; j < items.length; j++) {
                if (freed >= need && (total - freed) <= BUDGET) break;
                localStorage.removeItem(items[j].k); freed += items[j].size;
            }
            return true;
        } catch (e) { return false; }
    }
    function lsBust() {
        try {
            var del = [];
            for (var i = 0; i < localStorage.length; i++) { var k = localStorage.key(i); if (k && k.indexOf(PREFIX) === 0) del.push(k); }
            for (var j = 0; j < del.length; j++) localStorage.removeItem(del[j]);
        } catch (e) {}
    }

    /* ---------- escolhe o backend ---------- */
    var useLs = (!IS_TV) && lsOk();
    var get   = useLs ? lsGet  : memGet;
    var set   = useLs ? lsSet  : memSet;
    var bust  = useLs ? lsBust : function () { memBust(); try { lsBust(); } catch (e) {} };

    if (useLs) {
        // Android/PC/iOS: faxina de versões antigas (v1/v2) do localStorage.
        try {
            var cur = PREFIX + VERSION + ':', dead = [];
            for (var i = 0; i < localStorage.length; i++) { var k = localStorage.key(i); if (k && k.indexOf(PREFIX) === 0 && k.indexOf(cur) !== 0) dead.push(k); }
            for (var j = 0; j < dead.length; j++) localStorage.removeItem(dead[j]);
        } catch (e) {}
    } else {
        // Smart TV: garante que NÃO sobrou catálogo no disco da TV.
        try { lsBust(); } catch (e) {}
    }

    window.HdxCache = { get: get, set: set, bust: bust, enabled: true };

    // Recarregar / Sair limpam o cache (não vaza pra outra conta).
    try {
        document.addEventListener('click', function (e) {
            var t = e.target;
            for (var n = 0; t && n < 4; n++) {
                if (t.tagName === 'A' && t.getAttribute('href')) {
                    var h = t.getAttribute('href');
                    if (h.indexOf('/reload') !== -1 || h.indexOf('/logout') !== -1) bust();
                    break;
                }
                t = t.parentNode;
            }
        }, true);
    } catch (e) {}
})();
