package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p000A.C0031d;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.E */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0980E extends Fragment {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f4285h = 0;

    /* JADX INFO: renamed from: g */
    public C0031d f4286g;

    /* JADX INFO: renamed from: androidx.lifecycle.E$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0979D Companion = new C0979D();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC2364c.m4954e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC2364c.m4954e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC2364c.m4954e(activity, "activity");
            int i3 = FragmentC0980E.f4285h;
            AbstractC0978C.m2551a(activity, EnumC0999l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
            int i3 = FragmentC0980E.f4285h;
            AbstractC0978C.m2551a(activity, EnumC0999l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
            int i3 = FragmentC0980E.f4285h;
            AbstractC0978C.m2551a(activity, EnumC0999l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
            int i3 = FragmentC0980E.f4285h;
            AbstractC0978C.m2551a(activity, EnumC0999l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
            int i3 = FragmentC0980E.f4285h;
            AbstractC0978C.m2551a(activity, EnumC0999l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
            int i3 = FragmentC0980E.f4285h;
            AbstractC0978C.m2551a(activity, EnumC0999l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC2364c.m4954e(activity, "activity");
            AbstractC2364c.m4954e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC2364c.m4954e(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2553a(EnumC0999l enumC0999l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC2364c.m4953d(activity, "activity");
            AbstractC0978C.m2551a(activity, enumC0999l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2553a(EnumC0999l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m2553a(EnumC0999l.ON_DESTROY);
        this.f4286g = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m2553a(EnumC0999l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0031d c0031d = this.f4286g;
        if (c0031d != null) {
            ((C0977B) c0031d.f38h).m2550a();
        }
        m2553a(EnumC0999l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0031d c0031d = this.f4286g;
        if (c0031d != null) {
            C0977B c0977b = (C0977B) c0031d.f38h;
            int i3 = c0977b.f4274g + 1;
            c0977b.f4274g = i3;
            if (i3 == 1 && c0977b.f4277j) {
                c0977b.f4279l.m2568d(EnumC0999l.ON_START);
                c0977b.f4277j = false;
            }
        }
        m2553a(EnumC0999l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m2553a(EnumC0999l.ON_STOP);
    }
}
