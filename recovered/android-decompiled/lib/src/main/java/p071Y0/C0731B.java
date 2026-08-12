package p071Y0;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p009D0.C0106b;
import p048Q0.C0508g;
import p055T.C0587s;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.C0656x;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0731B implements InterfaceC2240m {

    /* JADX INFO: renamed from: e */
    public boolean f2797e;

    /* JADX INFO: renamed from: f */
    public boolean f2798f;

    /* JADX INFO: renamed from: g */
    public boolean f2799g;

    /* JADX INFO: renamed from: h */
    public long f2800h;

    /* JADX INFO: renamed from: i */
    public C0762y f2801i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2242o f2802j;

    /* JADX INFO: renamed from: k */
    public boolean f2803k;

    /* JADX INFO: renamed from: a */
    public final C0656x f2793a = new C0656x(0);

    /* JADX INFO: renamed from: c */
    public final C0651s f2795c = new C0651s(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f2794b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final C0763z f2796d = new C0763z(0);

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) {
        ?? r3;
        C0651s c0651s;
        InterfaceC0745h c0747j;
        AbstractC0646n.m1631i(this.f2802j);
        long j3 = ((C2237j) interfaceC2241n).f9628i;
        long j4 = -9223372036854775807L;
        C0763z c0763z = this.f2796d;
        if (j3 != -1 && !c0763z.f3121d) {
            boolean z3 = c0763z.f3123f;
            C0651s c0651s2 = c0763z.f3120c;
            if (!z3) {
                C2237j c2237j = (C2237j) interfaceC2241n;
                long j5 = c2237j.f9628i;
                int iMin = (int) Math.min(20000L, j5);
                long j6 = j5 - ((long) iMin);
                if (c2237j.f9629j != j6) {
                    c0587s.f2181a = j6;
                    return 1;
                }
                c0651s2.m1662D(iMin);
                c2237j.f9631l = 0;
                c2237j.mo338i(c0651s2.f2520a, 0, iMin, false);
                int i3 = c0651s2.f2521b;
                for (int i4 = c0651s2.f2522c - 4; i4 >= i3; i4--) {
                    if (C0763z.m1880b(c0651s2.f2520a, i4) == 442) {
                        c0651s2.m1665G(i4 + 4);
                        long jM1881c = C0763z.m1881c(c0651s2);
                        if (jM1881c != -9223372036854775807L) {
                            j4 = jM1881c;
                            break;
                        }
                    }
                }
                c0763z.f3125h = j4;
                c0763z.f3123f = true;
                return 0;
            }
            if (c0763z.f3125h == -9223372036854775807L) {
                c0763z.m1882a((C2237j) interfaceC2241n);
                return 0;
            }
            if (c0763z.f3122e) {
                long j7 = c0763z.f3124g;
                if (j7 == -9223372036854775807L) {
                    c0763z.m1882a((C2237j) interfaceC2241n);
                    return 0;
                }
                C0656x c0656x = c0763z.f3119b;
                c0763z.f3126i = c0656x.m1703c(c0763z.f3125h) - c0656x.m1702b(j7);
                c0763z.m1882a((C2237j) interfaceC2241n);
                return 0;
            }
            C2237j c2237j2 = (C2237j) interfaceC2241n;
            int iMin2 = (int) Math.min(20000L, c2237j2.f9628i);
            long j8 = 0;
            if (c2237j2.f9629j != j8) {
                c0587s.f2181a = j8;
                return 1;
            }
            c0651s2.m1662D(iMin2);
            c2237j2.f9631l = 0;
            c2237j2.mo338i(c0651s2.f2520a, 0, iMin2, false);
            int i5 = c0651s2.f2522c;
            for (int i6 = c0651s2.f2521b; i6 < i5 - 3; i6++) {
                if (C0763z.m1880b(c0651s2.f2520a, i6) == 442) {
                    c0651s2.m1665G(i6 + 4);
                    long jM1881c2 = C0763z.m1881c(c0651s2);
                    if (jM1881c2 != -9223372036854775807L) {
                        j4 = jM1881c2;
                        break;
                    }
                }
            }
            c0763z.f3124g = j4;
            c0763z.f3122e = true;
            return 0;
        }
        if (this.f2803k) {
            r3 = 0;
        } else {
            this.f2803k = true;
            long j9 = c0763z.f3126i;
            if (j9 != -9223372036854775807L) {
                r3 = 0;
                C0762y c0762y = new C0762y(new C1528a(15), new C0106b(c0763z.f3119b), j9, 1 + j9, 0L, j3, 188L, 1000);
                this.f2801i = c0762y;
                this.f2802j.mo333b(c0762y.f3114a);
            } else {
                r3 = 0;
                this.f2802j.mo333b(new C2244q(j9));
            }
        }
        C0762y c0762y2 = this.f2801i;
        if (c0762y2 != null && c0762y2.f3116c != null) {
            return c0762y2.m1878b((C2237j) interfaceC2241n, c0587s);
        }
        C2237j c2237j3 = (C2237j) interfaceC2241n;
        c2237j3.f9631l = r3;
        long jMo339j = j3 != -1 ? j3 - c2237j3.mo339j() : -1L;
        if (jMo339j != -1 && jMo339j < 4) {
            return -1;
        }
        C0651s c0651s3 = this.f2795c;
        if (!c2237j3.mo338i(c0651s3.f2520a, r3, 4, true)) {
            return -1;
        }
        c0651s3.m1665G(r3);
        int iM1673g = c0651s3.m1673g();
        if (iM1673g == 441) {
            return -1;
        }
        if (iM1673g == 442) {
            c2237j3.mo338i(c0651s3.f2520a, r3, 10, r3);
            c0651s3.m1665G(9);
            c2237j3.mo335d((c0651s3.m1687u() & 7) + 14);
            return r3;
        }
        if (iM1673g == 443) {
            c2237j3.mo338i(c0651s3.f2520a, r3, 2, r3);
            c0651s3.m1665G(r3);
            c2237j3.mo335d(c0651s3.m1659A() + 6);
            return r3;
        }
        if (((iM1673g & (-256)) >> 8) != 1) {
            c2237j3.mo335d(1);
            return r3;
        }
        int i7 = iM1673g & 255;
        SparseArray sparseArray = this.f2794b;
        C0730A c0730a = (C0730A) sparseArray.get(i7);
        if (!this.f2797e) {
            if (c0730a == null) {
                if (i7 == 189) {
                    c0747j = new C0739b();
                    this.f2798f = true;
                    this.f2800h = c2237j3.f9629j;
                } else if ((iM1673g & 224) == 192) {
                    c0747j = new C0757t(r3, null);
                    this.f2798f = true;
                    this.f2800h = c2237j3.f9629j;
                } else if ((iM1673g & 240) == 224) {
                    c0747j = new C0747j(null);
                    this.f2799g = true;
                    this.f2800h = c2237j3.f9629j;
                } else {
                    c0747j = null;
                }
                if (c0747j != null) {
                    c0747j.mo1855e(this.f2802j, new C0736G(i7, 256));
                    c0730a = new C0730A(c0747j, this.f2793a);
                    sparseArray.put(i7, c0730a);
                }
            }
            if (c2237j3.f9629j > ((this.f2798f && this.f2799g) ? this.f2800h + 8192 : 1048576L)) {
                this.f2797e = true;
                this.f2802j.mo341l();
            }
        }
        c2237j3.mo338i(c0651s3.f2520a, r3, 2, r3);
        c0651s3.m1665G(r3);
        int iM1659A = c0651s3.m1659A() + 6;
        if (c0730a == null) {
            c2237j3.mo335d(iM1659A);
            return r3;
        }
        c0651s3.m1662D(iM1659A);
        c2237j3.mo336f(c0651s3.f2520a, r3, iM1659A, r3);
        c0651s3.m1665G(6);
        C0508g c0508g = c0730a.f2788c;
        c0651s3.m1671e(c0508g.f1731b, r3, 3);
        c0508g.m1260q(r3);
        c0508g.m1263t(8);
        c0730a.f2789d = c0508g.m1251h();
        c0730a.f2790e = c0508g.m1251h();
        c0508g.m1263t(6);
        c0651s3.m1671e(c0508g.f1731b, r3, c0508g.m1252i(8));
        c0508g.m1260q(r3);
        c0730a.f2792g = 0L;
        if (c0730a.f2789d) {
            c0508g.m1263t(4);
            long jM1252i = ((long) c0508g.m1252i(3)) << 30;
            c0508g.m1263t(1);
            long jM1252i2 = jM1252i | ((long) (c0508g.m1252i(15) << 15));
            c0508g.m1263t(1);
            long jM1252i3 = jM1252i2 | ((long) c0508g.m1252i(15));
            c0508g.m1263t(1);
            boolean z4 = c0730a.f2791f;
            C0656x c0656x2 = c0730a.f2787b;
            if (!z4 && c0730a.f2790e) {
                c0508g.m1263t(4);
                long jM1252i4 = ((long) c0508g.m1252i(3)) << 30;
                c0508g.m1263t(1);
                long jM1252i5 = ((long) (c0508g.m1252i(15) << 15)) | jM1252i4;
                c0508g.m1263t(1);
                long jM1252i6 = jM1252i5 | ((long) c0508g.m1252i(15));
                c0508g.m1263t(1);
                c0656x2.m1702b(jM1252i6);
                c0730a.f2791f = true;
            }
            c0730a.f2792g = c0656x2.m1702b(jM1252i3);
            c0651s = c0651s3;
        } else {
            c0651s = c0651s3;
        }
        long j10 = c0730a.f2792g;
        InterfaceC0745h interfaceC0745h = c0730a.f2786a;
        interfaceC0745h.mo1856f(4, j10);
        interfaceC0745h.mo1853c(c0651s);
        interfaceC0745h.mo1854d(false);
        c0651s.m1664F(c0651s.f2520a.length);
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C2237j c2237j = (C2237j) interfaceC2241n;
        c2237j.mo338i(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c2237j.m4831b(bArr[13] & 7, false);
            c2237j.mo338i(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f2802j = interfaceC2242o;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        C0656x c0656x = this.f2793a;
        boolean z3 = c0656x.m1705e() == -9223372036854775807L;
        if (!z3) {
            long jM1704d = c0656x.m1704d();
            z3 = (jM1704d == -9223372036854775807L || jM1704d == 0 || jM1704d == j4) ? false : true;
        }
        if (z3) {
            c0656x.m1707g(j4);
        }
        C0762y c0762y = this.f2801i;
        if (c0762y != null) {
            c0762y.m1879d(j4);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2794b;
            if (i3 >= sparseArray.size()) {
                return;
            }
            C0730A c0730a = (C0730A) sparseArray.valueAt(i3);
            c0730a.f2791f = false;
            c0730a.f2786a.mo1852b();
            i3++;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}
