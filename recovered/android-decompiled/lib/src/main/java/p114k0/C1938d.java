package p114k0;

import java.util.ArrayList;
import p000A.C0058r;
import p055T.AbstractC0545H;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p077a0.C0800K;
import p077a0.C0832i0;
import p125n0.InterfaceC2042s;

/* JADX INFO: renamed from: k0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1938d implements InterfaceC1965y, InterfaceC1964x {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1965y f8488g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1964x f8489h;

    /* JADX INFO: renamed from: i */
    public C1936c[] f8490i = new C1936c[0];

    /* JADX INFO: renamed from: j */
    public long f8491j;

    /* JADX INFO: renamed from: k */
    public long f8492k;

    /* JADX INFO: renamed from: l */
    public long f8493l;

    /* JADX INFO: renamed from: m */
    public C1942f f8494m;

    public C1938d(InterfaceC1965y interfaceC1965y, boolean z3, long j3, long j4) {
        this.f8488g = interfaceC1965y;
        this.f8491j = z3 ? j3 : -9223372036854775807L;
        this.f8492k = j3;
        this.f8493l = j4;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        return this.f8488g.mo3759a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4496b() {
        return this.f8491j != -9223372036854775807L;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: c */
    public final long mo3761c(long j3, C0832i0 c0832i0) {
        long j4 = this.f8492k;
        if (j3 == j4) {
            return j4;
        }
        long jM1591j = AbstractC0632A.m1591j(c0832i0.f3525a, 0L, j3 - j4);
        long j5 = this.f8493l;
        long jM1591j2 = AbstractC0632A.m1591j(c0832i0.f3526b, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j3);
        if (jM1591j != c0832i0.f3525a || jM1591j2 != c0832i0.f3526b) {
            c0832i0 = new C0832i0(jM1591j, jM1591j2);
        }
        return this.f8488g.mo3761c(j3, c0832i0);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: d */
    public final C1945g0 mo3762d() {
        return this.f8488g.mo3762d();
    }

    @Override // p114k0.InterfaceC1964x
    /* JADX INFO: renamed from: e */
    public final void mo1969e(InterfaceC1965y interfaceC1965y) {
        if (this.f8494m != null) {
            return;
        }
        InterfaceC1964x interfaceC1964x = this.f8489h;
        interfaceC1964x.getClass();
        interfaceC1964x.mo1969e(this);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: f */
    public final long mo3764f(InterfaceC2042s[] interfaceC2042sArr, boolean[] zArr, InterfaceC1931Z[] interfaceC1931ZArr, boolean[] zArr2, long j3) {
        long j4;
        boolean z3;
        C0058r c0058rM1357e;
        int iM319a;
        this.f8490i = new C1936c[interfaceC1931ZArr.length];
        InterfaceC1931Z[] interfaceC1931ZArr2 = new InterfaceC1931Z[interfaceC1931ZArr.length];
        int i3 = 0;
        while (true) {
            InterfaceC1931Z interfaceC1931Z = null;
            if (i3 >= interfaceC1931ZArr.length) {
                break;
            }
            C1936c[] c1936cArr = this.f8490i;
            C1936c c1936c = (C1936c) interfaceC1931ZArr[i3];
            c1936cArr[i3] = c1936c;
            if (c1936c != null) {
                interfaceC1931Z = c1936c.f8482g;
            }
            interfaceC1931ZArr2[i3] = interfaceC1931Z;
            i3++;
        }
        long jMo3764f = this.f8488g.mo3764f(interfaceC2042sArr, zArr, interfaceC1931ZArr2, zArr2, j3);
        if (m4496b()) {
            long j5 = this.f8492k;
            if (j3 != j5 || j5 == 0) {
                j4 = -9223372036854775807L;
            } else {
                int length = interfaceC2042sArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        j4 = -9223372036854775807L;
                    } else {
                        InterfaceC2042s interfaceC2042s = interfaceC2042sArr[i4];
                        if (interfaceC2042s != null) {
                            C0583o c0583oMo4426e = interfaceC2042s.mo4426e();
                            String str = c0583oMo4426e.f2154n;
                            ArrayList arrayList = AbstractC0545H.f1942a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        continue;
                                        break;
                                    case "audio/mp4a-latm":
                                        String str2 = c0583oMo4426e.f2151k;
                                        if (str2 != null && (c0058rM1357e = AbstractC0545H.m1357e(str2)) != null && (iM319a = c0058rM1357e.m319a()) != 0 && iM319a != 16) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
                            j4 = jMo3764f;
                        }
                        i4++;
                    }
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        this.f8491j = j4;
        if (jMo3764f != j3) {
            if (jMo3764f >= this.f8492k) {
                long j6 = this.f8493l;
                z3 = j6 == Long.MIN_VALUE || jMo3764f <= j6;
            }
        }
        AbstractC0646n.m1630h(z3);
        for (int i5 = 0; i5 < interfaceC1931ZArr.length; i5++) {
            InterfaceC1931Z interfaceC1931Z2 = interfaceC1931ZArr2[i5];
            if (interfaceC1931Z2 == null) {
                this.f8490i[i5] = null;
            } else {
                C1936c[] c1936cArr2 = this.f8490i;
                C1936c c1936c2 = c1936cArr2[i5];
                if (c1936c2 == null || c1936c2.f8482g != interfaceC1931Z2) {
                    c1936cArr2[i5] = new C1936c(this, interfaceC1931Z2);
                }
            }
            interfaceC1931ZArr[i5] = this.f8490i[i5];
        }
        return jMo3764f;
    }

    @Override // p114k0.InterfaceC1933a0
    /* JADX INFO: renamed from: g */
    public final void mo1973g(InterfaceC1935b0 interfaceC1935b0) {
        InterfaceC1964x interfaceC1964x = this.f8489h;
        interfaceC1964x.getClass();
        interfaceC1964x.mo1973g(this);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        long jMo3766h = this.f8488g.mo3766h();
        if (jMo3766h != Long.MIN_VALUE) {
            long j3 = this.f8493l;
            if (j3 == Long.MIN_VALUE || jMo3766h < j3) {
                return jMo3766h;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        return this.f8488g.mo3767i(c0800k);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: j */
    public final void mo3768j() throws C1942f {
        C1942f c1942f = this.f8494m;
        if (c1942f != null) {
            throw c1942f;
        }
        this.f8488g.mo3768j();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: n */
    public final long mo3769n(long j3) {
        this.f8491j = -9223372036854775807L;
        boolean z3 = false;
        for (C1936c c1936c : this.f8490i) {
            if (c1936c != null) {
                c1936c.f8483h = false;
            }
        }
        long jMo3769n = this.f8488g.mo3769n(j3);
        if (jMo3769n == j3) {
            z3 = true;
        } else if (jMo3769n >= this.f8492k) {
            long j4 = this.f8493l;
            if (j4 == Long.MIN_VALUE || jMo3769n <= j4) {
                z3 = true;
            }
        }
        AbstractC0646n.m1630h(z3);
        return jMo3769n;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: o */
    public final void mo3770o(long j3) {
        this.f8488g.mo3770o(j3);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: q */
    public final void mo3771q(InterfaceC1964x interfaceC1964x, long j3) {
        this.f8489h = interfaceC1964x;
        this.f8488g.mo3771q(this, j3);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        long jMo3772r = this.f8488g.mo3772r();
        if (jMo3772r != Long.MIN_VALUE) {
            long j3 = this.f8493l;
            if (j3 == Long.MIN_VALUE || jMo3772r < j3) {
                return jMo3772r;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: s */
    public final long mo3773s() {
        if (m4496b()) {
            long j3 = this.f8491j;
            this.f8491j = -9223372036854775807L;
            long jMo3773s = mo3773s();
            return jMo3773s != -9223372036854775807L ? jMo3773s : j3;
        }
        long jMo3773s2 = this.f8488g.mo3773s();
        if (jMo3773s2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC0646n.m1630h(jMo3773s2 >= this.f8492k);
        long j4 = this.f8493l;
        AbstractC0646n.m1630h(j4 == Long.MIN_VALUE || jMo3773s2 <= j4);
        return jMo3773s2;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
        this.f8488g.mo3774u(j3);
    }
}
