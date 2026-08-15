# UltraPlayer 4.71.1 — diagnóstico de link HTML no atualizador

## Causa confirmada

O campo `ultra_apk_download_url` do Ultra-config está retornando `https://manus.im/app/xiMYGzp6TW7o3BrFm5ZStH`. Essa URL responde HTTP 200, mas o `Content-Type` é `text/html` e os primeiros bytes são `<!DOCTYPE html>`. Portanto, é uma página web do Manus, não os bytes de um arquivo APK.

O APK não deve tentar instalar essa página. O PDF analisado exige um link direto que responda com o binário do APK, preferencialmente por HTTPS, sem login, CAPTCHA, navegador ou interação intermediária.

## Correção no aplicativo

A versão 4.71.1 mantém o download seguro e agora rejeita explicitamente respostas HTML com a mensagem: “O link configurado aponta para uma página HTML, não para um APK direto. Use a URL do arquivo .apk.” A validação também verifica o cabeçalho ZIP `PK`, `AndroidManifest.xml`, `applicationId`, `versionCode` maior e assinatura compatível.

## O que deve ser configurado no painel

Preencha `ultra_apk_download_url` com uma URL HTTPS que devolva diretamente o arquivo `.apk`, com resposta HTTP 2xx e `Content-Type: application/vnd.android.package-archive` ou equivalente binário. Não use uma URL `manus.im/app/...`, página HTML, link de login ou página de download.

## Validação

`node --check` aprovado. `./gradlew assembleRelease` com R8 aprovado. APK gerado: `UltraPlayer-4.71.1-update-html-link-fix-release.apk`.

SHA-256: `b1ecd451da185adc969b84b8419dfd2ce712432d779bde8bd753a1efa076e2d4`.
