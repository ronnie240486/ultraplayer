package p077a0;

import p009D0.C0106b;
import p055T.AbstractC0558V;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0653u;
import p073Z.C0771f;
import p082b0.C1071l;
import p114k0.C1907A;
import p114k0.InterfaceC1931Z;
import p125n0.C2040q;

/* JADX INFO: renamed from: a0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0827g implements InterfaceC0822d0 {

    /* JADX INFO: renamed from: h */
    public final int f3478h;

    /* JADX INFO: renamed from: j */
    public C0830h0 f3480j;

    /* JADX INFO: renamed from: k */
    public int f3481k;

    /* JADX INFO: renamed from: l */
    public C1071l f3482l;

    /* JADX INFO: renamed from: m */
    public C0653u f3483m;

    /* JADX INFO: renamed from: n */
    public int f3484n;

    /* JADX INFO: renamed from: o */
    public InterfaceC1931Z f3485o;

    /* JADX INFO: renamed from: p */
    public C0583o[] f3486p;

    /* JADX INFO: renamed from: q */
    public long f3487q;

    /* JADX INFO: renamed from: r */
    public long f3488r;

    /* JADX INFO: renamed from: t */
    public boolean f3490t;

    /* JADX INFO: renamed from: u */
    public boolean f3491u;

    /* JADX INFO: renamed from: w */
    public C2040q f3493w;

    /* JADX INFO: renamed from: g */
    public final Object f3477g = new Object();

    /* JADX INFO: renamed from: i */
    public final C0106b f3479i = new C0106b(22, false);

    /* JADX INFO: renamed from: s */
    public long f3489s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public AbstractC0558V f3492v = AbstractC0558V.f1991a;

    public AbstractC0827g(int i3) {
        this.f3478h = i3;
    }

    /* JADX INFO: renamed from: A */
    public int mo2078A() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final C0839o m2079e(Exception exc, C0583o c0583o, boolean z3, int i3) {
        int iMo2099z;
        if (c0583o == null || this.f3491u) {
            iMo2099z = 4;
        } else {
            this.f3491u = true;
            try {
                iMo2099z = mo2099z(c0583o) & 7;
                this.f3491u = false;
            } catch (C0839o unused) {
                this.f3491u = false;
                iMo2099z = 4;
            } catch (Throwable th) {
                this.f3491u = false;
                throw th;
            }
        }
        return new C0839o(1, exc, i3, mo2082i(), this.f3481k, c0583o, c0583o == null ? 4 : iMo2099z, z3);
    }

    /* JADX INFO: renamed from: g */
    public void mo2080g() {
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0801L mo2081h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo2082i();

    /* JADX INFO: renamed from: j */
    public final boolean m2083j() {
        return this.f3489s == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2084k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo2085l();

    /* JADX INFO: renamed from: m */
    public abstract void mo2086m();

    /* JADX INFO: renamed from: o */
    public abstract void mo2088o(long j3, boolean z3);

    /* JADX INFO: renamed from: u */
    public final int m2094u(C0106b c0106b, C0771f c0771f, int i3) {
        InterfaceC1931Z interfaceC1931Z = this.f3485o;
        interfaceC1931Z.getClass();
        int iMo3787n = interfaceC1931Z.mo3787n(c0106b, c0771f, i3);
        if (iMo3787n == -4) {
            if (c0771f.m1787c(4)) {
                this.f3489s = Long.MIN_VALUE;
                return this.f3490t ? -4 : -3;
            }
            long j3 = c0771f.f3146m + this.f3487q;
            c0771f.f3146m = j3;
            this.f3489s = Math.max(this.f3489s, j3);
            return iMo3787n;
        }
        if (iMo3787n == -5) {
            C0583o c0583o = (C0583o) c0106b.f141i;
            c0583o.getClass();
            long j4 = c0583o.f2159s;
            if (j4 != Long.MAX_VALUE) {
                C0582n c0582nM1447a = c0583o.m1447a();
                c0582nM1447a.f2119r = j4 + this.f3487q;
                c0106b.f141i = new C0583o(c0582nM1447a);
            }
        }
        return iMo3787n;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo2095v(long j3, long j4);

    /* JADX INFO: renamed from: w */
    public final void m2096w(C0583o[] c0583oArr, InterfaceC1931Z interfaceC1931Z, long j3, long j4, C1907A c1907a) {
        AbstractC0646n.m1630h(!this.f3490t);
        this.f3485o = interfaceC1931Z;
        if (this.f3489s == Long.MIN_VALUE) {
            this.f3489s = j3;
        }
        this.f3486p = c0583oArr;
        this.f3487q = j4;
        mo2093t(c0583oArr, j3, j4, c1907a);
    }

    /* JADX INFO: renamed from: x */
    public final void m2097x() {
        AbstractC0646n.m1630h(this.f3484n == 0);
        this.f3479i.m526n();
        mo2090q();
    }

    /* JADX INFO: renamed from: y */
    public void mo2098y(float f, float f3) {
    }

    /* JADX INFO: renamed from: z */
    public abstract int mo2099z(C0583o c0583o);

    /* JADX INFO: renamed from: p */
    public void mo2089p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo2090q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo2091r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo2092s() {
    }

    @Override // p077a0.InterfaceC0822d0
    /* JADX INFO: renamed from: c */
    public void mo1903c(int i3, Object obj) {
    }

    /* JADX INFO: renamed from: n */
    public void mo2087n(boolean z3, boolean z4) {
    }

    /* JADX INFO: renamed from: t */
    public void mo2093t(C0583o[] c0583oArr, long j3, long j4, C1907A c1907a) {
    }
}
