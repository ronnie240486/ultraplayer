# UltraPlayer 2.0.0 — perfis, marca e temas globais

A versão 2.0.0 estabiliza a tela de edição de perfis. O cartão não é mais redimensionado por `scale()` pelo WebView, usa largura limitada ao viewport, fica centralizado e pode rolar verticalmente no celular. Isso evita o deslocamento lateral e o efeito de a aba andar para um lado e para o outro.

O Perfil infantil agora é salvo individualmente em cada perfil. Quando ativado, o catálogo Xtream e o fallback M3U removem categorias e itens identificados como adultos pelas mesmas regras de conteúdo adulto já existentes no aplicativo. A opção aparece como um cartão com chave liga/desliga no editor de perfil.

Foi adicionado um símbolo premium do UltraPlayer em PNG transparente, usado junto do nome da marca no cabeçalho, login, perfis e telas que renderizam `brandLogoHtml()`.

Configurações ganhou o menu **Cores do aplicativo**, com seis temas: Verde esmeralda, Branco, Preto, Amarelo, Verde-musgo e Azul oceano. Cada tema altera a cor de destaque, fundo, painéis, textos, bordas, foco, botões, perfis e configurações. A seleção é persistida em `localStorage` e restaurada antes do primeiro render.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `2.0.0`, versionCode `11` e `minSdk 21`. A build é debug para teste.

> Observação: o logo do painel/branding remoto continua tendo prioridade quando `logo_url` é fornecido pelo servidor. Na ausência dele, o logo UltraPlayer local é usado.
