package p088d0;

/* JADX INFO: renamed from: d0.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1385i implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6177g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1387k f6178h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6179i;

    public /* synthetic */ RunnableC1385i(C1387k c1387k, InterfaceC1388l interfaceC1388l, int i3) {
        this.f6177g = i3;
        this.f6178h = c1387k;
        this.f6179i = interfaceC1388l;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [d0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d0.l, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6177g) {
            case 0:
                C1387k c1387k = this.f6178h;
                this.f6179i.mo2046z(c1387k.f6182a, c1387k.f6183b);
                break;
            case 1:
                C1387k c1387k2 = this.f6178h;
                this.f6179i.mo2040l(c1387k2.f6182a, c1387k2.f6183b);
                break;
            default:
                C1387k c1387k3 = this.f6178h;
                this.f6179i.mo2042p(c1387k3.f6182a, c1387k3.f6183b);
                break;
        }
    }
}
