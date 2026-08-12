package p125n0;

import android.media.Spatializer;
import p105h2.AbstractC1691W;

/* JADX INFO: renamed from: n0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2034k implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2040q f8867a;

    public C2034k(C2040q c2040q) {
        this.f8867a = c2040q;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        C2040q c2040q = this.f8867a;
        AbstractC1691W abstractC1691W = C2040q.f8900j;
        c2040q.m4615f();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        C2040q c2040q = this.f8867a;
        AbstractC1691W abstractC1691W = C2040q.f8900j;
        c2040q.m4615f();
    }
}
