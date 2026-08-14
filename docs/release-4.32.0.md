# UltraPlayer 4.32.0

## Correções de TV Box e controle remoto

Esta versão corrige a reprodução de canais ao vivo na TV Box com uma preparação HTTP compatível, User-Agent de Android, redirecionamentos entre protocolos e uma tentativa de fallback para stream `.ts` quando o endereço HLS falhar. O mesmo ExoPlayer compartilhado continua sendo usado no Celular e na TV Box.

A navegação espacial recebeu uma regra específica para a tela de Configurações: as setas para cima e para baixo percorrem os itens verticais do menu, sem exigir a seta direita para entrar ou descer. O foco dos controles da TV Box ganhou contorno branco e destaque verde para ficar visível no controle remoto.

Na tela ao vivo, a coluna de categorias foi ampliada, a área de conteúdo recebeu mais espaço e os cards de Filmes e Séries foram espaçados verticalmente. As alterações preservam a composição horizontal.

A altura do mini player foi aumentada somente no eixo vertical nos dois modos. A largura não foi alterada. Na TV Box e no Celular, o quadro agora ocupa mais altura para facilitar a visualização.

## Saída segura

Dois toques em Voltar na raiz do aplicativo mostram o modal **“Sair ou continuar?”**. Continuar fecha o modal e mantém o app aberto; Sair chama o fechamento correto da tarefa Android. Um único Voltar continua fechando menus, retornando do player ou navegando pelo histórico normalmente.

## Build

- versionName: `4.32.0`
- versionCode: `70`
- package: `com.ultraplayer.app`
- tipo: APK Android nativo Java, release otimizado
- SHA-256: `c7b88e857fe00846d0166b04fd82415f8c96bf1b90ce5c37ed8c5b2577b6b385`
