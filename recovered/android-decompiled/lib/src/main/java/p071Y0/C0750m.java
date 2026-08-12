package p071Y0;

import java.util.Arrays;
import java.util.Collections;
import p009D0.C0106b;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0684p;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0750m implements InterfaceC0745h {

    /* JADX INFO: renamed from: l */
    public static final float[] f2948l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final C0106b f2949a;

    /* JADX INFO: renamed from: b */
    public final C0651s f2950b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f2951c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final C0748k f2952d;

    /* JADX INFO: renamed from: e */
    public final C0760w f2953e;

    /* JADX INFO: renamed from: f */
    public C0749l f2954f;

    /* JADX INFO: renamed from: g */
    public long f2955g;

    /* JADX INFO: renamed from: h */
    public String f2956h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2226E f2957i;

    /* JADX INFO: renamed from: j */
    public boolean f2958j;

    /* JADX INFO: renamed from: k */
    public long f2959k;

    public C0750m(C0106b c0106b) {
        this.f2949a = c0106b;
        C0748k c0748k = new C0748k();
        c0748k.f2939e = new byte[128];
        this.f2952d = c0748k;
        this.f2959k = -9223372036854775807L;
        this.f2953e = new C0760w(178);
        this.f2950b = new C0651s();
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        AbstractC0684p.m1788a(this.f2951c);
        C0748k c0748k = this.f2952d;
        c0748k.f2935a = false;
        c0748k.f2937c = 0;
        c0748k.f2936b = 0;
        C0749l c0749l = this.f2954f;
        if (c0749l != null) {
            c0749l.f2941b = false;
            c0749l.f2942c = false;
            c0749l.f2943d = false;
            c0749l.f2944e = -1;
        }
        C0760w c0760w = this.f2953e;
        if (c0760w != null) {
            c0760w.m1873g();
        }
        this.f2955g = 0L;
        this.f2959k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x025b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0260  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0201  */
    /* JADX WARN: Code duplicated, block: B:90:0x0208  */
    /* JADX WARN: Code duplicated, block: B:93:0x0228  */
    /* JADX WARN: Code duplicated, block: B:95:0x0233  */
    /* JADX WARN: Code duplicated, block: B:96:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x0254  */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) {
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        float f;
        int i6 = 1;
        AbstractC0646n.m1631i(this.f2954f);
        AbstractC0646n.m1631i(this.f2957i);
        int i7 = c0651s.f2521b;
        int i8 = c0651s.f2522c;
        byte[] bArr = c0651s.f2520a;
        this.f2955g += (long) c0651s.m1667a();
        this.f2957i.mo1173b(c0651s.m1667a(), c0651s);
        while (true) {
            int iM1789b = AbstractC0684p.m1789b(bArr, i7, i8, this.f2951c);
            C0748k c0748k = this.f2952d;
            C0760w c0760w = this.f2953e;
            if (iM1789b == i8) {
                if (!this.f2958j) {
                    c0748k.m1860a(bArr, i7, i8);
                }
                this.f2954f.m1861a(bArr, i7, i8);
                if (c0760w != null) {
                    c0760w.m1867a(bArr, i7, i8);
                    return;
                }
                return;
            }
            int i9 = iM1789b + 3;
            byte b3 = c0651s.f2520a[i9];
            int i10 = b3 & 255;
            int i11 = iM1789b - i7;
            if (this.f2958j) {
                i3 = i8;
                i4 = i9;
            } else {
                if (i11 > 0) {
                    c0748k.m1860a(bArr, i7, iM1789b);
                }
                int i12 = i11 < 0 ? -i11 : 0;
                int i13 = c0748k.f2936b;
                if (i13 != 0) {
                    i3 = i8;
                    if (i13 == i6) {
                        i4 = i9;
                        if (i10 != 181) {
                            AbstractC0646n.m1647y("H263Reader", "Unexpected start code value");
                            c0748k.f2935a = false;
                            c0748k.f2937c = 0;
                            c0748k.f2936b = 0;
                        } else {
                            c0748k.f2936b = 2;
                        }
                    } else if (i13 != 2) {
                        i4 = i9;
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                c0748k.f2937c -= i12;
                                c0748k.f2935a = false;
                                InterfaceC2226E interfaceC2226E = this.f2957i;
                                int i14 = c0748k.f2938d;
                                String str = this.f2956h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(c0748k.f2939e, c0748k.f2937c);
                                C0508g c0508g = new C0508g(bArrCopyOf, bArrCopyOf.length);
                                c0508g.m1264u(i14);
                                c0508g.m1264u(4);
                                c0508g.m1262s();
                                c0508g.m1263t(8);
                                if (c0508g.m1251h()) {
                                    c0508g.m1263t(4);
                                    c0508g.m1263t(3);
                                }
                                int iM1252i = c0508g.m1252i(4);
                                if (iM1252i == 15) {
                                    int iM1252i2 = c0508g.m1252i(8);
                                    int iM1252i3 = c0508g.m1252i(8);
                                    if (iM1252i3 == 0) {
                                        AbstractC0646n.m1647y("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iM1252i2 / iM1252i3;
                                    }
                                } else if (iM1252i < 7) {
                                    f = f2948l[iM1252i];
                                } else {
                                    AbstractC0646n.m1647y("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (c0508g.m1251h()) {
                                    c0508g.m1263t(2);
                                    c0508g.m1263t(1);
                                    if (c0508g.m1251h()) {
                                        c0508g.m1263t(15);
                                        c0508g.m1262s();
                                        c0508g.m1263t(15);
                                        c0508g.m1262s();
                                        c0508g.m1263t(15);
                                        c0508g.m1262s();
                                        c0508g.m1263t(3);
                                        c0508g.m1263t(11);
                                        c0508g.m1262s();
                                        c0508g.m1263t(15);
                                        c0508g.m1262s();
                                    }
                                }
                                if (c0508g.m1252i(2) != 0) {
                                    AbstractC0646n.m1647y("H263Reader", "Unhandled video object layer shape");
                                }
                                c0508g.m1262s();
                                int iM1252i4 = c0508g.m1252i(16);
                                c0508g.m1262s();
                                if (c0508g.m1251h()) {
                                    if (iM1252i4 == 0) {
                                        AbstractC0646n.m1647y("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i15 = 0;
                                        for (int i16 = iM1252i4 - 1; i16 > 0; i16 >>= 1) {
                                            i15++;
                                        }
                                        c0508g.m1263t(i15);
                                    }
                                }
                                c0508g.m1262s();
                                int iM1252i5 = c0508g.m1252i(13);
                                c0508g.m1262s();
                                int iM1252i6 = c0508g.m1252i(13);
                                c0508g.m1262s();
                                c0508g.m1262s();
                                C0582n c0582n = new C0582n();
                                c0582n.f2102a = str;
                                c0582n.f2114m = AbstractC0545H.m1364l("video/mp4v-es");
                                c0582n.f2121t = iM1252i5;
                                c0582n.f2122u = iM1252i6;
                                c0582n.f2125x = f;
                                c0582n.f2117p = Collections.singletonList(bArrCopyOf);
                                interfaceC2226E.mo1176e(new C0583o(c0582n));
                                this.f2958j = true;
                            }
                            this.f2954f.m1861a(bArr, i7, iM1789b);
                            if (c0760w == null) {
                                i6 = 1;
                            } else {
                                if (i11 > 0) {
                                    c0760w.m1867a(bArr, i7, iM1789b);
                                    i5 = 0;
                                } else {
                                    i5 = -i11;
                                }
                                if (c0760w.m1871e(i5)) {
                                    int iM1798k = AbstractC0684p.m1798k((byte[]) c0760w.f3101f, c0760w.f3100e);
                                    int i17 = AbstractC0632A.f2454a;
                                    byte[] bArr2 = (byte[]) c0760w.f3101f;
                                    C0651s c0651s2 = this.f2950b;
                                    c0651s2.m1663E(bArr2, iM1798k);
                                    this.f2949a.m527o(this.f2959k, c0651s2);
                                }
                                if (i10 == 178) {
                                    i6 = 1;
                                    if (c0651s.f2520a[iM1789b + 2] == 1) {
                                        c0760w.m1874h(i10);
                                    }
                                } else {
                                    i6 = 1;
                                }
                            }
                            int i18 = i3 - iM1789b;
                            this.f2954f.m1862b(i18, this.f2955g - ((long) i18), this.f2958j);
                            C0749l c0749l = this.f2954f;
                            long j3 = this.f2959k;
                            c0749l.f2944e = i10;
                            c0749l.f2943d = false;
                            if (i10 != 182 || i10 == 179) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c0749l.f2941b = z3;
                            if (i10 == 182) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c0749l.f2942c = z4;
                            c0749l.f2945f = 0;
                            c0749l.f2947h = j3;
                            i8 = i3;
                            i7 = i4;
                        } else if ((b3 & 240) != 32) {
                            AbstractC0646n.m1647y("H263Reader", "Unexpected start code value");
                            c0748k.f2935a = false;
                            c0748k.f2937c = 0;
                            c0748k.f2936b = 0;
                        } else {
                            c0748k.f2938d = c0748k.f2937c;
                            c0748k.f2936b = 4;
                        }
                    } else {
                        i4 = i9;
                        if (i10 > 31) {
                            AbstractC0646n.m1647y("H263Reader", "Unexpected start code value");
                            c0748k.f2935a = false;
                            c0748k.f2937c = 0;
                            c0748k.f2936b = 0;
                        } else {
                            c0748k.f2936b = 3;
                        }
                    }
                } else {
                    i3 = i8;
                    i4 = i9;
                    if (i10 == 176) {
                        c0748k.f2936b = 1;
                        c0748k.f2935a = true;
                    }
                }
                c0748k.m1860a(C0748k.f2934f, 0, 3);
                this.f2954f.m1861a(bArr, i7, iM1789b);
                if (c0760w == null) {
                    i6 = 1;
                } else {
                    if (i11 > 0) {
                        c0760w.m1867a(bArr, i7, iM1789b);
                        i5 = 0;
                    } else {
                        i5 = -i11;
                    }
                    if (c0760w.m1871e(i5)) {
                        int iM1798k2 = AbstractC0684p.m1798k((byte[]) c0760w.f3101f, c0760w.f3100e);
                        int i19 = AbstractC0632A.f2454a;
                        byte[] bArr3 = (byte[]) c0760w.f3101f;
                        C0651s c0651s3 = this.f2950b;
                        c0651s3.m1663E(bArr3, iM1798k2);
                        this.f2949a.m527o(this.f2959k, c0651s3);
                    }
                    if (i10 == 178) {
                        i6 = 1;
                        if (c0651s.f2520a[iM1789b + 2] == 1) {
                            c0760w.m1874h(i10);
                        }
                    } else {
                        i6 = 1;
                    }
                }
                int i110 = i3 - iM1789b;
                this.f2954f.m1862b(i110, this.f2955g - ((long) i110), this.f2958j);
                C0749l c0749l2 = this.f2954f;
                long j4 = this.f2959k;
                c0749l2.f2944e = i10;
                c0749l2.f2943d = false;
                if (i10 != 182) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                c0749l2.f2941b = z3;
                if (i10 == 182) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c0749l2.f2942c = z4;
                c0749l2.f2945f = 0;
                c0749l2.f2947h = j4;
                i8 = i3;
                i7 = i4;
            }
            this.f2954f.m1861a(bArr, i7, iM1789b);
            if (c0760w == null) {
                i6 = 1;
            } else {
                if (i11 > 0) {
                    c0760w.m1867a(bArr, i7, iM1789b);
                    i5 = 0;
                } else {
                    i5 = -i11;
                }
                if (c0760w.m1871e(i5)) {
                    int iM1798k3 = AbstractC0684p.m1798k((byte[]) c0760w.f3101f, c0760w.f3100e);
                    int i111 = AbstractC0632A.f2454a;
                    byte[] bArr4 = (byte[]) c0760w.f3101f;
                    C0651s c0651s4 = this.f2950b;
                    c0651s4.m1663E(bArr4, iM1798k3);
                    this.f2949a.m527o(this.f2959k, c0651s4);
                }
                if (i10 == 178) {
                    i6 = 1;
                    if (c0651s.f2520a[iM1789b + 2] == 1) {
                        c0760w.m1874h(i10);
                    }
                } else {
                    i6 = 1;
                }
            }
            int i112 = i3 - iM1789b;
            this.f2954f.m1862b(i112, this.f2955g - ((long) i112), this.f2958j);
            C0749l c0749l3 = this.f2954f;
            long j5 = this.f2959k;
            c0749l3.f2944e = i10;
            c0749l3.f2943d = false;
            if (i10 != 182) {
                z3 = true;
            } else {
                z3 = true;
            }
            c0749l3.f2941b = z3;
            if (i10 == 182) {
                z4 = true;
            } else {
                z4 = false;
            }
            c0749l3.f2942c = z4;
            c0749l3.f2945f = 0;
            c0749l3.f2947h = j5;
            i8 = i3;
            i7 = i4;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
        AbstractC0646n.m1631i(this.f2954f);
        if (z3) {
            this.f2954f.m1862b(0, this.f2955g, this.f2958j);
            C0749l c0749l = this.f2954f;
            c0749l.f2941b = false;
            c0749l.f2942c = false;
            c0749l.f2943d = false;
            c0749l.f2944e = -1;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f2956h = c0736g.f2836e;
        c0736g.m1849b();
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 2);
        this.f2957i = interfaceC2226EMo344p;
        this.f2954f = new C0749l(interfaceC2226EMo344p);
        this.f2949a.m528p(interfaceC2242o, c0736g);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f2959k = j3;
    }
}
