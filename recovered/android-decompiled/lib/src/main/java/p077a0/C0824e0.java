package p077a0;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import p055T.AbstractC0558V;
import p064W.AbstractC0646n;
import p064W.C0653u;

/* JADX INFO: renamed from: a0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824e0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0822d0 f3458a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0820c0 f3459b;

    /* JADX INFO: renamed from: c */
    public final C0653u f3460c;

    /* JADX INFO: renamed from: d */
    public int f3461d;

    /* JADX INFO: renamed from: e */
    public Object f3462e;

    /* JADX INFO: renamed from: f */
    public final Looper f3463f;

    /* JADX INFO: renamed from: g */
    public boolean f3464g;

    /* JADX INFO: renamed from: h */
    public boolean f3465h;

    /* JADX INFO: renamed from: i */
    public boolean f3466i;

    public C0824e0(InterfaceC0820c0 interfaceC0820c0, InterfaceC0822d0 interfaceC0822d0, AbstractC0558V abstractC0558V, int i3, C0653u c0653u, Looper looper) {
        this.f3459b = interfaceC0820c0;
        this.f3458a = interfaceC0822d0;
        this.f3463f = looper;
        this.f3460c = c0653u;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2071a(long j3) {
        boolean z3;
        AbstractC0646n.m1630h(this.f3464g);
        AbstractC0646n.m1630h(this.f3463f.getThread() != Thread.currentThread());
        this.f3460c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j3;
        while (true) {
            z3 = this.f3466i;
            if (z3 || j3 <= 0) {
                break;
            }
            this.f3460c.getClass();
            wait(j3);
            this.f3460c.getClass();
            j3 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z3) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2072b(boolean z3) {
        this.f3465h = z3 | this.f3465h;
        this.f3466i = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: c */
    public final void m2073c() {
        AbstractC0646n.m1630h(!this.f3464g);
        this.f3464g = true;
        C0797H c0797h = (C0797H) this.f3459b;
        synchronized (c0797h) {
            if (!c0797h.f3289I && c0797h.f3319q.getThread().isAlive()) {
                c0797h.f3317o.m1697a(14, this).m1695b();
                return;
            }
            AbstractC0646n.m1647y("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m2072b(false);
        }
    }
}
