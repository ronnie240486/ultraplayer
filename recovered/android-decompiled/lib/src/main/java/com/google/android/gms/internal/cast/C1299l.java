package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p013E1.AbstractC0150y;
import p019G1.AbstractC0230e;
import p028J1.C0296b;
import p075Z1.HandlerC0784e;
import p089d1.AbstractC1452y;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1451x;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1299l extends AbstractC1452y {

    /* JADX INFO: renamed from: f */
    public static final C0296b f5919f = new C0296b("MRDiscoveryCallback", null);

    /* JADX INFO: renamed from: e */
    public final C1323r f5924e;

    /* JADX INFO: renamed from: c */
    public final Map f5922c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f5923d = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final Set f5921b = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: a */
    public final C1295k f5920a = new C1295k(this);

    public C1299l(Context context) {
        this.f5924e = new C1323r(context, 0);
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: d */
    public final void mo2604d(C1403C c1403c) {
        f5919f.m831b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        m3275o(c1403c, true);
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: e */
    public final void mo2605e(C1403C c1403c) {
        f5919f.m831b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        m3275o(c1403c, true);
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: f */
    public final void mo2606f(C1403C c1403c) {
        f5919f.m831b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        m3275o(c1403c, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m3273m() {
        int size = this.f5923d.size();
        C0296b c0296b = f5919f;
        c0296b.m831b("Starting RouteDiscovery with " + size + " IDs", new Object[0]);
        c0296b.m831b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f5922c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m3274n();
        } else {
            new HandlerC0784e(Looper.getMainLooper(), 3).post(new RunnableC1287i(this, 1));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3274n() {
        C1323r c1323r = this.f5924e;
        if (((C1405E) c1323r.f5962i) == null) {
            c1323r.f5962i = C1405E.m3512d((Context) c1323r.f5961h);
        }
        C1405E c1405e = (C1405E) c1323r.f5962i;
        if (c1405e != null) {
            c1405e.m3518h(this);
        }
        synchronized (this.f5923d) {
            try {
                for (String str : this.f5923d) {
                    String strM606a = AbstractC0150y.m606a(str);
                    if (strM606a == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(strM606a)) {
                        arrayList.add(strM606a);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    C1451x c1451x = new C1451x(bundle, arrayList);
                    if (((C1291j) this.f5922c.get(str)) == null) {
                        this.f5922c.put(str, new C1291j(c1451x));
                    }
                    f5919f.m831b("Adding mediaRouter callback for control category " + AbstractC0150y.m606a(str), new Object[0]);
                    C1323r c1323r2 = this.f5924e;
                    if (((C1405E) c1323r2.f5962i) == null) {
                        c1323r2.f5962i = C1405E.m3512d((Context) c1323r2.f5961h);
                    }
                    ((C1405E) c1323r2.f5962i).m3517a(c1451x, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f5919f.m831b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f5922c.keySet())), new Object[0]);
    }

    /* JADX INFO: renamed from: o */
    public final void m3275o(C1403C c1403c, boolean z3) {
        boolean z4;
        Set setM3148k;
        boolean zRemove;
        C0296b c0296b = f5919f;
        c0296b.m831b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z3), c1403c);
        synchronized (this.f5922c) {
            try {
                c0296b.m831b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f5922c.keySet())), new Object[0]);
                z4 = false;
                for (Map.Entry entry : this.f5922c.entrySet()) {
                    String str = (String) entry.getKey();
                    C1291j c1291j = (C1291j) entry.getValue();
                    if (c1403c.m3498h(c1291j.f5917b)) {
                        if (z3) {
                            C0296b c0296b2 = f5919f;
                            c0296b2.m831b("Adding/updating route for appId " + str, new Object[0]);
                            zRemove = c1291j.f5916a.add(c1403c);
                            if (!zRemove) {
                                Log.w(c0296b2.f788a, c0296b2.m833d("Route " + String.valueOf(c1403c) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            C0296b c0296b3 = f5919f;
                            c0296b3.m831b("Removing route for appId " + str, new Object[0]);
                            zRemove = c1291j.f5916a.remove(c1403c);
                            if (!zRemove) {
                                Log.w(c0296b3.f788a, c0296b3.m833d("Route " + String.valueOf(c1403c) + " already removed from appId " + str, new Object[0]));
                            }
                        }
                        z4 = zRemove;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            f5919f.m831b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.f5921b) {
                try {
                    HashMap map = new HashMap();
                    synchronized (this.f5922c) {
                        try {
                            for (String str2 : this.f5922c.keySet()) {
                                C1291j c1291j2 = (C1291j) this.f5922c.get(AbstractC0230e.m726C(str2));
                                if (c1291j2 == null) {
                                    int i3 = AbstractC1189J.f5642i;
                                    setM3148k = C1228T.f5705p;
                                } else {
                                    LinkedHashSet linkedHashSet = c1291j2.f5916a;
                                    int i4 = AbstractC1189J.f5642i;
                                    Object[] array = linkedHashSet.toArray();
                                    setM3148k = AbstractC1189J.m3148k(array.length, array);
                                }
                                if (!setM3148k.isEmpty()) {
                                    map.put(str2, setM3148k);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C1224S.m3192a(map.entrySet());
                    Iterator it = this.f5921b.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
