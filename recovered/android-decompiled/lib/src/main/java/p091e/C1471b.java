package p091e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1471b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1474e f6554g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1472c f6555h;

    public C1471b(C1472c c1472c, C1474e c1474e) {
        this.f6555h = c1472c;
        this.f6554g = c1474e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        C1472c c1472c = this.f6555h;
        DialogInterface.OnClickListener onClickListener = c1472c.f6567l;
        C1474e c1474e = this.f6554g;
        onClickListener.onClick(c1474e.f6577b, i3);
        if (c1472c.f6569n) {
            return;
        }
        c1474e.f6577b.dismiss();
    }
}
