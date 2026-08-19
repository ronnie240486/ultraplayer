# Fusion 4.78.0 — Home vertical para TV Box

## Objetivo

A Home da TV Box foi reorganizada para não comprimir os ícones e não sobrepor Favoritos, Filmes, Séries, Minha Fila, Meus Alertas e Playlist.

## Layout TV Box

O bloco TV ao Vivo ocupa uma linha ampla. Filmes e Séries ficam em uma grade de dois blocos grandes. Favoritos, Minha Fila, Meus Alertas e Playlist ficam em outra grade de dois blocos. As seções Filmes em destaque/Recém adicionados e Para você aparecem abaixo, cada uma em uma fileira horizontal própria.

A Home inteira da TV Box agora tem rolagem vertical. O ajuste anterior que reduzia os cards para fazer tudo caber em uma tela foi desativado no modo TV; os cards mantêm tamanho legível e as fileiras rolam horizontalmente.

## Navegação D-pad

A navegação foi tornada determinística dentro da Home:

- TV ao Vivo → seta para baixo leva ao bloco Filmes/Séries.
- Filmes/Séries → seta para baixo leva a Favoritos/Minha Fila.
- Favoritos/Minha Fila/Alertas/Playlist → seta para baixo leva a Filmes em destaque.
- Filmes em destaque → seta para baixo leva a Para você.
- O foco é aplicado com `preventScroll` e a rolagem fica limitada ao `.zx-home2`; o WebView não usa `scrollIntoView` para deslocar a página inteira.
- Esquerda/direita em Filmes/Séries permanece restrito à linha superior.

## Compatibilidade

O override é aplicado somente a `body.zx-ff-tv`. O layout Celular permanece com suas regras atuais. Player, EPG, listas, TMDB, UltraSession, temas e autenticação não foram alterados.

## Validação

`node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`. `assembleRelease` com R8 concluído com sucesso. APK final: 8.145.544 bytes. SHA-256: `9893458b0f384e0acafd6c740409e2309617ce6bbd722dcd013e426249cbb8fd`.
