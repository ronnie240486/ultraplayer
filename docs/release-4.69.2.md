# UltraPlayer 4.69.2 — cards mobile do UltraSession

## Correção visual

A versão 4.69.0 do UltraSession usava vários cards estreitos no modo Celular. Em telas menores, a capa ficava pequena e o usuário não conseguia identificar o filme ou a série.

Na versão 4.69.2, quando o corpo usa `zx-ff-mobile`, a grade do UltraSession passa a ser uma **lista vertical rolável**. Cada card ocupa a largura disponível, apresenta uma capa grande com altura mínima de 260 px e mostra título, tipo, nota TMDB, duração e justificativa ao lado da capa. O usuário pode rolar para baixo para ver todas as sugestões.

A regra específica de `zx-ff-tv` permanece separada: a TV Box continua usando o grid com cards maiores distribuídos em colunas.

## Validação

| Verificação | Resultado |
|---|---|
| Sintaxe de `zlocal.js` | Aprovada com `node --check`. |
| CSS mobile em coluna | Confirmado. |
| Capa mobile grande | Confirmada com altura mínima de 260 px. |
| Regra TV Box | Confirmada e preservada. |
| Build release com R8 | Aprovado. |
| APK | `UltraPlayer-4.69.2-ultrasession-mobile-cards-release.apk`. |
| SHA-256 | `208644477ff7bccef5f6c2b076510fac92e4501718f3233aacc719b767048498`. |

Nenhuma regra de catálogo, autenticação, player, TMDB, voz ou controle infantil foi alterada nesta correção.
