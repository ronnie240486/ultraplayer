# Fusion 4.93.0 — transição instantânea mini/full

A transição entre mini player e tela cheia foi ajustada para alterar somente o tamanho e a posição do mesmo `FrameLayout`/`PlayerView`. Não há `setMediaItem`, `prepare`, `seekTo`, pause ou criação de outro ExoPlayer durante a transição.

O PlayerView mantém o último frame com `setKeepContentOnPlayerReset(true)` e é reanexado ao mesmo player somente se necessário. O retorno ao mini mantém `miniPayload`, URL, canal e posição.

Validação: `node --check` aprovado para arquivos WebView; `assembleRelease` com R8 aprovado.
