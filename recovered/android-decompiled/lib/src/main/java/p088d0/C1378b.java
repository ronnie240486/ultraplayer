package p088d0;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.HandlerC0870f;
import android.support.v4.media.session.HandlerC0881q;
import android.util.Pair;
import androidx.activity.RunnableC0892b;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p003B.AbstractC0081c;
import p055T.AbstractC0571e;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0637e;
import p073Z.InterfaceC0766a;
import p082b0.C1063d;
import p082b0.C1071l;
import p095f0.C1528a;
import p114k0.C1958r;

/* JADX INFO: renamed from: d0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1378b implements InterfaceC1384h {

    /* JADX INFO: renamed from: a */
    public final List f6125a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1394r f6126b;

    /* JADX INFO: renamed from: c */
    public final C1323r f6127c;

    /* JADX INFO: renamed from: d */
    public final C1379c f6128d;

    /* JADX INFO: renamed from: e */
    public final boolean f6129e;

    /* JADX INFO: renamed from: f */
    public final boolean f6130f;

    /* JADX INFO: renamed from: g */
    public final HashMap f6131g;

    /* JADX INFO: renamed from: h */
    public final C0637e f6132h;

    /* JADX INFO: renamed from: i */
    public final C1528a f6133i;

    /* JADX INFO: renamed from: j */
    public final C1071l f6134j;

    /* JADX INFO: renamed from: k */
    public final C0858A f6135k;

    /* JADX INFO: renamed from: l */
    public final UUID f6136l;

    /* JADX INFO: renamed from: m */
    public final Looper f6137m;

    /* JADX INFO: renamed from: n */
    public final HandlerC0881q f6138n;

    /* JADX INFO: renamed from: o */
    public int f6139o;

    /* JADX INFO: renamed from: p */
    public int f6140p;

    /* JADX INFO: renamed from: q */
    public HandlerThread f6141q;

    /* JADX INFO: renamed from: r */
    public HandlerC0870f f6142r;

    /* JADX INFO: renamed from: s */
    public InterfaceC0766a f6143s;

    /* JADX INFO: renamed from: t */
    public C1383g f6144t;

    /* JADX INFO: renamed from: u */
    public byte[] f6145u;

    /* JADX INFO: renamed from: v */
    public byte[] f6146v;

    /* JADX INFO: renamed from: w */
    public C1392p f6147w;

    /* JADX INFO: renamed from: x */
    public C1393q f6148x;

    public C1378b(UUID uuid, InterfaceC1394r interfaceC1394r, C1323r c1323r, C1379c c1379c, List list, boolean z3, boolean z4, byte[] bArr, HashMap map, C0858A c0858a, Looper looper, C1528a c1528a, C1071l c1071l) {
        this.f6136l = uuid;
        this.f6127c = c1323r;
        this.f6128d = c1379c;
        this.f6126b = interfaceC1394r;
        this.f6129e = z3;
        this.f6130f = z4;
        if (bArr != null) {
            this.f6146v = bArr;
            this.f6125a = null;
        } else {
            list.getClass();
            this.f6125a = Collections.unmodifiableList(list);
        }
        this.f6131g = map;
        this.f6135k = c0858a;
        this.f6132h = new C0637e();
        this.f6133i = c1528a;
        this.f6134j = c1071l;
        this.f6139o = 2;
        this.f6137m = looper;
        this.f6138n = new HandlerC0881q(this, looper, 4);
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: a */
    public final int mo3460a() {
        m3475p();
        return this.f6139o;
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: b */
    public final boolean mo3461b() {
        m3475p();
        return this.f6129e;
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: c */
    public final void mo3462c(C1387k c1387k) {
        m3475p();
        if (this.f6140p < 0) {
            AbstractC0646n.m1635m("DefaultDrmSession", "Session reference count less than zero: " + this.f6140p);
            this.f6140p = 0;
        }
        if (c1387k != null) {
            C0637e c0637e = this.f6132h;
            synchronized (c0637e.f2476g) {
                try {
                    ArrayList arrayList = new ArrayList(c0637e.f2479j);
                    arrayList.add(c1387k);
                    c0637e.f2479j = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c0637e.f2477h.get(c1387k);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c0637e.f2478i);
                        hashSet.add(c1387k);
                        c0637e.f2478i = Collections.unmodifiableSet(hashSet);
                    }
                    c0637e.f2477h.put(c1387k, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i3 = this.f6140p + 1;
        this.f6140p = i3;
        if (i3 == 1) {
            AbstractC0646n.m1630h(this.f6139o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f6141q = handlerThread;
            handlerThread.start();
            this.f6142r = new HandlerC0870f(this, this.f6141q.getLooper());
            if (m3473n()) {
                m3469j(true);
            }
        } else if (c1387k != null && m3470k() && this.f6132h.m1614e(c1387k) == 1) {
            c1387k.m3485c(this.f6139o);
        }
        C1382f c1382f = this.f6128d.f6149a;
        if (c1382f.f6163l != -9223372036854775807L) {
            c1382f.f6166o.remove(this);
            Handler handler = c1382f.f6172u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: d */
    public final void mo3463d(C1387k c1387k) {
        m3475p();
        int i3 = this.f6140p;
        if (i3 <= 0) {
            AbstractC0646n.m1635m("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i4 = i3 - 1;
        this.f6140p = i4;
        if (i4 == 0) {
            this.f6139o = 0;
            HandlerC0881q handlerC0881q = this.f6138n;
            int i5 = AbstractC0632A.f2454a;
            handlerC0881q.removeCallbacksAndMessages(null);
            HandlerC0870f handlerC0870f = this.f6142r;
            synchronized (handlerC0870f) {
                handlerC0870f.removeCallbacksAndMessages(null);
                handlerC0870f.f3683b = true;
            }
            this.f6142r = null;
            this.f6141q.quit();
            this.f6141q = null;
            this.f6143s = null;
            this.f6144t = null;
            this.f6147w = null;
            this.f6148x = null;
            byte[] bArr = this.f6145u;
            if (bArr != null) {
                this.f6126b.mo986o(bArr);
                this.f6145u = null;
            }
        }
        if (c1387k != null) {
            this.f6132h.m1615g(c1387k);
            if (this.f6132h.m1614e(c1387k) == 0) {
                c1387k.m3487e();
            }
        }
        C1379c c1379c = this.f6128d;
        int i6 = this.f6140p;
        C1382f c1382f = c1379c.f6149a;
        if (i6 == 1 && c1382f.f6167p > 0 && c1382f.f6163l != -9223372036854775807L) {
            c1382f.f6166o.add(this);
            Handler handler = c1382f.f6172u;
            handler.getClass();
            handler.postAtTime(new RunnableC0892b(12, this), this, SystemClock.uptimeMillis() + c1382f.f6163l);
        } else if (i6 == 0) {
            c1382f.f6164m.remove(this);
            if (c1382f.f6169r == this) {
                c1382f.f6169r = null;
            }
            if (c1382f.f6170s == this) {
                c1382f.f6170s = null;
            }
            C1323r c1323r = c1382f.f6160i;
            HashSet hashSet = (HashSet) c1323r.f5961h;
            hashSet.remove(this);
            if (((C1378b) c1323r.f5962i) == this) {
                c1323r.f5962i = null;
                if (!hashSet.isEmpty()) {
                    C1378b c1378b = (C1378b) hashSet.iterator().next();
                    c1323r.f5962i = c1378b;
                    C1393q c1393qMo975d = c1378b.f6126b.mo975d();
                    c1378b.f6148x = c1393qMo975d;
                    HandlerC0870f handlerC0870f2 = c1378b.f6142r;
                    int i7 = AbstractC0632A.f2454a;
                    c1393qMo975d.getClass();
                    handlerC0870f2.getClass();
                    handlerC0870f2.obtainMessage(1, new C1377a(C1958r.f8563b.getAndIncrement(), true, SystemClock.elapsedRealtime(), c1393qMo975d)).sendToTarget();
                }
            }
            if (c1382f.f6163l != -9223372036854775807L) {
                Handler handler2 = c1382f.f6172u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c1382f.f6166o.remove(this);
            }
        }
        c1382f.m3481i();
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: e */
    public final UUID mo3464e() {
        m3475p();
        return this.f6136l;
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: f */
    public final boolean mo3465f(String str) {
        m3475p();
        byte[] bArr = this.f6145u;
        AbstractC0646n.m1631i(bArr);
        return this.f6126b.mo990s(str, bArr);
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: g */
    public final C1383g mo3466g() {
        m3475p();
        if (this.f6139o == 1) {
            return this.f6144t;
        }
        return null;
    }

    @Override // p088d0.InterfaceC1384h
    /* JADX INFO: renamed from: h */
    public final InterfaceC0766a mo3467h() {
        m3475p();
        return this.f6143s;
    }

    /* JADX INFO: renamed from: i */
    public final void m3468i(C1063d c1063d) {
        Set set;
        C0637e c0637e = this.f6132h;
        synchronized (c0637e.f2476g) {
            set = c0637e.f2478i;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C1387k) it.next()).m3483a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3469j(boolean z3) {
        long jMin;
        long j3;
        Set set;
        boolean z4 = true;
        if (this.f6130f) {
            return;
        }
        byte[] bArr = this.f6145u;
        int i3 = AbstractC0632A.f2454a;
        if (this.f6146v == null) {
            m3474o(1, z3, bArr);
            return;
        }
        if (this.f6139o != 4) {
            try {
                this.f6126b.mo982k(this.f6145u, this.f6146v);
            } catch (Exception | NoSuchMethodError e3) {
                m3471l(e3, 1);
                z4 = false;
            }
            if (!z4) {
                return;
            }
        }
        if (AbstractC0571e.f2060d.equals(this.f6136l)) {
            m3475p();
            byte[] bArr2 = this.f6145u;
            Pair pair = null;
            Map mapMo984m = bArr2 == null ? null : this.f6126b.mo984m(bArr2);
            if (mapMo984m != null) {
                long j4 = -9223372036854775807L;
                try {
                    String str = (String) mapMo984m.get("LicenseDurationRemaining");
                    j3 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j3);
                try {
                    String str2 = (String) mapMo984m.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j4 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j4));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            AbstractC0646n.m1634l("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m3474o(2, z3, bArr);
            return;
        }
        if (jMin <= 0) {
            m3471l(new C1398v(), 2);
            return;
        }
        this.f6139o = 4;
        C0637e c0637e = this.f6132h;
        synchronized (c0637e.f2476g) {
            set = c0637e.f2478i;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C1387k) it.next()).m3484b();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3470k() {
        int i3 = this.f6139o;
        return i3 == 3 || i3 == 4;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX INFO: renamed from: l */
    public final void m3471l(Throwable th, int i3) {
        int iM1602u;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iM1602u = AbstractC0632A.m1602u(AbstractC0632A.m1603v(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (AbstractC0632A.f2454a >= 23 && AbstractC0081c.m411s(th)) {
            iM1602u = 6006;
        } else if ((th instanceof NotProvisionedException) || AbstractC0610a.m1516s(th)) {
            iM1602u = 6002;
        } else if (th instanceof DeniedByServerException) {
            iM1602u = 6007;
        } else if (th instanceof C1400x) {
            iM1602u = 6001;
        } else if (th instanceof C1380d) {
            iM1602u = 6003;
        } else if (th instanceof C1398v) {
            iM1602u = 6008;
        } else if (i3 == 1) {
            iM1602u = 6006;
        } else if (i3 == 2) {
            iM1602u = 6004;
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException();
            }
            iM1602u = 6002;
        }
        this.f6144t = new C1383g(th, iM1602u);
        AbstractC0646n.m1636n("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            C0637e c0637e = this.f6132h;
            synchronized (c0637e.f2476g) {
                set = c0637e.f2478i;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C1387k) it.next()).m3486d((Exception) th);
            }
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!AbstractC0610a.m1517t(th) && !AbstractC0610a.m1516s(th)) {
                throw ((Error) th);
            }
        }
        if (this.f6139o != 4) {
            this.f6139o = 1;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3472m(Throwable th, boolean z3) {
        if ((th instanceof NotProvisionedException) || AbstractC0610a.m1516s(th)) {
            this.f6127c.m3364L(this);
        } else {
            m3471l(th, z3 ? 1 : 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX INFO: renamed from: n */
    public final boolean m3473n() {
        Set set;
        if (m3470k()) {
            return true;
        }
        try {
            byte[] bArrMo991t = this.f6126b.mo991t();
            this.f6145u = bArrMo991t;
            this.f6126b.mo983l(bArrMo991t, this.f6134j);
            this.f6143s = this.f6126b.mo988q(this.f6145u);
            this.f6139o = 3;
            C0637e c0637e = this.f6132h;
            synchronized (c0637e.f2476g) {
                set = c0637e.f2478i;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C1387k) it.next()).m3485c(3);
            }
            this.f6145u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.f6127c.m3364L(this);
            return false;
        } catch (Exception e3) {
            e = e3;
            if (AbstractC0610a.m1516s(e)) {
                this.f6127c.m3364L(this);
                return false;
            }
            m3471l(e, 1);
            return false;
        } catch (NoSuchMethodError e4) {
            e = e4;
            if (AbstractC0610a.m1516s(e)) {
                this.f6127c.m3364L(this);
                return false;
            }
            m3471l(e, 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3474o(int i3, boolean z3, byte[] bArr) {
        try {
            C1392p c1392pMo981j = this.f6126b.mo981j(bArr, this.f6125a, i3, this.f6131g);
            this.f6147w = c1392pMo981j;
            HandlerC0870f handlerC0870f = this.f6142r;
            int i4 = AbstractC0632A.f2454a;
            c1392pMo981j.getClass();
            handlerC0870f.getClass();
            handlerC0870f.obtainMessage(2, new C1377a(C1958r.f8563b.getAndIncrement(), z3, SystemClock.elapsedRealtime(), c1392pMo981j)).sendToTarget();
        } catch (Exception | NoSuchMethodError e3) {
            m3472m(e3, true);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m3475p() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f6137m;
        if (threadCurrentThread != looper.getThread()) {
            AbstractC0646n.m1648z("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
