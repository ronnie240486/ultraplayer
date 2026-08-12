package com.google.android.gms.internal.cast;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p028J1.C0296b;
import p136q.AbstractC2136s;
import p136q.C2137t;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1355z implements InterfaceC1343w {

    /* JADX INFO: renamed from: j */
    public static final C0296b f5994j = new C0296b("ConnectivityMonitor", null);

    /* JADX INFO: renamed from: a */
    public final InterfaceExecutorServiceC1199L1 f5995a;

    /* JADX INFO: renamed from: c */
    public final ConnectivityManager f5997c;

    /* JADX INFO: renamed from: f */
    public boolean f6000f;

    /* JADX INFO: renamed from: g */
    public final Context f6001g;

    /* JADX INFO: renamed from: h */
    public final Object f6002h = new Object();

    /* JADX INFO: renamed from: i */
    public final Set f6003i = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: d */
    public final Map f5998d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e */
    public final List f5999e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b */
    public final C1351y f5996b = new C1351y(0, this);

    public C1355z(Context context, InterfaceExecutorServiceC1199L1 interfaceExecutorServiceC1199L1) {
        this.f5995a = interfaceExecutorServiceC1199L1;
        this.f6001g = context;
        this.f5997c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1343w
    /* JADX INFO: renamed from: a */
    public final void mo3178a() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        boolean zM4710a;
        int iCheckPermission = 0;
        f5994j.m831b("Start monitoring connectivity changes", new Object[0]);
        if (this.f6000f || (connectivityManager = this.f5997c) == null) {
            return;
        }
        Context context = this.f6001g;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) {
            iCheckPermission = context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
        } else {
            C2137t c2137t = new C2137t(context);
            if (i3 >= 24) {
                zM4710a = AbstractC2136s.m4710a(c2137t.f9202a);
            } else {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i4 = applicationInfo.uid;
                try {
                    Class<?> cls = Class.forName(AppOpsManager.class.getName());
                    Class<?> cls2 = Integer.TYPE;
                    Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                    Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                    num.getClass();
                    zM4710a = ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i4), packageName)).intValue() == 0;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                }
            }
            if (!zM4710a) {
                iCheckPermission = -1;
            }
        }
        if (iCheckPermission == 0) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                m3441b(activeNetwork, linkProperties);
            }
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), this.f5996b);
            this.f6000f = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3441b(Network network, LinkProperties linkProperties) {
        synchronized (this.f6002h) {
            try {
                if (this.f5998d != null && this.f5999e != null) {
                    f5994j.m831b("a new network is available", new Object[0]);
                    if (this.f5998d.containsKey(network)) {
                        this.f5999e.remove(network);
                    }
                    this.f5998d.put(network, linkProperties);
                    this.f5999e.add(network);
                    m3442c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3442c() {
        if (this.f5995a == null) {
            return;
        }
        synchronized (this.f6003i) {
            try {
                Iterator it = this.f6003i.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (!((C1203M1) this.f5995a).f5660g.isShutdown()) {
                        ((C1203M1) this.f5995a).execute(new RunnableC1347x(0, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
