# Requisitos externos — configuração remota do UltraPlayer

Fonte fornecida pelo usuário: `ULTRA_PLAYER_MENSAGEM_PARA_DESENVOLVEDOR.pdf`.

Rota obrigatória descrita no documento:

`GET https://renciaapp.manus.space/api/v5/ultra-config?mac={MAC_DO_APARELHO}`

O campo `mac` aceita os formatos `AA:BB:CC:DD:EE:FF` ou sem separadores. O dispositivo deve estar cadastrado no painel com o aplicativo Ultra Player e status Liberado.

Resposta esperada, conforme o documento:

```json
{
  "registered": true,
  "allowed": true,
  "mac": "AA:BB:CC:DD:EE:FF",
  "app_name": "Ultra Player",
  "impact_phrase": "",
  "message_title": "",
  "message_text": "",
  "server_api_url": "https://...",
  "apk_download_url": "https://.../ultra-player.apk",
  "apk_version": "1.0.0",
  "logo_url": "https://...",
  "banner_url": "https://...",
  "background_url": "https://...",
  "message_image_url": "https://...",
  "icons": {
    "live_tv": "https://...",
    "movies": "https://...",
    "series": "https://..."
  }
}
```

Os três botões principais devem usar `icons.live_tv`, `icons.movies` e `icons.series`. URLs vazias ou downloads que falhem devem preservar os ícones padrão do APK. Todas as chamadas devem usar HTTPS. Se `registered` ou `allowed` for `false`, o aplicativo não deve iniciar a reprodução. O documento também exige que a configuração seja consultada na abertura e possa ser guardada em cache temporário.
