# Fusion 4.86.0 — barra de categorias compacta

## Alterações

Na TV Box, a barra de categorias da tela de canais foi reduzida para uma coluna compacta de 16vw, com pills de 36px de altura e fonte de 11px. A barra fica contida no canto, com rolagem própria, sem ocupar a largura da lista de canais.

O item que recebe foco pelo D-pad fica com fundo na cor de destaque, borda branca e anel externo branco/verde. A categoria ativa também fica com fundo colorido e borda branca, permitindo identificar tanto o foco atual quanto a categoria carregada.

As categorias longas usam reticências para não aumentar a altura das linhas. A lista de canais permanece no painel principal. O Celular não recebe os overrides de TV Box.

## Validação

- `node --check` aprovado para `zlocal.js`, `category_browser.js` e `tv.js`.
- `assembleRelease` com R8 aprovado.
- Versão: Fusion 4.86.0.
