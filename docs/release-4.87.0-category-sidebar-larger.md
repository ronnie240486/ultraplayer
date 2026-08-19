# Fusion 4.87.0 — barra lateral de categorias maior

A barra lateral de categorias da tela de Canais na TV Box foi ampliada para um tamanho intermediário: 20vw de largura, pills de 48px e fonte de 14px. O conteúdo continua preso ao canto e usa reticências para nomes longos.

O foco mantém fundo na cor de destaque, borda branca e anel branco/verde. A categoria ativa também permanece destacada. O Celular e os ícones da Home não recebem esse override.

Validação: `node --check` aprovado em `zlocal.js`, `category_browser.js` e `tv.js`; `assembleRelease` com R8 aprovado.
