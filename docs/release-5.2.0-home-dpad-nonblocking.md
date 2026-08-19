# Fusion 5.2.0 — Home TV Box sem bloqueio do D-pad

Na TV Box, as faixas “Filmes em destaque” e “Para você” agora recebem cards-placeholder imediatamente quando o catálogo ainda não está disponível. O primeiro frame não espera as capas, não executa `fitHomeAll()` e não percorre a fila inteira de imagens.

A hidratação passa a acontecer progressivamente: as capas são carregadas em lotes menores e espaçados, e as recomendações são atualizadas depois que a Home já devolveu o foco ao controle remoto. O celular mantém o caminho de carregamento anterior.

Também foi mantida a compatibilidade com os catálogos em cache e com a substituição posterior dos placeholders pelos cards reais.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
