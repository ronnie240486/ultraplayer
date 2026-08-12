package p114k0;

import android.os.Looper;
import android.support.v4.media.session.C0858A;
import java.util.concurrent.CopyOnWriteArrayList;
import p009D0.C0106b;
import p011E.C0111d;
import p036M0.C0380q;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0593y;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p070Y.C0716m;
import p070Y.InterfaceC0701A;
import p070Y.InterfaceC0711h;
import p082b0.C1071l;
import p088d0.C1387k;
import p088d0.InterfaceC1384h;
import p088d0.InterfaceC1390n;
import p095f0.C1528a;
import p129o0.C2065e;
import p145s0.InterfaceC2243p;

/* JADX INFO: renamed from: k0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C1926U extends AbstractC1932a {

    /* JADX INFO: renamed from: h */
    public final C0106b f8421h;

    /* JADX INFO: renamed from: i */
    public final C0111d f8422i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC1390n f8423j;

    /* JADX INFO: renamed from: k */
    public final C1528a f8424k;

    /* JADX INFO: renamed from: l */
    public final int f8425l;

    /* JADX INFO: renamed from: m */
    public final boolean f8426m;

    /* JADX INFO: renamed from: n */
    public boolean f8427n = true;

    /* JADX INFO: renamed from: o */
    public long f8428o = -9223372036854775807L;

    /* JADX INFO: renamed from: p */
    public boolean f8429p;

    /* JADX INFO: renamed from: q */
    public boolean f8430q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0701A f8431r;

    /* JADX INFO: renamed from: s */
    public C0539B f8432s;

    public C1926U(C0539B c0539b, C0106b c0106b, C0111d c0111d, InterfaceC1390n interfaceC1390n, C1528a c1528a, int i3, boolean z3) {
        this.f8432s = c0539b;
        this.f8421h = c0106b;
        this.f8422i = c0111d;
        this.f8423j = interfaceC1390n;
        this.f8424k = c1528a;
        this.f8425l = i3;
        this.f8426m = z3;
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: a */
    public final InterfaceC1965y mo3776a(C1907A c1907a, C2065e c2065e, long j3) {
        InterfaceC0711h interfaceC0711hMo518f = this.f8421h.mo518f();
        InterfaceC0701A interfaceC0701A = this.f8431r;
        if (interfaceC0701A != null) {
            ((C0716m) interfaceC0711hMo518f).mo1830e(interfaceC0701A);
        }
        C0593y c0593y = mo3777g().f1875b;
        c0593y.getClass();
        AbstractC0646n.m1631i(this.f8481g);
        C0858A c0858a = new C0858A((InterfaceC2243p) this.f8422i.f148h);
        C1387k c1387k = new C1387k(this.f8478d.f6184c, 0, c1907a);
        C0380q c0380q = new C0380q((CopyOnWriteArrayList) this.f8477c.f1293j, 0, c1907a);
        long jM1571L = AbstractC0632A.m1571L(c0593y.f2204f);
        return new C1923Q(c0593y.f2199a, interfaceC0711hMo518f, c0858a, this.f8423j, c1387k, this.f8424k, c0380q, this, c2065e, this.f8425l, this.f8426m, jM1571L, null);
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: g */
    public final synchronized C0539B mo3777g() {
        return this.f8432s;
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: k */
    public final void mo3779k(InterfaceC0701A interfaceC0701A) {
        this.f8431r = interfaceC0701A;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C1071l c1071l = this.f8481g;
        AbstractC0646n.m1631i(c1071l);
        InterfaceC1390n interfaceC1390n = this.f8423j;
        interfaceC1390n.mo992u(looperMyLooper, c1071l);
        interfaceC1390n.mo973b();
        m4453s();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: m */
    public final void mo3780m(InterfaceC1965y interfaceC1965y) {
        C1923Q c1923q = (C1923Q) interfaceC1965y;
        if (c1923q.f8377C) {
            for (C1930Y c1930y : c1923q.f8415z) {
                c1930y.m4468j();
                InterfaceC1384h interfaceC1384h = c1930y.f8456h;
                if (interfaceC1384h != null) {
                    interfaceC1384h.mo3463d(c1930y.f8453e);
                    c1930y.f8456h = null;
                    c1930y.f8455g = null;
                }
            }
        }
        c1923q.f8407r.m4638c(c1923q);
        c1923q.f8412w.removeCallbacksAndMessages(null);
        c1923q.f8413x = null;
        c1923q.f8395U = true;
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: o */
    public final void mo3781o() {
        this.f8423j.mo972a();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: r */
    public final synchronized void mo3782r(C0539B c0539b) {
        this.f8432s = c0539b;
    }

    /* JADX INFO: renamed from: s */
    public final void m4453s() {
        long j3 = this.f8428o;
        boolean z3 = this.f8429p;
        boolean z4 = this.f8430q;
        C0539B c0539bMo3777g = mo3777g();
        AbstractC0558V c1939d0 = new C1939d0(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z3, false, false, null, c0539bMo3777g, z4 ? c0539bMo3777g.f1876c : null);
        if (this.f8427n) {
            c1939d0 = new C1924S(c1939d0);
        }
        m4491l(c1939d0);
    }

    /* JADX INFO: renamed from: t */
    public final void m4454t(long j3, boolean z3, boolean z4) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f8428o;
        }
        if (!this.f8427n && this.f8428o == j3 && this.f8429p == z3 && this.f8430q == z4) {
            return;
        }
        this.f8428o = j3;
        this.f8429p = z3;
        this.f8430q = z4;
        this.f8427n = false;
        m4453s();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: i */
    public final void mo3778i() {
    }
}
