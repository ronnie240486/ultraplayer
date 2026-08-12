package p110j;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: j.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1781v implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1782w f7962g;

    public C1781v(C1782w c1782w) {
        this.f7962g = c1782w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7962g.mo4274c();
    }
}
