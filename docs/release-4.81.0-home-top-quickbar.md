# Fusion 4.81.0 — Atalhos no topo da Home TV Box

## Organização

Mantendo o tamanho intermediário dos ícones, Favoritos, Minha Fila, Meus Alertas e Playlist foram retirados da grade central e colocados em uma faixa horizontal de quatro atalhos logo abaixo do cabeçalho, próxima ao Servidor.

A grade central agora contém somente TV ao Vivo, Filmes e Séries lado a lado. Isso reduz a altura ocupada pelos atalhos e permite que Filmes em destaque e Para você apareçam na mesma tela em fileiras abaixo.

## Controle remoto

A navegação esquerda/direita dos quatro atalhos fica restrita à faixa superior. A navegação esquerda/direita de TV ao Vivo, Filmes e Séries fica restrita à linha central. Para baixo, o foco segue dos atalhos para a linha central e depois para Filmes em destaque e Para você. Para cima, retorna ao bloco anterior.

## Compatibilidade

A reorganização é aplicada somente ao modo `body.zx-ff-tv`. O Celular mantém seu layout. O carregamento não bloqueante da Home, os controles permanentes do player, o cache e as demais funcionalidades permanecem ativos.

## Validação

`node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`. `assembleRelease` com R8 concluído com sucesso. APK final: 8.145.844 bytes. SHA-256: `8f5c59c4d807adc4d0b2046f798d516d31d0859eba76874e5e67a69ddd168ca5`.
