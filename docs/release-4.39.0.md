# UltraPlayer 4.39.0 — Ultra Assistente e Busca Universal

A versão **4.39.0** (`versionCode 77`) inicia a evolução do UltraPlayer para uma plataforma de TV interativa, preservando o player único, a orientação horizontal, a autenticação atual, o branding `ultra_*`, a navegação D-pad e a compatibilidade M3U/Xtream.

## Recursos adicionados

| Recurso | Comportamento |
|---|---|
| Ultra Assistente local | O botão de voz da Home passa a ser identificado como Ultra Assistente e entende intenções de navegação sem depender de serviço externo. |
| Navegação por voz | Comandos como “abrir canais”, “abrir filmes”, “abrir séries”, “abrir rádios gospel”, “abrir favoritos”, “abrir playlist”, “abrir configurações” e “voltar” executam a ação correspondente. |
| Busca universal | Novo botão de busca na Home e rota “Buscar em tudo”, com pesquisa simultânea em Canais, Filmes e Séries. |
| Resultados agrupados | A busca universal separa os resultados em Canais, Filmes e Séries, mantendo cards, capas, trailers e navegação existentes. |
| Proteção infantil | A busca universal e a busca por voz reaproveitam o filtro do perfil infantil para não mostrar conteúdo adulto bloqueado. |
| Controle do player por voz | “Pausar”, “continuar” e “abrir tela cheia” controlam o mesmo Media3/ExoPlayer, sem criar um segundo player. |
| Compatibilidade TV Box | Botões, foco e cards permanecem navegáveis por D-pad e continuam em paisagem. |

## Exemplos de comandos

- “Abrir canais”.
- “Abrir filmes”.
- “Abrir séries”.
- “Abrir rádios gospel”.
- “Abrir favoritos”.
- “Buscar em tudo”.
- “Pausar”.
- “Continuar”.
- “Abrir tela cheia”.
- “Voltar”.

## Privacidade e desempenho

A primeira camada do assistente é determinística e local. O texto reconhecido não é enviado a um modelo externo para executar esses comandos, e credenciais, MAC e URLs de playlists não participam da interpretação. A busca usa os catálogos já carregados ou em cache; cada seção é consultada em paralelo apenas quando necessário e a Home continua sendo renderizada antes das atualizações secundárias.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- Compilação Java com a nova ponte `miniPause`, `miniResume` e `miniFullscreen`: aprovada.
- APK: `releases/UltraPlayer-4.39.0-assistant-search-release.apk`.
- SHA-256: `b5d2e703c48d689ddf048181471b927e8ae4b1a074ba0128f445fd67ba74cf23`.

## Próximas etapas

As próximas etapas do roadmap acrescentarão Home personalizada por perfil, recomendações, EPG inteligente por linguagem natural, perfil infantil com limites de horário, acessibilidade, diagnóstico de conexão e modo ambiente. A sincronização entre dispositivos e um diálogo remoto opcional serão tratados depois, com autenticação e proteção de dados.
