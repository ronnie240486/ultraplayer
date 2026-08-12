package p113k;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: k.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1814L implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1818N f8046g;

    public C1814L(C1818N c1818n) {
        this.f8046g = c1818n;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        C1818N c1818n = this.f8046g;
        c1818n.f8064M.setSelection(i3);
        C1824Q c1824q = c1818n.f8064M;
        if (c1824q.getOnItemClickListener() != null) {
            c1824q.performItemClick(view, i3, c1818n.f8061J.getItemId(i3));
        }
        c1818n.dismiss();
    }
}
