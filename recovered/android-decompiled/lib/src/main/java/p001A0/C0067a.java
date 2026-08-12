package p001A0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p021H0.C0253a;
import p036M0.C0379p;
import p045P0.InterfaceC0463i;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: A0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0067a implements InterfaceC2240m {

    /* JADX INFO: renamed from: b */
    public InterfaceC2242o f93b;

    /* JADX INFO: renamed from: c */
    public int f94c;

    /* JADX INFO: renamed from: d */
    public int f95d;

    /* JADX INFO: renamed from: e */
    public int f96e;

    /* JADX INFO: renamed from: g */
    public C0253a f98g;

    /* JADX INFO: renamed from: h */
    public C2237j f99h;

    /* JADX INFO: renamed from: i */
    public C0069c f100i;

    /* JADX INFO: renamed from: j */
    public C0379p f101j;

    /* JADX INFO: renamed from: a */
    public final C0651s f92a = new C0651s(6);

    /* JADX INFO: renamed from: f */
    public long f97f = -1;

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
        C0379p c0379p = this.f101j;
        if (c0379p != null) {
            c0379p.getClass();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m326b() {
        InterfaceC2242o interfaceC2242o = this.f93b;
        interfaceC2242o.getClass();
        interfaceC2242o.mo341l();
        this.f93b.mo333b(new C2244q(-9223372036854775807L));
        this.f94c = 6;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        String strM1682p;
        C0069c c0069cM356a;
        C1692X c1692x;
        int i3;
        C0253a c0253a;
        long j3;
        int i4 = this.f94c;
        C0651s c0651s = this.f92a;
        if (i4 == 0) {
            c0651s.m1662D(2);
            ((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 0, 2, false);
            int iM1659A = c0651s.m1659A();
            this.f95d = iM1659A;
            if (iM1659A == 65498) {
                if (this.f97f != -1) {
                    this.f94c = 4;
                    return 0;
                }
                m326b();
                return 0;
            }
            if ((iM1659A < 65488 || iM1659A > 65497) && iM1659A != 65281) {
                this.f94c = 1;
            }
        } else {
            if (i4 == 1) {
                c0651s.m1662D(2);
                ((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 0, 2, false);
                this.f96e = c0651s.m1659A() - 2;
                this.f94c = 2;
                return 0;
            }
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 5) {
                        if (i4 == 6) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f100i == null || interfaceC2241n != this.f99h) {
                        C2237j c2237j = (C2237j) interfaceC2241n;
                        this.f99h = c2237j;
                        this.f100i = new C0069c(c2237j, this.f97f);
                    }
                    C0379p c0379p = this.f101j;
                    c0379p.getClass();
                    int iMo328e = c0379p.mo328e(this.f100i, c0587s);
                    if (iMo328e == 1) {
                        c0587s.f2181a += this.f97f;
                    }
                    return iMo328e;
                }
                long j4 = ((C2237j) interfaceC2241n).f9629j;
                long j5 = this.f97f;
                if (j4 != j5) {
                    c0587s.f2181a = j5;
                    return 1;
                }
                C2237j c2237j2 = (C2237j) interfaceC2241n;
                if (!c2237j2.mo338i(c0651s.f2520a, 0, 1, true)) {
                    m326b();
                    return 0;
                }
                c2237j2.f9631l = 0;
                if (this.f101j == null) {
                    this.f101j = new C0379p(InterfaceC0463i.f1532a, 8);
                }
                C0069c c0069c = new C0069c(c2237j2, this.f97f);
                this.f100i = c0069c;
                if (!this.f101j.mo329f(c0069c)) {
                    m326b();
                    return 0;
                }
                C0379p c0379p2 = this.f101j;
                long j6 = this.f97f;
                InterfaceC2242o interfaceC2242o = this.f93b;
                interfaceC2242o.getClass();
                c0379p2.mo330h(new C0069c(2, j6, interfaceC2242o));
                C0253a c0253a2 = this.f98g;
                c0253a2.getClass();
                InterfaceC2242o interfaceC2242o2 = this.f93b;
                interfaceC2242o2.getClass();
                InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o2.mo344p(1024, 4);
                C0582n c0582n = new C0582n();
                c0582n.f2113l = AbstractC0545H.m1364l("image/jpeg");
                c0582n.f2112k = new C0544G(c0253a2);
                interfaceC2226EMo344p.mo1176e(new C0583o(c0582n));
                this.f94c = 5;
                return 0;
            }
            if (this.f95d == 65505) {
                C0651s c0651s2 = new C0651s(this.f96e);
                ((C2237j) interfaceC2241n).mo336f(c0651s2.f2520a, 0, this.f96e, false);
                if (this.f98g == null && "http://ns.adobe.com/xap/1.0/".equals(c0651s2.m1682p()) && (strM1682p = c0651s2.m1682p()) != null) {
                    long j7 = ((C2237j) interfaceC2241n).f9628i;
                    if (j7 == -1) {
                        c0253a = null;
                    } else {
                        try {
                            c0069cM356a = AbstractC0071e.m356a(strM1682p);
                        } catch (C0546I | NumberFormatException | XmlPullParserException unused) {
                            AbstractC0646n.m1647y("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                            c0069cM356a = null;
                        }
                        if (c0069cM356a != null && (i3 = (c1692x = (C1692X) c0069cM356a.f107i).f7631j) >= 2) {
                            int i5 = i3 - 1;
                            long j8 = -1;
                            long j9 = -1;
                            long j10 = -1;
                            long j11 = -1;
                            boolean z3 = false;
                            while (i5 >= 0) {
                                C0068b c0068b = (C0068b) c1692x.get(i5);
                                boolean zEquals = "video/mp4".equals(c0068b.f102a) | z3;
                                if (i5 == 0) {
                                    j7 -= c0068b.f104c;
                                    j3 = 0;
                                } else {
                                    j3 = j7 - c0068b.f103b;
                                }
                                long j12 = j7;
                                j7 = j3;
                                if (zEquals && j7 != j12) {
                                    j11 = j12 - j7;
                                    j10 = j7;
                                    zEquals = false;
                                }
                                if (i5 == 0) {
                                    j9 = j12;
                                    j8 = j7;
                                }
                                i5--;
                                z3 = zEquals;
                            }
                            if (j10 == -1 || j11 == -1 || j8 == -1 || j9 == -1) {
                                c0253a = null;
                            } else {
                                c0253a = new C0253a(j8, j9, c0069cM356a.f106h, j10, j11);
                            }
                        } else {
                            c0253a = null;
                        }
                    }
                    this.f98g = c0253a;
                    if (c0253a != null) {
                        this.f97f = c0253a.f654j;
                    }
                }
            } else {
                ((C2237j) interfaceC2241n).mo335d(this.f96e);
            }
            this.f94c = 0;
        }
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        C2237j c2237j = (C2237j) interfaceC2241n;
        C0651s c0651s = this.f92a;
        c0651s.m1662D(2);
        c2237j.mo338i(c0651s.f2520a, 0, 2, false);
        if (c0651s.m1659A() == 65496) {
            c0651s.m1662D(2);
            c2237j.mo338i(c0651s.f2520a, 0, 2, false);
            int iM1659A = c0651s.m1659A();
            this.f95d = iM1659A;
            if (iM1659A == 65504) {
                c0651s.m1662D(2);
                c2237j.mo338i(c0651s.f2520a, 0, 2, false);
                c2237j.m4831b(c0651s.m1659A() - 2, false);
                c0651s.m1662D(2);
                c2237j.mo338i(c0651s.f2520a, 0, 2, false);
                this.f95d = c0651s.m1659A();
            }
            if (this.f95d == 65505) {
                c2237j.m4831b(2, false);
                c0651s.m1662D(6);
                c2237j.mo338i(c0651s.f2520a, 0, 6, false);
                if (c0651s.m1689w() == 1165519206 && c0651s.m1659A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f93b = interfaceC2242o;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        if (j3 == 0) {
            this.f94c = 0;
            this.f101j = null;
        } else if (this.f94c == 5) {
            C0379p c0379p = this.f101j;
            c0379p.getClass();
            c0379p.mo331j(j3, j4);
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }
}
