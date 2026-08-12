# UltraPlayer Native WebView

Esta é a base Android recomendada do UltraPlayer 1.5.0. Ela preserva a arquitetura híbrida recuperada do APK de referência: uma `MainActivity` hospeda o front-end local em `WebView`, e a interface conversa com uma ponte JavaScript chamada `HdxNative`. Quando a interface solicita reprodução, a ponte abre a `PlayerActivity` nativa.

O diretório `app/src/main/assets/webui/` contém a interface recuperada do APK, incluindo `index.html`, `zlocal.js`, `tv.css`, `tv.js`, teclado, cache, HLS e scripts de player. Na primeira abertura, o app exibe um MAC virtual estável de 12 dígitos, oferece cópia para o painel e consulta automaticamente o cadastro. Usuário e senha permanecem como opção alternativa. Playlists M3U são classificadas em Canais, Filmes e Séries pelo grupo, nome e URL.

## Build

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export ANDROID_HOME=/home/ubuntu/android-sdk
export ANDROID_SDK_ROOT=/home/ubuntu/android-sdk
./gradlew assembleDebug --no-daemon --max-workers=1
```

O resultado é `app/build/outputs/apk/debug/app-debug.apk`. O projeto usa `minSdk 21`, package `com.ultraplayer.app`, versionName `1.5.0` e versionCode `6`.

## Observações

A senha do modo de credenciais é enviada por HTTPS para `https://renciaapp.manus.space/api/v5/login.php` e não é gravada pelo Java. A rota deve estar publicada no backend para o modo usuário/senha funcionar. O modo MAC usa `https://renciaapp.manus.space/api/v5/check_mac.php`.

O APK gerado é assinado com a chave debug padrão e serve para teste. A `PlayerActivity` usa Media3/ExoPlayer com suporte a HLS, MPEG-TS, controles nativos, tela cheia e rotação por sensor. O layout em retrato foi compactado para celular; a apresentação de TV em paisagem permanece ampla.
