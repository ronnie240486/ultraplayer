package p040N1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1152a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p009D0.C0106b;
import p034L1.C0346a;
import p034L1.C0349d;
import p037M1.AbstractC0393f;
import p037M1.InterfaceC0390c;
import p046P1.C0470C;
import p046P1.C0476d;
import p046P1.C0480h;
import p046P1.C0481i;
import p046P1.C0482j;
import p051R1.C0523b;
import p060U1.AbstractC0610a;
import p066W1.AbstractC0664e;
import p075Z1.AbstractC0783d;
import p075Z1.HandlerC0784e;
import p079a2.AbstractC0854c;
import p097f2.C1560d;
import p097f2.C1562f;
import p097f2.C1563g;
import p124n.C2019f;

/* JADX INFO: renamed from: N1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0424e implements Handler.Callback {

    /* JADX INFO: renamed from: u */
    public static final Status f1441u = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: v */
    public static final Status f1442v = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: w */
    public static final Object f1443w = new Object();

    /* JADX INFO: renamed from: x */
    public static C0424e f1444x;

    /* JADX INFO: renamed from: g */
    public long f1445g;

    /* JADX INFO: renamed from: h */
    public boolean f1446h;

    /* JADX INFO: renamed from: i */
    public C0482j f1447i;

    /* JADX INFO: renamed from: j */
    public C0523b f1448j;

    /* JADX INFO: renamed from: k */
    public final Context f1449k;

    /* JADX INFO: renamed from: l */
    public final C0349d f1450l;

    /* JADX INFO: renamed from: m */
    public final C0106b f1451m;

    /* JADX INFO: renamed from: n */
    public final AtomicInteger f1452n;

    /* JADX INFO: renamed from: o */
    public final AtomicInteger f1453o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentHashMap f1454p;

    /* JADX INFO: renamed from: q */
    public final C2019f f1455q;

    /* JADX INFO: renamed from: r */
    public final C2019f f1456r;

    /* JADX INFO: renamed from: s */
    public final HandlerC0784e f1457s;

    /* JADX INFO: renamed from: t */
    public volatile boolean f1458t;

    public C0424e(Context context, Looper looper) {
        C0349d c0349d = C0349d.f1132d;
        this.f1445g = 10000L;
        this.f1446h = false;
        this.f1452n = new AtomicInteger(1);
        this.f1453o = new AtomicInteger(0);
        this.f1454p = new ConcurrentHashMap(5, 0.75f, 1);
        this.f1455q = new C2019f(0);
        this.f1456r = new C2019f(0);
        this.f1458t = true;
        this.f1449k = context;
        HandlerC0784e handlerC0784e = new HandlerC0784e(looper, this);
        Looper.getMainLooper();
        this.f1457s = handlerC0784e;
        this.f1450l = c0349d;
        this.f1451m = new C0106b(12);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0610a.f2308f == null) {
            AbstractC0610a.f2308f = Boolean.valueOf(AbstractC0664e.m1720C() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC0610a.f2308f.booleanValue()) {
            this.f1458t = false;
        }
        handlerC0784e.sendMessage(handlerC0784e.obtainMessage(6));
    }

    /* JADX INFO: renamed from: c */
    public static Status m1123c(C0421b c0421b, C0346a c0346a) {
        return new Status(17, "API: " + ((String) c0421b.f1433b.f141i) + " is not available on this device. Connection failed with: " + String.valueOf(c0346a), c0346a.f1123i, c0346a);
    }

    /* JADX INFO: renamed from: f */
    public static C0424e m1124f(Context context) {
        C0424e c0424e;
        synchronized (f1443w) {
            try {
                if (f1444x == null) {
                    Looper looper = C0470C.m1180a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C0349d.f1131c;
                    f1444x = new C0424e(applicationContext, looper);
                }
                c0424e = f1444x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0424e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1125a() {
        if (this.f1446h) {
            return false;
        }
        C0481i c0481i = (C0481i) C0480h.m1197b().f1607a;
        if (c0481i != null && !c0481i.f1609h) {
            return false;
        }
        int i3 = ((SparseIntArray) this.f1451m.f140h).get(203400000, -1);
        return i3 == -1 || i3 == 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1126b(C0346a c0346a, int i3) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        C0349d c0349d = this.f1450l;
        Context context = this.f1449k;
        c0349d.getClass();
        synchronized (AbstractC0610a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC0610a.f2303a;
            if (context2 == null || (bool = AbstractC0610a.f2304b) == null || context2 != applicationContext) {
                AbstractC0610a.f2304b = null;
                if (AbstractC0664e.m1720C()) {
                    AbstractC0610a.f2304b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        AbstractC0610a.f2304b = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        AbstractC0610a.f2304b = Boolean.FALSE;
                    }
                }
                AbstractC0610a.f2303a = applicationContext;
                zBooleanValue = AbstractC0610a.f2304b.booleanValue();
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i4 = c0346a.f1122h;
        if (i4 == 0 || (activity = c0346a.f1123i) == null) {
            Intent intentM957a = c0349d.m957a(i4, context, null);
            activity = intentM957a != null ? PendingIntent.getActivity(context, 0, intentM957a, AbstractC0854c.f3615a | 134217728) : null;
        }
        if (activity == null) {
            return false;
        }
        int i5 = c0346a.f1122h;
        int i6 = GoogleApiActivity.f5490h;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i3);
        intent.putExtra("notify_manager", true);
        c0349d.m955f(context, i5, PendingIntent.getActivity(context, 0, intent, AbstractC0783d.f3194a | 134217728));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final C0435p m1127d(AbstractC0393f abstractC0393f) {
        ConcurrentHashMap concurrentHashMap = this.f1454p;
        C0421b c0421b = abstractC0393f.f1353e;
        C0435p c0435p = (C0435p) concurrentHashMap.get(c0421b);
        if (c0435p == null) {
            c0435p = new C0435p(this, abstractC0393f);
            concurrentHashMap.put(c0421b, c0435p);
        }
        if (c0435p.f1469c.mo1075k()) {
            this.f1456r.add(c0421b);
        }
        c0435p.m1144k();
        return c0435p;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX INFO: renamed from: e */
    public final void m1128e(C1560d c1560d, int i3, AbstractC0393f abstractC0393f) {
        C0441v c0441v;
        C0424e c0424e;
        if (i3 != 0) {
            C0421b c0421b = abstractC0393f.f1353e;
            if (m1125a()) {
                C0481i c0481i = (C0481i) C0480h.m1197b().f1607a;
                boolean z3 = true;
                if (c0481i != null) {
                    if (c0481i.f1609h) {
                        C0435p c0435p = (C0435p) this.f1454p.get(c0421b);
                        if (c0435p != null) {
                            InterfaceC0390c interfaceC0390c = c0435p.f1469c;
                            if (interfaceC0390c instanceof AbstractC1152a) {
                                AbstractC1152a abstractC1152a = (AbstractC1152a) interfaceC0390c;
                                if (abstractC1152a.f5535v == null || abstractC1152a.mo1066a()) {
                                    z3 = c0481i.f1610i;
                                } else {
                                    C0476d c0476dM1153a = C0441v.m1153a(c0435p, abstractC1152a, i3);
                                    if (c0476dM1153a != null) {
                                        c0435p.f1479m++;
                                        z3 = c0476dM1153a.f1576i;
                                    }
                                }
                            }
                        } else {
                            z3 = c0481i.f1610i;
                        }
                    }
                    c0441v = null;
                    c0424e = this;
                }
                c0424e = this;
                c0441v = new C0441v(c0424e, i3, c0421b, z3 ? System.currentTimeMillis() : 0L, z3 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                c0441v = null;
                c0424e = this;
            }
            if (c0441v != null) {
                C1563g c1563g = c1560d.f7065a;
                HandlerC0784e handlerC0784e = c0424e.f1457s;
                handlerC0784e.getClass();
                ExecutorC0433n executorC0433n = new ExecutorC0433n(0, handlerC0784e);
                c1563g.getClass();
                c1563g.f7072b.m2058e(new C1562f(executorC0433n, c0441v));
                c1563g.m3891h();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1129g(C0346a c0346a, int i3) {
        if (m1126b(c0346a, i3)) {
            return;
        }
        HandlerC0784e handlerC0784e = this.f1457s;
        handlerC0784e.sendMessage(handlerC0784e.obtainMessage(5, i3, 0, c0346a));
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0396  */
    /* JADX WARN: Code duplicated, block: B:166:0x039c  */
    /* JADX WARN: Code duplicated, block: B:168:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:170:0x03d2  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 N1.p, still in use, count: 2, list:
          (r2v9 N1.p) from 0x038e: IGET (r2v9 N1.p) A[WRAPPED] (LINE:911) N1.p.h int
          (r2v9 N1.p) from 0x0394: PHI (r2 I:??) = (r2v6 N1.p), (r2v9 N1.p) binds: [B:162:0x0393, B:217:0x0394] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p040N1.C0424e.handleMessage(android.os.Message):boolean");
    }
}
