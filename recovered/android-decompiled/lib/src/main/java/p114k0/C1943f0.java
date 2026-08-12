package p114k0;

import p077a0.C0799J;
import p077a0.C0800K;
import p077a0.C0832i0;
import p125n0.InterfaceC2042s;

/* JADX INFO: renamed from: k0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1943f0 implements InterfaceC1965y, InterfaceC1964x {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1965y f8514g;

    /* JADX INFO: renamed from: h */
    public final long f8515h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1964x f8516i;

    public C1943f0(InterfaceC1965y interfaceC1965y, long j3) {
        this.f8514g = interfaceC1965y;
        this.f8515h = j3;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        return this.f8514g.mo3759a();
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: c */
    public final long mo3761c(long j3, C0832i0 c0832i0) {
        long j4 = this.f8515h;
        return this.f8514g.mo3761c(j3 - j4, c0832i0) + j4;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: d */
    public final C1945g0 mo3762d() {
        return this.f8514g.mo3762d();
    }

    @Override // p114k0.InterfaceC1964x
    /* JADX INFO: renamed from: e */
    public final void mo1969e(InterfaceC1965y interfaceC1965y) {
        InterfaceC1964x interfaceC1964x = this.f8516i;
        interfaceC1964x.getClass();
        interfaceC1964x.mo1969e(this);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: f */
    public final long mo3764f(InterfaceC2042s[] interfaceC2042sArr, boolean[] zArr, InterfaceC1931Z[] interfaceC1931ZArr, boolean[] zArr2, long j3) {
        InterfaceC1931Z[] interfaceC1931ZArr2 = new InterfaceC1931Z[interfaceC1931ZArr.length];
        int i3 = 0;
        while (true) {
            InterfaceC1931Z interfaceC1931Z = null;
            if (i3 >= interfaceC1931ZArr.length) {
                break;
            }
            C1941e0 c1941e0 = (C1941e0) interfaceC1931ZArr[i3];
            if (c1941e0 != null) {
                interfaceC1931Z = c1941e0.f8512g;
            }
            interfaceC1931ZArr2[i3] = interfaceC1931Z;
            i3++;
        }
        long j4 = this.f8515h;
        long jMo3764f = this.f8514g.mo3764f(interfaceC2042sArr, zArr, interfaceC1931ZArr2, zArr2, j3 - j4);
        for (int i4 = 0; i4 < interfaceC1931ZArr.length; i4++) {
            InterfaceC1931Z interfaceC1931Z2 = interfaceC1931ZArr2[i4];
            if (interfaceC1931Z2 == null) {
                interfaceC1931ZArr[i4] = null;
            } else {
                InterfaceC1931Z interfaceC1931Z3 = interfaceC1931ZArr[i4];
                if (interfaceC1931Z3 == null || ((C1941e0) interfaceC1931Z3).f8512g != interfaceC1931Z2) {
                    interfaceC1931ZArr[i4] = new C1941e0(interfaceC1931Z2, j4);
                }
            }
        }
        return jMo3764f + j4;
    }

    @Override // p114k0.InterfaceC1933a0
    /* JADX INFO: renamed from: g */
    public final void mo1973g(InterfaceC1935b0 interfaceC1935b0) {
        InterfaceC1964x interfaceC1964x = this.f8516i;
        interfaceC1964x.getClass();
        interfaceC1964x.mo1973g(this);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        long jMo3766h = this.f8514g.mo3766h();
        if (jMo3766h == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo3766h + this.f8515h;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        C0799J c0799j = new C0799J();
        c0799j.f3333b = c0800k.f3336b;
        c0799j.f3334c = c0800k.f3337c;
        c0799j.f3332a = c0800k.f3335a - this.f8515h;
        return this.f8514g.mo3767i(new C0800K(c0799j));
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: j */
    public final void mo3768j() {
        this.f8514g.mo3768j();
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: n */
    public final long mo3769n(long j3) {
        long j4 = this.f8515h;
        return this.f8514g.mo3769n(j3 - j4) + j4;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: o */
    public final void mo3770o(long j3) {
        this.f8514g.mo3770o(j3 - this.f8515h);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: q */
    public final void mo3771q(InterfaceC1964x interfaceC1964x, long j3) {
        this.f8516i = interfaceC1964x;
        this.f8514g.mo3771q(this, j3 - this.f8515h);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        long jMo3772r = this.f8514g.mo3772r();
        if (jMo3772r == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo3772r + this.f8515h;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: s */
    public final long mo3773s() {
        long jMo3773s = this.f8514g.mo3773s();
        if (jMo3773s == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo3773s + this.f8515h;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
        this.f8514g.mo3774u(j3 - this.f8515h);
    }
}
