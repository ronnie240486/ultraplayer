# Roadmap UltraPlayer — Plataforma de TV Interativa

## Objetivo

Evoluir o UltraPlayer de um player IPTV completo para uma experiência de televisão interativa, mantendo a orientação horizontal, o player único Media3/ExoPlayer, o controle por D-pad, a autenticação por MAC/usuário e senha, o branding exclusivo do UltraPlayer e a compatibilidade com listas M3U/Xtream.

## Base já disponível

O aplicativo já possui comando de voz em português, busca por canais/filmes/séries, perfis com modo infantil, favoritos, progresso local, continue assistindo, EPG com alarmes, trailers internos, rádios, múltiplas listas, failover, cache progressivo, navegação por controle remoto e layout Celular/TV Box.

## Evolução planejada

| Fase | Entrega | Dependências |
|---|---|---|
| 1 | Núcleo de intenções do Ultra Assistente e busca universal | Catálogos já carregados no app; sem dependência obrigatória de LLM. |
| 2 | Voz contextual para abrir categorias, filtrar conteúdo, controlar player e programar EPG | Ponte Java `startVoice`, `miniPlay`, `miniStop`, `openTrailer` e estado local. |
| 3 | Home personalizada por perfil, recomendações e retomada | Histórico, favoritos, progresso e catálogo já existentes. |
| 4 | EPG inteligente, alarmes por linguagem natural e perfil infantil avançado | EPG atual, alarmes locais e regras de perfil. |
| 5 | Acessibilidade, diagnóstico de conexão e modo ambiente | Configurações e ponte Android; recursos devem ser opcionais. |
| 6 | Sincronização entre dispositivos e assistente conversacional remoto | Exige endpoint autenticado no Rencia App e política de privacidade clara. |

## Princípios de implementação

A primeira camada será determinística e local, para manter o aplicativo rápido, funcionar mesmo com internet instável e não enviar o histórico do usuário a um serviço externo. Um modelo de linguagem remoto será opcional e deverá receber somente o comando necessário, nunca credenciais, MAC, senha ou URLs privadas de playlists.

Toda funcionalidade nova precisa funcionar com toque e controle remoto, preservar a cor de foco branca/verde, respeitar o perfil infantil e não bloquear a primeira pintura da Home. Recursos pesados devem ser carregados em segundo plano e o catálogo nunca deve ser consultado novamente se já estiver válido em cache.

## Critérios de aceite

| Área | Critério |
|---|---|
| Voz | Frases completas devem ser entendidas sem confundir filme, série, canal ou rádio. |
| Player | O assistente não pode criar um segundo player nem interromper o ponto atual sem confirmação quando a ação for ambígua. |
| TV Box | D-pad deve alcançar todos os controles, categorias, resultados e modais. |
| Celular | A aplicação permanece sempre em paisagem e mantém o layout compacto. |
| Privacidade | Nenhuma senha, MAC ou URL de playlist é enviada ao LLM. |
| Desempenho | A Home aparece antes de recomendações, capas ou sincronizações secundárias. |
| Compatibilidade | M3U, Xtream, listas múltiplas, failover e branding `ultra_*` continuam funcionando. |
