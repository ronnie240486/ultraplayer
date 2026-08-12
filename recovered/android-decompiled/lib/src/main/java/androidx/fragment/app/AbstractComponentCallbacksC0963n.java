package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0981F;
import androidx.lifecycle.C0985J;
import androidx.lifecycle.C0986K;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.C1011x;
import androidx.lifecycle.EnumC1000m;
import androidx.lifecycle.InterfaceC0987L;
import androidx.lifecycle.InterfaceC0995h;
import androidx.lifecycle.InterfaceC1005r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p019G1.AbstractC0230e;
import p038N.C0403c;
import p077a0.C0817b;
import p091e.AbstractActivityC1479j;
import p108i1.C1751d;
import p108i1.InterfaceC1752e;

/* JADX INFO: renamed from: androidx.fragment.app.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0963n implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1005r, InterfaceC0987L, InterfaceC0995h, InterfaceC1752e {

    /* JADX INFO: renamed from: W */
    public static final Object f4203W = new Object();

    /* JADX INFO: renamed from: A */
    public AbstractComponentCallbacksC0963n f4204A;

    /* JADX INFO: renamed from: B */
    public int f4205B;

    /* JADX INFO: renamed from: C */
    public int f4206C;

    /* JADX INFO: renamed from: D */
    public String f4207D;

    /* JADX INFO: renamed from: E */
    public boolean f4208E;

    /* JADX INFO: renamed from: F */
    public boolean f4209F;

    /* JADX INFO: renamed from: G */
    public boolean f4210G;

    /* JADX INFO: renamed from: I */
    public boolean f4212I;

    /* JADX INFO: renamed from: J */
    public ViewGroup f4213J;

    /* JADX INFO: renamed from: K */
    public boolean f4214K;

    /* JADX INFO: renamed from: M */
    public C0962m f4216M;

    /* JADX INFO: renamed from: N */
    public boolean f4217N;

    /* JADX INFO: renamed from: O */
    public boolean f4218O;

    /* JADX INFO: renamed from: P */
    public String f4219P;

    /* JADX INFO: renamed from: R */
    public C1007t f4221R;

    /* JADX INFO: renamed from: T */
    public C0817b f4223T;

    /* JADX INFO: renamed from: U */
    public final ArrayList f4224U;

    /* JADX INFO: renamed from: V */
    public final C0960k f4225V;

    /* JADX INFO: renamed from: h */
    public Bundle f4227h;

    /* JADX INFO: renamed from: i */
    public SparseArray f4228i;

    /* JADX INFO: renamed from: j */
    public Bundle f4229j;

    /* JADX INFO: renamed from: l */
    public Bundle f4231l;

    /* JADX INFO: renamed from: m */
    public AbstractComponentCallbacksC0963n f4232m;

    /* JADX INFO: renamed from: o */
    public int f4234o;

    /* JADX INFO: renamed from: q */
    public boolean f4236q;

    /* JADX INFO: renamed from: r */
    public boolean f4237r;

    /* JADX INFO: renamed from: s */
    public boolean f4238s;

    /* JADX INFO: renamed from: t */
    public boolean f4239t;

    /* JADX INFO: renamed from: u */
    public boolean f4240u;

    /* JADX INFO: renamed from: v */
    public boolean f4241v;

    /* JADX INFO: renamed from: w */
    public int f4242w;

    /* JADX INFO: renamed from: x */
    public AbstractC0937C f4243x;

    /* JADX INFO: renamed from: y */
    public C0965p f4244y;

    /* JADX INFO: renamed from: g */
    public int f4226g = -1;

    /* JADX INFO: renamed from: k */
    public String f4230k = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: n */
    public String f4233n = null;

    /* JADX INFO: renamed from: p */
    public Boolean f4235p = null;

    /* JADX INFO: renamed from: z */
    public C0938D f4245z = new C0938D();

    /* JADX INFO: renamed from: H */
    public final boolean f4211H = true;

    /* JADX INFO: renamed from: L */
    public boolean f4215L = true;

    /* JADX INFO: renamed from: Q */
    public EnumC1000m f4220Q = EnumC1000m.f4317k;

    /* JADX INFO: renamed from: S */
    public final C1011x f4222S = new C1011x();

    public AbstractComponentCallbacksC0963n() {
        new AtomicInteger();
        this.f4224U = new ArrayList();
        this.f4225V = new C0960k(this);
        m2537k();
    }

    /* JADX INFO: renamed from: A */
    public final void m2530A(int i3, int i4, int i5, int i6) {
        if (this.f4216M == null && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        m2532f().f4195b = i3;
        m2532f().f4196c = i4;
        m2532f().f4197d = i5;
        m2532f().f4198e = i6;
    }

    /* JADX INFO: renamed from: B */
    public final void m2531B(Bundle bundle) {
        AbstractC0937C abstractC0937C = this.f4243x;
        if (abstractC0937C != null && (abstractC0937C.f4055E || abstractC0937C.f4056F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f4231l = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0995h
    /* JADX INFO: renamed from: a */
    public final C0403c mo2297a() {
        Application application;
        Context applicationContext = m2542z().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m2542z().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0403c c0403c = new C0403c();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0403c.f1360a;
        if (application != null) {
            linkedHashMap.put(C0985J.f4297a, application);
        }
        linkedHashMap.put(AbstractC0981F.f4287a, this);
        linkedHashMap.put(AbstractC0981F.f4288b, this);
        Bundle bundle = this.f4231l;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0981F.f4289c, bundle);
        }
        return c0403c;
    }

    @Override // p108i1.InterfaceC1752e
    /* JADX INFO: renamed from: b */
    public final C1751d mo2298b() {
        return (C1751d) this.f4223T.f3429c;
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC0230e mo2518c();

    @Override // androidx.lifecycle.InterfaceC0987L
    /* JADX INFO: renamed from: d */
    public final C0986K mo2299d() {
        if (this.f4243x == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m2535i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f4243x.f4062L.f4100e;
        C0986K c0986k = (C0986K) map.get(this.f4230k);
        if (c0986k != null) {
            return c0986k;
        }
        C0986K c0986k2 = new C0986K();
        map.put(this.f4230k, c0986k2);
        return c0986k2;
    }

    @Override // androidx.lifecycle.InterfaceC1005r
    /* JADX INFO: renamed from: e */
    public final C1007t mo2300e() {
        return this.f4221R;
    }

    /* JADX INFO: renamed from: f */
    public final C0962m m2532f() {
        if (this.f4216M == null) {
            C0962m c0962m = new C0962m();
            Object obj = f4203W;
            c0962m.f4199f = obj;
            c0962m.f4200g = obj;
            c0962m.f4201h = obj;
            c0962m.f4202i = null;
            this.f4216M = c0962m;
        }
        return this.f4216M;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0937C m2533g() {
        if (this.f4244y != null) {
            return this.f4245z;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: h */
    public final Context m2534h() {
        C0965p c0965p = this.f4244y;
        if (c0965p == null) {
            return null;
        }
        return c0965p.f4249v;
    }

    /* JADX INFO: renamed from: i */
    public final int m2535i() {
        EnumC1000m enumC1000m = this.f4220Q;
        return (enumC1000m == EnumC1000m.f4314h || this.f4204A == null) ? enumC1000m.ordinal() : Math.min(enumC1000m.ordinal(), this.f4204A.m2535i());
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0937C m2536j() {
        AbstractC0937C abstractC0937C = this.f4243x;
        if (abstractC0937C != null) {
            return abstractC0937C;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: k */
    public final void m2537k() {
        this.f4221R = new C1007t(this);
        this.f4223T = new C0817b(this);
        ArrayList arrayList = this.f4224U;
        C0960k c0960k = this.f4225V;
        if (arrayList.contains(c0960k)) {
            return;
        }
        if (this.f4226g >= 0) {
            c0960k.m2529a();
        } else {
            arrayList.add(c0960k);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2538l() {
        m2537k();
        this.f4219P = this.f4230k;
        this.f4230k = UUID.randomUUID().toString();
        this.f4236q = false;
        this.f4237r = false;
        this.f4238s = false;
        this.f4239t = false;
        this.f4240u = false;
        this.f4242w = 0;
        this.f4243x = null;
        this.f4245z = new C0938D();
        this.f4244y = null;
        this.f4205B = 0;
        this.f4206C = 0;
        this.f4207D = null;
        this.f4208E = false;
        this.f4209F = false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2539m() {
        if (this.f4208E) {
            return true;
        }
        AbstractC0937C abstractC0937C = this.f4243x;
        if (abstractC0937C != null) {
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4204A;
            abstractC0937C.getClass();
            if (abstractComponentCallbacksC0963n == null ? false : abstractComponentCallbacksC0963n.m2539m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2540n() {
        return this.f4242w > 0;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo2519o();

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f4212I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0965p c0965p = this.f4244y;
        AbstractActivityC1479j abstractActivityC1479j = c0965p == null ? null : c0965p.f4248u;
        if (abstractActivityC1479j != null) {
            abstractActivityC1479j.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f4212I = true;
    }

    /* JADX INFO: renamed from: p */
    public void m2541p(int i3, int i4, Intent intent) {
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i4 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo2520q(AbstractActivityC1479j abstractActivityC1479j) {
        this.f4212I = true;
        C0965p c0965p = this.f4244y;
        if ((c0965p == null ? null : c0965p.f4248u) != null) {
            this.f4212I = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo2521r(Bundle bundle);

    /* JADX INFO: renamed from: s */
    public abstract void mo2522s();

    /* JADX INFO: renamed from: t */
    public abstract void mo2523t();

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f4230k);
        if (this.f4205B != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4205B));
        }
        if (this.f4207D != null) {
            sb.append(" tag=");
            sb.append(this.f4207D);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public LayoutInflater mo2524u(Bundle bundle) {
        C0965p c0965p = this.f4244y;
        if (c0965p == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC1479j abstractActivityC1479j = c0965p.f4252y;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC1479j.getLayoutInflater().cloneInContext(abstractActivityC1479j);
        layoutInflaterCloneInContext.setFactory2(this.f4245z.f4069f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo2525v(Bundle bundle);

    /* JADX INFO: renamed from: w */
    public abstract void mo2526w();

    /* JADX INFO: renamed from: x */
    public abstract void mo2527x();

    /* JADX INFO: renamed from: y */
    public void mo2528y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4245z.m2442L();
        this.f4241v = true;
        mo2299d();
    }

    /* JADX INFO: renamed from: z */
    public final Context m2542z() {
        Context contextM2534h = m2534h();
        if (contextM2534h != null) {
            return contextM2534h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }
}
