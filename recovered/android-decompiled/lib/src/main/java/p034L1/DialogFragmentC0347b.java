package p034L1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: L1.b */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC0347b extends DialogFragment {

    /* JADX INFO: renamed from: g */
    public AlertDialog f1125g;

    /* JADX INFO: renamed from: h */
    public DialogInterface.OnCancelListener f1126h;

    /* JADX INFO: renamed from: i */
    public AlertDialog f1127i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1126h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f1125g;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f1127i == null) {
            Activity activity = getActivity();
            AbstractC0491s.m1213e(activity);
            this.f1127i = new AlertDialog.Builder(activity).create();
        }
        return this.f1127i;
    }
}
