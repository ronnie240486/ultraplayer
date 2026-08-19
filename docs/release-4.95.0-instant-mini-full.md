# Fusion 4.95.0 — abertura instantânea do mini player

Corrigido o segundo OK/toque no mesmo canal na tela de Canais. Quando o canal já está tocando no mini player, o segundo comando chama somente `HdxNative.miniFullscreen()`.

A correção não chama `miniStop()`, não chama `miniPlay()` novamente, não chama `playViaNative()`, não altera a URL e não executa novo `setMediaItem`, `prepare` ou `seekTo`. O mesmo ExoPlayer continua ligado ao mesmo PlayerView e apenas o contêiner é promovido para tela cheia.

A ponte nativa já valida que o mini player está visível antes de promover a instância. O retorno para o mini continua preservando canal, estado e posição.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
