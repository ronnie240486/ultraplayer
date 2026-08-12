package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j;
import p089d1.C1451x;
import p091e.AbstractDialogC1460E;

/* JADX INFO: renamed from: androidx.mediarouter.app.u */
/* JADX INFO: loaded from: classes.dex */
public class C1052u extends DialogInterfaceOnCancelListenerC0959j {

    /* JADX INFO: renamed from: l0 */
    public final boolean f4669l0 = false;

    /* JADX INFO: renamed from: m0 */
    public AbstractDialogC1460E f4670m0;

    /* JADX INFO: renamed from: n0 */
    public C1451x f4671n0;

    public C1052u() {
        this.f4182b0 = true;
        Dialog dialog = this.f4187g0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j
    /* JADX INFO: renamed from: C */
    public final Dialog mo997C() {
        if (this.f4669l0) {
            DialogC1028O dialogC1028O = new DialogC1028O(m2534h());
            this.f4670m0 = dialogC1028O;
            dialogC1028O.m2623k(this.f4671n0);
        } else {
            this.f4670m0 = new DialogC1051t(m2534h());
        }
        return this.f4670m0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f4212I = true;
        AbstractDialogC1460E abstractDialogC1460E = this.f4670m0;
        if (abstractDialogC1460E != null) {
            if (this.f4669l0) {
                ((DialogC1028O) abstractDialogC1460E).m2624l();
            } else {
                ((DialogC1051t) abstractDialogC1460E).m2663t();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j, androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: x */
    public final void mo2527x() {
        super.mo2527x();
        AbstractDialogC1460E abstractDialogC1460E = this.f4670m0;
        if (abstractDialogC1460E == null || this.f4669l0) {
            return;
        }
        ((DialogC1051t) abstractDialogC1460E).m2655k(false);
    }
}
