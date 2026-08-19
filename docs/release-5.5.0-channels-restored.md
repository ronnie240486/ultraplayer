# Fusion 5.5.0 — restauração da lista de Canais

A versão 5.4.0 tinha uma regressão na tela Live após as alterações de responsividade. A montagem agora possui uma proteção adicional: uma estrutura Live vazia ou parcial não é exibida como se fosse válida; o aplicativo faz uma nova carga integral da categoria antes de pintar a tela.

A navegação responsiva, a rolagem manual, o atraso do EPG durante o D-pad e o carregamento de logos em lotes pequenos foram preservados. A função duplicada de detecção do modo TV foi removida para evitar sobrescrita de comportamento.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
