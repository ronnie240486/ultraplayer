package p089d1;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: d1.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1407G extends MediaRouter.Callback {

    /* JADX INFO: renamed from: a */
    public final C1416P f6246a;

    public C1407G(C1416P c1416p) {
        this.f6246a = c1416p;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C1416P c1416p = this.f6246a;
        if (c1416p.m3528i(routeInfo)) {
            c1416p.m3537t();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iM3529j;
        C1416P c1416p = this.f6246a;
        c1416p.getClass();
        if (C1416P.m3525n(routeInfo) != null || (iM3529j = c1416p.m3529j(routeInfo)) < 0) {
            return;
        }
        C1414N c1414n = (C1414N) c1416p.f6266q.get(iM3529j);
        String str = c1414n.f6252b;
        CharSequence name = c1414n.f6251a.getName(c1416p.f6407a);
        C1441n c1441n = new C1441n(str, name != null ? name.toString() : "");
        c1416p.mo3522p(c1414n, c1441n);
        c1414n.f6253c = c1441n.m3606b();
        c1416p.m3537t();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i3) {
        this.f6246a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C1416P c1416p = this.f6246a;
        int iM3529j = c1416p.m3529j(routeInfo);
        if (iM3529j >= 0) {
            C1414N c1414n = (C1414N) c1416p.f6266q.get(iM3529j);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != c1414n.f6253c.f6387a.getInt("presentationDisplayId", -1)) {
                C1442o c1442o = c1414n.f6253c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (c1442o == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(c1442o.f6387a);
                ArrayList arrayListM3609c = c1442o.m3609c();
                ArrayList arrayListM3608b = c1442o.m3608b();
                HashSet hashSetM3607a = c1442o.m3607a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListM3608b));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListM3609c));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetM3607a));
                c1414n.f6253c = new C1442o(bundle);
                c1416p.m3537t();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iM3529j;
        C1416P c1416p = this.f6246a;
        c1416p.getClass();
        if (C1416P.m3525n(routeInfo) != null || (iM3529j = c1416p.m3529j(routeInfo)) < 0) {
            return;
        }
        c1416p.f6266q.remove(iM3529j);
        c1416p.m3537t();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        C1403C c1403cM3490a;
        C1416P c1416p = this.f6246a;
        if (routeInfo != c1416p.f6259j.getSelectedRoute(8388611)) {
            return;
        }
        C1415O c1415oM3525n = C1416P.m3525n(routeInfo);
        if (c1415oM3525n != null) {
            c1415oM3525n.f6254a.m3502l();
            return;
        }
        int iM3529j = c1416p.m3529j(routeInfo);
        if (iM3529j >= 0) {
            String str = ((C1414N) c1416p.f6266q.get(iM3529j)).f6252b;
            C1433f c1433f = c1416p.f6258i;
            c1433f.f6330a.removeMessages(262);
            C1402B c1402bM3576d = c1433f.m3576d(c1433f.f6348s);
            if (c1402bM3576d == null || (c1403cM3490a = c1402bM3576d.m3490a(str)) == null) {
                return;
            }
            c1403cM3490a.m3502l();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f6246a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        this.f6246a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iM3529j;
        C1416P c1416p = this.f6246a;
        c1416p.getClass();
        if (C1416P.m3525n(routeInfo) != null || (iM3529j = c1416p.m3529j(routeInfo)) < 0) {
            return;
        }
        C1414N c1414n = (C1414N) c1416p.f6266q.get(iM3529j);
        int volume = routeInfo.getVolume();
        if (volume != c1414n.f6253c.f6387a.getInt("volume")) {
            C1442o c1442o = c1414n.f6253c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (c1442o == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(c1442o.f6387a);
            ArrayList arrayListM3609c = c1442o.m3609c();
            ArrayList arrayListM3608b = c1442o.m3608b();
            HashSet hashSetM3607a = c1442o.m3607a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListM3608b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListM3609c));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetM3607a));
            c1414n.f6253c = new C1442o(bundle);
            c1416p.m3537t();
        }
    }
}
