package p088d0;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.HandlerC0881q;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p034L1.C0352g;
import p055T.AbstractC0545H;
import p055T.AbstractC0571e;
import p055T.C0578j;
import p055T.C0579k;
import p055T.C0583o;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.RunnableC0647o;
import p082b0.C1063d;
import p082b0.C1071l;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1679J;
import p105h2.AbstractC1718l0;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: d0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1382f implements InterfaceC1390n {

    /* JADX INFO: renamed from: c */
    public final UUID f6154c;

    /* JADX INFO: renamed from: d */
    public final C1063d f6155d;

    /* JADX INFO: renamed from: e */
    public final C0858A f6156e;

    /* JADX INFO: renamed from: f */
    public final HashMap f6157f;

    /* JADX INFO: renamed from: g */
    public final int[] f6158g;

    /* JADX INFO: renamed from: h */
    public final boolean f6159h;

    /* JADX INFO: renamed from: i */
    public final C1323r f6160i;

    /* JADX INFO: renamed from: j */
    public final C1528a f6161j;

    /* JADX INFO: renamed from: k */
    public final C1379c f6162k;

    /* JADX INFO: renamed from: l */
    public final long f6163l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f6164m;

    /* JADX INFO: renamed from: n */
    public final Set f6165n;

    /* JADX INFO: renamed from: o */
    public final Set f6166o;

    /* JADX INFO: renamed from: p */
    public int f6167p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1394r f6168q;

    /* JADX INFO: renamed from: r */
    public C1378b f6169r;

    /* JADX INFO: renamed from: s */
    public C1378b f6170s;

    /* JADX INFO: renamed from: t */
    public Looper f6171t;

    /* JADX INFO: renamed from: u */
    public Handler f6172u;

    /* JADX INFO: renamed from: v */
    public byte[] f6173v;

    /* JADX INFO: renamed from: w */
    public C1071l f6174w;

    /* JADX INFO: renamed from: x */
    public volatile HandlerC0881q f6175x;

    public C1382f(UUID uuid, C0858A c0858a, HashMap map, int[] iArr, boolean z3, C1528a c1528a) {
        C1063d c1063d = C1397u.f6197f;
        uuid.getClass();
        AbstractC0646n.m1624b("Use C.CLEARKEY_UUID instead", !AbstractC0571e.f2058b.equals(uuid));
        this.f6154c = uuid;
        this.f6155d = c1063d;
        this.f6156e = c0858a;
        this.f6157f = map;
        this.f6158g = iArr;
        this.f6159h = z3;
        this.f6161j = c1528a;
        this.f6160i = new C1323r(1, (byte) 0);
        this.f6162k = new C1379c(this);
        this.f6164m = new ArrayList();
        this.f6165n = Collections.newSetFromMap(new IdentityHashMap());
        this.f6166o = Collections.newSetFromMap(new IdentityHashMap());
        this.f6163l = 300000L;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3476d(C1378b c1378b) {
        c1378b.m3475p();
        if (c1378b.f6139o != 1) {
            return false;
        }
        C1383g c1383gMo3466g = c1378b.mo3466g();
        c1383gMo3466g.getClass();
        Throwable cause = c1383gMo3466g.getCause();
        return (cause instanceof ResourceBusyException) || AbstractC0610a.m1517t(cause);
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m3477g(C0579k c0579k, UUID uuid, boolean z3) {
        ArrayList arrayList = new ArrayList(c0579k.f2089j);
        for (int i3 = 0; i3 < c0579k.f2089j; i3++) {
            C0578j c0578j = c0579k.f2086g[i3];
            if ((c0578j.m1443d(uuid) || (AbstractC0571e.f2059c.equals(uuid) && c0578j.m1443d(AbstractC0571e.f2058b))) && (c0578j.f2085k != null || z3)) {
                arrayList.add(c0578j);
            }
        }
        return arrayList;
    }

    @Override // p088d0.InterfaceC1390n, p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: a */
    public final void mo972a() {
        m3482j(true);
        int i3 = this.f6167p - 1;
        this.f6167p = i3;
        if (i3 != 0) {
            return;
        }
        if (this.f6163l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f6164m);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((C1378b) arrayList.get(i4)).mo3463d(null);
            }
        }
        AbstractC1718l0 it = AbstractC1679J.m4128n(this.f6165n).iterator();
        while (it.hasNext()) {
            ((C1381e) it.next()).mo2829a();
        }
        m3481i();
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: b */
    public final void mo973b() {
        InterfaceC1394r c0352g;
        m3482j(true);
        int i3 = this.f6167p;
        this.f6167p = i3 + 1;
        if (i3 != 0) {
            return;
        }
        if (this.f6168q == null) {
            UUID uuid = this.f6154c;
            this.f6155d.getClass();
            try {
                try {
                    c0352g = new C1397u(uuid);
                } catch (C1400x unused) {
                    AbstractC0646n.m1635m("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    c0352g = new C0352g(28);
                }
                this.f6168q = c0352g;
                c0352g.mo980i(new C1379c(this));
                return;
            } catch (UnsupportedSchemeException e3) {
                throw new C1400x(e3);
            } catch (Exception e4) {
                throw new C1400x(e4);
            }
        }
        if (this.f6163l == -9223372036854775807L) {
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f6164m;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((C1378b) arrayList.get(i4)).mo3462c(null);
            i4++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1384h m3478c(Looper looper, C1387k c1387k, C0583o c0583o, boolean z3) {
        if (this.f6175x == null) {
            this.f6175x = new HandlerC0881q(this, looper, 5);
        }
        C0579k c0579k = c0583o.f2158r;
        int i3 = 0;
        ArrayList arrayListM3477g = null;
        if (c0579k != null) {
            if (this.f6173v == null) {
                arrayListM3477g = m3477g(c0579k, this.f6154c, false);
                if (arrayListM3477g.isEmpty()) {
                    C1380d c1380d = new C1380d("Media does not support uuid: " + this.f6154c);
                    AbstractC0646n.m1636n("DefaultDrmSessionMgr", "DRM error", c1380d);
                    c1387k.m3486d(c1380d);
                    return new C1391o(new C1383g(c1380d, 6003));
                }
            }
            C1378b c1378b = this.f6170s;
            if (c1378b != null) {
                c1378b.mo3462c(c1387k);
                return c1378b;
            }
            C1378b c1378bM3480f = m3480f(arrayListM3477g, false, c1387k, z3);
            this.f6170s = c1378bM3480f;
            this.f6164m.add(c1378bM3480f);
            return c1378bM3480f;
        }
        int iM1359g = AbstractC0545H.m1359g(c0583o.f2154n);
        InterfaceC1394r interfaceC1394r = this.f6168q;
        interfaceC1394r.getClass();
        if (interfaceC1394r.mo985n() != 2 || !C1395s.f6192c) {
            int[] iArr = this.f6158g;
            while (true) {
                if (i3 >= iArr.length) {
                    i3 = -1;
                    break;
                }
                if (iArr[i3] == iM1359g) {
                    break;
                }
                i3++;
            }
            if (i3 != -1 && interfaceC1394r.mo985n() != 1) {
                C1378b c1378b2 = this.f6169r;
                if (c1378b2 == null) {
                    C1674E c1674e = AbstractC1676G.f7601h;
                    C1378b c1378bM3480f2 = m3480f(C1692X.f7629k, true, null, z3);
                    this.f6164m.add(c1378bM3480f2);
                    this.f6169r = c1378bM3480f2;
                } else {
                    c1378b2.mo3462c(null);
                }
                return this.f6169r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final C1378b m3479e(List list, boolean z3, C1387k c1387k) {
        this.f6168q.getClass();
        boolean z4 = this.f6159h | z3;
        InterfaceC1394r interfaceC1394r = this.f6168q;
        byte[] bArr = this.f6173v;
        Looper looper = this.f6171t;
        looper.getClass();
        C1071l c1071l = this.f6174w;
        c1071l.getClass();
        C1378b c1378b = new C1378b(this.f6154c, interfaceC1394r, this.f6160i, this.f6162k, list, z4, z3, bArr, this.f6157f, this.f6156e, looper, this.f6161j, c1071l);
        c1378b.mo3462c(c1387k);
        if (this.f6163l != -9223372036854775807L) {
            c1378b.mo3462c(null);
        }
        return c1378b;
    }

    /* JADX INFO: renamed from: f */
    public final C1378b m3480f(List list, boolean z3, C1387k c1387k, boolean z4) {
        C1378b c1378bM3479e = m3479e(list, z3, c1387k);
        boolean zM3476d = m3476d(c1378bM3479e);
        long j3 = this.f6163l;
        Set set = this.f6166o;
        if (zM3476d && !set.isEmpty()) {
            AbstractC1718l0 it = AbstractC1679J.m4128n(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC1384h) it.next()).mo3463d(null);
            }
            c1378bM3479e.mo3463d(c1387k);
            if (j3 != -9223372036854775807L) {
                c1378bM3479e.mo3463d(null);
            }
            c1378bM3479e = m3479e(list, z3, c1387k);
        }
        if (m3476d(c1378bM3479e) && z4) {
            Set set2 = this.f6165n;
            if (!set2.isEmpty()) {
                AbstractC1718l0 it2 = AbstractC1679J.m4128n(set2).iterator();
                while (it2.hasNext()) {
                    ((C1381e) it2.next()).mo2829a();
                }
                if (!set.isEmpty()) {
                    AbstractC1718l0 it3 = AbstractC1679J.m4128n(set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1384h) it3.next()).mo3463d(null);
                    }
                }
                c1378bM3479e.mo3463d(c1387k);
                if (j3 != -9223372036854775807L) {
                    c1378bM3479e.mo3463d(null);
                }
                return m3479e(list, z3, c1387k);
            }
        }
        return c1378bM3479e;
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: h */
    public final InterfaceC1389m mo979h(C1387k c1387k, C0583o c0583o) {
        AbstractC0646n.m1630h(this.f6167p > 0);
        AbstractC0646n.m1631i(this.f6171t);
        C1381e c1381e = new C1381e(this, c1387k);
        Handler handler = this.f6172u;
        handler.getClass();
        handler.post(new RunnableC0647o(c1381e, 7, c0583o));
        return c1381e;
    }

    /* JADX INFO: renamed from: i */
    public final void m3481i() {
        if (this.f6168q != null && this.f6167p == 0 && this.f6164m.isEmpty() && this.f6165n.isEmpty()) {
            InterfaceC1394r interfaceC1394r = this.f6168q;
            interfaceC1394r.getClass();
            interfaceC1394r.mo972a();
            this.f6168q = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3482j(boolean z3) {
        if (z3 && this.f6171t == null) {
            AbstractC0646n.m1648z("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f6171t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AbstractC0646n.m1648z("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f6171t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: u */
    public final void mo992u(Looper looper, C1071l c1071l) {
        synchronized (this) {
            try {
                Looper looper2 = this.f6171t;
                if (looper2 == null) {
                    this.f6171t = looper;
                    this.f6172u = new Handler(looper);
                } else {
                    AbstractC0646n.m1630h(looper2 == looper);
                    this.f6172u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6174w = c1071l;
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: v */
    public final int mo993v(C0583o c0583o) {
        m3482j(false);
        InterfaceC1394r interfaceC1394r = this.f6168q;
        interfaceC1394r.getClass();
        int iMo985n = interfaceC1394r.mo985n();
        C0579k c0579k = c0583o.f2158r;
        if (c0579k == null) {
            int iM1359g = AbstractC0545H.m1359g(c0583o.f2154n);
            int i3 = 0;
            while (true) {
                int[] iArr = this.f6158g;
                if (i3 >= iArr.length) {
                    i3 = -1;
                    break;
                }
                if (iArr[i3] == iM1359g) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return 0;
            }
        } else if (this.f6173v == null) {
            UUID uuid = this.f6154c;
            if (m3477g(c0579k, uuid, true).isEmpty()) {
                if (c0579k.f2089j == 1 && c0579k.f2086g[0].m1443d(AbstractC0571e.f2058b)) {
                    AbstractC0646n.m1647y("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c0579k.f2088i;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : AbstractC0632A.f2454a < 25)) {
                return 1;
            }
        }
        return iMo985n;
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: x */
    public final InterfaceC1384h mo995x(C1387k c1387k, C0583o c0583o) {
        m3482j(false);
        AbstractC0646n.m1630h(this.f6167p > 0);
        AbstractC0646n.m1631i(this.f6171t);
        return m3478c(this.f6171t, c1387k, c0583o, true);
    }
}
