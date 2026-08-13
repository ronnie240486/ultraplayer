# UltraPlayer 3.1.0 — configuração remota do painel

O APK agora consulta, ao abrir, o endpoint HTTPS `https://renciaapp.manus.space/api/v5/ultra-config?mac={MAC}` usando o identificador exibido para o aparelho. A resposta é armazenada em cache temporário para manter a aparência configurada quando o painel estiver momentaneamente indisponível.

Os campos `icons.live_tv`, `icons.movies` e `icons.series` são usados nos três botões principais da home. Se uma URL estiver vazia ou falhar, o SVG padrão do APK permanece em seu lugar.

Também foram ligados `app_name`, `logo_url`, `banner_url`, `background_url`, `message_title`, `message_text`, `message_image_url`, `impact_phrase`, `server_api_url`, `apk_download_url` e `apk_version` ao estado remoto do aplicativo. A home aplica logo, banner, fundo, texto e ícones sem exigir recompilação quando o painel altera esses valores.

Quando a resposta do painel informa `registered: false` ou `allowed: false`, a reprodução nativa é bloqueada. O APK continua mostrando a ativação por MAC, mas não inicia canais, filmes ou séries sem liberação.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `3.1.0`, versionCode `22` e build debug.
