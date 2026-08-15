# UltraPlayer 4.57.0 — Acessibilidade e validade do painel

A versão **4.57.0** (`versionCode 95`) corrige os pontos mostrados na tela de Configurações e no rodapé.

## Texto maior

O botão agora amplia efetivamente os textos da tela de Configurações, incluindo menu lateral, títulos, descrições, botões, diagnósticos e campos de senha. A preferência continua salva no aparelho e é reaplicada depois de trocar de tela ou reabrir o aplicativo.

## Modo ambiente

O Modo ambiente é um descanso visual opcional da Home. Depois de 45 segundos sem toque ou comando do controle, ele mostra relógio, data, logo e fundo. Não é um modo de reprodução, não troca o player e não interrompe alarmes. Qualquer botão ou toque fecha o modo e devolve à Home.

## Vencimento e rodapé

A Home e Configurações voltam a usar a validade retornada pelo painel no login e na atualização das listas. O texto “Data da M3U não informada” foi removido. O rodapé mantém apenas uma identificação de usuário e não exibe mais o segundo campo visual `ID do aparelho`.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- CSS de Texto maior para Configurações: presente.
- Explicação do Modo ambiente: presente.
- Fallback `expire_date` do painel no login/listas: presente.
- MAC duplicado visual: removido.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.57.0-a11y-expiry-release.apk`.
- SHA-256: `a54c8111948bf24fb2bda4a2b62a3fd30b4b47890580fd5ebdce870af3c8f8c1`.
