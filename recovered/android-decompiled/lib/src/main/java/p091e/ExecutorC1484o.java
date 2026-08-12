package p091e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p064W.RunnableC0647o;

/* JADX INFO: renamed from: e.o */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1484o implements Executor {

    /* JADX INFO: renamed from: g */
    public final Object f6616g = new Object();

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f6617h = new ArrayDeque();

    /* JADX INFO: renamed from: i */
    public final ExecutorC1485p f6618i;

    /* JADX INFO: renamed from: j */
    public Runnable f6619j;

    public ExecutorC1484o(ExecutorC1485p executorC1485p) {
        this.f6618i = executorC1485p;
    }

    /* JADX INFO: renamed from: a */
    public final void m3716a() {
        synchronized (this.f6616g) {
            try {
                Runnable runnable = (Runnable) this.f6617h.poll();
                this.f6619j = runnable;
                if (runnable != null) {
                    this.f6618i.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f6616g) {
            try {
                this.f6617h.add(new RunnableC0647o(this, 8, runnable));
                if (this.f6619j == null) {
                    m3716a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
