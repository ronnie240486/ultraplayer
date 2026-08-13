# UltraPlayer 4.3.0 — modos Celular e TV Box separados

A escolha feita na primeira abertura ou em Configurações agora controla tanto a aparência quanto a orientação do aplicativo.

No modo **Celular**, a atividade principal e o player completo usam retrato, o app remove a classe de TV Box e não aplica a compactação extrema de logos, nomes, categorias, player e EPG criada para telas grandes.

No modo **TV / Caixa**, a atividade principal e o player completo usam paisagem. O layout TV Box mantém categorias e canais compactos, coluna direita reservada para player e EPG, player fixo e rolagens independentes.

A escolha é salva em `SharedPreferences` e restaurada na próxima abertura. Alterar o modo chama a ponte nativa para atualizar a orientação e redimensionar o mini player. O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.3.0`, versionCode `34` e build debug.
