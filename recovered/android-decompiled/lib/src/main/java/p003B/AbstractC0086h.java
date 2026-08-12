package p003B;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: B.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0086h {
    /* JADX INFO: renamed from: a */
    public static Object m467a(int i3, float f, float f3, float f4) {
        return new AccessibilityNodeInfo.RangeInfo(i3, f, f3, f4);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m468b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m469c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
