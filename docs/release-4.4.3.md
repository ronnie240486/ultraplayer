# UltraPlayer 4.4.3 — linha de canais do Celular e player compartilhado

A versão 4.4.3 corrige o alvo visual solicitado para o modo **Celular**. A redução é escopada por `body.zx-ff-mobile` e afeta somente a linha de canais: o elemento `.ct-logo` que mostra o ícone do canal, o fallback do ícone e o `.ct-name` que mostra o nome, como no exemplo do Cartoon Network. O modo `zx-ff-tv` não recebe essa nova redução.

Também foi corrigido o ciclo de layout do player. O WebView chama `setMiniBounds()` em vários momentos para posicionar o quadro pequeno; esse callback agora é ignorado enquanto o player está expandido, impedindo que uma atualização posterior o reduza novamente. O container nativo também é clicável e mantém o mesmo `ExoPlayer` e `PlayerView` durante a transição.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.4.3`, versionCode `38`, build debug. SHA-256: `6f4b325a542c945fb4657194e5cd88495e1e413c93c208825b2ff61840fef1f2`.
