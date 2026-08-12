package p145s0;

import com.google.android.gms.internal.cast.C1323r;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p153u0.C2290b;
import p153u0.C2293e;

/* JADX INFO: renamed from: s0.q */
/* JADX INFO: loaded from: classes.dex */
public class C2244q implements InterfaceC2252y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9642a;

    /* JADX INFO: renamed from: b */
    public final long f9643b;

    /* JADX INFO: renamed from: c */
    public final Object f9644c;

    public /* synthetic */ C2244q(int i3, long j3, Object obj) {
        this.f9642a = i3;
        this.f9644c = obj;
        this.f9643b = j3;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        switch (this.f9642a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        switch (this.f9642a) {
            case 0:
                C2245r c2245r = (C2245r) this.f9644c;
                AbstractC0646n.m1631i(c2245r.f9655k);
                C1323r c1323r = c2245r.f9655k;
                long[] jArr = (long[]) c1323r.f5961h;
                int iM1586e = AbstractC0632A.m1586e(jArr, AbstractC0632A.m1591j((((long) c2245r.f9649e) * j3) / 1000000, 0L, c2245r.f9654j - 1), false);
                long j4 = iM1586e == -1 ? 0L : jArr[iM1586e];
                long[] jArr2 = (long[]) c1323r.f5962i;
                long j5 = iM1586e != -1 ? jArr2[iM1586e] : 0L;
                int i3 = c2245r.f9649e;
                long j6 = (j4 * 1000000) / ((long) i3);
                long j7 = this.f9643b;
                C2253z c2253z = new C2253z(j6, j5 + j7);
                if (j6 == j3 || iM1586e == jArr.length - 1) {
                    return new C2251x(c2253z, c2253z);
                }
                int i4 = iM1586e + 1;
                return new C2251x(c2253z, new C2253z((jArr[i4] * 1000000) / ((long) i3), j7 + jArr2[i4]));
            case 1:
                return (C2251x) this.f9644c;
            default:
                C2290b c2290b = (C2290b) this.f9644c;
                C2251x c2251xM4917b = c2290b.f9769i[0].m4917b(j3);
                int i5 = 1;
                while (true) {
                    C2293e[] c2293eArr = c2290b.f9769i;
                    if (i5 >= c2293eArr.length) {
                        return c2251xM4917b;
                    }
                    C2251x c2251xM4917b2 = c2293eArr[i5].m4917b(j3);
                    if (c2251xM4917b2.f9683a.f9687b < c2251xM4917b.f9683a.f9687b) {
                        c2251xM4917b = c2251xM4917b2;
                    }
                    i5++;
                }
                break;
        }
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        switch (this.f9642a) {
            case 0:
                return ((C2245r) this.f9644c).m4840b();
            case 1:
                return this.f9643b;
            default:
                return this.f9643b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2244q(long j3) {
        this(j3, 0L);
        this.f9642a = 1;
    }

    public C2244q(long j3, long j4) {
        this.f9642a = 1;
        this.f9643b = j3;
        C2253z c2253z = j4 == 0 ? C2253z.f9685c : new C2253z(0L, j4);
        this.f9644c = new C2251x(c2253z, c2253z);
    }
}
