# UltraPlayer 4.42.0 — Home do Celular organizada

A versão **4.42.0** (`versionCode 80`) ajusta a Home para telas de Celular sem alterar a experiência compacta da TV Box.

## Correções

| Item | Comportamento novo |
|---|---|
| Busca | O botão separado de busca geral foi removido do cabeçalho da Home. A busca continua acessível pelo botão de microfone/Ultra Assistente, por voz, com comandos como “buscar em tudo”. |
| Home no Celular | A Home passa a rolar verticalmente quando o conteúdo ultrapassa a área visível. Assim, apenas o que cabe aparece na tela e o usuário desliza para ver as fileiras abaixo. |
| Navegação principal | Os cards de Canais, Filmes, Séries, Listas, Favoritos e Configurações ficam em uma faixa horizontal deslizante no modo Celular, evitando que todos apertem a tela. |
| Fileiras de conteúdo | “Assistido Recentemente” e “Para você” mantêm cards horizontais com rolagem lateral, capas e foco. |
| TV Box | Nenhuma regra nova de rolagem foi aplicada ao seletor `zx-ff-tv`; a navegação D-pad e o layout de três colunas permanecem preservados. |
| Player e voz | O player único, comandos de voz, EPG, perfis, modo ambiente, trailers e autenticação permanecem inalterados. |

## Acesso à busca

Na Home, pressione o botão do microfone e diga **“buscar em tudo”** para abrir a busca universal. Também é possível falar diretamente o nome de um canal, filme ou série, mantendo a busca por voz já existente.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- O cabeçalho possui `0` botões extras `href="/search"`.
- O cabeçalho mantém `1` botão de voz `zxVoiceBtn`.
- As regras novas usam somente `body.zx-ff-mobile`.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.42.0-mobile-scroll-release.apk`.
- SHA-256: `503708c24f0dfa77886f3f70328a46d92fb2abd18e269c8ea93a00e665037680`.
