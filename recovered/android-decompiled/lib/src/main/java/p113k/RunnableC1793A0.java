package p113k;

/* JADX INFO: renamed from: k.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1793A0 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7983g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC1801E0 f7984h;

    public /* synthetic */ RunnableC1793A0(AbstractC1801E0 abstractC1801E0, int i3) {
        this.f7983g = i3;
        this.f7984h = abstractC1801E0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7983g) {
            case 0:
                C1890r0 c1890r0 = this.f7984h.f8007i;
                if (c1890r0 != null) {
                    c1890r0.setListSelectionHidden(true);
                    c1890r0.requestLayout();
                }
                break;
            default:
                AbstractC1801E0 abstractC1801E0 = this.f7984h;
                C1890r0 c1890r1 = abstractC1801E0.f8007i;
                if (c1890r1 != null && c1890r1.isAttachedToWindow() && abstractC1801E0.f8007i.getCount() > abstractC1801E0.f8007i.getChildCount() && abstractC1801E0.f8007i.getChildCount() <= abstractC1801E0.f8017s) {
                    abstractC1801E0.f8004E.setInputMethodMode(2);
                    abstractC1801E0.mo4212f();
                    break;
                }
                break;
        }
    }
}
