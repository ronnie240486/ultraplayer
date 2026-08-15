# UltraPlayer 4.49.0 — Favoritos por voz

A versão **4.49.0** (`versionCode 87`) adiciona uma ação interativa de voz ao fluxo rápido do UltraPlayer.

## Comandos adicionados

Durante a reprodução ou em uma tela de detalhe, o usuário pode tocar no microfone principal e dizer **“favoritar”**, **“adicionar aos favoritos”** ou **“salvar este”**. O app usa o mesmo armazenamento de Favoritos já existente e mostra uma confirmação breve na tela.

Para desfazer, o usuário pode dizer **“remover dos favoritos”** ou **“tirar dos favoritos”**. O comando é idempotente: se o conteúdo já estiver favoritado, “favoritar” não cria duplicação; se não estiver nos favoritos, “remover” não adiciona por engano.

## Compatibilidade preservada

O botão principal continua iniciando diretamente o reconhecimento, sem abrir o painel conversacional. Comandos específicos de canal, como **“Space HD”**, continuam sendo encaminhados para a abertura direta do canal. Pausar, continuar, tela cheia, busca por voz, EPG, alarmes, retomada rápida e favorito pelo coração da Home permanecem disponíveis.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Roteador de voz direto e `playVoiceExact()`: presentes.
- Intenção de EPG: presente.
- Pausar e continuar no player: presentes.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.49.0-voice-favorite-release.apk`.
- SHA-256: `1868beb31b6b1ec32d3e64cdf1d3e24ce876062830abb4bb5457b42ebb99cfcf`.
