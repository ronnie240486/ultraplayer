# Fusion 4.80.0 — Controles permanentes e Home TV Box não bloqueante

## Controles superiores do player

O overlay superior do player de canais agora é mantido visível quando o player está em tela cheia. Menu de canais, esticar, diminuir/aumentar zoom, indicador de zoom e reset ficam em primeiro plano, com alpha total, elevação e foco acessível pelo D-pad. O `PlayerView` também usa controller sem timeout e não esconde o controller ao toque.

## Home TV Box

A escala da Home foi reduzida da versão 4.78.0 para um tamanho intermediário: TV ao Vivo usa bloco amplo, Filmes/Séries e atalhos usam blocos menores, e as fileiras inferiores mantêm cards legíveis sem ocupar toda a tela.

A primeira pintura da Home não inicia parsing completo de M3U. Em TV Box, somente catálogo compacto já salvo em cache é hidratado. Sem cache, a Home continua liberada para o controle e a carga integral acontece quando o usuário entra na categoria. Isso evita que o D-pad fique travado enquanto milhares de itens são processados.

## Compatibilidade

As regras são específicas de `body.zx-ff-tv`. O layout Celular continua separado. Player único, EPG, autenticação, listas, TMDB, UltraSession, temas e orientação landscape foram preservados.

## Validação

`node --check` aprovado para `zlocal.js`, `tv.js` e `category_browser.js`. `assembleRelease` com R8 concluído com sucesso. APK final: 8.145.757 bytes. SHA-256: `c56d39f2a968bed71eff998776295750df28d8f63b816c1dd88e68a5eab6fa56`.
