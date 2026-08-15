# UltraSession — contrato inicial

## Objetivo

O UltraSession transforma uma intenção natural do usuário em uma sessão personalizada de entretenimento. A primeira versão deve funcionar localmente no WebView, usando apenas dados já disponíveis no UltraPlayer: catálogo M3U/Xtream, progresso, favoritos, Minha Fila, perfil ativo, controle infantil, EPG, notas TMDB em cache e player nativo/HTML5.

> A sessão deve ajudar o usuário a decidir o que assistir, mas nunca deve substituir a escolha explícita do usuário nem iniciar conteúdo adulto, conteúdo bloqueado ou conteúdo fora do horário permitido.

## Exemplos de intenção

| Exemplo falado | Interpretação esperada |
|---|---|
| “Monte uma sessão de 40 minutos para assistir com as crianças” | Sessão infantil, até 40 minutos, sem conteúdo adulto, obedecendo limite e horário do perfil. |
| “Quero algo leve parecido com The Walking Dead” | Busca por similaridade textual e gênero aproximado, sem exigir uma correspondência exata de título. |
| “Escolha um filme bem avaliado para hoje” | Filmes disponíveis, com nota TMDB conhecida, ordenados pela nota e filtrados pelo perfil. |
| “Me avise quando começar o jogo e escolha uma série curta agora” | Agenda um alerta EPG e monta uma escolha VOD independente para o momento atual. |
| “Tenho 25 minutos e não quero repetir o que já vi” | Exclui progresso concluído, favoritos assistidos e itens recentes quando houver dados suficientes. |

## Modelo local da sessão

```text
UltraSession {
  id: string,
  created_at: number,
  request: {
    raw: string,
    duration_minutes: number | 0,
    mode: "movie" | "series" | "live" | "radio" | "mixed",
    mood: string,
    reference: string,
    avoid_repeats: boolean,
    family: boolean,
    alert_query: string
  },
  constraints: {
    kids_profile: boolean,
    schedule_allowed: boolean,
    daily_limit_remaining: number | 0,
    adult_blocked: boolean
  },
  candidates: Array,
  selected: Array,
  status: "draft" | "ready" | "playing" | "completed" | "cancelled"
}
```

## Regras da primeira versão

| Regra | Comportamento |
|---|---|
| Privacidade | O texto da intenção, candidatos e decisões ficam no armazenamento local do perfil. Não criar endpoint novo para o UltraSession. |
| Conteúdo infantil | Se o perfil ativo for infantil, aplicar `kidsFilterList`, bloquear nomes adultos e respeitar o horário/limite já existentes. |
| Disponibilidade | Considerar somente itens presentes no catálogo carregado ou que possam ser resolvidos pelos fluxos atuais de detalhes. |
| Nota TMDB | Usar a nota somente quando houver cache local TMDB. Ausência de nota não pode impedir a reprodução. |
| Duração | Na primeira versão, duração é uma preferência de seleção. O app não corta um filme ou episódio para caber no tempo. |
| Repetição | Excluir itens concluídos e priorizar itens fora de `zx_recent_live`, `zx_cont_*`, `zx_prog:*` quando `avoid_repeats` estiver ativo. |
| Falha | Se o player falhar, manter a sessão e delegar ao failover Rencia já implementado. Não escolher uma lista por conta própria. |
| Confirmação | A sessão mostra a seleção e exige clique/OK ou comando “começar” antes de iniciar a reprodução. |
| Compatibilidade | Landscape permanente; mesma experiência para Celular e TV Box, alterando apenas dimensionamento visual. |
| Fallback | Se não houver candidatos suficientes, mostrar explicação e oferecer busca normal, sem quebrar a Home. |

## Arquitetura mínima

A implementação será dividida em quatro camadas no `zlocal.js`: parser de intenção, coleta local de candidatos, pontuação explicável e renderização da sessão. O comando de voz principal continuará iniciando escuta diretamente e não será substituído pelo Ultra Assistente. O UltraSession será uma ação adicional identificada por frases como “monte uma sessão”, “escolha para mim” ou “tenho X minutos”.

## Fora do primeiro corte

Não serão incluídos nesta primeira versão: integração com Netflix/Amazon/YouTube autenticados, sincronização remota de perfis, geração de conteúdo audiovisual, corte automático de filmes, decisão autônoma de compra, controle remoto por celular ou envio de histórico detalhado ao backend.
