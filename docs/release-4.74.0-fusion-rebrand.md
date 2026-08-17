# Fusion 4.74.0 — Reidentificação visual

## Escopo

Esta versão transforma a marca visível do aplicativo em **Fusion**, usando o logo enviado pelo usuário como asset principal do APK e da interface WebView.

## Alterações aplicadas

- Nome visível do aplicativo alterado para `Fusion` no Manifest, splash nativo, splash HTML, tela de login, configurações, Home, rodapé, avisos, telas de primeiro uso e mensagens de saída.
- Logo Fusion aplicado ao ícone Android (`fusion_launcher.png`), ao splash nativo e ao fallback visual interno do WebView.
- Marca d’água visual `FUSION` aplicada à Home e às telas que usam a identidade visual compartilhada.
- User-Agent de WebView, player, trailer, M3U e atualizador identificados como Fusion.
- Arquivo de backup local alterado para `fusion-backup-YYYY-MM-DD.json`.
- Backups antigos cujo campo `app` seja `UltraPlayer` continuam aceitos para não perder dados já exportados.
- O `applicationId` continua `com.ultraplayer.app` propositalmente, permitindo atualização direta sobre instalações anteriores e evitando que o Android trate o Fusion como um aplicativo completamente separado.
- Endpoints, autenticação MAC, listas, TMDB, EPG, player Media3/ExoPlayer, UltraSession, orientação landscape e layout Celular/TV Box não foram alterados.
- O branding principal passa a usar o logo Fusion fixo; o contrato do endpoint `/api/v5/ultra-config` continua reservado às configurações próprias do aplicativo.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Busca de textos visíveis antigos (`UltraPlayer`, `ultraplayer_launcher` e splash antigo): nenhum resultado.
- Build `assembleRelease` com R8: aprovado.
- APK final: 6.506.054 bytes.
- Assinatura inicial ZIP do APK: `PK`.
- SHA-256: `89658a2d158befd7ac008e9d492ec2eb2dc790dbb488552fe9b88a43e245ffd8`.

## Instalação e atualização

Como o `applicationId` e a assinatura de teste foram mantidos, o APK deve ser instalável sobre a versão anterior do UltraPlayer. Depois da instalação, o nome exibido pelo Android será Fusion. Para atualização interna, publique um link HTTPS direto para este APK no campo próprio do painel, sem página HTML intermediária e sem acrescentar outro nome de arquivo à URL.

## Observação sobre referências internas

Os nomes técnicos de pacote Java, namespace, endpoint `ultra-config` e alguns identificadores de compatibilidade não foram renomeados. Essa decisão evita quebrar atualizações, backups antigos, contratos do backend e o MAC virtual já cadastrado no painel. Eles não aparecem na interface do usuário.
