# UltraPlayer 4.15.0 — TV Box, controle remoto e voz

A versão 4.15.0 ajusta a tela de canais para o modo **TV Box**. As categorias da barra lateral, incluindo Telecine, Filmes, Variedades, Globo, SBT e demais grupos do catálogo, receberam maior altura vertical e área de toque, sem ampliar a largura da coluna. O texto continua legível e cada categoria permanece rolável dentro da lateral.

A navegação por controle remoto foi reforçada. Ao abrir o player grande, o foco começa no botão de menu no topo; os controles de menu, ajuste, zoom e restauração podem ser alcançados pelo D-pad. Ao abrir o menu de canais, o foco vai automaticamente para a primeira categoria horizontal. Na tela ao vivo, `ArrowRight` leva da categoria ao primeiro canal e `ArrowLeft` retorna do canal para a categoria ativa. O foco usa `scroll-margin` para permanecer visível ao rolar a lateral.

A MainActivity também reconhece teclas de controle associadas a voz, incluindo `KEYCODE_VOICE_ASSIST`, `KEYCODE_ASSIST` e `KEYCODE_SEARCH`, encaminhando-as ao reconhecimento de voz em português do UltraPlayer. Isso permite usar o botão de microfone de controles Android/Google TV compatíveis.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.15.0`, versionCode `52`, build debug. SHA-256: `8db776f274047f28045a6ab52ec5da421a940a4ede6eea157ab4748e73a0ef9d`.
