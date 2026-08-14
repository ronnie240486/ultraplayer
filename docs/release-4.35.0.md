# UltraPlayer 4.35.0

## Resumo

A versão **4.35.0** (`versionCode 73`) concentra correções direcionadas ao modo **TV Box**, mantendo a orientação horizontal e o comportamento já validado no modo Celular.

## Alterações principais

| Área | Alteração |
|---|---|
| Canais Xtream | No modo TV Box, URLs de transmissão ao vivo são preferencialmente solicitadas em `.ts`, com fallback bidirecional entre `.ts` e `.m3u8`. |
| Canais M3U | URLs diretas de canais ao vivo também recebem a conversão correta para `.ts` na TV Box; a expressão regular foi validada. |
| Fallback do player | `retryLiveAsTs()` identifica explicitamente payloads `kind: "live"` e tenta a extensão alternativa quando a primeira reprodução falha. |
| Catálogo TV Box | Cache local de 15 minutos, abertura progressiva e atualização integral em segundo plano. Filmes e séries começam pela primeira categoria não adulta e carregam o restante posteriormente. |
| Navegação por categoria | Se o usuário selecionar uma categoria ainda ausente no catálogo parcial, o app conclui a atualização integral e reabre a categoria solicitada. |
| Trailers | Botões de trailer dos detalhes e dos cards têm ligação direta com `TrailerActivity`; a URL de pesquisa usa o YouTube mobile para maior compatibilidade com TV Box. |
| TrailerActivity | Autoplay permitido, foco inicial no WebView e botão Voltar focalizável com destaque verde para controle remoto. |
| Saída | O retorno `"exit"` do JavaScript é reconhecido corretamente pelo Java, acionando o modal de confirmação e o fluxo de dois toques. |
| Compatibilidade | APK continua com `applicationId com.ultraplayer.app`, orientação `landscape`, `minSdk 21`, `targetSdk 28` e assinatura debug de release para atualização das instalações de teste. |

## Validações executadas

- Sintaxe de `zlocal.js` validada com `node --check`.
- Compilação `assembleRelease` concluída com sucesso.
- R8 e `shrinkResources` executados.
- APK gerado em `app/build/outputs/apk/release/app-release.apk`.
- Artefato copiado para `releases/UltraPlayer-4.35.0-tvbox-fixes-release.apk`.

## Artefatos

- APK: `releases/UltraPlayer-4.35.0-tvbox-fixes-release.apk`
- SHA-256: `releases/UltraPlayer-4.35.0-tvbox-fixes-release.apk.sha256`
- SHA-256 calculado: `42406a2b76a71fb6893ae490325775d5fa93a230965cb038d3b74dbf7df7c9fe`

## Teste recomendado na TV Box

Após instalar a versão 4.35.0 sobre a instalação de teste anterior, selecionar o modo **TV Box** em Configurações e validar: abertura de um canal ao vivo, troca entre categorias, carregamento inicial de Filmes e Séries, botão Trailer em um card, navegação por D-pad no topo e pressão dupla do botão Voltar. O modo Celular deve permanecer em paisagem e sem alteração visual ou funcional relevante.
