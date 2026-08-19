# Fusion 4.98.0 — catálogo completo antes da Home e EPG TV Box maior

A primeira Home agora é liberada por `openHomeAfterFullCatalog()`. Depois da autenticação, filmes, séries e canais são solicitados com `forceFull=true`; somente após as três promessas terminarem a rota `/home` é exibida. Se alguma fonte falhar, a Home é liberada com o que estiver disponível e o sincronizador continua podendo tentar novamente.

Isso elimina a situação em que a tela abre com apenas um filme e só completa depois que a seção Filmes é acessada.

No modo TV Box (`body.zx-ff-tv`), o EPG recebeu fonte maior: título em 23px, horário em 18px, cabeçalho em 30px e sinos em botões de 40px. O layout continua com rolagem vertical e os alarmes permanecem visíveis/clicáveis.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
