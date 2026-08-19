# Fusion 4.97.0 — catálogo completo e player único

Corrigida a corrida entre preview e carga integral. Quando a Home já iniciou uma promessa parcial, uma solicitação `forceFull=true` agora aguarda essa promessa e dispara uma nova consulta completa, em vez de reutilizar o resultado parcial. Isso impede que os contadores permaneçam presos em 360 filmes, 5 séries ou 360 canais.

A promoção do mini player foi tornada idempotente na ponte Android. Se a mesma URL já estiver no player nativo, uma nova chamada apenas promove o contêiner existente; não executa novo `setMediaItem`, `prepare`, `seekTo` nem cria outro `PlayerView` ou `ExoPlayer`. O projeto mantém uma única instância de cada um.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; o release Android com R8 foi compilado com sucesso.
