package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0894d;
import androidx.activity.C0896f;
import androidx.activity.C0902l;
import androidx.activity.C0906p;
import androidx.activity.InterfaceC0891a;
import androidx.lifecycle.AbstractC0984I;
import androidx.lifecycle.C0985J;
import androidx.lifecycle.C0986K;
import androidx.lifecycle.EnumC1000m;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p009D0.C0106b;
import p014F.RunnableC0153b;
import p019G1.AbstractC0230e;
import p034L1.C0352g;
import p035M.AbstractC0363d;
import p038N.C0401a;
import p045P0.AbstractC0462h;
import p053S0.C0536b;
import p091e.AbstractActivityC1479j;
import p108i1.C1751d;
import p136q.C2124g;
import p136q.C2138u;
import p163x2.AbstractC2364c;
import p168z.InterfaceC2387a;

/* JADX INFO: renamed from: androidx.fragment.app.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0937C {

    /* JADX INFO: renamed from: A */
    public C0106b f4051A;

    /* JADX INFO: renamed from: B */
    public C0106b f4052B;

    /* JADX INFO: renamed from: C */
    public ArrayDeque f4053C;

    /* JADX INFO: renamed from: D */
    public boolean f4054D;

    /* JADX INFO: renamed from: E */
    public boolean f4055E;

    /* JADX INFO: renamed from: F */
    public boolean f4056F;

    /* JADX INFO: renamed from: G */
    public boolean f4057G;

    /* JADX INFO: renamed from: H */
    public boolean f4058H;

    /* JADX INFO: renamed from: I */
    public ArrayList f4059I;

    /* JADX INFO: renamed from: J */
    public ArrayList f4060J;

    /* JADX INFO: renamed from: K */
    public ArrayList f4061K;

    /* JADX INFO: renamed from: L */
    public C0940F f4062L;

    /* JADX INFO: renamed from: M */
    public final RunnableC0153b f4063M;

    /* JADX INFO: renamed from: b */
    public boolean f4065b;

    /* JADX INFO: renamed from: d */
    public ArrayList f4067d;

    /* JADX INFO: renamed from: e */
    public ArrayList f4068e;

    /* JADX INFO: renamed from: g */
    public C0906p f4070g;

    /* JADX INFO: renamed from: l */
    public final C0106b f4075l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f4076m;

    /* JADX INFO: renamed from: n */
    public final C0968s f4077n;

    /* JADX INFO: renamed from: o */
    public final C0968s f4078o;

    /* JADX INFO: renamed from: p */
    public final C0968s f4079p;

    /* JADX INFO: renamed from: q */
    public final C0968s f4080q;

    /* JADX INFO: renamed from: r */
    public final C0971v f4081r;

    /* JADX INFO: renamed from: s */
    public int f4082s;

    /* JADX INFO: renamed from: t */
    public C0965p f4083t;

    /* JADX INFO: renamed from: u */
    public AbstractC0230e f4084u;

    /* JADX INFO: renamed from: v */
    public AbstractComponentCallbacksC0963n f4085v;

    /* JADX INFO: renamed from: w */
    public AbstractComponentCallbacksC0963n f4086w;

    /* JADX INFO: renamed from: x */
    public final C0972w f4087x;

    /* JADX INFO: renamed from: y */
    public final C0352g f4088y;

    /* JADX INFO: renamed from: z */
    public C0106b f4089z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f4064a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C0536b f4066c = new C0536b(3);

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0967r f4069f = new LayoutInflaterFactory2C0967r(this);

    /* JADX INFO: renamed from: h */
    public final C0970u f4071h = new C0970u(this);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f4072i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map f4073j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map f4074k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.s] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.s] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.s] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.s] */
    public AbstractC0937C() {
        Collections.synchronizedMap(new HashMap());
        this.f4075l = new C0106b(this);
        this.f4076m = new CopyOnWriteArrayList();
        final int i3 = 0;
        this.f4077n = new InterfaceC2387a(this) { // from class: androidx.fragment.app.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0937C f4259b;

            {
                this.f4259b = this;
            }

            @Override // p168z.InterfaceC2387a
            /* JADX INFO: renamed from: b */
            public final void mo2543b(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0937C abstractC0937C = this.f4259b;
                        if (abstractC0937C.m2440H()) {
                            abstractC0937C.m2464h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0937C abstractC0937C2 = this.f4259b;
                        if (abstractC0937C2.m2440H() && num.intValue() == 80) {
                            abstractC0937C2.m2468l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2124g c2124g = (C2124g) obj;
                        AbstractC0937C abstractC0937C3 = this.f4259b;
                        if (abstractC0937C3.m2440H()) {
                            boolean z3 = c2124g.f9174a;
                            abstractC0937C3.m2469m(false);
                        }
                        break;
                    default:
                        C2138u c2138u = (C2138u) obj;
                        AbstractC0937C abstractC0937C4 = this.f4259b;
                        if (abstractC0937C4.m2440H()) {
                            boolean z4 = c2138u.f9203a;
                            abstractC0937C4.m2474r(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f4078o = new InterfaceC2387a(this) { // from class: androidx.fragment.app.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0937C f4259b;

            {
                this.f4259b = this;
            }

            @Override // p168z.InterfaceC2387a
            /* JADX INFO: renamed from: b */
            public final void mo2543b(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0937C abstractC0937C = this.f4259b;
                        if (abstractC0937C.m2440H()) {
                            abstractC0937C.m2464h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0937C abstractC0937C2 = this.f4259b;
                        if (abstractC0937C2.m2440H() && num.intValue() == 80) {
                            abstractC0937C2.m2468l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2124g c2124g = (C2124g) obj;
                        AbstractC0937C abstractC0937C3 = this.f4259b;
                        if (abstractC0937C3.m2440H()) {
                            boolean z3 = c2124g.f9174a;
                            abstractC0937C3.m2469m(false);
                        }
                        break;
                    default:
                        C2138u c2138u = (C2138u) obj;
                        AbstractC0937C abstractC0937C4 = this.f4259b;
                        if (abstractC0937C4.m2440H()) {
                            boolean z4 = c2138u.f9203a;
                            abstractC0937C4.m2474r(false);
                        }
                        break;
                }
            }
        };
        final int i5 = 2;
        this.f4079p = new InterfaceC2387a(this) { // from class: androidx.fragment.app.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0937C f4259b;

            {
                this.f4259b = this;
            }

            @Override // p168z.InterfaceC2387a
            /* JADX INFO: renamed from: b */
            public final void mo2543b(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0937C abstractC0937C = this.f4259b;
                        if (abstractC0937C.m2440H()) {
                            abstractC0937C.m2464h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0937C abstractC0937C2 = this.f4259b;
                        if (abstractC0937C2.m2440H() && num.intValue() == 80) {
                            abstractC0937C2.m2468l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2124g c2124g = (C2124g) obj;
                        AbstractC0937C abstractC0937C3 = this.f4259b;
                        if (abstractC0937C3.m2440H()) {
                            boolean z3 = c2124g.f9174a;
                            abstractC0937C3.m2469m(false);
                        }
                        break;
                    default:
                        C2138u c2138u = (C2138u) obj;
                        AbstractC0937C abstractC0937C4 = this.f4259b;
                        if (abstractC0937C4.m2440H()) {
                            boolean z4 = c2138u.f9203a;
                            abstractC0937C4.m2474r(false);
                        }
                        break;
                }
            }
        };
        final int i6 = 3;
        this.f4080q = new InterfaceC2387a(this) { // from class: androidx.fragment.app.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0937C f4259b;

            {
                this.f4259b = this;
            }

            @Override // p168z.InterfaceC2387a
            /* JADX INFO: renamed from: b */
            public final void mo2543b(Object obj) {
                switch (i6) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0937C abstractC0937C = this.f4259b;
                        if (abstractC0937C.m2440H()) {
                            abstractC0937C.m2464h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0937C abstractC0937C2 = this.f4259b;
                        if (abstractC0937C2.m2440H() && num.intValue() == 80) {
                            abstractC0937C2.m2468l(false);
                            break;
                        }
                        break;
                    case 2:
                        C2124g c2124g = (C2124g) obj;
                        AbstractC0937C abstractC0937C3 = this.f4259b;
                        if (abstractC0937C3.m2440H()) {
                            boolean z3 = c2124g.f9174a;
                            abstractC0937C3.m2469m(false);
                        }
                        break;
                    default:
                        C2138u c2138u = (C2138u) obj;
                        AbstractC0937C abstractC0937C4 = this.f4259b;
                        if (abstractC0937C4.m2440H()) {
                            boolean z4 = c2138u.f9203a;
                            abstractC0937C4.m2474r(false);
                        }
                        break;
                }
            }
        };
        this.f4081r = new C0971v(this);
        this.f4082s = -1;
        this.f4087x = new C0972w(this);
        this.f4088y = new C0352g(25);
        this.f4053C = new ArrayDeque();
        this.f4063M = new RunnableC0153b(9, this);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m2430F(int i3) {
        return Log.isLoggable("FragmentManager", i3);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m2431G(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        abstractComponentCallbacksC0963n.getClass();
        ArrayList arrayListM1339g = abstractComponentCallbacksC0963n.f4245z.f4066c.m1339g();
        int size = arrayListM1339g.size();
        boolean zM2431G = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM1339g.get(i3);
            i3++;
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = (AbstractComponentCallbacksC0963n) obj;
            if (abstractComponentCallbacksC0963n2 != null) {
                zM2431G = m2431G(abstractComponentCallbacksC0963n2);
            }
            if (zM2431G) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m2432I(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (abstractComponentCallbacksC0963n == null) {
            return true;
        }
        if (abstractComponentCallbacksC0963n.f4211H) {
            return abstractComponentCallbacksC0963n.f4243x == null || m2432I(abstractComponentCallbacksC0963n.f4204A);
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m2433J(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (abstractComponentCallbacksC0963n == null) {
            return true;
        }
        AbstractC0937C abstractC0937C = abstractComponentCallbacksC0963n.f4243x;
        return abstractComponentCallbacksC0963n.equals(abstractC0937C.f4086w) && m2433J(abstractC0937C.f4085v);
    }

    /* JADX INFO: renamed from: X */
    public static void m2434X(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (m2430F(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0963n);
        }
        if (abstractComponentCallbacksC0963n.f4208E) {
            abstractComponentCallbacksC0963n.f4208E = false;
            abstractComponentCallbacksC0963n.f4217N = !abstractComponentCallbacksC0963n.f4217N;
        }
    }

    /* JADX INFO: renamed from: A */
    public final AbstractComponentCallbacksC0963n m2435A(String str) {
        C0536b c0536b = this.f4066c;
        ArrayList arrayList = (ArrayList) c0536b.f1867g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = (AbstractComponentCallbacksC0963n) arrayList.get(size);
            if (abstractComponentCallbacksC0963n != null && str.equals(abstractComponentCallbacksC0963n.f4207D)) {
                return abstractComponentCallbacksC0963n;
            }
        }
        for (C0943I c0943i : ((HashMap) c0536b.f1868h).values()) {
            if (c0943i != null) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = c0943i.f4120c;
                if (str.equals(abstractComponentCallbacksC0963n2.f4207D)) {
                    return abstractComponentCallbacksC0963n2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final ViewGroup m2436B(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        ViewGroup viewGroup = abstractComponentCallbacksC0963n.f4213J;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0963n.f4206C <= 0 || !this.f4084u.mo748v()) {
            return null;
        }
        View viewMo747u = this.f4084u.mo747u(abstractComponentCallbacksC0963n.f4206C);
        if (viewMo747u instanceof ViewGroup) {
            return (ViewGroup) viewMo747u;
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final C0972w m2437C() {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4085v;
        return abstractComponentCallbacksC0963n != null ? abstractComponentCallbacksC0963n.f4243x.m2437C() : this.f4087x;
    }

    /* JADX INFO: renamed from: D */
    public final C0352g m2438D() {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4085v;
        return abstractComponentCallbacksC0963n != null ? abstractComponentCallbacksC0963n.f4243x.m2438D() : this.f4088y;
    }

    /* JADX INFO: renamed from: E */
    public final void m2439E(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (m2430F(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0963n);
        }
        if (abstractComponentCallbacksC0963n.f4208E) {
            return;
        }
        abstractComponentCallbacksC0963n.f4208E = true;
        abstractComponentCallbacksC0963n.f4217N = true ^ abstractComponentCallbacksC0963n.f4217N;
        m2453W(abstractComponentCallbacksC0963n);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m2440H() {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4085v;
        if (abstractComponentCallbacksC0963n == null) {
            return true;
        }
        return abstractComponentCallbacksC0963n.f4244y != null && abstractComponentCallbacksC0963n.f4236q && abstractComponentCallbacksC0963n.m2536j().m2440H();
    }

    /* JADX INFO: renamed from: K */
    public final void m2441K(int i3, boolean z3) {
        HashMap map;
        C0965p c0965p;
        if (this.f4083t == null && i3 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i3 != this.f4082s) {
            this.f4082s = i3;
            C0536b c0536b = this.f4066c;
            ArrayList arrayList = (ArrayList) c0536b.f1867g;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                map = (HashMap) c0536b.f1868h;
                if (i4 >= size) {
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                C0943I c0943i = (C0943I) map.get(((AbstractComponentCallbacksC0963n) obj).f4230k);
                if (c0943i != null) {
                    c0943i.m2496j();
                }
            }
            for (C0943I c0943i2 : map.values()) {
                if (c0943i2 != null) {
                    c0943i2.m2496j();
                    AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0943i2.f4120c;
                    if (abstractComponentCallbacksC0963n.f4237r && !abstractComponentCallbacksC0963n.m2540n()) {
                        c0536b.m1342l(c0943i2);
                    }
                }
            }
            m2454Y();
            if (this.f4054D && (c0965p = this.f4083t) != null && this.f4082s == 7) {
                c0965p.f4252y.invalidateOptionsMenu();
                this.f4054D = false;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m2442L() {
        if (this.f4083t == null) {
            return;
        }
        this.f4055E = false;
        this.f4056F = false;
        this.f4062L.f4103h = false;
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null) {
                abstractComponentCallbacksC0963n.f4245z.m2442L();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m2443M() {
        m2480x(false);
        m2479w(true);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4086w;
        if (abstractComponentCallbacksC0963n != null && abstractComponentCallbacksC0963n.m2533g().m2443M()) {
            return true;
        }
        boolean zM2444N = m2444N(this.f4059I, this.f4060J, -1, 0);
        if (zM2444N) {
            this.f4065b = true;
            try {
                m2446P(this.f4059I, this.f4060J);
                m2460d();
            } catch (Throwable th) {
                m2460d();
                throw th;
            }
        }
        m2457a0();
        if (this.f4058H) {
            this.f4058H = false;
            m2454Y();
        }
        ((HashMap) this.f4066c.f1868h).values().removeAll(Collections.singleton(null));
        return zM2444N;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m2444N(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        boolean z3 = (i4 & 1) != 0;
        ArrayList arrayList3 = this.f4067d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i3 < 0) {
                size = z3 ? 0 : this.f4067d.size() - 1;
            } else {
                int size2 = this.f4067d.size() - 1;
                while (size2 >= 0) {
                    C0950a c0950a = (C0950a) this.f4067d.get(size2);
                    if (i3 >= 0 && i3 == c0950a.f4151r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z3) {
                    size = size2;
                    while (size > 0) {
                        C0950a c0950a2 = (C0950a) this.f4067d.get(size - 1);
                        if (i3 < 0 || i3 != c0950a2.f4151r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f4067d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f4067d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0950a) this.f4067d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final void m2445O(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (m2430F(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0963n + " nesting=" + abstractComponentCallbacksC0963n.f4242w);
        }
        boolean zM2540n = abstractComponentCallbacksC0963n.m2540n();
        if (abstractComponentCallbacksC0963n.f4209F && zM2540n) {
            return;
        }
        C0536b c0536b = this.f4066c;
        synchronized (((ArrayList) c0536b.f1867g)) {
            ((ArrayList) c0536b.f1867g).remove(abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.f4236q = false;
        if (m2431G(abstractComponentCallbacksC0963n)) {
            this.f4054D = true;
        }
        abstractComponentCallbacksC0963n.f4237r = true;
        m2453W(abstractComponentCallbacksC0963n);
    }

    /* JADX INFO: renamed from: P */
    public final void m2446P(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            if (!((C0950a) arrayList.get(i3)).f4148o) {
                if (i4 != i3) {
                    m2481y(arrayList, arrayList2, i4, i3);
                }
                i4 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0950a) arrayList.get(i4)).f4148o) {
                        i4++;
                    }
                }
                m2481y(arrayList, arrayList2, i3, i4);
                i3 = i4 - 1;
            }
            i3++;
        }
        if (i4 != size) {
            m2481y(arrayList, arrayList2, i4, size);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m2447Q(Parcelable parcelable) {
        C0106b c0106b;
        int i3;
        C0943I c0943i;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4083t.f4249v.getClassLoader());
                this.f4074k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4083t.f4249v.getClassLoader());
                arrayList.add((C0942H) bundle.getParcelable("state"));
            }
        }
        C0536b c0536b = this.f4066c;
        HashMap map = (HashMap) c0536b.f1869i;
        map.clear();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0942H c0942h = (C0942H) obj;
            map.put(c0942h.f4106h, c0942h);
        }
        C0939E c0939e = (C0939E) bundle3.getParcelable("state");
        if (c0939e == null) {
            return;
        }
        HashMap map2 = (HashMap) c0536b.f1868h;
        map2.clear();
        ArrayList arrayList2 = c0939e.f4090g;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (true) {
            c0106b = this.f4075l;
            if (i5 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i5);
            i5++;
            C0942H c0942h2 = (C0942H) ((HashMap) c0536b.f1869i).remove((String) obj2);
            if (c0942h2 != null) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = (AbstractComponentCallbacksC0963n) this.f4062L.f4098c.get(c0942h2.f4106h);
                if (abstractComponentCallbacksC0963n != null) {
                    if (m2430F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0963n);
                    }
                    c0943i = new C0943I(c0106b, c0536b, abstractComponentCallbacksC0963n, c0942h2);
                } else {
                    c0943i = new C0943I(this.f4075l, this.f4066c, this.f4083t.f4249v.getClassLoader(), m2437C(), c0942h2);
                }
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = c0943i.f4120c;
                abstractComponentCallbacksC0963n2.f4243x = this;
                if (m2430F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0963n2.f4230k + "): " + abstractComponentCallbacksC0963n2);
                }
                c0943i.m2498l(this.f4083t.f4249v.getClassLoader());
                c0536b.m1341j(c0943i);
                c0943i.f4122e = this.f4082s;
            }
        }
        C0940F c0940f = this.f4062L;
        c0940f.getClass();
        ArrayList arrayList3 = new ArrayList(c0940f.f4098c.values());
        int size3 = arrayList3.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList3.get(i6);
            i6++;
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n3 = (AbstractComponentCallbacksC0963n) obj3;
            if (map2.get(abstractComponentCallbacksC0963n3.f4230k) == null) {
                if (m2430F(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0963n3 + " that was not found in the set of active Fragments " + c0939e.f4090g);
                }
                this.f4062L.m2485d(abstractComponentCallbacksC0963n3);
                abstractComponentCallbacksC0963n3.f4243x = this;
                C0943I c0943i2 = new C0943I(c0106b, c0536b, abstractComponentCallbacksC0963n3);
                c0943i2.f4122e = 1;
                c0943i2.m2496j();
                abstractComponentCallbacksC0963n3.f4237r = true;
                c0943i2.m2496j();
            }
        }
        ArrayList arrayList4 = c0939e.f4091h;
        ((ArrayList) c0536b.f1867g).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i7 = 0;
            while (i7 < size4) {
                Object obj4 = arrayList4.get(i7);
                i7++;
                String str3 = (String) obj4;
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM1335c = c0536b.m1335c(str3);
                if (abstractComponentCallbacksC0963nM1335c == null) {
                    throw new IllegalStateException(AbstractC0462h.m1166f("No instantiated fragment for (", str3, ")"));
                }
                if (m2430F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0963nM1335c);
                }
                c0536b.m1334a(abstractComponentCallbacksC0963nM1335c);
            }
        }
        if (c0939e.f4092i != null) {
            this.f4067d = new ArrayList(c0939e.f4092i.length);
            int i8 = 0;
            while (true) {
                C0951b[] c0951bArr = c0939e.f4092i;
                if (i8 >= c0951bArr.length) {
                    break;
                }
                C0951b c0951b = c0951bArr[i8];
                c0951b.getClass();
                C0950a c0950a = new C0950a(this);
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int[] iArr = c0951b.f4152g;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    C0944J c0944j = new C0944J();
                    int i11 = i9 + 1;
                    c0944j.f4123a = iArr[i9];
                    if (m2430F(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0950a + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    c0944j.f4130h = EnumC1000m.values()[c0951b.f4154i[i10]];
                    c0944j.f4131i = EnumC1000m.values()[c0951b.f4155j[i10]];
                    int i12 = i9 + 2;
                    c0944j.f4125c = iArr[i11] != 0;
                    int i13 = iArr[i12];
                    c0944j.f4126d = i13;
                    int i14 = iArr[i9 + 3];
                    c0944j.f4127e = i14;
                    int i15 = i9 + 5;
                    int i16 = iArr[i9 + 4];
                    c0944j.f4128f = i16;
                    i9 += 6;
                    int i17 = iArr[i15];
                    c0944j.f4129g = i17;
                    c0950a.f4135b = i13;
                    c0950a.f4136c = i14;
                    c0950a.f4137d = i16;
                    c0950a.f4138e = i17;
                    c0950a.m2508b(c0944j);
                    i10++;
                }
                c0950a.f4139f = c0951b.f4156k;
                c0950a.f4141h = c0951b.f4157l;
                c0950a.f4140g = true;
                c0950a.f4142i = c0951b.f4159n;
                c0950a.f4143j = c0951b.f4160o;
                c0950a.f4144k = c0951b.f4161p;
                c0950a.f4145l = c0951b.f4162q;
                c0950a.f4146m = c0951b.f4163r;
                c0950a.f4147n = c0951b.f4164s;
                c0950a.f4148o = c0951b.f4165t;
                c0950a.f4151r = c0951b.f4158m;
                int i18 = 0;
                while (true) {
                    ArrayList arrayList5 = c0951b.f4153h;
                    if (i18 >= arrayList5.size()) {
                        break;
                    }
                    String str4 = (String) arrayList5.get(i18);
                    if (str4 != null) {
                        ((C0944J) c0950a.f4134a.get(i18)).f4124b = c0536b.m1335c(str4);
                    }
                    i18++;
                }
                c0950a.m2509c(1);
                if (m2430F(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + c0950a.f4151r + "): " + c0950a);
                    PrintWriter printWriter = new PrintWriter(new C0946L());
                    c0950a.m2512f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4067d.add(c0950a);
                i8++;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f4067d = null;
        }
        this.f4072i.set(c0939e.f4093j);
        String str5 = c0939e.f4094k;
        if (str5 != null) {
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM1335c2 = c0536b.m1335c(str5);
            this.f4086w = abstractComponentCallbacksC0963nM1335c2;
            m2473q(abstractComponentCallbacksC0963nM1335c2);
        }
        ArrayList arrayList6 = c0939e.f4095l;
        if (arrayList6 != null) {
            while (i3 < arrayList6.size()) {
                this.f4073j.put((String) arrayList6.get(i3), (C0952c) c0939e.f4096m.get(i3));
                i3++;
            }
        }
        this.f4053C = new ArrayDeque(c0939e.f4097n);
    }

    /* JADX INFO: renamed from: R */
    public final Bundle m2448R() {
        int i3;
        ArrayList arrayList;
        C0951b[] c0951bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m2461e().iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            C0955f c0955f = (C0955f) it.next();
            if (c0955f.f4172e) {
                if (m2430F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0955f.f4172e = false;
                c0955f.m2515b();
            }
        }
        Iterator it2 = m2461e().iterator();
        while (it2.hasNext()) {
            ((C0955f) it2.next()).m2516c();
        }
        m2480x(true);
        this.f4055E = true;
        this.f4062L.f4103h = true;
        C0536b c0536b = this.f4066c;
        c0536b.getClass();
        HashMap map = (HashMap) c0536b.f1868h;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0943I c0943i = (C0943I) it3.next();
            if (c0943i != null) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0943i.f4120c;
                C0942H c0942h = new C0942H(abstractComponentCallbacksC0963n);
                if (abstractComponentCallbacksC0963n.f4226g <= -1 || c0942h.f4117s != null) {
                    c0942h.f4117s = abstractComponentCallbacksC0963n.f4227h;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0963n.mo2525v(bundle2);
                    abstractComponentCallbacksC0963n.f4223T.m2056c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0963n.f4245z.m2448R());
                    c0943i.f4118a.m538z(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC0963n.f4228i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0963n.f4228i);
                    }
                    if (abstractComponentCallbacksC0963n.f4229j != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC0963n.f4229j);
                    }
                    if (!abstractComponentCallbacksC0963n.f4215L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0963n.f4215L);
                    }
                    c0942h.f4117s = bundle3;
                    if (abstractComponentCallbacksC0963n.f4233n != null) {
                        if (bundle3 == null) {
                            c0942h.f4117s = new Bundle();
                        }
                        c0942h.f4117s.putString("android:target_state", abstractComponentCallbacksC0963n.f4233n);
                        int i4 = abstractComponentCallbacksC0963n.f4234o;
                        if (i4 != 0) {
                            c0942h.f4117s.putInt("android:target_req_state", i4);
                        }
                    }
                }
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = c0943i.f4120c;
                arrayList2.add(abstractComponentCallbacksC0963n2.f4230k);
                if (m2430F(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0963n2 + ": " + abstractComponentCallbacksC0963n2.f4227h);
                }
            }
        }
        C0536b c0536b2 = this.f4066c;
        c0536b2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) c0536b2.f1869i).values());
        if (!arrayList3.isEmpty()) {
            C0536b c0536b3 = this.f4066c;
            synchronized (((ArrayList) c0536b3.f1867g)) {
                try {
                    if (((ArrayList) c0536b3.f1867g).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c0536b3.f1867g).size());
                        ArrayList arrayList4 = (ArrayList) c0536b3.f1867g;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = arrayList4.get(i5);
                            i5++;
                            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n3 = (AbstractComponentCallbacksC0963n) obj;
                            arrayList.add(abstractComponentCallbacksC0963n3.f4230k);
                            if (m2430F(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0963n3.f4230k + "): " + abstractComponentCallbacksC0963n3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList5 = this.f4067d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                c0951bArr = null;
            } else {
                c0951bArr = new C0951b[size];
                for (int i6 = 0; i6 < size; i6++) {
                    c0951bArr[i6] = new C0951b((C0950a) this.f4067d.get(i6));
                    if (m2430F(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.f4067d.get(i6));
                    }
                }
            }
            C0939E c0939e = new C0939E();
            c0939e.f4094k = null;
            ArrayList arrayList6 = new ArrayList();
            c0939e.f4095l = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            c0939e.f4096m = arrayList7;
            c0939e.f4090g = arrayList2;
            c0939e.f4091h = arrayList;
            c0939e.f4092i = c0951bArr;
            c0939e.f4093j = this.f4072i.get();
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n4 = this.f4086w;
            if (abstractComponentCallbacksC0963n4 != null) {
                c0939e.f4094k = abstractComponentCallbacksC0963n4.f4230k;
            }
            arrayList6.addAll(this.f4073j.keySet());
            arrayList7.addAll(this.f4073j.values());
            c0939e.f4097n = new ArrayList(this.f4053C);
            bundle.putParcelable("state", c0939e);
            for (String str : this.f4074k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f4074k.get(str));
            }
            int size3 = arrayList3.size();
            while (i3 < size3) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                C0942H c0942h2 = (C0942H) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", c0942h2);
                bundle.putBundle("fragment_" + c0942h2.f4106h, bundle4);
            }
        } else if (m2430F(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: S */
    public final void m2449S() {
        synchronized (this.f4064a) {
            try {
                if (this.f4064a.size() == 1) {
                    this.f4083t.f4250w.removeCallbacks(this.f4063M);
                    this.f4083t.f4250w.post(this.f4063M);
                    m2457a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m2450T(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n, boolean z3) {
        ViewGroup viewGroupM2436B = m2436B(abstractComponentCallbacksC0963n);
        if (viewGroupM2436B == null || !(viewGroupM2436B instanceof C0966q)) {
            return;
        }
        ((C0966q) viewGroupM2436B).setDrawDisappearingViewsLast(!z3);
    }

    /* JADX INFO: renamed from: U */
    public final void m2451U(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n, EnumC1000m enumC1000m) {
        if (abstractComponentCallbacksC0963n.equals(this.f4066c.m1335c(abstractComponentCallbacksC0963n.f4230k)) && (abstractComponentCallbacksC0963n.f4244y == null || abstractComponentCallbacksC0963n.f4243x == this)) {
            abstractComponentCallbacksC0963n.f4220Q = enumC1000m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0963n + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: V */
    public final void m2452V(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (abstractComponentCallbacksC0963n != null) {
            if (!abstractComponentCallbacksC0963n.equals(this.f4066c.m1335c(abstractComponentCallbacksC0963n.f4230k)) || (abstractComponentCallbacksC0963n.f4244y != null && abstractComponentCallbacksC0963n.f4243x != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0963n + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = this.f4086w;
        this.f4086w = abstractComponentCallbacksC0963n;
        m2473q(abstractComponentCallbacksC0963n2);
        m2473q(this.f4086w);
    }

    /* JADX INFO: renamed from: W */
    public final void m2453W(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        ViewGroup viewGroupM2436B = m2436B(abstractComponentCallbacksC0963n);
        if (viewGroupM2436B != null) {
            C0962m c0962m = abstractComponentCallbacksC0963n.f4216M;
            if ((c0962m == null ? 0 : c0962m.f4198e) + (c0962m == null ? 0 : c0962m.f4197d) + (c0962m == null ? 0 : c0962m.f4196c) + (c0962m == null ? 0 : c0962m.f4195b) > 0) {
                if (viewGroupM2436B.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM2436B.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0963n);
                }
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = (AbstractComponentCallbacksC0963n) viewGroupM2436B.getTag(R.id.visible_removing_fragment_view_tag);
                C0962m c0962m2 = abstractComponentCallbacksC0963n.f4216M;
                boolean z3 = c0962m2 != null ? c0962m2.f4194a : false;
                if (abstractComponentCallbacksC0963n2.f4216M == null) {
                    return;
                }
                abstractComponentCallbacksC0963n2.m2532f().f4194a = z3;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m2454Y() {
        ArrayList arrayListM1338f = this.f4066c.m1338f();
        int size = arrayListM1338f.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM1338f.get(i3);
            i3++;
            C0943I c0943i = (C0943I) obj;
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0943i.f4120c;
            if (abstractComponentCallbacksC0963n.f4214K) {
                if (this.f4065b) {
                    this.f4058H = true;
                } else {
                    abstractComponentCallbacksC0963n.f4214K = false;
                    c0943i.m2496j();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m2455Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0946L());
        C0965p c0965p = this.f4083t;
        if (c0965p == null) {
            try {
                m2477u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
                throw illegalStateException;
            }
        }
        try {
            c0965p.f4252y.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0943I m2456a(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        String str = abstractComponentCallbacksC0963n.f4219P;
        if (str != null) {
            AbstractC0363d.m1003c(abstractComponentCallbacksC0963n, str);
        }
        if (m2430F(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0963n);
        }
        C0943I c0943iM2462f = m2462f(abstractComponentCallbacksC0963n);
        abstractComponentCallbacksC0963n.f4243x = this;
        C0536b c0536b = this.f4066c;
        c0536b.m1341j(c0943iM2462f);
        if (!abstractComponentCallbacksC0963n.f4209F) {
            c0536b.m1334a(abstractComponentCallbacksC0963n);
            abstractComponentCallbacksC0963n.f4237r = false;
            abstractComponentCallbacksC0963n.f4217N = false;
            if (m2431G(abstractComponentCallbacksC0963n)) {
                this.f4054D = true;
            }
        }
        return c0943iM2462f;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2457a0() {
        synchronized (this.f4064a) {
            try {
                if (!this.f4064a.isEmpty()) {
                    C0970u c0970u = this.f4071h;
                    c0970u.f4262a = true;
                    C0902l c0902l = c0970u.f4264c;
                    if (c0902l != null) {
                        c0902l.mo2290a();
                    }
                    return;
                }
                C0970u c0970u2 = this.f4071h;
                ArrayList arrayList = this.f4067d;
                c0970u2.f4262a = (arrayList != null ? arrayList.size() : 0) > 0 && m2433J(this.f4085v);
                C0902l c0902l2 = c0970u2.f4264c;
                if (c0902l2 != null) {
                    c0902l2.mo2290a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2458b(C0965p c0965p, AbstractC0230e abstractC0230e, AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        C0940F c0940f;
        String str;
        if (this.f4083t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4083t = c0965p;
        this.f4084u = abstractC0230e;
        this.f4085v = abstractComponentCallbacksC0963n;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4076m;
        if (abstractComponentCallbacksC0963n != null) {
            copyOnWriteArrayList.add(new C0973x(abstractComponentCallbacksC0963n));
        } else if (c0965p != null) {
            copyOnWriteArrayList.add(c0965p);
        }
        if (this.f4085v != null) {
            m2457a0();
        }
        if (c0965p != null) {
            C0906p c0906p = c0965p.f4252y.f3749m;
            this.f4070g = c0906p;
            c0906p.m2308a(abstractComponentCallbacksC0963n != null ? abstractComponentCallbacksC0963n : c0965p, this.f4071h);
        }
        if (abstractComponentCallbacksC0963n != null) {
            C0940F c0940f2 = abstractComponentCallbacksC0963n.f4243x.f4062L;
            HashMap map = c0940f2.f4099d;
            C0940F c0940f3 = (C0940F) map.get(abstractComponentCallbacksC0963n.f4230k);
            if (c0940f3 == null) {
                c0940f3 = new C0940F(c0940f2.f4101f);
                map.put(abstractComponentCallbacksC0963n.f4230k, c0940f3);
            }
            this.f4062L = c0940f3;
        } else if (c0965p != null) {
            C0986K c0986kMo2299d = c0965p.f4252y.mo2299d();
            AbstractC2364c.m4954e(c0986kMo2299d, "store");
            C0401a c0401a = C0401a.f1359b;
            AbstractC2364c.m4954e(c0401a, "defaultCreationExtras");
            String canonicalName = C0940F.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC2364c.m4954e(strConcat, "key");
            LinkedHashMap linkedHashMap = c0986kMo2299d.f4299a;
            AbstractC0984I abstractC0984I = (AbstractC0984I) linkedHashMap.get(strConcat);
            if (C0940F.class.isInstance(abstractC0984I)) {
                AbstractC2364c.m4952c(abstractC0984I, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll((LinkedHashMap) c0401a.f1360a);
                linkedHashMap2.put(C0985J.f4298b, strConcat);
                try {
                    c0940f = new C0940F(true);
                } catch (AbstractMethodError unused) {
                    c0940f = new C0940F(true);
                }
                abstractC0984I = c0940f;
                AbstractC0984I abstractC0984I2 = (AbstractC0984I) linkedHashMap.put(strConcat, abstractC0984I);
                if (abstractC0984I2 != null) {
                    abstractC0984I2.mo1154a();
                }
            }
            this.f4062L = (C0940F) abstractC0984I;
        } else {
            this.f4062L = new C0940F(false);
        }
        C0940F c0940f4 = this.f4062L;
        c0940f4.f4103h = this.f4055E || this.f4056F;
        this.f4066c.f1870j = c0940f4;
        C0965p c0965p2 = this.f4083t;
        if (c0965p2 != null && abstractComponentCallbacksC0963n == null) {
            C1751d c1751dMo2298b = c0965p2.mo2298b();
            c1751dMo2298b.m4208e("android:support:fragments", new C0894d(2, this));
            Bundle bundleM4206c = c1751dMo2298b.m4206c("android:support:fragments");
            if (bundleM4206c != null) {
                m2447Q(bundleM4206c);
            }
        }
        C0965p c0965p3 = this.f4083t;
        if (c0965p3 != null) {
            AbstractActivityC1479j abstractActivityC1479j = c0965p3.f4252y;
            if (abstractComponentCallbacksC0963n != null) {
                str = abstractComponentCallbacksC0963n.f4230k + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            C0974y c0974y = new C0974y(2);
            C0969t c0969t = new C0969t(this, 1);
            C0896f c0896f = abstractActivityC1479j.f3752p;
            this.f4089z = c0896f.m2294b(str2 + "StartActivityForResult", c0974y, c0969t);
            this.f4051A = c0896f.m2294b(str2 + "StartIntentSenderForResult", new C0974y(0), new C0969t(this, 2));
            this.f4052B = c0896f.m2294b(str2 + "RequestPermissions", new C0974y(1), new C0969t(this, 0));
        }
        C0965p c0965p4 = this.f4083t;
        if (c0965p4 != null) {
            c0965p4.f4252y.m2301g(this.f4077n);
        }
        C0965p c0965p5 = this.f4083t;
        if (c0965p5 != null) {
            c0965p5.f4252y.f3754r.add(this.f4078o);
        }
        C0965p c0965p6 = this.f4083t;
        if (c0965p6 != null) {
            c0965p6.f4252y.f3756t.add(this.f4079p);
        }
        C0965p c0965p7 = this.f4083t;
        if (c0965p7 != null) {
            c0965p7.f4252y.f3757u.add(this.f4080q);
        }
        C0965p c0965p8 = this.f4083t;
        if (c0965p8 == null || abstractComponentCallbacksC0963n != null) {
            return;
        }
        AbstractActivityC1479j abstractActivityC1479j2 = c0965p8.f4252y;
        C0971v c0971v = this.f4081r;
        C0858A c0858a = abstractActivityC1479j2.f3745i;
        ((CopyOnWriteArrayList) c0858a.f3640i).add(c0971v);
        ((Runnable) c0858a.f3639h).run();
    }

    /* JADX INFO: renamed from: c */
    public final void m2459c(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (m2430F(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0963n);
        }
        if (abstractComponentCallbacksC0963n.f4209F) {
            abstractComponentCallbacksC0963n.f4209F = false;
            if (abstractComponentCallbacksC0963n.f4236q) {
                return;
            }
            this.f4066c.m1334a(abstractComponentCallbacksC0963n);
            if (m2430F(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0963n);
            }
            if (m2431G(abstractComponentCallbacksC0963n)) {
                this.f4054D = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2460d() {
        this.f4065b = false;
        this.f4060J.clear();
        this.f4059I.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m2461e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListM1338f = this.f4066c.m1338f();
        int size = arrayListM1338f.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM1338f.get(i3);
            i3++;
            ViewGroup viewGroup = ((C0943I) obj).f4120c.f4213J;
            if (viewGroup != null) {
                hashSet.add(C0955f.m2513d(viewGroup, m2438D()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final C0943I m2462f(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        String str = abstractComponentCallbacksC0963n.f4230k;
        C0536b c0536b = this.f4066c;
        C0943I c0943i = (C0943I) ((HashMap) c0536b.f1868h).get(str);
        if (c0943i != null) {
            return c0943i;
        }
        C0943I c0943i2 = new C0943I(this.f4075l, c0536b, abstractComponentCallbacksC0963n);
        c0943i2.m2498l(this.f4083t.f4249v.getClassLoader());
        c0943i2.f4122e = this.f4082s;
        return c0943i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2463g(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (m2430F(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0963n);
        }
        if (abstractComponentCallbacksC0963n.f4209F) {
            return;
        }
        abstractComponentCallbacksC0963n.f4209F = true;
        if (abstractComponentCallbacksC0963n.f4236q) {
            if (m2430F(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0963n);
            }
            C0536b c0536b = this.f4066c;
            synchronized (((ArrayList) c0536b.f1867g)) {
                ((ArrayList) c0536b.f1867g).remove(abstractComponentCallbacksC0963n);
            }
            abstractComponentCallbacksC0963n.f4236q = false;
            if (m2431G(abstractComponentCallbacksC0963n)) {
                this.f4054D = true;
            }
            m2453W(abstractComponentCallbacksC0963n);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2464h(boolean z3, Configuration configuration) {
        if (z3 && this.f4083t != null) {
            m2455Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null) {
                abstractComponentCallbacksC0963n.onConfigurationChanged(configuration);
                if (z3) {
                    abstractComponentCallbacksC0963n.f4245z.m2464h(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2465i() {
        if (this.f4082s >= 1) {
            for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
                if (abstractComponentCallbacksC0963n != null) {
                    if (!abstractComponentCallbacksC0963n.f4208E ? abstractComponentCallbacksC0963n.f4245z.m2465i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2466j() {
        if (this.f4082s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null && m2432I(abstractComponentCallbacksC0963n)) {
                if (!abstractComponentCallbacksC0963n.f4208E ? abstractComponentCallbacksC0963n.f4245z.m2466j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0963n);
                    z3 = true;
                }
            }
        }
        if (this.f4068e != null) {
            for (int i3 = 0; i3 < this.f4068e.size(); i3++) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = (AbstractComponentCallbacksC0963n) this.f4068e.get(i3);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0963n2)) {
                    abstractComponentCallbacksC0963n2.getClass();
                }
            }
        }
        this.f4068e = arrayList;
        return z3;
    }

    /* JADX INFO: renamed from: k */
    public final void m2467k() {
        boolean z3;
        Integer num;
        Integer num2;
        Integer num3;
        this.f4057G = true;
        m2480x(true);
        Iterator it = m2461e().iterator();
        while (it.hasNext()) {
            ((C0955f) it.next()).m2516c();
        }
        C0965p c0965p = this.f4083t;
        boolean z4 = c0965p != null;
        C0536b c0536b = this.f4066c;
        if (z4) {
            z3 = ((C0940F) c0536b.f1870j).f4102g;
        } else {
            AbstractActivityC1479j abstractActivityC1479j = c0965p.f4249v;
            z3 = AbstractC0948N.m2506a(abstractActivityC1479j) ? !abstractActivityC1479j.isChangingConfigurations() : true;
        }
        if (z3) {
            Iterator it2 = this.f4073j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C0952c) it2.next()).f4166g;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    String str = (String) obj;
                    C0940F c0940f = (C0940F) c0536b.f1870j;
                    c0940f.getClass();
                    if (m2430F(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c0940f.m2484c(str);
                }
            }
        }
        m2476t(-1);
        C0965p c0965p2 = this.f4083t;
        if (c0965p2 != null) {
            c0965p2.f4252y.f3754r.remove(this.f4078o);
        }
        C0965p c0965p3 = this.f4083t;
        if (c0965p3 != null) {
            c0965p3.f4252y.f3753q.remove(this.f4077n);
        }
        C0965p c0965p4 = this.f4083t;
        if (c0965p4 != null) {
            c0965p4.f4252y.f3756t.remove(this.f4079p);
        }
        C0965p c0965p5 = this.f4083t;
        if (c0965p5 != null) {
            c0965p5.f4252y.f3757u.remove(this.f4080q);
        }
        C0965p c0965p6 = this.f4083t;
        if (c0965p6 != null) {
            AbstractActivityC1479j abstractActivityC1479j2 = c0965p6.f4252y;
            C0971v c0971v = this.f4081r;
            C0858A c0858a = abstractActivityC1479j2.f3745i;
            ((CopyOnWriteArrayList) c0858a.f3640i).remove(c0971v);
            if (((HashMap) c0858a.f3641j).remove(c0971v) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0858a.f3639h).run();
        }
        this.f4083t = null;
        this.f4084u = null;
        this.f4085v = null;
        if (this.f4070g != null) {
            Iterator it3 = this.f4071h.f4263b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0891a) it3.next()).cancel();
            }
            this.f4070g = null;
        }
        C0106b c0106b = this.f4089z;
        if (c0106b != null) {
            C0896f c0896f = (C0896f) c0106b.f141i;
            ArrayList arrayList2 = c0896f.f3735e;
            String str2 = (String) c0106b.f140h;
            if (!arrayList2.contains(str2) && (num3 = (Integer) c0896f.f3733c.remove(str2)) != null) {
                c0896f.f3732b.remove(num3);
            }
            c0896f.f3736f.remove(str2);
            HashMap map = c0896f.f3737g;
            if (map.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + map.get(str2));
                map.remove(str2);
            }
            Bundle bundle = c0896f.f3738h;
            if (bundle.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + bundle.getParcelable(str2));
                bundle.remove(str2);
            }
            if (c0896f.f3734d.get(str2) != null) {
                throw new ClassCastException();
            }
            C0106b c0106b2 = this.f4051A;
            C0896f c0896f2 = (C0896f) c0106b2.f141i;
            ArrayList arrayList3 = c0896f2.f3735e;
            String str3 = (String) c0106b2.f140h;
            if (!arrayList3.contains(str3) && (num2 = (Integer) c0896f2.f3733c.remove(str3)) != null) {
                c0896f2.f3732b.remove(num2);
            }
            c0896f2.f3736f.remove(str3);
            HashMap map2 = c0896f2.f3737g;
            if (map2.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + map2.get(str3));
                map2.remove(str3);
            }
            Bundle bundle2 = c0896f2.f3738h;
            if (bundle2.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + bundle2.getParcelable(str3));
                bundle2.remove(str3);
            }
            if (c0896f2.f3734d.get(str3) != null) {
                throw new ClassCastException();
            }
            C0106b c0106b3 = this.f4052B;
            C0896f c0896f3 = (C0896f) c0106b3.f141i;
            ArrayList arrayList4 = c0896f3.f3735e;
            String str4 = (String) c0106b3.f140h;
            if (!arrayList4.contains(str4) && (num = (Integer) c0896f3.f3733c.remove(str4)) != null) {
                c0896f3.f3732b.remove(num);
            }
            c0896f3.f3736f.remove(str4);
            HashMap map3 = c0896f3.f3737g;
            if (map3.containsKey(str4)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str4 + ": " + map3.get(str4));
                map3.remove(str4);
            }
            Bundle bundle3 = c0896f3.f3738h;
            if (bundle3.containsKey(str4)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str4 + ": " + bundle3.getParcelable(str4));
                bundle3.remove(str4);
            }
            if (c0896f3.f3734d.get(str4) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2468l(boolean z3) {
        if (z3 && this.f4083t != null) {
            m2455Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null) {
                abstractComponentCallbacksC0963n.f4212I = true;
                if (z3) {
                    abstractComponentCallbacksC0963n.f4245z.m2468l(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2469m(boolean z3) {
        if (z3 && this.f4083t != null) {
            m2455Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null && z3) {
                abstractComponentCallbacksC0963n.f4245z.m2469m(true);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2470n() {
        ArrayList arrayListM1339g = this.f4066c.m1339g();
        int size = arrayListM1339g.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM1339g.get(i3);
            i3++;
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = (AbstractComponentCallbacksC0963n) obj;
            if (abstractComponentCallbacksC0963n != null) {
                abstractComponentCallbacksC0963n.m2539m();
                abstractComponentCallbacksC0963n.f4245z.m2470n();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2471o() {
        if (this.f4082s >= 1) {
            for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
                if (abstractComponentCallbacksC0963n != null) {
                    if (!abstractComponentCallbacksC0963n.f4208E ? abstractComponentCallbacksC0963n.f4245z.m2471o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m2472p() {
        if (this.f4082s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null && !abstractComponentCallbacksC0963n.f4208E) {
                abstractComponentCallbacksC0963n.f4245z.m2472p();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2473q(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (abstractComponentCallbacksC0963n != null) {
            if (abstractComponentCallbacksC0963n.equals(this.f4066c.m1335c(abstractComponentCallbacksC0963n.f4230k))) {
                abstractComponentCallbacksC0963n.f4243x.getClass();
                boolean zM2433J = m2433J(abstractComponentCallbacksC0963n);
                Boolean bool = abstractComponentCallbacksC0963n.f4235p;
                if (bool == null || bool.booleanValue() != zM2433J) {
                    abstractComponentCallbacksC0963n.f4235p = Boolean.valueOf(zM2433J);
                    C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
                    c0938d.m2457a0();
                    c0938d.m2473q(c0938d.f4086w);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2474r(boolean z3) {
        if (z3 && this.f4083t != null) {
            m2455Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null && z3) {
                abstractComponentCallbacksC0963n.f4245z.m2474r(true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2475s() {
        if (this.f4082s < 1) {
            return false;
        }
        boolean z3 = false;
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : this.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null && m2432I(abstractComponentCallbacksC0963n)) {
                if (!abstractComponentCallbacksC0963n.f4208E ? abstractComponentCallbacksC0963n.f4245z.m2475s() : false) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: t */
    public final void m2476t(int i3) {
        try {
            this.f4065b = true;
            for (C0943I c0943i : ((HashMap) this.f4066c.f1868h).values()) {
                if (c0943i != null) {
                    c0943i.f4122e = i3;
                }
            }
            m2441K(i3, false);
            Iterator it = m2461e().iterator();
            while (it.hasNext()) {
                ((C0955f) it.next()).m2516c();
            }
            this.f4065b = false;
            m2480x(true);
        } catch (Throwable th) {
            this.f4065b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            sb.append(abstractComponentCallbacksC0963n.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4085v)));
            sb.append("}");
        } else {
            C0965p c0965p = this.f4083t;
            if (c0965p != null) {
                sb.append(c0965p.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4083t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m2477u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String str3 = str + "    ";
        C0536b c0536b = this.f4066c;
        c0536b.getClass();
        String str4 = str + "    ";
        HashMap map = (HashMap) c0536b.f1868h;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0943I c0943i : map.values()) {
                printWriter.print(str);
                if (c0943i != null) {
                    AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0943i.f4120c;
                    printWriter.println(abstractComponentCallbacksC0963n);
                    abstractComponentCallbacksC0963n.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0963n.f4205B));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0963n.f4206C));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0963n.f4207D);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4226g);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4230k);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0963n.f4242w);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4236q);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4237r);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4238s);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0963n.f4239t);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4208E);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4209F);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4211H);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0963n.f4210G);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0963n.f4215L);
                    if (abstractComponentCallbacksC0963n.f4243x != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4243x);
                    }
                    if (abstractComponentCallbacksC0963n.f4244y != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4244y);
                    }
                    if (abstractComponentCallbacksC0963n.f4204A != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4204A);
                    }
                    if (abstractComponentCallbacksC0963n.f4231l != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4231l);
                    }
                    if (abstractComponentCallbacksC0963n.f4227h != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4227h);
                    }
                    if (abstractComponentCallbacksC0963n.f4228i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4228i);
                    }
                    if (abstractComponentCallbacksC0963n.f4229j != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4229j);
                    }
                    Object objM1335c = abstractComponentCallbacksC0963n.f4232m;
                    if (objM1335c == null) {
                        AbstractC0937C abstractC0937C = abstractComponentCallbacksC0963n.f4243x;
                        objM1335c = (abstractC0937C == null || (str2 = abstractComponentCallbacksC0963n.f4233n) == null) ? null : abstractC0937C.f4066c.m1335c(str2);
                    }
                    if (objM1335c != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objM1335c);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4234o);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    C0962m c0962m = abstractComponentCallbacksC0963n.f4216M;
                    printWriter.println(c0962m == null ? false : c0962m.f4194a);
                    C0962m c0962m2 = abstractComponentCallbacksC0963n.f4216M;
                    if ((c0962m2 == null ? 0 : c0962m2.f4195b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        C0962m c0962m3 = abstractComponentCallbacksC0963n.f4216M;
                        printWriter.println(c0962m3 == null ? 0 : c0962m3.f4195b);
                    }
                    C0962m c0962m4 = abstractComponentCallbacksC0963n.f4216M;
                    if ((c0962m4 == null ? 0 : c0962m4.f4196c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        C0962m c0962m5 = abstractComponentCallbacksC0963n.f4216M;
                        printWriter.println(c0962m5 == null ? 0 : c0962m5.f4196c);
                    }
                    C0962m c0962m6 = abstractComponentCallbacksC0963n.f4216M;
                    if ((c0962m6 == null ? 0 : c0962m6.f4197d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        C0962m c0962m7 = abstractComponentCallbacksC0963n.f4216M;
                        printWriter.println(c0962m7 == null ? 0 : c0962m7.f4197d);
                    }
                    C0962m c0962m8 = abstractComponentCallbacksC0963n.f4216M;
                    if ((c0962m8 == null ? 0 : c0962m8.f4198e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        C0962m c0962m9 = abstractComponentCallbacksC0963n.f4216M;
                        printWriter.println(c0962m9 != null ? c0962m9.f4198e : 0);
                    }
                    if (abstractComponentCallbacksC0963n.f4213J != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0963n.f4213J);
                    }
                    if (abstractComponentCallbacksC0963n.m2534h() != null) {
                        new C0106b(abstractComponentCallbacksC0963n, abstractComponentCallbacksC0963n.mo2299d()).m506D(str4, printWriter);
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + abstractComponentCallbacksC0963n.f4245z + ":");
                    abstractComponentCallbacksC0963n.f4245z.m2477u(str4 + "  ", fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0536b.f1867g;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size3; i3++) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = (AbstractComponentCallbacksC0963n) arrayList.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0963n2.toString());
            }
        }
        ArrayList arrayList2 = this.f4068e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n3 = (AbstractComponentCallbacksC0963n) this.f4068e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0963n3.toString());
            }
        }
        ArrayList arrayList3 = this.f4067d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                C0950a c0950a = (C0950a) this.f4067d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0950a.toString());
                c0950a.m2512f(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4072i.get());
        synchronized (this.f4064a) {
            try {
                int size4 = this.f4064a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size4; i6++) {
                        Object obj = (InterfaceC0935A) this.f4064a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4083t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4084u);
        if (this.f4085v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4085v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4082s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4055E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4056F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4057G);
        if (this.f4054D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4054D);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2478v(InterfaceC0935A interfaceC0935A, boolean z3) {
        if (!z3) {
            if (this.f4083t == null) {
                if (!this.f4057G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f4055E || this.f4056F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4064a) {
            try {
                if (this.f4083t == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4064a.add(interfaceC0935A);
                    m2449S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2479w(boolean z3) {
        if (this.f4065b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4083t == null) {
            if (!this.f4057G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4083t.f4250w.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && (this.f4055E || this.f4056F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4059I == null) {
            this.f4059I = new ArrayList();
            this.f4060J = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2480x(boolean z3) {
        boolean zMo2429a;
        m2479w(z3);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f4059I;
            ArrayList arrayList2 = this.f4060J;
            synchronized (this.f4064a) {
                if (this.f4064a.isEmpty()) {
                    zMo2429a = false;
                } else {
                    try {
                        int size = this.f4064a.size();
                        zMo2429a = false;
                        for (int i3 = 0; i3 < size; i3++) {
                            zMo2429a |= ((InterfaceC0935A) this.f4064a.get(i3)).mo2429a(arrayList, arrayList2);
                        }
                        this.f4064a.clear();
                        this.f4083t.f4250w.removeCallbacks(this.f4063M);
                    } catch (Throwable th) {
                        this.f4064a.clear();
                        this.f4083t.f4250w.removeCallbacks(this.f4063M);
                        throw th;
                    }
                }
            }
            if (!zMo2429a) {
                break;
            }
            z4 = true;
            this.f4065b = true;
            try {
                m2446P(this.f4059I, this.f4060J);
                m2460d();
            } catch (Throwable th2) {
                m2460d();
                throw th2;
            }
        }
        m2457a0();
        if (this.f4058H) {
            this.f4058H = false;
            m2454Y();
        }
        ((HashMap) this.f4066c.f1868h).values().removeAll(Collections.singleton(null));
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX INFO: renamed from: y */
    public final void m2481y(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        ViewGroup viewGroup;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        boolean z7 = ((C0950a) arrayList.get(i3)).f4148o;
        ArrayList arrayList3 = this.f4061K;
        if (arrayList3 == null) {
            this.f4061K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f4061K;
        C0536b c0536b = this.f4066c;
        arrayList4.addAll(c0536b.m1340i());
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4086w;
        int i9 = i3;
        boolean z8 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i4) {
                boolean z9 = z7;
                this.f4061K.clear();
                if (!z9 && this.f4082s >= 1) {
                    for (int i11 = i3; i11 < i4; i11++) {
                        ArrayList arrayList5 = ((C0950a) arrayList.get(i11)).f4134a;
                        int size = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList5.get(i12);
                            i12++;
                            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = ((C0944J) obj).f4124b;
                            if (abstractComponentCallbacksC0963n2 != null && abstractComponentCallbacksC0963n2.f4243x != null) {
                                c0536b.m1341j(m2462f(abstractComponentCallbacksC0963n2));
                            }
                        }
                    }
                }
                for (int i13 = i3; i13 < i4; i13++) {
                    C0950a c0950a = (C0950a) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        c0950a.m2509c(-1);
                        ArrayList arrayList6 = c0950a.f4134a;
                        boolean z10 = true;
                        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                            C0944J c0944j = (C0944J) arrayList6.get(size2);
                            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n3 = c0944j.f4124b;
                            if (abstractComponentCallbacksC0963n3 != null) {
                                if (abstractComponentCallbacksC0963n3.f4216M != null) {
                                    abstractComponentCallbacksC0963n3.m2532f().f4194a = z10;
                                }
                                int i14 = c0950a.f4139f;
                                char c = 8194;
                                if (i14 != 4097) {
                                    if (i14 != 8194) {
                                        c = 4100;
                                        if (i14 != 8197) {
                                            c = i14 != 4099 ? i14 != 4100 ? (char) 0 : (char) 8197 : (char) 4099;
                                        }
                                    } else {
                                        c = 4097;
                                    }
                                }
                                if (abstractComponentCallbacksC0963n3.f4216M != null || c != 0) {
                                    abstractComponentCallbacksC0963n3.m2532f();
                                    abstractComponentCallbacksC0963n3.f4216M.getClass();
                                }
                                abstractComponentCallbacksC0963n3.m2532f();
                                abstractComponentCallbacksC0963n3.f4216M.getClass();
                            }
                            int i15 = c0944j.f4123a;
                            AbstractC0937C abstractC0937C = c0950a.f4149p;
                            switch (i15) {
                                case 1:
                                    abstractComponentCallbacksC0963n3.m2530A(c0944j.f4126d, c0944j.f4127e, c0944j.f4128f, c0944j.f4129g);
                                    z10 = true;
                                    abstractC0937C.m2450T(abstractComponentCallbacksC0963n3, true);
                                    abstractC0937C.m2445O(abstractComponentCallbacksC0963n3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0944j.f4123a);
                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    abstractComponentCallbacksC0963n3.m2530A(c0944j.f4126d, c0944j.f4127e, c0944j.f4128f, c0944j.f4129g);
                                    abstractC0937C.m2456a(abstractComponentCallbacksC0963n3);
                                    z10 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0963n3.m2530A(c0944j.f4126d, c0944j.f4127e, c0944j.f4128f, c0944j.f4129g);
                                    abstractC0937C.getClass();
                                    m2434X(abstractComponentCallbacksC0963n3);
                                    z10 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0963n3.m2530A(c0944j.f4126d, c0944j.f4127e, c0944j.f4128f, c0944j.f4129g);
                                    abstractC0937C.m2450T(abstractComponentCallbacksC0963n3, true);
                                    abstractC0937C.m2439E(abstractComponentCallbacksC0963n3);
                                    z10 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0963n3.m2530A(c0944j.f4126d, c0944j.f4127e, c0944j.f4128f, c0944j.f4129g);
                                    abstractC0937C.m2459c(abstractComponentCallbacksC0963n3);
                                    z10 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0963n3.m2530A(c0944j.f4126d, c0944j.f4127e, c0944j.f4128f, c0944j.f4129g);
                                    abstractC0937C.m2450T(abstractComponentCallbacksC0963n3, true);
                                    abstractC0937C.m2463g(abstractComponentCallbacksC0963n3);
                                    z10 = true;
                                    break;
                                case 8:
                                    abstractC0937C.m2452V(null);
                                    z10 = true;
                                    break;
                                case 9:
                                    abstractC0937C.m2452V(abstractComponentCallbacksC0963n3);
                                    z10 = true;
                                    break;
                                case 10:
                                    abstractC0937C.m2451U(abstractComponentCallbacksC0963n3, c0944j.f4130h);
                                    z10 = true;
                                    break;
                            }
                        }
                    } else {
                        c0950a.m2509c(1);
                        ArrayList arrayList7 = c0950a.f4134a;
                        int size3 = arrayList7.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            C0944J c0944j2 = (C0944J) arrayList7.get(i16);
                            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n4 = c0944j2.f4124b;
                            if (abstractComponentCallbacksC0963n4 != null) {
                                if (abstractComponentCallbacksC0963n4.f4216M != null) {
                                    abstractComponentCallbacksC0963n4.m2532f().f4194a = false;
                                }
                                int i17 = c0950a.f4139f;
                                if (abstractComponentCallbacksC0963n4.f4216M != null || i17 != 0) {
                                    abstractComponentCallbacksC0963n4.m2532f();
                                    abstractComponentCallbacksC0963n4.f4216M.getClass();
                                }
                                abstractComponentCallbacksC0963n4.m2532f();
                                abstractComponentCallbacksC0963n4.f4216M.getClass();
                            }
                            int i18 = c0944j2.f4123a;
                            AbstractC0937C abstractC0937C2 = c0950a.f4149p;
                            switch (i18) {
                                case 1:
                                    abstractComponentCallbacksC0963n4.m2530A(c0944j2.f4126d, c0944j2.f4127e, c0944j2.f4128f, c0944j2.f4129g);
                                    abstractC0937C2.m2450T(abstractComponentCallbacksC0963n4, false);
                                    abstractC0937C2.m2456a(abstractComponentCallbacksC0963n4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0944j2.f4123a);
                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    abstractComponentCallbacksC0963n4.m2530A(c0944j2.f4126d, c0944j2.f4127e, c0944j2.f4128f, c0944j2.f4129g);
                                    abstractC0937C2.m2445O(abstractComponentCallbacksC0963n4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0963n4.m2530A(c0944j2.f4126d, c0944j2.f4127e, c0944j2.f4128f, c0944j2.f4129g);
                                    abstractC0937C2.m2439E(abstractComponentCallbacksC0963n4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0963n4.m2530A(c0944j2.f4126d, c0944j2.f4127e, c0944j2.f4128f, c0944j2.f4129g);
                                    abstractC0937C2.m2450T(abstractComponentCallbacksC0963n4, false);
                                    m2434X(abstractComponentCallbacksC0963n4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0963n4.m2530A(c0944j2.f4126d, c0944j2.f4127e, c0944j2.f4128f, c0944j2.f4129g);
                                    abstractC0937C2.m2463g(abstractComponentCallbacksC0963n4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0963n4.m2530A(c0944j2.f4126d, c0944j2.f4127e, c0944j2.f4128f, c0944j2.f4129g);
                                    abstractC0937C2.m2450T(abstractComponentCallbacksC0963n4, false);
                                    abstractC0937C2.m2459c(abstractComponentCallbacksC0963n4);
                                    break;
                                case 8:
                                    abstractC0937C2.m2452V(abstractComponentCallbacksC0963n4);
                                    break;
                                case 9:
                                    abstractC0937C2.m2452V(null);
                                    break;
                                case 10:
                                    abstractC0937C2.m2451U(abstractComponentCallbacksC0963n4, c0944j2.f4131i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i19 = i3; i19 < i4; i19++) {
                    C0950a c0950a2 = (C0950a) arrayList.get(i19);
                    if (zBooleanValue) {
                        for (int size4 = c0950a2.f4134a.size() - 1; size4 >= 0; size4--) {
                            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n5 = ((C0944J) c0950a2.f4134a.get(size4)).f4124b;
                            if (abstractComponentCallbacksC0963n5 != null) {
                                m2462f(abstractComponentCallbacksC0963n5).m2496j();
                            }
                        }
                    } else {
                        ArrayList arrayList8 = c0950a2.f4134a;
                        int size5 = arrayList8.size();
                        int i20 = 0;
                        while (i20 < size5) {
                            Object obj2 = arrayList8.get(i20);
                            i20++;
                            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n6 = ((C0944J) obj2).f4124b;
                            if (abstractComponentCallbacksC0963n6 != null) {
                                m2462f(abstractComponentCallbacksC0963n6).m2496j();
                            }
                        }
                    }
                }
                m2441K(this.f4082s, true);
                HashSet<C0955f> hashSet = new HashSet();
                for (int i21 = i3; i21 < i4; i21++) {
                    ArrayList arrayList9 = ((C0950a) arrayList.get(i21)).f4134a;
                    int size6 = arrayList9.size();
                    int i22 = 0;
                    while (i22 < size6) {
                        Object obj3 = arrayList9.get(i22);
                        i22++;
                        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n7 = ((C0944J) obj3).f4124b;
                        if (abstractComponentCallbacksC0963n7 != null && (viewGroup = abstractComponentCallbacksC0963n7.f4213J) != null) {
                            hashSet.add(C0955f.m2513d(viewGroup, m2438D()));
                        }
                    }
                }
                for (C0955f c0955f : hashSet) {
                    c0955f.f4171d = zBooleanValue;
                    synchronized (c0955f.f4169b) {
                        c0955f.m2517e();
                        c0955f.f4172e = false;
                        int size7 = c0955f.f4169b.size() - 1;
                        if (size7 >= 0) {
                            ((AbstractC0947M) c0955f.f4169b.get(size7)).getClass();
                            throw null;
                        }
                    }
                    c0955f.m2515b();
                }
                for (int i23 = i3; i23 < i4; i23++) {
                    C0950a c0950a3 = (C0950a) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue() && c0950a3.f4151r >= 0) {
                        c0950a3.f4151r = -1;
                    }
                    c0950a3.getClass();
                }
                return;
            }
            C0950a c0950a4 = (C0950a) arrayList.get(i9);
            if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                z3 = z7;
                i5 = i9;
                z4 = z8;
                int i24 = 1;
                ArrayList arrayList10 = this.f4061K;
                ArrayList arrayList11 = c0950a4.f4134a;
                int size8 = arrayList11.size() - 1;
                while (size8 >= 0) {
                    C0944J c0944j3 = (C0944J) arrayList11.get(size8);
                    int i25 = c0944j3.f4123a;
                    if (i25 == i24) {
                        arrayList10.remove(c0944j3.f4124b);
                    } else if (i25 != 3) {
                        switch (i25) {
                            case 6:
                                arrayList10.add(c0944j3.f4124b);
                                break;
                            case 7:
                                arrayList10.remove(c0944j3.f4124b);
                                break;
                            case 8:
                                abstractComponentCallbacksC0963n = null;
                                break;
                            case 9:
                                abstractComponentCallbacksC0963n = c0944j3.f4124b;
                                break;
                            case 10:
                                c0944j3.f4131i = c0944j3.f4130h;
                                break;
                        }
                    } else {
                        arrayList10.add(c0944j3.f4124b);
                    }
                    size8--;
                    i24 = 1;
                }
            } else {
                ArrayList arrayList12 = this.f4061K;
                int i26 = 0;
                while (true) {
                    ArrayList arrayList13 = c0950a4.f4134a;
                    if (i26 < arrayList13.size()) {
                        C0944J c0944j4 = (C0944J) arrayList13.get(i26);
                        int i27 = c0944j4.f4123a;
                        if (i27 != i10) {
                            z5 = z7;
                            if (i27 != 2) {
                                if (i27 == 3 || i27 == 6) {
                                    arrayList12.remove(c0944j4.f4124b);
                                    AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n8 = c0944j4.f4124b;
                                    if (abstractComponentCallbacksC0963n8 == abstractComponentCallbacksC0963n) {
                                        arrayList13.add(i26, new C0944J(9, abstractComponentCallbacksC0963n8));
                                        i26++;
                                        i6 = i9;
                                        z6 = z8;
                                        i7 = 1;
                                        abstractComponentCallbacksC0963n = null;
                                    }
                                } else if (i27 != 7) {
                                    if (i27 == 8) {
                                        arrayList13.add(i26, new C0944J(9, abstractComponentCallbacksC0963n, 0));
                                        c0944j4.f4125c = true;
                                        i26++;
                                        abstractComponentCallbacksC0963n = c0944j4.f4124b;
                                    }
                                }
                                i6 = i9;
                                z6 = z8;
                                i7 = 1;
                            } else {
                                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n9 = c0944j4.f4124b;
                                int i28 = abstractComponentCallbacksC0963n9.f4206C;
                                int size9 = arrayList12.size() - 1;
                                boolean z11 = false;
                                while (size9 >= 0) {
                                    int i29 = size9;
                                    AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n10 = (AbstractComponentCallbacksC0963n) arrayList12.get(size9);
                                    int i30 = i9;
                                    if (abstractComponentCallbacksC0963n10.f4206C != i28) {
                                        z8 = z8;
                                    } else if (abstractComponentCallbacksC0963n10 == abstractComponentCallbacksC0963n9) {
                                        z8 = z8;
                                        z11 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0963n10 == abstractComponentCallbacksC0963n) {
                                            i8 = 0;
                                            arrayList13.add(i26, new C0944J(9, abstractComponentCallbacksC0963n10, 0));
                                            i26++;
                                            abstractComponentCallbacksC0963n = null;
                                        } else {
                                            i8 = 0;
                                        }
                                        C0944J c0944j5 = new C0944J(3, abstractComponentCallbacksC0963n10, i8);
                                        c0944j5.f4126d = c0944j4.f4126d;
                                        c0944j5.f4128f = c0944j4.f4128f;
                                        c0944j5.f4127e = c0944j4.f4127e;
                                        c0944j5.f4129g = c0944j4.f4129g;
                                        arrayList13.add(i26, c0944j5);
                                        arrayList12.remove(abstractComponentCallbacksC0963n10);
                                        i26++;
                                        abstractComponentCallbacksC0963n = abstractComponentCallbacksC0963n;
                                    }
                                    size9 = i29 - 1;
                                    z8 = z8;
                                    i9 = i30;
                                }
                                i6 = i9;
                                z6 = z8;
                                i7 = 1;
                                if (z11) {
                                    arrayList13.remove(i26);
                                    i26--;
                                } else {
                                    c0944j4.f4123a = 1;
                                    c0944j4.f4125c = true;
                                    arrayList12.add(abstractComponentCallbacksC0963n9);
                                }
                            }
                            i26 += i7;
                            z7 = z5;
                            z8 = z6;
                            i9 = i6;
                            i10 = 1;
                        } else {
                            z5 = z7;
                        }
                        i6 = i9;
                        z6 = z8;
                        i7 = 1;
                        arrayList12.add(c0944j4.f4124b);
                        i26 += i7;
                        z7 = z5;
                        z8 = z6;
                        i9 = i6;
                        i10 = 1;
                    } else {
                        z3 = z7;
                        i5 = i9;
                        z4 = z8;
                    }
                }
            }
            z8 = z4 || c0950a4.f4140g;
            i9 = i5 + 1;
            z7 = z3;
        }
    }

    /* JADX INFO: renamed from: z */
    public final AbstractComponentCallbacksC0963n m2482z(int i3) {
        C0536b c0536b = this.f4066c;
        ArrayList arrayList = (ArrayList) c0536b.f1867g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = (AbstractComponentCallbacksC0963n) arrayList.get(size);
            if (abstractComponentCallbacksC0963n != null && abstractComponentCallbacksC0963n.f4205B == i3) {
                return abstractComponentCallbacksC0963n;
            }
        }
        for (C0943I c0943i : ((HashMap) c0536b.f1868h).values()) {
            if (c0943i != null) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = c0943i.f4120c;
                if (abstractComponentCallbacksC0963n2.f4205B == i3) {
                    return abstractComponentCallbacksC0963n2;
                }
            }
        }
        return null;
    }
}
