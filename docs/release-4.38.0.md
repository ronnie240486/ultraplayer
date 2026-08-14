# UltraPlayer 4.38.0

## Correções desta versão

A versão **4.38.0** (`versionCode 76`) reúne duas correções solicitadas na experiência do aplicativo.

| Área | Correção |
|---|---|
| Vencimento | Usuários autenticados por MAC passam a atualizar a validade diretamente pelo `check_mac.php` em segundo plano, mesmo quando a Home foi aberta a partir de um snapshot antigo. A validade da lista ativa é aplicada ao estado exibido no rodapé. |
| Múltiplas listas | A validade é recalculada quando o usuário troca de lista, evitando manter uma data antiga ou mostrar “Sem expiração” por causa de estado desatualizado. |
| Detalhe de Filmes | Os controles ficam na ordem **Reproduzir → Trailer → Favoritos** em uma única linha horizontal. |
| Detalhe de Séries | Os controles ficam na ordem **Reproduzir/Continuar → Trailer → Favoritos** em uma única linha horizontal. |
| Detalhe M3U | O mesmo alinhamento é aplicado aos detalhes de filmes e séries provenientes de M3U. |
| Controle remoto | Cada botão continua focalizável individualmente, com destaque verde e rótulo acessível para Favoritos. |
| Tela Celular | A linha usa dimensões compactas e rolagem horizontal apenas se a largura disponível for insuficiente; a orientação permanece paisagem. |

## Teste do vencimento

Ao abrir a Home com o MAC de teste, o app consulta novamente o painel e deve mostrar a data real no rodapé. Para a resposta consultada durante a implementação, `expire_date: 2027-08-14` deve aparecer como **14/08/2027**.

## Teste dos botões

Abra um filme ou uma série e confirme que os três controles aparecem na mesma linha, sem ficarem empilhados: **Reproduzir**, **Trailer** e **Favoritos**. No controle remoto, use esquerda e direita para passar entre os três botões e OK para acionar o controle focado.

## Validação e artefatos

- Sintaxe de `zlocal.js`: validada com `node --check`.
- Compilação Release: concluída com sucesso usando R8 e `shrinkResources`.
- APK: `releases/UltraPlayer-4.38.0-expiry-actions-release.apk`.
- SHA-256: `b9af107418815b16c6691f504cfe2996d4b73498f1b95dc772409362f34d94f3`.
