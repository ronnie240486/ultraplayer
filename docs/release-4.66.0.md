# UltraPlayer 4.66.0 — feedback de recomendações

A versão **4.66.0** (`versionCode 104`) torna a faixa **Para você** interativa. O usuário pode marcar um card como **Não tenho interesse** usando o botão X que aparece sobre a capa. O card é removido imediatamente da faixa e a preferência é armazenada localmente no perfil atual.

## Comportamento

A recusa é aplicada somente à recomendação selecionada. O item não é excluído do catálogo, não é removido dos Favoritos, não é retirado da Minha Fila e continua disponível pela busca ou pelas categorias. Em uma próxima atualização da faixa, a recomendação recusada permanece fora da seleção local.

O controle funciona por toque, teclado e OK/Enter do controle remoto, com foco acessível e sem alterar o card principal. A recomendação continua respeitando perfil infantil, favoritos, histórico e novidades.

## Fluxos preservados

O microfone principal continua direto, inclusive “Space HD”. EPG tradicional, EPG inteligente por voz, player único, próximo episódio com contagem e Cancelar, Meus Alertas, fila, limpeza segura da fila, favoritos, retomada, perfil infantil, D-pad e modo Celular/TV Box permanecem preservados. O controle remoto pelo celular continua excluído.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Armazenamento local `zx_reco_hidden`: presente.
- Botão de feedback nos cards Para você: presente.
- Hook após renderização: presente.
- Voz direta, EPG, próximo episódio e fila: preservados.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.66.0-recommendation-feedback-release.apk`.
- SHA-256: `e474dbd6bb9620ec96de129d2498545a11e61f2c30f7b0ded08298bb23c8ec68`.
