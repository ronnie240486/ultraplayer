# UltraPlayer 1.5.0 — catálogo separado e player Media3

## Alterações

A versão 1.5.0 classifica entradas da M3U pelo `group-title`, nome e URL. Grupos que indicam filmes ou VOD entram em **Filmes**; grupos que indicam séries, novelas, temporadas, episódios ou anime entram em **Séries**; os demais entram em **Canais**. Cada seção usa os próprios itens e categorias, em vez de exibir toda a lista em TV ao vivo.

Filmes e séries M3U possuem uma tela de detalhe simples com capa, título e botão **Reproduzir**. A reprodução usa o `stream_url` original da entrada M3U; não depende de `player_api.php` nem de detalhes Xtream que não existem em uma lista M3U simples.

O `VideoView` leve foi substituído por **Media3/ExoPlayer**, com suporte a HLS, MPEG-TS, redirecionamento HTTP/HTTPS, controles nativos, tela cheia, rotação por sensor e mensagens de erro visíveis. Isso corrige o caso em que o áudio iniciava, mas o vídeo permanecia preto por falta de um pipeline de vídeo adequado.

O layout em retrato para telas de até 600 pixels foi compactado: a home usa grade de duas colunas, ícones menores e cards de 92 pixels; a listagem usa cards mais estreitos e até três pôsteres por linha. A regra não se aplica ao layout de TV em paisagem.

## Build

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `1.5.0`, versionCode `6` e `minSdk 21`. O tamanho é maior que a casca WebView anterior porque o Media3/ExoPlayer e os decodificadores de reprodução agora estão empacotados no aplicativo.

O artefato entregue é `UltraPlayer-1.5.0-exoplayer-m3u-debug.apk`. É uma build debug para teste e ainda não é uma assinatura de produção.
