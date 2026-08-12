package p110j;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: j.e */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1764e implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7850g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC1780u f7851h;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1764e(AbstractC1780u abstractC1780u, int i3) {
        this.f7850g = i3;
        this.f7851h = abstractC1780u;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f7850g;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f7850g) {
            case 0:
                ViewOnKeyListenerC1766g viewOnKeyListenerC1766g = (ViewOnKeyListenerC1766g) this.f7851h;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1766g.f7858D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1766g.f7858D = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1766g.f7858D.removeGlobalOnLayoutListener(viewOnKeyListenerC1766g.f7868o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC1758D viewOnKeyListenerC1758D = (ViewOnKeyListenerC1758D) this.f7851h;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1758D.f7822u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1758D.f7822u = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1758D.f7822u.removeGlobalOnLayoutListener(viewOnKeyListenerC1758D.f7816o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m4241a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m4242b(View view) {
    }
}
