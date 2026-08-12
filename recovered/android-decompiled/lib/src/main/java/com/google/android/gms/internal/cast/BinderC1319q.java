package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.C0858A;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p009D0.C0106b;
import p016F1.AbstractBinderC0196m;
import p016F1.C0186c;
import p028J1.C0296b;
import p028J1.C0313s;
import p089d1.AbstractC1411K;
import p089d1.AbstractC1452y;
import p089d1.C1405E;
import p089d1.C1433f;
import p089d1.C1451x;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.q */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1319q extends AbstractBinderC0196m {

    /* JADX INFO: renamed from: i */
    public static final C0296b f5953i = new C0296b("MediaRouterProxy", null);

    /* JADX INFO: renamed from: d */
    public final C1405E f5954d;

    /* JADX INFO: renamed from: e */
    public final C0186c f5955e;

    /* JADX INFO: renamed from: f */
    public final HashMap f5956f;

    /* JADX INFO: renamed from: g */
    public final C1335u f5957g;

    /* JADX INFO: renamed from: h */
    public final boolean f5958h;

    public BinderC1319q(Context context, C1405E c1405e, C0186c c0186c, C0313s c0313s) {
        super(1, "com.google.android.gms.cast.framework.internal.IMediaRouter");
        this.f5956f = new HashMap();
        this.f5954d = c1405e;
        this.f5955e = c0186c;
        int i3 = Build.VERSION.SDK_INT;
        C0296b c0296b = f5953i;
        if (i3 <= 32) {
            Log.i(c0296b.f788a, c0296b.m833d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        c0296b.m831b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f5957g = new C1335u(c0186c);
        Intent intent = new Intent(context, (Class<?>) AbstractC1411K.class);
        intent.setPackage(context.getPackageName());
        boolean zIsEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f5958h = !zIsEmpty;
        if (!zIsEmpty) {
            C1166D0.m3123a(EnumC1272e0.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        c0313s.m858d(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).m3884a(new C0106b(this, 29, c0186c));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m3348v0(C0858A c0858a) {
        this.f5954d.getClass();
        C1405E.m3510b();
        C1433f c1433fM3511c = C1405E.m3511c();
        c1433fM3511c.f6328D = c0858a;
        C0858A c0858a2 = c0858a != null ? new C0858A(c1433fM3511c, c0858a) : null;
        C0858A c0858a3 = c1433fM3511c.f6327C;
        if (c0858a3 != null) {
            c0858a3.m2179r();
        }
        c1433fM3511c.f6327C = c0858a2;
        if (c0858a2 != null) {
            c1433fM3511c.m3584l();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m3349w0(C1451x c1451x, int i3) {
        Set set = (Set) this.f5956f.get(c1451x);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f5954d.m3517a(c1451x, (AbstractC1452y) it.next(), i3);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m3350x0(C1451x c1451x) {
        Set set = (Set) this.f5956f.get(c1451x);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f5954d.m3518h((AbstractC1452y) it.next());
        }
    }
}
