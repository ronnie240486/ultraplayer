# Inventário funcional e técnico

## Identidade do binário

| Campo | Valor observado |
|---|---|
| Nome original | Zuxo Player |
| Package | `com.zuxoplayer.app` |
| Versão | `3.0.4` |
| Version code | `25` |
| Min SDK | `21` |
| Target SDK | `36` |
| Entrada | `MainActivity` |
| Player | `PlayerActivity` |
| Interface | WebView com assets locais |
| Reprodução | Media3/ExoPlayer, com HLS e Google Cast observados |

## Funcionalidades observadas nos assets

| Área | Evidência recuperada |
|---|---|
| Login | Código/servidor, usuário e senha, seleção de lista e mensagens PT/EN. |
| Perfis | Até quatro perfis locais, avatar, edição e separação de favoritos/progresso. |
| Conteúdo | TV ao vivo, filmes, séries, listas, detalhes, temporadas e episódios. |
| Descoberta | Busca, categorias, favoritos, recém-adicionados, continuar assistindo e sugestões. |
| Reprodução | Live/VOD, retomada, próximo episódio, progresso, volume, busca e erro. |
| TV | Navegação por D-pad, modo TV/caixa, foco visual e layouts para telas largas. |
| Celular | Modo celular, teclado virtual e ajustes responsivos. |
| Offline | Snapshot local, favoritos pendentes, cache e aviso de indisponibilidade do painel. |
| Personalização | Cor de destaque, logo remoto, fundo e informações de branding. |
| Preferências | Idioma PT/EN, PIN de conteúdo adulto, tamanho de posters e limpeza de cache. |
| Integrações | Ponte JavaScript Android, Google Cast e verificação de licença observada no pacote. |

## Arquivos web recuperados

| Arquivo | Tamanho aproximado | Papel |
|---|---:|---|
| `index.html` | 104 KB | Shell visual e CSS principal embutido. |
| `zlocal.js` | 282 KB | Roteador, estado, API, catálogo e persistência. |
| `tv.js` | 53 KB | Navegação e comportamento de TV. |
| `category_browser.js` | 24 KB | Grades, paginação, busca e lazy loading. |
| `keyboard.js` | 27 KB | Teclado virtual. |
| `player_touch.js` | 18 KB | Controles de toque/mouse do player. |
| `hdx-cache.js` | 5 KB | Cache local. |
| `hls.min.js` | 414 KB | Biblioteca HLS embutida. |
| `tv.css` | 97 KB | Estilos para TV e navegação por foco. |
| `zx-compat.css` | 5 KB | Compatibilidade adicional de estilos. |

## Componentes Android próprios

As classes próprias identificadas são `MainActivity`, `PlayerActivity`, `CastOptionsProvider`, classes auxiliares de callback e listeners, além dos recursos `R`. O diretório recuperado também contém `com.pairip.licensecheck`, que deve ser tratado como componente de distribuição/licenciamento observado no APK e não como código de produto a ser copiado automaticamente.

## Permissões e superfície

O manifest solicita acesso à Internet, estado da rede, foreground service, licença do Google Play e uma permissão dinâmica interna. A aplicação declara suporte opcional a Android TV/Leanback, orientação paisagem e Picture-in-Picture. O tráfego cleartext está habilitado no manifest original, o que deve ser considerado um item de segurança prioritário.
