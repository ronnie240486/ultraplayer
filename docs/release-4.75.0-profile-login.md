# Fusion 4.75.0 — Perfis e autenticação

## Perfis

O botão **Novo perfil** não solicita mais o PIN do responsável. O usuário pode criar um perfil adulto ou infantil diretamente, escolher nome e avatar e salvar.

O PIN parental continua reservado para ações protegidas: entrar no modo de edição de perfis, apagar um perfil, sair de um perfil infantil, desbloquear conteúdo adulto e alterar a senha local do controle parental. Ele não é a senha da conta do painel e não interfere no login MAC ou usuário/senha.

## Login por usuário e senha

O cliente continua enviando o contrato correto para `POST /api/v5/login.php` com JSON `{ username, email, password }`, preservando a senha exatamente como digitada e removendo apenas espaços acidentais do usuário/e-mail.

A auditoria do endpoint de produção confirmou que `https://renciaapp.manus.space/api/v5/login.php` está respondendo `text/html` com a página do painel, em vez de JSON. Por isso, a senha não chega a ser validada pelo backend. A versão 4.75.0 detecta esse caso e exibe uma mensagem explícita informando que a rota JSON de usuário e senha ainda não foi publicada, em vez de apresentar uma rejeição genérica.

O backend de referência contém a implementação esperada de `/api/v5/login.php`, que valida `playerCredentials` e retorna playlists, DNS e validade. Para o login funcionar em produção, essa rota precisa ser publicada no servidor Rencia ou o painel precisa apontar o endpoint para a implementação JSON correspondente. O aplicativo sozinho não consegue transformar uma página HTML do painel em uma autenticação válida.

## Validação

- `node --check` do WebView aprovado.
- Criação de perfil confirmada sem chamada a `parentPinGate`.
- Endpoint de produção sondado sem credenciais reais: `POST /api/v5/login.php` respondeu HTTP 200 `text/html`, confirmando a causa.
- Build Android release com R8 aprovado.
- APK final: 8.142.768 bytes.
- SHA-256: `528de211c4c8068428570bb39d6411fd4d97ff169194cad0b9153b190210b47e`.

## Compatibilidade

O `applicationId` continua `com.ultraplayer.app`, o nome Fusion permanece, e listas, MAC, player, TMDB, EPG, UltraSession, temas e orientação landscape não foram alterados.
