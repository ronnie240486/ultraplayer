# UltraPlayer 4.61.0 — Horário permitido para perfil infantil

A versão **4.61.0** (`versionCode 99`) acrescenta uma regra familiar local para o perfil infantil.

## Horário permitido

Na edição de um perfil infantil, o responsável pode informar uma hora inicial e uma hora final. Se os campos ficarem vazios, não há restrição de horário. Intervalos que atravessam a meia-noite também são aceitos, por exemplo, `22:00` até `07:00`.

Fora do intervalo, o app mostra o modal **Fora do horário permitido** e impede o uso do catálogo até que o horário permitido volte. Perfis adultos não sofrem nenhuma restrição. O limite diário em minutos continua funcionando junto com o horário.

A configuração fica somente no armazenamento local do aparelho. Ela não é enviada ao painel nem ao provedor da lista.

## Fluxos preservados

O microfone principal continua direto, inclusive “Space HD”. O EPG tradicional, EPG inteligente por voz, player único, retomada, favoritos, fila, Meus Alertas, D-pad, Celular/TV Box e volume por voz permanecem disponíveis. O controle remoto pelo celular não foi adicionado.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Horário permitido: presente.
- Modal fora do horário: presente.
- Perfil adulto sem restrição: presente.
- Limite diário: preservado.
- Voz direta e EPG inteligente: preservados.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.61.0-kids-schedule-release.apk`.
- SHA-256: `be48449eaaa0f7805d894016b03acb704785f7dbb1429093b4db50f33e71450d`.
