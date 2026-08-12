package p089d1;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000A.AbstractC0050m0;
import p046P1.C0471D;
import p066W1.AbstractC0664e;
import p085c0.ExecutorC1148x;

/* JADX INFO: renamed from: d1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1440m extends AbstractC1449v {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f6373r = 0;

    /* JADX INFO: renamed from: i */
    public final MediaRouter2 f6374i;

    /* JADX INFO: renamed from: j */
    public final C1428b f6375j;

    /* JADX INFO: renamed from: k */
    public final ArrayMap f6376k;

    /* JADX INFO: renamed from: l */
    public final MediaRouter2.RouteCallback f6377l;

    /* JADX INFO: renamed from: m */
    public final C1439l f6378m;

    /* JADX INFO: renamed from: n */
    public final C1434g f6379n;

    /* JADX INFO: renamed from: o */
    public final ExecutorC1148x f6380o;

    /* JADX INFO: renamed from: p */
    public ArrayList f6381p;

    /* JADX INFO: renamed from: q */
    public final ArrayMap f6382q;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public C1440m(Context context, C1428b c1428b) {
        super(context, null);
        this.f6376k = new ArrayMap();
        this.f6378m = new C1439l(this);
        this.f6379n = new C1434g(this);
        this.f6381p = new ArrayList();
        this.f6382q = new ArrayMap();
        this.f6374i = MediaRouter2.getInstance(context);
        this.f6375j = c1428b;
        this.f6380o = new ExecutorC1148x(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f6377l = new C1438k(this, 1);
        } else {
            this.f6377l = new C1438k(this, 0);
        }
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: c */
    public final AbstractC1446s mo3560c(String str) {
        Iterator it = this.f6376k.entrySet().iterator();
        while (it.hasNext()) {
            C1436i c1436i = (C1436i) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, c1436i.f6357f)) {
                return c1436i;
            }
        }
        return null;
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: d */
    public final AbstractC1448u mo3526d(String str) {
        return new C1437j((String) this.f6382q.get(str), null);
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: e */
    public final AbstractC1448u mo3561e(String str, String str2) {
        String str3 = (String) this.f6382q.get(str);
        for (C1436i c1436i : this.f6376k.values()) {
            C1442o c1442o = c1436i.f6366o;
            if (TextUtils.equals(str2, c1442o != null ? c1442o.m3610d() : c1436i.f6358g.getId())) {
                return new C1437j(str3, c1436i);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C1437j(str3, null);
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: f */
    public final void mo3527f(C1443p c1443p) {
        ArrayList<String> arrayList;
        C1451x c1451x;
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        int i3 = C1405E.f6239c == null ? 0 : C1405E.m3511c().f6326B;
        C1434g c1434g = this.f6379n;
        C1439l c1439l = this.f6378m;
        if (i3 <= 0) {
            this.f6374i.unregisterRouteCallback(this.f6377l);
            this.f6374i.unregisterTransferCallback(c1439l);
            this.f6374i.unregisterControllerCallback(c1434g);
            return;
        }
        C1406F c1406f = C1405E.m3511c().f6350u;
        boolean z3 = c1406f == null ? false : c1406f.f6244c;
        if (c1443p == null) {
            c1443p = new C1443p(C1451x.f6416c, false);
        }
        c1443p.m3612a();
        ArrayList arrayListM3641c = c1443p.f6389b.m3641c();
        if (!z3) {
            arrayListM3641c.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListM3641c.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListM3641c.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (arrayListM3641c.isEmpty()) {
            arrayList = null;
        } else {
            int size = arrayListM3641c.size();
            arrayList = null;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListM3641c.get(i4);
                i4++;
                String str = (String) obj;
                if (str == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null) {
            c1451x = C1451x.f6416c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            c1451x = new C1451x(bundle, arrayList);
        }
        boolean zM3613b = c1443p.m3613b();
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", c1451x.f6417a);
        bundle2.putBoolean("activeScan", zM3613b);
        MediaRouter2 mediaRouter2 = this.f6374i;
        MediaRouter2.RouteCallback routeCallback = this.f6377l;
        c1451x.m3640a();
        if (c1451x.f6418b.contains(null)) {
            AbstractC1435h.m3595h();
            routeDiscoveryPreferenceBuild = AbstractC1435h.m3590c(new ArrayList()).build();
        } else {
            boolean z4 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayListM3641c2 = c1451x.m3641c();
            int size2 = arrayListM3641c2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayListM3641c2.get(i5);
                i5++;
                String str2 = (String) obj2;
                str2.getClass();
                switch (str2) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str2 = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str2 = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str2);
            }
            routeDiscoveryPreferenceBuild = AbstractC1435h.m3591d(arrayList2, z4).build();
        }
        ExecutorC1148x executorC1148x = this.f6380o;
        mediaRouter2.registerRouteCallback(executorC1148x, routeCallback, routeDiscoveryPreferenceBuild);
        this.f6374i.registerTransferCallback(executorC1148x, c1439l);
        this.f6374i.registerControllerCallback(executorC1148x, c1434g);
    }

    /* JADX INFO: renamed from: i */
    public final MediaRoute2Info m3602i(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.f6381p;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            MediaRoute2Info mediaRoute2InfoM265c = AbstractC0050m0.m265c(obj);
            if (TextUtils.equals(mediaRoute2InfoM265c.getId(), str)) {
                return mediaRoute2InfoM265c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m3603j() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.f6374i.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM265c = AbstractC0050m0.m265c(it.next());
            if (mediaRoute2InfoM265c != null && !arraySet.contains(mediaRoute2InfoM265c) && !mediaRoute2InfoM265c.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoM265c);
                arrayList.add(mediaRoute2InfoM265c);
            }
        }
        if (arrayList.equals(this.f6381p)) {
            return;
        }
        this.f6381p = arrayList;
        ArrayMap arrayMap = this.f6382q;
        arrayMap.clear();
        ArrayList arrayList2 = this.f6381p;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            MediaRoute2Info mediaRoute2InfoM265c2 = AbstractC0050m0.m265c(obj);
            Bundle extras = mediaRoute2InfoM265c2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoM265c2);
            } else {
                arrayMap.put(mediaRoute2InfoM265c2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.f6381p;
        int size2 = arrayList4.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList4.get(i5);
            i5++;
            MediaRoute2Info mediaRoute2InfoM265c3 = AbstractC0050m0.m265c(obj2);
            C1442o c1442oM1736X = AbstractC0664e.m1736X(mediaRoute2InfoM265c3);
            if (mediaRoute2InfoM265c3 != null) {
                arrayList3.add(c1442oM1736X);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                C1442o c1442o = (C1442o) obj3;
                if (c1442o == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList5.contains(c1442o)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList5.add(c1442o);
            }
        }
        m3630g(new C0471D(arrayList5, true));
    }

    /* JADX INFO: renamed from: k */
    public final void m3604k(MediaRouter2.RoutingController routingController) {
        C1441n c1441n;
        C1436i c1436i = (C1436i) this.f6376k.get(routingController);
        if (c1436i == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList arrayListM1719B = AbstractC0664e.m1719B(selectedRoutes);
        int i3 = 0;
        C1442o c1442oM1736X = AbstractC0664e.m1736X(AbstractC0050m0.m265c(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f6407a.getString(R.string.mr_dialog_default_group_name);
        C1442o c1442o = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    c1442o = new C1442o(bundle);
                }
            } catch (Exception e3) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e3);
            }
        }
        if (c1442o == null) {
            c1441n = new C1441n(routingController.getId(), string);
            Bundle bundle2 = c1441n.f6383a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            c1441n = new C1441n(c1442o);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = c1441n.f6383a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        c1441n.f6385c.clear();
        c1441n.m3605a(c1442oM1736X.m3608b());
        ArrayList arrayList = c1441n.f6384b;
        arrayList.clear();
        if (!arrayListM1719B.isEmpty()) {
            int size = arrayListM1719B.size();
            while (i3 < size) {
                Object obj = arrayListM1719B.get(i3);
                i3++;
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        C1442o c1442oM3606b = c1441n.m3606b();
        ArrayList arrayListM1719B2 = AbstractC0664e.m1719B(routingController.getSelectableRoutes());
        ArrayList arrayListM1719B3 = AbstractC0664e.m1719B(routingController.getDeselectableRoutes());
        C0471D c0471d = this.f6413g;
        if (c0471d == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<C1442o> list = (List) c0471d.f1566c;
        if (!list.isEmpty()) {
            for (C1442o c1442o2 : list) {
                String strM3610d = c1442o2.m3610d();
                arrayList2.add(new C1445r(c1442o2, arrayListM1719B.contains(strM3610d) ? 3 : 1, arrayListM1719B3.contains(strM3610d), arrayListM1719B2.contains(strM3610d), true));
            }
        }
        c1436i.f6366o = c1442oM3606b;
        c1436i.m3614l(c1442oM3606b, arrayList2);
    }
}
