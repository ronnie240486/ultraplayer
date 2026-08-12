# Contrato descoberto no backend Rencia

## Endpoint de MAC

O backend expõe `GET https://renciaapp.manus.space/api/v5/check_mac.php?mac=XX:XX:XX:XX:XX:XX`. O handler remove separadores, converte para maiúsculas e procura o MAC nas variantes com dois-pontos, sem separadores e original. MACs com 12 dígitos hexadecimais são aceitos e a resposta normaliza para o formato `AA:BB:CC:DD:EE:FF`.

Quando não encontra o dispositivo, retorna `success: false`, `registered: false` e uma mensagem de erro. Quando encontra um dispositivo liberado, retorna `success: true`, `registered: true`, `mac`, `status`, `expire_date`, um array `playlists` e configurações de branding como `logo_url`, `bg_url`, `banner_url`, `app_name`, `whatsapp_url`, `reseller_contact`, `reseller_whatsapp`, `version` e `apk_link`.

Cada item de playlist deve usar os campos `playlist_name` e `playlist_url`; o backend também fornece aliases `name` e `url`. O tipo pode ser `xtream` ou `m3u_plus`. O app móvel existente já normaliza esses dois formatos.

## Endpoint de usuário e senha

O backend possui `POST /api/v5/reseller_login` com `reseller_code`, `username` e `password`, mas a implementação atual busca apenas `devices.nomeServer` e contém o comentário `TODO: Verificar password com hash`, portanto não é adequado para autenticar usuários finais.

Também existe `POST /api/main.php` com `username` e `password`, porém o handler atual busca o username em `devices.nomeServer` ou `devices.app` e não compara a senha com uma credencial armazenada. Isso precisa ser corrigido antes de o APK depender dele.

Existe ainda `GET /player_api.php?username=...&password=...`, que valida contra a tabela `player_credentials`, mas entrega categorias/streams com escopo amplo e não representa, sozinho, um login de usuário final com branding e playlists associadas.

## Dados persistidos

A tabela `devices` liga `ownerId`, `mac`, `nomeServer`, tipo, modo de seleção, URL M3U8, URL EPG, status, expiração e atividade recente. A tabela `device_urls` suporta várias listas por dispositivo, incluindo Xtream com servidor, usuário e senha. A tabela `dns_entries` liga até várias DNSs a um `ownerId`, com título, host e flag ativo. A tabela `player_credentials` armazena username, password, ownerId e ativo.

## Conclusão de integração

O login por MAC pode ser integrado imediatamente usando `check_mac.php`. O login por usuário e senha deve usar um novo endpoint seguro que valide a tabela `player_credentials`, selecione as playlists do mesmo `ownerId` e devolva o mesmo envelope do login MAC. Não é seguro usar `reseller_login` como está, pois a senha ainda não é validada.

O app móvel existente é Expo/React Native e já contém uma tela de MAC, cliente `checkMac`, estado persistido e parsing Xtream. A implementação mais curta é estender esse app com uma aba de acesso por usuário/senha, adicionar um cliente `loginCredentials`, corrigir o caminho de rede para o painel e gerar o APK a partir da base Expo.
