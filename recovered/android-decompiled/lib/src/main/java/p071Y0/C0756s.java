package p071Y0;

import java.util.Collections;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.AbstractC2229b;
import p145s0.C2228a;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0756s implements InterfaceC0745h {

    /* JADX INFO: renamed from: a */
    public final String f3037a;

    /* JADX INFO: renamed from: b */
    public final int f3038b;

    /* JADX INFO: renamed from: c */
    public final C0651s f3039c;

    /* JADX INFO: renamed from: d */
    public final C0508g f3040d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2226E f3041e;

    /* JADX INFO: renamed from: f */
    public String f3042f;

    /* JADX INFO: renamed from: g */
    public C0583o f3043g;

    /* JADX INFO: renamed from: h */
    public int f3044h;

    /* JADX INFO: renamed from: i */
    public int f3045i;

    /* JADX INFO: renamed from: j */
    public int f3046j;

    /* JADX INFO: renamed from: k */
    public int f3047k;

    /* JADX INFO: renamed from: l */
    public long f3048l;

    /* JADX INFO: renamed from: m */
    public boolean f3049m;

    /* JADX INFO: renamed from: n */
    public int f3050n;

    /* JADX INFO: renamed from: o */
    public int f3051o;

    /* JADX INFO: renamed from: p */
    public int f3052p;

    /* JADX INFO: renamed from: q */
    public boolean f3053q;

    /* JADX INFO: renamed from: r */
    public long f3054r;

    /* JADX INFO: renamed from: s */
    public int f3055s;

    /* JADX INFO: renamed from: t */
    public long f3056t;

    /* JADX INFO: renamed from: u */
    public int f3057u;

    /* JADX INFO: renamed from: v */
    public String f3058v;

    public C0756s(int i3, String str) {
        this.f3037a = str;
        this.f3038b = i3;
        C0651s c0651s = new C0651s(1024);
        this.f3039c = c0651s;
        byte[] bArr = c0651s.f2520a;
        this.f3040d = new C0508g(bArr, bArr.length);
        this.f3048l = -9223372036854775807L;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        this.f3044h = 0;
        this.f3048l = -9223372036854775807L;
        this.f3049m = false;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) throws C0546I {
        int iM1252i;
        boolean zM1251h;
        AbstractC0646n.m1631i(this.f3041e);
        while (c0651s.m1667a() > 0) {
            int i3 = this.f3044h;
            if (i3 != 0) {
                if (i3 != 1) {
                    C0651s c0651s2 = this.f3039c;
                    C0508g c0508g = this.f3040d;
                    if (i3 == 2) {
                        int iM1687u = ((this.f3047k & (-225)) << 8) | c0651s.m1687u();
                        this.f3046j = iM1687u;
                        if (iM1687u > c0651s2.f2520a.length) {
                            c0651s2.m1662D(iM1687u);
                            byte[] bArr = c0651s2.f2520a;
                            c0508g.getClass();
                            c0508g.m1259p(bArr, bArr.length);
                        }
                        this.f3045i = 0;
                        this.f3044h = 3;
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c0651s.m1667a(), this.f3046j - this.f3045i);
                        c0651s.m1671e(c0508g.f1731b, this.f3045i, iMin);
                        int i4 = this.f3045i + iMin;
                        this.f3045i = i4;
                        if (i4 == this.f3046j) {
                            c0508g.m1260q(0);
                            if (c0508g.m1251h()) {
                                if (this.f3049m) {
                                }
                                this.f3044h = 0;
                            } else {
                                this.f3049m = true;
                                int iM1252i2 = c0508g.m1252i(1);
                                int iM1252i3 = iM1252i2 == 1 ? c0508g.m1252i(1) : 0;
                                this.f3050n = iM1252i3;
                                if (iM1252i3 != 0) {
                                    throw C0546I.m1365a(null, null);
                                }
                                if (iM1252i2 == 1) {
                                    c0508g.m1252i((c0508g.m1252i(2) + 1) * 8);
                                }
                                if (!c0508g.m1251h()) {
                                    throw C0546I.m1365a(null, null);
                                }
                                this.f3051o = c0508g.m1252i(6);
                                int iM1252i4 = c0508g.m1252i(4);
                                int iM1252i5 = c0508g.m1252i(3);
                                if (iM1252i4 != 0 || iM1252i5 != 0) {
                                    throw C0546I.m1365a(null, null);
                                }
                                if (iM1252i2 == 0) {
                                    int iM1250g = c0508g.m1250g();
                                    int iM1245b = c0508g.m1245b();
                                    C2228a c2228aM4819n = AbstractC2229b.m4819n(c0508g, true);
                                    this.f3058v = c2228aM4819n.f9562a;
                                    this.f3055s = c2228aM4819n.f9563b;
                                    this.f3057u = c2228aM4819n.f9564c;
                                    int iM1245b2 = iM1245b - c0508g.m1245b();
                                    c0508g.m1260q(iM1250g);
                                    byte[] bArr2 = new byte[(iM1245b2 + 7) / 8];
                                    c0508g.m1253j(bArr2, iM1245b2);
                                    C0582n c0582n = new C0582n();
                                    c0582n.f2102a = this.f3042f;
                                    c0582n.f2114m = AbstractC0545H.m1364l("audio/mp4a-latm");
                                    c0582n.f2111j = this.f3058v;
                                    c0582n.f2092B = this.f3057u;
                                    c0582n.f2093C = this.f3055s;
                                    c0582n.f2117p = Collections.singletonList(bArr2);
                                    c0582n.f2105d = this.f3037a;
                                    c0582n.f2107f = this.f3038b;
                                    C0583o c0583o = new C0583o(c0582n);
                                    if (!c0583o.equals(this.f3043g)) {
                                        this.f3043g = c0583o;
                                        this.f3056t = 1024000000 / ((long) c0583o.f2131D);
                                        this.f3041e.mo1176e(c0583o);
                                    }
                                } else {
                                    int iM1252i6 = c0508g.m1252i((c0508g.m1252i(2) + 1) * 8);
                                    int iM1245b3 = c0508g.m1245b();
                                    C2228a c2228aM4819n2 = AbstractC2229b.m4819n(c0508g, true);
                                    this.f3058v = c2228aM4819n2.f9562a;
                                    this.f3055s = c2228aM4819n2.f9563b;
                                    this.f3057u = c2228aM4819n2.f9564c;
                                    c0508g.m1263t(iM1252i6 - (iM1245b3 - c0508g.m1245b()));
                                }
                                int iM1252i7 = c0508g.m1252i(3);
                                this.f3052p = iM1252i7;
                                if (iM1252i7 == 0) {
                                    c0508g.m1263t(8);
                                } else if (iM1252i7 == 1) {
                                    c0508g.m1263t(9);
                                } else if (iM1252i7 == 3 || iM1252i7 == 4 || iM1252i7 == 5) {
                                    c0508g.m1263t(6);
                                } else {
                                    if (iM1252i7 != 6 && iM1252i7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c0508g.m1263t(1);
                                }
                                boolean zM1251h2 = c0508g.m1251h();
                                this.f3053q = zM1251h2;
                                this.f3054r = 0L;
                                if (zM1251h2) {
                                    if (iM1252i2 == 1) {
                                        this.f3054r = c0508g.m1252i((c0508g.m1252i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM1251h = c0508g.m1251h();
                                            this.f3054r = (this.f3054r << 8) + ((long) c0508g.m1252i(8));
                                        } while (zM1251h);
                                    }
                                }
                                if (c0508g.m1251h()) {
                                    c0508g.m1263t(8);
                                }
                            }
                            if (this.f3050n != 0) {
                                throw C0546I.m1365a(null, null);
                            }
                            if (this.f3051o != 0) {
                                throw C0546I.m1365a(null, null);
                            }
                            if (this.f3052p != 0) {
                                throw C0546I.m1365a(null, null);
                            }
                            int i5 = 0;
                            do {
                                iM1252i = c0508g.m1252i(8);
                                i5 += iM1252i;
                            } while (iM1252i == 255);
                            int iM1250g2 = c0508g.m1250g();
                            if ((iM1250g2 & 7) == 0) {
                                c0651s2.m1665G(iM1250g2 >> 3);
                            } else {
                                c0508g.m1253j(c0651s2.f2520a, i5 * 8);
                                c0651s2.m1665G(0);
                            }
                            this.f3041e.mo1173b(i5, c0651s2);
                            AbstractC0646n.m1630h(this.f3048l != -9223372036854775807L);
                            this.f3041e.mo1172a(this.f3048l, 1, i5, 0, null);
                            this.f3048l += this.f3056t;
                            if (this.f3053q) {
                                c0508g.m1263t((int) this.f3054r);
                            }
                            this.f3044h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM1687u2 = c0651s.m1687u();
                    if ((iM1687u2 & 224) == 224) {
                        this.f3047k = iM1687u2;
                        this.f3044h = 2;
                    } else if (iM1687u2 != 86) {
                        this.f3044h = 0;
                    }
                }
            } else if (c0651s.m1687u() == 86) {
                this.f3044h = 1;
            }
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f3041e = interfaceC2242o.mo344p(c0736g.f2835d, 1);
        c0736g.m1849b();
        this.f3042f = c0736g.f2836e;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f3048l = j3;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
    }
}
