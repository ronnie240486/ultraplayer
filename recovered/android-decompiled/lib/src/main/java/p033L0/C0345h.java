package p033L0;

import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p145s0.C2251x;
import p145s0.C2253z;

/* JADX INFO: renamed from: L0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0345h implements InterfaceC0343f {

    /* JADX INFO: renamed from: a */
    public final long f1113a;

    /* JADX INFO: renamed from: b */
    public final int f1114b;

    /* JADX INFO: renamed from: c */
    public final long f1115c;

    /* JADX INFO: renamed from: d */
    public final int f1116d;

    /* JADX INFO: renamed from: e */
    public final long f1117e;

    /* JADX INFO: renamed from: f */
    public final long f1118f;

    /* JADX INFO: renamed from: g */
    public final long[] f1119g;

    public C0345h(long j3, int i3, long j4, int i4, long j5, long[] jArr) {
        this.f1113a = j3;
        this.f1114b = i3;
        this.f1115c = j4;
        this.f1116d = i4;
        this.f1117e = j5;
        this.f1119g = jArr;
        this.f1118f = j5 != -1 ? j3 + j5 : -1L;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return this.f1119g != null;
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: d */
    public final long mo942d(long j3) {
        long j4 = j3 - this.f1113a;
        if (!mo941b() || j4 <= this.f1114b) {
            return 0L;
        }
        long[] jArr = this.f1119g;
        AbstractC0646n.m1631i(jArr);
        double d3 = (j4 * 256.0d) / this.f1117e;
        int iM1586e = AbstractC0632A.m1586e(jArr, (long) d3, true);
        long j5 = this.f1115c;
        long j6 = (((long) iM1586e) * j5) / 100;
        long j7 = jArr[iM1586e];
        int i3 = iM1586e + 1;
        long j8 = (j5 * ((long) i3)) / 100;
        long j9 = iM1586e == 99 ? 256L : jArr[i3];
        return Math.round((j7 == j9 ? 0.0d : (d3 - j7) / (j9 - j7)) * (j8 - j6)) + j6;
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: g */
    public final long mo943g() {
        return this.f1118f;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        double d3;
        double d4;
        boolean zMo941b = mo941b();
        int i3 = this.f1114b;
        long j4 = this.f1113a;
        if (!zMo941b) {
            C2253z c2253z = new C2253z(0L, j4 + ((long) i3));
            return new C2251x(c2253z, c2253z);
        }
        long jM1591j = AbstractC0632A.m1591j(j3, 0L, this.f1115c);
        double d5 = (jM1591j * 100.0d) / this.f1115c;
        double d6 = 0.0d;
        if (d5 <= 0.0d) {
            d3 = 256.0d;
        } else if (d5 >= 100.0d) {
            d3 = 256.0d;
            d6 = 256.0d;
        } else {
            int i4 = (int) d5;
            long[] jArr = this.f1119g;
            AbstractC0646n.m1631i(jArr);
            double d7 = jArr[i4];
            if (i4 == 99) {
                d3 = 256.0d;
                d4 = 256.0d;
            } else {
                d3 = 256.0d;
                d4 = jArr[i4 + 1];
            }
            d6 = ((d4 - d7) * (d5 - ((double) i4))) + d7;
        }
        long j5 = this.f1117e;
        C2253z c2253z2 = new C2253z(jM1591j, j4 + AbstractC0632A.m1591j(Math.round((d6 / d3) * j5), i3, j5 - 1));
        return new C2251x(c2253z2, c2253z2);
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: k */
    public final int mo944k() {
        return this.f1116d;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f1115c;
    }
}
