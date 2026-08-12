package p064W;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: W.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0658z implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2535b;

    public /* synthetic */ ThreadFactoryC0658z(int i3, String str) {
        this.f2534a = i3;
        this.f2535b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2534a) {
            case 0:
                return new Thread(runnable, this.f2535b);
            default:
                Thread thread = new Thread(runnable, this.f2535b);
                thread.setPriority(10);
                return thread;
        }
    }
}
