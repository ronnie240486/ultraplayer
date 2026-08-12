package p113k;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p110j.C1760a;

/* JADX INFO: renamed from: k.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1851c1 implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final C1760a f8133g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1854d1 f8134h;

    public ViewOnClickListenerC1851c1(C1854d1 c1854d1) {
        this.f8134h = c1854d1;
        Context context = c1854d1.f8135a.getContext();
        CharSequence charSequence = c1854d1.f8142h;
        C1760a c1760a = new C1760a();
        c1760a.f7834e = 4096;
        c1760a.f7836g = 4096;
        c1760a.f7841l = null;
        c1760a.f7842m = null;
        c1760a.f7843n = false;
        c1760a.f7844o = false;
        c1760a.f7845p = 16;
        c1760a.f7838i = context;
        c1760a.f7830a = charSequence;
        this.f8133g = c1760a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1854d1 c1854d1 = this.f8134h;
        Window.Callback callback = c1854d1.f8145k;
        if (callback == null || !c1854d1.f8146l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f8133g);
    }
}
