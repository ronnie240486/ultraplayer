package p097f2;

import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: f2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1560d {

    /* JADX INFO: renamed from: a */
    public final C1563g f7065a = new C1563g();

    /* JADX INFO: renamed from: a */
    public final void m3878a(Exception exc) {
        this.f7065a.m3889f(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m3879b(Object obj) {
        C1563g c1563g = this.f7065a;
        synchronized (c1563g.f7071a) {
            c1563g.m3890g();
            c1563g.f7073c = true;
            c1563g.f7074d = obj;
        }
        c1563g.f7072b.m2059f(c1563g);
    }

    /* JADX INFO: renamed from: c */
    public final void m3880c(Exception exc) {
        C1563g c1563g = this.f7065a;
        c1563g.getClass();
        AbstractC0491s.m1214f(exc, "Exception must not be null");
        synchronized (c1563g.f7071a) {
            try {
                if (c1563g.f7073c) {
                    return;
                }
                c1563g.f7073c = true;
                c1563g.f7075e = exc;
                c1563g.f7072b.m2059f(c1563g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
