# UltraPlayer 4.2.0 — canais compactos e reprodução única

Os logos dos canais foram reduzidos de 32px para 22px, os nomes foram compactados de `.72vw` para `.5vw` e a numeração passou para `.4vw`. A tipografia do EPG também foi reduzida: horários em 8px, subtítulos em 9px e títulos em 10px, sem diminuir a área do painel.

O mini player agora guarda o payload atual do canal. Ao tocar na imagem do mini player, o aplicativo salva o payload, pausa e esconde o mini player antes de iniciar a `PlayerActivity` em tela cheia. Isso evita dois players reproduzindo simultaneamente. O botão X continua apenas fechando o mini player.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.2.0`, versionCode `33` e build debug.
