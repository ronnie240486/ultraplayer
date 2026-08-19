# Fusion 4.77.0 — Controles permanentes e Home imediata

## Controles do player

O `PlayerView` do player único e do `PlayerActivity` agora usa `setControllerShowTimeoutMs(0)` e `setControllerHideOnTouch(false)`. Os controles não desaparecem automaticamente após alguns segundos e permanecem acessíveis pelo controle remoto/D-pad. O mini player continua sem controller próprio e abre o mesmo player em tela cheia; ao retornar, o estado do player é preservado.

## Home TV Box

Antes da primeira pintura da Home, o Fusion hidrata o catálogo compacto persistido localmente para Filmes, Séries e Canais quando o form factor é TV Box. Com cache válido, a Home pode montar imediatamente a seção de **Filmes em destaque** e a faixa **Para você**, enquanto a atualização completa acontece em segundo plano.

O refresh completo não é paralelo: os catálogos são atualizados sequencialmente com intervalo de 700 ms para evitar pico de parsing, memória e GC em TV Boxes fracas. A carga de capas continua limitada por lotes.

Sem cache local, a primeira carga ainda depende do tamanho e da velocidade da lista M3U/Xtream. A partir da primeira carga concluída, as entradas seguintes usam a fotografia compacta local para abrir a Home mais rapidamente.

## Compatibilidade

As alterações de controller e cache imediato são direcionadas ao player nativo e à TV Box. A orientação continua landscape, o Celular mantém seu layout e os recursos de autenticação, listas, EPG, TMDB, UltraSession e player único permanecem intactos.

## Validação

`node --check` foi aprovado para `zlocal.js`, `tv.js` e `category_browser.js`. `assembleRelease` com R8 foi concluído com sucesso. O APK final tem 8.144.292 bytes, assinatura inicial ZIP `PK` e SHA-256 `19488f9eec51e0b27394ab6c48a14362f66f19e0a660173eb3ff964b9153476f`.
