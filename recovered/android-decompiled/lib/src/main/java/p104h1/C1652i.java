package p104h1;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: h1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1652i extends AbstractC1624H {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1655l f7506a;

    public C1652i(C1655l c1655l) {
        this.f7506a = c1655l;
    }

    @Override // p104h1.AbstractC1624H
    /* JADX INFO: renamed from: a */
    public final void mo4029a(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1655l c1655l = this.f7506a;
        int iComputeVerticalScrollRange = c1655l.f7532s.computeVerticalScrollRange();
        int i3 = c1655l.f7531r;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = c1655l.f7514a;
        c1655l.f7533t = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = c1655l.f7532s.computeHorizontalScrollRange();
        int i6 = c1655l.f7530q;
        boolean z3 = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c1655l.f7534u = z3;
        boolean z4 = c1655l.f7533t;
        if (!z4 && !z3) {
            if (c1655l.f7535v != 0) {
                c1655l.m4081d(0);
                return;
            }
            return;
        }
        if (z4) {
            float f = i3;
            c1655l.f7525l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c1655l.f7524k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (c1655l.f7534u) {
            float f3 = iComputeHorizontalScrollOffset;
            float f4 = i6;
            c1655l.f7528o = (int) ((((f4 / 2.0f) + f3) * f4) / iComputeHorizontalScrollRange);
            c1655l.f7527n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = c1655l.f7535v;
        if (i7 == 0 || i7 == 1) {
            c1655l.m4081d(1);
        }
    }
}
