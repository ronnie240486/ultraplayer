package p014F;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: F.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0164m {
    /* JADX INFO: renamed from: a */
    public static boolean m628a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m629b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m630c(PopupWindow popupWindow, boolean z3) {
        popupWindow.setOverlapAnchor(z3);
    }

    /* JADX INFO: renamed from: d */
    public static void m631d(PopupWindow popupWindow, int i3) {
        popupWindow.setWindowLayoutType(i3);
    }
}
