package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0956g implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0959j f4173g;

    public DialogInterfaceOnCancelListenerC0956g(DialogInterfaceOnCancelListenerC0959j dialogInterfaceOnCancelListenerC0959j) {
        this.f4173g = dialogInterfaceOnCancelListenerC0959j;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0959j dialogInterfaceOnCancelListenerC0959j = this.f4173g;
        Dialog dialog = dialogInterfaceOnCancelListenerC0959j.f4187g0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0959j.onCancel(dialog);
        }
    }
}
