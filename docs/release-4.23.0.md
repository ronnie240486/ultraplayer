# UltraPlayer 4.23.0 — home com fundo global e cards separados

A versão 4.23.0 adiciona uma camada explícita `.zx-panel-wall` na tela principal. Essa camada recebe diretamente `S.branding.background_url`, que é preenchido exclusivamente por `ultra_background_url` da rota `ultra-config`. Ela ocupa toda a home com `background-size: cover`, posição central e sem repetição.

A home deixa de depender apenas do fundo do `#app-root`, evitando que os estilos internos escondam a imagem configurada no painel. Os elementos `.zx-home2`, `.zh-amb` e `.zh-wm` permanecem transparentes ou desativados para não cobrir o fundo atual.

A navegação principal foi reorganizada para telas horizontais: TV ao Vivo ocupa a coluna esquerda; Filmes e Séries ficam na primeira fileira da coluna direita; Favoritos e Playlist ficam em uma segunda fileira independente. Isso elimina a sobreposição visível entre os títulos, ícones e botões.

No Celular em retrato, o layout existente de duas colunas continua preservado. No Celular e na TV Box em paisagem, a grade horizontal usa alturas calculadas e sem elementos empilhados.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.23.0`, versionCode `60`, build debug. SHA-256: `19fd9d964aece5ac4f9e7818df1c3144e85afe00d35d7718097d4442a0a2ce7a`.
