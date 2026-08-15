# Checklist de desempenho do UltraPlayer

## Resumo executivo

A auditoria confirmou que o UltraPlayer já possui otimizações importantes: navegação D-pad por índice O(1) no `category_browser.js`, paginação incremental, lazy loading de imagens por fileira, cache local de catálogo para TV Box, R8, redução de recursos e player nativo Media3. O principal custo perceptível restante estava na Home: muitas capas iniciavam download ao mesmo tempo, timers podiam ser duplicados e recomendações faziam uma busca aninhada de favoritos em todo o catálogo.

## Checklist técnico

| Área | Estado antes | Ação na versão 4.73.0 | Resultado esperado |
|---|---|---|---|
| Inicialização nativa | WebView híbrido com cache e DOM storage habilitados | Mantido, pois já é compatível com as listas e o player | Não alterar autenticação nem reprodução |
| Navegação D-pad | Índice O(1) já existente no `category_browser.js` | Preservado | Setas não fazem varredura espacial completa |
| Paginação | Fragmentos anexados ao grid, sem reconstruir a tela inteira | Preservado | Menos custo ao descer |
| Lazy loading do catálogo | Imagens carregadas por fileira visível | Preservado | Menos memória e rede |
| Capas da Home | Celular iniciava todas as imagens de uma vez; TV usava lote pequeno | Home passou a carregar lotes de 8 no Celular e 6 na TV Box | Menor pico de rede e menos travamento no primeiro paint |
| Timers de posters | Chamadas repetidas podiam criar novas rodadas de carregamento | Timer único em `S._homePosterTimer`, com cancelamento antes de reagendar | Evita trabalho duplicado |
| Medição da Home | Ajustes repetidos por `setTimeout` e `resize` | `scheduleHomeFit()` coalesce as medições | Menos reflow durante retorno/resize |
| Recomendações | Para cada favorito, percorria novamente todo o catálogo | Índice `byId` por catálogo | Custo linear em vez de busca aninhada |
| TMDB | Enriquecimento assíncrono já limitado por cache | Mantido | Não bloquear a primeira pintura |
| Rede/playlist | Timeout, cache e fallback já existentes | Mantidos | Não mudar contrato do Rencia App |
| Player | Media3/ExoPlayer e player único já existentes | Não alterado | Evitar regressões de reprodução |
| APK | R8 e `shrinkResources` já ativos | Mantidos | Release menor e otimizado |

## Checklist de teste manual

No Celular em landscape, abrir a Home, entrar em Filmes, Séries e Canais, retornar à Home e repetir a navegação com toque e controle. Confirmar que o primeiro paint aparece antes da carga de todas as capas, que as capas continuam chegando gradualmente e que não há cards piscando ou diminuindo repetidamente.

Na TV Box, repetir o fluxo com D-pad: abrir a Home, pressionar para baixo e para os lados, trocar categoria, paginar e voltar. Confirmar que o foco visível continua correto, que a primeira fileira abre sem congelamento e que o carregamento de imagens não interrompe a navegação.

Validar também busca, EPG, favoritos, Minha Fila, UltraSession, rádios, player mini/full, troca de perfil, modo infantil, temas e atualização interna. A otimização não deve alterar autenticação, filtragem de gênero, orientação landscape, player único ou failover.

## Itens que continuam como próximos passos

A medição de tempo exato em aparelho real ainda depende de testes com um celular e uma TV Box específicos. Para uma segunda rodada, vale medir `DOMContentLoaded`, primeira pintura da Home, tempo até o primeiro card, tempo até o primeiro foco navegável e tempo de abertura de Filmes/Séries com listas pequenas e grandes. Também é possível adicionar um painel de diagnóstico opcional, desligado por padrão, sem enviar telemetria ao servidor.
