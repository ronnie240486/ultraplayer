# Fusion 4.91.0 — player full-screen limpo

O player em tela cheia não exibe mais a barra superior de menu, categorias, zoom, aumentar/diminuir, esticar ou reset. O modo full-screen apresenta somente o vídeo, mantendo o botão de voltar para retornar ao mini player.

A reprodução continua no mesmo `ExoPlayer`: abrir o modo grande não cria outra instância, e voltar ao mini player preserva o mesmo canal, a posição e o estado de reprodução. O Media3 controller também fica desativado no modo full-screen para não mostrar controles extras.

Validação: `node --check` aprovado para os arquivos WebView; `assembleRelease` com R8 aprovado.
