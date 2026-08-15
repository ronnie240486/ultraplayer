# Requisitos extraídos do main.pdf

## Escopo

O PDF descreve duas frentes: determinar corretamente a validade de listas M3U/Xtream e implementar atualização interna do APK por botão em Configurações.

## Validade da lista

A URL M3U Plus deve ser separada em `serverUrl`, usuário e senha. Quando houver credenciais Xtream, o app deve consultar `GET /player_api.php?username=...&password=...`, ler `user_info.exp_date` como timestamp Unix em segundos e converter para data sem multiplicar duas vezes nem deslocar indevidamente o dia.

A precedência recomendada é `user_info.exp_date` da conta Xtream; se não houver valor positivo, usar `expire_date` textual do painel no formato `yyyy-MM-dd`; se nenhuma fonte existir, exibir explicitamente “não informado” ou equivalente. Um M3U puro sem credenciais não pode ter vencimento inventado por nome de arquivo, data de download ou contagem de linhas.

## Atualização interna

O painel deve fornecer `apk_link` apontando diretamente para bytes do APK, preferencialmente por HTTPS, com resposta HTTP 2xx. O app deve baixar em tarefa assíncrona para diretório privado, sem abrir navegador, com redirecionamentos controlados, sem cache, limite de tamanho e progresso.

Antes de chamar o instalador, validar resposta HTTP, assinatura ZIP/PK, Manifest, `applicationId` igual ao instalado e `versionCode` maior que o atual. O versionCode é a fonte de verdade, não app_version textual nem cache-busting.

A instalação deve usar `FileProvider`, URI `content://`, permissão temporária de leitura e `Intent.ACTION_VIEW` com MIME `application/vnd.android.package-archive`. Em Android 8+, se necessário, encaminhar o usuário para a autorização de instalação por fonte desconhecida. A confirmação final deve permanecer no instalador nativo; não pode haver instalação silenciosa.

O Manifest precisa declarar `REQUEST_INSTALL_PACKAGES` e o provider com `android:exported="false"`, `android:grantUriPermissions="true"` e caminhos restritos ao diretório de atualização.

## Testes exigidos

O PDF exige testar conta Xtream ativa, conta vencida, `exp_date=0`, M3U sem credenciais, atualização nova, atualização igual/antiga, pacote de outro app, assinatura diferente e Android 8+ sem autorização de instalação.

## Observação de segurança

O PDF reforça que usuário, senha, token, MAC, URL completa e chave de assinatura não devem ser gravados em código público, PDF distribuído ou logs.
