package p113k;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: k.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1795B0 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1801E0 f7989a;

    public C1795B0(AbstractC1801E0 abstractC1801E0) {
        this.f7989a = abstractC1801E0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC1801E0 abstractC1801E0 = this.f7989a;
        if (abstractC1801E0.f8004E.isShowing()) {
            abstractC1801E0.mo4212f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f7989a.dismiss();
    }
}
