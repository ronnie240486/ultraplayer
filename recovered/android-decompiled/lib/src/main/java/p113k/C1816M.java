package p113k;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p110j.ViewTreeObserverOnGlobalLayoutListenerC1763d;

/* JADX INFO: renamed from: k.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1816M implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1763d f8048g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1818N f8049h;

    public C1816M(C1818N c1818n, ViewTreeObserverOnGlobalLayoutListenerC1763d viewTreeObserverOnGlobalLayoutListenerC1763d) {
        this.f8049h = c1818n;
        this.f8048g = viewTreeObserverOnGlobalLayoutListenerC1763d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f8049h.f8064M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f8048g);
        }
    }
}
