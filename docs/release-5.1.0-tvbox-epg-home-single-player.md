# Fusion 5.1.0 — ajustes exclusivos da TV Box

A TV Box agora mantém simultaneamente as classes `zx-ff-tv` e `ui-tv`, permitindo que as regras efetivas do layout Live e do EPG sejam aplicadas. O Celular continua usando apenas `zx-ff-mobile`.

O preview nativo de M3U passa a entregar até 360 itens por tipo na TV Box, enquanto o celular mantém o preview menor. A Home usa primeiro esse preview amplo para abrir sem esperar a carga integral; a consulta completa fica atrasada e as seções continuam podendo completar o catálogo ao serem abertas.

A promoção mini/full do player deixou de chamar `play()` durante a troca de layout. Não há `prepare`, `seekTo`, nova URL, novo PlayerView ou segundo ExoPlayer; o estado de reprodução/pausa e a posição são preservados.

Validação: `node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`; build release com R8 aprovado.
