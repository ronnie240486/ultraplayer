# UltraPlayer 4.63.0 — Recomendações contextuais

A versão **4.63.0** (`versionCode 101`) torna a faixa **Para você** mais transparente e interativa.

## Motivos das recomendações

Cada card agora explica por que foi selecionado. Quando a recomendação recebe pontuação por uma categoria relacionada a um favorito, aparece **Porque você favoritou algo parecido**. Conteúdos com metadado recente aparecem como **Novidade na sua lista**. Os demais usam **Sugestão para você**.

A lógica continua local, utiliza os favoritos e os catálogos já carregados, respeita o filtro do perfil infantil e não cria chamadas de rede adicionais. O coração rápido continua funcionando sobre a capa e tocar no card mantém a navegação normal para os detalhes ou retomada.

## Fluxos preservados

O microfone principal continua direto, inclusive “Space HD”. EPG tradicional, EPG inteligente por voz, player único, próximo episódio com contagem e Cancelar, Meus Alertas, fila, favoritos, retomada, perfil infantil, D-pad e modo Celular/TV Box permanecem preservados. O controle remoto pelo celular continua excluído.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Campo de motivo contextual: presente.
- Renderização do motivo nos cards: presente.
- Voz direta: preservada.
- EPG inteligente: preservado.
- Próximo episódio interativo: preservado.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.63.0-contextual-recommendations-release.apk`.
- SHA-256: `5f5b1263e0cf7eb5deda3398777b60ded245e6981b80c6cdd2f64928a0762bc0`.
