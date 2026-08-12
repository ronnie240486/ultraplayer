package p113k;

import android.view.View;
import p110j.InterfaceC1770k;
import p110j.MenuC1772m;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1867i implements Runnable {

    /* JADX INFO: renamed from: g */
    public final C1861g f8190g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1873k f8191h;

    public RunnableC1867i(C1873k c1873k, C1861g c1861g) {
        this.f8191h = c1873k;
        this.f8190g = c1861g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1770k interfaceC1770k;
        C1873k c1873k = this.f8191h;
        MenuC1772m menuC1772m = c1873k.f8199i;
        if (menuC1772m != null && (interfaceC1770k = menuC1772m.f7899e) != null) {
            interfaceC1770k.mo3616b(menuC1772m);
        }
        View view = (View) c1873k.f8204n;
        if (view != null && view.getWindowToken() != null) {
            C1861g c1861g = this.f8190g;
            if (c1861g.m4273b()) {
                c1873k.f8215y = c1861g;
            } else if (c1861g.f7967e != null) {
                c1861g.m4275d(0, 0, false, false);
                c1873k.f8215y = c1861g;
            }
        }
        c1873k.f8194A = null;
    }
}
