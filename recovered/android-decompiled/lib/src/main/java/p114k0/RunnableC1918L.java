package p114k0;

/* JADX INFO: renamed from: k0.L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1918L implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8353g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1923Q f8354h;

    public /* synthetic */ RunnableC1918L(C1923Q c1923q, int i3) {
        this.f8353g = i3;
        this.f8354h = c1923q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8353g) {
            case 0:
                this.f8354h.f8389O = true;
                break;
            case 1:
                this.f8354h.m4452z();
                break;
            default:
                C1923Q c1923q = this.f8354h;
                if (!c1923q.f8395U) {
                    InterfaceC1964x interfaceC1964x = c1923q.f8413x;
                    interfaceC1964x.getClass();
                    interfaceC1964x.mo1973g(c1923q);
                }
                break;
        }
    }
}
