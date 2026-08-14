# UltraPlayer 4.45.0 — Microfone unificado

A versão **4.45.0** (`versionCode 83`) corrige a confusão causada pela abertura simultânea do reconhecimento de voz antigo e do novo Ultra Assistente.

## Comportamento novo

| Ação | Resultado |
|---|---|
| Tocar no microfone da Home | Abre somente o painel do Ultra Assistente. O reconhecimento ainda não começa automaticamente. |
| Tocar no microfone dentro do painel | Inicia o único reconhecimento de voz e mostra o estado “Ouvindo”. |
| Falar no painel | A frase aparece na conversa e é encaminhada para comandos, busca, player e EPG. |
| Digitar no painel | Executa o mesmo fluxo de intenção da voz. |
| Botão Falar da busca universal | Retorna ao mesmo painel conversacional, sem iniciar um segundo fluxo. |
| Fechar o painel | Encerra somente a interface do assistente, sem criar outro microfone. |

## Fluxo unificado

O botão superior da Home não chama mais `startVoiceCommand()` diretamente. Ele chama somente `renderAssistantPanel()`. A função `startVoiceCommand()` ficou ligada ao botão `zxAssistantMic` interno do painel. Assim, não há dois microfones, dois prompts ou duas interfaces abertas ao mesmo tempo.

## Preservado

A ponte Android `HdxNative.startVoice()`, o reconhecimento em português, os comandos locais, a busca universal, o player, o EPG por voz, a navegação por D-pad e a compatibilidade Celular/TV Box foram preservados.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Abertura direta Home → reconhecimento: 0 ocorrências.
- Abertura direta Busca → reconhecimento: 0 ocorrências.
- Microfone interno do painel → reconhecimento: 1 ocorrência.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.45.0-single-microphone-release.apk`.
- SHA-256: `9b106951a34958c4021214e947da16cbe557058ebce236292d2e9ac24d07d4d7`.
