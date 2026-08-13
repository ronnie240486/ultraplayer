# UltraPlayer 2.3.0 — home, voz, alarmes e múltiplas listas

A home do UltraPlayer recebeu uma regra exclusiva para celular em retrato. O cabeçalho fica em duas linhas, com logo e botões na primeira linha e relógio/data na segunda. Os cards principais usam grade de duas colunas e altura fixa; o modo TV continua usando a composição ampla em paisagem.

O comando de voz agora abre uma tela de resultados em vez de iniciar a reprodução imediatamente. Uma frase como `Space HD` mostra o canal encontrado e a reprodução acontece quando o usuário seleciona o resultado. Uma frase como `Space` lista os canais correspondentes. Para títulos, `Esqueceram de Mim` procura primeiro canais e, quando não encontra correspondência, procura filmes e séries; termos parciais mostram todos os resultados relevantes.

O EPG ganhou um sino em cada programa futuro. Ao tocar no sino, o aplicativo salva um alarme local. Quando chega o horário, aparece um modal central com título, canal e contagem regressiva de 10 segundos. O alarme é removido depois de disparar ou pode ser fechado manualmente.

A tela Servidor deixou de exibir uma lista fixa criada pelo app. O aplicativo atualiza o conjunto a partir de `playlists`, `lists` ou `data.playlists` retornado pelo painel. Cada lista mostra nome e servidor, e a seleção troca `playlist_url`, tipo, servidor e catálogo ativo. A escolha permanece salva no aparelho.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `2.3.0`, versionCode `14` e permissão de microfone. A build é debug para testes.
