# Auditoria do UltraSession

## Pontos existentes reutilizáveis

| Área | Ponto existente |
|---|---|
| Voz direta | `startVoiceCommand()` → `runVoiceCommand()` → `runVoiceIntent()` preserva comandos como “Space HD”. |
| Assistente | `assistantSubmit()` já encaminha comandos conversacionais e pode reconhecer a intenção de montar sessão. |
| Catálogo | `ensureCatalog('live'|'movies'|'series')` fornece itens disponíveis, categorias e cache. |
| Segurança infantil | `kidsFilterList()`, `kidsAllows()`, `profKidsActive()`, `profScheduleAllowed()` e `profLimit()` já existem. |
| TMDB | `tmdbRatingFor()`, `tmdbEnrichCatalog()` e cache por perfil já existem. |
| EPG | `epgAlarms()`, `renderVoiceEpgSchedule()`, `voiceEpgIntent()` e `/alerts` já existem. |
| Histórico | Favoritos, Minha Fila, progresso, recentes e Continue Assistindo já usam chaves por perfil. |
| Player | `playViaNative()` e `startVideo()` mantêm o player único e suportam live, filme e episódio. |
| Home | `renderHome()` possui topbar e navegação focada para TV Box/Celular. |

## Lacunas para a primeira versão

A busca por voz atual pesquisa títulos, mas não interpreta duração, humor, contexto familiar, evitar repetição ou “escolha para mim”. Também não existe uma sessão persistida com candidatos, pontuação explicável, confirmação e ações “começar”, “trocar” e “cancelar”.

A primeira implementação deve ser local e determinística. O TMDB será usado somente como sinal de nota quando já estiver no cache; a montagem não deve bloquear a abertura do catálogo para esperar a API. O EPG será usado para transformar uma intenção de aviso em alerta existente, mas a seleção VOD/live será apresentada antes de iniciar.

## Não alterar

Não alterar o comando direto do microfone, o modo Celular, a orientação landscape, o player único, a exclusão de controle remoto por celular, a autenticação MAC/usuário e senha, a origem exclusiva do branding UltraPlayer ou os filtros de conteúdo infantil já implementados.
