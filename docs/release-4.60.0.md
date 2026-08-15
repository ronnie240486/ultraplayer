# UltraPlayer 4.60.0 — EPG inteligente por voz

A versão **4.60.0** (`versionCode 98`) acrescenta a próxima camada interativa do UltraPlayer sem alterar o microfone direto, o player único ou o EPG tradicional.

## Consultas de programação

O usuário pode tocar no microfone principal e dizer frases como “o que começa agora?”, “o que vai começar?”, “mostre a programação de hoje” ou “o que começa nos próximos 30 minutos?”. O aplicativo consulta o catálogo de Canais, reutiliza o cache EPG já carregado e busca a programação de até dez canais quando necessário.

Os resultados aparecem em uma tela própria de **Programação inteligente**, com nome do programa, canal, horário e sino individual. O usuário pode selecionar o sino por toque ou por OK do controle remoto; o mesmo alarme local e o mesmo modal de contagem regressiva de 10 segundos são utilizados.

A janela pode ser informada por voz de 10 a 180 minutos. Se o usuário não disser uma duração, o padrão é 30 minutos. A rotina filtra o perfil infantil antes de exibir os resultados.

## Compatibilidade preservada

O microfone principal continua direto: “Space HD” abre diretamente o canal, sem passar pelo assistente conversacional. Comandos de busca de filmes e séries, favoritos, fila, volume, pausa e tela cheia permanecem preservados. O EPG tradicional com sinos continua disponível na tela de Canais. O controle remoto pelo celular continua excluído.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Função de consulta inteligente: presente.
- Tela de resultados EPG: presente.
- Padrão de minutos: validado.
- Reaproveitamento de `toggleEpgAlarm`: presente.
- Voz direta: preservada.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.60.0-smart-epg-release.apk`.
- SHA-256: `07f0d58af2d7ab778be6fde17c33e2eba48738bc7bbb772d91a48d95a36b1c44`.

A programação exibida depende dos dados EPG fornecidos pela origem Xtream/M3U e dos canais disponíveis para o perfil ativo.
