# Pesquisa de fontes públicas para rádios

## Fonte principal

O Radio Browser informa que é um projeto comunitário, gratuito e com API aberta para uso em aplicativos. A página declara que os dados — nomes, tags, links de stream, páginas oficiais, idioma, país e estado — podem ser usados livremente, com os direitos acumulados dedicados ao domínio público. Fonte: https://www.radio-browser.info/

A documentação comunitária do wrapper `radio-browser-api` confirma que a API expõe `name`, `url`, `urlResolved`, `homepage`, `favicon`, `tags`, país, idioma, codec, bitrate e o estado atual de verificação do stream. O campo `urlResolved` é recomendado para reprodução porque resolve playlists, arquivos M3U/PLS/ASX e redirecionamentos HTTP. Fonte: https://github.com/ivandotv/radio-browser-api

## Estratégia para o catálogo Gospel

A categoria Gospel será alimentada por consultas de tags Gospel e variações equivalentes, com filtro de estações verificadas (`lastCheckOk`/estado online), remoção de duplicatas por identificador e URL, e limite de até 600 estações. O aplicativo poderá atualizar o catálogo pelo endpoint público em vez de empacotar 600 entradas fixas no APK, mantendo nomes, streams resolvidos e favicons atuais.

Quando uma estação não tiver stream verificado, ela não será apresentada como reproduzível. Se a interface incluir a estação por sua página pública, o card deve abrir a homepage, sem inventar um endpoint de áudio.

## Referências

1. Radio Browser — https://www.radio-browser.info/
2. radio-browser-api — https://github.com/ivandotv/radio-browser-api
