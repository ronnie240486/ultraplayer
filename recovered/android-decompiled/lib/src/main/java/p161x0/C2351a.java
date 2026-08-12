package p161x0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import p011E.C0111d;
import p012E0.C0116a;
import p018G0.C0218h;
import p036M0.C0380q;
import p048Q0.C0508g;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p068X0.C0688a;
import p071Y0.C0762y;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.AbstractC2229b;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.C2245r;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2351a implements InterfaceC2240m {

    /* JADX INFO: renamed from: e */
    public InterfaceC2242o f9870e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2226E f9871f;

    /* JADX INFO: renamed from: h */
    public C0544G f9873h;

    /* JADX INFO: renamed from: i */
    public C2245r f9874i;

    /* JADX INFO: renamed from: j */
    public int f9875j;

    /* JADX INFO: renamed from: k */
    public int f9876k;

    /* JADX INFO: renamed from: l */
    public C0762y f9877l;

    /* JADX INFO: renamed from: m */
    public int f9878m;

    /* JADX INFO: renamed from: n */
    public long f9879n;

    /* JADX INFO: renamed from: a */
    public final byte[] f9866a = new byte[42];

    /* JADX INFO: renamed from: b */
    public final C0651s f9867b = new C0651s(new byte[32768], 0);

    /* JADX INFO: renamed from: c */
    public final boolean f9868c = false;

    /* JADX INFO: renamed from: d */
    public final C0587s f9869d = new C0587s();

    /* JADX INFO: renamed from: g */
    public int f9872g = 0;

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws EOFException, InterruptedIOException, C0546I {
        C2245r c2245r;
        int i3;
        InterfaceC2252y c2244q;
        long j3;
        boolean z3;
        long j4;
        boolean zM4807b;
        boolean z4 = true;
        int i4 = this.f9872g;
        C0544G c0544g = null;
        if (i4 == 0) {
            ((C2237j) interfaceC2241n).f9631l = 0;
            C2237j c2237j = (C2237j) interfaceC2241n;
            long jMo339j = c2237j.mo339j();
            C0544G c0544gM1810a = new C0688a(1).m1810a(c2237j, !this.f9868c ? null : C0218h.f507g);
            if (c0544gM1810a != null && c0544gM1810a.f1940g.length != 0) {
                c0544g = c0544gM1810a;
            }
            c2237j.mo335d((int) (c2237j.mo339j() - jMo339j));
            this.f9873h = c0544g;
            this.f9872g = 1;
            return 0;
        }
        byte[] bArr = this.f9866a;
        if (i4 == 1) {
            ((C2237j) interfaceC2241n).mo338i(bArr, 0, bArr.length, false);
            ((C2237j) interfaceC2241n).f9631l = 0;
            this.f9872g = 2;
            return 0;
        }
        int i5 = 3;
        if (i4 == 2) {
            C0651s c0651s = new C0651s(4);
            ((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 0, 4, false);
            if (c0651s.m1689w() != 1716281667) {
                throw C0546I.m1365a(null, "Failed to read FLAC stream marker.");
            }
            this.f9872g = 3;
            return 0;
        }
        int i6 = 7;
        if (i4 == 3) {
            ?? r3 = 0;
            C2245r c2245r2 = this.f9874i;
            boolean z5 = false;
            while (!z5) {
                ((C2237j) interfaceC2241n).f9631l = r3;
                byte[] bArr2 = new byte[4];
                C0508g c0508g = new C0508g(bArr2, 4);
                C2237j c2237j2 = (C2237j) interfaceC2241n;
                c2237j2.mo338i(bArr2, r3, 4, r3);
                boolean zM1251h = c0508g.m1251h();
                int iM1252i = c0508g.m1252i(i6);
                int iM1252i2 = c0508g.m1252i(24) + 4;
                if (iM1252i == 0) {
                    byte[] bArr3 = new byte[38];
                    c2237j2.mo336f(bArr3, r3, 38, r3);
                    c2245r2 = new C2245r(bArr3, 4);
                } else {
                    if (c2245r2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM1252i == i5) {
                        C0651s c0651s2 = new C0651s(iM1252i2);
                        c2237j2.mo336f(c0651s2.f2520a, 0, iM1252i2, false);
                        c2245r2 = new C2245r(c2245r2.f9645a, c2245r2.f9646b, c2245r2.f9647c, c2245r2.f9648d, c2245r2.f9649e, c2245r2.f9651g, c2245r2.f9652h, c2245r2.f9654j, AbstractC2229b.m4825t(c0651s2), c2245r2.f9656l);
                    } else {
                        C0544G c0544g2 = c2245r2.f9656l;
                        if (iM1252i == 4) {
                            C0651s c0651s3 = new C0651s(iM1252i2);
                            c2237j2.mo336f(c0651s3.f2520a, 0, iM1252i2, false);
                            c0651s3.m1666H(4);
                            C0544G c0544gM4823r = AbstractC2229b.m4823r(Arrays.asList(AbstractC2229b.m4826u(c0651s3, false, false).f837h));
                            if (c0544g2 != null) {
                                c0544gM4823r = c0544g2.m1352e(c0544gM4823r);
                            }
                            c2245r = new C2245r(c2245r2.f9645a, c2245r2.f9646b, c2245r2.f9647c, c2245r2.f9648d, c2245r2.f9649e, c2245r2.f9651g, c2245r2.f9652h, c2245r2.f9654j, c2245r2.f9655k, c0544gM4823r);
                        } else if (iM1252i == 6) {
                            C0651s c0651s4 = new C0651s(iM1252i2);
                            c2237j2.mo336f(c0651s4.f2520a, 0, iM1252i2, false);
                            c0651s4.m1666H(4);
                            C0544G c0544g3 = new C0544G(AbstractC1676G.m4120r(C0116a.m557d(c0651s4)));
                            if (c0544g2 != null) {
                                c0544g3 = c0544g2.m1352e(c0544g3);
                            }
                            c2245r = new C2245r(c2245r2.f9645a, c2245r2.f9646b, c2245r2.f9647c, c2245r2.f9648d, c2245r2.f9649e, c2245r2.f9651g, c2245r2.f9652h, c2245r2.f9654j, c2245r2.f9655k, c0544g3);
                        } else {
                            c2237j2.mo335d(iM1252i2);
                        }
                        c2245r2 = c2245r;
                    }
                }
                int i7 = AbstractC0632A.f2454a;
                this.f9874i = c2245r2;
                z5 = zM1251h;
                r3 = 0;
                i5 = 3;
                i6 = 7;
            }
            this.f9874i.getClass();
            this.f9875j = Math.max(this.f9874i.f9647c, 6);
            InterfaceC2226E interfaceC2226E = this.f9871f;
            int i8 = AbstractC0632A.f2454a;
            interfaceC2226E.mo1176e(this.f9874i.m4841c(bArr, this.f9873h));
            this.f9872g = 4;
            return 0;
        }
        long j5 = 0;
        if (i4 == 4) {
            ((C2237j) interfaceC2241n).f9631l = 0;
            C0651s c0651s5 = new C0651s(2);
            C2237j c2237j3 = (C2237j) interfaceC2241n;
            c2237j3.mo338i(c0651s5.f2520a, 0, 2, false);
            int iM1659A = c0651s5.m1659A();
            if ((iM1659A >> 2) != 16382) {
                c2237j3.f9631l = 0;
                throw C0546I.m1365a(null, "First frame does not start with sync code.");
            }
            c2237j3.f9631l = 0;
            this.f9876k = iM1659A;
            InterfaceC2242o interfaceC2242o = this.f9870e;
            int i9 = AbstractC0632A.f2454a;
            long j6 = c2237j3.f9629j;
            this.f9874i.getClass();
            C2245r c2245r3 = this.f9874i;
            if (c2245r3.f9655k != null) {
                c2244q = new C2244q(0, j6, c2245r3);
                i3 = 0;
            } else {
                long j7 = c2237j3.f9628i;
                if (j7 == -1 || c2245r3.f9654j <= 0) {
                    i3 = 0;
                    c2244q = new C2244q(c2245r3.m4840b());
                } else {
                    int i10 = this.f9876k;
                    C0111d c0111d = new C0111d(23, c2245r3);
                    C0380q c0380q = new C0380q(c2245r3, i10);
                    long jM4840b = c2245r3.m4840b();
                    int i11 = c2245r3.f9647c;
                    int i12 = c2245r3.f9648d;
                    if (i12 > 0) {
                        i3 = 0;
                        j3 = ((((long) i12) + ((long) i11)) / 2) + 1;
                    } else {
                        i3 = 0;
                        int i13 = c2245r3.f9646b;
                        int i14 = c2245r3.f9645a;
                        j3 = 64 + (((((i14 != i13 || i14 <= 0) ? 4096L : i14) * ((long) c2245r3.f9651g)) * ((long) c2245r3.f9652h)) / 8);
                    }
                    C0762y c0762y = new C0762y(c0111d, c0380q, jM4840b, c2245r3.f9654j, j6, j7, j3, Math.max(6, i11));
                    this.f9877l = c0762y;
                    c2244q = c0762y.f3114a;
                }
            }
            interfaceC2242o.mo333b(c2244q);
            this.f9872g = 5;
            return i3;
        }
        if (i4 != 5) {
            throw new IllegalStateException();
        }
        this.f9871f.getClass();
        this.f9874i.getClass();
        C0762y c0762y2 = this.f9877l;
        if (c0762y2 != null && c0762y2.f3116c != null) {
            return c0762y2.m1878b((C2237j) interfaceC2241n, c0587s);
        }
        if (this.f9879n == -1) {
            C2245r c2245r4 = this.f9874i;
            ((C2237j) interfaceC2241n).f9631l = 0;
            C2237j c2237j4 = (C2237j) interfaceC2241n;
            c2237j4.m4831b(1, false);
            byte[] bArr4 = new byte[1];
            c2237j4.mo338i(bArr4, 0, 1, false);
            boolean z6 = (bArr4[0] & 1) == 1;
            c2237j4.m4831b(2, false);
            i6 = z6 ? 7 : 6;
            C0651s c0651s6 = new C0651s(i6);
            byte[] bArr5 = c0651s6.f2520a;
            int i15 = 0;
            while (i15 < i6) {
                int iM4833l = c2237j4.m4833l(bArr5, i15, i6 - i15);
                if (iM4833l == -1) {
                    break;
                }
                i15 += iM4833l;
            }
            c0651s6.m1664F(i15);
            c2237j4.f9631l = 0;
            try {
                long jM1660B = c0651s6.m1660B();
                if (!z6) {
                    jM1660B *= (long) c2245r4.f9646b;
                }
                j5 = jM1660B;
            } catch (NumberFormatException unused) {
                z4 = false;
            }
            if (!z4) {
                throw C0546I.m1365a(null, null);
            }
            this.f9879n = j5;
        } else {
            C0651s c0651s7 = this.f9867b;
            int i16 = c0651s7.f2522c;
            if (i16 < 32768) {
                int iMo345q = ((C2237j) interfaceC2241n).mo345q(c0651s7.f2520a, i16, 32768 - i16);
                z3 = iMo345q == -1;
                if (!z3) {
                    c0651s7.m1664F(i16 + iMo345q);
                } else if (c0651s7.m1667a() == 0) {
                    long j8 = this.f9879n * 1000000;
                    C2245r c2245r5 = this.f9874i;
                    int i17 = AbstractC0632A.f2454a;
                    this.f9871f.mo1172a(j8 / ((long) c2245r5.f9649e), 1, this.f9878m, 0, null);
                    return -1;
                }
            } else {
                z3 = false;
            }
            int i18 = c0651s7.f2521b;
            int i19 = this.f9878m;
            int i20 = this.f9875j;
            if (i19 < i20) {
                c0651s7.m1666H(Math.min(i20 - i19, c0651s7.m1667a()));
            }
            this.f9874i.getClass();
            int i21 = c0651s7.f2521b;
            while (true) {
                int i22 = c0651s7.f2522c - 16;
                C0587s c0587s2 = this.f9869d;
                if (i21 > i22) {
                    if (z3) {
                        while (true) {
                            int i23 = c0651s7.f2522c;
                            if (i21 <= i23 - this.f9875j) {
                                c0651s7.m1665G(i21);
                                try {
                                    zM4807b = AbstractC2229b.m4807b(c0651s7, this.f9874i, this.f9876k, c0587s2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM4807b = false;
                                }
                                if (c0651s7.f2521b > c0651s7.f2522c) {
                                    zM4807b = false;
                                }
                                if (zM4807b) {
                                    c0651s7.m1665G(i21);
                                    j4 = c0587s2.f2181a;
                                    break;
                                }
                                i21++;
                            } else {
                                c0651s7.m1665G(i23);
                            }
                        }
                    } else {
                        c0651s7.m1665G(i21);
                    }
                    j4 = -1;
                    break;
                }
                c0651s7.m1665G(i21);
                if (AbstractC2229b.m4807b(c0651s7, this.f9874i, this.f9876k, c0587s2)) {
                    c0651s7.m1665G(i21);
                    j4 = c0587s2.f2181a;
                    break;
                }
                i21++;
            }
            int i24 = c0651s7.f2521b - i18;
            c0651s7.m1665G(i18);
            this.f9871f.mo1173b(i24, c0651s7);
            int i25 = this.f9878m + i24;
            this.f9878m = i25;
            if (j4 != -1) {
                long j9 = this.f9879n * 1000000;
                C2245r c2245r6 = this.f9874i;
                int i26 = AbstractC0632A.f2454a;
                this.f9871f.mo1172a(j9 / ((long) c2245r6.f9649e), 1, i25, 0, null);
                this.f9878m = 0;
                this.f9879n = j4;
            }
            if (c0651s7.m1667a() < 16) {
                int iM1667a = c0651s7.m1667a();
                byte[] bArr6 = c0651s7.f2520a;
                System.arraycopy(bArr6, c0651s7.f2521b, bArr6, 0, iM1667a);
                c0651s7.m1665G(0);
                c0651s7.m1664F(iM1667a);
            }
        }
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        C2237j c2237j = (C2237j) interfaceC2241n;
        C0544G c0544gM1810a = new C0688a(1).m1810a(c2237j, C0218h.f507g);
        if (c0544gM1810a != null) {
            int length = c0544gM1810a.f1940g.length;
        }
        C0651s c0651s = new C0651s(4);
        c2237j.mo338i(c0651s.f2520a, 0, 4, false);
        return c0651s.m1689w() == 1716281667;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f9870e = interfaceC2242o;
        this.f9871f = interfaceC2242o.mo344p(0, 1);
        interfaceC2242o.mo341l();
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        if (j3 == 0) {
            this.f9872g = 0;
        } else {
            C0762y c0762y = this.f9877l;
            if (c0762y != null) {
                c0762y.m1879d(j4);
            }
        }
        this.f9879n = j4 != 0 ? -1L : 0L;
        this.f9878m = 0;
        this.f9867b.m1662D(0);
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
