# Fusion 4.74.1 — Novo logo vermelho

## Alteração

Esta versão substitui o logo Fusion azul pelo novo logo Fusion vermelho enviado pelo usuário. O mesmo PNG foi aplicado ao ícone Android e ao asset principal usado pelo WebView.

## Pontos atualizados

O novo logo aparece no ícone do APK, no splash nativo, no splash HTML inicial, na tela de login, na Home, nas configurações, nas marcas d’água e nos fallbacks visuais que usam a identidade Fusion. O nome Fusion e as funcionalidades existentes permanecem inalterados.

O `applicationId` continua `com.ultraplayer.app`, o que permite instalar esta versão sobre o Fusion 4.74.0 e preservar atualização, dados locais, MAC virtual e compatibilidade com o painel.

## Validação

O asset vermelho foi copiado para os dois pontos usados pelo aplicativo e possui SHA-256 `5f6577190a34974178e448ead223bcd12c5f909a08168ee514a6cd25940c6704`.

A sintaxe JavaScript foi aprovada com `node --check`. O build `assembleRelease` com R8 foi concluído com sucesso. O APK final tem 4.402.778 bytes, assinatura inicial ZIP `PK` e SHA-256 `afcf8fac3263da20b2b30737809a7ab998e2558eab4d60d05a6f014f4369a995`.

## Atualização

Para atualizar pelo painel, use um link HTTPS direto para o APK, sem página HTML intermediária e sem acrescentar outro nome de arquivo à URL. A versão 4.74.1 possui `versionCode` maior que a versão anterior e mantém a mesma assinatura de teste usada nas versões anteriores.
