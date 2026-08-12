package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j;
import com.zuxoplayer.app.R;
import p066W1.AbstractC0664e;
import p089d1.C1451x;
import p091e.AbstractDialogC1460E;

/* JADX INFO: renamed from: androidx.mediarouter.app.g */
/* JADX INFO: loaded from: classes.dex */
public class C1038g extends DialogInterfaceOnCancelListenerC0959j {

    /* JADX INFO: renamed from: l0 */
    public final boolean f4574l0 = false;

    /* JADX INFO: renamed from: m0 */
    public AbstractDialogC1460E f4575m0;

    /* JADX INFO: renamed from: n0 */
    public C1451x f4576n0;

    public C1038g() {
        this.f4182b0 = true;
        Dialog dialog = this.f4187g0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j
    /* JADX INFO: renamed from: C */
    public final Dialog mo997C() {
        if (this.f4574l0) {
            DialogC1015B dialogC1015B = new DialogC1015B(m2534h());
            this.f4575m0 = dialogC1015B;
            m2639D();
            dialogC1015B.m2597i(this.f4576n0);
        } else {
            DialogC1037f dialogC1037f = new DialogC1037f(m2534h());
            this.f4575m0 = dialogC1037f;
            m2639D();
            dialogC1037f.m2637j(this.f4576n0);
        }
        return this.f4575m0;
    }

    /* JADX INFO: renamed from: D */
    public final void m2639D() {
        if (this.f4576n0 == null) {
            Bundle bundle = this.f4231l;
            if (bundle != null) {
                this.f4576n0 = C1451x.m3639b(bundle.getBundle("selector"));
            }
            if (this.f4576n0 == null) {
                this.f4576n0 = C1451x.f6416c;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f4212I = true;
        AbstractDialogC1460E abstractDialogC1460E = this.f4575m0;
        if (abstractDialogC1460E == null) {
            return;
        }
        if (!this.f4574l0) {
            DialogC1037f dialogC1037f = (DialogC1037f) abstractDialogC1460E;
            dialogC1037f.getWindow().setLayout(AbstractC0664e.m1760z(dialogC1037f.getContext()), -2);
        } else {
            DialogC1015B dialogC1015B = (DialogC1015B) abstractDialogC1460E;
            Context context = dialogC1015B.f4401n;
            dialogC1015B.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : AbstractC0664e.m1760z(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
