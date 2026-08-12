package p089d1;

import android.media.MediaRouter2;

/* JADX INFO: renamed from: d1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1434g extends MediaRouter2.ControllerCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1440m f6356a;

    public C1434g(C1440m c1440m) {
        this.f6356a = c1440m;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f6356a.m3604k(routingController);
    }
}
