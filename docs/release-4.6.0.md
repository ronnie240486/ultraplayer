# UltraPlayer 4.6.0 — menu transparente por categorias e EPG ajustado

A versão 4.6.0 reorganiza o menu de canais que aparece sobre o player grande. O painel agora é translúcido e ocupa a área do player sem bloquear completamente o vídeo. Na parte superior há uma faixa horizontal rolável de categorias, como Globo, SBT, Abertos e outras categorias presentes na lista. Abaixo dela há uma lista vertical rolável dos canais da categoria selecionada, com texto claro e fundo transparente. A troca de canal acontece no mesmo `ExoPlayer`, sem sair do player grande.

A categoria de cada canal agora é carregada no payload de zapping. Para catálogos Xtream, o aplicativo resolve o nome da categoria pelo `category_id`; para playlists M3U, usa o grupo do item. Isso permite que as abas exibam os nomes reais da lista.

No modo **Celular**, os logos dos canais foram compactados novamente para 36 px, com fallback e margem menores; os nomes foram reduzidos para 12 px e a linha foi puxada para a esquerda. As regras continuam escopadas em `body.zx-ff-mobile`, sem aplicar essa redução ao TV Box.

No EPG do modo Celular, cada item passou a usar duas colunas internas: o horário e o nome do programa ficam na primeira coluna, e o sino fica na segunda coluna, encostado ao conteúdo e dentro da borda. O botão não usa mais posicionamento absoluto nessa versão, evitando o corte observado na tela.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.6.0`, versionCode `40`, build debug. SHA-256: `d59f99ebe6ea62dab1251c7ba75ff8689ffcaf8a153b967192b024655e52250a`.
