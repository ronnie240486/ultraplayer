# UltraPlayer 4.53.0 — TV Box rápida e Meus Alertas

A versão **4.53.0** (`versionCode 91`) prioriza o uso do UltraPlayer em TV Box e adiciona acesso visual aos alertas.

## Meus Alertas visível

A Home agora exibe o tile **Meus Alertas** com o número de avisos futuros. A tela também continua acessível pelos comandos “meus alertas” e “meus alarmes”, permitindo remover alertas individualmente.

## Otimizações da TV Box

A primeira pintura da Home recebe prioridade. O aquecimento de catálogos é adiado para depois da tela inicial, as contagens são carregadas em fila com maior intervalo e as recomendações são carregadas mais tarde. As capas da Home são carregadas em lotes, iniciando com no máximo oito imagens no modo TV Box e continuando em segundo plano. O Celular mantém seus tempos e layout próprios.

As mudanças não removem catálogo, EPG, D-pad, foco, voz, favoritos ou reprodução. Elas somente reduzem o trabalho concorrente no primeiro momento da Home.

## Player

O player continua unificado: mini player e tela cheia usam a mesma instância de ExoPlayer. A abertura chama `prepare()` apenas quando a URL muda, mantém o ponto atual ao expandir e retornar, preserva volume/mudo e mantém o fallback ao vivo `.ts`/`.m3u8`. Não foi criado um segundo player.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Tile `/alerts` na Home: presente.
- Carregamento TV Box em lotes e atrasos de catálogo: presentes.
- `retryLiveAsTs`: presente.
- Uma única inicialização de ExoPlayer (`miniPlayer == null`): preservada.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.53.0-tvbox-fast-release.apk`.
- SHA-256: `d061d4e8614e2218f35310a50648f0ce34ce36d88459802b77eefb26ed77cee3`.

O teste de vídeo em uma TV Box física ainda deve ser feito no equipamento do usuário, pois o ambiente de compilação não possui o hardware, a rede e a lista reais.
