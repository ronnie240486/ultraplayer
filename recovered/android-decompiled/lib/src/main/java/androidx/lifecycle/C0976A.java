package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0976A extends AbstractC0993f {
    final /* synthetic */ C0977B this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.A$a */
    public static final class a extends AbstractC0993f {
        final /* synthetic */ C0977B this$0;

        public a(C0977B c0977b) {
            this.this$0 = c0977b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
            this.this$0.m2550a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
            C0977B c0977b = this.this$0;
            int i3 = c0977b.f4274g + 1;
            c0977b.f4274g = i3;
            if (i3 == 1 && c0977b.f4277j) {
                c0977b.f4279l.m2568d(EnumC0999l.ON_START);
                c0977b.f4277j = false;
            }
        }
    }

    public C0976A(C0977B c0977b) {
        this.this$0 = c0977b;
    }

    @Override // androidx.lifecycle.AbstractC0993f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC2364c.m4954e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = FragmentC0980E.f4285h;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC2364c.m4952c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0980E) fragmentFindFragmentByTag).f4286g = this.this$0.f4281n;
        }
    }

    @Override // androidx.lifecycle.AbstractC0993f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC2364c.m4954e(activity, "activity");
        C0977B c0977b = this.this$0;
        int i3 = c0977b.f4275h - 1;
        c0977b.f4275h = i3;
        if (i3 == 0) {
            Handler handler = c0977b.f4278k;
            AbstractC2364c.m4951b(handler);
            handler.postDelayed(c0977b.f4280m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC2364c.m4954e(activity, "activity");
        AbstractC1013z.m2581a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0993f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC2364c.m4954e(activity, "activity");
        C0977B c0977b = this.this$0;
        int i3 = c0977b.f4274g - 1;
        c0977b.f4274g = i3;
        if (i3 == 0 && c0977b.f4276i) {
            c0977b.f4279l.m2568d(EnumC0999l.ON_STOP);
            c0977b.f4277j = true;
        }
    }
}
