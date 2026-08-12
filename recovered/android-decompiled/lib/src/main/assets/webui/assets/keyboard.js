/* ============================================================
 * HDX TV — On-screen keyboard
 * Suporta 2 padrões:
 *   1. <input type="text">      ← TVs modernas (focus + OK funciona)
 *   2. <button data-vkb-target="hidden-input-id">
 *        <span class="vkb-display">placeholder</span>
 *      </button>
 *      <input type="hidden" id="hidden-input-id" name="...">
 *      ← TVs antigas (Samsung série J / Tizen 2.4) onde OK em <input> é
 *        consumido pelo SO. Buttons recebem OK uniformemente.
 * ============================================================ */
(function (global) {
    'use strict';

    var LAYOUTS = {
        lower: [
            ['q','w','e','r','t','y','u','i','o','p'],
            ['a','s','d','f','g','h','j','k','l','ç'],
            ['z','x','c','v','b','n','m','-','_','.']
        ],
        upper: [
            ['Q','W','E','R','T','Y','U','I','O','P'],
            ['A','S','D','F','G','H','J','K','L','Ç'],
            ['Z','X','C','V','B','N','M','-','_','.']
        ],
        nums: [
            ['1','2','3','4','5','6','7','8','9','0'],
            ['.',',','?','!','@','#','-','_',':','/'],
            ['+','*','(',')','&','%','$','=','"',"'"]
        ]
    };

    function el(tag, cls, txt) {
        var n = document.createElement(tag);
        if (cls) n.className = cls;
        if (txt != null) n.textContent = txt;
        return n;
    }

    var modal = null, preview = null,
        helperRow = null, numsRow = null, lettersBox = null, fnRow = null;
    // state.trigger = elemento clicável (input OU button)
    // state.target  = elemento que guarda o value (input OU hidden input)
    var state = { mode: 'lower', trigger: null, target: null, opts: {} };

    var bound = [];
    // ANDROID (celular/TV box): o sistema TEM teclado nativo (touch no celular /
    // leanback IME na TV). O teclado virtual próprio existe SÓ pra Samsung/LG
    // antigas sem IME → no Android é dispensável e ainda prendia o foco no fundo
    // (a busca de canais, que é <div>, caía nele). isAndroid() força o nativo.
    // Detecção: ponte window.HdxNative (só existe no APK Android). Web/Tizen/LG = false.
    function isAndroid() { try { return !!(global.HdxNative && global.HdxNative.play); } catch (e) { return false; } }
    function optsForEl(elem) {
        if (!elem) return null;
        // Input NATIVO (PC/celular): digita com o teclado físico/do sistema —
        // o teclado virtual NUNCA abre pra ele. (Sem isso, as redes de
        // segurança do tv.js pra Tizen antiga — click/keyup/OK abrem o vkb —
        // abriam o teclado em cima do campo nativo no PC, e o foco na 1ª
        // tecla colava um "q" no valor.)
        if (elem.className && String(elem.className).indexOf('vkb-native') !== -1) return null;
        for (var i = 0; i < bound.length; i++) {
            if (bound[i].trigger === elem) return bound[i].opts;
        }
        return null;
    }

    /** Acha o elemento que guarda o value real. Pra <button data-vkb-target>,
     *  é o input hidden referenciado. Pra <input>, é o próprio input. */
    function resolveTarget(trigger) {
        if (!trigger) return null;
        var attr = trigger.getAttribute && trigger.getAttribute('data-vkb-target');
        if (attr) {
            var t = document.getElementById(attr);
            if (t) return t;
        }
        return trigger;
    }

    function ensureModal() {
        if (modal) return;
        modal = el('div', 'kbd-modal');
        modal.style.display = 'none';

        var card = el('div', 'kbd-card');
        modal.appendChild(card);

        preview = el('div', 'kbd-preview');
        card.appendChild(preview);

        helperRow = el('div', 'kbd-helper');
        helperRow.style.display = 'none';
        card.appendChild(helperRow);

        // Fileira numérica FIXA (1-9, 0) sempre no topo — não precisa entrar
        // no modo "123" pra digitar número (pedido do cliente). Estática.
        numsRow = el('div', 'kbd-nums');
        var nrow = el('div', 'kbd-row');
        var digits = ['1','2','3','4','5','6','7','8','9','0'];
        for (var d = 0; d < digits.length; d++) {
            nrow.appendChild(btn('kbd-key kbd-key-num', digits[d], (function (k) {
                return function () { insert(k); };
            })(digits[d])));
        }
        numsRow.appendChild(nrow);
        card.appendChild(numsRow);

        lettersBox = el('div', 'kbd-letters');
        card.appendChild(lettersBox);

        fnRow = el('div', 'kbd-fn');
        card.appendChild(fnRow);

        document.body.appendChild(modal);
    }

    function renderHelper() {
        helperRow.innerHTML = '';
        if (!state.opts.urlHelpers) { helperRow.style.display = 'none'; return; }
        helperRow.style.display = '';
        var hs = ['http://', 'https://', '.com'];
        for (var i = 0; i < hs.length; i++) {
            (function (s) {
                helperRow.appendChild(btn('kbd-helper-key', s, function () { insert(s); }));
            })(hs[i]);
        }
    }

    function renderLetters() {
        lettersBox.innerHTML = '';
        var rows = LAYOUTS[state.mode] || LAYOUTS.lower;
        for (var r = 0; r < rows.length; r++) {
            var row = el('div', 'kbd-row');
            for (var c = 0; c < rows[r].length; c++) {
                var ch = rows[r][c];
                row.appendChild(btn('kbd-key', ch, (function (k) {
                    return function () { insert(k); };
                })(ch)));
            }
            lettersBox.appendChild(row);
        }
    }

    function renderFn() {
        fnRow.innerHTML = '';
        var shift = btn('kbd-fn-key', state.mode === 'upper' ? 'a/A' : 'A/a', function () {
            state.mode = (state.mode === 'upper') ? 'lower' : 'upper';
            renderLetters(); renderFn(); focusFirstKey();
        });
        var nums = btn('kbd-fn-key', state.mode === 'nums' ? 'ABC' : '123', function () {
            state.mode = (state.mode === 'nums') ? 'lower' : 'nums';
            renderLetters(); renderFn(); focusFirstKey();
        });
        var space = btn('kbd-fn-space', 'Espaço', function () { insert(' '); });
        var bksp  = btn('kbd-fn-key', 'Apagar', backspace);
        var cancel = btn('kbd-fn-key kbd-fn-cancel', 'Cancelar', closeKb);

        fnRow.appendChild(shift);
        fnRow.appendChild(nums);
        fnRow.appendChild(space);
        fnRow.appendChild(bksp);
        fnRow.appendChild(cancel);

        if (state.opts.onNext || state.opts.onSubmit) {
            var hasNext = !!state.opts.onNext;
            var label = hasNext ? 'Próximo' : (state.opts.submitLabel || 'OK');
            fnRow.appendChild(btn('kbd-fn-key kbd-fn-ok', label, function () {
                var nextFn = state.opts.onNext;
                var subFn  = state.opts.onSubmit;
                closeKb();
                if (nextFn) nextFn();
                else if (subFn) subFn();
            }));
        }
    }

    function btn(cls, label, handler) {
        var b = el('button', cls, label);
        b.type = 'button';
        b.addEventListener('click', function (e) { e.preventDefault(); handler(); });
        return b;
    }

    function getValue() {
        return (state.target && state.target.value) ? state.target.value : '';
    }

    function isMaskMode() {
        if (!state.trigger) return false;
        var attr = state.trigger.getAttribute && state.trigger.getAttribute('data-vkb-mask');
        if (attr === 'yes') return true;
        if (attr === 'no')  return false;
        return state.trigger.type === 'password';
    }

    function syncTriggerDisplay() {
        var trig = state.trigger;
        if (!trig || trig.tagName !== 'BUTTON') return;
        var disp = trig.querySelector('.vkb-display');
        if (!disp) return;
        var v = getValue();
        if (v === '') {
            disp.textContent = trig.getAttribute('data-vkb-placeholder') || 'Aperte OK pra digitar';
            disp.className = 'vkb-display vkb-empty';
        } else {
            // Buttons sempre mostram texto cru (sem máscara) — se é senha,
            // pode-se passar data-vkb-mask="yes" e a gente mascara aqui também.
            var mask = trig.getAttribute('data-vkb-mask') === 'yes';
            disp.textContent = mask ? new Array(v.length + 1).join('•') : v;
            disp.className = 'vkb-display';
        }
    }

    function updatePreview() {
        if (!preview) return;
        var v = getValue();
        var label = (state.trigger && state.trigger.getAttribute('data-vkb-label')) || 'Digite';
        var display = isMaskMode() ? new Array(v.length + 1).join('•') : v;
        preview.innerHTML = '<div class="kbd-preview-label">' + escapeHtml(label) + '</div>'
            + '<div class="kbd-preview-text">' + (display ? escapeHtml(display) : '<span class="kbd-cursor">|</span>') + '</div>';
    }
    function escapeHtml(s) {
        return String(s).replace(/[&<>"']/g, function (c) {
            return ({ '&':'&amp;','<':'&lt;','>':'&gt;','"':'&quot;',"'":'&#39;'}[c]);
        });
    }

    function setValue(v) {
        if (!state.target) return;
        state.target.value = v;
        if (window.Tv && Tv.fireInput) Tv.fireInput(state.target);
        syncTriggerDisplay();
        updatePreview();
    }
    function insert(ch) { setValue(getValue() + ch); }
    function backspace() {
        var v = getValue();
        if (!v) return;
        setValue(v.slice(0, -1));
    }
    function clearAll() { setValue(''); }

    function focusFirstKey() {
        var k = lettersBox && lettersBox.querySelector('.kbd-key');
        if (k) try { k.focus(); } catch (e) {}
    }

    function openKb(trigger, opts) {
        if (isAndroid()) return;   // Android usa o teclado NATIVO (no PC os campos já viram bindNative; só ui-tv da Samsung/LG abre o vkb)
        ensureModal();
        state.trigger = trigger;
        state.target  = resolveTarget(trigger);
        state.opts    = opts || {};
        state.mode    = 'lower';
        renderHelper();
        renderLetters();
        renderFn();
        // Força posicionamento + visibilidade via inline style (specificity
        // máxima) — evita esconder atrás de stacking context na Tizen 2.4 J.
        modal.style.display = 'block';
        modal.style.position = 'fixed';
        modal.style.top = '0';
        modal.style.left = '0';
        modal.style.right = '0';
        modal.style.bottom = '0';
        modal.style.width = '100%';
        modal.style.height = '100%';
        modal.style.zIndex = '999999';
        document.body.classList.add('vkb-open');
        updatePreview();
        document.addEventListener('keydown', trapKey, true);
        // Foco na 1ª tecla SÓ na TV (D-pad precisa). No PC/celular deixa sem
        // foco — senão Enter/Espaço físicos "clicam" a tecla focada (o q!).
        if (isTvUi()) setTimeout(focusFirstKey, 80);
    }
    var _lastCloseAt = 0;
    function closeKb() {
        if (!modal) return;
        modal.style.display = 'none';
        document.body.classList.remove('vkb-open');
        document.removeEventListener('keydown', trapKey, true);
        var trig = state.trigger;
        state.trigger = null;
        state.target  = null;
        if (trig) try { trig.focus(); } catch (e) {}
        _lastCloseAt = Date.now();
    }
    function trapKey(e) {
        var k = e.key, c = e.keyCode;

        // PC / celular com teclado físico: digita DIRETO no teclado virtual.
        // (Só fora da TV — na TV o controle remoto manda e nada muda aqui.)
        if (!isTvUi()) {
            if (k === 'Backspace' || c === 8) {           // apaga 1 letra
                e.preventDefault(); e.stopPropagation();
                backspace();
                return;
            }
            if (k === 'Enter' || c === 13) {              // confirma (Próximo/OK)
                e.preventDefault(); e.stopPropagation();
                var nextFn = state.opts.onNext, subFn = state.opts.onSubmit;
                closeKb();
                if (nextFn) nextFn();
                else if (subFn) subFn();
                return;
            }
            if (k === 'Escape' || c === 27) {             // cancela
                e.preventDefault(); e.stopPropagation();
                closeKb();
                return;
            }
            if (k && k.length === 1 && !e.ctrlKey && !e.altKey && !e.metaKey) {
                e.preventDefault(); e.stopPropagation();  // letra/número/espaço
                insert(k);
                return;
            }
            return; // outras teclas (setas, Tab...) seguem o fluxo normal
        }

        // TV: botão Voltar do controle fecha o teclado (comportamento original)
        if (k === 'Escape' || k === 'Backspace' || k === 'GoBack'
            || k === 'XF86Back' || k === 'BrowserBack' || k === 'Back'
            || c === 8 || c === 27 || c === 461 || c === 10009
            || c === 88) {  // Samsung Maple/Orsay KEY_RETURN
            e.preventDefault();
            e.stopPropagation();
            closeKb();
        }
    }

    /** Inicializa o display de um trigger button com o valor atual do hidden input. */
    function initTriggerDisplay(trigger) {
        if (!trigger || trigger.tagName !== 'BUTTON') return;
        var target = resolveTarget(trigger);
        var v = (target && target.value) ? target.value : '';
        var disp = trigger.querySelector('.vkb-display');
        if (!disp) return;
        if (v === '') {
            disp.textContent = trigger.getAttribute('data-vkb-placeholder') || 'Aperte OK pra digitar';
            disp.className = 'vkb-display vkb-empty';
        } else {
            var mask = trigger.getAttribute('data-vkb-mask') === 'yes';
            disp.textContent = mask ? new Array(v.length + 1).join('•') : v;
            disp.className = 'vkb-display';
        }
    }

    function isTvUi() {
        return !!(document.body && document.body.className &&
                  document.body.className.indexOf('ui-tv') !== -1);
    }

    /* ANDROID (login): barra de PREVIEW acima do teclado — mostra o RÓTULO do campo
       + o texto digitado (mascarado se senha), pra o cliente LER o que digita sem
       precisar enxergar o campo atrás do teclado. A página de login fica FIXA. Com
       o adjustResize do app, a barra (position:fixed;bottom:0) fica logo ACIMA do
       teclado. Se o teclado do aparelho abrir em tela cheia (paisagem), ele mesmo já
       mostra o texto em cima — nos dois casos o cliente vê o que digita. */
    var imePv = null;
    var imePvHideT = null;   // timer do esconder — CANCELADO se outro campo focar
    /* A barra ACOMPANHA a "descida" da página: ao apertar Próximo, o navegador
       empurra a janela VISÍVEL um pouco (visual viewport pan — não é scroll de DOM,
       a trava não pega). Aqui a barra segue o deslocamento e fica sempre colada no
       topo do que está VISÍVEL → mesmo a tela descendo um pouco, ela continua
       exibindo o que se digita (ideia do Leonardo). */
    function imePvTrack() {
        if (!imePv || !window.visualViewport) return;
        var vv = window.visualViewport;
        imePv.style.transform = 'translate(' + (vv.offsetLeft || 0) + 'px,' + (vv.offsetTop || 0) + 'px)';
    }
    function imePvEl() {
        if (imePv) return imePv;
        var d = document.createElement('div');
        d.id = 'zx-ime-preview';
        d.innerHTML = '<div class="zx-imp-back">‹ Voltar</div><div class="zx-imp-label"></div><div class="zx-imp-text"></div>';
        d.style.display = 'none';
        (document.body || document.documentElement).appendChild(d);
        imePv = d;
        // Botão VOLTAR (canto direito da barra): sai da digitação — tira o foco do
        // campo (fecha o teclado nativo) e esconde a barra. Pedido do Leonardo.
        var bk = d.querySelector('.zx-imp-back');
        bk.addEventListener('mousedown', function (ev) { if (ev.preventDefault) ev.preventDefault(); });
        bk.addEventListener('touchstart', function (ev) { if (ev.preventDefault) ev.preventDefault();
            try { var a = document.activeElement; if (a && a.blur) a.blur(); } catch (e) {}
            imePvHide();
        });
        bk.addEventListener('click', function () {
            try { var a = document.activeElement; if (a && a.blur) a.blur(); } catch (e) {}
            imePvHide();
        });
        if (window.visualViewport) {
            window.visualViewport.addEventListener('scroll', imePvTrack);
            window.visualViewport.addEventListener('resize', imePvTrack);
        }
        return d;
    }
    function imePvShow(label) {
        // ⚠️ cancela o esconder pendente do campo ANTERIOR — sem isto, ao pular de
        // campo (Próximo/toque) o timer do blur antigo APAGAVA a barra do campo novo
        // (bug: barra só aparecia no 1º campo; nos outros piscava e sumia).
        if (imePvHideT) { clearTimeout(imePvHideT); imePvHideT = null; }
        var d = imePvEl();
        d.querySelector('.zx-imp-label').textContent = label || 'Digite';
        d.style.display = 'block';
        imePvTrack();
    }
    function imePvUpdate(val, mask) {
        if (!imePv) return;
        var t = imePv.querySelector('.zx-imp-text');
        if (!val) { t.innerHTML = '<span class="zx-imp-empty">|</span>'; return; }
        t.textContent = mask ? new Array(val.length + 1).join('•') : val;
    }
    function imePvHide() { if (imePv) imePv.style.display = 'none'; }
    function imePvHideSoon() {
        if (imePvHideT) clearTimeout(imePvHideT);
        imePvHideT = setTimeout(function () { imePvHideT = null; imePvHide(); }, 200);
    }

    /* CONGELA a página enquanto um campo do login/Adicionar lista está focado.
       O Chromium rola a tela (até container com overflow:hidden, e também o
       .search-body da tela Listas) pra "revelar" o campo quando o teclado nativo
       abre — era isso que deixava a página "rolante" no celular. No focus, grava a
       posição de TODOS os ancestrais roláveis; enquanto o foco durar, qualquer
       rolagem é DESFEITA na hora → página fixa; o texto aparece na barra do topo. */
    var zxFrozen = null;
    function zxFreezeFor(inp) {
        var els = [], n = inp.parentNode;
        while (n && n.nodeType === 1) {
            try { if (n.scrollHeight > n.clientHeight + 1 || n.scrollTop) els.push({ el: n, t: n.scrollTop, l: n.scrollLeft }); } catch (e) {}
            n = n.parentNode;
        }
        try {
            var se = document.scrollingElement || document.documentElement;
            els.push({ el: se, t: se.scrollTop, l: se.scrollLeft });
        } catch (e) {}
        zxFrozen = els;
        if (!document.__zxScrollFreeze) {
            document.__zxScrollFreeze = true;
            // capture=true pega o scroll de QUALQUER elemento (scroll não borbulha)
            document.addEventListener('scroll', function () {
                if (!zxFrozen) return;
                for (var i = 0; i < zxFrozen.length; i++) {
                    var f = zxFrozen[i];
                    try {
                        if (f.el.scrollTop !== f.t) f.el.scrollTop = f.t;
                        if (f.el.scrollLeft !== f.l) f.el.scrollLeft = f.l;
                    } catch (e) {}
                }
            }, true);
        }
    }
    function zxUnfreeze() { zxFrozen = null; }

    /* PC / celular (NÃO-TV): em vez do teclado virtual, troca o botão por um
       <input> de verdade — dá pra digitar com o teclado físico (ou o do sistema
       no celular). Mantém o hidden input sincronizado; Enter avança de campo e
       envia no último. A TV continua no teclado virtual (depende do controle). */
    function bindNative(trigger, opts) {
        var target = resolveTarget(trigger);
        if (!target || target === trigger) return false;
        opts = opts || {};
        var lbl = trigger.getAttribute('data-vkb-label') || '';
        var isPass = (trigger.getAttribute('data-vkb-mask') === 'yes')
                  || /senha|password/i.test(lbl)
                  || /pass/i.test(target.id || '') || /pass/i.test(target.name || '');
        var inp = document.createElement('input');
        inp.type = isPass ? 'password' : 'text';
        inp.className = 'vkb-native';
        inp.setAttribute('autocomplete', 'off');
        inp.setAttribute('autocapitalize', 'none');
        inp.setAttribute('autocorrect', 'off');
        inp.setAttribute('spellcheck', 'false');
        inp.placeholder = trigger.getAttribute('data-vkb-placeholder') || '';
        inp.value = (target.value || '');
        // ANDROID + campo de BUSCA: o Android abre o IME só de FOCAR um input —
        // então PASSAR o cursor por cima de "Pesquisar" abria o teclado à toa.
        // Fica readonly (foco passa sem abrir teclado) até ATIVAR com OK/clique;
        // volta readonly ao sair. (Login NÃO entra — autofocus deve abrir direto.)
        var isSearchFld = isAndroid() && trigger.id && trigger.id.indexOf('search') >= 0;
        if (isSearchFld) {
            inp.readOnly = true;
            var actChanging = false;
            var actSearch = function () {
                inp.readOnly = false; actChanging = true;
                try { inp.blur(); } catch (e) {}                       // blur+refoco força o IME a abrir
                setTimeout(function () { actChanging = false; try { inp.focus(); } catch (e2) {} }, 0);
            };
            inp.addEventListener('keydown', function (ev) {
                if (inp.readOnly && (ev.keyCode === 13 || ev.keyCode === 23 || ev.key === 'Enter')) { ev.preventDefault(); ev.stopImmediatePropagation(); actSearch(); }
            });
            inp.addEventListener('click', function () { if (inp.readOnly) actSearch(); });
            inp.addEventListener('blur', function () { if (!actChanging) inp.readOnly = true; });   // sair do campo → trava de novo
        }
        trigger.style.display = 'none';
        trigger.parentNode.insertBefore(inp, trigger);
        // Login no Android: mostra o preview acima do teclado (rótulo + o que digita).
        var isLoginFld = isAndroid() && trigger.id && trigger.id.indexOf('login-') === 0;
        inp.addEventListener('input', function () {
            target.value = inp.value;
            if (window.Tv && Tv.fireInput) Tv.fireInput(target);
            if (isLoginFld) imePvUpdate(inp.value, isPass);
        });
        if (isLoginFld) {
            inp.addEventListener('focus', function () { zxFreezeFor(inp); imePvShow(lbl || 'Digite'); imePvUpdate(inp.value, isPass); });
            inp.addEventListener('blur', function () { zxUnfreeze(); imePvHideSoon(); });
        }
        inp.addEventListener('keydown', function (e) {
            if (e.key === 'Enter' || e.keyCode === 13) {
                e.preventDefault();
                target.value = inp.value;
                var form = inp.form, nx = null;
                if (form) {
                    var ins = form.querySelectorAll('input.vkb-native');
                    for (var i = 0; i < ins.length; i++) {
                        if (ins[i] === inp) { nx = ins[i + 1] || null; break; }
                    }
                }
                if (nx) { try { nx.focus(); } catch (e2) {} }
                else if (opts.onSubmit) { opts.onSubmit(); }
                else if (form) { form.submit(); }
            }
        });
        if (trigger.hasAttribute('autofocus')) {
            setTimeout(function () { try { inp.focus(); } catch (e) {} }, 50);
        }
        bound.push({ trigger: inp, opts: opts });
        return true;
    }

    var HdxKeyboard = {};
    HdxKeyboard.open = openKb;
    HdxKeyboard.close = closeKb;
    HdxKeyboard.isOpen = function () { return !!(modal && modal.style.display !== 'none'); };
    HdxKeyboard.bind = function (trigger, opts) {
        if (!trigger) return;
        // PC + ANDROID (qualquer app que NÃO seja ui-tv da Samsung/LG): teclado
        // NATIVO do sistema. Esses já TÊM teclado (físico no PC / IME no Android) →
        // o vkb próprio é dispensável. Samsung/LG (ui-tv) seguem no vkb (TV antiga
        // sem teclado). Aplica em <button> (login/busca de filmes) E no único <div>
        // trigger, a busca de CANAIS (id live-search-trigger) — restrito a esse id
        // de propósito: a web (que não tem esse elemento) fica provadamente intacta.
        if (!isTvUi() && trigger.getAttribute && trigger.getAttribute('data-vkb-target')
            && (trigger.tagName === 'BUTTON' || trigger.id === 'live-search-trigger')) {
            if (bindNative(trigger, opts)) return;
        }
        // Inputs em modo legacy: marcar readonly pra não exibir teclado nativo.
        // Buttons: nada a fazer (não tem valor próprio).
        if (trigger.tagName === 'INPUT') {
            trigger.setAttribute('readonly', 'readonly');
        }
        // Registra
        var existingIdx = -1;
        for (var i = 0; i < bound.length; i++) {
            if (bound[i].trigger === trigger) { existingIdx = i; break; }
        }
        if (existingIdx >= 0) bound[existingIdx].opts = opts || {};
        else bound.push({ trigger: trigger, opts: opts || {} });

        // Eventos diretos no trigger (alguns TVs)
        trigger.addEventListener('keydown', function (e) {
            var k = e.key, c = e.keyCode;
            // Inclui keyCodes de Samsung Maple/Orsay (29443) e variantes Tizen
            if (k === 'Enter' || k === ' ' || k === 'Spacebar' || k === 'Done' || k === 'Select'
                || c === 13 || c === 32 || c === 29443 || c === 65376 || c === 65385) {
                e.preventDefault();
                openKb(trigger, opts || {});
            }
        });
        trigger.addEventListener('click', function (e) {
            if (e && e.preventDefault) e.preventDefault();
            openKb(trigger, opts || {});
        });

        // Display inicial pra trigger button
        initTriggerDisplay(trigger);
    };
    HdxKeyboard.optsFor = optsForEl;
    HdxKeyboard.refresh = initTriggerDisplay;
    /** Timestamp do último fechamento — usado pelo tv.js pra evitar reabrir
     *  o teclado por causa de eventos "fantasma" (keyup, click sintetizado)
     *  que chegam DEPOIS do click no botão OK do teclado. Sem isso, ao
     *  apertar Buscar o teclado fecha → reabre → fecha → finalmente busca. */
    HdxKeyboard.lastCloseAt = function () { return _lastCloseAt; };

    global.HdxKeyboard = HdxKeyboard;
})(window);
