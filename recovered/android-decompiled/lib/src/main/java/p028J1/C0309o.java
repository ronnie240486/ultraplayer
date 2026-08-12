package p028J1;

import android.os.Looper;
import java.util.Locale;
import p014F.RunnableC0153b;
import p034L1.C0352g;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: J1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0309o {

    /* JADX INFO: renamed from: i */
    public static final Object f823i = new Object();

    /* JADX INFO: renamed from: a */
    public final C0296b f824a;

    /* JADX INFO: renamed from: b */
    public final long f825b;

    /* JADX INFO: renamed from: c */
    public final String f826c;

    /* JADX INFO: renamed from: g */
    public InterfaceC0308n f830g;

    /* JADX INFO: renamed from: h */
    public RunnableC0153b f831h;

    /* JADX INFO: renamed from: e */
    public long f828e = -1;

    /* JADX INFO: renamed from: f */
    public long f829f = 0;

    /* JADX INFO: renamed from: d */
    public final HandlerC0784e f827d = new HandlerC0784e(Looper.getMainLooper(), 3);

    public C0309o(long j3, String str) {
        this.f825b = j3;
        this.f826c = str;
        this.f824a = new C0296b("RequestTracker", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m849a(long j3, InterfaceC0308n interfaceC0308n) {
        InterfaceC0308n interfaceC0308n2;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = f823i;
        synchronized (obj) {
            interfaceC0308n2 = this.f830g;
            j4 = this.f828e;
            j5 = this.f829f;
            this.f828e = j3;
            this.f830g = interfaceC0308n;
            this.f829f = jCurrentTimeMillis;
        }
        if (interfaceC0308n2 != null) {
            interfaceC0308n2.mo164l(this.f826c, j4, j5, jCurrentTimeMillis);
        }
        synchronized (obj) {
            try {
                RunnableC0153b runnableC0153b = this.f831h;
                if (runnableC0153b != null) {
                    this.f827d.removeCallbacks(runnableC0153b);
                }
                RunnableC0153b runnableC0153b2 = new RunnableC0153b(2, this);
                this.f831h = runnableC0153b2;
                this.f827d.postDelayed(runnableC0153b2, this.f825b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m850b(long j3, int i3, C0352g c0352g) {
        synchronized (f823i) {
            try {
                if (m851c(j3)) {
                    Locale locale = Locale.ROOT;
                    m853e(i3, c0352g, "request " + j3 + " completed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m851c(long j3) {
        boolean z3;
        synchronized (f823i) {
            long j4 = this.f828e;
            z3 = false;
            if (j4 != -1 && j4 == j3) {
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m852d() {
        boolean z3;
        synchronized (f823i) {
            z3 = this.f828e != -1;
        }
        return z3;
    }

    /* JADX INFO: renamed from: e */
    public final void m853e(int i3, C0352g c0352g, String str) {
        this.f824a.m831b(str, new Object[0]);
        Object obj = f823i;
        synchronized (obj) {
            try {
                if (this.f830g != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    InterfaceC0308n interfaceC0308n = this.f830g;
                    AbstractC0491s.m1213e(interfaceC0308n);
                    interfaceC0308n.mo154b(this.f826c, this.f828e, i3, c0352g, this.f829f, jCurrentTimeMillis);
                }
                this.f828e = -1L;
                this.f830g = null;
                synchronized (obj) {
                    try {
                        RunnableC0153b runnableC0153b = this.f831h;
                        if (runnableC0153b != null) {
                            this.f827d.removeCallbacks(runnableC0153b);
                            this.f831h = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m854f(int i3) {
        synchronized (f823i) {
            try {
                if (!m852d()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                m853e(i3, null, "clearing request " + this.f828e);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
