package p114k0;

import p055T.AbstractC0558V;
import p055T.C0539B;
import p064W.AbstractC0632A;
import p070Y.InterfaceC0701A;

/* JADX INFO: renamed from: k0.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1949i0 extends AbstractC1951k {

    /* JADX INFO: renamed from: k */
    public final AbstractC1932a f8535k;

    public AbstractC1949i0(AbstractC1932a abstractC1932a) {
        this.f8535k = abstractC1932a;
    }

    /* JADX INFO: renamed from: A */
    public void mo4502A() {
        m4506z();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: f */
    public final AbstractC0558V mo4488f() {
        return this.f8535k.mo4488f();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: g */
    public final C0539B mo3777g() {
        return this.f8535k.mo3777g();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: h */
    public final boolean mo4489h() {
        return this.f8535k.mo4489h();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: k */
    public final void mo3779k(InterfaceC0701A interfaceC0701A) {
        this.f8541j = interfaceC0701A;
        this.f8540i = AbstractC0632A.m1594m(null);
        mo4502A();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: r */
    public void mo3782r(C0539B c0539b) {
        this.f8535k.mo3782r(c0539b);
    }

    @Override // p114k0.AbstractC1951k
    /* JADX INFO: renamed from: s */
    public final C1907A mo4439s(Object obj, C1907A c1907a) {
        return mo4505x(c1907a);
    }

    @Override // p114k0.AbstractC1951k
    /* JADX INFO: renamed from: t */
    public final long mo4503t(long j3, Object obj) {
        return j3;
    }

    @Override // p114k0.AbstractC1951k
    /* JADX INFO: renamed from: u */
    public final int mo4504u(int i3, Object obj) {
        return i3;
    }

    @Override // p114k0.AbstractC1951k
    /* JADX INFO: renamed from: v */
    public final void mo4440v(Object obj, AbstractC1932a abstractC1932a, AbstractC0558V abstractC0558V) {
        mo4498y(abstractC0558V);
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo4498y(AbstractC0558V abstractC0558V);

    /* JADX INFO: renamed from: z */
    public final void m4506z() {
        m4507w(null, this.f8535k);
    }

    /* JADX INFO: renamed from: x */
    public C1907A mo4505x(C1907A c1907a) {
        return c1907a;
    }
}
