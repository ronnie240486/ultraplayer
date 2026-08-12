package com.google.android.gms.internal.cast;

import android.content.Context;
import p089d1.C1405E;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1287i implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5914g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1299l f5915h;

    public /* synthetic */ RunnableC1287i(C1299l c1299l, int i3) {
        this.f5914g = i3;
        this.f5915h = c1299l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5914g) {
            case 0:
                C1299l c1299l = this.f5915h;
                C1323r c1323r = c1299l.f5924e;
                if (((C1405E) c1323r.f5962i) == null) {
                    c1323r.f5962i = C1405E.m3512d((Context) c1323r.f5961h);
                }
                C1405E c1405e = (C1405E) c1323r.f5962i;
                if (c1405e != null) {
                    c1405e.m3518h(c1299l);
                }
                break;
            default:
                this.f5915h.m3274n();
                break;
        }
    }
}
