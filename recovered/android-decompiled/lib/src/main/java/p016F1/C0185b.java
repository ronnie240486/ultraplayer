package p016F1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1267d;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.BinderC1263c;
import com.google.android.gms.internal.cast.BinderC1319q;
import com.google.android.gms.internal.cast.C1166D0;
import com.google.android.gms.internal.cast.C1196K2;
import com.google.android.gms.internal.cast.C1203M1;
import com.google.android.gms.internal.cast.C1209O;
import com.google.android.gms.internal.cast.C1271e;
import com.google.android.gms.internal.cast.C1291j;
import com.google.android.gms.internal.cast.C1299l;
import com.google.android.gms.internal.cast.C1335u;
import com.google.android.gms.internal.cast.C1355z;
import com.google.android.gms.internal.cast.EnumC1272e0;
import com.google.android.gms.internal.cast.InterfaceC1343w;
import com.google.android.gms.internal.cast.InterfaceExecutorServiceC1199L1;
import com.google.android.gms.internal.cast.RunnableC1331t;
import com.google.android.gms.internal.cast.ScheduledExecutorServiceC1219Q1;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p013E1.AbstractC0150y;
import p019G1.AbstractC0230e;
import p028J1.C0296b;
import p028J1.C0311q;
import p028J1.C0313s;
import p034L1.C0348c;
import p037M1.C0392e;
import p037M1.InterfaceC0389b;
import p040N1.C0431l;
import p045P0.AbstractC0462h;
import p046P1.AbstractC0491s;
import p060U1.C0611b;
import p060U1.C0612c;
import p064W.C0650r;
import p075Z1.HandlerC0784e;
import p089d1.C1405E;
import p097f2.C1563g;
import p097f2.InterfaceC1559c;
import p122m1.AbstractC2003a;
import p126n1.C2047b;
import p130o1.C2079a;
import p138q1.C2173i;
import p138q1.C2174j;
import p138q1.C2179o;

/* JADX INFO: renamed from: F1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0185b {

    /* JADX INFO: renamed from: k */
    public static final C0296b f423k = new C0296b("CastContext", null);

    /* JADX INFO: renamed from: l */
    public static final Object f424l = new Object();

    /* JADX INFO: renamed from: m */
    public static volatile C0185b f425m;

    /* JADX INFO: renamed from: a */
    public final Context f426a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0199p f427b;

    /* JADX INFO: renamed from: c */
    public final C0192i f428c;

    /* JADX INFO: renamed from: d */
    public final C0195l f429d;

    /* JADX INFO: renamed from: e */
    public final C0186c f430e;

    /* JADX INFO: renamed from: f */
    public final C0313s f431f;

    /* JADX INFO: renamed from: g */
    public final BinderC1263c f432g;

    /* JADX INFO: renamed from: h */
    public final C1299l f433h;

    /* JADX INFO: renamed from: i */
    public final C1335u f434i;

    /* JADX INFO: renamed from: j */
    public final C1271e f435j;

    public C0185b(Context context, C0186c c0186c, List list, BinderC1319q binderC1319q, C0313s c0313s) {
        C0203t c0203t;
        C0175A c0175a;
        InterfaceC1343w c1196k2;
        final int i3 = 0;
        int i4 = 2;
        final int i5 = 1;
        this.f426a = context;
        this.f430e = c0186c;
        this.f431f = c0313s;
        this.f433h = new C1299l(context);
        this.f434i = binderC1319q.f5957g;
        if (TextUtils.isEmpty(c0186c.f439g)) {
            this.f435j = null;
        } else {
            this.f435j = new C1271e(context, c0186c, binderC1319q);
        }
        HashMap map = new HashMap();
        C1271e c1271e = this.f435j;
        if (c1271e != null) {
            map.put(c1271e.f5837b, c1271e.f5838c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1271e c1271e2 = (C1271e) it.next();
                AbstractC0491s.m1214f(c1271e2, "Additional SessionProvider must not be null.");
                String str = c1271e2.f5837b;
                AbstractC0491s.m1212d(str, "Category for SessionProvider must not be null or empty string.");
                boolean zContainsKey = map.containsKey(str);
                String strM1166f = AbstractC0462h.m1166f("SessionProvider for category ", str, " already added");
                if (zContainsKey) {
                    throw new IllegalArgumentException(String.valueOf(strM1166f));
                }
                map.put(str, c1271e2.f5838c);
            }
        }
        c0186c.f454v = new C0180F(1);
        try {
            InterfaceC0199p interfaceC0199pM3243a = AbstractC1267d.m3243a(context, c0186c, binderC1319q, map);
            this.f427b = interfaceC0199pM3243a;
            try {
                C0197n c0197n = (C0197n) interfaceC0199pM3243a;
                Parcel parcelM1895q0 = c0197n.m1895q0(c0197n.m1894e0(), 6);
                IBinder strongBinder = parcelM1895q0.readStrongBinder();
                if (strongBinder == null) {
                    c0203t = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    c0203t = iInterfaceQueryLocalInterface instanceof C0203t ? (C0203t) iInterfaceQueryLocalInterface : new C0203t(strongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 2);
                }
                parcelM1895q0.recycle();
                this.f429d = new C0195l(c0203t);
                try {
                    C0197n c0197n2 = (C0197n) interfaceC0199pM3243a;
                    Parcel parcelM1895q1 = c0197n2.m1895q0(c0197n2.m1894e0(), 5);
                    IBinder strongBinder2 = parcelM1895q1.readStrongBinder();
                    if (strongBinder2 == null) {
                        c0175a = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        c0175a = iInterfaceQueryLocalInterface2 instanceof C0175A ? (C0175A) iInterfaceQueryLocalInterface2 : new C0175A(strongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 2);
                    }
                    parcelM1895q1.recycle();
                    C0192i c0192i = new C0192i(c0175a, context);
                    this.f428c = c0192i;
                    AbstractC0491s.m1212d("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    C1335u c1335u = this.f434i;
                    if (c1335u != null) {
                        c1335u.f5977f = c0192i;
                        HandlerC0784e handlerC0784e = c1335u.f5974c;
                        AbstractC0491s.m1213e(handlerC0784e);
                        handlerC0784e.post(new RunnableC1331t(c1335u, i5));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
                        c1196k2 = new C1355z(context, executorServiceNewFixedThreadPool instanceof InterfaceExecutorServiceC1199L1 ? (InterfaceExecutorServiceC1199L1) executorServiceNewFixedThreadPool : executorServiceNewFixedThreadPool instanceof ScheduledExecutorService ? new ScheduledExecutorServiceC1219Q1((ScheduledExecutorService) executorServiceNewFixedThreadPool) : new C1203M1(executorServiceNewFixedThreadPool));
                    } else {
                        c1196k2 = new C1196K2();
                    }
                    AbstractC0491s.m1212d("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    c1196k2.mo3178a();
                    BinderC1263c binderC1263c = new BinderC1263c();
                    this.f432g = binderC1263c;
                    try {
                        C0197n c0197n3 = (C0197n) interfaceC0199pM3243a;
                        Parcel parcelM1894e0 = c0197n3.m1894e0();
                        AbstractC1339v.m3422d(parcelM1894e0, binderC1263c);
                        c0197n3.m1896u0(parcelM1894e0, 3);
                        binderC1263c.f5809d.add(this.f433h.f5920a);
                        if (!Collections.unmodifiableList(c0186c.f450r).isEmpty()) {
                            C0296b c0296b = f423k;
                            Log.i(c0296b.f788a, c0296b.m833d("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(this.f430e.f450r))), new Object[0]));
                            C1299l c1299l = this.f433h;
                            List listUnmodifiableList = Collections.unmodifiableList(this.f430e.f450r);
                            c1299l.getClass();
                            C1299l.f5919f.m831b("SetRouteDiscovery for " + listUnmodifiableList.size() + " IDs", new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(AbstractC0230e.m726C((String) it2.next()));
                            }
                            C1299l.f5919f.m831b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(c1299l.f5922c.keySet())), new Object[0]);
                            HashMap map2 = new HashMap();
                            synchronized (c1299l.f5922c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        C1291j c1291j = (C1291j) c1299l.f5922c.get(AbstractC0230e.m726C(str2));
                                        if (c1291j != null) {
                                            map2.put(str2, c1291j);
                                        }
                                    }
                                    c1299l.f5922c.clear();
                                    c1299l.f5922c.putAll(map2);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            C1299l.f5919f.m831b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(c1299l.f5922c.keySet())), new Object[0]);
                            synchronized (c1299l.f5923d) {
                                c1299l.f5923d.clear();
                                c1299l.f5923d.addAll(linkedHashSet);
                            }
                            c1299l.m3273m();
                        }
                        c0313s.m858d(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).m3885b(new InterfaceC1559c(this) { // from class: F1.D

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ C0185b f413h;

                            {
                                this.f413h = this;
                            }

                            @Override // p097f2.InterfaceC1559c
                            /* JADX INFO: renamed from: j */
                            public final void mo649j(Object obj) {
                                Set setSingleton;
                                byte[] bytes;
                                C1166D0 c1166d0;
                                EnumC1272e0 enumC1272e0M3124b;
                                switch (i3) {
                                    case 0:
                                        C0185b c0185b = this.f413h;
                                        Bundle bundle = (Bundle) obj;
                                        if (C1209O.f5668j) {
                                            Context context2 = c0185b.f426a;
                                            C0313s c0313s2 = c0185b.f431f;
                                            C1209O c1209o = new C1209O(context2, c0313s2, c0185b.f428c, c0185b.f434i, c0185b.f432g);
                                            int i6 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
                                            boolean z3 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                                            if (i6 == 0) {
                                                if (!z3) {
                                                    return;
                                                }
                                                i6 = 0;
                                                z3 = true;
                                            }
                                            String packageName = context2.getPackageName();
                                            Locale locale = Locale.ROOT;
                                            String str3 = packageName + ".client_cast_analytics_data";
                                            c1209o.f5676h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
                                            C2179o.m4763b(context2);
                                            C2179o c2179oM4762a = C2179o.m4762a();
                                            C2079a c2079a = C2079a.f9032e;
                                            c2179oM4762a.getClass();
                                            if (c2079a != null) {
                                                c2079a.getClass();
                                                setSingleton = Collections.unmodifiableSet(C2079a.f9031d);
                                            } else {
                                                setSingleton = Collections.singleton(new C2047b("proto"));
                                            }
                                            C2173i c2173iM4761a = C2174j.m4761a();
                                            c2079a.getClass();
                                            c2173iM4761a.f9388h = "cct";
                                            String str4 = c2079a.f9033a;
                                            String str5 = c2079a.f9034b;
                                            if (str5 == null && str4 == null) {
                                                bytes = null;
                                            } else {
                                                if (str5 == null) {
                                                    str5 = "";
                                                }
                                                bytes = ("1$" + str4 + "\\" + str5).getBytes(Charset.forName("UTF-8"));
                                            }
                                            c2173iM4761a.f9389i = bytes;
                                            C2174j c2174jM4759a = c2173iM4761a.m4759a();
                                            C2047b c2047b = new C2047b("proto");
                                            if (!setSingleton.contains(c2047b)) {
                                                throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2047b, setSingleton));
                                            }
                                            c1209o.f5675g = new C2173i(c2174jM4759a, c2047b, c2179oM4762a, 1);
                                            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                                                c1209o.f5673e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                                            }
                                            SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences(str3, 0);
                                            if (i6 != 0) {
                                                C0431l c0431lM1132b = C0431l.m1132b();
                                                c0431lM1132b.f1464d = new C0311q(c0313s2, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 0);
                                                c0431lM1132b.f1461a = new C0348c[]{AbstractC0150y.f354c};
                                                c0431lM1132b.f1462b = false;
                                                c0431lM1132b.f1463c = 8426;
                                                C1563g c1563gM1079c = c0313s2.m1079c(0, c0431lM1132b.m1133a());
                                                C0650r c0650r = new C0650r();
                                                c0650r.f2514h = c1209o;
                                                c0650r.f2515i = packageName;
                                                c0650r.f2513g = i6;
                                                c0650r.f2516j = sharedPreferences;
                                                c1563gM1079c.m3885b(c0650r);
                                            }
                                            if (z3) {
                                                AbstractC0491s.m1213e(sharedPreferences);
                                                C0296b c0296b2 = C1166D0.f5593i;
                                                synchronized (C1166D0.class) {
                                                    try {
                                                        if (C1166D0.f5595k == null) {
                                                            C1166D0.f5595k = new C1166D0(sharedPreferences, c1209o, packageName);
                                                        }
                                                        c1166d0 = C1166D0.f5595k;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                HashSet hashSet = c1166d0.f5601f;
                                                SharedPreferences sharedPreferences2 = c1166d0.f5597b;
                                                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                                                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                                                hashSet.clear();
                                                HashSet hashSet2 = c1166d0.f5602g;
                                                hashSet2.clear();
                                                c1166d0.f5603h = 0L;
                                                String str6 = C1166D0.f5594j;
                                                boolean zEquals = str6.equals(string);
                                                String str7 = c1166d0.f5598c;
                                                if (zEquals && str7.equals(string2)) {
                                                    c1166d0.f5603h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    HashSet hashSet3 = new HashSet();
                                                    for (String str8 : sharedPreferences2.getAll().keySet()) {
                                                        if (str8.startsWith("feature_usage_timestamp_")) {
                                                            long j3 = sharedPreferences2.getLong(str8, 0L);
                                                            if (j3 != 0 && jCurrentTimeMillis - j3 > 1209600000) {
                                                                hashSet3.add(str8);
                                                            } else if (str8.startsWith("feature_usage_timestamp_reported_feature_")) {
                                                                EnumC1272e0 enumC1272e0M3124b2 = C1166D0.m3124b(str8.substring(41));
                                                                if (enumC1272e0M3124b2 != null) {
                                                                    hashSet2.add(enumC1272e0M3124b2);
                                                                    hashSet.add(enumC1272e0M3124b2);
                                                                }
                                                            } else if (str8.startsWith("feature_usage_timestamp_detected_feature_") && (enumC1272e0M3124b = C1166D0.m3124b(str8.substring(41))) != null) {
                                                                hashSet.add(enumC1272e0M3124b);
                                                            }
                                                        }
                                                    }
                                                    c1166d0.m3125c(hashSet3);
                                                    AbstractC0491s.m1213e(c1166d0.f5600e);
                                                    AbstractC0491s.m1213e(c1166d0.f5599d);
                                                    c1166d0.f5600e.post(c1166d0.f5599d);
                                                } else {
                                                    HashSet hashSet4 = new HashSet();
                                                    for (String str9 : sharedPreferences2.getAll().keySet()) {
                                                        if (str9.startsWith("feature_usage_timestamp_")) {
                                                            hashSet4.add(str9);
                                                        }
                                                    }
                                                    hashSet4.add("feature_usage_last_report_time");
                                                    c1166d0.m3125c(hashSet4);
                                                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str6).putString("feature_usage_package_name", str7).apply();
                                                }
                                                C1166D0.m3123a(EnumC1272e0.CAST_CONTEXT);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        this.f413h.getClass();
                                        AbstractC2003a.m4551x("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
                                        return;
                                }
                            }
                        });
                        C0431l c0431lM1132b = C0431l.m1132b();
                        c0431lM1132b.f1464d = new C0311q(c0313s, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, i4);
                        c0431lM1132b.f1461a = new C0348c[]{AbstractC0150y.f355d};
                        c0431lM1132b.f1462b = false;
                        c0431lM1132b.f1463c = 8427;
                        c0313s.m1079c(0, c0431lM1132b.m1133a()).m3885b(new InterfaceC1559c(this) { // from class: F1.D

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ C0185b f413h;

                            {
                                this.f413h = this;
                            }

                            @Override // p097f2.InterfaceC1559c
                            /* JADX INFO: renamed from: j */
                            public final void mo649j(Object obj) {
                                Set setSingleton;
                                byte[] bytes;
                                C1166D0 c1166d0;
                                EnumC1272e0 enumC1272e0M3124b;
                                switch (i5) {
                                    case 0:
                                        C0185b c0185b = this.f413h;
                                        Bundle bundle = (Bundle) obj;
                                        if (C1209O.f5668j) {
                                            Context context2 = c0185b.f426a;
                                            C0313s c0313s2 = c0185b.f431f;
                                            C1209O c1209o = new C1209O(context2, c0313s2, c0185b.f428c, c0185b.f434i, c0185b.f432g);
                                            int i6 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
                                            boolean z3 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                                            if (i6 == 0) {
                                                if (!z3) {
                                                    return;
                                                }
                                                i6 = 0;
                                                z3 = true;
                                            }
                                            String packageName = context2.getPackageName();
                                            Locale locale = Locale.ROOT;
                                            String str3 = packageName + ".client_cast_analytics_data";
                                            c1209o.f5676h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
                                            C2179o.m4763b(context2);
                                            C2179o c2179oM4762a = C2179o.m4762a();
                                            C2079a c2079a = C2079a.f9032e;
                                            c2179oM4762a.getClass();
                                            if (c2079a != null) {
                                                c2079a.getClass();
                                                setSingleton = Collections.unmodifiableSet(C2079a.f9031d);
                                            } else {
                                                setSingleton = Collections.singleton(new C2047b("proto"));
                                            }
                                            C2173i c2173iM4761a = C2174j.m4761a();
                                            c2079a.getClass();
                                            c2173iM4761a.f9388h = "cct";
                                            String str4 = c2079a.f9033a;
                                            String str5 = c2079a.f9034b;
                                            if (str5 == null && str4 == null) {
                                                bytes = null;
                                            } else {
                                                if (str5 == null) {
                                                    str5 = "";
                                                }
                                                bytes = ("1$" + str4 + "\\" + str5).getBytes(Charset.forName("UTF-8"));
                                            }
                                            c2173iM4761a.f9389i = bytes;
                                            C2174j c2174jM4759a = c2173iM4761a.m4759a();
                                            C2047b c2047b = new C2047b("proto");
                                            if (!setSingleton.contains(c2047b)) {
                                                throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2047b, setSingleton));
                                            }
                                            c1209o.f5675g = new C2173i(c2174jM4759a, c2047b, c2179oM4762a, 1);
                                            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                                                c1209o.f5673e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                                            }
                                            SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences(str3, 0);
                                            if (i6 != 0) {
                                                C0431l c0431lM1132b2 = C0431l.m1132b();
                                                c0431lM1132b2.f1464d = new C0311q(c0313s2, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 0);
                                                c0431lM1132b2.f1461a = new C0348c[]{AbstractC0150y.f354c};
                                                c0431lM1132b2.f1462b = false;
                                                c0431lM1132b2.f1463c = 8426;
                                                C1563g c1563gM1079c = c0313s2.m1079c(0, c0431lM1132b2.m1133a());
                                                C0650r c0650r = new C0650r();
                                                c0650r.f2514h = c1209o;
                                                c0650r.f2515i = packageName;
                                                c0650r.f2513g = i6;
                                                c0650r.f2516j = sharedPreferences;
                                                c1563gM1079c.m3885b(c0650r);
                                            }
                                            if (z3) {
                                                AbstractC0491s.m1213e(sharedPreferences);
                                                C0296b c0296b2 = C1166D0.f5593i;
                                                synchronized (C1166D0.class) {
                                                    try {
                                                        if (C1166D0.f5595k == null) {
                                                            C1166D0.f5595k = new C1166D0(sharedPreferences, c1209o, packageName);
                                                        }
                                                        c1166d0 = C1166D0.f5595k;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                HashSet hashSet = c1166d0.f5601f;
                                                SharedPreferences sharedPreferences2 = c1166d0.f5597b;
                                                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                                                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                                                hashSet.clear();
                                                HashSet hashSet2 = c1166d0.f5602g;
                                                hashSet2.clear();
                                                c1166d0.f5603h = 0L;
                                                String str6 = C1166D0.f5594j;
                                                boolean zEquals = str6.equals(string);
                                                String str7 = c1166d0.f5598c;
                                                if (zEquals && str7.equals(string2)) {
                                                    c1166d0.f5603h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    HashSet hashSet3 = new HashSet();
                                                    for (String str8 : sharedPreferences2.getAll().keySet()) {
                                                        if (str8.startsWith("feature_usage_timestamp_")) {
                                                            long j3 = sharedPreferences2.getLong(str8, 0L);
                                                            if (j3 != 0 && jCurrentTimeMillis - j3 > 1209600000) {
                                                                hashSet3.add(str8);
                                                            } else if (str8.startsWith("feature_usage_timestamp_reported_feature_")) {
                                                                EnumC1272e0 enumC1272e0M3124b2 = C1166D0.m3124b(str8.substring(41));
                                                                if (enumC1272e0M3124b2 != null) {
                                                                    hashSet2.add(enumC1272e0M3124b2);
                                                                    hashSet.add(enumC1272e0M3124b2);
                                                                }
                                                            } else if (str8.startsWith("feature_usage_timestamp_detected_feature_") && (enumC1272e0M3124b = C1166D0.m3124b(str8.substring(41))) != null) {
                                                                hashSet.add(enumC1272e0M3124b);
                                                            }
                                                        }
                                                    }
                                                    c1166d0.m3125c(hashSet3);
                                                    AbstractC0491s.m1213e(c1166d0.f5600e);
                                                    AbstractC0491s.m1213e(c1166d0.f5599d);
                                                    c1166d0.f5600e.post(c1166d0.f5599d);
                                                } else {
                                                    HashSet hashSet4 = new HashSet();
                                                    for (String str9 : sharedPreferences2.getAll().keySet()) {
                                                        if (str9.startsWith("feature_usage_timestamp_")) {
                                                            hashSet4.add(str9);
                                                        }
                                                    }
                                                    hashSet4.add("feature_usage_last_report_time");
                                                    c1166d0.m3125c(hashSet4);
                                                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str6).putString("feature_usage_package_name", str7).apply();
                                                }
                                                C1166D0.m3123a(EnumC1272e0.CAST_CONTEXT);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        this.f413h.getClass();
                                        AbstractC2003a.m4551x("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
                                        return;
                                }
                            }
                        });
                    } catch (RemoteException e3) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e3);
                    }
                } catch (RemoteException e4) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e4);
                }
            } catch (RemoteException e5) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e5);
            }
        } catch (RemoteException e6) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e6);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0185b m670a(Context context) {
        AbstractC0491s.m1210b();
        if (f425m == null) {
            synchronized (f424l) {
                if (f425m == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC0189f interfaceC0189fM671b = m671b(applicationContext);
                    C0186c castOptions = interfaceC0189fM671b.getCastOptions(applicationContext);
                    C0313s c0313s = new C0313s(applicationContext, C0313s.f840j, InterfaceC0389b.f1344a, C0392e.f1346c);
                    try {
                        f425m = new C0185b(applicationContext, castOptions, interfaceC0189fM671b.getAdditionalSessionProviders(applicationContext), new BinderC1319q(applicationContext, C1405E.m3512d(applicationContext), castOptions, c0313s), c0313s);
                    } catch (C0188e e3) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        }
        return f425m;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0189f m671b(Context context) {
        try {
            C0611b c0611bM1534a = C0612c.m1534a(context);
            try {
                Bundle bundle = c0611bM1534a.f2316a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    f423k.m832c(new Object[0]);
                }
                String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
                if (string != null) {
                    return (InterfaceC0189f) Class.forName(string).asSubclass(InterfaceC0189f.class).getDeclaredConstructor(null).newInstance(null);
                }
                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            } catch (ClassNotFoundException e3) {
                e = e3;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (IllegalAccessException e4) {
                e = e4;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (InstantiationException e5) {
                e = e5;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (NullPointerException e7) {
                e = e7;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (InvocationTargetException e8) {
                e = e8;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e9) {
            e = e9;
        }
    }
}
