package androidx.mediarouter.app;

import android.view.View;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.y */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1056y implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1403C f4676g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1057z f4677h;

    public ViewOnClickListenerC1056y(C1057z c1057z, C1403C c1403c) {
        this.f4677h = c1057z;
        this.f4676g = c1403c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1057z c1057z = this.f4677h;
        DialogC1015B dialogC1015B = c1057z.f4682x.f4398i;
        C1403C c1403c = this.f4676g;
        dialogC1015B.f4407t = c1403c;
        c1403c.m3502l();
        c1057z.f4679u.setVisibility(4);
        c1057z.f4680v.setVisibility(0);
    }
}
