package p013E1;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p009D0.C0106b;
import p016F1.C0183I;
import p028J1.AbstractC0304j;
import p028J1.C0296b;
import p028J1.InterfaceC0302h;
import p037M1.AbstractC0393f;
import p037M1.C0391d;
import p037M1.C0392e;
import p040N1.C0417B;
import p040N1.C0424e;
import p040N1.C0427h;
import p040N1.C0443x;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;
import p097f2.C1560d;
import p097f2.C1563g;

/* JADX INFO: renamed from: E1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0125H extends AbstractC0393f {

    /* JADX INFO: renamed from: F */
    public static final C0296b f181F = new C0296b("CastClient", null);

    /* JADX INFO: renamed from: G */
    public static final C0106b f182G = new C0106b("Cast.API_CXLESS", new C0120C(0), AbstractC0304j.f799a, 5);

    /* JADX INFO: renamed from: A */
    public final HashMap f183A;

    /* JADX INFO: renamed from: B */
    public final HashMap f184B;

    /* JADX INFO: renamed from: C */
    public final C0183I f185C;

    /* JADX INFO: renamed from: D */
    public final List f186D;

    /* JADX INFO: renamed from: E */
    public int f187E;

    /* JADX INFO: renamed from: j */
    public final BinderC0124G f188j;

    /* JADX INFO: renamed from: k */
    public HandlerC0784e f189k;

    /* JADX INFO: renamed from: l */
    public boolean f190l;

    /* JADX INFO: renamed from: m */
    public boolean f191m;

    /* JADX INFO: renamed from: n */
    public C1560d f192n;

    /* JADX INFO: renamed from: o */
    public C1560d f193o;

    /* JADX INFO: renamed from: p */
    public final AtomicLong f194p;

    /* JADX INFO: renamed from: q */
    public final Object f195q;

    /* JADX INFO: renamed from: r */
    public final Object f196r;

    /* JADX INFO: renamed from: s */
    public C0129d f197s;

    /* JADX INFO: renamed from: t */
    public String f198t;

    /* JADX INFO: renamed from: u */
    public double f199u;

    /* JADX INFO: renamed from: v */
    public boolean f200v;

    /* JADX INFO: renamed from: w */
    public int f201w;

    /* JADX INFO: renamed from: x */
    public int f202x;

    /* JADX INFO: renamed from: y */
    public C0149x f203y;

    /* JADX INFO: renamed from: z */
    public final CastDevice f204z;

    public C0125H(Context context, C0130e c0130e) {
        super(context, f182G, c0130e, C0392e.f1346c);
        this.f188j = new BinderC0124G(this);
        this.f195q = new Object();
        this.f196r = new Object();
        this.f186D = Collections.synchronizedList(new ArrayList());
        this.f185C = c0130e.f241c;
        this.f204z = c0130e.f240b;
        this.f183A = new HashMap();
        this.f184B = new HashMap();
        this.f194p = new AtomicLong(0L);
        this.f187E = 1;
        m586i();
    }

    /* JADX INFO: renamed from: d */
    public static void m580d(C0125H c0125h, long j3, int i3) {
        C1560d c1560d;
        synchronized (c0125h.f183A) {
            HashMap map = c0125h.f183A;
            Long lValueOf = Long.valueOf(j3);
            c1560d = (C1560d) map.get(lValueOf);
            c0125h.f183A.remove(lValueOf);
        }
        if (c1560d != null) {
            if (i3 == 0) {
                c1560d.m3879b(null);
            } else {
                c1560d.m3878a(new C0391d(new Status(i3, null, null, null)));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m581e(C0125H c0125h, int i3) {
        synchronized (c0125h.f196r) {
            try {
                C1560d c1560d = c0125h.f193o;
                if (c1560d == null) {
                    return;
                }
                if (i3 == 0) {
                    c1560d.m3879b(new Status(0, null, null, null));
                } else {
                    c1560d.m3878a(new C0391d(new Status(i3, null, null, null)));
                }
                c0125h.f193o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static Handler m582j(C0125H c0125h) {
        if (c0125h.f189k == null) {
            c0125h.f189k = new HandlerC0784e(c0125h.f1354f, 3);
        }
        return c0125h.f189k;
    }

    /* JADX INFO: renamed from: f */
    public final C1563g m583f(InterfaceC0302h interfaceC0302h) {
        C0427h c0427h = m1078b(interfaceC0302h).f1460a;
        AbstractC0491s.m1214f(c0427h, "Key must not be null");
        C0424e c0424e = this.f1357i;
        c0424e.getClass();
        C1560d c1560d = new C1560d();
        c0424e.m1128e(c1560d, 8415, this);
        C0443x c0443x = new C0443x(new C0417B(c0427h, c1560d), c0424e.f1453o.get(), this);
        HandlerC0784e handlerC0784e = c0424e.f1457s;
        handlerC0784e.sendMessage(handlerC0784e.obtainMessage(13, c0443x));
        return c1560d.f7065a;
    }

    /* JADX INFO: renamed from: g */
    public final void m584g() {
        f181F.m831b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f184B) {
            this.f184B.clear();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m585h(int i3) {
        synchronized (this.f195q) {
            try {
                C1560d c1560d = this.f192n;
                if (c1560d != null) {
                    c1560d.m3878a(new C0391d(new Status(i3, null, null, null)));
                }
                this.f192n = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m586i() {
        CastDevice castDevice = this.f204z;
        if (castDevice.m3071f(2048) || !castDevice.m3071f(4) || castDevice.m3071f(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f5423k);
    }
}
