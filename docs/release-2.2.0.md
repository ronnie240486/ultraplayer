# UltraPlayer 2.2.0 — logo interno, comando de voz e EPG

A versão 2.2.0 usa o logo fornecido pelo usuário também dentro do WebView. O cabeçalho, a tela de login e as áreas que renderizam a marca carregam `assets/branding/ultraplayer_launcher.png`; a marca remota antiga não substitui mais esse símbolo local.

A home ganhou um botão de microfone. No Android, o botão solicita `RECORD_AUDIO` apenas na primeira utilização e abre o reconhecimento nativo em português do Brasil. O resultado volta para o WebView e passa pelo catálogo atualmente carregado.

Os comandos seguem uma busca sem acentos e tolerante a verbos de ação. Um comando com correspondência única forte em canal abre o canal diretamente, por exemplo `Space HD`. Uma busca mais ampla, como `Space`, mostra todos os canais correspondentes. Para filmes e séries, título exato abre o detalhe diretamente; termo parcial mostra os resultados encontrados. Exemplos: `Esqueceram de mim 1` e `Esqueceram`.

O EPG foi retirado da dependência exclusiva do shim do `tv.js`. Ao focalizar um canal, o WebView consulta diretamente `get_short_epg` pelo catálogo Xtream e aceita `epg_listings`, `epg`, `programs` e respostas em array. Títulos base64 e títulos em texto simples são tratados sem decodificação indevida.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `2.2.0`, versionCode `13` e permissão `RECORD_AUDIO`. A build é debug para testes.
