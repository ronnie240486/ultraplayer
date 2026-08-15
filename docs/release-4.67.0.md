# UltraPlayer 4.67.0

## Resumo

A versão **4.67.0** é uma evolução do UltraPlayer baseada na versão 4.66.0. Ela adiciona integração opcional com o TMDB para exibir notas de filmes e séries, filtros de catálogo por maior nota e conteúdos mais assistidos, badges de nota nas fichas de detalhe e uma ferramenta segura de backup local para transportar dados de uso entre aparelhos.

## Alterações principais

| Área | Implementação |
|---|---|
| TMDB | Consultas em `search/movie` e `search/tv` usando autenticação API v3 por `api_key` e idioma `pt-BR`. |
| Cache TMDB | Cache local por perfil com validade de sete dias e limite de 600 entradas. Falhas do TMDB não bloqueiam a abertura do catálogo. |
| Cards | Nota TMDB em estrela amarela abaixo do título quando a correspondência foi encontrada. |
| Detalhes | Badge de nota TMDB em filmes, séries e itens M3U quando disponível. |
| Filtros | Rotas virtuais **Maior nota** e **Mais assistidos** em Filmes e Séries. |
| Mais assistidos | Ordenação local baseada no histórico de progresso salvo neste aparelho. |
| Dados locais | Exportação/importação JSON em Configurações → Dados locais. Inclui favoritos, Minha Fila, progresso, perfis, temas, idioma e acessibilidade. |
| Privacidade | O backup não inclui MAC, usuário, senha, licença, playlist, snapshot de autenticação nem a chave TMDB. `local.properties` permanece fora do Git. |
| Android | `getTmdbApiKey()` exposto somente à ponte JavaScript interna; a chave é lida do `local.properties` durante o build e gravada em `BuildConfig`. |
| Compatibilidade | Orientação landscape, player Media3/ExoPlayer, modos Celular e TV Box e comportamento anterior preservados. |

## Sincronização entre aparelhos

O backend Rencia App disponível neste projeto não possui rotas persistentes para listar ou mesclar favoritos, progresso, recentes e perfis entre aparelhos. Por isso, a versão 4.67.0 não inventa uma rota nem envia esses dados para um endpoint inexistente.

Em vez disso, foi incluído um fluxo local opcional. No aparelho de origem, abra **Configurações → Dados locais → Exportar JSON**. No aparelho de destino, use **Importar JSON**. A restauração é limitada aos dados explicitamente permitidos pelo app e mantém a autenticação e a playlist fora do arquivo.

## Segurança da chave TMDB

A chave TMDB não é exibida na interface, não é gravada em `zlocal.js`, não é colocada no backend e não é versionada em `local.properties`. O build local lê `TMDB_API_KEY` de `local.properties` e gera o campo `BuildConfig.TMDB_API_KEY`. O JavaScript acessa somente o método interno `HdxNative.getTmdbApiKey()`.

Como toda chave de API v3 distribuída dentro de um aplicativo cliente pode ser extraída por engenharia reversa, a integração deve ser considerada uma chave pública de cliente com restrição e rotação no painel do TMDB quando necessário. Ela não deve ser usada para permissões administrativas.

## Validações executadas

| Validação | Resultado |
|---|---|
| `node --check app/src/main/assets/webui/zlocal.js` | Aprovado. |
| Consulta TMDB v3 com `api_key` e `language=pt-BR` | HTTP 200, resultados e campos de nota presentes. |
| `./gradlew assembleRelease` | Aprovado. |
| R8/minificação e redução de recursos | Aprovado durante o build release. |
| APK Android | Artefato gerado e copiado para `releases/`. |
| SHA-256 | Gerado em arquivo `.sha256` ao lado do APK. |

## Artefatos

- `releases/UltraPlayer-4.67.0-tmdb-local-backup-release.apk`
- `releases/UltraPlayer-4.67.0-tmdb-local-backup-release.apk.sha256`

## Observações operacionais

O catálogo pode abrir antes de todas as notas TMDB serem preenchidas, pois o enriquecimento é assíncrono e limitado para preservar desempenho. A nota depende de uma correspondência de título; títulos sem correspondência continuam funcionando normalmente. Os filtros **Mais assistidos** usam os dados locais de cada aparelho e não representam audiência global do painel.
