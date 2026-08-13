# UltraPlayer 4.4.0 — paisagem permanente e player unificado

A versão 4.4.0 corrige a orientação do aplicativo: **Celular e TV Box permanecem sempre em paisagem**. A escolha de form factor não altera mais retrato ou paisagem; ela controla somente a escala visual.

No modo **Celular**, ícones, cards, títulos, botões e elementos de toque usam dimensões maiores. No modo **TV / Caixa**, os mesmos componentes usam dimensões compactas, adequadas para visualização à distância. O layout de canais mantém categorias, canais, mini player e EPG em composição horizontal nos dois modos.

O mini player e o player grande agora são uma única reprodução. A Activity principal mantém uma única instância de `ExoPlayer` e um único `PlayerView`. Ao tocar no mini player, o mesmo `PlayerView` é redimensionado para ocupar a tela inteira; ao pressionar voltar, ele retorna ao tamanho original. O canal, a posição, o buffer e o estado de reprodução não são recriados nem reiniciados durante essa transição.

A tela cheia nativa separada deixou de ser usada pelo fluxo normal. O `PlayerActivity` legado permanece protegido com orientação landscape para instalações ou intents antigos, mas o WebView agora abre e redimensiona o player nativo mantido pela `MainActivity`.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.4.0`, versionCode `35`, build debug. SHA-256 do artefato entregue: `dcf972563671880f718bd42bc60f806f89111a1cbcb2eab8cb773d6f2dfaaf3b`.
