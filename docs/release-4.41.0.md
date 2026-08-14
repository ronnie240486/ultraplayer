# UltraPlayer 4.41.0 — Perfis infantis, acessibilidade e modo ambiente

A versão **4.41.0** (`versionCode 79`) adiciona controles avançados de uso familiar sobre a base da 4.40.0.

## Recursos incluídos

| Área | Entrega |
|---|---|
| Perfil infantil | Campo opcional de limite diário em minutos. O valor `0` mantém uso sem limite. |
| Contagem local | O tempo é contado no aparelho por perfil e por dia; não envia histórico de uso, MAC ou atividade ao painel. |
| Bloqueio de limite | Ao atingir o limite diário, aparece um modal para o responsável e o app retorna à Home. Perfis adultos não são afetados. |
| Modo ambiente | Após 45 segundos sem interação na Home, pode mostrar relógio, data, logo e fundo. Qualquer tecla, toque ou clique fecha o modo. |
| Acessibilidade | Texto maior e Alto contraste continuam disponíveis nas Configurações, com foco branco/verde reforçado. |
| Diagnóstico | Verificação local de internet, servidor, player, modo Celular/TV Box e estado dos catálogos. |
| Compatibilidade | O player único, orientação horizontal, navegação D-pad, autenticação MAC/usuário e filtros infantis anteriores foram preservados. |

## Como usar o limite infantil

Abra **Perfis**, edite um perfil infantil e defina o número de minutos em **Limite diário do perfil infantil**. Use `0` para desligar o limite. O contador é reiniciado automaticamente a cada novo dia do aparelho.

## Como usar o modo ambiente

Abra **Configurações → Acessibilidade e diagnóstico → Modo ambiente**. O recurso fica desligado por padrão. Ele só aparece na Home, não cobre o player e é fechado com qualquer interação.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Verificação estática: 10 itens JavaScript e 3 itens Java verificados.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.41.0-future-profiles-release.apk`.
- SHA-256: `fb6826a83a2d601d3575009617ae97f33af3413369bf9d068cdfa23b3cbf84e4`.

## Próxima etapa

As próximas evoluções previstas são sincronização opcional de progresso entre dispositivos, suporte a recomendações remotas controladas pelo painel e um assistente conversacional remoto opcional. A camada local continuará sendo o caminho padrão para navegação, privacidade e funcionamento rápido na TV Box.
