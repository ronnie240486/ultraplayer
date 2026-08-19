# Fusion 5.4.0 — tela de Canais TV Box responsiva ao D-pad

A consulta do EPG agora é adiada até o foco ficar parado por aproximadamente meio segundo. Durante as setas, o painel não é reescrito e nenhuma consulta de programação é iniciada.

Os logos dos canais são carregados em pequenos lotes na TV Box, evitando decodificar todos de uma vez. A sidebar e a grade receberam rolagem manual de manutenção de visibilidade para manter o item focado dentro da viewport.

A troca rápida entre categorias ganhou um contador de requisição: respostas antigas são ignoradas e não podem substituir a categoria escolhida mais recentemente. A regra de esquerda/direita da categoria consome a tecla antes do algoritmo espacial genérico.

O modo Celular não recebeu alterações de layout ou comportamento.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
