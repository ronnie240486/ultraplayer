# UltraPlayer 4.14.0 — fundo único na tela principal

A versão 4.14.0 corrige especificamente a duplicação visual da **tela principal**. A imagem enviada pelo painel não é mais renderizada como um banner dentro da home. Ela é usada exclusivamente na camada global de fundo, cobrindo toda a tela com `background-size: cover`, centralização e sem repetição.

A função `homeRemoteBannerHtml` deixou de inserir a imagem de `banner_url`. Quando houver apenas `banner_url` no retorno do painel, esse campo passa a servir como fallback do fundo global. Textos de anúncio continuam podendo aparecer como texto, mas a mesma imagem não é desenhada novamente atrás dos cards.

A imagem padrão/gradiente do APK permanece removida. A home principal fica transparente sobre o fundo global, incluindo cabeçalho, cards de TV ao vivo, filmes, séries, favoritos, playlist, recentes e rodapé. O restante do aplicativo não teve a navegação ou o player alterados.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.14.0`, versionCode `51`, build debug. SHA-256: `7d30a99da8bd7561bb002976925d7c01cd9d59e0cb686003a639bae13a5b718d`.
