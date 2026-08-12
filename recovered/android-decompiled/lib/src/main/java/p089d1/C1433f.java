package p089d1;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.C0885u;
import android.util.Log;
import androidx.activity.RunnableC0892b;
import androidx.emoji2.text.C0925o;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.C1311o;
import com.google.android.gms.internal.cast.RunnableC1307n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p014F.RunnableC0153b;
import p036M0.C0370g;
import p040N1.ExecutorC0433n;
import p044P.AbstractC0454f;
import p046P1.C0471D;
import p064W.C0649q;
import p077a0.C0834j0;
import p085c0.ExecutorC1148x;
import p128o.AbstractC2056g;
import p128o.C2051b;
import p128o.C2052c;
import p128o.C2057h;
import p128o.C2058i;
import p128o.C2059j;
import p128o.C2060k;
import p140r.AbstractC2183c;
import p168z.C2388b;

/* JADX INFO: renamed from: d1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1433f {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ int f6324F = 0;

    /* JADX INFO: renamed from: A */
    public C1443p f6325A;

    /* JADX INFO: renamed from: B */
    public int f6326B;

    /* JADX INFO: renamed from: C */
    public C0858A f6327C;

    /* JADX INFO: renamed from: D */
    public C0858A f6328D;

    /* JADX INFO: renamed from: E */
    public final C1428b f6329E;

    /* JADX INFO: renamed from: c */
    public final C1427a0 f6332c;

    /* JADX INFO: renamed from: d */
    public C1403C f6333d;

    /* JADX INFO: renamed from: e */
    public AbstractC1448u f6334e;

    /* JADX INFO: renamed from: f */
    public C1311o f6335f;

    /* JADX INFO: renamed from: g */
    public C1401A f6336g;

    /* JADX INFO: renamed from: h */
    public final Context f6337h;

    /* JADX INFO: renamed from: n */
    public final C0370g f6343n;

    /* JADX INFO: renamed from: o */
    public final C1428b f6344o;

    /* JADX INFO: renamed from: p */
    public final boolean f6345p;

    /* JADX INFO: renamed from: q */
    public final boolean f6346q;

    /* JADX INFO: renamed from: r */
    public C1440m f6347r;

    /* JADX INFO: renamed from: s */
    public final C1416P f6348s;

    /* JADX INFO: renamed from: t */
    public final C0834j0 f6349t;

    /* JADX INFO: renamed from: u */
    public C1406F f6350u;

    /* JADX INFO: renamed from: v */
    public C1403C f6351v;

    /* JADX INFO: renamed from: w */
    public C1403C f6352w;

    /* JADX INFO: renamed from: x */
    public C1403C f6353x;

    /* JADX INFO: renamed from: y */
    public AbstractC1446s f6354y;

    /* JADX INFO: renamed from: z */
    public C1443p f6355z;

    /* JADX INFO: renamed from: a */
    public final HandlerC1430c f6330a = new HandlerC1430c(this);

    /* JADX INFO: renamed from: b */
    public final HashMap f6331b = new HashMap();

    /* JADX INFO: renamed from: i */
    public final ArrayList f6338i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f6339j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final HashMap f6340k = new HashMap();

    /* JADX INFO: renamed from: l */
    public final ArrayList f6341l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public final ArrayList f6342m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0086  */
    public C1433f(Context context) {
        boolean z3;
        C0370g c0370g = new C0370g();
        c0370g.f1188d = 0;
        c0370g.f1189e = 3;
        this.f6343n = c0370g;
        this.f6344o = new C1428b(this);
        this.f6329E = new C1428b(this);
        this.f6337h = context;
        this.f6345p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            int i4 = AbstractC1411K.f6248a;
            Intent intent = new Intent(context, (Class<?>) AbstractC1411K.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        this.f6346q = z3;
        int i5 = AbstractC1429b0.f6317a;
        Intent intent2 = new Intent(context, (Class<?>) AbstractC1429b0.class);
        intent2.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
        this.f6347r = (i3 < 30 || !z3) ? null : new C1440m(context, new C1428b(this));
        C1416P c1412l = i3 >= 24 ? new C1412L(context, this) : new C1416P(context, this);
        this.f6348s = c1412l;
        this.f6349t = new C0834j0(new RunnableC0892b(13, this));
        m3573a(c1412l, true);
        AbstractC1449v abstractC1449v = this.f6347r;
        if (abstractC1449v != null) {
            m3573a(abstractC1449v, true);
        }
        C1427a0 c1427a0 = new C1427a0(context, this);
        this.f6332c = c1427a0;
        if (c1427a0.f6308a) {
            return;
        }
        c1427a0.f6308a = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        Handler handler = (Handler) c1427a0.f6311d;
        ((Context) c1427a0.f6309b).registerReceiver((C0649q) c1427a0.f6314g, intentFilter, null, handler);
        handler.post((RunnableC0153b) c1427a0.f6315h);
    }

    /* JADX INFO: renamed from: a */
    public final void m3573a(AbstractC1449v abstractC1449v, boolean z3) {
        if (m3576d(abstractC1449v) == null) {
            C1402B c1402b = new C1402B(abstractC1449v, z3);
            this.f6341l.add(c1402b);
            this.f6330a.m3572b(513, c1402b);
            m3585m(c1402b, abstractC1449v.f6413g);
            C1405E.m3510b();
            abstractC1449v.f6410d = this.f6344o;
            abstractC1449v.m3631h(this.f6355z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m3574b(C1402B c1402b, String str) {
        String str2;
        String strFlattenToShortString = ((ComponentName) c1402b.f6214d.f6406h).flattenToShortString();
        boolean z3 = c1402b.f6213c;
        if (z3) {
            str2 = str;
        } else {
            str2 = strFlattenToShortString + ":" + str;
        }
        HashMap map = this.f6340k;
        if (!z3) {
            ArrayList arrayList = this.f6339j;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((C1403C) arrayList.get(i3)).f6218c.equals(str2)) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                Log.w("GlobalMediaRouter", "Either " + str + " isn't unique in " + strFlattenToShortString + " or we're trying to assign a unique ID for an already added route");
                int i4 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str3 = str2 + "_" + i4;
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            i5 = -1;
                            break;
                        }
                        if (((C1403C) arrayList.get(i5)).f6218c.equals(str3)) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 < 0) {
                        map.put(new C2388b(strFlattenToShortString, str), str3);
                        return str3;
                    }
                    i4++;
                }
            }
        }
        map.put(new C2388b(strFlattenToShortString, str), str2);
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public final C1403C m3575c() {
        ArrayList arrayList = this.f6339j;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1403C c1403c = (C1403C) obj;
            if (c1403c != this.f6351v && c1403c.m3493c() == this.f6348s && c1403c.m3503m("android.media.intent.category.LIVE_AUDIO") && !c1403c.m3503m("android.media.intent.category.LIVE_VIDEO") && c1403c.m3496f()) {
                return c1403c;
            }
        }
        return this.f6351v;
    }

    /* JADX INFO: renamed from: d */
    public final C1402B m3576d(AbstractC1449v abstractC1449v) {
        ArrayList arrayList = this.f6341l;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1402B c1402b = (C1402B) obj;
            if (c1402b.f6211a == abstractC1449v) {
                return c1402b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final C1403C m3577e() {
        C1403C c1403c = this.f6333d;
        if (c1403c != null) {
            return c1403c;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3578f() {
        if (!this.f6346q) {
            return false;
        }
        C1406F c1406f = this.f6350u;
        return c1406f == null || c1406f.f6242a;
    }

    /* JADX INFO: renamed from: g */
    public final void m3579g() {
        if (this.f6333d.m3495e()) {
            List<C1403C> listUnmodifiableList = Collections.unmodifiableList(this.f6333d.f6237v);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C1403C) it.next()).f6218c);
            }
            HashMap map = this.f6331b;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    AbstractC1448u abstractC1448u = (AbstractC1448u) entry.getValue();
                    abstractC1448u.mo3554h(0);
                    abstractC1448u.mo3551d();
                    it2.remove();
                }
            }
            for (C1403C c1403c : listUnmodifiableList) {
                if (!map.containsKey(c1403c.f6218c)) {
                    AbstractC1448u abstractC1448uMo3561e = c1403c.m3493c().mo3561e(c1403c.f6217b, this.f6333d.f6217b);
                    abstractC1448uMo3561e.mo3552e();
                    map.put(c1403c.f6218c, abstractC1448uMo3561e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3580h(C1433f c1433f, C1403C c1403c, AbstractC1448u abstractC1448u, int i3, C1403C c1403c2, ArrayList arrayList) {
        C1311o c1311o;
        C1401A c1401a = this.f6336g;
        if (c1401a != null) {
            c1401a.m3488a();
            this.f6336g = null;
        }
        C1401A c1401a2 = new C1401A(c1433f, c1403c, abstractC1448u, i3, c1403c2, arrayList);
        this.f6336g = c1401a2;
        if (c1401a2.f6202b != 3 || (c1311o = this.f6335f) == null) {
            c1401a2.m3489b();
            return;
        }
        C1403C c1403c3 = this.f6333d;
        C1403C c1403c4 = c1401a2.f6204d;
        C1311o.f5945c.m831b("Prepare transfer from Route(%s) to Route(%s)", c1403c3, c1403c4);
        C2057h c2057h = new C2057h();
        c2057h.f8950c = new C2060k();
        C2059j c2059j = new C2059j(c2057h);
        C2058i c2058i = c2059j.f8954h;
        c2057h.f8949b = c2059j;
        c2057h.f8948a = AbstractC1303m.class;
        try {
            c2057h.f8948a = Boolean.valueOf(c1311o.f5947b.post(new RunnableC1307n(c1311o, c1403c3, c1403c4, c2057h)));
        } catch (Exception e3) {
            c2058i.getClass();
            if (AbstractC2056g.f8943l.mo1768f(c2058i, null, new C2051b(e3))) {
                AbstractC2056g.m4620b(c2058i);
            }
        }
        C1401A c1401a3 = this.f6336g;
        C1433f c1433f2 = (C1433f) c1401a3.f6207g.get();
        if (c1433f2 == null || c1433f2.f6336g != c1401a3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            c1401a3.m3488a();
            return;
        }
        if (c1401a3.f6208h != null) {
            throw new IllegalStateException("future is already set");
        }
        c1401a3.f6208h = c2059j;
        RunnableC0892b runnableC0892b = new RunnableC0892b(15, c1401a3);
        HandlerC1430c handlerC1430c = c1433f2.f6330a;
        Objects.requireNonNull(handlerC1430c);
        ExecutorC1148x executorC1148x = new ExecutorC1148x(handlerC1430c, 1);
        C2052c c2052c = c2058i.f8946h;
        C2052c c2052c2 = C2052c.f8929d;
        if (c2052c != c2052c2) {
            C2052c c2052c3 = new C2052c(runnableC0892b, executorC1148x);
            do {
                c2052c3.f8932c = c2052c;
                if (AbstractC2056g.f8943l.mo1767e(c2058i, c2052c, c2052c3)) {
                    return;
                } else {
                    c2052c = c2058i.f8946h;
                }
            } while (c2052c != c2052c2);
        }
        AbstractC2056g.m4621c(runnableC0892b, executorC1148x);
    }

    /* JADX INFO: renamed from: i */
    public final void m3581i(C1403C c1403c, int i3) {
        if (!this.f6339j.contains(c1403c)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + c1403c);
            return;
        }
        if (!c1403c.f6222g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + c1403c);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC1449v abstractC1449vM3493c = c1403c.m3493c();
            C1440m c1440m = this.f6347r;
            if (abstractC1449vM3493c == c1440m && this.f6333d != c1403c) {
                String str = c1403c.f6217b;
                MediaRoute2Info mediaRoute2InfoM3602i = c1440m.m3602i(str);
                if (mediaRoute2InfoM3602i != null) {
                    c1440m.f6374i.transferTo(mediaRoute2InfoM3602i);
                    return;
                }
                Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                return;
            }
        }
        m3582j(c1403c, i3);
    }

    /* JADX INFO: renamed from: j */
    public final void m3582j(C1403C c1403c, int i3) {
        C0471D c0471d;
        if (this.f6333d == c1403c) {
            return;
        }
        if (this.f6353x != null) {
            this.f6353x = null;
            AbstractC1446s abstractC1446s = this.f6354y;
            if (abstractC1446s != null) {
                abstractC1446s.mo3554h(3);
                this.f6354y.mo3551d();
                this.f6354y = null;
            }
        }
        if (m3578f() && (c0471d = c1403c.f6216a.f6215e) != null && c0471d.f1565b) {
            AbstractC1446s abstractC1446sMo3560c = c1403c.m3493c().mo3560c(c1403c.f6217b);
            if (abstractC1446sMo3560c != null) {
                Context context = this.f6337h;
                Executor executorM4770a = Build.VERSION.SDK_INT >= 28 ? AbstractC2183c.m4770a(context) : new ExecutorC0433n(3, new Handler(context.getMainLooper()));
                C1428b c1428b = this.f6329E;
                synchronized (abstractC1446sMo3560c.f6400a) {
                    try {
                        if (executorM4770a == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (c1428b == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        abstractC1446sMo3560c.f6401b = executorM4770a;
                        abstractC1446sMo3560c.f6402c = c1428b;
                        ArrayList arrayList = abstractC1446sMo3560c.f6404e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            C1442o c1442o = abstractC1446sMo3560c.f6403d;
                            ArrayList arrayList2 = abstractC1446sMo3560c.f6404e;
                            abstractC1446sMo3560c.f6403d = null;
                            abstractC1446sMo3560c.f6404e = null;
                            abstractC1446sMo3560c.f6401b.execute(new RunnableC1444q(abstractC1446sMo3560c, c1428b, c1442o, arrayList2, 0));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f6353x = c1403c;
                this.f6354y = abstractC1446sMo3560c;
                abstractC1446sMo3560c.mo3552e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + c1403c);
        }
        AbstractC1448u abstractC1448uMo3526d = c1403c.m3493c().mo3526d(c1403c.f6217b);
        if (abstractC1448uMo3526d != null) {
            abstractC1448uMo3526d.mo3552e();
        }
        if (this.f6333d != null) {
            m3580h(this, c1403c, abstractC1448uMo3526d, i3, null, null);
            return;
        }
        this.f6333d = c1403c;
        this.f6334e = abstractC1448uMo3526d;
        Message messageObtainMessage = this.f6330a.obtainMessage(262, new C2388b(null, c1403c));
        messageObtainMessage.arg1 = i3;
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX INFO: renamed from: k */
    public final void m3583k() {
        C1450w c1450w;
        ArrayList arrayList;
        C1450w c1450w2 = new C1450w();
        C0834j0 c0834j0 = this.f6349t;
        long j3 = 0;
        c0834j0.f3541g = 0L;
        c0834j0.f3543i = false;
        c0834j0.f3542h = SystemClock.elapsedRealtime();
        ((Handler) c0834j0.f3544j).removeCallbacks((RunnableC0892b) c0834j0.f3545k);
        ArrayList arrayList2 = this.f6338i;
        int size = arrayList2.size();
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            size--;
            boolean z4 = this.f6345p;
            if (size < 0) {
                C1450w c1450w3 = c1450w2;
                long j4 = j3;
                C0834j0 c0834j1 = this.f6349t;
                if (c0834j1.f3543i) {
                    long j5 = c0834j1.f3541g;
                    if (j5 > j4) {
                        ((Handler) c0834j1.f3544j).postDelayed((RunnableC0892b) c0834j1.f3545k, j5);
                    }
                }
                boolean z5 = c0834j1.f3543i;
                this.f6326B = i3;
                C1451x c1451xM3637f = z3 ? c1450w3.m3637f() : C1451x.f6416c;
                C1451x c1451xM3637f2 = c1450w3.m3637f();
                if (m3578f()) {
                    C1443p c1443p = this.f6325A;
                    if (c1443p != null) {
                        c1443p.m3612a();
                        if (!c1443p.f6389b.equals(c1451xM3637f2) || this.f6325A.m3613b() != z5) {
                            if (c1451xM3637f2.m3642d() || z5) {
                                this.f6325A = new C1443p(c1451xM3637f2, z5);
                            } else if (this.f6325A != null) {
                                this.f6325A = null;
                            }
                            this.f6347r.m3631h(this.f6325A);
                        }
                    } else if (c1451xM3637f2.m3642d()) {
                        this.f6325A = new C1443p(c1451xM3637f2, z5);
                        this.f6347r.m3631h(this.f6325A);
                    } else {
                        this.f6325A = new C1443p(c1451xM3637f2, z5);
                        this.f6347r.m3631h(this.f6325A);
                    }
                }
                C1443p c1443p2 = this.f6355z;
                if (c1443p2 != null) {
                    c1443p2.m3612a();
                    if (c1443p2.f6389b.equals(c1451xM3637f) && this.f6355z.m3613b() == z5) {
                        return;
                    }
                }
                if (!c1451xM3637f.m3642d() || z5) {
                    this.f6355z = new C1443p(c1451xM3637f, z5);
                } else if (this.f6355z == null) {
                    return;
                } else {
                    this.f6355z = null;
                }
                if (z3 && !z5 && z4) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList3 = this.f6341l;
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj = arrayList3.get(i4);
                    i4++;
                    AbstractC1449v abstractC1449v = ((C1402B) obj).f6211a;
                    if (abstractC1449v != this.f6347r) {
                        abstractC1449v.m3631h(this.f6355z);
                    }
                }
                return;
            }
            C1405E c1405e = (C1405E) ((WeakReference) arrayList2.get(size)).get();
            if (c1405e == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = c1405e.f6241b;
                int size3 = arrayList4.size();
                i3 += size3;
                int i5 = 0;
                while (i5 < size3) {
                    C1453z c1453z = (C1453z) arrayList4.get(i5);
                    C1451x c1451x = c1453z.f6421c;
                    if (c1451x == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList arrayListM3641c = c1451x.m3641c();
                    if (!arrayListM3641c.isEmpty()) {
                        int size4 = arrayListM3641c.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            Object obj2 = arrayListM3641c.get(i6);
                            i6++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (c1450w2.f6415a == null) {
                                c1450w2.f6415a = new ArrayList();
                            }
                            if (!c1450w2.f6415a.contains(str)) {
                                c1450w2.f6415a.add(str);
                            }
                        }
                    }
                    boolean z6 = (c1453z.f6422d & 1) != 0;
                    C0834j0 c0834j2 = this.f6349t;
                    long j6 = c1453z.f6423e;
                    if (z6) {
                        c1450w = c1450w2;
                        arrayList = arrayList2;
                        long j7 = c0834j2.f3542h;
                        if (j7 - j6 < 30000) {
                            c0834j2.f3541g = Math.max(c0834j2.f3541g, (j6 + 30000) - j7);
                            c0834j2.f3543i = true;
                        }
                    } else {
                        c0834j2.getClass();
                        c1450w = c1450w2;
                        arrayList = arrayList2;
                    }
                    if (z6) {
                        z3 = true;
                    }
                    int i7 = c1453z.f6422d;
                    if ((i7 & 4) != 0 && !z4) {
                        z3 = true;
                    }
                    if ((i7 & 8) != 0) {
                        z3 = true;
                    }
                    i5++;
                    j3 = j3;
                    c1450w2 = c1450w;
                    arrayList2 = arrayList;
                }
            }
            j3 = j3;
            c1450w2 = c1450w2;
            arrayList2 = arrayList2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3584l() {
        MediaRouter2.RoutingController routingController;
        C1403C c1403c = this.f6333d;
        if (c1403c == null) {
            C0858A c0858a = this.f6327C;
            if (c0858a != null) {
                c0858a.m2179r();
                return;
            }
            return;
        }
        int i3 = c1403c.f6231p;
        C0370g c0370g = this.f6343n;
        c0370g.f1186b = i3;
        c0370g.f1187c = c1403c.f6232q;
        c0370g.f1188d = (!c1403c.m3495e() || C1405E.m3515g()) ? c1403c.f6230o : 0;
        c0370g.f1189e = this.f6333d.f6228m;
        if (m3578f() && this.f6333d.m3493c() == this.f6347r) {
            AbstractC1448u abstractC1448u = this.f6334e;
            int i4 = C1440m.f6373r;
            c0370g.f1190f = ((abstractC1448u instanceof C1436i) && (routingController = ((C1436i) abstractC1448u).f6358g) != null) ? routingController.getId() : null;
        } else {
            c0370g.f1190f = null;
        }
        ArrayList arrayList = this.f6342m;
        if (arrayList.size() > 0) {
            ((AbstractC1432e) arrayList.get(0)).getClass();
            throw null;
        }
        C0858A c0858a2 = this.f6327C;
        if (c0858a2 != null) {
            C1403C c1403c2 = this.f6333d;
            C1403C c1403c3 = this.f6351v;
            if (c1403c3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (c1403c2 == c1403c3 || c1403c2 == this.f6352w) {
                c0858a2.m2179r();
                return;
            }
            int i5 = c0370g.f1188d == 1 ? 2 : 0;
            int i6 = c0370g.f1187c;
            int i7 = c0370g.f1186b;
            String str = (String) c0370g.f1190f;
            C0858A c0858a3 = (C0858A) c0858a2.f3639h;
            if (c0858a3 != null) {
                C0925o c0925o = (C0925o) c0858a2.f3640i;
                if (c0925o != null && i5 == 0 && i6 == 0) {
                    c0925o.f4019c = i7;
                    AbstractC0454f.m1157a(c0925o.m2414b(), i7);
                    return;
                }
                C0925o c0925o2 = new C0925o(c0858a2, i5, i6, i7, str);
                c0858a2.f3640i = c0925o2;
                C0885u c0885u = (C0885u) c0858a3.f3639h;
                c0885u.getClass();
                c0885u.f3702a.setPlaybackToRemote(c0925o2.m2414b());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX INFO: renamed from: m */
    public final void m3585m(C1402B c1402b, C0471D c0471d) {
        boolean z3;
        int i3;
        Iterator it;
        boolean z4;
        if (c1402b.f6215e != c0471d) {
            c1402b.f6215e = c0471d;
            ArrayList arrayList = this.f6339j;
            ArrayList arrayList2 = c1402b.f6212b;
            HandlerC1430c handlerC1430c = this.f6330a;
            if (c0471d != null) {
                List list = (List) c0471d.f1566c;
                int size = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        C1442o c1442o = (C1442o) list.get(i4);
                        if (c1442o != null && c1442o.m3611e()) {
                            i4++;
                        } else if (c0471d != this.f6348s.f6413g) {
                            z3 = false;
                            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + c0471d);
                            i3 = 0;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    int i5 = 0;
                    boolean z5 = false;
                    while (it2.hasNext()) {
                        C1442o c1442o2 = (C1442o) it2.next();
                        if (c1442o2 == null || !c1442o2.m3611e()) {
                            it = it2;
                            z4 = z5;
                            Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + c1442o2);
                        } else {
                            String strM3610d = c1442o2.m3610d();
                            int size2 = arrayList2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    i6 = -1;
                                    break;
                                } else if (((C1403C) arrayList2.get(i6)).f6217b.equals(strM3610d)) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            if (i6 < 0) {
                                it = it2;
                                z4 = z5;
                                C1403C c1403c = new C1403C(c1402b, strM3610d, m3574b(c1402b, strM3610d), c1442o2.f6387a.getBoolean("isSystemRoute", false));
                                int i7 = i5 + 1;
                                arrayList2.add(i5, c1403c);
                                arrayList.add(c1403c);
                                if (c1442o2.m3609c().isEmpty()) {
                                    c1403c.m3499i(c1442o2);
                                    handlerC1430c.m3572b(257, c1403c);
                                } else {
                                    arrayList3.add(new C2388b(c1403c, c1442o2));
                                }
                                i5 = i7;
                            } else {
                                it = it2;
                                z4 = z5;
                                if (i6 < i5) {
                                    Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + c1442o2);
                                } else {
                                    C1403C c1403c2 = (C1403C) arrayList2.get(i6);
                                    int i8 = i5 + 1;
                                    Collections.swap(arrayList2, i6, i5);
                                    if (!c1442o2.m3609c().isEmpty()) {
                                        arrayList4.add(new C2388b(c1403c2, c1442o2));
                                    } else if (m3586n(c1403c2, c1442o2) != 0 && c1403c2 == this.f6333d) {
                                        i5 = i8;
                                        z4 = true;
                                    }
                                    i5 = i8;
                                }
                            }
                        }
                        it2 = it;
                        z5 = z4;
                    }
                    boolean z6 = z5;
                    int i9 = 0;
                    int size3 = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        C2388b c2388b = (C2388b) obj;
                        C1403C c1403c3 = (C1403C) c2388b.f9981a;
                        c1403c3.m3499i((C1442o) c2388b.f9982b);
                        handlerC1430c.m3572b(257, c1403c3);
                    }
                    int size4 = arrayList4.size();
                    boolean z7 = z6;
                    while (i9 < size4) {
                        Object obj2 = arrayList4.get(i9);
                        i9++;
                        C2388b c2388b2 = (C2388b) obj2;
                        C1403C c1403c4 = (C1403C) c2388b2.f9981a;
                        if (m3586n(c1403c4, (C1442o) c2388b2.f9982b) != 0 && c1403c4 == this.f6333d) {
                            z7 = true;
                        }
                    }
                    z3 = z7;
                    i3 = i5;
                }
            } else {
                z3 = false;
                Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + c0471d);
                i3 = 0;
            }
            for (int size5 = arrayList2.size() - 1; size5 >= i3; size5--) {
                C1403C c1403c5 = (C1403C) arrayList2.get(size5);
                c1403c5.m3499i(null);
                arrayList.remove(c1403c5);
            }
            m3587o(z3);
            for (int size6 = arrayList2.size() - 1; size6 >= i3; size6--) {
                handlerC1430c.m3572b(258, (C1403C) arrayList2.remove(size6));
            }
            handlerC1430c.m3572b(515, c1402b);
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m3586n(C1403C c1403c, C1442o c1442o) {
        int iM3499i = c1403c.m3499i(c1442o);
        if (iM3499i != 0) {
            int i3 = iM3499i & 1;
            HandlerC1430c handlerC1430c = this.f6330a;
            if (i3 != 0) {
                handlerC1430c.m3572b(259, c1403c);
            }
            if ((iM3499i & 2) != 0) {
                handlerC1430c.m3572b(260, c1403c);
            }
            if ((iM3499i & 4) != 0) {
                handlerC1430c.m3572b(261, c1403c);
            }
        }
        return iM3499i;
    }

    /* JADX INFO: renamed from: o */
    public final void m3587o(boolean z3) {
        C1403C c1403c = this.f6351v;
        if (c1403c != null && !c1403c.m3496f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.f6351v);
            this.f6351v = null;
        }
        C1403C c1403c2 = this.f6351v;
        ArrayList arrayList = this.f6339j;
        if (c1403c2 == null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C1403C c1403c3 = (C1403C) obj;
                if (c1403c3.m3493c() == this.f6348s && c1403c3.f6217b.equals("DEFAULT_ROUTE") && c1403c3.m3496f()) {
                    this.f6351v = c1403c3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.f6351v);
                    break;
                }
            }
        }
        C1403C c1403c4 = this.f6352w;
        if (c1403c4 != null && !c1403c4.m3496f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f6352w);
            this.f6352w = null;
        }
        if (this.f6352w == null) {
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                C1403C c1403c5 = (C1403C) obj2;
                if (c1403c5.m3493c() == this.f6348s && c1403c5.m3503m("android.media.intent.category.LIVE_AUDIO") && !c1403c5.m3503m("android.media.intent.category.LIVE_VIDEO") && c1403c5.m3496f()) {
                    this.f6352w = c1403c5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f6352w);
                    break;
                }
            }
        }
        C1403C c1403c6 = this.f6333d;
        if (c1403c6 == null || !c1403c6.f6222g) {
            Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f6333d);
            m3582j(m3575c(), 0);
            return;
        }
        if (z3) {
            m3579g();
            m3584l();
        }
    }
}
