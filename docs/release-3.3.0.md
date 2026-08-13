# UltraPlayer 3.3.0 — correção definitiva do modo TV Box

A captura mostrou que as regras legadas `body.ui-tv` do CSS original estavam anulando as regras mais recentes `body.zx-ff-tv`. Isso mantinha a coluna de categorias em 450px e deixava o mini player flutuando sobre a tela.

Nesta versão, `body.ui-tv` e `body.zx-ff-tv` recebem explicitamente o mesmo layout: categorias com 15vw de largura, conteúdo central e coluna direita com 38% da área. O `live-right-column` tem altura fixa da área útil, o vídeo ocupa o topo e o EPG ocupa o restante com rolagem interna.

O mini player nativo recebe as coordenadas do slot visual e usa `FrameLayout.LayoutParams` com posição e tamanho correspondentes ao espaço reservado. O posicionamento genérico continua apenas como fallback para o modo celular ou quando o slot ainda não existe.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `3.3.0`, versionCode `24` e build debug. A aplicação do fundo remoto continua dependendo de o MAC estar vinculado à configuração Ultra Player no painel.
