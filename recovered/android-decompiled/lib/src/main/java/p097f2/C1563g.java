package p097f2;

import p046P1.AbstractC0491s;
import p049Q1.C0513b;
import p055T.C0584p;
import p077a0.C0817b;

/* JADX INFO: renamed from: f2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1563g {

    /* JADX INFO: renamed from: a */
    public final Object f7071a = new Object();

    /* JADX INFO: renamed from: b */
    public final C0817b f7072b;

    /* JADX INFO: renamed from: c */
    public boolean f7073c;

    /* JADX INFO: renamed from: d */
    public Object f7074d;

    /* JADX INFO: renamed from: e */
    public Exception f7075e;

    public C1563g() {
        C0817b c0817b = new C0817b();
        c0817b.f3428b = new Object();
        this.f7072b = c0817b;
    }

    /* JADX INFO: renamed from: a */
    public final void m3884a(InterfaceC1557a interfaceC1557a) {
        this.f7072b.m2058e(new C1562f(AbstractC1561e.f7066a, interfaceC1557a));
        m3891h();
    }

    /* JADX INFO: renamed from: b */
    public final void m3885b(InterfaceC1559c interfaceC1559c) {
        this.f7072b.m2058e(new C1562f(AbstractC1561e.f7066a, interfaceC1559c));
        m3891h();
    }

    /* JADX INFO: renamed from: c */
    public final Exception m3886c() {
        Exception exc;
        synchronized (this.f7071a) {
            exc = this.f7075e;
        }
        return exc;
    }

    /* JADX INFO: renamed from: d */
    public final Object m3887d() {
        Object obj;
        synchronized (this.f7071a) {
            try {
                AbstractC0491s.m1215g("Task is not yet complete", this.f7073c);
                Exception exc = this.f7075e;
                if (exc != null) {
                    throw new C0513b(exc);
                }
                obj = this.f7074d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3888e() {
        boolean z3;
        synchronized (this.f7071a) {
            try {
                z3 = false;
                if (this.f7073c && this.f7075e == null) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: f */
    public final void m3889f(Exception exc) {
        synchronized (this.f7071a) {
            m3890g();
            this.f7073c = true;
            this.f7075e = exc;
        }
        this.f7072b.m2059f(this);
    }

    /* JADX INFO: renamed from: g */
    public final void m3890g() {
        boolean z3;
        String strConcat;
        if (this.f7073c) {
            int i3 = C0584p.f2167g;
            synchronized (this.f7071a) {
                z3 = this.f7073c;
            }
            if (!z3) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM3886c = m3886c();
            if (excM3886c == null) {
                strConcat = m3888e() ? "result ".concat(String.valueOf(m3887d())) : "unknown issue";
            } else {
                strConcat = "failure";
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3891h() {
        synchronized (this.f7071a) {
            try {
                if (this.f7073c) {
                    this.f7072b.m2059f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
