# UltraPlayer 4.21.0 — branding isolado do UltraPlayer

A versão 4.21.0 corrige a separação entre UltraPlayer e OuroPro. Para branding visual, o APK chama exclusivamente:

`GET https://renciaapp.manus.space/api/v5/ultra-config?mac={MAC}`

O mapeamento usado é exclusivamente o seguinte:

| Chave | Uso no UltraPlayer |
|---|---|
| `ultra_logo_url` | Logo do aplicativo e cabeçalho |
| `ultra_banner_url` | Banner próprio do UltraPlayer |
| `ultra_background_url` | Imagem de fundo da tela principal |
| `ultra_message_image_url` | Imagem de mensagem/aviso do UltraPlayer |
| `ultra_icon_live_tv_url` | Ícone de TV ao Vivo |
| `ultra_icon_movies_url` | Ícone de Filmes |
| `ultra_icon_series_url` | Ícone de Séries |

O aplicativo não usa `bg_url`, `background_url`, `banner_url`, `logo_url`, `icons` ou qualquer outro campo visual genérico para branding. `check_mac.php` permanece somente no fluxo de autenticação e obtenção de listas, sem fornecer imagens ao UltraPlayer.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.21.0`, versionCode `58`, build debug. A auditoria JavaScript confirmou a rota única e as chaves `ultra_*`. SHA-256: `d62521332f2ac96c62e4f03fb291aa4c0e527f3fa0e0c72109e9eae297c095bd`.
