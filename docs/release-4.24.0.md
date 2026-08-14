# UltraPlayer 4.24.0 — fundo em Configurações e abertura acelerada

A versão 4.24.0 aplica a mesma imagem `ultra_background_url` também na tela de Configurações. A home e Configurações usam camadas explícitas (`.zx-panel-wall` e `.zx-settings-wall`) com cobertura integral, centralização e transparência dos contêineres internos.

Para reduzir o tempo até a primeira tela de conteúdo, o aplicativo passou a manter cache em memória dos catálogos Xtream/M3U já carregados e a iniciar um pré-carregamento silencioso de Filmes, Séries e Canais depois que a home é exibida. O pré-carregamento é escalonado para não bloquear a primeira pintura da interface.

As rádios agora possuem cache por categoria e deduplicação de requisições simultâneas. A categoria Gospel é aquecida em segundo plano após a home, enquanto as demais categorias são carregadas na primeira abertura e permanecem disponíveis para reabertura rápida.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.24.0`, versionCode `61`, build debug. SHA-256: `a28bdc9cbfae07ba0a9ab774646cf987c0c56e7334c6ebdecf8eba3b6e51f123`.
