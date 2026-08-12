# Arquitetura recuperada

## Visão geral

O APK combina um shell Android relativamente pequeno com uma aplicação web local bastante extensa. A `MainActivity` cria um `WebView`, configura JavaScript e armazenamento DOM, registra pontes JavaScript e carrega `file:///android_asset/webui/index.html`. A UI, o roteamento, os formulários, o catálogo e boa parte do estado vivem nos assets web.

A reprodução é desviada para uma `PlayerActivity` nativa quando a ponte JavaScript chama `HdxNative.play(...)`. Essa segunda atividade constrói o player Media3/ExoPlayer, trata eventos de carregamento e erro, controla volume e busca, suporta Picture-in-Picture e retorna ao fluxo web quando necessário.

```text
┌──────────────────────────────────────────────────────────────┐
│ Android application shell                                    │
│ com.zuxoplayer.app.MainActivity                              │
│  • WebView                                                    │
│  • Android / HdxNative JavaScript bridges                    │
│  • estado de rede e ciclo de vida                            │
│  • encaminhamento de play e back                             │
└──────────────────────────────┬───────────────────────────────┘
                               │ file:///android_asset/webui
┌──────────────────────────────▼───────────────────────────────┐
│ Web UI local                                                  │
│ index.html + zlocal.js + tv.js + category_browser.js         │
│  • login, perfis e listas                                     │
│  • TV ao vivo, filmes, séries, busca e favoritos              │
│  • configurações, PIN, cache, progresso e i18n               │
│  • catálogo Xtream e chamadas /api/r/*                        │
└──────────────────────────────┬───────────────────────────────┘
                               │ HdxNative.play(url, metadata)
┌──────────────────────────────▼───────────────────────────────┐
│ Reprodução nativa                                             │
│ com.zuxoplayer.app.PlayerActivity                             │
│  • Media3 / ExoPlayer                                         │
│  • live, VOD, HLS e seleção de faixas                          │
│  • controles, erros, fallback e Picture-in-Picture            │
│  • Google Cast via CastOptionsProvider                         │
└──────────────────────────────────────────────────────────────┘
```

## Componentes recuperados

| Componente | Papel observado | Próxima ação recomendada |
|---|---|---|
| `MainActivity` | Inicializa o WebView, splash, conectividade, back e bridge. | Reescrever em uma atividade nomeada para UltraPlayer, com bridge tipada e testes de ciclo de vida. |
| `PlayerActivity` | Player nativo Media3/ExoPlayer e controles de reprodução. | Isolar em um módulo de reprodução, reduzir nomes ofuscados e cobrir erros com testes. |
| `CastOptionsProvider` | Configuração do Google Cast. | Confirmar o receiver/app ID autorizado antes de qualquer redistribuição. |
| `zlocal.js` | Roteador, autenticação, catálogo, cache, favoritos, progresso, branding e i18n. | Separar em módulos TypeScript/JavaScript por domínio e introduzir uma camada de API configurável. |
| `tv.js` | Navegação por D-pad, foco, relógio e ações de controle. | Preservar a compatibilidade com TV, mas criar testes de foco para teclado e controle remoto. |
| `category_browser.js` | Grades, paginação, lazy loading e busca. | Medir desempenho em TV box e definir uma política única de paginação/cache. |
| `keyboard.js` | Teclado virtual para login e pesquisa. | Revalidar acessibilidade, foco e entrada em Android TV/celular. |
| `hdx-cache.js` | Cache local da interface e dados. | Definir esquema versionado, expiração e migração de dados. |
| `hls.min.js` | Biblioteca HLS embutida para ambientes que não fornecem suporte suficiente. | Validar compatibilidade/licença e decidir quando preferir ExoPlayer nativo. |

## Comunicação e dados

O código recuperado indica dois fluxos distintos. O primeiro consulta diretamente o servidor IPTV configurado pelo usuário, usando uma API no formato `player_api.php` com credenciais da própria lista. O segundo conversa com um painel remoto por caminhos `/api/r/*`, levando código, usuário, senha, identificador do aparelho e plataforma. Esse segundo fluxo aparece associado a login, licença, resolução de servidor/DNS, favoritos, progresso, branding, avisos e fila offline.

O identificador Android é obtido pela ponte nativa com `Settings.Secure.ANDROID_ID` e prefixado antes de ser armazenado localmente. As credenciais e snapshots são mantidos no `localStorage`, e o código tenta continuar com dados salvos quando o painel não está acessível. Essa combinação precisa ser revisada antes de uma versão UltraPlayer, principalmente para não armazenar senha em texto simples e para permitir a troca segura de endpoint.

## Estado e persistência

O estado web inclui perfil ativo, código, usuário, senha, servidor IPTV, snapshot de licença/branding, favoritos, itens alterados offline, metadados de pôsteres, modo celular/TV, idioma, PIN e histórico de reprodução. A persistência usa chaves no `localStorage`, muitas delas prefixadas por perfil. O plano de refatoração deve criar um esquema versionado e uma migração explícita para que o rename de `zx_*` para `up_*` não apague sessões existentes sem consentimento.

## Pontos de atenção técnicos

O manifest permite tráfego sem criptografia (`usesCleartextTraffic="true"`) e declara uma configuração própria de segurança de rede. Isso deve ser reavaliado e reduzido a exceções documentadas. A presença de código de verificação de licença e da permissão `com.android.vending.CHECK_LICENSE` também indica que o APK original foi distribuído em um contexto que não deve ser copiado automaticamente para uma nova aplicação.

A descompilação mistura classes próprias com bibliotecas de terceiros e cria nomes artificiais como `C1362b`, `C1363c` e `C1375o`. Esses nomes são úteis para investigação, mas não para manutenção. A futura base-fonte deve preservar apenas o comportamento necessário, com módulos nomeados, dependências declaradas e contratos testáveis.

## Limites da análise

O APK é um artefato compilado. Não é possível garantir que comentários, nomes originais, tipos Kotlin, configuração de build ou histórico de decisões tenham sido recuperados. A arquitetura acima descreve evidências observadas no binário e nos assets extraídos; decisões de produto e segurança devem ser validadas em uma execução controlada do aplicativo e com autorização para os serviços envolvidos.

## Referências internas

[1]: `analysis/manifest-report.json` "Manifest e componentes extraídos"
[2]: `recovered/app-classes/zuxoplayer/app/MainActivity.java` "MainActivity descompilada"
[3]: `recovered/app-classes/zuxoplayer/app/PlayerActivity.java` "PlayerActivity descompilada"
[4]: `recovered/webui/zlocal.js` "Controlador web local recuperado"
