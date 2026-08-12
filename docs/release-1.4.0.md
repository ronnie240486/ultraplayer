# UltraPlayer 1.4.0 — correção de carregamento M3U

## Causa identificada

O endpoint `GET /api/v5/check_mac.php` respondeu corretamente para o dispositivo `4A:6E:2C:8D:30:79`, com `success: true`, `registered: true` e uma playlist do tipo `m3u_plus`. O item retornado usava os campos `playlist_name`/`name` e `playlist_url`/`url`, com URL no formato `http://epics.zip/get.php?...&type=m3u_plus&output=mpegts`.

A versão anterior convertia a URL para um servidor Xtream e tentava carregar categorias por `player_api.php`. Isso não era suficiente para uma lista M3U e fazia o aplicativo reconhecer o MAC, mas não montar o catálogo.

## Correção

A versão 1.4.0 persiste a `playlist_url` e o tipo da lista, baixa a M3U por uma ponte nativa Android sem depender do CORS do WebView, interpreta `#EXTINF`, cria categorias pelo campo `group-title`, exibe os canais na seção de TV ao vivo e reproduz cada item usando o `stream_url` direto da M3U.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `1.4.0`, versionCode `5` e `minSdk 21`. A validação local confirmou sintaxe JavaScript, compilação Java, manifest, presença de onze assets WebView e ausência de referências antigas de branding dentro do código empacotado.

O endereço do servidor de mídia continua sendo o fornecido pelo painel. Se o próprio provedor bloquear o endereço ou exigir uma rede específica, isso precisa ser resolvido no provedor; o aplicativo agora, porém, consome corretamente o formato M3U retornado pelo painel.
