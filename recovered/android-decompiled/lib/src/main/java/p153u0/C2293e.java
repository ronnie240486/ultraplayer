package p153u0;

import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p145s0.C2251x;
import p145s0.C2253z;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: u0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2293e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2226E f9785a;

    /* JADX INFO: renamed from: b */
    public final int f9786b;

    /* JADX INFO: renamed from: c */
    public final int f9787c;

    /* JADX INFO: renamed from: d */
    public final long f9788d;

    /* JADX INFO: renamed from: e */
    public final int f9789e;

    /* JADX INFO: renamed from: f */
    public int f9790f;

    /* JADX INFO: renamed from: g */
    public int f9791g;

    /* JADX INFO: renamed from: h */
    public int f9792h;

    /* JADX INFO: renamed from: i */
    public int f9793i;

    /* JADX INFO: renamed from: j */
    public int f9794j;

    /* JADX INFO: renamed from: k */
    public long f9795k;

    /* JADX INFO: renamed from: l */
    public long[] f9796l;

    /* JADX INFO: renamed from: m */
    public int[] f9797m;

    public C2293e(int i3, int i4, long j3, int i5, InterfaceC2226E interfaceC2226E) {
        boolean z3 = true;
        if (i4 != 1 && i4 != 2) {
            z3 = false;
        }
        AbstractC0646n.m1625c(z3);
        this.f9788d = j3;
        this.f9789e = i5;
        this.f9785a = interfaceC2226E;
        int i6 = (((i3 % 10) + 48) << 8) | ((i3 / 10) + 48);
        this.f9786b = (i4 == 2 ? 1667497984 : 1651965952) | i6;
        this.f9787c = i4 == 2 ? i6 | 1650720768 : -1;
        this.f9795k = -1L;
        this.f9796l = new long[512];
        this.f9797m = new int[512];
    }

    /* JADX INFO: renamed from: a */
    public final C2253z m4916a(int i3) {
        return new C2253z(((this.f9788d * ((long) 1)) / ((long) this.f9789e)) * ((long) this.f9797m[i3]), this.f9796l[i3]);
    }

    /* JADX INFO: renamed from: b */
    public final C2251x m4917b(long j3) {
        if (this.f9794j == 0) {
            C2253z c2253z = new C2253z(0L, this.f9795k);
            return new C2251x(c2253z, c2253z);
        }
        int i3 = (int) (j3 / ((this.f9788d * ((long) 1)) / ((long) this.f9789e)));
        int iM1585d = AbstractC0632A.m1585d(this.f9797m, i3, true, true);
        if (this.f9797m[iM1585d] == i3) {
            C2253z c2253zM4916a = m4916a(iM1585d);
            return new C2251x(c2253zM4916a, c2253zM4916a);
        }
        C2253z c2253zM4916a2 = m4916a(iM1585d);
        int i4 = iM1585d + 1;
        return i4 < this.f9796l.length ? new C2251x(c2253zM4916a2, m4916a(i4)) : new C2251x(c2253zM4916a2, c2253zM4916a2);
    }
}
