# UltraPlayer 4.20.0 — fundo sincronizado com as abas de conteúdo

A versão 4.20.0 reforça a sincronização do fundo da tela principal com as abas de Canais, Filmes e Séries. Além do branding recebido durante o login, o aplicativo consulta diretamente `https://renciaapp.manus.space/api/v5/check_mac.php?mac=...` pelo MAC do aparelho e lê o campo `bg_url`, que é a imagem selecionada no painel.

Quando o endpoint `ultra-config` retorna sem imagem, o valor de `bg_url` não é apagado. A URL é reaplicada diretamente no `#app-root`, que cobre a home completa com `background-size: cover`, posição central e sem repetição. A arte antiga, o gradiente radial e a marca d’água da home continuam removidos.

A correção é compatível com login por MAC e por usuário/senha, porque o MAC Android continua disponível para localizar a configuração visual do aparelho. O catálogo, os cards, os canais e o player não foram alterados.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.20.0`, versionCode `57`, build debug. SHA-256: `57e178b49754bc7af0615688d0c02f4502dbb482414b81674329515336bbe440`.
