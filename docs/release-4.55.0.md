# UltraPlayer 4.55.0 — Somente validade da M3U

A versão **4.55.0** (`versionCode 93`) separa definitivamente:

- validade do cadastro/aplicativo no painel; e
- validade da assinatura da lista M3U ativa.

## Regra da Home

A Home e Configurações agora consideram somente:

1. parâmetros de expiração na URL da M3U;
2. campos individuais da lista, como `exp_date`, `expire_date` e equivalentes;
3. `user_info.exp_date`/campos equivalentes retornados pela própria origem Xtream da lista.

O `expire_date` do endpoint de cadastro do MAC não é mais usado como validade da M3U. Ele não pode mascarar a data real ou fazer o app mostrar 2027 quando a assinatura da lista vence antes.

## Diagnóstico da lista atual

A resposta do cadastro do MAC informa uma validade do aplicativo/cadastro, mas a URL M3U entregue não possui parâmetro de expiração. A consulta da origem M3U/Xtream a partir do ambiente de validação respondeu HTTP 403 e não forneceu metadados de validade. No APK, a consulta continua sendo feita no dispositivo; se a origem fornecer `user_info.exp_date`, a data será salva e exibida.

Quando a própria lista não fornecer nenhuma data, o app exibirá **“Data da M3U não informada”**, em vez de inventar a data do painel.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Home sem fallback `lic.exp_date`/`info.expire_date` do painel: confirmado.
- Consulta da origem Xtream preservada: confirmada.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.55.0-m3u-only-expiry-release.apk`.
- SHA-256: `75394fa135ed4288c136da102591791f1b2e72b9da386d47f74be182ae2fc54e`.
