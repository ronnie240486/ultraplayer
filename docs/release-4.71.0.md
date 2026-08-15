# UltraPlayer 4.71.0 — validade Xtream e atualização interna

## Resumo

A versão 4.71.0 aplica ao UltraPlayer as lacunas confirmadas na análise do `main.pdf`: consulta da validade real da conta Xtream e fluxo nativo de atualização do APK dentro de Configurações.

## Validade

Depois do login, do boot e da troca de lista, o aplicativo deriva servidor, usuário e senha da URL M3U Plus e consulta `player_api.php`. Quando `user_info.exp_date` é positivo, ele é tratado como timestamp Unix em segundos e passa a ser a fonte principal da data exibida. Caso não exista uma validade Xtream utilizável, o app mantém o fallback textual da lista/painel; quando nenhuma fonte existe, não inventa uma data.

## Atualização interna

Configurações ganhou a opção **Atualizar aplicativo** no Android. O app usa exclusivamente `ultra_apk_download_url`, `ultra_apk_version`, `ultra_version_code` e `ultra_apk_version_code` do endpoint próprio do UltraPlayer. O download exige HTTPS, resposta 2xx, não usa cache, tem limite de 120 MB e exibe progresso. Antes do instalador, valida assinatura ZIP, `AndroidManifest.xml`, `applicationId`, `versionCode` maior e assinatura compatível.

O APK é compartilhado com `FileProvider` em URI `content://`, com caminho privado restrito. Em Android 8 ou superior, o app solicita a autorização de instalação por fonte desconhecida somente quando o sistema exigir. A confirmação final continua sendo feita pelo instalador nativo; não existe instalação silenciosa.

## Estado do painel

Na consulta realizada com o MAC de teste, o endpoint Ultra-config respondeu HTTP 200 e autorizou o dispositivo, mas `ultra_apk_download_url` estava vazio. O botão está implementado e informará que não há atualização publicada até o painel preencher esse campo com um link HTTPS direto para um APK compatível.

## Validação

`node --check` foi aprovado. `./gradlew assembleRelease` foi concluído com sucesso, incluindo R8, Manifest, FileProvider e a nova classe nativa. O artefato foi copiado para `releases/UltraPlayer-4.71.0-main-pdf-expiry-update-release.apk`.

SHA-256: `c86620be8a2d10fdb1474b943bdb5dde604e8fc3c402554966bb52ffc1907514`.
