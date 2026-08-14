# UltraPlayer 4.31.0 — vencimento sincronizado pelo painel

A versão 4.31.0 integra o objeto `expiration` retornado por `GET https://renciaapp.manus.space/api/v5/list-notifications?mac={MAC}`. A data de vencimento exibida na home e em Configurações passa a ser atualizada pela mesma rota usada para notificações e failover.

Quando `expiration.show_modal` é `true`, o aplicativo usa diretamente `modal_title` e `modal_message` fornecidos pelo painel. O modal aparece somente uma vez por `modal_key`, que fica salvo localmente para não repetir a cada consulta de 60 segundos. Não são acrescentadas instruções internas ou referências ao painel, monitoramento ou operação técnica.

A validade exibida usa `expiration_display`. Se esse campo não existir, `expiration_date` é normalizada para `DD/MM/AAAA`. Se o objeto indicar ausência de data, a validade antiga é removida e o aplicativo volta a mostrar **Sem expiração**. A atualização não interrompe o player, não apaga a lista e não altera o failover já implementado.

O APK foi compilado com R8, redução de recursos, alinhamento e assinatura de teste. Package: `com.ultraplayer.app`; versionName: `4.31.0`; versionCode: `69`; tamanho: `3.434.021 bytes`; SHA-256: `fdb53b81a3f6f817fa6d253273aa50aaa19106fcdf39be644655aeba0863e31c`.
