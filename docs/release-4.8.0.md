# UltraPlayer 4.8.0 — EPG móvel e busca por voz com cards

A versão 4.8.0 mantém as alterações novas limitadas ao modo **Celular**. O Caixa TV não recebe as novas regras de escala do EPG nem as mudanças visuais da busca por voz.

No EPG do Celular, o texto do horário e do programa foi aumentado moderadamente e o sino recebe largura mínima, visibilidade forçada, alinhamento e área de toque próprios. O botão fica ao lado do bloco de texto dentro do item, sem desaparecer por corte de coluna ou por posicionamento herdado.

A busca por voz agora diferencia consultas amplas de consultas exatas. Uma consulta curta, como “Space”, mostra os canais encontrados em cards grandes e roláveis. Uma consulta com duas ou mais palavras que corresponda exatamente a um nome, como “Space HD”, abre diretamente o canal. O mesmo critério vale para filmes e séries: correspondências exatas abrem o filme ou o detalhe da série; consultas amplas permanecem em uma tela de resultados.

Os resultados de voz passaram a usar cards maiores no Celular, com duas colunas para canais e pôsteres com largura mínima de 180 px para filmes e séries. A tela continua rolável para baixo. Foi incluído um carregador específico para as capas dos pôsteres, pois os resultados de voz não passavam pelo lazy loader normal; logos de canais continuam sendo carregados pelo carregador de logos existente.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `4.8.0`, versionCode `43`, build debug. SHA-256: `21c2c161a50305ccc933e4cfebc6cac860920826a98dab334b4d34e9fafedadc`.
