package p114k0;

import p064W.AbstractC0632A;
import p077a0.C0800K;
import p077a0.C0832i0;
import p125n0.InterfaceC2042s;
import p129o0.C2065e;

/* JADX INFO: renamed from: k0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1959s implements InterfaceC1965y, InterfaceC1964x {

    /* JADX INFO: renamed from: g */
    public final C1907A f8565g;

    /* JADX INFO: renamed from: h */
    public final long f8566h;

    /* JADX INFO: renamed from: i */
    public final C2065e f8567i;

    /* JADX INFO: renamed from: j */
    public AbstractC1932a f8568j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1965y f8569k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1964x f8570l;

    /* JADX INFO: renamed from: m */
    public long f8571m = -9223372036854775807L;

    public C1959s(C1907A c1907a, C2065e c2065e, long j3) {
        this.f8565g = c1907a;
        this.f8567i = c2065e;
        this.f8566h = j3;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        return interfaceC1965y != null && interfaceC1965y.mo3759a();
    }

    /* JADX INFO: renamed from: b */
    public final void m4509b(C1907A c1907a) {
        long j3 = this.f8571m;
        if (j3 == -9223372036854775807L) {
            j3 = this.f8566h;
        }
        AbstractC1932a abstractC1932a = this.f8568j;
        abstractC1932a.getClass();
        InterfaceC1965y interfaceC1965yMo3776a = abstractC1932a.mo3776a(c1907a, this.f8567i, j3);
        this.f8569k = interfaceC1965yMo3776a;
        if (this.f8570l != null) {
            interfaceC1965yMo3776a.mo3771q(this, j3);
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: c */
    public final long mo3761c(long j3, C0832i0 c0832i0) {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        return interfaceC1965y.mo3761c(j3, c0832i0);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: d */
    public final C1945g0 mo3762d() {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        return interfaceC1965y.mo3762d();
    }

    @Override // p114k0.InterfaceC1964x
    /* JADX INFO: renamed from: e */
    public final void mo1969e(InterfaceC1965y interfaceC1965y) {
        InterfaceC1964x interfaceC1964x = this.f8570l;
        int i3 = AbstractC0632A.f2454a;
        interfaceC1964x.mo1969e(this);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: f */
    public final long mo3764f(InterfaceC2042s[] interfaceC2042sArr, boolean[] zArr, InterfaceC1931Z[] interfaceC1931ZArr, boolean[] zArr2, long j3) {
        long j4 = this.f8571m;
        long j5 = (j4 == -9223372036854775807L || j3 != this.f8566h) ? j3 : j4;
        this.f8571m = -9223372036854775807L;
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        return interfaceC1965y.mo3764f(interfaceC2042sArr, zArr, interfaceC1931ZArr, zArr2, j5);
    }

    @Override // p114k0.InterfaceC1933a0
    /* JADX INFO: renamed from: g */
    public final void mo1973g(InterfaceC1935b0 interfaceC1935b0) {
        InterfaceC1964x interfaceC1964x = this.f8570l;
        int i3 = AbstractC0632A.f2454a;
        interfaceC1964x.mo1973g(this);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        return interfaceC1965y.mo3766h();
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        return interfaceC1965y != null && interfaceC1965y.mo3767i(c0800k);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: j */
    public final void mo3768j() {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        if (interfaceC1965y != null) {
            interfaceC1965y.mo3768j();
            return;
        }
        AbstractC1932a abstractC1932a = this.f8568j;
        if (abstractC1932a != null) {
            abstractC1932a.mo3778i();
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: n */
    public final long mo3769n(long j3) {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        return interfaceC1965y.mo3769n(j3);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: o */
    public final void mo3770o(long j3) {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        interfaceC1965y.mo3770o(j3);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: q */
    public final void mo3771q(InterfaceC1964x interfaceC1964x, long j3) {
        this.f8570l = interfaceC1964x;
        InterfaceC1965y interfaceC1965y = this.f8569k;
        if (interfaceC1965y != null) {
            long j4 = this.f8571m;
            if (j4 == -9223372036854775807L) {
                j4 = this.f8566h;
            }
            interfaceC1965y.mo3771q(this, j4);
        }
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        return interfaceC1965y.mo3772r();
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: s */
    public final long mo3773s() {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        return interfaceC1965y.mo3773s();
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
        InterfaceC1965y interfaceC1965y = this.f8569k;
        int i3 = AbstractC0632A.f2454a;
        interfaceC1965y.mo3774u(j3);
    }
}
