package p114k0;

import p009D0.C0106b;
import p055T.C0582n;
import p055T.C0583o;
import p073Z.C0771f;

/* JADX INFO: renamed from: k0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1936c implements InterfaceC1931Z {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1931Z f8482g;

    /* JADX INFO: renamed from: h */
    public boolean f8483h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1938d f8484i;

    public C1936c(C1938d c1938d, InterfaceC1931Z interfaceC1931Z) {
        this.f8484i = c1938d;
        this.f8482g = interfaceC1931Z;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: h */
    public final boolean mo3786h() {
        return !this.f8484i.m4496b() && this.f8482g.mo3786h();
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: n */
    public final int mo3787n(C0106b c0106b, C0771f c0771f, int i3) {
        C1938d c1938d = this.f8484i;
        if (c1938d.m4496b()) {
            return -3;
        }
        if (this.f8483h) {
            c0771f.f2573h = 4;
            return -4;
        }
        long jMo3766h = c1938d.mo3766h();
        int iMo3787n = this.f8482g.mo3787n(c0106b, c0771f, i3);
        if (iMo3787n != -5) {
            long j3 = c1938d.f8493l;
            if (j3 == Long.MIN_VALUE || ((iMo3787n != -4 || c0771f.f3146m < j3) && !(iMo3787n == -3 && jMo3766h == Long.MIN_VALUE && !c0771f.f3145l))) {
                return iMo3787n;
            }
            c0771f.mo1883e();
            c0771f.f2573h = 4;
            this.f8483h = true;
            return -4;
        }
        C0583o c0583o = (C0583o) c0106b.f141i;
        c0583o.getClass();
        int i4 = c0583o.f2134G;
        int i5 = c0583o.f2133F;
        if (i5 == 0 && i4 == 0) {
            return -5;
        }
        if (c1938d.f8492k != 0) {
            i5 = 0;
        }
        if (c1938d.f8493l != Long.MIN_VALUE) {
            i4 = 0;
        }
        C0582n c0582nM1447a = c0583o.m1447a();
        c0582nM1447a.f2095E = i5;
        c0582nM1447a.f2096F = i4;
        c0106b.f141i = new C0583o(c0582nM1447a);
        return -5;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: u */
    public final void mo3788u() {
        this.f8482g.mo3788u();
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: v */
    public final int mo3789v(long j3) {
        if (this.f8484i.m4496b()) {
            return -3;
        }
        return this.f8482g.mo3789v(j3);
    }
}
