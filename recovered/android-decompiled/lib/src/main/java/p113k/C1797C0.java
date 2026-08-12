package p113k;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: k.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1797C0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1801E0 f7994a;

    public C1797C0(AbstractC1801E0 abstractC1801E0) {
        this.f7994a = abstractC1801E0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            AbstractC1801E0 abstractC1801E0 = this.f7994a;
            if (abstractC1801E0.f8004E.getInputMethodMode() == 2 || abstractC1801E0.f8004E.getContentView() == null) {
                return;
            }
            Handler handler = abstractC1801E0.f8000A;
            RunnableC1793A0 runnableC1793A0 = abstractC1801E0.f8021w;
            handler.removeCallbacks(runnableC1793A0);
            runnableC1793A0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }
}
