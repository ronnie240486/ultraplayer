package p136q;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import p013E1.RunnableC0121D;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2118a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: g */
    public Object f9159g;

    /* JADX INFO: renamed from: h */
    public Activity f9160h;

    /* JADX INFO: renamed from: i */
    public final int f9161i;

    /* JADX INFO: renamed from: j */
    public boolean f9162j = false;

    /* JADX INFO: renamed from: k */
    public boolean f9163k = false;

    /* JADX INFO: renamed from: l */
    public boolean f9164l = false;

    public C2118a(Activity activity) {
        this.f9160h = activity;
        this.f9161i = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f9160h == activity) {
            this.f9160h = null;
            this.f9163k = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f9163k || this.f9164l || this.f9162j) {
            return;
        }
        Object obj = this.f9159g;
        try {
            Object obj2 = AbstractC2119b.f9167c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f9161i) {
                AbstractC2119b.f9171g.postAtFrontOfQueue(new RunnableC0121D(AbstractC2119b.f9166b.get(activity), 13, obj2));
                this.f9164l = true;
                this.f9159g = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f9160h == activity) {
            this.f9162j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
