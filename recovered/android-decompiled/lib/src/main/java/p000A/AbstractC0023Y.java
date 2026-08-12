package p000A;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: A.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0023Y {
    /* JADX INFO: renamed from: a */
    public static boolean m97a(ViewParent viewParent, View view, float f, float f3, boolean z3) {
        return viewParent.onNestedFling(view, f, f3, z3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m98b(ViewParent viewParent, View view, float f, float f3) {
        return viewParent.onNestedPreFling(view, f, f3);
    }

    /* JADX INFO: renamed from: c */
    public static void m99c(ViewParent viewParent, View view, int i3, int i4, int[] iArr) {
        viewParent.onNestedPreScroll(view, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m100d(ViewParent viewParent, View view, int i3, int i4, int i5, int i6) {
        viewParent.onNestedScroll(view, i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: e */
    public static void m101e(ViewParent viewParent, View view, View view2, int i3) {
        viewParent.onNestedScrollAccepted(view, view2, i3);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m102f(ViewParent viewParent, View view, View view2, int i3) {
        return viewParent.onStartNestedScroll(view, view2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static void m103g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
