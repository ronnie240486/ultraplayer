# UltraPlayer 4.30.0 — validade da lista ativa

A versão 4.30.0 corrige o rodapé da home e o painel de Configurações para mostrar a data de vencimento real da lista ativa, em vez de exibir sempre **Sem expiração**.

O aplicativo agora preserva os campos de validade retornados por cada playlist e aceita `expire_date`, `expireDate`, `dataExpiracao`, `expiration_date`, `expires_at`, `valid_until`, `validUntil` e `expiry_date`. A ordem de prioridade é a validade da lista ativa; quando o painel não fornece validade individual, o aplicativo usa a validade geral retornada na resposta de autenticação (`expire_date`/`dataExpiracao`).

A data pode chegar como ISO, data textual ou timestamp em segundos/milissegundos e é normalizada para o formato brasileiro `DD/MM/AAAA`. A troca manual de lista e o failover automático atualizam imediatamente a validade exibida. A lista ativa continua sendo a única usada para o texto do rodapé.

O APK foi compilado com R8, redução de recursos, alinhamento e assinatura de teste. Package: `com.ultraplayer.app`; versionName: `4.30.0`; versionCode: `68`; tamanho: `3.433.516 bytes`; SHA-256: `42882a22f561aa03376bd53bbbe6ef57f516bcb5c39d640eafbf4a0d7ded16ed`.
