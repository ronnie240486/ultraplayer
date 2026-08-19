# Fusion 5.7.0 — categorias Live restauradas

A tela de Canais agora normaliza a estrutura do catálogo Live antes de renderizar a barra. Se a resposta trouxer os canais, mas não trouxer a lista auxiliar `cats`, as categorias são reconstruídas pelos grupos dos próprios canais.

No erro de consulta, o aplicativo tenta utilizar o cache local do catálogo Live antes de exibir a mensagem de falha. A proteção de reconsulta do catálogo vazio continua restrita à TV Box; o Celular preserva o caminho anterior.

A navegação e o carregamento do player não foram alterados nesta correção.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
