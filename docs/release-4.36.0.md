# UltraPlayer 4.36.0

## Correção desta versão

A versão **4.36.0** (`versionCode 74`) corrige a tela do menu transparente do player em tela cheia na TV Box. Antes, o menu podia receber somente a categoria atual ou classificar vários canais como **Abertos**; agora ele recebe a lista completa de canais e os metadados de todas as categorias disponíveis.

| Área | Correção |
|---|---|
| Menu do player cheio | O menu passa a exibir todas as categorias presentes na lista, mantendo **Todos** como primeira opção. |
| Payload Android | O JavaScript envia `zap_categories` junto com `zap`, além do índice do canal atual. |
| Classificação Xtream | O `category_id` é resolvido contra as categorias do catálogo antes de usar nomes genéricos retornados pelo servidor. |
| Classificação M3U | `group-title` continua sendo usado como categoria real no zapping. |
| Abertura do canal | As principais formas de abrir canal — grade, busca por voz e rota de reprodução — passam a enviar a lista completa ao player nativo. |
| Modo Celular | Nenhuma regra específica do Celular foi alterada; a correção atua no payload e no menu do player nativo. |

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- `./gradlew assembleRelease --no-daemon`: concluído com sucesso.
- R8 e `shrinkResources`: executados.
- APK gerado: `releases/UltraPlayer-4.36.0-all-categories-release.apk`.

## SHA-256

`d45a01346caa8977b6a56764f4148102823e41a21200418d9ca17bb78dfa32e8`

## Teste recomendado

Instale o APK em uma TV Box, abra um canal ao vivo, toque ou selecione o botão de menu no player cheio e verifique a barra horizontal de categorias. Ela deve apresentar **Todos** e todas as categorias existentes na playlist, permitindo selecionar qualquer uma e trocar de canal sem sair do player.
