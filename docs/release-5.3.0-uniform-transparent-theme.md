# Fusion 5.3.0 — tema translúcido uniforme na tela de Canais

A cor escolhida em Configurações agora é convertida para rgba e aplicada no mesmo tom à categoria ativa, ao canal focado, ao EPG e aos estados de favorito. Os fundos de seleção usam alfa para que amarelo, verde e branco não formem blocos opacos.

O tema Branco usa agora branco real como acento. A regra dinâmica é injetada depois do CSS base, com prioridade suficiente para substituir os verdes fixos da barra de categorias, da grade de canais e do EPG.

O tamanho do PNG e o comportamento do modo Celular não foram alterados.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
