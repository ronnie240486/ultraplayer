package com.google.android.gms.internal.cast;

import android.util.Log;
import java.util.HashSet;
import p013E1.C0136k;
import p013E1.C0143r;
import p016F1.AbstractC0191h;
import p016F1.InterfaceC0193j;
import p019G1.C0233h;
import p019G1.C0239n;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p097f2.InterfaceC1558b;
import p097f2.InterfaceC1559c;
import p128o.C2057h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1327s implements InterfaceC1559c, InterfaceC1558b, InterfaceC0193j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1335u f5963g;

    public /* synthetic */ C1327s(C1335u c1335u) {
        this.f5963g = c1335u;
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo681a(AbstractC0191h abstractC0191h, int i3) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo682b(AbstractC0191h abstractC0191h, int i3) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ void mo683c(AbstractC0191h abstractC0191h, int i3) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo684d(AbstractC0191h abstractC0191h, String str) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: e */
    public void mo685e(AbstractC0191h abstractC0191h, String str) {
        C0136k c0136k;
        int i3 = 0;
        C0296b c0296b = C1335u.f5971i;
        C1335u c1335u = this.f5963g;
        c0296b.m831b("onSessionStarted with transferType = %d", Integer.valueOf(c1335u.f5976e));
        if (c1335u.f5972a.f452t && c1335u.f5976e == 2) {
            if (c1335u.f5979h == null) {
                c0296b.m831b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                C0233h c0233hM3410a = c1335u.m3410a();
                if (c0233hM3410a == null) {
                    c0296b.m831b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    c0296b.m831b("resume SessionState to current session", new Object[0]);
                    C0143r c0143r = c1335u.f5979h;
                    if (c0143r != null && (c0136k = c0143r.f324g) != null) {
                        C0233h.f601l.m831b("resume SessionState", new Object[0]);
                        AbstractC0491s.m1210b();
                        if (c0233hM3410a.m772w()) {
                            C0233h.m750x(new C0239n(c0233hM3410a, c0136k, i3));
                        } else {
                            C0233h.m749r();
                        }
                    }
                }
            }
        }
        c1335u.m3412c();
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo686f(AbstractC0191h abstractC0191h, boolean z3) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: g */
    public void mo687g(AbstractC0191h abstractC0191h, int i3) {
        C0296b c0296b = C1335u.f5971i;
        c0296b.m831b("onSessionEnded with error = %d", Integer.valueOf(i3));
        C1335u c1335u = this.f5963g;
        int i4 = c1335u.f5976e;
        if (i4 == 0) {
            c0296b.m831b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        } else if (c1335u.f5979h != null) {
            c0296b.m831b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i4), c1335u.f5979h);
            for (C1252Z c1252z : new HashSet(c1335u.f5973b)) {
                int i5 = c1335u.f5976e;
                switch (c1252z.f5751a) {
                    case 0:
                        C1260b0.f5797j.m831b("onTransferred with type = %d", Integer.valueOf(i5));
                        C1260b0 c1260b0 = (C1260b0) c1252z.f5752b;
                        c1260b0.m3238c();
                        C1324r0 c1324r0M3246b = c1260b0.f5800c.m3246b(c1260b0.f5804g);
                        C1304m0 c1304m0M3335m = C1308n0.m3335m(c1324r0M3246b.m3393d());
                        c1304m0M3335m.m3256c();
                        C1308n0.m3344v((C1308n0) c1304m0M3335m.f5902h, i5);
                        c1324r0M3246b.m3394e((C1308n0) c1304m0M3335m.m3254a());
                        c1260b0.f5798a.m3180a((C1328s0) c1324r0M3246b.m3254a(), 231);
                        c1260b0.f5806i = false;
                        c1260b0.f5804g = null;
                        break;
                }
            }
        } else {
            c0296b.m831b("No need to notify with null sessionState", new Object[0]);
        }
        if (c1335u.f5976e == 2) {
            return;
        }
        c1335u.m3412c();
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void mo688h(AbstractC0191h abstractC0191h) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ void mo689i(AbstractC0191h abstractC0191h) {
    }

    @Override // p097f2.InterfaceC1559c
    /* JADX INFO: renamed from: j */
    public void mo649j(Object obj) {
        C1335u c1335u = this.f5963g;
        c1335u.f5979h = (C0143r) obj;
        C2057h c2057h = c1335u.f5978g;
        if (c2057h != null) {
            c2057h.m4627a();
        }
    }

    @Override // p097f2.InterfaceC1558b
    /* JADX INFO: renamed from: k */
    public void mo340k(Exception exc) {
        C1335u c1335u = this.f5963g;
        c1335u.getClass();
        C0296b c0296b = C1335u.f5971i;
        Log.w(c0296b.f788a, c0296b.m833d("Fail to store SessionState", new Object[0]), exc);
        c1335u.m3411b(100);
    }
}
