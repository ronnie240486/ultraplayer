package p095f0;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.C1258a2;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p030K0.C0334e;
import p036M0.C0380q;
import p055T.C0546I;
import p064W.AbstractC0632A;
import p064W.RunnableC0647o;
import p070Y.C0725v;
import p070Y.InterfaceC0710g;
import p070Y.InterfaceC0711h;
import p074Z0.C0778e;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p114k0.C1958r;
import p129o0.C2074n;
import p129o0.C2076p;
import p129o0.InterfaceC2069i;
import p129o0.InterfaceC2071k;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1530c implements InterfaceC2069i {

    /* JADX INFO: renamed from: g */
    public final Uri f6890g;

    /* JADX INFO: renamed from: h */
    public final C2074n f6891h = new C2074n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: i */
    public final InterfaceC0711h f6892i;

    /* JADX INFO: renamed from: j */
    public C1537j f6893j;

    /* JADX INFO: renamed from: k */
    public long f6894k;

    /* JADX INFO: renamed from: l */
    public long f6895l;

    /* JADX INFO: renamed from: m */
    public long f6896m;

    /* JADX INFO: renamed from: n */
    public long f6897n;

    /* JADX INFO: renamed from: o */
    public boolean f6898o;

    /* JADX INFO: renamed from: p */
    public IOException f6899p;

    /* JADX INFO: renamed from: q */
    public boolean f6900q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1531d f6901r;

    public C1530c(C1531d c1531d, Uri uri) {
        this.f6901r = c1531d;
        this.f6890g = uri;
        this.f6892i = ((InterfaceC0710g) c1531d.f6903g.f6406h).mo518f();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3825a(C1530c c1530c, long j3) {
        c1530c.f6897n = SystemClock.elapsedRealtime() + j3;
        C1531d c1531d = c1530c.f6901r;
        if (!c1530c.f6890g.equals(c1531d.f6913q)) {
            return false;
        }
        List list = c1531d.f6912p.f6970e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i3 = 0; i3 < size; i3++) {
            C1530c c1530c2 = (C1530c) c1531d.f6906j.get(((C1539l) list.get(i3)).f6962a);
            c1530c2.getClass();
            if (jElapsedRealtime > c1530c2.f6897n) {
                Uri uri = c1530c2.f6890g;
                c1531d.f6913q = uri;
                c1530c2.m3829e(c1531d.m3832b(uri));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Uri m3826b() {
        C1537j c1537j = this.f6893j;
        Uri uri = this.f6890g;
        if (c1537j != null) {
            C1536i c1536i = c1537j.f6958v;
            if (c1536i.f6935a != -9223372036854775807L || c1536i.f6939e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C1537j c1537j2 = this.f6893j;
                if (c1537j2.f6958v.f6939e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1537j2.f6947k + ((long) c1537j2.f6954r.size())));
                    C1537j c1537j3 = this.f6893j;
                    if (c1537j3.f6950n != -9223372036854775807L) {
                        AbstractC1676G abstractC1676G = c1537j3.f6955s;
                        int size = abstractC1676G.size();
                        if (!abstractC1676G.isEmpty() && ((C1532e) AbstractC1723q.m4158g(abstractC1676G)).f6918s) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C1536i c1536i2 = this.f6893j.f6958v;
                if (c1536i2.f6935a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c1536i2.f6936b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* JADX INFO: renamed from: c */
    public final void m3827c(boolean z3) {
        m3829e(z3 ? m3826b() : this.f6890g);
    }

    /* JADX INFO: renamed from: d */
    public final void m3828d(Uri uri) {
        C1531d c1531d = this.f6901r;
        C2076p c2076p = new C2076p(this.f6892i, uri, c1531d.f6904h.mo3375i(c1531d.f6912p, this.f6893j));
        C1528a c1528a = c1531d.f6905i;
        int i3 = c2076p.f9014c;
        this.f6891h.m4639d(c2076p, this, c1528a.m3824B(i3));
        c1531d.f6908l.m1050l(new C1958r(c2076p.f9013b), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX INFO: renamed from: e */
    public final void m3829e(Uri uri) {
        this.f6897n = 0L;
        if (this.f6898o) {
            return;
        }
        C2074n c2074n = this.f6891h;
        if (c2074n.m4637b() || c2074n.f9011c != null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f6896m;
        if (jElapsedRealtime >= j3) {
            m3828d(uri);
        } else {
            this.f6898o = true;
            this.f6901r.f6910n.postDelayed(new RunnableC0647o(this, 10, uri), j3 - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023c  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x01af A[LOOP:0: B:72:0x01a9->B:74:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0205 A[LOOP:1: B:87:0x01ff->B:89:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0217  */
    /* JADX WARN: Code duplicated, block: B:95:0x021c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0220  */
    /* JADX WARN: Code duplicated, block: B:99:0x0234  */
    /* JADX INFO: renamed from: f */
    public final void m3830f(C1537j c1537j, C1958r c1958r) {
        long j3;
        long j4;
        boolean z3;
        AbstractC1676G abstractC1676G;
        C1537j c1537j2;
        int i3;
        int i4;
        AbstractC1676G abstractC1676G2;
        C1534g c1534g;
        int i5;
        C1537j c1537j3;
        CopyOnWriteArrayList copyOnWriteArrayList;
        Uri uri;
        boolean z4;
        long size;
        C1537j c1537j4;
        C1258a2 c1258a2;
        boolean z5;
        C0334e c0334e;
        Iterator it;
        C1537j c1537j5;
        long j5;
        Iterator it2;
        int size2;
        int size3;
        int size4;
        C1537j c1537j6 = this.f6893j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f6894k = jElapsedRealtime;
        C1531d c1531d = this.f6901r;
        c1531d.getClass();
        if (c1537j6 != null) {
            long j6 = c1537j.f6947k;
            long j7 = c1537j6.f6947k;
            if (j6 <= j7) {
                boolean z6 = c1537j6.f6951o;
                AbstractC1676G abstractC1676G3 = c1537j6.f6955s;
                AbstractC1676G abstractC1676G4 = c1537j6.f6954r;
                boolean z7 = c1537j.f6951o;
                if (j6 < j7 || ((size2 = c1537j.f6954r.size() - abstractC1676G4.size()) == 0 ? !((size3 = c1537j.f6955s.size()) > (size4 = abstractC1676G3.size()) || (size3 == size4 && z7 && !z6)) : size2 <= 0)) {
                    c1537j3 = (!z7 || z6) ? c1537j6 : new C1537j(c1537j6.f6940d, c1537j6.f6977a, c1537j6.f6978b, c1537j6.f6941e, c1537j6.f6943g, c1537j6.f6944h, c1537j6.f6945i, c1537j6.f6946j, c1537j6.f6947k, c1537j6.f6948l, c1537j6.f6949m, c1537j6.f6950n, c1537j6.f6979c, true, c1537j6.f6952p, c1537j6.f6953q, abstractC1676G4, abstractC1676G3, c1537j6.f6958v, c1537j6.f6956t);
                }
            }
            this.f6893j = c1537j3;
            copyOnWriteArrayList = c1531d.f6907k;
            uri = this.f6890g;
            z4 = c1537j3.f6951o;
            if (c1537j3 != c1537j6) {
                this.f6899p = null;
                this.f6895l = jElapsedRealtime;
                if (uri.equals(c1531d.f6913q)) {
                    if (c1531d.f6914r == null) {
                        c1531d.f6915s = !z4;
                        c1531d.f6916t = c1537j3.f6944h;
                    }
                    c1531d.f6914r = c1537j3;
                    c1531d.f6911o.m3783t(c1537j3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1545r) it2.next()).mo3760b();
                }
            } else if (!z4) {
                size = c1537j.f6947k + ((long) c1537j.f6954r.size());
                c1537j4 = this.f6893j;
                if (size < c1537j4.f6947k) {
                    c1258a2 = new C1258a2();
                    z5 = true;
                } else {
                    if (jElapsedRealtime - this.f6895l > AbstractC0632A.m1581V(c1537j4.f6949m) * 3.5d) {
                        c1258a2 = new C1258a2();
                    } else {
                        c1258a2 = null;
                    }
                    z5 = false;
                }
                if (c1258a2 != null) {
                    this.f6899p = c1258a2;
                    c0334e = new C0334e(c1258a2, 1);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1545r) it.next()).mo3763e(uri, c0334e, z5);
                    }
                }
            }
            c1537j5 = this.f6893j;
            if (c1537j5.f6958v.f6939e) {
                j5 = 0;
            } else {
                j5 = c1537j5.f6949m;
                if (c1537j5 == c1537j6) {
                    j5 /= 2;
                }
            }
            this.f6896m = (AbstractC0632A.m1581V(j5) + jElapsedRealtime) - c1958r.f8564a;
            if (this.f6893j.f6951o) {
            }
            if (!uri.equals(c1531d.f6913q) || this.f6900q) {
                m3829e(m3826b());
            }
            return;
        }
        c1537j.getClass();
        boolean z8 = c1537j.f6952p;
        long j8 = c1537j.f6947k;
        if (!z8) {
            C1537j c1537j7 = c1531d.f6914r;
            j3 = c1537j7 != null ? c1537j7.f6944h : 0L;
            if (c1537j6 != null) {
                AbstractC1676G abstractC1676G5 = c1537j6.f6954r;
                int size5 = abstractC1676G5.size();
                long j9 = c1537j6.f6947k;
                int i6 = (int) (j8 - j9);
                C1534g c1534g2 = i6 < abstractC1676G5.size() ? (C1534g) abstractC1676G5.get(i6) : null;
                long j10 = c1537j6.f6944h;
                if (c1534g2 != null) {
                    j3 = c1534g2.f6928k + j10;
                } else {
                    j4 = j8;
                    if (size5 == j4 - j9) {
                        j3 = j10 + c1537j6.f6957u;
                    }
                }
            }
            long j11 = j3;
            z3 = c1537j.f6945i;
            abstractC1676G = c1537j.f6954r;
            if (z3) {
                i5 = c1537j.f6946j;
            } else {
                c1537j2 = c1531d.f6914r;
                if (c1537j2 != null) {
                    i3 = c1537j2.f6946j;
                } else {
                    i3 = 0;
                }
                if (c1537j6 == null) {
                    i4 = (int) (j4 - c1537j6.f6947k);
                    abstractC1676G2 = c1537j6.f6954r;
                    if (i4 < abstractC1676G2.size()) {
                        c1534g = (C1534g) abstractC1676G2.get(i4);
                    } else {
                        c1534g = null;
                    }
                    if (c1534g != null) {
                        i3 = (c1537j6.f6946j + c1534g.f6927j) - ((C1534g) abstractC1676G.get(0)).f6927j;
                    }
                }
                i5 = i3;
            }
            c1537j3 = new C1537j(c1537j.f6940d, c1537j.f6977a, c1537j.f6978b, c1537j.f6941e, c1537j.f6943g, j11, true, i5, c1537j.f6947k, c1537j.f6948l, c1537j.f6949m, c1537j.f6950n, c1537j.f6979c, c1537j.f6951o, c1537j.f6952p, c1537j.f6953q, abstractC1676G, c1537j.f6955s, c1537j.f6958v, c1537j.f6956t);
            this.f6893j = c1537j3;
            copyOnWriteArrayList = c1531d.f6907k;
            uri = this.f6890g;
            z4 = c1537j3.f6951o;
            if (c1537j3 != c1537j6) {
                this.f6899p = null;
                this.f6895l = jElapsedRealtime;
                if (uri.equals(c1531d.f6913q)) {
                    if (c1531d.f6914r == null) {
                        c1531d.f6915s = !z4;
                        c1531d.f6916t = c1537j3.f6944h;
                    }
                    c1531d.f6914r = c1537j3;
                    c1531d.f6911o.m3783t(c1537j3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1545r) it2.next()).mo3760b();
                }
            } else if (!z4) {
                size = c1537j.f6947k + ((long) c1537j.f6954r.size());
                c1537j4 = this.f6893j;
                if (size < c1537j4.f6947k) {
                    c1258a2 = new C1258a2();
                    z5 = true;
                } else {
                    if (jElapsedRealtime - this.f6895l > AbstractC0632A.m1581V(c1537j4.f6949m) * 3.5d) {
                        c1258a2 = new C1258a2();
                    } else {
                        c1258a2 = null;
                    }
                    z5 = false;
                }
                if (c1258a2 != null) {
                    this.f6899p = c1258a2;
                    c0334e = new C0334e(c1258a2, 1);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1545r) it.next()).mo3763e(uri, c0334e, z5);
                    }
                }
            }
            c1537j5 = this.f6893j;
            if (c1537j5.f6958v.f6939e) {
                j5 = c1537j5.f6949m;
                if (c1537j5 == c1537j6) {
                    j5 /= 2;
                }
            } else {
                j5 = 0;
            }
            this.f6896m = (AbstractC0632A.m1581V(j5) + jElapsedRealtime) - c1958r.f8564a;
            if (this.f6893j.f6951o) {
                if (uri.equals(c1531d.f6913q)) {
                }
                m3829e(m3826b());
            }
        }
        j3 = c1537j.f6944h;
        j4 = j8;
        long j12 = j3;
        z3 = c1537j.f6945i;
        abstractC1676G = c1537j.f6954r;
        if (z3) {
            i5 = c1537j.f6946j;
        } else {
            c1537j2 = c1531d.f6914r;
            if (c1537j2 != null) {
                i3 = c1537j2.f6946j;
            } else {
                i3 = 0;
            }
            if (c1537j6 == null) {
                i4 = (int) (j4 - c1537j6.f6947k);
                abstractC1676G2 = c1537j6.f6954r;
                if (i4 < abstractC1676G2.size()) {
                    c1534g = (C1534g) abstractC1676G2.get(i4);
                } else {
                    c1534g = null;
                }
                if (c1534g != null) {
                    i3 = (c1537j6.f6946j + c1534g.f6927j) - ((C1534g) abstractC1676G.get(0)).f6927j;
                }
            }
            i5 = i3;
        }
        c1537j3 = new C1537j(c1537j.f6940d, c1537j.f6977a, c1537j.f6978b, c1537j.f6941e, c1537j.f6943g, j12, true, i5, c1537j.f6947k, c1537j.f6948l, c1537j.f6949m, c1537j.f6950n, c1537j.f6979c, c1537j.f6951o, c1537j.f6952p, c1537j.f6953q, abstractC1676G, c1537j.f6955s, c1537j.f6958v, c1537j.f6956t);
        this.f6893j = c1537j3;
        copyOnWriteArrayList = c1531d.f6907k;
        uri = this.f6890g;
        z4 = c1537j3.f6951o;
        if (c1537j3 != c1537j6) {
            this.f6899p = null;
            this.f6895l = jElapsedRealtime;
            if (uri.equals(c1531d.f6913q)) {
                if (c1531d.f6914r == null) {
                    c1531d.f6915s = !z4;
                    c1531d.f6916t = c1537j3.f6944h;
                }
                c1531d.f6914r = c1537j3;
                c1531d.f6911o.m3783t(c1537j3);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1545r) it2.next()).mo3760b();
            }
        } else if (!z4) {
            size = c1537j.f6947k + ((long) c1537j.f6954r.size());
            c1537j4 = this.f6893j;
            if (size < c1537j4.f6947k) {
                c1258a2 = new C1258a2();
                z5 = true;
            } else {
                if (jElapsedRealtime - this.f6895l > AbstractC0632A.m1581V(c1537j4.f6949m) * 3.5d) {
                    c1258a2 = new C1258a2();
                } else {
                    c1258a2 = null;
                }
                z5 = false;
            }
            if (c1258a2 != null) {
                this.f6899p = c1258a2;
                c0334e = new C0334e(c1258a2, 1);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1545r) it.next()).mo3763e(uri, c0334e, z5);
                }
            }
        }
        c1537j5 = this.f6893j;
        if (c1537j5.f6958v.f6939e) {
            j5 = c1537j5.f6949m;
            if (c1537j5 == c1537j6) {
                j5 /= 2;
            }
        } else {
            j5 = 0;
        }
        this.f6896m = (AbstractC0632A.m1581V(j5) + jElapsedRealtime) - c1958r.f8564a;
        if (this.f6893j.f6951o) {
            if (uri.equals(c1531d.f6913q)) {
            }
            m3829e(m3826b());
        }
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: k */
    public final C0778e mo3803k(InterfaceC2071k interfaceC2071k, long j3, long j4, IOException iOException, int i3) {
        C2076p c2076p = (C2076p) interfaceC2071k;
        long j5 = c2076p.f9012a;
        Uri uri = c2076p.f9015d.f2785i;
        C1958r c1958r = new C1958r(j4);
        boolean z3 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z4 = iOException instanceof C1542o;
        C0778e c0778e = C2074n.f9007e;
        C1531d c1531d = this.f6901r;
        int i4 = c2076p.f9014c;
        if (z3 || z4) {
            int i5 = iOException instanceof C0725v ? ((C0725v) iOException).f2773j : Integer.MAX_VALUE;
            if (z4 || i5 == 400 || i5 == 503) {
                this.f6896m = SystemClock.elapsedRealtime();
                m3827c(false);
                C0380q c0380q = c1531d.f6908l;
                int i6 = AbstractC0632A.f2454a;
                c0380q.m1049k(c1958r, i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c0778e;
            }
        }
        C0334e c0334e = new C0334e(iOException, i3);
        Iterator it = c1531d.f6907k.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= !((InterfaceC1545r) it.next()).mo3763e(this.f6890g, c0334e, false);
        }
        C1528a c1528a = c1531d.f6905i;
        if (z5) {
            c1528a.getClass();
            long jM3818C = C1528a.m3818C(c0334e);
            c0778e = jM3818C != -9223372036854775807L ? new C0778e(0, jM3818C, false) : C2074n.f9008f;
        }
        int i7 = c0778e.f3181a;
        boolean z6 = i7 == 0 || i7 == 1;
        c1531d.f6908l.m1049k(c1958r, i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z6);
        if (!z6) {
            c1528a.getClass();
        }
        return c0778e;
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: m */
    public final void mo3804m(InterfaceC2071k interfaceC2071k, long j3, long j4, boolean z3) {
        C2076p c2076p = (C2076p) interfaceC2071k;
        long j5 = c2076p.f9012a;
        Uri uri = c2076p.f9015d.f2785i;
        C1958r c1958r = new C1958r(j4);
        C1531d c1531d = this.f6901r;
        c1531d.f6905i.getClass();
        c1531d.f6908l.m1047h(c1958r, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: t */
    public final void mo3805t(InterfaceC2071k interfaceC2071k, long j3, long j4) {
        C2076p c2076p = (C2076p) interfaceC2071k;
        AbstractC1541n abstractC1541n = (AbstractC1541n) c2076p.f9017f;
        Uri uri = c2076p.f9015d.f2785i;
        C1958r c1958r = new C1958r(j4);
        if (abstractC1541n instanceof C1537j) {
            m3830f((C1537j) abstractC1541n, c1958r);
            this.f6901r.f6908l.m1048i(c1958r, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            C0546I c0546iM1366b = C0546I.m1366b("Loaded playlist has unexpected type.");
            this.f6899p = c0546iM1366b;
            this.f6901r.f6908l.m1049k(c1958r, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, c0546iM1366b, true);
        }
        this.f6901r.f6905i.getClass();
    }
}
