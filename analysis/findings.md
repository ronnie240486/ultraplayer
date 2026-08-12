# Achados da inspeção estática

## Identidade do pacote

O contêiner recebido (`ZuxoPlayer3.0.4.apk+`) contém um `base.apk` e splits de idioma/densidade. O SHA-256 do contêiner é `59cd312d3a7168c66307ddc2728cba36a2bb0453801f85b904ae4f605f1f3a13`. O APK principal declara pacote `com.zuxoplayer.app`, nome `Zuxo Player`, versão `3.0.4`, versionCode `25`, minSdk `21` e targetSdk `36`.

## Componentes e permissões

As atividades próprias são `MainActivity` e `PlayerActivity`; há integração com Google Cast e componentes de verificação de licença (`com.pairip.licensecheck`). As permissões principais são INTERNET, ACCESS_NETWORK_STATE, FOREGROUND_SERVICE e a permissão de licença do Google Play.

## Arquitetura recuperada

A MainActivity cria um WebView, habilita JavaScript e DOM storage, registra duas pontes JavaScript (`Android` e `HdxNative`), carrega `file:///android_asset/webui/index.html`, monitora conectividade e encaminha ações de reprodução para a PlayerActivity. A interface e a maior parte da lógica de catálogo ficam nos assets web embutidos.

A PlayerActivity usa Media3/ExoPlayer para reprodução nativa, suporta vídeo ao vivo e VOD, Picture-in-Picture, controles de volume/busca e fallback para um player alternativo quando configurado.

Os assets web incluem `index.html`, `zlocal.js`, `tv.js`, `category_browser.js`, `keyboard.js`, `player_touch.js`, `hdx-cache.js` e `hls.min.js`. O `zlocal.js` informa que o catálogo IPTV é obtido diretamente de uma API Xtream (`player_api.php`) e que o painel remoto era `https://tv.zuxoplayer.com`, usado por endpoints `/api/r/*` para login, licença, favoritos, progresso, branding e sincronização. Também há referências a `https://zuxoplayer.com/renovar`.

A interface já contém telas de login, perfis, TV ao vivo, filmes, séries, listas, busca, configurações, favoritos, continuar assistindo, EPG, PIN de conteúdo adulto, cache local, modo celular/TV, internacionalização PT/EN e marcação de progresso. O branding usa cor de destaque e imagem de logo configuráveis no painel; o CSS embutido está fortemente otimizado para navegação por controle remoto e WebViews/TVs antigas.

## Limitações para a reconstrução

O APK não contém o projeto original nem os arquivos Gradle fonte. A descompilação recuperou 2.487 arquivos Java, mas bibliotecas de terceiros e classes ofuscadas foram misturadas ao código próprio. A base a ser publicada deve ser tratada como uma reconstrução/port, não como o projeto original compilável. O código de licença, Cast, Media3 e demais bibliotecas de terceiros precisa permanecer separado e ser revisado quanto a licenças antes de redistribuição.

## Próxima etapa

Organizar um repositório de engenharia com APK original como artefato de referência, assets web recuperados, classes próprias descompiladas, relatório de arquitetura, inventário de dependências e um plano de melhorias para transformar a base em um projeto Android reproduzível.
