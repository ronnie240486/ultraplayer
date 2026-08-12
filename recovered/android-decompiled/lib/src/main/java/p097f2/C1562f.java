package p097f2;

import java.util.concurrent.Executor;
import p013E1.RunnableC0121D;
import p040N1.ExecutorC0433n;

/* JADX INFO: renamed from: f2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1562f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7067a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f7068b = new Object();

    /* JADX INFO: renamed from: c */
    public final Executor f7069c;

    /* JADX INFO: renamed from: d */
    public final Object f7070d;

    public C1562f(ExecutorC0433n executorC0433n, InterfaceC1558b interfaceC1558b) {
        this.f7069c = executorC0433n;
        this.f7070d = interfaceC1558b;
    }

    /* JADX INFO: renamed from: b */
    private final void m3881b(C1563g c1563g) {
        synchronized (this.f7068b) {
        }
        this.f7069c.execute(new RunnableC0121D(this, c1563g, 8, false));
    }

    /* JADX INFO: renamed from: c */
    private final void m3882c(C1563g c1563g) {
        if (c1563g.m3888e()) {
            return;
        }
        synchronized (this.f7068b) {
        }
        ((ExecutorC0433n) this.f7069c).execute(new RunnableC0121D(this, c1563g, 9, false));
    }

    /* JADX INFO: renamed from: a */
    public final void m3883a(C1563g c1563g) {
        switch (this.f7067a) {
            case 0:
                m3881b(c1563g);
                return;
            case 1:
                m3882c(c1563g);
                return;
            default:
                if (c1563g.m3888e()) {
                    synchronized (this.f7068b) {
                        break;
                    }
                    ((ExecutorC0433n) this.f7069c).execute(new RunnableC0121D(this, c1563g, 10, false));
                    return;
                }
                return;
        }
    }

    public C1562f(ExecutorC0433n executorC0433n, InterfaceC1559c interfaceC1559c) {
        this.f7069c = executorC0433n;
        this.f7070d = interfaceC1559c;
    }

    public C1562f(Executor executor, InterfaceC1557a interfaceC1557a) {
        this.f7069c = executor;
        this.f7070d = interfaceC1557a;
    }
}
