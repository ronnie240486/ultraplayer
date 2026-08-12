package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0958i extends AbstractC0230e {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0961l f4176u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0959j f4177v;

    public C0958i(DialogInterfaceOnCancelListenerC0959j dialogInterfaceOnCancelListenerC0959j, C0961l c0961l) {
        this.f4177v = dialogInterfaceOnCancelListenerC0959j;
        this.f4176u = c0961l;
    }

    @Override // p019G1.AbstractC0230e
    /* JADX INFO: renamed from: u */
    public final View mo747u(int i3) {
        this.f4176u.mo748v();
        Dialog dialog = this.f4177v.f4187g0;
        if (dialog != null) {
            return dialog.findViewById(i3);
        }
        return null;
    }

    @Override // p019G1.AbstractC0230e
    /* JADX INFO: renamed from: v */
    public final boolean mo748v() {
        this.f4176u.mo748v();
        return this.f4177v.f4191k0;
    }
}
