package p074Z0;

import java.math.RoundingMode;
import p036M0.C0370g;
import p064W.AbstractC0632A;
import p145s0.C2251x;
import p145s0.C2253z;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: Z0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0779f implements InterfaceC2252y {

    /* JADX INFO: renamed from: a */
    public final C0370g f3183a;

    /* JADX INFO: renamed from: b */
    public final int f3184b;

    /* JADX INFO: renamed from: c */
    public final long f3185c;

    /* JADX INFO: renamed from: d */
    public final long f3186d;

    /* JADX INFO: renamed from: e */
    public final long f3187e;

    public C0779f(C0370g c0370g, int i3, long j3, long j4) {
        this.f3183a = c0370g;
        this.f3184b = i3;
        this.f3185c = j3;
        long j5 = (j4 - j3) / ((long) c0370g.f1188d);
        this.f3186d = j5;
        this.f3187e = m1892a(j5);
    }

    /* JADX INFO: renamed from: a */
    public final long m1892a(long j3) {
        long j4 = j3 * ((long) this.f3184b);
        long j5 = this.f3183a.f1187c;
        int i3 = AbstractC0632A.f2454a;
        return AbstractC0632A.m1577R(j4, 1000000L, j5, RoundingMode.DOWN);
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return true;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        C0370g c0370g = this.f3183a;
        long j4 = (((long) c0370g.f1187c) * j3) / (((long) this.f3184b) * 1000000);
        long j5 = this.f3186d;
        long jM1591j = AbstractC0632A.m1591j(j4, 0L, j5 - 1);
        long j6 = ((long) c0370g.f1188d) * jM1591j;
        long j7 = this.f3185c;
        long jM1892a = m1892a(jM1591j);
        C2253z c2253z = new C2253z(jM1892a, j6 + j7);
        if (jM1892a >= j3 || jM1591j == j5 - 1) {
            return new C2251x(c2253z, c2253z);
        }
        long j8 = jM1591j + 1;
        return new C2251x(c2253z, new C2253z(m1892a(j8), (((long) c0370g.f1188d) * j8) + j7));
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f3187e;
    }
}
