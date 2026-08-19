# Fusion 4.84.0 — Home imediatamente navegável

## Problema corrigido

A Home ainda aguardava trabalho de catálogo no mesmo WebView que processa as teclas do controle remoto. Mesmo com parsing em lotes, a tela podia ficar sem resposta enquanto a lista M3U era baixada, decodificada e classificada.

## Solução

A Home agora tem três caminhos separados:

1. **Primeira pintura:** HTML, blocos de navegação, foco TV ao Vivo e atalhos aparecem sem chamar o catálogo completo.
2. **Snapshot:** se houver cache ou se o provedor for Xtream, a Home usa uma fotografia parcial para preencher Filmes em destaque e Para você.
3. **Prévia M3U nativa:** em uma playlist M3U sem derivação Xtream, uma thread Android lê a lista fora do WebView e devolve somente até 80 itens de cada tipo (live, movies e series). Isso evita enviar o arquivo inteiro para `evaluateJavascript` e evita que a UI fique presa ao parsing inicial.

O catálogo completo só é exigido por ação do usuário: abrir Canais, Filmes ou Séries, buscar por nome, busca por voz, UltraSession ou recomendações de detalhes. A navegação da Home não espera a carga integral.

## Preservação

As regras de `group-title`, `tvg-logo`, `tvg-name`, classificação de canais/filmes/séries, filtro infantil e URLs de reprodução foram preservadas. O player, EPG, TMDB, layouts Celular/TV Box e fundo Fusion não foram alterados além do desacoplamento do carregamento.

## Validação

- `node --check` aprovado para `zlocal.js` e `tv.js`.
- `assembleRelease` com R8 aprovado.
- APK: 10.307.723 bytes.
- SHA-256: `4d15259f6827445b597e762ed0a1a6413a65595e09fb1945d28bea6d7538f9b4`.

A primeira abertura ainda precisa de rede para obter uma prévia se não houver cache, mas o controle remoto fica livre imediatamente; o catálogo integral acontece somente quando solicitado.
