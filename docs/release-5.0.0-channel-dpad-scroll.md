# Fusion 5.0.0 — D-pad contínuo na tela de Canais

A barra de categorias da tela Live agora pode ser percorrida por esquerda/direita sem pressionar OK. O navegador troca a categoria em-place, preserva o foco na pílula e permite seguir por AMC, AXN e demais categorias sem o foco cair no quadro inteiro.

Na grade de canais, esquerda retorna deterministicamente à categoria ativa. Na barra, baixo no limite inferior entra no primeiro canal e cima no primeiro canal retorna à categoria ativa. A rolagem manual da TV Box foi ampliada para `cat-sidebar`, `sidebar-content` e `live-epg`, evitando o `scrollIntoView` que travava ou deslocava a tela errada.

Também foram preservadas a paginação da grade, o foco nos itens de canal e a navegação entre grade e sinos do EPG.

Validação: `node --check` aprovado para `tv.js`, `category_browser.js` e `zlocal.js`; build release com R8 aprovado.
