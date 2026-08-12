package p003B;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

/* JADX INFO: renamed from: B.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0088j {
    /* JADX INFO: renamed from: a */
    public static AccessibilityNodeInfo.AccessibilityAction m480a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: b */
    public static void m481b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m482c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: d */
    public static long m483d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m484e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m485f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: g */
    public static void m486g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z3);
    }

    /* JADX INFO: renamed from: h */
    public static void m487h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: i */
    public static void m488i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public static void m489j(AccessibilityNodeInfo accessibilityNodeInfo, long j3) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j3));
    }

    /* JADX INFO: renamed from: k */
    public static void m490k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z3) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z3);
    }

    /* JADX INFO: renamed from: l */
    public static void m491l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z3);
    }
}
