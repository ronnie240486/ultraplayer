package p000A;

import android.view.View;

/* JADX INFO: renamed from: A.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0011L {
    /* JADX INFO: renamed from: a */
    public static int m70a(View view) {
        return view.getImportantForContentCapture();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m71b(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m72c(View view) {
        return view.isImportantForContentCapture();
    }

    /* JADX INFO: renamed from: d */
    public static void m73d(View view, int i3) {
        view.setImportantForContentCapture(i3);
    }

    /* JADX INFO: renamed from: e */
    public static void m74e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
