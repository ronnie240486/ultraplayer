package p074Z0;

import java.math.RoundingMode;
import p036M0.C0370g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p145s0.C2237j;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Z0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0776c implements InterfaceC0775b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2242o f3166a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2226E f3167b;

    /* JADX INFO: renamed from: c */
    public final C0370g f3168c;

    /* JADX INFO: renamed from: d */
    public final C0583o f3169d;

    /* JADX INFO: renamed from: e */
    public final int f3170e;

    /* JADX INFO: renamed from: f */
    public long f3171f;

    /* JADX INFO: renamed from: g */
    public int f3172g;

    /* JADX INFO: renamed from: h */
    public long f3173h;

    public C0776c(InterfaceC2242o interfaceC2242o, InterfaceC2226E interfaceC2226E, C0370g c0370g, String str, int i3) throws C0546I {
        this.f3166a = interfaceC2242o;
        this.f3167b = interfaceC2226E;
        this.f3168c = c0370g;
        int i4 = c0370g.f1189e;
        int i5 = c0370g.f1186b;
        int i6 = (i4 * i5) / 8;
        int i7 = c0370g.f1188d;
        if (i7 != i6) {
            throw C0546I.m1365a(null, "Expected block size: " + i6 + "; got: " + i7);
        }
        int i8 = c0370g.f1187c;
        int i9 = i8 * i6;
        int i10 = i9 * 8;
        int iMax = Math.max(i6, i9 / 10);
        this.f3170e = iMax;
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l(str);
        c0582n.f2109h = i10;
        c0582n.f2110i = i10;
        c0582n.f2115n = iMax;
        c0582n.f2092B = i5;
        c0582n.f2093C = i8;
        c0582n.f2094D = i3;
        this.f3169d = new C0583o(c0582n);
    }

    @Override // p074Z0.InterfaceC0775b
    /* JADX INFO: renamed from: a */
    public final boolean mo1887a(C2237j c2237j, long j3) {
        int i3;
        int i4;
        long j4 = j3;
        while (j4 > 0 && (i3 = this.f3172g) < (i4 = this.f3170e)) {
            int iMo1174c = this.f3167b.mo1174c(c2237j, (int) Math.min(i4 - i3, j4), true);
            if (iMo1174c == -1) {
                j4 = 0;
            } else {
                this.f3172g += iMo1174c;
                j4 -= (long) iMo1174c;
            }
        }
        C0370g c0370g = this.f3168c;
        int i5 = this.f3172g;
        int i6 = c0370g.f1188d;
        int i7 = i5 / i6;
        if (i7 > 0) {
            long j5 = this.f3171f;
            long j6 = this.f3173h;
            long j7 = c0370g.f1187c;
            int i8 = AbstractC0632A.f2454a;
            long jM1577R = j5 + AbstractC0632A.m1577R(j6, 1000000L, j7, RoundingMode.DOWN);
            int i9 = i7 * i6;
            int i10 = this.f3172g - i9;
            this.f3167b.mo1172a(jM1577R, 1, i9, i10, null);
            this.f3173h += (long) i7;
            this.f3172g = i10;
        }
        return j4 <= 0;
    }

    @Override // p074Z0.InterfaceC0775b
    /* JADX INFO: renamed from: b */
    public final void mo1888b(int i3, long j3) {
        this.f3166a.mo333b(new C0779f(this.f3168c, 1, i3, j3));
        this.f3167b.mo1176e(this.f3169d);
    }

    @Override // p074Z0.InterfaceC0775b
    /* JADX INFO: renamed from: c */
    public final void mo1889c(long j3) {
        this.f3171f = j3;
        this.f3172g = 0;
        this.f3173h = 0L;
    }
}
