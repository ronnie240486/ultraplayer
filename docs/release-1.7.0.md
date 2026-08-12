# UltraPlayer 1.7.0 — cards locais e home mobile confiável

A versão 1.7.0 elimina a dependência de capas externas para listas M3U. Quando uma entrada não possui `tvg-logo`, o aplicativo gera uma capa SVG local, com gradiente, tipo do conteúdo, iniciais e título. Portanto, Filmes, Séries, Canais e a faixa inicial não devem mais aparecer como blocos vazios mesmo quando o provedor não envia imagem.

A faixa inicial deixa de afirmar que itens de uma M3U são recentes, porque listas M3U normalmente não incluem data de cadastro. Para esse formato, o título passa a ser **Filmes em destaque** e a seleção vem somente do catálogo classificado como filmes.

A home agora detecta o celular em retrato pela proporção real do WebView e aplica a classe `zx-phone`. Isso não depende de uma media query que pode receber largura física em alguns aparelhos. O modo usa duas colunas, cards de 122 pixels, ícones de 35 pixels e uma faixa horizontal de pôsteres de 180 pixels; ao girar para paisagem, a classe é removida e o layout amplo é preservado.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `1.7.0`, versionCode `8` e `minSdk 21`. A build é de teste, assinada com chave debug.
