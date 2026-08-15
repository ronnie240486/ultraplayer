# UltraPlayer 4.71.2 — correção do HTTP 403 no atualizador

## Causa confirmada

O Ultra-config estava entregando uma URL com o nome do APK duplicado:

`.../APTYRQCKEOzLuHAw.apk-main-pdf-expiry-update-release.apk`

Essa URL retornava HTTP 403. A URL base correta terminava no primeiro `.apk` e respondia HTTP 200 com `Content-Type: application/vnd.android.package-archive` e assinatura ZIP `PK`.

## Correção

O atualizador agora normaliza somente esse padrão conhecido de concatenação duplicada antes de iniciar o download. A regra continua restrita a URLs HTTPS. O app mantém as validações de Content-Type, assinatura ZIP, Manifest, `applicationId`, `versionCode` maior e assinatura compatível.

A versão 4.71.2 é incremental, com `versionCode` 114, para instalar sobre a versão 4.71.0/4.71.1 que exibiu o HTTP 403.

## Validação

A URL recebida do painel foi reproduzida com os mesmos cabeçalhos do atualizador e retornou HTTP 403. A URL base direta foi validada com HTTP 200, Content-Type de APK e bytes iniciais `PK`. `node --check` e `./gradlew assembleRelease` com R8 foram aprovados.

SHA-256 do APK: `61225ef82fd8763a6cbbf56f3cb236ec1e8f3fa5a2552d46a2ec13c547242700`.
