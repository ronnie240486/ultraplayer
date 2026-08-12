# UltraPlayer Mobile

Aplicativo Expo/React Native para o UltraPlayer. A tela inicial oferece dois modos separados de autenticação:

| Modo | Endpoint | Entrada |
|---|---|---|
| MAC | `GET /api/v5/check_mac.php?mac=...` | Doze dígitos hexadecimais; formatos com `:` ou `-` são normalizados. |
| Usuário e senha | `POST /api/v5/login.php` | JSON com `username` e `password`. |

O APK chama diretamente `https://renciaapp.manus.space/api/v5` em ambiente nativo. O modo de usuário e senha depende da publicação do endpoint novo no backend. A implementação de referência está em `../backend-reference/server/apiRoutes.ts`.

## Desenvolvimento

```bash
yarn install
npx expo start
```

## Verificação TypeScript

```bash
./node_modules/.bin/tsc --noEmit
```

## Gerar APK de teste

O projeto Android já foi gerado em `android/`. Com Android SDK, JDK 21 e as variáveis `ANDROID_HOME`/`ANDROID_SDK_ROOT` configuradas, use:

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
./android/gradlew -p android assembleDebug --no-daemon --max-workers=1
```

O APK de teste produzido nesta sessão está em `../releases/UltraPlayer-1.1.0-debug.apk`.

## Segurança

A senha é enviada somente no corpo HTTPS da requisição de login e não é gravada no estado persistido da sessão. Não inclua credenciais, tokens, URLs privadas ou chaves de assinatura no repositório. O APK desta versão é um build de debug e não deve ser distribuído como release de produção.
