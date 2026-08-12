package com.google.android.gms.internal.cast;

import android.util.Log;
import p016F1.C0192i;
import p028J1.C0296b;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1331t implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5966g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1335u f5967h;

    public /* synthetic */ RunnableC1331t(C1335u c1335u, int i3) {
        this.f5966g = i3;
        this.f5967h = c1335u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1335u c1335u = this.f5967h;
        switch (this.f5966g) {
            case 0:
                Object[] objArr = {Integer.valueOf(c1335u.f5976e)};
                C0296b c0296b = C1335u.f5971i;
                Log.i(c0296b.f788a, c0296b.m833d("transfer with type = %d has timed out", objArr));
                c1335u.m3411b(101);
                break;
            default:
                C1327s c1327s = new C1327s(c1335u);
                C0192i c0192i = c1335u.f5977f;
                AbstractC0491s.m1213e(c0192i);
                c0192i.m678a(c1327s);
                break;
        }
    }
}
