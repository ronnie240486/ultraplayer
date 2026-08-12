package p071Y0;

import java.util.Collections;
import java.util.List;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0744g implements InterfaceC0745h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2905a;

    /* JADX INFO: renamed from: b */
    public boolean f2906b;

    /* JADX INFO: renamed from: c */
    public long f2907c;

    /* JADX INFO: renamed from: d */
    public int f2908d;

    /* JADX INFO: renamed from: e */
    public int f2909e;

    /* JADX INFO: renamed from: f */
    public final Object f2910f;

    /* JADX INFO: renamed from: g */
    public Object f2911g;

    public C0744g(List list) {
        this.f2905a = 0;
        this.f2910f = list;
        this.f2911g = new InterfaceC2226E[list.size()];
        this.f2907c = -9223372036854775807L;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        switch (this.f2905a) {
            case 0:
                this.f2906b = false;
                this.f2907c = -9223372036854775807L;
                break;
            default:
                this.f2906b = false;
                this.f2907c = -9223372036854775807L;
                break;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) {
        boolean z3;
        boolean z4;
        switch (this.f2905a) {
            case 0:
                if (this.f2906b) {
                    if (this.f2908d == 2) {
                        if (c0651s.m1667a() == 0) {
                            z4 = false;
                        } else {
                            if (c0651s.m1687u() != 32) {
                                this.f2906b = false;
                            }
                            this.f2908d--;
                            z4 = this.f2906b;
                        }
                        if (!z4) {
                        }
                    }
                    if (this.f2908d == 1) {
                        if (c0651s.m1667a() == 0) {
                            z3 = false;
                        } else {
                            if (c0651s.m1687u() != 0) {
                                this.f2906b = false;
                            }
                            this.f2908d--;
                            z3 = this.f2906b;
                        }
                        if (!z3) {
                        }
                    }
                    int i3 = c0651s.f2521b;
                    int iM1667a = c0651s.m1667a();
                    for (InterfaceC2226E interfaceC2226E : (InterfaceC2226E[]) this.f2911g) {
                        c0651s.m1665G(i3);
                        interfaceC2226E.mo1173b(iM1667a, c0651s);
                    }
                    this.f2909e += iM1667a;
                }
                break;
            default:
                AbstractC0646n.m1631i((InterfaceC2226E) this.f2911g);
                if (this.f2906b) {
                    int iM1667a2 = c0651s.m1667a();
                    int i4 = this.f2909e;
                    if (i4 < 10) {
                        int iMin = Math.min(iM1667a2, 10 - i4);
                        byte[] bArr = c0651s.f2520a;
                        int i5 = c0651s.f2521b;
                        C0651s c0651s2 = (C0651s) this.f2910f;
                        System.arraycopy(bArr, i5, c0651s2.f2520a, this.f2909e, iMin);
                        if (this.f2909e + iMin == 10) {
                            c0651s2.m1665G(0);
                            if (73 == c0651s2.m1687u() && 68 == c0651s2.m1687u() && 51 == c0651s2.m1687u()) {
                                c0651s2.m1666H(3);
                                this.f2908d = c0651s2.m1686t() + 10;
                            } else {
                                AbstractC0646n.m1647y("Id3Reader", "Discarding invalid ID3 tag");
                                this.f2906b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM1667a2, this.f2908d - this.f2909e);
                    ((InterfaceC2226E) this.f2911g).mo1173b(iMin2, c0651s);
                    this.f2909e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
        int i3;
        switch (this.f2905a) {
            case 0:
                if (this.f2906b) {
                    AbstractC0646n.m1630h(this.f2907c != -9223372036854775807L);
                    for (InterfaceC2226E interfaceC2226E : (InterfaceC2226E[]) this.f2911g) {
                        interfaceC2226E.mo1172a(this.f2907c, 1, this.f2909e, 0, null);
                    }
                    this.f2906b = false;
                }
                break;
            default:
                AbstractC0646n.m1631i((InterfaceC2226E) this.f2911g);
                if (this.f2906b && (i3 = this.f2908d) != 0 && this.f2909e == i3) {
                    AbstractC0646n.m1630h(this.f2907c != -9223372036854775807L);
                    ((InterfaceC2226E) this.f2911g).mo1172a(this.f2907c, 1, this.f2908d, 0, null);
                    this.f2906b = false;
                    break;
                }
                break;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        switch (this.f2905a) {
            case 0:
                int i3 = 0;
                while (true) {
                    InterfaceC2226E[] interfaceC2226EArr = (InterfaceC2226E[]) this.f2911g;
                    if (i3 < interfaceC2226EArr.length) {
                        C0735F c0735f = (C0735F) ((List) this.f2910f).get(i3);
                        c0736g.m1848a();
                        c0736g.m1849b();
                        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 3);
                        C0582n c0582n = new C0582n();
                        c0736g.m1849b();
                        c0582n.f2102a = c0736g.f2836e;
                        c0582n.f2114m = AbstractC0545H.m1364l("application/dvbsubs");
                        c0582n.f2117p = Collections.singletonList(c0735f.f2831b);
                        c0582n.f2105d = c0735f.f2830a;
                        interfaceC2226EMo344p.mo1176e(new C0583o(c0582n));
                        interfaceC2226EArr[i3] = interfaceC2226EMo344p;
                        i3++;
                    }
                    break;
                }
                break;
            default:
                c0736g.m1848a();
                c0736g.m1849b();
                InterfaceC2226E interfaceC2226EMo344p2 = interfaceC2242o.mo344p(c0736g.f2835d, 5);
                this.f2911g = interfaceC2226EMo344p2;
                C0582n c0582n2 = new C0582n();
                c0736g.m1849b();
                c0582n2.f2102a = c0736g.f2836e;
                c0582n2.f2114m = AbstractC0545H.m1364l("application/id3");
                interfaceC2226EMo344p2.mo1176e(new C0583o(c0582n2));
                break;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        switch (this.f2905a) {
            case 0:
                if ((i3 & 4) != 0) {
                    this.f2906b = true;
                    this.f2907c = j3;
                    this.f2909e = 0;
                    this.f2908d = 2;
                    break;
                }
                break;
            default:
                if ((i3 & 4) != 0) {
                    this.f2906b = true;
                    this.f2907c = j3;
                    this.f2908d = 0;
                    this.f2909e = 0;
                    break;
                }
                break;
        }
    }

    public C0744g() {
        this.f2905a = 1;
        this.f2910f = new C0651s(10);
        this.f2907c = -9223372036854775807L;
    }
}
