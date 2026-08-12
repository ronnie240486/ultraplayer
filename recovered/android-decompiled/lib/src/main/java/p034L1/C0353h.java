package p034L1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: L1.h */
/* JADX INFO: loaded from: classes.dex */
public class C0353h extends DialogInterfaceOnCancelListenerC0959j {

    /* JADX INFO: renamed from: l0 */
    public AlertDialog f1141l0;

    /* JADX INFO: renamed from: m0 */
    public DialogInterface.OnCancelListener f1142m0;

    /* JADX INFO: renamed from: n0 */
    public AlertDialog f1143n0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j
    /* JADX INFO: renamed from: C */
    public final Dialog mo997C() {
        AlertDialog alertDialog = this.f1141l0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f4183c0 = false;
        if (this.f1143n0 == null) {
            Context contextM2534h = m2534h();
            AbstractC0491s.m1213e(contextM2534h);
            this.f1143n0 = new AlertDialog.Builder(contextM2534h).create();
        }
        return this.f1143n0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1142m0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
