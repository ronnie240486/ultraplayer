package p071Y0;

import android.support.v4.media.session.C0858A;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p009D0.C0106b;
import p030K0.C0334e;
import p036M0.C0380q;
import p045P0.InterfaceC0463i;
import p055T.C0546I;
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

/* JADX INFO: renamed from: Y0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0734E implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final int f2810a;

    /* JADX INFO: renamed from: b */
    public final int f2811b;

    /* JADX INFO: renamed from: c */
    public final List f2812c;

    /* JADX INFO: renamed from: d */
    public final C0651s f2813d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f2814e;

    /* JADX INFO: renamed from: f */
    public final C0334e f2815f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0463i f2816g;

    /* JADX INFO: renamed from: h */
    public final SparseArray f2817h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f2818i;

    /* JADX INFO: renamed from: j */
    public final SparseBooleanArray f2819j;

    /* JADX INFO: renamed from: k */
    public final C0763z f2820k;

    /* JADX INFO: renamed from: l */
    public C0762y f2821l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2242o f2822m;

    /* JADX INFO: renamed from: n */
    public int f2823n;

    /* JADX INFO: renamed from: o */
    public boolean f2824o;

    /* JADX INFO: renamed from: p */
    public boolean f2825p;

    /* JADX INFO: renamed from: q */
    public boolean f2826q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0737H f2827r;

    /* JADX INFO: renamed from: s */
    public int f2828s;

    /* JADX INFO: renamed from: t */
    public int f2829t;

    public C0734E(int i3, int i4, InterfaceC0463i interfaceC0463i, C0656x c0656x, C0334e c0334e) {
        this.f2815f = c0334e;
        this.f2810a = i3;
        this.f2811b = i4;
        this.f2816g = interfaceC0463i;
        if (i3 == 1 || i3 == 2) {
            this.f2812c = Collections.singletonList(c0656x);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f2812c = arrayList;
            arrayList.add(c0656x);
        }
        this.f2813d = new C0651s(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f2818i = sparseBooleanArray;
        this.f2819j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f2817h = sparseArray;
        this.f2814e = new SparseIntArray();
        this.f2820k = new C0763z(1);
        this.f2822m = InterfaceC2242o.f9641f;
        this.f2829t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseArray.put(sparseArray2.keyAt(i5), (InterfaceC0737H) sparseArray2.valueAt(i5));
        }
        sparseArray.put(0, new C0733D(new C0106b(this)));
        this.f2827r = null;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws EOFException, InterruptedIOException, C0546I {
        int i3;
        int i4;
        int i5;
        int i6;
        long jM3280C;
        long j3;
        long j4 = ((C2237j) interfaceC2241n).f9628i;
        int i7 = this.f2810a;
        boolean z3 = i7 == 2;
        if (this.f2824o) {
            C0763z c0763z = this.f2820k;
            if (j4 != -1 && !z3 && !c0763z.f3121d) {
                int i8 = this.f2829t;
                if (i8 <= 0) {
                    c0763z.m1882a((C2237j) interfaceC2241n);
                    return 0;
                }
                boolean z4 = c0763z.f3123f;
                C0651s c0651s = c0763z.f3120c;
                if (z4) {
                    if (c0763z.f3125h == -9223372036854775807L) {
                        c0763z.m1882a((C2237j) interfaceC2241n);
                        return 0;
                    }
                    if (c0763z.f3122e) {
                        long j5 = c0763z.f3124g;
                        if (j5 == -9223372036854775807L) {
                            c0763z.m1882a((C2237j) interfaceC2241n);
                            return 0;
                        }
                        C0656x c0656x = c0763z.f3119b;
                        c0763z.f3126i = c0656x.m1703c(c0763z.f3125h) - c0656x.m1702b(j5);
                        c0763z.m1882a((C2237j) interfaceC2241n);
                        return 0;
                    }
                    C2237j c2237j = (C2237j) interfaceC2241n;
                    int iMin = (int) Math.min(112800, c2237j.f9628i);
                    long j6 = 0;
                    if (c2237j.f9629j != j6) {
                        c0587s.f2181a = j6;
                        return 1;
                    }
                    c0651s.m1662D(iMin);
                    c2237j.f9631l = 0;
                    c2237j.mo338i(c0651s.f2520a, 0, iMin, false);
                    int i9 = c0651s.f2522c;
                    for (int i10 = c0651s.f2521b; i10 < i9; i10++) {
                        if (c0651s.f2520a[i10] == 71) {
                            jM3280C = AbstractC1303m.m3280C(c0651s, i10, i8);
                            if (jM3280C != -9223372036854775807L) {
                                c0763z.f3124g = jM3280C;
                                c0763z.f3122e = true;
                                return 0;
                            }
                        }
                    }
                    jM3280C = -9223372036854775807L;
                    c0763z.f3124g = jM3280C;
                    c0763z.f3122e = true;
                    return 0;
                }
                C2237j c2237j2 = (C2237j) interfaceC2241n;
                long j7 = c2237j2.f9628i;
                int iMin2 = (int) Math.min(112800, j7);
                long j8 = j7 - ((long) iMin2);
                if (c2237j2.f9629j != j8) {
                    c0587s.f2181a = j8;
                    return 1;
                }
                c0651s.m1662D(iMin2);
                c2237j2.f9631l = 0;
                c2237j2.mo338i(c0651s.f2520a, 0, iMin2, false);
                int i11 = c0651s.f2521b;
                int i12 = c0651s.f2522c;
                for (int i13 = i12 - 188; i13 >= i11; i13--) {
                    byte[] bArr = c0651s.f2520a;
                    int i14 = 0;
                    for (int i15 = -4; i15 <= 4; i15++) {
                        int i16 = (i15 * 188) + i13;
                        if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                            i14 = 0;
                        } else {
                            i14++;
                            if (i14 == 5) {
                                long jM3280C2 = AbstractC1303m.m3280C(c0651s, i13, i8);
                                if (jM3280C2 == -9223372036854775807L) {
                                    break;
                                }
                                j3 = jM3280C2;
                                c0763z.f3125h = j3;
                                c0763z.f3123f = true;
                                return 0;
                            }
                        }
                    }
                }
                j3 = -9223372036854775807L;
                c0763z.f3125h = j3;
                c0763z.f3123f = true;
                return 0;
            }
            if (this.f2825p) {
                i3 = i7;
            } else {
                this.f2825p = true;
                long j9 = c0763z.f3126i;
                if (j9 != -9223372036854775807L) {
                    i3 = i7;
                    C0762y c0762y = new C0762y(new C1528a(15), new C0380q(this.f2829t, c0763z.f3119b), j9, j9 + 1, 0L, j4, 188L, 940);
                    this.f2821l = c0762y;
                    this.f2822m.mo333b(c0762y.f3114a);
                } else {
                    i3 = i7;
                    this.f2822m.mo333b(new C2244q(j9));
                }
            }
            if (this.f2826q) {
                this.f2826q = false;
                mo331j(0L, 0L);
                if (((C2237j) interfaceC2241n).f9629j != 0) {
                    c0587s.f2181a = 0L;
                    return 1;
                }
            }
            i4 = 1;
            C0762y c0762y2 = this.f2821l;
            if (c0762y2 != null && c0762y2.f3116c != null) {
                return c0762y2.m1878b((C2237j) interfaceC2241n, c0587s);
            }
        } else {
            i3 = i7;
            i4 = 1;
        }
        C0651s c0651s2 = this.f2813d;
        byte[] bArr2 = c0651s2.f2520a;
        if (9400 - c0651s2.f2521b < 188) {
            int iM1667a = c0651s2.m1667a();
            if (iM1667a > 0) {
                System.arraycopy(bArr2, c0651s2.f2521b, bArr2, 0, iM1667a);
            }
            c0651s2.m1663E(bArr2, iM1667a);
        }
        while (true) {
            int iM1667a2 = c0651s2.m1667a();
            SparseArray sparseArray = this.f2817h;
            if (iM1667a2 >= 188) {
                int i17 = c0651s2.f2521b;
                int i18 = c0651s2.f2522c;
                byte[] bArr3 = c0651s2.f2520a;
                int i19 = i17;
                while (i19 < i18 && bArr3[i19] != 71) {
                    i19++;
                }
                c0651s2.m1665G(i19);
                int i20 = i19 + 188;
                if (i20 > i18) {
                    int i21 = (i19 - i17) + this.f2828s;
                    this.f2828s = i21;
                    i5 = i3;
                    i6 = 2;
                    if (i5 == 2 && i21 > 376) {
                        throw C0546I.m1365a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i5 = i3;
                    i6 = 2;
                    this.f2828s = 0;
                }
                int i22 = c0651s2.f2522c;
                if (i20 > i22) {
                    return 0;
                }
                int iM1673g = c0651s2.m1673g();
                if ((8388608 & iM1673g) != 0) {
                    c0651s2.m1665G(i20);
                    return 0;
                }
                int i23 = (4194304 & iM1673g) != 0 ? 1 : 0;
                int i24 = (2096896 & iM1673g) >> 8;
                boolean z5 = (iM1673g & 32) != 0;
                InterfaceC0737H interfaceC0737H = (iM1673g & 16) != 0 ? (InterfaceC0737H) sparseArray.get(i24) : null;
                if (interfaceC0737H == null) {
                    c0651s2.m1665G(i20);
                    return 0;
                }
                if (i5 != i6) {
                    int i25 = iM1673g & 15;
                    SparseIntArray sparseIntArray = this.f2814e;
                    int i26 = sparseIntArray.get(i24, i25 - 1);
                    sparseIntArray.put(i24, i25);
                    if (i26 == i25) {
                        c0651s2.m1665G(i20);
                        return 0;
                    }
                    if (i25 != ((i26 + 1) & 15)) {
                        interfaceC0737H.mo1846b();
                    }
                }
                if (z5) {
                    int iM1687u = c0651s2.m1687u();
                    i23 |= (c0651s2.m1687u() & 64) != 0 ? 2 : 0;
                    c0651s2.m1666H(iM1687u - 1);
                }
                boolean z6 = this.f2824o;
                if (i5 == i6 || z6 || !this.f2819j.get(i24, false)) {
                    c0651s2.m1664F(i20);
                    interfaceC0737H.mo1847c(i23, c0651s2);
                    c0651s2.m1664F(i22);
                }
                if (i5 != i6 && !z6 && this.f2824o && j4 != -1) {
                    this.f2826q = true;
                }
                c0651s2.m1665G(i20);
                return 0;
            }
            int i27 = c0651s2.f2522c;
            int iMo345q = ((C2237j) interfaceC2241n).mo345q(bArr2, i27, 9400 - i27);
            if (iMo345q == -1) {
                for (int i28 = 0; i28 < sparseArray.size(); i28++) {
                    InterfaceC0737H interfaceC0737H2 = (InterfaceC0737H) sparseArray.valueAt(i28);
                    if (interfaceC0737H2 instanceof C0761x) {
                        C0761x c0761x = (C0761x) interfaceC0737H2;
                        if (c0761x.f3104c == 3 && c0761x.f3111j == -1 && (!z3 || !(c0761x.f3102a instanceof C0747j))) {
                            c0761x.mo1847c(i4, new C0651s());
                        }
                    }
                }
                return -1;
            }
            c0651s2.m1664F(i27 + iMo345q);
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        byte[] bArr = this.f2813d.f2520a;
        C2237j c2237j = (C2237j) interfaceC2241n;
        c2237j.mo338i(bArr, 0, 940, false);
        for (int i3 = 0; i3 < 188; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= 5) {
                    c2237j.mo335d(i3);
                    return true;
                }
                if (bArr[(i4 * 188) + i3] != 71) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        if ((this.f2811b & 1) == 0) {
            interfaceC2242o = new C0858A(interfaceC2242o, this.f2816g);
        }
        this.f2822m = interfaceC2242o;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        C0762y c0762y;
        AbstractC0646n.m1630h(this.f2810a != 2);
        List list = this.f2812c;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0656x c0656x = (C0656x) list.get(i3);
            boolean z3 = c0656x.m1705e() == -9223372036854775807L;
            if (!z3) {
                long jM1704d = c0656x.m1704d();
                z3 = (jM1704d == -9223372036854775807L || jM1704d == 0 || jM1704d == j4) ? false : true;
            }
            if (z3) {
                c0656x.m1707g(j4);
            }
        }
        if (j4 != 0 && (c0762y = this.f2821l) != null) {
            c0762y.m1879d(j4);
        }
        this.f2813d.m1662D(0);
        this.f2814e.clear();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f2817h;
            if (i4 >= sparseArray.size()) {
                this.f2828s = 0;
                return;
            } else {
                ((InterfaceC0737H) sparseArray.valueAt(i4)).mo1846b();
                i4++;
            }
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
