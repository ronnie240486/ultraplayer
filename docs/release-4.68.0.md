# UltraPlayer 4.68.0

## Escopo desta versão

Esta versão aplica somente os itens que estavam faltando nos dois documentos recebidos. As funcionalidades já existentes no UltraPlayer 4.67.0 não foram recriadas nem duplicadas.

| Documento | Lacuna encontrada | Implementação |
|---|---|---|
| Mensagem de integração Rencia | Heartbeat de conteúdo em tempo real | O app envia `GET /api/v5/heartbeat?mac={MAC}&current_content={TÍTULO}` ao iniciar canal, filme ou episódio, ao trocar de conteúdo e a cada 60 segundos. |
| Mensagem de integração Rencia | Atualização durante zapping | O menu transparente do player atualiza imediatamente o conteúdo enviado ao painel quando o canal muda pelo controle remoto. |
| Mensagem de integração Rencia | ACK prematuro de alerta | O `POST /api/v5/list-notifications/ack` agora é enviado somente quando o cliente confirma o alerta, e apenas para o `alert_id` mostrado. |
| Mensagem de integração Rencia | Failover sem atualização visual/reprodução | Após `switch_applied` ou `playlist_sync_required`, o app recalcula a URL da lista ativa, limpa o catálogo em memória e reabre o mesmo contexto nativo ou re-renderiza a rota WebView sem exigir reinício. |
| Mensagem de integração Rencia | Falha real do player nativo | O ExoPlayer tenta primeiro o fallback TS/HLS já existente. Somente se a reprodução continuar falhando, o app envia `POST /api/v5/playback-failure` com MAC e `active_list_number`, bloqueando chamadas duplicadas enquanto a troca está em andamento. |
| Conteúdo assistido em tempo real | Ausência de envio periódico | O título atual permanece em memória e é reenviado ao painel a cada 60 segundos. O timer é encerrado ao sair do player. |

## Comportamento preservado

A consulta de notificações já existente continua sendo iniciada após o login e repetida a cada 60 segundos. O vencimento continua usando `expiration.modal_title`, `expiration.modal_message` e `modal_key`. O failover continua condicionado aos campos devolvidos pelo painel; o app não decide sozinho que uma lista está ruim por causa de um timeout isolado.

A integração usa o mesmo MAC virtual atual do aparelho, derivado pelo app e exibido no fluxo de ativação. O conteúdo enviado nunca é vazio, nulo ou `undefined`, e o título é codificado na URL.

## Validação do painel

Foram realizadas consultas não destrutivas com um MAC fictício. O endpoint de heartbeat implantado respondeu HTTP 200 com `success: true`, `contentUpdated: true` e timestamp. O endpoint de playback-failure respondeu com a mensagem esperada para aparelho sem failover automático ativo, confirmando que a rota está presente. O retorno de notificações para MAC não cadastrado foi tratado como resposta de aparelho não registrado, não como ausência da lógica do APK.

## Validação do APK

| Verificação | Resultado |
|---|---|
| Sintaxe de `zlocal.js` com `node --check` | Aprovada. |
| Compilação Java do módulo Android | Aprovada. |
| Build release com R8 e redução de recursos | Aprovada. |
| Orientação e player único | Preservados. |
| APK gerado | `UltraPlayer-4.68.0-rencia-heartbeat-failover-release.apk`. |
| SHA-256 | `4f365bc520153d16184ed280b906fb57f97d733c002422e73e1eb76c08f2ae91`. |

## Limitações honestas

O servidor decide a troca de lista e deve devolver `playlist_sync_required`, `switch_applied`, `failover_transition_id`, `active_list_number` e a mensagem correspondente quando aplicável. Se o painel não mandar esses campos ou não tiver failover automático configurado para o MAC, o APK não força uma troca por conta própria.

A versão 4.68.0 mantém a chave TMDB fora do repositório e fora da interface, conforme a decisão anterior. O `local.properties` não é incluído no GitHub.
