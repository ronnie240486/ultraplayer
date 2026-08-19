# Fusion 4.83.0 — Fundo Fusion global e cards Home progressivos

## Identidade visual

A nova imagem Fusion preta enviada pelo usuário foi instalada como asset local do aplicativo. Ela aparece no splash nativo Android, no carregamento inicial do WebView, no root das páginas e nos fallbacks de fundo de Canais, Filmes, Séries, Rádios, Favoritos, Minha Fila, Meus Alertas, Playlist, Configurações, Servidor, detalhes e estados vazios.

O ícone vermelho do launcher permanece separado. A imagem preta é usada como fundo/branding interno, enquanto o nome Fusion e os logos de marca continuam disponíveis nos lockups.

## Home TV Box

A organização dos blocos foi preservada. Filmes em destaque e Para você voltaram a carregar quando não existe histórico, inclusive na TV Box. A causa do vazio era uma guarda que impedia qualquer catálogo sem snapshot de ser consultado na Home.

Para evitar o travamento observado, o parser M3U foi convertido para processamento incremental com lotes de aproximadamente 420 linhas e `setTimeout(0)` entre lotes. A classificação de tipo, filtro infantil, group-title, capas, categorias e IDs permanece compatível com o parser anterior. A construção de `byCat` também cede o event loop entre blocos.

O Xtream continua sendo carregado por suas chamadas de categorias/streams. A Home renderiza snapshots quando disponíveis e atualiza os cards depois que Filmes e Séries chegam.

## Validação

- `node --check` aprovado para `zlocal.js` e `tv.js`.
- `assembleRelease` com R8 aprovado.
- APK final: 10.306.295 bytes.
- SHA-256: `f95c4106fcab70c86e90dc21ee472ed7d5102004d7f12ad5a636eae8b7690583`.

A primeira abertura de uma M3U ainda depende do download da lista e da rede, mas o parsing não deve mais monopolizar o event loop do WebView durante todo o processamento.
