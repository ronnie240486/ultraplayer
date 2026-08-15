# Comparação do `main.pdf` com o UltraPlayer

## Resultado geral

A análise do PDF identificou duas frentes: validade real da conta M3U/Xtream e atualização interna do APK. A maior parte da exibição de vencimento e do fallback do painel já existia no UltraPlayer, mas a consulta real ao `player_api.php` estava definida e não era acionada no ciclo de login/boot/troca de lista. O fluxo de atualização interna ainda não existia.

| Exigência do PDF | Estado anterior | Aplicação no UltraPlayer 4.71.0 |
|---|---|---|
| Separar servidor, usuário e senha da URL M3U Plus | `playlistToXtream()` já fazia essa separação | Mantido e usado pela consulta Xtream |
| Consultar `/player_api.php` e ler `user_info.exp_date` | Helper existente, sem chamada efetiva garantida no fluxo principal | Ativado após login, boot e troca de lista |
| Tratar `exp_date` como segundos Unix | `expiryTimestamp()` já normalizava segundos/milissegundos | Mantido e utilizado como fonte principal |
| Fallback para `expire_date` do painel | Já existia em `check_mac.php` e na tela | Mantido como fallback quando Xtream não retorna valor positivo |
| M3U puro sem credenciais | Já não inventava vencimento | Mantido: exibe ausência de data |
| Botão de atualização em Configurações | Não existia | Adicionado somente no Android |
| Download assíncrono com limite | Não existia | Implementado com limite de 120 MB, HTTPS, sem cache e progresso |
| Validar ZIP, Manifest, pacote e versionCode | Não existia | Implementado antes de abrir o instalador |
| Validar assinatura | Não existia | Implementado comparando o certificado com o app instalado |
| FileProvider e `content://` | Não existia | Implementado com caminho privado restrito |
| Instalação silenciosa | Não aplicável | Não é usada; o instalador nativo sempre pede confirmação |
| Android 8+ fonte desconhecida | Não existia | Encaminha para a autorização do sistema e retoma depois |

## Contrato de atualização do UltraPlayer

Por segurança e para respeitar a separação de branding definida para o projeto, o aplicativo consome somente os campos próprios do endpoint:

`GET https://renciaapp.manus.space/api/v5/ultra-config?mac={MAC}`

Os campos aceitos pelo APK são `ultra_apk_download_url`, `ultra_apk_version`, `ultra_version_code` e `ultra_apk_version_code`. O app não usa `apk_link` genérico retornado por `check_mac.php`, porque esse campo pertence ao contrato geral do painel e não deve misturar o fluxo do OuroPro com o UltraPlayer.

Na validação realizada com o MAC de teste, o endpoint Ultra-config respondeu HTTP 200 e autorizou o dispositivo, mas `ultra_apk_download_url` estava vazio. Portanto, o recurso está pronto no APK, porém o botão informará que ainda não há atualização publicada até o painel preencher esse campo com um link HTTPS direto para o APK.

## Validação realizada

O JavaScript passou em `node --check`. O release Android compilou com R8, FileProvider, permissão `REQUEST_INSTALL_PACKAGES` e assinatura de teste. O endpoint Ultra-config respondeu HTTP 200; o endpoint `check_mac.php` respondeu HTTP 200 e retornou uma playlist cadastrada. A consulta Xtream é feita somente quando a URL ativa contém credenciais utilizáveis.

A validação de instalação real depende de o painel publicar um APK diferente, com o mesmo `applicationId`, assinatura compatível e `versionCode` maior. Sem uma URL Ultra direta, não é seguro simular esse download usando o `apk_link` genérico.
