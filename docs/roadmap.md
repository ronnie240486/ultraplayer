# Roadmap inicial do UltraPlayer

## Objetivo

A primeira meta é transformar a recuperação do APK em uma aplicação Android mantível, com identidade UltraPlayer, reprodução estável e uma camada de configuração que não dependa de valores codificados no binário original. O trabalho deve ser incremental: primeiro preservar o comportamento essencial, depois melhorar segurança, desempenho e personalização.

## Fases propostas

| Fase | Entrega | Critério de conclusão |
|---|---|---|
| 0. Baseline | Repositório com APK, assets, manifest, hashes e relatório. | Artefatos de referência versionados e reproduzíveis. |
| 1. Projeto compilável | Novo projeto Android com `MainActivity`, WebView e player nativo nomeados. | Build de debug instala e abre a home sem depender do código ofuscado. |
| 2. Rename e identidade | Nome UltraPlayer, package/applicationId definidos, ícone, splash, cores e textos revisados. | Nenhuma marca antiga aparece em telas ou logs de produto. |
| 3. Contrato de configuração | Endpoint do painel, até cinco DNSs, branding, logo, fundo e ícones configuráveis. | Configurações são validadas, versionadas e aplicadas sem novo APK manual para cada ajuste permitido. |
| 4. Reprodução robusta | HLS, live/VOD, retomada, fallback, erro amigável, PiP e Cast revisados. | Matriz de testes cobre redes lentas, URLs inválidas, troca de faixa e rotação. |
| 5. Segurança e privacidade | HTTPS por padrão, armazenamento seguro de credenciais, logs sem dados sensíveis e política de rede mínima. | Auditoria não encontra senha em `localStorage` nem endpoints inseguros ativos por padrão. |
| 6. UX TV/celular | Foco D-pad, teclado, acessibilidade, layouts responsivos e modo celular/TV. | Fluxos de login, busca e reprodução funcionam com controle remoto e toque. |
| 7. Qualidade e distribuição | CI, testes, assinatura de release, changelog e documentação. | Build de release é reproduzível e o processo de publicação está documentado. |

## Melhorias de produto prioritárias

### Identidade e branding

A marca deve ser centralizada em uma configuração única, em vez de espalhada por HTML, JavaScript, recursos Android e strings descompiladas. O painel deve poder fornecer nome, cor de destaque, logo, imagem de fundo e ícones permitidos, com cache local, tamanho máximo e validação de tipo. A introdução pode receber uma animação leve do logo e som opcional, mas deve respeitar autoplay, modo silencioso e preferências do usuário.

### DNS e fontes autorizadas

A configuração deve suportar até cinco DNSs ou endpoints de servidor, com ordem de prioridade, teste de conectividade, timeout e fallback controlado. O aplicativo não deve inventar fontes de conteúdo nem incluir listas; deve apenas consumir a configuração autorizada pelo operador e pelo usuário. Qualquer troca deve ser auditável e refletida na UI de configurações.

### Home e descoberta

A home pode evoluir para uma área de sugestões com slides de filmes, séries, novelas e desenhos, sempre baseada nos dados que o usuário autorizou e nos recursos realmente disponíveis. Cada slide deve suportar carregamento lazy, fallback de imagem, foco por controle remoto e ação direta para detalhes ou reprodução.

### Reprodução

A `PlayerActivity` deve ser convertida em um módulo com estado explícito: `Idle`, `Loading`, `Playing`, `Paused`, `Buffering`, `Ended` e `Error`. A UI web precisa receber eventos estáveis de progresso, erro e retomada. O fallback deve ter política clara e não pode abrir URLs arbitrárias sem validação de esquema.

## Primeiros tickets sugeridos

| ID | Tarefa | Prioridade | Dependência |
|---|---|---:|---|
| UP-001 | Criar projeto Android novo e copiar apenas os assets web necessários. | Alta | Baseline |
| UP-002 | Renomear classes e pontes para `UltraPlayerActivity`, `UltraPlayerBridge` e `UltraPlayerPlayerActivity`. | Alta | UP-001 |
| UP-003 | Extrair `zlocal.js` em módulos de sessão, API, catálogo, cache e branding. | Alta | UP-001 |
| UP-004 | Definir esquema `up_config_v1` para DNS, endpoint, marca e preferências. | Alta | UP-003 |
| UP-005 | Migrar credenciais do `localStorage` para armazenamento seguro. | Alta | UP-003 |
| UP-006 | Adicionar testes para back, foco D-pad, login, offline e reprodução. | Alta | UP-001 |
| UP-007 | Rever cleartext traffic, permissões de licença e integração Cast. | Alta | UP-001 |
| UP-008 | Implementar branding remoto: nome, logo, fundo, ícones e cor. | Média | UP-004 |
| UP-009 | Implementar carrossel de sugestões com dados autorizados e cache. | Média | UP-003 |
| UP-010 | Criar pipeline de build, assinatura e changelog. | Média | UP-001 |

## Decisões que precisam ser confirmadas antes da implementação

A próxima rodada deve confirmar se o UltraPlayer continuará compatível com o painel e os endpoints atualmente referenciados pelo binário, se haverá um novo backend próprio ou apenas uma camada de configuração, qual será o `applicationId` definitivo e se a distribuição será privada, interna ou pública. Também é necessário confirmar a titularidade/autorização sobre o APK, o painel, as listas e os componentes de terceiros antes de redistribuir qualquer build.
