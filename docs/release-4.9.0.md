# UltraPlayer 4.9.0 — resultados múltiplos e reprodução VOD

A versão 4.9.0 corrige dois problemas reportados no modo Android.

A busca por voz não inicia mais automaticamente filmes ou séries, mesmo quando o nome tem duas ou mais palavras. Uma consulta como “The Walking Dead” permanece na tela de resultados e mostra todos os itens encontrados em filmes e séries para que o usuário escolha a versão correta. A abertura direta por voz continua reservada ao canal ao vivo com nome específico, como “Space HD”.

A reprodução nativa de filmes e episódios foi corrigida removendo o `history.back()` executado imediatamente depois de `HdxNative.play()`. Esse retorno re-renderizava o detalhe, acionava `setHtml()` e chamava `miniStop()` sobre o mesmo player compartilhado, causando o piscar da tela e encerrando o vídeo antes de abrir. Agora o detalhe permanece atrás do player nativo, sem interromper a sessão de reprodução.

A correção vale tanto para filmes quanto para episódios de séries e não altera o player compartilhado de canais ao vivo.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.9.0`, versionCode `45`, build debug. SHA-256: `28c68c127679c80b465ae374cfa81b1969c2e16ba8b7ba496fb39757453a35b1`.
