package p116l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1971b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f8600a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f8600a.getAndIncrement());
        return thread;
    }
}
