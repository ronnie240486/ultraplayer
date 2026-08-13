# UltraPlayer 2.4.0 — tela Servidor e navegação

A tela Servidor foi redesenhada para não depender dos estilos carregados apenas na seção de Canais. Antes, os botões recebiam o estilo padrão branco do WebView; agora cada lista é exibida como um card escuro com borda temática, ícone de servidor em SVG, nome da lista, host e indicador circular de seleção.

Em telas largas, os cards usam duas colunas. Em celulares, a lista cai para uma coluna com dimensões menores, contraste estável e área de toque confortável. O título passou a ser Servidor e a tela mantém o botão Voltar no topo.

A versão preserva o retorno do botão Voltar da seleção de perfis para a home e o suporte a múltiplos alarmes do EPG. Alarmes simultâneos entram em fila, cada um abre seu modal de 10 segundos e nenhum é descartado por já existir outro modal visível.

O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `2.4.0`, versionCode `15` e build debug.
