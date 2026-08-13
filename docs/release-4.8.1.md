# UltraPlayer 4.8.1 — voz direta, cards altos e sino móvel

A versão 4.8.1 corrige a tela mostrada no teste do modo **Celular**. Os resultados de canais da busca por voz agora usam a classe exclusiva `voice-channel-card`, sem herdar a altura compacta dos cards do catálogo ao vivo. Cada card tem altura fixa adequada, logo, número, nome e rolagem vertical da tela.

Para comandos com duas ou mais palavras, a busca procura primeiro um nome exato e, caso não exista, o primeiro nome que começa com a expressão. Assim, “Space HD” abre diretamente o primeiro canal correspondente em vez de permanecer na tela “Canais encontrados”. Consultas curtas, como “Space”, continuam mostrando a lista de resultados. Filmes exatos iniciam o filme e séries exatas abrem o detalhe da série.

O EPG móvel ganhou uma regra final com linha flexível, largura mínima do botão, visibilidade, z-index e área de toque explícitos para o sino. A tipografia do horário e do programa foi aumentada para manter a leitura. Essas regras estão dentro de `body.zx-ff-mobile`; o Caixa TV não recebe essas alterações.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.8.1`, versionCode `44`, build debug. SHA-256: `e5f2b783112be3d16683cdf29cf3d3cba7e01e3307c83cff85b6895070436e84`.
