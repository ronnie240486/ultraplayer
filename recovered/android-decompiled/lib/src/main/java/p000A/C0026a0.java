package p000A;

import android.view.View;
import java.lang.ref.WeakReference;
import p083b1.C1113w;

/* JADX INFO: renamed from: A.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0026a0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f29a;

    public C0026a0(View view) {
        this.f29a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m104a(float f) {
        View view = (View) this.f29a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m105b() {
        View view = (View) this.f29a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m106c(long j3) {
        View view = (View) this.f29a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m107d(InterfaceC0028b0 interfaceC0028b0) {
        View view = (View) this.f29a.get();
        if (view != null) {
            if (interfaceC0028b0 != null) {
                view.animate().setListener(new C1113w(interfaceC0028b0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m108e(float f) {
        View view = (View) this.f29a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
