# UltraPlayer 4.44.0 — Ultra Assistente conversacional

A versão **4.44.0** (`versionCode 82`) inicia a camada conversacional do aplicativo do futuro sem substituir o comando de voz local.

## O que mudou

| Área | Comportamento |
|---|---|
| Painel conversacional | Ao tocar no microfone da Home, o UltraPlayer abre o painel “Ultra Assistente” com histórico de mensagens, campo para digitação, botão de voz e respostas. |
| Sugestões rápidas | O painel oferece atalhos para Para você, Filmes, Séries, Canais e Pausar. |
| Voz dentro da conversa | A frase reconhecida aparece como mensagem do usuário e é encaminhada para as mesmas intenções locais existentes. |
| Busca por intenção | Consultas que não são comandos de tela são encaminhadas para Canais, Filmes e Séries, mantendo o filtro infantil e a busca por frase completa. |
| Ações reais | Abrir telas, pausar, continuar, tela cheia, abrir Rádios, criar alarme de EPG e voltar continuam usando as funções reais do aplicativo. |
| Respostas orientativas | O assistente explica o que pode fazer e responde localmente a perguntas de recomendação, sem depender de um modelo remoto. |
| TV Box | O painel possui tamanho maior, foco visível e pode ser operado pelo D-pad. |
| Celular | O painel ocupa somente a área necessária, adapta-se à largura e mantém entrada por toque e teclado. |
| Privacidade | O texto e a interpretação inicial ocorrem localmente; nenhum histórico de conversa, senha, MAC ou URL privada é enviado para um serviço externo. |
| Fallback | Se voz ou internet não estiverem disponíveis, o usuário ainda pode digitar e usar comandos locais, busca em cache e navegação normal. |

## Exemplos de uso

- “Abrir filmes”.
- “Buscar The Walking Dead”.
- “Abrir rádios gospel”.
- “Pausar”.
- “Continuar”.
- “Abrir tela cheia”.
- “Me avise quando começar o jornal”.
- “O que posso assistir agora?”.

## Funcionamento intencional

Quando o comando pede uma ação, como abrir Filmes ou pausar, o painel fecha e o aplicativo executa a ação. Quando a frase é uma busca, o painel fecha e a tela de resultados mostra os títulos encontrados. Quando a frase pede orientação ou recomendação, a resposta aparece dentro do próprio painel.

Esta etapa não adiciona um modelo remoto nem uma conversa aberta de conhecimento geral. Isso foi mantido intencionalmente para preservar velocidade, privacidade e funcionamento na TV Box. Uma camada remota opcional poderá ser adicionada depois, com consentimento e configuração no painel.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Painel conversacional, respostas, microfone e roteamento de ações verificados.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.44.0-conversational-assistant-release.apk`.
- SHA-256: `e40278cae2f7d6b2b1813e230454290001fdf7b3f67a4a3990a53cc8cfa2b6cc`.

## Próximas evoluções

As próximas camadas previstas são respostas baseadas no catálogo atual, recomendações explicadas, sincronização opcional de progresso entre dispositivos e intenções de EPG mais abrangentes. Todas deverão preservar o modo local como fallback padrão.
