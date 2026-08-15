# UltraPlayer 4.48.0 — Favorito rápido na Home

A versão **4.48.0** (`versionCode 86`) adiciona uma ação interativa aos cards das fileiras **Assistido Recentemente** e **Para você**.

## Favorito rápido

Cada card de filme ou série agora apresenta um pequeno coração sobre a capa. O usuário pode adicionar ou remover o conteúdo dos Favoritos sem abrir a tela de detalhes. O estado utiliza o mesmo armazenamento local e a mesma função de favoritos já usada nos detalhes, mantendo os contadores sincronizados.

O controle tem foco visível, responde a toque, OK/Enter e barra de espaço e não interfere no clique principal do card. Tocar no restante do card continua abrindo o detalhe ou, quando houver progresso salvo, retomando diretamente o conteúdo.

## Compatibilidade preservada

O botão principal de voz continua iniciando diretamente o reconhecimento para comandos como “Space HD”. O EPG, os sinos, alarmes e o modal de programação não foram alterados. O mini player, o player completo, o carregamento de capas, a retomada rápida da 4.47.0 e os layouts Celular/TV Box foram preservados.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Hook `wireHomeQuickFavorites()` presente e conectado ao pós-render.
- Controles de favorito rápido presentes nas fileiras da Home.
- Voz direta, EPG e `playVoiceExact()` confirmados no código.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.48.0-quick-favorite-release.apk`.
- SHA-256: `40ae574ed1bdc3e95dff99b4e4b8cbe1691577a8d7e2e11d2cbbc9529d0a6837`.
