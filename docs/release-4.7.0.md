# UltraPlayer 4.7.0 — categorias completas e sino visível no EPG

A versão 4.7.0 corrige o menu do player grande que mostrava somente “Todos”. Para canais ao vivo, o aplicativo agora monta uma lista completa a partir de `S.cat.live.all`, resolve o nome de cada categoria Xtream pelo `category_id` quando necessário e usa o grupo do item em playlists M3U. O payload do player passa a carregar todos os canais e suas categorias, permitindo abas como Globo, SBT, Abertos e as demais categorias disponíveis, além da aba Todos.

O painel transparente continua com categorias na faixa horizontal superior e canais na lista vertical. A seleção de uma categoria filtra a lista sem sair do player grande; tocar em um canal troca a mídia no mesmo `ExoPlayer`.

O EPG foi reestruturado. Cada item agora contém um bloco `.epg-copy` com horário e nome do programa e um botão de sino ao lado, no mesmo layout flexível. O sino deixou de depender de posicionamento absoluto e permanece visível dentro da linha, inclusive no modo Celular.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.7.0`, versionCode `41`, build debug. SHA-256: `7c7135bbcacf0f8a8877c88f414e69274beaa776e9c36442ff32d36550dbc3f0`.
