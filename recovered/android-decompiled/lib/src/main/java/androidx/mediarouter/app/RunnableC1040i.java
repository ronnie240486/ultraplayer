package androidx.mediarouter.app;

/* JADX INFO: renamed from: androidx.mediarouter.app.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1040i implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4578g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4579h;

    public /* synthetic */ RunnableC1040i(int i3, Object obj) {
        this.f4578g = i3;
        this.f4579h = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4578g) {
            case 0:
                DialogC1051t dialogC1051t = (DialogC1051t) this.f4579h;
                dialogC1051t.m2655k(true);
                dialogC1051t.f4618K.requestLayout();
                dialogC1051t.f4618K.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1039h(dialogC1051t));
                break;
            default:
                DialogC1051t dialogC1051t2 = ((C1049r) this.f4579h).f4604b;
                if (dialogC1051t2.f4626S != null) {
                    dialogC1051t2.f4626S = null;
                    if (dialogC1051t2.f4642i0) {
                        dialogC1051t2.m2661r(dialogC1051t2.f4643j0);
                    }
                }
                break;
        }
    }
}
