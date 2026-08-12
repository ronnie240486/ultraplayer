package p003B;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: B.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0087i {
    /* JADX INFO: renamed from: a */
    public static C0089k m470a(boolean z3, int i3, int i4, int i5, int i6, boolean z4, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z3).setColumnIndex(i3).setRowIndex(i4).setColumnSpan(i5).setRowSpan(i6).setSelected(z4).setRowTitle(str).setColumnTitle(str2).build();
        return new C0089k();
    }

    /* JADX INFO: renamed from: b */
    public static C0090l m471b(AccessibilityNodeInfo accessibilityNodeInfo, int i3, int i4) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i3, i4);
        if (child != null) {
            return new C0090l(child, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m472c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* JADX INFO: renamed from: d */
    public static String m473d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* JADX INFO: renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m474e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* JADX INFO: renamed from: f */
    public static C0090l m475f(AccessibilityNodeInfo accessibilityNodeInfo, int i3) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i3);
        if (parent != null) {
            return new C0090l(parent, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m476g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m477h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: i */
    public static void m478i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setTextSelectable(z3);
    }

    /* JADX INFO: renamed from: j */
    public static void m479j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
