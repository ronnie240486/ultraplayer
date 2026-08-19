# Fusion 4.94.0 — navegação D-pad nas categorias de Canais

A barra `.cat-sidebar` da TV Box agora intercepta esquerda/direita quando o foco está em `.cat-pill` e move o foco exclusivamente para o botão vizinho na ordem do DOM. A tecla é consumida com `preventDefault()` e `stopPropagation()`, impedindo que o WebView selecione o quadro inteiro ou deixe o foco escapar.

Nas bordas da faixa, o foco permanece no primeiro ou no último botão. A rolagem horizontal e vertical necessária para revelar o item é feita manualmente, sem o auto-scroll agressivo do WebView. Cima/baixo não é interceptado por essa regra e continua usando o navegador espacial existente para sair da faixa.

O destaque visual permanece sendo aplicado pelo estado `:focus` e por `.is-active`. O comportamento do Celular e das demais áreas de navegação não foi alterado.

Validação: `node --check` aprovado para `tv.js`, `zlocal.js` e `category_browser.js`; `assembleRelease` com R8 aprovado.
