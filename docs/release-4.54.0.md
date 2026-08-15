# UltraPlayer 4.54.0 — Vencimento real da lista ativa

A versão **4.54.0** (`versionCode 92`) corrige definitivamente o rodapé vazio de vencimento.

## Diagnóstico real

A consulta do MAC `4A:6E:2C:8D:30:79` retornou:

- `expire_date`: `2027-08-15`.
- Lista ativa: `Ronnie ultra`.
- URL M3U Plus: `http://epics.zip/get.php?username=555585292&password=522528845&type=m3u_plus&output=mpegts`.

A URL M3U não contém um parâmetro de expiração. A consulta direta à origem Xtream foi bloqueada por Cloudflare, portanto a origem não forneceu outro `exp_date`. O problema no APK era que `directListModels()` e `directResponseToState()` descartavam o `expire_date` retornado junto com a lista autenticada, deixando `license.exp_date` vazio.

## Correção

A data é propagada para a lista ativa e para `license.exp_date` quando a URL/metadados da própria lista não entregam um vencimento. A Home e Configurações usam a data da lista ativa primeiro e exibem fallback apenas quando não existe nenhuma data disponível. Com a resposta real do MAC testada, a Home deve exibir:

**Vencimento da lista: 15/08/2027**

## Validação

- Resposta real do endpoint confirmada: `expire_date=2027-08-15`.
- Lista real confirmada: `Ronnie ultra`.
- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.54.0-expiry-source-release.apk`.
- SHA-256: `5f981d2a3e85df615813b40760034bc439f1224311c502125f6a587b88ce7b42`.
