package p145s0;

import p030K0.C0334e;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: s0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2249v implements InterfaceC2252y {

    /* JADX INFO: renamed from: a */
    public final C0334e f9673a;

    /* JADX INFO: renamed from: b */
    public final C0334e f9674b;

    /* JADX INFO: renamed from: c */
    public long f9675c;

    public C2249v(long j3, long[] jArr, long[] jArr2) {
        AbstractC0646n.m1625c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f9673a = new C0334e(length, 2);
            this.f9674b = new C0334e(length, 2);
        } else {
            int i3 = length + 1;
            C0334e c0334e = new C0334e(i3, 2);
            this.f9673a = c0334e;
            C0334e c0334e2 = new C0334e(i3, 2);
            this.f9674b = c0334e2;
            c0334e.m922b(0L);
            c0334e2.m922b(0L);
        }
        this.f9673a.m923c(jArr);
        this.f9674b.m923c(jArr2);
        this.f9675c = j3;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return this.f9674b.f1062g > 0;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        C0334e c0334e = this.f9674b;
        if (c0334e.f1062g == 0) {
            C2253z c2253z = C2253z.f9685c;
            return new C2251x(c2253z, c2253z);
        }
        int iM1583b = AbstractC0632A.m1583b(c0334e, j3);
        long jM927g = c0334e.m927g(iM1583b);
        C0334e c0334e2 = this.f9673a;
        C2253z c2253z2 = new C2253z(jM927g, c0334e2.m927g(iM1583b));
        if (jM927g == j3 || iM1583b == c0334e.f1062g - 1) {
            return new C2251x(c2253z2, c2253z2);
        }
        int i3 = iM1583b + 1;
        return new C2251x(c2253z2, new C2253z(c0334e.m927g(i3), c0334e2.m927g(i3)));
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f9675c;
    }
}
