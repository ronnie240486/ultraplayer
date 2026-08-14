# UltraPlayer 4.27.0 — YouTube interno para trailers

A versão 4.27.0 substitui a abertura externa dos trailers por uma `TrailerActivity` nativa do próprio UltraPlayer. O botão Trailer agora inicia essa tela em paisagem, com um WebView interno que carrega a busca ou a URL do YouTube, uma barra superior com o título e o botão **← Voltar**. O usuário permanece dentro do APK; não é enviado para o aplicativo YouTube nem para o navegador externo.

A tela interna mantém JavaScript, armazenamento DOM, cookies de terceiros e navegação do YouTube no próprio WebView. Links clicados dentro do YouTube continuam na Activity. O botão Voltar fecha a tela interna; quando houver histórico de navegação dentro do WebView, o primeiro voltar retorna à página anterior do YouTube e o seguinte fecha o trailer.

Os botões Trailer continuam presentes nos cards de filmes e séries, na busca, nos detalhes de filmes, nos detalhes de séries e nos detalhes M3U. Quando a lista fornece uma URL de trailer HTTP/HTTPS, ela é carregada diretamente; caso contrário, o aplicativo abre uma busca do título com “trailer oficial”. A reprodução do filme, série ou episódio permanece separada do WebView do trailer.

O APK foi compilado com R8, redução de recursos, alinhamento e assinatura de teste. Package: `com.ultraplayer.app`; versionName: `4.27.0`; versionCode: `65`; tamanho: `3.431.131 bytes`; SHA-256: `dd726b7e4787ab0adc6d610b47fa11e19ce5991b7ee33319cbe2f8d47c625469`.
