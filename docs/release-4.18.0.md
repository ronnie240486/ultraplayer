# UltraPlayer 4.18.0 — imagem do painel restaurada na home

A versão 4.18.0 corrige a tela principal para mostrar a mesma imagem escolhida no painel e usada como branding do aplicativo. A imagem é aplicada diretamente ao `#app-root`, que ocupa toda a janela, com `background-size: cover`, centralização e sem repetição.

A camada `.bg-diamonds` foi tornada transparente e a home deixou de exibir o gradiente radial próprio e a marca d’água `ULTRA` (`.zh-amb` e `.zh-wm`). Dessa forma, a arte antiga embutida não aparece mais por trás da imagem do painel. Os cards e textos da home continuam sobrepostos à imagem configurada.

A fonte do fundo permanece o campo `background_url` retornado pelo endpoint de branding do painel, sem fallback para `bg_url`, `background` ou `banner_url`. Logo, ícones, catálogo, player e demais telas permanecem inalterados.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.18.0`, versionCode `55`, build debug. SHA-256: `f496958b82f8b0a900f2f40cc54d2c9853a26c843f54a2fbbf8c4fd4928f8b60`.
