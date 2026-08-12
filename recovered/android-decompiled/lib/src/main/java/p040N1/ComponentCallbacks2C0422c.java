package p040N1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: N1.c */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0422c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: k */
    public static final ComponentCallbacks2C0422c f1436k = new ComponentCallbacks2C0422c();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f1437g = new AtomicBoolean();

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f1438h = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final ArrayList f1439i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public boolean f1440j = false;

    /* JADX INFO: renamed from: a */
    public final void m1121a(C0434o c0434o) {
        synchronized (f1436k) {
            this.f1439i.add(c0434o);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1122b(boolean z3) {
        synchronized (f1436k) {
            try {
                ArrayList arrayList = this.f1439i;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    HandlerC0784e handlerC0784e = ((C0434o) obj).f1467a.f1457s;
                    handlerC0784e.sendMessage(handlerC0784e.obtainMessage(1, Boolean.valueOf(z3)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f1438h;
        boolean zCompareAndSet = this.f1437g.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m1122b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f1438h;
        boolean zCompareAndSet = this.f1437g.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m1122b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f1437g.compareAndSet(false, true)) {
            this.f1438h.set(true);
            m1122b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
