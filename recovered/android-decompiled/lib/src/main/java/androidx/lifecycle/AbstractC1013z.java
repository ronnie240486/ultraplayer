package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1013z {
    /* JADX INFO: renamed from: a */
    public static final void m2581a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC2364c.m4954e(activity, "activity");
        AbstractC2364c.m4954e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
