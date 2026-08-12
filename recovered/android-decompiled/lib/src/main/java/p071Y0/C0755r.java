package p071Y0;

import android.support.v4.media.session.C0858A;
import java.util.Collections;
import p055T.AbstractC0545H;
import p055T.C0573f;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0633a;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0684p;
import p067X.C0676h;
import p067X.C0680l;
import p067X.C0687s;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0755r implements InterfaceC0745h {

    /* JADX INFO: renamed from: a */
    public final C0858A f3023a;

    /* JADX INFO: renamed from: b */
    public String f3024b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2226E f3025c;

    /* JADX INFO: renamed from: d */
    public C0754q f3026d;

    /* JADX INFO: renamed from: e */
    public boolean f3027e;

    /* JADX INFO: renamed from: l */
    public long f3034l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f3028f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final C0760w f3029g = new C0760w(32);

    /* JADX INFO: renamed from: h */
    public final C0760w f3030h = new C0760w(33);

    /* JADX INFO: renamed from: i */
    public final C0760w f3031i = new C0760w(34);

    /* JADX INFO: renamed from: j */
    public final C0760w f3032j = new C0760w(39);

    /* JADX INFO: renamed from: k */
    public final C0760w f3033k = new C0760w(40);

    /* JADX INFO: renamed from: m */
    public long f3035m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final C0651s f3036n = new C0651s();

    public C0755r(C0858A c0858a) {
        this.f3023a = c0858a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1866a(byte[] bArr, int i3, int i4) {
        C0754q c0754q = this.f3026d;
        if (c0754q.f3015f) {
            int i5 = c0754q.f3013d;
            int i6 = (i3 + 2) - i5;
            if (i6 < i4) {
                c0754q.f3016g = (bArr[i6] & 128) != 0;
                c0754q.f3015f = false;
            } else {
                c0754q.f3013d = (i4 - i3) + i5;
            }
        }
        if (!this.f3027e) {
            this.f3029g.m1867a(bArr, i3, i4);
            this.f3030h.m1867a(bArr, i3, i4);
            this.f3031i.m1867a(bArr, i3, i4);
        }
        this.f3032j.m1867a(bArr, i3, i4);
        this.f3033k.m1867a(bArr, i3, i4);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        this.f3034l = 0L;
        this.f3035m = -9223372036854775807L;
        AbstractC0684p.m1788a(this.f3028f);
        this.f3029g.m1873g();
        this.f3030h.m1873g();
        this.f3031i.m1873g();
        this.f3032j.m1873g();
        this.f3033k.m1873g();
        ((C0687s) this.f3023a.f3641j).m1801c(0);
        C0754q c0754q = this.f3026d;
        if (c0754q != null) {
            c0754q.f3015f = false;
            c0754q.f3016g = false;
            c0754q.f3017h = false;
            c0754q.f3018i = false;
            c0754q.f3019j = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x018d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0228  */
    /* JADX WARN: Code duplicated, block: B:95:0x0239  */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) {
        boolean z3;
        C0760w c0760w;
        C0760w c0760w2;
        C0760w c0760w3;
        C0687s c0687s;
        C0760w c0760w4;
        boolean zM1871e;
        C0651s c0651s2;
        C0760w c0760w5;
        boolean z4;
        boolean z5;
        AbstractC0646n.m1631i(this.f3025c);
        int i3 = AbstractC0632A.f2454a;
        while (c0651s.m1667a() > 0) {
            int i4 = c0651s.f2521b;
            int i5 = c0651s.f2522c;
            byte[] bArr = c0651s.f2520a;
            this.f3034l += (long) c0651s.m1667a();
            this.f3025c.mo1173b(c0651s.m1667a(), c0651s);
            while (i4 < i5) {
                int iM1789b = AbstractC0684p.m1789b(bArr, i4, i5, this.f3028f);
                if (iM1789b == i5) {
                    m1866a(bArr, i4, i5);
                    return;
                }
                int i6 = iM1789b + 3;
                int i7 = (bArr[i6] & 126) >> 1;
                int i8 = iM1789b - i4;
                if (i8 > 0) {
                    m1866a(bArr, i4, iM1789b);
                }
                int i9 = i5 - iM1789b;
                long j3 = this.f3034l - ((long) i9);
                int i10 = i8 < 0 ? -i8 : 0;
                long j4 = this.f3035m;
                C0754q c0754q = this.f3026d;
                boolean z6 = this.f3027e;
                if (c0754q.f3019j && c0754q.f3016g) {
                    c0754q.f3022m = c0754q.f3012c;
                    c0754q.f3019j = false;
                } else {
                    if (c0754q.f3017h || c0754q.f3016g) {
                        if (z6 && c0754q.f3018i) {
                            c0754q.m1865a(((int) (j3 - c0754q.f3011b)) + i9);
                        }
                        c0754q.f3020k = c0754q.f3011b;
                        c0754q.f3021l = c0754q.f3014e;
                        c0754q.f3022m = c0754q.f3012c;
                        c0754q.f3018i = true;
                    }
                    z3 = this.f3027e;
                    C0858A c0858a = this.f3023a;
                    c0760w = this.f3031i;
                    c0760w2 = this.f3030h;
                    c0760w3 = this.f3029g;
                    c0687s = (C0687s) c0858a.f3641j;
                    if (!z3) {
                        c0760w3.m1871e(i10);
                        c0760w2.m1871e(i10);
                        c0760w.m1871e(i10);
                        if (!c0760w3.f3099d && c0760w2.f3099d && c0760w.f3099d) {
                            String str = this.f3024b;
                            int i11 = c0760w3.f3100e;
                            byte[] bArr2 = new byte[c0760w2.f3100e + i11 + c0760w.f3100e];
                            System.arraycopy((byte[]) c0760w3.f3101f, 0, bArr2, 0, i11);
                            System.arraycopy((byte[]) c0760w2.f3101f, 0, bArr2, c0760w3.f3100e, c0760w2.f3100e);
                            System.arraycopy((byte[]) c0760w.f3101f, 0, bArr2, c0760w3.f3100e + c0760w2.f3100e, c0760w.f3100e);
                            String strM1608a = null;
                            C0680l c0680lM1794g = AbstractC0684p.m1794g((byte[]) c0760w2.f3101f, 3, c0760w2.f3100e, null);
                            C0676h c0676h = c0680lM1794g.f2595a;
                            if (c0676h != null) {
                                strM1608a = AbstractC0633a.m1608a(c0676h.f2581a, c0676h.f2582b, c0676h.f2583c, c0676h.f2584d, c0676h.f2585e, c0676h.f2586f);
                            }
                            C0582n c0582n = new C0582n();
                            c0582n.f2102a = str;
                            c0582n.f2114m = AbstractC0545H.m1364l("video/hevc");
                            c0582n.f2111j = strM1608a;
                            c0582n.f2121t = c0680lM1794g.f2598d;
                            c0582n.f2122u = c0680lM1794g.f2599e;
                            c0582n.f2091A = new C0573f(c0680lM1794g.f2602h, c0680lM1794g.f2603i, c0680lM1794g.f2604j, c0680lM1794g.f2596b + 8, c0680lM1794g.f2597c + 8, null);
                            c0582n.f2125x = c0680lM1794g.f2600f;
                            c0582n.f2116o = c0680lM1794g.f2601g;
                            c0582n.f2117p = Collections.singletonList(bArr2);
                            C0583o c0583o = new C0583o(c0582n);
                            this.f3025c.mo1176e(c0583o);
                            int i12 = c0583o.f2156p;
                            if (i12 == -1) {
                                throw new IllegalStateException();
                            }
                            c0687s.getClass();
                            AbstractC0646n.m1630h(i12 >= 0);
                            c0687s.f2635a = i12;
                            c0687s.m1801c(i12);
                            this.f3027e = true;
                        }
                    }
                    c0760w4 = this.f3032j;
                    zM1871e = c0760w4.m1871e(i10);
                    c0651s2 = this.f3036n;
                    if (zM1871e) {
                        c0651s2.m1663E((byte[]) c0760w4.f3101f, AbstractC0684p.m1798k((byte[]) c0760w4.f3101f, c0760w4.f3100e));
                        c0651s2.m1666H(5);
                        c0687s.m1799a(j4, c0651s2);
                    }
                    c0760w5 = this.f3033k;
                    if (c0760w5.m1871e(i10)) {
                        c0651s2.m1663E((byte[]) c0760w5.f3101f, AbstractC0684p.m1798k((byte[]) c0760w5.f3101f, c0760w5.f3100e));
                        c0651s2.m1666H(5);
                        c0687s.m1799a(j4, c0651s2);
                    }
                    long j5 = this.f3035m;
                    C0754q c0754q2 = this.f3026d;
                    boolean z7 = this.f3027e;
                    c0754q2.f3016g = false;
                    c0754q2.f3017h = false;
                    c0754q2.f3014e = j5;
                    c0754q2.f3013d = 0;
                    c0754q2.f3011b = j3;
                    if (i7 >= 32 || i7 == 40) {
                        z4 = true;
                    } else {
                        if (c0754q2.f3018i && !c0754q2.f3019j) {
                            if (z7) {
                                c0754q2.m1865a(i9);
                            }
                            c0754q2.f3018i = false;
                        }
                        if ((32 > i7 || i7 > 35) && i7 != 39) {
                            z4 = true;
                        } else {
                            z4 = true;
                            c0754q2.f3017h = !c0754q2.f3019j;
                            c0754q2.f3019j = true;
                        }
                    }
                    if (i7 >= 16 || i7 > 21) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    c0754q2.f3012c = z5;
                    if (!z5 && i7 > 9) {
                        z4 = false;
                    }
                    c0754q2.f3015f = z4;
                    if (!this.f3027e) {
                        c0760w3.m1874h(i7);
                        c0760w2.m1874h(i7);
                        c0760w.m1874h(i7);
                    }
                    c0760w4.m1874h(i7);
                    c0760w5.m1874h(i7);
                    i4 = i6;
                    i5 = i5;
                    bArr = bArr;
                }
                i6 = i6;
                z3 = this.f3027e;
                C0858A c0858a2 = this.f3023a;
                c0760w = this.f3031i;
                c0760w2 = this.f3030h;
                c0760w3 = this.f3029g;
                c0687s = (C0687s) c0858a2.f3641j;
                if (!z3) {
                    c0760w3.m1871e(i10);
                    c0760w2.m1871e(i10);
                    c0760w.m1871e(i10);
                    if (!c0760w3.f3099d) {
                    }
                }
                c0760w4 = this.f3032j;
                zM1871e = c0760w4.m1871e(i10);
                c0651s2 = this.f3036n;
                if (zM1871e) {
                    c0651s2.m1663E((byte[]) c0760w4.f3101f, AbstractC0684p.m1798k((byte[]) c0760w4.f3101f, c0760w4.f3100e));
                    c0651s2.m1666H(5);
                    c0687s.m1799a(j4, c0651s2);
                }
                c0760w5 = this.f3033k;
                if (c0760w5.m1871e(i10)) {
                    c0651s2.m1663E((byte[]) c0760w5.f3101f, AbstractC0684p.m1798k((byte[]) c0760w5.f3101f, c0760w5.f3100e));
                    c0651s2.m1666H(5);
                    c0687s.m1799a(j4, c0651s2);
                }
                long j6 = this.f3035m;
                C0754q c0754q3 = this.f3026d;
                boolean z8 = this.f3027e;
                c0754q3.f3016g = false;
                c0754q3.f3017h = false;
                c0754q3.f3014e = j6;
                c0754q3.f3013d = 0;
                c0754q3.f3011b = j3;
                if (i7 >= 32) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (i7 >= 16) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                c0754q3.f3012c = z5;
                if (!z5) {
                    z4 = false;
                }
                c0754q3.f3015f = z4;
                if (!this.f3027e) {
                    c0760w3.m1874h(i7);
                    c0760w2.m1874h(i7);
                    c0760w.m1874h(i7);
                }
                c0760w4.m1874h(i7);
                c0760w5.m1874h(i7);
                i4 = i6;
                i5 = i5;
                bArr = bArr;
            }
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
        AbstractC0646n.m1631i(this.f3025c);
        int i3 = AbstractC0632A.f2454a;
        if (z3) {
            ((C0687s) this.f3023a.f3641j).m1801c(0);
            C0754q c0754q = this.f3026d;
            long j3 = this.f3034l;
            c0754q.f3022m = c0754q.f3012c;
            c0754q.m1865a((int) (j3 - c0754q.f3011b));
            c0754q.f3020k = c0754q.f3011b;
            c0754q.f3011b = j3;
            c0754q.m1865a(0);
            c0754q.f3018i = false;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f3024b = c0736g.f2836e;
        c0736g.m1849b();
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 2);
        this.f3025c = interfaceC2226EMo344p;
        this.f3026d = new C0754q(interfaceC2226EMo344p);
        this.f3023a.m2180t(interfaceC2242o, c0736g);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f3035m = j3;
    }
}
