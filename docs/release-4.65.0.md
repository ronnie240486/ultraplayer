# UltraPlayer 4.65.0 — Limpeza segura da Minha Fila

A versão **4.65.0** (`versionCode 103`) acrescenta gerenciamento seguro para a fila pessoal.

## Limpar a fila

Na tela Minha Fila, quando existem itens, aparece o botão **Limpar fila**. O mesmo recurso pode ser chamado pelo microfone com frases como **“limpar minha fila”**, **“esvaziar a minha fila”** ou **“apagar a fila”**.

Nenhum item é apagado imediatamente. O app mostra uma confirmação com as opções **Cancelar** e **Limpar fila**. Cancelar mantém todos os conteúdos. Confirmar remove os itens somente do perfil atual e atualiza a tela.

A fila continua local, respeita o filtro do perfil infantil e não envia os conteúdos ao painel.

## Fluxos preservados

O microfone principal continua direto, inclusive “Space HD”. EPG tradicional, EPG inteligente por voz, player único, próximo episódio com contagem e Cancelar, Meus Alertas, recomendações contextuais, favoritos, retomada, Minha Fila, perfil infantil, D-pad e modo Celular/TV Box permanecem preservados. O controle remoto pelo celular continua excluído.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Limpeza de fila por voz: presente.
- Botão visível: presente.
- Modal de confirmação: presente.
- Cancelar sem apagar: presente.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.65.0-queue-clear-release.apk`.
- SHA-256: `a7c456b80123d4bc1492c80398701ca7d7c8ded39dbc1fffe6b7837efe2f2d0e`.
