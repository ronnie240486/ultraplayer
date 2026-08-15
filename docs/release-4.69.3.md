# UltraPlayer 4.69.3 — correção definitiva dos cards mobile

## Problema

A correção 4.69.2 havia colocado o layout largo dentro de `@media (max-width: 700px)`. Como o aplicativo Celular funciona sempre em **landscape**, a largura do WebView podia superar 700 px e essa regra não era aplicada. Por isso os cards continuavam estreitos.

## Solução

A versão 4.69.3 aplica o layout pelo form factor real do aplicativo, usando `body.zx-ff-mobile`, independentemente da largura do dispositivo:

| Elemento | Modo Celular |
|---|---|
| Grade | Uma coluna vertical rolável. |
| Card | Ocupa 100% da largura disponível. |
| Capa | 38% do card, altura mínima de 280 px. |
| Texto | 62% do card, título em até três linhas e metadados legíveis. |
| Navegação | Rolagem para baixo entre todas as sugestões. |
| TV Box | Regras `body.zx-ff-tv` preservadas, sem alteração. |

## Validação

`node --check` foi aprovado. Foi confirmada a presença das regras explícitas de Celular para grade, card e poster, além da preservação da regra de grid da TV Box. O build release com R8 foi concluído com sucesso.

**APK:** `UltraPlayer-4.69.3-ultrasession-mobile-landscape-release.apk`

**SHA-256:** `e4d47186b2998a7d112c72e334a4c67d3fcf6426e591e0280488bf9214d65889`.
