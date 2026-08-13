# UltraPlayer 3.5.0 — modo TV horizontal obrigatório

A aplicação agora bloqueia a orientação em paisagem no Android para `MainActivity` e `PlayerActivity`. O APK não alterna mais para vertical durante a navegação ou reprodução.

No Android nativo, a tela de Canais sempre aplica a grade TV: categorias compactas com 15% da largura, lista de canais no centro e coluna direita com 38% da largura para vídeo e EPG. O player ocupa o slot direito e a programação fica abaixo dele.

O layout é aplicado por JavaScript usando a largura real do WebView e também por estilos inline, para não ser anulado pelas regras antigas `ui-tv`. Nomes de categorias longos, como Dilema, Deus, AMC e semelhantes, recebem truncamento visual e não aumentam a coluna.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `3.5.0`, versionCode `26` e build debug.

O fundo remoto continua condicionado ao vínculo do MAC na configuração Ultra Player do painel. Sem `background_url` na resposta do endpoint, o APK usa o fundo local de segurança.
