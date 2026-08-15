# Auditoria inicial de desempenho do UltraPlayer

## Achados confirmados

O app é um WebView híbrido dentro de uma Activity Android nativa com Media3/ExoPlayer para o player. O WebView já tem JavaScript, DOM storage, database, cache padrão, viewport amplo e reprodução sem gesto obrigatório habilitados.

O `zlocal.js` é grande e concentra roteamento, catálogo, EPG, temas, voz, UltraSession e player. A inicialização chama CSS, form factor, acessibilidade, favoritos, alarmes EPG, sincronização em segundo plano, watcher de notificações e carregamento de credenciais. O boot também agenda carregamento de três catálogos e rádio.

A Home e as seções usam `setHtml()` e re-renderizações completas em vários fluxos. Catálogos VOD já usam carregamento incremental/lazy em alguns pontos, e existe carregamento preguiçoso de imagens, mas há várias reconstruções de `innerHTML` e enriquecimento TMDB assíncrono.

A versão release usa R8 e `shrinkResources`, mas o WebView continua com custos potenciais de rede, imagens e reconstrução de DOM. A próxima etapa deve medir o tempo de boot, quantidade de chamadas, custo de imagens e quantidade de re-renderizações antes de alterar comportamento.
