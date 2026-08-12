package p091e;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0903m;
import java.util.Objects;
import p003B.AbstractC0083e;

/* JADX INFO: renamed from: e.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492w {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m3726a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m3727b(Object obj, LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C) {
        Objects.requireNonNull(layoutInflaterFactory2C1458C);
        C0903m c0903m = new C0903m(1, layoutInflaterFactory2C1458C);
        AbstractC0083e.m434e(obj).registerOnBackInvokedCallback(1000000, c0903m);
        return c0903m;
    }

    /* JADX INFO: renamed from: c */
    public static void m3728c(Object obj, Object obj2) {
        AbstractC0083e.m434e(obj).unregisterOnBackInvokedCallback(AbstractC0083e.m431b(obj2));
    }
}
