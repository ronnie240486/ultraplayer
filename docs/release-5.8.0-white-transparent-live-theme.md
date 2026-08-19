# Fusion 5.8.0 — branco translúcido uniforme na tela Live

A tela de Canais usa agora a cor selecionada no painel para categoria ativa, canal focado, foco geral e sinos do EPG. No tema Branco, o acento é branco real, mas todos os fundos de foco usam alfa baixo para não estourar a tela.

O verde fixo da barra de canais foi removido. A categoria e o canal selecionados recebem o mesmo branco translúcido, com borda e anel de foco suaves. Não houve alteração no carregamento, nas categorias, no player ou na navegação.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
