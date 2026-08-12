package p089d1;

import android.media.MediaRouter2;
import java.util.List;

/* JADX INFO: renamed from: d1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1438k extends MediaRouter2.RouteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1440m f6371b;

    public /* synthetic */ C1438k(C1440m c1440m, int i3) {
        this.f6370a = i3;
        this.f6371b = c1440m;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesAdded(List list) {
        switch (this.f6370a) {
            case 0:
                this.f6371b.m3603j();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesChanged(List list) {
        switch (this.f6370a) {
            case 0:
                this.f6371b.m3603j();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesRemoved(List list) {
        switch (this.f6370a) {
            case 0:
                this.f6371b.m3603j();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesUpdated(List list) {
        switch (this.f6370a) {
            case 1:
                this.f6371b.m3603j();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
