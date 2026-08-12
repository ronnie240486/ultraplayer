package com.google.android.gms.internal.cast;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p013E1.C0143r;
import p016F1.AbstractC0191h;
import p016F1.C0186c;
import p016F1.C0187d;
import p016F1.C0192i;
import p019G1.C0233h;
import p022H1.C0258b;
import p028J1.C0296b;
import p036M0.C0380q;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;
import p128o.C2057h;
import p128o.C2059j;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1335u {

    /* JADX INFO: renamed from: i */
    public static final C0296b f5971i = new C0296b("SessionTransController", null);

    /* JADX INFO: renamed from: a */
    public final C0186c f5972a;

    /* JADX INFO: renamed from: f */
    public C0192i f5977f;

    /* JADX INFO: renamed from: g */
    public C2057h f5978g;

    /* JADX INFO: renamed from: h */
    public C0143r f5979h;

    /* JADX INFO: renamed from: b */
    public final Set f5973b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: e */
    public int f5976e = 0;

    /* JADX INFO: renamed from: c */
    public final HandlerC0784e f5974c = new HandlerC0784e(Looper.getMainLooper(), 3);

    /* JADX INFO: renamed from: d */
    public final RunnableC1331t f5975d = new RunnableC1331t(this, 0);

    public C1335u(C0186c c0186c) {
        this.f5972a = c0186c;
    }

    /* JADX INFO: renamed from: a */
    public final C0233h m3410a() {
        C0192i c0192i = this.f5977f;
        C0296b c0296b = f5971i;
        if (c0192i == null) {
            c0296b.m831b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        AbstractC0491s.m1210b();
        AbstractC0191h abstractC0191hM680c = c0192i.m680c();
        C0187d c0187d = (abstractC0191hM680c == null || !(abstractC0191hM680c instanceof C0187d)) ? null : (C0187d) abstractC0191hM680c;
        if (c0187d == null) {
            c0296b.m831b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        AbstractC0491s.m1210b();
        return c0187d.f463j;
    }

    /* JADX INFO: renamed from: b */
    public final void m3411b(int i3) {
        C2057h c2057h = this.f5978g;
        if (c2057h != null) {
            c2057h.f8951d = true;
            C2059j c2059j = c2057h.f8949b;
            if (c2059j != null && c2059j.f8954h.cancel(true)) {
                c2057h.f8948a = null;
                c2057h.f8949b = null;
                c2057h.f8950c = null;
            }
        }
        f5971i.m831b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.f5976e), Integer.valueOf(i3));
        for (C1252Z c1252z : new HashSet(this.f5973b)) {
            int i4 = this.f5976e;
            switch (c1252z.f5751a) {
                case 0:
                    C1260b0.f5797j.m831b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i4), Integer.valueOf(i3));
                    C1260b0 c1260b0 = (C1260b0) c1252z.f5752b;
                    c1260b0.m3238c();
                    C1324r0 c1324r0M3246b = c1260b0.f5800c.m3246b(c1260b0.f5804g);
                    C1304m0 c1304m0M3335m = C1308n0.m3335m(c1324r0M3246b.m3393d());
                    c1304m0M3335m.m3256c();
                    C1308n0.m3344v((C1308n0) c1304m0M3335m.f5902h, i4);
                    c1304m0M3335m.m3256c();
                    C1308n0.m3345w((C1308n0) c1304m0M3335m.f5902h, i3);
                    c1324r0M3246b.m3394e((C1308n0) c1304m0M3335m.m3254a());
                    c1260b0.f5798a.m3180a((C1328s0) c1324r0M3246b.m3254a(), 232);
                    c1260b0.f5806i = false;
                    break;
                default:
                    C0380q c0380q = new C0380q(11, 3);
                    c0380q.f1292i = Integer.valueOf(i3);
                    C0258b c0258b = (C0258b) c1252z.f5752b;
                    c0380q.f1293j = Boolean.valueOf(((BinderC1263c) c0258b.f664i).f5810e == 2);
                    C0258b.m779q(c0258b, new C1251Y2(c0380q));
                    break;
            }
        }
        m3412c();
    }

    /* JADX INFO: renamed from: c */
    public final void m3412c() {
        HandlerC0784e handlerC0784e = this.f5974c;
        AbstractC0491s.m1213e(handlerC0784e);
        RunnableC1331t runnableC1331t = this.f5975d;
        AbstractC0491s.m1213e(runnableC1331t);
        handlerC0784e.removeCallbacks(runnableC1331t);
        this.f5976e = 0;
        this.f5979h = null;
    }
}
