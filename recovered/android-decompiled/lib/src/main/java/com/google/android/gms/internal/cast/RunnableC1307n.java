package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import java.util.HashSet;
import java.util.Set;
import p013E1.C0136k;
import p013E1.C0139n;
import p013E1.C0142q;
import p013E1.C0143r;
import p019G1.C0233h;
import p022H1.C0258b;
import p028J1.C0296b;
import p028J1.C0306l;
import p036M0.C0380q;
import p046P1.AbstractC0491s;
import p067X.C0679k;
import p075Z1.HandlerC0784e;
import p089d1.C1403C;
import p089d1.C1447t;
import p097f2.AbstractC1561e;
import p097f2.C1560d;
import p097f2.C1562f;
import p097f2.C1563g;
import p097f2.InterfaceC1558b;
import p110j.C1765f;
import p110j.C1774o;
import p110j.MenuC1772m;
import p110j.ViewOnKeyListenerC1766g;
import p128o.C2057h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1307n implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5929g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5930h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5931i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5932j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5933k;

    public /* synthetic */ RunnableC1307n(C1311o c1311o, C1403C c1403c, C1403C c1403c2, C2057h c2057h) {
        this.f5930h = c1311o;
        this.f5931i = c1403c;
        this.f5932j = c1403c2;
        this.f5933k = c2057h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        C1563g c1563g;
        C0143r c0143r = null;
        Object obj = this.f5932j;
        Object obj2 = this.f5931i;
        Object obj3 = this.f5933k;
        Object obj4 = this.f5930h;
        switch (this.f5929g) {
            case 0:
                C1335u c1335u = ((C1311o) obj4).f5946a;
                c1335u.getClass();
                Set set = c1335u.f5973b;
                boolean zIsEmpty = new HashSet(set).isEmpty();
                C0296b c0296b = C1335u.f5971i;
                C2057h c2057h = (C2057h) obj3;
                if (zIsEmpty) {
                    c0296b.m831b("No need to prepare transfer without any callback", new Object[0]);
                    c2057h.m4627a();
                    return;
                }
                if (((C1403C) obj2).f6227l != 1) {
                    c0296b.m831b("No need to prepare transfer when transferring from local", new Object[0]);
                    c2057h.m4627a();
                    return;
                }
                C0233h c0233hM3410a = c1335u.m3410a();
                if (c0233hM3410a == null || !c0233hM3410a.m757g()) {
                    c0296b.m831b("No need to prepare transfer when there is no media session", new Object[0]);
                    c2057h.m4627a();
                    return;
                }
                c0296b.m831b("Prepare route transfer for changing endpoint", new Object[0]);
                C1403C c1403c = (C1403C) obj;
                if (c1403c.f6227l == 0) {
                    C1166D0.m3123a(EnumC1272e0.CAST_TRANSFER_TO_LOCAL_USED);
                    i3 = 1;
                } else {
                    i3 = CastDevice.m3070e(c1403c.f6234s) == null ? 3 : 2;
                }
                c1335u.f5976e = i3;
                c1335u.f5978g = c2057h;
                c0296b.m831b("notify transferring with type = %d", Integer.valueOf(i3));
                for (C1252Z c1252z : new HashSet(set)) {
                    int i4 = c1335u.f5976e;
                    switch (c1252z.f5751a) {
                        case 0:
                            C1260b0.f5797j.m831b("onTransferring with type = %d", Integer.valueOf(i4));
                            C1260b0 c1260b0 = (C1260b0) c1252z.f5752b;
                            c1260b0.f5806i = true;
                            c1260b0.m3238c();
                            C1324r0 c1324r0M3246b = c1260b0.f5800c.m3246b(c1260b0.f5804g);
                            C1304m0 c1304m0M3335m = C1308n0.m3335m(c1324r0M3246b.m3393d());
                            c1304m0M3335m.m3256c();
                            C1308n0.m3344v((C1308n0) c1304m0M3335m.f5902h, i4);
                            c1324r0M3246b.m3394e((C1308n0) c1304m0M3335m.m3254a());
                            c1260b0.f5798a.m3180a((C1328s0) c1324r0M3246b.m3254a(), 230);
                            break;
                        default:
                            C0380q c0380q = new C0380q(10, 3);
                            C0258b c0258b = (C0258b) c1252z.f5752b;
                            c0380q.f1293j = Boolean.valueOf(((BinderC1263c) c0258b.f664i).f5810e == 2);
                            C0258b.m779q(c0258b, new C1251Y2(c0380q));
                            C1247X2 c1247x2M792r = c0258b.m792r();
                            C1255a c1255a = new C1255a(new C0679k(i4));
                            c1255a.f5761c = c1247x2M792r.f5737h;
                            c1247x2M792r.f5732c.add(c1255a);
                            break;
                    }
                }
                c1335u.f5979h = null;
                AbstractC0491s.m1210b();
                if (c0233hM3410a.m772w()) {
                    c0233hM3410a.f608g = new C1560d();
                    C0233h.f601l.m831b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo mediaInfoM753c = c0233hM3410a.m753c();
                    C0142q c0142qM754d = c0233hM3410a.m754d();
                    if (mediaInfoM753c != null && c0142qM754d != null) {
                        Boolean bool = Boolean.TRUE;
                        long jM751a = c0233hM3410a.m751a();
                        C0139n c0139n = c0142qM754d.f301B;
                        double d3 = c0142qM754d.f307j;
                        if (Double.compare(d3, 2.0d) > 0 || Double.compare(d3, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        c0143r = new C0143r(new C0136k(mediaInfoM753c, c0139n, bool, jM751a, d3, c0142qM754d.f314q, c0142qM754d.f318u, null, null, null, null, 0L), null);
                    }
                    if (c0143r != null) {
                        c0233hM3410a.f608g.m3879b(c0143r);
                    } else {
                        c0233hM3410a.f608g.m3878a(new C0306l());
                    }
                    c1563g = c0233hM3410a.f608g.f7065a;
                } else {
                    C0306l c0306l = new C0306l();
                    c1563g = new C1563g();
                    c1563g.m3889f(c0306l);
                }
                c1563g.m3885b(new C1327s(c1335u));
                c1563g.f7072b.m2058e(new C1562f(AbstractC1561e.f7066a, (InterfaceC1558b) new C1327s(c1335u)));
                c1563g.m3891h();
                HandlerC0784e handlerC0784e = c1335u.f5974c;
                AbstractC0491s.m1213e(handlerC0784e);
                RunnableC1331t runnableC1331t = c1335u.f5975d;
                AbstractC0491s.m1213e(runnableC1331t);
                handlerC0784e.postDelayed(runnableC1331t, 10000L);
                return;
            default:
                C1765f c1765f = (C1765f) obj4;
                if (c1765f != null) {
                    C1447t c1447t = (C1447t) obj3;
                    ((ViewOnKeyListenerC1766g) c1447t.f6406h).f7860F = true;
                    c1765f.f7853b.m4253c(false);
                    ((ViewOnKeyListenerC1766g) c1447t.f6406h).f7860F = false;
                }
                C1774o c1774o = (C1774o) obj2;
                if (c1774o.isEnabled() && c1774o.hasSubMenu()) {
                    ((MenuC1772m) obj).m4259q(c1774o, null, 4);
                    return;
                }
                return;
        }
    }

    public RunnableC1307n(C1447t c1447t, C1765f c1765f, C1774o c1774o, MenuC1772m menuC1772m) {
        this.f5933k = c1447t;
        this.f5930h = c1765f;
        this.f5931i = c1774o;
        this.f5932j = menuC1772m;
    }
}
