# UltraPlayer 3.4.0 — layout de canais baseado na referência

A tela de Canais passou a aplicar o layout por JavaScript usando a largura e a orientação reais do WebView, além do CSS. No modo TV Box em paisagem, a coluna de categorias é limitada a 16% da tela, a lista central ocupa o espaço restante e uma coluna direita de 38% fica reservada ao player e ao EPG.

O player nativo é redimensionado pelo `live-video-slot` e recebe atualizações depois da renderização e durante a rotação da tela. Em retrato, o player ocupa um bloco vertical próprio, antes da programação, sem sobrepor os canais.

O EPG fica visível e rolável na coluna direita em TV Box e abaixo do player no modo celular.

A API `ultra-config` continua sendo a fonte do fundo remoto. Na validação do MAC usado no teste, a resposta foi `registered: true` com a mensagem `Este MAC não está vinculado ao Ultra Player`, sem `background_url`. Enquanto o vínculo do MAC não for criado no painel, o APK usa o fundo local; após o vínculo, a imagem remota será aplicada também na tela de Canais.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `3.4.0`, versionCode `25` e build debug.
