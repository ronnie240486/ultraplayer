# UltraPlayer 4.51.0 — Evolução interativa completa

A versão **4.51.0** (`versionCode 89`) reúne a próxima camada interativa do UltraPlayer, mantendo o comando de voz direto e excluindo controle remoto pelo celular.

## Minha Fila

Foi criada uma fila pessoal armazenada localmente e separada por perfil. O usuário pode dizer **“adicionar à fila”**, **“guardar na fila”**, **“ver depois”**, **“remover da fila”** ou **“minha fila”**. A fila também aparece na Home com contador e possui uma tela própria. Filmes, séries e canais podem ser guardados; no perfil infantil, itens adultos são filtrados.

## Alertas locais

Foi criada a tela **Meus Alertas**, acessível por voz com **“meus alertas”** ou **“meus alarmes”**. Ela lista os avisos futuros do EPG, mostra título, canal e horário e permite remover cada alerta. A criação continua usando os sinos existentes e o modal de contagem regressiva.

## PIN do responsável

O PIN adulto local, configurável em Configurações, passa a proteger operações administrativas de perfis: editar perfis, criar perfil novo, apagar perfil e desativar o modo infantil. A simples troca entre perfis continua livre. O PIN não é enviado ao painel.

## Voz e estabilidade preservadas

O botão principal continua iniciando diretamente o reconhecimento. **“Space HD”** continua abrindo o canal diretamente sem abrir o assistente conversacional. Pausa, retomada, tela cheia, volume, silenciar, favoritos por voz, retomada rápida, EPG e player único permanecem disponíveis.

O controle remoto pelo celular **não foi implementado** e não faz parte do aplicativo.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Rotas `/queue` e `/alerts`: presentes.
- Fila por perfil e filtragem infantil: presentes.
- Gate do PIN do responsável: presente.
- Roteamento de voz direto e abertura exata de canais: presentes.
- EPG, alarmes, pausa, volume e player nativo: preservados.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.51.0-complete-future-release.apk`.
- SHA-256: `4ebd67b2c141cf4c2fd7b87644c26a28e4dcc486f8fac9bd2a51f6e65845f454`.
