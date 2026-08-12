package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.S1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC1226S1 extends AbstractC1179G1 implements RunnableFuture {

    /* JADX INFO: renamed from: p */
    public volatile RunnableC1222R1 f5703p;

    public RunnableFutureC1226S1(Callable callable) {
        super(12);
        this.f5703p = new RunnableC1222R1(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1179G1
    /* JADX INFO: renamed from: e0 */
    public final String mo3136e0() {
        RunnableC1222R1 runnableC1222R1 = this.f5703p;
        return runnableC1222R1 != null ? AbstractC0462h.m1166f("task=[", runnableC1222R1.toString(), "]") : super.mo3136e0();
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1179G1
    /* JADX INFO: renamed from: f0 */
    public final void mo3137f0() {
        RunnableC1222R1 runnableC1222R1;
        Object obj = this.f5628i;
        if ((obj instanceof C1349x1) && ((C1349x1) obj).f5988a && (runnableC1222R1 = this.f5703p) != null) {
            RunnableC1195K1 runnableC1195K1 = RunnableC1222R1.f5688j;
            RunnableC1195K1 runnableC1195K2 = RunnableC1222R1.f5687i;
            Runnable runnable = (Runnable) runnableC1222R1.get();
            if (runnable instanceof Thread) {
                RunnableC1191J1 runnableC1191J1 = new RunnableC1191J1(runnableC1222R1);
                runnableC1191J1.setExclusiveOwnerThread(Thread.currentThread());
                if (runnableC1222R1.compareAndSet(runnable, runnableC1191J1)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) runnableC1222R1.getAndSet(runnableC1195K2)) == runnableC1195K1) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) runnableC1222R1.getAndSet(runnableC1195K2)) == runnableC1195K1) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f5703p = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        RunnableC1222R1 runnableC1222R1 = this.f5703p;
        if (runnableC1222R1 != null) {
            runnableC1222R1.run();
        }
        this.f5703p = null;
    }
}
