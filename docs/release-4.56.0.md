# UltraPlayer 4.56.0 — Rodapé simplificado

A versão **4.56.0** (`versionCode 94`) ajusta o rodapé da tela principal conforme solicitado.

## Alterações

- Removido o segundo campo visual de MAC (`ID do aparelho`). O rodapé mantém apenas a identificação em `Usuário`.
- Removida a mensagem `Data da M3U não informada`.
- A Home e Configurações voltam a usar a validade do cadastro retornada pelo painel (`license.exp_date`, `info.exp_date` ou `info.expire_date`) para mostrar `Vencimento da lista`.
- A data é formatada em `dd/mm/aaaa`.

A validade exibida nesta versão representa a data cadastrada no painel, conforme a solicitação mais recente, e não tenta substituir esse valor por uma ausência de metadado da origem M3U.

## Validação

- JavaScript: `node --check` aprovado.
- Um único MAC visual no rodapé: confirmado.
- Fallback de validade do painel: confirmado.
- Mensagem `Data da M3U não informada`: removida.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.56.0-footer-clean-release.apk`.
- SHA-256: `d0f614fc54fec1b0f846b587b1a2cd0f10317eea22ab66eef76b6895aebf3175`.
