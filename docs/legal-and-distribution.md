# Titularidade, licenças e distribuição

O repositório contém um APK fornecido pelo usuário, arquivos extraídos e código descompilado. A publicação deve ser feita apenas em um repositório privado até que a titularidade e a autorização para engenharia reversa, modificação e redistribuição estejam confirmadas.

Os arquivos recuperados incluem componentes de terceiros, como AndroidX, Kotlin, Media3/ExoPlayer, Google Cast, Firebase/Transport, HLS e um componente de verificação de licença. A presença desses arquivos no APK não concede automaticamente direito de redistribuir seus fontes descompilados ou de reutilizar configurações de distribuição. Antes de uma release pública, cada dependência deve ser identificada, sua licença deve ser atendida e o código que não for necessário deve ser removido da árvore-fonte.

O APK original também referencia serviços remotos, identificador do aparelho, credenciais de lista, licença e possíveis dados de branding. Nenhuma credencial, token ou lista de conteúdo deve ser commitada. Endpoints de produção devem ser configurados por ambiente, e logs devem omitir usuário, senha, identificador do dispositivo e URLs sensíveis.

A nova identidade UltraPlayer deve ser aplicada somente depois de confirmar que a mudança não infringe marca, código, painel ou contratos de terceiros. A cópia atual preserva a referência original para comparação; ela não deve ser distribuída como se fosse um produto novo nem como uma declaração de autoria do código recuperado.
