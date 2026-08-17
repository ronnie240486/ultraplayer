# Fusion 4.74.2 — Ícone preenchido

## Correção

O launcher anterior apresentava uma área preta grande ao redor do emblema Fusion quando o Android aplicava a máscara circular. Nesta versão foi criado um asset específico para o ícone: o emblema vermelho foi ampliado para ocupar melhor a área útil do quadrado, mantendo o anel completo e o triângulo de reprodução visíveis.

## Separação dos assets

O recurso `fusion_launcher.png` é usado exclusivamente pelo launcher Android e contém a composição ampliada. O recurso `fusion_logo.png` preserva o logo vermelho original para o splash nativo. O WebView continua usando o logo original em `assets/branding/fusion_launcher.png`, para que as telas internas não fiquem excessivamente ampliadas.

Essa separação corrige o problema mostrado no launcher sem deformar ou cortar o logo grande dentro do aplicativo.

## Compatibilidade

O `applicationId` continua `com.ultraplayer.app`, o nome permanece Fusion e a versão usa `versionCode 119`, permitindo atualização sobre o Fusion 4.74.1. Player, listas, autenticação, TMDB, EPG, UltraSession, temas, Celular e TV Box não foram alterados.

## Validação

A sintaxe JavaScript passou em `node --check` e o build `assembleRelease` com R8 foi concluído com sucesso. O APK final tem 8.142.533 bytes, assinatura inicial ZIP `PK` e SHA-256 `56dbb570f2cd8e881b6968fff5ea8b327ab2a3b1f76c77530d15c2d34bb4e15a`.

O launcher ampliado tem SHA-256 `d08d2114dd0b4b2c57a3786905f45ac9d23cb35f425db6b6e17aa6d615680623`. O logo interno original tem SHA-256 `5f6577190a34974178e448ead223bcd12c5f909a08168ee514a6cd25940c6704`.
