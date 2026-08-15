# UltraPlayer 4.64.0 — Minha Fila nos detalhes

A versão **4.64.0** (`versionCode 102`) coloca o atalho **Minha Fila** diretamente nos detalhes de Filmes, Séries e itens M3U.

## Ação rápida

A linha de ações dos detalhes agora apresenta Reproduzir, Trailer, Favoritos e Minha Fila. O botão usa o armazenamento local por perfil já existente. Quando o conteúdo não está salvo, aparece **Minha Fila**; ao adicionar, o botão muda para **Na fila** e recebe destaque verde. Um novo toque remove o conteúdo.

A fila continua respeitando o perfil infantil e não envia o conteúdo ao painel. A navegação do card, retomada, trailer e favoritos permanece separada, e o botão funciona por toque ou OK/Enter do controle remoto. No Celular, a linha mantém rolagem horizontal para não apertar os controles.

## Fluxos preservados

O microfone principal continua direto, inclusive “Space HD”. EPG tradicional, EPG inteligente por voz, player único, próximo episódio com contagem e Cancelar, Meus Alertas, recomendações contextuais, favoritos, retomada, perfil infantil, D-pad e modo Celular/TV Box permanecem preservados. O controle remoto pelo celular continua excluído.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Botões Minha Fila nos detalhes: 3 variantes (filme, série e M3U).
- Listener de fila: presente.
- Armazenamento local: preservado.
- Voz direta, EPG e próximo episódio: preservados.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.64.0-detail-queue-release.apk`.
- SHA-256: `e6682a3051e337a6b77d341f217ac44488bff988f0b2a5ba532105d34da34775`.
