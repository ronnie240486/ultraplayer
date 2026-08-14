# UltraPlayer 4.29.0 — failover automático de listas

A versão 4.29.0 implementa o failover automático de playlists conforme a resposta de `GET https://renciaapp.manus.space/api/v5/list-notifications?mac={MAC}`. O painel continua sendo a fonte de verdade: o aplicativo não decide sozinho quando uma lista falhou e não considera timeout isolado como falha.

Quando `playlist_sync_required` é `true` e chega um `failover_transition_id` novo, o UltraPlayer busca novamente a configuração normal de playlists do MAC usando a rota de autenticação/listas já existente. Em seguida, escolhe a lista indicada por `active_list_name`, por `active_list_number` ou, em `primary_restored`, retorna à primeira lista. A lista ativa, o servidor e as credenciais derivadas são atualizados em memória e persistidos, enquanto os catálogos são invalidados para serem carregados da lista nova na próxima abertura. O player atual e a tela visível não são fechados.

Para `backup_active`, a Lista 2 ou Lista 3 indicada pelo painel passa a ser a lista ativa. Para `primary_restored`, a Lista 1 volta a ser aplicada. A mensagem `playlist_sync_message` aparece em um toast não bloqueante por alguns segundos. O `failover_transition_id` é salvo por MAC no armazenamento local, evitando executar a mesma troca ou mostrar a mesma mensagem a cada consulta de 60 segundos.

As notificações técnicas continuam sendo filtradas pelo MAC atual. Falhas de rede, HTTP inválido ou ausência momentânea da configuração mantêm a última lista válida e não interrompem a reprodução. A confirmação de leitura usa somente os IDs recebidos pela rota de notificações e continua sendo enviada para `/api/v5/list-notifications/ack`.

O APK foi compilado com R8, redução de recursos, alinhamento e assinatura de teste. Package: `com.ultraplayer.app`; versionName: `4.29.0`; versionCode: `67`; tamanho: `3.433.205 bytes`; SHA-256: `c4b3e8960aed4fabd54057423e1f56847bba40fabb983a37f026b161115a5565`.
