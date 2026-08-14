# UltraPlayer 4.47.0 — Retomada rápida

A versão **4.47.0** (`versionCode 85`) adiciona uma melhoria interativa segura à Home: conteúdos com progresso salvo agora podem ser retomados diretamente pela fileira **Assistido Recentemente**.

## Comportamento

Quando um filme possui posição salva entre o início e o fim, tocar no card abre imediatamente o player no ponto salvo. Para séries, o app usa o último episódio registrado em `zx_slast_*`, preserva a extensão do episódio e abre a reprodução no ponto salvo. O card recebe o rótulo **“Continuar”**, o tempo restante e uma barra de progresso.

Quando não há posição válida, o card continua abrindo a tela de detalhes como antes. Conteúdo infantil continua sujeito ao filtro do perfil ativo, e a recomendação não cria novas chamadas de rede.

## Compatibilidade preservada

A alteração não modifica o botão principal de voz, que continua iniciando diretamente o reconhecimento para comandos como “Space HD”. O EPG, seus sinos, alarmes e modal de contagem regressiva não foram alterados. O mini player, o player completo, a reprodução nativa e o layout corrigido do Celular/TV Box também foram preservados.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Rotas de retomada para filmes e episódios verificadas.
- Fallback para a tela de detalhes quando não existe progresso válido.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.47.0-quick-resume-release.apk`.
- SHA-256: `5964c24e3aefe145a940c6016e7be207f5d48ad467f7d2897c7f2cab50206287`.
