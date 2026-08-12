package p113k;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: k.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1902x0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC1801E0 f8306g;

    public C1902x0(AbstractC1801E0 abstractC1801E0) {
        this.f8306g = abstractC1801E0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        C1890r0 c1890r0;
        if (i3 == -1 || (c1890r0 = this.f8306g.f8007i) == null) {
            return;
        }
        c1890r0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
