# UltraPlayer 1.9.0 — perfis com avatares ilustrados

A versão 1.9.0 redesenha a tela de gerenciamento de perfis conforme a referência enviada. Os doze avatares anteriores, que eram círculos com glifos SVG, foram substituídos por retratos ilustrados quadrados, com cantos arredondados, enquadramento de rosto e acabamento cinematográfico em tons ciano, teal, violeta e dourado.

A grade de avatares usa quatro colunas em telas largas e permanece responsiva no celular. O avatar selecionado recebe borda ciano e brilho suave; o mesmo estilo aparece no avatar em destaque e no seletor de perfil. Os índices já gravados em `localStorage` foram preservados, portanto os perfis existentes continuam apontando para a mesma posição da nova coleção.

O editor agora inclui o cartão **Perfil infantil**, com descrição e chave liga/desliga visual no estilo da referência. O estado infantil é persistido por perfil nos dados locais. A filtragem de conteúdo infantil será integrada à consulta de catálogo em uma etapa posterior; nesta entrega, a tela e o armazenamento da preferência já estão prontos.

Os avatares foram reduzidos para JPEG 256×256 para manter a qualidade visual sem aumentar excessivamente o APK. O APK foi compilado com package `com.ultraplayer.app`, nome `UltraPlayer`, versionName `1.9.0`, versionCode `10` e `minSdk 21`. A build é debug para teste.
