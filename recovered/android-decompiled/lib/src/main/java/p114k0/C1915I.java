package p114k0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p055T.C0559W;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p077a0.C0800K;
import p077a0.C0832i0;
import p082b0.C1063d;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1674E;
import p105h2.C1692X;
import p125n0.InterfaceC2042s;

/* JADX INFO: renamed from: k0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1915I implements InterfaceC1965y, InterfaceC1964x {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1965y[] f8333g;

    /* JADX INFO: renamed from: h */
    public final IdentityHashMap f8334h;

    /* JADX INFO: renamed from: i */
    public final C1528a f8335i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f8336j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final HashMap f8337k = new HashMap();

    /* JADX INFO: renamed from: l */
    public InterfaceC1964x f8338l;

    /* JADX INFO: renamed from: m */
    public C1945g0 f8339m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1965y[] f8340n;

    /* JADX INFO: renamed from: o */
    public C1953m f8341o;

    public C1915I(C1528a c1528a, long[] jArr, InterfaceC1965y... interfaceC1965yArr) {
        this.f8335i = c1528a;
        this.f8333g = interfaceC1965yArr;
        c1528a.getClass();
        C1674E c1674e = AbstractC1676G.f7601h;
        C1692X c1692x = C1692X.f7629k;
        this.f8341o = new C1953m(c1692x, c1692x);
        this.f8334h = new IdentityHashMap();
        this.f8340n = new InterfaceC1965y[0];
        for (int i3 = 0; i3 < interfaceC1965yArr.length; i3++) {
            long j3 = jArr[i3];
            if (j3 != 0) {
                this.f8333g[i3] = new C1943f0(interfaceC1965yArr[i3], j3);
            }
        }
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        return this.f8341o.mo3759a();
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: c */
    public final long mo3761c(long j3, C0832i0 c0832i0) {
        InterfaceC1965y[] interfaceC1965yArr = this.f8340n;
        return (interfaceC1965yArr.length > 0 ? interfaceC1965yArr[0] : this.f8333g[0]).mo3761c(j3, c0832i0);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: d */
    public final C1945g0 mo3762d() {
        C1945g0 c1945g0 = this.f8339m;
        c1945g0.getClass();
        return c1945g0;
    }

    @Override // p114k0.InterfaceC1964x
    /* JADX INFO: renamed from: e */
    public final void mo1969e(InterfaceC1965y interfaceC1965y) {
        ArrayList arrayList = this.f8336j;
        arrayList.remove(interfaceC1965y);
        if (arrayList.isEmpty()) {
            InterfaceC1965y[] interfaceC1965yArr = this.f8333g;
            int i3 = 0;
            for (InterfaceC1965y interfaceC1965y2 : interfaceC1965yArr) {
                i3 += interfaceC1965y2.mo3762d().f8526a;
            }
            C0559W[] c0559wArr = new C0559W[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < interfaceC1965yArr.length; i5++) {
                C1945g0 c1945g0Mo3762d = interfaceC1965yArr[i5].mo3762d();
                int i6 = c1945g0Mo3762d.f8526a;
                int i7 = 0;
                while (i7 < i6) {
                    C0559W c0559wM4499a = c1945g0Mo3762d.m4499a(i7);
                    int i8 = c0559wM4499a.f1992a;
                    C0583o[] c0583oArr = new C0583o[i8];
                    for (int i9 = 0; i9 < i8; i9++) {
                        C0583o c0583o = c0559wM4499a.f1995d[i9];
                        C0582n c0582nM1447a = c0583o.m1447a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i5);
                        sb.append(":");
                        String str = c0583o.f2141a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c0582nM1447a.f2102a = sb.toString();
                        c0583oArr[i9] = new C0583o(c0582nM1447a);
                    }
                    C0559W c0559w = new C0559W(i5 + ":" + c0559wM4499a.f1993b, c0583oArr);
                    this.f8337k.put(c0559w, c0559wM4499a);
                    c0559wArr[i4] = c0559w;
                    i7++;
                    i4++;
                }
            }
            this.f8339m = new C1945g0(c0559wArr);
            InterfaceC1964x interfaceC1964x = this.f8338l;
            interfaceC1964x.getClass();
            interfaceC1964x.mo1969e(this);
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: f */
    public final long mo3764f(InterfaceC2042s[] interfaceC2042sArr, boolean[] zArr, InterfaceC1931Z[] interfaceC1931ZArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[interfaceC2042sArr.length];
        int[] iArr2 = new int[interfaceC2042sArr.length];
        int i3 = 0;
        while (true) {
            int length = interfaceC2042sArr.length;
            identityHashMap = this.f8334h;
            if (i3 >= length) {
                break;
            }
            InterfaceC1931Z interfaceC1931Z = interfaceC1931ZArr[i3];
            Integer num = interfaceC1931Z == null ? null : (Integer) identityHashMap.get(interfaceC1931Z);
            iArr[i3] = num == null ? -1 : num.intValue();
            InterfaceC2042s interfaceC2042s = interfaceC2042sArr[i3];
            if (interfaceC2042s != null) {
                String str = interfaceC2042s.mo4424b().f1993b;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        identityHashMap.clear();
        int length2 = interfaceC2042sArr.length;
        InterfaceC1931Z[] interfaceC1931ZArr2 = new InterfaceC1931Z[length2];
        InterfaceC1931Z[] interfaceC1931ZArr3 = new InterfaceC1931Z[interfaceC2042sArr.length];
        InterfaceC2042s[] interfaceC2042sArr2 = new InterfaceC2042s[interfaceC2042sArr.length];
        InterfaceC1965y[] interfaceC1965yArr = this.f8333g;
        ArrayList arrayList = new ArrayList(interfaceC1965yArr.length);
        long j4 = j3;
        int i4 = 0;
        while (i4 < interfaceC1965yArr.length) {
            int i5 = 0;
            while (i5 < interfaceC2042sArr.length) {
                interfaceC1931ZArr3[i5] = iArr[i5] == i4 ? interfaceC1931ZArr[i5] : null;
                if (iArr2[i5] == i4) {
                    InterfaceC2042s interfaceC2042s2 = interfaceC2042sArr[i5];
                    interfaceC2042s2.getClass();
                    C0559W c0559w = (C0559W) this.f8337k.get(interfaceC2042s2.mo4424b());
                    c0559w.getClass();
                    interfaceC2042sArr2[i5] = new C1914H(interfaceC2042s2, c0559w);
                } else {
                    interfaceC2042sArr2[i5] = null;
                }
                i5++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            InterfaceC1965y[] interfaceC1965yArr2 = interfaceC1965yArr;
            int i6 = i4;
            long jMo3764f = interfaceC1965yArr2[i4].mo3764f(interfaceC2042sArr2, zArr, interfaceC1931ZArr3, zArr2, j4);
            if (i6 == 0) {
                j4 = jMo3764f;
            } else if (jMo3764f != j4) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z3 = false;
            for (int i7 = 0; i7 < interfaceC2042sArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    InterfaceC1931Z interfaceC1931Z2 = interfaceC1931ZArr3[i7];
                    interfaceC1931Z2.getClass();
                    interfaceC1931ZArr2[i7] = interfaceC1931ZArr3[i7];
                    identityHashMap.put(interfaceC1931Z2, Integer.valueOf(i6));
                    z3 = true;
                } else if (iArr3[i7] == i6) {
                    AbstractC0646n.m1630h(interfaceC1931ZArr3[i7] == null);
                }
            }
            if (z3) {
                arrayList.add(interfaceC1965yArr2[i6]);
            }
            i4 = i6 + 1;
            interfaceC1965yArr = interfaceC1965yArr2;
            iArr = iArr3;
        }
        System.arraycopy(interfaceC1931ZArr2, 0, interfaceC1931ZArr, 0, length2);
        this.f8340n = (InterfaceC1965y[]) arrayList.toArray(new InterfaceC1965y[0]);
        AbstractList abstractListM4168q = AbstractC1723q.m4168q(arrayList, new C1063d(14));
        this.f8335i.getClass();
        this.f8341o = new C1953m(arrayList, abstractListM4168q);
        return j4;
    }

    @Override // p114k0.InterfaceC1933a0
    /* JADX INFO: renamed from: g */
    public final void mo1973g(InterfaceC1935b0 interfaceC1935b0) {
        InterfaceC1964x interfaceC1964x = this.f8338l;
        interfaceC1964x.getClass();
        interfaceC1964x.mo1973g(this);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        return this.f8341o.mo3766h();
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        ArrayList arrayList = this.f8336j;
        if (arrayList.isEmpty()) {
            return this.f8341o.mo3767i(c0800k);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC1965y) arrayList.get(i3)).mo3767i(c0800k);
        }
        return false;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: j */
    public final void mo3768j() {
        for (InterfaceC1965y interfaceC1965y : this.f8333g) {
            interfaceC1965y.mo3768j();
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: n */
    public final long mo3769n(long j3) {
        long jMo3769n = this.f8340n[0].mo3769n(j3);
        int i3 = 1;
        while (true) {
            InterfaceC1965y[] interfaceC1965yArr = this.f8340n;
            if (i3 >= interfaceC1965yArr.length) {
                return jMo3769n;
            }
            if (interfaceC1965yArr[i3].mo3769n(jMo3769n) != jMo3769n) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i3++;
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: o */
    public final void mo3770o(long j3) {
        for (InterfaceC1965y interfaceC1965y : this.f8340n) {
            interfaceC1965y.mo3770o(j3);
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: q */
    public final void mo3771q(InterfaceC1964x interfaceC1964x, long j3) {
        this.f8338l = interfaceC1964x;
        ArrayList arrayList = this.f8336j;
        InterfaceC1965y[] interfaceC1965yArr = this.f8333g;
        Collections.addAll(arrayList, interfaceC1965yArr);
        for (InterfaceC1965y interfaceC1965y : interfaceC1965yArr) {
            interfaceC1965y.mo3771q(this, j3);
        }
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        return this.f8341o.mo3772r();
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: s */
    public final long mo3773s() {
        long j3 = -9223372036854775807L;
        for (InterfaceC1965y interfaceC1965y : this.f8340n) {
            long jMo3773s = interfaceC1965y.mo3773s();
            if (jMo3773s == -9223372036854775807L) {
                if (j3 != -9223372036854775807L && interfaceC1965y.mo3769n(j3) != j3) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j3 == -9223372036854775807L) {
                for (InterfaceC1965y interfaceC1965y2 : this.f8340n) {
                    if (interfaceC1965y2 == interfaceC1965y) {
                        break;
                    }
                    if (interfaceC1965y2.mo3769n(jMo3773s) != jMo3773s) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j3 = jMo3773s;
            } else if (jMo3773s != j3) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j3;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
        this.f8341o.mo3774u(j3);
    }
}
