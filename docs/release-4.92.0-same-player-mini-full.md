# Fusion 4.92.0 — continuidade do player único

Corrigido o retorno do player full-screen para o mini player. A entrada direta em tela cheia agora marca `keepAfterFull=true`; ao voltar, o mini player não pausa, não limpa `miniPayload`, não remove a URL e não oculta o container.

O mesmo ExoPlayer permanece conectado ao mesmo PlayerView, preservando canal, fonte, posição e estado de reprodução. O full-screen continua sem controles superiores conforme a versão anterior.

Validação: `node --check` aprovado para os arquivos WebView; `assembleRelease` com R8 aprovado.
