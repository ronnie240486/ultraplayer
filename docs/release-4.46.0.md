# UltraPlayer 4.46.0 — Voz direta restaurada

A versão **4.46.0** (`versionCode 84`) restaura o fluxo de voz que funcionava melhor na TV Box e no Celular.

## Comportamento principal

Ao tocar no botão de microfone da Home, o app inicia imediatamente o reconhecimento de voz. Não abre mais o painel conversacional antes da escuta.

O comando **“Space HD”** volta a ser processado diretamente pelo fluxo de busca por voz. Quando há uma correspondência exata ou específica de canal ao vivo, `playVoiceExact()` chama o player nativo e abre o canal imediatamente.

## Exemplos preservados

- “Space HD” → abre o canal Space HD diretamente quando encontrado.
- “Space” → mostra os canais correspondentes.
- “The Walking Dead” → mostra os resultados de filmes/séries para escolha.
- “Abrir filmes” → abre a tela de Filmes.
- “Pausar” → pausa o player atual.
- “Continuar” → continua o player atual.
- “Me avise quando começar…” → cria o alarme do EPG.

## Assistente conversacional

O painel conversacional da 4.45.0 não é mais aberto pelo botão principal. O fluxo rápido de voz é a experiência padrão. A estrutura conversacional permanece no código para uma futura entrada separada, mas não interfere no microfone principal.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Botão principal → `startVoiceCommand()` direto: confirmado.
- Busca universal → `startVoiceCommand()` direto: confirmado.
- Roteador `voiceExactHit()` e `playVoiceExact()` presentes.
- Chamadas de reprodução de canal ao vivo presentes.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.46.0-direct-voice-release.apk`.
- SHA-256: `a573cbd1efb85bf7cf1992629fa9108e9bdf99b767d81a62fea0eaccc969dffd`.
