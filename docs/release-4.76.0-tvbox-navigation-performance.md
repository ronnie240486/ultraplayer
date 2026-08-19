# Fusion 4.76.0 — Navegação TV Box e desempenho

## Navegação das fileiras Home

As fileiras **Para você** e **Filmes em destaque** agora têm rolagem horizontal explícita no modo TV Box. Ao pressionar esquerda/direita com um card focado, o navegador intercepta a tecla, move o foco para o card vizinho e altera somente `scrollLeft` do `.zh-posters`. O `scrollTop` da Home e o scroll da janela são preservados.

A alteração é limitada ao form factor TV Box (`body.zx-ff-tv` ou `ui-tv`). O modo Celular mantém seu comportamento próprio.

## Desempenho das categorias

O navegador de categorias já usava paginação e navegação por índice. Nesta versão, o foco de categorias TV Box evita `scrollIntoView` nativo, que podia percorrer toda a cadeia de ancestrais roláveis a cada tecla. O foco é aplicado com `preventScroll` e a rolagem é corrigida somente dentro do `.sidebar-content`.

O carregamento de imagens das categorias passou a usar uma fila curta. A TV Box mantém no máximo três capas em decodificação simultânea; Celular e outros form factors mantêm até seis. Ao trocar de categoria, a fila pendente é limpa para não continuar decodificando imagens da tela anterior.

## Compatibilidade

Player, EPG, listas, autenticação, TMDB, UltraSession, temas, orientação landscape, layout Celular e atualização interna não foram alterados. O `applicationId` continua `com.ultraplayer.app` para atualização direta.

## Validação

`node --check` foi aprovado para `zlocal.js`, `category_browser.js` e `tv.js`. O `assembleRelease` com R8 foi concluído com sucesso. O APK final tem 8.144.031 bytes, assinatura inicial ZIP `PK` e SHA-256 `ec758bacb682c175ab0fe50efe1a1bd14ac7af4ed74e71743c351e70bc9c910f`.

A validação visual final deve ser feita na TV Box real pressionando direita/esquerda em ambas as fileiras e descendo pelas categorias com uma lista grande. O objetivo é que apenas a fileira Home se desloque horizontalmente e que o foco das categorias não provoque salto da página inteira.
