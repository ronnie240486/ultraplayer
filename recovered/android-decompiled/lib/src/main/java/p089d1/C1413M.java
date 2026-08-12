package p089d1;

import android.media.MediaRouter;

/* JADX INFO: renamed from: d1.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1413M extends AbstractC1448u {

    /* JADX INFO: renamed from: a */
    public final MediaRouter.RouteInfo f6250a;

    public C1413M(MediaRouter.RouteInfo routeInfo) {
        this.f6250a = routeInfo;
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: f */
    public final void mo3523f(int i3) {
        this.f6250a.requestSetVolume(i3);
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: i */
    public final void mo3524i(int i3) {
        this.f6250a.requestUpdateVolume(i3);
    }
}
