package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.fragment.app.AbstractC0948N;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0978C {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m2551a(Activity activity, EnumC0999l enumC0999l) {
        AbstractC2364c.m4954e(enumC0999l, "event");
        if (activity instanceof InterfaceC1005r) {
            C1007t c1007tMo2300e = ((InterfaceC1005r) activity).mo2300e();
            if (AbstractC0948N.m2506a(c1007tMo2300e)) {
                c1007tMo2300e.m2568d(enumC0999l);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2552b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0980E.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0980E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0980E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
