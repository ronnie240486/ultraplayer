# UltraPlayer 4.22.0 — limpeza de imagem antiga e fundo global atualizado

A versão 4.22.0 remove a configuração visual antiga armazenada em `localStorage` e deixa de usar qualquer fallback de branding cacheado quando a rota `ultra-config` falha. A cada abertura do aplicativo, a configuração é solicitada com `cache: no-store` e cabeçalhos `Cache-Control: no-cache` e `Pragma: no-cache`.

O fundo vem exclusivamente de `ultra_background_url` retornado por `GET /api/v5/ultra-config?mac={MAC}`. A URL atual é aplicada ao `#app-root` com cobertura integral e sem repetição. Contêineres da home, canais, filmes, séries, busca, rádios, detalhes e configurações ficam transparentes para que não apareça a arte antiga de outro aplicativo.

A resposta vazia ou indisponível da rota não reaplica uma imagem antiga. O APK permanece separado do OuroPro e não usa `check_mac.php`, `bg_url` ou outros campos genéricos para branding visual.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.22.0`, versionCode `59`, build debug. SHA-256: `327606f3d9cddb409995566a1d2c837c3bda3b7ca43830c1e41e0ed3b1569be2`.
