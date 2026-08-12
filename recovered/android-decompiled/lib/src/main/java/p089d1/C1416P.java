package p089d1;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Locale;
import p046P1.C0471D;

/* JADX INFO: renamed from: d1.P */
/* JADX INFO: loaded from: classes.dex */
public class C1416P extends AbstractC1417Q implements InterfaceC1408H {

    /* JADX INFO: renamed from: s */
    public static final ArrayList f6256s;

    /* JADX INFO: renamed from: t */
    public static final ArrayList f6257t;

    /* JADX INFO: renamed from: i */
    public final C1433f f6258i;

    /* JADX INFO: renamed from: j */
    public final MediaRouter f6259j;

    /* JADX INFO: renamed from: k */
    public final C1407G f6260k;

    /* JADX INFO: renamed from: l */
    public final MediaRouter.VolumeCallback f6261l;

    /* JADX INFO: renamed from: m */
    public final MediaRouter.RouteCategory f6262m;

    /* JADX INFO: renamed from: n */
    public int f6263n;

    /* JADX INFO: renamed from: o */
    public boolean f6264o;

    /* JADX INFO: renamed from: p */
    public boolean f6265p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f6266q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f6267r;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f6256s = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f6257t = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public C1416P(Context context, C1433f c1433f) {
        super(context, new C1447t(0, new ComponentName("android", AbstractC1417Q.class.getName())));
        this.f6266q = new ArrayList();
        this.f6267r = new ArrayList();
        this.f6258i = c1433f;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f6259j = mediaRouter;
        this.f6260k = new C1407G(this);
        this.f6261l = AbstractC1410J.m3521a(this);
        this.f6262m = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        m3540w();
    }

    /* JADX INFO: renamed from: n */
    public static C1415O m3525n(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof C1415O) {
            return (C1415O) tag;
        }
        return null;
    }

    @Override // p089d1.InterfaceC1408H
    /* JADX INFO: renamed from: a */
    public final void mo3519a(MediaRouter.RouteInfo routeInfo, int i3) {
        C1415O c1415oM3525n = m3525n(routeInfo);
        if (c1415oM3525n != null) {
            c1415oM3525n.f6254a.m3500j(i3);
        }
    }

    @Override // p089d1.InterfaceC1408H
    /* JADX INFO: renamed from: b */
    public final void mo3520b(MediaRouter.RouteInfo routeInfo, int i3) {
        C1415O c1415oM3525n = m3525n(routeInfo);
        if (c1415oM3525n != null) {
            c1415oM3525n.f6254a.m3501k(i3);
        }
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: d */
    public final AbstractC1448u mo3526d(String str) {
        int iM3530k = m3530k(str);
        if (iM3530k >= 0) {
            return new C1413M(((C1414N) this.f6266q.get(iM3530k)).f6251a);
        }
        return null;
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: f */
    public final void mo3527f(C1443p c1443p) {
        boolean zM3613b;
        int i3 = 0;
        if (c1443p != null) {
            c1443p.m3612a();
            ArrayList arrayListM3641c = c1443p.f6389b.m3641c();
            int size = arrayListM3641c.size();
            int i4 = 0;
            while (i3 < size) {
                String str = (String) arrayListM3641c.get(i3);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i4 |= 1;
                } else {
                    i4 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i4 | 2 : i4 | 8388608;
                }
                i3++;
            }
            zM3613b = c1443p.m3613b();
            i3 = i4;
        } else {
            zM3613b = false;
        }
        if (this.f6263n == i3 && this.f6264o == zM3613b) {
            return;
        }
        this.f6263n = i3;
        this.f6264o = zM3613b;
        m3540w();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3528i(MediaRouter.RouteInfo routeInfo) {
        String str;
        String str2;
        if (m3525n(routeInfo) != null || m3529j(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo routeInfoM3532m = m3532m();
        Context context = this.f6407a;
        if (routeInfoM3532m == routeInfo) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            str = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        String str3 = str;
        if (m3530k(str3) >= 0) {
            int i3 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = str3 + "_" + i3;
                if (m3530k(str2) < 0) {
                    break;
                }
                i3++;
            }
            str3 = str2;
        }
        C1414N c1414n = new C1414N(routeInfo, str3);
        CharSequence name2 = routeInfo.getName(context);
        C1441n c1441n = new C1441n(str3, name2 != null ? name2.toString() : "");
        mo3522p(c1414n, c1441n);
        c1414n.f6253c = c1441n.m3606b();
        this.f6266q.add(c1414n);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final int m3529j(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.f6266q;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C1414N) arrayList.get(i3)).f6251a == routeInfo) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final int m3530k(String str) {
        ArrayList arrayList = this.f6266q;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C1414N) arrayList.get(i3)).f6252b.equals(str)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public final int m3531l(C1403C c1403c) {
        ArrayList arrayList = this.f6267r;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C1415O) arrayList.get(i3)).f6254a == c1403c) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public MediaRouter.RouteInfo m3532m() {
        return this.f6259j.getDefaultRoute();
    }

    /* JADX INFO: renamed from: o */
    public boolean m3533o(C1414N c1414n) {
        return c1414n.f6251a.isConnecting();
    }

    /* JADX INFO: renamed from: p */
    public void mo3522p(C1414N c1414n, C1441n c1441n) {
        int supportedTypes = c1414n.f6251a.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            c1441n.m3605a(f6256s);
        }
        if ((supportedTypes & 2) != 0) {
            c1441n.m3605a(f6257t);
        }
        MediaRouter.RouteInfo routeInfo = c1414n.f6251a;
        c1441n.f6383a.putInt("playbackType", routeInfo.getPlaybackType());
        int playbackStream = routeInfo.getPlaybackStream();
        Bundle bundle = c1441n.f6383a;
        bundle.putInt("playbackStream", playbackStream);
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (m3533o(c1414n)) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3534q(C1403C c1403c) {
        AbstractC1449v abstractC1449vM3493c = c1403c.m3493c();
        MediaRouter mediaRouter = this.f6259j;
        if (abstractC1449vM3493c == this) {
            int iM3529j = m3529j(mediaRouter.getSelectedRoute(8388611));
            if (iM3529j < 0 || !((C1414N) this.f6266q.get(iM3529j)).f6252b.equals(c1403c.f6217b)) {
                return;
            }
            c1403c.m3502l();
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.f6262m);
        C1415O c1415o = new C1415O(c1403c, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(c1415o);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.f6261l);
        m3541x(c1415o);
        this.f6267r.add(c1415o);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    /* JADX INFO: renamed from: r */
    public final void m3535r(C1403C c1403c) {
        int iM3531l;
        if (c1403c.m3493c() == this || (iM3531l = m3531l(c1403c)) < 0) {
            return;
        }
        C1415O c1415o = (C1415O) this.f6267r.remove(iM3531l);
        c1415o.f6255b.setTag(null);
        MediaRouter.UserRouteInfo userRouteInfo = c1415o.f6255b;
        userRouteInfo.setVolumeCallback(null);
        try {
            this.f6259j.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e3) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e3);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3536s(C1403C c1403c) {
        if (c1403c.m3497g()) {
            if (c1403c.m3493c() != this) {
                int iM3531l = m3531l(c1403c);
                if (iM3531l >= 0) {
                    m3538u(((C1415O) this.f6267r.get(iM3531l)).f6255b);
                    return;
                }
                return;
            }
            int iM3530k = m3530k(c1403c.f6217b);
            if (iM3530k >= 0) {
                m3538u(((C1414N) this.f6266q.get(iM3530k)).f6251a);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3537t() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f6266q;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1442o c1442o = ((C1414N) arrayList2.get(i3)).f6253c;
            if (c1442o == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(c1442o)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(c1442o);
        }
        m3630g(new C0471D(arrayList, false));
    }

    /* JADX INFO: renamed from: u */
    public void m3538u(MediaRouter.RouteInfo routeInfo) {
        this.f6259j.selectRoute(8388611, routeInfo);
    }

    /* JADX INFO: renamed from: v */
    public void m3539v() {
        boolean z3 = this.f6265p;
        C1407G c1407g = this.f6260k;
        MediaRouter mediaRouter = this.f6259j;
        if (z3) {
            mediaRouter.removeCallback(c1407g);
        }
        this.f6265p = true;
        mediaRouter.addCallback(this.f6263n, c1407g, (this.f6264o ? 1 : 0) | 2);
    }

    /* JADX INFO: renamed from: w */
    public final void m3540w() {
        m3539v();
        MediaRouter mediaRouter = this.f6259j;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zM3528i = false;
        for (int i3 = 0; i3 < routeCount; i3++) {
            arrayList.add(mediaRouter.getRouteAt(i3));
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            zM3528i |= m3528i((MediaRouter.RouteInfo) obj);
        }
        if (zM3528i) {
            m3537t();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m3541x(C1415O c1415o) {
        MediaRouter.UserRouteInfo userRouteInfo = c1415o.f6255b;
        C1403C c1403c = c1415o.f6254a;
        userRouteInfo.setName(c1403c.f6219d);
        userRouteInfo.setPlaybackType(c1403c.f6227l);
        userRouteInfo.setPlaybackStream(c1403c.f6228m);
        userRouteInfo.setVolume(c1403c.f6231p);
        userRouteInfo.setVolumeMax(c1403c.f6232q);
        userRouteInfo.setVolumeHandling((!c1403c.m3495e() || C1405E.m3515g()) ? c1403c.f6230o : 0);
        userRouteInfo.setDescription(c1403c.f6220e);
    }
}
