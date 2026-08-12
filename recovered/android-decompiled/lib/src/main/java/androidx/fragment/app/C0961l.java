package androidx.fragment.app;

import android.view.View;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0961l extends AbstractC0230e {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AbstractComponentCallbacksC0963n f4193u;

    public C0961l(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        this.f4193u = abstractComponentCallbacksC0963n;
    }

    @Override // p019G1.AbstractC0230e
    /* JADX INFO: renamed from: u */
    public final View mo747u(int i3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = this.f4193u;
        abstractComponentCallbacksC0963n.getClass();
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0963n + " does not have a view");
    }

    @Override // p019G1.AbstractC0230e
    /* JADX INFO: renamed from: v */
    public final boolean mo748v() {
        this.f4193u.getClass();
        return false;
    }
}
