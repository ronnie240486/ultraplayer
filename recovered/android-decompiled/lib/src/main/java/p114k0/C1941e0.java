package p114k0;

import p009D0.C0106b;
import p073Z.C0771f;

/* JADX INFO: renamed from: k0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941e0 implements InterfaceC1931Z {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1931Z f8512g;

    /* JADX INFO: renamed from: h */
    public final long f8513h;

    public C1941e0(InterfaceC1931Z interfaceC1931Z, long j3) {
        this.f8512g = interfaceC1931Z;
        this.f8513h = j3;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: h */
    public final boolean mo3786h() {
        return this.f8512g.mo3786h();
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: n */
    public final int mo3787n(C0106b c0106b, C0771f c0771f, int i3) {
        int iMo3787n = this.f8512g.mo3787n(c0106b, c0771f, i3);
        if (iMo3787n == -4) {
            c0771f.f3146m += this.f8513h;
        }
        return iMo3787n;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: u */
    public final void mo3788u() {
        this.f8512g.mo3788u();
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: v */
    public final int mo3789v(long j3) {
        return this.f8512g.mo3789v(j3 - this.f8513h);
    }
}
