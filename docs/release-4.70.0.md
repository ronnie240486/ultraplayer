# UltraPlayer 4.70.0 — motor composicional do UltraSession

## Motivo da evolução

As correções anteriores tratavam exemplos individuais, o que permitia que uma intenção composta fosse interpretada de forma incompleta. Um pedido como “tenho meia hora e quero assistir um desenho” não pode cair em uma série adulta; o tipo de conteúdo, o gênero e a duração precisam ser entidades independentes e obrigatórias quando explicitados.

## Implementação

A versão 4.70.0 substitui o parser limitado por um **parser composicional V2**. Ele normaliza a frase e extrai, de forma independente, ação, quantidade, duração, tipo de conteúdo, subtipo de animação, gêneros, humor, referência, perfil familiar, idioma, dublado/legendado, repetição, ordenação e alertas EPG.

| Entidade | Comportamento |
|---|---|
| Desenho, cartoon e animação | Usa `media_type: animation` e exige gênero TMDB de animação ou rótulo explícito confiável no catálogo. Séries como The Walking Dead são rejeitadas. |
| Anime | É tratado como subtipo de animação, sem permitir conteúdo não animado. |
| Gêneros | Usa IDs TMDB por tipo de mídia e fallback local com palavras inteiras e singular/plural. Suspense, romance, ação, comédia, terror, drama, crime, fantasia, ficção científica, documentário, família, guerra, história, música, faroeste, mistério e demais categorias não são misturados. |
| Tipo de mídia | Filmes, séries, desenhos/animes, canais e documentários são separados antes da pontuação. |
| Quantidade | Suporta números e palavras de 1 a 30 para filmes, séries, desenhos, animes, documentários e canais. |
| Duração | Reconhece minutos, meia hora, uma hora e uma hora e meia sem cortar o conteúdo. |
| Família | “Com meus filhos”, “para crianças” e “sem violência” acionam proteção adicional e bloqueio de adultos. |
| Falta de candidatos | O app informa que não encontrou conteúdo compatível, em vez de preencher com outra categoria. |

## Validação

Foi gerado um conjunto determinístico de **500 interpretações combinatórias** em português, cruzando ações, quantidades, durações, tipos, gêneros, restrições e referências. O teste final terminou com:

| Métrica | Resultado |
|---|---:|
| Casos executados | 500 |
| Falhas de tipo, gênero, duração ou quantidade | 0 |
| `node --check` | Aprovado |
| Build Android release com R8 | Aprovado |

O teste cobre especialmente os casos reportados: desenho versus The Walking Dead, suspense versus Natal, romance versus ação, além de plurais como “documentários”, “filmes de comédias” e “séries de suspenses”.

## Privacidade e compatibilidade

O motor continua local no WebView. A chave TMDB permanece apenas no mecanismo de build local e não é adicionada ao repositório. O fluxo direto de voz, incluindo “Space HD”, permanece separado do UltraSession. A TV Box e o player existente não foram alterados por esta evolução.

**APK:** `UltraPlayer-4.70.0-ultrasession-intent-engine-release.apk`

**SHA-256:** `b915abc480fe255f39c2a39e7a00233212444ae05e361713f55e2bf6a9353ec8`.
