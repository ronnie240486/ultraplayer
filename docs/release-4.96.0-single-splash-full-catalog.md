# Fusion 4.96.0 — tela única e catálogo integral na Home

A segunda tela de carregamento WebView foi removida. O shell mantém somente `#zx-splash`, com a capa/logo do Fusion e o spinner inicial. O overlay secundário usado por `showLoading()` não existe mais; `showLoading()` tornou-se um no-op para que carregamentos internos não criem uma nova tela sobre a Home.

A Home agora usa o cache/preview apenas para a primeira pintura rápida e, 180 ms depois, inicia `refreshHomeCachedCatalogs(['movies', 'series', 'live'], 0)`. Cada catálogo é atualizado integralmente com `forceFull=true`, em série para não travar o D-pad da TV Box. Ao terminar cada seção, a contagem do tile é atualizada e as faixas “Filmes em destaque” e “Para você” são reconstruídas com os dados completos.

Os limites de 360 itens, 60 itens por categoria e 180 categorias permanecem somente na cópia persistida de cache, usada como fallback para a primeira pintura; eles não limitam o catálogo integral em memória após a sincronização assíncrona.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
