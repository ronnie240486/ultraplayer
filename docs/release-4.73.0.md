# UltraPlayer 4.73.0 — otimizações de desempenho

## O que foi otimizado

A Home deixou de iniciar todas as capas disponíveis do Celular ao mesmo tempo. Agora as imagens são carregadas em lotes controlados: oito por rodada no Celular e seis na TV Box, com intervalo curto e timer único. Isso reduz picos de rede, alocações de `Image` e repaints durante a primeira abertura.

O ajuste de tamanho e quantidade dos cards da Home agora usa `scheduleHomeFit()`, que cancela medições pendentes antes de agendar outra. Isso evita reflows repetidos durante retorno à Home, carregamento das recomendações e redimensionamento/rotação.

O cálculo das recomendações deixou de procurar cada favorito percorrendo todo o catálogo repetidamente. Cada catálogo agora cria um índice por ID e resolve favoritos em tempo linear, reduzindo o custo em listas grandes.

A navegação de Filmes, Séries e Canais já utilizava índice O(1) para D-pad, paginação incremental e lazy loading por fileiras; essas partes foram preservadas para evitar regressão.

## O que não foi alterado

A otimização não modifica autenticação, MAC, listas M3U/Xtream, TMDB, UltraSession, filtros de gênero, EPG, controle infantil, player único Media3, failover, atualização interna, orientação landscape, temas ou navegação específica da TV Box.

## Validação

`node --check` foi aprovado. `./gradlew assembleRelease` foi concluído com R8, shrinkResources, Manifest e assinatura de release. O APK foi gerado com `versionCode 116` e `versionName 4.73.0`.

SHA-256: `43659a156c61113be408823c055a07599583daada76cc94c80e6fd2a9d176c78`.

O tempo exato de abertura deve ser medido em um aparelho Celular e uma TV Box reais, pois depende do tamanho da lista, velocidade da rede, memória e modelo do dispositivo.
