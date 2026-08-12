package p153u0;

import android.support.v4.media.session.C0858A;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p034L1.C0352g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0576h;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2290b implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final C0651s f9761a;

    /* JADX INFO: renamed from: b */
    public final C0576h f9762b;

    /* JADX INFO: renamed from: c */
    public final boolean f9763c;

    /* JADX INFO: renamed from: d */
    public final C0352g f9764d;

    /* JADX INFO: renamed from: e */
    public int f9765e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2242o f9766f;

    /* JADX INFO: renamed from: g */
    public C2291c f9767g;

    /* JADX INFO: renamed from: h */
    public long f9768h;

    /* JADX INFO: renamed from: i */
    public C2293e[] f9769i;

    /* JADX INFO: renamed from: j */
    public long f9770j;

    /* JADX INFO: renamed from: k */
    public C2293e f9771k;

    /* JADX INFO: renamed from: l */
    public int f9772l;

    /* JADX INFO: renamed from: m */
    public long f9773m;

    /* JADX INFO: renamed from: n */
    public long f9774n;

    /* JADX INFO: renamed from: o */
    public int f9775o;

    /* JADX INFO: renamed from: p */
    public boolean f9776p;

    public C2290b(int i3, C0352g c0352g) {
        this.f9764d = c0352g;
        this.f9763c = (i3 & 1) == 0;
        this.f9761a = new C0651s(12);
        this.f9762b = new C0576h();
        this.f9766f = new C1528a(17);
        this.f9769i = new C2293e[0];
        this.f9773m = -1L;
        this.f9774n = -1L;
        this.f9772l = -1;
        this.f9768h = -9223372036854775807L;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x038a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        boolean z3;
        C2293e c2293e;
        C2293e c2293e2;
        long j3 = this.f9770j;
        if (j3 != -1) {
            long j4 = ((C2237j) interfaceC2241n).f9629j;
            if (j3 < j4 || j3 > 262144 + j4) {
                c0587s.f2181a = j3;
                z3 = true;
            } else {
                ((C2237j) interfaceC2241n).mo335d((int) (j3 - j4));
                z3 = false;
            }
        } else {
            z3 = false;
        }
        this.f9770j = -1L;
        if (z3) {
            return 1;
        }
        int i3 = this.f9765e;
        C2293e c2293e3 = null;
        C0576h c0576h = this.f9762b;
        C0651s c0651s = this.f9761a;
        switch (i3) {
            case 0:
                if (!mo329f(interfaceC2241n)) {
                    throw C0546I.m1365a(null, "AVI Header List not found");
                }
                ((C2237j) interfaceC2241n).mo335d(12);
                this.f9765e = 1;
                return 0;
            case 1:
                ((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 0, 12, false);
                c0651s.m1665G(0);
                c0576h.getClass();
                c0576h.f2074a = c0651s.m1675i();
                c0576h.f2075b = c0651s.m1675i();
                c0576h.f2076c = 0;
                if (c0576h.f2074a != 1414744396) {
                    throw C0546I.m1365a(null, "LIST expected, found: " + c0576h.f2074a);
                }
                int iM1675i = c0651s.m1675i();
                c0576h.f2076c = iM1675i;
                if (iM1675i == 1819436136) {
                    this.f9772l = c0576h.f2075b;
                    this.f9765e = 2;
                    return 0;
                }
                throw C0546I.m1365a(null, "hdrl expected, found: " + c0576h.f2076c);
            case 2:
                int i4 = this.f9772l - 4;
                C0651s c0651s2 = new C0651s(i4);
                ((C2237j) interfaceC2241n).mo336f(c0651s2.f2520a, 0, i4, false);
                C2294f c2294fM4918c = C2294f.m4918c(1819436136, c0651s2);
                int i5 = c2294fM4918c.f9799b;
                if (i5 != 1819436136) {
                    throw C0546I.m1365a(null, "Unexpected header list type " + i5);
                }
                C2291c c2291c = (C2291c) c2294fM4918c.m4919b(C2291c.class);
                if (c2291c == null) {
                    throw C0546I.m1365a(null, "AviHeader not found");
                }
                this.f9767g = c2291c;
                this.f9768h = ((long) c2291c.f9779c) * ((long) c2291c.f9777a);
                ArrayList arrayList = new ArrayList();
                C1674E c1674eListIterator = c2294fM4918c.f9798a.listIterator(0);
                int i6 = 0;
                while (c1674eListIterator.hasNext()) {
                    InterfaceC2289a interfaceC2289a = (InterfaceC2289a) c1674eListIterator.next();
                    if (interfaceC2289a.mo4915a() == 1819440243) {
                        C2294f c2294f = (C2294f) interfaceC2289a;
                        int i7 = i6 + 1;
                        C2292d c2292d = (C2292d) c2294f.m4919b(C2292d.class);
                        C2295g c2295g = (C2295g) c2294f.m4919b(C2295g.class);
                        if (c2292d == null) {
                            AbstractC0646n.m1647y("AviExtractor", "Missing Stream Header");
                        } else if (c2295g == null) {
                            AbstractC0646n.m1647y("AviExtractor", "Missing Stream Format");
                        } else {
                            long j5 = c2292d.f9783d;
                            long j6 = ((long) c2292d.f9781b) * 1000000;
                            long j7 = c2292d.f9782c;
                            int i8 = AbstractC0632A.f2454a;
                            long jM1577R = AbstractC0632A.m1577R(j5, j6, j7, RoundingMode.DOWN);
                            C0583o c0583o = c2295g.f9800a;
                            C0582n c0582nM1447a = c0583o.m1447a();
                            c0582nM1447a.f2102a = Integer.toString(i6);
                            int i9 = c2292d.f9784e;
                            if (i9 != 0) {
                                c0582nM1447a.f2115n = i9;
                            }
                            C2296h c2296h = (C2296h) c2294f.m4919b(C2296h.class);
                            if (c2296h != null) {
                                c0582nM1447a.f2103b = c2296h.f9801a;
                            }
                            int iM1359g = AbstractC0545H.m1359g(c0583o.f2154n);
                            if (iM1359g == 1 || iM1359g == 2) {
                                InterfaceC2226E interfaceC2226EMo344p = this.f9766f.mo344p(i6, iM1359g);
                                interfaceC2226EMo344p.mo1176e(new C0583o(c0582nM1447a));
                                c2293e = new C2293e(i6, iM1359g, jM1577R, c2292d.f9783d, interfaceC2226EMo344p);
                                this.f9768h = Math.max(this.f9768h, jM1577R);
                            }
                            if (c2293e != null) {
                                arrayList.add(c2293e);
                            }
                            i6 = i7;
                        }
                        c2293e = null;
                        if (c2293e != null) {
                            arrayList.add(c2293e);
                        }
                        i6 = i7;
                    }
                }
                this.f9769i = (C2293e[]) arrayList.toArray(new C2293e[0]);
                this.f9766f.mo341l();
                this.f9765e = 3;
                return 0;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                long j8 = this.f9773m;
                if (j8 != -1 && ((C2237j) interfaceC2241n).f9629j != j8) {
                    this.f9770j = j8;
                    return 0;
                }
                ((C2237j) interfaceC2241n).mo338i(c0651s.f2520a, 0, 12, false);
                C2237j c2237j = (C2237j) interfaceC2241n;
                c2237j.f9631l = 0;
                c0651s.m1665G(0);
                c0576h.getClass();
                c0576h.f2074a = c0651s.m1675i();
                c0576h.f2075b = c0651s.m1675i();
                c0576h.f2076c = 0;
                int iM1675i2 = c0651s.m1675i();
                int i10 = c0576h.f2074a;
                if (i10 == 1179011410) {
                    c2237j.mo335d(12);
                    return 0;
                }
                if (i10 != 1414744396 || iM1675i2 != 1769369453) {
                    this.f9770j = c2237j.f9629j + ((long) c0576h.f2075b) + 8;
                    return 0;
                }
                long j9 = c2237j.f9629j;
                this.f9773m = j9;
                this.f9774n = j9 + ((long) c0576h.f2075b) + 8;
                if (!this.f9776p) {
                    C2291c c2291c2 = this.f9767g;
                    c2291c2.getClass();
                    if ((c2291c2.f9778b & 16) == 16) {
                        this.f9765e = 4;
                        this.f9770j = this.f9774n;
                        return 0;
                    }
                    this.f9766f.mo333b(new C2244q(this.f9768h));
                    this.f9776p = true;
                }
                this.f9770j = c2237j.f9629j + 12;
                this.f9765e = 6;
                return 0;
            case 4:
                ((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 0, 8, false);
                c0651s.m1665G(0);
                int iM1675i3 = c0651s.m1675i();
                int iM1675i4 = c0651s.m1675i();
                if (iM1675i3 != 829973609) {
                    this.f9770j = ((C2237j) interfaceC2241n).f9629j + ((long) iM1675i4);
                    return 0;
                }
                this.f9765e = 5;
                this.f9775o = iM1675i4;
                return 0;
            case 5:
                C0651s c0651s3 = new C0651s(this.f9775o);
                ((C2237j) interfaceC2241n).mo336f(c0651s3.f2520a, 0, this.f9775o, false);
                long j10 = 0;
                if (c0651s3.m1667a() >= 16) {
                    int i11 = c0651s3.f2521b;
                    c0651s3.m1666H(8);
                    long jM1675i = c0651s3.m1675i();
                    long j11 = this.f9773m;
                    j10 = jM1675i <= j11 ? j11 + 8 : 0L;
                    c0651s3.m1665G(i11);
                }
                while (c0651s3.m1667a() >= 16) {
                    int iM1675i5 = c0651s3.m1675i();
                    int iM1675i6 = c0651s3.m1675i();
                    long jM1675i2 = ((long) c0651s3.m1675i()) + j10;
                    c0651s3.m1675i();
                    C2293e[] c2293eArr = this.f9769i;
                    int length = c2293eArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            c2293e2 = c2293eArr[i12];
                            if (c2293e2.f9786b != iM1675i5 && c2293e2.f9787c != iM1675i5) {
                                i12++;
                            }
                        } else {
                            c2293e2 = null;
                        }
                    }
                    if (c2293e2 != null) {
                        boolean z4 = (iM1675i6 & 16) == 16;
                        if (c2293e2.f9795k == -1) {
                            c2293e2.f9795k = jM1675i2;
                        }
                        if (z4) {
                            if (c2293e2.f9794j == c2293e2.f9797m.length) {
                                long[] jArr = c2293e2.f9796l;
                                c2293e2.f9796l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c2293e2.f9797m;
                                c2293e2.f9797m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c2293e2.f9796l;
                            int i13 = c2293e2.f9794j;
                            jArr2[i13] = jM1675i2;
                            c2293e2.f9797m[i13] = c2293e2.f9793i;
                            c2293e2.f9794j = i13 + 1;
                        }
                        c2293e2.f9793i++;
                    }
                }
                for (C2293e c2293e4 : this.f9769i) {
                    c2293e4.f9796l = Arrays.copyOf(c2293e4.f9796l, c2293e4.f9794j);
                    c2293e4.f9797m = Arrays.copyOf(c2293e4.f9797m, c2293e4.f9794j);
                }
                this.f9776p = true;
                this.f9766f.mo333b(new C2244q(2, this.f9768h, this));
                this.f9765e = 6;
                this.f9770j = this.f9773m;
                return 0;
            case 6:
                if (((C2237j) interfaceC2241n).f9629j >= this.f9774n) {
                    return -1;
                }
                C2293e c2293e5 = this.f9771k;
                if (c2293e5 != null) {
                    int i14 = c2293e5.f9791g;
                    int iMo1174c = i14 - c2293e5.f9785a.mo1174c(interfaceC2241n, i14, false);
                    c2293e5.f9791g = iMo1174c;
                    boolean z5 = iMo1174c == 0;
                    if (z5) {
                        if (c2293e5.f9790f > 0) {
                            int i15 = c2293e5.f9792h;
                            c2293e5.f9785a.mo1172a((c2293e5.f9788d * ((long) i15)) / ((long) c2293e5.f9789e), Arrays.binarySearch(c2293e5.f9797m, i15) >= 0 ? 1 : 0, c2293e5.f9790f, 0, null);
                        }
                        c2293e5.f9792h++;
                    }
                    if (z5) {
                        this.f9771k = null;
                    }
                    return 0;
                }
                C2237j c2237j2 = (C2237j) interfaceC2241n;
                if ((c2237j2.f9629j & 1) == 1) {
                    c2237j2.mo335d(1);
                }
                c2237j2.mo338i(c0651s.f2520a, 0, 12, false);
                c0651s.m1665G(0);
                int iM1675i7 = c0651s.m1675i();
                if (iM1675i7 == 1414744396) {
                    c0651s.m1665G(8);
                    c2237j2.mo335d(c0651s.m1675i() == 1769369453 ? 12 : 8);
                    c2237j2.f9631l = 0;
                    return 0;
                }
                int iM1675i8 = c0651s.m1675i();
                if (iM1675i7 == 1263424842) {
                    this.f9770j = c2237j2.f9629j + ((long) iM1675i8) + 8;
                    return 0;
                }
                c2237j2.mo335d(8);
                c2237j2.f9631l = 0;
                for (C2293e c2293e6 : this.f9769i) {
                    if (c2293e6.f9786b == iM1675i7 || c2293e6.f9787c == iM1675i7) {
                        c2293e3 = c2293e6;
                        if (c2293e3 == null) {
                            this.f9770j = c2237j2.f9629j + ((long) iM1675i8);
                            return 0;
                        }
                        c2293e3.f9790f = iM1675i8;
                        c2293e3.f9791g = iM1675i8;
                        this.f9771k = c2293e3;
                        return 0;
                    }
                }
                if (c2293e3 == null) {
                    this.f9770j = c2237j2.f9629j + ((long) iM1675i8);
                    return 0;
                }
                c2293e3.f9790f = iM1675i8;
                c2293e3.f9791g = iM1675i8;
                this.f9771k = c2293e3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        C0651s c0651s = this.f9761a;
        ((C2237j) interfaceC2241n).mo338i(c0651s.f2520a, 0, 12, false);
        c0651s.m1665G(0);
        if (c0651s.m1675i() == 1179011410) {
            c0651s.m1666H(4);
            if (c0651s.m1675i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f9765e = 0;
        if (this.f9763c) {
            interfaceC2242o = new C0858A(interfaceC2242o, this.f9764d);
        }
        this.f9766f = interfaceC2242o;
        this.f9770j = -1L;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f9770j = -1L;
        this.f9771k = null;
        for (C2293e c2293e : this.f9769i) {
            if (c2293e.f9794j == 0) {
                c2293e.f9792h = 0;
            } else {
                c2293e.f9792h = c2293e.f9797m[AbstractC0632A.m1586e(c2293e.f9796l, j3, true)];
            }
        }
        if (j3 != 0) {
            this.f9765e = 6;
        } else if (this.f9769i.length == 0) {
            this.f9765e = 0;
        } else {
            this.f9765e = 3;
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
