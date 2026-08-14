# UltraPlayer 4.13.0 — fundo único em tela cheia

A versão 4.13.0 remove a camada visual padrão do APK e elimina a duplicação causada pelo branding remoto. O gradiente padrão do elemento `.bg-diamonds` foi removido; quando não existe uma imagem configurada, o fundo fica apenas em cor sólida escura.

Quando o painel fornece uma imagem de fundo, o aplicativo aplica essa imagem uma única vez na camada global `.bg-diamonds`, com `background-size: cover`, `background-position: center` e `background-repeat: no-repeat`. As telas internas — home, live, rádios, busca, configurações e sidebar — ficam transparentes para não desenhar uma segunda cópia por cima. A imagem do usuário preenche toda a tela, mantendo proporção e sem mosaico/repetição.

Também não há arquivo de imagem de fundo embutido no diretório de assets do APK; a imagem é recebida pelo branding configurado. A alteração preserva logo, ícones, cards, reprodução e demais conteúdos.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.13.0`, versionCode `50`, build debug. SHA-256: `8f5c5adcf1bbaa2ff1f7ec8756c15e5098a2bb3bea4271b86874099d13b111a3`.
