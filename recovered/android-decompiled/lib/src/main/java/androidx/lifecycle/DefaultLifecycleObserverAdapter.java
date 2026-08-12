package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1003p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0991d f4283a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1003p f4284b;

    public DefaultLifecycleObserverAdapter(InterfaceC0991d interfaceC0991d, InterfaceC1003p interfaceC1003p) {
        this.f4283a = interfaceC0991d;
        this.f4284b = interfaceC1003p;
    }

    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        int i3 = AbstractC0992e.f4311a[enumC0999l.ordinal()];
        InterfaceC0991d interfaceC0991d = this.f4283a;
        if (i3 == 3) {
            interfaceC0991d.mo2387a();
        } else if (i3 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1003p interfaceC1003p = this.f4284b;
        if (interfaceC1003p != null) {
            interfaceC1003p.mo2288b(interfaceC1005r, enumC0999l);
        }
    }
}
