# UltraPlayer 4.25.0 — APK otimizado

A versão 4.25.0 mantém o aplicativo em **Android nativo Java**. O WebView híbrido continua responsável pela interface, enquanto a reprodução Media3/ExoPlayer e a ponte `HdxNative` permanecem nativas.

O build otimizado usa R8 para reduzir o bytecode, `shrinkResources` para remover recursos Android não utilizados e as regras de preservação da ponte JavaScript, das Activities e do Media3. O target SDK 28 foi mantido para preservar o comportamento atual de instalação e orientação; a verificação de requisito de publicação da Play Store foi desabilitada apenas para este build de teste.

A otimização também preserva o pré-carregamento escalonado de Filmes, Séries e Canais, o cache em memória de catálogos, o cache por categoria de Rádios e a busca sem bloquear a primeira pintura da home.

| Medição | Resultado |
|---|---:|
| APK debug anterior 4.24.1 | 6.595.902 bytes |
| APK otimizado 4.25.0 | 3.429.044 bytes |
| Redução absoluta | 3.166.858 bytes |
| Redução aproximada | 48,0% |

O APK otimizado foi assinado com a chave de debug do projeto para permitir instalação de teste e atualização sobre builds debug com a mesma assinatura. Zipalign e `apksigner verify` foram concluídos com sucesso.

Package: `com.ultraplayer.app`  
VersionName: `4.25.0`  
VersionCode: `63`  
SHA-256: `540973133ca90c6f2953adfa816de4f3231ca28b95855210ac6f18115122d01b`
