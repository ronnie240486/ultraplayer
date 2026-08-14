# UltraPlayer 4.40.0 — Home personalizada, EPG inteligente e acessibilidade

A versão **4.40.0** (`versionCode 78`) amplia a etapa futura iniciada na 4.39.0.

## Recursos incluídos

| Área | Entrega |
|---|---|
| Home personalizada | Nova faixa “Para você”, montada localmente por perfil a partir de favoritos, histórico, categorias relacionadas e itens recentes do catálogo. |
| Privacidade | As recomendações são calculadas no aparelho; nenhum histórico, senha, MAC ou URL privada é enviado a modelo externo. |
| EPG por voz | Comandos como “me avise quando começar o jornal nacional” procuram o programa na programação já carregada e criam o alarme existente, incluindo o modal de contagem regressiva. |
| Filtro infantil | Recomendações, busca universal e busca por voz respeitam o filtro do perfil infantil. |
| Acessibilidade | Configuração de Texto maior e Alto contraste, persistida no aparelho e aplicada às telas da Home, detalhes, botões e navegação. |
| Diagnóstico | Configurações ganhou uma verificação de internet, servidor, player, modo de tela e estado dos catálogos. |
| Vencimento | Configurações passa a usar `license.exp_date`, `expire_date` e a validade da lista ativa na mesma ordem confiável da Home. |
| Controle remoto | Opções novas usam o mesmo painel de foco e navegação vertical já existente. |

## Exemplos de comandos

- “Me avise quando começar o jornal nacional”.
- “Crie um aviso para o próximo jogo”.
- “Abrir favoritos”.
- “Abrir busca em tudo”.
- “Pausar”.
- “Continuar”.
- “Abrir tela cheia”.

## Observações do EPG por voz

A primeira versão procura primeiro o cache de EPG já carregado e, se necessário, consulta uma pequena janela inicial de canais em segundo plano. O sino e o modal continuam usando a mesma estrutura de alarmes do aplicativo; não há uma segunda agenda paralela.

## Validação

- `node --check app/src/main/assets/webui/zlocal.js`: aprovado.
- Verificação estática: 8 itens JavaScript e 3 itens Java verificados.
- `./gradlew assembleRelease --no-daemon`: aprovado.
- APK: `releases/UltraPlayer-4.40.0-future-home-release.apk`.
- SHA-256: `149bf2e4e8b4772c48b8d72318bc2907d21bc5bf39e1139b29de7befb9d3667e`.

## Próximas etapas do aplicativo do futuro

Ainda permanecem no roadmap o modo ambiente, limites de horário no perfil infantil, sincronização de progresso entre dispositivos e um assistente conversacional remoto opcional. Essas funções serão adicionadas com controles de privacidade e sem comprometer o funcionamento offline/local do núcleo atual.
