package p077a0;

import android.util.Pair;
import java.io.IOException;
import p064W.RunnableC0641i;
import p082b0.C1064e;
import p088d0.InterfaceC1388l;
import p114k0.C1907A;
import p114k0.C1958r;
import p114k0.C1963w;
import p114k0.InterfaceC1913G;

/* JADX INFO: renamed from: a0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0812X implements InterfaceC1913G, InterfaceC1388l {

    /* JADX INFO: renamed from: g */
    public final C0814Z f3402g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0816a0 f3403h;

    public C0812X(C0816a0 c0816a0, C0814Z c0814z) {
        this.f3403h = c0816a0;
        this.f3402g = c0814z;
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: G */
    public final void mo2035G(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0810V(this, pairM2037a, c1958r, c1963w, 0));
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: L */
    public final void mo2036L(int i3, C1907A c1907a, Exception exc) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0804O(this, pairM2037a, exc, 1));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Pair m2037a(int i3, C1907A c1907a) {
        C1907A c1907aM4421a;
        C0814Z c0814z = this.f3402g;
        C1907A c1907a2 = null;
        if (c1907a != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= c0814z.f3409c.size()) {
                    c1907aM4421a = null;
                    break;
                }
                if (((C1907A) c0814z.f3409c.get(i4)).f8314d == c1907a.f8314d) {
                    Object obj = c0814z.f3408b;
                    int i5 = C0828g0.f3494k;
                    c1907aM4421a = c1907a.m4421a(Pair.create(obj, c1907a.f8311a));
                    break;
                }
                i4++;
            }
            if (c1907aM4421a == null) {
                return null;
            }
            c1907a2 = c1907aM4421a;
        }
        return Pair.create(Integer.valueOf(i3 + c0814z.f3410d), c1907a2);
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: d */
    public final void mo2038d(int i3, C1907A c1907a, int i4) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0641i(this, pairM2037a, i4, 1));
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: g */
    public final void mo2039g(int i3, C1907A c1907a, final C1958r c1958r, final C1963w c1963w, final IOException iOException, final boolean z3) {
        final Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new Runnable() { // from class: a0.W
                @Override // java.lang.Runnable
                public final void run() {
                    C1064e c1064e = this.f3396g.f3403h.f3422h;
                    Pair pair = pairM2037a;
                    c1064e.mo2039g(((Integer) pair.first).intValue(), (C1907A) pair.second, c1958r, c1963w, iOException, z3);
                }
            });
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: l */
    public final void mo2040l(int i3, C1907A c1907a) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0809U(this, pairM2037a, 2));
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: n */
    public final void mo2041n(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0810V(this, pairM2037a, c1958r, c1963w, 2));
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: p */
    public final void mo2042p(int i3, C1907A c1907a) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0809U(this, pairM2037a, 0));
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: s */
    public final void mo2043s(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0810V(this, pairM2037a, c1958r, c1963w, 1));
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: x */
    public final void mo2044x(int i3, C1907A c1907a, C1963w c1963w) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0808T(this, pairM2037a, c1963w, 0));
        }
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: y */
    public final void mo2045y(int i3, C1907A c1907a, C1963w c1963w) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0808T(this, pairM2037a, c1963w, 1));
        }
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: z */
    public final void mo2046z(int i3, C1907A c1907a) {
        Pair pairM2037a = m2037a(i3, c1907a);
        if (pairM2037a != null) {
            this.f3403h.f3423i.m1698c(new RunnableC0809U(this, pairM2037a, 1));
        }
    }
}
