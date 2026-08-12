package androidx.mediarouter.app;

import android.view.View;
import p089d1.C1405E;

/* JADX INFO: renamed from: androidx.mediarouter.app.C */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1016C implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4411g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DialogC1028O f4412h;

    public /* synthetic */ ViewOnClickListenerC1016C(DialogC1028O dialogC1028O, int i3) {
        this.f4411g = i3;
        this.f4412h = dialogC1028O;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4411g) {
            case 0:
                this.f4412h.dismiss();
                break;
            default:
                DialogC1028O dialogC1028O = this.f4412h;
                if (dialogC1028O.f4499o.m3497g()) {
                    dialogC1028O.f4496l.getClass();
                    C1405E.m3516i(2);
                }
                dialogC1028O.dismiss();
                break;
        }
    }
}
