package p000A;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: A.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0003D {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m5a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m6b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m7c(View view) {
        view.requestApplyInsets();
    }
}
