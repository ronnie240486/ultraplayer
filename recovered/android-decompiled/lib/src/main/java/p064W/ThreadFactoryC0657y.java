package p064W;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: W.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0657y implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
