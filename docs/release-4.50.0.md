# UltraPlayer 4.50.0 — Controle de volume por voz

A versão **4.50.0** (`versionCode 88`) adiciona controles de volume ao UltraPlayer por meio do mesmo microfone direto já usado para abrir canais e controlar a reprodução.

## Comandos adicionados

Durante a reprodução, o usuário pode dizer **“silenciar”**, **“mutar”** ou **“sem som”** para alternar o áudio entre silenciado e restaurado. Também pode dizer **“aumentar volume”** ou **“diminuir volume”** para ajustar o volume em passos de 10%.

O volume é aplicado diretamente ao mesmo ExoPlayer do mini player e do player em tela cheia. O estado de volume e mudo é preservado quando a mesma sessão troca de conteúdo, sem criar um segundo player.

## Compatibilidade preservada

O botão principal de voz continua iniciando diretamente o reconhecimento. O comando **“Space HD”** continua abrindo o canal diretamente. Favoritar por voz, pausa, retomada, tela cheia, EPG, alarmes, retomada rápida e favoritos da Home permanecem disponíveis.

No Android, os métodos nativos `miniMute()`, `miniVolumeUp()` e `miniVolumeDown()` foram adicionados à ponte existente. O ajuste não altera as rotas de catálogo, o EPG ou o layout Celular/TV Box.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Compilação Java da ponte Android: aprovada.
- `./gradlew assembleRelease --no-daemon`: aprovada.
- APK: `releases/UltraPlayer-4.50.0-voice-volume-release.apk`.
- SHA-256: `9b57dfb150c1a701dc004ea28c545c80316adcae5cce9d254b70c29a8376e755`.
