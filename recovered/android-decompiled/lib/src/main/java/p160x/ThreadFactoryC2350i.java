package p160x;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: x.i */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2350i implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C2349h(runnable);
    }
}
