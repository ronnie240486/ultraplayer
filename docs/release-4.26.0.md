# UltraPlayer 4.26.0 — trailers e abertura rápida de VOD

A versão 4.26.0 acelera a entrada em Filmes e Séries evitando consultas simultâneas duplicadas. O carregamento antecipado iniciado após a home agora compartilha a mesma promessa com a tela aberta pelo usuário; assim, a seção não dispara uma segunda carga enquanto o catálogo ainda está chegando.

Cada card de filme e série passou a ter o botão **Trailer**. O toque no card continua abrindo o detalhe normalmente; o toque no botão Trailer interrompe a navegação do card e abre uma busca oficial no YouTube com o título e o termo “trailer oficial”. Quando a lista ou o detalhe fornece uma URL de trailer, essa URL direta é usada primeiro. Filmes, séries e resultados da busca usam o mesmo comportamento.

Os detalhes de Filme, Série e M3U também exibem o botão Trailer ao lado de Reproduzir e Favoritos. No Android nativo Java, a ponte `HdxNative.openUrl` abre somente URLs HTTP/HTTPS por `ACTION_VIEW`, permitindo que o YouTube ou o navegador instalado reproduza a prévia sem misturá-la ao ExoPlayer do conteúdo principal. Os botões têm foco visível para controle remoto e escala própria para Celular e TV Box.

O APK foi compilado com R8, redução de recursos, alinhamento e assinatura de teste. Package: `com.ultraplayer.app`; versionName: `4.26.0`; versionCode: `64`; tamanho: `3.430.136 bytes`; SHA-256: `0a31d8dc1f30814ed5e2774839351a39519b5789ec2b7e2eb2c2bb363972a1e3`.
