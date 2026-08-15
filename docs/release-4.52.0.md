# UltraPlayer 4.52.0 — Expiração da lista M3U ativa

A versão **4.52.0** (`versionCode 90`) corrige a validade exibida no rodapé da Home e em Configurações.

## Regra de prioridade

O aplicativo agora procura a data nesta ordem:

1. Parâmetros da URL da lista ativa, incluindo `exp_date`, `expire_date`, `expires`, `expires_at`, `expiration`, `valid_until` e equivalentes.
2. Metadados individuais da lista M3U/M3U Plus ou Xtream, incluindo `exp_date`, `expire_date`, `expires_at` e campos aninhados de `user_info`/`account_info`.
3. Consulta direta ao `player_api.php` da própria URL M3U quando ela contém credenciais Xtream, lendo `user_info.exp_date`.
4. A validade global do painel permanece apenas como fallback quando a fonte da lista não entrega uma data.

A data da lista ativa tem prioridade sobre uma data global antiga salva no snapshot do painel. A seleção respeita a lista ativa em cenários de múltiplas listas.

## Validação

- Teste determinístico de URL M3U/Xtream: `M3U_EXPIRY_TEST_OK`.
- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.52.0-m3u-expiry-release.apk`.
- SHA-256: `de5de2bfc1f4e20428a0b5ad231497ec7baea1807a4773561f9fbed35408e7bb`.
