package androidx.activity;

import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.media.session.C0858A;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0971v;
import androidx.lifecycle.AbstractC0978C;
import androidx.lifecycle.AbstractC0981F;
import androidx.lifecycle.C0985J;
import androidx.lifecycle.C0986K;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.FragmentC0980E;
import androidx.lifecycle.InterfaceC0987L;
import androidx.lifecycle.InterfaceC0995h;
import androidx.lifecycle.InterfaceC1003p;
import androidx.lifecycle.InterfaceC1005r;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p014F.RunnableC0153b;
import p019G1.AbstractC0230e;
import p038N.C0403c;
import p066W1.AbstractC0664e;
import p077a0.C0817b;
import p081b.C1058a;
import p081b.InterfaceC1059b;
import p091e.AbstractActivityC1479j;
import p108i1.C1751d;
import p108i1.InterfaceC1752e;
import p122m1.AbstractC2003a;
import p136q.AbstractActivityC2123f;
import p136q.C2124g;
import p136q.C2138u;
import p157w.AbstractC2308b;
import p159w2.InterfaceC2320a;
import p163x2.AbstractC2364c;
import p168z.InterfaceC2387a;

/* JADX INFO: renamed from: androidx.activity.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0900j extends AbstractActivityC2123f implements InterfaceC0987L, InterfaceC0995h, InterfaceC1752e, InterfaceC0907q {

    /* JADX INFO: renamed from: h */
    public final C1058a f3744h = new C1058a(0);

    /* JADX INFO: renamed from: i */
    public final C0858A f3745i;

    /* JADX INFO: renamed from: j */
    public final C1007t f3746j;

    /* JADX INFO: renamed from: k */
    public final C0817b f3747k;

    /* JADX INFO: renamed from: l */
    public C0986K f3748l;

    /* JADX INFO: renamed from: m */
    public final C0906p f3749m;

    /* JADX INFO: renamed from: n */
    public final ExecutorC0899i f3750n;

    /* JADX INFO: renamed from: o */
    public final C0817b f3751o;

    /* JADX INFO: renamed from: p */
    public final C0896f f3752p;

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList f3753q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f3754r;

    /* JADX INFO: renamed from: s */
    public final CopyOnWriteArrayList f3755s;

    /* JADX INFO: renamed from: t */
    public final CopyOnWriteArrayList f3756t;

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f3757u;

    /* JADX INFO: renamed from: v */
    public boolean f3758v;

    /* JADX INFO: renamed from: w */
    public boolean f3759w;

    public AbstractActivityC0900j() {
        final AbstractActivityC1479j abstractActivityC1479j = (AbstractActivityC1479j) this;
        this.f3745i = new C0858A(new RunnableC0892b(0, abstractActivityC1479j));
        C1007t c1007t = new C1007t(this);
        this.f3746j = c1007t;
        C0817b c0817b = new C0817b(this);
        this.f3747k = c0817b;
        this.f3749m = new C0906p(new RunnableC0153b(7, abstractActivityC1479j));
        this.f3750n = new ExecutorC0899i(abstractActivityC1479j);
        new InterfaceC2320a() { // from class: androidx.activity.c
            @Override // p159w2.InterfaceC2320a
            /* JADX INFO: renamed from: a */
            public final Object mo2290a() {
                abstractActivityC1479j.reportFullyDrawn();
                return null;
            }
        };
        C0817b c0817b2 = new C0817b();
        c0817b2.f3428b = new Object();
        c0817b2.f3429c = new ArrayList();
        this.f3751o = c0817b2;
        new AtomicInteger();
        this.f3752p = new C0896f(abstractActivityC1479j);
        this.f3753q = new CopyOnWriteArrayList();
        this.f3754r = new CopyOnWriteArrayList();
        this.f3755s = new CopyOnWriteArrayList();
        this.f3756t = new CopyOnWriteArrayList();
        this.f3757u = new CopyOnWriteArrayList();
        this.f3758v = false;
        this.f3759w = false;
        int i3 = Build.VERSION.SDK_INT;
        c1007t.m2565a(new InterfaceC1003p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.InterfaceC1003p
            /* JADX INFO: renamed from: b */
            public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
                if (enumC0999l == EnumC0999l.ON_STOP) {
                    Window window = abstractActivityC1479j.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c1007t.m2565a(new InterfaceC1003p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC1003p
            /* JADX INFO: renamed from: b */
            public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
                if (enumC0999l == EnumC0999l.ON_DESTROY) {
                    abstractActivityC1479j.f3744h.f4809b = null;
                    if (abstractActivityC1479j.isChangingConfigurations()) {
                        return;
                    }
                    abstractActivityC1479j.mo2299d().m2557a();
                }
            }
        });
        c1007t.m2565a(new InterfaceC1003p() { // from class: androidx.activity.ComponentActivity$5
            @Override // androidx.lifecycle.InterfaceC1003p
            /* JADX INFO: renamed from: b */
            public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
                AbstractActivityC1479j abstractActivityC1479j2 = abstractActivityC1479j;
                if (abstractActivityC1479j2.f3748l == null) {
                    C0898h c0898h = (C0898h) abstractActivityC1479j2.getLastNonConfigurationInstance();
                    if (c0898h != null) {
                        abstractActivityC1479j2.f3748l = c0898h.f3739a;
                    }
                    if (abstractActivityC1479j2.f3748l == null) {
                        abstractActivityC1479j2.f3748l = new C0986K();
                    }
                }
                abstractActivityC1479j2.f3746j.m2570f(this);
            }
        });
        c0817b.m2054a();
        AbstractC0981F.m2554a(this);
        if (i3 <= 23) {
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.f3719a = this;
            c1007t.m2565a(immLeaksCleaner);
        }
        ((C1751d) c0817b.f3429c).m4208e("android:support:activity-result", new C0894d(0, abstractActivityC1479j));
        m2302h(new C0895e(abstractActivityC1479j, 0));
    }

    @Override // androidx.lifecycle.InterfaceC0995h
    /* JADX INFO: renamed from: a */
    public final C0403c mo2297a() {
        C0403c c0403c = new C0403c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0403c.f1360a;
        if (application != null) {
            linkedHashMap.put(C0985J.f4297a, getApplication());
        }
        linkedHashMap.put(AbstractC0981F.f4287a, this);
        linkedHashMap.put(AbstractC0981F.f4288b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0981F.f4289c, getIntent().getExtras());
        }
        return c0403c;
    }

    @Override // p108i1.InterfaceC1752e
    /* JADX INFO: renamed from: b */
    public final C1751d mo2298b() {
        return (C1751d) this.f3747k.f3429c;
    }

    @Override // androidx.lifecycle.InterfaceC0987L
    /* JADX INFO: renamed from: d */
    public final C0986K mo2299d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f3748l == null) {
            C0898h c0898h = (C0898h) getLastNonConfigurationInstance();
            if (c0898h != null) {
                this.f3748l = c0898h.f3739a;
            }
            if (this.f3748l == null) {
                this.f3748l = new C0986K();
            }
        }
        return this.f3748l;
    }

    @Override // androidx.lifecycle.InterfaceC1005r
    /* JADX INFO: renamed from: e */
    public final C1007t mo2300e() {
        return this.f3746j;
    }

    /* JADX INFO: renamed from: g */
    public final void m2301g(InterfaceC2387a interfaceC2387a) {
        this.f3753q.add(interfaceC2387a);
    }

    /* JADX INFO: renamed from: h */
    public final void m2302h(InterfaceC1059b interfaceC1059b) {
        C1058a c1058a = this.f3744h;
        c1058a.getClass();
        if (((AbstractActivityC0900j) c1058a.f4809b) != null) {
            interfaceC1059b.mo2292a();
        }
        ((CopyOnWriteArraySet) c1058a.f4810c).add(interfaceC1059b);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f3752p.m2293a(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.f3749m.m2309b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f3753q.iterator();
        while (it.hasNext()) {
            ((InterfaceC2387a) it.next()).mo2543b(configuration);
        }
    }

    @Override // p136q.AbstractActivityC2123f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f3747k.m2055b(bundle);
        C1058a c1058a = this.f3744h;
        c1058a.getClass();
        c1058a.f4809b = this;
        Iterator it = ((CopyOnWriteArraySet) c1058a.f4810c).iterator();
        while (it.hasNext()) {
            ((InterfaceC1059b) it.next()).mo2292a();
        }
        super.onCreate(bundle);
        int i3 = FragmentC0980E.f4285h;
        AbstractC0978C.m2552b(this);
        int i4 = AbstractC2308b.f9829a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 33) {
            if (i5 < 32) {
                return;
            }
            String str = Build.VERSION.CODENAME;
            AbstractC2364c.m4953d(str, "CODENAME");
            if ("REL".equals(str)) {
                return;
            }
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            AbstractC2364c.m4953d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase2 = "Tiramisu".toUpperCase(locale);
            AbstractC2364c.m4953d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (upperCase.compareTo(upperCase2) < 0) {
                return;
            }
        }
        C0906p c0906p = this.f3749m;
        OnBackInvokedDispatcher onBackInvokedDispatcherM2295a = AbstractC0897g.m2295a(this);
        c0906p.getClass();
        AbstractC2364c.m4954e(onBackInvokedDispatcherM2295a, "invoker");
        c0906p.f3774e = onBackInvokedDispatcherM2295a;
        c0906p.m2310c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f3745i.f3640i).iterator();
        while (it.hasNext()) {
            ((C0971v) it.next()).f4266a.m2466j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f3745i.f3640i).iterator();
            while (it.hasNext()) {
                if (((C0971v) it.next()).f4266a.m2471o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f3758v) {
            return;
        }
        Iterator it = this.f3756t.iterator();
        while (it.hasNext()) {
            ((InterfaceC2387a) it.next()).mo2543b(new C2124g(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f3755s.iterator();
        while (it.hasNext()) {
            ((InterfaceC2387a) it.next()).mo2543b(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f3745i.f3640i).iterator();
        while (it.hasNext()) {
            ((C0971v) it.next()).f4266a.m2472p();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f3759w) {
            return;
        }
        Iterator it = this.f3757u.iterator();
        while (it.hasNext()) {
            ((InterfaceC2387a) it.next()).mo2543b(new C2138u(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f3745i.f3640i).iterator();
        while (it.hasNext()) {
            ((C0971v) it.next()).f4266a.m2475s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (this.f3752p.m2293a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0898h c0898h;
        C0986K c0986k = this.f3748l;
        if (c0986k == null && (c0898h = (C0898h) getLastNonConfigurationInstance()) != null) {
            c0986k = c0898h.f3739a;
        }
        if (c0986k == null) {
            return null;
        }
        C0898h c0898h2 = new C0898h();
        c0898h2.f3739a = c0986k;
        return c0898h2;
    }

    @Override // p136q.AbstractActivityC2123f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C1007t c1007t = this.f3746j;
        if (c1007t != null) {
            c1007t.m2571g();
        }
        super.onSaveInstanceState(bundle);
        this.f3747k.m2056c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f3754r.iterator();
        while (it.hasNext()) {
            ((InterfaceC2387a) it.next()).mo2543b(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0664e.m1721D()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0817b c0817b = this.f3751o;
            synchronized (c0817b.f3428b) {
                try {
                    c0817b.f3427a = true;
                    ArrayList arrayList = (ArrayList) c0817b.f3429c;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((InterfaceC2320a) obj).mo2290a();
                    }
                    ((ArrayList) c0817b.f3429c).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        AbstractC0981F.m2555b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC2364c.m4954e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        AbstractC0230e.m743w(getWindow().getDecorView(), this);
        AbstractC2003a.m4544q(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        AbstractC2364c.m4954e(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
        View decorView3 = getWindow().getDecorView();
        ExecutorC0899i executorC0899i = this.f3750n;
        if (!executorC0899i.f3742i) {
            executorC0899i.f3742i = true;
            decorView3.getViewTreeObserver().addOnDrawListener(executorC0899i);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        this.f3758v = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f3758v = false;
            for (InterfaceC2387a interfaceC2387a : this.f3756t) {
                AbstractC2364c.m4954e(configuration, "newConfig");
                interfaceC2387a.mo2543b(new C2124g(z3));
            }
        } catch (Throwable th) {
            this.f3758v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        this.f3759w = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f3759w = false;
            for (InterfaceC2387a interfaceC2387a : this.f3757u) {
                AbstractC2364c.m4954e(configuration, "newConfig");
                interfaceC2387a.mo2543b(new C2138u(z3));
            }
        } catch (Throwable th) {
            this.f3759w = false;
            throw th;
        }
    }
}
