# UltraPlayer 1.8.0 — catálogo Xtream com capas reais

A versão 1.8.0 corrige a origem dos cards. A resposta de ativação por MAC continua fornecendo uma playlist M3U, mas a URL contém `username` e `password` autorizados. O aplicativo extrai esses dados somente em memória e tenta consultar o catálogo Xtream do mesmo servidor.

Quando o catálogo Xtream responde, o UltraPlayer utiliza `get_live_categories`/`get_live_streams`, `get_vod_categories`/`get_vod_streams` e `get_series_categories`/`get_series`. Esses endpoints fornecem os campos originais de categoria, capa, logo, título, ID e data, reproduzindo o comportamento visual da referência: cards com pôsteres reais, categorias laterais e separação correta entre canais, filmes e séries.

Os detalhes de filmes e séries também voltam a usar os endpoints Xtream, incluindo capas de detalhe, sinopse, temporadas e episódios. As URLs de reprodução são montadas com as credenciais Xtream derivadas da playlist, enquanto o MAC mostrado na interface continua sendo o identificador de ativação do aparelho.

Se o host Xtream estiver indisponível ou bloquear a chamada, o app marca a fonte como indisponível e volta para o parser M3U direto, mantendo a lista reproduzível. Nesse fallback, capas locais são geradas apenas para entradas que realmente não possuem imagem.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `1.8.0`, versionCode `9` e `minSdk 21`. A build é debug para teste. No ambiente de build, o host `epics.zip` respondeu com HTTP 403 a chamadas Xtream; por isso a validação dos cards reais deve ser confirmada no aparelho, na mesma rede que consegue acessar a lista original.
