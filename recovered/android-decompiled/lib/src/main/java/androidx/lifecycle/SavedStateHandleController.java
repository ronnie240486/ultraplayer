package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1003p {

    /* JADX INFO: renamed from: a */
    public boolean f4303a;

    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        if (enumC0999l == EnumC0999l.ON_DESTROY) {
            this.f4303a = false;
            interfaceC1005r.mo2300e().m2570f(this);
        }
    }
}
