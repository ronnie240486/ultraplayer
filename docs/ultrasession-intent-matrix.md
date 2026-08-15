# Matriz de intenções do UltraSession

## Objetivo

O UltraSession deve interpretar a intenção como uma composição de entidades, e não como uma lista fixa de frases. Uma solicitação é formada por zero ou mais componentes: ação, quantidade, duração, tipo de conteúdo, gênero, subgênero, referência, humor, companhia, faixa etária, idioma, restrição, ordenação, alerta e modo de reprodução.

A regra central é: **entidades explícitas têm prioridade sobre pontuação e recomendação**. Se o usuário pedir desenho, somente animação/desenho é elegível. Se pedir romance, o filtro deve exigir romance. Se pedir suspense, um item marcado como Natal ou ação não pode entrar apenas por ter nota alta.

## Entidades canônicas

| Entidade | Valores canônicos | Exemplos de superfície |
|---|---|---|
| Ação | `recommend`, `build_session`, `alert`, `search` | quero, escolha, monte, me indique, me avise |
| Quantidade | inteiro de 1 a 30 | dez, 10, alguns, vários, uma lista de |
| Duração | minutos | meia hora, 30 minutos, tenho 40 min, rapidinho |
| Tipo | `movies`, `series`, `live`, `radio`, `animation` | filme, filmes, série, desenho, cartoon, anime, canal, rádio |
| Comédia | `comedy` | comédia, engraçado, humor, sitcom, para rir |
| Ação | `action` | ação, aventura, adrenalina, super-herói |
| Suspense | `thriller` | suspense, thriller, tensão |
| Mistério | `mystery` | mistério, investigação, enigma |
| Terror | `horror` | terror, horror, assustador |
| Romance | `romance` | romance, romântico, amor |
| Drama | `drama` | drama, emocionante |
| Desenho | `animation` | desenho, animação, cartoon, infantil animado |
| Anime | `anime` | anime, animação japonesa |
| Documentário | `documentary` | documentário, fatos reais, documentário de natureza |
| Fantasia | `fantasy` | fantasia, magia, reino fantástico |
| Ficção científica | `scifi` | ficção científica, sci-fi, espaço, futuro |
| Crime | `crime` | crime, policial, mafioso, investigação criminal |
| Família | `family` | família, para ver com crianças, com meus filhos |
| Guerra | `war` | guerra, militar, batalha |
| História | `history` | histórico, época, história |
| Música | `music` | musical, show, concerto, música |
| Faroeste | `western` | faroeste, velho oeste, western |
| Ordenação | `top_rated`, `recent`, `most_watched`, `random` | maior nota, recém-adicionados, mais assistidos, escolha qualquer |
| Restrição | `avoid_repeats`, `safe_family`, `no_adult`, `dubbed`, `subtitled` | sem repetir, seguro para crianças, dublado, legendado |
| Humor | `light`, `action`, `suspense`, `romance`, `educational` | leve, relaxante, adrenalina, tenso, para aprender |
| Referência | texto livre normalizado | parecido com The Walking Dead, como Harry Potter |
| Alerta | consulta EPG | me avise quando começar o jogo |

## IDs oficiais usados quando houver TMDB

| Tipo | Gênero | IDs TMDB |
|---|---|---:|
| Filme | Ação, aventura, animação, comédia, crime, documentário, drama, família, fantasia, história, terror, música, mistério, romance, ficção científica, suspense, filme de TV, guerra, faroeste | 28, 12, 16, 35, 80, 99, 18, 10751, 14, 36, 27, 10402, 9648, 10749, 878, 53, 10770, 10752, 37 |
| Série | Ação e aventura, animação, comédia, crime, documentário, drama, família, infantil, mistério, notícias, reality, ficção científica e fantasia, novela, talk, guerra e política, faroeste | 10759, 16, 35, 80, 99, 18, 10751, 10762, 9648, 10763, 10764, 10765, 10766, 10767, 10768, 37 |

## Regras de composição

Quando `type=animation`, o universo deve ser `movies` e `series`, com exigência de gênero TMDB `16` ou indicação explícita de desenho/animação no catálogo. The Walking Dead, séries de ação ou qualquer item sem animação não pode ser aceito.

Quando `type=movies`, séries nunca entram. Quando `type=series`, filmes nunca entram. Quando um gênero foi informado, o gênero é obrigatório após o enriquecimento TMDB. Se TMDB não responder, somente um rótulo explícito de categoria ou grupo pode servir como fallback; um item desconhecido deve ser excluído, nunca promovido por nota.

Quando a combinação contiver gênero e humor, o gênero prevalece. “Comédia tensa” pode usar comédia e suspense como preferências secundárias, mas não pode aceitar crime sem comédia. Quando contiver “com meus filhos”, o filtro infantil e o bloqueio adulto continuam obrigatórios, mesmo que o perfil atual não seja infantil.

Quando houver quantidade, o resultado deve conter no máximo a quantidade pedida. Quando houver duração, a duração é uma preferência de seleção; o app não corta conteúdo. Se não houver candidatos compatíveis, a resposta deve dizer que não encontrou conteúdo compatível, sem preencher com itens de outra categoria.

## Combinações para a matriz de testes

A matriz automatizada deve combinar pelo menos 10 formas de ação, 12 formas de quantidade, 8 formas de duração, 10 tipos ou gêneros, 8 restrições e 6 formas de referência. O produto gera mais de 400 frases, incluindo:

| Grupo | Exemplos de combinação |
|---|---|
| Duração + desenho | meia hora e quero assistir um desenho; tenho 30 minutos, escolhe um cartoon; só tenho 20 min, quero animação |
| Quantidade + comédia | quero dez filmes de comédia; me dê 10 filmes engraçados; lista com cinco sitcoms |
| Quantidade + suspense | dez filmes de suspense; escolha 8 thrillers; quero filmes de mistério e tensão |
| Quantidade + romance | me mostre 10 romances; quero cinco filmes românticos; escolha séries de amor |
| Família + tipo | algo para ver com meus filhos; desenho infantil seguro; animação sem violência |
| Referência + tipo | uma série parecida com The Walking Dead; filme como Harry Potter; desenho parecido com Toy Story |
| Ordenação + categoria | maior nota de comédia; recém-adicionados de ação; mais assistidos de suspense |
| Alerta + seleção | me avise quando começar o jogo e escolha uma comédia; me lembre do jornal e monte uma sessão leve |

## Critério de aceitação

Nenhum caso com tipo/gênero explícito pode retornar um item incompatível. Casos sem tipo/gênero podem usar recomendação por nota, histórico e disponibilidade. O relatório de teste deve separar `parsed_intent`, `eligible_candidates`, `rejected_candidates` e `reason` para facilitar diagnóstico sem precisar corrigir frases manualmente.
