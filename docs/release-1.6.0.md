# UltraPlayer 1.6.0 — classificação e layout mobile

A versão 1.6.0 corrige três problemas observados no aparelho Android.

Primeiro, a classificação da M3U agora prioriza o `group-title`. Grupos de filmes/VOD entram em Filmes; grupos de séries, novelas, temporadas ou episódios entram em Séries; grupos de canais entram em Canais. Em grupos mistos, o aplicativo somente escolhe Séries quando o título ou o caminho contém evidência de episódio/temporada; caso contrário, o item fica em Filmes. Caminhos `/live/`, `/movie/` e `/series/` também são usados como sinais de classificação.

Segundo, cards recentes e recém-adicionados agora têm uma capa de fallback com iniciais e gradiente quando o servidor não fornece `tvg-logo`. Isso evita cards vazios e mantém a navegação visual mesmo para entradas sem imagem.

Terceiro, a home dinâmica `zx-home2` recebeu regras exclusivas para telas de até 600 pixels em orientação retrato. A navegação passa a usar duas colunas, cards de altura fixa e ícones menores; os cards recentes ficam em uma fileira horizontal compacta. A regra não altera o layout amplo usado em TV/paisagem.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `1.6.0`, versionCode `7` e `minSdk 21`. A validação confirmou a sintaxe JavaScript, o branding sem referências antigas e a presença do Media3/ExoPlayer no módulo nativo.
