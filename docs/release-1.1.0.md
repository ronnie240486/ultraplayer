# Release de teste UltraPlayer 1.1.0

## Resultado

A versão 1.1.0 foi compilada localmente como APK de debug. O artefato usa o nome `UltraPlayer`, package `com.ultraplayer.app`, versionName `1.1.0` e versionCode `2`.

| Verificação | Resultado |
|---|---|
| TypeScript (`tsc --noEmit`) | Aprovado |
| ESLint dos arquivos alterados | Aprovado; um import legado foi removido antes da versão final |
| Gradle `assembleDebug` | Aprovado |
| Android SDK | Compile/target SDK 36, build tools 36.0.0 |
| Arquitetura nativa | `arm64-v8a`, além das arquiteturas configuradas no projeto |
| Package | `com.ultraplayer.app` |
| Application label | `UltraPlayer` |

O APK está disponível localmente em `releases/UltraPlayer-1.1.0-debug.apk` e foi deliberadamente excluído do GitHub por ter aproximadamente 172 MB. O hash SHA-256 é mantido no arquivo `.sha256` correspondente e o binário é entregue diretamente como anexo.

## Funcionalidades incluídas

A tela de entrada oferece duas opções separadas. A primeira aceita um MAC de doze dígitos hexadecimais e normaliza os formatos com separadores. A segunda aceita usuário e senha e envia um JSON para `POST /api/v5/login.php`. Ambas as respostas são normalizadas para a mesma sessão do aplicativo, carregando playlists, status, expiração e branding.

O cliente nativo chama diretamente `https://renciaapp.manus.space/api/v5`. O login MAC usa a rota já existente `check_mac.php`. O login por usuário e senha requer que a rota nova do backend seja publicada no painel; o código de referência está em `backend-reference/server/apiRoutes.ts`.

## Limitações

Este APK é um build de debug, não está assinado com uma chave de produção e não deve ser tratado como release pública. A autenticação por usuário e senha só estará funcional no painel online depois da publicação da alteração de backend. O APK pode ser instalado para teste em um dispositivo Android compatível, mas a disponibilidade das playlists depende do cadastro e do status no painel.
