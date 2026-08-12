package p114k0;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p036M0.C0380q;
import p064W.AbstractC0632A;
import p082b0.C1061b;
import p088d0.C1387k;
import p088d0.InterfaceC1388l;

/* JADX INFO: renamed from: k0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1948i implements InterfaceC1913G, InterfaceC1388l {

    /* JADX INFO: renamed from: g */
    public final Object f8531g;

    /* JADX INFO: renamed from: h */
    public C0380q f8532h;

    /* JADX INFO: renamed from: i */
    public C1387k f8533i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC1951k f8534j;

    public C1948i(AbstractC1951k abstractC1951k, Object obj) {
        this.f8534j = abstractC1951k;
        this.f8532h = new C0380q((CopyOnWriteArrayList) abstractC1951k.f8477c.f1293j, 0, (C1907A) null);
        this.f8533i = new C1387k(abstractC1951k.f8478d.f6184c, 0, null);
        this.f8531g = obj;
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: G */
    public final void mo2035G(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        if (m4500a(i3, c1907a)) {
            C0380q c0380q = this.f8532h;
            C1963w c1963wM4501b = m4501b(c1963w, c1907a);
            c0380q.getClass();
            c0380q.m1043c(new C1909C(c0380q, c1958r, c1963wM4501b, 2));
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: L */
    public final void mo2036L(int i3, C1907A c1907a, Exception exc) {
        if (m4500a(i3, c1907a)) {
            this.f8533i.m3486d(exc);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX INFO: renamed from: a */
    public final boolean m4500a(int i3, C1907A c1907a) {
        C1907A c1907aMo4439s;
        Object obj = this.f8531g;
        AbstractC1951k abstractC1951k = this.f8534j;
        if (c1907a != null) {
            c1907aMo4439s = abstractC1951k.mo4439s(obj, c1907a);
            if (c1907aMo4439s == null) {
                return false;
            }
        } else {
            c1907aMo4439s = null;
        }
        int iMo4504u = abstractC1951k.mo4504u(i3, obj);
        C0380q c0380q = this.f8532h;
        if (c0380q.f1291h == iMo4504u) {
            int i4 = AbstractC0632A.f2454a;
            if (!Objects.equals((C1907A) c0380q.f1292i, c1907aMo4439s)) {
                this.f8532h = new C0380q((CopyOnWriteArrayList) abstractC1951k.f8477c.f1293j, iMo4504u, c1907aMo4439s);
            }
        } else {
            this.f8532h = new C0380q((CopyOnWriteArrayList) abstractC1951k.f8477c.f1293j, iMo4504u, c1907aMo4439s);
        }
        C1387k c1387k = this.f8533i;
        if (c1387k.f6182a == iMo4504u) {
            int i5 = AbstractC0632A.f2454a;
            if (Objects.equals(c1387k.f6183b, c1907aMo4439s)) {
                return true;
            }
        }
        this.f8533i = new C1387k(abstractC1951k.f8478d.f6184c, iMo4504u, c1907aMo4439s);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C1963w m4501b(C1963w c1963w, C1907A c1907a) {
        AbstractC1951k abstractC1951k = this.f8534j;
        Object obj = this.f8531g;
        long j3 = c1963w.f8589f;
        long jMo4503t = abstractC1951k.mo4503t(j3, obj);
        long j4 = c1963w.f8590g;
        long jMo4503t2 = abstractC1951k.mo4503t(j4, obj);
        if (jMo4503t == j3 && jMo4503t2 == j4) {
            return c1963w;
        }
        return new C1963w(c1963w.f8584a, c1963w.f8585b, c1963w.f8586c, c1963w.f8587d, c1963w.f8588e, jMo4503t, jMo4503t2);
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: d */
    public final void mo2038d(int i3, C1907A c1907a, int i4) {
        if (m4500a(i3, c1907a)) {
            this.f8533i.m3485c(i4);
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: g */
    public final void mo2039g(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w, IOException iOException, boolean z3) {
        if (m4500a(i3, c1907a)) {
            C0380q c0380q = this.f8532h;
            C1963w c1963wM4501b = m4501b(c1963w, c1907a);
            c0380q.getClass();
            c0380q.m1043c(new C1910D(c0380q, c1958r, c1963wM4501b, iOException, z3));
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: l */
    public final void mo2040l(int i3, C1907A c1907a) {
        if (m4500a(i3, c1907a)) {
            this.f8533i.m3484b();
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: n */
    public final void mo2041n(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        if (m4500a(i3, c1907a)) {
            C0380q c0380q = this.f8532h;
            C1963w c1963wM4501b = m4501b(c1963w, c1907a);
            c0380q.getClass();
            c0380q.m1043c(new C1909C(c0380q, c1958r, c1963wM4501b, 1));
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: p */
    public final void mo2042p(int i3, C1907A c1907a) {
        if (m4500a(i3, c1907a)) {
            this.f8533i.m3483a();
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: s */
    public final void mo2043s(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        if (m4500a(i3, c1907a)) {
            C0380q c0380q = this.f8532h;
            C1963w c1963wM4501b = m4501b(c1963w, c1907a);
            c0380q.getClass();
            c0380q.m1043c(new C1909C(c0380q, c1958r, c1963wM4501b, 0));
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: x */
    public final void mo2044x(int i3, C1907A c1907a, C1963w c1963w) {
        if (m4500a(i3, c1907a)) {
            C0380q c0380q = this.f8532h;
            C1963w c1963wM4501b = m4501b(c1963w, c1907a);
            C1907A c1907a2 = (C1907A) c0380q.f1292i;
            c1907a2.getClass();
            c0380q.m1043c(new C1911E(c0380q, c1907a2, c1963wM4501b, 0));
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: y */
    public final void mo2045y(int i3, C1907A c1907a, C1963w c1963w) {
        if (m4500a(i3, c1907a)) {
            C0380q c0380q = this.f8532h;
            C1963w c1963wM4501b = m4501b(c1963w, c1907a);
            c0380q.getClass();
            c0380q.m1043c(new C1061b(c0380q, 2, c1963wM4501b));
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: z */
    public final void mo2046z(int i3, C1907A c1907a) {
        if (m4500a(i3, c1907a)) {
            this.f8533i.m3487e();
        }
    }
}
