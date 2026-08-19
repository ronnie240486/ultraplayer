# Fusion 4.90.0 — barra full-screen menor

A faixa de categorias do menu de canais no player em tela cheia foi reduzida de fato. O `minHeight`/`minWidth` padrão dos botões foi removido para que a altura definida pelo menu seja respeitada.

A faixa usa 29px, botões de 25px, fonte de 9px, padding de 3px e espaçamento de 2px. A rolagem horizontal continua contida na própria faixa. O menu continua oculto durante a reprodução, aparece pelo botão de menu e usa auto-hide após inatividade.

A barra da Home e a barra lateral da tela normal de Canais não foram alteradas.

Validação: `node --check` aprovado e `assembleRelease` com R8 aprovado.
