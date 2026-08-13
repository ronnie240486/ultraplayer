# UltraPlayer 4.4.2 — escala efetiva do Celular e toque de tela cheia

A versão 4.4.2 corrige a regra visual que não atingia o nome real dos canais. O HTML usa `.ct-name`; a versão anterior aplicava parte da regra a `.ch-name`, que não era o elemento exibido nessa lista. Agora o modo Celular aplica diretamente ao canal o logo com 43 px, fallback proporcional e nome com 14 px, usando `!important` para vencer as regras responsivas anteriores. A mesma redução é aplicada às listas principais, ao layout ao vivo e aos resultados de busca por voz.

O mini player recebeu uma camada de toque transparente dedicada. No modo pequeno, o `PlayerView` deixa de capturar o toque antes da camada de expansão, de modo que qualquer toque no vídeo aciona a abertura. Ao abrir, a camada é ocultada, os controles do `PlayerView` são reativados, o container é trazido para frente, recebe `MATCH_PARENT` e solicita novo layout. A reprodução permanece no mesmo `ExoPlayer`; voltar retorna ao mini player sem recriar o canal.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.4.2`, versionCode `37`, build debug. SHA-256: `1a39a4dbc079d9819d9a7b2efb72281f6375d69b5f87ed3bac8244d78d9c1f8c`.
