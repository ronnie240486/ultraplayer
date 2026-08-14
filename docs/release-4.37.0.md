# UltraPlayer 4.37.0

## Correção do vencimento da lista

A versão **4.37.0** (`versionCode 75`) corrige o rodapé da tela inicial, que mostrava **“Sem expiração”** mesmo quando o painel retornava uma data de validade.

A causa era a leitura de `info.exp_date`, enquanto o estado usado pelo aplicativo guarda a validade em `info.license.exp_date`. Além disso, a resposta atual do endpoint de autenticação retorna o campo global `expire_date`; esse campo agora é associado à lista ativa quando a lista não possui uma validade individual.

| Área | Correção |
|---|---|
| Endpoint de autenticação | O campo `expire_date` da resposta do painel passa a ser considerado como validade da lista ativa. |
| Múltiplas listas | Cada lista continua podendo ter sua própria validade; quando não há validade individual, é usada a validade global retornada para o MAC/usuário. |
| Estado interno | A data é convertida para `license.exp_date` em timestamp Unix. |
| Rodapé da Home | A leitura prioriza `license.exp_display` e `license.exp_date`, formatando a data como `dd/mm/aaaa`. |
| Modos do app | A correção é comum ao estado da Home e mantém Celular e TV Box em paisagem. |

## Validação realizada

O endpoint consultado para o MAC de teste retornou `expire_date: 2027-08-14`. A conversão determinística confirmou a exibição **14/08/2027**. Também foram executados `node --check app/src/main/assets/webui/zlocal.js` e `./gradlew assembleRelease --no-daemon`, ambos com sucesso.

## Artefatos

- APK: `releases/UltraPlayer-4.37.0-expiry-date-release.apk`
- SHA-256: `releases/UltraPlayer-4.37.0-expiry-date-release.apk.sha256`
- SHA-256 calculado: `a08ae4c7d2718a9a933dca4334359c38bb8815f95362dbea5e04851316c0bc09`

## Teste recomendado

Instale o APK, abra a tela inicial e confirme que o rodapé mostra **Vencimento da lista: 14/08/2027** para o MAC usado na validação. Em instalações com outra lista, será mostrada a data correspondente retornada pelo painel.
