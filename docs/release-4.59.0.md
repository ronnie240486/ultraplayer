# UltraPlayer 4.59.0 — TV Box sem chamadas duplicadas

A versão **4.59.0** (`versionCode 97`) continua a otimização da abertura da TV Box.

## O que foi corrigido

A configuração remota do UltraPlayer não é mais consultada duas vezes durante o boot. A chamada antiga de branding genérico também foi removida; o app mantém a fonte exclusiva `ultra-config`. A sincronização das listas por MAC foi retirada do caminho crítico e começa depois que a Home já está navegável.

A primeira contagem dos catálogos foi deslocada para cinco segundos e a fileira **Para você** para cinco segundos na TV Box. Rádios e recomendações continuam disponíveis, mas são carregados depois da primeira pintura e não competem com o foco do controle remoto.

Quando já existe uma playlist salva, a Home é liberada imediatamente usando o servidor da própria playlist. A confirmação do painel continua em segundo plano.

## Interatividade preservada

O microfone principal continua direto: “Space HD” abre o canal sem uma tela intermediária. O player único, EPG, Meus Alertas, fila, favoritos, retomada, volume por voz, PIN infantil e modo Celular permanecem preservados. O controle remoto pelo celular continua fora do projeto.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Boot com `eagerHome`: presente.
- Branding duplicado no boot: removido.
- Sincronização de lista fora do caminho crítico na TV Box: presente.
- Contagens e recomendações adiadas: presentes.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.59.0-fast-dedup-release.apk`.
- SHA-256: `daa2934bc95cebf1c3a877ea8af1ad6d369eed0c82d3f7d85a64707a397b2ade`.

A velocidade final depende da TV Box, da rede e do provedor da lista. Esta versão remove esperas e consultas duplicadas do aplicativo antes da Home.
