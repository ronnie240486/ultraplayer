# UltraPlayer 4.10.0 — catálogo de rádios Gospel

A versão 4.10.0 adiciona um botão de rádio ao lado do microfone no cabeçalho da tela inicial. O botão abre a tela **Rádios online**, com busca, categorias e cards quadrados contendo logo, nome, país, codec e comando de reprodução.

A categoria Gospel consulta o Radio Browser por várias tags relacionadas — `gospel`, `christian`, `worship`, `religious`, `praise` e `contemporary christian` — combina as respostas, remove duplicatas por identificador e mantém apenas streams públicos cuja última verificação não esteja marcada como quebrada. A validação local encontrou 694 estações únicas online no conjunto de tags; a interface limita a lista exibida a 600 para manter o catálogo navegável e leve.

A tela também inclui Rock, Pop, Sertanejo, Clássica, Blues, Jazz, Metal e Heavy Metal. Cada categoria usa tags próprias e o catálogo é consultado dinamicamente, sem empacotar uma lista desatualizada no APK. A busca filtra por nome, país e tags. A rolagem é independente e os tamanhos são adaptados: Celular usa cards menores e Caixa TV usa cards mais compactos para navegação à distância.

Quando o usuário toca em um card com stream público, o endereço resolvido é enviado ao mesmo mini/player nativo do UltraPlayer, preservando a reprodução unificada. O Radio Browser documenta que `url_resolved` é apropriado para plataformas que não resolvem playlists e redirecionamentos por conta própria. As estações e metadados são provenientes de uma API pública e comunitária; o aplicativo não reivindica propriedade sobre os streams individuais.

Fontes consultadas:

1. Radio Browser — https://www.radio-browser.info/
2. Documentação comunitária do radio-browser-api — https://github.com/ivandotv/radio-browser-api

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.10.0`, versionCode `47`, build debug. SHA-256: `aec65872480a28e5e806a179ca27ca46e9858d0e6ec75eee8b2937bbdb04ef81`.
