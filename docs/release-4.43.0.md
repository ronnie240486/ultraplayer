# UltraPlayer 4.43.0 — Correção da sobreposição na Home do Celular

A versão **4.43.0** (`versionCode 81`) corrige a composição visual observada no modo Celular após a introdução das barras deslizantes.

## Correções aplicadas

| Problema | Correção |
|---|---|
| Cards de TV ao Vivo, Filmes e Séries invadiam as fileiras de filmes | A Home do Celular recebe a classe própria `zx-mobile`, com fluxo vertical real e altura reservada para o menu principal. |
| Menu principal ficava sobreposto ao conteúdo | O menu passa a ser uma faixa flexível horizontal com altura fixa, margem inferior e cartões com tamanho controlado. |
| Cards de Filmes e Séries apareciam grandes demais | Cada item da faixa no Celular usa largura fixa de 190 px e altura de 116 px, com `overflow:hidden`, sem empurrar ou cobrir outras seções. |
| Fileiras “Filmes em destaque” e “Para você” | Permanecem abaixo do menu, cada uma em sua própria área, com rolagem horizontal independente. |
| TV Box | As regras novas são limitadas a `.zx-mobile`; o layout da TV Box e sua navegação por D-pad não são alterados. |

## Preservado

A versão mantém a Home verticalmente rolável no Celular, a remoção do botão de busca redundante, a busca pelo microfone/Ultra Assistente, o player único, o EPG, os perfis, o vencimento da lista e a orientação horizontal.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Classe `zx-mobile` aplicada somente quando o fator de forma selecionado é `mobile`.
- Regras de menu e cards verificadas no JavaScript.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.43.0-mobile-home-fix-release.apk`.
- SHA-256: `213c374e19fb4cb7bf6836ae515bdfe4276a743a34818633903406483cc7afb0`.
