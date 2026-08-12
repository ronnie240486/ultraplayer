package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.R1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1222R1 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: i */
    public static final RunnableC1195K1 f5687i = new RunnableC1195K1();

    /* JADX INFO: renamed from: j */
    public static final RunnableC1195K1 f5688j = new RunnableC1195K1();

    /* JADX INFO: renamed from: g */
    public final Callable f5689g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RunnableFutureC1226S1 f5690h;

    public RunnableC1222R1(RunnableFutureC1226S1 runnableFutureC1226S1, Callable callable) {
        this.f5690h = runnableFutureC1226S1;
        callable.getClass();
        this.f5689g = callable;
    }

    /* JADX INFO: renamed from: a */
    public final void m3184a(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC1191J1 runnableC1191J1 = null;
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            boolean z4 = runnable instanceof RunnableC1191J1;
            RunnableC1195K1 runnableC1195K1 = f5688j;
            if (!z4) {
                if (runnable != runnableC1195K1) {
                    break;
                }
            } else {
                runnableC1191J1 = (RunnableC1191J1) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC1195K1 || compareAndSet(runnable, runnableC1195K1)) {
                z3 = Thread.interrupted() || z3;
                LockSupport.park(runnableC1191J1);
            }
            runnable = (Runnable) get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            RunnableFutureC1226S1 runnableFutureC1226S1 = this.f5690h;
            boolean zIsDone = runnableFutureC1226S1.isDone();
            RunnableC1195K1 runnableC1195K1 = f5687i;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f5689g.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC1195K1)) {
                            m3184a(threadCurrentThread);
                        }
                        boolean zMo1530T = AbstractC1179G1.f5626n.mo1530T(runnableFutureC1226S1, null, new C1357z1(th));
                        if (zMo1530T) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (!compareAndSet(threadCurrentThread, runnableC1195K1)) {
                            m3184a(threadCurrentThread);
                        }
                        runnableFutureC1226S1.getClass();
                        if (AbstractC1179G1.f5626n.mo1530T(runnableFutureC1226S1, null, AbstractC1179G1.f5627o)) {
                            AbstractC1179G1.m3134i0(runnableFutureC1226S1);
                        }
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC1195K1)) {
                m3184a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            runnableFutureC1226S1.getClass();
            if (objCall == null) {
                objCall = AbstractC1179G1.f5627o;
            }
            if (AbstractC1179G1.f5626n.mo1530T(runnableFutureC1226S1, null, objCall)) {
                AbstractC1179G1.m3134i0(runnableFutureC1226S1);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strM1166f;
        Runnable runnable = (Runnable) get();
        if (runnable == f5687i) {
            strM1166f = "running=[DONE]";
        } else if (runnable instanceof RunnableC1191J1) {
            strM1166f = "running=[INTERRUPTED]";
        } else {
            strM1166f = runnable instanceof Thread ? AbstractC0462h.m1166f("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return strM1166f + ", " + this.f5689g.toString();
    }
}
