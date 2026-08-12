package p092e0;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p034L1.C0352g;
import p036M0.C0380q;
import p055T.AbstractC0540C;
import p055T.C0539B;
import p055T.C0591w;
import p055T.C0592x;
import p055T.C0593y;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p070Y.InterfaceC0701A;
import p070Y.InterfaceC0710g;
import p082b0.C1071l;
import p088d0.C1387k;
import p088d0.InterfaceC1384h;
import p088d0.InterfaceC1390n;
import p089d1.C1447t;
import p095f0.C1528a;
import p095f0.C1530c;
import p095f0.C1531d;
import p095f0.C1532e;
import p095f0.C1534g;
import p095f0.C1536i;
import p095f0.C1537j;
import p105h2.AbstractC1676G;
import p114k0.AbstractC1932a;
import p114k0.C1907A;
import p114k0.C1939d0;
import p114k0.C1958r;
import p114k0.InterfaceC1965y;
import p129o0.C2065e;
import p129o0.C2074n;
import p129o0.C2076p;
import p129o0.HandlerC2070j;

/* JADX INFO: renamed from: e0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1507l extends AbstractC1932a {

    /* JADX INFO: renamed from: h */
    public final C1498c f6740h;

    /* JADX INFO: renamed from: i */
    public final C1447t f6741i;

    /* JADX INFO: renamed from: j */
    public final C1528a f6742j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1390n f6743k;

    /* JADX INFO: renamed from: l */
    public final C1528a f6744l;

    /* JADX INFO: renamed from: m */
    public final boolean f6745m;

    /* JADX INFO: renamed from: n */
    public final int f6746n;

    /* JADX INFO: renamed from: o */
    public final C1531d f6747o;

    /* JADX INFO: renamed from: p */
    public final long f6748p;

    /* JADX INFO: renamed from: q */
    public C0592x f6749q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0701A f6750r;

    /* JADX INFO: renamed from: s */
    public C0539B f6751s;

    static {
        AbstractC0540C.m1348a("media3.exoplayer.hls");
    }

    public C1507l(C0539B c0539b, C1447t c1447t, C1498c c1498c, C1528a c1528a, InterfaceC1390n interfaceC1390n, C1528a c1528a2, C1531d c1531d, long j3, boolean z3, int i3) {
        this.f6751s = c0539b;
        this.f6749q = c0539b.f1876c;
        this.f6741i = c1447t;
        this.f6740h = c1498c;
        this.f6742j = c1528a;
        this.f6743k = interfaceC1390n;
        this.f6744l = c1528a2;
        this.f6747o = c1531d;
        this.f6748p = j3;
        this.f6745m = z3;
        this.f6746n = i3;
    }

    /* JADX INFO: renamed from: s */
    public static C1532e m3775s(AbstractC1676G abstractC1676G, long j3) {
        C1532e c1532e = null;
        for (int i3 = 0; i3 < abstractC1676G.size(); i3++) {
            C1532e c1532e2 = (C1532e) abstractC1676G.get(i3);
            long j4 = c1532e2.f6928k;
            if (j4 > j3 || !c1532e2.f6917r) {
                if (j4 > j3) {
                    break;
                }
            } else {
                c1532e = c1532e2;
            }
        }
        return c1532e;
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: a */
    public final InterfaceC1965y mo3776a(C1907A c1907a, C2065e c2065e, long j3) {
        C0380q c0380q = new C0380q((CopyOnWriteArrayList) this.f8477c.f1293j, 0, c1907a);
        C1387k c1387k = new C1387k(this.f8478d.f6184c, 0, c1907a);
        InterfaceC0701A interfaceC0701A = this.f6750r;
        C1071l c1071l = this.f8481g;
        AbstractC0646n.m1631i(c1071l);
        return new C1506k(this.f6740h, this.f6747o, this.f6741i, interfaceC0701A, this.f6743k, c1387k, this.f6744l, c0380q, c2065e, this.f6742j, this.f6745m, this.f6746n, c1071l);
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: g */
    public final synchronized C0539B mo3777g() {
        return this.f6751s;
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: i */
    public final void mo3778i() throws IOException {
        IOException iOException;
        IOException iOException2;
        C1531d c1531d = this.f6747o;
        C2074n c2074n = c1531d.f6909m;
        if (c2074n != null) {
            IOException iOException3 = c2074n.f9011c;
            if (iOException3 != null) {
                throw iOException3;
            }
            HandlerC2070j handlerC2070j = c2074n.f9010b;
            if (handlerC2070j != null && (iOException2 = handlerC2070j.f9000k) != null && handlerC2070j.f9001l > handlerC2070j.f8996g) {
                throw iOException2;
            }
        }
        Uri uri = c1531d.f6913q;
        if (uri != null) {
            C1530c c1530c = (C1530c) c1531d.f6906j.get(uri);
            C2074n c2074n2 = c1530c.f6891h;
            IOException iOException4 = c2074n2.f9011c;
            if (iOException4 != null) {
                throw iOException4;
            }
            HandlerC2070j handlerC2070j2 = c2074n2.f9010b;
            if (handlerC2070j2 != null && (iOException = handlerC2070j2.f9000k) != null && handlerC2070j2.f9001l > handlerC2070j2.f8996g) {
                throw iOException;
            }
            IOException iOException5 = c1530c.f6899p;
            if (iOException5 != null) {
                throw iOException5;
            }
        }
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: k */
    public final void mo3779k(InterfaceC0701A interfaceC0701A) {
        this.f6750r = interfaceC0701A;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C1071l c1071l = this.f8481g;
        AbstractC0646n.m1631i(c1071l);
        InterfaceC1390n interfaceC1390n = this.f6743k;
        interfaceC1390n.mo992u(looperMyLooper, c1071l);
        interfaceC1390n.mo973b();
        C0380q c0380q = new C0380q((CopyOnWriteArrayList) this.f8477c.f1293j, 0, (C1907A) null);
        C0593y c0593y = mo3777g().f1875b;
        c0593y.getClass();
        C1531d c1531d = this.f6747o;
        c1531d.getClass();
        c1531d.f6910n = AbstractC0632A.m1594m(null);
        c1531d.f6908l = c0380q;
        c1531d.f6911o = this;
        C2076p c2076p = new C2076p(((InterfaceC0710g) c1531d.f6903g.f6406h).mo518f(), c0593y.f2199a, c1531d.f6904h.mo3384r());
        AbstractC0646n.m1630h(c1531d.f6909m == null);
        C2074n c2074n = new C2074n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c1531d.f6909m = c2074n;
        C1528a c1528a = c1531d.f6905i;
        int i3 = c2076p.f9014c;
        c2074n.m4639d(c2076p, c1531d, c1528a.m3824B(i3));
        c0380q.m1050l(new C1958r(c2076p.f9013b), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: m */
    public final void mo3780m(InterfaceC1965y interfaceC1965y) {
        C1506k c1506k = (C1506k) interfaceC1965y;
        c1506k.f6721h.f6907k.remove(c1506k);
        for (C1512q c1512q : c1506k.f6739z) {
            if (c1512q.f6776J) {
                for (C1511p c1511p : c1512q.f6768B) {
                    c1511p.m4468j();
                    InterfaceC1384h interfaceC1384h = c1511p.f8456h;
                    if (interfaceC1384h != null) {
                        interfaceC1384h.mo3463d(c1511p.f8453e);
                        c1511p.f8456h = null;
                        c1511p.f8455g = null;
                    }
                }
            }
            C1504i c1504i = c1512q.f6800j;
            C1530c c1530c = (C1530c) c1504i.f6676g.f6906j.get(c1504i.f6674e[c1504i.f6686q.mo4423a()]);
            if (c1530c != null) {
                c1530c.f6900q = false;
            }
            c1504i.f6683n = null;
            c1512q.f6806p.m4638c(c1512q);
            c1512q.f6814x.removeCallbacksAndMessages(null);
            c1512q.f6780N = true;
            c1512q.f6815y.clear();
        }
        c1506k.f6736w = null;
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: o */
    public final void mo3781o() {
        C1531d c1531d = this.f6747o;
        c1531d.f6913q = null;
        c1531d.f6914r = null;
        c1531d.f6912p = null;
        c1531d.f6916t = -9223372036854775807L;
        c1531d.f6909m.m4638c(null);
        c1531d.f6909m = null;
        HashMap map = c1531d.f6906j;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C1530c) it.next()).f6891h.m4638c(null);
        }
        c1531d.f6910n.removeCallbacksAndMessages(null);
        c1531d.f6910n = null;
        map.clear();
        this.f6743k.mo972a();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: r */
    public final synchronized void mo3782r(C0539B c0539b) {
        this.f6751s = c0539b;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x0150  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX INFO: renamed from: t */
    public final void m3783t(C1537j c1537j) {
        long j3;
        C1939d0 c1939d0;
        long jM1571L;
        long j4;
        long jM1571L2;
        boolean z3;
        boolean z4;
        float f;
        C0592x c0592x;
        long jM1571L3;
        C1532e c1532eM3775s;
        C1534g c1534g;
        C1532e c1532eM3775s2;
        long j5;
        boolean z5;
        boolean z6 = c1537j.f6952p;
        long j6 = c1537j.f6944h;
        long jM1581V = z6 ? AbstractC0632A.m1581V(j6) : -9223372036854775807L;
        int i3 = c1537j.f6940d;
        long j7 = (i3 == 2 || i3 == 1) ? jM1581V : -9223372036854775807L;
        C1531d c1531d = this.f6747o;
        c1531d.f6912p.getClass();
        C0352g c0352g = new C0352g(29);
        boolean z7 = c1531d.f6915s;
        long j8 = c1537j.f6957u;
        long j9 = 0;
        AbstractC1676G abstractC1676G = c1537j.f6954r;
        boolean z8 = c1537j.f6943g;
        long j10 = c1537j.f6941e;
        if (z7) {
            long j11 = j6 - c1531d.f6916t;
            boolean z9 = c1537j.f6951o;
            long j12 = z9 ? j11 + j8 : -9223372036854775807L;
            if (c1537j.f6952p) {
                int i4 = AbstractC0632A.f2454a;
                long j13 = this.f6748p;
                jM1571L = AbstractC0632A.m1571L(j13 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j13) - (j6 + j8);
            } else {
                jM1571L = 0;
            }
            long j14 = this.f6749q.f2194a;
            C1536i c1536i = c1537j.f6958v;
            if (j14 != -9223372036854775807L) {
                jM1571L2 = AbstractC0632A.m1571L(j14);
            } else {
                if (j10 != -9223372036854775807L) {
                    j4 = j8 - j10;
                } else {
                    long j15 = c1536i.f6938d;
                    if (j15 == -9223372036854775807L || c1537j.f6950n == -9223372036854775807L) {
                        j4 = c1536i.f6937c;
                        if (j4 == -9223372036854775807L) {
                            j4 = c1537j.f6949m * 3;
                        }
                    } else {
                        j4 = j15;
                    }
                }
                jM1571L2 = j4 + jM1571L;
            }
            long j16 = j8 + jM1571L;
            long jM1591j = AbstractC0632A.m1591j(jM1571L2, jM1571L, j16);
            C0592x c0592x2 = mo3777g().f1876c;
            if (c0592x2.f2197d == -3.4028235E38f && c0592x2.f2198e == -3.4028235E38f) {
                if (c1536i.f6937c == -9223372036854775807L && c1536i.f6938d == -9223372036854775807L) {
                    z3 = z8;
                    z4 = true;
                }
                C0591w c0591w = new C0591w();
                c0591w.f2189a = AbstractC0632A.m1581V(jM1591j);
                if (z4) {
                    f = 1.0f;
                } else {
                    f = this.f6749q.f2197d;
                }
                c0591w.f2192d = f;
                c0591w.f2193e = z4 ? 1.0f : this.f6749q.f2198e;
                c0592x = new C0592x(c0591w);
                this.f6749q = c0592x;
                if (j10 != -9223372036854775807L) {
                    jM1571L3 = j10;
                } else {
                    jM1571L3 = j16 - AbstractC0632A.m1571L(c0592x.f2194a);
                }
                if (z3) {
                    j9 = jM1571L3;
                } else {
                    c1532eM3775s = m3775s(c1537j.f6955s, jM1571L3);
                    if (c1532eM3775s != null) {
                        j5 = c1532eM3775s.f6928k;
                    } else if (!abstractC1676G.isEmpty()) {
                        c1534g = (C1534g) abstractC1676G.get(AbstractC0632A.m1584c(abstractC1676G, Long.valueOf(jM1571L3), true));
                        c1532eM3775s2 = m3775s(c1534g.f6923s, jM1571L3);
                        if (c1532eM3775s2 != null) {
                            j5 = c1532eM3775s2.f6928k;
                        } else {
                            j5 = c1534g.f6928k;
                        }
                    }
                    j9 = j5;
                }
                if (i3 == 2 || !c1537j.f6942f) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                c1939d0 = new C1939d0(j7, jM1581V, j12, c1537j.f6957u, j11, j9, true, !z9, z5, c0352g, mo3777g(), this.f6749q);
            } else {
                z3 = z8;
            }
            z3 = z8;
            z3 = z8;
            z4 = false;
            C0591w c0591w2 = new C0591w();
            c0591w2.f2189a = AbstractC0632A.m1581V(jM1591j);
            if (z4) {
                f = 1.0f;
            } else {
                f = this.f6749q.f2197d;
            }
            c0591w2.f2192d = f;
            c0591w2.f2193e = z4 ? 1.0f : this.f6749q.f2198e;
            c0592x = new C0592x(c0591w2);
            this.f6749q = c0592x;
            if (j10 != -9223372036854775807L) {
                jM1571L3 = j10;
            } else {
                jM1571L3 = j16 - AbstractC0632A.m1571L(c0592x.f2194a);
            }
            if (z3) {
                j9 = jM1571L3;
            } else {
                c1532eM3775s = m3775s(c1537j.f6955s, jM1571L3);
                if (c1532eM3775s != null) {
                    j5 = c1532eM3775s.f6928k;
                } else if (!abstractC1676G.isEmpty()) {
                    c1534g = (C1534g) abstractC1676G.get(AbstractC0632A.m1584c(abstractC1676G, Long.valueOf(jM1571L3), true));
                    c1532eM3775s2 = m3775s(c1534g.f6923s, jM1571L3);
                    if (c1532eM3775s2 != null) {
                        j5 = c1532eM3775s2.f6928k;
                    } else {
                        j5 = c1534g.f6928k;
                    }
                }
                j9 = j5;
            }
            if (i3 == 2) {
                z5 = false;
            } else {
                z5 = false;
            }
            c1939d0 = new C1939d0(j7, jM1581V, j12, c1537j.f6957u, j11, j9, true, !z9, z5, c0352g, mo3777g(), this.f6749q);
        } else {
            if (j10 == -9223372036854775807L || abstractC1676G.isEmpty()) {
                j3 = 0;
            } else {
                j3 = (z8 || j10 == j8) ? j10 : ((C1534g) abstractC1676G.get(AbstractC0632A.m1584c(abstractC1676G, Long.valueOf(j10), true))).f6928k;
            }
            C0539B c0539bMo3777g = mo3777g();
            long j17 = c1537j.f6957u;
            c1939d0 = new C1939d0(j7, jM1581V, j17, j17, 0L, j3, true, false, true, c0352g, c0539bMo3777g, null);
        }
        m4491l(c1939d0);
    }
}
