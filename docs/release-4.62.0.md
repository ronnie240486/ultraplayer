# UltraPlayer 4.62.0 — Próximo episódio interativo

A versão **4.62.0** (`versionCode 100`) transforma o avanço automático de séries em uma experiência controlável.

## Como funciona

Quando faltam aproximadamente 60 segundos para terminar um episódio, o app mostra um cartão com o próximo episódio. O botão exibe temporada, episódio e a ação **Próximo episódio**. O usuário pode selecionar o botão com toque ou OK do controle remoto para avançar imediatamente.

Quando o episódio termina, começa uma contagem regressiva de 10 segundos. O próximo episódio só abre ao fim da contagem. O botão **Cancelar** interrompe o avanço e mantém o usuário no player, sem iniciar outra mídia.

O episódio concluído continua sendo marcado como assistido e o progresso é salvo pelo mesmo fluxo anterior. O próximo episódio usa o mesmo player nativo, sem criar uma segunda reprodução.

## Compatibilidade preservada

O mini player e o player completo continuam unificados. Voz direta, “Space HD”, EPG tradicional, EPG inteligente, Meus Alertas, fila, favoritos, retomada, perfil infantil, D-pad e modo Celular permanecem preservados. O controle remoto pelo celular continua excluído.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Próximo episódio: preservado.
- Contagem de 10 segundos: presente.
- Cancelar: presente.
- Autoavanço imediato removido.
- Player único: preservado.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.62.0-next-episode-release.apk`.
- SHA-256: `0b8d79c38b2adea496887c846a330c5848e8eb93f88818853b660726e2c92002`.
