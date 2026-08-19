# Fusion 4.85.0 — auto-hide dos controles do player

## Comportamento

Na tela cheia do player, a barra superior de menu, zoom, esticar e reset aparece quando a tela cheia é aberta. Após 4,5 segundos sem interação, ela é ocultada para não cobrir o vídeo.

Quando oculto, um botão discreto de controles permanece disponível no canto superior. Ao pressioná-lo, a barra volta e o foco é direcionado ao menu de canais. Qualquer tecla do controle remoto também pode reabrir a barra quando ela estiver escondida, sem exigir toque na tela.

Cada ação na barra reinicia o timer de 4,5 segundos. Ao sair da tela cheia, o timer é cancelado e o botão de reabertura fica oculto.

O PlayerActivity separado usa o mesmo tempo de auto-hide no controller Media3. A Home, os cards e os botões de navegação fora do player não recebem auto-hide.

## Validação

- `node --check` aprovado para `zlocal.js` e `tv.js`.
- `assembleRelease` com R8 aprovado.
- APK: 10.308.259 bytes.
- SHA-256: `402781ed07cad2e54c20f644b18bcb1e4390fa161f437badb4669f35e11f00e8`.
