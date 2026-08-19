/* ============================================================
 * Fusion — controlador LOCAL (app desktop/Windows).
 * A interface roda no aparelho (igual Roku). O catálogo vem DIRETO do
 * IPTV (Xtream player_api.php). O painel tv.renciaapp.manus.space é usado só
 * via /api/r/* (login/licença/favoritos/progresso/recent/continue/
 * busca/aviso/branding). NADA é renderizado no servidor.
 *
 * Reaproveita SEM MUDAR: tv.css, tv.js (nav D-pad/teclado/relógio/
 * favoritar canal/teclas do player), keyboard.js (teclado virtual),
 * category_browser.js (grade: paginação/lazy/busca instantânea),
 * player_touch.js (OSD touch/mouse), hdx-cache.js, hls.min.js.
 *
 * Este arquivo: roteador (History API → tv.js back funciona), telas
 * (marcação IDÊNTICA às views PHP), camada IPTV + mapeadores, e um
 * "shim" que serve as URLs que o category_browser/tv.js pedem
 * (Tv.get/Tv.post) a partir do IPTV/api — sem servidor local.
 * ============================================================ */
(function (global) {
'use strict';

/* ---------- estado ---------- */
// O shell (Windows) pode injetar did (MAC) e api base via query (?did=&api=)
// ou via window.__DID/__API_BASE. Aqui consolidamos.
(function () {
    try {
        var q = {}; var s = (location.search || '').replace(/^\?/, '');
        if (s) { var ps = s.split('&'); for (var i = 0; i < ps.length; i++) { var kv = ps[i].split('='); q[decodeURIComponent(kv[0] || '')] = decodeURIComponent((kv[1] || '').replace(/\+/g, ' ')); } }
        if (q.api) global.__API_BASE = q.api;
        if (q.did) global.__DID = q.did;
    } catch (e) {}
})();
// base da API lida DINAMICAMENTE (o shell pode injetar __API_BASE após o boot)
function apiBase() { return String(global.__API_BASE || 'https://renciaapp.manus.space').replace(/\/+$/, ''); }
var S = {
    code: '', user: '', pass: '', did: '', directAuth: false,
    playlistUrl: '', playlistType: '',
    server: '',                 // base do IPTV (dns.base do resolve)
    info: null,                 // resposta do resolve
    fav: { live: [], movie: [], series: [] },   // DESEJADO local (verdade da UI)
    favDirty: { live: [], movie: [], series: [] }, // ids mudados OFFLINE (re-sincroniza ao voltar)
    favMeta: {},                // {"movie:123":{name,poster}} p/ re-adicionar no sync
    branding: null, accent: '#10b981',
    adultOk: false,
    online: true,               // VPS (painel) alcançável?
    rawCss: '',
    cat: { movies: null, series: null, live: null },   // {cats, byCat:{id:[...]}, all:[...]}
    radioCache: {}, radioPromises: {},
    catPromises: {},
    catPromiseFull: {},
    listNotificationTimer: null,
    listNotificationBusy: false,
    ultraSessionBusy: false,
    ultraSessionPending: '',
    ultraSessionVoiceMode: false
};

/* ---------- helpers ---------- */
function $(id) { return document.getElementById(id); }
function root() { return $('app-root'); }
function enc(s) { return encodeURIComponent(s == null ? '' : s); }
function esc(s) { return String(s == null ? '' : s).replace(/[&<>]/g, function (c) { return ({ '&': '&amp;', '<': '&lt;', '>': '&gt;' }[c]); }); }
function attr(s) { return String(s == null ? '' : s).replace(/[&<>"]/g, function (c) { return ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;' }[c]); }); }
/* ============ i18n (PT/EN) ============================================
 * A CHAVE do dicionário é o próprio texto em PT: t('Filmes') -> 'Movies' se
 * o idioma for EN, ou o próprio 'Filmes' se for PT. Assim o PT nunca quebra
 * (fallback = a própria chave) e não precisamos de IDs. Idioma escolhido no
 * 1º uso (maybeAskLanguage) e guardado em localStorage 'zx_lang'. */
var ZL = { lang: null };
function detectLang() { try { var l = String(navigator.language || navigator.userLanguage || '').toLowerCase(); return (l.indexOf('pt') === 0) ? 'pt' : 'en'; } catch (e) { return 'pt'; } }
function langChosen() { try { var v = localStorage.getItem('zx_lang'); return (v === 'pt' || v === 'en'); } catch (e) { return false; } }
function currentLang() {
    if (ZL.lang === 'pt' || ZL.lang === 'en') return ZL.lang;
    try { var v = localStorage.getItem('zx_lang'); if (v === 'pt' || v === 'en') { ZL.lang = v; return v; } } catch (e) {}
    return detectLang();
}
function setLang(l) { if (l !== 'pt' && l !== 'en') return; ZL.lang = l; try { localStorage.setItem('zx_lang', l); } catch (e) {} }
function t(s) { if (currentLang() !== 'en') return s; var v = I18N_EN[s]; return (v == null) ? s : v; }
/* t() com esc embutido (pra textos que vão dentro de HTML). */
function te(s) { return esc(t(s)); }
/* Traduz (EN) o DOM já renderizado: nós de texto + placeholder/aria-label/vkb
   cujo texto (sem espaços nas pontas) bata EXATO com uma chave PT do dicionário.
   Conteúdo dinâmico (nome de filme/canal/categoria) não bate → fica intocado.
   Em PT é no-op. Chamado no setHtml() → cobre toda tela sem envolver cada string. */
function translateTree(rootEl) {
    if (!rootEl || currentLang() !== 'en') return;
    try {
        var w = document.createTreeWalker(rootEl, NodeFilter.SHOW_TEXT, null, false), n, list = [];
        while ((n = w.nextNode())) list.push(n);
        for (var i = 0; i < list.length; i++) {
            var tn = list[i], p = tn.parentNode, raw = tn.nodeValue;
            if (!raw || !p) continue;
            var pn = p.nodeName; if (pn === 'STYLE' || pn === 'SCRIPT' || pn === 'TEXTAREA') continue;
            var mid = raw.replace(/^\s+|\s+$/g, ''); if (!mid) continue;
            var tr = I18N_EN[mid]; if (tr == null) continue;
            tn.nodeValue = raw.match(/^\s*/)[0] + tr + raw.match(/\s*$/)[0];
        }
        var els = rootEl.querySelectorAll('[placeholder],[aria-label],[data-vkb-label],[data-vkb-placeholder]');
        var attrs = ['placeholder', 'aria-label', 'data-vkb-label', 'data-vkb-placeholder'];
        for (var j = 0; j < els.length; j++) {
            for (var k = 0; k < attrs.length; k++) {
                var v = els[j].getAttribute(attrs[k]); if (v == null) continue;
                var trr = I18N_EN[v.replace(/^\s+|\s+$/g, '')];
                if (trr != null) els[j].setAttribute(attrs[k], trr);
            }
        }
    } catch (e) {}
}
var I18N_EN = {
    // ---- Perfis ----
    'Quem está assistindo?': "Who's watching?",
    'Escolha um perfil para editar': 'Choose a profile to edit',
    'Novo perfil': 'New profile', 'Editar perfis': 'Edit profiles', 'Concluído': 'Done',
    'Editar perfil': 'Edit profile', 'Nome do perfil': 'Profile name',
    'Escolha um avatar': 'Choose an avatar', 'Salvar': 'Save',
    'Apagar perfil': 'Delete profile', 'Aperte de novo para apagar': 'Press again to delete',
    'Perfis': 'Profiles', 'Perfil:': 'Profile:',
    'Conheça os Perfis': 'Meet Profiles',
    'Agora cada pessoa da casa pode ter seu próprio espaço no app.': 'Now everyone at home can have their own space in the app.',
    'Até 4 perfis neste aparelho': 'Up to 4 profiles on this device',
    'Cada um com seus favoritos e seu Continuar Assistindo': 'Each one keeps its own favorites and Continue Watching',
    'Troque quando quiser no seu avatar, no alto da tela inicial': 'Switch anytime on your avatar at the top of the Home screen',
    'Personalizar meu perfil': 'Set up my profile', 'Agora não': 'Not now',
    // ---- Home / nav / status ----
    'TV ao Vivo': 'Live TV', 'TV ao vivo': 'Live TV', 'Filmes': 'Movies', 'Séries': 'Series', 'Playlist': 'Playlist',
    'canais': 'channels', 'filmes': 'movies', 'séries': 'series',
    'Adicionar / gerenciar': 'Add / manage', 'itens': 'items',
    'Assistido Recentemente': 'Recently Watched', 'restantes': 'left',
    'Você ainda não assistiu nada — o que você reproduzir aparece aqui.': 'You haven’t watched anything yet — what you play shows up here.',
    'Servidor': 'Server', 'Usuário': 'Username', 'Usuário:': 'Username:',
        'ID do aparelho:': 'Device ID:', 'Vencimento da lista:': 'List expiry:', 'Sem expiração': 'No expiry',
    'UltraSession': 'UltraSession', 'Falar intenção': 'Speak your intention', 'Montar sessão': 'Build session', 'Começar selecionado': 'Start selected', 'Trocar sugestão': 'Try another suggestion',

    'Fechar': 'Close', 'Entendi': 'Got it',
    'Adicione uma lista em': 'Add a list in', 'pra começar': 'to start',
    // ---- Login / listas ----
    'URL ou código do servidor': 'Server URL or code', 'Senha': 'Password',
    'código ou http://servidor:porta': 'code or http://server:port',
    'seu usuário': 'your username', 'sua senha': 'your password',
    'Entrar': 'Sign in', 'Entrando…': 'Signing in…', 'Preencha tudo.': 'Fill in everything.',
    'Não foi possível entrar. Confira os dados.': 'Couldn’t sign in. Check your details.',
    'Bem-vindo': 'Welcome', 'Adicione sua lista pra começar.': 'Add your list to get started.',
    'Digite o código, usuário e senha da sua lista.': 'Enter your list’s code, username and password.',
    'Voltar': 'Back', '← Voltar': '← Back', '← Início': '← Home', 'Listas': 'Lists', 'Sua lista': 'Your list',
    'Trocar lista': 'Switch list', 'Adicionar lista': 'Add list',
    'Sem conexão. Tente de novo.': 'No connection. Try again.',
    'Playlist não adicionada': 'No playlist added',
    'Adicione uma lista no menu Playlist para começar a assistir.': 'Add a list in the Playlist menu to start watching.',
    // ---- offline / erros ----
    '⚠ Sem conexão com o painel — usando dados salvos': '⚠ No connection to the panel — using saved data',
    'Sem conexão': 'No connection',
    'Não deu pra carregar este conteúdo. Verifique a internet e recarregue.': 'Couldn’t load this content. Check your internet and reload.',
    'Recarregar': 'Reload', 'Não foi possível carregar. ': 'Couldn’t load. ', 'Não foi possível carregar': 'Couldn’t load',
    'Não foi possível falar com o painel para o primeiro acesso. Verifique sua internet e tente de novo.': 'Couldn’t reach the panel for first access. Check your internet and try again.',
    'Tentar de novo': 'Try again',
    // ---- tiles de fallback ----
    'Filme': 'Movie', 'Série': 'Series', 'Canal': 'Channel', 'Favoritar canal': 'Favorite channel',
    // ---- sidebar / seções VOD ----
    'Continue Assistindo': 'Continue Watching', 'Pesquisar': 'Search', 'Favoritos': 'Favorites',
    'Recém adicionados': 'Recently added',
    'Carregando mais séries…': 'Loading more series…', 'Carregando mais filmes…': 'Loading more movies…',
    'Nenhuma série nessa categoria.': 'No series in this category.', 'Nenhum filme nessa categoria.': 'No movies in this category.',
    // ---- canais / EPG ----
    'Buscar canal': 'Search channel', 'Buscar canal…': 'Search channel…', 'Buscar': 'Search',
    'Recentes': 'Recent', 'Canais Favoritos': 'Favorite Channels', 'Canais Recentes': 'Recent Channels',
    'Selecione uma categoria para ver os canais.': 'Select a category to see the channels.',
    'Passe num canal para ver a programação.': 'Focus a channel to see its schedule.',
    'Carregando…': 'Loading…', '▶ Assistir': '▶ Watch',
    'Carregando programação…': 'Loading schedule…', 'Sem programação para este canal.': 'No schedule for this channel.',
    // ---- botões de play / detalhe ----
    'Recomeçar': 'Restart', 'Reproduzir': 'Play', 'Continuar': 'Continue', 'Continuar de ': 'Resume from ', 'Próximo': 'Next', 'Rever': 'Rewatch',
    'Nenhum resultado para': 'No results for', 'Personalize o seu ': 'Customize your ',
    'Temporadas': 'Seasons', 'Temporada ': 'Season ', 'Remover dos Favoritos': 'Remove from Favorites',
    'Você também pode gostar': 'You might also like',
    // ---- busca ----
    'Pesquisar Séries': 'Search Series', 'Pesquisar Filmes': 'Search Movies',
    'Digite o nome da série…': 'Type the series name…', 'Digite o nome do filme…': 'Type the movie name…',
    'Use o teclado para buscar.': 'Use the keyboard to search.',
    'Digite pelo menos 3 letras.': 'Type at least 3 letters.', 'Buscando…': 'Searching…',
    // ---- configurações ----
    'Tela do app': 'App screen', 'Ajusta o tamanho dos': 'Adjusts the size of the', 'posters e ícones': 'posters and icons',
    'pra sua tela.': 'for your screen.', 'Celular': 'Phone', 'deixa tudo menor (mais posters por linha).': 'makes everything smaller (more posters per row).',
    '📱 Celular': '📱 Phone', '📺 TV / Caixa': '📺 TV / Box',
    'Controle parental': 'Parental control',
    'A senha bloqueia as categorias': 'The password blocks the', 'adultas (XXX)': 'adult categories (XXX)',
    '. Fica guardada': '. Stored', 'só neste aparelho': 'only on this device',
    '(nada no servidor). Padrão:': '(nothing on the server). Default:',
    'Senha atual': 'Current password', 'Nova senha (4 dígitos)': 'New password (4 digits)', 'Confirmar nova senha': 'Confirm new password',
    'Salvar nova senha': 'Save new password', 'Configurações': 'Settings',
    'Informação Geral': 'General Info', 'Player de Vídeo': 'Video Player', 'Limpar Cache': 'Clear Cache', 'Sair da conta': 'Log out',
    'Sua conta': 'Your account', 'Informações da sua assinatura.': 'Your subscription details.',
    'Vencimento': 'Expiry', 'Status': 'Status', 'Mac': 'Mac', 'Plataforma': 'Platform',
    'Configurações do Player': 'Player Settings', 'Vale só': 'Applies only to', 'neste aparelho': 'this device',
    'é o padrão;': 'is the default;', 'oferece mais recursos.': 'offers more features.',
    'Canais ao vivo': 'Live channels', 'Nativo': 'Native', 'Filmes e séries (VOD)': 'Movies and series (VOD)',
    'Use caso esteja tendo problemas com o app.': 'Use if you’re having problems with the app.',
    'Limpar cache local': 'Clear local cache', 'Remove dados temporários armazenados.': 'Removes stored temporary data.',
    '✓ Cache local removido.': '✓ Local cache cleared.', 'Senha atual incorreta.': 'Current password is incorrect.',
    'A nova senha deve ter 4 dígitos.': 'The new password must be 4 digits.', 'As senhas não coincidem.': 'The passwords don’t match.',
    '✓ Senha alterada com sucesso.': '✓ Password changed successfully.',
    // ---- player / episódios / PIN ----
    'Pressione voltar e tente novamente.': 'Press back and try again.', 'Episódio': 'Episode', 'Próximo episódio': 'Next episode',
    'Conteúdo adulto': 'Adult content', 'Digite o PIN para continuar.': 'Enter the PIN to continue.',
    'Desbloquear': 'Unlock', 'Cancelar': 'Cancel', 'Senha incorreta.': 'Wrong password.', '✓ Atualizado': '✓ Updated',
    // ---- paywall ----
    'Período de uso expirado': 'Access period expired', 'Renove para continuar assistindo.': 'Renew to keep watching.',
    'Já paguei': 'I already paid', 'Sair': 'Exit', 'Verificando…': 'Checking…', 'Ainda não consta': 'Not showing yet',
    'Aparelho:': 'Device:', 'Renove em': 'Renew at',
    // ---- 1º uso: idioma / celular-TV / pirataria ----
    'Como você vai usar o Fusion?': 'How will you use Fusion?',
    'Ajusta o tamanho dos posters e ícones pra sua tela.': 'Adjusts poster and icon size for your screen.',
    'Posters menores, mais por linha': 'Smaller posters, more per row',
    'TV / Caixa': 'TV / Box', 'Posters maiores (tela grande)': 'Bigger posters (large screen)',
    'Dá pra trocar depois em Configurações.': 'You can change it later in Settings.',
    'Escolha o idioma do app.': 'Choose the app language.',
    'Bem-vindo ao Fusion': 'Welcome to Fusion',
    '<strong>O Fusion é apenas um reprodutor de mídia.</strong> Ele não fornece, hospeda, vende nem inclui canais, filmes, séries ou mídia de qualquer tipo.': '<strong>Fusion is only a media player.</strong> It does not provide, host, sell or include any channels, movies, series or media of any kind.',
    'Para assistir, você adiciona <strong>a sua própria lista</strong> de um provedor que você já tem. Você é o único responsável pelas listas e fontes que adicionar.': 'To watch anything, you add <strong>your own playlist</strong> from a provider you already have. You alone are responsible for the lists and sources you add.',
    '<strong>Pirataria é crime.</strong> Não use o Fusion para acessar conteúdo que você não está autorizado a ver.': '<strong>Piracy is a crime.</strong> Do not use Fusion to access content you are not authorized to view.',
    'Entendi e concordo': 'I understand & agree'
};
function arr1(x) { if (x == null) return []; return (typeof x.length === 'number' && typeof x !== 'string') ? x : [x]; }
function inArr(a, v) { a = a || []; for (var i = 0; i < a.length; i++) { if (+a[i] === +v) return true; } return false; }
function p2(n) { return ('0' + n).slice(-2); }
function isAdultName(n) { n = (n || '').toLowerCase(); return n.indexOf('xxx') >= 0 || n.indexOf('+18') >= 0 || n.indexOf('18+') >= 0 || n.indexOf('adult') >= 0 || n.indexOf('porn') >= 0; }
// A Home possui uma única tela inicial (#zx-splash). O overlay secundário
// foi removido para não exibir uma segunda tela de carregamento.
function showLoading(on) { return; }

function isTouch() { return ('ontouchstart' in global) || navigator.maxTouchPoints > 0; }
// TV box / Android TV? (lado nativo via UiModeManager/leanback). Usado SÓ pra
// dar menos colunas no grid (fitGrid), NÃO pra mexer no viewport/CSS — o layout
// já é responsivo por clamp/vw/vh e redimensiona sozinho pela tela.
function isTvDevice() {
    try { if (global.HdxNative && typeof global.HdxNative.isTv === 'function') return !!global.HdxNative.isTv(); } catch (e) {}
    try { if (global.__ZX_TV === true || global.__ZX_TV === 1) return true; } catch (e) {}
    return false;
}
function tmdbResize(u, size) {
    // w185 = MESMO tamanho da Samsung/web (tmdb_resize no helpers.php): ~15-25KB
    // por capa (vs ~150-300KB do w780 original) → -90% de peso, sem perda visível
    // em tile. CRÍTICO em TV box / aparelho fraco (menos a decodificar por quadro).
    // Backdrops do detalhe passam 'w780' explícito → não são afetados.
    size = size || 'w185';
    if (!u) return '';
    if (u.indexOf('image.tmdb.org/t/p/') !== -1) return u.replace(/\/t\/p\/(w\d+|original)\//, '/t/p/' + size + '/');
    return u;
}
function h2(n) { n = Math.max(0, Math.min(255, Math.floor(n))); var s = n.toString(16); return s.length < 2 ? '0' + s : s; }

function getAppMac() {
    try {
        if (global.HdxNative && typeof global.HdxNative.appMac === 'function') return String(global.HdxNative.appMac() || '').toUpperCase();
        var seed = global.HdxNative && typeof global.HdxNative.deviceId === 'function' ? String(global.HdxNative.deviceId() || '') : '';
        if (!seed) { try { seed = localStorage.getItem('zx_did') || ''; } catch (e) {} }
        if (!seed) seed = 'ultraplayer-device';
        var h1 = 2166136261, h2 = 2246822519;
        for (var i = 0; i < seed.length; i++) { var c = seed.charCodeAt(i); h1 = Math.imul(h1 ^ c, 16777619); h2 = Math.imul(h2 ^ (c + i), 3266489917); }
        var hex = ((h1 >>> 0).toString(16) + (h2 >>> 0).toString(16) + '000000000000').slice(0, 12).toUpperCase();
        var oct = parseInt(hex.slice(0, 2), 16); oct = (oct | 2) & 254; var octHex = oct.toString(16).toUpperCase(); if (octHex.length < 2) octHex = '0' + octHex; hex = octHex + hex.slice(2);
        return (hex.match(/.{1,2}/g) || []).join(':');
    } catch (e) { return '00:00:00:00:00:00'; }
}
function getDid() {
    // MAC injetado pelo shell (licenciamento por aparelho) tem prioridade.
    if (global.__DID) return global.__DID;
    // Android: id ESTÁVEL por aparelho (Settings.Secure.ANDROID_ID via HdxNative).
    // Sobrevive à desinstalação/reinstalação → o cliente NÃO perde a licença paga
    // ao reinstalar (sem isto, o zx_did do localStorage some e vira device novo).
    try {
        if (global.HdxNative && global.HdxNative.deviceId) {
            var nd = global.HdxNative.deviceId();
            if (nd && ('' + nd).length >= 8) {
                global.__DID = 'and-' + nd;
                try { localStorage.setItem('zx_did', global.__DID); } catch (e) {}
                return global.__DID;
            }
        }
    } catch (e) {}
    try { var d = localStorage.getItem('zx_did'); if (!d) { d = 'win-' + Math.random().toString(36).slice(2) + Date.now().toString(36); localStorage.setItem('zx_did', d); } return d; }
    catch (e) { return 'win-anon'; }
}
function loadDirectPlaylists() {
    try { var list = JSON.parse(localStorage.getItem('zx_direct_playlists') || '[]'); return Array.isArray(list) ? list : []; } catch (e) { return []; }
}
function expiryTimestamp(value) {
    if (value === null || value === undefined || value === '') return 0;
    if (typeof value === 'number' && isFinite(value)) return value > 20000000000 ? Math.floor(value / 1000) : Math.floor(value);
    var s = String(value).trim(); if (!s) return 0;
    if (/^\d+$/.test(s)) { var n = Number(s); return n > 20000000000 ? Math.floor(n / 1000) : Math.floor(n); }
    var d = new Date(s); return isNaN(d.getTime()) ? 0 : Math.floor(d.getTime() / 1000);
}
function expiryFromListUrl(url) {
    var raw = String(url || '').trim(); if (!raw) return '';
    var keys = ['exp_date', 'expire_date', 'expires', 'expires_at', 'expiration', 'expiration_date', 'valid_until', 'validUntil', 'expiry', 'expiresAt'];
    try {
        var u = new URL(raw), q;
        for (var i = 0; i < keys.length; i++) { q = u.searchParams.get(keys[i]); if (q) return q; }
    } catch (e) {}
    try {
        var dec = decodeURIComponent(raw), m = dec.match(/(?:[?&#]|^)(?:exp_date|expire_date|expires|expires_at|expiration|expiration_date|valid_until|validUntil|expiry|expiresAt)=([^&#]+)/i);
        return m ? m[1] : '';
    } catch (e2) { return ''; }
}
function listExpiryValue(p) {
    p = p || {};
    var url = p.playlist_url || p.playlistUrl || p.url || '';
    var nested = p.user_info || p.userInfo || p.account_info || p.accountInfo || p.meta || {};
    return expiryFromListUrl(url) || p.exp_date || p.expire_date || p.expireDate || p.dataExpiracao || p.expiration_date || p.expires_at || p.valid_until || p.validUntil || p.expiry_date || p.expiry || nested.exp_date || nested.expire_date || nested.expires_at || nested.valid_until || '';
}
function saveDirectPlaylists(list) {
    try { localStorage.setItem('zx_direct_playlists', JSON.stringify((list || []).map(function (p) { return { id: String(p.id), name: p.name || 'Lista', url: p.url || '', type: p.type || '', server: p.server || '', expire_date: listExpiryValue(p) || '' }; }))); } catch (e) {}
}
function syncActivePlaylistExpiryFromSource() {
    var url = String(S.playlistUrl || '').trim(); if (!url || S._expirySourceChecked === url) return;
    S._expirySourceChecked = url;
    var c = playlistToXtream({ playlist_url: url }, 'Lista ativa'); if (!c || !c.server || !c.user || !c.pass) return;
    var endpoint = c.server + '/player_api.php?username=' + enc(c.user) + '&password=' + enc(c.pass);
    fetchT(endpoint, 12000, { cache: 'no-store', credentials: 'omit', headers: { 'Accept': 'application/json', 'Cache-Control': 'no-cache' } }).then(function (r) { return r.json(); }).then(function (j) {
        var source = j && (j.user_info || j.userInfo || j.account_info || j.accountInfo || j), raw = listExpiryValue(source), ts = expiryTimestamp(raw);
        if (!ts) return;
        S.listExpiryTs = ts;
        S.info = S.info || {}; S.info.license = S.info.license || {}; S.info.license.exp_date = ts; S.info.license.exp_display = '';
        var lists = S.directPlaylists || loadDirectPlaylists(), pick = parseInt(S.listIndex || activeListIndex(), 10) || 0;
        if (lists[pick]) { lists[pick].expire_date = raw; saveDirectPlaylists(lists); S.directPlaylists = lists; }
        if (document.querySelector('.zx-home2')) renderHome();
    }).catch(function () {});
}
function activeListIndex() { var n = 0; try { n = parseInt(localStorage.getItem('zx_list_index') || '0', 10) || 0; } catch (e) {} return n < 0 ? 0 : n; }
function saveCreds() { try { localStorage.setItem('zx_creds', JSON.stringify({ code: S.code, user: S.user, pass: S.pass, playlistUrl: S.playlistUrl || '', playlistType: S.playlistType || '', listIndex: S.listIndex || 0 })); } catch (e) {} }
function loadCreds() { try { return JSON.parse(localStorage.getItem('zx_creds') || 'null'); } catch (e) { return null; } }
function clearCreds() { try { localStorage.removeItem('zx_creds'); localStorage.removeItem('zx_direct_playlists'); localStorage.removeItem('zx_list_index'); } catch (e) {} }
function platform() {
    // Plataforma REAL do aparelho (vira o &plat= que o servidor usa no painel).
    // Android = ponte HdxNative; Samsung = webapis.avplay; senão PC (WebView2).
    try {
        if (window.HdxNative && window.HdxNative.play) return 'android';
        if (window.webapis && window.webapis.avplay && window.webapis.avplay.open) return 'tizen';
    } catch (e) {}
    return 'windows';
}

/* ---------- chamadas ---------- */
// IPTV DIRETO
function xtreamCreds() {
    if (S.xtreamUnavailable) return { server: '', user: '', pass: '' };
    if (S.xtreamDerived && S.xtreamDerived.server && S.xtreamDerived.user && S.xtreamDerived.pass) return S.xtreamDerived;
    if ((S.playlistType || '').indexOf('m3u') === 0 && S.playlistUrl) {
        var d = playlistToXtream({ playlist_url: S.playlistUrl }, 'Playlist');
        if (d) { S.xtreamDerived = d; return d; }
    }
    return { server: S.server || '', user: S.user || '', pass: S.pass || '' };
}
function xt(action, extra) {
    var c = xtreamCreds();
    if (!c.server || !c.user || !c.pass || c.pass === '__direct__') return Promise.resolve(null);
    var u = c.server + '/player_api.php?username=' + enc(c.user) + '&password=' + enc(c.pass) + '&action=' + action + (extra || '');
    return fetchT(u, 20000).then(function (r) { return r.json(); }).catch(function () { return null; });
}
// fetch com TIMEOUT — VPS pendurada NÃO pode travar o app (cai pro cache rápido)
function fetchT(url, ms, options) {
    ms = ms || 8000;
    options = options || { credentials: 'omit' };
    if (!options.credentials) options.credentials = 'omit';
    if (typeof AbortController === 'undefined') return fetch(url, options);
    var ctl = new AbortController();
    var t = setTimeout(function () { try { ctl.abort(); } catch (e) {} }, ms);
    options.signal = ctl.signal;
    return fetch(url, options)
        .then(function (r) { clearTimeout(t); return r; }, function (e) { clearTimeout(t); throw e; });
}
var M3U_PENDING = {}, M3U_PREVIEW_PENDING = {};
global.__zxPlaylistResult = function (id, ok, text) { var p = M3U_PENDING[id]; if (!p) return; delete M3U_PENDING[id]; if (ok) p.resolve(text || ''); else p.reject(new Error('playlist_fetch_failed')); };
global.__zxPlaylistPreviewResult = function (id, ok, text) { var p = M3U_PREVIEW_PENDING[id]; if (!p) return; delete M3U_PREVIEW_PENDING[id]; if (ok) p.resolve(text || ''); else p.reject(new Error('playlist_preview_failed')); };
function fetchM3UPreviewText(url) {
    if (global.HdxNative && typeof global.HdxNative.fetchM3UPreview === 'function') {
        return new Promise(function (resolve, reject) {
            var id = 'm3up_' + Date.now() + '_' + Math.floor(Math.random() * 100000);
            M3U_PREVIEW_PENDING[id] = { resolve: resolve, reject: reject };
            try { global.HdxNative.fetchM3UPreview(String(url || ''), id); } catch (e) { delete M3U_PREVIEW_PENDING[id]; reject(e); return; }
            setTimeout(function () { if (M3U_PREVIEW_PENDING[id]) { delete M3U_PREVIEW_PENDING[id]; reject(new Error('playlist_preview_timeout')); } }, 28000);
        });
    }
    return fetchT(url, 25000, { credentials: 'omit', headers: { 'Accept': 'application/vnd.apple.mpegurl,text/plain,*/*' } }).then(function (r) { return r.text(); });
}
function snapshotCatalogFromList(kind, list) {
    list = Array.isArray(list) ? list : [];
    var byCat = {}, cats = [], catIds = {}, counter = 0;
    for (var i = 0; i < list.length; i++) {
        var item = list[i], name = item.group || (kind === 'movies' ? 'Filmes' : kind === 'series' ? 'Séries' : 'Canais');
        if (!catIds[name]) { counter++; catIds[name] = String(counter); byCat[catIds[name]] = []; cats.push({ category_id: catIds[name], category_name: name, num: 0, adult: isAdultName(name) }); }
        item.category_id = catIds[name]; byCat[catIds[name]].push(item);
    }
    for (var c = 0; c < cats.length; c++) cats[c].num = byCat[cats[c].category_id].length;
    return { cats: cats, byCat: byCat, all: list, partial: true };
}
var M3U_PREVIEW_PROMISE = null;
function catalogFromM3UPreview() {
    if (M3U_PREVIEW_PROMISE) return M3U_PREVIEW_PROMISE;
    if (!S.playlistUrl) return Promise.reject(new Error('playlist_url_missing'));
    M3U_PREVIEW_PROMISE = fetchM3UPreviewText(S.playlistUrl).then(function (text) {
        var raw = kidsFilterList(parseM3UText(text)), buckets = { live: [], movies: [], series: [] };
        for (var i = 0; i < raw.length; i++) {
            var item = raw[i]; item.m3u_kind = classifyM3UItem(item); buckets[item.m3u_kind].push(item);
        }
        // Preview amplo, mas controlado para abrir rápido: a seção completa
        // usa catalogFromM3U() quando o usuário entra nela.
        for (var bk in buckets) if (buckets.hasOwnProperty(bk) && buckets[bk].length > 360) buckets[bk] = buckets[bk].slice(0, 360);
        return { live: snapshotCatalogFromList('live', buckets.live), movies: snapshotCatalogFromList('movies', buckets.movies), series: snapshotCatalogFromList('series', buckets.series) };
    }).catch(function (err) { M3U_PREVIEW_PROMISE = null; throw err; });
    return M3U_PREVIEW_PROMISE;
}
function fetchPlaylistText(url) {
    if (global.HdxNative && typeof global.HdxNative.fetchText === 'function') {
        return new Promise(function (resolve, reject) {
            var id = 'm3u_' + Date.now() + '_' + Math.floor(Math.random() * 100000);
            M3U_PENDING[id] = { resolve: resolve, reject: reject };
            try { global.HdxNative.fetchText(String(url || ''), id); } catch (e) { delete M3U_PENDING[id]; reject(e); return; }
            setTimeout(function () { if (M3U_PENDING[id]) { delete M3U_PENDING[id]; reject(new Error('playlist_timeout')); } }, 25000);
        });
    }
    return fetchT(url, 25000, { credentials: 'omit', headers: { 'Accept': 'application/vnd.apple.mpegurl,text/plain,*/*' } }).then(function (r) { return r.text(); });
}
function parseM3UText(text) {
    var lines = String(text || '').split(/\r?\n/), all = [], cur = null, nextId = 1;
    for (var i = 0; i < lines.length; i++) {
        var line = String(lines[i] || '').replace(/^\uFEFF/, '').trim();
        if (!line) continue;
        if (line.indexOf('#EXTINF:') === 0) {
            var comma = line.indexOf(','), title = comma >= 0 ? line.slice(comma + 1).trim() : 'Canal ' + nextId;
            var group = (line.match(/group-title=["']([^"']*)["']/i) || line.match(/group-title=([^\s,]+)/i) || [,''])[1] || 'Canais';
            var logo = (line.match(/tvg-logo=["']([^"']*)["']/i) || line.match(/tvg-logo=([^\s,]+)/i) || [,''])[1] || '';
            var tvg = (line.match(/tvg-name=["']([^"']*)["']/i) || line.match(/tvg-name=([^\s,]+)/i) || [,''])[1] || '';
            cur = { name: tvg || title || ('Canal ' + nextId), group: group || 'Canais', stream_icon: logo, stream_id: nextId, num: nextId };
            nextId++;
        } else if (line.charAt(0) !== '#' && cur) {
            cur.stream_url = line; all.push(cur); cur = null;
        }
    }
    return all;
}
function parseM3UTextAsync(text) {
    var lines = String(text || '').split(/\r?\n/), all = [], cur = null, nextId = 1, index = 0;
    return new Promise(function (resolve) {
        function step() {
            var end = Math.min(lines.length, index + 420);
            for (; index < end; index++) {
                var line = String(lines[index] || '').replace(/^\uFEFF/, '').trim();
                if (!line) continue;
                if (line.indexOf('#EXTINF:') === 0) {
                    var comma = line.indexOf(','), title = comma >= 0 ? line.slice(comma + 1).trim() : 'Canal ' + nextId;
                    var group = (line.match(/group-title=["']([^"']*)["']/i) || line.match(/group-title=([^\s,]+)/i) || [,''])[1] || 'Canais';
                    var logo = (line.match(/tvg-logo=["']([^"']*)["']/i) || line.match(/tvg-logo=([^\s,]+)/i) || [,''])[1] || '';
                    var tvg = (line.match(/tvg-name=["']([^"']*)["']/i) || line.match(/tvg-name=([^\s,]+)/i) || [,''])[1] || '';
                    cur = { name: tvg || title || ('Canal ' + nextId), group: group || 'Canais', stream_icon: logo, stream_id: nextId, num: nextId };
                    nextId++;
                } else if (line.charAt(0) !== '#' && cur) {
                    cur.stream_url = line; all.push(cur); cur = null;
                }
            }
            if (index < lines.length) setTimeout(step, 0); else resolve(all);
        }
        step();
    });
}
function classifyM3UItem(item) {
    var group = String(item.group || '').trim(), name = String(item.name || '').trim(), url = String(item.stream_url || '');
    var g = group.toLowerCase(), n = name.toLowerCase(), u = url.toLowerCase();
    var groupSeries = /(serie|series|série|séries|novela|novelas|temporada|season|tv show|anime|episod)/i.test(g);
    var groupMovies = /(filme|filmes|movie|movies|cinema|vod|documentário|documentario|desenho|cartoon)/i.test(g);
    // O grupo tem prioridade. Em grupo misto, o padrão é Filme; só vira Série
    // quando a própria entrada traz episódio/temporada ou caminho de série.
    var titleSeries = /(serie|series|série|séries|novela|temporada|season|episod|s\d{1,2}e\d{1,2})/i.test(n);
    if (groupSeries && groupMovies) {
        if (/\/(series|episode|episodios?)\//i.test(u) || titleSeries) return 'series';
        return 'movies';
    }
    if (groupSeries) return 'series';
    if (groupMovies) return 'movies';
    if (/\/(series|episode|episodios?)\//i.test(u)) return 'series';
    if (/\/(movie|movies|vod)\//i.test(u)) return 'movies';
    if (/\/live\//i.test(u)) return 'live';
    if (titleSeries) return 'series';
    if (/(filme|filmes|movie|movies|cinema|vod|documentário|documentario)/i.test(n)) return 'movies';
    return 'live';
}
function m3uFallbackArt(item, kind) {
    var raw = String((item && item.name) || 'Fusion').replace(/[<>&\"]/g, ' ').replace(/\s+/g, ' ').trim();
    var bits = raw.split(' '), initials = '';
    for (var i = 0; i < bits.length && initials.length < 2; i++) if (bits[i]) initials += bits[i].charAt(0).toUpperCase();
    if (!initials) initials = 'UP';
    var label = kind === 'movies' ? 'FILME' : kind === 'series' ? 'SÉRIE' : 'CANAL';
    var tones = kind === 'movies' ? ['#2f2048','#6d3dad'] : kind === 'series' ? ['#123a48','#167f84'] : ['#123726','#18875d'];
    var title = raw.slice(0, 30);
    var svg = '<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 360 540"><defs><linearGradient id="g" x1="0" y1="0" x2="1" y2="1"><stop stop-color="' + tones[0] + '"/><stop offset="1" stop-color="' + tones[1] + '"/></linearGradient></defs><rect width="360" height="540" fill="url(#g)"/><circle cx="292" cy="84" r="118" fill="#ffffff" opacity=".08"/><path d="M0 420L360 260V540H0Z" fill="#000000" opacity=".17"/><text x="28" y="54" fill="#ffffff" opacity=".8" font-family="Arial,sans-serif" font-size="18" font-weight="700" letter-spacing="3">' + label + '</text><text x="180" y="278" text-anchor="middle" fill="#ffffff" font-family="Arial,sans-serif" font-size="112" font-weight="800">' + initials + '</text><text x="180" y="484" text-anchor="middle" fill="#ffffff" opacity=".92" font-family="Arial,sans-serif" font-size="22" font-weight="700">' + title + '</text></svg>';
    return 'data:image/svg+xml;charset=UTF-8,' + encodeURIComponent(svg);
}
function catalogFromM3U() {
    if (S.m3uCatalogPromise) return S.m3uCatalogPromise;
    if (!S.playlistUrl) return Promise.reject(new Error('playlist_url_missing'));
    S.m3uCatalogPromise = fetchPlaylistText(S.playlistUrl).then(parseM3UTextAsync).then(function (raw) {
        var buckets = { live: [], movies: [], series: [] }, index = 0;
        return new Promise(function (resolve) {
            function classifyStep() {
                var end = Math.min(raw.length, index + 420);
                for (; index < end; index++) {
                    var item = raw[index];
                    if (!kidsAllows(item)) continue;
                    item.m3u_kind = classifyM3UItem(item);
                    if (!item.stream_icon) item.stream_icon = m3uFallbackArt(item, item.m3u_kind);
                    buckets[item.m3u_kind].push(item);
                }
                if (index < raw.length) setTimeout(classifyStep, 0); else resolve(buckets);
            }
            classifyStep();
        });
    }).then(function (buckets) {
        var outputs = {}, kinds = ['live', 'movies', 'series'], kindIndex = 0;
        return new Promise(function (resolve) {
            function buildNextKind() {
                if (kindIndex >= kinds.length) {
                    S.cat.live = outputs.live; S.cat.movies = outputs.movies; S.cat.series = outputs.series;
                    resolve(outputs); return;
                }
                var kind = kinds[kindIndex++], byCat = {}, cats = [], catIds = {}, counter = 0, list = buckets[kind] || [], j = 0;
                function buildStep() {
                    var end = Math.min(list.length, j + 420);
                    for (; j < end; j++) {
                        var item = list[j], name = item.group || (kind === 'movies' ? 'Filmes' : kind === 'series' ? 'Séries' : 'Canais');
                        if (!catIds[name]) { counter++; catIds[name] = String(counter); byCat[catIds[name]] = []; cats.push({ category_id: catIds[name], category_name: name, num: 0, adult: isAdultName(name) }); }
                        item.category_id = catIds[name]; byCat[catIds[name]].push(item);
                    }
                    if (j < list.length) { setTimeout(buildStep, 0); return; }
                    for (var c = 0; c < cats.length; c++) cats[c].num = byCat[cats[c].category_id].length;
                    outputs[kind] = { cats: cats, byCat: byCat, all: list };
                    setTimeout(buildNextKind, 0);
                }
                buildStep();
            }
            buildNextKind();
        });
    }).catch(function (err) { S.m3uCatalogPromise = null; throw err; });
    return S.m3uCatalogPromise;
}
// painel /api/r/* (auth por code/user/pass/did) — com timeout + rastreio online/offline.
// Retorna null quando a VPS está fora (o chamador usa cache/fila).
function api(path, qs, timeoutMs) {
    if (S.directAuth || directModeStored()) return Promise.resolve(null);
    var did = global.__DID || S.did || getDid();
    var u = apiBase() + '/api/r/' + path + '?code=' + enc(S.code) + '&user=' + enc(S.user) + '&pass=' + enc(S.pass) + '&did=' + enc(did) + '&plat=' + platform() + (qs || '');
    return fetchT(u, timeoutMs).then(function (r) { return r.json(); })
        .then(function (j) { setOnline(true); return j; })
        .catch(function () { setOnline(false); return null; });
}

/* ============================================================
 * RESILIÊNCIA OFFLINE — se a VPS (painel) cair, o app continua com os
 * dados salvos; re-verifica (vencimento/DNS/licença) quando ela voltar.
 * O catálogo/stream vêm do IPTV (independe da VPS). Só o vídeo precisa de
 * internet (inerente). Foco: nunca derrubar todos os clientes numa queda.
 * ============================================================ */
function lsGet(k) { try { return JSON.parse(localStorage.getItem(profKey(k)) || 'null'); } catch (e) { return null; } }
function lsSet(k, v) { try { localStorage.setItem(profKey(k), JSON.stringify(v)); } catch (e) {} }

/* ---------- TMDB: notas e metadados opcionais ----------
 * A chave chega somente pelo BuildConfig/ponte Android. Nunca é desenhada na UI.
 * O cache é local por perfil e expira em sete dias para não bloquear o catálogo. */
var ZTMDB = { key: null, pending: {}, enabled: null };
function tmdbApiKey() {
    if (ZTMDB.key != null) return ZTMDB.key;
    try { ZTMDB.key = (global.HdxNative && typeof global.HdxNative.getTmdbApiKey === 'function') ? String(global.HdxNative.getTmdbApiKey() || '').trim() : ''; } catch (e) { ZTMDB.key = ''; }
    ZTMDB.enabled = !!ZTMDB.key;
    return ZTMDB.key;
}
function tmdbTextKey(s) { var raw = String(s || '').toLowerCase(); try { if (raw.normalize) raw = raw.normalize('NFD').replace(/[\u0300-\u036f]/g, ''); } catch (e) {} return raw.replace(/\((?:19|20)\d{2}\)/g, '').replace(/[^a-z0-9]+/g, ' ').replace(/^\s+|\s+$/g, ''); }
function tmdbCacheGet(key) { try { var d = lsGet('zx_tmdb_cache') || {}, v = d[key]; return v && v.ts > Date.now() - 604800000 ? v.data : null; } catch (e) { return null; } }
function tmdbCacheSet(key, data) { try { var d = lsGet('zx_tmdb_cache') || {}; d[key] = { ts: Date.now(), data: data }; var ks = Object.keys(d); if (ks.length > 600) { ks.sort(function (a, b) { return (d[a].ts || 0) - (d[b].ts || 0); }); for (var i = 0; i < ks.length - 600; i++) delete d[ks[i]]; } lsSet('zx_tmdb_cache', d); } catch (e) {} }
function tmdbFetch(path, params) {
    var key = tmdbApiKey(); if (!key) return Promise.reject(new Error('TMDB indisponível'));
    var q = [], p = params || {}; for (var k in p) if (p.hasOwnProperty(k) && p[k] != null && p[k] !== '') q.push(encodeURIComponent(k) + '=' + encodeURIComponent(p[k]));
    q.push('api_key=' + encodeURIComponent(key)); q.push('language=pt-BR');
    return fetchT('https://api.themoviedb.org/3' + path + '?' + q.join('&'), 9000).then(function (r) { if (!r || !r.ok) throw new Error('TMDB HTTP ' + (r && r.status)); return r.json(); });
}
function tmdbFind(kind, title, year) {
    var tk = tmdbTextKey(title), ck = (kind === 'series' ? 'tv:' : 'movie:') + tk + ':' + (year || ''); if (!tk) return Promise.resolve(null);
    var cached = tmdbCacheGet(ck); if (cached && Array.isArray(cached.genre_ids)) return Promise.resolve(cached); if (ZTMDB.pending[ck]) return ZTMDB.pending[ck];
    var path = kind === 'series' ? '/search/tv' : '/search/movie';
    ZTMDB.pending[ck] = tmdbFetch(path, { query: title, include_adult: 'false', page: 1 }).then(function (j) {
        var arr = (j && j.results) || [], best = null, bestDelta = 9999;
        for (var i = 0; i < arr.length; i++) { var x = arr[i] || {}, date = x.release_date || x.first_air_date || '', y = parseInt(String(date).slice(0, 4), 10) || 0, delta = year && y ? Math.abs(y - year) : i; if (!best || delta < bestDelta) { best = x; bestDelta = delta; } }
        if (!best) return null;
        var out = { id: best.id || 0, title: best.title || best.name || title, vote_average: Number(best.vote_average || 0), vote_count: Number(best.vote_count || 0), popularity: Number(best.popularity || 0), date: best.release_date || best.first_air_date || '', poster_path: best.poster_path || '', genre_ids: Array.isArray(best.genre_ids) ? best.genre_ids : [] };
        tmdbCacheSet(ck, out); return out;
    }).catch(function () { return null; }).then(function (v) { delete ZTMDB.pending[ck]; return v; });
    return ZTMDB.pending[ck];
}
function tmdbCatalogMap(kind) { var cat = S.cat[kind]; if (!cat) return {}; if (!cat.tmdbMap) cat.tmdbMap = {}; return cat.tmdbMap; }
function tmdbRatingFor(kind, item) { var name = item && (item.name || item.title) || '', key = tmdbTextKey(name), m = tmdbCatalogMap(kind)[key]; return m || null; }
function tmdbYearFromItem(item) { var s = String(item && (item.name || item.title) || ''), m = s.match(/\b((?:19|20)\d{2})\b/); return m ? parseInt(m[1], 10) : 0; }
function tmdbEnrichCatalog(kind, items, limit) {
    if (!tmdbApiKey() || !items || !items.length) return Promise.resolve([]);
    var list = items.slice(0, limit || 40), map = tmdbCatalogMap(kind), jobs = [];
    for (var i = 0; i < list.length; i++) (function (it) { var title = it && (it.name || it.title) || ''; var k = tmdbTextKey(title); if (!k || map[k]) return; jobs.push(tmdbFind(kind, title.replace(/\s*\((?:19|20)\d{2}\)\s*$/, ''), tmdbYearFromItem(it)).then(function (v) { if (v) map[k] = v; })); })(list[i]);
    return Promise.all(jobs).then(function () { return list; });
}
function tmdbRatingLabel(r) { return r && r.vote_average > 0 ? 'TMDB ' + r.vote_average.toFixed(1) : ''; }

/* ---- conteúdo assistido em tempo real + falha real do player ---- */
var ZXWATCH = { title: '', mac: '', timer: null, failBusy: false };
function stopContentHeartbeat() {
    try { if (ZXWATCH.timer) clearInterval(ZXWATCH.timer); } catch (e) {}
    ZXWATCH.timer = null; ZXWATCH.title = ''; ZXWATCH.mac = '';
}
function heartbeatContent(title, force) {
    title = String(title || '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');
    if (!title || title.toLowerCase() === 'undefined' || title.toLowerCase() === 'null') return;
    var mac = getAppMac(); if (!mac) return;
    var same = ZXWATCH.title === title && ZXWATCH.mac === mac;
    ZXWATCH.title = title; ZXWATCH.mac = mac;
    if (!force && same) return;
    var url = DIRECT_PANEL_BASE + '/heartbeat?mac=' + enc(mac) + '&current_content=' + enc(title);
    fetchT(url, 8000, { cache: 'no-store', credentials: 'omit', headers: { 'Accept': 'application/json', 'Cache-Control': 'no-cache' } }).catch(function () {});
    if (!ZXWATCH.timer) ZXWATCH.timer = setInterval(function () { if (ZXWATCH.title) heartbeatContent(ZXWATCH.title, true); }, 60000);
}
function playbackActiveListNumber() {
    try { return (parseInt(S.listIndex || activeListIndex(), 10) || 0) + 1; } catch (e) { return 1; }
}
function refreshAfterPanelListSwitch(message) {
    if (message) showListSyncToast(message);
    // O player nativo fica por cima do WebView. Recalcula a URL usando a lista
    // escolhida pelo painel e reentrega o mesmo contexto ao ExoPlayer.
    if (S.nativePlaying) {
        try {
            var np = S.nativePlaying, route = np.zxKind === 'series' ? 'series' : (np.zxKind === 'live' ? 'live' : 'movie'), ext = np.ext || S.playExt || 'mp4';
            np.url = streamUrl(route, np.zxId, route === 'live' ? '' : ext);
            playViaNative(np);
        } catch (e) {}
        return;
    }
    try {
        var p = (history.state && history.state.p) || '';
        if (p === '/live' || p === '/home' || p.indexOf('/movies') === 0 || p.indexOf('/series') === 0) go(p, true);
    } catch (e) {}
}
function applyPlaybackFailover(d, mac) {
    if (!d || d.switch_applied !== true) return Promise.resolve(false);
    var transition = String(d.failover_transition_id || d.transition_id || '');
    if (transition && transition === failoverLastTransition(mac)) return Promise.resolve(false);
    return fetchDirectListsForFailover().then(function (lists) {
        var pick = chooseFailoverList(lists, d);
        if (pick < 0) return false;
        var changed = switchDirectListBackground(pick);
        if (transition) failoverSaveTransition(mac, transition);
        refreshAfterPanelListSwitch(String(d.playlist_sync_message || d.message || ''));
        return changed;
    });
}
function reportPlaybackFailure(kind, title) {
    if (ZXWATCH.failBusy) return;
    var mac = getAppMac(); if (!mac) return;
    ZXWATCH.failBusy = true;
    var body = JSON.stringify({ mac: mac, active_list_number: playbackActiveListNumber() });
    fetchT(DIRECT_PANEL_BASE + '/playback-failure', 9000, { method: 'POST', credentials: 'omit', headers: { 'Content-Type': 'application/json', 'Accept': 'application/json' }, body: body })
        .then(function (r) { if (!r.ok) throw new Error('playback_failure_' + r.status); return r.json(); })
        .then(function (d) { return applyPlaybackFailover(d, mac); })
        .catch(function () {})
        .then(function () { ZXWATCH.failBusy = false; });
}
global.__zxNativePlaybackFailure = function (kind, title) { reportPlaybackFailure(kind, title); };
global.__zxNativePlaybackStarted = function (title) { heartbeatContent(title, true); };

function setOnline(on) {

    if (S.online === on) return;
    S.online = on;
    try { applyOfflineHint(); } catch (e) {}   // mostra/esconde (só vale na home)
    if (on) { try { flushQueue(); } catch (e) {} }
}
// Aviso de offline: aparece SÓ na tela inicial (home). Em conteúdo (filmes/
// séries/canais/detalhe/player) ele atrapalhava por cima da grade. É um <div>
// no body (persiste entre renders) → reavaliado no render() e no setOnline().
function applyOfflineHint() {
    var show = (S.online === false) && (S.onHome === true);
    var el = $('zx-offline');
    if (!show) { if (el) el.style.display = 'none'; return; }
    if (!el) {
        el = document.createElement('div'); el.id = 'zx-offline';
        el.style.cssText = 'position:fixed;left:14px;bottom:14px;z-index:99998;background:rgba(12,16,14,.96);border:1px solid #c9542e;color:#ffd9cc;font:13px "Segoe UI",sans-serif;padding:8px 14px;border-radius:10px;box-shadow:0 6px 20px rgba(0,0,0,.5)';
        el.innerHTML = te('⚠ Sem conexão com o painel — usando dados salvos');
        if (document.body) document.body.appendChild(el);
    }
        el.style.display = 'block';
}

/* ---- notificações de listas por MAC (somente Fusion) ---- */
function listNotificationSeenKey(id) { return 'zx_list_notification_seen_' + String(id || ''); }
function listNotificationWasSeen(id) { try { return localStorage.getItem(listNotificationSeenKey(id)) === '1'; } catch (e) { return false; } }
function listNotificationMarkSeen(id) { try { localStorage.setItem(listNotificationSeenKey(id), '1'); } catch (e) {} }
function expirationModalSeenKey(key) { return 'zx_expiration_modal_' + String(key || ''); }
function expirationModalWasSeen(key) { try { return localStorage.getItem(expirationModalSeenKey(key)) === '1'; } catch (e) { return false; } }
function expirationModalMarkSeen(key) { try { localStorage.setItem(expirationModalSeenKey(key), '1'); } catch (e) {} }
function applyExpirationState(expiration) {
    if (!expiration || typeof expiration !== 'object') return;
    try {
        S.info = S.info || {}; S.info.license = S.info.license || {};
        var hasDate = Object.prototype.hasOwnProperty.call(expiration, 'expiration_date') || Object.prototype.hasOwnProperty.call(expiration, 'expiration_display');
        var raw = expiration.expiration_date || expiration.expiration_display || '';
        var ts = expiryTimestamp(raw);
        if (hasDate) {
            if (ts) S.info.license.exp_date = ts; else delete S.info.license.exp_date;
            S.info.license.exp_display = expiration.expiration_display ? String(expiration.expiration_display) : '';
        }
    } catch (e) {}
}
function showExpirationModal(expiration) {
    if (!expiration || expiration.show_modal !== true || $('zx-expiration-modal')) return;
    var key = String(expiration.modal_key || expiration.expiration_date || expiration.expiration_state || '');
    if (!key || expirationModalWasSeen(key)) return;
    expirationModalMarkSeen(key);
    var title = esc(expiration.modal_title || 'Aviso de vencimento');
    var message = esc(expiration.modal_message || 'Seu acesso está próximo do vencimento.');
    var ov = document.createElement('div'); ov.id = 'zx-expiration-modal';
    ov.style.cssText = 'position:fixed;inset:0;z-index:100002;display:flex;align-items:center;justify-content:center;padding:24px;background:rgba(0,0,0,.52);font-family:system-ui,-apple-system,Segoe UI,sans-serif;';
    ov.innerHTML = '<div role="alertdialog" aria-modal="true" style="width:min(680px,94vw);background:rgba(9,20,15,.98);border:2px solid #f59e0b;border-radius:18px;padding:26px;color:#f8fff9;box-shadow:0 18px 70px rgba(0,0,0,.65);box-sizing:border-box;text-align:left;">'
        + '<div style="font-size:30px;line-height:1;margin-bottom:14px;color:#fbbf24">⏳</div>'
        + '<div style="font-size:22px;font-weight:800;margin-bottom:10px;">' + title + '</div>'
        + '<div style="font-size:17px;line-height:1.5;color:#d4e1d9;white-space:pre-wrap;">' + message + '</div>'
        + '<div style="text-align:right;margin-top:24px;"><button id="zx-expiration-ok" autofocus type="button" style="min-width:140px;padding:12px 20px;border:0;border-radius:10px;background:#f59e0b;color:#1b1203;font-size:16px;font-weight:800;">OK</button></div></div>';
    document.body.appendChild(ov);
    try { document.body.classList.add('tv-modal-open'); } catch (e) {}
    var ok = $('zx-expiration-ok'); if (ok) ok.addEventListener('click', function () { try { if (ov.parentNode) ov.parentNode.removeChild(ov); } catch (e) {} try { document.body.classList.remove('tv-modal-open'); } catch (e2) {} });
    try { if (ok) ok.focus(); } catch (e3) {}
}
function processExpirationState(expiration) { applyExpirationState(expiration); showExpirationModal(expiration); }
function listNotificationAck(mac, id) {
    if (!mac || !id) return;
    var body = JSON.stringify({ mac: mac, alert_id: Number(id) || id });
    fetchT(apiBase() + '/api/v5/list-notifications/ack', 8000, {
        method: 'POST', credentials: 'omit',
        headers: { 'Content-Type': 'application/json', 'Accept': 'application/json' },
        body: body
    }).catch(function () {});
}
function closeListNotification(ov) {
    try { if (ov && ov.parentNode) ov.parentNode.removeChild(ov); } catch (e) {}
    try { document.body.classList.remove('tv-modal-open'); } catch (e2) {}
}
function showListNotification(n, mac) {
    if (!n || !n.id || $('zx-list-notification')) return;
    var key = listNotificationSeenKey(n.id);
    if (listNotificationWasSeen(n.id)) return;
    listNotificationMarkSeen(n.id);
    var ov = document.createElement('div'); ov.id = 'zx-list-notification';
    ov.style.cssText = 'position:fixed;inset:0;z-index:100000;display:flex;align-items:center;justify-content:center;padding:24px;background:rgba(0,0,0,.52);font-family:system-ui,-apple-system,Segoe UI,sans-serif;';
    var title = esc(n.title || 'Aviso da lista');
    var message = esc(n.message || 'Foi confirmado um problema técnico na lista.');
    ov.innerHTML = '<div role="alertdialog" aria-modal="true" style="width:min(680px,94vw);max-height:82vh;overflow:auto;background:rgba(9,20,15,.98);border:2px solid #f59e0b;border-radius:18px;padding:26px;color:#f8fff9;box-shadow:0 18px 70px rgba(0,0,0,.65);box-sizing:border-box;text-align:left;">'
        + '<div style="font-size:30px;line-height:1;margin-bottom:14px;color:#fbbf24">⚠</div>'
        + '<div style="font-size:22px;font-weight:800;margin-bottom:10px;">' + title + '</div>'
        + '<div style="font-size:17px;line-height:1.5;color:#d4e1d9;white-space:pre-wrap;">' + message + '</div>'
        + '<div style="text-align:right;margin-top:24px;"><button id="zx-list-notification-ok" autofocus type="button" style="min-width:140px;padding:12px 20px;border:0;border-radius:10px;background:#f59e0b;color:#1b1203;font-size:16px;font-weight:800;">OK</button></div></div>';
    document.body.appendChild(ov);
    try { document.body.classList.add('tv-modal-open'); } catch (e) {}
    var ok = $('zx-list-notification-ok');
    if (ok) ok.addEventListener('click', function () { closeListNotification(ov); listNotificationAck(mac, n.id); });
    try { if (ok) ok.focus(); } catch (e2) {}
}
function checkListNotifications() {
    if (S.listNotificationBusy) return;
    var mac = getAppMac(); if (!mac) return;
    S.listNotificationBusy = true;
    var url = apiBase() + '/api/v5/list-notifications?mac=' + enc(mac);
    fetchT(url, 9000, { cache: 'no-store', credentials: 'omit', headers: { 'Accept': 'application/json', 'Cache-Control': 'no-cache', 'Pragma': 'no-cache' } })
        .then(function (r) { if (!r.ok) throw new Error('list_notifications_' + r.status); return r.json(); })
        .then(function (d) {
            processExpirationState(d && d.expiration);
            return processFailoverState(d, mac).then(function () {
                var list = d && Array.isArray(d.notifications) ? d.notifications.slice() : [];
                list.sort(function (a, b) { return String(b.created_at || '').localeCompare(String(a.created_at || '')); });
                for (var i = 0; i < list.length; i++) {
                    var n = list[i];
                    if (n && n.status === 'failure' && n.acknowledged !== true && !listNotificationWasSeen(n.id)) { showListNotification(n, mac); break; }
                }
            });
        })
        .catch(function () {})
        .then(function () { S.listNotificationBusy = false; });
}
function startListNotificationWatcher() {
    if (S.listNotificationTimer) return;
    try { setTimeout(checkListNotifications, 900); } catch (e) { checkListNotifications(); }
    try { S.listNotificationTimer = setInterval(checkListNotifications, 60000); } catch (e) {}
}

/* ---- snapshot do resolve (dns/licença/branding/aviso) ---- */
function saveSnap(d) { lsSet('zx_snap', { ts: Date.now(), code: S.code, user: S.user, d: d }); }
function loadSnap() {
    var s = lsGet('zx_snap');
    if (s && s.code === S.code && s.user === S.user && s.d) return s;
    return null;
}
function snapAgeDays(s) { try { return (Date.now() - (s.ts || 0)) / 86400000; } catch (e) { return 1e9; } }
// Quanto tempo o snapshot pode abrir o app SEM re-verificar na VPS:
// • Aparelho GRÁTIS (DNS cadastrado/server_code) NUNCA expira no lado Fusion →
//   numa queda longa do painel ele continua abrindo por ~anos (não derruba os
//   10 mil de uma operadora). A licença real é a do IPTV, que é checada no play.
// • Aparelho PAGO (URL avulsa) re-verifica em 30 dias, pra valer a cobrança.
function snapMaxDays(s) { try { if (s && s.d && s.d.license && s.d.license.free) return 3650; } catch (e) {} return 30; }

/* ---- favoritos: persistência + reconciliação ao reconectar ---- */
function persistFav() { lsSet('zx_fav', S.fav); lsSet('zx_favdirty', S.favDirty); lsSet('zx_favmeta', S.favMeta); }
function loadFav() {
    var f = lsGet('zx_fav'); if (f) { S.fav = f; S.fav.live = S.fav.live || []; S.fav.movie = S.fav.movie || []; S.fav.series = S.fav.series || []; }
    var d = lsGet('zx_favdirty'); if (d) S.favDirty = d;
    var m = lsGet('zx_favmeta'); if (m) S.favMeta = m;
}
function markFavDirty(k, id) { id = +id; if (S.favDirty[k].indexOf(id) < 0) S.favDirty[k].push(id); }
// Aplica o DESEJADO local em cima do que o servidor diz (ao reconectar). Empurra só
// o que MUDOU offline (dirty) → idempotente, sobrevive a timeout falso-negativo e
// respeita mudanças feitas em OUTRO aparelho (adota o servidor no que não é dirty).
function reconcileFav(serverFav) {
    serverFav = serverFav || { live: [], movie: [], series: [] };
    ['live', 'movie', 'series'].forEach(function (k) {
        var sv = (serverFav[k] || []).map(Number);
        var dirty = (S.favDirty[k] || []).map(Number);
        dirty.forEach(function (id) {
            var desired = inArr(S.fav[k], id), serverHas = sv.indexOf(id) >= 0;
            if (desired !== serverHas) {
                var m = S.favMeta[k + ':' + id] || {};
                api('fav/toggle', '&kind=' + enc(k) + '&id=' + enc(id) + '&name=' + enc(m.name || '') + '&poster=' + enc(m.poster || ''));
            }
        });
        var merged = sv.filter(function (id) { return dirty.indexOf(id) < 0; });
        dirty.forEach(function (id) { if (inArr(S.fav[k], id) && merged.indexOf(id) < 0) merged.push(id); });
        S.fav[k] = merged;
    });
    S.favDirty = { live: [], movie: [], series: [] };
    persistFav();
}
// Favoritar — 100% LOCAL (modelo HDX): vive no aparelho, NÃO vai pro painel.
// Evita conflito de versões e funciona offline. id + nome/capa em localStorage.
function favToggle(kind, id, name, poster) {
    var k = kind === 'live' ? 'live' : kind === 'series' ? 'series' : 'movie';
    id = parseInt(id, 10);
    var on = !inArr(S.fav[k], id);
    if (on) S.fav[k].push(id); else S.fav[k] = S.fav[k].filter(function (x) { return +x !== id; });
    S.favMeta[k + ':' + id] = { name: name || '', poster: poster || '' };
    persistFav();
    return on;
}
// Lista de favoritos LOCAL pra montar a tela (mais novo primeiro).
function localFavList(k) {
    var ids = S.fav[k] || [], out = [];
    for (var i = ids.length - 1; i >= 0; i--) { var id = ids[i], m = S.favMeta[k + ':' + id] || {}; out.push({ id: id, name: m.name || '', poster: m.poster || '', logo: m.poster || '' }); }
    return out;
}

/* ---- fila de escrita (progresso/recentes) p/ enviar ao reconectar ---- */
function enqueue(op) { var q = lsGet('zx_pending') || []; q.push(op); if (q.length > 800) q = q.slice(-800); lsSet('zx_pending', q); }
function flushQueue() {
    var q = lsGet('zx_pending') || []; if (!q.length) return;
    // dedupe progresso por item (mantém o último)
    var seen = {}, out = [];
    for (var i = q.length - 1; i >= 0; i--) {
        var o = q[i], key = o.t === 'prog' ? ('prog:' + o.kind + ':' + o.id) : null;
        if (key) { if (seen[key]) continue; seen[key] = 1; }
        out.unshift(o);
    }
    lsSet('zx_pending', []);
    out.forEach(function (o) {
        if (o.t === 'prog') api('progress/save', '&kind=' + enc(o.kind) + '&id=' + enc(o.id) + '&pos=' + enc(o.pos) + '&dur=' + enc(o.dur) + '&name=' + enc(o.name || '') + '&poster=' + enc(o.poster || ''));
        else if (o.t === 'recent') api('recent/track', '&id=' + enc(o.id) + '&name=' + enc(o.name || '') + '&logo=' + enc(o.logo || '') + '&adult=' + enc(o.adult || 0));
    });
}

/* ---- leituras com cache (fav/list, continue/list, recent/live) ---- */
function apiCached(path, qs, key) {
    return api(path, qs).then(function (d) {
        if (d && d.ok) { lsSet(key, d); return d; }
        return lsGet(key);   // VPS fora → último conhecido
    });
}

/* ---- "Continue Assistindo" + progresso — 100% LOCAL (modelo HDX) ----
 * Tudo vive no aparelho (localStorage), NADA vai pro painel. Evita conflito de
 * versões e funciona offline. Série usa o SERIES_id (não o episódio). */
/* Conteúdo ADULTO? Checa o nome (xxx/+18/adult/porn) e, se o catálogo já estiver
   em cache, a CATEGORIA do item (flag adult vinda do isAdultName da categoria).
   Usado pra NUNCA expor capa adulta na tela inicial (Assistido Recentemente). */
function isAdultContent(kind, id, name) {
    if (isAdultName(name)) return true;
    try {
        kind = (kind === 'series') ? 'series' : 'movies';
        var c = S.cat && S.cat[kind]; if (!c || !c.all) return false;
        id = parseInt(id, 10);
        for (var i = 0; i < c.all.length; i++) {
            var s = c.all[i];
            var sid = parseInt((kind === 'series' ? (s.series_id || s.stream_id) : s.stream_id) || 0, 10);
            if (sid === id) {
                var cid = String(s.category_id || '');
                for (var j = 0; j < c.cats.length; j++) { if (c.cats[j].category_id === cid) return !!c.cats[j].adult; }
                return false;
            }
        }
    } catch (e) {}
    return false;
}
function profKidsActive() { try { return !!(profActive() && profActive().kids); } catch (e) { return false; } }
function kidsAllows(item) {
    if (!profKidsActive()) return true;
    item = item || {};
    var text = [item.name, item.group, item.group_title, item.category_name, item.title].join(' ');
    return !isAdultName(text);
}
function kidsFilterList(list) {
    if (!profKidsActive() || !Array.isArray(list)) return list || [];
    var out = [];
    for (var i = 0; i < list.length; i++) if (kidsAllows(list[i])) out.push(list[i]);
    return out;
}
function bumpContinue(sec, id, name, poster, remove) {
    sec = (sec === 'series') ? 'series' : 'vod';
    id = parseInt(id, 10); if (!id) return;
    var listKey = 'zx_cont_' + sec, d = lsGet(listKey) || { ok: true, items: [] };
    if (!d.items) d.items = [];
    d.items = d.items.filter(function (it) { return parseInt(it.id, 10) !== id; });
    if (!remove) d.items.unshift({ id: id, name: name || '', poster: poster || '', ts: Date.now(), adult: isAdultContent(sec === 'series' ? 'series' : 'movies', id, name) ? 1 : 0 });
    if (d.items.length > 60) d.items = d.items.slice(0, 60);
    lsSet(listKey, d);
}
function continueList(sec) {
    sec = (sec === 'series') ? 'series' : 'vod';
    var d = lsGet('zx_cont_' + sec) || { ok: true, items: [] };
    return Promise.resolve({ ok: true, items: d.items || [] });
}
// Minha Fila — armazenamento local por perfil. Não envia conteúdo ao painel.
function queueList() {
    var d = lsGet('zx_queue') || { ok: true, items: [] }, src = Array.isArray(d.items) ? d.items : [], out = [];
    for (var i = 0; i < src.length; i++) {
        var it = src[i] || {}, kind = it.kind === 'series' ? 'series' : (it.kind === 'live' ? 'live' : 'movies');
        if (profKidsActive() && (it.adult || isAdultContent(kind === 'movies' ? 'movies' : kind, it.id, it.name))) continue;
        out.push({ kind: kind, id: String(it.id || ''), name: it.name || '', poster: it.poster || it.logo || '', logo: it.logo || '', ts: it.ts || 0 });
    }
    out.sort(function (a, b) { return (b.ts || 0) - (a.ts || 0); });
    return out;
}
function queueHas(kind, id) { var q = queueList(); for (var i = 0; i < q.length; i++) if (q[i].kind === kind && String(q[i].id) === String(id)) return true; return false; }
function queueToggle(kind, id, name, poster, force) {
    kind = kind === 'series' ? 'series' : (kind === 'live' ? 'live' : 'movies'); id = String(id || ''); if (!id) return false;
    var d = lsGet('zx_queue') || { ok: true, items: [] }, items = Array.isArray(d.items) ? d.items : [], idx = -1;
    for (var i = 0; i < items.length; i++) if (items[i] && items[i].kind === kind && String(items[i].id) === id) { idx = i; break; }
    var remove = force === false || (force == null && idx >= 0);
    if (remove) { if (idx >= 0) items.splice(idx, 1); }
    else { if (idx >= 0) items.splice(idx, 1); items.unshift({ kind: kind, id: id, name: name || '', poster: poster || '', ts: Date.now(), adult: isAdultContent(kind === 'movies' ? 'movies' : kind, id, name) ? 1 : 0 }); }
    if (items.length > 80) items = items.slice(0, 80);
    lsSet('zx_queue', { ok: true, items: items });
    return !remove;
}
function queueCurrentAction(remove) {
    var p = S.nativePlaying, kind = '', id = '', name = '', poster = '';
    if (p && p.zxId) { kind = p.zxKind === 'series' ? 'series' : (p.zxKind === 'live' ? 'live' : 'movies'); id = p.zxKind === 'series' ? (p.seriesId || p.zxId) : p.zxId; name = p.name || p.title || ''; poster = p.poster || ''; }
    var btn = $('btn-favorite');
    if (!id && btn) { kind = btn.getAttribute('data-kind') === 'series' ? 'series' : (btn.getAttribute('data-kind') === 'movie' ? 'movies' : 'live'); id = btn.getAttribute('data-id') || ''; name = btn.getAttribute('data-name') || ''; poster = btn.getAttribute('data-poster') || ''; }
    if (!id) return false;
    queueToggle(kind, id, name, poster, remove ? false : true);
    return true;
}
function clearQueue() { lsSet('zx_queue', { ok: true, items: [] }); }
function showQueueClearConfirm() {
    var old = $('zxQueueClearConfirm'); if (old && old.parentNode) old.parentNode.removeChild(old);
    var ov = document.createElement('div'); ov.id = 'zxQueueClearConfirm';
    ov.style.cssText = 'position:fixed;inset:0;z-index:120;background:rgba(0,0,0,.72);display:flex;align-items:center;justify-content:center;padding:20px;';
    ov.innerHTML = '<div style="width:min(92vw,460px);padding:24px;border:1px solid rgba(16,185,129,.7);border-radius:18px;background:#07130f;color:#fff;box-shadow:0 16px 50px rgba(0,0,0,.6);text-align:center"><h2 style="margin:0 0 10px">Limpar Minha Fila?</h2><p style="margin:0 0 20px;color:#b9c9c1">Todos os conteúdos salvos serão removidos deste perfil.</p><div style="display:flex;gap:10px;justify-content:center;flex-wrap:wrap"><button type="button" class="btn-tv" id="zxQueueCancel" autofocus>Cancelar</button><button type="button" class="btn-tv is-primary" id="zxQueueConfirm">Limpar fila</button></div></div>';
    document.body.appendChild(ov);
    var close = function () { if (ov.parentNode) ov.parentNode.removeChild(ov); };
    var cancel = $('zxQueueCancel'), confirm = $('zxQueueConfirm');
    if (cancel) cancel.addEventListener('click', close);
    if (confirm) confirm.addEventListener('click', function () { clearQueue(); close(); if ((history.state && history.state.p) === '/queue') renderQueueHome(); else assistantToast('Minha Fila foi limpa'); });
}
function queueTile(it) {
    var obj = { id: it.id, name: it.name, poster: it.poster, logo: it.logo };
    return favTile(obj, it.kind);
}
// Progresso (posição) LOCAL — pra retomar de onde parou (resume).
function saveProgress(kind, id, pos, dur, name, poster) {
    try { lsSet('zx_prog:' + kind + ':' + parseInt(id, 10), { pos: pos, dur: dur, ts: Date.now() }); } catch (e) {}
}
function getProgress(kind, id) { return lsGet('zx_prog:' + kind + ':' + parseInt(id, 10)) || null; }
// Canais recentes — LOCAL (no aparelho). Não guarda adulto no histórico.
function trackRecent(id, name, logo, adult) {
    if (+adult) return;
    id = parseInt(id, 10); if (!id) return;
    var key = 'zx_recent_live', d = lsGet(key) || { ok: true, items: [] };
    if (!d.items) d.items = [];
    d.items = d.items.filter(function (it) { return parseInt(it.id, 10) !== id; });
    d.items.unshift({ id: id, name: name || '', logo: logo || '', ts: Date.now() });
    if (d.items.length > 40) d.items = d.items.slice(0, 40);
    lsSet(key, d);
}
function recentLiveList() { var d = lsGet('zx_recent_live') || { items: [] }; return d.items || []; }
// info de detalhe com 1 retry — o IPTV às vezes responde vazio/lento e o
// detalhe (capa/temporadas/episódios) vinha em branco. 2ª tentativa resolve.
function xtInfo(action, extra) {
    return xt(action, extra).then(function (d) {
        if (d && (d.info || d.movie_data || d.episodes)) return d;
        return xt(action, extra);
    });
}
// Série: o get_series_info às vezes volta SEM episódios (IPTV lento) → o detalhe
// abria vazio (sem episódios/botão). Re-tenta até vir com episódios.
function xtSeriesInfo(id, tries) {
    tries = tries || 0;
    return xt('get_series_info', '&series_id=' + enc(id)).then(function (d) {
        var eps = (d && d.episodes) || {}, has = false;
        for (var z in eps) if (eps.hasOwnProperty(z)) { has = true; break; }
        if (!has && tries < 2) return xtSeriesInfo(id, tries + 1);
        return d;
    });
}
function streamUrl(kind, id, ext) {
    if ((S.playlistType || '').indexOf('m3u') === 0 && (!S.xtreamDerived || S.xtreamUnavailable)) {
        var bucket = kind === 'live' ? 'live' : kind === 'movie' ? 'movies' : 'series';
        var m3u = (S.cat[bucket] && S.cat[bucket].all) || [];
        for (var mi = 0; mi < m3u.length; mi++) if (String(m3u[mi].stream_id) === String(id) || String(m3u[mi].series_id || '') === String(id)) {
            var directLive = m3u[mi].stream_url || '';
            if (kind === 'live' && getFormFactor() === 'tv' && /\.(m3u8|m3u)(\?.*)?$/i.test(directLive)) directLive = directLive.replace(/\.(m3u8|m3u)(\?.*)?$/i, '.ts$2');
            return directLive;
        }
    }
    var c = xtreamCreds(), u = enc(c.user), p = enc(c.pass), base = c.server || S.server;
    if (kind === 'live') {
        // Algumas TV Box exibem HLS preto mesmo quando a mesma conta funciona
        // no celular. O endpoint Xtream aceita MPEG-TS como primeira tentativa
        // na TV Box; no Celular preservamos HLS.
        var liveExt = getFormFactor() === 'tv' ? '.ts' : '.m3u8';
        return base + '/live/' + u + '/' + p + '/' + id + liveExt;
    }
    if (kind === 'movie') return base + '/movie/' + u + '/' + p + '/' + id + '.' + (ext || 'mp4');
    return base + '/series/' + u + '/' + p + '/' + id + '.' + (ext || 'mp4');
}

/* ---------- branding (logo/nome/cor/fundo) ---------- */
function brandLogoHtml() {
    var fallback = 'assets/branding/fusion_launcher.png';
    var mark = '<img src="' + fallback + '" alt="Fusion" class="brand-mark" draggable="false">';
    return '<div class="brand-lockup">' + mark + '</div>';
}
function homeRemoteIconHtml(key, fallbackHtml) {
    try {
        var b = S.branding || {}, icons = b.icons || {}, u = icons[key] || '';
        if (u) return '<span class="home-remote-icon-wrap"><img class="home-remote-icon" src="' + attr(u) + '" alt="" draggable="false" onerror="this.style.display=\'none\';this.nextElementSibling.style.display=\'block\'"><span class="home-remote-fallback" style="display:none">' + fallbackHtml + '</span></span>';
    } catch (e) {}
    return fallbackHtml;
}
function homeRemoteBannerHtml() {
    // A imagem enviada pelo painel é exclusivamente o fundo global. Não a
    // renderize novamente como banner dentro da home, pois isso duplicava a
    // mesma arte atrás e dentro dos cartões principais.
    var b = S.branding || {}, title = b.message_title || b.impact_phrase || '', text = b.message_text || '';
    if (!title && !text) return '';
    return '<div class="zx-remote-banner zx-remote-text-only"><div class="zx-remote-banner-copy" style="position:relative;left:auto;bottom:auto;max-width:100%;width:100%;">' + (title ? '<b>' + esc(title) + '</b>' : '') + (text ? '<span>' + esc(text) + '</span>' : '') + '</div></div>';
}
var APP_THEMES = [
    { id: 'verde', name: 'Verde esmeralda', accent: '#10b981', bg: '#06130f', panel: '#0d241a', text: '#f4fff9', muted: '#9db0a7' },
    { id: 'branco', name: 'Branco', accent: '#ffffff', bg: '#f4f7fb', panel: '#ffffff', text: '#0f172a', muted: '#475569' },
    { id: 'preto', name: 'Preto', accent: '#e5e7eb', bg: '#050505', panel: '#151515', text: '#ffffff', muted: '#a3a3a3' },
    { id: 'amarelo', name: 'Amarelo', accent: '#f59e0b', bg: '#171005', panel: '#2a1b07', text: '#fff8e7', muted: '#d4b77a' },
    { id: 'musgo', name: 'Verde-musgo', accent: '#8fa94b', bg: '#10170b', panel: '#1c2911', text: '#f4f8e9', muted: '#aebc8a' },
    { id: 'azul', name: 'Azul oceano', accent: '#22d3ee', bg: '#06131d', panel: '#0d2230', text: '#effcff', muted: '#93b9c4' },
    { id: 'lilas', name: 'Lilás', accent: '#a78bfa', bg: '#120d1e', panel: '#241941', text: '#fbf8ff', muted: '#b9abd4' },
    { id: 'vermelho', name: 'Vermelho', accent: '#f43f5e', bg: '#1b080d', panel: '#35111a', text: '#fff5f6', muted: '#d4a2ac' },
    { id: 'rosa', name: 'Rosa', accent: '#ec4899', bg: '#1b0b16', panel: '#35132b', text: '#fff6fc', muted: '#d4a9c2' },
    { id: 'cinza', name: 'Cinza grafite', accent: '#94a3b8', bg: '#0f1217', panel: '#202631', text: '#f8fafc', muted: '#a9b4c4' },
    { id: 'turquesa', name: 'Turquesa', accent: '#14b8a6', bg: '#061817', panel: '#0d2b29', text: '#effffc', muted: '#91c9c1' },
    { id: 'dourado', name: 'Dourado', accent: '#fbbf24', bg: '#171105', panel: '#2b2008', text: '#fffbed', muted: '#d8bd79' },
    { id: 'laranja', name: 'Laranja', accent: '#f97316', bg: '#1b0d05', panel: '#34200d', text: '#fff7ed', muted: '#d8aa82' },
    { id: 'roxo', name: 'Roxo real', accent: '#8b5cf6', bg: '#10091d', panel: '#24133f', text: '#faf5ff', muted: '#c4b5d9' },
    { id: 'vinho', name: 'Vinho', accent: '#be123c', bg: '#1a070e', panel: '#35121d', text: '#fff1f2', muted: '#d8a1ad' },
    { id: 'marinho', name: 'Azul-marinho', accent: '#3b82f6', bg: '#060d1c', panel: '#101e3a', text: '#eff6ff', muted: '#9cb6dc' },
    { id: 'menta', name: 'Menta', accent: '#34d399', bg: '#061611', panel: '#103028', text: '#ecfdf5', muted: '#9ed0b9' },
    { id: 'coral', name: 'Coral', accent: '#fb7185', bg: '#1d0b0d', panel: '#3b171b', text: '#fff1f2', muted: '#ddb0b5' },
    { id: 'prata', name: 'Prata', accent: '#cbd5e1', bg: '#11151b', panel: '#29313c', text: '#f8fafc', muted: '#b2bdca' },
    { id: 'creme', name: 'Creme', accent: '#92400e', bg: '#fffaf0', panel: '#fff1d6', text: '#29180b', muted: '#775f48' }
];
function appThemeId() { try { var v = localStorage.getItem('zx_app_theme'); if (v) return v; } catch (e) {} return 'verde'; }
function appTheme() { var id = appThemeId(), i; for (i = 0; i < APP_THEMES.length; i++) if (APP_THEMES[i].id === id) return APP_THEMES[i]; return APP_THEMES[0]; }
function themeRgba(hex, alpha) {
    var h = String(hex || '').replace('#', '');
    if (!/^[0-9a-fA-F]{6}$/.test(h)) return 'rgba(16,185,129,' + alpha + ')';
    return 'rgba(' + parseInt(h.substr(0, 2), 16) + ',' + parseInt(h.substr(2, 2), 16) + ',' + parseInt(h.substr(4, 2), 16) + ',' + alpha + ')';
}
function appThemeCss(th) {
    var ta = themeRgba(th.accent, 0.22), tb = themeRgba(th.accent, 0.30), tc = themeRgba(th.accent, 0.58), td = themeRgba(th.accent, 0.72);
    return ':root{--zx-accent:' + th.accent + ';--zx-bg:' + th.bg + ';--zx-panel:' + th.panel + ';--zx-text:' + th.text + ';--zx-muted:' + th.muted + ';}'
        + "html,body,#app-root{background-color:" + th.bg + ";color:" + th.text + ";background-image:url('assets/branding/fusion_background.png');background-position:center center;background-repeat:no-repeat;background-size:cover;background-attachment:fixed;}"
        + 'body{--zx-accent:' + th.accent + ';--zx-bg:' + th.bg + ';--zx-panel:' + th.panel + ';--zx-text:' + th.text + ';--zx-muted:' + th.muted + ';}'
        + '.brand-lockup{display:inline-flex;align-items:center;gap:9px;vertical-align:middle}.brand-mark{width:42px;height:42px;object-fit:contain;display:block;border-radius:6px}.brand-logo{color:' + th.text + ';}.brand-logo .accent,.brand-logo .accent{color:' + th.accent + ';}'
        + '.settings-screen,.zx-login-screen,.search-screen,.zx-home2,.home-screen{background-color:transparent !important;background-image:none !important;color:' + th.text + ' !important;}'
        + '.settings-content,.settings-menu .sm-item,.info-card,.opt-btn,.action-btn,.zx-pf-kids{background-color:' + th.panel + ';color:' + th.text + ';}'
        + '.settings-screen .settings-sub,.settings-pane .pane-sub,.settings-pane .pane-section-title,.zx-pf-kids-sub{color:' + th.muted + ';}'
        + '.settings-menu .sm-item:focus,.settings-menu .sm-item.is-active,.opt-btn:focus,.opt-btn.is-active,.opt-btn.is-on{border-color:' + th.accent + ';box-shadow:0 0 0 3px ' + th.accent + '55;}'
        + '.settings-screen .settings-back,.settings-menu .sm-item,.info-card,.opt-btn,.action-btn{border-color:' + th.accent + '45;}'
        + '.zx-pf-gbtn.zx-pf-sel .zx-pf-av,.zx-pf-card:focus .zx-pf-av,.zx-pf-card:hover .zx-pf-av{border-color:' + th.accent + ';box-shadow:0 0 0 3px ' + th.accent + '44;}'
        + '.zx-pf-kids-title,.zx-pf-name,.zx-pf-input{color:' + th.text + ';}.zx-pf-switch.on{background:' + th.accent + ';}'
        + 'a,button{accent-color:' + th.accent + ';}'
        + '[style*="color:#10b981"],[style*="color: #10b981"]{color:' + th.accent + ' !important;}'
        // A cor escolhida no painel é a mesma nas duas barras: categoria,
        // canal selecionado e EPG. Todos os fundos usam alfa para não virar
        // um bloco sólido, inclusive amarelo, verde e branco.
        + '.cat-sidebar .cat-pill:focus,.cat-sidebar .cat-pill.is-active{background:' + ta + ' !important;color:#fff !important;border-color:' + td + ' !important;box-shadow:inset 0 0 0 1px ' + tc + ',0 0 0 2px ' + tb + ' !important;}'
        + '.cat-sidebar .cat-pill:focus .cat-count,.cat-sidebar .cat-pill.is-active .cat-count{color:#fff !important;}'
        + '.channel-tile-tv:focus{background:' + ta + ' !important;color:#fff !important;border-color:' + td + ' !important;box-shadow:inset 0 0 0 1px ' + tc + ',0 0 0 2px ' + tb + ' !important;}'
        + '.channel-tile-tv:focus .ct-num,.channel-tile-tv:focus .ct-name{color:#fff !important;}'
        + '.ct-fav.is-fav{background:' + ta + ' !important;}.ct-fav.is-fav svg{fill:' + th.accent + ' !important;stroke:' + th.accent + ' !important;}'
        + '.sidebar-content .sc-title{border-left-color:' + th.accent + ' !important;}'
        + '.live-epg .epg-item.is-now .epg-title{color:' + th.accent + ' !important;}'
        + '.live-epg .epg-play{background:' + ta + ' !important;color:#fff !important;border:1px solid ' + td + ' !important;}'
        + '.live-epg .epg-play:focus{background:' + tb + ' !important;box-shadow:0 0 0 3px ' + tc + ' !important;}'
        + '.live-epg .epg-alarm.is-on{background:' + ta + ' !important;border-color:' + td + ' !important;color:' + th.accent + ' !important;}';
}
function applyAppTheme(id, rerender) {
    var th = null, i;
    for (i = 0; i < APP_THEMES.length; i++) if (APP_THEMES[i].id === id) th = APP_THEMES[i];
    if (!th) th = APP_THEMES[0];
    try { localStorage.setItem('zx_app_theme', th.id); } catch (e) {}
    S.accent = th.accent;
    document.documentElement.setAttribute('data-zx-theme', th.id);
    var st = $('zx-app-theme');
    if (!st) { st = document.createElement('style'); st.id = 'zx-app-theme'; document.head.appendChild(st); }
    st.textContent = appThemeCss(th);
    if (S.rawCss) applyAccent(th.accent);
    try { if (st.parentNode) st.parentNode.appendChild(st); } catch (e) {}
    if (rerender && location.pathname.indexOf('/settings') === 0) renderSettings();
}
function brandLogoHtmlStyles() {
    return '<style>.brand-lockup{display:inline-flex;align-items:center;gap:9px;vertical-align:middle}.brand-mark{width:42px;height:42px;object-fit:contain;display:block;border-radius:6px}.brand-logo-img{max-height:42px;max-width:190px;object-fit:contain}.home-remote-icon-wrap{width:68px;height:68px;display:flex;align-items:center;justify-content:center}.home-remote-icon{width:68px;height:68px;object-fit:contain;border-radius:12px;display:block}.home-remote-fallback,.home-remote-fallback svg{width:68px;height:68px;display:block}.zx-remote-banner{position:relative;display:flex;align-items:center;gap:18px;max-width:1180px;margin:0 auto 14px;padding:12px 16px;border:1px solid rgba(255,255,255,.14);border-radius:16px;background:rgba(0,0,0,.24);overflow:hidden}.zx-remote-banner img{width:100%;max-height:180px;object-fit:cover;border-radius:11px}.zx-remote-banner-copy{position:absolute;left:28px;bottom:22px;display:flex;flex-direction:column;gap:4px;max-width:70%;padding:10px 14px;border-radius:10px;background:rgba(0,0,0,.58);color:#fff}.zx-remote-banner-copy b{font-size:18px}.zx-remote-banner-copy span{font-size:13px;color:#e6eee9}</style>';
}
function accessibilityEnabled(key) { try { return localStorage.getItem('zx_a11y_' + key) === '1'; } catch (e) { return false; } }
function applyAccessibility() {
    try {
        var body = document.body; if (!body) return;
        body.className = body.className.replace(/\s*zx-a11y-large\b/g, '').replace(/\s*zx-a11y-high\b/g, '');
        if (accessibilityEnabled('large')) body.className += ' zx-a11y-large';
        if (accessibilityEnabled('high')) body.className += ' zx-a11y-high';
        var st = $('zx-a11y-css'); if (!st) { st = document.createElement('style'); st.id = 'zx-a11y-css'; document.head.appendChild(st); }
        st.textContent = '.zx-a11y-large .zh-tl,.zx-a11y-large .zh-stile b{font-size:1.16em !important}.zx-a11y-large .zh-tsub,.zx-a11y-large .zh-ssub,.zx-a11y-large .zh-cname{font-size:1.12em !important}.zx-a11y-large .settings-menu .sm-label{font-size:1.14rem !important}.zx-a11y-large .settings-pane .pane-title{font-size:1.38rem !important}.zx-a11y-large .settings-pane .pane-sub{font-size:1.12rem !important;line-height:1.5 !important}.zx-a11y-large .settings-pane .opt-btn,.zx-a11y-large .settings-pane .action-btn{font-size:1.12rem !important;min-height:64px !important}.zx-a11y-large .settings-pane .ab-title{font-size:1.14rem !important}.zx-a11y-large .settings-pane .ab-sub{font-size:1rem !important}.zx-a11y-large .settings-pane input{font-size:1.12rem !important}.zx-a11y-large .btn-tv,.zx-a11y-large button,.zx-a11y-large input,.zx-a11y-large select{line-height:1.25}.zx-a11y-high .zh-tbtn,.zx-a11y-high .zh-tile,.zx-a11y-high .zh-stile,.zx-a11y-high .btn-tv,.zx-a11y-high .sm-item,.zx-a11y-high .opt-btn{border-color:#fff !important}.zx-a11y-high .zh-tbtn:focus,.zx-a11y-high .zh-tile:focus,.zx-a11y-high .zh-stile:focus,.zx-a11y-high button:focus,.zx-a11y-high a:focus{outline:3px solid #fff !important;box-shadow:0 0 0 5px #10b981 !important}.zx-ambient-wall{position:absolute;inset:0;background:var(--zx-bg,#06130f) center/cover no-repeat;filter:brightness(.38)}.zx-ambient-center{position:absolute;inset:0;display:flex;flex-direction:column;align-items:center;justify-content:center;gap:16px;color:#fff;text-align:center}.zx-ambient-center .brand-lockup{transform:scale(1.35);margin-bottom:12px}.zx-ambient-clock{font-size:clamp(64px,12vw,180px);font-weight:200;letter-spacing:.05em;font-variant-numeric:tabular-nums}.zx-ambient-date{font-size:clamp(18px,2.4vw,34px);color:#c7d8cf}.zx-ambient-hint{margin-top:24px;font-size:clamp(12px,1.4vw,18px);color:#8fa39a}.zx-ambient-center .brand-mark{width:54px;height:54px}.zx-ambient-center .brand-logo{font-size:34px}';
    } catch (e) {}
}
function ultraDiagnosticsText() {
    var online = typeof navigator !== 'undefined' && navigator.onLine !== false, rows = [];
    rows.push('Internet: ' + (online ? 'disponível' : 'indisponível'));
    rows.push('Servidor: ' + (S.server ? 'conectado' : 'não configurado'));
    rows.push('Player: ' + (nativeAvail() ? 'Media3/ExoPlayer' : 'player Web'));
    rows.push('Modo: ' + (getFormFactor() === 'tv' ? 'TV Box' : 'Celular'));
    ['live','movies','series'].forEach(function (k) { var c = S.cat && S.cat[k]; rows.push((k === 'live' ? 'Canais' : k === 'movies' ? 'Filmes' : 'Séries') + ': ' + (c && c.all ? fmtNum(c.all.length) : 'aguardando catálogo')); });
    return rows.join(' · ');
}
function ambientEnabled() { return accessibilityEnabled('ambient'); }
function closeAmbient() { try { var el = $('zx-ambient-overlay'); if (el && el.parentNode) el.parentNode.removeChild(el); if (global.__zxAmbientTimer) { clearInterval(global.__zxAmbientTimer); global.__zxAmbientTimer = null; } } catch (e) {} }
function showAmbient() {
    if (!ambientEnabled() || !document.querySelector('.zx-home2') || $('zx-ambient-overlay')) return;
    if (document.querySelector('.zx-ff-ask,.zx-ann-overlay,#zx-expiration-modal,.zx-epg-alarm-modal')) return;
    var now = new Date(), logo = brandLogoHtml();
    var el = document.createElement('div'); el.id = 'zx-ambient-overlay'; el.tabIndex = 0; el.setAttribute('aria-label', 'Modo ambiente');
    el.innerHTML = '<div class="zx-ambient-wall"></div><div class="zx-ambient-center">' + logo + '<div class="zx-ambient-clock" id="zxAmbientClock">' + p2(now.getHours()) + ':' + p2(now.getMinutes()) + '</div><div class="zx-ambient-date" id="zxAmbientDate"></div><div class="zx-ambient-hint">Pressione qualquer botão para continuar</div></div>';
    document.body.appendChild(el);
    var tick = function () { var n = new Date(), c = $('zxAmbientClock'), d = $('zxAmbientDate'); if (c) c.textContent = p2(n.getHours()) + ':' + p2(n.getMinutes()); if (d) d.textContent = currentLang() === 'en' ? n.toLocaleDateString('en-US', { weekday: 'long', day: 'numeric', month: 'long' }) : n.toLocaleDateString('pt-BR', { weekday: 'long', day: 'numeric', month: 'long' }); };
    tick(); global.__zxAmbientTimer = setInterval(tick, 1000); try { el.focus(); } catch (e) {}
}
function startAmbientWatch() {
    if (global.__zxAmbientWatch) return; global.__zxAmbientWatch = true; var last = Date.now();
    function activity() { last = Date.now(); closeAmbient(); }
    document.addEventListener('keydown', activity, true); document.addEventListener('pointerdown', activity, true); document.addEventListener('touchstart', activity, true);
    setInterval(function () { if (ambientEnabled() && Date.now() - last > 45000) showAmbient(); }, 5000);
}
function applyAccent(accent) {
    S.accent = accent || '#10b981';
    if (!S.rawCss) return;
    var css = S.rawCss;
    var a = S.accent;
    if (a && a.toLowerCase() !== '#ff2a3d' && /^#[0-9a-fA-F]{6}$/.test(a)) {
        var r = parseInt(a.substr(1, 2), 16), g = parseInt(a.substr(3, 2), 16), b = parseInt(a.substr(5, 2), 16);
        var darker = '#' + h2(r * 0.85) + h2(g * 0.85) + h2(b * 0.85);
        css = css.replace(/#ff2a3d/gi, a).replace(/#e02531/gi, darker).replace(/#10b981/gi, a).replace(/#0e2019/gi, appTheme().bg).replace(/#0d241a/gi, appTheme().panel);
        css = css.replace(/255,\s*42,\s*61/g, r + ',' + g + ',' + b);
        css = css.replace(/40,\s*10,\s*12/g, Math.floor(r * 0.16) + ',' + Math.floor(g * 0.16) + ',' + Math.floor(b * 0.16));
    }
    var st = $('hdx-css');
    if (!st) { st = document.createElement('style'); st.id = 'hdx-css'; document.head.appendChild(st); }
        st.textContent = css;
}

function applyWallpaper(url) {
    var st = $('zx-wall');
    if (!st) { st = document.createElement('style'); st.id = 'zx-wall'; document.head.appendChild(st); }
    var safe = String(url || '').replace(/\\/g, '\\\\').replace(/'/g, "\\'");
    var resolved = String(url || 'assets/branding/fusion_background.png').trim();
    var safeResolved = resolved.replace(/\\/g, '\\\\').replace(/'/g, "\\'");
    // O fundo Fusion fica no root e todas as páginas transparentes exibem a
    // mesma imagem. Se o painel fornecer outro background_url, ele continua
    // tendo prioridade; sem ele, usa o asset local Fusion.
    st.textContent = ".bg-diamonds{background-color:transparent !important;background-image:none !important;}"
        + "#app-root,.app-root{background-color:transparent !important;background-image:url('" + safeResolved + "') !important;background-position:center center;background-repeat:no-repeat;background-size:cover;background-attachment:fixed;}"
        + '.sidebar-screen,.zx-home2,.home-screen,.radio-screen,.search-screen,.settings-screen,.detail-screen,.detail-bg,.category-screen,.cat-screen,.content-screen,.live-screen{background-color:transparent !important;background-image:none !important;}'
        + '.zx-home2{background:transparent !important;}.zx-home2 .zh-amb,.zx-home2 .zh-wm{display:none !important;}';
    try { applyHomePanelWall(); } catch (e) {}
}
function applyHomePanelWall() {
    try {
        var els = document.querySelectorAll('.zx-panel-wall,.zx-settings-wall');
        if (!els || !els.length) return;
        var u = String((S.branding && S.branding.background_url) || 'assets/branding/fusion_background.png').replace(/\\/g, '\\\\').replace(/'/g, "\\'");
        for (var i = 0; i < els.length; i++) els[i].style.backgroundImage = "url('" + u + "')";
    } catch (e) {}
}
function warmHomeCatalogs() {
    if ((!S.server && !S.playlistUrl) || S._homeWarmStarted) return;
    S._homeWarmStarted = true;
    // A primeira pintura usa o cache/preview para devolver o controle remoto
    // rapidamente. A TV Box não inicia a carga integral junto com a Home:
    // isso competia com o WebView e deixava a tela principal lenta.
    var tvWarm = getFormFactor() === 'tv';
    try { tvWarm = tvWarm || (document.body && /(^|\s)(zx-ff-tv|ui-tv)(\s|$)/.test(String(document.body.className || ''))); } catch (e0) {}
    if (tvWarm) {
        setTimeout(function () { refreshHomePreviewCatalogs(['movies', 'series', 'live'], 0); }, 180);
        setTimeout(function () { refreshHomeCachedCatalogs(['movies', 'series', 'live'], 0); }, 9000);
        setTimeout(function () { radioLoadCategory(radioCategory('gospel')).catch(function () {}); }, 6000);
        return;
    }
    var kinds = ['movies', 'series', 'live'];
    for (var i = 0; i < kinds.length; i++) (function (kind, delay) {
        setTimeout(function () { ensureCatalog(kind, true).catch(function () {}); }, delay);
    })(kinds[i], i * 220);
    setTimeout(function () { radioLoadCategory(radioCategory('gospel')).catch(function () {}); }, 900);
}
function applyBranding(b) {
    if (!b) return;
    S.branding = b;
    var title = b.app_title || ((b.brand_name || 'Fusion') + ' Player');
    try { document.title = title; } catch (e) {}
    var saved = appThemeId();
    if (saved && saved !== 'verde') applyAppTheme(saved, false); else applyAccent(b.accent || '#10b981');
    // O painel usa exclusivamente background_url para a imagem de fundo da
    // home. Não usar bg_url/background/banner como fallback: esses campos podem
    // conter a arte antiga ou um banner diferente do fundo escolhido.
    applyWallpaper(b.background_url || '');
}
var ULTRA_CONFIG_ENDPOINT = 'https://renciaapp.manus.space/api/v5/ultra-config?mac=';
function applyUltraConfig(j, rerender) {
    if (!j) return;
    if (j.registered === false || j.allowed === false) { S.ultraDenied = true; S.remoteConfig = j; return; }
    S.ultraDenied = false;
    // Branding isolado do Fusion: nenhuma chave genérica do OuroPro,
    // check_mac ou do objeto raiz é lida aqui.
    var old = S.branding || {};
    var b = {};
    b.app_title = 'Fusion';
    b.brand_name = 'Fusion';
    b.logo_url = j.ultra_logo_url || '';
    b.banner_url = j.ultra_banner_url || '';
    // A identidade visual Fusion enviada pelo usuário é o fundo interno padrão
    // de todas as páginas; o campo remoto é mantido apenas no objeto bruto.
    b.background_url = 'assets/branding/fusion_background.png';
    b.wallpaper_url = '';
    b.background = '';
    b.message_image_url = j.ultra_message_image_url || '';
    b.message_title = '';
    b.message_text = '';
    b.impact_phrase = '';
    b.server_api_url = old.server_api_url || '';
    b.apk_download_url = j.ultra_apk_download_url || j.ultra_apk_link || old.apk_download_url || '';
    b.apk_version = j.ultra_apk_version || j.ultra_app_version || old.apk_version || '';
    b.apk_version_code = j.ultra_version_code || j.ultra_apk_version_code || old.apk_version_code || 0;
    b.icons = {
        live_tv: j.ultra_icon_live_tv_url || '',
        movies: j.ultra_icon_movies_url || '',
        series: j.ultra_icon_series_url || ''
    };
    if (j.ultra_message_image_url) b.announce = { ver: String(Date.now()), banner: false, popup: false, title: '', text: '' };
    S.branding = b; S.remoteConfig = j; S.configServerApiUrl = b.server_api_url;
    try { lsSet('zx_ultra_config', j); } catch (e) {}
    applyBranding(b);
    if (rerender && document.querySelector('.zx-home2')) { renderHome(); }
}
function appUpdateUrl() { var b = S.branding || {}, j = S.remoteConfig || {}; return String(b.apk_download_url || j.ultra_apk_download_url || j.ultra_apk_link || '').trim(); }
function requestNativeUpdate() {
    var url = appUpdateUrl();
    if (!url) { var no = $('zx-app-update-status'); if (no) no.textContent = 'O painel ainda não publicou um APK para atualização.'; return; }
    if (!global.HdxNative || !global.HdxNative.updateApp) { var na = $('zx-app-update-status'); if (na) na.textContent = 'Atualização interna disponível somente no APK Android.'; return; }
    var btn = $('zx-app-update-btn'); if (btn) { btn.disabled = true; btn.className += ' is-loading'; }
    var st = $('zx-app-update-status'); if (st) st.textContent = 'Iniciando verificação…';
    try { global.HdxNative.updateApp(url); } catch (e) { if (st) st.textContent = 'Não foi possível iniciar a atualização.'; if (btn) btn.disabled = false; }
}
global.__zxNativeUpdateState = function (state, message, percent) {
    var st = $('zx-app-update-status'), btn = $('zx-app-update-btn');
    if (st) st.textContent = String(message || '');
    if (state === 'progress' && percent >= 0 && st) st.textContent = String(message || 'Baixando atualização…') + ' ' + percent + '%';
    if (state === 'latest' || state === 'error' || state === 'permission') { if (btn) { btn.disabled = false; btn.className = btn.className.replace(/\s*is-loading/g, ''); } }
    if (state === 'ready' && btn) btn.className = btn.className.replace(/\s*is-loading/g, '');
};
function fetchUltraConfig() {
    var mac = getAppMac();
    if (!mac) return Promise.resolve(null);
    // Única fonte de branding do Fusion: /api/v5/ultra-config.
    // Remove a configuração antiga e não usa fallback visual cacheado: se o
    // painel mudou a imagem, a próxima abertura deve refletir imediatamente.
    try { localStorage.removeItem('zx_ultra_config'); } catch (e) {}
    return fetchT(ULTRA_CONFIG_ENDPOINT + enc(mac), 10000, { cache: 'no-store', credentials: 'omit', headers: { 'Accept': 'application/json', 'Cache-Control': 'no-cache', 'Pragma': 'no-cache' } }).then(function (r) { return r.json(); }).then(function (j) { applyUltraConfig(j, true); return j; }).catch(function () { return null; });
}
function loadCss() {
    // ⚠️ Android WebView BLOQUEIA fetch() de file:// — MAS o XMLHttpRequest
    // respeita setAllowFileAccessFromFileURLs(true). Por isso usamos XHR (vale
    // PC E Android): pega o texto do tv.css → applyAccent injeta com o accent
    // esmeralda. Fallback <link> só se o XHR falhar (aí cai na cor base do CSS).
    function viaLink() {
        try {
            if (document.getElementById('zx-css-link')) return;
            var l = document.createElement('link');
            l.id = 'zx-css-link'; l.rel = 'stylesheet'; l.href = 'assets/tv.css';
            document.head.appendChild(l);
        } catch (e) {}
    }
    function applyText(t) { if (t && t.length > 100) { S.rawCss = t; applyAccent(S.accent); } else viaLink(); }
    try {
        var x = new XMLHttpRequest();
        x.open('GET', 'assets/tv.css', true);
        x.onreadystatechange = function () {
            if (x.readyState !== 4) return;
            if ((x.status === 200 || x.status === 0) && x.responseText) applyText(x.responseText);
            else viaLink();
        };
        x.onerror = viaLink;
        x.send();
    } catch (e) { viaLink(); }
    return Promise.resolve();
}

/* ---------- mapeadores Xtream → tile ---------- */
function sortNewest(list, key) {
    list.sort(function (a, b) {
        var av = parseInt(a[key] || 0, 10) || 0, bv = parseInt(b[key] || 0, 10) || 0;
        if (av !== bv) return bv - av;
        return (parseInt(b.stream_id || b.series_id || 0, 10) || 0) - (parseInt(a.stream_id || a.series_id || 0, 10) || 0);
    });
    return list;
}
// tile de pôster (EXATO _tiles_poster.php) — nome embaixo, sem nota, lazy
function posterTile(s, kind) {
    var sid, href, name, poster;
    if (kind === 'movies') {
        sid = parseInt(s.stream_id || 0, 10); href = '/movies/' + sid; name = s.name || 'Filme';
        poster = tmdbResize(s.stream_icon || '');
    } else {
        sid = parseInt(s.series_id || s.stream_id || 0, 10); href = '/series/' + sid; name = s.name || 'Série';
        poster = tmdbResize(s.cover || s.stream_icon || '');
    }
    var directTrailer = s.youtube_trailer || s.trailer_url || s.trailer || '';
    var rating = tmdbRatingLabel(tmdbRatingFor(kind, s));
    return '<a class="poster-tile-tv" href="' + href + '">' 
        + '<div class="pt-img"' + (poster ? ' data-src="' + attr(poster) + '"' : '') + '>'
        + '<div class="pt-fallback">' + esc((name || '').slice(0, 2)) + '</div></div>'
        + '<div class="pt-name">' + esc(name) + '</div>'
        + (rating ? '<div class="pt-rating" style="color:#f6c453;font:700 12px system-ui;margin-top:3px;">★ ' + esc(rating.replace('TMDB ', '')) + '</div>' : '')
        + '<button type="button" class="poster-trailer-btn" data-trailer-title="' + attr(name) + '" data-trailer-kind="' + (kind === 'series' ? 'series' : 'movie') + '"' + (directTrailer ? ' data-trailer-url="' + attr(directTrailer) + '"' : '') + ' aria-label="Assistir trailer de ' + attr(name) + '">▶ Trailer</button></a>';
}
function posterTiles(list, kind) { var h = ''; for (var i = 0; i < list.length; i++) h += posterTile(list[i], kind); return h; }
function trailerSearchUrl(title, kind) {
    var suffix = kind === 'series' ? ' série trailer oficial' : ' filme trailer oficial';
    return 'https://m.youtube.com/results?search_query=' + encodeURIComponent(String(title || '') + suffix);
}
function openTrailer(title, kind, direct) {
    var raw = String(direct || ''), u = /^https?:\/\//i.test(raw) ? raw : trailerSearchUrl(title, kind);
    try {
        if (global.HdxNative && typeof global.HdxNative.openTrailer === 'function') { global.HdxNative.openTrailer(u, String(title || '')); return; }
        if (global.HdxNative && typeof global.HdxNative.openUrl === 'function') { global.HdxNative.openUrl(u); return; }
    } catch (e) {}
    try { global.open(u, '_blank'); } catch (e2) { try { location.href = u; } catch (e3) {} }
}
function trailerFromTarget(target) {
    var n = target;
    while (n && n !== document) { if (n.getAttribute && n.getAttribute('data-trailer-title')) return n; n = n.parentNode; }
    return null;
}
function trailerClickFirst(e) {
    var btn = trailerFromTarget(e.target); if (!btn) return false;
    e.preventDefault(); if (e.stopImmediatePropagation) e.stopImmediatePropagation(); else e.stopPropagation();
    openTrailer(btn.getAttribute('data-trailer-title') || '', btn.getAttribute('data-trailer-kind') || 'movie', btn.getAttribute('data-trailer-url') || '');
    return true;
}
function installTrailerStyles() {
    if (document.getElementById('zx-trailer-css')) return;
    var st = document.createElement('style'); st.id = 'zx-trailer-css';
    st.textContent = '.poster-tile-tv{position:relative;}'
        + '.poster-trailer-btn{display:block;width:calc(100% - 14px);margin:5px auto 0;padding:7px 6px;border:1px solid rgba(16,185,129,.55);border-radius:8px;background:rgba(16,185,129,.16);color:#eafff6;font:700 12px system-ui;cursor:pointer;text-align:center;}'
        + '.poster-trailer-btn:focus{outline:none;background:rgba(16,185,129,.4);border-color:#10b981;box-shadow:0 0 0 3px rgba(16,185,129,.35);}'
        + 'body.zx-ff-tv .poster-trailer-btn{font-size:15px;padding:9px 7px;}'
        + '@media(max-width:600px){.poster-trailer-btn{font-size:10px;padding:5px 4px;}}';
    (document.head || document.documentElement).appendChild(st);
}
// Ajusta os tiles de PÔSTER pra ENCHER a fileira do grid ATUAL. Favoritos e
// busca são FULL-WIDTH (sem sidebar) e NÃO carregam o category_browser; sem isto
// herdavam a % do CATÁLOGO (estreito por causa da sidebar) → pôsteres GIGANTES.
// Recalcula pela largura REAL deste grid. Mesmo cálculo/elemento (#zx-grid-fit)
// do category_browser. Não roda em ui-tv (Samsung/LG não passam por aqui).
function fitPosterGrid(grid) {
    if (!grid) return;
    try { if ((' ' + document.body.className + ' ').indexOf(' ui-tv ') >= 0) return; } catch (e) {}
    var w = grid.clientWidth || 0;
    if (w < 40) return;
    var c = Math.round(w / (global.__ZX_TILE_TARGET || 210));   // alvo menor no modo Celular → mais colunas
    if (c < 3) c = 3; else if (c > 8) c = 8;
    var pct = Math.floor((100 / c) * 10000) / 10000;
    var id = grid.id || 'content-grid';
    var st = $('zx-grid-fit');
    if (!st) { st = document.createElement('style'); st.id = 'zx-grid-fit'; (document.head || document.documentElement).appendChild(st); }
    st.textContent = '#' + id + ' .poster-tile-tv{width:' + pct + '%;margin:0 0 16px;padding:0 7px;-webkit-box-sizing:border-box;box-sizing:border-box}';
}
// tile de canal (EXATO _tiles_channel.php)
function channelTile(s, i) {
    var sid = parseInt(s.stream_id || 0, 10);
    var name = s.name || 'Canal';
    var num = parseInt(s.num || (i + 1), 10);
    var logo = s.stream_icon || '';
    // O ID do catálogo é mais confiável que category_name/group, que algumas
    // listas devolvem como um rótulo genérico (por exemplo, ABERTOS).
    var catName = '';
    try {
        var liveCats = S.cat.live && S.cat.live.cats || [], cid = String(s.category_id || '');
        for (var ci = 0; ci < liveCats.length; ci++) if (String(liveCats[ci].category_id || '') === cid) { catName = liveCats[ci].category_name || ''; break; }
    } catch (e) {}
    if (!catName) catName = s.category_name || s.group || s.group_title || '';
    var isFav = inArr(S.fav.live, sid);
    return '<a class="channel-tile-tv" tabindex="0"'
        + ' data-href="/live/channel/' + sid + '?name=' + encodeURIComponent(name) + '&logo=' + encodeURIComponent(logo) + '"'
        + ' data-sid="' + sid + '" data-cat="' + attr(catName) + '" data-name="' + attr(name) + '" data-logo="' + attr(logo) + '">'
        + '<div class="ct-logo"' + (logo ? ' data-logo="' + attr(logo) + '"' : '') + '><span class="ct-fallback">📺</span></div>'
        + '<div class="ct-info"><div class="ct-num">#' + num + '</div><div class="ct-name">' + esc(name) + '</div></div>'
        + '<span class="ct-fav ' + (isFav ? 'is-fav' : '') + '" tabindex="-1" data-sid="' + sid + '" data-name="' + attr(name) + '" data-logo="' + attr(logo) + '" aria-label="Favoritar canal">'
        + '<svg viewBox="0 0 24 24" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M20.84 4.61a5.5 5.5 0 0 0-7.78 0L12 5.67l-1.06-1.06a5.5 5.5 0 0 0-7.78 7.78l1.06 1.06L12 21.23l7.78-7.78 1.06-1.06a5.5 5.5 0 0 0 0-7.78z"></path></svg></span></a>';
}
function channelTiles(list) { var h = ''; for (var i = 0; i < list.length; i++) h += channelTile(list[i], i); return h; }

/* ---------- catálogo (carrega tudo 1x por seção; igual HDX direto) ---------- */
var PAGE = 100;
function xtreamCatalog(kind, fastFirstCategory) {
    var catsAction = kind === 'live' ? 'get_live_categories' : kind === 'movies' ? 'get_vod_categories' : 'get_series_categories';
    var listAction = kind === 'live' ? 'get_live_streams' : kind === 'movies' ? 'get_vod_streams' : 'get_series';
    var newKey = kind === 'series' ? 'last_modified' : 'added';
    function finish(catsRaw, streamsRaw) {
        if (!tizenAvail() && (catsRaw === null || streamsRaw === null)) throw { zxOffline: 1 };
        var cats = arr1(catsRaw), rawAll = arr1(streamsRaw), adultCats = {}, all = rawAll, byCat = {};
        for (var ac = 0; ac < cats.length; ac++) if (isAdultName(cats[ac].category_name)) adultCats[String(cats[ac].category_id || '')] = 1;
        if (profKidsActive()) all = rawAll.filter(function (item) { return !adultCats[String(item.category_id || '')] && kidsAllows(item); });
        for (var i = 0; i < all.length; i++) { var cid = String(all[i].category_id || ''); if (!byCat[cid]) byCat[cid] = []; byCat[cid].push(all[i]); }
        if (kind !== 'live') { for (var c in byCat) if (byCat.hasOwnProperty(c)) sortNewest(byCat[c], newKey); sortNewest(all, newKey); }
        var outCats = [];
        for (var j = 0; j < cats.length; j++) { var id = String(cats[j].category_id || ''), catName = cats[j].category_name || '—', catAdult = isAdultName(catName); if (profKidsActive() && catAdult) continue; outCats.push({ category_id: id, category_name: catName, num: (byCat[id] ? byCat[id].length : 0), adult: catAdult }); }
        S.cat[kind] = { cats: outCats, byCat: byCat, all: all, partial: !!fastFirstCategory };
        return S.cat[kind];
    }
    if (fastFirstCategory && kind !== 'live') {
        // A Home usa uma amostra ampla para abrir rápido. O filtro antigo pela
        // primeira categoria fazia a TV Box mostrar somente 1 filme ou 5 séries.
        // Busca até 360 itens da resposta geral; ao entrar na seção, forceFull
        // consulta novamente e monta o catálogo completo.
        return xt(catsAction).then(function (catsRaw) {
            return xt(listAction).then(function (streamsRaw) {
                var preview = arr1(streamsRaw).slice(0, 360);
                return finish(catsRaw, preview);
            });
        });
    }
    return Promise.all([xt(catsAction), xt(listAction)]).then(function (res) { return finish(res[0], res[1]); });
}
function catalogCacheKey(kind) {
    var source = String(S.playlistUrl || S.server || 'default');
    return 'zx_catalog_cache_v2:' + kind + ':' + source.slice(-160);
}
function compactCatalogForCache(cat) {
    if (!cat) return null;
    var by = {}, keys = Object.keys(cat.byCat || {});
    for (var i = 0; i < keys.length; i++) by[keys[i]] = (cat.byCat[keys[i]] || []).slice(0, 60);
    return { cats: (cat.cats || []).slice(0, 180), byCat: by, all: (cat.all || []).slice(0, 360), partial: true };
}
function saveCatalogCache(kind, cat) {
    try { lsSet(catalogCacheKey(kind), { ts: Date.now(), data: compactCatalogForCache(cat) }); } catch (e) {}
}
function readCatalogCache(kind) {
    try {
        var hit = lsGet(catalogCacheKey(kind));
        if (!hit || !hit.data || !hit.ts || Date.now() - hit.ts > 15 * 60 * 1000) return null;
        return hit.data;
    } catch (e) { return null; }
}
function ensureCatalog(kind, forceFull) {
    forceFull = !!forceFull;
    // A Home e os contadores usam apenas snapshot/cache. Entrar numa categoria,
    // pesquisar ou usar voz passa forceFull=true e aí recebe o catálogo completo.
    if (S.cat[kind] && (!forceFull || !S.cat[kind].partial)) return Promise.resolve(S.cat[kind]);
    if (S.catPromises[kind]) {
        if (!forceFull || S.catPromiseFull[kind]) return S.catPromises[kind];
        var partialPending = S.catPromises[kind];
        return partialPending.then(function () { return refreshCatalog(kind, true); }, function () { return refreshCatalog(kind, true); });
    }
    var cached = getFormFactor() === 'tv' ? readCatalogCache(kind) : null;

    if (cached && !forceFull) { S.cat[kind] = cached; return Promise.resolve(cached); }
    if (cached && forceFull) S.cat[kind] = cached;
    return refreshCatalog(kind, forceFull);
}
function refreshCatalog(kind, forceFull) {
    forceFull = !!forceFull;
    if (S.catPromises[kind]) {
        // Uma solicitação integral nunca pode ser atendida por uma promessa
        // de preview já em andamento. Aguarda a parcial terminar e então
        // dispara uma nova consulta completa.
        if (!forceFull || S.catPromiseFull[kind]) return S.catPromises[kind];
        var pending = S.catPromises[kind];
        return pending.then(function () { return refreshCatalog(kind, true); }, function () { return refreshCatalog(kind, true); });
    }
    S.catPromiseFull[kind] = forceFull;
    var isM3u = (S.playlistType || '').indexOf('m3u') === 0;
    if (isM3u && !S.xtreamDerived && !S.xtreamUnavailable) xtreamCreds();
    var work;
    if (isM3u && (!S.xtreamDerived || S.xtreamUnavailable)) {
        work = forceFull ? catalogFromM3U() : catalogFromM3UPreview().then(function (all) { return all[kind] || snapshotCatalogFromList(kind, []); });
    }
    else work = xtreamCatalog(kind, !forceFull && getFormFactor() === 'tv' && kind !== 'live').catch(function (err) {
        if (isM3u && S.xtreamDerived) {
            S.xtreamUnavailable = true; S.xtreamDerived = null;
            S.cat = { movies: null, series: null, live: null };
            return forceFull ? catalogFromM3U() : catalogFromM3UPreview().then(function (all) { return all[kind] || snapshotCatalogFromList(kind, []); });
        }
        throw err;
    });
    S.catPromises[kind] = work.then(function (result) {
        saveCatalogCache(kind, result); delete S.catPromises[kind]; delete S.catPromiseFull[kind];
        return result;
    }, function (err) { delete S.catPromises[kind]; delete S.catPromiseFull[kind]; throw err; });
    return S.catPromises[kind];
}
function streamsForCat(kind, catId) {
    var c = S.cat[kind]; if (!c) return [];
    return c.byCat[String(catId)] || [];
}

/* ============================================================
 * SHIM — intercepta Tv.get / Tv.post (XHR do tv.js) p/ servir as URLs
 * que o category_browser.js e o controlador de EPG pedem, a partir do
 * IPTV/api. hls.js (segmentos) NÃO passa por aqui → fica intocado.
 * ============================================================ */
function parseUrl(u) {
    u = u || '';
    var q = ''; var i = u.indexOf('?'); if (i >= 0) { q = u.slice(i + 1); u = u.slice(0, i); }
    // tira base/origem
    if (u.indexOf('http') === 0) { var m = u.match(/^https?:\/\/[^/]+(\/.*)$/); u = m ? m[1] : u; }
    var b = global.__BASE || ''; if (b && u.indexOf(b) === 0) u = u.slice(b.length) || '/';
    var qs = {}; if (q) { var ps = q.split('&'); for (var k = 0; k < ps.length; k++) { var kv = ps[k].split('='); qs[decodeURIComponent(kv[0] || '')] = decodeURIComponent(kv[1] || ''); } }
    return { path: u, qs: qs };
}
function shimGet(url, cb) {
    var pu = parseUrl(url), path = pu.path, qs = pu.qs, m;
    // categoria de filmes/séries (paginada)
    m = path.match(/^\/(movies|series)\/category\/(\d+)$/);
    if (m && qs.ajax === '1') {
        var kind = m[1], catId = m[2], page = parseInt(qs.page || '1', 10) || 1;
        ensureCatalog(kind, true).then(function () {
            var list = streamsForCat(kind, catId);
            var start = (page - 1) * PAGE, slice = list.slice(start, start + PAGE);
            cb({ html: posterTiles(slice, kind), has_more: (start + PAGE) < list.length }, 200);
        });
        return true;
    }
    // categoria de canais (sem paginação)
    m = path.match(/^\/live\/category\/(\d+)$/);
    if (m && qs.ajax === '1') {
        var lc = m[1];
        ensureCatalog('live', true).then(function () { cb({ html: channelTiles(streamsForCat('live', lc)) }, 200); });
        return true;
    }
    // todos os canais (busca instantânea)
    if (path === '/api/live/all') {
        ensureCatalog('live', true).then(function () {
            var all = S.cat.live.all, out = [];
            for (var i = 0; i < all.length; i++) {
                var s = all[i]; if (isAdultName(s.category_name)) {}
                out.push({ id: parseInt(s.stream_id || 0, 10), name: s.name || '', logo: s.stream_icon || '', num: parseInt(s.num || (i + 1), 10), fav: inArr(S.fav.live, s.stream_id) ? 1 : 0 });
            }
            cb({ items: out }, 200);
        });
        return true;
    }
    // EPG de um canal
    m = path.match(/^\/api\/live\/epg\/(\d+)$/);
    if (m) {
        var sid = m[1];
        xt('get_short_epg', '&stream_id=' + enc(sid) + '&limit=6').then(function (d) { cb({ epg: epgItemsFromResponse(d) }, 200); });
        return true;
    }
    return false;
}
function shimPost(url, data, cb) {
    var pu = parseUrl(url), path = pu.path;
    if (path === '/api/favorites/toggle') {
        // caminho ÚNICO (otimista + reconcilia ao reconectar)
        var on = favToggle(fd(data, 'kind'), fd(data, 'item_id'), fd(data, 'name'), fd(data, 'poster'));
        updateFavCounts();   // contador da sidebar reflete NA HORA (o coração do canal não navega)
        cb({ ok: true, favorited: on }, 200);
        return true;
    }
    if (path === '/api/progress/save' || path === '/api/progress/complete') {
        var done = path.indexOf('complete') >= 0;
        saveProgress(fd(data, 'kind'), fd(data, 'item_id'), done ? 0 : fd(data, 'position'), fd(data, 'duration'), fd(data, 'name'), fd(data, 'poster'));
        cb({ ok: true }, 200);
        return true;
    }
    if (path === '/api/csrf') { cb({ csrf: '' }, 200); return true; }
    return false;
}
function fd(data, k) {
    try { if (data && typeof data.get === 'function') return data.get(k) || ''; } catch (e) {}
    return '';
}
function b64(s) {
    if (!s) return '';
    try { return decodeURIComponent(escape(global.atob(s))); } catch (e) { try { return global.atob(s); } catch (e2) { return s; } }
}
function hhmm(s) { s = String(s || ''); var m = s.match(/(\d{2}):(\d{2})/); return m ? (m[1] + ':' + m[2]) : ''; }
function epgText(v) {
    var raw = String(v || ''); if (!raw) return '';
    try { var decoded = b64(raw); if (decoded && decoded !== raw && /[A-Za-zÀ-ÿ]/.test(decoded) && !/[\u0000-\u0008]/.test(decoded)) return decoded; } catch (e) {}
    return raw;
}
function epgTimestamp(raw) {
    var s = String(raw || '').trim(); if (!s) return 0;
    var n = Number(s); if (isFinite(n) && n > 1000000000) return n < 100000000000 ? n * 1000 : n;
    var d = new Date(s); if (!isNaN(d.getTime())) return d.getTime();
    var m = s.match(/(?:^|T|\s)(\d{1,2}):(\d{2})/); if (!m) return 0;
    var now = new Date(); now.setHours(parseInt(m[1], 10), parseInt(m[2], 10), 0, 0); return now.getTime();
}
function epgItemsFromResponse(d) {
    var listings = [];
    if (Array.isArray(d)) listings = d;
    else if (d) listings = d.epg_listings || d.epg || d.programs || d.data || [];
    if (!Array.isArray(listings)) listings = [];
    var out = [];
    for (var i = 0; i < listings.length; i++) { var p = listings[i] || {}, rawStart = p.start || p.start_time || p.start_datetime || p.start_timestamp || '', rawEnd = p.end || p.end_time || p.stop_datetime || p.stop_timestamp || ''; out.push({ title: epgText(p.title || p.name || p.programme || p.description), start: hhmm(rawStart), end: hhmm(rawEnd), rawStart: String(rawStart || '') }); }
    return out.filter(function (p) { return p.title || p.start; });
}
function epgAlarms() { try { var a = JSON.parse(localStorage.getItem('zx_epg_alarms') || '[]'); return Array.isArray(a) ? a : []; } catch (e) { return []; } }
function saveEpgAlarms(a) { try { localStorage.setItem('zx_epg_alarms', JSON.stringify(a || [])); } catch (e) {} }
function epgAlarmKey(when, title, channel) { return String(when || 0) + '|' + normVoiceText(title) + '|' + normVoiceText(channel); }
function epgAlarmHas(when, title, channel) { var k = epgAlarmKey(when, title, channel), a = epgAlarms(); for (var i = 0; i < a.length; i++) if (a[i].key === k) return true; return false; }
function addVoiceEpgAlarm(program, channel, sid) {
    var when = epgTimestamp(program && (program.rawStart || program.start));
    var title = String(program && program.title || 'Programa'), ch = String(channel || 'Canal');
    if (!when || when <= Date.now()) return false;
    var a = epgAlarms(), key = epgAlarmKey(when, title, ch); for (var i = 0; i < a.length; i++) if (a[i].key === key) return true;
    a.push({ key: key, when: when, title: title, channel: ch, sid: parseInt(sid, 10) || 0 }); saveEpgAlarms(a); showEpgToast('Te avisaremos quando sua programação começar.', true); return true;
}
function renderVoiceEpgSchedule(rows, heading) {
    rows = rows || [];
    var h = '<div class="search-screen smart-epg-screen"><div class="search-topbar"><a href="/home" class="gt-back" autofocus>← Voltar</a><div class="search-title">Programação inteligente</div></div><div class="voice-result-query">' + esc(heading || 'Próximos programas') + '</div><div class="smart-epg-list">';
    for (var i = 0; i < rows.length; i++) { var r = rows[i] || {}, p = r.p || {}, when = epgTimestamp(p.rawStart || p.start), armed = epgAlarmHas(when, p.title || '', r.channel || ''); h += '<div class="smart-epg-row"><div class="smart-epg-copy"><strong>' + esc(p.title || 'Programa') + '</strong><span>' + esc(r.channel || 'Canal') + ' · ' + esc(p.start || '') + '</span></div><button type="button" class="smart-epg-alarm' + (armed ? ' is-on' : '') + '" data-when="' + attr(when) + '" data-title="' + attr(p.title || '') + '" data-channel="' + attr(r.channel || '') + '" data-sid="' + attr(r.sid || '') + '" aria-label="Ativar aviso">' + (armed ? '🔔' : '🔕') + '</button></div>'; }
    h += '</div>' + (rows.length ? '' : '<div class="zx-empty">Nenhuma programação futura encontrada.</div>') + '</div><style>.smart-epg-screen{background:var(--zx-bg,#06130f);color:var(--zx-text,#f4fff9)}.smart-epg-list{display:flex;flex-direction:column;gap:10px;overflow:auto;padding:14px 20px 30px}.smart-epg-row{display:flex;align-items:center;gap:14px;padding:14px 16px;border:1px solid rgba(16,185,129,.45);border-radius:14px;background:rgba(16,185,129,.1)}.smart-epg-copy{display:flex;flex-direction:column;gap:5px;min-width:0;flex:1}.smart-epg-copy strong{font-size:18px;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.smart-epg-copy span{font-size:13px;color:#a8c1b4}.smart-epg-alarm{width:42px;height:42px;flex:0 0 42px;border:1px solid rgba(255,255,255,.3);border-radius:10px;background:rgba(0,0,0,.22);color:#fff;font-size:20px}.smart-epg-alarm:focus{outline:3px solid #fff;box-shadow:0 0 0 5px #10b981}.smart-epg-alarm.is-on{background:#10b98155}@media(max-width:700px){.smart-epg-list{padding:10px 12px 24px}.smart-epg-copy strong{font-size:15px}.smart-epg-copy span{font-size:11px}}</style>';
    setHtml(h); afterRender();
    var bs = document.querySelectorAll('.smart-epg-alarm'); for (var j = 0; j < bs.length; j++) (function (b) { b.addEventListener('click', function (e) { e.preventDefault(); e.stopPropagation(); toggleEpgAlarm(b); }); })(bs[j]);
}
function voiceEpgBrowseIntent(text) {
    var cmd = normVoiceText(text), m = cmd.match(/(\d+)\s*(?:minutos?|mins?)/), wants = /(?:o que|qual|quais|mostre|mostrar|ver).*(?:comeca|vai comecar|programacao|passar|passando)|(?:programacao|programação).*(?:agora|hoje|proxim)|(?:proxim|proximos|proximas|comeca agora|vai comecar)/.test(cmd);
    if (!wants || /(?:me avise|avise me|crie um aviso|programe um alarme)/.test(cmd)) return false;
    var minutes = m ? Math.max(10, Math.min(180, parseInt(m[1], 10) || 30)) : 30, now = Date.now(), until = now + minutes * 60000;
    assistantToast('consultando a programação');
    ensureCatalog('live').then(function (cat) {
        var all = kidsFilterList((cat && cat.all) || []), cache = S.epgCache || {}, found = [], jobs = [];
        function collect(sid, channel, epg) { for (var i = 0; i < (epg || []).length; i++) { var p = epg[i] || {}, ts = epgTimestamp(p.rawStart || p.start); if (ts >= now - 60000 && ts <= until && p.title) found.push({ p: p, sid: sid, channel: channel }); } }
        for (var sid in cache) if (cache.hasOwnProperty(sid)) { var ci = null; for (var c = 0; c < all.length; c++) if (String(all[c].stream_id) === String(sid)) { ci = all[c]; break; } collect(sid, ci && ci.name || '', cache[sid]); }
        var channels = all.slice(0, 10); for (var k = 0; k < channels.length; k++) (function (ch) { var sid = String(ch.stream_id || ''); if (!sid) return; var work = cache[sid] ? Promise.resolve(cache[sid]) : xt('get_short_epg', '&stream_id=' + enc(sid) + '&limit=20').then(function (d) { var parsed = epgItemsFromResponse(d); cache[sid] = parsed; return parsed; }); jobs.push(work.then(function (epg) { collect(sid, ch.name || '', epg); }).catch(function () {})); })(channels[k]);
        Promise.all(jobs).then(function () { found.sort(function (a, b) { return epgTimestamp(a.p.rawStart || a.p.start) - epgTimestamp(b.p.rawStart || b.p.start); }); var unique = [], seen = {}; for (var i = 0; i < found.length; i++) { var key = String(found[i].sid) + '|' + String(found[i].p.title) + '|' + String(found[i].p.start); if (!seen[key]) { seen[key] = 1; unique.push(found[i]); } } renderVoiceEpgSchedule(unique.slice(0, 40), 'Programas que começam nos próximos ' + minutes + ' minutos'); });
    }).catch(function () { renderVoiceEpgSchedule([], 'Não foi possível consultar a programação agora'); });
    return true;
}
function voiceEpgIntent(text) {
    var cmd = normVoiceText(text), m = cmd.match(/^(?:me avise|avise me|crie um aviso|programe um alarme)(?: quando comecar| quando iniciar| para quando comecar| para quando iniciar)?\s+(.+)$/);
    if (!m) return false;
    var query = String(m[1] || '').replace(/^(o|a|um|uma|programa)\s+/, '').trim();
    if (!query) return false;
    assistantToast('procurando a programação de ' + query);
    ensureCatalog('live').then(function (cat) {
        var all = kidsFilterList((cat && cat.all) || []), cache = S.epgCache || {}, found = [];
        function collect(sid, channel, epg) { for (var i = 0; i < (epg || []).length; i++) { var p = epg[i] || {}, sc = voiceMatchScore({ name: p.title || '' }, query, 'live'); if (sc > 0 && epgTimestamp(p.rawStart || p.start) > Date.now()) found.push({ p: p, sid: sid, channel: channel, score: sc }); } }
        for (var sid in cache) if (cache.hasOwnProperty(sid)) { var ci = null; for (var c = 0; c < all.length; c++) if (String(all[c].stream_id) === String(sid)) { ci = all[c]; break; } collect(sid, ci && ci.name || '', cache[sid]); }
        function finish() { found.sort(function (a, b) { return b.score - a.score || epgTimestamp(a.p.rawStart || a.p.start) - epgTimestamp(b.p.rawStart || b.p.start); }); var top = found[0]; if (top && addVoiceEpgAlarm(top.p, top.channel, top.sid)) { assistantToast('aviso criado para ' + (top.p.title || query)); } else { assistantToast('não encontrei esse programa na programação carregada'); } }
        if (found.length) { finish(); return; }
        var channels = all.slice(0, 12), jobs = [];
        for (var i = 0; i < channels.length; i++) (function (ch) { var sid = String(ch.stream_id || ''); if (!sid) return; var work = cache[sid] ? Promise.resolve(cache[sid]) : xt('get_short_epg', '&stream_id=' + enc(sid) + '&limit=20').then(function (d) { var parsed = epgItemsFromResponse(d); cache[sid] = parsed; return parsed; }); jobs.push(work.then(function (epg) { collect(sid, ch.name || '', epg); }).catch(function () {})); })(channels[i]);
        Promise.all(jobs).then(finish);
    }).catch(function () { assistantToast('não foi possível consultar a programação agora'); });
    return true;
}
function showEpgToast(message, enabled) {
    var old = document.querySelector('.zx-epg-toast'); if (old && old.parentNode) old.parentNode.removeChild(old);
    var toast = document.createElement('div'); toast.className = 'zx-epg-toast' + (enabled ? ' is-enabled' : '');
    toast.innerHTML = '<span class="zx-epg-toast-icon">' + (enabled ? '🔔' : '🔕') + '</span><span>' + esc(message) + '</span>';
    document.body.appendChild(toast);
    setTimeout(function () { if (toast.parentNode) toast.parentNode.removeChild(toast); }, 3600);
}
function toggleEpgAlarm(btn) {
    var when = parseInt(btn.getAttribute('data-when') || '0', 10), title = btn.getAttribute('data-title') || '', channel = btn.getAttribute('data-channel') || '', sid = parseInt(btn.getAttribute('data-sid') || '0', 10), now = Date.now();
    if (!when || when <= now) { btn.title = 'Este programa já começou'; showEpgToast('Este programa já começou.', false); return; }
    var key = epgAlarmKey(when, title, channel), a = epgAlarms(), found = -1;
    for (var i = 0; i < a.length; i++) if (a[i].key === key) { found = i; break; }
    if (found >= 0) { a.splice(found, 1); btn.className = btn.className.replace(/\s*is-on\b/g, ''); btn.textContent = '🔕'; showEpgToast('Alerta removido.', false); }
    else { a.push({ key: key, when: when, title: title, channel: channel, sid: sid }); btn.className += ' is-on'; btn.textContent = '🔔'; showEpgToast('Te avisaremos quando sua programação começar.', true); }
    saveEpgAlarms(a);
}
function openScheduledEpgChannel(alarm) {
    try {
        if (getFormFactor() !== 'mobile') return;
        var sid = parseInt(alarm && alarm.sid || 0, 10), all = S.cat.live && S.cat.live.all || [];
        if (!sid && alarm && alarm.channel) {
            var wanted = norm(String(alarm.channel));
            for (var i = 0; i < all.length; i++) if (norm(String(all[i].name || '')) === wanted) { sid = parseInt(all[i].stream_id || 0, 10); break; }
        }
        if (!sid || !nativeAvail() || !global.HdxNative || !global.HdxNative.miniPlay) return;
        var item = null; for (var j = 0; j < all.length; j++) if (parseInt(all[j].stream_id || 0, 10) === sid) { item = all[j]; break; }
        var z = liveFullZapList(sid) || liveZapList(sid) || {};
        global.HdxNative.miniPlay(JSON.stringify({ kind: 'live', url: streamUrl('live', sid), title: (item && item.name) || alarm.channel || 'Canal', resume: 0, zxKind: 'live', zxId: sid, name: (item && item.name) || alarm.channel || 'Canal', zap: z.list || null, zap_index: z.index || 0 }));
    } catch (e) {}
}
function showEpgAlarm(alarm) {
    openScheduledEpgChannel(alarm);
    if (document.querySelector('.zx-epg-alarm-modal')) { global.__zxEpgAlarmQueue = global.__zxEpgAlarmQueue || []; global.__zxEpgAlarmQueue.push(alarm); return; }
    var n = 10, ov = document.createElement('div'); ov.className = 'zx-epg-alarm-modal'; ov.innerHTML = '<div class="zx-epg-alarm-card"><div class="zx-epg-alarm-bell">🔔</div><div class="zx-epg-alarm-title">Vai começar</div><div class="zx-epg-alarm-name">' + esc(alarm.title || 'Programa') + '</div><div class="zx-epg-alarm-channel">' + esc(alarm.channel || '') + '</div><div class="zx-epg-alarm-count" id="zxEpgAlarmCount">10</div><button type="button" class="zx-epg-alarm-close">Fechar</button></div>';
    document.body.appendChild(ov);
    var close = function () { if (ov.parentNode) ov.parentNode.removeChild(ov); if (ov.__timer) clearInterval(ov.__timer); var q = global.__zxEpgAlarmQueue || []; if (q.length) setTimeout(function () { showEpgAlarm(q.shift()); }, 120); };
    var b = ov.querySelector('.zx-epg-alarm-close'); if (b) b.addEventListener('click', close);
    ov.__timer = setInterval(function () { n--; var c = ov.querySelector('#zxEpgAlarmCount'); if (c) c.textContent = String(n); if (n <= 0) close(); }, 1000);
}
function startEpgAlarmWatcher() {
    if (global.__zxEpgAlarmTimer) return;
    global.__zxEpgAlarmTimer = setInterval(function () { var now = Date.now(), a = epgAlarms(), keep = []; for (var i = 0; i < a.length; i++) { if (a[i].when <= now && a[i].when > now - 12000) showEpgAlarm(a[i]); else if (a[i].when > now) keep.push(a[i]); } if (keep.length !== a.length) saveEpgAlarms(keep); }, 1000);
}
function installShim() {
    if (S._shim) return; S._shim = true;
    if (!global.Tv) global.Tv = {};
    var realGet = global.Tv.get, realPost = global.Tv.post;
    global.Tv.get = function (url, cb) { if (shimGet(url, function (d, st) { if (cb) cb(d, st); })) return; if (realGet) realGet(url, cb); };
    global.Tv.post = function (url, data, cb) { if (shimPost(url, data, function (d, st) { if (cb) cb(d, st); })) return; if (realPost) realPost(url, data, cb); };
}

/* ============================================================
 * ROTEADOR (History API → tv.js history.back() funciona)
 * ============================================================ */
function setHtml(html) { try { if (global.HdxNative && global.HdxNative.miniStop) global.HdxNative.miniStop(); } catch (e) {} root().innerHTML = brandLogoHtmlStyles() + html; translateTree(root()); applyAppTheme(appThemeId(), false); }
function afterRender() {
    try { if (global.__hdxTv && global.__hdxTv.afterSwap) global.__hdxTv.afterSwap(); } catch (e) {}
    try { installTrailerStyles(); } catch (e2) {}
    try {
        var d = document.querySelectorAll('.trailer-detail-btn,.poster-trailer-btn');
        for (var i = 0; i < d.length; i++) (function (btn) { if (btn.getAttribute('data-trailer-wired')) return; btn.setAttribute('data-trailer-wired', '1'); btn.addEventListener('click', function (e) { e.preventDefault(); e.stopPropagation(); openTrailer(btn.getAttribute('data-trailer-title') || '', btn.getAttribute('data-trailer-kind') || 'movie', btn.getAttribute('data-trailer-url') || ''); }); })(d[i]);
        } catch (e3) {}
    try { wireHomeQuickFavorites(); } catch (e4) {}
    try { wireRecommendationDismissals(); } catch (e5) {}
}
function wireHomeQuickFavorites() {
    var buttons = document.querySelectorAll('.zh-fav-quick');
    for (var i = 0; i < buttons.length; i++) (function (btn) {
        if (btn.getAttribute('data-fav-wired')) return;
        btn.setAttribute('data-fav-wired', '1');
        var kind = btn.getAttribute('data-home-fav-kind') || 'movie';
        var id = btn.getAttribute('data-home-fav-id') || '';
        var name = btn.getAttribute('data-home-fav-name') || '';
        var poster = btn.getAttribute('data-home-fav-poster') || '';
        function paint(on) {
            btn.textContent = on ? '♥' : '♡';
            btn.className = btn.className.replace(/\s*is-on\b/g, '') + (on ? ' is-on' : '');
            btn.setAttribute('aria-label', on ? 'Remover dos Favoritos' : 'Adicionar aos Favoritos');
            btn.setAttribute('title', on ? 'Remover dos Favoritos' : 'Adicionar aos Favoritos');
        }
        function toggle(e) {
            if (e && e.preventDefault) e.preventDefault();
            if (e && e.stopPropagation) e.stopPropagation();
            var on = favToggle(kind, id, name, poster);
            paint(on); updateFavCounts();
        }
        paint(inArr(S.fav[kind === 'series' ? 'series' : (kind === 'live' ? 'live' : 'movie')], id));
        btn.addEventListener('click', toggle);
        btn.addEventListener('keydown', function (e) { if (e.key === 'Enter' || e.key === ' ') toggle(e); });
    })(buttons[i]);
}
function recoHiddenList() { var d = lsGet('zx_reco_hidden'); return Array.isArray(d) ? d : []; }
function recoHiddenKey(kind, id) { return (kind === 'series' ? 'series' : 'movies') + ':' + String(parseInt(id, 10) || id); }
function hideRecommendation(kind, id) { var list = recoHiddenList(), k = recoHiddenKey(kind, id); if (list.indexOf(k) < 0) list.push(k); if (list.length > 120) list = list.slice(-120); lsSet('zx_reco_hidden', list); }
function wireRecommendationDismissals() {
    var cards = document.querySelectorAll('#zhRecoRow .zh-poster');
    for (var ci = 0; ci < cards.length; ci++) {
        var card = cards[ci], art = card.querySelector('.pt-img'), href = card.getAttribute('href') || '', mm = href.match(/^\/(movies|series)\/(\d+)/);
        if (art && mm && !art.querySelector('.zh-reco-dismiss')) {
            var rb = document.createElement('button'); rb.type = 'button'; rb.className = 'zh-reco-dismiss'; rb.textContent = '×'; rb.setAttribute('data-reco-kind', mm[1]); rb.setAttribute('data-reco-id', mm[2]); rb.setAttribute('aria-label', 'Não tenho interesse'); rb.setAttribute('title', 'Não tenho interesse'); rb.style.cssText = 'position:absolute;left:4px;top:4px;z-index:4;width:28px;height:28px;padding:0;border:1px solid rgba(255,255,255,.35);border-radius:50%;background:rgba(3,12,9,.86);color:#fff;font-size:22px;line-height:24px;text-align:center;cursor:pointer;'; art.appendChild(rb);
        }
    }
    var buttons = document.querySelectorAll('.zh-reco-dismiss');
    for (var i = 0; i < buttons.length; i++) (function (btn) {
        if (btn.getAttribute('data-reco-wired')) return;
        btn.setAttribute('data-reco-wired', '1');
        function dismiss(e) {
            if (e && e.preventDefault) e.preventDefault();
            if (e && e.stopPropagation) e.stopPropagation();
            hideRecommendation(btn.getAttribute('data-reco-kind') || 'movies', btn.getAttribute('data-reco-id') || '');
            var card = btn.parentNode; while (card && card !== document.body && String(card.className || '').indexOf('zh-poster') < 0) card = card.parentNode;
            if (card && card.parentNode) card.parentNode.removeChild(card);
            var sec = $('zhReco'), row = $('zhRecoRow'); if (sec && row && !row.children.length) sec.style.display = 'none';
            assistantToast('Recomendação ocultada');
        }
        btn.addEventListener('click', dismiss);
        btn.addEventListener('keydown', function (e) { if (e.key === 'Enter' || e.key === ' ') dismiss(e); });
    })(buttons[i]);
}
function runScript(src) { var s = document.createElement('script'); s.src = src; document.body.appendChild(s); }

// ⚠️ Em file:// NÃO se pode mexer na URL (pushState('/movies/123') viraria
// file:///movies/123 → ao Voltar/recarregar o WebView2 dá ERR_FILE_NOT_FOUND).
// Por isso navegamos SÓ pelo estado do histórico, mantendo a URL = index.html.
function patchHistory() {
    if (history.__zxPatched) return; history.__zxPatched = true;
    var op = history.pushState, orp = history.replaceState;
    // ignora o arg de URL (3º) → a URL nunca muda do index.html
    history.pushState = function (st, t) { return op.call(history, st, t); };
    // replaceState(null,...) (ex.: category_browser) NÃO apaga nosso estado.
    // ⚠️ MAS o caminho SPA tem que acompanhar a troca in-place de categoria
    // (o category_browser chama replaceState(null,'','/movies/category/N')):
    // sem isso, depois de uma virtual (Recém adicionados/Favoritos/Continue) o
    // estado ficava preso em /movies/recent e o Voltar de um detalhe caía na
    // virtual em vez da categoria real. Só filmes/séries — canais têm fluxo próprio.
    history.replaceState = function (st, t, u) {
        if (st == null && typeof u === 'string') {
            var p = u, b = global.__BASE || '';
            if (b && p.indexOf(b) === 0) p = p.slice(b.length) || '/';
            if (/^\/(movies|series)\/category\/\d+$/.test(p)) return orp.call(history, { zx: 1, p: p }, t);
        }
        return orp.call(history, (st == null ? history.state : st), t);
    };
}
function go(path, replace) {
    try { if (replace) history.replaceState({ zx: 1, p: path }); else history.pushState({ zx: 1, p: path }); } catch (e) {}
    render(path);
}
function render(path) {
    // Saindo do player? salva o progresso ANTES de trocar a tela (o evento
    // 'pause' NÃO dispara quando o <video> é removido do DOM, então só o save de
    // 10 em 10s pegava — quem saísse antes perdia a posição). Agora sempre salva.
    if (S.leavePlayer) { var lp = S.leavePlayer; S.leavePlayer = null; try { lp(); } catch (e) {} }
    if (S._avCleanup) { var ac = S._avCleanup; S._avCleanup = null; try { ac(); } catch (e) {} }   // Tizen: para/fecha o AVPlay ao sair
    path = path || '/home';
    // tira query pra rotear; guarda pra player
    var qIdx = path.indexOf('?'); var query = qIdx >= 0 ? path.slice(qIdx + 1) : ''; var p = qIdx >= 0 ? path.slice(0, qIdx) : path;
    var b = global.__BASE || ''; if (b && p.indexOf(b) === 0) p = p.slice(b.length) || '/';
    var m;
    // aviso de offline só na home (não por cima do conteúdo)
    S.onHome = (p === '/home' || p === '/' || p === '');
    try { applyOfflineHint(); } catch (e) {}
    if (p === '/login') return renderLogin();
    if (p === '/lists') return renderLists(query);
    if (p === '/home' || p === '/' || p === '') return renderHome();
    if (p === '/search') return renderUniversalSearch();
    if (p === '/session') return renderUltraSession();
    if (p === '/reload') return doReload();
    if (p === '/logout') return doLogout();
        if (p === '/settings') return renderSettings();
    if (p === '/radio') return renderRadioScreen();
    if (p === '/favorites') return renderFavHome();   // TODOS os favoritos (filmes+séries+canais)
    if (p === '/queue') return renderQueueHome();
    if (p === '/alerts') return renderAlertsHome();
    if (p === '/movies' || p === '/series' || p === '/live') return renderSection(p.slice(1), {});
    m = p.match(/^\/(movies|series)\/search$/); if (m) return renderSearch(m[1]);
    m = p.match(/^\/(movies|series)\/(favorites|recent|continue|top-rated|most-watched)$/); if (m) return renderSection(m[1], { virtual: m[2] });
    m = p.match(/^\/live\/(favorites|recent)$/); if (m) return renderSection('live', { virtual: m[1] });
    m = p.match(/^\/(movies|series)\/category\/(\d+)$/); if (m) return renderSection(m[1], { catId: m[2] });
    m = p.match(/^\/live\/category\/(\d+)$/); if (m) return renderSection('live', { catId: m[1] });   // categorias live normalmente carregam in-place; esta rota é p/ o pós-PIN de adulto (go('/live/category/X'))
    m = p.match(/^\/movies\/(\d+)\/play$/); if (m) return renderPlayerMovie(m[1], query);
    m = p.match(/^\/series\/(\d+)\/episode\/(\d+)\/play$/); if (m) return renderPlayerEpisode(m[1], m[2], query);
    m = p.match(/^\/live\/channel\/(\d+)$/); if (m) return renderPlayerLive(m[1], query);
    m = p.match(/^\/movies\/(\d+)$/); if (m) return ((S.playlistType || '').indexOf('m3u') === 0 && !S.xtreamDerived && !S.xtreamUnavailable) ? renderM3UDetail('movies', m[1]) : renderDetailMovie(m[1]);
    m = p.match(/^\/series\/(\d+)$/); if (m) return ((S.playlistType || '').indexOf('m3u') === 0 && !S.xtreamDerived && !S.xtreamUnavailable) ? renderM3UDetail('series', m[1]) : renderDetailSeries(m[1]);
    renderHome();
}

/* intercepta cliques internos + popstate */
function findAnchor(el) { while (el && el !== document) { if (el.tagName && el.tagName.toUpperCase() === 'A') return el; el = el.parentNode; } return null; }
function isLockedPill(a) { return a && a.querySelector && a.querySelector('.cat-lock'); }
function installRouter() {
    if (S._router) return; S._router = true;
    // ⚠️ ESCUTA NA WINDOW (capture) — roda ANTES dos handlers do tv.js (que ficam
    // no document e são registrados no parse, antes do boot). O tv.js tem um
    // handler que faz location.replace(a.href) em QUALQUER link .cat-pill/
    // .season-pill; em file:// isso vira location.replace("file:///home") =
    // ERR_FILE_NOT_FOUND (o "← Voltar" da sidebar é um .cat-pill href="/home" →
    // era exatamente esse o erro ao Voltar de dentro de uma categoria). Tratando
    // aqui e PARANDO a propagação, o location.replace do tv.js nunca dispara pra
    // navegação interna. (Pílulas de CATEGORIA seguem SEM parar → o
    // category_browser troca in-place; o tv.js já tem guard que ignora
    // /category/\d+. Cliques sem <a>/sem href — teclado, coração de canal,
    // tile de canal por data-href — caem nos `return` e passam adiante intactos.)
    global.addEventListener('click', function (e) {
        if (trailerClickFirst(e)) return;
        var a = findAnchor(e.target);
        if (!a) return;
        var href = a.getAttribute('href') || '';
        if (!href || href.charAt(0) === '#' || href.indexOf('javascript:') === 0) {
            if (href.indexOf('javascript:history.back()') === 0) { e.preventDefault(); e.stopImmediatePropagation(); history.back(); }
            return;
        }
        if (a.target === '_blank') return;
        // só internos (mesma origem / relativos)
        if (/^https?:\/\//i.test(href) && href.indexOf(location.origin) !== 0) return;
        var b = global.__BASE || ''; var path = href; if (b && path.indexOf(b) === 0) path = path.slice(b.length) || '/';
        // 🛡️ BLINDAGEM: é link INTERNO → mata JÁ a navegação NATIVA do <a>. Em
        // file:// um <a href="/x"> não-prevenido vira file:///x =
        // ERR_FILE_NOT_FOUND. Prevenindo aqui pra TODO link interno (categoria
        // inclusive), NENHUM clique interno derruba o app, mesmo que um handler
        // de baixo (category_browser/tv.js) falhe no futuro.
        e.preventDefault();
        // categorias normais: o category_browser troca in-place — deixamos a
        // propagação SEGUIR (só já prevenimos o default acima); o tv.js ignora
        // /category/\d+ pelo guard próprio.
        if (/^\/(movies|series|live)\/category\/\d+(\?|$)/.test(path)) {
            if (isLockedPill(a) && !S.adultOk) { e.stopImmediatePropagation(); promptPin(path); }
            return;
        }
        // TODO o resto (Voltar/home, busca, favoritos/recent/continue, detalhe,
        // play, settings…) é navegação do roteador local → PÁRA a propagação
        // (mata o location.replace do tv.js em file://).
        e.stopImmediatePropagation();
        // Abrindo um DETALHE a partir do catálogo → guarda a rolagem e quantos
        // tiles já estavam carregados; ao VOLTAR, renderVodSection re-renderiza a
        // mesma quantidade e devolve a rolagem (antes voltava pro TOPO da categoria
        // — pedido do Leonardo: "ficar em cima do filme que escolhi").
        var dm = path.match(/^\/(movies|series)\/\d+$/);
        if (dm) {
            var scEl = document.getElementById('sidebar-content');
            var grid = document.getElementById('content-grid');
            if (scEl && grid) {
                var sbEl = document.querySelector('.cat-sidebar');
                S.vodPos = { kind: dm[1], top: scEl.scrollTop, count: grid.children.length, href: path,
                             side: sbEl ? sbEl.scrollTop : 0 };
            }
        }
        // data-replace=1 (ex.: recomendados do detalhe) → SUBSTITUI no histórico
        // em vez de empilhar → Voltar cai na lista, não sobe de sugestão em
        // sugestão (mesma intenção do _similar_row.php do web).
        go(path, a.getAttribute('data-replace') === '1');
    }, true);
    global.addEventListener('popstate', function (e) { render((e.state && e.state.p) || '/home'); });
    // Botão VOLTAR do Android (chamado pelo MainActivity.handleBack): o APP decide.
    // Na tela INICIAL (home) ou no login → 'exit' (o Java mostra "Sair do app?").
    // Nas demais telas → volta UMA página. Sem isto o Java dava goBack() cego no
    // histórico do WebView e a home "voltava" pras telas do boot (ex.: Listas).
    global.__zxBackAction = function () {
        // Modais de perfil: Voltar sempre fecha e retorna à tela principal.
        var profileOverlay = document.getElementById('zx-prof-gate') || document.getElementById('zx-prof-ed') || document.getElementById('zx-prof-intro');
        if (profileOverlay) { try { profileOverlay.parentNode.removeChild(profileOverlay); } catch (e) {} try { document.body.classList.remove('tv-modal-open'); } catch (e2) {} try { go('/home', true); } catch (e3) {} return 'ok'; }
        // Modal do PIN adulto aberto? Voltar FECHA o modal (antes navegava a
        // página de trás com o modal ainda na tela).
        if (S.pinClose) { try { S.pinClose(); } catch (e) {} return 'ok'; }
        var p = '';
        try { p = (history.state && history.state.p) || ''; } catch (e) {}
        if (!p || p === '/home' || p === '/login') return 'exit';
        try { if (history.length > 1) { history.back(); return 'ok'; } } catch (e) {}
        try { go('/home', true); return 'ok'; } catch (e) {}
        return 'exit';
    };
    // fechar o app / minimizar no meio do filme → salva o progresso (sync no
    // localStorage via bumpContinue; o POST pode não completar, mas o "Continue
    // Assistindo" aparece no próximo abrir e a fila reenvia).
    global.addEventListener('pagehide', function () { if (S.leavePlayer) { try { S.leavePlayer(); } catch (e) {} } });
    document.addEventListener('visibilitychange', function () { if (document.hidden && S.leavePlayer) { try { S.leavePlayer(); } catch (e) {} } });
}

/* ============================================================
 * TELAS
 * ============================================================ */

/* ---- ATIVAÇÃO E LOGIN ---- */
var DIRECT_PANEL_BASE = 'https://renciaapp.manus.space/api/v5';
function macActivationStop() { try { if (S.macPoll) clearInterval(S.macPoll); } catch (e) {} S.macPoll = null; }
function macActivationCheck(mac, statusEl, button) {
    if (button) button.disabled = true;
    fetchT(DIRECT_PANEL_BASE + '/check_mac.php?mac=' + enc(mac), 10000).then(function (r) { return r.json(); }).then(function (j) {
        if (j && j.success && j.registered && directResponseToState(j, 'mac', mac)) { macActivationStop(); return; }
        if (statusEl) statusEl.textContent = 'Aguardando cadastro no painel para este MAC…';
    }).catch(function () { if (statusEl) statusEl.textContent = 'Sem conexão com o painel. Tentando novamente…'; }).then(function () { if (button) button.disabled = false; });
}
function renderMacActivation() {
    macActivationStop();
    var mac = getAppMac();
    var copied = 'MAC copiado';
    setHtml('<div class="zx-login-screen"><div class="zx-login-card zx-mac-activation">'
        + '<div class="zx-login-logo">' + brandLogoHtml() + '</div>'
        + '<h1 class="zx-login-h1">Ative seu Fusion</h1>'
        + '<div class="zx-login-sub">Copie este MAC e cadastre a lista no painel.</div>'
        + '<div class="zx-mac-value" id="zx-mac-value">' + esc(mac) + '</div>'
        + '<button type="button" class="zx-login-btn" id="zx-copy-mac">Copiar MAC</button>'
        + '<div id="zx-mac-status" class="zx-login-err" style="color:#b7c5be">Aguardando cadastro no painel…</div>'
        + '<button type="button" class="zx-login-alt" id="zx-login-alt">Entrar com usuário e senha</button>'
        + '</div></div>' + loginFormStyles() + '<style>.zx-mac-value{margin:18px 0;padding:16px 12px;border:1px solid rgba(76,232,240,.55);border-radius:12px;background:#07131a;color:#4ce8f0;font-size:24px;font-weight:800;letter-spacing:2px;text-align:center}.zx-login-alt{width:100%;margin-top:12px;padding:11px;border:1px solid rgba(255,255,255,.18);border-radius:11px;background:transparent;color:#cdd5d1;font-size:14px}.zx-login-alt:focus{outline:2px solid #4ce8f0}</style>');
    var status = $('zx-mac-status'), copy = $('zx-copy-mac'), alt = $('zx-login-alt');
    if (copy) copy.addEventListener('click', function () { try { if (navigator.clipboard) navigator.clipboard.writeText(mac); else { var ta = document.createElement('textarea'); ta.value = mac; document.body.appendChild(ta); ta.select(); document.execCommand('copy'); ta.remove(); } } catch (e) {} copy.textContent = copied; setTimeout(function () { if (copy) copy.textContent = 'Copiar MAC'; }, 1800); });
    if (alt) alt.addEventListener('click', function () { macActivationStop(); renderLogin(); });
    macActivationCheck(mac, status, null); S.macPoll = setInterval(function () { macActivationCheck(mac, status, null); }, 7000); afterRender();
}
/* ---- LOGIN ---- */
function directModeStored() { try { return localStorage.getItem('zx_direct_mode') || ''; } catch (e) { return ''; } }
function normalizeMacInput(v) { var hex = String(v || '').replace(/[^0-9a-f]/gi, '').toUpperCase().slice(0, 12), pairs = hex.match(/.{1,2}/g); return pairs ? pairs.join(':') : ''; }
function playlistToXtream(p, fallbackName) {
    try {
        var url = String((p && (p.playlist_url || p.url)) || '');
        var u = new URL(url);
        var user = u.searchParams.get('username') || '';
        var pass = u.searchParams.get('password') || '';
        if (!user || !pass) return null;
        return { server: u.protocol + '//' + u.host, user: user, pass: pass, name: (p.playlist_name || p.name || fallbackName || 'Playlist') };
    } catch (e) { return null; }
}
function directListModels(j) {
    if (!j || j.success === false || j.authorized === false) return [];
    var list = Array.isArray(j.playlists) ? j.playlists : (Array.isArray(j.lists) ? j.lists : (j.data && Array.isArray(j.data.playlists) ? j.data.playlists : []));
    if (!list.length && j.playlist_url) list = [{ playlist_url: j.playlist_url, playlist_name: j.playlist_name || 'Playlist' }];
    var available = [];
    for (var li = 0; li < list.length; li++) {
        var lp = list[li] || {}, lu = String(lp.playlist_url || lp.url || ''); if (!lu) continue;
        var lc = playlistToXtream(lp, 'Lista ' + (li + 1));
        var lsrv = lc ? lc.server : ''; try { if (!lsrv) { var lpu = new URL(lu); lsrv = lpu.protocol + '//' + lpu.host; } } catch (e) {}
        available.push({ id: String(li), name: String(lp.playlist_name || lp.name || lp.title || ('Lista ' + (li + 1))), url: lu, type: String(lp.type || (lu.indexOf('get.php') >= 0 ? 'm3u_plus' : 'xtream')).toLowerCase(), server: lsrv, expire_date: listExpiryValue(lp) || expiryFromListUrl(lu) || listExpiryValue(j) || '' });
    }
    return available;
}
function applyActiveDirectListExpiry(lists) {
    try {
        var all = Array.isArray(lists) ? lists : [], pick = activeListIndex();
        var p = all[pick] || all[0] || {}, raw = listExpiryValue(p), ts = expiryTimestamp(raw);
        S.info = S.info || {}; S.info.license = S.info.license || {};
        S.listExpiryTs = ts || 0;
        if (ts) { S.info.license.exp_date = ts; S.info.license.exp_display = ''; }
        else { delete S.info.license.exp_date; delete S.info.license.exp_display; }
    } catch (e) {}
}
function syncDirectListCache(done) {
    if (!S.directAuth || S.code !== '__mac__' || !S.user) { done(); return; }
    fetchT(DIRECT_PANEL_BASE + '/check_mac.php?mac=' + enc(S.user), 10000, { cache: 'no-store', credentials: 'omit', headers: { 'Accept': 'application/json', 'Cache-Control': 'no-cache', 'Pragma': 'no-cache' } }).then(function (r) { return r.json(); }).then(function (j) { var fresh = directListModels(j); if (fresh.length) { saveDirectPlaylists(fresh); S.directPlaylists = fresh; applyActiveDirectListExpiry(fresh); } }).catch(function () {}).then(done);
}
function fetchDirectListsForFailover() {
    var cached = loadDirectPlaylists();
    if (!S.directAuth || !S.user) return Promise.resolve(cached);
    return fetchT(DIRECT_PANEL_BASE + '/check_mac.php?mac=' + enc(S.user), 10000, { cache: 'no-store', credentials: 'omit', headers: { 'Accept': 'application/json', 'Cache-Control': 'no-cache', 'Pragma': 'no-cache' } })
        .then(function (r) { return r.json(); })
        .then(function (j) { var fresh = directListModels(j); if (fresh.length) { saveDirectPlaylists(fresh); S.directPlaylists = fresh; return fresh; } return cached; })
        .catch(function () { return cached; });
}
function failoverStorageKey(mac) { return 'zx_failover_transition_' + String(mac || '').replace(/[^0-9A-F]/gi, '').toUpperCase(); }
function failoverLastTransition(mac) { try { return localStorage.getItem(failoverStorageKey(mac)) || ''; } catch (e) { return ''; } }
function failoverSaveTransition(mac, id) { try { localStorage.setItem(failoverStorageKey(mac), String(id)); } catch (e) {} }
function chooseFailoverList(lists, d) {
    if (!lists || !lists.length) return -1;
    var state = String((d && d.failover_state) || '').toLowerCase();
    if (state === 'primary_restored') return 0;
    var wantedName = String((d && d.active_list_name) || '').trim().toLowerCase();
    if (wantedName) for (var i = 0; i < lists.length; i++) if (String(lists[i].name || '').trim().toLowerCase() === wantedName) return i;
    var n = parseInt(d && d.active_list_number, 10);
    if (n > 0 && n <= lists.length) return n - 1;
    return -1;
}
function switchDirectListBackground(index) {
    var lists = S.directPlaylists && S.directPlaylists.length ? S.directPlaylists : loadDirectPlaylists();
    var pick = parseInt(index, 10);
    if (!lists.length || isNaN(pick) || !lists[pick]) return false;
    var p = lists[pick], creds = playlistToXtream({ playlist_url: p.url, playlist_name: p.name, type: p.type }, p.name);
    if (!creds && !p.server) return false;
    var same = (parseInt(S.listIndex || activeListIndex(), 10) || 0) === pick && String(S.playlistUrl || '') === String(p.url || '');
    S.listIndex = pick; S.server = p.server || (creds && creds.server) || S.server; S.playlistUrl = p.url; S.playlistType = p.type || 'xtream'; S.xtreamDerived = creds; S.xtreamUnavailable = false; S._expirySourceChecked = '';
    applyActiveDirectListExpiry(lists);
    S.cat = { movies: null, series: null, live: null }; S.catPromises = {}; S.m3uCatalogPromise = null;
    try { localStorage.setItem('zx_list_index', String(pick)); } catch (e) {}
    saveCreds();
    setTimeout(function () { syncActivePlaylistExpiryFromSource(); }, 80);
    return !same;
}
function showListSyncToast(message) {
    if (!message) return;
    var old = $('zx-list-sync-toast'); if (old && old.parentNode) old.parentNode.removeChild(old);
    var el = document.createElement('div'); el.id = 'zx-list-sync-toast';
    el.style.cssText = 'position:fixed;left:50%;bottom:24px;transform:translateX(-50%);z-index:100001;max-width:min(760px,92vw);padding:14px 18px;border:1px solid #10b981;border-radius:12px;background:rgba(7,28,19,.97);color:#f4fff9;font:600 15px/1.4 system-ui,-apple-system,Segoe UI,sans-serif;box-shadow:0 10px 32px rgba(0,0,0,.5);text-align:center;';
    el.textContent = String(message);
    document.body.appendChild(el);
    setTimeout(function () { try { if (el.parentNode) el.parentNode.removeChild(el); } catch (e) {} }, 9000);
}
function processFailoverState(d, mac) {
    if (!d || d.playlist_sync_required !== true) return Promise.resolve(false);
    var transition = String(d.failover_transition_id || '');
    if (!transition || transition === failoverLastTransition(mac)) return Promise.resolve(false);
    return fetchDirectListsForFailover().then(function (lists) {
        var pick = chooseFailoverList(lists, d);
        if (pick < 0) return false;
        var changed = switchDirectListBackground(pick);
        failoverSaveTransition(mac, transition);
        var msg = String(d.playlist_sync_message || '');
        if (changed) refreshAfterPanelListSwitch(msg); else if (msg) showListSyncToast(msg);
        return changed;
    });
}
function directResponseToState(j, mode, fallback) {
    if (!j || j.success === false || j.authorized === false) return null;
    var available = directListModels(j);
    if (!available.length) return null;
    saveDirectPlaylists(available);
    var pick = activeListIndex(); if (pick >= available.length) pick = 0;
    var chosenInfo = available[pick], creds = null, chosen = null;
    chosen = { playlist_url: chosenInfo.url, playlist_name: chosenInfo.name, type: chosenInfo.type };
    creds = playlistToXtream(chosen, chosenInfo.name);
    var chosenUrl = chosenInfo.url; S.listIndex = pick;
    try { localStorage.setItem('zx_list_index', String(pick)); } catch (e) {}
    var server = creds ? creds.server : '';
    try { if (!server) { var pu = new URL(chosenUrl); server = pu.protocol + '//' + pu.host; } } catch (e) {}
    if (!server) return null;
    var exp = listExpiryValue(chosenInfo) || expiryFromListUrl(chosenUrl) || listExpiryValue(j) || null, expTs = expiryTimestamp(exp);
    S.directAuth = true;
    S.listExpiryTs = expTs || 0;
    S.code = mode === 'mac' ? '__mac__' : '__credentials__';
    S.user = mode === 'mac' ? String(j.mac || fallback || '') : String(fallback || j.username || '');
    S.pass = '__direct__'; S.did = getDid(); S.server = server;
    S.xtreamDerived = creds || playlistToXtream({ playlist_url: chosenUrl }, 'Playlist');
    S.xtreamUnavailable = false;
    S.playlistUrl = chosenUrl; S.playlistType = String(chosen.type || (chosenUrl.indexOf('get.php') >= 0 ? 'm3u_plus' : 'xtream')).toLowerCase(); S._expirySourceChecked = '';
    fetchUltraConfig();
    try { localStorage.setItem('zx_direct_mode', mode); if (mode === 'mac') localStorage.setItem('zx_mac', S.user); } catch (e) {}
    // check_mac.php é usado somente para autenticação e listas. O branding
    // visual do Fusion vem exclusivamente de ultra-config.
    var d = { ok: true, dns: { base: server, name: j.dns_titulo || '' }, license: { mac: j.mac || fallback || '', exp_date: expTs } };
    S.cat = { movies: null, series: null, live: null }; S.m3uCatalogPromise = null; S.xtreamUnavailable = false; S.favDirty = { live: [], movie: [], series: [] };
    applyResolve(d, false); saveSnap(d); saveCreds(); go('/home', true); setTimeout(function () { syncActivePlaylistExpiryFromSource(); }, 120); return true;
}
function renderLogin() {
    var c = loadCreds(), savedMac = ''; try { savedMac = localStorage.getItem('zx_mac') || ''; } catch (e) {}
    setHtml('<div class="zx-login-screen"><form class="zx-login-card" id="login-form" onsubmit="return false">'
        + '<div class="zx-login-logo">' + brandLogoHtml() + '</div>'
        + '<h1 class="zx-login-h1">Fusion</h1>'
        + '<div class="zx-login-sub">Escolha MAC ou usuário e senha.</div>'
        + loginFieldsHtml(savedMac || (c && c.user), c && c.user)
        + '</form></div>' + loginFormStyles());
    bindLoginForm(false); afterRender();
}
function loginErrShow(err, msg) { if (!err) return; err.textContent = msg; try { err.scrollIntoView({ block: 'nearest' }); } catch (e) {} }
function doLogin() {
    var mode = $('login-mode') ? $('login-mode').value : 'mac', err = $('login-err'), btn = $('login-submit');
    if (btn && btn.className.indexOf('is-loading') >= 0) return;
    if (btn) { btn.innerHTML = te('Entrando…'); btn.className += ' is-loading'; }
    var url, opts, fallback;
    if (mode === 'mac') {
        var mac = normalizeMacInput($('login-mac') ? $('login-mac').value : '');
        if (mac.replace(/:/g, '').length !== 12) { if (btn) btn.className = 'zx-login-btn'; loginErrShow(err, 'Digite um MAC com 12 dígitos hexadecimais.'); return; }
        fallback = mac; url = DIRECT_PANEL_BASE + '/check_mac.php?mac=' + enc(mac); opts = { credentials: 'omit' };
    } else {
        var user = ($('login-user') ? $('login-user').value : '').trim(), pass = $('login-pass') ? $('login-pass').value : '';
        if (!user || !pass) { if (btn) btn.className = 'zx-login-btn'; loginErrShow(err, t('Preencha tudo.')); return; }
        fallback = user; url = DIRECT_PANEL_BASE + '/login.php'; opts = { method: 'POST', credentials: 'omit', headers: { 'Content-Type': 'application/json', 'Accept': 'application/json', 'Cache-Control': 'no-cache' }, body: JSON.stringify({ username: user, email: user, password: pass }) };
    }
    fetchT(url, 12000, opts).then(function (r) { return r.text().then(function (text) { var j = null, ct = ''; try { ct = String((r.headers && r.headers.get('content-type')) || '').toLowerCase(); } catch (e0) {} try { j = JSON.parse(text); } catch (e) {} if (ct.indexOf('text/html') >= 0) j = { success: false, authorized: false, error: 'O painel ainda não publicou a rota JSON de usuário e senha. O endereço de login está devolvendo a tela HTML do painel.' }; else if (!j || typeof j !== 'object') j = { success: false, authorized: false, error: 'O painel respondeu HTTP ' + String(r.status || 0) + ' sem JSON.' }; j.__httpStatus = r.status; return j; }); }).then(function (j) {
        if (btn) { btn.innerHTML = te('Entrar'); btn.className = 'zx-login-btn'; }
        if (!directResponseToState(j, mode, fallback)) loginErrShow(err, j && j.error ? j.error : 'Não foi possível entrar. Confira os dados.');
    }).catch(function () { if (btn) { btn.innerHTML = te('Entrar'); btn.className = 'zx-login-btn'; } loginErrShow(err, 'Sem conexão. Tente de novo.'); });
}
/* ---- LISTAS ---- */
function loginFieldsHtml(macVal, userVal) {
    var mv = macVal && String(macVal).indexOf('__') !== 0 ? attr(normalizeMacInput(macVal)) : '', uv = userVal && String(userVal).indexOf('__') !== 0 ? attr(userVal) : '';
    return '<div class="zx-field"><label for="login-mode">Modo de acesso</label><select id="login-mode" class="zx-in"><option value="mac">MAC (12 dígitos)</option><option value="credentials">Usuário e senha</option></select></div>'
        + '<div class="zx-field" id="login-mac-wrap"><label for="login-mac">MAC do dispositivo</label><input type="text" id="login-mac" class="zx-in" value="' + mv + '" placeholder="AA:BB:CC:DD:EE:FF" maxlength="17" autocomplete="off" autocapitalize="characters" spellcheck="false"></div>'
        + '<div id="login-credentials-wrap" style="display:none"><div class="zx-field"><label for="login-user">Usuário ou e-mail</label><input type="text" id="login-user" class="zx-in" value="' + uv + '" placeholder="seu usuário ou e-mail" autocomplete="off" autocapitalize="none" spellcheck="false"></div>'
        + '<div class="zx-field"><label for="login-pass">Senha</label><input type="password" id="login-pass" class="zx-in" placeholder="sua senha" autocomplete="off"></div></div>'
        + '<button type="submit" class="zx-login-btn" id="login-submit">Entrar</button><div id="login-err" class="zx-login-err"></div>';
}
function bindLoginForm(skipPrefill) {
    var modeI = $('login-mode'), macI = $('login-mac'), userI = $('login-user'), passI = $('login-pass'), submitBtn = $('login-submit');
    function toggle() { var mac = modeI && modeI.value === 'mac'; if ($('login-mac-wrap')) $('login-mac-wrap').style.display = mac ? '' : 'none'; if ($('login-credentials-wrap')) $('login-credentials-wrap').style.display = mac ? 'none' : ''; if (macI) macI.focus(); else if (userI) userI.focus(); }
    if (modeI) { var stored = directModeStored(); if (stored === 'credentials') modeI.value = 'credentials'; modeI.addEventListener('change', toggle); toggle(); }
    if (macI) macI.addEventListener('input', function () { macI.value = normalizeMacInput(macI.value); });
    var lastEnter = 0;
    [macI, userI, passI].forEach(function (el) { if (!el) return; el.addEventListener('keydown', function (e) { if (e.key !== 'Enter' && e.keyCode !== 13) return; e.preventDefault(); var now = Date.now(); if (now - lastEnter < 400) return; lastEnter = now; try { el.blur(); } catch (_) {} doLogin(); }); });
    var f = $('login-form'); if (f) f.addEventListener('submit', function (e) { if (e && e.preventDefault) e.preventDefault(); doLogin(); });
    if (submitBtn) submitBtn.addEventListener('click', function (e) { e.preventDefault(); doLogin(); });
}

function loginFormStyles() {
    var a = S.accent || '#10b981';
    return '<style>'
        // SEM card: campos direto na tela (nada de caixa flutuante no meio que rola).
        + '.zx-login-screen{position:fixed;inset:0;display:flex;align-items:center;justify-content:center;background:radial-gradient(130% 100% at 50% 0%,#0e2019,#0a1712 45%,#050d09);padding:18px 20px;box-sizing:border-box;overflow:auto;font-family:system-ui,-apple-system,"Segoe UI",Roboto,sans-serif;}'
        + '.zx-login-card,.zx-login-flat-inner{width:100%;max-width:460px;margin:0 auto;background:none;border:0;box-shadow:none;padding:0;box-sizing:border-box;}'
        + '.zx-login-flat{padding:2px 22px 20px;box-sizing:border-box;font-family:system-ui,-apple-system,"Segoe UI",Roboto,sans-serif;}'
        + '.zx-login-logo{text-align:center;margin-bottom:4px;}.zx-login-logo .brand-logo{font-size:36px;font-weight:900;}'
        + '.zx-login-h1{color:#f4f7f5;font-size:23px;font-weight:800;text-align:center;margin:4px 0 2px;}'
        + '.zx-login-sub,.zx-login-tag{color:#9db0a7;font-size:14px;text-align:center;margin-bottom:16px;}'
        + '.zx-field{margin-bottom:9px;text-align:left;}'
        + '.zx-field label{display:block;color:#b7c5be;font-size:12.5px;font-weight:600;margin-bottom:4px;letter-spacing:.02em;}'
        + '.zx-in{width:100%;box-sizing:border-box;padding:10px 14px;border-radius:11px;border:1.5px solid rgba(255,255,255,.12);background:#0b1310;color:#f4f7f5;font-size:16px;font-family:inherit;outline:none;}'
        + '.zx-in::placeholder{color:#5f6f68;}'
        + '.zx-in:focus{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '33;}'
        + '.zx-login-btn{width:100%;margin-top:3px;padding:12px;border:0;border-radius:11px;background:' + a + ';color:#04231a;font-weight:800;font-size:16px;font-family:inherit;cursor:pointer;}'
        + '.zx-login-btn:active{opacity:.85;}.zx-login-btn:focus-visible{outline:3px solid #fff;outline-offset:2px;}'
        + '.zx-login-btn.is-loading{opacity:.7;}'
        + '.zx-login-err{color:#ff9098;text-align:center;font-size:14px;margin-top:8px;min-height:1px;}'
        + '</style>';
}
function listsStyles() {
    return '<style>'
        + '.zx-list-wrap{display:-webkit-box;display:flex;-webkit-box-pack:center;justify-content:center;padding:40px 20px}'
        + '.zx-list-card{width:760px;max-width:92%;background:rgba(20,26,24,.72);border:1px solid rgba(255,255,255,.08);border-radius:18px;padding:44px 40px;text-align:center}'
        + '.zx-list-cap{color:#9AA0AA;font-size:20px;font-weight:700;margin-bottom:18px}'
        + '.zx-list-ico{color:#10B981;margin-bottom:14px}'
        + '.zx-list-code{color:#fff;font-size:46px;font-weight:800;letter-spacing:1px;word-break:break-all}'
        + '.zx-list-user{color:#C8C8C8;font-size:22px;margin-top:8px;margin-bottom:30px}'
        + '.zx-list-swap{display:-webkit-inline-box;display:inline-flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;min-width:300px;padding:15px 36px;border-radius:10px;background:#10B981;color:#04231A;font-weight:800;font-size:20px;text-decoration:none}'
        + '.zx-list-swap:focus,.zx-list-swap.is-focus{outline:3px solid #fff}'
        + '.zx-list-form{margin:0 auto}'
        + '.server-screen{background:linear-gradient(145deg,var(--zx-bg,#06130f),#081711)!important;color:var(--zx-text,#f4fff9);}'
        + '.server-screen .search-topbar{background:transparent;border-bottom:1px solid rgba(255,255,255,.08);}'
        + '.server-list-body{padding:28px 22px;box-sizing:border-box;overflow:auto;}'
        + '.server-list-grid{width:min(920px,100%);margin:0 auto;display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:16px;}'
        + '.server-list-item{appearance:none;-webkit-appearance:none;width:100%;min-height:108px;display:flex;align-items:center;gap:16px;padding:18px 20px;border:1px solid color-mix(in srgb,var(--zx-accent,#10b981) 35%,transparent);border-radius:20px;background:linear-gradient(145deg,var(--zx-panel,#0d241a),rgba(255,255,255,.035));color:var(--zx-text,#f4fff9);text-align:left;font:inherit;cursor:pointer;box-sizing:border-box;transition:transform .15s ease,box-shadow .15s ease,border-color .15s ease;}'
        + '.server-list-item:hover,.server-list-item:focus,.server-list-item.is-active{border-color:var(--zx-accent,#10b981);background:linear-gradient(145deg,color-mix(in srgb,var(--zx-accent,#10b981) 20%,var(--zx-panel,#0d241a)),rgba(255,255,255,.05));outline:none;box-shadow:0 0 0 3px color-mix(in srgb,var(--zx-accent,#10b981) 28%,transparent),0 12px 30px rgba(0,0,0,.22);transform:translateY(-1px);}'
        + '.server-list-icon{width:54px;height:54px;flex:0 0 54px;display:flex;align-items:center;justify-content:center;border-radius:16px;background:color-mix(in srgb,var(--zx-accent,#10b981) 18%,transparent);color:var(--zx-accent,#10b981);}'
        + '.server-list-icon svg{width:34px;height:34px;}'
        + '.server-list-text{min-width:0;display:flex;flex-direction:column;gap:6px;flex:1;}'
        + '.server-list-text b{font-size:18px;line-height:1.15;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}'
        + '.server-list-text small{font-size:12px;color:var(--zx-muted,#9db0a7);white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}'
        + '.server-list-check{width:30px;height:30px;display:flex;align-items:center;justify-content:center;border:1px solid color-mix(in srgb,var(--zx-accent,#10b981) 45%,transparent);border-radius:50%;color:var(--zx-accent,#10b981);font-size:20px;font-weight:900;}'
        + '.server-list-note{width:min(920px,100%);margin:18px auto 0;color:var(--zx-muted,#9db0a7);font-size:13px;text-align:center;}'
        + '@media (max-width:800px){.server-list-grid{grid-template-columns:1fr;gap:12px;}.server-list-body{padding:18px 14px;}.server-list-item{min-height:86px;padding:14px 16px;border-radius:16px;}.server-list-icon{width:46px;height:46px;flex-basis:46px;border-radius:14px;}.server-list-icon svg{width:29px;height:29px;}.server-list-text b{font-size:15px;}.server-list-text small{font-size:11px;}}'
        + '</style>';
}
function switchDirectList(index) {
    var lists = loadDirectPlaylists(), pick = parseInt(index, 10) || 0;
    if (!lists.length || !lists[pick]) return;
    var p = lists[pick], creds = playlistToXtream({ playlist_url: p.url, playlist_name: p.name, type: p.type }, p.name);
    if (!creds && !p.server) return;
    S.listIndex = pick; S.server = p.server || (creds && creds.server) || S.server; S.playlistUrl = p.url; S.playlistType = p.type || 'xtream'; S.xtreamDerived = creds; S.xtreamUnavailable = false; S.cat = { movies: null, series: null, live: null }; S.m3uCatalogPromise = null;
    applyActiveDirectListExpiry(lists);
    try { localStorage.setItem('zx_list_index', String(pick)); } catch (e) {}
    saveCreds();
    go('/home', true);
}
function renderListsNow(query) {
    var c = loadCreds(), lists = loadDirectPlaylists();
    var hasList = !!(c && c.code && c.user && c.pass);
    var header = '<div class="search-topbar"><a href="/home" class="gt-back">← Voltar</a><div class="search-title">Servidor</div></div>';
    if (hasList && lists.length) {
        var h = '<div class="server-list-grid">';
        for (var i = 0; i < lists.length; i++) {
            var p = lists[i], active = (parseInt(c.listIndex || activeListIndex(), 10) || 0) === i;
            h += '<button type="button" class="server-list-item' + (active ? ' is-active' : '') + '" data-list-index="' + i + '"><span class="server-list-icon"><svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><rect x="3" y="4" width="18" height="6" rx="1"></rect><rect x="3" y="14" width="18" height="6" rx="1"></rect><circle cx="7" cy="7" r=".6" fill="currentColor"></circle><circle cx="7" cy="17" r=".6" fill="currentColor"></circle></svg></span><span class="server-list-text"><b>' + esc(p.name || ('Lista ' + (i + 1))) + '</b><small>' + esc(p.server || 'Lista autorizada') + '</small></span><span class="server-list-check">' + (active ? '✓' : '') + '</span></button>';
        }
        h += '</div><div class="server-list-note">As listas exibidas aqui são somente as cadastradas no painel para este aparelho.</div>';
        setHtml('<div class="search-screen server-screen">' + header + '<div class="search-body server-list-body">' + h + '</div></div>' + listsStyles() + flatStyles());
        var buttons = document.querySelectorAll('.server-list-item');
        for (var bi = 0; bi < buttons.length; bi++) buttons[bi].addEventListener('click', function () { switchDirectList(this.getAttribute('data-list-index')); });
        afterRender(); return;
    }
    setHtml('<div class="search-screen">' + header + '<div class="zx-login-flat"><form class="zx-login-flat-inner" id="login-form" onsubmit="return false">' + loginFieldsHtml(c && c.code, c && c.user) + '</form></div></div>' + loginFormStyles() + flatStyles());
    bindLoginForm(true); afterRender();
}
function renderLists(query) { syncDirectListCache(function () { renderListsNow(query); }); }
/* Tela cheia "Playlist não adicionada" — ao clicar numa seção sem ter lista. OK -> home. */
function renderNoPlaylist() {
    setHtml('<div class="zx-np-wrap"><div class="zx-np-box">'
        + '<div class="zx-np-t">Playlist não adicionada</div>'
        + '<div class="zx-np-d">Adicione uma lista no menu Playlist para começar a assistir.</div>'
        + '<a href="/home" class="zx-np-ok" autofocus>OK</a>'
        + '</div></div>'
        + '<style>.zx-np-wrap{position:fixed;top:0;left:0;right:0;bottom:0;width:100%;height:100%;display:-webkit-box;display:flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;padding:24px;text-align:center;box-sizing:border-box}.zx-np-box{max-width:660px}.zx-np-t{font-size:42px;font-weight:800;color:#fff;margin-bottom:14px}.zx-np-d{font-size:18px;color:#9fb3ab;margin-bottom:30px;line-height:1.45}.zx-np-ok{display:-webkit-inline-box;display:inline-flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;min-width:240px;padding:16px 40px;border-radius:10px;background:#10B981;color:#04231A;font-weight:800;font-size:20px;text-decoration:none}.zx-np-ok:focus,.zx-np-ok.is-focus{outline:3px solid #fff}</style>');
    afterRender();
}
// fromCache=true → veio do snapshot (offline): favoritos já carregados de zx_fav.
// fromCache=false → resolve fresco (online): reconcilia favoritos com o servidor.
/* RECEPTOR de playlist (página /playlist do site): o resolve pode trazer
   push:{ver,host,user,pass} = lista NOVA enviada pro MAC deste aparelho.
   Aplica UMA vez (guarda a ver em zx_pushver): salva as creds como se o
   cliente tivesse digitado e re-resolve. O painel marca 'applied' sozinho
   quando vê o novo usuário no registro. Sem push (o comum) é no-op. */
function applyPush(d) {
    var p = d && d.push;
    if (!p || !p.host || !p.user || !p.pass) return false;
    var ver = String(p.ver || '');
    var seen = '';
    try { seen = localStorage.getItem('zx_pushver') || ''; } catch (e) {}
    if (!ver || ver === seen) return false;
    try { localStorage.setItem('zx_pushver', ver); } catch (e) {}
    S.code = String(p.host); S.user = String(p.user); S.pass = String(p.pass);
    saveCreds();
    S.cat = { movies: null, series: null, live: null };   // catálogo vem FRESCO da lista nova
    try { if (global.HdxCache) HdxCache.bust(); } catch (e) {}
    api('resolve', '', 12000).then(function (nd) {
        if (nd && nd.error === 'license') { renderPaywall(nd); return; }   // lista nova mas segue vencido → paywall de novo
        if (nd && nd.ok && nd.dns && nd.dns.base) { stopPwPoll(); S.blocked = false; applyResolve(nd, false); saveSnap(nd); }
        go('/home', true);
    });
    return true;
}
function applyResolve(d, fromCache) {
    if (!fromCache && applyPush(d)) return;   // lista nova por push → aplica e re-resolve (1x, guardado por ver)
    if (d.dns && d.dns.base) S.server = d.dns.base;
    // Nome do DNS parceiro (setado no /admin/dns): o resolve só manda quando o
    // servidor tem server_code (parceiro). URL avulsa vem '' → home mostra a HORA.
    S.dnsName = (d.dns && typeof d.dns.name === 'string') ? d.dns.name.replace(/^\s+|\s+$/g, '') : '';
    S.info = d;
    try { global.__DNS = String((d.dns && (d.dns.host + ':' + d.dns.port)) || '0'); } catch (e) {}
    // O resolve de playlist não fornece branding do Fusion. O branding é
    // aplicado exclusivamente pela resposta ultra-config.
    fetchUltraConfig();
    // Favoritos/continue/recentes são LOCAIS agora (modelo HDX) — o painel NÃO
    // manda mais nada disso; ignora d.favorites. O resolve serve só pra
    // DNS + licença + branding + aviso.
}

/* ---- HOME ---- */
function normVoiceText(v) { return String(v || '').toLowerCase().normalize ? String(v || '').toLowerCase().normalize('NFD').replace(/[\u0300-\u036f]/g, '').replace(/[^a-z0-9]+/g, ' ').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '') : String(v || '').toLowerCase().replace(/[^a-z0-9]+/g, ' ').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, ''); }
function voiceCleanQuery(text) {
    var q = normVoiceText(text);
    q = q.replace(/^(abrir|abra|abre|assistir|assista|tocar|toque|ver|veja|mostrar|mostre|buscar|procure|procurar)\s+/, '');
    q = q.replace(/\b(um|uma|o|a|os|as|de|do|da|dos|das|canal|canais|filme|filmes|serie|series|série|séries)\b/g, ' ');
    return q.replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');
}
/* Ultra Assistente — primeira camada local e determinística. Ela resolve ações
   de navegação sem rede e deixa nomes de conteúdo seguirem para a busca já
   existente. Assim o comando continua rápido, privado e funciona offline. */
function assistantToast(text) {
    try {
        var old = $('zx-assistant-toast'); if (old && old.parentNode) old.parentNode.removeChild(old);
        var el = document.createElement('div'); el.id = 'zx-assistant-toast';
        el.style.cssText = 'position:fixed;left:50%;bottom:5.5vh;transform:translateX(-50%);z-index:100004;max-width:min(760px,88vw);padding:13px 20px;border:1px solid rgba(16,185,129,.75);border-radius:15px;background:rgba(4,25,17,.96);color:#f3fff8;font:700 clamp(14px,1.5vw,20px)/1.3 system-ui,-apple-system,Segoe UI,sans-serif;box-shadow:0 12px 36px rgba(0,0,0,.5);text-align:center;pointer-events:none;';
        el.textContent = 'Ultra Assistente: ' + String(text || 'Pronto'); document.body.appendChild(el);
        setTimeout(function () { try { if (el.parentNode) el.parentNode.removeChild(el); } catch (e) {} }, 1800);
    } catch (e) {}
}
function assistantStyles() {
    var a = S.accent || '#10b981';
    return '<style id="zx-assistant-css">.zx-assistant-panel{position:fixed;inset:0;z-index:100000;display:flex;align-items:center;justify-content:center;padding:20px;box-sizing:border-box;background:rgba(1,8,6,.72);backdrop-filter:blur(8px);color:#f5fff9}.zx-assistant-card{width:min(760px,94vw);max-height:min(760px,88vh);display:flex;flex-direction:column;overflow:hidden;border:1px solid ' + a + '88;border-radius:24px;background:linear-gradient(145deg,rgba(10,38,27,.98),rgba(4,14,10,.98));box-shadow:0 24px 80px rgba(0,0,0,.65)}.zx-assistant-head{display:flex;align-items:center;gap:12px;padding:18px 20px;border-bottom:1px solid rgba(255,255,255,.1)}.zx-assistant-head strong{font-size:clamp(18px,2vw,25px)}.zx-assistant-head small{display:block;margin-top:3px;color:#a9c2b4;font-size:12px}.zx-assistant-x{margin-left:auto;width:38px;height:38px;border:1px solid rgba(255,255,255,.18);border-radius:12px;background:transparent;color:#fff;font-size:22px;cursor:pointer}.zx-assistant-x:focus,.zx-assistant-mic:focus,.zx-assistant-send:focus,.zx-assistant-chip:focus{outline:3px solid #fff;box-shadow:0 0 0 5px ' + a + ';}.zx-assistant-messages{flex:1;min-height:150px;overflow:auto;padding:18px 20px;display:flex;flex-direction:column;gap:10px}.zx-assistant-msg{max-width:82%;padding:11px 14px;border-radius:15px;font-size:15px;line-height:1.35}.zx-assistant-msg.bot{align-self:flex-start;background:rgba(255,255,255,.08);color:#e7f5ed}.zx-assistant-msg.user{align-self:flex-end;background:' + a + '32;border:1px solid ' + a + '70;color:#fff}.zx-assistant-quick{display:flex;gap:8px;overflow-x:auto;padding:0 20px 12px}.zx-assistant-chip{flex:0 0 auto;padding:9px 12px;border:1px solid ' + a + '55;border-radius:999px;background:' + a + '16;color:#f5fff9;font-weight:700;font-size:12px;cursor:pointer}.zx-assistant-form{display:flex;gap:8px;padding:14px 20px 18px;border-top:1px solid rgba(255,255,255,.1)}.zx-assistant-input{flex:1;min-width:0;padding:13px 14px;border:1px solid ' + a + '66;border-radius:13px;background:#06130f;color:#fff;font-size:15px;outline:none}.zx-assistant-input:focus{border-color:#fff;box-shadow:0 0 0 3px ' + a + '55}.zx-assistant-mic,.zx-assistant-send{flex:0 0 auto;min-width:46px;padding:0 13px;border:1px solid ' + a + '77;border-radius:13px;background:' + a + '25;color:#fff;font-weight:800;cursor:pointer}.zx-assistant-mic.is-listening{background:' + a + '70;animation:zxVoicePulse 1s infinite}.zx-assistant-hint{padding:0 20px 12px;color:#91aa9d;font-size:12px}@media(max-width:700px){.zx-assistant-panel{align-items:flex-end;padding:8px}.zx-assistant-card{max-height:86vh;border-radius:20px}.zx-assistant-head{padding:13px 14px}.zx-assistant-messages{padding:14px}.zx-assistant-quick{padding:0 14px 10px}.zx-assistant-form{padding:10px 14px 14px}.zx-assistant-msg{font-size:14px;max-width:90%}}body.zx-ff-tv .zx-assistant-card{width:min(900px,82vw)}body.zx-ff-tv .zx-assistant-msg{font-size:18px}body.zx-ff-mobile .zx-assistant-card{width:min(700px,94vw)}body.zx-ff-mobile .zx-assistant-msg{font-size:15px}</style>';
}
function assistantAddMessage(text, who) {
    var box = $('zxAssistantMessages'); if (!box) return;
    var row = document.createElement('div'); row.className = 'zx-assistant-msg ' + (who === 'user' ? 'user' : 'bot'); row.textContent = String(text || ''); box.appendChild(row); box.scrollTop = box.scrollHeight;
}
function closeAssistantPanel() { var p = $('zx-assistant-panel'); if (p && p.parentNode) p.parentNode.removeChild(p); var st = $('zx-assistant-css'); if (st && st.parentNode) st.parentNode.removeChild(st); }
function assistantQuickReply(text) {
    var q = String(text || '').toLowerCase();
    if (/recomend|o que posso|sugest/.test(q)) return 'Na Home, a faixa Para você mostra sugestões baseadas no seu perfil. Também posso procurar filmes, séries ou canais por nome.';
    if (/paus/.test(q)) return 'Vou pausar o vídeo atual.';
    if (/continu/.test(q)) return 'Vou continuar a reprodução atual.';
    return 'Posso abrir Canais, Filmes, Séries, Rádios, Favoritos, Playlist, Configurações ou pesquisar um título.';
}
function assistantSubmit(text) {
    var raw = String(text || '').replace(/^\s+|\s+$/g, ''); if (!raw) return;
    assistantAddMessage(raw, 'user');
    var normalized = normVoiceText(raw);
    if (ultraSessionIntent(raw)) { closeAssistantPanel(); ultraSessionOpen(raw); return; }
    if (/^(o que posso assistir|me indique|recomendacoes|recomendacoes para mim|sugestoes)$/.test(normalized) || /\b(o que posso assistir|me indique algo|quero recomendacoes)\b/.test(normalized)) { assistantAddMessage(assistantQuickReply(raw), 'bot'); return; }
    if (voiceEpgIntent(raw)) { assistantAddMessage('Vou procurar a próxima programação e criar o aviso se ela estiver disponível.', 'bot'); return; }
    if (voiceEpgBrowseIntent(raw)) { assistantAddMessage('Mostrando a programação encontrada.', 'bot'); return; }
    if (runVoiceIntent(raw)) { assistantAddMessage(assistantQuickReply(raw), 'bot'); return; }
    assistantAddMessage('Vou pesquisar isso em Canais, Filmes e Séries.', 'bot'); closeAssistantPanel(); setTimeout(function () { runVoiceCommand(raw); }, 120);
}
function renderAssistantPanel() {
    if ($('zx-assistant-panel')) return;
    var old = $('zx-assistant-css'); if (old && old.parentNode) old.parentNode.removeChild(old);
    var panel = document.createElement('div'); panel.id = 'zx-assistant-panel'; panel.className = 'zx-assistant-panel'; panel.setAttribute('role', 'dialog'); panel.setAttribute('aria-label', 'Ultra Assistente');
    panel.innerHTML = '<div class="zx-assistant-card"><div class="zx-assistant-head"><div><strong>Ultra Assistente</strong><small>Toque no microfone para falar ou digite um comando</small></div><button type="button" class="zx-assistant-x" id="zxAssistantClose" aria-label="Fechar">×</button></div><div class="zx-assistant-messages" id="zxAssistantMessages"></div><div class="zx-assistant-quick"><button type="button" class="zx-assistant-chip" data-assistant="O que posso assistir agora?">Para você</button><button type="button" class="zx-assistant-chip" data-assistant="Abrir filmes">Filmes</button><button type="button" class="zx-assistant-chip" data-assistant="Abrir séries">Séries</button><button type="button" class="zx-assistant-chip" data-assistant="Abrir canais">Canais</button><button type="button" class="zx-assistant-chip" data-assistant="Pausar">Pausar</button></div><div class="zx-assistant-hint">Exemplos: “buscar The Walking Dead”, “abrir rádios”, “me avise quando começar o jornal”</div><form class="zx-assistant-form" id="zxAssistantForm"><input class="zx-assistant-input" id="zxAssistantInput" autocomplete="off" placeholder="Digite um comando…" aria-label="Comando para o Ultra Assistente"><button type="button" class="zx-assistant-mic" id="zxAssistantMic" aria-label="Falar">●</button><button type="submit" class="zx-assistant-send" aria-label="Enviar">OK</button></form></div>';
    document.body.appendChild(panel); var st = document.createElement('div'); st.innerHTML = assistantStyles(); document.head.appendChild(st.firstChild);
    assistantAddMessage('Olá! Posso pesquisar conteúdos, abrir telas, controlar o player e criar avisos no EPG.', 'bot');
    var close = $('zxAssistantClose'); if (close) close.addEventListener('click', closeAssistantPanel);
    var form = $('zxAssistantForm'), inp = $('zxAssistantInput'); if (form) form.addEventListener('submit', function (e) { e.preventDefault(); if (inp) { assistantSubmit(inp.value); inp.value = ''; } });
    var chips = panel.querySelectorAll('[data-assistant]'); for (var i = 0; i < chips.length; i++) (function (b) { b.addEventListener('click', function () { assistantSubmit(b.getAttribute('data-assistant') || ''); }); })(chips[i]);
    var mic = $('zxAssistantMic'); if (mic) mic.addEventListener('click', function () { startVoiceCommand(); });
    panel.addEventListener('keydown', function (e) { if (e.key === 'Escape' || e.keyCode === 27) { e.preventDefault(); closeAssistantPanel(); } });
    try { if (inp) inp.focus(); } catch (e) {}
}
function runVoiceIntent(text) {
    if (voiceEpgBrowseIntent(text)) return true;
    if (voiceEpgIntent(text)) return true;
    var cmd = normVoiceText(text).replace(/^(por favor|ultra player|ultra assistente)\s+/, '').replace(/^(abrir|abra|abre|ir para|va para|mostrar|mostre|acessar|acesse)\s+/, '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');
    var path = '', label = '';
    if (/^(home|inicio|tela inicial|pagina inicial)$/.test(cmd)) { path = '/home'; label = 'abrindo a tela inicial'; }
    else if (/^(tv ao vivo|canais|canais ao vivo|televisao|televisao ao vivo|epg|programacao)$/.test(cmd)) { path = '/live'; label = 'abrindo TV ao vivo'; }
    else if (/^(filmes?|cinema|vod)$/.test(cmd)) { path = '/movies'; label = 'abrindo Filmes'; }
    else if (/^(series?|novelas?|animes?)$/.test(cmd)) { path = '/series'; label = 'abrindo Séries'; }
    else if (/^(favoritos?|meus favoritos)$/.test(cmd)) { path = '/favorites'; label = 'abrindo Favoritos'; }
    else if (/^(minha fila|fila pessoal|fila de espera|o que guardei)$/.test(cmd)) { path = '/queue'; label = 'abrindo Minha Fila'; }
    else if (/^(limpar|esvaziar|apagar) (a )?(minha )?fila$/.test(cmd)) { if (queueList().length) showQueueClearConfirm(); else assistantToast('Sua fila já está vazia'); return true; }
    else if (/^(meus alertas|meus alarmes|avisos programados|alertas)$/ .test(cmd)) { path = '/alerts'; label = 'abrindo Meus Alertas'; }
    else if (/^(adicionar a fila|adicionar a minha fila|guardar na fila|ver depois|salvar para depois)$/.test(cmd)) { if (queueCurrentAction(false)) { assistantToast('adicionado à Minha Fila'); } else { assistantToast('Abra um conteúdo para adicionar à fila'); } return true; }
    else if (/^(remover da fila|tirar da fila|retirar da minha fila)$/.test(cmd)) { if (queueCurrentAction(true)) { assistantToast('removido da Minha Fila'); } else { assistantToast('Abra um conteúdo para remover da fila'); } return true; }
    else if (/^(playlist|listas?|servidor|trocar lista)$/.test(cmd)) { path = '/lists'; label = 'abrindo Playlist'; }
    else if (/^(configuracoes?|ajustes?)$/.test(cmd)) { path = '/settings'; label = 'abrindo Configurações'; }
    else if (/^(buscar|pesquisar|busca universal|buscar em tudo|pesquisar tudo)$/.test(cmd)) { path = '/search'; label = 'abrindo Busca em tudo'; }
    else if (/^(recarregar|atualizar|reload)$/.test(cmd)) { path = '/reload'; label = 'atualizando o aplicativo'; }
    else if (/^(favoritar|favorito|adicionar aos favoritos|salvar este|guardar este|remover dos favoritos|tirar dos favoritos)$/.test(cmd)) {
        var removeFav = /remover|tirar/.test(cmd), current = S.nativePlaying, fk = '', fid = '', fname = '', fposter = '';
        if (current && current.zxId) { fk = current.zxKind === 'series' ? 'series' : (current.zxKind === 'live' ? 'live' : 'movie'); fid = current.zxId; fname = current.name || current.title || ''; fposter = current.poster || ''; }
        var detailFav = $('btn-favorite');
        if (!fid && detailFav) { fk = detailFav.getAttribute('data-kind') || 'movie'; fid = detailFav.getAttribute('data-id') || ''; fname = detailFav.getAttribute('data-name') || ''; fposter = detailFav.getAttribute('data-poster') || ''; }
        if (!fid) { assistantToast('Abra um conteúdo para favoritar'); return true; }
        var favList = S.fav[fk] || [], already = inArr(favList, fid), shouldToggle = removeFav ? already : !already;
        if (shouldToggle) favToggle(fk, fid, fname, fposter);
        updateFavCounts(); assistantToast(removeFav ? (already ? 'removido dos favoritos' : 'já não estava nos favoritos') : (already ? 'já está nos favoritos' : 'adicionado aos favoritos')); return true;
    }
    else if (/^(silenciar|silencio|mutar|mudo|sem som)$/.test(cmd)) { try { if (global.HdxNative && global.HdxNative.miniMute) global.HdxNative.miniMute(); } catch (e) {} assistantToast('som silenciado'); return true; }
    else if (/^(aumentar volume|aumente o volume|mais volume|volume mais alto)$/.test(cmd)) { try { if (global.HdxNative && global.HdxNative.miniVolumeUp) global.HdxNative.miniVolumeUp(); } catch (e) {} assistantToast('volume aumentado'); return true; }
    else if (/^(diminuir volume|diminua o volume|menos volume|volume mais baixo)$/.test(cmd)) { try { if (global.HdxNative && global.HdxNative.miniVolumeDown) global.HdxNative.miniVolumeDown(); } catch (e) {} assistantToast('volume diminuído'); return true; }
    else if (/^(pausar|pause|pare o video|pare o filme|pare a serie)$/.test(cmd)) { try { if (global.HdxNative && global.HdxNative.miniPause) global.HdxNative.miniPause(); } catch (e) {} assistantToast('vídeo pausado'); return true; }
    else if (/^(continuar|retomar|retome|dar play|play)$/.test(cmd)) { try { if (global.HdxNative && global.HdxNative.miniResume) global.HdxNative.miniResume(); } catch (e) {} assistantToast('continuando a reprodução'); return true; }
    else if (/^(tela cheia|abrir tela cheia|aumentar a tela|expandir video)$/.test(cmd)) { try { if (global.HdxNative && global.HdxNative.miniFullscreen) global.HdxNative.miniFullscreen(); } catch (e) {} assistantToast('abrindo tela cheia'); return true; }
    else if (/^(voltar|volte|retornar)$/.test(cmd)) { assistantToast('voltando'); setTimeout(function () { try { history.back(); } catch (e) {} }, 120); return true; }
    else {
        var rm = cmd.match(/^radio(?:s)?(?:\s+online)?(?:\s+(gospel|rock|pop|sertanejo|classica|blues|jazz|metal|heavy metal|brasil))?$/);
        if (rm) {
            var map = { gospel: 'gospel', rock: 'rock', pop: 'pop', sertanejo: 'sertanejo', classica: 'classical', blues: 'blues', jazz: 'jazz', metal: 'metal', 'heavy metal': 'metal', brasil: 'brazil' };
            S.radioCategory = map[rm[1] || ''] || 'brazil'; path = '/radio'; label = 'abrindo Rádios' + (rm[1] ? ' • ' + rm[1] : '');
        }
    }
    if (!path) return false;
    closeAssistantPanel(); assistantToast(label); setTimeout(function () { go(path, false); }, 120); return true;
}
function voiceKind(text) {
    var q = normVoiceText(text);
    if (/\b(serie|series|novela|novelas|temporada|episodio|episodios|anime)\b/.test(q)) return 'series';
    if (/\b(filme|filmes|movie|movies|cinema|vod)\b/.test(q)) return 'movies';
    return 'live';
}
function voiceMatchScore(item, q, kind) {
    var n = normVoiceText(item && (item.name || item.title));
    if (!n || !q) return 0;
    var words = q.split(' ').filter(function (x) { return x.length > 0; });
    // Frases longas são pesquisadas como expressão contínua. Isso impede que
    // "The Big Bang Theory" vire uma busca por qualquer título que contenha só
    // a palavra "Big". Uma palavra isolada continua sendo ampla de propósito.
    if (words.length >= 2) {
        if (n === q) return 1000;
        if (n.indexOf(q) === 0) return kind === 'live' ? 950 : 900;
        if (n.indexOf(q) >= 0) return 850;
        return 0;
    }
    if (n === q) return 1000;
    if (kind === 'live' && n.indexOf(q) === 0) return 700;
    if (n.indexOf(q) === 0) return 650;
    if (n.indexOf(q) >= 0) return 500;
    return 0;
}
function voiceResultsStyles() {
    var a = S.accent || '#10b981';
    return '<style>'
        + '.voice-search-screen{position:fixed;inset:0;display:flex;flex-direction:column;overflow:hidden;background:var(--zx-bg,#06130f);color:var(--zx-text,#f4fff9);}'
        + '.voice-search-screen .voice-result-query{padding:14px 22px 8px;color:var(--zx-muted,#9db0a7);font-size:18px;flex:none;}.voice-search-screen .voice-result-query strong{color:var(--zx-text,#f4fff9);}'
        + '.voice-search-screen #voice-results{flex:1;min-height:0;overflow:auto;padding:12px 22px 26px;box-sizing:border-box;}'
        + '.voice-search-screen #voice-results.live-channels{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));align-content:start;gap:12px;}'
        + '.voice-search-screen .channel-tile-tv{position:relative;display:flex;align-items:center;min-height:88px;padding:10px 52px 10px 12px;box-sizing:border-box;border:1px solid ' + a + '35;border-radius:16px;background:linear-gradient(145deg,var(--zx-panel,#0d241a),rgba(255,255,255,.04));color:var(--zx-text,#f4fff9);text-decoration:none;overflow:hidden;}'
        + '.voice-search-screen .channel-tile-tv:hover,.voice-search-screen .channel-tile-tv:focus{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '33;outline:none;}'
        + '.voice-search-screen .ct-logo{width:62px;height:62px;flex:0 0 62px;margin-right:12px;border-radius:12px;background:' + a + '18;display:flex;align-items:center;justify-content:center;overflow:hidden;}'
        + '.voice-search-screen .ct-logo img{display:block;width:100%;height:100%;object-fit:contain;}.voice-search-screen .ct-fallback{font-size:25px;}'
        + '.voice-search-screen .ct-info{min-width:0;display:flex;flex-direction:column;gap:5px;}.voice-search-screen .ct-num{font-size:11px;color:var(--zx-muted,#9db0a7);}.voice-search-screen .ct-name{font-size:16px;font-weight:800;line-height:1.15;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}'
        + '.voice-search-screen .ct-fav{position:absolute;right:12px;top:50%;transform:translateY(-50%);width:34px;height:34px;border-radius:50%;display:flex;align-items:center;justify-content:center;background:rgba(0,0,0,.3);color:#fff;}.voice-search-screen .ct-fav svg{width:21px;height:21px;fill:none;stroke:currentColor;}'
        + '.voice-search-screen #voice-results.poster-grid{display:grid;grid-template-columns:repeat(6,minmax(0,1fr));gap:18px 12px;align-content:start;}.voice-search-screen #voice-results.poster-grid .poster-tile-tv{display:block;width:auto!important;margin:0!important;padding:0!important;color:var(--zx-text,#f4fff9);text-decoration:none;}.voice-search-screen .poster-tile-tv .pt-img{position:relative;width:100%;aspect-ratio:2/3;border-radius:12px;overflow:hidden;background:linear-gradient(145deg,' + a + '28,#101a16);}.voice-search-screen .poster-tile-tv .pt-img img{display:block;width:100%;height:100%;object-fit:cover;}.voice-search-screen .poster-tile-tv .pt-fallback{position:absolute;inset:0;display:flex;align-items:center;justify-content:center;color:#fff;font-size:28px;font-weight:900;background:linear-gradient(145deg,' + a + '55,#111a18);}.voice-search-screen .poster-tile-tv .pt-name{margin-top:7px;font-size:14px;line-height:1.2;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}'
        + '.voice-search-screen .zx-empty{padding:42px 20px;text-align:center;color:var(--zx-muted,#9db0a7);font-size:18px;}'
        + '@media (max-width:800px){.voice-search-screen .voice-result-query{padding:10px 14px 6px;font-size:15px;}.voice-search-screen #voice-results{padding:8px 14px 20px;}.voice-search-screen #voice-results.live-channels{grid-template-columns:1fr;gap:9px;}.voice-search-screen .channel-tile-tv{min-height:76px;padding:8px 48px 8px 10px;border-radius:13px;}.voice-search-screen .ct-logo{width:52px;height:52px;flex-basis:52px;margin-right:10px;}.voice-search-screen .ct-name{font-size:14px;}.voice-search-screen #voice-results.poster-grid{grid-template-columns:repeat(3,minmax(0,1fr));gap:14px 9px;}.voice-search-screen .poster-tile-tv .pt-name{font-size:12px;}}'
        + 'body.zx-ff-mobile .voice-search-screen #voice-results.live-channels{display:grid !important;grid-template-columns:repeat(2,minmax(280px,1fr)) !important;gap:14px !important;align-content:start !important;}'
        + 'body.zx-ff-mobile .voice-search-screen #voice-results.poster-grid{display:grid !important;grid-template-columns:repeat(auto-fill,minmax(132px,1fr)) !important;gap:12px 10px !important;align-content:start !important;}'
        + 'body.zx-ff-mobile .voice-search-screen .channel-tile-tv{min-height:92px !important;padding:11px 56px 11px 14px !important;}'
        + 'body.zx-ff-mobile .voice-search-screen .ct-logo{width:66px !important;height:66px !important;flex-basis:66px !important;margin-right:12px !important;}'
        + 'body.zx-ff-mobile .voice-search-screen .ct-name{font-size:16px !important;}'
        + 'body.zx-ff-mobile .voice-search-screen .poster-tile-tv .pt-name{font-size:12px !important;line-height:1.15 !important;}'
        + 'body.zx-ff-mobile .voice-search-screen .poster-tile-tv .pt-img{border-radius:9px !important;}'
        + '.voice-search-screen .voice-channel-card{position:relative;display:flex;align-items:center;min-height:104px;height:auto !important;padding:12px 58px 12px 14px;box-sizing:border-box;border:1px solid ' + a + '55;border-radius:16px;background:linear-gradient(145deg,var(--zx-panel,#0d241a),rgba(255,255,255,.04));color:var(--zx-text,#f4fff9);text-decoration:none;overflow:hidden;}'
        + '.voice-search-screen .voice-channel-logo{width:68px;height:68px;flex:0 0 68px;margin-right:14px;border-radius:12px;background:' + a + '18 center/contain no-repeat;display:flex;align-items:center;justify-content:center;overflow:hidden;font-size:28px;}'
        + '.voice-search-screen .voice-channel-logo.is-loaded span{display:none;}'
        + '.voice-search-screen .voice-channel-info{min-width:0;display:flex;flex-direction:column;gap:5px;overflow:hidden;}.voice-search-screen .voice-channel-info small{font-size:12px;color:var(--zx-muted,#9db0a7);}.voice-search-screen .voice-channel-info strong{font-size:17px;line-height:1.15;white-space:normal;overflow:hidden;display:-webkit-box;-webkit-line-clamp:2;-webkit-box-orient:vertical;}'
        + '.voice-search-screen .voice-channel-fav{position:absolute;right:14px;top:50%;transform:translateY(-50%);width:36px;height:36px;border-radius:50%;display:flex;align-items:center;justify-content:center;background:rgba(0,0,0,.3);color:#fff;font-size:29px;}'
        + 'body.zx-ff-mobile .voice-search-screen .voice-channel-card{min-height:112px !important;height:112px !important;padding:13px 60px 13px 14px !important;}'
        + 'body.zx-ff-mobile .voice-search-screen .voice-channel-logo{width:72px !important;height:72px !important;flex-basis:72px !important;}'
        + 'body.zx-ff-mobile .voice-search-screen .voice-channel-info strong{font-size:18px !important;}'
        + '</style>';
}
function voiceChannelTile(s, i) {
    var sid = parseInt(s.stream_id || 0, 10), name = s.name || 'Canal', logo = s.stream_icon || '', num = parseInt(s.num || (i + 1), 10);
    return '<a class="voice-channel-card" tabindex="0" data-sid="' + sid + '" data-name="' + attr(name) + '" data-logo="' + attr(logo) + '">' +
        '<div class="voice-channel-logo"' + (logo ? ' data-logo="' + attr(logo) + '"' : '') + '><span>📺</span></div>' +
        '<div class="voice-channel-info"><small>#' + num + '</small><strong>' + esc(name) + '</strong></div>' +
        '<span class="voice-channel-fav" aria-label="Favoritar canal">♡</span></a>';
}
function voiceChannelTiles(list) { var h = ''; for (var i = 0; i < list.length; i++) h += voiceChannelTile(list[i], i); return h; }
function loadVoiceChannelLogos() {
    try {
        var logos = document.querySelectorAll('.voice-search-screen .voice-channel-logo[data-logo]');
        for (var i = 0; i < logos.length; i++) (function (el) {
            if (el.getAttribute('data-loaded')) return;
            var src = el.getAttribute('data-logo') || ''; if (!src) return;
            el.setAttribute('data-loaded', '1');
            var im = new Image(); im.onload = function () { el.style.backgroundImage = "url('" + src.replace(/'/g, "\\'") + "')"; el.className += ' is-loaded'; }; im.src = src;
        })(logos[i]);
    } catch (e) {}
}
function loadVoicePosterImages() {
    try {
        var imgs = document.querySelectorAll('.voice-search-screen .pt-img[data-src]');
        for (var i = 0; i < imgs.length; i++) (function (el) {
            if (el.getAttribute('data-loaded')) return;
            var src = el.getAttribute('data-src') || ''; if (!src) return;
            el.setAttribute('data-loaded', '1');
            var im = new Image();
            im.onload = function () { el.style.backgroundImage = "url('" + src.replace(/'/g, "\\'") + "')"; el.className += ' is-loaded'; };
            im.onerror = function () { el.removeAttribute('data-loaded'); };
            im.src = src;
        })(imgs[i]);
    } catch (e) {}
}
function renderVoiceResults(kind, query, list) {
    var title = kind === 'live' ? 'Canais encontrados' : kind === 'movies' ? 'Filmes encontrados' : 'Séries encontradas';
    var body = kind === 'live' ? voiceChannelTiles(list) : posterTiles(list, kind);
    setHtml('<div class="search-screen voice-search-screen"><div class="search-topbar"><a href="/home" class="gt-back" autofocus>← Voltar</a><div class="search-title">' + esc(title) + '</div></div><div class="voice-result-query">Comando: <strong>' + esc(query) + '</strong></div><div id="voice-results" class="' + (kind === 'live' ? 'live-channels' : 'poster-grid') + '">' + (body || '<div class="zx-empty">Nenhum resultado encontrado.</div>') + '</div></div>' + flatStyles() + voiceResultsStyles());
    if (kind === 'live') {
        loadVoiceChannelLogos();
        var grid = $('voice-results'); if (grid) grid.addEventListener('click', function (e) { var row = e.target; while (row && row !== grid && !((' ' + (row.className || '') + ' ').indexOf(' voice-channel-card ') >= 0)) row = row.parentNode; if (!row || row === grid) return; e.preventDefault(); var sid = row.getAttribute('data-sid'), name = row.getAttribute('data-name') || ''; if (sid) playViaNative({ kind: 'live', url: streamUrl('live', sid), title: name, resume: 0, zxKind: 'live', zxId: sid, name: name, zap: liveFullZapList(sid) || liveZapList(sid) }); });
    } else { var pg = $('voice-results'); if (pg) { afterRender(); loadVoicePosterImages(); setTimeout(loadVoicePosterImages, 250); } }
    focusHomeStart();
}
function voiceSearchKind(kind, q) {
    return ensureCatalog(kind, true).then(function (cat) {
        var all = kidsFilterList((cat && cat.all) || []), scored = [];
        for (var i = 0; i < all.length; i++) { var sc = voiceMatchScore(all[i], q, kind); if (sc > 0) scored.push({ item: all[i], score: sc }); }
        scored.sort(function (a, b) { return b.score - a.score; });
        return { kind: kind, scored: scored };
    });
}
function universalSearchStyles() {
    var a = S.accent || '#10b981';
    return '<style>'
        + '.universal-search-screen{position:fixed;inset:0;display:flex;flex-direction:column;overflow:hidden;background:radial-gradient(130% 100% at 50% 0%,#0e2019,#06130f 48%,#040907);color:#f4fff9;}'
        + '.universal-search-screen .search-topbar{display:flex;align-items:center;gap:12px;padding:14px 20px 10px;flex:none;}'
        + '.universal-search-screen .search-title{font-size:24px;font-weight:900;white-space:nowrap;}'
        + '.universal-search-form{display:flex;gap:8px;align-items:center;padding:0 20px 12px;flex:none;}'
        + '.universal-search-form input{flex:1;min-width:0;padding:12px 15px;border:2px solid ' + a + '55;border-radius:12px;background:#06130f;color:#fff;font-size:17px;outline:none;}'
        + '.universal-search-form input:focus{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '33;}'
        + '.universal-search-form button{flex:0 0 auto;border:1px solid ' + a + '66;border-radius:12px;padding:12px 17px;background:' + a + '20;color:#fff;font-size:16px;font-weight:800;cursor:pointer;}'
        + '.universal-search-form button:focus{background:' + a + '45;border-color:#fff;outline:none;box-shadow:0 0 0 3px ' + a + '55;}'
        + '#zx-universal-status{padding:0 20px 10px;color:#9db0a7;font-size:14px;flex:none;}'
        + '#zx-universal-results{flex:1;min-height:0;overflow:auto;padding:0 20px 28px;}'
        + '.universal-section{margin:0 0 24px;}.universal-section h2{margin:0 0 10px;font-size:21px;font-weight:900;color:#fff;}.universal-section h2 span{color:#9db0a7;font-size:13px;font-weight:600;margin-left:8px;}'
        + '.universal-section .voice-search-screen{position:static;display:block;background:none;overflow:visible;}.universal-section .voice-channel-card{min-height:82px;}.universal-section .poster-grid{display:grid;grid-template-columns:repeat(6,minmax(0,1fr));gap:14px 10px;}'
        + '.universal-empty{padding:32px 12px;text-align:center;color:#9db0a7;font-size:17px;}'
        + '@media (max-width:800px){.universal-search-screen .search-topbar{padding:10px 12px 7px;}.universal-search-screen .search-title{font-size:19px;}.universal-search-form{padding:0 12px 9px;}.universal-search-form input{font-size:14px;padding:10px 11px;}.universal-search-form button{font-size:13px;padding:10px 12px;}#zx-universal-status,#zx-universal-results{padding-left:12px;padding-right:12px;}.universal-section h2{font-size:18px;}.universal-section .poster-grid{grid-template-columns:repeat(3,minmax(0,1fr));gap:12px 8px;}}'
        + 'body.zx-ff-mobile .universal-section .poster-grid{grid-template-columns:repeat(auto-fill,minmax(132px,1fr));}'
        + '</style>';
}
function universalSearchRun(query) {
    var q = normVoiceText(query || '');
    var status = $('zx-universal-status'), out = $('zx-universal-results');
    if (!q) { if (status) status.textContent = 'Digite um nome ou fale o que deseja encontrar.'; if (out) out.innerHTML = '<div class="universal-empty">Pesquise em Canais, Filmes e Séries ao mesmo tempo.</div>'; return; }
    if (status) status.textContent = 'Procurando em Canais, Filmes e Séries…';
    if (out) out.innerHTML = '<div class="universal-empty">Carregando resultados…</div>';
    showLoading(true);
    Promise.all(['live','movies','series'].map(function (kind) { return ensureCatalog(kind, true).then(function (cat) { var src = kidsFilterList((cat && cat.all) || []), rows = []; for (var i = 0; i < src.length; i++) { var sc = voiceMatchScore(src[i], q, kind); if (sc > 0) rows.push({ item: src[i], score: sc }); } rows.sort(function (x, y) { return y.score - x.score; }); return { kind: kind, rows: rows.slice(0, 36) }; }).catch(function () { return { kind: kind, rows: [] }; }); })).then(function (groups) {
        showLoading(false);
        var labels = { live: 'Canais', movies: 'Filmes', series: 'Séries' }, html = '';
        for (var i = 0; i < groups.length; i++) {
            var g = groups[i], list = g.rows.map(function (x) { return x.item; });
            if (!list.length) continue;
            var body = g.kind === 'live' ? voiceChannelTiles(list) : '<div class="poster-grid">' + posterTiles(list, g.kind) + '</div>';
            html += '<section class="universal-section"><h2>' + labels[g.kind] + '<span>' + list.length + ' resultado' + (list.length === 1 ? '' : 's') + '</span></h2>' + body + '</section>';
        }
        if (status) status.textContent = html ? 'Resultados para “' + query + '”.' : 'Nenhum resultado encontrado para “' + query + '”.';
        if (out) out.innerHTML = html || '<div class="universal-empty">Nenhum resultado encontrado.</div>';
        afterRender(); loadVoiceChannelLogos(); loadVoicePosterImages(); setTimeout(loadVoicePosterImages, 250);
        if (out) out.addEventListener('click', function (e) { var row = e.target; while (row && row !== out && !((' ' + (row.className || '') + ' ').indexOf(' voice-channel-card ') >= 0)) row = row.parentNode; if (!row || row === out) return; e.preventDefault(); var sid = row.getAttribute('data-sid'), name = row.getAttribute('data-name') || ''; if (sid) playViaNative({ kind: 'live', url: streamUrl('live', sid), title: name, resume: 0, zxKind: 'live', zxId: sid, name: name, zap: liveFullZapList(sid) || liveZapList(sid) }); });
        focusHomeStart();
    });
}
function renderUniversalSearch() {
    setHtml('<div class="search-screen universal-search-screen"><div class="search-topbar"><a href="/home" class="gt-back" autofocus>← Voltar</a><div class="search-title">Buscar em tudo</div></div><form class="universal-search-form" id="zx-universal-form" onsubmit="return false"><input id="zx-universal-query" type="search" autocomplete="off" placeholder="Canal, filme ou série…" aria-label="Buscar em tudo"><button type="submit">Buscar</button><button type="button" id="zx-universal-voice" title="Usar comando de voz" aria-label="Usar comando de voz">Falar</button></form><div id="zx-universal-status">Pesquise em Canais, Filmes e Séries ao mesmo tempo.</div><div id="zx-universal-results"><div class="universal-empty">Digite um nome para começar.</div></div></div>' + flatStyles() + voiceResultsStyles() + universalSearchStyles());
    var form = $('zx-universal-form'), inp = $('zx-universal-query');
    if (form) form.addEventListener('submit', function (e) { e.preventDefault(); universalSearchRun(inp ? inp.value : ''); });
    if (inp) inp.addEventListener('keydown', function (e) { if (e.key === 'Enter') { e.preventDefault(); universalSearchRun(inp.value); } });
    var vb = $('zx-universal-voice'); if (vb) vb.addEventListener('click', function () { go('/home', false); setTimeout(startVoiceCommand, 140); });
    afterRender(); try { if (inp) inp.focus(); } catch (e) {}
}
function chooseVoiceResult(found, q) {
    if (!found.length) return { kind: voiceKind(q), scored: [] };
    found.sort(function (a, b) { return (b.scored[0].score || 0) - (a.scored[0].score || 0); });
    var words = normVoiceText(q).split(' ').filter(function (x) { return x.length > 1; });
    var live = null, nonLive = [], exactSeries = null, exactMovie = null;
    for (var i = 0; i < found.length; i++) {
        if (found[i].kind === 'live') live = found[i]; else nonLive.push(found[i]);
        var topScore = found[i].scored && found[i].scored[0] ? (found[i].scored[0].score || 0) : 0;
        if (topScore >= 900 && found[i].kind === 'series') exactSeries = found[i];
        if (topScore >= 900 && found[i].kind === 'movies') exactMovie = found[i];
    }
    // Frase completa de série ganha prioridade quando a voz não pediu filme.
    // Assim "The Big Bang Theory" mostra somente as séries com esse título;
    // uma consulta de uma palavra, como "Big", continua ampla.
    if (words.length >= 2 && exactSeries && (!exactMovie || (exactSeries.scored[0].score || 0) >= (exactMovie.scored[0].score || 0))) return exactSeries;
    /* Títulos com duas ou mais palavras — como The Walking Dead — devem usar o
       catálogo de filmes/séries quando houver correspondência, mesmo que o
       servidor tenha canais com palavras soltas parecidas. */
    if (words.length >= 2 && nonLive.length) {
        nonLive.sort(function (a, b) { return (b.scored[0].score || 0) - (a.scored[0].score || 0); });
        var topNonLive = nonLive[0], topLive = live && live.scored[0] ? live.scored[0].score : 0;
        if ((topNonLive.scored[0].score || 0) >= 500 && (topNonLive.scored[0].score || 0) >= topLive - 100) return topNonLive;
    }
    return found[0];
}
function voiceExactHit(found, q, preferredKind) {
    var nq = normVoiceText(q), words = nq.split(' ').filter(function (x) { return x.length > 0; });
    if (words.length < 2) return null;
    var prefix = null;
    for (var i = 0; i < found.length; i++) {
        if (preferredKind && found[i].kind !== preferredKind) continue;
        var scored = found[i].scored || [];
        for (var j = 0; j < scored.length; j++) {
            var item = scored[j].item || {}, name = normVoiceText(item.name || item.title || '');
            if (name === nq) return { kind: found[i].kind, item: item };
            if (!prefix && name.indexOf(nq) === 0) prefix = { kind: found[i].kind, item: item };
        }
    }
    return prefix;
}
function playVoiceExact(hit) {
    try {
        if (!hit || !hit.item) return false;
        var item = hit.item, kind = hit.kind, id;
        if (kind === 'live') {
            id = parseInt(item.stream_id || 0, 10); if (!id) return false;
            playViaNative({ kind: 'live', url: streamUrl('live', id), title: item.name || 'Canal', resume: 0, zxKind: 'live', zxId: id, name: item.name || 'Canal', zap: liveFullZapList(id) || liveZapList(id) });
            return true;
        }
        // Filmes e séries nunca são iniciados automaticamente pela voz: uma busca
        // como "The Walking Dead" precisa mostrar todos os títulos encontrados para
        // o usuário escolher o filme ou a série correta. A abertura direta fica
        // reservada ao canal ao vivo com nome específico, como "Space HD".
    } catch (e) {}
    return false;
}
function runVoiceCommand(text) {
    var raw = String(text || '').trim();
    if (runVoiceIntent(raw)) return;
    var normalized = normVoiceText(raw), q = voiceCleanQuery(raw), explicitKind = /\b(filme|filmes|movie|movies|cinema|vod|serie|series|novela|novelas|temporada|episodio|episodios|anime)\b/.test(normalized), preferred = voiceKind(raw);
    if (ultraSessionIntent(raw)) { ultraSessionOpen(raw); return; }
    if (!q) { renderVoiceResults(preferred, raw, []); return; }
    showLoading(true);
    var order = explicitKind ? [preferred] : ['live', 'movies', 'series'];
    var found = [];
    function next(i) {
        if (i >= order.length) {
            showLoading(false);
            var best = chooseVoiceResult(found, q), exact = voiceExactHit(found, q, best.kind);
            if (!playVoiceExact(exact)) renderVoiceResults(best.kind, raw, best.scored.slice(0, 80).map(function (x) { return x.item; }));
            return;
        }
        voiceSearchKind(order[i], q).then(function (res) {
            if (res.scored.length) found.push(res);
            if (explicitKind) {
                showLoading(false);
                var exact = voiceExactHit([res], q, res.kind);
                if (!playVoiceExact(exact)) renderVoiceResults(res.kind, raw, res.scored.slice(0, 80).map(function (x) { return x.item; }));
                return;
            }
            next(i + 1);
        }).catch(function () { next(i + 1); });
    }
    next(0);
}
/* ---- UltraSession: intenção local + seleção explicável ---- */
function ultraSessionIntent(text) {
    var q = normVoiceText(text);
    return /\b(sessao|sessao personalizada|monte uma sessao|montar uma sessao|escolha para mim|escolher para mim|decida por mim|tenho \d+ minutos|tenho meia hora|tenho uma hora|quero algo para assistir|programacao para mim|o que posso assistir|me indique|recomendacoes?|parecid[oa]s? com|similar a)\b/.test(q) || /\b(me avise|avise|alerta)\b.*\b(escolha|escolher|monte|montar|crie|criar)\b/.test(q) || /\b(monte|montar|crie|criar)\b.*\b(sessao|programacao|programação)\b/.test(q) || /\b(?:\d{1,2}|um|uma|dois|duas|tres|três|quatro|cinco|seis|sete|oito|nove|dez|onze|doze)\s+(?:filmes?|series?|séries?|desenhos?|animes?|documentarios?|documentários?|canais?)\b/.test(q) || /\b(filmes?|series?|séries?|desenhos?|animes?|documentarios?|documentários?|canais?)\s+(?:de|com)\s+\w+/.test(q) || /\b(?:quero|gostaria|me mostre|me de|me dê|escolha|indique)\b.*\b(filmes?|series?|séries?|desenhos?|animes?|documentarios?|documentários?|canais?)\b/.test(q) || (/\b(desenho|desenhos|cartoon|animacao|anime|animes?)\b/.test(q) && /\b(quero|quero assistir|gostaria|assistir|ver|escolha|monte|indique|tenho|meia hora|uma hora)\b/.test(q));
}
var ULTRA_PARSE_GENRES = [
    ['comedy', ['comedia', 'comedias', 'comédia', 'comédias', 'comedy', 'sitcom', 'sitcoms', 'humor', 'engracado', 'engraçados', 'engraçada', 'engraçadas']],
    ['thriller', ['suspense', 'suspenses', 'thriller', 'thrillers', 'tensao', 'tensão']],
    ['mystery', ['misterio', 'misterios', 'mistério', 'mistérios', 'enigma', 'enigmas']],
    ['crime', ['crime', 'crimes', 'policial', 'policiais', 'mafioso', 'mafiosos', 'gangster', 'gangsters', 'investigacao criminal', 'investigação criminal']],
    ['action', ['acao', 'acoes', 'ação', 'ações', 'aventura', 'aventuras', 'adrenalina', 'super heroi', 'super-heroi']],
    ['horror', ['terror', 'terrores', 'horror', 'horrors', 'assustador', 'assustadores']],
    ['romance', ['romance', 'romances', 'romantico', 'românticos', 'romântico', 'romântica', 'românticas', 'amor', 'amores']],
    ['drama', ['drama', 'dramas', 'emocionante', 'emocionantes']],
    ['documentary', ['documentario', 'documentarios', 'documentário', 'documentários', 'fatos reais']],
    ['fantasy', ['fantasia', 'fantasias', 'magia', 'magias', 'reino fantastico', 'reino fantástico']],
    ['scifi', ['ficcao cientifica', 'ficcoes cientificas', 'ficção científica', 'ficções científicas', 'sci fi', 'sci-fi', 'espaco', 'espaço', 'futuro', 'futuros']],
    ['family', ['familia', 'familias', 'família', 'famílias', 'para a familia', 'para a família']],
    ['war', ['guerra', 'guerras', 'militar', 'militares', 'batalha', 'batalhas']],
    ['history', ['historico', 'historicos', 'histórico', 'históricos', 'de epoca', 'de época']],
    ['music', ['musical', 'musicais', 'concerto', 'concertos', 'show', 'shows', 'musica', 'música']],
    ['western', ['faroeste', 'faroestes', 'velho oeste', 'western']],
    ['kids', ['infantil', 'infantis', 'kids', 'criancas', 'crianças']]
];
function ultraTermInText(text, term) { var n = normVoiceText(term).replace(/^\s+|\s+$/g, ''); if (!n) return false; var e = n.replace(/[.*+?^${}()|[\]\\]/g, '\\$&'); return new RegExp('(^|\\s)' + e + '(?=\\s|$)').test(normVoiceText(text)); }
function ultraParseHas(q, words) { for (var i = 0; i < words.length; i++) if (ultraTermInText(q, words[i])) return true; return false; }
function ultraParseNumber(s) { var n = parseInt(s, 10); if (n) return n; return ({ um: 1, uma: 1, dois: 2, duas: 2, tres: 3, três: 3, quatro: 4, cinco: 5, seis: 6, sete: 7, oito: 8, nove: 9, dez: 10, onze: 11, doze: 12 }[s] || 0); }
function ultraSessionParseV2(raw) {
    var q = normVoiceText(raw), req = { raw: String(raw || ''), count: 0, duration_minutes: 0, mode: 'mixed', media_type: '', animation_subtype: '', genre: '', genres: [], mood: '', reference: '', avoid_repeats: false, family: false, safe_family: false, language: '', dubbed: false, subtitled: false, sort: '', alert_query: '' };
    var alertRe = /(?:me avise|avise|alerta|me lembra|me lembre)(?:\s+quando\s+(?:comecar|começar|iniciar))?\s+(?:o|a|um|uma)?\s*([^,;]+?)(?=\s+e\s+(?:escolha|monte|crie|quero)|$)/, am = q.match(alertRe);
    if (am) { req.alert_query = am[1].replace(/^\s+|\s+$/g, ''); q = q.replace(alertRe, ' '); }
    var cm = q.match(/\b(\d{1,2}|um|uma|dois|duas|tres|três|quatro|cinco|seis|sete|oito|nove|dez|onze|doze)\s+(?:filmes?|series?|séries?|desenhos?|animes?|documentarios?|documentários?|canais?)\b/); if (cm) req.count = Math.max(1, Math.min(30, ultraParseNumber(cm[1])));
    var dm = q.match(/\b(\d{1,3})\s*(?:minuto|minutos|min|m)\b/); if (dm) req.duration_minutes = Math.max(5, Math.min(480, parseInt(dm[1], 10) || 0));
    if (!req.duration_minutes && /\b(meia hora|trinta minutos)\b/.test(q)) req.duration_minutes = 30;
    if (!req.duration_minutes && /\b(uma hora|uma hora de duracao|uma hora de duração)\b/.test(q)) req.duration_minutes = 60;
    if (!req.duration_minutes && /\b(uma hora e meia)\b/.test(q)) req.duration_minutes = 90;
    var explicitSeries = /\b(series?|novelas?|temporadas?|episodios?)\b/.test(q), explicitMovies = /\b(filmes?|cinema|vod|documentarios?|documentários?)\b/.test(q), explicitLive = /\b(canais?|tv ao vivo|ao vivo|televisao|televisão)\b/.test(q);
    if (explicitSeries) req.mode = 'series'; else if (explicitMovies) req.mode = 'movies'; else if (explicitLive) req.mode = 'live'; else if (/\b(radios?|rádios?|radio online)\b/.test(q)) req.mode = 'radio';
    var anime = /\b(anime|animes)\b/.test(q), animation = /\b(desenho|desenhos|cartoon|animacao|anime|animes?)\b/.test(q); if (animation) { req.media_type = 'animation'; req.animation_subtype = anime ? 'anime' : 'cartoon'; if (!explicitSeries && !explicitMovies) req.mode = 'mixed'; req.genres.push('animation'); }
    for (var gi = 0; gi < ULTRA_PARSE_GENRES.length; gi++) { var pair = ULTRA_PARSE_GENRES[gi]; if (ultraParseHas(q, pair[1]) && req.genres.indexOf(pair[0]) < 0) req.genres.push(pair[0]); }
    var kidsAt = req.genres.indexOf('kids'); if (kidsAt >= 0) req.genres.splice(kidsAt, 1);
    req.genre = req.genres[0] || '';
    req.family = /\b(com meus filhos|com as criancas|com as crianças|para criancas|para crianças|familia|família|infantil|kids)\b/.test(q);
    req.safe_family = req.family || /\b(sem violencia|sem violência|seguro para criancas|seguro para crianças|para a familia|para a família)\b/.test(q);
    req.avoid_repeats = /\b(sem repetir|nao repetir|não repetir|novo|novidade|que eu ainda nao vi|que eu ainda não vi|diferente do que assisti)\b/.test(q);
    req.dubbed = /\b(dublado|dublada|dublados|dubladas)\b/.test(q); req.subtitled = /\b(legendado|legendada|legendados|legendadas)\b/.test(q);
    if (/\b(portugues|português|brasileiro|brasileira)\b/.test(q)) req.language = 'pt'; else if (/\b(ingles|inglês|english)\b/.test(q)) req.language = 'en'; else if (/\b(espanhol|espanhol)\b/.test(q)) req.language = 'es';
    if (/\b(maior nota|melhor avaliado|melhores notas|bem avaliado)\b/.test(q)) req.sort = 'top_rated'; else if (/\b(recem adicionados|recém adicionados|novos|novidades)\b/.test(q)) req.sort = 'recent'; else if (/\b(mais assistidos|mais vistos|populares)\b/.test(q)) req.sort = 'most_watched';
    var ref = q.match(/(?:parecid[oa]s?\s+com|similar\s+a|igual\s+a|como|no estilo de)\s+(.+)$/); if (ref) req.reference = ref[1].replace(/\s+(?:sem repetir|nao repetir|não repetir|novo|novidade)\b.*$/,'').trim();
    if (!req.reference) {
        var clean = q.replace(/\b\d{1,3}\s*(?:minuto|minutos|min|m)\b/g, ' ').replace(/\b(meia hora|trinta minutos|uma hora e meia|uma hora)\b/g, ' ');
        for (var ci = 0; ci < ULTRA_PARSE_GENRES.length; ci++) for (var cj = 0; cj < ULTRA_PARSE_GENRES[ci][1].length; cj++) clean = clean.replace(new RegExp('\\b' + ULTRA_PARSE_GENRES[ci][1][cj].replace(/[.*+?^${}()|[\\]\\\\]/g, '\\\\$&') + '\\b', 'g'), ' ');
        req.reference = clean.replace(/\b(monte|montar|crie|criar|sessao|sessão|escolha|escolher|decida|decidir|por mim|para mim|pra mim|para|pra|tenho|quero|gostaria|assistir|assistindo|ver|me mostre|me indique|o que posso|o que|posso|uma?|um|dois|duas|tres|três|quatro|cinco|seis|sete|oito|nove|dez|onze|doze|filme|filmes|serie|series|série|séries|desenho|desenhos|cartoon|animacao|anime|animes?|canais?|ao vivo|com|e|de|meus|minhas|filhos|criancas|crianças|familia|família|algo|leve|agora|hoje|sem repetir|nao repetir|não repetir|dublado|legendado|maior nota|recem adicionados|recém adicionados|mais assistidos|bem avaliado)\b/g, ' ').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');
    }
    if (/\b(leve|leveza|engracado|engraçado|comedia|comédia|rir|relaxar|calmo|dormir)\b/.test(q)) req.mood = 'leve'; else if (/\b(acao|ação|aventura|adrenalina)\b/.test(q)) req.mood = 'acao'; else if (/\b(suspense|terror|misterio|mistério|tenso)\b/.test(q)) req.mood = 'suspense'; else if (/\b(romance|romantico|romântico)\b/.test(q)) req.mood = 'romance'; else if (/\b(documentario|documentário|aprender|educativo)\b/.test(q)) req.mood = 'educativo';
    return req;
}
function ultraSessionParse(raw) {
    var q = normVoiceText(raw), req = { raw: String(raw || ''), count: 0, duration_minutes: 0, mode: 'mixed', genre: '', mood: '', reference: '', avoid_repeats: false, family: false, alert_query: '' };
    var alertRe = /(?:me avise|avise|alerta|me lembra|me lembre)(?:\s+quando\s+(?:comecar|começar|iniciar))?\s+(?:o|a|um|uma)?\s*([^,;]+?)(?=\s+e\s+(?:escolha|monte|crie|quero)|$)/;
    var am = q.match(alertRe); if (am) { req.alert_query = am[1].replace(/^\s+|\s+$/g, ''); q = q.replace(alertRe, ' '); }
    var countWords = { um: 1, uma: 1, dois: 2, duas: 2, tres: 3, três: 3, quatro: 4, cinco: 5, seis: 6, sete: 7, oito: 8, nove: 9, dez: 10, onze: 11, doze: 12 };
    var cm = q.match(/\b(\d{1,2}|um|uma|dois|duas|tres|três|quatro|cinco|seis|sete|oito|nove|dez|onze|doze)\s+(?:filmes?|series?|séries?)\b/); if (cm) req.count = Math.max(1, Math.min(30, parseInt(cm[1], 10) || countWords[cm[1]] || 0));
    var dm = q.match(/\b(\d{1,3})\s*(?:minuto|minutos|min|m)\b/); if (dm) req.duration_minutes = Math.max(5, Math.min(480, parseInt(dm[1], 10) || 0));
    if (!req.duration_minutes && /meia hora|trinta minutos/.test(q)) req.duration_minutes = 30;
    if (/\b(series?|novelas?|animes?|episodios?)\b/.test(q)) req.mode = 'series'; else if (/\b(filmes?|cinema|vod)\b/.test(q)) req.mode = 'movies'; else if (/\b(canais?|tv ao vivo|ao vivo|televisao|televisão)\b/.test(q)) req.mode = 'live'; else if (/\b(radios?|rádios?|radio online)\b/.test(q)) req.mode = 'radio';
    if (/\b(comedi[ay]|sitcom|humor|stand up|stand-up)\b/.test(q)) req.genre = 'comedy'; else if (/\b(crime|policial|investigacao|investigação|mafioso|gangster)\b/.test(q)) req.genre = 'crime'; else if (/\b(acao|ação|aventura|super heroi|super-heroi)\b/.test(q)) req.genre = 'action'; else if (/\b(terror|horror)\b/.test(q)) req.genre = 'horror'; else if (/\b(romance|romantico|romântico)\b/.test(q)) req.genre = 'romance'; else if (/\b(documentario|documentário)\b/.test(q)) req.genre = 'documentary'; else if (/\b(drama)\b/.test(q)) req.genre = 'drama'; else if (/\b(ficcao cientifica|ficção científica|sci fi|sci-fi)\b/.test(q)) req.genre = 'scifi';
    if (/\b(criancas?|crianças|filhos|infantil|familia|família|com meus filhos|com as criancas|com as crianças)\b/.test(q)) req.family = true;
    req.avoid_repeats = /\b(sem repetir|nao repetir|não repetir|novo|novidade|que eu ainda nao vi|que eu ainda não vi|diferente do que assisti)\b/.test(q);
    var ref = q.match(/(?:parecid[oa]s?\s+com|similar\s+a|igual\s+a|como)\s+(.+)$/); if (ref) req.reference = ref[1].replace(/\s+(?:sem repetir|nao repetir|não repetir|novo|novidade)\b.*$/,'').trim();
    if (!req.reference) {
        var clean = q.replace(/\b\d{1,3}\s*(?:minuto|minutos|min|m)\b/g, ' ').replace(/\b(meia hora|trinta minutos)\b/g, ' ').replace(/\b(sem repetir|nao repetir|não repetir|que eu ainda nao vi|que eu ainda não vi|diferente do que assisti)\b/g, ' ').replace(/\b(leve|leveza|engracado|engraçado|comedia|comédia|rir|relaxar|calmo|dormir|acao|ação|aventura|adrenalina|suspense|terror|misterio|mistério|tenso|romance|romantico|romântico|documentario|documentário|educativo|bem avaliado|mais bem avaliado|maior nota|mais assistido)\b/g, ' ');
        req.reference = clean.replace(/\b(monte|montar|crie|criar|uma?|sessao|sessão|personalizada|escolha|escolher|decida|decidir|por mim|para mim|pra mim|para|pra|tenho|com|e|de|meus|minhas|filhos|criancas|crianças|familia|família|algo|assistir|assistindo|ver|quero|gostaria|filme|filmes|serie|series|série|séries|canal|canais|ao vivo|o que posso|me indique|recomendacoes?|recomendações?|parecida?|parecidos?|parecidas?|agora|hoje)\b/g, ' ').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '');
    }
    if (/\b(leve|leveza|engracado|engraçado|comedia|comédia|rir|relaxar|calmo|dormir)\b/.test(q)) req.mood = 'leve';
    else if (/\b(acao|ação|aventura|adrenalina)\b/.test(q)) req.mood = 'acao';
    else if (/\b(suspense|terror|misterio|mistério|tenso)\b/.test(q)) req.mood = 'suspense';
    else if (/\b(romance|romantico|romântico)\b/.test(q)) req.mood = 'romance';
    else if (/\b(documentario|documentário|aprender|educativo)\b/.test(q)) req.mood = 'educativo';
    return req;
}
function ultraSessionId(kind, item) { item = item || {}; return String(kind === 'live' ? (item.stream_id || item.id || '') : kind === 'series' ? (item.series_id || item.stream_id || item.id || '') : (item.stream_id || item.id || '')); }
function ultraSessionWasWatched(kind, id) {
    id = String(id || ''); if (!id) return false;
    try {
        if (kind === 'live') { var r = recentLiveList(); for (var i = 0; i < r.length; i++) if (String(r[i].id) === id) return true; }
        if (kind === 'movies') { var p = getProgress('movie', id); if (p && (p.pos > 5 || (p.dur > 0 && p.pos === 0))) return true; }
        if (kind === 'series') { if (lsGet('zx_slast_' + id)) return true; }
        var keys = kind === 'series' ? ['zx_cont_series'] : kind === 'movies' ? ['zx_cont_vod'] : [];
        for (var k = 0; k < keys.length; k++) { var d = lsGet(keys[k]) || {}, its = d.items || []; for (var j = 0; j < its.length; j++) if (String(its[j].id) === id) return true; }
    } catch (e) {}
    return false;
}
function ultraSessionDuration(item) { item = item || {}; var v = item.duration || item.duration_secs || item.runtime || item.length || 0; if (typeof v === 'string') { var m = v.match(/(\d+)\s*(?:h|hora)/i), n = v.match(/(\d+)\s*(?:m|min)/i); if (m) return parseInt(m[1], 10) * 60 + (n ? parseInt(n[1], 10) : 0); } v = parseInt(v, 10) || 0; return v > 1000 ? Math.round(v / 60) : v; }
function ultraSessionReason(req, kind, item, rating, duration) {
    var text = normVoiceText([item.name, item.title, item.category_name, item.group, item.group_title].join(' ')), reasons = [];
    if (req.mode === kind) reasons.push(kind === 'movies' ? 'filme pedido' : kind === 'series' ? 'série pedida' : 'canal pedido');
    if (req.reference && voiceMatchScore(item, normVoiceText(req.reference), kind) > 0) reasons.push('parecido com ' + req.reference);
    if (rating && rating.vote_average > 0) reasons.push('TMDB ' + rating.vote_average.toFixed(1));
    if (req.mood && ((req.mood === 'leve' && /comedia|comédia|animacao|animação|familia|família|sitcom|romance/.test(text)) || (req.mood === 'acao' && /acao|ação|aventura|espionagem|super heroi|super-heroi/.test(text)) || (req.mood === 'suspense' && /terror|suspense|misterio|mistério|crime|thriller/.test(text)) || (req.mood === 'romance' && /romance|romantico|romântico|amor/.test(text)) || (req.mood === 'educativo' && /documentario|documentário|historia|história|ciencia|ciência/.test(text)))) reasons.push('combina com o clima ' + req.mood);
    if (req.duration_minutes && duration && duration <= req.duration_minutes + 10) reasons.push('duração compatível');
    if (inArr(S.fav[kind === 'live' ? 'live' : kind === 'series' ? 'series' : 'movie'], ultraSessionId(kind, item))) reasons.push('está nos seus favoritos');
    if (req.genre) reasons.push('gênero ' + req.genre);
    return reasons.slice(0, 3).join(' · ') || 'disponível na sua lista';
}
var ULTRA_GENRE_TERMS = {
    animation: ['desenho', 'desenhos', 'animacao', 'animacoes', 'animação', 'animações', 'cartoon', 'anime', 'animes'],
    comedy: ['comedia', 'comedias', 'comédia', 'comédias', 'comedy', 'sitcom', 'sitcoms', 'humor', 'stand up', 'stand-up'],
    thriller: ['suspense', 'suspenses', 'thriller', 'thrillers', 'tensao', 'tensão'],
    mystery: ['misterio', 'misterios', 'mistério', 'mistérios', 'enigma', 'enigmas', 'investigacao', 'investigação'],
    crime: ['crime', 'crimes', 'policial', 'policiais', 'investigacao criminal', 'investigação criminal', 'mafioso', 'mafiosos', 'gangster', 'gangsters'],
    action: ['acao', 'acoes', 'ação', 'ações', 'aventura', 'aventuras', 'super heroi', 'super-heroi', 'adrenalina'],
    horror: ['terror', 'terrores', 'horror', 'horrors', 'assustador', 'assustadores'],
    romance: ['romance', 'romances', 'romantico', 'românticos', 'romântico', 'romântica', 'românticas', 'amor', 'amores'],
    documentary: ['documentario', 'documentarios', 'documentário', 'documentários', 'fatos reais'],
    drama: ['drama', 'dramas', 'emocionante', 'emocionantes'],
    fantasy: ['fantasia', 'fantasias', 'magia', 'magias', 'reino fantastico', 'reino fantástico'],
    scifi: ['ficcao cientifica', 'ficcoes cientificas', 'ficção científica', 'ficções científicas', 'sci fi', 'sci-fi', 'espaco', 'espaço', 'futuro', 'futuros'],
    family: ['familia', 'familias', 'família', 'famílias', 'para criancas', 'para crianças'],
    kids: ['infantil', 'infantis', 'kids', 'criancas', 'crianças'],
    war: ['guerra', 'guerras', 'militar', 'militares', 'batalha', 'batalhas'],
    history: ['historico', 'historicos', 'histórico', 'históricos', 'de epoca', 'de época'],
    music: ['musical', 'musicais', 'concerto', 'concertos', 'show', 'shows', 'musica', 'música'],
    western: ['faroeste', 'faroestes', 'velho oeste', 'western']
};
var ULTRA_TMDB_GENRES = {
    movies: { animation: [16], comedy: [35], crime: [80], action: [28], thriller: [53], mystery: [9648], horror: [27], romance: [10749], documentary: [99], drama: [18], fantasy: [14], scifi: [878], family: [10751], war: [10752], history: [36], music: [10402], western: [37] },
    series: { animation: [16], comedy: [35], crime: [80], action: [10759], thriller: [9648, 80], mystery: [9648], horror: [27], romance: [10749], documentary: [99], drama: [18], fantasy: [10765], scifi: [10765], family: [10751, 10762], kids: [10762], war: [10768], history: [10768], music: [], western: [37] }
};
function ultraSessionGenrePass(req, kind, item, rating) {
    var wants = req.genres && req.genres.length ? req.genres.slice() : (req.genre ? [req.genre] : []); if (!wants.length) return true;
    var ids = rating && Array.isArray(rating.genre_ids) ? rating.genre_ids : [], map = ULTRA_TMDB_GENRES[kind] || {}, hay = normVoiceText([item && item.name, item && item.title, item && item.category_name, item && item.group, item && item.group_title].join(' '));
    if (req._genreDeferred) return true;
    for (var w = 0; w < wants.length; w++) {
        var wanted = map[wants[w]] || [], hasId = false;
        for (var wi = 0; wi < wanted.length; wi++) if (ids.indexOf(wanted[wi]) >= 0) { hasId = true; break; }
        if (hasId) continue;
        if (ids.length && wanted.length) return false;
        var terms = ULTRA_GENRE_TERMS[wants[w]] || (wants[w] === 'animation' ? ['desenho', 'animacao', 'cartoon', 'anime'] : []), hasText = false;
        for (var ti = 0; ti < terms.length; ti++) if (ultraTermInText(hay, terms[ti])) { hasText = true; break; }
        if (!hasText) return false;
    }
    return true;
}
function ultraSessionCandidate(req, kind, item) {
    item = item || {}; var id = ultraSessionId(kind, item), name = item.name || item.title || (kind === 'live' ? 'Canal' : kind === 'series' ? 'Série' : 'Filme'); if (!id || !name || isAdultName(name)) return null;
    if ((req.family || req.safe_family) && (isAdultName([name, item.category_name, item.group, item.group_title].join(' ')) || (kind !== 'live' && isAdultContent(kind === 'series' ? 'series' : 'movies', id, name)))) return null;
    if (req.avoid_repeats && ultraSessionWasWatched(kind, id)) return null;
    var text = normVoiceText([name, item.category_name, item.group, item.group_title].join(' ')), score = 10, rating = kind === 'live' ? null : tmdbRatingFor(kind, item), duration = ultraSessionDuration(item), match = req.reference ? voiceMatchScore(item, normVoiceText(req.reference), kind) : 0;
    if (!ultraSessionGenrePass(req, kind, item, rating)) return null;
    if (req.mode === kind) score += 180; else if (req.mode === 'mixed') score += 20; else score -= 40;
    if (match) score += Math.min(260, match / 3);
    if (rating && rating.vote_average > 0) score += rating.vote_average * 18 + Math.min(30, (rating.vote_count || 0) / 1000);
    if (req.duration_minutes && duration) score += duration <= req.duration_minutes + 10 ? 45 : duration <= req.duration_minutes + 30 ? 10 : -35;
    if (req.mood && text.indexOf(req.mood) >= 0) score += 25;
    if (req.genre) { var genreTerms = ULTRA_GENRE_TERMS[req.genre] || []; for (var gi = 0; gi < genreTerms.length; gi++) if (ultraTermInText(text, genreTerms[gi])) { score += 200; break; } }
    if (inArr(S.fav[kind === 'live' ? 'live' : kind === 'series' ? 'series' : 'movie'], id)) score += 18;
    if (queueHas(kind === 'movies' ? 'movies' : kind, id)) score += 12;
    var added = parseInt(item.added || item.last_modified || item.created_at || 0, 10) || 0; if (added) score += Math.min(20, added > 10000000000 ? (Date.now() - added) < 1209600000 ? 20 : 0 : 0);
    return { kind: kind, id: id, name: name, poster: item.stream_icon || item.cover || item.cover_big || item.icon || '', item: item, rating: rating, duration: duration, score: Math.round(score * 10) / 10, reason: ultraSessionReason(req, kind, item, rating, duration), href: kind === 'live' ? '' : kind === 'series' ? '/series/' + enc(id) : '/movies/' + enc(id) };
}
function ultraSessionSort(a, b) { return (b.score || 0) - (a.score || 0); }
function ultraSessionBuild(raw) {
    var req = ultraSessionParseV2(raw), kinds = req.mode === 'movies' ? ['movies'] : req.mode === 'series' ? ['series'] : req.mode === 'live' ? ['live'] : req.mode === 'radio' ? [] : ['movies', 'series', 'live'];
    if (req.media_type === 'animation' || (req.genres && req.genres.length)) { if (req.mode === 'mixed') kinds = ['movies', 'series']; else if (req.mode === 'live') kinds = []; }
    if (req.family && !req.genres.length && req.media_type !== 'animation' && kinds.indexOf('live') < 0 && req.mode === 'mixed') kinds.push('live');
    if (profKidsActive() && !profScheduleAllowed(profActive())) { renderUltraSession({ id: 'us_' + Date.now(), created_at: Date.now(), request: req, candidates: [], selected: [], status: 'draft', message: 'Este perfil infantil está fora do horário permitido.' }); return; }
    if (profKidsActive() && profLimit(profActive()) && profileUsageSeconds() >= profLimit(profActive()) * 60) { renderUltraSession({ id: 'us_' + Date.now(), created_at: Date.now(), request: req, candidates: [], selected: [], status: 'draft', message: 'O limite diário deste perfil infantil já foi atingido.' }); return; }
    req._genreDeferred = !!(req.genres && req.genres.length);
    showLoading(true); S.ultraSessionBusy = true;
    if (!kinds.length) { S.ultraSessionBusy = false; showLoading(false); var empty = { id: 'us_' + Date.now(), created_at: Date.now(), request: req, candidates: [], selected: [], status: 'draft', message: 'Na primeira versão, o UltraSession monta sessões com canais, filmes e séries. As rádios continuam disponíveis pela tela Rádios.' }; lsSet('zx_ultrasession_last', empty); renderUltraSession(empty); return; }
    Promise.all(kinds.map(function (kind) { return ensureCatalog(kind, true).then(function (cat) { var src = kidsFilterList((cat && cat.all) || []), out = []; for (var i = 0; i < src.length; i++) { var c = ultraSessionCandidate(req, kind, src[i]); if (c) out.push(c); } return { kind: kind, rows: out }; }).catch(function () { return { kind: kind, rows: [] }; }); })).then(function (groups) {
        var jobs = []; for (var j = 0; j < groups.length; j++) if (groups[j].kind !== 'live') { groups[j].rows.sort(ultraSessionSort); var lim = req.genres && req.genres.length ? Math.max(40, (req.count || 10) * 3) : 12; jobs.push(tmdbEnrichCatalog(groups[j].kind, groups[j].rows.slice(0, lim).map(function (x) { return x.item; }), lim).catch(function () {})); }
        return Promise.all(jobs).then(function () { req._genreDeferred = false; var all = []; for (var g = 0; g < groups.length; g++) for (var r = 0; r < groups[g].rows.length; r++) { var n = ultraSessionCandidate(req, groups[g].kind, groups[g].rows[r].item); if (n) all.push(n); } all.sort(ultraSessionSort); return all.slice(0, req.count || 18); });
    }).then(function (candidates) {
        var session = { id: 'us_' + Date.now(), created_at: Date.now(), request: req, constraints: { kids_profile: profKidsActive(), schedule_allowed: profScheduleAllowed(profActive()), daily_limit_remaining: Math.max(0, profLimit(profActive()) - Math.floor(profileUsageSeconds() / 60)), adult_blocked: profKidsActive() }, candidates: candidates || [], selected: candidates && candidates.length ? [candidates[0]] : [], status: candidates && candidates.length ? 'ready' : 'draft', message: candidates && candidates.length ? '' : 'Não encontrei candidatos suficientes na lista atual. Tente falar um gênero, título ou duração diferente.' };
        lsSet('zx_ultrasession_last', session); S.ultraSessionBusy = false; showLoading(false); renderUltraSession(session); if (req.alert_query) setTimeout(function () { voiceEpgIntent('me avise quando começar ' + req.alert_query); }, 120);
    }).catch(function () { S.ultraSessionBusy = false; showLoading(false); renderUltraSession({ id: 'us_' + Date.now(), created_at: Date.now(), request: req, candidates: [], selected: [], status: 'draft', message: 'Não foi possível montar a sessão agora. O catálogo normal continua disponível.' }); });
}

function ultraSessionOpen(text) {
    if (!S.server && !(S.directPlaylists || []).length) { assistantToast('Adicione uma lista antes de montar uma sessão'); go('/lists', false); return; }
    if (text) S.ultraSessionPending = String(text); else S.ultraSessionPending = '';
    closeAssistantPanel(); go('/session', false);
}
function ultraSessionStart(item) {
    var s = lsGet('zx_ultrasession_last') || {}, p = profActive();
    if (p && p.kids && !profScheduleAllowed(p)) { showKidsScheduleModal(); return; }
    if (p && p.kids && profLimit(p) && profileUsageSeconds() >= profLimit(p) * 60) { showKidsLimitModal(); return; }
    if (!item) { assistantToast('Escolha uma sugestão primeiro'); return; }
    s.selected = [item]; s.status = 'playing'; lsSet('zx_ultrasession_last', s);
    if (item.kind === 'live') { playViaNative({ kind: 'live', url: streamUrl('live', item.id), title: item.name, resume: 0, zxKind: 'live', zxId: item.id, name: item.name, poster: item.poster, zap: liveFullZapList(item.id) || liveZapList(item.id) }); return; }
    if (item.kind === 'series') { go('/series/' + enc(item.id), false); return; }
    go('/movies/' + enc(item.id), false);
}
function ultraSessionSwap() {
    var s = lsGet('zx_ultrasession_last') || {}, list = s.candidates || []; if (list.length < 2) { assistantToast('Não encontrei outra sugestão agora'); return; }
    var first = list.shift(); list.push(first); s.candidates = list; s.selected = [list[0]]; lsSet('zx_ultrasession_last', s); renderUltraSession(s);
}
function ultraSessionStyles() {
    var a = S.accent || '#10b981';
    return '<style id="zx-ultrasession-css">.zx-us-screen{position:fixed;inset:0;display:flex;flex-direction:column;overflow:hidden;background:radial-gradient(120% 100% at 50% 0%,#10251c,#06130f 48%,#030806);color:#f4fff9}.zx-us-top{display:flex;align-items:center;gap:12px;padding:14px 22px 10px;flex:none}.zx-us-top .gt-back{color:#fff;text-decoration:none;border:1px solid ' + a + '66;border-radius:11px;padding:8px 14px;background:' + a + '16}.zx-us-title{font-size:clamp(21px,2.4vw,32px);font-weight:900}.zx-us-mic{margin-left:auto;border:1px solid ' + a + '77;border-radius:11px;background:' + a + '22;color:#fff;padding:10px 15px;font-weight:800}.zx-us-mic:focus,.zx-us-form button:focus,.zx-us-action:focus,.zx-us-card:focus{outline:3px solid #fff;box-shadow:0 0 0 4px ' + a + '66}.zx-us-intro{padding:0 22px 12px;color:#b8cbc1;font-size:14px;flex:none}.zx-us-form{display:flex;gap:8px;padding:0 22px 12px;flex:none}.zx-us-form input{flex:1;min-width:0;border:1px solid ' + a + '77;border-radius:12px;background:#06130f;color:#fff;padding:12px 14px;font-size:16px}.zx-us-form button,.zx-us-action{border:1px solid ' + a + '77;border-radius:12px;background:' + a + '28;color:#fff;padding:12px 16px;font-weight:900}.zx-us-status{padding:0 22px 12px;color:#d9eee3;font-size:14px;flex:none}.zx-us-grid{flex:1;min-height:0;overflow:auto;padding:0 22px 28px;display:grid;grid-template-columns:repeat(auto-fill,minmax(180px,1fr));gap:14px;align-content:start}.zx-us-card{position:relative;display:flex;flex-direction:column;min-width:0;padding:0 0 12px;border:1px solid rgba(255,255,255,.12);border-radius:15px;background:rgba(255,255,255,.055);color:#fff;text-align:left;overflow:hidden;cursor:pointer}.zx-us-card.is-selected{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '55}.zx-us-poster{width:100%;aspect-ratio:2/3;background:linear-gradient(145deg,' + a + '44,#101815) center/cover no-repeat}.zx-us-copy{padding:9px 11px 0}.zx-us-name{display:block;font-weight:900;font-size:15px;line-height:1.2;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.zx-us-meta{display:block;margin-top:5px;color:#b8cbc1;font-size:12px}.zx-us-reason{display:block;margin-top:6px;color:#d9eee3;font-size:11px;line-height:1.25}.zx-us-actions{display:flex;gap:10px;flex:none;padding:10px 22px 18px}.zx-us-action{min-width:150px}.zx-us-empty{grid-column:1/-1;padding:42px 18px;text-align:center;color:#a9bdb2;font-size:17px}.zx-us-note{padding:0 22px 12px;color:#ffc86b;font-size:13px}@media(max-width:700px){.zx-us-top{padding:10px 12px 8px}.zx-us-intro,.zx-us-form,.zx-us-status,.zx-us-actions{padding-left:12px;padding-right:12px}.zx-us-grid{padding:0 12px 24px;display:flex;flex-direction:column;gap:14px;align-items:stretch}.zx-us-name{font-size:15px}.zx-us-reason{font-size:12px;line-height:1.35}.zx-us-card{width:100%;display:grid;grid-template-columns:minmax(170px,34vw) minmax(0,1fr);min-height:260px;align-items:stretch}.zx-us-poster{height:100%;min-height:260px;aspect-ratio:auto;background-size:cover}.zx-us-copy{display:flex;flex-direction:column;justify-content:center;padding:16px}.zx-us-meta{font-size:13px;line-height:1.35}.zx-us-actions{gap:7px}.zx-us-action{min-width:0;flex:1;padding:10px 9px;font-size:13px}}body.zx-ff-tv .zx-us-grid{grid-template-columns:repeat(auto-fill,minmax(220px,1fr))}body.zx-ff-tv .zx-us-card{min-height:360px}body.zx-ff-tv .zx-us-name{font-size:18px}body.zx-ff-mobile .zx-us-screen{overflow:hidden}body.zx-ff-mobile .zx-us-grid{display:flex;flex-direction:column;align-items:stretch;gap:16px;overflow-y:auto;overflow-x:hidden;padding:0 14px 30px;width:100%;box-sizing:border-box}body.zx-ff-mobile .zx-us-card{display:grid;grid-template-columns:38% 62%;width:100%;min-height:280px;height:280px;padding:0;border-radius:16px;box-sizing:border-box}body.zx-ff-mobile .zx-us-poster{width:100%;height:100%;min-height:280px;aspect-ratio:auto;background-size:cover;background-position:center}body.zx-ff-mobile .zx-us-copy{display:flex;flex-direction:column;justify-content:center;min-width:0;padding:18px}body.zx-ff-mobile .zx-us-name{font-size:17px;line-height:1.25;white-space:normal;display:-webkit-box;-webkit-line-clamp:3;-webkit-box-orient:vertical;overflow:hidden}body.zx-ff-mobile .zx-us-meta{font-size:13px;line-height:1.4}body.zx-ff-mobile .zx-us-reason{font-size:12px;line-height:1.4;white-space:normal}body.zx-ff-mobile .zx-us-actions{padding-bottom:20px}</style>';
}
function ultraSessionLoadPosters() { try { var els = document.querySelectorAll('.zx-us-poster[data-src]'); for (var i = 0; i < els.length; i++) (function (el) { if (el.getAttribute('data-loaded')) return; var src = el.getAttribute('data-src') || ''; if (!src) return; el.setAttribute('data-loaded', '1'); var im = new Image(); im.onload = function () { el.style.backgroundImage = "url('" + src.replace(/'/g, "\\'") + "')"; var f = el.querySelector('.pt-fallback'); if (f) f.style.display = 'none'; }; im.onerror = function () { el.removeAttribute('data-loaded'); }; im.src = src; })(els[i]); } catch (e) {} }
function renderUltraSession(session) {
    session = session || lsGet('zx_ultrasession_last') || null;
    var req = session && session.request || {}, list = session && session.candidates || [], selected = session && session.selected && session.selected[0] || list[0] || null;
    var q = req.raw || '', status = session && session.message ? session.message : (list.length ? 'Escolha uma sugestão ou diga “começar” para abrir a selecionada.' : 'Diga o que você quer viver agora.');
    var cards = '';
    for (var i = 0; i < list.length; i++) { var c = list[i], on = selected && c.id === selected.id && c.kind === selected.kind, rating = c.rating && c.rating.vote_average > 0 ? 'TMDB ' + c.rating.vote_average.toFixed(1) : '', meta = c.kind === 'live' ? 'Canal ao vivo' : c.kind === 'series' ? 'Série' : 'Filme'; cards += '<button type="button" class="zx-us-card' + (on ? ' is-selected' : '') + '" data-us-index="' + i + '" tabindex="0"><div class="zx-us-poster"' + (c.poster ? ' data-src="' + attr(c.poster) + '"' : '') + '><span class="pt-fallback">' + (c.kind === 'live' ? 'TV' : c.kind === 'series' ? 'SÉRIE' : 'FILME') + '</span></div><div class="zx-us-copy"><strong class="zx-us-name">' + esc(c.name) + '</strong><small class="zx-us-meta">' + meta + (rating ? ' · ' + rating : '') + (c.duration ? ' · ' + c.duration + ' min' : '') + '</small><small class="zx-us-reason">' + esc(c.reason || '') + '</small></div></button>'; }
    var note = req.family ? '<div class="zx-us-note">Sessão familiar ativa: conteúdo adulto filtrado pelo perfil e pelo horário permitido.</div>' : '';
    setHtml('<div class="zx-us-screen"><div class="zx-us-top"><a href="/home" class="gt-back" autofocus>← Voltar</a><strong class="zx-us-title">UltraSession</strong><button type="button" class="zx-us-mic" id="zx-us-mic">Falar intenção</button></div><div class="zx-us-intro">Não escolha apenas um título. Diga quanto tempo você tem, com quem está e que tipo de experiência deseja.</div><form class="zx-us-form" id="zx-us-form" onsubmit="return false"><input id="zx-us-input" type="text" value="' + attr(q) + '" placeholder="Ex.: tenho 40 minutos, algo leve com meus filhos" autocomplete="off"><button type="submit">Montar sessão</button></form><div class="zx-us-status" id="zx-us-status">' + esc(status) + '</div>' + note + '<div class="zx-us-grid" id="zx-us-grid">' + (cards || '<div class="zx-us-empty">Fale ou digite uma intenção para o UltraSession montar as opções disponíveis na sua lista.</div>') + '</div><div class="zx-us-actions"><button type="button" class="zx-us-action" id="zx-us-start">Começar selecionado</button><button type="button" class="zx-us-action" id="zx-us-swap">Trocar sugestão</button></div></div>' + ultraSessionStyles());
    var form = $('zx-us-form'), input = $('zx-us-input'), mic = $('zx-us-mic'), start = $('zx-us-start'), swap = $('zx-us-swap'), grid = $('zx-us-grid');
    if (form) form.addEventListener('submit', function (e) { e.preventDefault(); ultraSessionBuild(input ? input.value : ''); });
    if (mic) mic.addEventListener('click', function () { S.ultraSessionVoiceMode = true; startVoiceCommand(); });
    if (start) start.addEventListener('click', function () { ultraSessionStart((lsGet('zx_ultrasession_last') || {}).selected && (lsGet('zx_ultrasession_last') || {}).selected[0] || selected); });
    if (swap) swap.addEventListener('click', ultraSessionSwap);
    if (grid) grid.addEventListener('click', function (e) { var card = e.target; while (card && card !== grid && !card.getAttribute('data-us-index')) card = card.parentNode; if (!card || card === grid) return; var idx = parseInt(card.getAttribute('data-us-index'), 10), s = lsGet('zx_ultrasession_last') || {}; if (!s.candidates || !s.candidates[idx]) return; s.selected = [s.candidates[idx]]; lsSet('zx_ultrasession_last', s); renderUltraSession(s); });
    afterRender(); ultraSessionLoadPosters(); setTimeout(ultraSessionLoadPosters, 250);
    var pending = S.ultraSessionPending || ''; S.ultraSessionPending = '';
    if (pending) setTimeout(function () { var inp = $('zx-us-input'); if (inp) inp.value = pending; ultraSessionBuild(pending); }, 80);
}
function startVoiceCommand() {
    var btn = $('zxAssistantMic') || $('zxVoiceBtn'); if (btn) { btn.className += ' is-listening'; btn.setAttribute('aria-label', 'Ouvindo'); }
    function done() { var b = $('zxVoiceBtn'); if (b) { b.className = b.className.replace(/\s*is-listening\b/g, ''); b.setAttribute('aria-label', 'Ultra Assistente — comando de voz'); } var m = $('zxAssistantMic'); if (m) { m.className = m.className.replace(/\s*is-listening\b/g, ''); m.setAttribute('aria-label', 'Falar'); } }
    global.__voiceResult = function (text) { done(); if (S.ultraSessionVoiceMode) { S.ultraSessionVoiceMode = false; ultraSessionOpen(text); return; } if ($('zx-assistant-panel')) assistantSubmit(text); else runVoiceCommand(text); };
    global.__voiceError = function () { done(); if ($('zx-assistant-panel')) assistantAddMessage('Não consegui ouvir. Tente falar novamente.', 'bot'); };
    try {
        if (global.HdxNative && typeof global.HdxNative.startVoice === 'function') { global.HdxNative.startVoice(); return; }
        var R = global.SpeechRecognition || global.webkitSpeechRecognition;
        if (R) { var r = new R(); r.lang = 'pt-BR'; r.maxAlternatives = 1; r.onresult = function (e) { global.__voiceResult(e.results[0][0].transcript); }; r.onerror = global.__voiceError; r.onend = done; r.start(); return; }
    } catch (e) {}
    done();
}
var RADIO_CATEGORIES = [
    { id: 'gospel', label: 'Gospel', tags: ['gospel','christian','worship','religious','praise','contemporary christian'] },
    { id: 'brazil', label: 'Brasil • Conhecidas', country: 'Brazil', countrycode: 'BR', tags: ['brazilian','pop','rock','sertanejo','gospel'], featured: ['Estação Pop','Antena 1','Jovem Pan','Jovem Pan News','BandNews FM','CBN','Kiss FM','Alpha FM','Nativa FM','Mix FM','Transamérica','89 FM','Top FM','Itatiaia','Rádio Globo','Rádio Bandeirantes','Gazeta','Clube Brasilia'] },
    { id: 'rock', label: 'Rock', tags: ['rock','classic rock','alternative rock','hard rock'] },
    { id: 'pop', label: 'Pop', tags: ['pop','dance','top 40','hits'] },
    { id: 'sertanejo', label: 'Sertanejo', tags: ['sertanejo','brazilian','country'] },
    { id: 'classical', label: 'Clássica', tags: ['classical','classic music','orchestral'] },
    { id: 'blues', label: 'Blues', tags: ['blues'] },
    { id: 'jazz', label: 'Jazz', tags: ['jazz','smooth jazz','bebop'] },
    { id: 'metal', label: 'Metal', tags: ['metal','death metal','black metal','thrash metal'] },
    { id: 'heavy-metal', label: 'Heavy Metal', tags: ['heavy metal','metalcore','hardcore'] }
];
function radioCategory(id) { for (var i = 0; i < RADIO_CATEGORIES.length; i++) if (RADIO_CATEGORIES[i].id === id) return RADIO_CATEGORIES[i]; return RADIO_CATEGORIES[0]; }
function radioHttp(url) {
    return new Promise(function (resolve, reject) {
        try {
            var x = new XMLHttpRequest(); x.open('GET', url, true); x.timeout = 18000; x.setRequestHeader('Accept', 'application/json');
            x.onload = function () { if (x.status >= 200 && x.status < 300) { try { resolve(JSON.parse(x.responseText || '[]')); } catch (e) { reject(e); } } else reject(new Error('HTTP ' + x.status)); };
            x.onerror = function () { reject(new Error('network')); }; x.ontimeout = function () { reject(new Error('timeout')); }; x.send();
        } catch (e) { reject(e); }
    });
}
function radioApiUrl(params, host) { var q = []; params = params || {}; for (var k in params) if (params.hasOwnProperty(k) && params[k] !== '' && params[k] != null) q.push(encodeURIComponent(k) + '=' + encodeURIComponent(params[k])); return 'https://' + (host || 'de1.api.radio-browser.info') + '/json/stations/search?' + q.join('&'); }
function radioSafeUrl(v) { var s = String(v || ''); return /^https?:\/\//i.test(s) ? s : ''; }
function radioMerge(list) {
    var seen = {}, out = [];
    for (var i = 0; i < (list || []).length; i++) {
        var s = list[i] || {}, stream = radioSafeUrl(s.url_resolved || s.url); if (!stream || s.lastcheckok === 0) continue;
        var key = String(s.stationuuid || '') || (stream + '|' + String(s.name || '').toLowerCase()); if (seen[key]) continue; seen[key] = 1;
        out.push({ id: key, name: s.name || 'Rádio', stream: stream, homepage: radioSafeUrl(s.homepage), logo: radioSafeUrl(s.favicon), country: s.country || '', tags: s.tags || '', codec: s.codec || '', bitrate: s.bitrate || 0, clicks: s.clickcount || 0 });
    }
    out.sort(function (a, b) { return (b.clicks || 0) - (a.clicks || 0); }); return out.slice(0, 600);
}
function radioLoadCategory(cat) {
    var key = (cat && cat.id) || 'gospel';
    if (S.radioCache[key]) return Promise.resolve(S.radioCache[key]);
    if (S.radioPromises[key]) return S.radioPromises[key];
    var tags = (cat && cat.tags) || [], hosts = ['de1.api.radio-browser.info','all.api.radio-browser.info'], req = [], base = { limit: 250, hidebroken: 'true', order: 'clickcount', reverse: 'true' };
    for (var i = 0; i < tags.length; i++) { var tp = {}; for (var tk in base) tp[tk] = base[tk]; tp.tag = tags[i]; if (cat && cat.countrycode) tp.countrycode = cat.countrycode; req.push(radioHttp(radioApiUrl(tp, hosts[0])).catch(function () { return []; })); }
    var featured = (cat && cat.featured) || [];
    for (var f = 0; f < featured.length; f++) { var np = {}; for (var nk in base) np[nk] = base[nk]; np.name = featured[f]; if (cat && cat.countrycode) np.countrycode = cat.countrycode; req.push(radioHttp(radioApiUrl(np, hosts[0])).catch(function () { return []; })); }
    var work = Promise.all(req).then(function (chunks) { var all = []; for (var j = 0; j < chunks.length; j++) all = all.concat(chunks[j] || []); var merged = radioMerge(all); if (merged.length) return merged; var fallback = {}; for (var fk in base) fallback[fk] = base[fk]; fallback.tag = tags[0] || 'gospel'; if (cat && cat.countrycode) fallback.countrycode = cat.countrycode; return radioHttp(radioApiUrl(fallback, hosts[1])).then(function (x) { return radioMerge(x); }).catch(function () { return []; }); }).then(function (stations) { S.radioCache[key] = stations || []; delete S.radioPromises[key]; return S.radioCache[key]; }, function (err) { delete S.radioPromises[key]; throw err; });
    S.radioPromises[key] = work;
    return work;
}
function radioStyles() {
    var a = S.accent || '#10b981';
    return '<style>'
        + '.radio-screen{position:fixed;inset:0;display:flex;flex-direction:column;overflow:hidden;background:radial-gradient(130% 100% at 50% 0%,#0e2019,#07120d 48%,#040907);color:#f4fff9;}'
        + '.radio-top{display:flex;align-items:center;gap:12px;padding:14px 20px 8px;flex:none;}.radio-top .gt-back{color:#fff;text-decoration:none;border:1px solid ' + a + '66;border-radius:10px;padding:8px 14px;background:' + a + '16;}.radio-title{font-size:24px;font-weight:900;}.radio-search{margin-left:auto;width:min(300px,28vw);padding:10px 14px;border-radius:10px;border:1px solid ' + a + '55;background:#06130f;color:#fff;font-size:15px;outline:none;}.radio-country{width:170px;padding:10px;border:1px solid ' + a + '55;border-radius:10px;background:#06130f;color:#fff;font-size:14px;}.radio-search:focus,.radio-country:focus{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '33;}'
        + '.radio-cats{display:flex;gap:8px;overflow-x:auto;padding:6px 20px 12px;scrollbar-width:thin;flex:none;}.radio-cat{flex:none;border:1px solid ' + a + '55;border-radius:999px;background:' + a + '12;color:#cfe8df;padding:9px 15px;font-weight:800;cursor:pointer;}.radio-cat.is-active,.radio-cat:focus{background:' + a + '36;border-color:' + a + ';color:#fff;outline:none;}'
        + '.radio-status{padding:0 20px 8px;color:#9db0a7;font-size:13px;flex:none;}.radio-grid{flex:1;min-height:0;overflow-y:auto;display:grid;grid-template-columns:repeat(auto-fill,minmax(220px,1fr));align-content:start;gap:14px;padding:10px 20px 28px;}.radio-card{position:relative;display:flex;align-items:center;gap:12px;min-height:104px;padding:12px 42px 12px 12px;border:1px solid ' + a + '38;border-radius:15px;background:linear-gradient(145deg,' + a + '18,rgba(255,255,255,.04));color:#f4fff9;cursor:pointer;text-align:left;}.radio-card:hover,.radio-card:focus{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '33;outline:none;}.radio-logo{width:70px;height:70px;flex:0 0 70px;border-radius:10px;background:' + a + '1c center/contain no-repeat;display:flex;align-items:center;justify-content:center;font-size:28px;overflow:hidden;}.radio-logo.is-loaded span{display:none;}.radio-info{min-width:0;}.radio-name{display:block;font-size:16px;font-weight:900;line-height:1.15;white-space:normal;display:-webkit-box;-webkit-line-clamp:2;-webkit-box-orient:vertical;overflow:hidden;}.radio-meta{display:block;margin-top:6px;color:#9db0a7;font-size:11px;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}.radio-play{position:absolute;right:11px;top:50%;transform:translateY(-50%);width:30px;height:30px;border-radius:50%;display:flex;align-items:center;justify-content:center;background:' + a + '36;color:#fff;font-size:13px;}'
        + 'body.zx-ff-mobile .radio-grid{grid-template-columns:repeat(auto-fill,minmax(170px,1fr));gap:10px;padding:8px 12px 24px;}body.zx-ff-mobile .radio-top{padding:9px 12px 5px;gap:7px;}body.zx-ff-mobile .radio-title{font-size:19px;}body.zx-ff-mobile .radio-search{width:170px;padding:8px 10px;}body.zx-ff-mobile .radio-country{width:130px;padding:8px;font-size:12px;}body.zx-ff-mobile .radio-card{min-height:82px;padding:8px 38px 8px 8px;border-radius:11px;gap:8px;}body.zx-ff-mobile .radio-logo{width:52px;height:52px;flex-basis:52px;border-radius:8px;font-size:20px;}body.zx-ff-mobile .radio-name{font-size:13px;}body.zx-ff-mobile .radio-meta{font-size:9px;margin-top:3px;}'
        + 'body.zx-ff-tv .radio-grid{grid-template-columns:repeat(auto-fill,minmax(250px,1fr));gap:12px;}body.zx-ff-tv .radio-card{min-height:88px;}body.zx-ff-tv .radio-logo{width:54px;height:54px;flex-basis:54px;}'
        + '</style>';
}
function radioPaintLogo(el, src) { if (!el || !src || el.getAttribute('data-loaded')) return; el.setAttribute('data-loaded','1'); var im = new Image(); im.onload = function () { el.style.backgroundImage = "url('" + src.replace(/'/g, "\\'") + "')"; el.className += ' is-loaded'; }; im.onerror = function () { el.removeAttribute('data-loaded'); }; im.src = src; }
function radioRefreshCountries(stations) {
    var select = document.getElementById('radio-country'); if (!select) return;
    var current = select.value || 'all', seen = {}, countries = [];
    for (var i = 0; i < (stations || []).length; i++) { var c = (stations[i].country || '').trim(); if (c && !seen[c]) { seen[c] = 1; countries.push(c); } }
    countries.sort(function (a, b) { if (a === 'Brazil') return -1; if (b === 'Brazil') return 1; return a.localeCompare(b); });
    select.innerHTML = '<option value="all">Todos os países</option>' + countries.map(function (c) { return '<option value="' + attr(c) + '">' + esc(c) + '</option>'; }).join('');
    select.value = seen[current] || current === 'all' ? current : 'all';
}
function radioRenderStations(stations) {
    var grid = document.getElementById('radio-grid'), query = String((document.getElementById('radio-q') || {}).value || '').toLowerCase().trim(), country = String((document.getElementById('radio-country') || {}).value || 'all'); if (!grid) return;
    var filtered = []; for (var i = 0; i < (stations || []).length; i++) { var s = stations[i], hay = (s.name + ' ' + s.country + ' ' + s.tags).toLowerCase(); if ((!query || hay.indexOf(query) >= 0) && (country === 'all' || s.country === country)) filtered.push(s); }
    grid.innerHTML = filtered.length ? filtered.map(function (s, idx) { return '<button type="button" class="radio-card" data-radio-index="' + idx + '"><div class="radio-logo"' + (s.logo ? ' data-logo="' + attr(s.logo) + '"' : '') + '><span>▣</span></div><span class="radio-info"><strong class="radio-name">' + esc(s.name) + '</strong><small class="radio-meta">' + esc((s.country || 'Internacional') + (s.codec ? ' · ' + s.codec : '')) + '</small></span><span class="radio-play">▶</span></button>'; }).join('') : '<div class="zx-empty">Nenhuma rádio encontrada nesta categoria.</div>';
    var cards = grid.querySelectorAll('.radio-card'); for (var j = 0; j < cards.length; j++) { (function (card, station) { card.addEventListener('click', function () { if (station.stream) { try { if (global.HdxNative && global.HdxNative.play) global.HdxNative.play(JSON.stringify({ kind: 'radio', url: station.stream, title: station.name, zxKind: 'radio', zxId: station.id, name: station.name, poster: station.logo, keep_mini: false })); } catch (e) {} } else if (station.homepage) { try { global.open(station.homepage); } catch (e2) {} } }); radioPaintLogo(card.querySelector('.radio-logo'), station.logo); })(cards[j], filtered[j]); }
    var st = document.getElementById('radio-status'); if (st) st.textContent = filtered.length + ' rádios disponíveis';
}
function renderRadioScreen() {
    var cat = radioCategory(S.radioCategory || 'gospel');
    var cats = ''; for (var i = 0; i < RADIO_CATEGORIES.length; i++) cats += '<button type="button" class="radio-cat' + (RADIO_CATEGORIES[i].id === cat.id ? ' is-active' : '') + '" data-radio-cat="' + RADIO_CATEGORIES[i].id + '">' + esc(RADIO_CATEGORIES[i].label) + '</button>';
    setHtml('<div class="radio-screen"><div class="radio-top"><a href="/home" class="gt-back">← Voltar</a><strong class="radio-title">Rádios online</strong><input id="radio-q" class="radio-search" type="search" placeholder="Buscar rádio…" autocomplete="off"><select id="radio-country" class="radio-country" aria-label="Filtrar por país"><option value="all">Todos os países</option></select></div><div class="radio-cats">' + cats + '</div><div id="radio-status" class="radio-status">Carregando rádios…</div><div id="radio-grid" class="radio-grid"><div class="zx-empty">Consultando catálogo público…</div></div></div>' + flatStyles() + radioStyles());
    var grid = document.getElementById('radio-grid'), q = document.getElementById('radio-q'), countrySelect = document.getElementById('radio-country'), buttons = document.querySelectorAll('[data-radio-cat]');
    if (q) q.addEventListener('input', function () { radioRenderStations(S.radioStations || []); });
    if (countrySelect) countrySelect.addEventListener('change', function () { radioRenderStations(S.radioStations || []); });
    for (var j = 0; j < buttons.length; j++) (function (b) { b.addEventListener('click', function () { S.radioCategory = b.getAttribute('data-radio-cat'); renderRadioScreen(); }); })(buttons[j]);
    radioLoadCategory(cat).then(function (stations) { S.radioStations = stations; radioRefreshCountries(stations); radioRenderStations(stations); }).catch(function () { if (grid) grid.innerHTML = '<div class="zx-empty">Não foi possível carregar as rádios agora. Tente novamente.</div>'; var st = document.getElementById('radio-status'); if (st) st.textContent = 'Catálogo indisponível no momento'; });
    afterRender();
}
function refreshHomePreviewCatalogs(kinds, index) {
    if (!kinds || index >= kinds.length) return;
    var kind = kinds[index];
    try {
        refreshCatalog(kind, false).then(function () {
            updateHomeCatalogUI(kind);
            setTimeout(function () { refreshHomePreviewCatalogs(kinds, index + 1); }, 220);
        })['catch'](function () {
            setTimeout(function () { refreshHomePreviewCatalogs(kinds, index + 1); }, 220);
        });
    } catch (e) {
        setTimeout(function () { refreshHomePreviewCatalogs(kinds, index + 1); }, 220);
    }
}
function refreshHomeCachedCatalogs(kinds, index) {
    if (!kinds || index >= kinds.length) return;
    var kind = kinds[index];
    try {
        refreshCatalog(kind, true).then(function () {
            updateHomeCatalogUI(kind);
            setTimeout(function () { refreshHomeCachedCatalogs(kinds, index + 1); }, 700);
        })['catch'](function () {
            setTimeout(function () { refreshHomeCachedCatalogs(kinds, index + 1); }, 700);
        });
    } catch (e) {
        setTimeout(function () { refreshHomeCachedCatalogs(kinds, index + 1); }, 700);
    }
}
function updateHomeCatalogUI(kind) {
    try {
        if (!document.querySelector('.zx-home2')) return;
        var map = { live: ['zhSubLive', 'canais'], movies: ['zhSubMovies', 'filmes'], series: ['zhSubSeries', 'séries'] };
        var d = map[kind], c = S.cat && S.cat[kind];
        if (d && c && c.all) { var el = document.getElementById(d[0]); if (el) el.textContent = fmtNum(c.all.length) + ' ' + t(d[1]); }
        if (kind === 'movies') fillHomeNewest(true);
        if (kind === 'movies' || kind === 'series') fillHomeRecommendations(true);
        loadHomePosters();
    } catch (e) {}
}
function hydrateHomeCatalogCache() {
    if (getFormFactor() !== 'tv' || !S.server) return false;
    var ready = false;
    try {
        ['movies', 'series', 'live'].forEach(function (kind) {
            if (S.cat && S.cat[kind]) { ready = true; return; }
            var cached = readCatalogCache(kind);
            if (cached) { S.cat[kind] = cached; ready = true; }
        });
    } catch (e) {}
    return ready;
}
function renderHome() {
    injectProfCss();   // avatar do topo usa .zx-pf-av — sem isto a 1ª pintura sai QUADRADA/torta (o CSS só entrava quando o gate abria)
    // Passou pela TELA INICIAL → zera a memória das seções (categoria + rolagem +
    // tile focado): entrar em Filmes/Séries/Canais a partir do menu abre do INÍCIO,
    // como se fosse a 1ª vez. O "lembrar posição" vale SÓ dentro da seção
    // (abrir detalhe → Voltar). Pedido do Leonardo.
    S.vodBack = {}; S.vodPos = null; S.liveBack = null;
    var info = S.info || {}; var lic = info.license || {};
    // A validade vem em license.exp_date. A leitura anterior consultava
    // info.exp_date (nível errado), por isso o rodapé mostrava "Sem expiração"
    // mesmo quando check_mac.php devolvia expire_date.
    var exp = lic.exp_display || '';
    var activeList = null;
    try { var activeLists = S.directPlaylists && S.directPlaylists.length ? S.directPlaylists : loadDirectPlaylists(), activePick = parseInt(S.listIndex || activeListIndex(), 10) || 0; activeList = activeLists[activePick] || activeLists[0] || null; } catch (e) {}
    var listRawExpiry = listExpiryValue(activeList) || expiryFromListUrl(S.playlistUrl);
    var expTs = expiryTimestamp(lic.exp_date || info.exp_date || info.expire_date || listExpiryValue(info) || listRawExpiry || S.listExpiryTs || 0);
    if (!exp && expTs) { var dt = new Date(expTs * 1000); if (!isNaN(dt.getTime())) exp = p2(dt.getDate()) + '/' + p2(dt.getMonth() + 1) + '/' + dt.getFullYear(); }
    if (!exp) exp = 'Sem expiração';
    var mac = lic.mac || '';
    var ann = (S.branding && S.branding.announce) || null;
    var bannerHtml = '';
    if (ann && ann.banner) {
        bannerHtml = '<div class="zx-ann-banner" id="zxAnnBanner" data-ver="' + attr(ann.ver) + '" style="display:none;"><span class="zx-ann-ico">📢</span><div class="zx-ann-body">'
            + (ann.title ? '<div class="zx-ann-title">' + esc(ann.title) + '</div>' : '')
            + '<div class="zx-ann-text">' + esc(ann.text) + '</div></div><button type="button" class="zx-ann-x" id="zxAnnBannerX" aria-label="Fechar">✕</button></div>';
    }
    var ac = S.accent;
    var sIcon = '<a href="/live" class="home-tile" autofocus><div class="tile-icon"><svg width="68" height="68" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><polygon points="23 7 16 12 23 17 23 7"></polygon><rect x="1" y="5" width="15" height="14" rx="2" ry="2"></rect></svg></div><span>TV ao vivo</span></a>'
        + '<a href="/movies" class="home-tile"><div class="tile-icon"><svg width="68" height="68" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="9"></circle><circle cx="12" cy="12" r="3"></circle><circle cx="6" cy="6" r="1.5"></circle><circle cx="18" cy="6" r="1.5"></circle><circle cx="6" cy="18" r="1.5"></circle><circle cx="18" cy="18" r="1.5"></circle></svg></div><span>Filmes</span></a>'
        + '<a href="/series" class="home-tile"><div class="tile-icon"><svg width="68" height="68" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><rect x="3" y="6" width="18" height="14" rx="2"></rect><path d="M7 6V3M17 6V3"></path><polygon points="10 11 15 13 10 15 10 11" fill="' + attr(ac) + '" stroke="' + attr(ac) + '"></polygon></svg></div><span>Séries</span></a>'
        + '<a href="/lists" class="home-tile"><div class="tile-icon"><svg width="68" height="68" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><line x1="8" y1="6" x2="21" y2="6"></line><line x1="8" y1="12" x2="21" y2="12"></line><line x1="8" y1="18" x2="21" y2="18"></line><line x1="3" y1="6" x2="3.01" y2="6"></line><line x1="3" y1="12" x2="3.01" y2="12"></line><line x1="3" y1="18" x2="3.01" y2="18"></line></svg></div><span>Listas</span></a>'
        + '<a href="/settings" class="home-tile"><div class="tile-icon"><svg width="68" height="68" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="3"></circle><path d="M19.4 15a1.65 1.65 0 0 0 .33 1.82l.06.06a2 2 0 1 1-2.83 2.83l-.06-.06a1.65 1.65 0 0 0-1.82-.33 1.65 1.65 0 0 0-1 1.51V21a2 2 0 1 1-4 0v-.09a1.65 1.65 0 0 0-1-1.51 1.65 1.65 0 0 0-1.82.33l-.06.06a2 2 0 1 1-2.83-2.83l.06-.06a1.65 1.65 0 0 0 .33-1.82 1.65 1.65 0 0 0-1.51-1H3a2 2 0 1 1 0-4h.09a1.65 1.65 0 0 0 1.51-1 1.65 1.65 0 0 0-.33-1.82l-.06-.06a2 2 0 1 1 2.83-2.83l.06.06a1.65 1.65 0 0 0 1.82.33h.01a1.65 1.65 0 0 0 1-1.51V3a2 2 0 1 1 4 0v.09a1.65 1.65 0 0 0 1 1.51 1.65 1.65 0 0 0 1.82-.33l.06-.06a2 2 0 1 1 2.83 2.83l-.06.06a1.65 1.65 0 0 0-.33 1.82v.01a1.65 1.65 0 0 0 1.51 1H21a2 2 0 1 1 0 4h-.09a1.65 1.65 0 0 0-1.51 1z"></path></svg></div><span>Configurações</span></a>';
    var popHtml = '';
    if (ann && ann.popup) {
        popHtml = '<div class="zx-ann-overlay tv-modal" id="zxAnnPopup" data-ver="' + attr(ann.ver) + '" style="display:none;"><div class="zx-ann-pop"><div class="zx-ann-pop-ico">📢</div>'
            + (ann.title ? '<div class="zx-ann-pop-title">' + esc(ann.title) + '</div>' : '')
            + '<div class="zx-ann-pop-text">' + esc(ann.text) + '</div><button type="button" class="zx-ann-pop-ok" id="zxAnnPopupOk" data-modal-ok>Entendi</button></div></div>';
    }
    // ===== HOME NOVA (estilo IBO ONE) — SÓ ANDROID, projeto de teste (18/07) =====
    var svg = function (inner) { return '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">' + inner + '</svg>'; };
    var now = new Date();
    var _en = (currentLang() === 'en');
    var _dd = _en ? ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
                  : ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado'];
    var _mm = _en ? ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']
                  : ['janeiro', 'fevereiro', 'março', 'abril', 'maio', 'junho', 'julho', 'agosto', 'setembro', 'outubro', 'novembro', 'dezembro'];
    var clock = p2(now.getHours()) + ':' + p2(now.getMinutes());
    var dateStr = _en ? (_dd[now.getDay()] + ', ' + _mm[now.getMonth()] + ' ' + now.getDate())
                      : (_dd[now.getDay()] + ', ' + now.getDate() + ' de ' + _mm[now.getMonth()]);

    var svSrv = '<rect x="2" y="4" width="20" height="7" rx="1.5"></rect><rect x="2" y="13" width="20" height="7" rx="1.5"></rect><line x1="6" y1="7.5" x2="6.01" y2="7.5"></line><line x1="6" y1="16.5" x2="6.01" y2="16.5"></line>';
    var svRel = '<path d="M3 3v6h6"></path><path d="M3.5 15a9 9 0 1 0 2.1-9.4L3 8"></path><path d="M12 7v5l3 2"></path>';
    var svSea = '<circle cx="11" cy="11" r="7"></circle><line x1="21" y1="21" x2="16.65" y2="16.65"></line>';
    var svGer = '<circle cx="12" cy="12" r="3"></circle><path d="M19.4 15a1.65 1.65 0 0 0 .33 1.82l.06.06a2 2 0 1 1-2.83 2.83l-.06-.06a1.65 1.65 0 0 0-1.82-.33 1.65 1.65 0 0 0-1 1.51V21a2 2 0 1 1-4 0v-.09a1.65 1.65 0 0 0-1-1.51 1.65 1.65 0 0 0-1.82.33l-.06.06a2 2 0 1 1-2.83-2.83l.06-.06a1.65 1.65 0 0 0 .33-1.82 1.65 1.65 0 0 0-1.51-1H3a2 2 0 1 1 0-4h.09a1.65 1.65 0 0 0 1.51-1 1.65 1.65 0 0 0-.33-1.82l-.06-.06a2 2 0 1 1 2.83-2.83l.06.06a1.65 1.65 0 0 0 1.82.33H9a1.65 1.65 0 0 0 1-1.51V3a2 2 0 1 1 4 0v.09a1.65 1.65 0 0 0 1 1.51 1.65 1.65 0 0 0 1.82-.33l.06-.06a2 2 0 1 1 2.83 2.83l-.06.06a1.65 1.65 0 0 0-.33 1.82V9a1.65 1.65 0 0 0 1.51 1H21a2 2 0 1 1 0 4h-.09a1.65 1.65 0 0 0-1.51 1z"></path>';

    // Servidor PARCEIRO (tem nome no /admin/dns) → mostra o NOME no lugar da hora;
    // DNS avulso (URL digitada) → hora normal.
    var srvName = (S.dnsName || '').replace(/^\s+|\s+$/g, '');
    var top = '<header class="zh-top"><div class="zh-logo">' + brandLogoHtml() + '</div>'
        + '<div class="zh-clockwrap">'
        + (srvName ? '<div class="zh-srvname">' + esc(srvName) + '</div>' : '<div class="zh-clock" id="zxClock">' + esc(clock) + '</div>')
        + '<div class="zh-date">' + esc(dateStr) + '</div></div>'
        + '<div class="zh-icons">'
        + '<a href="/lists" class="zh-tbtn">' + svg(svSrv) + '<span>Servidor</span></a>'
        + '<button type="button" class="zh-tbtn ic zh-voice" id="zxVoiceBtn" title="Ultra Assistente" aria-label="Ultra Assistente — comando de voz"><svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M12 2a3 3 0 0 0-3 3v7a3 3 0 0 0 6 0V5a3 3 0 0 0-3-3z"></path><path d="M19 10v2a7 7 0 0 1-14 0v-2"></path><line x1="12" y1="19" x2="12" y2="22"></line><line x1="8" y1="22" x2="16" y2="22"></line></svg></button>'
        + '<button type="button" class="zh-tbtn ic zh-radio" id="zxRadioBtn" aria-label="Rádios online"><svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="3"></circle><path d="M4.9 4.9a10 10 0 0 0 0 14.2M19.1 4.9a10 10 0 0 1 0 14.2M2 2l20 20"></path></svg></button>'
        + '<button type="button" class="zh-tbtn ic zh-session" id="zxSessionBtn" aria-label="UltraSession"><svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M12 3v4"></path><path d="M12 17v4"></path><path d="m4.22 4.22 2.83 2.83"></path><path d="m16.95 16.95 2.83 2.83"></path><path d="M3 12h4"></path><path d="M17 12h4"></path><path d="m4.22 19.78 2.83-2.83"></path><path d="m16.95 7.05 2.83-2.83"></path><circle cx="12" cy="12" r="3"></circle></svg></button>'
        + '<a href="/reload" class="zh-tbtn ic">' + svg(svRel) + '</a>'
        + '<a href="/settings" class="zh-tbtn ic">' + svg(svGer) + '</a>'
        + '<a href="#" class="zh-tbtn ic zh-profbtn" id="zxProfBtn" aria-label="' + te('Perfis') + '">' + profAvatarHtml(profActive().a, 34) + '</a>'
        + '</div></header>';

        var homeCacheReady = hydrateHomeCatalogCache();
    var recent = homeRecentHtml();
    var recommendations = homeRecommendationsHtml();

    var svTv = '<polygon points="23 7 16 12 23 17 23 7"></polygon><rect x="1" y="5" width="15" height="14" rx="2"></rect>';
    var svMov = '<rect x="2" y="4" width="20" height="16" rx="2.5"></rect><path d="M7 4v16M17 4v16M2 9h5M2 15h5M17 9h5M17 15h5"></path>';
    var svSer = '<rect x="3" y="7" width="18" height="13" rx="2"></rect><path d="M8 7 5 3M16 7l3-4M12 7 12 3"></path>';
    var svPl = '<line x1="8" y1="6" x2="21" y2="6"></line><line x1="8" y1="12" x2="21" y2="12"></line><line x1="8" y1="18" x2="16" y2="18"></line><circle cx="18.5" cy="18.5" r="3.2"></circle><path d="M18.5 17.1v2.8M17.1 18.5h2.8"></path>';
    var svQueue = '<path d="M4 6h16M4 12h16M4 18h10"></path><path d="m16 17 2 2 4-4"></path>';
    var svBell = '<path d="M18 8a6 6 0 0 0-12 0c0 7-3 7-3 9h18c0-2-3-2-3-9"></path><path d="M10 21h4"></path>';
    var svHeart = '<path d="M20.8 4.6a5.5 5.5 0 0 0-7.8 0L12 5.7l-1-1.1a5.5 5.5 0 1 0-7.8 7.8L12 21l8.8-8.6a5.5 5.5 0 0 0 0-7.8z"></path>';
    var svSearch = '<circle cx="11" cy="11" r="7"></circle><path d="m20 20-4-4"></path>';
    function tile(href, ic, label, subTxt, subId, atf, elId, remoteKey) {
        return '<a href="' + href + '" class="zh-tile"' + (elId ? ' id="' + elId + '"' : '') + (atf ? ' autofocus' : '') + '>'
            + '<span class="zh-ico">' + (remoteKey ? homeRemoteIconHtml(remoteKey, svg(ic)) : svg(ic)) + '</span>'
            + '<span class="zh-tx"><b class="zh-tl">' + label + '</b>'
            + '<small class="zh-tsub"' + (subId ? ' id="' + subId + '"' : '') + '>' + subTxt + '</small></span></a>';
    }
    // Layout referência 19/07 (2ª imagem): TV ao Vivo GRANDE à esquerda (altura
    // inteira); à direita Filmes+Séries em cima e uma fileira BAIXA com
    // Favoritos+Playlist embaixo (sem botão de Configurações — já tem no topo).
    function stile(href, ic, label, subTxt) {
        return '<a href="' + href + '" class="zh-stile"><span class="zh-sico">' + svg(ic) + '</span>'
            + '<span class="zh-stx"><b>' + label + '</b>'
            + (subTxt ? '<small class="zh-ssub">' + subTxt + '</small>' : '') + '</span></a>';
    }
        var favN = 0; try { favN = (S.fav.live.length || 0) + (S.fav.movie.length || 0) + (S.fav.series.length || 0); } catch (e) {}
    var queueN = 0; try { queueN = queueList().length; } catch (e) {}
    var alertN = 0; try { alertN = epgAlarms().filter(function (a) { return a && a.when > Date.now(); }).length; } catch (e) {}
    // SEM lista adicionada → TODOS os botões levam pra tela de ADICIONAR LISTA
    // (cliente novo não sabe que é no "Playlist" — pedido 19/07). O /lists sem
    // lista já abre direto no formulário.
    var noList = !S.server;
    function dest(h) { return noList ? '/lists' : h; }
    // 1º uso pendente (idioma/pirataria/tela)? NÃO põe autofocus no TV ao Vivo —
    // o navegador processa autofocus DEPOIS do modal focar e roubava o foco do
    // seletor de idioma (abria sem nada marcado).
    var frPending = false;
    try { frPending = nativeAvail() && (!langChosen() || !piracyAck() || !getFormFactor()); } catch (e) {}
    var nav = '<nav class="zh-nav">'
        + tile(dest('/live'), svTv, 'TV ao Vivo', homeCountLabel('live', 'canais'), 'zhSubLive', !frPending, 'zhLive', 'live_tv')
        + '<div class="zh-navr">'
        + '<div class="zh-navtop">'
        + tile(dest('/movies'), svMov, 'Filmes', homeCountLabel('movies', 'filmes'), 'zhSubMovies', false, '', 'movies')
        + tile(dest('/series'), svSer, 'Séries', homeCountLabel('series', 'séries'), 'zhSubSeries', false, '', 'series')
        + '</div>'
        + '<div class="zh-navbot zh-navbot-placeholder" aria-hidden="true"></div>'
        + '</div></nav>';

    var quickBar = '<div class="zh-quickbar" id="zhQuickbar">'
        + stile(dest('/favorites'), svHeart, 'Favoritos', favN + ' ' + t('itens'))
        + stile(dest('/queue'), svQueue, 'Minha Fila', queueN + ' ' + t('itens'))
        + stile('/alerts', svBell, 'Meus Alertas', alertN + (alertN === 1 ? ' aviso' : ' avisos'))
        + stile('/lists', svPl, 'Playlist', te('Adicionar / gerenciar'))
        + '</div>';
    top = top.replace('</header>', '</header>' + quickBar);

    var status = '<footer class="zh-status">'
        + '<span>' + te('Perfil:') + ' <b>' + esc(profName(profActive())) + '</b></span><span class="zh-bar"></span>'
 + (S.server
            ? '<span>Usuário: <b>' + esc(S.user) + '</b></span><span class="zh-bar"></span><span>Vencimento da lista: <b>' + esc(exp) + '</b></span>'
            : '<span>Adicione uma lista em <b>Playlist</b> pra começar</span>')
        + '<span class="zh-badge">Fusion</span>'
        + '</footer>';

    // announceStyles: SEM ele a faixa/pop-up de aviso do painel renderiza CRUA no
    // canto (o redesign da home tinha deixado a função órfã — bug 19/07).
    var mobileHomeClass = getFormFactor() === 'mobile' ? ' zx-mobile' : '';
    setHtml('<div class="zx-home2' + mobileHomeClass + '"><div class="zx-panel-wall" aria-hidden="true"></div>' + homeRemoteBannerHtml() + bannerHtml + '<div class="zh-amb"></div><div class="zh-wm" aria-hidden="true">FUSION</div><div class="zh-ui">'
        + top + nav + recent + recommendations + status + '</div>' + popHtml + '</div>' + homeStyles(ac) + announceStyles(ac));
    applyHomePanelWall();
    applyPhoneHomeLayout();
    if (!srvName) startHomeClock();   // com nome de parceiro no topo não há relógio pra atualizar
        // A pintura inicial não espera imagens nem faz trabalho pesado. O foco/D-pad
    // fica livre; as capas entram em uma fila pequena depois do primeiro frame.
    if (!isTvHomeMode()) loadHomePosters();
    fillHomeNewest();

        try { setTimeout(fillHomeCounts, isTvHomeMode() ? 1800 : 400); } catch (e) { fillHomeCounts(); }   // contagens usam cache inicial e a sincronização integral atualiza depois

        // TV Box não mede/reescreve dezenas de cards antes do primeiro frame.
        // A navegação fica livre imediatamente; a adaptação visual é adiada.
        if (!isTvHomeMode()) fitHomeAll();
    scheduleHomeFit(isTvHomeMode() ? 900 : 160);

    if (!S._homeFitBound) {   // girar/redimensionar → re-mede (zera o inline e ajusta de novo)
        S._homeFitBound = true;
        try {
            window.addEventListener('resize', function () {
                applyPhoneHomeLayout();
                if (!document.querySelector('.zh-posters')) return;
                var ps = document.querySelectorAll('.zh-poster');
                                for (var i = 0; i < ps.length; i++) { ps[i].style.width = ''; ps[i].style.display = ''; }
                scheduleHomeFit(60);

            });
        } catch (e) {}
    }
    wireAnnounce(ann);
    afterRender();
    try { setTimeout(warmHomeCatalogs, getFormFactor() === 'tv' ? 700 : 220); } catch (e) {}
    try { setTimeout(fillHomeRecommendations, isTvHomeMode() ? 0 : 480); } catch (e) {}
    focusHomeStart();   // foco SEMPRE no "TV ao Vivo" já MARCADO (o harness focaria "Servidor")
    // PERFIS: avatar do topo abre o "Quem está assistindo?"
    try {
        var pb = document.getElementById('zxProfBtn');
        if (pb) pb.addEventListener('click', function (e) { if (e && e.preventDefault) e.preventDefault(); showProfGate('menu'); });
        var vb = document.getElementById('zxVoiceBtn'); if (vb) vb.addEventListener('click', function (e) { if (e && e.preventDefault) e.preventDefault(); closeAssistantPanel(); startVoiceCommand(); });
        var rb = document.getElementById('zxRadioBtn'); if (rb) rb.addEventListener('click', function (e) { if (e && e.preventDefault) e.preventDefault(); go('/radio'); });
        var sb = document.getElementById('zxSessionBtn'); if (sb) sb.addEventListener('click', function (e) { if (e && e.preventDefault) e.preventDefault(); ultraSessionOpen(''); });
    } catch (e) {}
    firstRunFlow();   // 1ª abertura no Android → idioma + aviso anti-pirataria + escolha Celular x TV
    maybeProfBootGate();   // 2+ perfis → pergunta quem está assistindo (1x por abertura)
}
/* Foca o "TV ao Vivo" ao abrir a home (nunca o "Servidor" do topo) e deixa a marca
   verde JÁ visível (zh-tile-on). A marca some no 1º toque/tecla: no controle a nav
   segue com :focus-visible (verde); no celular (touch) a marca some e não fica presa. */
function focusHomeStart() {
    var userMoved = false;
    function clr() {
        userMoved = true;
        try { var el = document.getElementById('zhLive'); if (el) el.className = el.className.replace(/\s*zh-tile-on\b/g, ''); } catch (e) {}
        try { document.removeEventListener('keydown', clr, true); } catch (e) {}
        try { document.removeEventListener('pointerdown', clr, true); } catch (e) {}
        try { document.removeEventListener('touchstart', clr, true); } catch (e) {}
    }
    function apply() {
        try {
            if (userMoved) return;                              // usuário já navegou → não briga
            if (document.querySelector('.zx-ff-ask')) return;   // modal do 1º uso aberto → o foco é DELE (a home re-foca quando ele fechar)
            var annOv = document.querySelector('.zx-ann-overlay');
            if (annOv && annOv.style.display !== 'none') return;   // pop-up de AVISO aberto → o foco é do "Entendi"
            var el = document.getElementById('zhLive'); if (!el) return;
            try { el.focus({ preventScroll: true }); } catch (e) { try { el.focus(); } catch (e2) {} }
            if (el.className.indexOf('zh-tile-on') < 0) el.className += ' zh-tile-on';
        } catch (e) {}
    }
    setTimeout(function () {
        apply();
        document.addEventListener('keydown', clr, true);
        document.addEventListener('pointerdown', clr, true);
        document.addEventListener('touchstart', clr, true);
    }, 0);
    setTimeout(apply, 300);   // re-afirma (afterSwap/afins podem ter mexido no foco depois)
}
/* "Assistido Recentemente" REAL: junta Continue Assistindo (filmes+séries), mais
   recente primeiro (ts), até 6. Cada capa usa .pt-img data-src (lazy do afterRender). */
function homeRecentHtml() {
    var vod = (lsGet('zx_cont_vod') || {}).items || [];
    var ser = (lsGet('zx_cont_series') || {}).items || [];
    var all = [];
    // SÓ filmes e séries (canal de TV não tem card nesse formato — pedido 19/07).
    // NUNCA expõe conteúdo adulto na tela inicial: pula o que foi marcado no
    // bumpContinue E re-checa aqui (nome + categoria, se o catálogo já carregou).
    vod.forEach(function (it) { if (it.adult || isAdultContent('movies', it.id, it.name)) return; all.push({ kind: 'movies', id: it.id, name: it.name, poster: it.poster, ts: it.ts || 0 }); });
    ser.forEach(function (it) { if (it.adult || isAdultContent('series', it.id, it.name)) return; all.push({ kind: 'series', id: it.id, name: it.name, poster: it.poster, ts: it.ts || 0 }); });
    all.sort(function (a, b) { return (b.ts || 0) - (a.ts || 0); });
    // Pool maior — quantas aparecem é DINÂMICO: o trimHomePosters esconde as que
    // não couberem na largura da tela (cada aparelho mostra o que cabe).
    all = all.slice(0, 14);
    // SEM histórico: deslogado → nada (cards esticam). LOGADO → a fileira vira
    // "Recém adicionados" (filmes novos do servidor, preenchidos quando o
    // catálogo carrega — fillHomeNewest). Assistiu algo → volta ao normal.
    if (!all.length) {
        if (!S.server) return '';
        var newestLabel = (S.playlistType || '').indexOf('m3u') === 0 ? te('Filmes em destaque') : te('Recém adicionados');
        var nhead = '<h2 class="zh-h2"><svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="9"></circle><path d="M12 8v8M8 12h8"></path></svg> ' + newestLabel + '</h2>';
        return '<section class="zh-recent" id="zhNewest" style="display:none">' + nhead + '<div class="zh-posters" id="zhNewestRow"></div></section>';
    }
    var head = '<h2 class="zh-h2"><svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="9"></circle><polyline points="12 7 12 12 15 14"></polyline></svg> Assistido Recentemente</h2>';
    var cards = '';
    all.forEach(function (it) {
        var img = tmdbResize(it.poster || '');
        var name = it.name || '';
        // ano "(2025)" sai do título e vira a linha de cima do card
        var topLine = '';
        var ym = name.match(/\(((?:19|20)\d{2})\)/);
        if (ym) { topLine = ym[1]; name = name.replace(ym[0], '').replace(/\s{2,}/g, ' ').replace(/^\s+|\s+$/g, ''); }
        // progresso: filme = direto; série = do último episódio visto (zx_slast)
        var pr = null;
        if (it.kind === 'movies') pr = getProgress('movie', it.id);
        else {
            var sl = lsGet('zx_slast_' + it.id);
            if (sl && sl.epId) {
                pr = getProgress('series', sl.epId);
                if (sl.s != null && sl.e != null) topLine = t('Temporada ') + sl.s + ' · ' + t('Episódio') + ' ' + sl.e;
            }
        }
        var leftTxt = '', pct = -1, resumeHref = '/' + it.kind + '/' + enc(it.id), canResume = false;
        if (pr && pr.dur > 60 && pr.pos > 0 && pr.pos < pr.dur) {
            var rem = pr.dur - pr.pos;
            var hh = Math.floor(rem / 3600), mm = Math.floor((rem % 3600) / 60);
            leftTxt = (hh > 0 ? hh + 'h ' + p2(mm) + 'm' : (mm > 0 ? mm + 'm' : '1m')) + ' ' + t('restantes');
            pct = Math.round((pr.pos / pr.dur) * 100); if (pct > 100) pct = 100;
            canResume = true;
            if (it.kind === 'movies') resumeHref = '/movies/' + enc(it.id) + '/play?t=' + enc(Math.floor(pr.pos));
            else if (sl && sl.epId) resumeHref = '/series/' + enc(it.id) + '/episode/' + enc(sl.epId) + '/play?ext=' + enc(sl.ext || 'mp4') + '&t=' + enc(Math.floor(pr.pos));
            leftTxt = 'Continuar' + (leftTxt ? ' • ' + leftTxt : '');
        }
        var initials = (name || 'UP').replace(/[^A-Za-zÀ-ÿ0-9 ]/g, '').trim().split(/\s+/).slice(0, 2).map(function (x) { return x.charAt(0); }).join('').toUpperCase() || 'UP';
        var cardLabel = (canResume ? 'Continuar assistindo: ' : '') + name;
        var favKind = it.kind === 'series' ? 'series' : 'movie', favOn = inArr(S.fav[favKind], it.id);
        cards += '<a class="zh-poster" href="' + resumeHref + '" title="' + attr(cardLabel) + '" aria-label="' + attr(cardLabel) + '">'
            + '<div class="pt-img zh-art"' + (img ? ' data-src="' + attr(img) + '"' : '') + '><span class="zh-art-fallback">' + esc(initials) + '</span><button type="button" class="zh-fav-quick' + (favOn ? ' is-on' : '') + '" data-home-fav-kind="' + favKind + '" data-home-fav-id="' + attr(it.id) + '" data-home-fav-name="' + attr(name) + '" data-home-fav-poster="' + attr(img) + '" aria-label="' + (favOn ? 'Remover dos Favoritos' : 'Adicionar aos Favoritos') + '" title="' + (favOn ? 'Remover dos Favoritos' : 'Adicionar aos Favoritos') + '">' + (favOn ? '♥' : '♡') + '</button></div>'
            + '<div class="zh-cbody">'
            + (topLine ? '<div class="zh-cyear">' + esc(topLine) + '</div>' : '')
            + '<div class="zh-cname">' + esc(name) + '</div>'
            + '<div class="zh-cleft">' + esc(leftTxt) + '</div>'
            + (pct >= 0 ? '<div class="zh-cbar"><i style="width:' + pct + '%"></i></div>' : '')
            + '</div></a>';
    });
    return '<section class="zh-recent">' + head + '<div class="zh-posters">' + cards + '</div></section>';
}
function homeRecommendationItems() {
    var boost = {}, excluded = {}, out = [], hidden = recoHiddenList();
    function key(kind, id) { return kind + ':' + String(parseInt(id, 10) || id); }
    function markList(kind, list) { for (var i = 0; i < (list || []).length; i++) excluded[key(kind, list[i])] = 1; }
    for (var hi = 0; hi < hidden.length; hi++) excluded[hidden[hi]] = 1;
    markList('movies', S.fav.movie); markList('series', S.fav.series);
    var cv = (lsGet('zx_cont_vod') || {}).items || [], cs = (lsGet('zx_cont_series') || {}).items || [];
    for (var ci = 0; ci < cv.length; ci++) excluded[key('movies', cv[ci].id)]=1;
    for (var cj = 0; cj < cs.length; cj++) excluded[key('series', cs[cj].id)]=1;
    var defs = [{ kind: 'movies', fav: S.fav.movie }, { kind: 'series', fav: S.fav.series }];
    for (var di = 0; di < defs.length; di++) {
        var def = defs[di], cat = S.cat[def.kind], all = cat && cat.all || [], byId = {};
        for (var ai = 0; ai < all.length; ai++) {
            var indexed = all[ai], indexedId = parseInt((def.kind === 'series' ? (indexed.series_id || indexed.stream_id) : indexed.stream_id) || 0, 10);
            if (indexedId) byId[String(indexedId)] = indexed;
        }
        for (var fi = 0; fi < (def.fav || []).length; fi++) {
            var fid = parseInt(def.fav[fi], 10), fitem = byId[String(fid)];
            if (fitem && fitem.category_id != null) boost[String(fitem.category_id)] = (boost[String(fitem.category_id)] || 0) + 12;
        }
    }
    for (var ki = 0; ki < defs.length; ki++) {
        var d = defs[ki], c = S.cat[d.kind], items = c && c.all || [];
        for (var ii = 0; ii < items.length; ii++) {
            var item = items[ii], id = parseInt((d.kind === 'series' ? (item.series_id || item.stream_id) : item.stream_id) || 0, 10);
            if (!id || excluded[key(d.kind, id)] || !kidsAllows(item)) continue;
            var newest = parseInt(item.added || item.last_modified || item.last_modified_at || 0, 10) || 0;
            var score = (boost[String(item.category_id)] || 0) + Math.min(8, newest > 0 ? 2 : 0);
            out.push({ kind: d.kind, id: id, item: item, score: score, newest: newest, reason: (boost[String(item.category_id)] || 0) > 0 ? 'Porque você favoritou algo parecido' : newest > 0 ? 'Novidade na sua lista' : 'Sugestão para você' });
        }
    }
    out.sort(function (a, b) { return (b.score - a.score) || (b.newest - a.newest); });
    return out.slice(0, 12);
}
function homeRecommendationCards(items) {
    var h = '';
    for (var i = 0; i < (items || []).length; i++) {
        var r = items[i], it = r.item || {}, name = it.name || it.title || (r.kind === 'movies' ? 'Filme' : 'Série');
        var poster = it.stream_icon || it.cover_big || it.cover || it.movie_image || it.poster || '', img = tmdbResize(poster), initials = name.replace(/\s+/g, ' ').trim().split(' ').slice(0, 2).map(function (x) { return x.charAt(0); }).join('').toUpperCase() || 'UP';
        var favKind = r.kind === 'series' ? 'series' : 'movie', favOn = inArr(S.fav[favKind], r.id);
        h += '<a class="zh-poster" href="/' + r.kind + '/' + enc(r.id) + '"><div class="pt-img zh-art"' + (img ? ' data-src="' + attr(img) + '"' : '') + '><span class="zh-art-fallback">' + esc(initials) + '</span><button type="button" class="zh-fav-quick' + (favOn ? ' is-on' : '') + '" data-home-fav-kind="' + favKind + '" data-home-fav-id="' + attr(r.id) + '" data-home-fav-name="' + attr(name) + '" data-home-fav-poster="' + attr(img) + '" aria-label="' + (favOn ? 'Remover dos Favoritos' : 'Adicionar aos Favoritos') + '" title="' + (favOn ? 'Remover dos Favoritos' : 'Adicionar aos Favoritos') + '">' + (favOn ? '♥' : '♡') + '</button></div><div class="zh-cbody"><div class="zh-cyear">' + (r.kind === 'movies' ? 'Filme' : 'Série') + '</div><div class="zh-cname">' + esc(name.replace(/\s+/g, ' ').trim()) + '</div><div class="zh-cleft">' + esc(r.reason || 'Sugestão para você') + '</div></div></a>';
    }
    return h;
}
function homeRecommendationsHtml() {
    if (!S.server) return '';
    var head = '<h2 class="zh-h2"><svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="m12 3 2.8 5.7 6.2.9-4.5 4.4 1.1 6.2-5.6-2.9-5.6 2.9 1.1-6.2L3 9.6l6.2-.9L12 3z"></path></svg> Para você</h2>';
    return '<section class="zh-recent zh-recommend" id="zhReco" style="display:none">' + head + '<div class="zh-posters" id="zhRecoRow"></div></section>';
}
function homeSkeletonCards(count) {
    var h = '', n = Math.max(1, Math.min(8, count || 6));
    for (var i = 0; i < n; i++) {
        h += '<div class="zh-poster zh-skeleton" aria-hidden="true"><div class="pt-img zh-art"></div><div class="zh-cbody"><div class="zh-cyear"> </div><div class="zh-cname">Carregando…</div><div class="zh-cleft"> </div></div></div>';
    }
    return h;
}
function isTvHomeMode() {
    try {
        return getFormFactor() === 'tv' || !!(document.body && /(^|\s)(zx-ff-tv|ui-tv)(\s|$)/.test(String(document.body.className || '')));
    } catch (e) { return false; }
}
function fillHomeRecommendations(forceFull) {
    if (!S.server || !document.querySelector('.zx-home2')) return;
    var tv = isTvHomeMode();
    var sec = $('zhReco'), row = $('zhRecoRow'); if (!sec || !row) return;
    function renderRows() {
        fillHomeNewest();
        var items = homeRecommendationItems();
        if (!items.length) {
            row.innerHTML = isTvHomeMode() ? homeSkeletonCards(6) : '<div class="zh-empty">' + te('Carregando recomendações…') + '</div>';
            sec.style.display = '';
            return;
        }
        row.innerHTML = homeRecommendationCards(items); sec.style.display = '';
        if (isTvHomeMode()) {
            setTimeout(function () { loadHomePosters(); }, 0);
            scheduleHomeFit(900);
        } else {
            loadHomePosters(); scheduleHomeFit(0);
        }
    }
    // Na TV Box, pintar um placeholder e devolver imediatamente o foco ao
    // D-pad. O parsing/consulta só começa depois, fora do caminho da primeira
    // navegação; quando termina, substitui o placeholder pelos cards.
    if (tv) {
        var cm = readCatalogCache('movies'), cs = readCatalogCache('series');
        if (cm && !S.cat.movies) S.cat.movies = cm;
        if (cs && !S.cat.series) S.cat.series = cs;
        if (S.cat.movies || S.cat.series) renderRows();
        else { row.innerHTML = '<div class="zh-empty">' + te('Preparando recomendações…') + '</div>'; sec.style.display = ''; }
        if (S._homeDeferredLoad && !forceFull) return;
        if (forceFull) {
            Promise.all([ensureCatalog('movies', true), ensureCatalog('series', true)]).then(renderRows).catch(function () {});
            return;
        }
        S._homeDeferredLoad = true;
        setTimeout(function () {
            Promise.all([ensureCatalog('movies'), ensureCatalog('series')]).then(renderRows).catch(function () {});
        }, 900);
        return;
    }
    Promise.all([ensureCatalog('movies', !!forceFull), ensureCatalog('series', !!forceFull)]).then(renderRows).catch(function () {});
}
/* Carrega as capas da home na mão (o lazy-loader global só varre grids). */
function loadHomePosters() {
    try {
        var imgs = document.querySelectorAll('.zh-art[data-src]'), pending = 0, started = 0;
        var batch = isTvHomeMode() ? 3 : 8;
        for (var i = 0; i < imgs.length; i++) {
            var el = imgs[i];
            if (el.getAttribute('data-loaded')) continue;
            var src = el.getAttribute('data-src'); if (!src) continue;
            pending++;
            if (started >= batch) continue;
            started++;
            el.setAttribute('data-loaded', '1');
            (function (target, imageSrc) {
                var im = new Image();
                im.onload = function () { target.style.backgroundImage = "url('" + imageSrc + "')"; target.className += ' is-loaded'; };
                im.onerror = function () { target.removeAttribute('data-loaded'); };
                im.src = imageSrc;
            })(el, src);
        }
        if (pending > started) {
            try { if (S._homePosterTimer) clearTimeout(S._homePosterTimer); } catch (e2) {}
            S._homePosterTimer = setTimeout(function () { S._homePosterTimer = null; loadHomePosters(); }, isTvHomeMode() ? 1100 : 420);
        } else S._homePosterTimer = null;
    } catch (e) {}
}

/* Número com separador de milhar pt-BR (5685 -> "5.685"). */
function fmtNum(n) {
    try { return Number(n).toLocaleString(currentLang() === 'en' ? 'en-US' : 'pt-BR'); }
    catch (e) { return String(n).replace(/\B(?=(\d{3})+(?!\d))/g, currentLang() === 'en' ? ',' : '.'); }
}
/* Rótulo de contagem do tile: usa o catálogo em cache se já tiver; senão só a
   palavra ("canais") como placeholder até fillHomeCounts() preencher. */
function homeCountLabel(kind, noun) {
    try { var c = S.cat && S.cat[kind]; if (c && c.all) return fmtNum(c.all.length) + ' ' + t(noun); } catch (e) {}
    return t(noun);
}
/* Carrega (em 2º plano) o catálogo de canais/filmes/séries e escreve a contagem
   real nos sublabels dos tiles. Cacheia em S.cat → entrar na seção fica instantâneo. */
function fillHomeCounts() {
    if (!S.server) return;   // sem lista adicionada, não busca nada
    var defs = [['live', 'zhSubLive', 'canais'], ['movies', 'zhSubMovies', 'filmes'], ['series', 'zhSubSeries', 'séries']];
    // Sem histórico? FILMES primeiro (alimenta o "Recém adicionados" visível).
    try {
        var _nv = (lsGet('zx_cont_vod') || {}).items || [], _ns = (lsGet('zx_cont_series') || {}).items || [];
        if (!_nv.length && !_ns.length) defs = [defs[1], defs[0], defs[2]];
    } catch (e) {}
    // ⚠️ PERF TV fraca (19/07): UM catálogo por vez com folga entre eles — os 3
    // juntos parseavam milhares de itens de uma vez e TRAVAVAM o D-pad na home.
    var qi = 0;
    function nextCat() {
        if (qi >= defs.length) return;
        var d = defs[qi++], kind = d[0], id = d[1], noun = d[2];
        // O parser M3U agora processa em lotes e cede o event loop entre blocos;
        // a Home pode carregar as contagens e fileiras sem prender o D-pad.
        var set = function () {
            try {
                var el = document.getElementById(id); if (!el) return;
                        var c = S.cat && S.cat[kind]; if (c && c.all) el.textContent = fmtNum(c.all.length) + ' ' + t(noun);

            } catch (e) {}
            pruneAdultRecent();   // catálogo carregado → re-checa adultos por CATEGORIA
            fillHomeNewest();     // sem histórico → preenche o "Recém adicionados" da home
        };
        if (S.cat && S.cat[kind]) { set(); setTimeout(nextCat, 60); return; }
        try {
                        ensureCatalog(kind, true).then(function () { set(); setTimeout(nextCat, 400); })['catch'](function () { setTimeout(nextCat, 400); });

        } catch (e) { setTimeout(nextCat, 400); }
    }
    nextCat();
}
/* Com o catálogo em cache, marca como adult os itens antigos do Continue
   Assistindo (salvos antes desta proteção) e REMOVE da tela qualquer capa
   adulta que já tenha sido renderizada na home. */
function pruneAdultRecent() {
    try {
        ['vod', 'series'].forEach(function (sec) {
            var key = 'zx_cont_' + sec, d = lsGet(key); if (!d || !d.items || !d.items.length) return;
            var changed = false;
            d.items.forEach(function (it) {
                if (!it.adult && isAdultContent(sec === 'series' ? 'series' : 'movies', it.id, it.name)) { it.adult = 1; changed = true; }
            });
            if (changed) lsSet(key, d);
        });
        var cards = document.querySelectorAll('.zh-poster');
        for (var i = 0; i < cards.length; i++) {
            var m = (cards[i].getAttribute('href') || '').match(/^\/(movies|series)\/(\d+)/);
            if (!m) continue;
            var nameEl = cards[i].querySelector('.zh-cname');
            if (isAdultContent(m[1], m[2], nameEl ? nameEl.textContent : '')) {
                try { cards[i].parentNode.removeChild(cards[i]); } catch (e) {}
            }
        }
        // sobrou ZERO card? esconde a seção inteira (igual quando não há histórico)
        var sec = document.querySelector('.zh-recent');
        if (sec && sec.id !== 'zhNewest' && !sec.querySelector('.zh-poster')) sec.style.display = 'none';
    } catch (e) {}
}
/* Preenche a faixa de destaques da home (só existe quando NÃO há histórico):
   pega os filmes mais NOVOS do catálogo (all já vem ordenado por added) e monta
   os cards no mesmo visual — sem barra de progresso. Pula adultos. */
function fillHomeNewest(forceFull) {

    try {
        var row = document.getElementById('zhNewestRow'); if (!row) return;
                        if (row.childNodes.length && !forceFull) return;   // já preenchido
        var c = S.cat && S.cat.movies;
        if (!c || !c.all || !c.all.length) {
            if (isTvHomeMode() && !row.querySelector('.zh-skeleton')) {
                row.innerHTML = homeSkeletonCards(6);
                var pendingSec = document.getElementById('zhNewest'); if (pendingSec) pendingSec.style.display = '';
            }
            return;
        }
        if (forceFull) row.innerHTML = '';
        var h = '', n = 0;

        for (var i = 0; i < c.all.length && n < 14; i++) {
            var s = c.all[i];
            var sid = parseInt(s.stream_id || 0, 10); if (!sid) continue;
            var nm = s.name || '';
            if (isAdultContent('movies', sid, nm)) continue;
            var img = tmdbResize(s.stream_icon || '');
            var topLine = '';
            var ym = nm.match(/\(((?:19|20)\d{2})\)/);
            if (ym) { topLine = ym[1]; nm = nm.replace(ym[0], '').replace(/\s{2,}/g, ' ').replace(/^\s+|\s+$/g, ''); }
            var initials = (nm || 'UP').replace(/[^A-Za-zÀ-ÿ0-9 ]/g, '').trim().split(/\s+/).slice(0, 2).map(function (x) { return x.charAt(0); }).join('').toUpperCase() || 'UP';
            h += '<a class="zh-poster" href="/movies/' + sid + '">'
                + '<div class="pt-img zh-art"' + (img ? ' data-src="' + attr(img) + '"' : '') + '><span class="zh-art-fallback">' + esc(initials) + '</span></div>'
                + '<div class="zh-cbody">'
                + (topLine ? '<div class="zh-cyear">' + esc(topLine) + '</div>' : '')
                + '<div class="zh-cname">' + esc(nm) + '</div>'
                + '<div class="zh-cleft"></div>'
                + '</div></a>';
            n++;
        }
        if (!h) return;
        row.innerHTML = h;
        var sec = document.getElementById('zhNewest'); if (sec) sec.style.display = '';
                loadHomePosters();
        scheduleHomeFit(0);

    } catch (e) {}
}
/* GARANTIA de que nada sai da tela: se o conteúdo da home estourar a altura
   (ui.scrollHeight > clientHeight), encolhe as capas na medida exata do estouro.
   Topo e menus são fixos; SÓ as capas se adaptam. Em TV (sobra espaço) é no-op. */
function fitHomePosters() {
    try {
        if (getFormFactor() === 'tv') return; // TV Box usa scroll vertical; não encolher cards para caber em uma tela fixa
        var ui = document.querySelector('.zh-ui'), wrap = document.querySelector('.zh-posters');
        if (!ui || !wrap) return;
        var posters = wrap.querySelectorAll('.zh-poster'); if (!posters.length) return;
        var over = ui.scrollHeight - ui.clientHeight;
        if (over <= 0) return;                            // já cabe → não mexe
        // agnóstico à proporção do card: reduz a LARGURA na mesma razão do estouro
        // (o aspect-ratio do CSS encolhe a altura junto)
        var r0 = posters[0].getBoundingClientRect();
        if (!(r0.height > 0)) return;
        var newH = r0.height - over - 4; if (newH < 40) newH = 40;
        var newW = Math.floor(r0.width * (newH / r0.height));
        for (var i = 0; i < posters.length; i++) posters[i].style.width = newW + 'px';
    } catch (e) {}
}
/* Quantidade DINÂMICA + fileira CHEIA: calcula quantas capas cabem na largura;
   se a próxima "quase couber", encolhe todas um pouco (até ~22%) pra ela entrar
   e a fileira preencher a tela sem sobra. O resto fica escondido. */
function trimHomePosters() {
    try {
        if (getFormFactor() === 'tv') return; // manter todos os cards; a fileira rola horizontalmente na TV Box
        var wrap = document.querySelector('.zh-posters'); if (!wrap) return;
        var ps = wrap.querySelectorAll('.zh-poster'); if (!ps.length) return;
        for (var i = 0; i < ps.length; i++) ps[i].style.display = '';   // re-mostra tudo antes de medir
        var wr = wrap.getBoundingClientRect();
        var capW = ps[0].getBoundingClientRect().width;
        var gap = 0;
        try { gap = parseFloat(getComputedStyle(wrap).columnGap || getComputedStyle(wrap).gap) || 0; } catch (e) { gap = window.innerWidth * 0.015; }
        if (!gap) gap = window.innerWidth * 0.015;
        var cw = wr.width;
        var n = Math.floor((cw + gap) / (capW + gap)); if (n < 1) n = 1;
        if (ps.length > n) {
            var n2 = n + 1, w2 = (cw - (n2 - 1) * gap) / n2;   // largura pra caber +1
            if (w2 >= capW * 0.78) {                            // só se o aperto for pequeno
                n = n2;
                for (var k = 0; k < ps.length; k++) ps[k].style.width = Math.floor(w2) + 'px';
            }
        }
        for (var j = 0; j < ps.length; j++) ps[j].style.display = (j < n) ? '' : 'none';
    } catch (e) {}
}
/* Ajusta a home inteira: encolhe capas se estourar a ALTURA e esconde as que
   não cabem na LARGURA. Menus (topo/baixo) nunca se movem.
   ⚠️ ZERA as larguras inline ANTES de medir: sem isso cada passada media a
   largura JÁ encolhida da anterior e encolhia de novo (cards "pulavam"
   diminuindo a cada volta pra home). Tudo síncrono → sem flash. */
function fitHomeAll() {
    // No TV Box, medir e reescrever dezenas de cards durante a primeira
    // hidratação compete com as teclas do controle. A composição da TV já usa
    // rolagem horizontal/vertical e não precisa desse ajuste síncrono.
    if (isTvHomeMode()) return;
    try {
        var ps = document.querySelectorAll('.zh-poster');
        for (var i = 0; i < ps.length; i++) { ps[i].style.width = ''; ps[i].style.display = ''; }
    } catch (e) {}
    fitHomePosters();
    trimHomePosters();
}
function scheduleHomeFit(delay) {
    try {
        if (S._homeFitTimer) clearTimeout(S._homeFitTimer);
        S._homeFitTimer = setTimeout(function () { S._homeFitTimer = null; fitHomeAll(); }, Math.max(0, delay || 0));
    } catch (e) { try { fitHomeAll(); } catch (e2) {} }
}

/* Relógio da home que se atualiza sozinho (para quando sai da home). */
function startHomeClock() {
    try { if (S._homeClock) clearInterval(S._homeClock); } catch (e) {}
    S._homeClock = setInterval(function () {
        var c = document.getElementById('zxClock');
        if (!c) { try { clearInterval(S._homeClock); } catch (e) {} return; }
        var n = new Date(); c.textContent = p2(n.getHours()) + ':' + p2(n.getMinutes());
    }, 15000);
}
function applyPhoneHomeLayout() {
    try {
        var root = document.querySelector('.zx-home2'); if (!root) return;
        var w = window.innerWidth || 0, h = window.innerHeight || 0;
        var phone = w > 0 && h > w * 1.12 && w < 1200;
        var c = String(root.className || '').replace(/\s+zx-phone\b/g, '');
        root.className = c + (phone ? ' zx-phone' : '');
    } catch (e) {}
}
function homeStyles(ac) {
    var a = ac || '#10b981';
    return '<style>'
        + '.zx-home2{position:fixed;inset:0;overflow:hidden;background:transparent;font-family:system-ui,-apple-system,"Segoe UI",Roboto,sans-serif;}'
        + '.zx-panel-wall{position:absolute;inset:0;z-index:0;pointer-events:none;background-color:#080808;background-position:center center;background-repeat:no-repeat;background-size:cover;}'
        /* translateZ(0) = vira camada de GPU cacheada: o foco andando não re-rasteriza
           o degradê nem a marca d'água gigante (repaint por tecla em TV fraca) */
        + '.zh-amb{position:absolute;inset:0;pointer-events:none;transform:translateZ(0);background:radial-gradient(40% 55% at 18% 30%,' + a + '22,transparent 70%),radial-gradient(45% 60% at 85% 20%,rgba(20,120,90,.14),transparent 70%),radial-gradient(60% 60% at 50% 120%,' + a + '18,transparent 70%);}'
        + '.zh-wm{position:absolute;top:50%;left:50%;transform:translate(-50%,-50%) translateZ(0);z-index:0;pointer-events:none;user-select:none;font-weight:900;font-size:42vw;line-height:1;letter-spacing:-.03em;color:' + a + ';opacity:.045;white-space:nowrap;font-family:system-ui,-apple-system,"Segoe UI",Roboto,sans-serif;}'
        + '.zh-ui{position:absolute;inset:0;z-index:2;display:flex;flex-direction:column;padding:3.2vw 3.6vw 2.4vw;color:#f4f7f5;box-sizing:border-box;}'
        + '.zh-top{display:flex;align-items:center;justify-content:space-between;gap:2vw;}'
        + '.zh-logo .brand-logo{font-size:3vw;font-weight:900;}'
        + '.zh-clockwrap{text-align:center;flex:1;}'
        + '.zh-clock{font-size:3.8vw;font-weight:300;line-height:1;font-variant-numeric:tabular-nums;}'
        /* nome do servidor parceiro no lugar da hora (corta com … se for longo) */
        + '.zh-srvname{font-size:3vw;font-weight:800;line-height:1.1;max-width:42vw;margin:0 auto;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;text-transform:uppercase;}'
        + '.zh-date{color:#9db0a7;font-size:1.15vw;font-weight:500;margin-top:.5vw;text-transform:capitalize;}'
        + '.zh-icons{display:flex;align-items:center;gap:1.1vw;}'
        + '.zh-tbtn{display:flex;align-items:center;gap:.7vw;height:4.4vw;padding:0 1.4vw;border-radius:1.1vw;text-decoration:none;background:' + a + '14;border:1px solid ' + a + '3a;color:#f4f7f5;font-size:1.35vw;font-weight:700;}'
        + '.zh-tbtn.ic{width:4.4vw;padding:0;justify-content:center;}'
        + '.zh-tbtn svg{width:2vw;height:2vw;stroke:' + a + ';flex:none;}'
        + '.zh-profbtn .zx-pf-av{width:2.6vw;height:2.6vw;}'
        + '.zh-profbtn .zx-pf-av svg{width:1.45vw;height:1.45vw;stroke:none;}'
        + '.zh-tbtn:active,.zh-tbtn:hover{background:' + a + '26;}'
        + '.zh-tbtn:focus-visible{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 .24vw ' + a + ';outline:none;}'
        + '.zh-voice.is-listening{background:' + a + '55;border-color:' + a + ';animation:zxVoicePulse 1s infinite;}@keyframes zxVoicePulse{50%{box-shadow:0 0 0 .35vw ' + a + '66;}}'
        + '.voice-result-query{padding:14px 22px;color:#9db0a7;font-size:16px;}.voice-result-query strong{color:#f4f7f5;}'
        + '.zh-fav:focus-visible{outline:none;box-shadow:0 0 0 .28vw ' + a + ';border-radius:1vw;}'
        + '.zh-recent{margin-top:2vw;display:flex;flex-direction:column;gap:1vw;}'
        + '.zh-h2{display:flex;align-items:center;gap:.9vw;font-size:1.7vw;font-weight:800;}'
        + '.zh-h2 svg{width:2vw;height:2vw;stroke:' + a + ';}'
        /* CARDS horizontais (estilo Continue Watching): capa pequena à esquerda,
           ano/temporada + título + tempo restante + barra de progresso à direita.
           Largura limitada pela ALTURA da tela (46vh) e pela fatia da fileira (22vw). */
        + '.zh-posters{display:flex;gap:1.2vw;align-items:stretch;}'
        + 'body.zx-ff-tv .zx-home2 .zh-posters{overflow-x:auto;overflow-y:hidden;max-width:100%;overscroll-behavior:contain;scrollbar-width:thin;-webkit-overflow-scrolling:touch;}'
        + '.zh-poster{display:flex;flex-direction:row;text-decoration:none;color:#e7efe9;flex:none;width:min(40vh,22vw);aspect-ratio:2.42/1;background:rgba(255,255,255,.05);border:1px solid rgba(255,255,255,.09);border-radius:1.1vw;padding:.55vw;box-sizing:border-box;overflow:hidden;}'
        + '.zh-poster:focus,.zh-poster:focus-visible{border-color:' + a + ';box-shadow:0 0 0 .25vw ' + a + '66;outline:none;}'
        + '.zh-art{position:relative;height:100%;aspect-ratio:2/3;width:auto;flex:none;border-radius:.7vw;overflow:hidden;background:linear-gradient(145deg,' + a + '55,#10251b 58%,#07110d);background-size:cover;background-position:center;display:flex;align-items:center;justify-content:center;}'
        + '.zh-fav-quick{position:absolute;top:4px;right:4px;z-index:3;width:28px;height:28px;padding:0;border:1px solid rgba(255,255,255,.35);border-radius:50%;background:rgba(3,12,9,.82);color:#fff;font-size:18px;line-height:26px;text-align:center;cursor:pointer;}'
        + '.zh-fav-quick.is-on{color:' + a + ';border-color:' + a + ';}'
        + '.zh-fav-quick:focus,.zh-fav-quick:hover{outline:2px solid #fff;outline-offset:1px;}'   /* sem sombra com blur (peso em TV fraca) */
        + '.zh-art-fallback{font-size:1.6vw;font-weight:900;letter-spacing:.08em;color:#d8f5e7;text-shadow:0 2px 7px rgba(0,0,0,.45);}'
        + '.zh-art.is-loaded .zh-art-fallback{display:none;}'
        + '.zh-cbody{flex:1;min-width:0;display:flex;flex-direction:column;padding:.4vw .3vw .3vw .95vw;box-sizing:border-box;}'
        + '.zh-cyear{color:' + a + ';font-size:.95vw;font-weight:700;letter-spacing:.02em;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}'
        + '.zh-cname{color:#fff;font-size:1.15vw;font-weight:800;line-height:1.25;margin-top:.15vw;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}'
        + '.zh-cleft{margin-top:auto;color:#9db0a7;font-size:.9vw;white-space:nowrap;}'
        + '.zh-cbar{height:.32vw;background:rgba(255,255,255,.13);border-radius:1vw;margin-top:.35vw;overflow:hidden;}'
        + '.zh-cbar i{display:block;height:100%;background:' + a + ';border-radius:1vw;}'
        + '.zh-empty{color:#9db0a7;font-size:1.4vw;padding:3vw 0;}'
        /* NAV = 5 cards VERTICAIS grandes no topo (estilo referência 19/07); ocupa a
           altura livre (flex:1) — recentes + rodapé ficam embaixo. */
        + '.zh-nav{display:flex;align-items:stretch;gap:1.3vw;margin-top:2.2vw;flex:1;min-height:0;}'
        /* SEM transition e SEM glow interno: repinta pesado a cada tecla em TV fraca */
        + '.zh-tile{flex:1;display:flex;flex-direction:column;align-items:center;justify-content:center;gap:.7vw;padding:2vw 1vw;border-radius:1.5vw;text-decoration:none;color:#f4f7f5;background:' + a + '10;border:1px solid ' + a + '2e;}'
        /* TV ao Vivo = card MAIOR à esquerda (altura inteira da nav) */
        + '.zh-nav>.zh-tile{flex:0 0 32%;max-width:32%;gap:.45vw;}'   /* mesma distância ícone→nome dos outros cards */
        + '.zh-navr{flex:1;display:flex;flex-direction:column;gap:1.2vw;min-width:0;}'
        + '.zh-navtop{flex:1;display:flex;gap:1.2vw;min-height:0;}'
        /* Filmes/Séries são mais BAIXOS que o TV ao Vivo → miolo menor (ícone/gap/
           padding), senão o conteúdo enche o card e empurra a contagem pra borda */
        + '.zh-navtop .zh-tile{flex:1;gap:.45vw;padding:1.1vw 1vw;overflow:hidden;}'
        + '.zh-navtop .zh-ico{width:3.4vw;height:3.4vw;}'
        + '.zh-navtop .zh-ico svg{width:3.3vw;height:3.3vw;}'
        + '.zh-navtop .zh-tl{font-size:1.7vw;}'
        + '.zh-navbot{display:flex;gap:1.2vw;}'
        + '.zx-home2:not(.zx-phone) .zh-nav{display:grid;grid-template-columns:minmax(0,32%) minmax(0,1fr);gap:1.3vw;align-items:stretch;flex:1;min-height:0;}'
        + '.zx-home2:not(.zx-phone) .zh-nav>.zh-tile{width:auto;max-width:none;flex:none;min-height:0;}'
        + '.zx-home2:not(.zx-phone) .zh-navr{display:grid;grid-template-rows:minmax(0,1fr) auto;gap:1.2vw;min-height:0;}'
        + '.zx-home2:not(.zx-phone) .zh-navtop{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:1.2vw;min-height:0;}'
        + '.zx-home2:not(.zx-phone) .zh-navtop .zh-tile{height:auto;min-height:0;overflow:visible;}'
        + '.zx-home2:not(.zx-phone) .zh-navbot{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:1.2vw;}'
        /* fileira baixa: Favoritos + Playlist (ícone e texto na horizontal) */
        + '.zh-stile{flex:1;display:flex;align-items:center;justify-content:center;gap:.9vw;padding:1.25vw 1vw;border-radius:1.2vw;text-decoration:none;color:#f4f7f5;background:' + a + '10;border:1px solid ' + a + '2e;}'
        + '.zh-sico{display:flex;align-items:center;justify-content:center;flex:none;}'
        + '.zh-stile svg{width:2vw;height:2vw;stroke:' + a + ';}'
        + '.zh-stile b{font-size:1.5vw;font-weight:800;}'
        + '.zh-stx{display:flex;flex-direction:column;min-width:0;text-align:left;}'
        + '.zh-ssub{display:block;color:#9db0a7;font-size:1.05vw;font-weight:600;margin-top:.2vw;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}'
        + '.zh-stile:active,.zh-stile:hover{background:' + a + '26;border-color:' + a + '80;}'
        + '.zh-stile:focus-visible{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 .28vw ' + a + ';outline:none;}'
        + '.zh-tile:active,.zh-tile:hover{background:' + a + '26;border-color:' + a + '80;}'
        + '.zh-tile:focus-visible,.zh-tile.zh-tile-on{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 .28vw ' + a + ';outline:none;}'
        + '.zh-ico{width:4.4vw;height:4.4vw;display:flex;align-items:center;justify-content:center;flex:none;}'
        + '.zh-ico svg{width:4.3vw;height:4.3vw;stroke:' + a + ';}'
        + '.zh-tx{display:flex;flex-direction:column;min-width:0;align-items:center;text-align:center;max-width:100%;}'
        + '.zh-tl{font-size:1.85vw;font-weight:800;line-height:1.12;}'
        + '.zh-tsub{display:block;color:#9db0a7;font-size:1.15vw;font-weight:600;margin-top:.4vw;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;max-width:100%;}'
        + '.zh-fav{display:flex;align-items:center;justify-content:center;width:4vw;text-decoration:none;}'
        + '.zh-fav svg{width:2.3vw;height:2.3vw;stroke:' + a + ';fill:none;}'
        + '.zh-fav:active{opacity:.55;}'
        + '.zh-div{width:1px;align-self:center;height:58%;background:rgba(255,255,255,.09);}'
        + '.zh-status{display:flex;align-items:center;gap:2.2vw;margin-top:1.6vw;padding:0 .5vw;color:#9db0a7;font-size:1.2vw;}'
        + '.zh-status span{display:flex;gap:.6vw;}'
        + '.zh-status b{color:#dbe7e0;font-weight:700;}'
        + '.zh-bar{width:1px;height:1.4vw;background:rgba(255,255,255,.14);}'
        + '.zh-badge{margin-left:auto;color:' + a + ';font-weight:800;text-transform:uppercase;letter-spacing:.06em;font-size:1vw;border:1px solid ' + a + '3a;border-radius:1vw;padding:.35vw .8vw;}'
        + '@media (max-width:600px) and (orientation:portrait){'
        + '.zx-home2{overflow-y:auto;}'
        + '.zh-ui{position:relative;min-height:100vh;height:auto;overflow-y:visible;padding:14px 14px 24px;}'
        + '.zh-top{gap:7px;align-items:center;}'
        + '.zh-logo .brand-logo{font-size:22px;letter-spacing:4px;}'
        + '.zh-clock{font-size:22px;}'
        + '.zh-date{font-size:10px;margin-top:3px;}'
        + '.zh-icons{gap:5px;}'
        + '.zh-tbtn{height:32px;padding:0 8px;border-radius:9px;font-size:11px;gap:4px;}'
        + '.zh-tbtn.ic{width:32px;padding:0;}'
        + '.zh-tbtn svg{width:16px;height:16px;}'
        + '.zh-profbtn .zx-pf-av{width:30px;height:30px;}'
        + '.zh-nav{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:8px;margin-top:16px;flex:none;min-height:auto;}'
        + '.zh-nav>.zh-tile,.zh-navtop .zh-tile{flex:none;max-width:none;width:auto;min-height:108px;height:108px;gap:7px;padding:10px 6px;border-radius:12px;}'
        + '.zh-navr,.zh-navtop,.zh-navbot{display:contents;}'
        + '.zh-navtop .zh-ico{width:28px;height:28px;}'
        + '.zh-navtop .zh-ico svg{width:27px;height:27px;}'
        + '.zh-ico{width:30px;height:30px;}'
        + '.zh-ico svg{width:29px;height:29px;}'
        + '.zh-tl{font-size:13px;}'
        + '.zh-tsub{font-size:10px;margin-top:3px;}'
        + '.zh-stile{min-height:58px;height:58px;padding:8px 6px;border-radius:10px;gap:5px;}'
        + '.zh-stile svg{width:18px;height:18px;}'
        + '.zh-stile b{font-size:11px;}'
        + '.zh-ssub{font-size:9px;margin-top:2px;}'
        + '.zh-recent{margin-top:16px;gap:8px;}'
        + '.zh-h2{font-size:14px;gap:6px;}'
        + '.zh-h2 svg{width:16px;height:16px;}'
        + '.zh-posters{gap:8px;overflow-x:auto;padding-bottom:2px;}'
        + '.zh-poster{width:165px;min-width:165px;aspect-ratio:2.1/1;border-radius:9px;padding:5px;}'
        + '.zh-cbody{padding:4px 3px 3px 7px;}'
        + '.zh-art-fallback{font-size:22px;}'
        + '.zh-cyear{font-size:10px;}'
        + '.zh-cname{font-size:12px;}'
        + '.zh-cleft{font-size:9px;}'
        + '.zh-status{font-size:10px;gap:8px;margin-top:12px;white-space:nowrap;overflow:hidden;}'
        + '.zh-status span{gap:3px;}'
        + '.zh-badge{font-size:8px;padding:3px 6px;}'
        + '}'
        + '.zx-home2.zx-phone{overflow-y:auto;}'
        + '.zx-home2.zx-phone .zh-ui{position:relative;min-height:100vh;height:auto;overflow-y:visible;padding:16px 14px 30px;}'
        + '.zx-home2.zx-phone .zh-top{gap:7px;align-items:center;}'
        + '.zx-home2.zx-phone .zh-logo .brand-logo{font-size:24px;letter-spacing:3px;}'
        + '.zx-home2.zx-phone .zh-clock{font-size:24px;}'
        + '.zx-home2.zx-phone .zh-date{font-size:11px;margin-top:3px;}'
        + '.zx-home2.zx-phone .zh-icons{gap:5px;}'
        + '.zx-home2.zx-phone .zh-tbtn{height:34px;padding:0 8px;border-radius:9px;font-size:11px;gap:4px;}'
        + '.zx-home2.zx-phone .zh-tbtn.ic{width:34px;padding:0;}'
        + '.zx-home2.zx-phone .zh-tbtn svg{width:17px;height:17px;}'
        + '.zx-home2.zx-phone .zh-profbtn .zx-pf-av{width:32px;height:32px;}'
        + '.zx-home2.zx-phone .zh-nav{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:9px;margin-top:18px;flex:none;min-height:auto;}'
        + '.zx-home2.zx-phone .zh-nav>.zh-tile,.zx-home2.zx-phone .zh-navtop .zh-tile{flex:none;max-width:none;width:auto;min-height:122px;height:122px;gap:8px;padding:12px 6px;border-radius:12px;}'
        + '.zx-home2.zx-phone .zh-navr,.zx-home2.zx-phone .zh-navtop,.zx-home2.zx-phone .zh-navbot{display:contents;}'
        + '.zx-home2.zx-phone .zh-ico,.zx-home2.zx-phone .zh-navtop .zh-ico{width:36px;height:36px;}'
        + '.zx-home2.zx-phone .zh-ico svg,.zx-home2.zx-phone .zh-navtop .zh-ico svg{width:35px;height:35px;}'
        + '.zx-home2.zx-phone .zh-tl{font-size:15px;}'
        + '.zx-home2.zx-phone .zh-tsub{font-size:11px;margin-top:4px;}'
        + '.zx-home2.zx-phone .zh-stile{min-height:64px;height:64px;padding:9px 6px;border-radius:10px;gap:5px;}'
        + '.zx-home2.zx-phone .zh-stile svg{width:19px;height:19px;}'
        + '.zx-home2.zx-phone .zh-stile b{font-size:12px;}'
        + '.zx-home2.zx-phone .zh-ssub{font-size:10px;margin-top:2px;}'
        + '.zx-home2.zx-phone .zh-recent{margin-top:18px;gap:9px;}'
        + '.zx-home2.zx-phone .zh-h2{font-size:15px;gap:6px;}'
        + '.zx-home2.zx-phone .zh-h2 svg{width:17px;height:17px;}'
        + '.zx-home2.zx-phone .zh-posters{gap:8px;overflow-x:auto;padding-bottom:2px;}'
        + '.zx-home2.zx-phone .zh-poster{width:180px;min-width:180px;aspect-ratio:2.1/1;border-radius:9px;padding:5px;}'
        + '.zx-home2.zx-phone .zh-cbody{padding:4px 3px 3px 7px;}'
        + '.zx-home2.zx-phone .zh-art-fallback{font-size:24px;}'
        + '.zx-home2.zx-phone .zh-cyear{font-size:11px;}'
        + '.zx-home2.zx-phone .zh-cname{font-size:13px;}'
        + '.zx-home2.zx-phone .zh-cleft{font-size:10px;}'
        + '.zx-home2.zx-phone .zh-status{font-size:10px;gap:8px;margin-top:14px;white-space:nowrap;overflow:hidden;}'
        + '.zx-home2.zx-phone .zh-status span{gap:3px;}'
        + '.zx-home2.zx-phone .zh-badge{font-size:8px;padding:3px 6px;}'
        /* telefone: cabeçalho em duas linhas e cards com altura fixa; não herda o card alto de TV */
        + '.zx-home2.zx-phone .zh-top{display:grid;grid-template-columns:minmax(0,1fr) auto;grid-template-rows:auto auto;column-gap:8px;row-gap:4px;align-items:center;}'
        + '.zx-home2.zx-phone .zh-logo{min-width:0;grid-column:1;grid-row:1;overflow:hidden;}.zx-home2.zx-phone .zh-logo .brand-lockup{gap:6px;}.zx-home2.zx-phone .zh-logo .brand-mark{width:34px;height:34px;}.zx-home2.zx-phone .zh-logo .brand-logo{font-size:20px;letter-spacing:2px;white-space:nowrap;}'
        + '.zx-home2.zx-phone .zh-icons{grid-column:2;grid-row:1;justify-self:end;}'
        + '.zx-home2.zx-phone .zh-clockwrap{grid-column:1 / -1;grid-row:2;min-width:0;text-align:center;padding-top:2px;}'
        + '.zx-home2.zx-phone .zh-clock{font-size:20px;}.zx-home2.zx-phone .zh-date{font-size:10px;}'
        + '.zx-home2.zx-phone .zh-nav{display:grid!important;grid-template-columns:repeat(2,minmax(0,1fr));grid-auto-rows:116px;align-items:stretch;gap:9px;flex:none!important;height:auto!important;min-height:0!important;}'
        + '.zx-home2.zx-phone .zh-nav>.zh-tile,.zx-home2.zx-phone .zh-navtop .zh-tile{height:116px!important;min-height:116px!important;max-height:116px!important;flex:none!important;}'
        + '.zx-home2.zx-phone .zh-navr,.zx-home2.zx-phone .zh-navtop,.zx-home2.zx-phone .zh-navbot{display:contents!important;}'
        + '.zx-home2.zx-mobile{overflow-y:auto !important;overflow-x:hidden !important;} .zx-home2.zx-mobile .zh-ui{position:relative !important;min-height:100vh;height:auto !important;overflow:visible !important;padding-bottom:34px;} .zx-home2.zx-mobile .zh-nav{display:flex !important;position:relative !important;align-items:stretch !important;flex:none !important;width:100% !important;height:132px !important;min-height:132px !important;margin:18px 0 16px !important;padding:4px 4px 10px !important;gap:9px !important;overflow-x:auto !important;overflow-y:hidden !important;box-sizing:border-box !important;scrollbar-width:thin !important;-webkit-overflow-scrolling:touch;} .zx-home2.zx-mobile .zh-navr,.zx-home2.zx-mobile .zh-navtop,.zx-home2.zx-mobile .zh-navbot{display:contents !important;} .zx-home2.zx-mobile .zh-nav>.zh-tile,.zx-home2.zx-mobile .zh-navtop .zh-tile,.zx-home2.zx-mobile .zh-navbot .zh-stile{display:flex !important;position:relative !important;float:none !important;flex:0 0 190px !important;width:190px !important;min-width:190px !important;max-width:190px !important;height:116px !important;min-height:116px !important;max-height:116px !important;margin:0 !important;box-sizing:border-box !important;overflow:hidden !important;scroll-snap-align:start;} .zx-home2.zx-mobile .zh-recent{position:relative !important;display:flex !important;clear:both !important;margin-top:8px !important;max-width:100% !important;overflow:hidden !important;} .zx-home2.zx-mobile .zh-posters{display:flex !important;position:relative !important;max-width:100% !important;overflow-x:auto !important;overflow-y:hidden !important;padding:2px 4px 8px !important;box-sizing:border-box !important;} .zx-home2.zx-mobile .zh-poster{flex:0 0 165px !important;width:165px !important;min-width:165px !important;height:79px !important;min-height:79px !important;max-height:79px !important;}'
        + '</style>';
}
/* Aviso de vencimento (só na HOME). Usa license do resolve (zero rede extra).
   Aparece quando NÃO é free e o acesso está perto do fim (<=7d) ou já venceu.
   Dispensável por dia (data-ver muda no countdown → reaparece amanhã). Igual ao
   renderPaywall, só EXIBE a URL de renovar (o WebView2 não abre link externo). */
function licWarnHtml(lic, ac) {
    // REMOVIDO (03/07, pedido do Leonardo): a faixa "Seu acesso termina em X dias"
    // empurrava a home inteira pra baixo e não vale a pena — quem vence cai no
    // renderPaywall (QR+MAC) de qualquer forma. wireAnnounce é null-safe (if lw).
    return '';
}
function announceStyles(ac) {
    // ⚠️ A faixa é NOTIFICAÇÃO → fica FLUTUANDO no topo (position:fixed), NÃO no
    // fluxo. Antes empurrava o grupo centralizado da home pra baixo e o
    // "Recarregar"/infos saíam da tela (pedido do Leonardo). Fixed = overlay,
    // conteúdo NÃO se move. left/right + margin auto centra sem transform
    // (seguro em TV velha). z abaixo do popup (99999).
    return '<style>.zx-ann-banner{position:fixed;top:10px;left:12px;right:12px;z-index:500;display:flex;align-items:flex-start;gap:12px;max-width:1100px;margin:0 auto;background:rgba(12,20,16,0.97);border:1px solid ' + ac + '66;border-left:4px solid ' + ac + ';border-radius:12px;padding:12px 16px;box-sizing:border-box;box-shadow:0 8px 24px rgba(0,0,0,0.5);}'
        + '.zx-ann-ico{font-size:20px;line-height:1.2;flex:0 0 auto;}.zx-ann-body{flex:1;min-width:0;}.zx-ann-title{font-weight:700;color:#fff;margin-bottom:2px;}.zx-ann-text{color:#cfe8df;font-size:15px;line-height:1.45;white-space:pre-line;}'
        + '.zx-ann-x{flex:0 0 auto;background:transparent;border:0;color:#9fb4ac;font-size:18px;cursor:pointer;padding:2px 8px;border-radius:8px;line-height:1;}.zx-ann-x:hover,.zx-ann-x:focus{color:#fff;background:rgba(255,255,255,0.10);outline:none;}'
        + '.zx-ann-overlay{position:fixed;top:0;left:0;right:0;bottom:0;z-index:99999;display:flex;align-items:center;justify-content:center;background:rgba(0,0,0,0.72);padding:24px;box-sizing:border-box;}'
        + '.zx-ann-pop{background:#161616;border:1px solid ' + ac + '66;border-radius:16px;padding:26px 28px;max-width:520px;width:100%;text-align:center;box-shadow:0 16px 50px rgba(0,0,0,0.6);box-sizing:border-box;}'
        + '.zx-ann-pop-ico{font-size:34px;margin-bottom:8px;}.zx-ann-pop-title{font-weight:700;color:#fff;font-size:20px;margin-bottom:8px;}.zx-ann-pop-text{color:#d6d6d6;font-size:16px;line-height:1.55;margin-bottom:20px;white-space:pre-line;}'
        + '.zx-ann-pop-ok{background:' + ac + ';color:#04231a;font-weight:700;border:0;border-radius:10px;padding:12px 34px;font-size:16px;cursor:pointer;}.zx-ann-pop-ok:focus{outline:3px solid #fff;outline-offset:2px;}'
        + '.zx-lic-warn{display:flex;align-items:center;gap:12px;max-width:1100px;margin:0 auto 6px;background:rgba(245,158,11,0.12);border:1px solid rgba(245,158,11,0.4);border-left:4px solid #f59e0b;border-radius:12px;padding:11px 16px;box-sizing:border-box;}'
        + '.zx-lic-warn.exp{background:rgba(239,68,68,0.12);border-color:rgba(239,68,68,0.4);border-left-color:#ef4444;}'
        + '.zx-lic-ico{font-size:19px;line-height:1;flex:0 0 auto;}.zx-lic-body{flex:1;min-width:0;color:#e9dcc4;font-size:14.5px;line-height:1.4;}.zx-lic-warn.exp .zx-lic-body{color:#f3d2d2;}.zx-lic-body strong{color:#fff;}'
        + '.zx-lic-x{flex:0 0 auto;background:transparent;border:0;color:#b6a98c;font-size:17px;cursor:pointer;padding:2px 8px;border-radius:8px;line-height:1;}.zx-lic-x:hover,.zx-lic-x:focus{color:#fff;background:rgba(255,255,255,0.10);outline:none;}</style>';
}
function wireAnnounce(ann) {
    function dismissed(k, v) { try { return localStorage.getItem(k) === v; } catch (e) { return false; } }
    function setD(k, v) { try { localStorage.setItem(k, v); } catch (e) {} }
    // Aviso de vencimento (independe do announce; pode aparecer sem ele)
    var lw = $('zxLicWarn');
    if (lw) {
        var lv = lw.getAttribute('data-ver');
        if (!dismissed('zx:licwarn', lv)) lw.style.display = 'flex';
        var lx = $('zxLicWarnX'); if (lx) lx.addEventListener('click', function () { setD('zx:licwarn', lv); lw.style.display = 'none'; });
    }
    if (!ann) return;
    var ban = $('zxAnnBanner');
    if (ban) { var bv = ban.getAttribute('data-ver'); if (!dismissed('zx:annban', bv)) ban.style.display = 'flex'; var bx = $('zxAnnBannerX'); if (bx) bx.addEventListener('click', function () { setD('zx:annban', bv); ban.style.display = 'none'; }); }
    var pop = $('zxAnnPopup');
    if (pop) {
        var pv = pop.getAttribute('data-ver'), ok = $('zxAnnPopupOk');
        function closePop() {
            pop.style.display = 'none'; setD('zx:annpop', pv);
            try { document.body.classList.remove('tv-modal-open'); } catch (e) {}
            focusHomeStart();   // devolve o foco pro TV ao Vivo ao fechar
        }
        if (!dismissed('zx:annpop', pv)) {
            pop.style.display = 'flex';
            try { document.body.classList.add('tv-modal-open'); } catch (e) {}   // PRENDE as setas no modal
            if (ok) { ok.addEventListener('click', closePop); setTimeout(function () { try { ok.focus(); } catch (e) {} }, 60); setTimeout(function () { try { if (pop.style.display !== 'none' && !pop.contains(document.activeElement)) ok.focus(); } catch (e) {} }, 400); }
            pop.addEventListener('click', function (ev) { if (ev.target === pop) closePop(); });
        }
    }
}

/* ---- HOME "Favoritos": TODOS os favoritos juntos (filmes + séries + canais) ----
   Bug corrigido: o tile "Favoritos" da home ia pra /favorites = renderSection
   ('movies',...) e mostrava SÓ favoritos de filme. Agora junta os 3 tipos numa
   grade só; cada tile roteia certo (filme→detalhe, série→detalhe, canal→toca). */
/* Padrão visual (degradê + marca d'água FUSION + pill Voltar verde) pras telas
   simples: FAVORITOS e LISTAS/Playlist. Injetado no setHtml de cada uma. */
function flatStyles() {
    var a = S.accent || '#10b981';
    return '<style>'
        // ⚠️ PERF TV fraca (19/07): favoritos/busca ROLAM — fundo CHAPADO, sem marca
        // d'água fixa atrás do scroll (re-compunha a tela toda por quadro).
        + '.search-screen{background:#0a1611;font-family:system-ui,-apple-system,"Segoe UI",Roboto,sans-serif;}'
        + '.gt-back{background:' + a + '14;border:1px solid ' + a + '3a;border-radius:12px;color:#f4f7f5;}'
        + '.gt-back:focus{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;outline:none;}'
        // tela de PESQUISA (filmes/séries): campo escuro + botão Buscar verde
        + '.search-form .vkb-trigger,.search-form input.vkb-native{background:#0b1310;border-color:rgba(255,255,255,.12);border-radius:12px;color:#f4f7f5;}'
        + '.search-form .vkb-trigger:focus,.search-form input.vkb-native:focus{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '33;outline:none;}'
        + '.search-go{background:' + a + ';color:#04231a;font-weight:800;border-color:' + a + ';border-radius:12px;}'
        + '.search-go:focus{outline:none;border-color:#fff;box-shadow:0 0 0 3px ' + a + '66;}'
        // card "Sua lista" (Playlist adicionada) — vidro verde no lugar do cinza
        + '.zx-list-card{background:' + a + '0d;border:1px solid ' + a + '24;border-radius:18px;}'
        + '.zx-list-cap{color:#8fa39a;}'
        + '.zx-list-user{color:#9db0a7;}'
        + '.zx-list-swap{border-radius:12px;}'
        + '.zx-list-swap:focus,.zx-list-swap.is-focus{outline:none;box-shadow:0 0 0 3px #fff;}'
        + '</style>';
}
function favTile(it, kind) {
    var name = it.name || '', img = tmdbResize(it.poster || it.logo || ''), href, extra = '';
    if (kind === 'movies') href = '/movies/' + it.id;
    else if (kind === 'series') href = '/series/' + it.id;
    else { href = '/live/channel/' + it.id + '?name=' + encodeURIComponent(name) + '&logo=' + encodeURIComponent(it.logo || it.poster || ''); extra = ' style="background-size:contain"'; }
    return '<a class="poster-tile-tv" href="' + href + '">'
        + '<div class="pt-img"' + (img ? ' data-src="' + attr(img) + '"' : '') + extra + '>'
        + '<div class="pt-fallback">' + esc((name || '').slice(0, 2)) + '</div></div>'
        + '<div class="pt-name">' + esc(name) + '</div></a>';
}
function renderFavHome() {
    var movies = localFavList('movie'), series = localFavList('series'), lives = localFavList('live');
    var tiles = '', i;
    for (i = 0; i < movies.length; i++) tiles += favTile(movies[i], 'movies');
    for (i = 0; i < series.length; i++) tiles += favTile(series[i], 'series');
    for (i = 0; i < lives.length; i++) tiles += favTile(lives[i], 'live');
    // Layout full-width (igual à Busca): topo "← Voltar" + título, e a grade
    // EMPILHADA. SEM menu de tipos (o usuário pediu). Nav por seta = tv.js
    // (navGridByIndex em .poster-tile-tv); imagens via lazyGrid; Back = Esc/global.
    var body = tiles
        ? '<div class="poster-grid-tv" id="content-grid">' + tiles + '</div>'
        : '<div style="color:#aaa;padding:50px 20px;text-align:center;">Você ainda não favoritou nada.<br>Abra um filme, série ou canal e toque em <strong>Favoritos</strong>.</div>';
    setHtml('<div class="search-screen"><div class="search-topbar"><a href="/home" class="gt-back" autofocus>← Voltar</a><div class="search-title">Favoritos</div></div>'
        + '<div class="search-body">' + body + '</div></div>' + flatStyles());
    if (tiles) { fitPosterGrid($('content-grid')); lazyGrid($('content-grid')); }
    afterRender();
}
function renderQueueHome() {
    var items = queueList(), tiles = '';
    for (var i = 0; i < items.length; i++) tiles += queueTile(items[i]);
    var body = tiles
        ? '<div class="poster-grid-tv" id="content-grid">' + tiles + '</div>'
        : '<div style="color:#aaa;padding:50px 20px;text-align:center;">Sua fila está vazia.<br>Abra um conteúdo e diga <strong>“adicionar à fila”</strong> para guardá-lo.</div>';
    var clearBtn = items.length ? '<button type="button" class="btn-tv" id="zxQueueClear" style="margin-left:auto;padding:8px 12px;font-size:13px">Limpar fila</button>' : '';
    setHtml('<div class="search-screen"><div class="search-topbar"><a href="/home" class="gt-back" autofocus>← Voltar</a><div class="search-title">Minha Fila</div>' + clearBtn + '</div>'
        + '<div class="search-body">' + body + '</div></div>' + flatStyles());
    if (tiles) { fitPosterGrid($('content-grid')); lazyGrid($('content-grid')); }
    var clear = $('zxQueueClear'); if (clear) clear.addEventListener('click', showQueueClearConfirm);
    afterRender();
}
function renderAlertsHome() {
    var alarms = epgAlarms().filter(function (a) { return a && a.when > Date.now(); }).sort(function (a, b) { return a.when - b.when; }), html = '';
    for (var i = 0; i < alarms.length; i++) {
        var a = alarms[i], dt = new Date(a.when), date = p2(dt.getDate()) + '/' + p2(dt.getMonth() + 1) + ' ' + p2(dt.getHours()) + ':' + p2(dt.getMinutes());
        html += '<div class="zx-alert-row"><div><strong>🔔 ' + esc(a.title || 'Programa') + '</strong><small>' + esc(a.channel || 'Canal') + ' • ' + esc(date) + '</small></div><button type="button" class="btn-tv zx-alert-remove" data-alert-key="' + attr(a.key || '') + '">Remover</button></div>';
    }
    var body = html || '<div style="color:#aaa;padding:50px 20px;text-align:center;">Você não tem alertas programados.<br>Na tela de EPG, toque no sino ou diga <strong>“me avise quando começar…”</strong>.</div>';
    setHtml('<div class="search-screen"><div class="search-topbar"><a href="/home" class="gt-back" autofocus>← Voltar</a><div class="search-title">Meus Alertas</div></div><div class="search-body zx-alerts-body">' + body + '</div></div><style>.zx-alerts-body{padding:18px;max-width:900px;margin:0 auto}.zx-alert-row{display:flex;align-items:center;justify-content:space-between;gap:14px;padding:15px 16px;margin-bottom:10px;border:1px solid rgba(16,185,129,.28);border-radius:15px;background:rgba(16,185,129,.08);color:#fff}.zx-alert-row strong{display:block;font-size:17px}.zx-alert-row small{display:block;margin-top:5px;color:#9db0a7}.zx-alert-remove{flex:0 0 auto;padding:9px 13px;font-size:13px}</style>');
    var bs = document.querySelectorAll('.zx-alert-remove');
    for (var j = 0; j < bs.length; j++) (function (b) { b.addEventListener('click', function () { var key = b.getAttribute('data-alert-key') || '', next = epgAlarms().filter(function (a) { return a.key !== key; }); saveEpgAlarms(next); renderAlertsHome(); }); })(bs[j]);
    afterRender();
}

/* ---- SEÇÃO (filmes/séries/canais) ---- */
/* Tela "Sem conexão — Recarregar" (SÓ Android): mostrada quando um conteúdo
   NUNCA carregado falha por falta de internet (em vez do vazio feio). O
   "Recarregar" re-renderiza a tela ATUAL → como a falha NÃO é cacheada
   (ensureCatalog/xtInfo), ao voltar a internet ele busca de novo e aparece. */
function renderOfflineReload() {
    var cur = ''; try { cur = (history.state && history.state.p) || ''; } catch (e) {}
    setHtml('<div class="zx-offl-wrap"><div class="zx-offl-box">'
        + '<div class="zx-offl-emoji">📡</div><div class="zx-offl-t">Sem conexão</div>'
        + '<div class="zx-offl-d">Não deu pra carregar este conteúdo. Verifique a internet e recarregue.</div>'
        + '<div class="zx-offl-btns"><button type="button" class="btn-tv is-primary" id="zxOfflReload" autofocus><span class="btn-icon"><svg width="22" height="22" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2" stroke-linecap="round" stroke-linejoin="round"><polyline points="23 4 23 10 17 10"></polyline><path d="M20.49 15a9 9 0 1 1-2.12-9.36L23 10"></path></svg></span>Recarregar</button>'
        + '<a href="/home" class="btn-tv">← Início</a></div></div></div>'
        + '<style>.zx-offl-wrap{position:fixed;inset:0;display:-webkit-box;display:flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;padding:24px;text-align:center}.zx-offl-box{max-width:460px}.zx-offl-emoji{font-size:54px;margin-bottom:14px}.zx-offl-t{font-size:24px;font-weight:800;color:#fff;margin-bottom:8px}.zx-offl-d{font-size:15px;color:#9fb3ab;margin-bottom:24px;line-height:1.45}.zx-offl-btns{display:-webkit-box;display:flex;gap:12px;-webkit-box-pack:center;justify-content:center}.zx-offl-box .btn-tv{display:-webkit-inline-box;display:inline-flex;-webkit-box-align:center;align-items:center;gap:8px}</style>');
    var b = $('zxOfflReload'); if (b) b.addEventListener('click', function () { go(cur || '/home', true); });
    afterRender();
}
function renderSection(kind, opts) {
    opts = opts || {};
    if (!S.server) return renderNoPlaylist();   // sem lista -> "Playlist não adicionada"
    showLoading(true);
    ensureCatalog(kind, true).then(function (cat) {
        // Proteção contra regressão: uma resposta de preview/cache vazia nunca
        // pode abrir a tela Live sem canais. Reconsulta uma vez e só então pinta.
        if (kind === 'live' && isTvHomeMode() && !opts._liveRetry && (!cat || cat.partial || !cat.cats || !cat.cats.length || !cat.all || !cat.all.length)) {
            opts._liveRetry = true;
            return refreshCatalog(kind, true).then(function (full) { showLoading(false); return renderLiveSection(full, opts); });
        }
        if (kind !== 'live' && cat && cat.partial && opts.catId && !cat.byCat[String(opts.catId)]) {
            showLoading(true);
            return refreshCatalog(kind, true).then(function () { return renderSection(kind, opts); });
        }
        showLoading(false);
        if (kind === 'live') return renderLiveSection(cat, opts);
        renderVodSection(kind, cat, opts);
    }).catch(function (err) {
        showLoading(false);
        if (err && err.zxOffline) return renderOfflineReload();   // Android offline: tela Recarregar
                if (kind === 'live') {
            var cachedLive = null;
            try { cachedLive = normalizeLiveCatalog(readCatalogCache('live') || S.cat.live); } catch (cacheErr) { cachedLive = normalizeLiveCatalog(S.cat.live); }
            if (cachedLive && cachedLive.cats && cachedLive.cats.length) { S.cat.live = cachedLive; showLoading(false); return renderLiveSection(cachedLive, opts); }
        }
        setHtml('<div style="padding:60px;text-align:center;color:#aaa">Não foi possível carregar. <a href="/home" style="color:#fff;text-decoration:underline">Voltar</a></div>');

    });
}

function vodSidebar(kind, cat, selName) {
    var searchHref = '/' + kind + '/search';
    var contLabel = kind === 'series' ? 'Continue Assistindo' : 'Continue Assistindo';
    var h = '<div class="cat-sidebar"><a href="/home" class="cat-pill cat-pill-back"><span>← Voltar</span></a>'
        + '<a href="' + searchHref + '" class="cat-pill cat-pill-icon" autofocus><span><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><circle cx="11" cy="11" r="7"></circle><path d="M21 21l-4.3-4.3"></path></svg> Pesquisar</span></a>'
        + '<a href="/' + kind + '/continue" data-replace="1" class="cat-pill ' + (selName === 'Continue Assistindo' ? 'is-active' : '') + '"><span>' + contLabel + '</span><span class="cat-count"></span></a>'
        + '<a href="/' + kind + '/favorites" data-replace="1" class="cat-pill ' + (selName === 'Favoritos' ? 'is-active' : '') + '"><span>Favoritos</span><span class="cat-count">' + (S.fav[kind === 'series' ? 'series' : 'movie'].length || '') + '</span></a>'
        + '<a href="/' + kind + '/recent" data-replace="1" class="cat-pill ' + (selName === 'Recém adicionados' ? 'is-active' : '') + '"><span>Recém adicionados</span></a>'
        + '<a href="/' + kind + '/top-rated" data-replace="1" class="cat-pill ' + (selName === 'Maior nota' ? 'is-active' : '') + '"><span>Maior nota</span></a>'
        + '<a href="/' + kind + '/most-watched" data-replace="1" class="cat-pill ' + (selName === 'Mais assistidos' ? 'is-active' : '') + '"><span>Mais assistidos</span></a>';
    for (var i = 0; i < cat.cats.length; i++) {
        var c = cat.cats[i];
        var active = (selName === c.category_name);
        var lock = c.adult ? '<svg class="cat-lock" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><rect x="3" y="11" width="18" height="11" rx="2"></rect><path d="M7 11V7a5 5 0 0 1 10 0v4"></path></svg>' : '';
        h += '<a href="/' + kind + '/category/' + c.category_id + '" class="cat-pill ' + (active ? 'is-active' : '') + '"><span>' + lock + esc(c.category_name) + '</span><span class="cat-count">' + (c.num || '') + '</span></a>';
    }
    return h + '</div>';
}
function firstNonAdult(cat) { for (var i = 0; i < cat.cats.length; i++) if (!cat.cats[i].adult) return cat.cats[i]; return cat.cats[0] || null; }
function vodItemId(kind, item) { return parseInt((kind === 'series' ? (item && (item.series_id || item.stream_id)) : (item && item.stream_id)) || 0, 10) || 0; }
function mostWatchedVod(kind, list) {
    var sec = kind === 'series' ? 'series' : 'vod', d = lsGet(kind === 'series' ? 'zx_cont_series' : 'zx_cont_vod') || {}, hist = d.items || [], scores = {}, fav = S.fav[kind === 'series' ? 'series' : 'movie'] || [];
    for (var i = 0; i < hist.length; i++) { var h = hist[i] || {}, hid = parseInt(h.id || 0, 10); if (hid) scores[hid] = 1000000 + (parseInt(h.ts || 0, 10) || 0); }
    return (list || []).slice().sort(function (a, b) { var ai = vodItemId(kind, a), bi = vodItemId(kind, b), as = (scores[ai] || 0) + (inArr(fav, ai) ? 500000 : 0), bs = (scores[bi] || 0) + (inArr(fav, bi) ? 500000 : 0); if (as !== bs) return bs - as; return (parseInt(b.added || b.last_modified || 0, 10) || 0) - (parseInt(a.added || a.last_modified || 0, 10) || 0); });
}
function topRatedVod(kind, list) { return (list || []).slice().sort(function (a, b) { var ar = tmdbRatingFor(kind, a) || {}, br = tmdbRatingFor(kind, b) || {}, av = Number(ar.vote_average || 0), bv = Number(br.vote_average || 0); if (av !== bv) return bv - av; return Number(br.vote_count || 0) - Number(ar.vote_count || 0); }); }

function renderVodSection(kind, cat, opts) {
    var selCat = null, selName = '', tiles = '', hasMore = false, virtual = opts.virtual || '';
    var moreText = kind === 'series' ? 'Carregando mais séries…' : 'Carregando mais filmes…';
    var emptyText = kind === 'series' ? 'Nenhuma série nessa categoria.' : 'Nenhum filme nessa categoria.';
    // Voltar de um detalhe (history.back → /movies|/series SEM categoria): restaura a
    // categoria (ou virtual 'v:favoritos' etc.) onde o usuário estava — IGUAL aos
    // canais (S.liveBack). O clique na pill troca IN-PLACE (category_browser) e no
    // Android o replaceState dele NÃO grava (file:// não deixa mexer na URL) → quem
    // grava é o próprio category_browser via ZLocal.S.vodBack (switchCategory/Virtual).
    if (!opts.catId && !virtual && S.vodBack && S.vodBack[kind]) {
        var zvb = String(S.vodBack[kind]);
        if (zvb.indexOf('v:') === 0) virtual = zvb.slice(2);
        else opts.catId = zvb;
    }
    if (opts.catId) { S.vodBack = S.vodBack || {}; S.vodBack[kind] = String(opts.catId); }
    // Voltar de um DETALHE → devolve a rolagem/foco de onde o usuário saiu
    // (salvo no clique do tile). Consumido UMA vez; render novo limpa.
    var backPos = (S.vodPos && S.vodPos.kind === kind) ? S.vodPos : null;
    S.vodPos = null;
    var startPage = 1;

    function paint() {
        setHtml('<div class="sidebar-screen">' + vodSidebar(kind, cat, selName)
            + '<div class="sidebar-content" id="sidebar-content"><div class="sc-title" id="sc-title">' + esc(selName || (kind === 'series' ? 'Séries' : 'Filmes')) + '</div>'
            + '<div id="grid-empty" style="color:#aaa;padding:40px;text-align:center;' + (tiles ? 'display:none;' : '') + '">' + emptyText + '</div>'
            + '<div class="poster-grid-tv" id="content-grid">' + tiles + '</div>'
            + '<div class="grid-loadmore" id="grid-loadmore" ' + (hasMore ? '' : 'style="display:none"') + '>' + moreText + '</div></div></div>' + liveStyles());
        // ⚠️ Globais do category_browser DIRETO em JS — NÃO como <script> no
        // innerHTML (script inserido por innerHTML NÃO executa → __catKind ficava
        // undefined → KIND caía no default 'movies' → clicar categoria de
        // série/canal não casava o rxCat e o <a> navegava nativo pra file:// =
        // ERR_FILE_NOT_FOUND; e __catHasMore não chegava → paginação >100 morta).
        global.__catKind = kind; global.__catId = (selCat || 0); global.__catPage = startPage;
        global.__catHasMore = !!hasMore; global.__catMoreText = moreText;
        runScript('assets/category_browser.js');
        // contadores das categorias virtuais (continue) — lazy, com cache
        var csec = kind === 'series' ? 'series' : 'vod';
        continueList(csec).then(function (d) {
            var n = (d && d.items) ? d.items.length : 0;
            var pill = document.querySelector('.cat-sidebar a[href="/' + kind + '/continue"] .cat-count');
            if (pill && n) pill.textContent = n;
        });
        afterRender();
        // Voltou de um detalhe → devolve a rolagem (grade E sidebar) e foca o tile
        // de onde saiu. Sem posição salva → só garante a categoria ATIVA visível na
        // sidebar (senão a pill fica marcada lá embaixo mas a lista abre no topo).
        var bp = backPos; backPos = null;
        setTimeout(function () {
            var sb = document.querySelector('.cat-sidebar');
            if (bp) {
                var scEl = document.getElementById('sidebar-content');
                if (scEl) scEl.scrollTop = bp.top;
                if (sb) sb.scrollTop = bp.side || 0;
                try {
                    var t = bp.href && document.querySelector('#content-grid a[href="' + bp.href + '"]');
                    if (t && t.focus) t.focus();
                } catch (e) {}
                if (scEl) scEl.scrollTop = bp.top;          // re-assenta (o focus pode deslocar)
                if (sb) sb.scrollTop = bp.side || 0;
            } else if (sb) {
                var ap = sb.querySelector('.cat-pill.is-active');
                if (ap && sb.scrollHeight > sb.clientHeight) {
                    var t2 = ap.offsetTop - sb.clientHeight / 2 + ap.offsetHeight / 2;
                    if (t2 > 0) sb.scrollTop = t2;           // centraliza a pill ativa
                }
            }
        }, 60);
    }

    if (virtual) {
        selName = virtual === 'favorites' ? 'Favoritos' : virtual === 'continue' ? 'Continue Assistindo' : virtual === 'top-rated' ? 'Maior nota' : virtual === 'most-watched' ? 'Mais assistidos' : 'Recém adicionados';
        if (virtual === 'recent') { tiles = posterTiles(cat.all.slice(0, 200), kind); paint(); return; }
        if (virtual === 'top-rated') {
            tmdbEnrichCatalog(kind, cat.all, 32).then(function () { tiles = posterTiles(topRatedVod(kind, cat.all).slice(0, 120), kind); paint(); }).catch(function () { tiles = posterTiles(cat.all.slice(0, 120), kind); paint(); });
            return;
        }
        if (virtual === 'most-watched') { tiles = posterTiles(mostWatchedVod(kind, cat.all).slice(0, 120), kind); paint(); return; }
        // favorites/continue via /api/r (com cache p/ offline)
        var k = kind === 'series' ? 'series' : 'movie';
        var sec = kind === 'series' ? 'series' : 'vod';
        // LOCAL: favoritos do aparelho; continue do aparelho.
        var call = virtual === 'favorites' ? Promise.resolve({ ok: true, items: localFavList(k) }) : continueList(sec);
        call.then(function (d) {
            var items = (d && d.items) || [];
            // mapeia {id,name,poster} → tile
            var list = items.map(function (it) { var o = {}; o[kind === 'series' ? 'series_id' : 'stream_id'] = it.id; o.name = it.name; o[kind === 'series' ? 'cover' : 'stream_icon'] = it.poster; return o; });
            tiles = posterTiles(list, kind); paint();
        });
        return;
    }

    var c = opts.catId ? findCat(cat, opts.catId) : firstNonAdult(cat);
    if (c) {
        selCat = c.category_id; selName = c.category_name;
        var list = streamsForCat(kind, selCat);
        // Voltando de um detalhe: re-renderiza a MESMA quantidade de tiles que já
        // estava carregada (dados são locais, é barato) → a rolagem salva alcança
        // o ponto onde o usuário estava; a paginação continua da página certa.
        var initial = PAGE;
        if (backPos && backPos.count > PAGE) initial = Math.min(list.length, backPos.count);
        tiles = posterTiles(list.slice(0, initial), kind);
        hasMore = list.length > initial;
        startPage = Math.max(1, Math.ceil(initial / PAGE));
    }
        paint();
    if (c && tmdbApiKey()) {
        var tmdbScope = kind + ':category:' + String(selCat || 'all'); S._tmdbVodScope = tmdbScope;
        tmdbEnrichCatalog(kind, list, 24).then(function () {
            if (S._tmdbVodScope !== tmdbScope) return;
            var grid = document.getElementById('content-grid');
            if (grid) { grid.innerHTML = posterTiles(list.slice(0, initial), kind); afterRender(); }
        });
    }
}
function findCat(cat, id) { for (var i = 0; i < cat.cats.length; i++) if (String(cat.cats[i].category_id) === String(id)) return cat.cats[i]; return null; }

/* ---- SEÇÃO LIVE (lista + EPG + busca inline) ---- */
/* Visual novo das seções TV AO VIVO + FILMES + SÉRIES (Android teste): mesmo
   padrão da home — fundo em degradê + marca d'água FUSION, pills "vidro" verde e
   foco em ANEL verde (acabou o fundo branco estourado). Os seletores de canal/
   EPG só casam na tela de canais; nas de VOD ficam inertes. O <style> vai no
   setHtml de cada tela, então NÃO vaza pras outras plataformas. */
function liveStyles() {
    var a = S.accent || '#10b981', ta = themeRgba(a, 0.22), tb = themeRgba(a, 0.30), tc = themeRgba(a, 0.62), td = themeRgba(a, 0.72);

    return '<style>'
        // ⚠️ PERF TV fraca (19/07): esta tela ROLA — fundo CHAPADO (degradê + marca
        // d'água atrás de scroll re-compõem a tela toda por quadro) e SEM transition.
        + '.sidebar-screen{background:#0a1611;font-family:system-ui,-apple-system,"Segoe UI",Roboto,sans-serif;}'
        // ---- sidebar de categorias ----
        // ⚠️ SÓ cores/borda — tamanho/fonte/padding ficam com o tv.css (que tem as
        // regras responsivas por tela; fixar aqui deixava as pills GROSSAS no celular).
        + '.cat-sidebar .cat-pill{background:' + a + '0d;border-color:' + a + '24;border-radius:13px;color:#e7efe9;}'
        // MODO TV (Android): sidebar/pills em vw = MESMA proporção em qualquer
        // densidade. TVs enxergam 960/1280/1920 px CSS na mesma tela 1080p; em px
        // fixo as categorias ficavam GIGANTES numa TV e pequenas na outra (19/07).
        // pills mais LARGAS (pedido 19/07): sidebar larga (29vw) e altura/fonte
        // normais — cresce pro LADO, não pra cima. Capas seguem 4 colunas (alvo
        // é % da tela, a conta continua dando 4 com a sidebar larga).
        + 'body.zx-ff-tv .cat-sidebar,body.ui-tv .cat-sidebar{width:20vw !important;max-width:20vw !important;height:100% !important;box-sizing:border-box !important;padding:.45vw .4vw .45vw .5vw !important;display:flex !important;flex-direction:column !important;align-items:stretch !important;overflow-x:hidden !important;overflow-y:auto !important;scroll-behavior:auto !important;}'
        + 'body.zx-ff-tv .sidebar-content,body.ui-tv .sidebar-content{left:20vw !important;padding:.45vw .8vw .8vw !important;}'
        + 'body.zx-ff-tv .cat-sidebar .cat-pill,body.ui-tv .cat-sidebar .cat-pill{font-size:14px !important;padding:8px .8vw !important;margin-bottom:4px !important;min-height:48px !important;height:48px !important;max-height:48px !important;border-radius:8px !important;line-height:1.08 !important;display:flex !important;align-items:center !important;overflow:hidden !important;white-space:nowrap !important;text-overflow:ellipsis !important;}'
        + 'body.zx-ff-tv .cat-sidebar .cat-pill>span:first-child,body.ui-tv .cat-sidebar .cat-pill>span:first-child{white-space:nowrap !important;overflow:hidden !important;text-overflow:ellipsis !important;line-height:1.08 !important;min-width:0 !important;}'
        + 'body.zx-ff-tv .cat-sidebar .cat-pill .cat-count,body.ui-tv .cat-sidebar .cat-pill .cat-count{font-size:12px !important;right:.55vw;margin-left:auto;margin-top:0 !important;line-height:1 !important;}'
        + 'body.zx-ff-tv .cat-sidebar .cat-lock,body.ui-tv .cat-sidebar .cat-lock{width:14px !important;height:14px !important;flex:none !important;}'
        + 'body.zx-ff-tv .cat-sidebar .cat-pill:focus-visible,body.ui-tv .cat-sidebar .cat-pill:focus-visible{scroll-margin-top:10px;scroll-margin-bottom:10px;}'
        + 'body.zx-ff-tv .cat-sidebar .cat-pill:focus,body.ui-tv .cat-sidebar .cat-pill:focus{background:' + ta + ' !important;border-color:' + td + ' !important;color:#ffffff !important;box-shadow:0 0 0 2px #ffffff,0 0 0 5px ' + tc + ' !important;outline:none !important;}'
        + 'body.zx-ff-tv .cat-sidebar .cat-pill.is-active,body.ui-tv .cat-sidebar .cat-pill.is-active{background:' + ta + ' !important;border-color:' + td + ' !important;color:#ffffff !important;box-shadow:inset 0 0 0 1px ' + tc + ' !important;}'
        + 'body.zx-ff-tv a:focus,body.zx-ff-tv button:focus,body.zx-ff-tv [tabindex]:focus,body.ui-tv a:focus,body.ui-tv button:focus,body.ui-tv [tabindex]:focus{outline:2px solid #ffffff !important;outline-offset:2px !important;box-shadow:0 0 0 5px ' + tc + ' !important;background-color:' + ta + ' !important;color:#ffffff !important;}'
        + 'body.zx-ff-tv .sidebar-content .sc-title{font-size:1.8vw;margin-bottom:1.1vw;}'
        + 'body.zx-ff-tv .live-split .channel-tile-tv,body.ui-tv .live-split .channel-tile-tv{min-height:64px !important;height:64px !important;padding:6px 7px !important;margin-bottom:4px !important;border-radius:8px !important;}'
        + 'body.zx-ff-tv .live-split .channel-tile-tv .ct-logo,body.ui-tv .live-split .channel-tile-tv .ct-logo{width:36px !important;height:36px !important;min-width:36px !important;min-height:36px !important;margin-right:6px !important;border-radius:6px !important;background-size:contain !important;background-position:center !important;background-repeat:no-repeat !important;}'
        + 'body.zx-ff-tv .live-split .channel-tile-tv .ct-name,body.ui-tv .live-split .channel-tile-tv .ct-name{font-size:14px !important;line-height:1.12 !important;}'
        + 'body.zx-ff-tv .live-split .channel-tile-tv .ct-num,body.ui-tv .live-split .channel-tile-tv .ct-num{font-size:11px !important;margin-bottom:1px !important;}'
        + '.cat-sidebar .cat-pill:hover{border-color:' + a + '80;}'
        + '.cat-sidebar .cat-pill .cat-count{color:#8fa39a;}'
                + '.cat-sidebar .cat-pill:focus{background:' + ta + ';border-color:' + td + ';box-shadow:0 0 0 2px ' + tc + ';color:#fff;outline:none;}'

        + '.cat-sidebar .cat-pill:focus .cat-count{color:#cfe8df;}'
                + '.cat-sidebar .cat-pill.is-active{background:' + ta + ';border-color:' + td + ';color:#fff;}'

        + '.cat-sidebar .cat-pill.is-active .cat-count{color:#cfe8df;}'
        + '.cat-sidebar .cat-pill-back{color:#cfe0d8;}'
        // busca de canais (input nativo do Android) no mesmo vidro verde
        + '.cat-sidebar input.vkb-native{background:' + a + '0d;border-color:' + a + '24;}'
        + '.cat-sidebar input.vkb-native:focus{border-color:' + a + ';background:' + a + '14;}'
        + '.sidebar-content .sc-title{font-weight:800;border-left:4px solid ' + a + ';}'
        // ---- tiles de canal ----
        + '.channel-tile-tv{background-color:' + a + '0d;background-image:none;border:1px solid ' + a + '22;border-radius:14px;box-shadow:none;}'
        + '.channel-tile-tv:hover{border-color:' + a + '80;}'
        + '.channel-tile-tv .ct-logo{background-color:#0d1a14;border-radius:10px;}'
                + '.channel-tile-tv:focus{background:' + ta + ';color:#fff;border-color:' + td + ';box-shadow:0 0 0 2px ' + tc + ';}'

        + '.channel-tile-tv:focus .ct-num{color:#cfe8df;}'
        + '.channel-tile-tv:focus .ct-name{color:#fff;}'
        // ---- painel de EPG ----
        + '.live-right-column{display:flex;flex-direction:column;min-width:0;min-height:0;gap:14px;}'
        + '.live-video-slot{height:clamp(180px,28vh,340px);flex:0 0 auto;display:flex;align-items:center;justify-content:center;border:1px solid ' + a + '28;border-radius:16px;background:linear-gradient(145deg,#08120e,#13251d);overflow:hidden;color:#8fa39a;font-size:14px;text-align:center;}'
        + '.live-video-hint{padding:16px;}'
        + 'body.zx-ff-tv .live-split,body.ui-tv .live-split{display:grid !important;grid-template-columns:minmax(320px,1fr) minmax(520px,55%) !important;gap:10px !important;align-items:stretch !important;height:calc(100vh - 55px) !important;min-height:0 !important;}'
        + 'body.zx-ff-tv .live-right-column,body.ui-tv .live-right-column{min-height:0 !important;height:100% !important;display:flex !important;flex-direction:column !important;overflow:hidden !important;}'
        + 'body.zx-ff-tv .live-video-slot,body.ui-tv .live-video-slot{height:clamp(260px,42vh,500px) !important;flex:0 0 auto !important;}'
        + 'body.zx-ff-tv .live-epg,body.ui-tv .live-epg{flex:1 1 0 !important;min-height:0 !important;max-height:none !important;height:auto !important;overflow-y:auto !important;overflow-x:hidden !important;position:static !important;}'
        + 'body.zx-ff-tv .live-epg .epg-body,body.ui-tv .live-epg .epg-body{max-height:none !important;overflow-y:visible !important;}'
        + 'body.zx-ff-mobile .live-split{display:grid !important;grid-template-columns:minmax(260px,1fr) minmax(420px,50%) !important;gap:10px !important;align-items:stretch !important;height:calc(100vh - 55px) !important;min-height:0 !important;}'
        + 'body.zx-ff-mobile .live-right-column{min-height:0 !important;height:100% !important;display:flex !important;flex-direction:column !important;overflow:hidden !important;}'
        + 'body.zx-ff-mobile .live-video-slot{height:clamp(180px,28vh,320px) !important;flex:0 0 auto !important;}'
        + 'body.zx-ff-mobile .live-epg{flex:1 1 0 !important;min-height:0 !important;max-height:none !important;height:auto !important;overflow-y:auto !important;overflow-x:hidden !important;position:static !important;}'
        + 'body.zx-ff-mobile .live-epg .epg-body{max-height:none !important;overflow-y:visible !important;}'
        + '.live-epg{background:rgba(255,255,255,.028);border:1px solid rgba(255,255,255,.07);border-radius:16px;padding:18px 20px;box-sizing:border-box;}'
        + '.live-epg .epg-item{border-top:1px solid rgba(255,255,255,.06);}'
        + '.live-epg .epg-time{color:#8fa39a;font-size:8px;line-height:1.05;}'
        + '.live-epg .epg-sub{color:#8fa39a;font-size:9px;line-height:1.05;}'
        + '.live-epg{max-height:calc(100vh - 92px);overflow-y:auto;overscroll-behavior:contain;scrollbar-width:thin;}'
        + '.live-epg .epg-body{max-height:calc(100vh - 190px);overflow-y:auto;overscroll-behavior:contain;padding-right:4px;scrollbar-width:thin;}'
        + '.live-epg .epg-item{position:relative;padding:8px 46px 8px 0;min-height:46px;box-sizing:border-box;}'
        + '.live-epg .epg-copy{display:block;min-width:0;}'
        + '.live-epg .epg-title{font-size:10px;line-height:1.05;font-weight:650;}'
        + '.epg-alarm{position:absolute;right:0;top:50%;z-index:5;pointer-events:auto;touch-action:manipulation;transform:translateY(-50%);width:38px;height:38px;border:1px solid ' + a + '44;border-radius:10px;background:' + a + '12;color:#9fb4aa;font-size:18px;cursor:pointer;}'
        + '.epg-alarm:hover,.epg-alarm:focus,.epg-alarm:focus-visible{border-color:' + td + ';color:#fff;outline:2px solid #fff;outline-offset:2px;background:' + ta + ';box-shadow:0 0 0 5px ' + tc + ';}'
        + '.epg-alarm.is-on{background:' + a + '42;color:' + a + ';}'
        + '.zx-epg-toast{position:fixed;left:50%;bottom:28px;transform:translateX(-50%);z-index:100001;display:flex;align-items:center;gap:10px;max-width:min(560px,88vw);padding:14px 20px;border:1px solid rgba(255,255,255,.18);border-radius:16px;background:rgba(9,20,15,.96);box-shadow:0 14px 36px rgba(0,0,0,.45);color:#f4fff9;font-size:16px;font-weight:700;text-align:center;line-height:1.25;}'
        + '.zx-epg-toast.is-enabled{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '33,0 14px 36px rgba(0,0,0,.45);}'
        + '.zx-epg-toast-icon{font-size:22px;flex:none;}'
        + '.zx-epg-alarm-modal{position:fixed;inset:0;z-index:100000;display:flex;align-items:center;justify-content:center;background:rgba(0,0,0,.78);padding:20px;box-sizing:border-box;}'
        + '.zx-epg-alarm-card{width:min(460px,92vw);padding:30px 24px;border:2px solid ' + a + ';border-radius:22px;background:linear-gradient(145deg,#12261e,#07120d);box-shadow:0 18px 60px rgba(0,0,0,.7);text-align:center;color:#fff;}'
        + '.zx-epg-alarm-bell{font-size:42px;margin-bottom:6px;}.zx-epg-alarm-title{font-size:26px;font-weight:900;color:' + a + ';}.zx-epg-alarm-name{font-size:21px;font-weight:800;margin-top:12px;}.zx-epg-alarm-channel{font-size:15px;color:#a7bbb1;margin-top:6px;}.zx-epg-alarm-count{font-size:64px;font-weight:900;margin:14px 0;color:#fff;}.zx-epg-alarm-close{border:0;border-radius:10px;padding:11px 28px;background:' + a + ';color:#04231a;font-weight:800;font-size:16px;}'
        + '.server-list-body{padding:28px 22px;}.server-list-grid{max-width:760px;margin:0 auto;display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:14px;}.server-list-item{display:flex;align-items:center;gap:14px;min-height:82px;padding:14px 16px;border:1px solid ' + a + '35;border-radius:16px;background:' + a + '0d;color:#f4f7f5;text-align:left;cursor:pointer;}.server-list-item:hover,.server-list-item:focus,.server-list-item.is-active{border-color:' + a + ';background:' + a + '26;outline:none;box-shadow:0 0 0 3px ' + a + '33;}.server-list-icon{width:34px;height:34px;display:flex;align-items:center;justify-content:center;color:' + a + ';flex:none;}.server-list-icon svg{width:30px;height:30px;}.server-list-text{display:flex;flex-direction:column;min-width:0;flex:1;}.server-list-text b{font-size:16px;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}.server-list-text small{margin-top:4px;color:#9db0a7;font-size:11px;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;}.server-list-check{font-size:22px;color:' + a + ';}.server-list-note{max-width:760px;margin:18px auto;text-align:center;color:#8fa39a;font-size:13px;}'
        + '@media (max-width:600px) and (orientation:portrait){.server-list-grid{grid-template-columns:1fr;gap:10px;}.server-list-body{padding:18px 14px;}.server-list-item{min-height:70px;}.server-list-text b{font-size:14px;}.server-list-text small{font-size:10px;}}'
        + '.grid-loadmore{color:#8fa39a;}'
        + '</style>';
}
function enforceLiveLayout() {
    try {
        var screen = document.querySelector('.sidebar-screen');
        var split = document.querySelector('.live-split');
        var grid = document.querySelector('#content-grid');
        var side = document.querySelector('.cat-sidebar');
        var content = document.querySelector('.sidebar-content');
        var right = document.querySelector('.live-right-column');
        var slot = document.querySelector('.live-video-slot');
        var epg = document.querySelector('.live-epg');
        if (!split) return;
        var cls = document.body ? (' ' + document.body.className + ' ') : '';
        var ff = getFormFactor();
        var nativeTv = nativeAvail() && ff !== 'mobile';
        var tv = ff === 'tv' || (!ff && nativeTv) || (ff !== 'mobile' && cls.indexOf(' ui-tv ') >= 0) || cls.indexOf(' zx-ff-tv ') >= 0;
        var androidLandscape = nativeAvail() && (ff === 'mobile' || ff === 'tv' || !ff);
        var landscapeLayout = tv || androidLandscape;
        if (landscapeLayout) {
            var ww = Math.max(720, global.innerWidth || document.documentElement.clientWidth || 1280);
            var mobileMode = ff === 'mobile' || (androidLandscape && !tv);
            var sidebarW = Math.round(ww * (mobileMode ? 0.20 : 0.15));
            var rightW = Math.round(ww * (mobileMode ? 0.50 : 0.55));
            if (screen) { screen.style.height = '100vh'; screen.style.overflow = 'hidden'; }
            if (side) { side.style.width = sidebarW + 'px'; side.style.maxWidth = sidebarW + 'px'; side.style.height = '100vh'; side.style.overflowY = 'auto'; side.style.overflowX = 'hidden'; side.style.padding = '6px 4px'; }
            if (content) { content.style.left = sidebarW + 'px'; content.style.height = '100vh'; content.style.overflow = 'hidden'; content.style.padding = '6px 10px 10px'; }
            split.style.display = 'grid'; split.style.gridTemplateColumns = 'minmax(250px,1fr) ' + rightW + 'px'; split.style.gap = '8px'; split.style.alignItems = 'stretch'; split.style.height = 'calc(100vh - 55px)'; split.style.minHeight = '0';
            if (grid) { grid.style.height = '100%'; grid.style.minHeight = '0'; grid.style.overflowY = 'auto'; grid.style.overflowX = 'hidden'; grid.style.paddingBottom = '24px'; }
            if (right) { right.style.display = 'flex'; right.style.flexDirection = 'column'; right.style.height = 'calc(100vh - 55px)'; right.style.minHeight = '0'; right.style.overflow = 'hidden'; right.style.gap = '6px'; }
            if (slot) { slot.style.height = mobileMode ? 'clamp(180px,28vh,320px)' : 'clamp(160px,24vh,240px)'; slot.style.flex = '0 0 auto'; }
            if (epg) { epg.style.display = 'block'; epg.style.flex = '1 1 0'; epg.style.minHeight = '0'; epg.style.height = 'auto'; epg.style.maxHeight = 'none'; epg.style.overflowY = 'auto'; epg.style.overflowX = 'hidden'; }
        } else {
            if (screen) { screen.style.height = ''; screen.style.overflow = ''; }
            split.style.display = 'flex'; split.style.flexDirection = 'column'; split.style.gap = '12px'; split.style.height = ''; split.style.minHeight = '';
            if (grid) { grid.style.height = ''; grid.style.minHeight = ''; grid.style.overflowY = ''; grid.style.overflowX = ''; }
            if (side) { side.style.width = ''; side.style.maxWidth = ''; side.style.height = ''; side.style.overflowY = ''; side.style.overflowX = ''; side.style.padding = ''; }
            if (content) { content.style.left = ''; content.style.height = ''; content.style.overflow = ''; content.style.padding = ''; }
            if (right) { right.style.height = 'auto'; right.style.minHeight = ''; right.style.overflow = ''; }
            if (slot) { slot.style.height = '180px'; }
            if (epg) { epg.style.display = 'block'; epg.style.height = 'auto'; epg.style.maxHeight = 'none'; epg.style.overflowY = 'auto'; }
        }
        if (global.__zxSyncMiniVideoBounds) { setTimeout(global.__zxSyncMiniVideoBounds, 50); setTimeout(global.__zxSyncMiniVideoBounds, 350); }
    } catch (e) {}
}
if (!global.__zxLiveResizeBound) {
    global.__zxLiveResizeBound = true;
    global.addEventListener('resize', function () { setTimeout(enforceLiveLayout, 50); });
}
function wireLiveRemoteFocus() {
    if (!nativeAvail() || getFormFactor() !== 'tv') return;
    var side = document.querySelector('.cat-sidebar'), content = document.getElementById('content-grid');
    if (!side || !content || side.getAttribute('data-remote-focus')) return;
    side.setAttribute('data-remote-focus', '1');
    function keepVisible(scroller, el) {
        try {
            if (!scroller || !el) return;
            var top = el.offsetTop, bottom = top + el.offsetHeight, viewTop = scroller.scrollTop, viewBottom = viewTop + scroller.clientHeight;
            if (top < viewTop) scroller.scrollTop = Math.max(0, top - 12);
            else if (bottom > viewBottom) scroller.scrollTop = Math.max(0, bottom - scroller.clientHeight + 12);
        } catch (e) {}
    }
    side.addEventListener('focusin', function (e) { if (e.target && String(e.target.className || '').indexOf('cat-pill') >= 0) keepVisible(side, e.target); }, true);
    content.addEventListener('focusin', function (e) { var row = e.target && String(e.target.className || '').indexOf('channel-tile-tv') >= 0 ? e.target : null; if (row) keepVisible(content, row); }, true);
    side.addEventListener('keydown', function (e) {
        var key = e.key || '';
        var target = e.target;
        if (key === 'ArrowRight' && target && target.className && String(target.className).indexOf('cat-pill') >= 0) {
            var first = content.querySelector('.channel-tile-tv');
            if (first) { e.preventDefault(); e.stopPropagation(); first.focus(); }
        } else if (key === 'ArrowUp' && target && target.className && String(target.className).indexOf('cat-pill') >= 0) {
            var back = side.querySelector('.cat-pill-back');
            if (back && target !== back) { var links = side.querySelectorAll('.cat-pill'); if (links.length && target === links[1]) { e.preventDefault(); e.stopPropagation(); back.focus(); } }
        }
    }, true);
    content.addEventListener('keydown', function (e) {
        var key = e.key || '', target = e.target;
        if (key === 'ArrowLeft' && target && target.className && String(target.className).indexOf('channel-tile-tv') >= 0) {
            var active = side.querySelector('.cat-pill.is-active') || side.querySelector('.cat-pill');
            if (active) { e.preventDefault(); e.stopPropagation(); active.focus(); }
        }
    }, true);
}
function normalizeLiveCatalog(cat) {
    if (!cat) return null;
    cat.cats = Array.isArray(cat.cats) ? cat.cats : [];
    cat.byCat = cat.byCat || {};
    cat.all = Array.isArray(cat.all) ? cat.all : [];
    // Algumas respostas M3U/Xtream podem trazer os canais, mas não a lista
    // auxiliar de categorias. Recria uma categoria visível sem descartar canais.
    if (!cat.cats.length && cat.all.length) {
        var groups = {}, order = [], i;
        for (i = 0; i < cat.all.length; i++) {
            var item = cat.all[i], name = item.category_name || item.group || item.group_title || 'Canais';
            if (!groups[name]) { groups[name] = []; order.push(name); }
            groups[name].push(item);
        }
        for (i = 0; i < order.length; i++) {
            var key = order[i], id = String(i + 1);
            cat.byCat[id] = groups[key];
            for (var j = 0; j < groups[key].length; j++) groups[key][j].category_id = id;
            cat.cats.push({ category_id: id, category_name: key, num: groups[key].length, adult: isAdultName(key) });
        }
    }
    return cat;
}
function renderLiveSection(cat, opts) {
    cat = normalizeLiveCatalog(cat);
    var selCat = null, selName = '', tiles = '', virtual = opts.virtual || '';

    // PC: voltando de um canal (history.back → /live SEM categoria) → restaura a
    // categoria de onde saiu (setada no goPlay). Senão caía na 1ª (Casa do Patrão).
    if (!nativeAvail() && !opts.catId && !virtual && S.liveBack) {   // PC + Samsung (Android toca direto, não navega)
        var lb = S.liveBack; S.liveBack = null; var mm = lb.match(/\/live\/category\/(\d+)/);
        if (mm) opts.catId = mm[1];
        else if (lb.indexOf('/recent') >= 0) virtual = 'recent';
        else if (lb.indexOf('/favorites') >= 0) virtual = 'favorites';
    }
    var favCount = S.fav.live.length || '';

    function sidebar() {
        var h = '<div class="cat-sidebar"><a href="/home" class="cat-pill cat-pill-back"><span>← Voltar</span></a>'
            + '<div class="cat-pill cat-pill-icon vkb-trigger" id="live-search-trigger" role="button" tabindex="0" data-vkb-target="live-q" data-vkb-label="Buscar canal" data-vkb-placeholder="Buscar canal…"><span><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><circle cx="11" cy="11" r="7"></circle><path d="M21 21l-4.3-4.3"></path></svg> Pesquisar</span></div>'
            + '<input type="hidden" id="live-q" value="">'
            + '<a href="/live/recent" data-replace="1" class="cat-pill ' + (selName === 'Canais Recentes' ? 'is-active' : '') + '"><span>Recentes</span></a>'
            + '<a href="/live/favorites" data-replace="1" class="cat-pill ' + (selName === 'Canais Favoritos' ? 'is-active' : '') + '"><span>Favoritos</span><span class="cat-count">' + favCount + '</span></a>';
        for (var i = 0; i < cat.cats.length; i++) {
            var c = cat.cats[i]; var active = (selName === c.category_name);
            var lock = c.adult ? '<svg class="cat-lock" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><rect x="3" y="11" width="18" height="11" rx="2"></rect><path d="M7 11V7a5 5 0 0 1 10 0v4"></path></svg>' : '';
            h += '<a href="/live/category/' + c.category_id + '" class="cat-pill ' + (active ? 'is-active' : '') + '"><span>' + lock + esc(c.category_name) + '</span><span class="cat-count">' + (c.num || '') + '</span></a>';
        }
        return h + '</div>';
    }
    function paint() {
        setHtml('<div class="sidebar-screen">' + sidebar()
            + '<div class="sidebar-content" id="sidebar-content"><div class="sc-title" id="sc-title">' + esc(selName || 'TV ao vivo') + '</div>'
            + '<div id="grid-empty" style="color:#aaa;padding:40px;text-align:center;' + (tiles ? 'display:none;' : '') + '">Selecione uma categoria para ver os canais.</div>'
                        + '<div class="live-split"><div class="channel-grid-tv" id="content-grid">' + tiles + '</div>'
            + '<div class="live-right-column"><div class="live-video-slot" id="live-video-slot"><div class="live-video-hint">Selecione um canal para iniciar o mini player</div></div>'
            + '<div class="live-epg" id="live-epg"><div class="epg-empty">Passe num canal para ver a programação.</div></div></div></div>'
            + '<div class="grid-loadmore" id="grid-loadmore" style="display:none">Carregando…</div></div></div>' + liveStyles());
        // Globais DIRETO em JS (script no innerHTML não executa — ver renderVodSection).
        global.__catKind = 'live'; global.__catId = (selCat || 0); global.__catPage = 1;
        global.__catHasMore = false; global.__catMoreText = 'Carregando…';
        runScript('assets/category_browser.js');
        wireLiveSearch();
        wireLiveEpg();
        wireLiveRemoteFocus();
        loadChannelLogos();
        setTimeout(enforceLiveLayout, 30); setTimeout(enforceLiveLayout, 420);
        afterRender();
    }

    if (virtual === 'favorites') {
        selName = 'Canais Favoritos';
        var fl = localFavList('live');   // LOCAL
        tiles = channelTiles(fl.map(function (it) { return { stream_id: it.id, name: it.name, stream_icon: it.logo || it.poster, num: 0 }; }));
        paint();
        return;
    }
    if (virtual === 'recent') {
        selName = 'Canais Recentes';
        tiles = channelTiles(recentLiveList().map(function (it) { return { stream_id: it.id, name: it.name, stream_icon: it.logo, num: 0 }; }));   // LOCAL
        paint();
        return;
    }
    var c = opts.catId ? findCat(cat, opts.catId) : firstNonAdult(cat);
    if (c) { selCat = c.category_id; selName = c.category_name; tiles = channelTiles(streamsForCat('live', selCat)); }
    paint();
}
function wireLiveSearch() {
    var liveQ = $('live-q');
    function run() { var v = liveQ ? (liveQ.value || '') : ''; if (v.replace(/^\s+|\s+$/g, '').length >= 2) { if (global.__liveSearch) global.__liveSearch(v); } else { if (global.__liveSearchClear) global.__liveSearchClear(); } }
    if (liveQ) { var dt = null; liveQ.addEventListener('input', function () { if (dt) clearTimeout(dt); dt = setTimeout(run, 130); }); }
    var trig = $('live-search-trigger');
    if (trig && global.HdxKeyboard) HdxKeyboard.bind(trig, { submitLabel: 'Buscar', onSubmit: run, onNext: run });
}
// Logos dos canais: carrega DIRETO (o lazy-loader do category_browser não pega
// os .ct-logo de forma confiável aqui). Canais por categoria são poucos, então
// carregar tudo é tranquilo. Guard __zl evita recarregar.
function loadChannelLogos() {
    var logos = document.querySelectorAll('#content-grid .ct-logo[data-logo]'), started = 0, pending = 0;
    var tv = isTvHomeMode(), batch = tv ? 5 : 14;
    for (var i = 0; i < logos.length; i++) {
        var el = logos[i], src = el.getAttribute('data-logo');
        if (!src || el.className.indexOf('is-loaded') >= 0 || el.getAttribute('data-loading')) continue;
        pending++;
        if (started >= batch) continue;
        started++;
        el.setAttribute('data-loading', '1');
        (function (target, imageSrc) {
            var im = new Image();
            im.onload = function () { target.style.backgroundImage = "url('" + imageSrc + "')"; if (target.className.indexOf('is-loaded') < 0) target.className += ' is-loaded'; target.removeAttribute('data-loading'); };
            im.onerror = function () { target.removeAttribute('data-loading'); };
            im.src = imageSrc;
        })(el, src);
    }
    if (pending > started) {
        try { if (S._liveLogoTimer) clearTimeout(S._liveLogoTimer); } catch (e) {}
        S._liveLogoTimer = setTimeout(function () { S._liveLogoTimer = null; loadChannelLogos(); }, tv ? 900 : 420);
    } else S._liveLogoTimer = null;
}

function wireLiveEpg() {
    var content = $('content-grid'), panel = $('live-epg');
    if (!content || !panel) return;
    function closestCls(el, cls) { while (el && el.nodeType === 1 && el !== document.body) { if ((' ' + (el.className || '') + ' ').indexOf(' ' + cls + ' ') !== -1) return el; el = el.parentNode; } return null; }
    var selSid = null, selName = '', selHref = '#';
    var epgCache = S.epgCache || (S.epgCache = {});
    function syncMiniVideoBounds() {
        try {
            if (!nativeAvail() || !global.HdxNative || !global.HdxNative.setMiniBounds) return;
            var slot = document.getElementById('live-video-slot'); if (!slot) return;
            var r = slot.getBoundingClientRect(); if (!r.width || !r.height) return;
            global.HdxNative.setMiniBounds(JSON.stringify({ left: r.left, top: r.top, width: r.width, height: r.height, scale: global.devicePixelRatio || 1 }));
        } catch (e) {}
    }
    global.__zxSyncMiniVideoBounds = syncMiniVideoBounds;
    function goPlay(href) {
        if (!href || href === '#') return;
        // PC + SAMSUNG: ao abrir um canal (vai pra página do player <video>/AVPlay),
        // LEMBRA a categoria atual (pílula ativa) → ao fechar (history.back → /live)
        // volta nela em vez de cair na 1ª (Casa do Patrão). No Android o canal toca
        // DIRETO (sem navegar) então nem passa aqui.
        try { if (!nativeAvail()) { var ap = document.querySelector('.cat-sidebar .cat-pill.is-active'); S.liveBack = ap ? ap.getAttribute('href') : null; } } catch (e) {}
        showLoading(true); go(href);
    }
    // Sem botão "Assistir" no Android NEM Samsung (1 clique já abre; o EPG aparece no
    // foco). PC mantém o botão (lá é 2 cliques + mouse).
    function ensureSkeleton() { if (panel.querySelector('.epg-ch')) return; var av = (nativeAvail() || tizenAvail()) ? '' : '<button type="button" class="epg-play" id="epg-play">▶ Assistir</button>'; panel.innerHTML = '<div class="epg-ch" id="epg-ch"></div>' + av + '<div class="epg-body" id="epg-body"></div>'; }
    function renderEpg(row) {
        var sid = row.getAttribute('data-sid'); if (!sid) return;
        selSid = sid; selName = row.getAttribute('data-name') || ''; selHref = row.getAttribute('data-href') || '#';
        ensureSkeleton();
        var chEl = $('epg-ch'), bodyEl = $('epg-body');
        if (chEl) chEl.textContent = selName;
        if (bodyEl) bodyEl.innerHTML = '<div class="epg-sub">Carregando programação…</div>';
        function paintEpg(epg) {
            if (selSid !== sid) return;
            var body = $('epg-body'); if (!body) return;
            if (!epg || !epg.length) { body.innerHTML = '<div class="epg-empty">Sem programação para este canal.</div>'; return; }
var h = '';
             for (var i = 0; i < epg.length; i++) { var p = epg[i], when = epgTimestamp(p.rawStart || p.start), armed = epgAlarmHas(when, p.title || '', selName); var t = esc(p.start || '') + (p.end ? (' - ' + esc(p.end)) : '') + (i === 0 ? ('  • ' + (currentLang() === 'en' ? 'NOW' : 'AGORA')) : ''); h += '<div class="epg-item' + (i === 0 ? ' is-now' : '') + '"><div class="epg-copy"><div class="epg-time">' + t + '</div><div class="epg-title">' + esc(p.title || '—') + '</div></div><button type="button" class="epg-alarm' + (armed ? ' is-on' : '') + '" data-when="' + attr(when) + '" data-title="' + attr(p.title || '') + '" data-channel="' + attr(selName) + '" data-sid="' + attr(sid) + '" aria-label="Ativar aviso da programação">🔔</button></div>'; }
            body.innerHTML = h;
        }
        if (epgCache[sid]) { paintEpg(epgCache[sid]); return; }
        xt('get_short_epg', '&stream_id=' + enc(sid) + '&limit=20').then(function (data) {
            var parsed = epgItemsFromResponse(data); epgCache[sid] = parsed; paintEpg(parsed);
        }).catch(function () { epgCache[sid] = []; paintEpg([]); });
    }
        var t = null, lastNavAt = 0;
    function scheduleEpg(row) {
        if (!row) return;
        if (t) clearTimeout(t);
        t = setTimeout(function waitForRemoteIdle() {
            var idle = Date.now() - lastNavAt;
            if (idle < 520) { t = setTimeout(waitForRemoteIdle, 180); return; }
            t = null;
            renderEpg(row);
        }, 560);
    }
    // Durante o D-pad não consulta EPG nem reescreve o painel. Só registra o
    // último canal focado e agenda a consulta depois que as setas pararem.
    content.addEventListener('keydown', function (e) {
        var k = e.key || '';
        if (/^Arrow(Up|Down|Left|Right)$/.test(k)) { lastNavAt = Date.now(); if (t) { clearTimeout(t); t = null; } }
    }, true);
    content.addEventListener('focusin', function (e) { var row = closestCls(e.target, 'channel-tile-tv'); if (!row) return; scheduleEpg(row); });
    content.addEventListener('mouseover', function (e) { var row = closestCls(e.target, 'channel-tile-tv'); if (!row || row.getAttribute('data-sid') === selSid) return; scheduleEpg(row); });
    // A primeira programação aparece depois da primeira pintura, nunca junto
    // com a montagem da tela e do foco inicial.
    if (!isTvHomeMode()) { var first = content.querySelector('.channel-tile-tv'); if (first) setTimeout(function () { renderEpg(first); }, 420); }

    var lastEl = null, lastT = 0;
    content.addEventListener('click', function (e) {
        if (closestCls(e.target, 'ct-fav')) return;
        var row = closestCls(e.target, 'channel-tile-tv'); if (!row) return;
        e.preventDefault(); e.stopPropagation();
        var href = row.getAttribute('data-href') || '#';
        // ANDROID: 1 clique abre (D-pad OU touch). O 'click' só dispara em toque,
        // não em rolagem → seguro pra scroll. (Web/Samsung: mantém 2 cliques.)
        // Toca DIRETO no nativo, SEM navegar (sem go()/history.back): o history.back
        // do renderPlayerLive voltava pra /live e re-renderizava a 1ª categoria
        // (CASA DO PATRAO), perdendo a categoria/canal atual — na TV lenta dava pra
        // ver o "pulo". Agora o WebView fica parado no canal/categoria de onde saiu.
        if (nativeAvail()) {
            var nsid = row.getAttribute('data-sid'), nnm = row.getAttribute('data-name') || '', nlogo = row.getAttribute('data-logo') || '', nowNative = (new Date()).getTime();
            if (nsid && row === lastEl) {
                // Segundo OK/toque no mesmo canal: o mini player já está ativo.
                // Promove a instância nativa existente para tela cheia; NÃO pare,
                // não chame miniPlay novamente e não reabra a URL do canal.
                try { if (global.HdxNative && global.HdxNative.miniFullscreen) global.HdxNative.miniFullscreen(); } catch (e) {}
                return;
            }
            lastEl = row; lastT = nowNative;
            renderEpg(row);
            if (nsid) {
                heartbeatContent(nnm, false);
                try {
                    if (global.HdxNative && global.HdxNative.miniPlay) global.HdxNative.miniPlay(JSON.stringify({ kind: 'live', url: streamUrl('live', nsid), title: nnm, zap: (function(){ try { var z = liveFullZapList(nsid) || liveZapList(nsid); return z ? z.list : null; } catch(e) { return null; } })(), zap_index: (function(){ try { var z = liveFullZapList(nsid) || liveZapList(nsid); return z ? z.index : 0; } catch(e) { return 0; } })() }));
                    setTimeout(syncMiniVideoBounds, 60); setTimeout(syncMiniVideoBounds, 260);
                } catch (e) {}
            }
            return;
        }
        // SAMSUNG: 1 clique (OK do controle) JÁ abre o canal — sem 2 cliques, sem botão
        // "Assistir". O EPG já apareceu ao FOCAR (focusin). goPlay lembra a categoria
        // (S.liveBack) → ao fechar volta nela, não na 1ª (Casa do Patrão).
        if (tizenAvail()) { goPlay(href); return; }
        var now = (new Date()).getTime();
        if (row === lastEl && (now - lastT) < 650) { goPlay(href); return; }
        lastEl = row; lastT = now; renderEpg(row);
    }, true);
    panel.addEventListener('click', function (e) {
        var bell = closestCls(e.target, 'epg-alarm');
        if (bell) { e.preventDefault(); e.stopPropagation(); toggleEpgAlarm(bell); return; }
        if (closestCls(e.target, 'epg-play')) { e.preventDefault(); e.stopPropagation(); goPlay(selHref); }
    }, true);
    preloadFirst();
    if (global.__liveEpgMo) { try { global.__liveEpgMo.disconnect(); } catch (e) {} }
    if (global.MutationObserver) {
        var mt = null;
        global.__liveEpgMo = new MutationObserver(function () { selSid = null; panel.innerHTML = '<div class="epg-empty">Passe num canal para ver a programação.</div>'; if (mt) clearTimeout(mt); mt = setTimeout(function () { loadChannelLogos(); if (document.body && (' ' + document.body.className + ' ').indexOf(' vkb-open ') !== -1) return; preloadFirst(); }, 60); });
        global.__liveEpgMo.observe(content, { childList: true });
    }
}

/* ---- DETALHE: FILME ---- */
/* Botões de play do DETALHE extraídos pra reuso: o render normal monta uma vez,
   e no Android a nativeRefreshDetail() remonta SÓ esses botões na hora (sem rede)
   quando o player nativo fecha. HTML idêntico ao de antes → web/TV inalteradas. */
function moviePlayBtnsHtml(id, ext) {
    var pr = getProgress('movie', id) || {};
    var resumePos = (pr.pos && pr.pos > 30 && (!pr.dur || pr.pos < pr.dur - 30)) ? pr.pos : 0;
    var playIco = '<svg width="22" height="22" viewBox="0 0 24 24" fill="currentColor"><path d="M8 5v14l11-7z"/></svg>';
    if (resumePos) {
        var rmin = Math.floor(resumePos / 60), rlbl = rmin > 0 ? (rmin + ' min') : (resumePos + 's');
        return '<a class="btn-tv is-primary" href="/movies/' + enc(id) + '/play?t=' + enc(resumePos) + '" data-ext="' + attr(ext) + '" autofocus><span class="btn-icon">' + playIco + '</span>' + te('Continuar de ') + esc(rlbl) + '</a>'
            + '<a class="btn-tv" href="/movies/' + enc(id) + '/play?restart=1" data-ext="' + attr(ext) + '"><span class="btn-icon"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2" stroke-linecap="round" stroke-linejoin="round"><polyline points="23 4 23 10 17 10"></polyline><path d="M20.49 15a9 9 0 1 1-2.12-9.36L23 10"></path></svg></span>Recomeçar</a>';
    }
    return '<a class="btn-tv is-primary" href="/movies/' + enc(id) + '/play" data-ext="' + attr(ext) + '" autofocus><span class="btn-icon">' + playIco + '</span>Reproduzir</a>';
}
function seriesTopBtnHtml(id, epList) {
    var firstEp = epList && epList[0]; if (!firstEp) return '';
    var slast = lsGet('zx_slast_' + id);
    var tEp = firstEp, tPos = 0, tLbl = 'Reproduzir', resumed = false;
    if (slast && slast.epId) {
        var lIdx = -1; for (var z = 0; z < epList.length; z++) { if (epList[z].id === parseInt(slast.epId, 10)) { lIdx = z; break; } }
        if (lIdx >= 0) {
            var lpr = getProgress('series', slast.epId);
            var partial = lpr && lpr.pos > 5 && (!lpr.dur || lpr.pos < lpr.dur - 30);
            if (partial) { tEp = epList[lIdx]; tPos = lpr.pos; tLbl = 'Continuar'; resumed = true; }
            else if (lIdx + 1 < epList.length) { tEp = epList[lIdx + 1]; tPos = 0; tLbl = 'Próximo'; resumed = true; }
            else { tEp = epList[lIdx]; tPos = 0; tLbl = 'Rever'; resumed = true; }
        }
    }
    var pLbl = resumed ? (t(tLbl) + ' S' + tEp.s + 'E' + tEp.e) : tLbl;
    return '<a class="btn-tv is-primary" href="/series/' + enc(id) + '/episode/' + enc(tEp.id) + '/play?ext=' + enc(tEp.ext) + (tPos > 5 ? '&t=' + enc(tPos) : '') + '" autofocus><span class="btn-icon"><svg width="22" height="22" viewBox="0 0 24 24" fill="currentColor"><path d="M8 5v14l11-7z"/></svg></span>' + esc(pLbl) + '</a>';
}
/* Visual novo do DETALHE de filme/série (Android teste): mantém a arte de fundo,
   mas tinge o overlay pro verde-escuro da casa, e troca botões/pills/badges pro
   padrão vidro verde com foco em ANEL (nada de fundo branco). */
function detailStyles() {
    var a = S.accent || '#10b981';
    return '<style>'
        + '.detail-screen{background:radial-gradient(130% 100% at 50% 0%,#0e2019,#0a1712 45%,#050d09);}'
        // overlay do hero: pretos viram verde-escuro da casa (arte continua aparecendo)
        + '.detail-hero .dh-bg::after{background:linear-gradient(to right,rgba(7,16,12,.95) 0%,rgba(7,16,12,.55) 55%,rgba(7,16,12,.05) 100%),linear-gradient(to bottom,rgba(7,16,12,0) 30%,rgba(7,16,12,.85) 80%,rgba(7,16,12,1) 100%);}'
        + '.detail-hero .dh-back{background:' + a + '14;border:1px solid ' + a + '3a;border-radius:12px;color:#f4f7f5;}'
        + '.detail-hero .dh-back:focus{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;outline:none;}'
        + '.detail-hero .dh-badge{background:' + a + '14;border:1px solid ' + a + '3a;border-radius:10px;}'
        + '.detail-hero .dh-genre{color:#b7c5be;}'
        // botões: primário = verde sólido; secundário = vidro verde; foco = anel
        + '.btn-tv{background:' + a + '10;border:2px solid ' + a + '2e;border-radius:12px;color:#e7efe9;}'
        + '.btn-tv:focus{background:' + a + '2e;color:#fff;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;outline:none;}'
        + '.btn-tv.is-primary{background:' + a + ';color:#04231a;border-color:' + a + ';}'
        + '.btn-tv.is-primary:focus{background:#0fcf93;border-color:#fff;box-shadow:0 0 0 3px ' + a + '66;color:#04231a;}'
        // Ações do detalhe em uma única linha: Reproduzir → Trailer → Favoritos.
        + '.detail-hero .dh-buttons{display:flex;flex-wrap:nowrap;align-items:stretch;gap:10px;max-width:min(100%,760px);overflow-x:auto;overflow-y:hidden;}'
        + '.detail-hero .dh-buttons>*{display:inline-flex;align-items:center;justify-content:center;flex:0 0 auto;min-width:0;margin:0;box-sizing:border-box;white-space:nowrap;padding:12px 14px;font-size:clamp(11px,1.55vw,17px);}'
        + '.detail-hero .dh-buttons>.btn-tv{height:auto;}'
        + '.detail-hero .dh-buttons .btn-icon{flex:0 0 auto;width:18px;height:18px;margin-right:7px;}'
        + '.detail-hero .dh-buttons .btn-tv.is-fav{border-color:' + a + ';}'
        + '.detail-hero .dh-buttons .btn-tv.is-queued{border-color:' + a + ';background:' + a + '18;}'
        + 'body.zx-ff-mobile .detail-hero .dh-buttons{gap:6px;}'
        + 'body.zx-ff-mobile .detail-hero .dh-buttons>*{padding:9px 9px;font-size:clamp(10px,1.85vw,14px);}'
        + 'body.zx-ff-mobile .detail-hero .dh-buttons .btn-icon{width:16px;height:16px;margin-right:5px;}'
        // temporadas + episódios
        + '.season-pill{background:' + a + '0d;border:1px solid ' + a + '24;border-radius:12px;color:#e7efe9;}'
        + '.season-pill:focus{background:' + a + '2e;color:#fff;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;outline:none;}'
        + '.season-pill.is-active{background:' + a + '26;color:#fff;border-color:' + a + '90;}'
        + '.episode-tile .ep-img{background-color:#0d1a14;}'
        + '.episode-tile:focus .ep-img{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;}'
        /* chip "Ep N" SEMPRE visível no meio do tile (legível sobre qualquer capa) */
        + '.ep-num-chip{position:absolute;top:50%;left:50%;transform:translate(-50%,-50%);background:rgba(5,13,9,.74);border:1px solid ' + a + '3a;color:#fff;font-weight:800;font-size:30px;line-height:1;padding:12px 26px;border-radius:14px;letter-spacing:.02em;pointer-events:none;white-space:nowrap;}'
        + '</style>';
}
function renderDetailMovie(id) {
    // Cache do DETALHE (Android, em memória, igual o catálogo): re-abrir um filme
    // já visto fica instantâneo E funciona OFFLINE (antes buscava sempre → offline
    // dava "Sem conexão" mesmo num filme aberto há segundos). Só guarda o sucesso.
    var ck = 'movie:' + id, hit = (!tizenAvail() && S.detail) ? S.detail[ck] : null;
    if (!hit) showLoading(true);
    (hit ? Promise.resolve(hit) : xtInfo('get_vod_info', '&vod_id=' + enc(id))).then(function (d) {
        showLoading(false);
        if (!tizenAvail() && !d) return renderOfflineReload();   // offline: não dá pra abrir um filme nunca carregado
        if (!tizenAvail() && d && !hit) { (S.detail || (S.detail = {}))[ck] = d; }
        var info = (d && d.info) || {}, md = (d && d.movie_data) || {};
        var name = info.name || md.name || 'Filme';
        var plot = info.plot || info.description || '';
        var cover = info.movie_image || info.cover_big || md.stream_icon || '';
        var bg = '';
        if (info.backdrop_path) bg = (info.backdrop_path[0] || info.backdrop_path); if (!bg) bg = cover;
        if (bg) bg = tmdbResize(bg, 'w780');
        var year = (info.releasedate || info.release_date || ''); year = year ? String(year).substr(0, 4) : '';
        var rating = info.rating || '', genre = info.genre || '', duration = info.duration || '';
        var ext = md.container_extension || 'mp4';
        var isFav = inArr(S.fav.movie, id);
        var badges = '';
        if (year) badges += '<span class="dh-badge">' + esc(year) + '</span>';
        if (duration) badges += '<span class="dh-badge"><svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="10"></circle><polyline points="12 6 12 12 16 14"></polyline></svg> ' + esc(duration) + '</span>';
        if (rating) badges += '<span class="dh-badge">★ ' + esc(rating) + '</span>';
        badges += '<span id="tmdb-detail-rating" class="dh-badge" style="display:none"></span>';
        if (genre) badges += '<span class="dh-genre">' + esc(genre) + '</span>';
        // Retomar com BOTÃO (não calado): se há progresso, "Continuar de Xmin" +
        // "Recomeçar"; sem progresso, "Reproduzir". (Helper reusado p/ refresh Android.)
        var playBtns = moviePlayBtnsHtml(id, ext);
        setHtml('<div class="detail-screen"><div class="detail-bg"' + (bg ? ' style="background-image:url(\'' + attr(bg) + '\')"' : '') + '></div>'
            + '<div class="detail-hero"><a href="javascript:history.back()" class="dh-back">← Voltar</a>'
            + '<div class="dh-content"><h1>' + esc(name) + '</h1><div class="dh-meta">' + badges + '</div><p class="dh-plot">' + esc(plot) + '</p>'
            + '<div class="dh-buttons">'
                        + playBtns
            + '<button type="button" class="btn-tv trailer-detail-btn" data-trailer-title="' + attr(name) + '" data-trailer-kind="movie" data-trailer-url="' + attr(info.youtube_trailer || md.youtube_trailer || info.trailer || '') + '"><span class="btn-icon">▶</span>Trailer</button>'
                        + '<button type="button" class="btn-tv" id="btn-favorite" data-kind="movie" data-id="' + attr(id) + '" data-name="' + attr(name) + '" data-poster="' + attr(cover) + '"><span class="btn-icon" id="fav-icon">' + (isFav ? '♥' : '+') + '</span><span id="fav-text">' + 'Favoritos' + '</span></button>'
                        + '<button type="button" class="btn-tv" id="btn-queue-detail" data-kind="movie" data-id="' + attr(id) + '" data-name="' + attr(name) + '" data-poster="' + attr(cover) + '"><span class="btn-icon" id="queue-detail-icon">+</span><span id="queue-detail-text">Minha Fila</span></button>'
            + '</div></div></div>'
            + '<div class="dh-similar-lazy" data-cat="' + attr(info.category_id || md.category_id || '') + '"></div></div>' + detailStyles());
        S.playExt = ext; S.playName = name; S.playPoster = cover; S.playSeries = null;
        wireFavBtn();
        wireQueueDetailBtn();
        loadSimilar('movies', id, info.category_id || md.category_id || '');
        afterRender();
        tmdbFind('movies', name, parseInt(year, 10) || 0).then(function (r) { var el = $('tmdb-detail-rating'); if (el && r && r.vote_average > 0) { el.textContent = 'TMDB ' + r.vote_average.toFixed(1) + ' (' + r.vote_count + ')'; el.style.display = ''; } });
    }).catch(function () { showLoading(false); });
}

function m3uFindItem(kind, id) {
    var list = (S.cat[kind] && S.cat[kind].all) || [];
    for (var i = 0; i < list.length; i++) if (String(list[i].stream_id) === String(id)) return list[i];
    return null;
}
function m3uDetail(kind, id) {
    var item = m3uFindItem(kind, id);
    if (!item) return false;
    var name = item.name || (kind === 'movies' ? 'Filme' : 'Série'), poster = item.stream_icon || '', ext = 'mp4';
    var pathKind = kind === 'movies' ? 'movies' : 'series';
    var playHref = kind === 'movies' ? '/movies/' + enc(id) + '/play' : '/series/' + enc(id) + '/episode/' + enc(id) + '/play?ext=' + enc(ext);
    var isFav = inArr(S.fav[kind === 'movies' ? 'movie' : 'series'], id);
    var badge = kind === 'movies' ? 'Filme' : 'Série';
    setHtml('<div class="detail-screen m3u-detail"><div class="detail-bg"' + (poster ? ' style="background-image:url(\'' + attr(poster) + '\')"' : '') + '></div>'
        + '<div class="detail-hero"><a href="javascript:history.back()" class="dh-back">← Voltar</a><div class="dh-content">'
        + '<div class="dh-meta"><span class="dh-badge">' + badge + '</span></div><h1>' + esc(name) + '</h1>'
        + '<p class="dh-plot">Conteúdo disponível na sua lista.</p><div class="dh-buttons">'
        + '<a class="btn-tv is-primary" href="' + playHref + '" data-ext="' + attr(ext) + '" autofocus><span class="btn-icon">▶</span>Reproduzir</a>'
        + '<button type="button" class="btn-tv trailer-detail-btn" data-trailer-title="' + attr(name) + '" data-trailer-kind="' + (kind === 'series' ? 'series' : 'movie') + '" data-trailer-url=""><span class="btn-icon">▶</span>Trailer</button>'
        + '<button type="button" class="btn-tv" id="btn-favorite" data-kind="' + (kind === 'movies' ? 'movie' : 'series') + '" data-id="' + attr(id) + '" data-name="' + attr(name) + '" data-poster="' + attr(poster) + '"><span class="btn-icon" id="fav-icon">' + (isFav ? '♥' : '+') + '</span><span id="fav-text">' + 'Favoritos' + '</span></button>'
        + '<button type="button" class="btn-tv" id="btn-queue-detail" data-kind="' + (kind === 'movies' ? 'movie' : 'series') + '" data-id="' + attr(id) + '" data-name="' + attr(name) + '" data-poster="' + attr(poster) + '"><span class="btn-icon" id="queue-detail-icon">+</span><span id="queue-detail-text">Minha Fila</span></button>'
        + '</div></div></div></div>' + detailStyles());
    S.playName = name; S.playPoster = poster; S.playExt = ext;
    if (kind === 'series') S.playSeries = { id: parseInt(id, 10), name: name, poster: poster, list: [{ id: parseInt(id, 10), ext: ext, s: 1, e: 1 }] };
    else S.playSeries = null;
    wireFavBtn(); wireQueueDetailBtn(); afterRender();
    tmdbFind(kind === 'series' ? 'series' : 'movies', name, tmdbYearFromItem({ name: name })).then(function (r) { var el = $('tmdb-detail-rating'); if (el && r && r.vote_average > 0) { el.textContent = 'TMDB ' + r.vote_average.toFixed(1) + ' (' + r.vote_count + ')'; el.style.display = ''; } });
    return true;
}
function renderM3UDetail(kind, id) {
    if (m3uFindItem(kind, id)) { m3uDetail(kind, id); return; }
    showLoading(true); catalogFromM3U().then(function () { showLoading(false); if (!m3uDetail(kind, id)) renderHome(); }).catch(function () { showLoading(false); renderOfflineReload(); });
}
/* ---- DETALHE: SÉRIE ---- */
function renderDetailSeries(id) {
    // Cache do DETALHE (Android, em memória) — re-abrir série já vista = instantâneo + offline.
    var ck = 'series:' + id, hit = (!tizenAvail() && S.detail) ? S.detail[ck] : null;
    if (!hit) showLoading(true);
    (hit ? Promise.resolve(hit) : xtSeriesInfo(id)).then(function (d) {
        showLoading(false);
        if (!tizenAvail() && !d) return renderOfflineReload();   // offline: não dá pra abrir uma série nunca carregada
        if (!tizenAvail() && d && !hit) { (S.detail || (S.detail = {}))[ck] = d; }
        var info = (d && d.info) || {}, eps = (d && d.episodes) || {};
        var name = info.name || 'Série', plot = info.plot || '', cover = info.cover || '';
        var bg = cover; if (info.backdrop_path) bg = (info.backdrop_path[0] || info.backdrop_path) || cover; if (bg) bg = tmdbResize(bg, 'w780');
        var year = (info.releaseDate || info.release_date || ''); year = year ? String(year).substr(0, 4) : '';
        var rating = info.rating || '', genre = info.genre || '';
        var isFav = inArr(S.fav.series, id);
        var seasons = []; for (var k in eps) if (eps.hasOwnProperty(k)) seasons.push(k); seasons.sort(function (a, b) { return (+a) - (+b); });
        var badges = '';
        if (year) badges += '<span class="dh-badge">' + esc(year) + '</span>';
        if (rating) badges += '<span class="dh-badge">★ ' + esc(rating) + '</span>';
        badges += '<span id="tmdb-detail-rating" class="dh-badge" style="display:none"></span>';
        if (genre) badges += '<span class="dh-genre">' + esc(genre) + '</span>';
        var pills = '', rows = '', firstEp = null, epMap = {}, epList = [];
        for (var i = 0; i < seasons.length; i++) {
            var sn = seasons[i], active = i === 0;
            pills += '<button type="button" class="season-pill ' + (active ? 'is-active' : '') + '" data-season="' + esc(sn) + '">' + te('Temporada ') + esc(sn) + '</button>';
            var list = arr1(eps[sn]), eph = '';
            for (var j = 0; j < list.length; j++) {
                var ep = list[j], epId = ep.id || 0, epNum = ep.episode_num || (j + 1), epName = ep.title || (t('Episódio') + ' ' + epNum);
                // sem capa do episódio → CAPA DA SÉRIE na MENOR qualidade que existe
                // (w92 ≈ 2-5KB, borrada de propósito): o tile é minúsculo e pode ter
                // centenas — imagem cheia só pesava (pedido 19/07)
                var epImg = (ep.info && ep.info.movie_image) || tmdbResize(cover, 'w92') || '', epExt = ep.container_extension || 'mp4';
                if (epId) { epMap[epId] = { s: sn, e: epNum, ext: epExt }; epList.push({ id: parseInt(epId, 10), ext: epExt, s: sn, e: epNum }); if (!firstEp) firstEp = { id: epId, s: sn, e: epNum, ext: epExt }; }
                // marca de assistido: ✓ se concluiu (pos<=0 c/ entrada) ou barra de progresso se parou no meio
                var epPr = getProgress('series', epId), epBadge = '';
                if (epPr) { if (epPr.pos > 5 && epPr.dur && epPr.pos < epPr.dur - 30) { var ppct = Math.min(100, Math.round(epPr.pos / epPr.dur * 100)); epBadge = '<span class="ep-progress" style="width:' + ppct + '%"></span>'; } else { epBadge = '<span class="ep-watched">✓</span>'; } }
                eph += '<a class="episode-tile' + (epPr ? ' is-watched' : '') + '" href="/series/' + enc(id) + '/episode/' + enc(epId) + '/play?ext=' + enc(epExt) + '" data-ext="' + attr(epExt) + '" data-title="' + attr(epName) + '">'
                    + '<div class="ep-img"' + (epImg ? ' data-src="' + attr(epImg) + '"' : '') + '>' + epBadge + '<div class="ep-num-chip">Ep ' + esc(epNum) + '</div></div>'
                    + '<div class="ep-label">S' + esc(sn) + ' E' + esc(epNum) + (epName ? ' — ' + esc(epName) : '') + '</div></a>';
            }
            rows += '<div class="episode-row season-row" data-season="' + esc(sn) + '"' + (active ? '' : ' style="display:none;"') + '>' + eph + '</div>';
        }
        var seasonsBlock = seasons.length ? ('<div class="detail-seasons"><h2>Temporadas</h2><div class="season-pills" id="season-pills">' + pills + '</div>' + rows + '</div>') : '';
        // Botão Reproduzir/Continuar/Próximo (LOCAL) — decide pelo último ep assistido
        // (zx_slast). Helper reusado na atualização ao vivo do Android.
        var playBtn = seriesTopBtnHtml(id, epList);
        setHtml('<div class="detail-screen" id="series-detail"><div class="detail-bg"' + (bg ? ' style="background-image:url(\'' + attr(bg) + '\')"' : '') + '></div>'
            + '<div class="detail-hero"><a href="javascript:history.back()" class="dh-back">← Voltar</a>'
            + '<div class="dh-content"><h1>' + esc(name) + '</h1><div class="dh-meta">' + badges + '</div><p class="dh-plot">' + esc(plot) + '</p>'
                        + '<div class="dh-buttons">' + playBtn + '<button type="button" class="btn-tv trailer-detail-btn" data-trailer-title="' + attr(name) + '" data-trailer-kind="series" data-trailer-url="' + attr(info.youtube_trailer || info.trailer || '') + '"><span class="btn-icon">▶</span>Trailer</button><button type="button" class="btn-tv" id="btn-favorite" data-kind="series" data-id="' + attr(id) + '" data-name="' + attr(name) + '" data-poster="' + attr(cover) + '"><span class="btn-icon" id="fav-icon">' + (isFav ? '♥' : '+') + '</span><span id="fav-text">' + 'Favoritos' + '</span></button><button type="button" class="btn-tv" id="btn-queue-detail" data-kind="series" data-id="' + attr(id) + '" data-name="' + attr(name) + '" data-poster="' + attr(cover) + '"><span class="btn-icon" id="queue-detail-icon">+</span><span id="queue-detail-text">Minha Fila</span></button></div>'

            + '</div></div>' + seasonsBlock + '</div>' + detailStyles());
        // contexto da série p/ o "Continue Assistindo" do player de episódio
        // (o continue de série usa o series_id + nome/capa da SÉRIE, não do ep).
        S.playSeries = { id: parseInt(id, 10), name: name, poster: cover, list: epList };
        wireFavBtn();
        wireQueueDetailBtn();
        wireSeasons();
        afterRender();
        tmdbFind('series', name, parseInt(year, 10) || 0).then(function (r) { var el = $('tmdb-detail-rating'); if (el && r && r.vote_average > 0) { el.textContent = 'TMDB ' + r.vote_average.toFixed(1) + ' (' + r.vote_count + ')'; el.style.display = ''; } });
    }).catch(function () { showLoading(false); });
}
function wireSeasons() {
    var pills = document.querySelectorAll('#season-pills .season-pill'), rows = document.querySelectorAll('.season-row');
    function loadRow(row) { if (!row) return; var imgs = row.querySelectorAll('.ep-img[data-src]'); for (var i = 0; i < imgs.length; i++) { (function (el) { if (el.getAttribute('data-loading')) return; var src = el.getAttribute('data-src'); if (!src) return; el.setAttribute('data-loading', '1'); var im = new Image(); im.onload = function () { el.style.backgroundImage = "url('" + src + "')"; el.className += ' is-loaded'; }; im.src = src; })(imgs[i]); } }
    function setActive(el, on) { var c = (typeof el.className === 'string') ? el.className : ''; c = c.replace(/\s*\bis-active\b/g, ''); if (on) c += ' is-active'; el.className = c; }
    function showSeason(sn) { sn = String(sn); for (var i = 0; i < pills.length; i++) setActive(pills[i], String(pills[i].getAttribute('data-season')) === sn); for (var j = 0; j < rows.length; j++) { var r = rows[j], rs = String(r.getAttribute('data-season')); r.style.display = (rs === sn) ? '' : 'none'; if (rs === sn) loadRow(r); } }
    for (var r0 = 0; r0 < rows.length; r0++) if (rows[r0].style.display !== 'none') loadRow(rows[r0]);
    for (var k = 0; k < pills.length; k++) (function (p) { p.addEventListener('click', function (e) { e.preventDefault(); showSeason(p.getAttribute('data-season')); }); })(pills[k]);
}
function wireFavBtn() {
    var btn = $('btn-favorite'); if (!btn) return;
    function paint(on) {
        var icon = $('fav-icon'), text = $('fav-text');
        if (icon) icon.textContent = on ? '♥' : '+';
        if (text) text.textContent = t('Favoritos');
        btn.setAttribute('aria-label', on ? t('Remover dos Favoritos') : t('Favoritos'));
        btn.className = btn.className.replace(/\s*is-fav\b/g, '') + (on ? ' is-fav' : '');
    }
    paint(inArr(S.fav[btn.getAttribute('data-kind') === 'movie' ? 'movie' : 'series'], btn.getAttribute('data-id')));
    btn.addEventListener('click', function (e) {
        e.preventDefault();
        var on = favToggle(btn.getAttribute('data-kind'), btn.getAttribute('data-id'), btn.getAttribute('data-name'), btn.getAttribute('data-poster'));
        paint(on);
        updateFavCounts();   // se a sidebar estiver visível atrás, o contador já muda
    });
}
function wireQueueDetailBtn() {
    var btn = $('btn-queue-detail'); if (!btn) return;
    function paint(on) {
        var icon = $('queue-detail-icon'), text = $('queue-detail-text');
        if (icon) icon.textContent = on ? '✓' : '+';
        if (text) text.textContent = on ? 'Na fila' : 'Minha Fila';
        btn.setAttribute('aria-label', on ? 'Remover da Minha Fila' : 'Adicionar à Minha Fila');
        btn.setAttribute('title', on ? 'Remover da Minha Fila' : 'Adicionar à Minha Fila');
        btn.className = btn.className.replace(/\s*is-queued\b/g, '') + (on ? ' is-queued' : '');
    }
    var kind = btn.getAttribute('data-kind') || 'movie', id = btn.getAttribute('data-id') || '';
    paint(queueHas(kind === 'series' ? 'series' : 'movies', id));
    btn.addEventListener('click', function (e) {
        e.preventDefault();
        var normalized = kind === 'series' ? 'series' : 'movies';
        var on = queueToggle(normalized, id, btn.getAttribute('data-name') || '', btn.getAttribute('data-poster') || '', null);
        paint(on);
    });
}
// Contador "Favoritos" da sidebar SEM esperar re-render (favoritar canal pelo
// coração acontece DENTRO da tela — nada navega/re-renderiza; era o "só salva
// depois que sai e volta"). Atualiza a pill de cada seção com o S.fav atual.
function updateFavCounts() {
    try {
        var as = document.querySelectorAll('.cat-sidebar a[href*="/favorites"]');
        for (var i = 0; i < as.length; i++) {
            var href = as[i].getAttribute('href') || '', n = S.fav.movie.length;
            if (href.indexOf('/live/') === 0) n = S.fav.live.length;
            else if (href.indexOf('/series/') === 0) n = S.fav.series.length;
            var c = as[i].querySelector('.cat-count');
            if (c) c.textContent = n || '';
        }
    } catch (e) {}
}
// tile do "Você também pode gostar" — markup IDÊNTICO ao web (_similar_row.php):
// fileira HORIZONTAL rolante (.dh-similar > .dhs-row > .dhs-tile), NÃO a grade
// do catálogo. data-replace=1: clicar um recomendado SUBSTITUI o detalhe atual
// no histórico → Voltar cai na lista da categoria, sem subir de sugestão em
// sugestão (o roteador honra o data-replace).
function similarTile(s, kind) {
    var sid, href, sName, sImg;
    if (kind === 'movies') { sid = parseInt(s.stream_id || 0, 10); href = '/movies/' + sid; sName = s.name || ''; sImg = tmdbResize(s.stream_icon || ''); }
    else { sid = parseInt(s.series_id || s.stream_id || 0, 10); href = '/series/' + sid; sName = s.name || ''; sImg = tmdbResize(s.cover || s.stream_icon || ''); }
    if (!sid) return '';
    return '<a class="dhs-tile" href="' + href + '" data-replace="1">'
        + '<div class="dhs-img"' + (sImg ? ' data-src="' + attr(sImg) + '"' : '') + '>'
        + (sImg ? '' : '<div class="dhs-fallback">' + esc((sName || '').slice(0, 2)) + '</div>') + '</div>'
        + '<div class="dhs-name">' + esc(sName) + '</div></a>';
}
function loadSimilar(kind, id, catId) {
    if (!catId) return;
    var box = document.querySelector('.dh-similar-lazy'); if (!box) return;
        ensureCatalog(kind, true).then(function () {
        // "Você também pode gostar" VARIADO: ~9 da MESMA categoria (relevância) +
        // o resto do CATÁLOGO INTEIRO (descoberta), tudo SEM nome repetido (o
        // provider duplica, ex.: "Rio de Sangue" 2x), embaralhado, 12. Antes era
        // só a categoria → quem navega filmes da mesma categoria via sempre o
        // mesmo pool ("recomenda os mesmos o tempo todo"). Agora cada abertura
        // mistura descobertas novas do acervo todo.
        var cur = S.cat[kind] || { all: [], cats: [] }, seen = {};
        // NUNCA recomendar conteúdo ADULTO (a descoberta vem do catálogo todo,
        // que inclui categorias +18/xxx). Monta o set de category_id adultas.
        var adultCats = {}, cats = cur.cats || [];
        for (var c = 0; c < cats.length; c++) if (cats[c].adult) adultCats[String(cats[c].category_id)] = 1;
        function isAdultStream(s) { return !!adultCats[String(s.category_id || '')] || isAdultName(s.name); }
        function dedup(src) {
            var o = [];
            for (var i = 0; i < src.length; i++) {
                var s = src[i], sid = String(s.stream_id || s.series_id || '');
                if (sid === String(id)) continue;
                if (isAdultStream(s)) continue;
                var nk = String(s.name || '').toLowerCase().replace(/^\s+|\s+$/g, '');
                if (!nk || seen[nk]) continue;
                seen[nk] = 1; o.push(s);
            }
            return o;
        }
        function shuffle(a) { for (var k = a.length - 1; k > 0; k--) { var j = Math.floor(Math.random() * (k + 1)), t = a[k]; a[k] = a[j]; a[j] = t; } return a; }
        var catPool = shuffle(dedup(streamsForCat(kind, catId)));   // mesma categoria
        var allPool = shuffle(dedup(cur.all || []));                // catálogo todo (sem repetir o que já entrou)
        var list = shuffle(catPool.slice(0, 9).concat(allPool).slice(0, 12));
        if (!list.length) return;
        var h = ''; for (var i = 0; i < list.length; i++) h += similarTile(list[i], kind);
        var sec = document.createElement('div'); sec.className = 'dh-similar';
        sec.innerHTML = '<div class="dhs-title">Você também pode gostar</div><div class="dhs-row">' + h + '</div>';
        if (box.parentNode) box.parentNode.replaceChild(sec, box);
        // lazy das capas (data-src → background, igual aos pôsteres da grade)
        var imgs = sec.querySelectorAll('.dhs-img[data-src]');
        for (var j = 0; j < imgs.length; j++) { (function (el) { var src = el.getAttribute('data-src'); var im = new Image(); im.onload = function () { el.style.backgroundImage = "url('" + src + "')"; el.className += ' is-loaded'; }; im.src = src; })(imgs[j]); }
    });
}

/* ---- BUSCA (filmes/séries) ---- */
function renderSearch(kind) {
    var L = kind === 'series' ? { title: 'Pesquisar Séries', ph: 'Digite o nome da série…' } : { title: 'Pesquisar Filmes', ph: 'Digite o nome do filme…' };
    setHtml('<div class="search-screen"><div class="search-topbar"><a href="/' + kind + '" class="gt-back">← Voltar</a><div class="search-title">' + esc(L.title) + '</div></div>'
        + '<div class="search-body"><form class="search-form" id="search-form" onsubmit="return false">'
        + '<button type="button" class="vkb-trigger search-trigger" id="search-trigger" data-vkb-target="search-input" data-vkb-label="Pesquisar" data-vkb-placeholder="' + attr(L.ph) + '" autofocus><span class="vkb-display vkb-empty">' + esc(L.ph) + '</span></button>'
        + '<input type="hidden" id="search-input" value=""><button type="button" class="search-go" id="search-go">Buscar</button></form>'
        + '<div class="search-results" id="search-results"><div style="color:#aaa;padding:30px;text-align:center;">Use o teclado para buscar.</div></div></div></div>' + flatStyles());
    var inp = $('search-input'), results = $('search-results');
    function run() {
        var q = (inp.value || '').replace(/^\s+|\s+$/g, '');
        if (q.length < 3) { results.innerHTML = '<div style="color:#aaa;padding:30px;text-align:center;">' + te('Digite pelo menos 3 letras.') + '</div>'; return; }
        results.innerHTML = '<div style="color:#aaa;padding:30px;text-align:center;">' + te('Buscando…') + '</div>';
        ensureCatalog(kind, true).then(function (cat) {
            var nq = norm(q), out = [];
            for (var i = 0; i < cat.all.length && out.length < 300; i++) { if (norm(cat.all[i].name).indexOf(nq) !== -1) out.push(cat.all[i]); }
            if (!out.length) { results.innerHTML = '<div style="color:#aaa;padding:30px;text-align:center;">' + te('Nenhum resultado para') + ' "' + esc(q) + '".</div>'; return; }
            var _rw = (currentLang() === 'en') ? (out.length === 1 ? 'result' : 'results') : ('resultado' + (out.length === 1 ? '' : 's'));
            var _rf = (currentLang() === 'en') ? ' for "' : ' para "';
            results.innerHTML = '<div style="color:#aaa;padding:6px 4px 16px;font-size:14px;">' + out.length + ' ' + _rw + _rf + esc(q) + '"</div><div class="poster-grid-tv" id="search-grid">' + posterTiles(out, kind) + '</div>';
            fitPosterGrid($('search-grid'));
            lazyGrid($('search-grid'));
        });
    }
    if (global.HdxKeyboard) HdxKeyboard.bind($('search-trigger'), { submitLabel: 'Buscar', onSubmit: run });
    $('search-go').addEventListener('click', function (e) { e.preventDefault(); run(); });
    if (inp) { var dt = null; inp.addEventListener('input', function () { if (dt) clearTimeout(dt); dt = setTimeout(run, 200); }); }
    afterRender();
}
function norm(s) { s = (s || '').toLowerCase(); return s.replace(/[áàâãä]/g, 'a').replace(/[éèêë]/g, 'e').replace(/[íìîï]/g, 'i').replace(/[óòôõö]/g, 'o').replace(/[úùûü]/g, 'u').replace(/ç/g, 'c'); }
function lazyGrid(grid) {
    if (!grid) return;
    // ⚠️ O scroller da busca é o `.search-body` (overflow-y:auto), NÃO a window.
    // Escutar 'scroll' só na window fazia o lazy disparar 1x (topo) e as capas
    // de baixo NUNCA carregavam ao rolar. Achamos o ancestral que realmente rola
    // e escutamos NELE (+ window, por garantia em TV que rola o documento).
    var scroller = grid.parentNode;
    while (scroller && scroller !== document.body && scroller !== document) {
        var oy = ''; try { oy = getComputedStyle(scroller).overflowY; } catch (e) {}
        if (oy === 'auto' || oy === 'scroll') break;
        scroller = scroller.parentNode;
    }
    // Carrega do topo até o fim do que está visível (+600px). Já-carregados são
    // pulados (string check). NÃO pulamos os "acima" (sem o `continue` antigo) →
    // um scroll rápido que pula fileiras não deixa buraco sem capa: a fileira é
    // carregada no run seguinte mesmo já tendo passado.
    function run() { var bottom = (global.innerHeight || 800) + 600; var imgs = grid.getElementsByClassName('pt-img'); for (var i = 0; i < imgs.length; i++) { var img = imgs[i]; if (img.className.indexOf('is-loaded') !== -1) continue; var src = img.getAttribute('data-src'); if (!src) continue; var r = img.getBoundingClientRect(); if (r.top > bottom) break; img.style.backgroundImage = "url('" + src + "')"; img.className += ' is-loaded'; } }
    var tm = null;
    function onScroll() { if (tm) return; tm = setTimeout(function () { tm = null; run(); }, 100); }
    try { if (scroller && scroller.addEventListener && scroller !== document.body && scroller !== document) scroller.addEventListener('scroll', onScroll); } catch (e) {}
    try { global.addEventListener('scroll', onScroll); } catch (e) {}
    setTimeout(run, 120);
}

/* ---- SETTINGS ---- */
/* Redesign das Configurações (só Android teste): mesmo visual da home nova —
   fundo em degradê + marca d'água FUSION, itens "vidro" verde, foco SEMPRE anel
   verde (nada de fundo branco) e "Sair da conta" NEUTRO com tom vermelho de
   perigo (antes tinha borda verde permanente = parecia selecionado). */
function settingsStyles() {
    var a = S.accent || '#10b981';
    return '<style>'
        + '.settings-screen{position:relative;overflow:hidden;background:transparent !important;font-family:system-ui,-apple-system,"Segoe UI",Roboto,sans-serif;}'
        + '.zx-settings-wall{position:absolute;inset:0;z-index:0;pointer-events:none;background-color:#080808;background-position:center center;background-repeat:no-repeat;background-size:cover;}'
        + '.settings-screen::before{display:none !important;}'
        + '.settings-screen .settings-back,.settings-screen .settings-header{position:relative;z-index:2;}'
        + '.settings-screen .settings-layout{position:absolute;z-index:2;}'
        + '.settings-screen .settings-menu,.settings-screen .settings-content{z-index:2;}'
        // ⚠️ NÃO usar .settings-screen>*{position:relative} — mataria o position:absolute
        // do .settings-layout (menu+conteúdo) e a tela colapsa. Só o header precisa subir.
        + '.settings-header{position:relative;z-index:1;}'
        + '.settings-header h1{font-size:30px;letter-spacing:0;}'
        + '.settings-header h1::after{width:46px;height:3px;margin-top:8px;}'
        + '.settings-sub{color:#9db0a7;font-size:15px;}'
        + '.settings-screen .settings-back{background:' + a + '14;border:1px solid ' + a + '3a;border-radius:12px;color:#f4f7f5;}'
        + '.settings-screen .settings-back:focus{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;outline:none;}'
        // ---- menu lateral ----
        + '.settings-menu .sm-item{background:' + a + '0d;border:1px solid ' + a + '24;border-radius:13px;color:#e7efe9;}'
        + '.settings-menu .sm-item:focus{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;color:#fff;outline:none;}'
        + '.settings-menu .sm-item:focus .sm-ico{color:' + a + ';}'
        + '.settings-menu .sm-item.is-active{background:' + a + '1f;border-color:' + a + '80;color:#fff;}'
        // "Sair da conta": IGUAL aos outros (nada de borda verde), só o texto/ícone
        // avermelhados pra indicar perigo; foco = anel vermelho.
        + '.settings-menu .sm-logout{background:rgba(239,68,68,.07);border:1px solid rgba(239,68,68,.22);color:#f2a7a7;margin-top:18px;}'
        + '.settings-menu .sm-logout .sm-ico{color:#ef7070;}'
        + '.settings-menu .sm-logout:focus{background:rgba(239,68,68,.18);border-color:#ef4444;box-shadow:0 0 0 3px rgba(239,68,68,.45);color:#fff;}'
        + '.settings-menu .sm-logout:focus .sm-ico{color:#fff;}'
        // ---- painel da direita ----
        + '.settings-content{background:rgba(255,255,255,.028);border:1px solid rgba(255,255,255,.07);border-radius:18px;padding:22px 24px;}'
        + '.settings-pane .pane-title{font-size:23px;}'
        + '.settings-pane .pane-sub{color:#9db0a7;}'
        + '.info-card{background:' + a + '0d;border:1px solid ' + a + '24;border-radius:13px;}'
        + '.info-card .ic-label{color:#8fa39a;}'
        + '.opt-btn{background:' + a + '0d;border:2px solid ' + a + '24;border-radius:13px;color:#e7efe9;}'
        + '.opt-btn:focus{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;color:#fff;outline:none;}'
        + '.opt-btn.is-active,.opt-btn.is-on{background:' + a + '26;border-color:' + a + ';color:#fff;}'
        + '.action-btn{background:' + a + '0d;border:2px solid ' + a + '24;border-radius:13px;}'
        + '.action-btn:focus{background:' + a + '2e;border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '66;outline:none;}'
        + '.action-btn:focus .ab-title{color:#fff;}'
        + '.action-btn:focus .ab-sub{color:#cfe8df;}'
        + '.theme-grid{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:12px;max-width:620px;}'
        + '.theme-btn{display:flex;align-items:center;gap:12px;min-height:58px;background:rgba(255,255,255,.04);border:2px solid rgba(255,255,255,.12);border-radius:14px;color:#f4f7f5;font-size:15px;font-weight:750;text-align:left;padding:10px 14px;cursor:pointer;}'
        + '.theme-btn:focus,.theme-btn.is-active{border-color:' + a + ';box-shadow:0 0 0 3px ' + a + '55;outline:none;}'
        + '.theme-swatch{width:28px;height:28px;flex:0 0 28px;border-radius:50%;border:2px solid rgba(255,255,255,.45);box-sizing:border-box;}'
        + '@media (max-width:600px){.theme-grid{grid-template-columns:1fr;}}'
        + '</style>';
}
/* ---- backup local entre aparelhos (sem credenciais e sem segredos) ---- */
function localBackupKeyAllowed(rawKey) {
    var k = String(rawKey || ''), ns = S.profNs || '';
    if (!k || k === 'zx_direct_mode' || k === 'zx_mac' || k === 'zx_code' || k === 'zx_user' || k === 'zx_pass' || k === 'zx_creds' || k === 'zx_snap') return false;
    if (k === 'zx_profiles' || k === 'zx_prof_active' || k === 'zx_prof_seq' || k === 'zx_lang' || k === 'zx:ff' || k === 'zx:theme' || k.indexOf('zx_a11y_') === 0) return true;
    var base = ns && k.indexOf(ns) === 0 ? k.slice(ns.length) : k;
    return ns ? (k.indexOf(ns) === 0 && profIsPersonalKey(base)) : profIsPersonalKey(base);
}
function localBackupPayload() {
    var data = {}, skipped = 0;
    try {
        for (var i = 0; i < localStorage.length; i++) {
            var k = localStorage.key(i);
            if (!localBackupKeyAllowed(k)) { skipped++; continue; }
            data[k] = localStorage.getItem(k);
        }
    } catch (e) {}
    return { app: 'Fusion', format: 1, created_at: new Date().toISOString(), profile: profName(profActive()), keys: data, skipped: skipped };
}
function localBackupDownload() {
    var payload = localBackupPayload(), text = JSON.stringify(payload, null, 2), blob = new Blob([text], { type: 'application/json;charset=utf-8' }), url = URL.createObjectURL(blob), a = document.createElement('a');
    a.href = url; a.download = 'fusion-backup-' + new Date().toISOString().slice(0, 10) + '.json'; document.body.appendChild(a); a.click(); setTimeout(function () { try { document.body.removeChild(a); URL.revokeObjectURL(url); } catch (e) {} }, 300);
}
function localBackupApply(text) {
    var d;
    try { d = JSON.parse(text); } catch (e) { return { ok: false, msg: 'Arquivo JSON inválido.' }; }
    if (!d || (d.app !== 'Fusion' && d.app !== 'UltraPlayer') || d.format !== 1 || !d.keys || typeof d.keys !== 'object') return { ok: false, msg: 'Este arquivo não é um backup do Fusion.' };
    var n = 0;
    try { for (var k in d.keys) if (d.keys.hasOwnProperty(k) && localBackupKeyAllowed(k)) { localStorage.setItem(k, String(d.keys[k] == null ? '' : d.keys[k])); n++; } } catch (e) { return { ok: false, msg: 'Não foi possível restaurar o backup.' }; }
    try { S.profNs = profActive().ns; loadFav(); } catch (e) {}
    return { ok: true, msg: n + ' dados restaurados. Reabra a tela para aplicar tudo.' };
}
function showLocalBackupPanel() {
    var old = $('zx-local-backup-modal'); if (old && old.parentNode) old.parentNode.removeChild(old);
    var ov = document.createElement('div'); ov.id = 'zx-local-backup-modal'; ov.className = 'zx-ff-ask tv-modal';
    ov.innerHTML = '<div class="zx-ffa-card" style="max-width:620px;width:min(92vw,620px)"><div class="zx-ffa-title">Dados locais entre aparelhos</div><div class="zx-ffa-sub" style="text-align:left">Exporte um arquivo para levar favoritos, Minha Fila, progresso, perfis infantis, temas e preferências para outro aparelho. O backup não inclui MAC, usuário, senha, licença, playlist nem a chave TMDB.</div><div style="display:flex;gap:10px;flex-wrap:wrap;justify-content:center;margin:14px 0"><button type="button" class="zx-pf-save" id="zxBackupExport">Exportar JSON</button><button type="button" class="zx-pf-save" id="zxBackupImport">Importar JSON</button><button type="button" class="zx-pf-save" id="zxBackupClose">Fechar</button></div><input type="file" id="zxBackupFile" accept="application/json,.json" style="display:none"><div id="zxBackupMsg" style="min-height:20px;color:#b9c9c1;font-size:14px;text-align:center"></div></div>';
    document.body.appendChild(ov);
    var msg = $('zxBackupMsg'), file = $('zxBackupFile');
    var close = function () { try { ov.parentNode.removeChild(ov); } catch (e) {} };
    var ex = $('zxBackupExport'); if (ex) ex.addEventListener('click', function () { localBackupDownload(); if (msg) msg.textContent = 'Backup exportado. Guarde o arquivo em local seguro.'; });
    var im = $('zxBackupImport'); if (im) im.addEventListener('click', function () { if (file) file.click(); });
    if (file) file.addEventListener('change', function () { var f = file.files && file.files[0]; if (!f) return; var rd = new FileReader(); rd.onload = function () { var r = localBackupApply(String(rd.result || '')); if (msg) { msg.textContent = r.msg; msg.style.color = r.ok ? '#10b981' : '#ff8c95'; } }; rd.onerror = function () { if (msg) msg.textContent = 'Não foi possível ler o arquivo.'; }; rd.readAsText(f); });
    var cl = $('zxBackupClose'); if (cl) cl.addEventListener('click', close);
    try { if (ex) ex.focus(); } catch (e) {}
}
function renderSettings() {

    var info = S.info || {}; var lic = info.license || {};
    var exp = (lic.exp_display || ''); var settingsList = null; try { var settingsLists = S.directPlaylists && S.directPlaylists.length ? S.directPlaylists : loadDirectPlaylists(), settingsPick = parseInt(S.listIndex || activeListIndex(), 10) || 0; settingsList = settingsLists[settingsPick] || settingsLists[0] || null; } catch (e) {} var settingsRawExpiry = listExpiryValue(settingsList) || expiryFromListUrl(S.playlistUrl); var expTs = expiryTimestamp(lic.exp_date || info.exp_date || info.expire_date || listExpiryValue(info) || settingsRawExpiry || S.listExpiryTs || 0); if (!exp && expTs) { var dt = new Date(expTs * 1000); if (!isNaN(dt.getTime())) exp = p2(dt.getDate()) + '/' + p2(dt.getMonth() + 1) + '/' + dt.getFullYear(); } if (!exp) exp = 'Sem expiração';
    var status = info.status || '';
    // "Tela do app" (Celular x TV) — só no Android (UI empacotada com HdxNative)
    var ffMenu = nativeAvail() ? '<a href="#screen" class="sm-item" data-pane="pane-screen"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><rect x="5" y="2" width="14" height="20" rx="2"></rect><line x1="12" y1="18" x2="12" y2="18"></line></svg></span><span class="sm-label">Tela do app</span></a>' : '';
    var ffPane = nativeAvail() ? ('<div class="settings-pane" id="pane-screen" style="display:none;"><div class="pane-title">Tela do app</div><div class="pane-sub">Ajusta o tamanho dos <strong>posters e ícones</strong> pra sua tela. <strong>Celular</strong> deixa tudo menor (mais posters por linha).</div>'
        + '<div class="pane-section"><div class="opt-row"><button type="button" class="opt-btn" data-ff-set="mobile">📱 Celular</button><button type="button" class="opt-btn" data-ff-set="tv">📺 TV / Caixa</button></div></div></div>') : '';
    // Idioma / Language — troca PT/EN a qualquer momento (além da escolha do 1º uso).
    var _cl = currentLang();
    var langMenu = '<a href="#lang" class="sm-item" data-pane="pane-lang"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="10"></circle><line x1="2" y1="12" x2="22" y2="12"></line><path d="M12 2a15 15 0 0 1 0 20 15 15 0 0 1 0-20z"></path></svg></span><span class="sm-label">Idioma / Language</span></a>';
    var langPane = '<div class="settings-pane" id="pane-lang" style="display:none;"><div class="pane-title">Idioma / Language</div><div class="pane-sub">' + te('Escolha o idioma do app.') + '</div>'
        + '<div class="pane-section"><div class="opt-row">'
        + '<button type="button" class="opt-btn' + (_cl === 'pt' ? ' is-on' : '') + '" data-lang-set="pt">🇧🇷 Português</button>'
        + '<button type="button" class="opt-btn' + (_cl === 'en' ? ' is-on' : '') + '" data-lang-set="en">🇺🇸 English</button>'
        + '</div></div></div>';
    var thNow = appTheme();
    var themeMenu = '<a href="#theme" class="sm-item" data-pane="pane-theme"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="9"></circle><path d="M12 3a9 9 0 0 1 0 18"></path><path d="M3 12h18"></path><path d="M5 7h14"></path><path d="M5 17h14"></path></svg></span><span class="sm-label">Cores do aplicativo</span></a>';
    var themePane = '<div class="settings-pane" id="pane-theme" style="display:none;"><div class="pane-title">Cores do aplicativo</div><div class="pane-sub">Escolha uma aparência para revenda. A cor é salva neste aparelho e aplicada em todas as telas.</div><div class="pane-section"><div class="theme-grid">'
        + APP_THEMES.map(function (th) { return '<button type="button" class="theme-btn' + (th.id === thNow.id ? ' is-active' : '') + '" data-theme-set="' + th.id + '"><span class="theme-swatch" style="background:' + th.bg + ';box-shadow:inset 0 0 0 7px ' + th.accent + '"></span><span>' + esc(th.name) + '</span></button>'; }).join('')
        + '</div></div></div>';
    var pinCss = 'display:block;width:100%;box-sizing:border-box;margin-bottom:10px;padding:13px 16px;background:#0c0f0d;border:1.5px solid rgba(255,255,255,.16);border-radius:12px;color:#fff;font-size:18px;text-align:center;letter-spacing:6px;outline:none';
        var parentalMenu = '<a href="#parental" class="sm-item" data-pane="pane-parental"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><rect x="3" y="11" width="18" height="11" rx="2"></rect><path d="M7 11V7a5 5 0 0 1 10 0v4"></path></svg></span><span class="sm-label">Controle parental</span></a>';
    var accessibilityMenu = '<a href="#accessibility" class="sm-item" data-pane="pane-accessibility"><span class="sm-ico">Aa</span><span class="sm-label">Acessibilidade</span></a>';
    var backupMenu = '<a href="#backup" class="sm-item" data-pane="pane-backup"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M12 3v12"></path><path d="m7 10 5 5 5-5"></path><path d="M5 21h14"></path></svg></span><span class="sm-label">Dados locais</span></a>';
    var updateMenu = nativeAvail() ? '<a href="#update" class="sm-item" data-pane="pane-update"><span class="sm-ico">↓</span><span class="sm-label">Atualizar aplicativo</span></a>' : '';
    var accessibilityPane = '<div class="settings-pane" id="pane-accessibility" style="display:none;"><div class="pane-title">Acessibilidade e diagnóstico</div><div class="pane-sub">Ajustes opcionais para facilitar a leitura e verificar o estado do aplicativo.</div><div class="pane-section"><div class="opt-row"><button type="button" class="opt-btn" data-a11y-set="large">Texto maior</button><button type="button" class="opt-btn" data-a11y-set="high">Alto contraste</button><button type="button" class="opt-btn" data-a11y-set="ambient">Modo ambiente</button></div><div class="pane-sub" style="margin-top:10px;">Modo ambiente: após 45 segundos sem tocar ou apertar um botão na Home, mostra relógio, data, logo e fundo. Pressione qualquer botão para voltar.</div></div><div class="pane-section"><button type="button" class="action-btn" id="zx-run-diagnostics"><div class="ab-title">Verificar conexão e catálogo</div><div class="ab-sub" id="zx-diagnostics-result">Toque ou pressione OK para executar.</div></button></div></div>';
    var backupPane = '<div class="settings-pane" id="pane-backup" style="display:none;"><div class="pane-title">Dados locais entre aparelhos</div><div class="pane-sub">O Fusion mantém favoritos, progresso, Minha Fila, perfis e preferências neste aparelho. Como o backend atual não oferece sincronização desses dados, use um arquivo JSON para transportar os dados com segurança.</div><div class="pane-section"><button type="button" class="action-btn" id="zx-open-local-backup"><div class="ab-title">Exportar ou importar dados</div><div class="ab-sub">Não inclui MAC, usuário, senha, licença, playlist ou a chave TMDB.</div></button></div></div>';
    var updatePane = nativeAvail() ? '<div class="settings-pane" id="pane-update" style="display:none;"><div class="pane-title">Atualizar aplicativo</div><div class="pane-sub">Baixa o APK diretamente do painel, valida pacote, assinatura e versionCode e abre a confirmação nativa do Android. O app não instala nada silenciosamente.</div><div class="pane-section"><button type="button" class="action-btn" id="zx-app-update-btn"><div class="ab-title">Verificar atualização</div><div class="ab-sub" id="zx-app-update-status">Aguardando comando.</div></button></div></div>' : '';
    var parentalPane = '<div class="settings-pane" id="pane-parental" style="display:none;"><div class="pane-title">Controle parental</div>'
        + '<div class="pane-sub">A senha bloqueia as categorias <strong>adultas (XXX)</strong>. Fica guardada <strong>só neste aparelho</strong> (nada no servidor). Padrão: <strong>1234</strong>.</div>'
        + '<div class="pane-section" style="max-width:340px">'
        + '<input type="password" id="zx-pin-cur" inputmode="numeric" maxlength="4" placeholder="Senha atual" style="' + pinCss + '">'
        + '<input type="password" id="zx-pin-new" inputmode="numeric" maxlength="4" placeholder="Nova senha (4 dígitos)" style="' + pinCss + '">'
        + '<input type="password" id="zx-pin-confirm" inputmode="numeric" maxlength="4" placeholder="Confirmar nova senha" style="' + pinCss + '">'
        + '<div id="zx-pin-msg" style="min-height:18px;font-size:14px;margin:2px 0 12px;color:#ff8c95"></div>'
        + '<button type="button" class="action-btn" id="zx-pin-save"><div class="ab-title">Salvar nova senha</div></button>'
        + '</div></div>';
    setHtml(settingsStyles() + '<div class="settings-screen"><div class="zx-settings-wall" aria-hidden="true"></div><a href="/home" class="settings-back">← Voltar</a>'
        + '<div class="settings-header"><h1>Configurações</h1><div class="settings-sub">' + te('Personalize o seu ') + esc((S.branding && (S.branding.app_title)) || 'Fusion') + '</div></div>'
        + '<div class="settings-layout"><div class="settings-menu" id="settings-menu">'
        + '<a href="#info" class="sm-item is-active" data-pane="pane-info" autofocus><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="10"></circle><line x1="12" y1="16" x2="12" y2="12"></line><line x1="12" y1="8" x2="12.01" y2="8"></line></svg></span><span class="sm-label">Informação Geral</span></a>'
        + '<a href="#player" class="sm-item" data-pane="pane-player"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><polygon points="6 4 20 12 6 20 6 4"></polygon></svg></span><span class="sm-label">Player de Vídeo</span></a>'
                + ffMenu + langMenu + themeMenu + parentalMenu + accessibilityMenu + backupMenu + updateMenu
        + '<a href="#clear" class="sm-item" data-pane="pane-clear"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6l-1.5 14a2 2 0 0 1-2 1.8H8.5a2 2 0 0 1-2-1.8L5 6"></path></svg></span><span class="sm-label">Limpar Cache</span></a>'
        + '<button type="button" class="sm-item sm-logout" id="btn-logout"><span class="sm-ico"><svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"></path><polyline points="16 17 21 12 16 7"></polyline><line x1="21" y1="12" x2="9" y2="12"></line></svg></span><span class="sm-label">Sair da conta</span></button>'
        + '</div><div class="settings-content">'
        + '<div class="settings-pane" id="pane-info"><div class="pane-title">Sua conta</div><div class="pane-sub">Informações da sua assinatura.</div><div class="info-cards">'
        + '<div class="info-card"><div class="ic-label">Usuário</div><div class="ic-value ic-user">' + esc(S.user) + '</div></div>'
        + '<div class="info-card"><div class="ic-label">Vencimento</div><div class="ic-value">' + esc(exp) + '</div></div>'
        + (status ? '<div class="info-card"><div class="ic-label">Status</div><div class="ic-value">' + esc(status) + '</div></div>' : '')
        + (lic.mac ? '<div class="info-card"><div class="ic-label">Mac</div><div class="ic-value">' + esc(lic.mac) + '</div></div>' : '')
        + '<div class="info-card"><div class="ic-label">Plataforma</div><div class="ic-value">' + (platform() === 'android' ? 'Android' : platform() === 'tizen' ? 'Samsung' : 'Windows') + '</div></div></div></div>'
        + '<div class="settings-pane" id="pane-player" style="display:none;"><div class="pane-title">Configurações do Player</div><div class="pane-sub">Vale só <strong>neste aparelho</strong>. <strong>Nativo</strong> é o padrão; <strong>HTML5</strong> oferece mais recursos.</div>'
        + '<div class="pane-section"><div class="pane-section-title">Canais ao vivo</div><div class="opt-row"><button type="button" class="opt-btn" data-player-key="zx:player:live" data-player-value="native">Nativo</button><button type="button" class="opt-btn" data-player-key="zx:player:live" data-player-value="html5">HTML5</button></div></div>'
        + '<div class="pane-section"><div class="pane-section-title">Filmes e séries (VOD)</div><div class="opt-row"><button type="button" class="opt-btn" data-player-key="zx:player:vod" data-player-value="native">Nativo</button><button type="button" class="opt-btn" data-player-key="zx:player:vod" data-player-value="html5">HTML5</button></div></div></div>'
                + ffPane + langPane + themePane + parentalPane + accessibilityPane + backupPane + updatePane
        + '<div class="settings-pane" id="pane-clear" style="display:none;"><div class="pane-title">Limpar Cache</div><div class="pane-sub">Use caso esteja tendo problemas com o app.</div><div class="pane-section"><button type="button" class="action-btn" id="btn-clear-cache"><div class="ab-title">Limpar cache local</div><div class="ab-sub">Remove dados temporários armazenados.</div></button></div></div>'
        + '</div></div></div>');
    applyHomePanelWall();
    wireSettings();
    afterRender();
}
function wireSettings() {
    var menu = $('settings-menu'), panes = document.querySelectorAll('.settings-pane');
    function showPane(id) { for (var i = 0; i < panes.length; i++) panes[i].style.display = (panes[i].id === id) ? '' : 'none'; var items = menu.querySelectorAll('.sm-item'); for (var j = 0; j < items.length; j++) { if (items[j].getAttribute('data-pane') === id) { if (items[j].className.indexOf('is-active') === -1) items[j].className += ' is-active'; } else items[j].className = items[j].className.replace(/\bis-active\b/g, '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, ''); } }
    menu.addEventListener('focusin', function (e) { var t = e.target; while (t && t !== menu) { if (t.getAttribute && t.getAttribute('data-pane')) { showPane(t.getAttribute('data-pane')); return; } t = t.parentNode; } });
    var anchors = menu.querySelectorAll('a.sm-item[data-pane]');
    for (var i = 0; i < anchors.length; i++) (function (a) { a.addEventListener('click', function (e) { e.preventDefault(); showPane(a.getAttribute('data-pane')); }); })(anchors[i]);
    function paint(key, val) { var els = document.querySelectorAll('[data-player-key="' + key + '"]'); for (var i = 0; i < els.length; i++) { var b = els[i], match = b.getAttribute('data-player-value') === val; if (match) { if (b.className.indexOf('is-active') === -1) b.className += ' is-active'; } else b.className = b.className.replace(/\bis-active\b/g, '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, ''); } }
    function cur(key) { var v = ''; try { v = (localStorage.getItem(key) || '').toLowerCase(); } catch (e) {} return v === 'html5' ? 'html5' : 'native'; }
    var keys = ['zx:player:live', 'zx:player:vod']; for (var pk = 0; pk < keys.length; pk++) paint(keys[pk], cur(keys[pk]));
    var btns = document.querySelectorAll('[data-player-key]');
    for (var p = 0; p < btns.length; p++) (function (el) { el.addEventListener('click', function (e) { e.preventDefault(); var key = el.getAttribute('data-player-key'), val = el.getAttribute('data-player-value'); try { localStorage.setItem(key, val); } catch (err) {} paint(key, val); }); })(btns[p]);
    // "Tela do app" (Celular x TV) — Android: pinta a opção atual + troca na hora
    (function () {
        var fb = document.querySelectorAll('[data-ff-set]'); if (!fb.length) return;
        function ffPaint(val) { for (var i = 0; i < fb.length; i++) { var b = fb[i], m = b.getAttribute('data-ff-set') === val; if (m) { if (b.className.indexOf('is-active') === -1) b.className += ' is-active'; } else b.className = b.className.replace(/\bis-active\b/g, '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, ''); } }
        ffPaint(getFormFactor() === 'mobile' ? 'mobile' : 'tv');
        for (var i = 0; i < fb.length; i++) (function (el) { el.addEventListener('click', function (e) { e.preventDefault(); var val = el.getAttribute('data-ff-set'); try { localStorage.setItem('zx:ff', val); } catch (err) {} applyFormFactor(); ffPaint(val); }); })(fb[i]);
    })();
    // Idioma / Language — troca na hora e re-renderiza as Configurações no novo idioma.
    (function () {
        var lb = document.querySelectorAll('[data-lang-set]'); if (!lb.length) return;
        for (var i = 0; i < lb.length; i++) (function (el) {
            el.addEventListener('click', function (e) {
                e.preventDefault();
                var val = el.getAttribute('data-lang-set');
                if (val === currentLang()) return;
                setLang(val); renderSettings();
            });
        })(lb[i]);
    })();
    var cc = $('btn-clear-cache'); if (cc) cc.addEventListener('click', function (e) { e.preventDefault(); try { if (global.HdxCache) HdxCache.bust(); } catch (err) {} S.cat = { movies: null, series: null, live: null }; var sub = cc.querySelector('.ab-sub'); if (sub) sub.textContent = t('✓ Cache local removido.'); });
        var lo = $('btn-logout'); if (lo) lo.addEventListener('click', function (e) { e.preventDefault(); doLogout(); });
    var a11y = document.querySelectorAll('[data-a11y-set]');
    for (var ai = 0; ai < a11y.length; ai++) (function (el) { var key = el.getAttribute('data-a11y-set'); if (accessibilityEnabled(key)) el.className += ' is-on'; el.addEventListener('click', function (e) { e.preventDefault(); var on = !accessibilityEnabled(key); try { localStorage.setItem('zx_a11y_' + key, on ? '1' : '0'); } catch (err) {} el.className = el.className.replace(/\bis-on\b/g, '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, '') + (on ? ' is-on' : ''); applyAccessibility(); }); })(a11y[ai]);
    var diag = $('zx-run-diagnostics'); if (diag) diag.addEventListener('click', function (e) { e.preventDefault(); var sub = $('zx-diagnostics-result'); if (sub) sub.textContent = ultraDiagnosticsText(); });
    var backupOpen = $('zx-open-local-backup'); if (backupOpen) backupOpen.addEventListener('click', function (e) { e.preventDefault(); showLocalBackupPanel(); });
    var updateBtn = $('zx-app-update-btn'); if (updateBtn) updateBtn.addEventListener('click', function (e) { e.preventDefault(); requestNativeUpdate(); });
    // Temas globais — a troca é imediata e fica salva no aparelho.
    (function () {
        var tb = document.querySelectorAll('[data-theme-set]'); if (!tb.length) return;
        function paintTheme(id) { for (var i = 0; i < tb.length; i++) { var b = tb[i], on = b.getAttribute('data-theme-set') === id; if (on) { if (b.className.indexOf('is-active') === -1) b.className += ' is-active'; } else b.className = b.className.replace(/\bis-active\b/g, '').replace(/\s+/g, ' ').replace(/^\s+|\s+$/g, ''); } }
        paintTheme(appThemeId());
        for (var i = 0; i < tb.length; i++) (function (el) { el.addEventListener('click', function (e) { e.preventDefault(); var id = el.getAttribute('data-theme-set'); applyAppTheme(id, false); paintTheme(id); }); })(tb[i]);
    })();
    // Controle parental — troca o PIN adulto LOCAL (default 1234; nada vai pro servidor).
    var pinSave = $('zx-pin-save');
    if (pinSave) pinSave.addEventListener('click', function (e) {
        e.preventDefault();
        var g = function (id) { var el = $(id); return el ? (el.value || '').trim() : ''; };
        var cur = g('zx-pin-cur'), nw = g('zx-pin-new'), cf = g('zx-pin-confirm');
        var msg = $('zx-pin-msg');
        function show(t, ok) { if (msg) { msg.textContent = t; msg.style.color = ok ? '#10b981' : '#ff8c95'; } }
        if (cur !== getAdultPin()) return show(t('Senha atual incorreta.'), false);
        if (!/^\d{4}$/.test(nw)) return show(t('A nova senha deve ter 4 dígitos.'), false);
        if (nw !== cf) return show(t('As senhas não coincidem.'), false);
        lsSet('zx_adultpin', nw);
        if ($('zx-pin-cur')) $('zx-pin-cur').value = '';
        if ($('zx-pin-new')) $('zx-pin-new').value = '';
        if ($('zx-pin-confirm')) $('zx-pin-confirm').value = '';
        show(t('✓ Senha alterada com sucesso.'), true);
    });
    // D-pad → a partir do MENU entra no painel pelo PRIMEIRO controle. A navegação
    // espacial escolhia o mais próximo geometricamente — no Controle parental caía
    // no 3º campo ("Confirmar nova senha") em vez do 1º ("Senha atual"). Listener
    // ÚNICO no document (guard) — só age com foco num item do menu de configurações.
    if (!document.__zxSetPaneNav) {
        document.__zxSetPaneNav = true;
        document.addEventListener('keydown', function (e) {
            if (e.key !== 'ArrowRight' && e.keyCode !== 39) return;
            var mn = $('settings-menu'); if (!mn) return;
            var t = e.target; if (!mn.contains(t)) return;
            var pid = null;
            while (t && t !== mn) { if (t.getAttribute && t.getAttribute('data-pane')) { pid = t.getAttribute('data-pane'); break; } t = t.parentNode; }
            if (!pid) return;
            var pane = document.getElementById(pid); if (!pane) return;
            var first = pane.querySelector('input, button, a[href], [tabindex]');
            if (!first) return;
            e.preventDefault(); e.stopImmediatePropagation();
            try { first.focus(); } catch (err) {}
        }, true);
    }
}

/* ---- PLAYER ---- */
function playerShell(kind, title, vod) {
    var seek = (kind === 'vod') ? '<div class="osd-seekbar"><div class="osd-times"><span class="osd-time-current" id="osd-time-current">0:00</span><span class="osd-time-total" id="osd-time-total">0:00</span></div><div class="osd-progress"><div class="osd-progress-fill" id="osd-progress-fill"></div></div></div>' : '';
    return '<div class="player-screen"><video id="hls-player" autoplay playsinline></video>'
        + '<div class="player-loading" id="player-loading"><div class="spinner"></div><p>Carregando…</p></div>'
        + '<div class="player-error" id="player-error" style="display:none;"><h2>Não foi possível carregar</h2><p>Pressione voltar e tente novamente.</p></div>'
        + '<div class="player-osd" id="player-osd"><div class="osd-title">' + esc(title) + '</div>' + seek + '<div class="osd-time" data-clock="time">—:—</div></div>'
        + '<div class="player-volume" id="player-volume"><div class="pv-label">VOLUME</div><div class="pv-bar"><div class="pv-fill" id="pv-fill"></div></div><div class="pv-pct" id="pv-pct">100%</div></div></div>';
}

/* ===== AVPlay (Samsung Tizen) — player OFICIAL via ADAPTER no <video> =====
   Com a UI EMPACOTADA num .wgt Tizen, window.webapis.avplay existe (≠ pagina
   remota, onde nao existe). Em vez de carregar o stream no <video>, tocamos no
   AVPlay (decode de hardware, MPEG-TS cru, melhor compat em Tizen antigo) e
   fazemos o <video> #hls-player ESPELHAR o AVPlay (Object.defineProperty na
   instancia): currentTime/duration/paused/volume/muted + play/pause passam a
   dirigir o AVPlay, e os listeners do AVPlay disparam os eventos do <video>
   (timeupdate/durationchange/playing/loadedmetadata/ended). Assim o OSD/seek/
   teclas (player_touch.js + tv.js) funcionam SEM MUDANCA pra tudo (canais,
   filmes, series). O video vai num plano de hardware ATRAS da pagina -> area
   transparente. Qualquer erro -> fallback pro <video> (caminho provado). */
function tizenAvail() { try { return !!(global.webapis && webapis.avplay && webapis.avplay.open); } catch (e) { return false; } }

function startAvplay(video, url, kind, hideLoading, showError, fallback, resumeAt) {
    var av; try { av = webapis.avplay; } catch (e) { return false; }
    if (!av || !av.open) return false;
    try {
        var st = { t: 0, d: 0, paused: false, vol: 1, muted: false, ready: false, dead: false, resumeAt: (resumeAt > 5 ? resumeAt : 0), resumeTries: 0 };
        function fire(n) { try { video.dispatchEvent(new Event(n)); } catch (e) { try { var ev = document.createEvent('Event'); ev.initEvent(n, false, false); video.dispatchEvent(ev); } catch (e2) {} } }

        // o video do AVPlay e um PLANO de hardware ATRAS da pagina -> transparencia
        var scr = document.querySelector('.player-screen');
        try { document.documentElement.style.background = 'transparent'; document.body.style.background = 'transparent'; if (scr) scr.style.background = 'transparent'; video.style.background = 'transparent'; } catch (e) {}

        // <object> sink do AVPlay (full-screen; o OSD fica por cima via z-index)
        var obj = document.getElementById('av-player-obj');
        if (!obj) { obj = document.createElement('object'); obj.type = 'application/avplayer'; obj.id = 'av-player-obj'; obj.style.cssText = 'position:absolute;left:0;top:0;width:100%;height:100%;'; if (scr) scr.insertBefore(obj, scr.firstChild); }

        // ADAPTER: o <video> reflete/dirige o AVPlay
        function def(p, g, s) { try { Object.defineProperty(video, p, { configurable: true, get: g, set: s || function () {} }); } catch (e) {} }
        def('currentTime', function () { return st.t; }, function (v) { v = Number(v) || 0; st.t = v; try { av.seekTo(Math.max(0, Math.round(v * 1000))); } catch (e) {} fire('seeking'); });
        def('duration', function () { return st.d || (kind === 'live' ? Infinity : 0); });
        def('paused', function () { return st.paused; });
        def('muted', function () { return st.muted; }, function (v) { st.muted = !!v; });
        def('volume', function () { return st.vol; }, function (v) { st.vol = Math.max(0, Math.min(1, Number(v) || 0)); });
        video.play = function () { try { av.play(); } catch (e) {} st.paused = false; fire('play'); return { then: function (f) { try { if (f) f(); } catch (e) {} return this; }, catch: function () { return this; } }; };
        video.pause = function () { try { av.pause(); } catch (e) {} st.paused = true; fire('pause'); };
        video.load = function () {};

        function cleanup() {
            if (st.dead) return; st.dead = true;
            try { av.stop(); } catch (e) {} try { av.close(); } catch (e) {}
            try { document.documentElement.style.background = ''; document.body.style.background = ''; if (scr) scr.style.background = ''; } catch (e) {}
            try { if (obj && obj.parentNode) obj.parentNode.removeChild(obj); } catch (e) {}
        }
        S._avCleanup = cleanup;

        function toFallback() {
            cleanup();
            ['currentTime', 'duration', 'paused', 'muted', 'volume'].forEach(function (p) { try { delete video[p]; } catch (e) {} });
            try { delete video.play; } catch (e) {} try { delete video.pause; } catch (e) {} try { delete video.load; } catch (e) {}
            S._avCleanup = null;
            try { fallback(); } catch (e) { try { showError(); } catch (e2) {} }
        }

        av.setListener({
            onbufferingstart: function () {},
            onbufferingcomplete: function () { hideLoading(); if (!st.ready) { st.ready = true; try { st.d = (av.getDuration() || 0) / 1000; } catch (e) {} fire('loadedmetadata'); fire('durationchange'); } fire('playing'); },
            oncurrentplaytime: function (ms) {
                st.t = (ms || 0) / 1000;
                // RESUME robusto: no AVPlay o seek inicial às vezes não "pega" (cai antes
                // do play). Enquanto o player estiver perto do início, re-tenta; para
                // quando chega (ou após algumas tentativas) → fim do "não voltava onde parou".
                if (st.resumeAt) {
                    if (st.t >= st.resumeAt - 6 || st.resumeTries >= 6) { st.resumeAt = 0; }
                    else { st.resumeTries++; try { av.seekTo(Math.round(st.resumeAt * 1000)); } catch (e) {} }
                }
                if (!st.d) { try { st.d = (av.getDuration() || 0) / 1000; } catch (e) {} if (st.d) fire('durationchange'); }
                fire('timeupdate');
            },
            onstreamcompleted: function () { fire('ended'); },
            onerror: function () { toFallback(); }
        });

        av.open(url);
        // UA da marca no stream Samsung: o IPTV identifica como Fusion.
        // Tem que vir DEPOIS do open() e ANTES do prepareAsync().
        try { av.setStreamingProperty('USER_AGENT', 'Fusion/2.7'); } catch (e) {}
        try { av.setDisplayRect(0, 0, 1920, 1080); } catch (e) {}
        try { av.setDisplayMethod('PLAYER_DISPLAY_MODE_FULL_SCREEN'); } catch (e) {}
        av.prepareAsync(function () {
            try { st.d = (av.getDuration() || 0) / 1000; } catch (e) {}
            try { av.play(); } catch (e) {}
            // RESUME: seek NATIVO logo APÓS o play (estado PLAYING). Antes o seek vinha do
            // loadedmetadata e podia cair ANTES do play (corrida c/ onbufferingcomplete) →
            // o seekTo era ignorado e "não voltava onde parou". (oncurrentplaytime re-tenta
            // se este não pegar.)
            if (st.resumeAt) { try { av.seekTo(Math.round(st.resumeAt * 1000)); st.t = st.resumeAt; } catch (e) {} }
            st.paused = false; hideLoading();
            if (!st.ready) { st.ready = true; fire('loadedmetadata'); fire('durationchange'); }
            fire('playing');
        }, function () { toFallback(); });
        return true;
    } catch (e) { return false; }
}

// OSD na TV (#player-osd) ao apertar QUALQUER tecla (D-pad). O player_touch.js so
// reage a toque/mouse (na TV fica inativo de proposito), entao o feedback visual
// (nome + relogio + seekbar) vem DAQUI — igual o showOsd das views de player do
// servidor. O tv.js cuida das ACOES (seek/pausa/volume); isto e so o visual.
// Handler global UNICO (acha o #player-osd atual) -> nao acumula por player.
function isTvUi() { try { return !!(global.__TV || (document.body && document.body.className.indexOf('ui-tv') >= 0)); } catch (e) { return false; } }
var __osdHideT = null;
function tvShowOsd() {
    var o = document.getElementById('player-osd'); if (!o) return;
    o.className = 'player-osd is-visible';
    clearTimeout(__osdHideT);
    __osdHideT = setTimeout(function () { try { var v = document.getElementById('hls-player'); if (!v || !v.paused) o.className = 'player-osd'; } catch (e) { o.className = 'player-osd'; } }, 4000);
}
try { document.addEventListener('keydown', function () { if (isTvUi()) tvShowOsd(); }, true); } catch (e) {}

function startVideo(url, kind, onProgress, resumeAt, title) {
    var video = $('hls-player'), loading = $('player-loading'), errorBox = $('player-error');
    heartbeatContent(title || '', false);
    function hideLoading() { if (loading) loading.style.display = 'none'; }
    function showError() { hideLoading(); if (errorBox) errorBox.style.display = 'block'; }
    function showRealError() { reportPlaybackFailure(kind, title || ''); showError(); }

    var isHls = /\.m3u8(\?|$)/i.test(url);
    var canNativeHls = !!video.canPlayType('application/vnd.apple.mpegurl');
    function tryPlay() { var p = video.play(); if (p && p.catch) p.catch(function () { try { video.muted = true; } catch (e) {} video.play().then(function () { setTimeout(function () { try { video.muted = false; } catch (e) {} }, 120); }).catch(showError); }); }
        function playNative(onErr) { video.src = url; video.addEventListener('loadedmetadata', tryPlay); video.addEventListener('error', onErr || showRealError); }
    function playHls() { if (!(global.Hls && Hls.isSupported())) return false; try { video.removeAttribute('src'); video.load(); } catch (e) {} var hls = new Hls({ enableWorker: false, lowLatencyMode: false }); hls.loadSource(url); hls.attachMedia(video); hls.on(Hls.Events.MANIFEST_PARSED, tryPlay); hls.on(Hls.Events.ERROR, function (_, d) { if (d.fatal) showRealError(); }); return true; }
    function htmlPlay() { if (isHls && !canNativeHls) { if (!playHls()) playNative(); } else { playNative(function () { if (isHls && playHls()) return; showRealError(); }); } }

    // Motor por APARELHO (Configuracoes): 'native' (padrao) ou 'html5'. Em 'html5'
    // o usuario forcou o <video>/hls.js -> NAO usa AVPlay nem ExoPlayer.
    var eng = 'native'; try { var sv = (localStorage.getItem('zx:player:' + (kind === 'live' ? 'live' : 'vod')) || '').toLowerCase(); if (sv === 'html5' || sv === 'native') eng = sv; } catch (e) {}
    // Tizen (UI empacotada) + Nativo: AVPlay oficial. html5 ou PC/Android/web: <video>/hls.js.
    var usedAv = (eng !== 'html5' && tizenAvail() && startAvplay(video, url, kind, hideLoading, showError, htmlPlay, resumeAt));
    if (!usedAv) htmlPlay();
    video.addEventListener('playing', hideLoading);
    if (isTvUi()) { video.addEventListener('playing', tvShowOsd); video.addEventListener('pause', tvShowOsd); }   // OSD na TV ao iniciar/pausar
    // RESUME: retoma de onde parou (continue assistir local). Faz 1x quando há
    // metadata/duração e a posição cabe no vídeo.
    // RESUME do <video> (HTML5/PC). No AVPlay (Samsung) o resume é NATIVO dentro do
    // startAvplay (seek após o play + re-tentativa no oncurrentplaytime) — não usa este.
    if (!usedAv && resumeAt && resumeAt > 5) {
        var seeked = false;
        function doSeek() { if (seeked) return; var dur = video.duration; if (!isFinite(dur) || dur <= 0) return; if (resumeAt < dur - 2) { try { video.currentTime = resumeAt; } catch (e) {} } seeked = true; }
        video.addEventListener('loadedmetadata', doSeek);
        video.addEventListener('canplay', doSeek);
    }
    if (onProgress) {
        var last = 0; video.addEventListener('timeupdate', function () { var now = Date.now(); if (now - last > 10000 && video.currentTime > 5) { last = now; onProgress(false); } });
        video.addEventListener('pause', function () { if (video.currentTime > 5) onProgress(false); });
        video.addEventListener('ended', function () { onProgress(true); });
    }
    // seekbar VOD (no OSD do tv.js)
    if (kind === 'vod') {
        var fill = $('osd-progress-fill'), cur = $('osd-time-current'), tot = $('osd-time-total');
        function fmt(s) { s = Math.max(0, Math.floor(s || 0)); var h = Math.floor(s / 3600), m = Math.floor((s % 3600) / 60), x = s % 60; function pp(n) { return n < 10 ? '0' + n : '' + n; } return h > 0 ? (h + ':' + pp(m) + ':' + pp(x)) : (m + ':' + pp(x)); }
        function upd() { var dur = video.duration; if (!isFinite(dur) || dur <= 0) return; var c = video.currentTime || 0; if (cur) cur.textContent = fmt(c); if (tot) tot.textContent = fmt(dur); if (fill) fill.style.width = ((c / dur) * 100) + '%'; }
        var lu = 0; video.addEventListener('timeupdate', function () { var n = Date.now(); if (n - lu > 500) { lu = n; upd(); } });
        video.addEventListener('loadedmetadata', upd); video.addEventListener('seeking', upd); video.addEventListener('seeked', upd);
        global.HdxSeekPreview = function (t) { var dur = video.duration; if (!isFinite(dur) || dur <= 0) return; if (cur) cur.textContent = fmt(t); if (fill) fill.style.width = ((t / dur) * 100) + '%'; };
    }
}
function bootPlayerScripts(kind) { global.__playerKind = (kind === 'live') ? 'live' : 'vod'; runScript('assets/player_touch.js'); }

/* ===== PLAYER NATIVO (Android híbrido) =====
   Se o app expõe window.HdxNative (casca Android com ExoPlayer), o vídeo toca
   no motor NATIVO (.ts/MKV/HEVC/AC3/multi-áudio/hardware) em vez do <video> do
   WebView. Progresso/continue/recentes seguem LOCAIS (igual Roku/PC): o player
   nativo devolve a posição via window.__zxNativeDone ao fechar. No PC/web não
   existe HdxNative → cai no player HTML normal (nada muda). */
function nativeAvail() { try { return !!(global.HdxNative && global.HdxNative.play); } catch (e) { return false; } }
/* ZAPPING (canais ao vivo): monta a lista da tela atual (ordem visível, direto dos
   tiles) pro player nativo trocar de canal com ↑/↓ do controle. Janela de ±150 em
   volta do canal atual (payload leve pro Intent). null se não der (toca normal). */
function liveFullZapList(sid) {
    try {
        var c = S.cat.live, all = c && c.all || [], cats = c && c.cats || [], out = [], idx = -1;
        for (var i = 0; i < all.length; i++) {
            var item = all[i] || {}, id = parseInt(item.stream_id || 0, 10);
            if (!id) continue;
            // O Xtream pode trazer um `category_name` genérico (por exemplo,
            // ABERTOS) mesmo quando `category_id` aponta para a categoria real.
            // No menu transparente do player, o ID do catálogo é a fonte correta.
            var cat = '';
            var cid = String(item.category_id || '');
            for (var ci = 0; ci < cats.length; ci++) if (String(cats[ci].category_id || '') === cid) { cat = cats[ci].category_name || ''; break; }
            if (!cat) cat = item.category_name || item.group || item.group_title || '';
            if (String(id) === String(sid)) idx = out.length;
            out.push({ i: id, t: item.name || (t('Canal') + ' ' + id), c: cat, u: streamUrl('live', id) });
        }
        if (!out.length) return null;
        var categoryNames = [], seenCategories = {};
        for (var cix = 0; cix < cats.length; cix++) {
            var listedName = String(cats[cix].category_name || '').trim();
            if (listedName && !seenCategories[listedName]) { seenCategories[listedName] = 1; categoryNames.push(listedName); }
        }
        for (var oix = 0; oix < out.length; oix++) {
            var itemName = String(out[oix].c || '').trim();
            if (itemName && !seenCategories[itemName]) { seenCategories[itemName] = 1; categoryNames.push(itemName); }
        }
        return { list: out, index: idx < 0 ? 0 : idx, categories: categoryNames };
    } catch (e) { return null; }
}
function liveZapList(sid) {
    try {
        var tiles = document.querySelectorAll('.channel-tile-tv');
        if (!tiles.length) return null;
        var arr = [], idx = -1;
        for (var i = 0; i < tiles.length; i++) {
            var s = parseInt(tiles[i].getAttribute('data-sid') || 0, 10);
            if (!s) continue;
            if (String(s) === String(sid)) idx = arr.length;
            arr.push({ i: s, t: tiles[i].getAttribute('data-name') || (t('Canal') + ' ' + s), c: tiles[i].getAttribute('data-cat') || '', u: streamUrl('live', s) });
        }
        if (idx < 0 || arr.length < 2) return null;
        var lo = Math.max(0, idx - 150), hi = Math.min(arr.length, idx + 151);
        return { list: arr.slice(lo, hi), index: idx - lo };
    } catch (e) { return null; }
}
// Chamado pela casca ao FECHAR o player se o cliente zapeou: marca o canal FINAL
// nos "Recentes" (o trackRecent do canal original já rodou na abertura).
global.__zxZapTrack = function (id) {
    try {
        id = parseInt(id, 10); if (!id) return;
        var all = (S.cat.live && S.cat.live.all) || [];
        for (var i = 0; i < all.length; i++) {
            if (parseInt(all[i].stream_id, 10) === id) { trackRecent(id, all[i].name || 'Canal', all[i].stream_icon || '', 0); return; }
        }
    } catch (e) {}
};
function playViaNative(opts) {
    if (S.ultraDenied) return;
    heartbeatContent(opts.title || opts.name || '', false);
    S.nativePlaying = opts;                       // contexto p/ salvar local
    try {
        global.HdxNative.play(JSON.stringify({
            kind: opts.kind, url: opts.url, title: opts.title || opts.name || '',
            resume: opts.resume || 0, id: String(opts.zxId || ''),
            has_next: !!(opts.nextEp),  // série com próximo ep → ExoPlayer mostra "Próximo"
            zap: opts.zap ? opts.zap.list : (opts.kind === 'live' ? ((liveFullZapList(opts.zxId) || {}).list || undefined) : undefined),        // menu completo e zapping
            zap_categories: opts.zap ? (opts.zap.categories || []) : (opts.kind === 'live' ? ((liveFullZapList(opts.zxId) || {}).categories || []) : []),
            zap_index: opts.zap ? opts.zap.index : (opts.kind === 'live' ? ((liveFullZapList(opts.zxId) || {}).index || 0) : undefined)
        }));
    } catch (e) {}
}
/* ANDROID: o player nativo fica POR CIMA do WebView, então a tela de detalhe
   atrás dele não recarrega — os marcadores ficavam velhos até sair e voltar.
   Aqui atualizamos NA HORA, SEM rede: ✓/barra do episódio assistido + botão do
   topo (série) ou "Continuar de X" (filme). As queries só acham algo se o
   detalhe certo estiver aberto → seguro (no-op caso contrário). SÓ Android
   (este caminho só roda via HdxNative); web/TV já re-renderizam ao navegar. */
function nativeRefreshDetail(p) {
    try {
        if (p.zxKind === 'series') {
            var epId = parseInt(p.zxId, 10), ps = S.playSeries || {};
            var tile = document.querySelector('.episode-tile[href*="/episode/' + epId + '/play"]');
            if (tile) {
                if ((' ' + tile.className + ' ').indexOf(' is-watched ') < 0) tile.className += ' is-watched';
                var img = tile.querySelector('.ep-img');
                if (img) {
                    var old = img.querySelector('.ep-watched,.ep-progress'); if (old) old.parentNode.removeChild(old);
                    var pr = getProgress('series', epId), sp = document.createElement('span');
                    if (pr && pr.pos > 5 && pr.dur && pr.pos < pr.dur - 30) { sp.className = 'ep-progress'; sp.style.width = Math.min(100, Math.round(pr.pos / pr.dur * 100)) + '%'; }
                    else { sp.className = 'ep-watched'; sp.textContent = '✓'; }
                    img.insertBefore(sp, img.firstChild);
                }
            }
            if (ps.list && ps.list.length) {
                var sbtn = document.querySelector('#series-detail .dh-buttons .btn-tv.is-primary');
                if (sbtn) { var t1 = document.createElement('div'); t1.innerHTML = seriesTopBtnHtml(ps.id || epId, ps.list); if (t1.firstChild) sbtn.parentNode.replaceChild(t1.firstChild, sbtn); }
            }
        } else if (p.zxKind === 'movie') {
            var box = document.querySelector('.detail-screen .dh-buttons');
            var pb = box && box.querySelector('a.btn-tv[href*="/movies/' + p.zxId + '/play"]');
            if (box && pb) {
                var ext = pb.getAttribute('data-ext') || S.playExt || 'mp4', fav = box.querySelector('#btn-favorite');
                var olds = box.querySelectorAll('a.btn-tv'); for (var i = 0; i < olds.length; i++) olds[i].parentNode.removeChild(olds[i]);
                var t2 = document.createElement('div'); t2.innerHTML = moviePlayBtnsHtml(p.zxId, ext);
                while (t2.firstChild) box.insertBefore(t2.firstChild, fav);
            }
        }
    } catch (e) {}
}
// chamado pela casca Android quando o ExoPlayer fecha (pos/dur em segundos)
global.__zxNativeDone = function (pos, dur, ended) {
    var p = S.nativePlaying; if (!p) return;
    pos = parseInt(pos, 10) || 0; dur = parseInt(dur, 10) || 0; ended = (ended === true || ended === 1 || ended === '1');
    try {
        var fin = ended || (dur > 30 && pos >= dur * 0.9);   // CONCLUÍDO = assistiu >=90% (antes ~dur-20 marcava cedo demais)
        // "Abriu e voltou": o ExoPlayer ainda não sabia a duração (dur=0) OU viu
        // pouquíssimo → NÃO marca como assistido/continuar (o episódio virava ✓ à
        // toa + botão "Próximo"). Espelha a trava `if(pos<5)return` do caminho web.
        if (!fin && (dur <= 0 || pos < 15)) { S.nativePlaying = null; return; }
        if (p.zxKind === 'movie') {
            saveProgress('movie', p.zxId, fin ? 0 : pos, dur, p.name, p.poster);
            bumpContinue('vod', p.zxId, p.name, p.poster, fin);
            nativeRefreshDetail(p);             // atualiza "Continuar de X" no detalhe aberto (sem rede)
        } else if (p.zxKind === 'series') {
            saveProgress('series', p.zxId, fin ? 0 : pos, dur, p.name, '');
            // último ep assistido → botão do topo retoma/pula certo; guarda s/e pro card da home
            var _sl = { epId: parseInt(p.zxId, 10), ext: p.ext || '' };
            try { var _ls = (p.series && p.series.list) || []; for (var _li = 0; _li < _ls.length; _li++) { if (parseInt(_ls[_li].id, 10) === _sl.epId) { _sl.s = _ls[_li].s; _sl.e = _ls[_li].e; break; } } } catch (e2) {}
            lsSet('zx_slast_' + (p.seriesId || p.zxId), _sl);
            bumpContinue('series', p.seriesId || p.zxId, (p.series && p.series.name) || p.name, (p.series && p.series.poster) || '', false);
            if (ended && p.nextEp) {                // auto-avança o episódio (delegando de novo pro nativo)
                S.nativePlaying = null;
                // PUSH (NÃO replace): no caminho NATIVO o renderPlayerEpisode faz seu
                // PRÓPRIO history.back() (volta pro detalhe). A entrada atual AQUI já é
                // o DETALHE /series/X (o play anterior deu back). Com REPLACE, trocava
                // /series/X pelo /play-Y2 → o history.back() do renderPlayer caía na
                // SELEÇÃO de séries (o bug). Com PUSH: empilha /play-Y2 → renderPlayer
                // dá back → fica em /series/X → Voltar do player = detalhe da série. ✓
                go('/series/' + enc(p.seriesId) + '/episode/' + enc(p.nextEp.id) + '/play?ext=' + enc(p.nextEp.ext || 'mp4'));
                return;
            }
            nativeRefreshDetail(p);             // marca o episódio assistido + botão do topo na hora (sem rede)
        }
    } catch (e) {}
        stopContentHeartbeat();
    S.nativePlaying = null;
};

function renderPlayerLive(sid, query) {

    var qs = parseQuery(query); var name = qs.name || t('Canal');
        if (nativeAvail()) {
        heartbeatContent(name, false);
        trackRecent(sid, name, qs.logo || '', 0);

        playViaNative({ kind: 'live', url: streamUrl('live', sid), title: name, resume: 0, zxKind: 'live', zxId: sid, name: name, zap: liveFullZapList(sid) || liveZapList(sid) });
        history.back(); return;                   // volta pro grid; ExoPlayer abre por cima
    }
    setHtml(playerShell('live', name));
    showLoading(false);
        startVideo(streamUrl('live', sid), 'live', null, 0, name);

        trackRecent(sid, name, qs.logo || '', 0);
    S.leavePlayer = function () { stopContentHeartbeat(); };
    bootPlayerScripts('live'); afterRender();

}
function renderPlayerMovie(id, query) {
    var qs = parseQuery(query);
    var name = S.playName || t('Filme'), ext = S.playExt || 'mp4', poster = S.playPoster || '';
    var resumeAt = qs.restart ? 0 : (parseInt(qs.t || '0', 10) || ((getProgress('movie', id) || {}).pos || 0));
    if (nativeAvail()) {
        playViaNative({ kind: 'vod', url: streamUrl('movie', id, ext), title: name, resume: resumeAt, zxKind: 'movie', zxId: id, name: name, poster: poster });
        return;                                   // mantém o detalhe atrás do player; não re-renderiza e não chama miniStop
    }
    setHtml(playerShell('vod', name, true));
    showLoading(false);
    function save(done) {
        var v = $('hls-player'); if (!v) return;
        var pos = Math.floor(v.currentTime || 0), dur = Math.floor(v.duration || 0);
        if (!done && pos < 5) return;                              // muito no início → não conta
        var fin = done || (dur > 30 && pos >= dur - 20);           // acabou → tira do "continue"
        saveProgress('movie', id, fin ? 0 : pos, dur, name, poster);
        bumpContinue('vod', id, name, poster, fin);               // "Continue Assistindo" na hora
    }
        startVideo(streamUrl('movie', id, ext), 'vod', save, resumeAt, name);

        S.leavePlayer = function () { save(false); stopContentHeartbeat(); };                 // salva ao SAIR do player (render() chama)

    bootPlayerScripts('vod'); afterRender();
}
function renderPlayerEpisode(seriesId, epId, query) {
    var qs = parseQuery(query);
    var ext = qs.ext || S.playExt || 'mp4', ps = S.playSeries || {};
    var resumeAt = qs.restart ? 0 : (parseInt(qs.t || '0', 10) || ((getProgress('series', epId) || {}).pos || 0));
    // próximo episódio (da lista guardada no detalhe) — pro botão + auto-avanço
    var list = ps.list || [], curIdx = -1, curEp = null;
    for (var li = 0; li < list.length; li++) { if (parseInt(list[li].id, 10) === parseInt(epId, 10)) { curIdx = li; curEp = list[li]; break; } }
    var nextEp = (curIdx >= 0 && curIdx + 1 < list.length) ? list[curIdx + 1] : null;
    // TÍTULO do player = SÉRIE + S/E (NÃO o S.playName, que ficava do filme/conteúdo
    // anterior porque o detalhe da série não o reseta → título velho no player).
    var name = ps.name || t('Episódio');
    if (curEp && (curEp.s != null) && (curEp.e != null)) name = (ps.name || t('Série')) + ' · S' + curEp.s + 'E' + curEp.e;
    if (nativeAvail()) {
        playViaNative({ kind: 'vod', url: streamUrl('series', epId, ext), title: name, resume: resumeAt,
            zxKind: 'series', zxId: epId, name: name, ext: ext, seriesId: ps.id || seriesId, series: ps, nextEp: nextEp });
        return;                                   // mantém o detalhe atrás do player; não chama miniStop
    }
    setHtml(playerShell('vod', name, true));
    showLoading(false);
    function save(done) {
        var v = $('hls-player'); if (!v) return;
        var pos = Math.floor(v.currentTime || 0), dur = Math.floor(v.duration || 0);
        if (!done && pos < 5) return;
        var fin = done || (dur > 30 && pos >= dur - 20);
        saveProgress('series', epId, fin ? 0 : pos, dur, name, '');
        try { lsSet('zx_slast_' + (ps.id || seriesId), { epId: parseInt(epId, 10), ext: ext, s: curEp ? curEp.s : null, e: curEp ? curEp.e : null }); } catch (e) {}
        bumpContinue('series', ps.id || seriesId, ps.name || name, ps.poster || '', false);
    }
        startVideo(streamUrl('series', epId, ext), 'vod', save, resumeAt, name);

        S.leavePlayer = function () { save(false); stopContentHeartbeat(); };

    // "Concluir" o episódio = marcar assistido SEM depender do currentTime (na
    // Samsung/AVPlay o currentTime no fim/transição oscila). Usado ao ir pro próximo.
    function markWatched() { save(true); }
    // PRÓXIMO EPISÓDIO: botão no canto quando falta ~1min + auto-avanço no fim.
    wireNextEpisode(seriesId, nextEp, markWatched);
    bootPlayerScripts('vod'); afterRender();
}
function goNextEpisode(seriesId, nextEp, markWatched) {
    if (!nextEp) return;
    try { var p = document.getElementById('next-ep-prompt'); if (p && p.parentNode) p.parentNode.removeChild(p); } catch (e) {}
    // Ir pro próximo = o episódio ATUAL foi assistido → marca AGORA (fin, sem
    // depender do currentTime) e LIMPA o S.leavePlayer pra o save da navegação NÃO
    // sobrescrever com um currentTime instável (Samsung/AVPlay) — era a causa do
    // "às vezes não marca / marca o episódio errado / oscila".
    try { if (markWatched) markWatched(); } catch (e) {}
    S.leavePlayer = null;
    // REPLACE (nao push): troca a entrada do ep atual pela do proximo -> o "Voltar"
    // sai pra serie, em vez de reabrir o episodio anterior (bug do auto-avanco).
    go('/series/' + enc(seriesId) + '/episode/' + enc(nextEp.id) + '/play?ext=' + enc(nextEp.ext || 'mp4'), true);
}
function wireNextEpisode(seriesId, nextEp, markWatched) {
    if (!nextEp) return;
    var v = $('hls-player'); if (!v) return;
    var shown = false, autoTimer = null, cancelled = false;
    function updateCount(n) { var c = document.getElementById('next-ep-count'); if (c) c.textContent = String(n); }
    function showPrompt() {
        if (shown || document.getElementById('next-ep-prompt')) { shown = true; return; }
        shown = true;
        var box = document.createElement('div'); box.id = 'next-ep-prompt';
        box.style.cssText = 'position:absolute;right:22px;bottom:22px;z-index:80;display:flex;align-items:stretch;gap:8px;padding:10px;border-radius:14px;background:rgba(3,12,9,.94);border:1px solid rgba(16,185,129,.75);box-shadow:0 10px 35px rgba(0,0,0,.55);max-width:min(92vw,360px);';
        box.innerHTML = '<button type="button" class="next-ep-btn" id="next-ep-btn" style="display:flex;flex-direction:column;align-items:flex-start;gap:3px;border:0;border-radius:10px;padding:10px 14px;background:#10b981;color:#04231a;font-weight:800;cursor:pointer"><span class="next-ep-cap">' + te('Próximo episódio') + '</span><span class="next-ep-lbl">S' + esc(nextEp.s) + ' E' + esc(nextEp.e) + ' · <span id="next-ep-count">em breve</span> ▸</span></button><button type="button" id="next-ep-cancel" style="border:1px solid rgba(255,255,255,.35);border-radius:10px;padding:8px 10px;background:rgba(255,255,255,.08);color:#fff;font-weight:700;cursor:pointer">' + te('Cancelar') + '</button>';
        (document.querySelector('.player-screen') || document.body).appendChild(box);
        var b = document.getElementById('next-ep-btn'), cancel = document.getElementById('next-ep-cancel');
        if (b) { b.addEventListener('click', function (ev) { ev.preventDefault(); if (autoTimer) { clearInterval(autoTimer); autoTimer = null; } goNextEpisode(seriesId, nextEp, markWatched); }); setTimeout(function () { try { b.focus(); } catch (e) {} }, 40); }
        if (cancel) cancel.addEventListener('click', function (ev) { ev.preventDefault(); cancelled = true; if (autoTimer) { clearInterval(autoTimer); autoTimer = null; } hidePrompt(); try { v.focus(); } catch (e) {} });
    }
    function hidePrompt() { shown = false; var p = document.getElementById('next-ep-prompt'); if (p && p.parentNode) p.parentNode.removeChild(p); }
    function startCountdown() {
        if (cancelled || autoTimer) return;
        showPrompt(); var n = 10; updateCount(n);
        autoTimer = setInterval(function () { n--; updateCount(n); if (n <= 0) { clearInterval(autoTimer); autoTimer = null; goNextEpisode(seriesId, nextEp, markWatched); } }, 1000);
    }
    v.addEventListener('timeupdate', function () {
        var dur = v.duration, ct = v.currentTime; if (!isFinite(dur) || dur <= 0) return;
        var rem = dur - ct;
        if (rem <= 60 && rem > 2) showPrompt();
        else if (rem > 65 && shown) hidePrompt();
    });
    v.addEventListener('ended', function () { startCountdown(); });
}
function parseQuery(q) { var o = {}; if (!q) return o; var ps = q.split('&'); for (var i = 0; i < ps.length; i++) { var kv = ps[i].split('='); o[decodeURIComponent(kv[0] || '')] = decodeURIComponent((kv[1] || '').replace(/\+/g, ' ')); } return o; }

/* episode/movie play precisam do ext — guardo do detalhe; se vier direto sem
   passar pelo detalhe, busco o ext na hora */
// (capturado em S.playExt/S.playName ao abrir o detalhe; suficiente no fluxo normal)

/* ---- PIN adulto — LOCAL no aparelho (igual favoritos/continue/recentes; NADA no
   servidor). Padrão "1234". Trocável em Configurações → Controle parental. ---- */
function getAdultPin() { var v = lsGet('zx_adultpin'); return (v != null && /^\d{4,6}$/.test(String(v))) ? String(v) : '1234'; }
function parentPinGate(onOk) {
    if ($('zx-parent-pin-gate')) return;
    injectFfAskCss();
    var ov = document.createElement('div'); ov.id = 'zx-parent-pin-gate'; ov.className = 'zx-ff-ask tv-modal';
    ov.innerHTML = '<div class="zx-ffa-card" style="max-width:420px;text-align:center"><div class="zx-ffa-title">PIN do responsável</div><div class="zx-ffa-sub">Digite o PIN de 4 a 6 dígitos para continuar.</div><input id="zxParentPinInput" class="zx-pf-input" type="password" inputmode="numeric" maxlength="6" autocomplete="off" placeholder="PIN"><div id="zxParentPinMsg" class="zx-ffa-sub" style="min-height:22px;color:#ff8c95"></div><div style="display:flex;gap:10px;justify-content:center"><button type="button" class="zx-pf-save" id="zxParentPinOk">Continuar</button><button type="button" class="zx-pf-del" id="zxParentPinCancel">Cancelar</button></div></div>';
    document.body.appendChild(ov);
    function close() { try { ov.parentNode.removeChild(ov); } catch (e) {} }
    var inp = $('zxParentPinInput'), ok = $('zxParentPinOk'), cancel = $('zxParentPinCancel'), msg = $('zxParentPinMsg');
    function verify() { var value = inp ? String(inp.value || '').trim() : ''; if (value !== getAdultPin()) { if (msg) msg.textContent = 'PIN incorreto.'; if (inp) { inp.value = ''; inp.focus(); } return; } close(); if (onOk) onOk(); }
    if (ok) ok.addEventListener('click', verify); if (cancel) cancel.addEventListener('click', close); if (inp) inp.addEventListener('keydown', function (e) { if (e.key === 'Enter' || e.keyCode === 13) { e.preventDefault(); verify(); } });
    ov.addEventListener('keydown', function (e) { if (e.key === 'Escape' || e.keyCode === 27) { e.preventDefault(); close(); } }, true);
    try { if (inp) inp.focus(); } catch (e) {}
}
function promptPin(targetPath) {
    var ov = document.createElement('div'); ov.className = 'zx-ann-overlay';
    // Estilo INLINE: o CSS do .zx-ann-overlay só é injetado quando há um AVISO ativo;
    // sem aviso o overlay do PIN caía como position:static e ficava INVISÍVEL (a tela
    // "bugava" ao abrir conteúdo adulto). Auto-estilizado = sempre funciona.
    ov.style.cssText = 'position:fixed;top:0;left:0;right:0;bottom:0;z-index:100000;display:flex;align-items:center;justify-content:center;background:rgba(0,0,0,.82);padding:20px;box-sizing:border-box';
    ov.innerHTML = '<div style="background:#161616;border:1px solid rgba(16,185,129,.45);border-radius:16px;padding:24px 26px;max-width:360px;width:100%;text-align:center;box-shadow:0 16px 50px rgba(0,0,0,.6);box-sizing:border-box">'
        + '<div style="font-weight:700;color:#fff;font-size:20px;margin-bottom:6px">Conteúdo adulto</div>'
        + '<div style="color:#d6d6d6;font-size:15px;margin-bottom:16px">Digite o PIN para continuar.</div>'
        + '<input type="password" id="zx-pin" inputmode="numeric" maxlength="6" style="width:200px;text-align:center;letter-spacing:8px;font-size:26px;background:#0c0f0d;border:1.5px solid rgba(255,255,255,.16);border-radius:12px;padding:12px;color:#fff;margin-bottom:10px;outline:none">'
        + '<div id="zx-pin-err" style="color:#ff8c95;height:18px;margin-bottom:8px;font-size:14px"></div>'
        + '<div><button type="button" id="zx-pin-ok" style="background:#10b981;color:#04231a;font-weight:700;border:0;border-radius:10px;padding:12px 26px;font-size:16px;cursor:pointer;margin:0 4px">Desbloquear</button>'
        + '<button type="button" id="zx-pin-cancel" style="background:#333;color:#fff;font-weight:700;border:0;border-radius:10px;padding:12px 26px;font-size:16px;cursor:pointer;margin:0 4px">Cancelar</button></div></div>';
    document.body.appendChild(ov);
    translateTree(ov);   // modal fora do setHtml → traduz aqui (EN)
    var inp = $('zx-pin'); setTimeout(function () { try { inp.focus(); } catch (e) {} }, 60);
    // TRAVA DE FOCO: fechar o teclado do sistema devolvia o foco pra PÁGINA DE TRÁS
    // (o modal ficava aberto mas as setas navegavam atrás dele). Enquanto o PIN
    // estiver aberto, qualquer foco FORA do modal volta pro campo do PIN.
    function trapFocus(e) {
        if (!ov.parentNode) return;
        if (ov.contains(e.target)) return;
        setTimeout(function () { try { inp.focus(); } catch (err) {} }, 0);
    }
    document.addEventListener('focusin', trapFocus, true);
    function close() {
        document.removeEventListener('focusin', trapFocus, true);
        S.pinClose = null;
        if (ov.parentNode) ov.parentNode.removeChild(ov);
    }
    S.pinClose = close;   // Voltar do Android fecha o modal (em vez de navegar atrás)
    function submit() {
        var pin = (inp.value || '').trim(); if (!pin) return;
        // Verificação LOCAL (a senha fica só no aparelho — nada vai pro servidor).
        if (pin === getAdultPin()) { S.adultOk = true; close(); go(targetPath); }
        else { $('zx-pin-err').textContent = t('Senha incorreta.'); inp.value = ''; try { inp.focus(); } catch (e) {} }
    }
    $('zx-pin-cancel').addEventListener('click', close);
    $('zx-pin-ok').addEventListener('click', submit);
    // Enter / OK do teclado (IME do sistema, físico ou controle) envia — na TV o
    // botão "Desbloquear" pode ficar atrás do teclado numérico, então o Enter resolve.
    inp.addEventListener('keydown', function (e) { if (e.key === 'Enter' || e.keyCode === 13) { e.preventDefault(); submit(); } });
}

/* ---- reload / logout ---- */
// Recarregar: antes só dava go('/home') → parecia que "jogava pra cima" sem
// fazer nada. Agora limpa cache (catálogo) e RECARREGA o app de verdade (volta
// pro IPTV buscar tudo fresco) — feedback visível (splash) e conteúdo novo.
function doReload() {
    try { if (global.HdxCache) HdxCache.bust(); } catch (e) {}
    S.cat = { movies: null, series: null, live: null };   // catálogo re-buscado FRESCO do IPTV no próximo browse
    showLoading(true);
    // ⚠️ NÃO usa location.reload(): o WebView2 do app BLOQUEIA recarregar file://
    // (ver hdx_player.py) → era no-op, por isso "não atualizava". Refresh SOFT:
    // re-busca o resolve (licença/vencimento/branding/aviso/DNS) e re-renderiza.
    api('resolve', '', 9000).then(function (d) {
        showLoading(false);
        if (d && d.error === 'license') { if (applyPush(d)) return; renderPaywall(d); return; }
        if (d && d.ok && d.dns && d.dns.base) { applyResolve(d, false); saveSnap(d); flushQueue(); }
        go('/home', true); flashReloaded();
    }).catch(function () { showLoading(false); go('/home', true); flashReloaded(); });
}
// feedback visível do Recarregar (o conteúdo da home muda pouco; sem isto parecia
// que "nada acontecia"). Troca o rótulo do botão por ~1.6s.
function flashReloaded() {
    setTimeout(function () {
        var b = document.querySelector('.home-reload span') || document.querySelector('.home-reload');
        if (!b) return;
        var old = b.textContent;
        b.textContent = '✓ Atualizado';
        setTimeout(function () { try { b.textContent = old || 'Recarregar'; } catch (e) {} }, 1600);
    }, 40);
}
function doLogout() {
    try { localStorage.removeItem('zx_direct_mode'); localStorage.removeItem('zx_mac'); } catch (e) {}
    S.directAuth = false;
    clearCreds();
    try {
        var kill = [];
        for (var li = 0; li < localStorage.length; li++) {
            var lk = localStorage.key(li);
            if (!lk) continue;
            var base = lk.replace(/^p\d+_/, '');
            if (base === 'zx_snap' || profIsPersonalKey(base)) kill.push(lk);   // TODOS os perfis
        }
        kill.forEach(function (k) { localStorage.removeItem(k); });
    } catch (e) {}
    S.server = ''; S.info = null; S.blocked = false;
    S.fav = { live: [], movie: [], series: [] }; S.favDirty = { live: [], movie: [], series: [] }; S.favMeta = {};
    S.cat = { movies: null, series: null, live: null };
    // Sair da conta cai na tela de LISTAS (Adicionar lista COM a barra de topo
    // "← Voltar | Listas") — igual ao fluxo do Trocar lista. Antes ia pro /login
    // pelado (formulário sem menu no topo), destoando do resto (pedido do Leonardo).
    if (S.directAuth || directModeStored()) { renderMacActivation(); } else { go('/lists', true); }
}

/* ============================================================
 * BOOT
 * ============================================================ */
// Re-verificação em segundo plano: vencimento/licença/branding/aviso + migração
// de DNS. Roda quando a VPS está alcançável; se não, segue no snapshot (offline).
function refresh(snap) {
    var oldAnnVer = (S.branding && S.branding.announce && S.branding.announce.ver) || '';
    api('resolve', '', 9000).then(function (d) {
        if (!d) return;                                  // VPS fora → segue offline
        if (d.error === 'license') { if (applyPush(d)) return; renderPaywall(d); return; }   // venceu/bloqueado (push pendente aplica antes)
        if (!d.ok || !d.dns || !d.dns.base) return;
        var dnsChanged = snap && snap.d && snap.d.dns && (snap.d.dns.base !== d.dns.base);
        applyResolve(d, false);                          // reconcilia favoritos + atualiza dns/licença/branding/aviso
        saveSnap(d);
        flushQueue();
        if (dnsChanged) {                                // migração de DNS em massa → recarrega catálogo do novo servidor
            S.cat = { movies: null, series: null, live: null };
            try { if (global.HdxCache) HdxCache.bust(); } catch (e) {}
        }
        if (S.blocked) { stopPwPoll(); S.blocked = false; go('/home', true); return; }   // estava em paywall/offline e renovou → volta
        // Abriu do snapshot (aviso velho) e chegou um AVISO NOVO (versão diferente)
        // → re-renderiza a home pra ele aparecer AO ABRIR, sem precisar Recarregar.
        var newAnnVer = (S.branding && S.branding.announce && S.branding.announce.ver) || '';
        if (newAnnVer !== oldAnnVer && document.querySelector('.home-screen')) renderHome();
    });
}

function renderPaywall(d) {
    S.blocked = true;
    d = d || {}; var lic = d.license || {};
    var mac = d.mac || lic.mac || '';
    // Texto mostra SÓ até /renovar (sem ?mac=... — ninguém digita URL-encoded);
    // o MAC já aparece por extenso logo abaixo e o QR leva o link completo.
    var pay = (d.pay_url || lic.pay_url || 'https://renciaapp.manus.space/renovar').replace(/^https?:\/\//, '').replace(/\?.*$/, '');
    var qr = d.qr_url || lic.qr_url || '';
    // Wrapper com scroll próprio + miolo com margin:auto: se couber, fica centrado;
    // se NÃO couber, rola a partir do TOPO. Em tela BAIXA (celular deitado — no
    // ui-tv o .brand-logo é 128px, tamanho de TV!) a media query compacta
    // logo/título/QR pra caber TUDO sem rolar. Escopado no #zx-pw: não muda
    // home/login. scrollTop=0 no fim: o autofocus do botão rolava e cortava o topo.
    setHtml('<style>'
        // FOCO VISÍVEL no D-pad: o :focus dos botões só existia dentro de
        // .tv-login-card — aqui no paywall as setas moviam o foco às CEGAS e o
        // OK caía no botão errado (ia pro login sem querer).
        + '#zx-pw button:focus{outline:3px solid #fff;outline-offset:3px;box-shadow:0 0 0 6px rgba(16,185,129,.35)}'
        + '#zx-pw .home-logo{margin-bottom:12px}'
        + '@media (max-height:760px){'
        + '#zx-pw .home-logo{margin-bottom:6px}'
        + '#zx-pw .home-logo .brand-logo{font-size:54px}'
        + '#zx-pw .home-logo img{height:60px}'
        + '#zx-pw h1{font-size:21px !important;margin:0 0 4px !important}'
        + '#zx-pw .zx-pw-sub{font-size:14px !important}'
        + '#zx-pw .zx-pw-qr{width:132px !important;height:132px !important;margin:8px 0 !important}'
        + '#zx-pw .zx-pw-line{font-size:14px !important;margin:2px 0 !important}'
        + '#zx-pw .zx-pw-btns{margin-top:8px !important}'
        + '}</style>'
        + '<div id="zx-pw" style="height:100vh;overflow-y:auto;-webkit-overflow-scrolling:touch;display:flex;flex-direction:column;box-sizing:border-box;padding:16px">'
        + '<div style="margin:auto;display:flex;align-items:center;flex-direction:column;text-align:center;max-width:560px;width:100%">'
        + '<div class="home-logo">' + brandLogoHtml() + '</div>'
        + '<h1 style="font-size:26px;margin:0 0 8px">Período de uso expirado</h1>'
        + '<p class="zx-pw-sub" style="color:#9aa6a0;max-width:520px;font-size:16px;line-height:1.4;margin:0 0 4px">Renove para continuar assistindo.</p>'
        + (qr ? '<img class="zx-pw-qr" src="' + attr(qr) + '" style="width:170px;height:170px;background:#fff;border-radius:12px;margin:14px 0">' : '')
        + (mac ? '<p class="zx-pw-line" style="color:#cdd5d1;margin:4px 0">Aparelho: <strong>' + esc(mac) + '</strong></p>' : '')
        + '<p class="zx-pw-line" style="color:#cdd5d1;margin:4px 0;word-break:break-all">Renove em <strong>' + esc(pay) + '</strong></p>'
        + '<div class="zx-pw-btns" style="display:flex;gap:12px;margin-top:14px;flex-wrap:wrap;justify-content:center">'
        + '<button type="button" class="tv-submit" id="zx-pw-paid" style="width:auto;padding:12px 36px">Já paguei</button>'
        + '<button type="button" id="zx-pw-out" style="width:auto;padding:12px 28px;background:transparent;border:1px solid #ffffff33;color:#cdd5d1;border-radius:12px;cursor:pointer;font-size:16px">Sair</button>'
        + '</div></div></div>');
    var b = $('zx-pw-out'); if (b) b.addEventListener('click', doLogout);
    var jp = $('zx-pw-paid'); if (jp) jp.addEventListener('click', function () { pwRecheck(jp); });
    stopPwPoll();
    S.pwPoll = setInterval(function () { pwRecheck(null); }, 8000);   // destrava SOZINHO quando o pagamento cair
    afterRender();
    // Foco inicial DETERMINÍSTICO no "Já paguei" (senão fica onde o afterRender
    // deixou) + volta o scroll pro topo (o focus rolava e cortava o logo no celular).
    setTimeout(function () {
        try { var jp2 = $('zx-pw-paid'); if (jp2) jp2.focus({ preventScroll: true }); } catch (e) { try { if (jp2) jp2.focus(); } catch (e2) {} }
        var w = $('zx-pw'); if (w) w.scrollTop = 0;
    }, 50);
}
function stopPwPoll() { if (S.pwPoll) { try { clearInterval(S.pwPoll); } catch (e) {} S.pwPoll = null; } }
// Re-checa a licença no paywall: pagou -> /resolve volta ok -> volta pra home.
function pwRecheck(btn) {
    if (!S.blocked) { stopPwPoll(); return; }
    if (btn) btn.textContent = t('Verificando…');
    api('resolve', '', 12000).then(function (d) {
        if (d && d.ok && d.error !== 'license') {
            stopPwPoll(); S.blocked = false; applyResolve(d, false); saveSnap(d); go('/home', true);
        } else if (d && d.error === 'license' && applyPush(d)) {
            // chegou lista nova ENQUANTO no paywall (ex: vendedor enviou DNS grátis
            // pro MAC) → aplica na hora; o applyPush re-resolve e decide (desbloqueia
            // ou re-mostra o paywall se a lista nova também estiver vencida)
        } else if (btn) { btn.textContent = t('Ainda não consta'); setTimeout(function () { if ($('zx-pw-paid')) $('zx-pw-paid').textContent = t('Já paguei'); }, 2500); }
    }).catch(function () { if (btn) btn.textContent = t('Já paguei'); });
}
function renderOfflineFirst() {
    S.blocked = true;
    setHtml('<div style="min-height:100vh;display:flex;align-items:center;justify-content:center;flex-direction:column;text-align:center;padding:40px">'
        + '<div class="home-logo" style="margin-bottom:18px">' + brandLogoHtml() + '</div>'
        + '<h1 style="font-size:26px;margin:0 0 10px">Sem conexão</h1>'
        + '<p style="color:#9aa6a0;max-width:480px">Não foi possível falar com o painel para o primeiro acesso. Verifique sua internet e tente de novo.</p>'
        + '<button type="button" class="tv-submit" id="zx-retry" style="width:auto;padding:14px 40px;margin-top:14px">Tentar de novo</button></div>');
    var b = $('zx-retry'); if (b) b.addEventListener('click', boot);
    afterRender();
}

/* ===== FORMATO DA TELA (Celular x TV/Caixa) — SÓ Android (UI empacotada) =====
   Os dois modos Android ficam sempre em PAISAGEM. A escolha controla apenas a
   escala: Celular usa controles, cards e textos maiores para toque; TV/Caixa
   usa uma composição mais compacta para visualização à distância. Fica em
   localStorage 'zx:ff'. PC/Samsung não setam zx:ff. */
function getFormFactor() { try { var v = localStorage.getItem('zx:ff'); return (v === 'mobile' || v === 'tv') ? v : ''; } catch (e) { return ''; } }
function applyFormFactor() {
    var ff = getFormFactor();
    var known = ff === 'mobile' || ff === 'tv';
    var mob = ff === 'mobile';
    var tvMode = ff === 'tv' || (!known && nativeAvail() && (function(){ try { return !!(global.HdxNative && global.HdxNative.isTv && global.HdxNative.isTv()); } catch(e) { return false; } })());
    // TV: alvo proporcional à tela para manter cards compactos e previsíveis.
    // Celular usa alvo maior para exibir menos cards, porém maiores e mais fáceis
    // de tocar na orientação horizontal.
    var tvTarget = 210;
    try { tvTarget = Math.max(140, Math.round(window.innerWidth * 0.164)); } catch (e) {}
    global.__ZX_TILE_TARGET = mob ? 250 : (tvMode ? tvTarget : 210);
    try {
        var b = document.body;
        if (b) {
            var cl = (' ' + b.className + ' ').replace(' zx-ff-mobile ', ' ').replace(' zx-ff-tv ', ' ').replace(' ui-tv ', ' ').replace(/^\s+|\s+$/g, '');
            // Mantém as duas marcas no TV Box: `zx-ff-tv` para o layout novo
            // e `ui-tv` para as regras legadas do EPG e da grade Live.
            b.className = cl + (cl && (mob || tvMode) ? ' ' : '') + (mob ? 'zx-ff-mobile' : (tvMode ? 'zx-ff-tv ui-tv' : ''));
        }
    } catch (e) {}
    try { if (known && global.HdxNative && global.HdxNative.setFormFactor) global.HdxNative.setFormFactor(tvMode ? 'tv' : 'mobile'); } catch (e) {}
    var st = $('zx-ff-css');
    if (!st) { st = document.createElement('style'); st.id = 'zx-ff-css'; (document.head || document.documentElement).appendChild(st); st.textContent = ffMobileCss(); }
    // re-ajusta grids visíveis + nav do catálogo na hora
    try { var g = $('content-grid') || $('search-grid'); if (g) fitPosterGrid(g); } catch (e) {}
    try { if (global.__zxReindexGrid) global.__zxReindexGrid(); } catch (e) {}
}
    /* Escala dos dois modos Android. A orientação é sempre paisagem; apenas
       os tamanhos mudam. Celular é maior para toque e TV Box é compacto. */
function ffMobileCss() {
    return 'body.zx-ff-mobile .tile-icon svg{width:58px;height:58px}'
        + 'body.zx-ff-mobile .zx-home2{overflow-y:auto !important;overflow-x:hidden !important;-webkit-overflow-scrolling:touch;}'
        + 'body.zx-ff-mobile .zx-home2 .zh-ui{position:relative !important;min-height:100vh;height:auto !important;overflow:visible !important;padding-bottom:36px;}'
        + 'body.zx-ff-mobile .zx-home2 .zh-nav{display:flex !important;align-items:stretch;gap:9px;overflow-x:auto;overflow-y:hidden;width:100%;height:132px !important;min-height:132px !important;flex:none !important;padding:4px 4px 10px;box-sizing:border-box;scrollbar-width:thin;scroll-snap-type:x proximity;-webkit-overflow-scrolling:touch;}'
        + 'body.zx-ff-mobile .zx-home2 .zh-navr,body.zx-ff-mobile .zx-home2 .zh-navtop,body.zx-ff-mobile .zx-home2 .zh-navbot{display:contents !important;}'
        + 'body.zx-ff-mobile .zx-home2 .zh-nav>.zh-tile,body.zx-ff-mobile .zx-home2 .zh-navtop .zh-tile,body.zx-ff-mobile .zx-home2 .zh-navbot .zh-stile{flex:0 0 190px !important;width:190px !important;min-width:190px !important;max-width:190px !important;height:116px !important;min-height:116px !important;max-height:116px !important;scroll-snap-align:start;}'
        + 'body.zx-ff-mobile .zx-home2 .zh-posters{overflow-x:auto;overflow-y:hidden;max-width:100%;padding:2px 4px 8px;scrollbar-width:thin;-webkit-overflow-scrolling:touch;}'
        + 'body.zx-ff-mobile .zx-home2 .zh-recent{max-width:100%;overflow:hidden;}'
        + 'body.zx-ff-mobile .zx-home2 .zh-status{max-width:100%;}'
        + 'body.zx-ff-mobile .home-tile{padding:20px 10px}'
        + 'body.zx-ff-mobile .home-tile span{font-size:17px}'
        + 'body.zx-ff-mobile .home-logo{transform:scale(1);transform-origin:center}'
        + 'body.zx-ff-mobile .poster-tile-tv .pt-title,body.zx-ff-mobile .poster-tile-tv .pt-name{font-size:16px;line-height:1.25}'
        + 'body.zx-ff-mobile .channel-tile-tv .ch-name{font-size:17px}'
        + 'body.zx-ff-mobile .channel-tile-tv .ct-logo{width:36px !important;height:36px !important;line-height:36px !important;margin-right:5px !important}'
        + 'body.zx-ff-mobile .channel-tile-tv .ct-logo img{width:100% !important;height:100% !important;object-fit:contain}'
        + 'body.zx-ff-mobile .channel-tile-tv .ct-fallback{font-size:17px !important}'
        + 'body.zx-ff-mobile .channel-tile-tv .ct-name{font-size:12px !important;line-height:1.12 !important}'
        + 'body.zx-ff-mobile .live-split .channel-tile-tv{padding:6px 7px !important;min-height:0 !important}'
        + 'body.zx-ff-mobile .live-video-slot{height:clamp(260px,40vh,460px) !important}'
        + 'body.zx-ff-tv .live-video-slot{height:clamp(260px,42vh,500px) !important}'
        + 'body.zx-ff-mobile .live-split .channel-tile-tv .ct-logo{width:36px !important;height:36px !important;line-height:36px !important;margin-right:5px !important}'
        + 'body.zx-ff-mobile .live-split .channel-tile-tv .ct-name{font-size:12px !important;line-height:1.12 !important}'
        + 'body.zx-ff-tv .live-epg{padding:22px 24px !important;overflow-x:hidden !important;box-sizing:border-box !important}'
        + 'body.zx-ff-tv .live-epg .epg-ch{font-size:30px !important;line-height:1.12 !important;margin-bottom:8px !important}'
        + 'body.zx-ff-tv .live-epg .epg-sub{font-size:16px !important;line-height:1.2 !important;margin-bottom:12px !important}'
        + 'body.zx-ff-tv .live-epg .epg-item{display:flex !important;align-items:center !important;gap:10px !important;padding:11px 0 !important;min-height:48px !important;box-sizing:border-box !important;overflow:visible !important}'
        + 'body.zx-ff-tv .live-epg .epg-copy{display:block !important;min-width:0 !important;flex:1 1 auto !important;overflow:hidden !important}'
        + 'body.zx-ff-tv .live-epg .epg-title{display:block !important;font-size:23px !important;line-height:1.16 !important;white-space:nowrap !important;overflow:hidden !important;text-overflow:ellipsis !important}'
        + 'body.zx-ff-tv .live-epg .epg-time{font-size:18px !important;line-height:1.08 !important}'
        + 'body.zx-ff-tv .live-epg .epg-alarm{position:static !important;display:flex !important;visibility:visible !important;opacity:1 !important;flex:0 0 40px !important;width:40px !important;min-width:40px !important;height:40px !important;font-size:23px !important;border-radius:8px !important;margin:0 2px 0 0 !important;padding:0 !important;align-items:center !important;justify-content:center !important;z-index:999 !important;float:none !important}'
        + 'body.ui-tv .live-epg{padding:22px 24px !important;overflow-x:hidden !important;box-sizing:border-box !important}'
        + 'body.ui-tv .live-epg .epg-ch{font-size:30px !important;line-height:1.12 !important;margin-bottom:8px !important}'
        + 'body.ui-tv .live-epg .epg-sub{font-size:16px !important;line-height:1.2 !important;margin-bottom:12px !important}'
        + 'body.ui-tv .live-epg .epg-item{display:flex !important;align-items:center !important;gap:10px !important;padding:11px 0 !important;min-height:48px !important;box-sizing:border-box !important;overflow:visible !important}'
        + 'body.ui-tv .live-epg .epg-copy{display:block !important;min-width:0 !important;flex:1 1 auto !important;overflow:hidden !important}'
        + 'body.ui-tv .live-epg .epg-title{display:block !important;font-size:23px !important;line-height:1.16 !important;white-space:nowrap !important;overflow:hidden !important;text-overflow:ellipsis !important}'
        + 'body.ui-tv .live-epg .epg-time{font-size:18px !important;line-height:1.08 !important}'
        + 'body.ui-tv .live-epg .epg-alarm{position:static !important;display:flex !important;visibility:visible !important;opacity:1 !important;flex:0 0 40px !important;width:40px !important;min-width:40px !important;height:40px !important;font-size:23px !important;border-radius:8px !important;margin:0 2px 0 0 !important;padding:0 !important;align-items:center !important;justify-content:center !important;z-index:999 !important;float:none !important}'
        + 'body.zx-home2 .zh-nav .zh-tsub,body.zx-home2 .zh-nav .zh-ssub{display:none !important}'
        + 'body.zx-ff-mobile .live-epg{padding:10px 10px !important;overflow-x:hidden !important;box-sizing:border-box !important}'
        + 'body.zx-ff-mobile .live-epg .epg-ch{font-size:13px !important;margin-bottom:3px !important}'
        + 'body.zx-ff-mobile .live-epg .epg-sub{font-size:8px !important;margin-bottom:5px !important}'
        + 'body.zx-ff-mobile .live-epg .epg-item{display:flex !important;align-items:center !important;gap:3px !important;padding:4px 0 !important;min-height:30px !important;overflow:hidden !important}'
        + 'body.zx-ff-mobile .live-epg .epg-copy{min-width:0 !important;flex:1 1 auto !important;overflow:hidden !important}'
        + 'body.zx-ff-mobile .live-epg .epg-copy{display:block !important;min-width:0 !important;flex:1 1 auto !important;overflow:hidden !important}'
        + 'body.zx-ff-mobile .live-epg .epg-title{font-size:10px !important;line-height:1.08 !important;white-space:nowrap !important;overflow:hidden !important;text-overflow:ellipsis !important}'
        + 'body.zx-ff-mobile .live-epg .epg-time{font-size:8px !important;line-height:1.05 !important}'
        + 'body.zx-ff-mobile .live-epg .epg-item{display:flex !important;position:relative !important;align-items:center !important;gap:5px !important;width:100% !important;min-height:38px !important;padding:5px 0 !important;overflow:visible !important;box-sizing:border-box !important}'
        + 'body.zx-ff-mobile .live-epg .epg-copy{display:block !important;min-width:0 !important;flex:1 1 auto !important;overflow:hidden !important}'
        + 'body.zx-ff-mobile .live-epg .epg-title{display:block !important;font-size:11px !important;line-height:1.12 !important;white-space:nowrap !important;overflow:hidden !important;text-overflow:ellipsis !important}'
        + 'body.zx-ff-mobile .live-epg .epg-time{font-size:9px !important;line-height:1.05 !important}'
        + 'body.zx-ff-mobile .live-epg .epg-alarm{position:static !important;display:flex !important;visibility:visible !important;opacity:1 !important;flex:0 0 28px !important;width:28px !important;min-width:28px !important;height:28px !important;font-size:15px !important;border-radius:6px !important;margin:0 2px 0 0 !important;padding:0 !important;align-items:center !important;justify-content:center !important;z-index:999 !important;float:none !important}'
        + 'body.zx-ff-mobile .live-split .channel-tile-tv .ct-logo{width:36px !important;height:36px !important;line-height:36px !important;margin-right:5px !important}'
        + 'body.zx-ff-mobile .live-split .channel-tile-tv .ct-logo img{width:100%;height:100%;object-fit:contain}'
        + 'body.zx-ff-mobile .live-split .channel-tile-tv .ct-fallback{font-size:17px !important}'
        + 'body.zx-ff-mobile .voice-search-screen .ct-logo{width:50px;height:50px;flex-basis:50px;margin-right:10px}'
        + 'body.zx-ff-mobile .voice-search-screen .ct-fallback{font-size:20px}'
        + 'body.zx-ff-mobile .detail-hero .dh-content{padding:30px 22px 18px;max-width:100%}'
        + 'body.zx-ff-mobile .detail-hero h1{font-size:28px;margin-bottom:10px}'
        + 'body.zx-ff-mobile .detail-hero .dh-badge{font-size:14px;padding:4px 10px}'
        + 'body.zx-ff-mobile .detail-hero .dh-genre{font-size:14px}'
        + 'body.zx-ff-mobile .detail-hero .dh-plot{font-size:15px;line-height:1.45;margin-bottom:18px;max-width:100%}'
        + 'body.zx-ff-mobile .detail-hero .dh-back{font-size:14px;padding:7px 14px}'
        + 'body.zx-ff-mobile .btn-tv{padding:12px 18px;font-size:15px;border-width:2px}'
        + 'body.zx-ff-mobile .btn-tv .btn-icon svg{width:18px;height:18px}'
        + 'body.zx-ff-mobile .detail-seasons{padding:18px 22px 34px}'
        + 'body.zx-ff-mobile .detail-seasons h2{font-size:22px;margin-bottom:14px}'
        + 'body.zx-ff-mobile .season-pill{font-size:15px;padding:10px 18px;margin-right:10px}'
        + 'body.zx-ff-mobile .episode-tile{width:170px;margin-right:12px}'
        + 'body.zx-ff-mobile .episode-tile .ep-label{font-size:13px;margin-top:7px}'
        + 'body.zx-ff-mobile .episode-tile .ep-img .ep-fallback{font-size:24px}'
        + 'body.zx-ff-tv .tile-icon svg{width:40px;height:40px}'
        + 'body.zx-ff-tv .home-tile{padding-top:20px;padding-bottom:20px;padding-left:5px;padding-right:5px}'
        + 'body.zx-ff-tv .home-tile span{font-size:12px}'
        + 'body.zx-ff-tv .zh-tbtn{height:34px;padding-top:0;padding-bottom:0}'
        + 'body.zx-ff-tv .zh-tile{padding-top:20px;padding-bottom:20px}'
        + 'body.zx-ff-tv .zh-navtop .zh-tile{min-height:148px !important;height:148px !important;padding-top:18px !important;padding-bottom:18px !important;overflow:visible !important;justify-content:center !important;}'
        + 'body.zx-ff-tv .zh-navtop .zh-ico{width:3.8vw !important;height:3.8vw !important;min-width:42px !important;min-height:42px !important;}'
        + 'body.zx-ff-tv .zh-navtop .zh-ico svg{width:3.7vw !important;height:3.7vw !important;min-width:40px !important;min-height:40px !important;}'
        + 'body.zx-ff-tv .zh-navtop .zh-tl{font-size:18px !important;line-height:1.15 !important;white-space:nowrap !important;}'
        + 'body.zx-ff-tv .zh-navtop .zh-tsub{font-size:13px !important;line-height:1.15 !important;margin-top:5px !important;white-space:nowrap !important;}'
        + 'body.zx-ff-tv .zh-stile{padding-top:9px;padding-bottom:9px;min-height:64px}'
        + 'body.zx-ff-tv .opt-btn,body.zx-ff-tv .action-btn,body.zx-ff-tv .theme-btn{padding-top:12px;padding-bottom:12px;min-height:58px}'
        + 'body.zx-ff-tv .home-logo{transform:scale(.72);transform-origin:center}'
        + 'body.zx-ff-tv .poster-tile-tv .pt-title,body.zx-ff-tv .poster-tile-tv .pt-name{font-size:11px;line-height:1.1}'
        + 'body.zx-ff-tv .channel-tile-tv .ch-name{font-size:14px}'
        + 'body.zx-ff-tv .channel-tile-tv .ct-logo.is-loaded .ct-fallback,body.ui-tv .channel-tile-tv .ct-logo.is-loaded .ct-fallback{display:none !important;}'
        + 'body.zx-ff-tv .detail-hero .dh-content{padding:20px 12px 8px;max-width:760px}'
        + 'body.zx-ff-tv .detail-hero h1{font-size:20px;margin-bottom:6px}'
        + 'body.zx-ff-tv .detail-hero .dh-badge{font-size:11px;padding:3px 7px}'
        + 'body.zx-ff-tv .detail-hero .dh-genre{font-size:11px}'
        + 'body.zx-ff-tv .detail-hero .dh-plot{font-size:11px;line-height:1.25;margin-bottom:10px;max-width:680px}'
        + 'body.zx-ff-tv .detail-hero .dh-back{font-size:11px;padding-top:7px;padding-bottom:7px;padding-left:10px;padding-right:10px}'
        + 'body.zx-ff-tv .btn-tv{padding-top:12px;padding-bottom:12px;padding-left:12px;padding-right:12px;font-size:12px;border-width:1px}'
        + 'body.zx-ff-tv .btn-tv .btn-icon svg{width:14px;height:14px}'
        + 'body.zx-ff-tv .detail-seasons{padding:12px 12px 24px}'
        + 'body.zx-ff-tv .detail-seasons h2{font-size:16px;margin-bottom:8px}'
        + 'body.zx-ff-tv .season-pill{font-size:11px;padding-top:10px;padding-bottom:10px;padding-left:12px;padding-right:12px;margin-right:6px}'
        + 'body.zx-ff-tv .episode-tile{width:120px;margin-right:8px}'
        + 'body.zx-ff-tv .episode-tile .ep-label{font-size:10px;margin-top:4px}'
        + 'body.zx-ff-tv .episode-tile .ep-img .ep-fallback{font-size:18px}'
        + 'body.zx-ff-tv .zh-navtop .zh-tile,body.zx-ff-tv .zh-navbot .zh-tile{min-height:164px !important;height:164px !important;}'
        + 'body.zx-ff-tv .zh-navtop .zh-tile .zh-tl,body.zx-ff-tv .zh-navbot .zh-tile .zh-tl{font-size:18px !important;}'
        + 'body.zx-ff-tv .zh-navtop .zh-tile .zh-tsub,body.zx-ff-tv .zh-navbot .zh-tile .zh-tsub{font-size:13px !important;}'
        + 'body.zx-ff-tv .poster-grid-tv{gap:12px !important;}'
        + 'body.zx-ff-tv .poster-tile-tv{min-height:210px !important;}'
        /* TV Box Home: blocos grandes e rolagem vertical, sem sobrepor ícones. */
        + 'body.zx-ff-tv .zx-home2{position:absolute !important;inset:0 !important;overflow-x:hidden !important;overflow-y:auto !important;-webkit-overflow-scrolling:touch;overscroll-behavior:contain;}'
        + 'body.zx-ff-tv .zx-home2 .zh-ui{position:relative !important;inset:auto !important;height:auto !important;min-height:100vh !important;overflow:visible !important;display:flex !important;flex-direction:column !important;padding:2.4vw 3vw 5vw !important;box-sizing:border-box !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-quickbar{display:grid !important;grid-template-columns:repeat(4,minmax(0,1fr)) !important;width:100% !important;gap:1vw !important;margin-top:1vw !important;flex:none !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-quickbar .zh-stile{height:6.2vw !important;min-height:70px !important;max-height:92px !important;padding:.7vw !important;border-radius:1vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-quickbar .zh-stile svg{width:2.5vw !important;height:2.5vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-quickbar .zh-stile b{font-size:1.25vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-quickbar .zh-ssub{font-size:.85vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-nav{display:grid !important;grid-template-columns:repeat(3,minmax(0,1fr)) !important;flex:none !important;width:100% !important;height:10.5vw !important;min-height:98px !important;max-height:132px !important;margin-top:1.1vw !important;gap:1vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-nav>.zh-tile{display:flex !important;flex:none !important;width:auto !important;max-width:none !important;height:100% !important;min-height:98px !important;max-height:132px !important;padding:1vw !important;border-radius:1.1vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-navr{display:contents !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-navtop{display:contents !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-navbot-placeholder{display:none !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-navtop .zh-tile,body.zx-ff-tv .zx-home2 .zh-navbot .zh-stile{display:flex !important;flex:none !important;width:auto !important;max-width:none !important;height:10.5vw !important;min-height:98px !important;max-height:132px !important;padding:1.2vw !important;border-radius:1.1vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-navtop .zh-ico,body.zx-ff-tv .zx-home2 .zh-navtop .zh-ico svg{width:4vw !important;height:4vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-nav>.zh-tile .zh-ico,body.zx-ff-tv .zx-home2 .zh-nav>.zh-tile .zh-ico svg{width:5vw !important;height:5vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-tl{font-size:1.65vw !important;line-height:1.12 !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-tsub{font-size:1.05vw !important;margin-top:.35vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-stile svg{width:3vw !important;height:3vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-stile b{font-size:1.45vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-ssub{font-size:1vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-recent{display:flex !important;flex:none !important;width:100% !important;max-width:none !important;overflow:visible !important;margin-top:1vw !important;gap:.45vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-recent .zh-posters{width:100% !important;max-width:none !important;overflow-x:auto !important;overflow-y:hidden !important;padding:1vw 0 1.3vw !important;gap:1.2vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-recent .zh-poster{display:flex !important;flex:0 0 23vw !important;width:23vw !important;min-width:23vw !important;height:9vw !important;min-height:82px !important;max-height:118px !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-h2{font-size:1.55vw !important;}'
        + 'body.zx-ff-tv .zx-home2 .zh-status{margin-top:1vw !important;flex:none !important;}' ;
}
function injectFfAskCss() {
    if ($('zx-ffa-css')) return;
    var st = document.createElement('style'); st.id = 'zx-ffa-css';
    st.textContent = '.zx-ff-ask{position:fixed;inset:0;z-index:9000;background:rgba(6,10,9,.96);display:-webkit-box;display:flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;padding:20px}'
        + '.zx-ffa-card{max-width:560px;width:100%;text-align:center}'
        + '.zx-ffa-logo{margin-bottom:14px;display:-webkit-box;display:flex;-webkit-box-pack:center;justify-content:center}'
        + '.zx-ffa-logo img,.zx-ffa-logo svg{max-height:54px}'
        + '.zx-ffa-title{font-size:22px;font-weight:800;color:#fff;margin-bottom:6px}'
        + '.zx-ffa-sub{font-size:14px;color:#9fb3ab;margin-bottom:22px}'
        + '.zx-ffa-opts{display:-webkit-box;display:flex;gap:14px;-webkit-box-pack:center;justify-content:center}'
        + '.zx-ffa-opt{-webkit-box-flex:1;flex:1;max-width:230px;background:#11201b;border:2px solid #1f3a30;border-radius:16px;padding:22px 14px;cursor:pointer;color:#fff;outline:none;-webkit-tap-highlight-color:transparent}'
        + '.zx-ffa-opt:focus,.zx-ffa-opt:hover{border-color:#10b981;background:#15291f;box-shadow:0 0 0 3px rgba(16,185,129,.55)}'
        + '.zx-ffa-emoji{font-size:42px;line-height:1;margin-bottom:10px}'
        + '.zx-ffa-opt-t{font-size:17px;font-weight:700;margin-bottom:4px}'
        + '.zx-ffa-opt-d{font-size:12px;color:#9fb3ab}'
        + '.zx-ffa-note{margin-top:18px;font-size:12px;color:#6f827b}';
    (document.head || document.documentElement).appendChild(st);
}
/* ===== AVISO ANTI-PIRATARIA (1ª abertura, Android) — em INGLÊS, pros revisores =====
   Mostra UMA vez na 1ª abertura, ANTES de escolher Celular x TV. Reforça que o app é
   só um player (o usuário traz a própria lista) e que pirataria é crime. Persiste em
   'zx:piracy_ack'. SÓ Android (nativeAvail) — não toca web/Samsung/LG/PC. */
function piracyAck() { try { return localStorage.getItem('zx:piracy_ack') === '1'; } catch (e) { return false; } }
function injectPiracyCss() {
    injectFfAskCss();                       // reusa o overlay base (.zx-ff-ask/.zx-ffa-card/logo/title)
    if ($('zx-pir-css')) return;
    var st = document.createElement('style'); st.id = 'zx-pir-css';
    st.textContent = '.zx-pir-card{max-width:520px}'
        + '.zx-pir-body{text-align:left;font-size:14px;line-height:1.55;color:#c7d4cd;margin:14px 0 22px;max-height:50vh;overflow:auto}'
        + '.zx-pir-body p{margin:0 0 12px}'
        + '.zx-pir-body strong{color:#fff}'
        + '.zx-pir-ok{display:block;width:100%;background:#10b981;border:none;border-radius:14px;padding:16px;font-size:16px;font-weight:800;color:#04130d;cursor:pointer;outline:none;-webkit-tap-highlight-color:transparent}'
        + '.zx-pir-ok:focus,.zx-pir-ok:hover{background:#0fcf93;box-shadow:0 0 0 3px rgba(16,185,129,.4)}';
    (document.head || document.documentElement).appendChild(st);
}
function showPiracyNotice() {
    if ($('zx-pir-ask')) return;            // já está na tela
    injectPiracyCss();
    var ov = document.createElement('div'); ov.id = 'zx-pir-ask'; ov.className = 'zx-ff-ask tv-modal';
    try { document.body.classList.add('tv-modal-open'); } catch (e) {}   // PRENDE o foco no modal (setas não escapam pro fundo)
    ov.innerHTML = '<div class="zx-ffa-card zx-pir-card"><div class="zx-ffa-logo">' + brandLogoHtml() + '</div>'
        + '<div class="zx-ffa-title">' + te('Bem-vindo ao Fusion') + '</div>'
        + '<div class="zx-pir-body">'
        + '<p>' + t('<strong>O Fusion é apenas um reprodutor de mídia.</strong> Ele não fornece, hospeda, vende nem inclui canais, filmes, séries ou mídia de qualquer tipo.') + '</p>'
        + '<p>' + t('Para assistir, você adiciona <strong>a sua própria lista</strong> de um provedor que você já tem. Você é o único responsável pelas listas e fontes que adicionar.') + '</p>'
        + '<p>' + t('<strong>Pirataria é crime.</strong> Não use o Fusion para acessar conteúdo que você não está autorizado a ver.') + '</p>'
        + '</div>'
        + '<button type="button" class="zx-pir-ok" id="zxPirOk" data-modal-ok>' + te('Entendi e concordo') + '</button></div>';
    document.body.appendChild(ov);
    var ok = $('zxPirOk');
    ok.addEventListener('click', function () {
        try { localStorage.setItem('zx:piracy_ack', '1'); } catch (e) {}
        try { document.body.classList.remove('tv-modal-open'); } catch (e) {}
        try { ov.parentNode.removeChild(ov); } catch (e) {}
        maybeAskFormFactor();               // só então pergunta Celular x TV (re-arma o tv-modal-open)
        // Se a escolha de tela NÃO abriu (já escolhida), ninguém re-renderiza a home → devolve o foco aqui.
        if (!document.querySelector('.zx-ff-ask') && document.querySelector('.zx-home2')) focusHomeStart();
    });
    try { ok.focus(); } catch (e) {}
}
/* Orquestra a 1ª abertura no Android: 1º IDIOMA, depois aviso anti-pirataria
   (já no idioma escolhido), depois Celular x TV. */
function firstRunFlow() {
    if (!nativeAvail()) return;             // SÓ Android (igual maybeAskFormFactor)
    if (maybeAskLanguage()) return;         // 1º → escolher PT/EN (mostra e espera)
    if (!piracyAck()) { showPiracyNotice(); return; }   // 2º → aviso (no idioma escolhido)
    maybeAskFormFactor();                   // 3º → Celular x TV
    if (!getFormFactor()) return;           // esperando a escolha
    maybeProfIntro();                       // 4º → apresenta os PERFIS (1x)
}
/* Seletor de idioma na 1ª abertura (Android). Bilíngue (o usuário ainda não
   escolheu). Retorna true se MOSTROU o seletor (o fluxo espera a escolha). */
function maybeAskLanguage() {
    if (!nativeAvail()) return false;       // SÓ Android
    if (langChosen()) return false;         // já escolheu
    if ($('zx-lang-ask')) return true;      // já está na tela
    injectFfAskCss();
    var ov = document.createElement('div'); ov.id = 'zx-lang-ask'; ov.className = 'zx-ff-ask tv-modal';
    try { document.body.classList.add('tv-modal-open'); } catch (e) {}
    ov.innerHTML = '<div class="zx-ffa-card"><div class="zx-ffa-logo">' + brandLogoHtml() + '</div>'
        + '<div class="zx-ffa-title">Idioma / Language</div>'
        + '<div class="zx-ffa-sub">Escolha o idioma do app · Choose the app language</div>'
        + '<div class="zx-ffa-opts">'
        + '<button type="button" class="zx-ffa-opt" data-lang="pt"><div class="zx-ffa-emoji">🇧🇷</div><div class="zx-ffa-opt-t">Português</div><div class="zx-ffa-opt-d">Brasil</div></button>'
        + '<button type="button" class="zx-ffa-opt" data-lang="en"><div class="zx-ffa-emoji">🇺🇸</div><div class="zx-ffa-opt-t">English</div><div class="zx-ffa-opt-d">United States</div></button>'
        + '</div></div>';
    document.body.appendChild(ov);
    var btns = ov.querySelectorAll('.zx-ffa-opt');
    for (var i = 0; i < btns.length; i++) (function (b) {
        b.addEventListener('click', function () {
            setLang(b.getAttribute('data-lang'));
            try { document.body.classList.remove('tv-modal-open'); } catch (e) {}
            try { ov.parentNode.removeChild(ov); } catch (e) {}
            if (document.querySelector('.zx-home2') || document.querySelector('.home-screen')) renderHome();   // re-renderiza no idioma escolhido
            firstRunFlow();                 // segue o fluxo (pirataria → Celular/TV)
        });
    })(btns[i]);
    // Foco inicial SEMPRE no Português (pedido do Leonardo) — público principal é BR.
    // Re-afirma em 60/300/700ms: na ABERTURA o navegador processa autofocus e
    // afins DEPOIS do modal focar, e roubava a marcação (abria sem nada focado).
    (function (b) {
        if (!b) return;
        function f() { try { if (!ov.parentNode) return; if (ov.contains(document.activeElement)) return; b.focus(); } catch (e) {} }
        try { b.focus(); } catch (e) {}
        setTimeout(f, 60); setTimeout(f, 300); setTimeout(f, 700);
    })(btns[0]);
    return true;
}
/* Mostra o seletor na 1ª abertura (Android, sem escolha salva). Não dispensável
   sem escolher (precisa de uma das opções). Pré-foca pela detecção TV do nativo. */
function maybeAskFormFactor() {
    if (!nativeAvail()) return;            // SÓ Android
    if (getFormFactor()) return;           // já escolheu
    if ($('zx-ff-ask')) return;            // já está na tela
    injectFfAskCss();
    var ov = document.createElement('div'); ov.id = 'zx-ff-ask'; ov.className = 'zx-ff-ask tv-modal';
    try { document.body.classList.add('tv-modal-open'); } catch (e) {}   // PRENDE o foco no modal
    ov.innerHTML = '<div class="zx-ffa-card"><div class="zx-ffa-logo">' + brandLogoHtml() + '</div>'
        + '<div class="zx-ffa-title">' + te('Como você vai usar o Fusion?') + '</div>'
        + '<div class="zx-ffa-sub">' + te('Ajusta o tamanho dos posters e ícones pra sua tela.') + '</div>'
        + '<div class="zx-ffa-opts">'
        + '<button type="button" class="zx-ffa-opt" data-ff="mobile"><div class="zx-ffa-emoji">📱</div><div class="zx-ffa-opt-t">' + te('Celular') + '</div><div class="zx-ffa-opt-d">' + te('Posters menores, mais por linha') + '</div></button>'
        + '<button type="button" class="zx-ffa-opt" data-ff="tv"><div class="zx-ffa-emoji">📺</div><div class="zx-ffa-opt-t">' + te('TV / Caixa') + '</div><div class="zx-ffa-opt-d">' + te('Posters maiores (tela grande)') + '</div></button>'
        + '</div><div class="zx-ffa-note">' + te('Dá pra trocar depois em Configurações.') + '</div></div>';
    document.body.appendChild(ov);
    var btns = ov.querySelectorAll('.zx-ffa-opt');
    for (var i = 0; i < btns.length; i++) (function (b) {
        b.addEventListener('click', function () {
            try { localStorage.setItem('zx:ff', b.getAttribute('data-ff')); } catch (e) {}
            try { document.body.classList.remove('tv-modal-open'); } catch (e) {}
            try { ov.parentNode.removeChild(ov); } catch (e) {}
            applyFormFactor();
            // Re-renderiza a home (nova .zx-home2 OU antiga .home-screen): reflete o
            // encolhimento E devolve o foco pro "TV ao Vivo" (focusHomeStart).
            if (document.querySelector('.zx-home2') || document.querySelector('.home-screen')) renderHome();
        });
    })(btns[i]);
    var prefTv = false; try { prefTv = !!(global.HdxNative && global.HdxNative.isTv && global.HdxNative.isTv()); } catch (e) {}
    (function (b) { if (!b) return; try { b.focus(); } catch (e) {} setTimeout(function () { try { b.focus(); } catch (e) {} }, 40); })(prefTv ? btns[1] : btns[0]);
}

/* ============================================================
   PERFIS LOCAIS (máx 4) — mesmo desenho do iOS/Roku.
   Dados por PESSOA (favoritos/continuar/progresso/recentes) ganham um
   prefixo por perfil dentro do lsGet/lsSet (profKey). O perfil 1 usa
   prefixo "" de propósito: herda o que o aparelho JÁ tinha (migração
   invisível). Lista/idioma/licença continuam globais.
   ============================================================ */
function profAll() {
    var a = null;
    try { a = JSON.parse(localStorage.getItem('zx_profiles') || 'null'); } catch (e) {}
    if (!a || !a.length) {
        a = [{ n: '', a: 0, ns: '', kids: false }];   // sem nome: profName() resolve no idioma ATUAL
        profSave(a);
    }
    return a;
}
function profSave(a) { try { localStorage.setItem('zx_profiles', JSON.stringify(a)); } catch (e) {} }
function profActiveIdx() {
    var i = 0;
    try { i = parseInt(localStorage.getItem('zx_prof_active') || '0', 10) || 0; } catch (e) {}
    var n = profAll().length;
    if (i < 0 || i >= n) i = 0;
    return i;
}
function profActive() { return profAll()[profActiveIdx()]; }
function profName(p) { return (p && p.n) ? p.n : (currentLang() === 'en' ? 'Profile 1' : 'Perfil 1'); }
function profSetActive(i) {
    try { localStorage.setItem('zx_prof_active', String(i)); } catch (e) {}
    S.profNs = profActive().ns;
}
function profTimeValue(v) { var s = String(v || '').trim(), m = s.match(/^(\d{1,2}):(\d{2})$/); if (!m) return ''; var h = Math.max(0, Math.min(23, parseInt(m[1], 10) || 0)), mm = Math.max(0, Math.min(59, parseInt(m[2], 10) || 0)); return p2(h) + ':' + p2(mm); }
function profScheduleAllowed(p) { if (!p || !p.kids) return true; var from = profTimeValue(p.from), to = profTimeValue(p.to); if (!from || !to || from === to) return true; var f = parseInt(from.slice(0, 2), 10) * 60 + parseInt(from.slice(3), 10), t = parseInt(to.slice(0, 2), 10) * 60 + parseInt(to.slice(3), 10), n = new Date(), now = n.getHours() * 60 + n.getMinutes(); return f < t ? (now >= f && now <= t) : (now >= f || now <= t); }
function showKidsScheduleModal() { if ($('zx-kids-schedule-modal') || !$('app')) return; var ov = document.createElement('div'); ov.id = 'zx-kids-schedule-modal'; ov.className = 'zx-ff-ask tv-modal'; ov.innerHTML = '<div class="zx-ffa-card" style="text-align:center"><div class="zx-ffa-title">Fora do horário permitido</div><div class="zx-ffa-sub">Este perfil infantil só pode usar o aplicativo dentro do horário definido pelo responsável.</div><button type="button" class="zx-pf-save" id="zxKidsScheduleOk">OK</button></div>'; document.body.appendChild(ov); var b = $('zxKidsScheduleOk'); if (b) b.addEventListener('click', function () { try { ov.parentNode.removeChild(ov); } catch (e) {} go('/home', true); }); try { b.focus(); } catch (e) {} }
function profCreate(name, av, kids, limit, from, to) {
    var a = profAll();
    if (a.length >= 4) return false;
    var seq = 2;
    try { seq = parseInt(localStorage.getItem('zx_prof_seq') || '2', 10) || 2; localStorage.setItem('zx_prof_seq', String(seq + 1)); } catch (e) {}
    a.push({ n: name, a: av, ns: 'p' + seq + '_', kids: !!kids, limit: kids ? Math.max(0, Math.min(480, parseInt(limit, 10) || 0)) : 0, from: kids ? profTimeValue(from) : '', to: kids ? profTimeValue(to) : '' });
    profSave(a);
    return true;
}
function profUpdate(i, name, av, kids, limit, from, to) { var a = profAll(); if (i < 0 || i >= a.length) return; a[i].n = name; a[i].a = av; a[i].kids = !!kids; a[i].limit = kids ? Math.max(0, Math.min(480, parseInt(limit, 10) || 0)) : 0; a[i].from = kids ? profTimeValue(from) : ''; a[i].to = kids ? profTimeValue(to) : ''; profSave(a); }
function profDelete(i) {
    var a = profAll();
    if (a.length <= 1 || i < 0 || i >= a.length) return;
    var actNs = profActive().ns;
    profWipeNs(a[i].ns);
    a.splice(i, 1);
    profSave(a);
    var ni = 0;
    for (var j = 0; j < a.length; j++) if (a[j].ns === actNs) ni = j;
    profSetActive(ni);
}
// nome-BASE (sem prefixo) é dado por pessoa?
function profIsPersonalKey(k) {
    return k === 'zx_fav' || k === 'zx_favdirty' || k === 'zx_favmeta' || k === 'zx_pending'
        || k === 'zx_recent_live' || k === 'zx_queue' || k.indexOf('zx_cont_') === 0 || k.indexOf('zx_prog:') === 0
        || k.indexOf('zx_slast_') === 0 || k.indexOf('zx_favlist_') === 0;
}
function profKey(k) {
    if (!S.profNs) return k;
    if (profIsPersonalKey(k)) return S.profNs + k;
    return k;
}
function profWipeNs(ns) {
    try {
        var kill = [], i, k;
        for (i = 0; i < localStorage.length; i++) {
            k = localStorage.key(i);
            if (!k) continue;
            if (ns === '') { if (profIsPersonalKey(k)) kill.push(k); }
            else if (k.indexOf(ns) === 0 && profIsPersonalKey(k.slice(ns.length))) kill.push(k);
        }
        for (i = 0; i < kill.length; i++) localStorage.removeItem(kill[i]);
    } catch (e) {}
}
// troca de perfil EM USO: re-aponta o storage e recarrega os espelhos
function profLimit(p) { return p && p.kids ? Math.max(0, parseInt(p.limit, 10) || 0) : 0; }
function profileUsageKey() { var p = profActive() || {}, day = new Date(), ds = day.getFullYear() + '-' + p2(day.getMonth() + 1) + '-' + p2(day.getDate()); return 'zx_prof_usage_' + String(p.ns || '') + ds; }
function profileUsageSeconds() { try { return Math.max(0, parseInt(localStorage.getItem(profileUsageKey()) || '0', 10) || 0); } catch (e) { return 0; } }
function showKidsLimitModal() {
    if ($('zx-kids-limit-modal')) return;
    var ov = document.createElement('div'); ov.id = 'zx-kids-limit-modal'; ov.className = 'zx-ff-ask tv-modal'; ov.innerHTML = '<div class="zx-ffa-card" style="text-align:center"><div class="zx-ffa-title">Tempo de hoje concluído</div><div class="zx-ffa-sub">O limite diário deste perfil infantil foi atingido. Volte amanhã ou peça ao responsável para ajustar o limite.</div><button type="button" class="zx-pf-save" id="zxKidsLimitOk">OK</button></div>'; document.body.appendChild(ov); var b = $('zxKidsLimitOk'); if (b) b.addEventListener('click', function () { try { ov.parentNode.removeChild(ov); } catch (e) {} go('/home', true); }); try { b.focus(); } catch (e) {}
}
function profileUsageTick() {
    var active = profActive(); if (!profScheduleAllowed(active)) { if (!global.__zxKidsScheduleShown) { global.__zxKidsScheduleShown = true; showKidsScheduleModal(); } return; }
    var lim = profLimit(active); if (!lim || document.hidden || !S.server) return;
    var next = profileUsageSeconds() + 60; try { localStorage.setItem(profileUsageKey(), String(next)); } catch (e) {}
    if (next >= lim * 60 && !global.__zxKidsLimitShown) { global.__zxKidsLimitShown = true; showKidsLimitModal(); }
}
function startProfileUsageWatch() { if (global.__zxProfileUsageWatch) return; global.__zxProfileUsageWatch = setInterval(profileUsageTick, 60000); }
function profApplyData() {
    global.__zxKidsLimitShown = false; global.__zxKidsScheduleShown = false;
    S.profNs = profActive().ns;
    S.cat = { movies: null, series: null, live: null };
    S.m3uCatalogPromise = null;
    S.xtreamUnavailable = false;
    S.fav = { live: [], movie: [], series: [] };
    S.favDirty = { live: [], movie: [], series: [] };
    S.favMeta = {};
    loadFav();
    if (!profScheduleAllowed(profActive())) setTimeout(showKidsScheduleModal, 180);
    try { if (typeof updateFavCounts === 'function') updateFavCounts(); } catch (e) {}
}
/* Encaixa o card do modal NA TELA: mede e aplica scale() — todo o conteúdo
   visível em QUALQUER tamanho de tela, sem rolagem (pedido do Leonardo). */
function profFitCard(ov) {
    try {
        var card = ov.querySelector('.zx-ffa-card');
        if (!card) return;
        if (ov.id === 'zx-prof-ed') { card.style.webkitTransform = ''; card.style.transform = ''; return; }
        card.style.webkitTransform = '';
        card.style.transform = '';
        var r = card.getBoundingClientRect();
        if (!r.height) return;
        var f = Math.min(1, (window.innerHeight - 20) / r.height, (window.innerWidth - 20) / r.width);
        if (f < 1) {
            card.style.webkitTransformOrigin = '50% 50%';
            card.style.transformOrigin = '50% 50%';
            card.style.webkitTransform = 'scale(' + f + ')';
            card.style.transform = 'scale(' + f + ')';
        }
    } catch (e) {}
}
function profBindFit(ov) {
    profFitCard(ov);
    try {
        var h = function () { if (ov.parentNode) profFitCard(ov); else window.removeEventListener('resize', h); };
        window.addEventListener('resize', h);
    } catch (e) {}
}
function profIntroSeen() { try { return localStorage.getItem('zx_prof_intro') === '1'; } catch (e) { return false; } }
function profIntroMark() { try { localStorage.setItem('zx_prof_intro', '1'); } catch (e) {} }

/* ---- 12 avatares ilustrados Fusion, quadrados e arredondados ---- */
var PROF_AVS = [
    'assets/profiles/avatar_01_cyber_hero.jpg',
    'assets/profiles/avatar_02_mage.jpg',
    'assets/profiles/avatar_03_guardian.jpg',
    'assets/profiles/avatar_04_fairy.jpg',
    'assets/profiles/avatar_05_ice_queen.jpg',
    'assets/profiles/avatar_06_warrior.jpg',
    'assets/profiles/avatar_07_little_dragon.jpg',
    'assets/profiles/avatar_08_pirate.jpg',
    'assets/profiles/avatar_09_neon_artist.jpg',
    'assets/profiles/avatar_10_cosmic_princess.jpg',
    'assets/profiles/avatar_11_android.jpg',
    'assets/profiles/avatar_12_music_star.jpg'
];
var PROF_KIDS = [
    'assets/profiles/kids_avatar_01_space_kid.jpg',
    'assets/profiles/kids_avatar_02_fairy_kid.jpg',
    'assets/profiles/kids_avatar_03_dragon_friend.jpg',
    'assets/profiles/kids_avatar_04_robot_kid.jpg',
    'assets/profiles/kids_avatar_05_pirate_kid.jpg'
];
function profAvatarHtml(i, size, kids) {
    var set = kids ? PROF_KIDS : PROF_AVS;
    var src = set[(i >= 0 && i < set.length) ? i : 0];
    return '<span class="zx-pf-av" style="width:' + size + 'px;height:' + size + 'px;background:#101a28">'
        + '<img src="' + src + '" alt="" draggable="false" style="width:100%;height:100%;object-fit:cover;display:block;border-radius:inherit">'
        + '</span>';
}
/* CSS das telas de perfil — TV-SAFE de propósito: sem gap/inset/clamp/aspect-ratio
   (WebView antigo, caso TV HQ). inline-block + margens no lugar de gap. */
function injectProfCss() {
    if ($('zx-prof-css')) return;
    var st = document.createElement('style'); st.id = 'zx-prof-css';
    st.textContent =
        '.zx-pf-av{display:-webkit-inline-box;display:inline-flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;border-radius:22%;overflow:hidden;vertical-align:middle;box-sizing:border-box;background:#101a28}'
        + '.zx-pf-av img{display:block;width:100%;height:100%;object-fit:cover;border-radius:inherit}'
        + '.zx-pf-av svg{display:block}'
        + '.zx-pf-cards{text-align:center;margin:6px 0 2px}'
        + '.zx-pf-card{display:inline-block;vertical-align:top;background:none;border:0;outline:none;cursor:pointer;margin:6px 12px;padding:6px;color:#fff;-webkit-tap-highlight-color:transparent}'
        + '.zx-pf-card .zx-pf-av{border:3px solid transparent;box-sizing:border-box}'
        + '.zx-pf-card:focus .zx-pf-av,.zx-pf-card:hover .zx-pf-av{border-color:#43e5f2;box-shadow:0 0 0 3px rgba(67,229,242,.28)}'
        + '.zx-pf-card .zx-pf-badge{background:#43e5f2}'
        + '.zx-pf-avwrap{position:relative;display:inline-block}'
        + '.zx-pf-badge{position:absolute;right:0;bottom:2px;width:26px;height:26px;border-radius:50%;background:#10b981;border:3px solid #0a0f0d;display:-webkit-box;display:flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;box-sizing:content-box}'
        + '.zx-pf-badge svg{width:15px;height:15px;display:block}'
        + '.zx-pf-name{display:block;margin-top:8px;font-size:15px;font-weight:700;color:#e7efe9;max-width:110px;overflow:hidden;text-overflow:ellipsis;white-space:nowrap}'
        + '.zx-pf-name.zx-pf-act{color:#10b981}'
        + '.zx-pf-plus{width:76px;height:76px;border-radius:50%;background:#11201b;border:2px solid #2a4438;display:-webkit-inline-box;display:inline-flex;-webkit-box-align:center;align-items:center;-webkit-box-pack:center;justify-content:center;color:#9fb3ab;font-size:34px;font-weight:300;box-sizing:border-box}'
        + '.zx-pf-card:focus .zx-pf-plus,.zx-pf-card:hover .zx-pf-plus{border-color:#10b981;box-shadow:0 0 0 3px rgba(16,185,129,.45)}'
        + '.zx-pf-pill{display:inline-block;background:#11201b;border:2px solid #1f3a30;border-radius:999px;color:#cfe0d8;padding:10px 26px;margin-top:16px;cursor:pointer;outline:none;font-size:14px;font-weight:700;-webkit-tap-highlight-color:transparent}'
        + '.zx-pf-pill:focus,.zx-pf-pill:hover{border-color:#10b981;color:#fff;box-shadow:0 0 0 3px rgba(16,185,129,.45)}'
        + '.zx-pf-input{display:block;width:86%;margin:0 auto 6px;box-sizing:border-box;padding:13px 16px;background:rgba(20,20,20,.85);border:2px solid #1f3a30;border-radius:12px;color:#f5f5f1;font-size:17px;text-align:center;outline:none}'
        + '.zx-pf-input:focus{border-color:#10b981}'
        + '.zx-pf-grid{display:grid;grid-template-columns:repeat(4,minmax(0,1fr));gap:15px 22px;text-align:center;margin:14px auto 8px;max-width:620px}'
        + '.zx-pf-gbtn{display:flex;align-items:center;justify-content:center;background:none;border:0;outline:none;cursor:pointer;margin:0;padding:2px;-webkit-tap-highlight-color:transparent}'
        + '.zx-pf-gbtn .zx-pf-av{border:3px solid transparent;box-sizing:border-box;border-radius:22%}'
        + '.zx-pf-gbtn:focus .zx-pf-av,.zx-pf-gbtn:hover .zx-pf-av{border-color:#43e5f2;box-shadow:0 0 0 3px rgba(67,229,242,.28)}'
        + '.zx-pf-gbtn.zx-pf-sel .zx-pf-av{border-color:#43e5f2;box-shadow:0 0 0 3px rgba(67,229,242,.32)}'
        + '.zx-pf-actions{text-align:center;margin-top:14px}'
        + '.zx-pf-save{display:inline-block;background:#10b981;color:#04231a;border:0;border-radius:12px;padding:13px 40px;font-size:16px;font-weight:800;cursor:pointer;outline:none;margin:0 8px;-webkit-tap-highlight-color:transparent}'
        + '.zx-pf-save:focus,.zx-pf-save:hover{box-shadow:0 0 0 3px #fff}'
        + '.zx-pf-del{display:inline-block;background:none;border:2px solid #3a2026;color:#ff8c95;border-radius:12px;padding:11px 22px;font-size:14px;font-weight:700;cursor:pointer;outline:none;margin:0 8px;-webkit-tap-highlight-color:transparent}'
        + '.zx-pf-del:focus,.zx-pf-del:hover{border-color:#ff8c95;box-shadow:0 0 0 3px rgba(255,140,149,.35)}'
        + '.zx-pf-fan{text-align:center;margin-bottom:10px}'
        + '.zx-pf-fan .zx-pf-av{margin:0 -7px;border:3px solid #060a09}'
        + '.zx-pf-blt{display:block;text-align:left;color:#e7efe9;font-size:14px;margin:7px auto;max-width:420px}'
        + '.zx-pf-blt b{color:#10b981;margin-right:8px}'
        + '#zx-prof-gate,#zx-prof-intro{overflow:hidden}'
        + '#zx-prof-ed{display:block!important;position:fixed!important;inset:0!important;width:100%!important;height:100%!important;transform:none!important;overflow-y:auto;overflow-x:hidden;padding:24px 12px 36px;box-sizing:border-box;align-items:flex-start;overscroll-behavior:contain}'
        + '#zx-prof-ed .zx-ffa-card{width:94vw;max-width:620px;min-width:0;margin:0 auto;background:#070d18;border:1px solid rgba(44,65,93,.52);border-radius:20px;padding:22px 20px 28px;box-sizing:border-box;transform:none!important}'
        + '#zx-prof-ed .zx-ffa-title{font-size:28px;font-weight:800;color:#f7fbff;margin:4px 0 18px}'
        + '#zx-prof-ed .zx-pf-prev .zx-pf-av{width:96px!important;height:96px!important;border-radius:22%;border:3px solid #43e5f2;box-shadow:0 0 0 4px rgba(67,229,242,.18)}'
        + '#zx-prof-ed .zx-pf-input{width:100%;background:#111827;border:1px solid #34445d;border-radius:12px;text-align:left;color:#f7fbff}'
        + '#zx-prof-ed .zx-ffa-sub{text-align:left;color:#d7e3f3;font-size:16px;font-weight:700;margin-top:18px!important}'
        + '#zx-prof-ed .zx-pf-grid .zx-pf-av{width:72px!important;height:72px!important}'
        + '#zx-prof-ed .zx-pf-save{background:#10c99a;color:#041c17;border-radius:12px;min-width:150px}'
        + '.zx-pf-kids{display:flex;align-items:center;justify-content:space-between;gap:14px;background:#202b42;border-radius:16px;padding:17px 18px;margin:0 0 18px;text-align:left}'
        + '.zx-pf-kids-title{color:#f1f6ff;font-size:18px;font-weight:800}'
        + '.zx-pf-kids-sub{color:#8491a8;font-size:13px;line-height:1.35;margin-top:5px}'
        + '.zx-pf-switch{position:relative;width:58px;height:32px;flex:0 0 58px;border:0;border-radius:999px;background:#111a2d;cursor:pointer;padding:0}'
        + '.zx-pf-switch:before{content:"";position:absolute;top:4px;left:4px;width:24px;height:24px;border-radius:50%;background:#78849a;transition:all .18s ease}'
        + '.zx-pf-switch.on{background:#43e5f2}.zx-pf-switch.on:before{left:30px;background:#05131b}'
        + '@media (max-width:600px) and (orientation:portrait){#zx-prof-ed{padding:16px 8px 28px}#zx-prof-ed .zx-ffa-card{width:100%;padding:18px 12px 26px;border-radius:18px}#zx-prof-ed .zx-ffa-title{font-size:24px}.zx-pf-grid{gap:14px 8px}.zx-pf-kids{padding:15px 14px}.zx-pf-kids-title{font-size:16px}.zx-pf-kids-sub{font-size:12px}.zx-pf-gbtn{min-height:76px}}';
    document.head.appendChild(st);
}
/* ---- "Quem está assistindo?" (boot com 2+ perfis / botão do avatar) ---- */
function showProfGate(reason) {
    if ($('zx-prof-gate')) return;
    injectFfAskCss(); injectProfCss();
    var edit = false;
    var ov = document.createElement('div'); ov.id = 'zx-prof-gate'; ov.className = 'zx-ff-ask tv-modal';
    try { document.body.classList.add('tv-modal-open'); } catch (e) {}
    document.body.appendChild(ov);
    function close(refresh) {
        try { document.body.classList.remove('tv-modal-open'); } catch (e) {}
        try { ov.parentNode.removeChild(ov); } catch (e) {}
        if (refresh) go('/home', true);
        else if (document.querySelector('.zx-home2')) focusHomeStart();
    }
    function paint() {
        var a = profAll(), act = profActiveIdx(), h, i;
        h = '<div class="zx-ffa-card"><div class="zx-ffa-logo">' + brandLogoHtml() + '</div>'
            + '<div class="zx-ffa-title">' + te(edit ? 'Escolha um perfil para editar' : 'Quem está assistindo?') + '</div>'
            + '<div class="zx-pf-cards">';
        for (i = 0; i < a.length; i++) {
            h += '<button type="button" class="zx-pf-card" data-i="' + i + '">'
                + '<span class="zx-pf-avwrap">' + profAvatarHtml(a[i].a, 84, !!a[i].kids)
                + (i === act ? '<span class="zx-pf-badge"><svg viewBox="0 0 24 24"><path d="M4.5 12.5l5 5L19.5 7.5" fill="none" stroke="#04231a" stroke-width="3.4" stroke-linecap="round" stroke-linejoin="round"></path></svg></span>' : '')
                + '</span>'
                + '<span class="zx-pf-name' + (i === act ? ' zx-pf-act' : '') + '">' + esc(profName(a[i])) + '</span></button>';
        }
        if (a.length < 4) {
            h += '<button type="button" class="zx-pf-card" data-i="novo"><span class="zx-pf-plus">+</span>'
                + '<span class="zx-pf-name" style="color:#9fb3ab">' + te('Novo perfil') + '</span></button>';
        }
        h += '</div><div><button type="button" class="zx-pf-pill" id="zxPfEdit">' + te(edit ? 'Concluído' : 'Editar perfis') + '</button></div></div>';
        ov.innerHTML = h;
        var cards = ov.querySelectorAll('.zx-pf-card');
        for (i = 0; i < cards.length; i++) (function (b) {
            b.addEventListener('click', function () {
                var di = b.getAttribute('data-i');
                if (di === 'novo') { showProfEditor(-1, function () { paint(); }); return; }
                var idx = parseInt(di, 10);
                if (edit) { showProfEditor(idx, function () { paint(); }); return; }
                profSetActive(idx);
                profApplyData();
                close(true);
            });
        })(cards[i]);
        var ed = $('zxPfEdit');
        if (ed) ed.addEventListener('click', function () { if (!edit) return parentPinGate(function () { edit = true; paint(); try { ov.querySelector('.zx-pf-card').focus(); } catch (e) {} }); edit = false; paint(); try { ov.querySelector('.zx-pf-card').focus(); } catch (e) {} });
        (function (b) {
            if (!b) return;
            function f() { try { if (!ov.parentNode) return; if (ov.contains(document.activeElement)) return; b.focus(); } catch (e) {} }
            try { b.focus(); } catch (e) {}
            setTimeout(f, 60); setTimeout(f, 300);
        })(cards[0]);
        profBindFit(ov);
    }
    // Voltar fecha o gate quando aberto pelo avatar (no boot fica — igual iOS o X)
    ov.addEventListener('keydown', function (e) {
        var k = e.key || '';
        if (k === 'Escape' || k === 'GoBack' || e.keyCode === 27 || e.keyCode === 10009 || e.keyCode === 461) {
            e.preventDefault(); e.stopPropagation(); close(false);
        }
    }, true);
    paint();
}
/* ---- Editor: nome + grade de avatares + apagar (nunca o último) ---- */
function showProfEditor(idx, onDone) {
    if ($('zx-prof-ed')) return;
    injectFfAskCss(); injectProfCss();
    var a = profAll();
    var nome = (idx >= 0) ? a[idx].n : '';
    var kids = (idx >= 0) ? !!a[idx].kids : false;
    var limit = (idx >= 0) ? Math.max(0, parseInt(a[idx].limit, 10) || 0) : 0;
    var from = (idx >= 0) ? profTimeValue(a[idx].from) : '', to = (idx >= 0) ? profTimeValue(a[idx].to) : '';
    var av = (idx >= 0) ? a[idx].a : (a.length % PROF_AVS.length);
    if (kids && av >= PROF_KIDS.length) av = 0;
    var armDel = false;
    var ov = document.createElement('div'); ov.id = 'zx-prof-ed'; ov.className = 'zx-ff-ask tv-modal';
    document.body.appendChild(ov);
    function close() {
        try { ov.parentNode.removeChild(ov); } catch (e) {}
        if (onDone) onDone();
    }
    function paint() {
        var canDel = (idx >= 0 && profAll().length > 1);
        var avatarSet = kids ? PROF_KIDS : PROF_AVS;
        var h = '<div class="zx-ffa-card"><div class="zx-ffa-title">' + te(idx < 0 ? 'Novo perfil' : 'Editar perfil') + '</div>'
            + '<div class="zx-pf-kids"><div><div class="zx-pf-kids-title">' + te('Perfil infantil') + '</div><div class="zx-pf-kids-sub">' + te('Sem canais e filmes adultos — nem com PIN, o conteúdo simplesmente não aparece') + '</div></div><button type="button" class="zx-pf-switch' + (kids ? ' on' : '') + '" id="zxPfKidsSwitch" aria-label="' + te('Perfil infantil') + '"></button></div>'
            + '<div id="zxPfLimitWrap" style="display:' + (kids ? 'block' : 'none') + ';margin:9px 0 8px"><label class="zx-ffa-sub" for="zxPfLimit">Limite diário do perfil infantil (minutos; 0 = sem limite)</label><input type="number" id="zxPfLimit" min="0" max="480" inputmode="numeric" value="' + attr(limit) + '" class="zx-pf-input" style="margin-top:6px"><label class="zx-ffa-sub" for="zxPfFrom" style="display:block;margin-top:10px">Horário permitido (opcional)</label><div style="display:flex;gap:8px;align-items:center;margin-top:6px"><input type="time" id="zxPfFrom" value="' + attr(from) + '" class="zx-pf-input"><span class="zx-ffa-sub">até</span><input type="time" id="zxPfTo" value="' + attr(to) + '" class="zx-pf-input"></div><div class="zx-pf-kids-sub" style="margin-top:5px">Deixe vazio para não limitar por horário. Pode atravessar a meia-noite.</div></div>'
            + '<div class="zx-pf-prev" id="zxPfPrev" style="text-align:center;margin:4px 0 10px">' + profAvatarHtml(av, 96, kids) + '</div>'
            + '<input type="text" class="zx-pf-input" id="zxPfName" maxlength="16" autocomplete="off" autocapitalize="words" spellcheck="false" placeholder="' + te('Nome do perfil') + '">'
            + '<div class="zx-ffa-sub" style="margin:8px 0 0">' + te('Escolha um avatar') + '</div>'
            + '<div class="zx-pf-grid">';
        for (var i = 0; i < avatarSet.length; i++) {
            h += '<button type="button" class="zx-pf-gbtn' + (i === av ? ' zx-pf-sel' : '') + '" data-av="' + i + '">' + profAvatarHtml(i, 72, kids) + '</button>';
        }
        h += '</div><div class="zx-pf-actions">'
            + '<button type="button" class="zx-pf-save" id="zxPfSave">' + te('Salvar') + '</button>'
            + (canDel ? '<button type="button" class="zx-pf-del" id="zxPfDel">' + te('Apagar perfil') + '</button>' : '')
            + '</div></div>';
        ov.innerHTML = h;
        var kidsBtn = $('zxPfKidsSwitch');
        if (kidsBtn) kidsBtn.addEventListener('click', function () { var flip = function () { var nameEl = $('zxPfName'); if (nameEl) nome = nameEl.value; var limitEl = $('zxPfLimit'); if (limitEl) limit = parseInt(limitEl.value, 10) || 0; var fromEl = $('zxPfFrom'), toEl = $('zxPfTo'); if (fromEl) from = profTimeValue(fromEl.value); if (toEl) to = profTimeValue(toEl.value); kids = !kids; if (kids && av >= PROF_KIDS.length) av = 0; paint(); var newName = $('zxPfName'); if (newName) { newName.value = nome; try { newName.focus(); } catch (e) {} } }; if (kids) parentPinGate(flip); else flip(); });
        var inp = $('zxPfName');
        if (inp) inp.value = nome;
        // escolher avatar: troca classes + preview EM-PLACE (o rebuild matava o
        // <input> — perdia o foco e "não dava mais pra digitar")
        var gb = ov.querySelectorAll('.zx-pf-gbtn');
        for (var g = 0; g < gb.length; g++) (function (b) {
            b.addEventListener('click', function () {
                av = parseInt(b.getAttribute('data-av'), 10) || 0;
                for (var j = 0; j < gb.length; j++) gb[j].className = 'zx-pf-gbtn' + (gb[j] === b ? ' zx-pf-sel' : '');
                var pv = $('zxPfPrev');
                if (pv) pv.innerHTML = profAvatarHtml(av, 96, kids);
                if (armDel) { armDel = false; var d0 = $('zxPfDel'); if (d0) d0.innerHTML = te('Apagar perfil'); }
            });
        })(gb[g]);
        var sv = $('zxPfSave');
        if (sv) sv.addEventListener('click', function () {
            var n = (inp ? inp.value : nome).replace(/^\s+|\s+$/g, '');
            if (!n) { try { inp.focus(); } catch (e) {} return; }
            if (n.length > 16) n = n.slice(0, 16);
            var limitEl = $('zxPfLimit'); if (limitEl) limit = parseInt(limitEl.value, 10) || 0;
            var fromEl = $('zxPfFrom'), toEl = $('zxPfTo'); if (fromEl) from = profTimeValue(fromEl.value); if (toEl) to = profTimeValue(toEl.value);
            if (from && !to || !from && to) { try { if (fromEl) fromEl.focus(); } catch (e) {} return; }
            if (idx >= 0) {
                profUpdate(idx, n, av, kids, limit, from, to);
                profApplyData();                       // pode ter editado o ativo
            } else {
                profCreate(n, av, kids, limit, from, to);
                profSetActive(profAll().length - 1);   // criar já entra no novo
                profApplyData();
            }
            close();
        });
        var dl = $('zxPfDel');
if (dl) dl.addEventListener('click', function () {
            if (!armDel) { armDel = true; dl.innerHTML = te('Aperte de novo para apagar'); return; }
            var erase = function () { profDelete(idx); profApplyData(); close(); };
            parentPinGate(erase);
        });
        (function (b) { if (!b) return; try { b.focus(); } catch (e) {} setTimeout(function () { try { if (ov.parentNode && !ov.contains(document.activeElement)) b.focus(); } catch (e) {} }, 60); })(inp);
        profBindFit(ov);
    }
    ov.addEventListener('keydown', function (e) {
        var k = e.key || '';
        if (k === 'Escape' || k === 'GoBack' || e.keyCode === 27 || e.keyCode === 10009 || e.keyCode === 461) {
            e.preventDefault(); e.stopPropagation(); close();
        }
    }, true);
    paint();
}
/* ---- Apresentação (1x): "Conheça os Perfis" ---- */
function maybeProfIntro() {
    if (profIntroSeen()) return;
    if (profAll().length >= 2) { profIntroMark(); return; }   // já conhece
    if ($('zx-prof-intro')) return;
    injectFfAskCss(); injectProfCss();
    var ov = document.createElement('div'); ov.id = 'zx-prof-intro'; ov.className = 'zx-ff-ask tv-modal';
    try { document.body.classList.add('tv-modal-open'); } catch (e) {}
    ov.innerHTML = '<div class="zx-ffa-card">'
        + '<div class="zx-pf-fan">' + profAvatarHtml(1, 44) + profAvatarHtml(4, 54) + profAvatarHtml(0, 68) + profAvatarHtml(5, 54) + profAvatarHtml(3, 44) + '</div>'
        + '<div class="zx-ffa-title">' + te('Conheça os Perfis') + '</div>'
        + '<div class="zx-ffa-sub">' + te('Agora cada pessoa da casa pode ter seu próprio espaço no app.') + '</div>'
        + '<div style="margin:10px 0 4px">'
        + '<span class="zx-pf-blt"><b>•</b>' + te('Até 4 perfis neste aparelho') + '</span>'
        + '<span class="zx-pf-blt"><b>•</b>' + te('Cada um com seus favoritos e seu Continuar Assistindo') + '</span>'
        + '<span class="zx-pf-blt"><b>•</b>' + te('Troque quando quiser no seu avatar, no alto da tela inicial') + '</span>'
        + '</div><div class="zx-pf-actions">'
        + '<button type="button" class="zx-pf-save" id="zxPfGo">' + te('Personalizar meu perfil') + '</button></div>'
        + '<div style="text-align:center"><button type="button" class="zx-pf-pill" id="zxPfSkip">' + te('Agora não') + '</button></div></div>';
    document.body.appendChild(ov);
    function done() {
        profIntroMark();
        try { document.body.classList.remove('tv-modal-open'); } catch (e) {}
        try { ov.parentNode.removeChild(ov); } catch (e) {}
        if (document.querySelector('.zx-home2')) go('/home', true);   // rodapé/avatar com o nome novo
    }
    var g = $('zxPfGo');
    if (g) g.addEventListener('click', function () {
        showProfEditor(0, function () { done(); });
    });
    var sk = $('zxPfSkip');
    if (sk) sk.addEventListener('click', done);
    profBindFit(ov);
    (function (b) { if (!b) return; try { b.focus(); } catch (e) {} setTimeout(function () { try { if (ov.parentNode && !ov.contains(document.activeElement)) b.focus(); } catch (e) {} }, 60); })(g);
}
/* Gate na ABERTURA (1x por sessão) quando há 2+ perfis — depois da 1ª
   configuração (idioma/pirataria/tela) estar completa. */
function maybeProfBootGate() {
    if (S._profGateShown) return;
    if (profAll().length < 2) return;
    S._profGateShown = true;
    showProfGate('boot');
}

/* CSS exclusivo do app ANDROID (nativeAvail) — NÃO toca web/Samsung/LG/PC.
   (1) não selecionar texto ao pressionar/segurar (o "marcar texto" que aparecia
   no touch/D-pad) — exceto nos campos de digitar. (2) a busca de canais virou
   <input> nativo (teclado do sistema) → estiliza como pílula (era branco sem estilo). */
function injectAndroidCss() {
    // ESTILO DA BUSCA — PC + Android (não Samsung): a busca de canais vira <input>
    // nativo nesses (teclado físico/IME) → estiliza como pílula, senão fica uma
    // CAIXA BRANCA sem estilo. (No Samsung/LG é vkb, não tem esse <input>.)
    if (!tizenAvail() && !$('zx-srch-css')) {
        var ss = document.createElement('style'); ss.id = 'zx-srch-css';
        ss.textContent =
            '.cat-sidebar input.vkb-native{display:block;width:100%;box-sizing:border-box;margin-bottom:10px;'
            + 'padding:18px 18px;background:rgba(20,20,20,0.85);border:2px solid transparent;border-radius:12px;'
            + 'color:#f5f5f1;font-size:18px;outline:none}'
            + '.cat-sidebar input.vkb-native:focus{border-color:#10b981;background:rgba(20,20,20,0.95)}'
            + 'body.zx-ff-mobile .cat-sidebar input.vkb-native{font-size:13px;padding:10px 12px}';
        (document.head || document.documentElement).appendChild(ss);
    }
    // SÓ Android (touch): não selecionar texto ao pressionar/segurar (exceto campos).
    if (nativeAvail() && !$('zx-android-css')) {
        var st = document.createElement('style'); st.id = 'zx-android-css';
        st.textContent =
            'body{-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;-webkit-touch-callout:none}'
            + 'input,textarea,[contenteditable]{-webkit-user-select:text;user-select:text}';
        (document.head || document.documentElement).appendChild(st);
    }
}

function openHomeAfterPreviewCatalog() {
    if (S._homeCatalogGate) return;
    if (!S.server && !S.playlistUrl) { go('/home', true); return; }
    S._homeCatalogGate = true;
    var kinds = ['movies', 'series', 'live'];
    Promise.all(kinds.map(function (kind) {
        return ensureCatalog(kind, false).catch(function () { return null; });
    })).then(function () {
        S._homeCatalogReady = true;
        go('/home', true);
    }).catch(function () {
        // Se uma fonte falhar, libera a Home com o que estiver disponível;
        // o catálogo integral continua sendo tentado ao entrar na seção.
        S._homeCatalogReady = false;
        go('/home', true);
    });
}
function boot() {
    applyAppTheme(appThemeId(), false);
    applyAccessibility();
    startAmbientWatch();
    S.directAuth = !!directModeStored();
    S.did = getDid();
    try { S.profNs = profActive().ns; } catch (e) { S.profNs = ''; }   // PERFIS: antes de qualquer leitura
    startProfileUsageWatch();
    patchHistory();
    installShim();
    installRouter();
    loadCss();
    applyFormFactor();   // aplica a escolha salva (alvo de poster + classe) ANTES de renderizar
    injectAndroidCss();  // CSS só-Android (não-seleção de texto + estilo da busca)
    loadFav();   // favoritos persistidos → UI correta na hora, mesmo offline
    startEpgAlarmWatcher();
    startBackgroundSync();   // cedo e SEMPRE: o timer/foco só agem depois de logado
                             // (bgRefresh checa S.code/S.server). Se ficasse no fim
                             // do boot, um login novo (sem creds salvas → renderLogin
                             // + return) nunca ligava o sync.
    var c = loadCreds();
    if (!(c && c.code && c.user && c.pass)) { renderMacActivation(); return; }
    S.code = c.code; S.user = c.user; S.pass = c.pass; S.playlistUrl = c.playlistUrl || ''; S.playlistType = c.playlistType || ''; S.listIndex = parseInt(c.listIndex || activeListIndex(), 10) || 0; S.directPlaylists = loadDirectPlaylists();
    startListNotificationWatcher();
    if (S.playlistUrl && (S.playlistType || '').indexOf('m3u') === 0) { try { S.xtreamDerived = playlistToXtream({ playlist_url: S.playlistUrl }, 'Lista ativa'); } catch (e) {} }

    var snap = loadSnap();
    if (snap && snapAgeDays(snap) <= snapMaxDays(snap)) {
        // ABRE NA HORA com o snapshot — funciona mesmo com a VPS fora.
        applyResolve(snap.d, true);
                openHomeAfterPreviewCatalog();
        refresh(snap);                               // re-verifica em segundo plano

    } else {
        // Primeiro acesso sem snapshot: se já existe uma playlist salva, libera a Home
        // imediatamente usando o servidor da própria URL e confirma a licença em segundo
        // plano. Assim a TV Box não fica parada esperando a VPS antes da primeira pintura.
        var eagerServer = '', eagerCreds = null;
        try {
            eagerCreds = playlistToXtream({ playlist_url: S.playlistUrl }, 'Lista ativa');
            eagerServer = eagerCreds ? eagerCreds.server : '';
            if (!eagerServer && S.playlistUrl) { var eu = new URL(S.playlistUrl); eagerServer = eu.protocol + '//' + eu.host; }
        } catch (e) {}
        var eagerHome = !!(S.directAuth && S.playlistUrl && eagerServer);
        if (eagerHome) {
            S.server = eagerServer; S.xtreamDerived = eagerCreds || S.xtreamDerived;
            applyResolve({ ok: true, dns: { base: eagerServer, name: '' }, license: { mac: S.user || '', exp_date: 0 } }, true);
            openHomeAfterPreviewCatalog();
        } else showLoading(true);
        api('resolve', '', 12000).then(function (d) {
            if (!eagerHome) showLoading(false);
            if (d && d.error === 'license') { if (applyPush(d)) return; if (!eagerHome) renderPaywall(d); return; }
            if (d && d.ok && d.dns && d.dns.base) { applyResolve(d, false); saveSnap(d); if (!eagerHome) openHomeAfterPreviewCatalog(); }
            else if (!eagerHome && snap) { applyResolve(snap.d, true); openHomeAfterPreviewCatalog(); }
            else if (!eagerHome) renderOfflineFirst();
        });
    }
    // MAC: atualiza a validade real do painel mesmo quando a Home abriu de um snapshot antigo.
    if (S.directAuth) {
        // Não competir com a primeira pintura: a validade/listas são sincronizadas
        // depois que a Home já está navegável na TV Box.
        var syncDelay = getFormFactor() === 'tv' ? 2500 : 250;
        setTimeout(function () { syncDirectListCache(function () { if (document.querySelector('.zx-home2')) renderHome(); syncActivePlaylistExpiryFromSource(); }); }, syncDelay);
    } else if (S.playlistUrl) {
        setTimeout(function () { syncActivePlaylistExpiryFromSource(); }, 600);
    }
}

/* ============================================================
 * SYNC EM SEGUNDO PLANO — re-verifica a VPS DE TEMPOS EM TEMPOS, não só no
 * boot. É o que faz uma TROCA DE DNS (migração em massa de uma operadora), um
 * VENCIMENTO de licença ou um AVISO novo chegarem mesmo com o app aberto por
 * horas/dias. Barato no servidor (o resolve não busca catálogo: ~KB por
 * device). Roda a cada 6h + quando a janela volta ao foco (trava de 15min pra
 * não repetir à toa). NÃO depende da VPS estar no ar: se cair, o bgRefresh
 * apenas não muda nada (o app segue no snapshot) e tenta de novo no próximo
 * ciclo. ⚠️ Esta é a peça de ENTREGA da futura função "migrar DNS" do painel.
 * ============================================================ */
function bgRefresh() {
    if (!S.code || !S.server) return;                 // só depois de logado
    var now = Date.now();
    if (now - (S._lastSync || 0) < 60000) return;     // no mínimo 1min entre execuções
    S._lastSync = now;
    try { refresh(loadSnap()); } catch (e) {}
}
function startBackgroundSync() {
    if (S._bgSync) return; S._bgSync = true;
    // Só o timer de 6h (+ a checagem que já roda no boot). SEM re-checar ao
    // voltar o foco pra janela (a pedido do usuário) → trocar de janela e
    // voltar NÃO dispara mais nada na VPS.
    try { setInterval(bgRefresh, 6 * 60 * 60 * 1000); } catch (e) {}   // a cada 6h
}
if (document.readyState === 'complete' || document.readyState === 'interactive') setTimeout(boot, 0);
else document.addEventListener('DOMContentLoaded', boot);

global.ZLocal = { go: go, S: S, boot: boot, refresh: refresh, renderPaywall: renderPaywall };
})(window);
