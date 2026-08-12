package p089d1;

import android.media.MediaRouter;

/* JADX INFO: renamed from: d1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1409I extends MediaRouter.VolumeCallback {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1408H f6247a;

    public C1409I(InterfaceC1408H interfaceC1408H) {
        this.f6247a = interfaceC1408H;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.f6247a.mo3519a(routeInfo, i3);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.f6247a.mo3520b(routeInfo, i3);
    }
}
