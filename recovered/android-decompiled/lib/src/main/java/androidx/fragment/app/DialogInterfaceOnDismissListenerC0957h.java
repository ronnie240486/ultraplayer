package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import com.zuxoplayer.app.MainActivity;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0957h implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4174g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4175h;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0957h(int i3, Object obj) {
        this.f4174g = i3;
        this.f4175h = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4174g) {
            case 0:
                DialogInterfaceOnCancelListenerC0959j dialogInterfaceOnCancelListenerC0959j = (DialogInterfaceOnCancelListenerC0959j) this.f4175h;
                Dialog dialog = dialogInterfaceOnCancelListenerC0959j.f4187g0;
                if (dialog != null) {
                    dialogInterfaceOnCancelListenerC0959j.onDismiss(dialog);
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.f4175h;
                mainActivity.f6017p = false;
                mainActivity.getWindow().getDecorView().setSystemUiVisibility(5894);
                break;
        }
    }
}
