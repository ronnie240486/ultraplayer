package p089d1;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p000A.AbstractC0050m0;

/* JADX INFO: renamed from: d1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1439l extends MediaRouter2.TransferCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1440m f6372a;

    public C1439l(C1440m c1440m) {
        this.f6372a = c1440m;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        AbstractC1448u abstractC1448u = (AbstractC1448u) this.f6372a.f6376k.remove(routingController);
        if (abstractC1448u == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        C1433f c1433f = this.f6372a.f6375j.f6316a;
        if (abstractC1448u != c1433f.f6334e) {
            int i3 = C1433f.f6324F;
            return;
        }
        C1403C c1403cM3575c = c1433f.m3575c();
        if (c1433f.m3577e() != c1403cM3575c) {
            c1433f.m3582j(c1403cM3575c, 2);
        }
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        C1403C c1403c;
        this.f6372a.f6376k.remove(routingController);
        if (routingController2 == this.f6372a.f6374i.getSystemController()) {
            C1433f c1433f = this.f6372a.f6375j.f6316a;
            C1403C c1403cM3575c = c1433f.m3575c();
            if (c1433f.m3577e() != c1403cM3575c) {
                c1433f.m3582j(c1403cM3575c, 3);
                return;
            }
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i3 = 0;
        String id = AbstractC0050m0.m265c(selectedRoutes.get(0)).getId();
        this.f6372a.f6376k.put(routingController2, new C1436i(this.f6372a, routingController2, id));
        C1433f c1433f2 = this.f6372a.f6375j.f6316a;
        ArrayList arrayList = c1433f2.f6339j;
        int size = arrayList.size();
        while (true) {
            if (i3 >= size) {
                c1403c = null;
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            c1403c = (C1403C) obj;
            if (c1403c.m3493c() == c1433f2.f6347r && TextUtils.equals(id, c1403c.f6217b)) {
                break;
            }
        }
        if (c1403c == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            c1433f2.m3582j(c1403c, 3);
        }
        this.f6372a.m3604k(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
