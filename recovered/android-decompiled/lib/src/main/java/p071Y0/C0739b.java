package p071Y0;

import java.util.Objects;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0576h;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.AbstractC2229b;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0739b implements InterfaceC0745h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2840a;

    /* JADX INFO: renamed from: b */
    public final C0508g f2841b;

    /* JADX INFO: renamed from: c */
    public final C0651s f2842c;

    /* JADX INFO: renamed from: d */
    public final String f2843d;

    /* JADX INFO: renamed from: e */
    public final int f2844e;

    /* JADX INFO: renamed from: f */
    public String f2845f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2226E f2846g;

    /* JADX INFO: renamed from: h */
    public int f2847h;

    /* JADX INFO: renamed from: i */
    public int f2848i;

    /* JADX INFO: renamed from: j */
    public boolean f2849j;

    /* JADX INFO: renamed from: k */
    public long f2850k;

    /* JADX INFO: renamed from: l */
    public C0583o f2851l;

    /* JADX INFO: renamed from: m */
    public int f2852m;

    /* JADX INFO: renamed from: n */
    public long f2853n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0739b() {
        this(null, 0, 0);
        this.f2840a = 0;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        switch (this.f2840a) {
            case 0:
                this.f2847h = 0;
                this.f2848i = 0;
                this.f2849j = false;
                this.f2853n = -9223372036854775807L;
                break;
            default:
                this.f2847h = 0;
                this.f2848i = 0;
                this.f2849j = false;
                this.f2853n = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0339  */
    /* JADX WARN: Code duplicated, block: B:184:0x0347  */
    /* JADX WARN: Code duplicated, block: B:186:0x034f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0363  */
    /* JADX WARN: Code duplicated, block: B:195:0x0367  */
    /* JADX WARN: Code duplicated, block: B:196:0x036c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0370  */
    /* JADX WARN: Code duplicated, block: B:201:0x0376  */
    /* JADX WARN: Code duplicated, block: B:203:0x037c  */
    /* JADX WARN: Code duplicated, block: B:343:0x0379 A[SYNTHETIC] */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) {
        int i3;
        int iM4811f;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        byte b3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        switch (this.f2840a) {
            case 0:
                AbstractC0646n.m1631i(this.f2846g);
                while (c0651s.m1667a() > 0) {
                    int i19 = this.f2847h;
                    C0651s c0651s2 = this.f2842c;
                    if (i19 == 0) {
                        while (c0651s.m1667a() > 0) {
                            if (this.f2849j) {
                                int iM1687u = c0651s.m1687u();
                                if (iM1687u == 119) {
                                    this.f2849j = false;
                                    this.f2847h = 1;
                                    byte[] bArr = c0651s2.f2520a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f2848i = 2;
                                }
                                this.f2849j = iM1687u == 11;
                            } else {
                                this.f2849j = c0651s.m1687u() == 11;
                            }
                            break;
                        }
                    } else if (i19 == 1) {
                        byte[] bArr2 = c0651s2.f2520a;
                        int iMin = Math.min(c0651s.m1667a(), 128 - this.f2848i);
                        c0651s.m1671e(bArr2, this.f2848i, iMin);
                        int i20 = this.f2848i + iMin;
                        this.f2848i = i20;
                        if (i20 == 128) {
                            C0508g c0508g = this.f2841b;
                            c0508g.m1260q(0);
                            int iM1250g = c0508g.m1250g();
                            c0508g.m1263t(40);
                            boolean z3 = c0508g.m1252i(5) > 10;
                            c0508g.m1260q(iM1250g);
                            int[] iArr = AbstractC2229b.f9570f;
                            int[] iArr2 = AbstractC2229b.f9568d;
                            if (z3) {
                                c0508g.m1263t(16);
                                int iM1252i = c0508g.m1252i(2);
                                if (iM1252i == 0) {
                                    b3 = 0;
                                } else if (iM1252i != 1) {
                                    b3 = iM1252i != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b3 = 1;
                                }
                                c0508g.m1263t(3);
                                iM4811f = (c0508g.m1252i(11) + 1) * 2;
                                int iM1252i2 = c0508g.m1252i(2);
                                if (iM1252i2 == 3) {
                                    i6 = AbstractC2229b.f9569e[c0508g.m1252i(2)];
                                    i9 = 6;
                                    i8 = 3;
                                } else {
                                    int iM1252i3 = c0508g.m1252i(2);
                                    int i21 = AbstractC2229b.f9567c[iM1252i3];
                                    i6 = iArr2[iM1252i2];
                                    i8 = iM1252i3;
                                    i9 = i21;
                                }
                                i7 = i9 * 256;
                                int i22 = (iM4811f * i6) / (i9 * 32);
                                int iM1252i4 = c0508g.m1252i(3);
                                boolean zM1251h = c0508g.m1251h();
                                i5 = iArr[iM1252i4] + (zM1251h ? 1 : 0);
                                c0508g.m1263t(10);
                                if (c0508g.m1251h()) {
                                    c0508g.m1263t(8);
                                }
                                if (iM1252i4 == 0) {
                                    c0508g.m1263t(5);
                                    if (c0508g.m1251h()) {
                                        c0508g.m1263t(8);
                                    }
                                }
                                if (b3 == 1 && c0508g.m1251h()) {
                                    c0508g.m1263t(16);
                                }
                                if (c0508g.m1251h()) {
                                    if (iM1252i4 > 2) {
                                        c0508g.m1263t(2);
                                    }
                                    if ((iM1252i4 & 1) == 0 || iM1252i4 <= 2) {
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        c0508g.m1263t(6);
                                    }
                                    if ((iM1252i4 & 4) != 0) {
                                        c0508g.m1263t(i14);
                                    }
                                    if (zM1251h && c0508g.m1251h()) {
                                        c0508g.m1263t(5);
                                    }
                                    if (b3 != 0) {
                                        i10 = i8;
                                    } else {
                                        if (c0508g.m1251h()) {
                                            i15 = 6;
                                            c0508g.m1263t(6);
                                        } else {
                                            i15 = 6;
                                        }
                                        if (iM1252i4 == 0 && c0508g.m1251h()) {
                                            c0508g.m1263t(i15);
                                        }
                                        if (c0508g.m1251h()) {
                                            c0508g.m1263t(i15);
                                        }
                                        int iM1252i5 = c0508g.m1252i(2);
                                        if (iM1252i5 == 1) {
                                            c0508g.m1263t(5);
                                        } else if (iM1252i5 == 2) {
                                            c0508g.m1263t(12);
                                        } else {
                                            if (iM1252i5 == 3) {
                                                int iM1252i6 = c0508g.m1252i(5);
                                                if (c0508g.m1251h()) {
                                                    c0508g.m1263t(5);
                                                    if (c0508g.m1251h()) {
                                                        i17 = 4;
                                                        c0508g.m1263t(4);
                                                    } else {
                                                        i17 = 4;
                                                    }
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(i17);
                                                    }
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(i17);
                                                    }
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(i17);
                                                    }
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(i17);
                                                    }
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(i17);
                                                    }
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(i17);
                                                    }
                                                    if (c0508g.m1251h()) {
                                                        if (c0508g.m1251h()) {
                                                            c0508g.m1263t(i17);
                                                        }
                                                        if (c0508g.m1251h()) {
                                                            c0508g.m1263t(i17);
                                                        }
                                                    }
                                                }
                                                if (c0508g.m1251h()) {
                                                    c0508g.m1263t(5);
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(7);
                                                        if (c0508g.m1251h()) {
                                                            c0508g.m1263t(8);
                                                        }
                                                    }
                                                }
                                                i16 = 2;
                                                c0508g.m1263t((iM1252i6 + 2) * 8);
                                                c0508g.m1246c();
                                            }
                                            if (iM1252i4 < i16) {
                                                if (c0508g.m1251h()) {
                                                    c0508g.m1263t(14);
                                                }
                                                if (iM1252i4 == 0 && c0508g.m1251h()) {
                                                    c0508g.m1263t(14);
                                                }
                                            }
                                            if (c0508g.m1251h()) {
                                                i10 = i8;
                                                if (i10 == 0) {
                                                    c0508g.m1263t(5);
                                                } else {
                                                    for (i18 = 0; i18 < i9; i18++) {
                                                        if (c0508g.m1251h()) {
                                                            c0508g.m1263t(5);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i10 = i8;
                                            }
                                        }
                                        i16 = 2;
                                        if (iM1252i4 < i16) {
                                            if (c0508g.m1251h()) {
                                                c0508g.m1263t(14);
                                            }
                                            if (iM1252i4 == 0) {
                                                c0508g.m1263t(14);
                                            }
                                        }
                                        if (c0508g.m1251h()) {
                                            i10 = i8;
                                            if (i10 == 0) {
                                                c0508g.m1263t(5);
                                            } else {
                                                while (i18 < i9) {
                                                    if (c0508g.m1251h()) {
                                                        c0508g.m1263t(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i10 = i8;
                                        }
                                    }
                                } else {
                                    i10 = i8;
                                }
                                if (c0508g.m1251h()) {
                                    c0508g.m1263t(5);
                                    if (iM1252i4 == 2) {
                                        c0508g.m1263t(4);
                                    }
                                    if (iM1252i4 >= 6) {
                                        c0508g.m1263t(2);
                                    }
                                    if (c0508g.m1251h()) {
                                        i13 = 8;
                                        c0508g.m1263t(8);
                                    } else {
                                        i13 = 8;
                                    }
                                    if (iM1252i4 == 0 && c0508g.m1251h()) {
                                        c0508g.m1263t(i13);
                                    }
                                    i11 = 3;
                                    if (iM1252i2 < 3) {
                                        c0508g.m1262s();
                                    }
                                } else {
                                    i11 = 3;
                                }
                                if (b3 == 0 && i10 != i11) {
                                    c0508g.m1262s();
                                }
                                if (b3 == 2 && (i10 == i11 || c0508g.m1251h())) {
                                    i12 = 6;
                                    c0508g.m1263t(6);
                                } else {
                                    i12 = 6;
                                }
                                str = (c0508g.m1251h() && c0508g.m1252i(i12) == 1 && c0508g.m1252i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i3 = i22;
                            } else {
                                c0508g.m1263t(32);
                                int iM1252i7 = c0508g.m1252i(2);
                                String str2 = iM1252i7 == 3 ? null : "audio/ac3";
                                int iM1252i8 = c0508g.m1252i(6);
                                i3 = AbstractC2229b.f9571g[iM1252i8 / 2] * 1000;
                                iM4811f = AbstractC2229b.m4811f(iM1252i7, iM1252i8);
                                c0508g.m1263t(8);
                                int iM1252i9 = c0508g.m1252i(3);
                                if ((iM1252i9 & 1) == 0 || iM1252i9 == 1) {
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                    c0508g.m1263t(2);
                                }
                                if ((iM1252i9 & 4) != 0) {
                                    c0508g.m1263t(i4);
                                }
                                if (iM1252i9 == i4) {
                                    c0508g.m1263t(i4);
                                }
                                int i23 = iM1252i7 < 3 ? iArr2[iM1252i7] : -1;
                                i5 = iArr[iM1252i9] + (c0508g.m1251h() ? 1 : 0);
                                str = str2;
                                i6 = i23;
                                i7 = 1536;
                            }
                            C0583o c0583o = this.f2851l;
                            if (c0583o == null || i5 != c0583o.f2130C || i6 != c0583o.f2131D || !Objects.equals(str, c0583o.f2154n)) {
                                C0582n c0582n = new C0582n();
                                c0582n.f2102a = this.f2845f;
                                c0582n.f2114m = AbstractC0545H.m1364l(str);
                                c0582n.f2092B = i5;
                                c0582n.f2093C = i6;
                                c0582n.f2105d = this.f2843d;
                                c0582n.f2107f = this.f2844e;
                                c0582n.f2110i = i3;
                                if ("audio/ac3".equals(str)) {
                                    c0582n.f2109h = i3;
                                }
                                C0583o c0583o2 = new C0583o(c0582n);
                                this.f2851l = c0583o2;
                                this.f2846g.mo1176e(c0583o2);
                            }
                            this.f2852m = iM4811f;
                            this.f2850k = (((long) i7) * 1000000) / ((long) this.f2851l.f2131D);
                            c0651s2.m1665G(0);
                            this.f2846g.mo1173b(128, c0651s2);
                            this.f2847h = 2;
                        }
                    } else if (i19 == 2) {
                        int iMin2 = Math.min(c0651s.m1667a(), this.f2852m - this.f2848i);
                        this.f2846g.mo1173b(iMin2, c0651s);
                        int i24 = this.f2848i + iMin2;
                        this.f2848i = i24;
                        if (i24 == this.f2852m) {
                            AbstractC0646n.m1630h(this.f2853n != -9223372036854775807L);
                            this.f2846g.mo1172a(this.f2853n, 1, this.f2852m, 0, null);
                            this.f2853n += this.f2850k;
                            this.f2847h = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC0646n.m1631i(this.f2846g);
                while (c0651s.m1667a() > 0) {
                    int i25 = this.f2847h;
                    C0651s c0651s3 = this.f2842c;
                    if (i25 == 0) {
                        while (c0651s.m1667a() > 0) {
                            if (this.f2849j) {
                                int iM1687u2 = c0651s.m1687u();
                                this.f2849j = iM1687u2 == 172;
                                if (iM1687u2 == 64 || iM1687u2 == 65) {
                                    boolean z4 = iM1687u2 == 65;
                                    this.f2847h = 1;
                                    byte[] bArr3 = c0651s3.f2520a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z4 ? 65 : 64);
                                    this.f2848i = 2;
                                }
                            } else {
                                this.f2849j = c0651s.m1687u() == 172;
                            }
                            break;
                        }
                    } else if (i25 == 1) {
                        byte[] bArr4 = c0651s3.f2520a;
                        int iMin3 = Math.min(c0651s.m1667a(), 16 - this.f2848i);
                        c0651s.m1671e(bArr4, this.f2848i, iMin3);
                        int i26 = this.f2848i + iMin3;
                        this.f2848i = i26;
                        if (i26 == 16) {
                            C0508g c0508g2 = this.f2841b;
                            c0508g2.m1260q(0);
                            C0576h c0576hM4818m = AbstractC2229b.m4818m(c0508g2);
                            C0583o c0583o3 = this.f2851l;
                            int i27 = c0576hM4818m.f2074a;
                            if (c0583o3 == null || 2 != c0583o3.f2130C || i27 != c0583o3.f2131D || !"audio/ac4".equals(c0583o3.f2154n)) {
                                C0582n c0582n2 = new C0582n();
                                c0582n2.f2102a = this.f2845f;
                                c0582n2.f2114m = AbstractC0545H.m1364l("audio/ac4");
                                c0582n2.f2092B = 2;
                                c0582n2.f2093C = i27;
                                c0582n2.f2105d = this.f2843d;
                                c0582n2.f2107f = this.f2844e;
                                C0583o c0583o4 = new C0583o(c0582n2);
                                this.f2851l = c0583o4;
                                this.f2846g.mo1176e(c0583o4);
                            }
                            this.f2852m = c0576hM4818m.f2075b;
                            this.f2850k = (((long) c0576hM4818m.f2076c) * 1000000) / ((long) this.f2851l.f2131D);
                            c0651s3.m1665G(0);
                            this.f2846g.mo1173b(16, c0651s3);
                            this.f2847h = 2;
                        }
                    } else if (i25 == 2) {
                        int iMin4 = Math.min(c0651s.m1667a(), this.f2852m - this.f2848i);
                        this.f2846g.mo1173b(iMin4, c0651s);
                        int i28 = this.f2848i + iMin4;
                        this.f2848i = i28;
                        if (i28 == this.f2852m) {
                            AbstractC0646n.m1630h(this.f2853n != -9223372036854775807L);
                            this.f2846g.mo1172a(this.f2853n, 1, this.f2852m, 0, null);
                            this.f2853n += this.f2850k;
                            this.f2847h = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
        int i3 = this.f2840a;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        switch (this.f2840a) {
            case 0:
                c0736g.m1848a();
                c0736g.m1849b();
                this.f2845f = c0736g.f2836e;
                c0736g.m1849b();
                this.f2846g = interfaceC2242o.mo344p(c0736g.f2835d, 1);
                break;
            default:
                c0736g.m1848a();
                c0736g.m1849b();
                this.f2845f = c0736g.f2836e;
                c0736g.m1849b();
                this.f2846g = interfaceC2242o.mo344p(c0736g.f2835d, 1);
                break;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        switch (this.f2840a) {
            case 0:
                this.f2853n = j3;
                break;
            default:
                this.f2853n = j3;
                break;
        }
    }

    public C0739b(String str, int i3, int i4) {
        this.f2840a = i4;
        switch (i4) {
            case 1:
                C0508g c0508g = new C0508g(new byte[16], 16);
                this.f2841b = c0508g;
                this.f2842c = new C0651s(c0508g.f1731b);
                this.f2847h = 0;
                this.f2848i = 0;
                this.f2849j = false;
                this.f2853n = -9223372036854775807L;
                this.f2843d = str;
                this.f2844e = i3;
                break;
            default:
                C0508g c0508g2 = new C0508g(new byte[128], 128);
                this.f2841b = c0508g2;
                this.f2842c = new C0651s(c0508g2.f1731b);
                this.f2847h = 0;
                this.f2853n = -9223372036854775807L;
                this.f2843d = str;
                this.f2844e = i3;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1850a(boolean z3) {
    }

    /* JADX INFO: renamed from: g */
    private final void m1851g(boolean z3) {
    }
}
