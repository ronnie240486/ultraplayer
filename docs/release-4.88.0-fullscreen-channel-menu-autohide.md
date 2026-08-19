# Fusion 4.88.0 — menu de canais full-screen compacto

O menu de categorias do player em tela cheia agora fica oculto durante a reprodução. Ao pressionar o botão de menu, abre uma área compacta no canto superior esquerdo, com barra de categorias de 34px e lista interna de canais. O menu é ocultado automaticamente após 5,5 segundos de inatividade.

O canal focado recebe fundo verde, borda branca e destaque visível. A categoria focada usa destaque verde; a categoria ativa usa âmbar. A tela normal de Canais e sua barra lateral não recebem esse override.

Validação: `node --check` aprovado para os arquivos WebView; `assembleRelease` com R8 aprovado.
