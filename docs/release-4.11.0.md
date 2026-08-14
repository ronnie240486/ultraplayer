# UltraPlayer 4.11.0 — países, Brasil e player manual

A versão 4.11.0 aprimora a tela de rádios online. O catálogo passa a ter uma categoria **Brasil • Conhecidas**, que consulta emissoras brasileiras por país e por nome, incluindo Estação Pop, Antena 1, Jovem Pan, Jovem Pan News, BandNews FM, CBN, Kiss FM, Alpha FM, Nativa FM, Mix FM, Transamérica, 89 FM, Top FM, Itatiaia, Rádio Globo, Rádio Bandeirantes e Gazeta quando suas entradas públicas estão disponíveis e verificadas.

A tela de rádios agora contém um filtro de país. Os países são descobertos a partir da categoria ativa, com Brasil ordenado no topo quando disponível, e o usuário pode combinar país, categoria e busca textual. As categorias musicais continuam separadas entre Gospel, Rock, Pop, Sertanejo, Clássica, Blues, Jazz, Metal e Heavy Metal.

O player também foi ajustado para não abrir mini player automaticamente em cada conteúdo. Os cards de rádio chamam a reprodução direta em tela cheia. Filmes e séries já utilizam o mesmo caminho direto. Depois de voltar ou fechar uma reprodução direta, o mini player é encerrado e não permanece sobre a tela. O mini player continua disponível somente para as situações em que o usuário abre intencionalmente um preview, como a navegação de canais ao vivo, e a reprodução continua usando a mesma instância nativa.

A verificação de emissoras brasileiras foi feita no diretório público Radio Browser, usando consultas por nome e `countrycode=BR`, sempre preservando apenas streams confirmados pelo catálogo. O Radio Browser e sua documentação comunitária informam que a API fornece nomes, tags, streams resolvidos, páginas oficiais e favicons para uso em aplicativos.

Referências:

1. Radio Browser — https://www.radio-browser.info/
2. radio-browser-api — https://github.com/ivandotv/radio-browser-api

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.11.0`, versionCode `48`, build debug. SHA-256: `e39fdc641aa33af86c8a4bd1cc45fd63672f44df1883cb8c506913c622a77a44`.
