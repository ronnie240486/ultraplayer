package p113k;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: k.G0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1805G0 {
    /* JADX INFO: renamed from: a */
    public static void m4301a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m4302b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
