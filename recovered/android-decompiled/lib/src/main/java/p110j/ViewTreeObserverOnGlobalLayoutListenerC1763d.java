package p110j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import p113k.C1811J0;
import p113k.C1818N;
import p113k.C1824Q;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1763d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7848g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7849h;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1763d(int i3, Object obj) {
        this.f7848g = i3;
        this.f7849h = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f7848g) {
            case 0:
                ViewOnKeyListenerC1766g viewOnKeyListenerC1766g = (ViewOnKeyListenerC1766g) this.f7849h;
                if (viewOnKeyListenerC1766g.mo4211b()) {
                    ArrayList arrayList = viewOnKeyListenerC1766g.f7867n;
                    if (arrayList.size() > 0) {
                        int i3 = 0;
                        if (!((C1765f) arrayList.get(0)).f7852a.f8003D) {
                            View view = viewOnKeyListenerC1766g.f7874u;
                            if (view != null && view.isShown()) {
                                int size = arrayList.size();
                                while (i3 < size) {
                                    Object obj = arrayList.get(i3);
                                    i3++;
                                    ((C1765f) obj).f7852a.mo4212f();
                                }
                            } else {
                                viewOnKeyListenerC1766g.dismiss();
                            }
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC1758D viewOnKeyListenerC1758D = (ViewOnKeyListenerC1758D) this.f7849h;
                if (viewOnKeyListenerC1758D.mo4211b()) {
                    C1811J0 c1811j0 = viewOnKeyListenerC1758D.f7815n;
                    if (!c1811j0.f8003D) {
                        View view2 = viewOnKeyListenerC1758D.f7820s;
                        if (view2 != null && view2.isShown()) {
                            c1811j0.mo4212f();
                        } else {
                            viewOnKeyListenerC1758D.dismiss();
                        }
                    }
                }
                break;
            case 2:
                C1824Q c1824q = (C1824Q) this.f7849h;
                if (!c1824q.getInternalPopup().mo4306b()) {
                    c1824q.f8080l.mo4308e(c1824q.getTextDirection(), c1824q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1824q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                C1818N c1818n = (C1818N) this.f7849h;
                C1824Q c1824q2 = c1818n.f8064M;
                c1818n.getClass();
                if (c1824q2.isAttachedToWindow() && c1824q2.getGlobalVisibleRect(c1818n.f8062K)) {
                    c1818n.m4331s();
                    c1818n.mo4212f();
                } else {
                    c1818n.dismiss();
                }
                break;
        }
    }
}
