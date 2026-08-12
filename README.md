# UltraPlayer

Reconstrução técnica inicial do aplicativo Android recebido como `ZuxoPlayer3.0.4.apk+`. O objetivo deste repositório é transformar um binário de referência em uma base controlada para manutenção, personalização e evolução do player.

> **Estado atual:** esta primeira versão é uma base de análise e recuperação. Ela não representa o projeto-fonte original e o diretório `recovered/android-decompiled` não deve ser considerado compilável sem uma etapa adicional de limpeza, renomeação e reconstrução das dependências.

## O que foi identificado

O pacote original declara o aplicativo `com.zuxoplayer.app`, com nome de exibição `Zuxo Player`, versão `3.0.4`, versionCode `25`, minSdk `21` e targetSdk `36`. A entrada principal é uma `MainActivity` que hospeda uma interface web local em um `WebView`. A reprodução ocorre em uma `PlayerActivity` separada, baseada em Media3/ExoPlayer, com suporte a vídeo ao vivo, VOD, Picture-in-Picture e integração com Google Cast.

A interface recuperada está em `recovered/webui`. O arquivo `zlocal.js` concentra o roteamento, login, persistência local, sincronização de favoritos e progresso, integração com catálogo IPTV e comunicação com o painel remoto que aparecia no binário original. Os demais arquivos JavaScript contêm navegação por controle remoto, busca, teclado virtual, cache, HLS e controles de toque.

## Estrutura

| Diretório | Finalidade |
|---|---|
| `reference/apk-bundle/` | APK recebido, `base.apk`, splits e metadado do contêiner para referência imutável. |
| `recovered/webui/` | HTML, CSS e JavaScript recuperados dos assets do APK. |
| `recovered/app-classes/` | Classes próprias descompiladas de `com.zuxoplayer.app` e componentes de licença que estavam no pacote. |
| `recovered/android-decompiled/` | Projeto Gradle e demais classes/recursos gerados pelo JADX; é material de recuperação, não fonte original. |
| `analysis/` | Manifest, hashes, inventário do ZIP, log de descompilação e achados da inspeção. |
| `docs/` | Arquitetura, inventário funcional, riscos e roadmap de melhorias. |
| `mobile/` | Projeto Expo/React Native do UltraPlayer 1.1.0, com login por MAC ou usuário/senha. |
| `backend-reference/` | Código de referência das rotas do painel, incluindo o novo contrato de login por credenciais. |
| `releases/` | APK de debug gerado localmente e seu hash SHA-256. |

## Versão de teste 1.1.0

Foi criada uma primeira versão compilável do UltraPlayer em `mobile/`, com identidade `com.ultraplayer.app` e duas modalidades independentes de acesso. O modo **MAC** aceita doze dígitos hexadecimais e normaliza formatos com dois-pontos ou hífen. O modo **usuário e senha** chama `POST /api/v5/login.php` e não salva a senha no estado persistido do aplicativo.

O APK de debug está em [`releases/UltraPlayer-1.1.0-debug.apk`](releases/UltraPlayer-1.1.0-debug.apk). O login MAC utiliza o endpoint já existente `GET /api/v5/check_mac.php`. Para o segundo modo funcionar no painel publicado, é necessário disponibilizar o endpoint novo descrito em [`docs/backend-contract.md`](docs/backend-contract.md); a cópia alterada está em `backend-reference/server/apiRoutes.ts`.

## Primeiras melhorias propostas

A evolução deverá começar separando a interface web da infraestrutura nativa, renomeando o produto para **UltraPlayer** em todos os pontos de apresentação e removendo referências de marca que ainda pertençam ao aplicativo original. Em seguida, a base precisa ganhar um projeto Android reproduzível, testes de navegação e reprodução, uma camada de configuração para branding e DNS, observabilidade de erros de rede e um contrato claro para o painel/API.

Também será importante preservar a regra de que o aplicativo apenas reproduz fontes que o usuário esteja autorizado a utilizar. Nenhuma lista, canal ou conteúdo foi criado ou incluído neste repositório.

## Como trabalhar com esta base

Para análise, consulte primeiro [`docs/architecture.md`](docs/architecture.md), [`docs/roadmap.md`](docs/roadmap.md) e [`analysis/findings.md`](analysis/findings.md). O APK original deve ser tratado como artefato de comparação; alterações de produto devem ser implementadas em uma futura camada-fonte organizada, e não diretamente em arquivos descompilados.

Antes de redistribuir qualquer build, será necessário revisar as licenças das bibliotecas AndroidX, Kotlin, Media3/ExoPlayer, Google Cast, Firebase/Transport, componentes de licença e demais dependências identificadas no APK. Os arquivos descompilados são mantidos para engenharia reversa autorizada e compatibilidade, não como declaração de autoria sobre código de terceiros.

## Referências internas

[1]: `analysis/findings.md` "Achados da inspeção estática"
[2]: `docs/architecture.md` "Arquitetura recuperada"
[3]: `docs/roadmap.md` "Roadmap inicial do UltraPlayer"
