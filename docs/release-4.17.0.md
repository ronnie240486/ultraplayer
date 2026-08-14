# UltraPlayer 4.17.0 — logos reais dos canais na TV Box

A versão 4.17.0 restaura e amplia os logos reais dos canais na tela de TV Box. Os cards agora mantêm a imagem recebida no campo `stream_icon`, carregada diretamente após a renderização da categoria. Quando a imagem termina de carregar, o fallback de televisão é ocultado; se uma URL falhar, o fallback continua disponível sem deixar o card vazio.

Na TV Box, o bloco do canal passou a ter 64 px de altura e o logo usa 36 × 36 px, igualando a escala visual do modo Celular. O nome usa 14 px e o número usa 11 px. O ajuste preserva a largura da coluna, a lateral de categorias, o player e a navegação horizontal.

A home também mantém a correção de fundo: o painel fornece `background_url`, aplicado diretamente no `#app-root` com cobertura completa, enquanto a arte antiga e o gradiente do APK ficam fora da tela principal.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.17.0`, versionCode `54`, build debug. SHA-256: `eaa56aae3b2d8af2b61febdd0c2e09045b6ba0a07ace939c34c4e98879e23003`.
