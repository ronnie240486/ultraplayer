package p077a0;

import p055T.C0548K;
import p064W.C0653u;

/* JADX INFO: renamed from: a0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0837m implements InterfaceC0801L {

    /* JADX INFO: renamed from: g */
    public final C0834j0 f3557g;

    /* JADX INFO: renamed from: h */
    public final C0797H f3558h;

    /* JADX INFO: renamed from: i */
    public AbstractC0827g f3559i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0801L f3560j;

    /* JADX INFO: renamed from: k */
    public boolean f3561k = true;

    /* JADX INFO: renamed from: l */
    public boolean f3562l;

    public C0837m(C0797H c0797h, C0653u c0653u) {
        this.f3558h = c0797h;
        this.f3557g = new C0834j0(c0653u);
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: a */
    public final boolean mo2000a() {
        if (this.f3561k) {
            this.f3557g.getClass();
            return false;
        }
        InterfaceC0801L interfaceC0801L = this.f3560j;
        interfaceC0801L.getClass();
        return interfaceC0801L.mo2000a();
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: b */
    public final long mo2001b() {
        if (this.f3561k) {
            return this.f3557g.mo2001b();
        }
        InterfaceC0801L interfaceC0801L = this.f3560j;
        interfaceC0801L.getClass();
        return interfaceC0801L.mo2001b();
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: d */
    public final void mo2002d(C0548K c0548k) {
        InterfaceC0801L interfaceC0801L = this.f3560j;
        if (interfaceC0801L != null) {
            interfaceC0801L.mo2002d(c0548k);
            c0548k = this.f3560j.mo2003f();
        }
        this.f3557g.mo2002d(c0548k);
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: f */
    public final C0548K mo2003f() {
        InterfaceC0801L interfaceC0801L = this.f3560j;
        return interfaceC0801L != null ? interfaceC0801L.mo2003f() : (C0548K) this.f3557g.f3545k;
    }
}
