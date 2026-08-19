# Fusion 4.82.0 — Buffer adaptativo de reprodução

## Política

O player único passou a usar `FusionLoadControl`, que mantém a mesma instância visual mini/full e adapta o carregamento conforme `kind`/`zxKind` do payload.

### Canais ao vivo

- Reserva máxima controlada de aproximadamente 12 segundos.
- Início após aproximadamente 1,2 segundo de dados.
- Após rebuffer, espera aproximadamente 3 segundos antes de retomar.
- O objetivo é reduzir microtravamentos sem criar atraso excessivo em TV ao vivo.

### Filmes e séries

- Reserva máxima de aproximadamente 45 segundos.
- Início padrão do Media3 em aproximadamente 2,5 segundos.
- Reserva maior atravessa oscilações curtas de rede sem exigir um buffer exagerado.

A política não corrige servidor que cai, URL inválida ou internet sem banda. Ela também não aumenta o parsing da M3U: o buffer atua somente depois que o player recebe a URL de reprodução.

## Cobertura

O `MainActivity` usa o buffer adaptativo no player mini/full compartilhado. O `PlayerActivity` também recebe o mesmo controle quando for aberto diretamente. Canais são identificados por `kind: live`/`zxKind: live`; filmes e episódios usam `kind: vod`.

## Validação

`node --check` aprovado para os scripts WebView. `assembleRelease` com R8 concluído com sucesso. APK final: 8.146.180 bytes. SHA-256: `f304cb5fd737462f550b109b80a9dab6cd2860707889872d3fb1d7863809be4e`.
