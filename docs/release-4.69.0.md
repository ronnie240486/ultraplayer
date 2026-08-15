# UltraPlayer 4.69.0 — UltraSession

## Resumo

A versão 4.69.0 introduz a primeira versão funcional do **UltraSession**, um planejador local de experiência de entretenimento. O usuário não precisa escolher diretamente um título: pode informar duração, humor, companhia, referência, preferência por filme/série/canal e se deseja evitar repetições. O app reúne candidatos disponíveis na própria lista, aplica perfil infantil e apresenta a razão de cada sugestão antes de reproduzir.

> O UltraSession é opcional. Quando o usuário continua usando TV ao Vivo, Filmes, Séries, Rádios, busca normal, Favoritos ou Minha Fila, esses fluxos permanecem independentes.

## Recursos implementados

| Recurso | Funcionamento |
|---|---|
| Intenção por voz | Reconhece frases como “tenho 40 minutos, algo leve com meus filhos”, “escolha uma série parecida com The Walking Dead” e “o que posso assistir agora”. |
| Intenção por texto | A tela `/session` permite digitar a mesma solicitação caso o microfone não esteja disponível. |
| Coleta local | Usa catálogos live, movies e series já carregados pelo UltraPlayer, sem criar endpoint novo no backend. |
| TMDB | Usa notas que já estejam no cache e enriquece um pequeno conjunto de candidatos em segundo plano, sem bloquear o catálogo normal. |
| Pontuação explicável | Cada card informa se foi escolhido por nota TMDB, referência parecida, duração, clima, favorito ou disponibilidade. |
| Troca de sugestão | O usuário pode selecionar outro card ou usar “Trocar sugestão” antes de iniciar. |
| Reprodução | Canal inicia pelo player nativo único; filme abre o detalhe; série abre o detalhe para seleção de temporada/episódio. |
| Alertas | Pedidos como “avise quando começar o jogo e escolha um filme” separam a busca de EPG da seleção de conteúdo e reutilizam os alarmes existentes. |
| Perfil infantil | Respeita horário permitido, limite diário, filtro de nomes/categorias adultas e PIN quando necessário. |
| Privacidade | Intenção, candidatos e sessão ficam em `localStorage` por perfil. Não são enviados ao servidor. |
| TV Box/Celular | A tela permanece em landscape e usa o mesmo catálogo e player; apenas o dimensionamento muda conforme o fator de forma. |

## Compatibilidade preservada

O microfone principal continua iniciando a escuta diretamente. Comandos como “Space HD” continuam seguindo a busca/abertura direta de canal; somente frases de planejamento, recomendação ou sessão são encaminhadas ao UltraSession. O controle remoto pelo celular continua excluído. A autenticação, branding UltraPlayer, TMDB embutido, heartbeat, failover e player único da versão 4.68.0 foram preservados.

## Limites honestos da primeira versão

O planejador não corta um filme para caber em uma duração e não inicia automaticamente conteúdo adulto, bloqueado ou fora do horário infantil. A duração é usada como preferência de seleção; quando a fonte não fornece runtime, o card informa apenas a disponibilidade. A primeira versão não integra contas externas de Netflix, Amazon Prime ou YouTube, não faz sincronização remota e não envia histórico detalhado ao backend.

## Validação

| Verificação | Resultado |
|---|---|
| Parser de intenção em português | Aprovado com casos de duração, família, repetição, similaridade, recomendação e alerta combinado. |
| `node --check` em `zlocal.js` | Aprovado. |
| Compilação Java Android | Aprovada. |
| Gradle release com R8 e redução de recursos | Aprovado. |
| APK | `UltraPlayer-4.69.0-ultrasession-release.apk`. |
| SHA-256 | `6e0c25953a388d580ac891fcece28d4432fc212f1499dde5695ecb01130d51b2`. |

## Armazenamento local

A última sessão é guardada em `zx_ultrasession_last` no espaço do perfil atual. Ela contém somente a solicitação, restrições, candidatos e seleção. Não contém senha, MAC, credencial da lista ou chave TMDB.
