package p071Y0;

import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.C2250w;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0757t implements InterfaceC0745h {

    /* JADX INFO: renamed from: a */
    public final C0651s f3059a;

    /* JADX INFO: renamed from: b */
    public final C2250w f3060b;

    /* JADX INFO: renamed from: c */
    public final String f3061c;

    /* JADX INFO: renamed from: d */
    public final int f3062d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2226E f3063e;

    /* JADX INFO: renamed from: f */
    public String f3064f;

    /* JADX INFO: renamed from: g */
    public int f3065g = 0;

    /* JADX INFO: renamed from: h */
    public int f3066h;

    /* JADX INFO: renamed from: i */
    public boolean f3067i;

    /* JADX INFO: renamed from: j */
    public boolean f3068j;

    /* JADX INFO: renamed from: k */
    public long f3069k;

    /* JADX INFO: renamed from: l */
    public int f3070l;

    /* JADX INFO: renamed from: m */
    public long f3071m;

    public C0757t(int i3, String str) {
        C0651s c0651s = new C0651s(4);
        this.f3059a = c0651s;
        c0651s.f2520a[0] = -1;
        this.f3060b = new C2250w();
        this.f3071m = -9223372036854775807L;
        this.f3061c = str;
        this.f3062d = i3;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        this.f3065g = 0;
        this.f3066h = 0;
        this.f3068j = false;
        this.f3071m = -9223372036854775807L;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) {
        AbstractC0646n.m1631i(this.f3063e);
        while (c0651s.m1667a() > 0) {
            int i3 = this.f3065g;
            C0651s c0651s2 = this.f3059a;
            if (i3 == 0) {
                byte[] bArr = c0651s.f2520a;
                int i4 = c0651s.f2521b;
                int i5 = c0651s.f2522c;
                while (true) {
                    if (i4 >= i5) {
                        c0651s.m1665G(i5);
                        break;
                    }
                    byte b3 = bArr[i4];
                    boolean z3 = (b3 & 255) == 255;
                    boolean z4 = this.f3068j && (b3 & 224) == 224;
                    this.f3068j = z3;
                    if (z4) {
                        c0651s.m1665G(i4 + 1);
                        this.f3068j = false;
                        c0651s2.f2520a[1] = bArr[i4];
                        this.f3066h = 2;
                        this.f3065g = 1;
                        break;
                    }
                    i4++;
                }
            } else if (i3 == 1) {
                int iMin = Math.min(c0651s.m1667a(), 4 - this.f3066h);
                c0651s.m1671e(c0651s2.f2520a, this.f3066h, iMin);
                int i6 = this.f3066h + iMin;
                this.f3066h = i6;
                if (i6 >= 4) {
                    c0651s2.m1665G(0);
                    int iM1673g = c0651s2.m1673g();
                    C2250w c2250w = this.f3060b;
                    if (c2250w.m4845a(iM1673g)) {
                        this.f3070l = c2250w.f9677b;
                        if (!this.f3067i) {
                            this.f3069k = (((long) c2250w.f9681f) * 1000000) / ((long) c2250w.f9678c);
                            C0582n c0582n = new C0582n();
                            c0582n.f2102a = this.f3064f;
                            c0582n.f2114m = AbstractC0545H.m1364l((String) c2250w.f9682g);
                            c0582n.f2115n = 4096;
                            c0582n.f2092B = c2250w.f9679d;
                            c0582n.f2093C = c2250w.f9678c;
                            c0582n.f2105d = this.f3061c;
                            c0582n.f2107f = this.f3062d;
                            this.f3063e.mo1176e(new C0583o(c0582n));
                            this.f3067i = true;
                        }
                        c0651s2.m1665G(0);
                        this.f3063e.mo1173b(4, c0651s2);
                        this.f3065g = 2;
                    } else {
                        this.f3066h = 0;
                        this.f3065g = 1;
                    }
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c0651s.m1667a(), this.f3070l - this.f3066h);
                this.f3063e.mo1173b(iMin2, c0651s);
                int i7 = this.f3066h + iMin2;
                this.f3066h = i7;
                if (i7 >= this.f3070l) {
                    AbstractC0646n.m1630h(this.f3071m != -9223372036854775807L);
                    this.f3063e.mo1172a(this.f3071m, 1, this.f3070l, 0, null);
                    this.f3071m += this.f3069k;
                    this.f3066h = 0;
                    this.f3065g = 0;
                }
            }
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f3064f = c0736g.f2836e;
        c0736g.m1849b();
        this.f3063e = interfaceC2242o.mo344p(c0736g.f2835d, 1);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f3071m = j3;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
    }
}
