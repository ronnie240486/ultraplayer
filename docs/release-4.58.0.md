# UltraPlayer 4.58.0 — Home rápida na TV Box

A versão **4.58.0** (`versionCode 96`) prioriza a abertura da Home para o uso em TV Box.

## Otimização principal

Quando já existe uma playlist salva, o aplicativo não espera a confirmação da VPS para mostrar a Home. Ele utiliza imediatamente o servidor da própria playlist, libera a tela inicial e confirma a licença em segundo plano. Isso evita que uma chamada de rede de até 12 segundos bloqueie a primeira tela.

As fileiras **Filmes em destaque** e **Para você** continuam disponíveis, mas são construídas depois da primeira pintura. Contagens de catálogos, recomendações e capas são carregadas em segundo plano para não disputar CPU, memória e rede com a navegação inicial do controle remoto.

No primeiro acesso, sem playlist salva, a autenticação ainda precisa consultar o servidor. Depois do primeiro login, a abertura rápida utiliza o estado local e atualiza os dados silenciosamente.

## Recursos futuristas preservados

A voz direta continua funcionando: tocar no microfone e falar “Space HD” abre diretamente o canal. O player único, EPG, alertas, retomada, favoritos, fila, PIN infantil, volume por voz e Meus Alertas não foram removidos. O controle remoto pelo celular continua fora do aplicativo.

## Validação

- JavaScript: `node --check` aprovado.
- Boot rápido com playlist salva: presente.
- Recomendações adiadas na TV Box: presente.
- Player único: preservado.
- Build Release: aprovado.
- APK: `releases/UltraPlayer-4.58.0-fast-tvbox-release.apk`.
- SHA-256: `1ca4a906cfe477280b551dcedc4776de89d7f695babb0893680dc536dfef92f1`.

O tempo real depende da TV Box, da rede e da lista. A otimização remove a espera desnecessária antes da Home, mas a reprodução de um conteúdo ainda depende da resposta do servidor da playlist.
