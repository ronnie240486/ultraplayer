# UltraPlayer 4.28.0 — notificações de falha de listas

A versão 4.28.0 implementa as notificações técnicas de listas descritas para o UltraPlayer. O aplicativo consulta exclusivamente `GET https://renciaapp.manus.space/api/v5/list-notifications?mac={MAC}` usando o MAC automático do aparelho. Não usa rotas do OuroPro, não consulta outro MAC e não mistura dados de outras contas.

A consulta é feita depois da autenticação do UltraPlayer e repetida a cada 60 segundos enquanto o WebView estiver ativo. Falhas de rede ou respostas HTTP inválidas são ignoradas e não interrompem a reprodução, não apagam a lista válida e não trocam o servidor.

Somente notificações com `status: "failure"`, `acknowledged: false` e ID ainda não exibido são apresentadas. O aviso usa o título e a mensagem entregues pelo painel em um modal acessível pelo toque e pelo controle remoto. Após a apresentação, o APK confirma a leitura com `POST https://renciaapp.manus.space/api/v5/list-notifications/ack`, enviando apenas o MAC atual e o `alert_id`. O ID exibido fica salvo por aparelho para evitar repetição entre perfis locais.

A funcionalidade não bloqueia o aplicativo: o usuário fecha o aviso no botão **OK** e continua na tela ou na reprodução que estava usando. Avisos `recovered` não forçam troca de lista nem alteram a reprodução.

O APK foi compilado com R8, redução de recursos, alinhamento e assinatura de teste. Package: `com.ultraplayer.app`; versionName: `4.28.0`; versionCode: `66`; tamanho: `3.432.342 bytes`; SHA-256: `8ed037019ab35d2e596245c3a26d6add43222e35a61f06fe7f036dbed7bffc52`.
