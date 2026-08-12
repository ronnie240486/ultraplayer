package p003B;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: B.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0085g {

    /* JADX INFO: renamed from: c */
    public static final C0085g f116c;

    /* JADX INFO: renamed from: d */
    public static final C0085g f117d;

    /* JADX INFO: renamed from: e */
    public static final C0085g f118e;

    /* JADX INFO: renamed from: f */
    public static final C0085g f119f;

    /* JADX INFO: renamed from: a */
    public final Object f120a;

    /* JADX INFO: renamed from: b */
    public final int f121b;

    static {
        new C0085g(null, 1, null);
        new C0085g(null, 2, null);
        new C0085g(null, 4, null);
        new C0085g(null, 8, null);
        new C0085g(null, 16, null);
        new C0085g(null, 32, null);
        new C0085g(null, 64, null);
        new C0085g(null, 128, null);
        new C0085g(null, 256, AbstractC0091m.class);
        new C0085g(null, 512, AbstractC0091m.class);
        new C0085g(null, 1024, AbstractC0092n.class);
        new C0085g(null, 2048, AbstractC0092n.class);
        f116c = new C0085g(null, 4096, null);
        f117d = new C0085g(null, 8192, null);
        new C0085g(null, 16384, null);
        new C0085g(null, 32768, null);
        new C0085g(null, 65536, null);
        new C0085g(null, 131072, AbstractC0096r.class);
        new C0085g(null, 262144, null);
        new C0085g(null, 524288, null);
        new C0085g(null, 1048576, null);
        new C0085g(null, 2097152, AbstractC0097s.class);
        int i3 = Build.VERSION.SDK_INT;
        new C0085g(i3 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null);
        new C0085g(i3 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, AbstractC0094p.class);
        f118e = new C0085g(i3 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null);
        new C0085g(i3 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null);
        f119f = new C0085g(i3 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null);
        new C0085g(i3 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null);
        new C0085g(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
        new C0085g(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
        new C0085g(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
        new C0085g(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
        new C0085g(i3 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null);
        new C0085g(i3 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, AbstractC0095q.class);
        new C0085g(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, AbstractC0093o.class);
        new C0085g(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
        new C0085g(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
        new C0085g(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new C0085g(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new C0085g(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new C0085g(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new C0085g(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new C0085g(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new C0085g(i3 >= 34 ? AbstractC0088j.m480a() : null, R.id.accessibilityActionScrollInDirection, null);
    }

    public C0085g(Object obj, int i3, Class cls) {
        this.f121b = i3;
        if (obj == null) {
            this.f120a = new AccessibilityNodeInfo.AccessibilityAction(i3, null);
        } else {
            this.f120a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0085g)) {
            return false;
        }
        Object obj2 = ((C0085g) obj).f120a;
        Object obj3 = this.f120a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f120a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM492b = C0090l.m492b(this.f121b);
        if (strM492b.equals("ACTION_UNKNOWN")) {
            Object obj = this.f120a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM492b = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM492b);
        return sb.toString();
    }
}
