package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C1011x;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.EnumC1000m;
import androidx.lifecycle.InterfaceC1003p;
import androidx.lifecycle.InterfaceC1005r;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p009D0.C0106b;
import p035M.AbstractC0363d;
import p035M.C0360a;
import p035M.C0362c;
import p041O.C0446a;
import p053S0.C0536b;
import p091e.AbstractActivityC1479j;
import p124n.C2023j;

/* JADX INFO: renamed from: androidx.fragment.app.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0943I {

    /* JADX INFO: renamed from: a */
    public final C0106b f4118a;

    /* JADX INFO: renamed from: b */
    public final C0536b f4119b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0963n f4120c;

    /* JADX INFO: renamed from: d */
    public boolean f4121d = false;

    /* JADX INFO: renamed from: e */
    public int f4122e = -1;

    public C0943I(C0106b c0106b, C0536b c0536b, AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        this.f4118a = c0106b;
        this.f4119b = c0536b;
        this.f4120c = abstractComponentCallbacksC0963n;
    }

    /* JADX INFO: renamed from: a */
    public final void m2487a() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0963n);
        }
        Bundle bundle = abstractComponentCallbacksC0963n.f4227h;
        abstractComponentCallbacksC0963n.f4245z.m2442L();
        abstractComponentCallbacksC0963n.f4226g = 3;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.mo2519o();
        if (!abstractComponentCallbacksC0963n.f4212I) {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onActivityCreated()");
        }
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.f4227h = null;
        C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
        c0938d.f4055E = false;
        c0938d.f4056F = false;
        c0938d.f4062L.f4103h = false;
        c0938d.m2476t(4);
        this.f4118a.m529q(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m2488b() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0963n);
        }
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = abstractComponentCallbacksC0963n.f4232m;
        C0943I c0943i = null;
        C0536b c0536b = this.f4119b;
        if (abstractComponentCallbacksC0963n2 != null) {
            C0943I c0943i2 = (C0943I) ((HashMap) c0536b.f1868h).get(abstractComponentCallbacksC0963n2.f4230k);
            if (c0943i2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0963n + " declared target fragment " + abstractComponentCallbacksC0963n.f4232m + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0963n.f4233n = abstractComponentCallbacksC0963n.f4232m.f4230k;
            abstractComponentCallbacksC0963n.f4232m = null;
            c0943i = c0943i2;
        } else {
            String str = abstractComponentCallbacksC0963n.f4233n;
            if (str != null && (c0943i = (C0943I) ((HashMap) c0536b.f1868h).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0963n + " declared target fragment " + abstractComponentCallbacksC0963n.f4233n + " that does not belong to this FragmentManager!");
            }
        }
        if (c0943i != null) {
            c0943i.m2496j();
        }
        AbstractC0937C abstractC0937C = abstractComponentCallbacksC0963n.f4243x;
        abstractComponentCallbacksC0963n.f4244y = abstractC0937C.f4083t;
        abstractComponentCallbacksC0963n.f4204A = abstractC0937C.f4085v;
        C0106b c0106b = this.f4118a;
        c0106b.m535w(false);
        ArrayList arrayList = abstractComponentCallbacksC0963n.f4224U;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((C0960k) obj).m2529a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0963n.f4245z.m2458b(abstractComponentCallbacksC0963n.f4244y, abstractComponentCallbacksC0963n.mo2518c(), abstractComponentCallbacksC0963n);
        abstractComponentCallbacksC0963n.f4226g = 0;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.mo2520q(abstractComponentCallbacksC0963n.f4244y.f4249v);
        if (!abstractComponentCallbacksC0963n.f4212I) {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onAttach()");
        }
        Iterator it = abstractComponentCallbacksC0963n.f4243x.f4076m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0941G) it.next()).mo2486a();
        }
        C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
        c0938d.f4055E = false;
        c0938d.f4056F = false;
        c0938d.f4062L.f4103h = false;
        c0938d.m2476t(0);
        c0106b.m530r(false);
    }

    /* JADX INFO: renamed from: c */
    public final int m2489c() {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (abstractComponentCallbacksC0963n.f4243x == null) {
            return abstractComponentCallbacksC0963n.f4226g;
        }
        int iMin = this.f4122e;
        int iOrdinal = abstractComponentCallbacksC0963n.f4220Q.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0963n.f4238s) {
            if (abstractComponentCallbacksC0963n.f4239t) {
                iMin = Math.max(this.f4122e, 2);
            } else {
                iMin = this.f4122e < 4 ? Math.min(iMin, abstractComponentCallbacksC0963n.f4226g) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0963n.f4236q) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0963n.f4213J;
        if (viewGroup != null) {
            C0955f c0955fM2513d = C0955f.m2513d(viewGroup, abstractComponentCallbacksC0963n.m2536j().m2438D());
            c0955fM2513d.getClass();
            ArrayList arrayList = c0955fM2513d.f4169b;
            if (arrayList.size() > 0) {
                ((AbstractC0947M) arrayList.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList2 = c0955fM2513d.f4170c;
            if (arrayList2.size() > 0) {
                ((AbstractC0947M) arrayList2.get(0)).getClass();
                throw null;
            }
        }
        if (abstractComponentCallbacksC0963n.f4237r) {
            iMin = abstractComponentCallbacksC0963n.m2540n() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0963n.f4214K && abstractComponentCallbacksC0963n.f4226g < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0963n);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: d */
    public final void m2490d() {
        Parcelable parcelable;
        boolean zM2430F = AbstractC0937C.m2430F(3);
        final AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0963n);
        }
        if (abstractComponentCallbacksC0963n.f4218O) {
            Bundle bundle = abstractComponentCallbacksC0963n.f4227h;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0963n.f4245z.m2447Q(parcelable);
                C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
                c0938d.f4055E = false;
                c0938d.f4056F = false;
                c0938d.f4062L.f4103h = false;
                c0938d.m2476t(1);
            }
            abstractComponentCallbacksC0963n.f4226g = 1;
            return;
        }
        C0106b c0106b = this.f4118a;
        c0106b.m536x(false);
        Bundle bundle2 = abstractComponentCallbacksC0963n.f4227h;
        abstractComponentCallbacksC0963n.f4245z.m2442L();
        abstractComponentCallbacksC0963n.f4226g = 1;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.f4221R.m2565a(new InterfaceC1003p() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.InterfaceC1003p
            /* JADX INFO: renamed from: b */
            public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
                if (enumC0999l == EnumC0999l.ON_STOP) {
                    abstractComponentCallbacksC0963n.getClass();
                }
            }
        });
        abstractComponentCallbacksC0963n.f4223T.m2055b(bundle2);
        abstractComponentCallbacksC0963n.mo2521r(bundle2);
        abstractComponentCallbacksC0963n.f4218O = true;
        if (abstractComponentCallbacksC0963n.f4212I) {
            abstractComponentCallbacksC0963n.f4221R.m2568d(EnumC0999l.ON_CREATE);
            c0106b.m531s(false);
        } else {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onCreate()");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2491e() {
        String resourceName;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (abstractComponentCallbacksC0963n.f4238s) {
            return;
        }
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0963n);
        }
        LayoutInflater layoutInflaterMo2524u = abstractComponentCallbacksC0963n.mo2524u(abstractComponentCallbacksC0963n.f4227h);
        ViewGroup viewGroup = abstractComponentCallbacksC0963n.f4213J;
        if (viewGroup == null) {
            int i3 = abstractComponentCallbacksC0963n.f4206C;
            if (i3 == 0) {
                viewGroup = null;
            } else {
                if (i3 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0963n + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0963n.f4243x.f4084u.mo747u(i3);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0963n.f4240u) {
                        try {
                            resourceName = abstractComponentCallbacksC0963n.m2542z().getResources().getResourceName(abstractComponentCallbacksC0963n.f4206C);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0963n.f4206C) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0963n);
                    }
                } else if (!(viewGroup instanceof C0966q)) {
                    C0362c c0362c = AbstractC0363d.f1161a;
                    AbstractC0363d.m1002b(new C0360a(abstractComponentCallbacksC0963n, "Attempting to add fragment " + abstractComponentCallbacksC0963n + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0363d.m1001a(abstractComponentCallbacksC0963n).getClass();
                }
            }
        }
        abstractComponentCallbacksC0963n.f4213J = viewGroup;
        abstractComponentCallbacksC0963n.mo2528y(layoutInflaterMo2524u, viewGroup, abstractComponentCallbacksC0963n.f4227h);
        abstractComponentCallbacksC0963n.f4226g = 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m2492f() {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM1335c;
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0963n);
        }
        int i3 = 0;
        boolean zIsChangingConfigurations = true;
        boolean z3 = abstractComponentCallbacksC0963n.f4237r && !abstractComponentCallbacksC0963n.m2540n();
        C0536b c0536b = this.f4119b;
        if (z3) {
        }
        if (!z3) {
            C0940F c0940f = (C0940F) c0536b.f1870j;
            if (!((c0940f.f4098c.containsKey(abstractComponentCallbacksC0963n.f4230k) && c0940f.f4101f) ? c0940f.f4102g : true)) {
                String str = abstractComponentCallbacksC0963n.f4233n;
                if (str != null && (abstractComponentCallbacksC0963nM1335c = c0536b.m1335c(str)) != null && abstractComponentCallbacksC0963nM1335c.f4210G) {
                    abstractComponentCallbacksC0963n.f4232m = abstractComponentCallbacksC0963nM1335c;
                }
                abstractComponentCallbacksC0963n.f4226g = 0;
                return;
            }
        }
        C0965p c0965p = abstractComponentCallbacksC0963n.f4244y;
        if (c0965p != null) {
            zIsChangingConfigurations = ((C0940F) c0536b.f1870j).f4102g;
        } else {
            AbstractActivityC1479j abstractActivityC1479j = c0965p.f4249v;
            if (AbstractC0948N.m2506a(abstractActivityC1479j)) {
                zIsChangingConfigurations = true ^ abstractActivityC1479j.isChangingConfigurations();
            }
        }
        if (z3 || zIsChangingConfigurations) {
            ((C0940F) c0536b.f1870j).m2483b(abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.f4245z.m2467k();
        abstractComponentCallbacksC0963n.f4221R.m2568d(EnumC0999l.ON_DESTROY);
        abstractComponentCallbacksC0963n.f4226g = 0;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.f4218O = false;
        abstractComponentCallbacksC0963n.f4212I = true;
        if (!abstractComponentCallbacksC0963n.f4212I) {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onDestroy()");
        }
        this.f4118a.m532t(false);
        ArrayList arrayListM1338f = c0536b.m1338f();
        int size = arrayListM1338f.size();
        while (i3 < size) {
            Object obj = arrayListM1338f.get(i3);
            i3++;
            C0943I c0943i = (C0943I) obj;
            if (c0943i != null) {
                String str2 = abstractComponentCallbacksC0963n.f4230k;
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = c0943i.f4120c;
                if (str2.equals(abstractComponentCallbacksC0963n2.f4233n)) {
                    abstractComponentCallbacksC0963n2.f4232m = abstractComponentCallbacksC0963n;
                    abstractComponentCallbacksC0963n2.f4233n = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0963n.f4233n;
        if (str3 != null) {
            abstractComponentCallbacksC0963n.f4232m = c0536b.m1335c(str3);
        }
        c0536b.m1342l(this);
    }

    /* JADX INFO: renamed from: g */
    public final void m2493g() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0963n);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0963n.f4213J;
        abstractComponentCallbacksC0963n.f4245z.m2476t(1);
        abstractComponentCallbacksC0963n.f4226g = 1;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.mo2522s();
        if (!abstractComponentCallbacksC0963n.f4212I) {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onDestroyView()");
        }
        C2023j c2023j = ((C0446a) new C0106b(abstractComponentCallbacksC0963n, abstractComponentCallbacksC0963n.mo2299d()).f141i).f1507c;
        if (c2023j.f8795i > 0) {
            c2023j.f8794h[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0963n.f4241v = false;
        this.f4118a.m505C(false);
        abstractComponentCallbacksC0963n.f4213J = null;
        C1011x c1011x = abstractComponentCallbacksC0963n.f4222S;
        c1011x.getClass();
        C1011x.m2577a("setValue");
        c1011x.f4343g++;
        c1011x.f4341e = null;
        c1011x.m2579c(null);
        abstractComponentCallbacksC0963n.f4239t = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m2494h() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.f4226g = -1;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.mo2523t();
        if (!abstractComponentCallbacksC0963n.f4212I) {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onDetach()");
        }
        C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
        if (!c0938d.f4057G) {
            c0938d.m2467k();
            abstractComponentCallbacksC0963n.f4245z = new C0938D();
        }
        this.f4118a.m533u(false);
        abstractComponentCallbacksC0963n.f4226g = -1;
        abstractComponentCallbacksC0963n.f4244y = null;
        abstractComponentCallbacksC0963n.f4204A = null;
        abstractComponentCallbacksC0963n.f4243x = null;
        if (!abstractComponentCallbacksC0963n.f4237r || abstractComponentCallbacksC0963n.m2540n()) {
            C0940F c0940f = (C0940F) this.f4119b.f1870j;
            if (!((c0940f.f4098c.containsKey(abstractComponentCallbacksC0963n.f4230k) && c0940f.f4101f) ? c0940f.f4102g : true)) {
                return;
            }
        }
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.m2538l();
    }

    /* JADX INFO: renamed from: i */
    public final void m2495i() {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (abstractComponentCallbacksC0963n.f4238s && abstractComponentCallbacksC0963n.f4239t && !abstractComponentCallbacksC0963n.f4241v) {
            if (AbstractC0937C.m2430F(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0963n);
            }
            abstractComponentCallbacksC0963n.mo2528y(abstractComponentCallbacksC0963n.mo2524u(abstractComponentCallbacksC0963n.f4227h), null, abstractComponentCallbacksC0963n.f4227h);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2496j() {
        C0536b c0536b = this.f4119b;
        boolean z3 = this.f4121d;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (z3) {
            if (AbstractC0937C.m2430F(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0963n);
                return;
            }
            return;
        }
        try {
            this.f4121d = true;
            boolean z4 = false;
            while (true) {
                int iM2489c = m2489c();
                int i3 = abstractComponentCallbacksC0963n.f4226g;
                if (iM2489c == i3) {
                    if (!z4 && i3 == -1 && abstractComponentCallbacksC0963n.f4237r && !abstractComponentCallbacksC0963n.m2540n()) {
                        if (AbstractC0937C.m2430F(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0963n);
                        }
                        ((C0940F) c0536b.f1870j).m2483b(abstractComponentCallbacksC0963n);
                        c0536b.m1342l(this);
                        if (AbstractC0937C.m2430F(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0963n);
                        }
                        abstractComponentCallbacksC0963n.m2538l();
                    }
                    if (abstractComponentCallbacksC0963n.f4217N) {
                        AbstractC0937C abstractC0937C = abstractComponentCallbacksC0963n.f4243x;
                        if (abstractC0937C != null && abstractComponentCallbacksC0963n.f4236q && AbstractC0937C.m2431G(abstractComponentCallbacksC0963n)) {
                            abstractC0937C.f4054D = true;
                        }
                        abstractComponentCallbacksC0963n.f4217N = false;
                        abstractComponentCallbacksC0963n.f4245z.m2470n();
                    }
                    return;
                }
                if (iM2489c <= i3) {
                    switch (i3 - 1) {
                        case -1:
                            m2494h();
                            break;
                        case 0:
                            m2492f();
                            break;
                        case 1:
                            m2493g();
                            abstractComponentCallbacksC0963n.f4226g = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0963n.f4239t = false;
                            abstractComponentCallbacksC0963n.f4226g = 2;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            if (AbstractC0937C.m2430F(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0963n);
                            }
                            abstractComponentCallbacksC0963n.f4226g = 3;
                            break;
                        case 4:
                            m2501o();
                            break;
                        case 5:
                            abstractComponentCallbacksC0963n.f4226g = 5;
                            break;
                        case 6:
                            m2497k();
                            break;
                    }
                } else {
                    switch (i3 + 1) {
                        case 0:
                            m2488b();
                            break;
                        case 1:
                            m2490d();
                            break;
                        case 2:
                            m2495i();
                            m2491e();
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            m2487a();
                            break;
                        case 4:
                            abstractComponentCallbacksC0963n.f4226g = 4;
                            break;
                        case 5:
                            m2500n();
                            break;
                        case 6:
                            abstractComponentCallbacksC0963n.f4226g = 6;
                            break;
                        case 7:
                            m2499m();
                            break;
                    }
                }
                z4 = true;
            }
        } finally {
            this.f4121d = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2497k() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.f4245z.m2476t(5);
        abstractComponentCallbacksC0963n.f4221R.m2568d(EnumC0999l.ON_PAUSE);
        abstractComponentCallbacksC0963n.f4226g = 6;
        abstractComponentCallbacksC0963n.f4212I = true;
        this.f4118a.m534v(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m2498l(ClassLoader classLoader) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        Bundle bundle = abstractComponentCallbacksC0963n.f4227h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0963n.f4228i = abstractComponentCallbacksC0963n.f4227h.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0963n.f4229j = abstractComponentCallbacksC0963n.f4227h.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0963n.f4227h.getString("android:target_state");
        abstractComponentCallbacksC0963n.f4233n = string;
        if (string != null) {
            abstractComponentCallbacksC0963n.f4234o = abstractComponentCallbacksC0963n.f4227h.getInt("android:target_req_state", 0);
        }
        boolean z3 = abstractComponentCallbacksC0963n.f4227h.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0963n.f4215L = z3;
        if (z3) {
            return;
        }
        abstractComponentCallbacksC0963n.f4214K = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m2499m() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0963n);
        }
        C0962m c0962m = abstractComponentCallbacksC0963n.f4216M;
        View view = c0962m == null ? null : c0962m.f4202i;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC0963n.m2532f().f4202i = null;
        abstractComponentCallbacksC0963n.f4245z.m2442L();
        abstractComponentCallbacksC0963n.f4245z.m2480x(true);
        abstractComponentCallbacksC0963n.f4226g = 7;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.f4212I = true;
        if (!abstractComponentCallbacksC0963n.f4212I) {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onResume()");
        }
        abstractComponentCallbacksC0963n.f4221R.m2568d(EnumC0999l.ON_RESUME);
        C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
        c0938d.f4055E = false;
        c0938d.f4056F = false;
        c0938d.f4062L.f4103h = false;
        c0938d.m2476t(7);
        this.f4118a.m537y(false);
        abstractComponentCallbacksC0963n.f4227h = null;
        abstractComponentCallbacksC0963n.f4228i = null;
        abstractComponentCallbacksC0963n.f4229j = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m2500n() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.f4245z.m2442L();
        abstractComponentCallbacksC0963n.f4245z.m2480x(true);
        abstractComponentCallbacksC0963n.f4226g = 5;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.mo2526w();
        if (!abstractComponentCallbacksC0963n.f4212I) {
            throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onStart()");
        }
        abstractComponentCallbacksC0963n.f4221R.m2568d(EnumC0999l.ON_START);
        C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
        c0938d.f4055E = false;
        c0938d.f4056F = false;
        c0938d.f4062L.f4103h = false;
        c0938d.m2476t(5);
        this.f4118a.m503A(false);
    }

    /* JADX INFO: renamed from: o */
    public final void m2501o() {
        boolean zM2430F = AbstractC0937C.m2430F(3);
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4120c;
        if (zM2430F) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0963n);
        }
        C0938D c0938d = abstractComponentCallbacksC0963n.f4245z;
        c0938d.f4056F = true;
        c0938d.f4062L.f4103h = true;
        c0938d.m2476t(4);
        abstractComponentCallbacksC0963n.f4221R.m2568d(EnumC0999l.ON_STOP);
        abstractComponentCallbacksC0963n.f4226g = 4;
        abstractComponentCallbacksC0963n.f4212I = false;
        abstractComponentCallbacksC0963n.mo2527x();
        if (abstractComponentCallbacksC0963n.f4212I) {
            this.f4118a.m504B(false);
            return;
        }
        throw new C0949O("Fragment " + abstractComponentCallbacksC0963n + " did not call through to super.onStop()");
    }

    public C0943I(C0106b c0106b, C0536b c0536b, ClassLoader classLoader, C0972w c0972w, C0942H c0942h) {
        this.f4118a = c0106b;
        this.f4119b = c0536b;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM2548a = c0972w.m2548a(c0942h.f4105g);
        Bundle bundle = c0942h.f4114p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0963nM2548a.m2531B(bundle);
        abstractComponentCallbacksC0963nM2548a.f4230k = c0942h.f4106h;
        abstractComponentCallbacksC0963nM2548a.f4238s = c0942h.f4107i;
        abstractComponentCallbacksC0963nM2548a.f4240u = true;
        abstractComponentCallbacksC0963nM2548a.f4205B = c0942h.f4108j;
        abstractComponentCallbacksC0963nM2548a.f4206C = c0942h.f4109k;
        abstractComponentCallbacksC0963nM2548a.f4207D = c0942h.f4110l;
        abstractComponentCallbacksC0963nM2548a.f4210G = c0942h.f4111m;
        abstractComponentCallbacksC0963nM2548a.f4237r = c0942h.f4112n;
        abstractComponentCallbacksC0963nM2548a.f4209F = c0942h.f4113o;
        abstractComponentCallbacksC0963nM2548a.f4208E = c0942h.f4115q;
        abstractComponentCallbacksC0963nM2548a.f4220Q = EnumC1000m.values()[c0942h.f4116r];
        Bundle bundle2 = c0942h.f4117s;
        if (bundle2 != null) {
            abstractComponentCallbacksC0963nM2548a.f4227h = bundle2;
        } else {
            abstractComponentCallbacksC0963nM2548a.f4227h = new Bundle();
        }
        this.f4120c = abstractComponentCallbacksC0963nM2548a;
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0963nM2548a);
        }
    }

    public C0943I(C0106b c0106b, C0536b c0536b, AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n, C0942H c0942h) {
        this.f4118a = c0106b;
        this.f4119b = c0536b;
        this.f4120c = abstractComponentCallbacksC0963n;
        abstractComponentCallbacksC0963n.f4228i = null;
        abstractComponentCallbacksC0963n.f4229j = null;
        abstractComponentCallbacksC0963n.f4242w = 0;
        abstractComponentCallbacksC0963n.f4239t = false;
        abstractComponentCallbacksC0963n.f4236q = false;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n2 = abstractComponentCallbacksC0963n.f4232m;
        abstractComponentCallbacksC0963n.f4233n = abstractComponentCallbacksC0963n2 != null ? abstractComponentCallbacksC0963n2.f4230k : null;
        abstractComponentCallbacksC0963n.f4232m = null;
        Bundle bundle = c0942h.f4117s;
        if (bundle != null) {
            abstractComponentCallbacksC0963n.f4227h = bundle;
        } else {
            abstractComponentCallbacksC0963n.f4227h = new Bundle();
        }
    }
}
