# UltraPlayer 4.19.0 — fundo do endpoint principal do painel

A versão 4.19.0 corrige a origem da imagem de fundo da tela principal. A autenticação do painel (`check_mac.php`) entrega a imagem selecionada no campo `bg_url`; o aplicativo agora copia esse valor para `branding.background_url` antes de renderizar a home.

O endpoint complementar `ultra-config` pode responder sem uma imagem. Quando isso ocorre, o aplicativo preserva o `background_url` recebido anteriormente, em vez de limpá-lo e deixar a home com a arte antiga. O código também aceita `background_url` ou `bg_url` do ultra-config quando esses campos estiverem presentes.

A home aplica a imagem no `#app-root` em tela inteira, com `cover`, centralização e sem repetição. O gradiente radial, a marca d’água e o banner duplicado permanecem desativados, de modo que a mesma imagem selecionada no painel possa aparecer na home e nas telas de Filmes e Séries.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.19.0`, versionCode `56`, build debug. SHA-256: `dcb9e0d8a14c2b191369803c0044e893a525df4200a58b497067b298b56ab4ba`.
