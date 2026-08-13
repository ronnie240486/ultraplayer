# UltraPlayer 3.2.0 — TV Box ancorada e fundo remoto

O mini player Android deixou de usar uma posição absoluta fixa no canto. O WebView agora envia as coordenadas reais de `#live-video-slot`, e a casca nativa posiciona o vídeo exatamente dentro desse espaço. No modo TV Box, o layout reserva uma coluna direita fixa: vídeo em cima e EPG rolável abaixo.

As categorias foram compactadas para aumentar a área útil da lista central. O EPG não usa mais `overflow:hidden` no modo TV Box; o painel e a lista de programas têm rolagem interna própria.

O fundo remoto passou a ser aplicado a `.zx-home2`, `.home-screen` e `.sidebar-screen`, com `!important`, cobrindo também a tela de canais. A aplicação aceita `background_url`, `background` e `wallpaper_url`.

Durante a validação do endpoint para o MAC de teste, a API respondeu `registered: true` com a mensagem de que o MAC não estava vinculado ao Ultra Player. Portanto, para o fundo, logo, banner e ícones remotos aparecerem, o MAC precisa estar vinculado à configuração do aplicativo Ultra Player no painel. O APK mantém os fallbacks locais quando o painel não retornar URLs.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `3.2.0`, versionCode `23` e build debug.
