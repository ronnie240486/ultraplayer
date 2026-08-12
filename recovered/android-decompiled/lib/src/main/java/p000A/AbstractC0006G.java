package p000A;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: A.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006G {
    /* JADX INFO: renamed from: a */
    public static C0056p0 m34a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0056p0 c0056p0M316c = C0056p0.m316c(rootWindowInsets, null);
        C0054o0 c0054o0 = c0056p0M316c.f81a;
        c0054o0.mo222l(c0056p0M316c);
        c0054o0.mo217d(view.getRootView());
        return c0056p0M316c;
    }

    /* JADX INFO: renamed from: b */
    public static int m35b(View view) {
        return view.getScrollIndicators();
    }

    /* JADX INFO: renamed from: c */
    public static void m36c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    /* JADX INFO: renamed from: d */
    public static void m37d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
