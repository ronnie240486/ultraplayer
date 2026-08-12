package p092e0;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000A.C0058r;
import p030K0.C0334e;
import p036M0.C0380q;
import p045P0.AbstractC0462h;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0559W;
import p055T.C0582n;
import p055T.C0583o;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.RunnableC0647o;
import p070Y.InterfaceC0701A;
import p074Z0.C0778e;
import p077a0.C0799J;
import p077a0.C0800K;
import p077a0.C0832i0;
import p082b0.C1063d;
import p082b0.C1071l;
import p088d0.C1387k;
import p088d0.InterfaceC1390n;
import p089d1.C1447t;
import p095f0.C1528a;
import p095f0.C1530c;
import p095f0.C1531d;
import p095f0.C1534g;
import p095f0.C1537j;
import p095f0.C1538k;
import p095f0.C1539l;
import p095f0.C1540m;
import p095f0.InterfaceC1545r;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1674E;
import p105h2.C1692X;
import p114k0.C1945g0;
import p114k0.C1953m;
import p114k0.InterfaceC1931Z;
import p114k0.InterfaceC1964x;
import p114k0.InterfaceC1965y;
import p117l0.InterfaceC1974c;
import p125n0.InterfaceC2042s;
import p129o0.C2065e;
import p129o0.C2074n;

/* JADX INFO: renamed from: e0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1506k implements InterfaceC1965y, InterfaceC1545r {

    /* JADX INFO: renamed from: A */
    public C1512q[] f6717A;

    /* JADX INFO: renamed from: B */
    public int f6718B;

    /* JADX INFO: renamed from: C */
    public C1953m f6719C;

    /* JADX INFO: renamed from: g */
    public final C1498c f6720g;

    /* JADX INFO: renamed from: h */
    public final C1531d f6721h;

    /* JADX INFO: renamed from: i */
    public final C1447t f6722i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0701A f6723j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1390n f6724k;

    /* JADX INFO: renamed from: l */
    public final C1387k f6725l;

    /* JADX INFO: renamed from: m */
    public final C1528a f6726m;

    /* JADX INFO: renamed from: n */
    public final C0380q f6727n;

    /* JADX INFO: renamed from: o */
    public final C2065e f6728o;

    /* JADX INFO: renamed from: p */
    public final IdentityHashMap f6729p;

    /* JADX INFO: renamed from: q */
    public final C1447t f6730q;

    /* JADX INFO: renamed from: r */
    public final C1528a f6731r;

    /* JADX INFO: renamed from: s */
    public final boolean f6732s;

    /* JADX INFO: renamed from: t */
    public final int f6733t;

    /* JADX INFO: renamed from: u */
    public final C1071l f6734u;

    /* JADX INFO: renamed from: v */
    public final C1447t f6735v = new C1447t(5, this);

    /* JADX INFO: renamed from: w */
    public InterfaceC1964x f6736w;

    /* JADX INFO: renamed from: x */
    public int f6737x;

    /* JADX INFO: renamed from: y */
    public C1945g0 f6738y;

    /* JADX INFO: renamed from: z */
    public C1512q[] f6739z;

    public C1506k(C1498c c1498c, C1531d c1531d, C1447t c1447t, InterfaceC0701A interfaceC0701A, InterfaceC1390n interfaceC1390n, C1387k c1387k, C1528a c1528a, C0380q c0380q, C2065e c2065e, C1528a c1528a2, boolean z3, int i3, C1071l c1071l) {
        this.f6720g = c1498c;
        this.f6721h = c1531d;
        this.f6722i = c1447t;
        this.f6723j = interfaceC0701A;
        this.f6724k = interfaceC1390n;
        this.f6725l = c1387k;
        this.f6726m = c1528a;
        this.f6727n = c0380q;
        this.f6728o = c2065e;
        this.f6731r = c1528a2;
        this.f6732s = z3;
        this.f6733t = i3;
        this.f6734u = c1071l;
        c1528a2.getClass();
        C1674E c1674e = AbstractC1676G.f7601h;
        C1692X c1692x = C1692X.f7629k;
        this.f6719C = new C1953m(c1692x, c1692x);
        this.f6729p = new IdentityHashMap();
        this.f6730q = new C1447t(6);
        this.f6739z = new C1512q[0];
        this.f6717A = new C1512q[0];
    }

    /* JADX INFO: renamed from: k */
    public static C0583o m3758k(C0583o c0583o, C0583o c0583o2, boolean z3) {
        C0544G c0544g;
        int i3;
        String str;
        String str2;
        AbstractC1676G abstractC1676G;
        String str3;
        int i4;
        int i5;
        C1674E c1674e = AbstractC1676G.f7601h;
        C1692X c1692x = C1692X.f7629k;
        if (c0583o2 != null) {
            str2 = c0583o2.f2151k;
            c0544g = c0583o2.f2152l;
            i4 = c0583o2.f2130C;
            i3 = c0583o2.f2145e;
            i5 = c0583o2.f2146f;
            str = c0583o2.f2144d;
            str3 = c0583o2.f2142b;
            abstractC1676G = c0583o2.f2143c;
        } else {
            String strM1601t = AbstractC0632A.m1601t(1, c0583o.f2151k);
            c0544g = c0583o.f2152l;
            if (z3) {
                i4 = c0583o.f2130C;
                i3 = c0583o.f2145e;
                i5 = c0583o.f2146f;
                str = c0583o.f2144d;
                str3 = c0583o.f2142b;
                str2 = strM1601t;
                abstractC1676G = c0583o.f2143c;
            } else {
                i3 = 0;
                str = null;
                str2 = strM1601t;
                abstractC1676G = c1692x;
                str3 = null;
                i4 = -1;
                i5 = 0;
            }
        }
        String strM1355c = AbstractC0545H.m1355c(str2);
        int i6 = z3 ? c0583o.f2148h : -1;
        int i7 = z3 ? c0583o.f2149i : -1;
        C0582n c0582n = new C0582n();
        c0582n.f2102a = c0583o.f2141a;
        c0582n.f2103b = str3;
        c0582n.f2104c = AbstractC1676G.m4117n(abstractC1676G);
        c0582n.f2113l = AbstractC0545H.m1364l(c0583o.f2153m);
        c0582n.f2114m = AbstractC0545H.m1364l(strM1355c);
        c0582n.f2111j = str2;
        c0582n.f2112k = c0544g;
        c0582n.f2109h = i6;
        c0582n.f2110i = i7;
        c0582n.f2092B = i4;
        c0582n.f2106e = i3;
        c0582n.f2107f = i5;
        c0582n.f2105d = str;
        return new C0583o(c0582n);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        return this.f6719C.mo3759a();
    }

    @Override // p095f0.InterfaceC1545r
    /* JADX INFO: renamed from: b */
    public final void mo3760b() {
        for (C1512q c1512q : this.f6739z) {
            ArrayList arrayList = c1512q.f6810t;
            if (!arrayList.isEmpty()) {
                C1505j c1505j = (C1505j) AbstractC1723q.m4158g(arrayList);
                int iM3751b = c1512q.f6800j.m3751b(c1505j);
                if (iM3751b == 1) {
                    c1505j.f6700K = true;
                } else if (iM3751b == 0) {
                    c1512q.f6814x.post(new RunnableC0647o(c1512q, 9, c1505j));
                } else if (iM3751b == 2 && !c1512q.f6792Z) {
                    C2074n c2074n = c1512q.f6806p;
                    if (c2074n.m4637b()) {
                        c2074n.m4636a();
                    }
                }
            }
        }
        this.f6736w.mo1973g(this);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: c */
    public final long mo3761c(long j3, C0832i0 c0832i0) {
        for (C1512q c1512q : this.f6717A) {
            if (c1512q.f6773G == 2) {
                C1504i c1504i = c1512q.f6800j;
                int iMo3748h = c1504i.f6686q.mo3748h();
                Uri[] uriArr = c1504i.f6674e;
                int length = uriArr.length;
                C1531d c1531d = c1504i.f6676g;
                C1537j c1537jM3831a = (iMo3748h >= length || iMo3748h == -1) ? null : c1531d.m3831a(uriArr[c1504i.f6686q.mo4423a()], true);
                if (c1537jM3831a == null) {
                    break;
                }
                AbstractC1676G abstractC1676G = c1537jM3831a.f6954r;
                if (abstractC1676G.isEmpty() || !c1537jM3831a.f6979c) {
                    break;
                    break;
                }
                long j4 = c1537jM3831a.f6944h - c1531d.f6916t;
                long j5 = j3 - j4;
                int iM1584c = AbstractC0632A.m1584c(abstractC1676G, Long.valueOf(j5), true);
                long j6 = ((C1534g) abstractC1676G.get(iM1584c)).f6928k;
                return c0832i0.m2102a(j5, j6, iM1584c != abstractC1676G.size() - 1 ? ((C1534g) abstractC1676G.get(iM1584c + 1)).f6928k : j6) + j4;
            }
        }
        return j3;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: d */
    public final C1945g0 mo3762d() {
        C1945g0 c1945g0 = this.f6738y;
        c1945g0.getClass();
        return c1945g0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[LOOP:1: B:17:0x0046->B:22:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0057 A[EDGE_INSN: B:53:0x0057->B:24:0x0057 BREAK  A[LOOP:1: B:17:0x0046->B:22:0x0053], SYNTHETIC] */
    @Override // p095f0.InterfaceC1545r
    /* JADX INFO: renamed from: e */
    public final boolean mo3763e(Uri uri, C0334e c0334e, boolean z3) {
        long j3;
        int i3;
        int iMo4438t;
        C1530c c1530c;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        for (C1512q c1512q : this.f6739z) {
            C1504i c1504i = c1512q.f6800j;
            Uri[] uriArr = c1504i.f6674e;
            if (AbstractC0632A.m1592k(uriArr, uri)) {
                if (!z3) {
                    C0058r c0058rM1506h = AbstractC0610a.m1506h(c1504i.f6686q);
                    c1512q.f6805o.getClass();
                    C0778e c0778eM3817A = C1528a.m3817A(c0058rM1506h, c0334e);
                    if (c0778eM3817A != null && c0778eM3817A.f3181a == 2) {
                        j3 = c0778eM3817A.f3182b;
                    }
                    i3 = 0;
                    while (true) {
                        if (i3 < uriArr.length) {
                            i3 = -1;
                            break;
                        }
                        if (uriArr[i3].equals(uri)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1 && (iMo4438t = c1504i.f6686q.mo4438t(i3)) != -1) {
                        c1504i.f6688s |= uri.equals(c1504i.f6684o);
                        if (j3 == -9223372036854775807L) {
                            if (c1504i.f6686q.mo4429j(iMo4438t, j3)) {
                                c1530c = (C1530c) c1504i.f6676g.f6906j.get(uri);
                                if (c1530c != null) {
                                    z4 = !C1530c.m3825a(c1530c, j3);
                                } else {
                                    z4 = false;
                                }
                                z5 = z4;
                            }
                        }
                    }
                    if (z5 || j3 == -9223372036854775807L) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                }
                j3 = -9223372036854775807L;
                i3 = 0;
                while (true) {
                    if (i3 < uriArr.length) {
                        i3 = -1;
                        break;
                    }
                    if (uriArr[i3].equals(uri)) {
                        break;
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    c1504i.f6688s |= uri.equals(c1504i.f6684o);
                    if (j3 == -9223372036854775807L) {
                        if (c1504i.f6686q.mo4429j(iMo4438t, j3)) {
                            c1530c = (C1530c) c1504i.f6676g.f6906j.get(uri);
                            if (c1530c != null) {
                                z4 = !C1530c.m3825a(c1530c, j3);
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                            }
                        }
                    }
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
            } else {
                z6 = true;
            }
            z7 &= z6;
        }
        this.f6736w.mo1973g(this);
        return z7;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0276  */
    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: f */
    public final long mo3764f(InterfaceC2042s[] interfaceC2042sArr, boolean[] zArr, InterfaceC1931Z[] interfaceC1931ZArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        int i3;
        C1531d c1531d;
        Object[] objArr;
        Uri[] uriArr;
        int[] iArr;
        int i4;
        int i5;
        IdentityHashMap identityHashMap2;
        boolean z3;
        int[] iArr2;
        InterfaceC2042s[] interfaceC2042sArr2;
        C1504i c1504i;
        C1512q[] c1512qArr;
        int i6;
        boolean z4;
        C1506k c1506k;
        int i7;
        C1506k c1506k2 = this;
        int[] iArr3 = new int[interfaceC2042sArr.length];
        int[] iArr4 = new int[interfaceC2042sArr.length];
        int i8 = 0;
        while (true) {
            int length = interfaceC2042sArr.length;
            identityHashMap = c1506k2.f6729p;
            if (i8 >= length) {
                break;
            }
            InterfaceC1931Z interfaceC1931Z = interfaceC1931ZArr[i8];
            iArr3[i8] = interfaceC1931Z == null ? -1 : ((Integer) identityHashMap.get(interfaceC1931Z)).intValue();
            iArr4[i8] = -1;
            InterfaceC2042s interfaceC2042s = interfaceC2042sArr[i8];
            if (interfaceC2042s != null) {
                C0559W c0559wMo4424b = interfaceC2042s.mo4424b();
                int i9 = 0;
                while (true) {
                    C1512q[] c1512qArr2 = c1506k2.f6739z;
                    if (i9 >= c1512qArr2.length) {
                        break;
                    }
                    C1512q c1512q = c1512qArr2[i9];
                    c1512q.m3806v();
                    int iIndexOf = c1512q.f6781O.f8527b.indexOf(c0559wMo4424b);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        iArr4[i8] = i9;
                        break;
                    }
                    i9++;
                }
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = interfaceC2042sArr.length;
        int length3 = interfaceC2042sArr.length;
        InterfaceC1931Z[] interfaceC1931ZArr2 = new InterfaceC1931Z[length3];
        int length4 = interfaceC2042sArr.length;
        int i10 = length3;
        boolean z5 = true;
        C1512q[] c1512qArr3 = new C1512q[c1506k2.f6739z.length];
        InterfaceC2042s[] interfaceC2042sArr3 = new InterfaceC2042s[length4];
        int i11 = 0;
        int i12 = 0;
        boolean z6 = false;
        Object[] objArr2 = new InterfaceC1931Z[length2];
        Object[] objArr3 = interfaceC1931ZArr2;
        while (i11 < c1506k2.f6739z.length) {
            int i13 = 0;
            while (true) {
                i3 = length2;
                if (i13 >= interfaceC2042sArr.length) {
                    break;
                }
                objArr3[i13] = iArr3[i13] == i11 ? interfaceC1931ZArr[i13] : null;
                interfaceC2042sArr3[i13] = iArr4[i13] == i11 ? interfaceC2042sArr[i13] : null;
                i13++;
                length2 = i3;
            }
            C1512q c1512q2 = c1506k2.f6739z[i11];
            c1512q2.m3806v();
            int i14 = c1512q2.f6777K;
            int i15 = 0;
            Object[] objArr4 = objArr2;
            while (i15 < length4) {
                int i16 = i15;
                C1508m c1508m = (C1508m) objArr3[i15];
                if (c1508m != null && (interfaceC2042sArr3[i16] == null || !zArr[i16])) {
                    c1512q2.f6777K--;
                    if (c1508m.f6754i != -1) {
                        C1512q c1512q3 = c1508m.f6753h;
                        c1512q3.m3806v();
                        c1512q3.f6783Q.getClass();
                        int i17 = c1512q3.f6783Q[c1508m.f6752g];
                        AbstractC0646n.m1630h(c1512q3.f6786T[i17]);
                        c1512q3.f6786T[i17] = false;
                        c1508m.f6754i = -1;
                    }
                    objArr3[i16] = null;
                }
                i15 = i16 + 1;
                objArr4 = objArr4;
                identityHashMap = identityHashMap;
            }
            Object[] objArr5 = objArr4;
            IdentityHashMap identityHashMap3 = identityHashMap;
            boolean z7 = z6 || (!c1512q2.f6791Y ? j3 == c1512q2.f6788V : i14 != 0);
            C1504i c1504i2 = c1512q2.f6800j;
            InterfaceC2042s interfaceC2042s2 = c1504i2.f6686q;
            boolean z8 = z7;
            InterfaceC2042s interfaceC2042s3 = interfaceC2042s2;
            int i18 = i11;
            int i19 = 0;
            Object[] objArr6 = objArr3;
            while (true) {
                c1531d = c1504i2.f6676g;
                objArr = objArr6;
                uriArr = c1504i2.f6674e;
                if (i19 >= length4) {
                    break;
                }
                int i20 = i19;
                InterfaceC2042s interfaceC2042s4 = interfaceC2042sArr3[i20];
                if (interfaceC2042s4 == null) {
                    i7 = length4;
                } else {
                    i7 = length4;
                    int iIndexOf2 = c1512q2.f6781O.f8527b.indexOf(interfaceC2042s4.mo4424b());
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = -1;
                    }
                    if (iIndexOf2 == c1512q2.f6784R) {
                        C1530c c1530c = (C1530c) c1531d.f6906j.get(uriArr[c1504i2.f6686q.mo4423a()]);
                        if (c1530c != null) {
                            c1530c.f6900q = false;
                        }
                        c1504i2.f6686q = interfaceC2042s4;
                        interfaceC2042s3 = interfaceC2042s4;
                    }
                    if (objArr[i20] == null) {
                        c1512q2.f6777K++;
                        C1508m c1508m2 = new C1508m(c1512q2, iIndexOf2);
                        objArr[i20] = c1508m2;
                        zArr2[i20] = z5;
                        if (c1512q2.f6783Q != null) {
                            c1508m2.m3784a();
                            if (!z8) {
                                C1511p c1511p = c1512q2.f6768B[c1512q2.f6783Q[iIndexOf2]];
                                z8 = (c1511p.m4474q() == 0 || c1511p.m4463C(j3, true)) ? false : true;
                            }
                        }
                    }
                    i19 = i20 + 1;
                    objArr6 = objArr;
                    length4 = i7;
                    z5 = true;
                }
                i19 = i20 + 1;
                objArr6 = objArr;
                length4 = i7;
                z5 = true;
            }
            int i21 = length4;
            int i22 = c1512q2.f6777K;
            ArrayList arrayList = c1512q2.f6810t;
            if (i22 == 0) {
                C1530c c1530c2 = (C1530c) c1531d.f6906j.get(uriArr[c1504i2.f6686q.mo4423a()]);
                if (c1530c2 != null) {
                    c1530c2.f6900q = false;
                }
                c1504i2.f6683n = null;
                c1512q2.f6779M = null;
                c1512q2.f6790X = true;
                arrayList.clear();
                C2074n c2074n = c1512q2.f6806p;
                if (c2074n.m4637b()) {
                    if (c1512q2.f6775I) {
                        for (C1511p c1511p2 : c1512q2.f6768B) {
                            c1511p2.m4468j();
                        }
                    }
                    c2074n.m4636a();
                } else {
                    c1512q2.m3799G();
                }
                iArr = iArr3;
                i4 = i10;
                i5 = i3;
                identityHashMap2 = identityHashMap3;
                iArr2 = iArr4;
                interfaceC2042sArr2 = interfaceC2042sArr3;
                c1504i = c1504i2;
                c1512qArr = c1512qArr3;
                i6 = i18;
            } else {
                if (arrayList.isEmpty()) {
                    iArr = iArr3;
                    i4 = i10;
                    i5 = i3;
                    identityHashMap2 = identityHashMap3;
                    z3 = true;
                    iArr2 = iArr4;
                    interfaceC2042sArr2 = interfaceC2042sArr3;
                    c1504i = c1504i2;
                    c1512qArr = c1512qArr3;
                    i6 = i18;
                    z4 = z6;
                } else {
                    int i23 = AbstractC0632A.f2454a;
                    if (Objects.equals(interfaceC2042s3, interfaceC2042s2)) {
                        iArr = iArr3;
                        i4 = i10;
                        i5 = i3;
                        identityHashMap2 = identityHashMap3;
                        z3 = true;
                        iArr2 = iArr4;
                        interfaceC2042sArr2 = interfaceC2042sArr3;
                        c1504i = c1504i2;
                        c1512qArr = c1512qArr3;
                        i6 = i18;
                    } else {
                        if (c1512q2.f6791Y) {
                            iArr = iArr3;
                            i4 = i10;
                            i5 = i3;
                            identityHashMap2 = identityHashMap3;
                            iArr2 = iArr4;
                            interfaceC2042sArr2 = interfaceC2042sArr3;
                            c1504i = c1504i2;
                            c1512qArr = c1512qArr3;
                            i6 = i18;
                        } else {
                            long j4 = j3 < 0 ? -j3 : 0L;
                            C1505j c1505jM3794A = c1512q2.m3794A();
                            InterfaceC1974c[] interfaceC1974cArrM3750a = c1504i2.m3750a(c1505jM3794A, j3);
                            InterfaceC2042s interfaceC2042s5 = interfaceC2042s3;
                            iArr = iArr3;
                            i4 = i10;
                            identityHashMap2 = identityHashMap3;
                            iArr2 = iArr4;
                            i5 = i3;
                            c1504i = c1504i2;
                            interfaceC2042sArr2 = interfaceC2042sArr3;
                            c1512qArr = c1512qArr3;
                            i6 = i18;
                            interfaceC2042s5.mo3746c(j3, j4, -9223372036854775807L, c1512q2.f6811u, interfaceC1974cArrM3750a);
                            if (interfaceC2042s5.mo4423a() == c1504i.f6677h.m1417a(c1505jM3794A.f8604d)) {
                                z3 = true;
                            }
                        }
                        z3 = true;
                        c1512q2.f6790X = true;
                        z4 = true;
                        z8 = true;
                    }
                    z4 = z6;
                }
                if (z8) {
                    c1512q2.m3800H(j3, z4);
                    for (int i24 = 0; i24 < i4; i24 += z3 ? 1 : 0) {
                        if (objArr[i24] != null) {
                            zArr2[i24] = z3;
                        }
                    }
                }
            }
            ArrayList arrayList2 = c1512q2.f6815y;
            arrayList2.clear();
            for (int i25 = 0; i25 < i4; i25++) {
                Object obj = objArr[i25];
                if (obj != null) {
                    arrayList2.add((C1508m) obj);
                }
            }
            c1512q2.f6791Y = true;
            boolean z9 = false;
            for (int i26 = 0; i26 < interfaceC2042sArr.length; i26++) {
                Object obj2 = objArr[i26];
                if (iArr2[i26] == i6) {
                    obj2.getClass();
                    objArr5[i26] = obj2;
                    identityHashMap2.put(obj2, Integer.valueOf(i6));
                    z9 = true;
                } else if (iArr[i26] == i6) {
                    AbstractC0646n.m1630h(obj2 == null);
                }
            }
            if (z9) {
                int i27 = i12;
                c1512qArr[i27] = c1512q2;
                i12 = i27 + 1;
                if (i27 == 0) {
                    c1504i.f6681l = true;
                    c1506k = this;
                    if (!z8) {
                        C1512q[] c1512qArr4 = c1506k.f6717A;
                        if (c1512qArr4.length == 0 || c1512q2 != c1512qArr4[0]) {
                        }
                        i11 = i6 + 1;
                        c1506k2 = c1506k;
                        identityHashMap = identityHashMap2;
                        iArr4 = iArr2;
                        c1512qArr3 = c1512qArr;
                        interfaceC2042sArr3 = interfaceC2042sArr2;
                        length2 = i5;
                        objArr2 = objArr5;
                        objArr3 = objArr;
                        iArr3 = iArr;
                        length4 = i21;
                        i10 = i4;
                    }
                    ((SparseArray) c1506k.f6730q.f6406h).clear();
                    z5 = true;
                    z6 = true;
                    i11 = i6 + 1;
                    c1506k2 = c1506k;
                    identityHashMap = identityHashMap2;
                    iArr4 = iArr2;
                    c1512qArr3 = c1512qArr;
                    interfaceC2042sArr3 = interfaceC2042sArr2;
                    length2 = i5;
                    objArr2 = objArr5;
                    objArr3 = objArr;
                    iArr3 = iArr;
                    length4 = i21;
                    i10 = i4;
                } else {
                    c1506k = this;
                    c1504i.f6681l = i6 < c1506k.f6718B;
                }
            } else {
                c1506k = this;
            }
            z5 = true;
            i11 = i6 + 1;
            c1506k2 = c1506k;
            identityHashMap = identityHashMap2;
            iArr4 = iArr2;
            c1512qArr3 = c1512qArr;
            interfaceC2042sArr3 = interfaceC2042sArr2;
            length2 = i5;
            objArr2 = objArr5;
            objArr3 = objArr;
            iArr3 = iArr;
            length4 = i21;
            i10 = i4;
        }
        int i28 = length2;
        C1506k c1506k3 = c1506k2;
        System.arraycopy(objArr2, 0, interfaceC1931ZArr, 0, i28);
        C1512q[] c1512qArr5 = (C1512q[]) AbstractC0632A.m1573N(i12, c1512qArr3);
        c1506k3.f6717A = c1512qArr5;
        C1692X c1692xM4118o = AbstractC1676G.m4118o(c1512qArr5);
        AbstractList abstractListM4168q = AbstractC1723q.m4168q(c1692xM4118o, new C1063d(10));
        c1506k3.f6731r.getClass();
        c1506k3.f6719C = new C1953m(c1692xM4118o, abstractListM4168q);
        return j3;
    }

    /* JADX INFO: renamed from: g */
    public final C1512q m3765g(String str, int i3, Uri[] uriArr, C0583o[] c0583oArr, C0583o c0583o, List list, Map map, long j3) {
        C1504i c1504i = new C1504i(this.f6720g, this.f6721h, uriArr, c0583oArr, this.f6722i, this.f6723j, this.f6730q, list, this.f6734u);
        C0380q c0380q = this.f6727n;
        return new C1512q(str, i3, this.f6735v, c1504i, map, this.f6728o, j3, c0583o, this.f6724k, this.f6725l, this.f6726m, c0380q, this.f6733t);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        return this.f6719C.mo3766h();
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        if (this.f6738y != null) {
            return this.f6719C.mo3767i(c0800k);
        }
        for (C1512q c1512q : this.f6739z) {
            if (!c1512q.f6776J) {
                C0799J c0799j = new C0799J();
                c0799j.f3332a = c1512q.f6788V;
                c1512q.mo3767i(new C0800K(c0799j));
            }
        }
        return false;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: j */
    public final void mo3768j() throws IOException {
        for (C1512q c1512q : this.f6739z) {
            c1512q.m3797E();
            if (c1512q.f6792Z && !c1512q.f6776J) {
                throw C0546I.m1365a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: n */
    public final long mo3769n(long j3) {
        C1512q[] c1512qArr = this.f6717A;
        if (c1512qArr.length > 0) {
            boolean zM3800H = c1512qArr[0].m3800H(j3, false);
            int i3 = 1;
            while (true) {
                C1512q[] c1512qArr2 = this.f6717A;
                if (i3 >= c1512qArr2.length) {
                    break;
                }
                c1512qArr2[i3].m3800H(j3, zM3800H);
                i3++;
            }
            if (zM3800H) {
                ((SparseArray) this.f6730q.f6406h).clear();
            }
        }
        return j3;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: o */
    public final void mo3770o(long j3) throws Throwable {
        for (C1512q c1512q : this.f6717A) {
            if (c1512q.f6775I && !c1512q.m3795C()) {
                int length = c1512q.f6768B.length;
                for (int i3 = 0; i3 < length; i3++) {
                    c1512q.f6768B[i3].m4467i(j3, c1512q.f6786T[i3]);
                }
            }
        }
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: q */
    public final void mo3771q(InterfaceC1964x interfaceC1964x, long j3) {
        boolean z3;
        List list;
        ArrayList arrayList;
        int i3;
        HashSet hashSet;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        Uri[] uriArr;
        int i6;
        int i7;
        this.f6736w = interfaceC1964x;
        C1531d c1531d = this.f6721h;
        c1531d.getClass();
        c1531d.f6907k.add(this);
        C1540m c1540m = c1531d.f6912p;
        c1540m.getClass();
        Map map = Collections.EMPTY_MAP;
        List list2 = c1540m.f6970e;
        boolean zIsEmpty = list2.isEmpty();
        this.f6737x = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C1498c c1498c = this.f6720g;
        boolean z6 = this.f6732s;
        List list3 = c1540m.f6971f;
        if (zIsEmpty) {
            z3 = z6;
            list = list3;
        } else {
            int size = list2.size();
            int[] iArr = new int[size];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < list2.size()) {
                C0583o c0583o = ((C1539l) list2.get(i8)).f6963b;
                if (c0583o.f2162v <= 0) {
                    String str = c0583o.f2151k;
                    if (AbstractC0632A.m1601t(2, str) != null) {
                        i7 = 2;
                        i6 = 1;
                    } else {
                        i6 = 1;
                        if (AbstractC0632A.m1601t(1, str) != null) {
                            iArr[i8] = 1;
                            i10++;
                        } else {
                            iArr[i8] = -1;
                        }
                    }
                    i8 += i6;
                } else {
                    i6 = 1;
                    i7 = 2;
                }
                iArr[i8] = i7;
                i9 += i6;
                i8 += i6;
            }
            if (i9 > 0) {
                i5 = i9;
                z4 = true;
                z5 = false;
            } else if (i10 < size) {
                i5 = size - i10;
                z4 = false;
                z5 = true;
            } else {
                i5 = size;
                z4 = false;
                z5 = false;
            }
            Uri[] uriArr2 = new Uri[i5];
            C0583o[] c0583oArr = new C0583o[i5];
            int[] iArr2 = new int[i5];
            boolean z7 = z4;
            int i11 = 0;
            int i12 = 0;
            while (i11 < list2.size()) {
                if (z7) {
                    uriArr = uriArr2;
                    if (iArr[i11] == 2) {
                    }
                    i11++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z5 || iArr[i11] != 1) {
                    C1539l c1539l = (C1539l) list2.get(i11);
                    uriArr[i12] = c1539l.f6962a;
                    c0583oArr[i12] = c1539l.f6963b;
                    iArr2[i12] = i11;
                    i12++;
                }
                i11++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = c0583oArr[0].f2151k;
            int iM1600s = AbstractC0632A.m1600s(2, str2);
            int iM1600s2 = AbstractC0632A.m1600s(1, str2);
            boolean z8 = (iM1600s2 == 1 || (iM1600s2 == 0 && list3.isEmpty())) && iM1600s <= 1 && iM1600s2 + iM1600s > 0;
            int i13 = (z7 || iM1600s2 <= 0) ? 0 : 1;
            z3 = z6;
            list = list3;
            C1512q c1512qM3765g = m3765g("main", i13, uriArr3, c0583oArr, c1540m.f6973h, c1540m.f6974i, map, j3);
            arrayList2.add(c1512qM3765g);
            arrayList3.add(iArr2);
            if (z3 && z8) {
                ArrayList arrayList4 = new ArrayList();
                C0583o c0583o2 = c1540m.f6973h;
                if (iM1600s > 0) {
                    C0583o[] c0583oArr2 = new C0583o[i5];
                    int i14 = 0;
                    while (i14 < i5) {
                        C0583o c0583o3 = c0583oArr[i14];
                        String strM1601t = AbstractC0632A.m1601t(2, c0583o3.f2151k);
                        String strM1355c = AbstractC0545H.m1355c(strM1601t);
                        C0582n c0582n = new C0582n();
                        c0582n.f2102a = c0583o3.f2141a;
                        c0582n.f2103b = c0583o3.f2142b;
                        c0582n.f2104c = AbstractC1676G.m4117n(c0583o3.f2143c);
                        c0582n.f2113l = AbstractC0545H.m1364l(c0583o3.f2153m);
                        c0582n.f2114m = AbstractC0545H.m1364l(strM1355c);
                        c0582n.f2111j = strM1601t;
                        c0582n.f2112k = c0583o3.f2152l;
                        c0582n.f2109h = c0583o3.f2148h;
                        c0582n.f2110i = c0583o3.f2149i;
                        c0582n.f2121t = c0583o3.f2161u;
                        c0582n.f2122u = c0583o3.f2162v;
                        c0582n.f2123v = c0583o3.f2163w;
                        c0582n.f2106e = c0583o3.f2145e;
                        c0582n.f2107f = c0583o3.f2146f;
                        c0583oArr2[i14] = new C0583o(c0582n);
                        i14++;
                        c0583oArr = c0583oArr;
                    }
                    C0583o[] c0583oArr3 = c0583oArr;
                    arrayList4.add(new C0559W("main", c0583oArr2));
                    if (iM1600s2 > 0 && (c0583o2 != null || list.isEmpty())) {
                        arrayList4.add(new C0559W("main:audio", m3758k(c0583oArr3[0], c0583o2, false)));
                    }
                    List list4 = c1540m.f6974i;
                    if (list4 != null) {
                        for (int i15 = 0; i15 < list4.size(); i15++) {
                            arrayList4.add(new C0559W(AbstractC0462h.m1165e(i15, "main:cc:"), c1498c.m3741b((C0583o) list4.get(i15))));
                        }
                    }
                } else {
                    C0583o[] c0583oArr4 = new C0583o[i5];
                    for (int i16 = 0; i16 < i5; i16++) {
                        c0583oArr4[i16] = m3758k(c0583oArr[i16], c0583o2, true);
                    }
                    arrayList4.add(new C0559W("main", c0583oArr4));
                }
                C0582n c0582n2 = new C0582n();
                c0582n2.f2102a = "ID3";
                c0582n2.f2114m = AbstractC0545H.m1364l("application/id3");
                C0559W c0559w = new C0559W("main:id3", new C0583o(c0582n2));
                arrayList4.add(c0559w);
                c1512qM3765g.m3798F((C0559W[]) arrayList4.toArray(new C0559W[0]), arrayList4.indexOf(c0559w));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i17 = 0;
        while (i17 < list.size()) {
            List list5 = list;
            String str3 = ((C1538k) list5.get(i17)).f6961c;
            if (hashSet2.add(str3)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                int i18 = 0;
                boolean z9 = true;
                while (i18 < list5.size()) {
                    String str4 = ((C1538k) list5.get(i18)).f6961c;
                    int i19 = AbstractC0632A.f2454a;
                    if (str3.equals(str4)) {
                        C1538k c1538k = (C1538k) list5.get(i18);
                        arrayList7.add(Integer.valueOf(i18));
                        arrayList5.add(c1538k.f6959a);
                        C0583o c0583o4 = c1538k.f6960b;
                        arrayList6.add(c0583o4);
                        i4 = 1;
                        z9 &= AbstractC0632A.m1600s(1, c0583o4.f2151k) == 1;
                    } else {
                        i4 = 1;
                    }
                    i18 += i4;
                }
                String strConcat = "audio:".concat(str3);
                int i20 = AbstractC0632A.f2454a;
                list = list5;
                arrayList = arrayList7;
                i3 = i17;
                hashSet = hashSet2;
                C1512q c1512qM3765g2 = m3765g(strConcat, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (C0583o[]) arrayList6.toArray(new C0583o[0]), null, Collections.EMPTY_LIST, map, j3);
                arrayList3.add(AbstractC1303m.m3287J(arrayList));
                arrayList2.add(c1512qM3765g2);
                if (z3 && z9) {
                    c1512qM3765g2.m3798F(new C0559W[]{new C0559W(strConcat, (C0583o[]) arrayList6.toArray(new C0583o[0]))}, new int[0]);
                }
            } else {
                arrayList = arrayList7;
                hashSet = hashSet2;
                i3 = i17;
                list = list5;
            }
            i17 = i3 + 1;
            arrayList7 = arrayList;
            hashSet2 = hashSet;
        }
        this.f6718B = arrayList2.size();
        int i21 = 0;
        while (true) {
            List list6 = c1540m.f6972g;
            if (i21 >= list6.size()) {
                break;
            }
            C1538k c1538k2 = (C1538k) list6.get(i21);
            String str5 = "subtitle:" + i21 + ":" + c1538k2.f6961c;
            Uri[] uriArr4 = {c1538k2.f6959a};
            C0583o c0583o5 = c1538k2.f6960b;
            int i22 = i21;
            C1512q c1512qM3765g3 = m3765g(str5, 3, uriArr4, new C0583o[]{c0583o5}, null, Collections.EMPTY_LIST, map, j3);
            arrayList3.add(new int[]{i22});
            arrayList2.add(c1512qM3765g3);
            c1512qM3765g3.m3798F(new C0559W[]{new C0559W(str5, c1498c.m3741b(c0583o5))}, new int[0]);
            i21 = i22 + 1;
        }
        this.f6739z = (C1512q[]) arrayList2.toArray(new C1512q[0]);
        this.f6737x = this.f6739z.length;
        for (int i23 = 0; i23 < this.f6718B; i23++) {
            this.f6739z[i23].f6800j.f6681l = true;
        }
        for (C1512q c1512q : this.f6739z) {
            if (!c1512q.f6776J) {
                C0799J c0799j = new C0799J();
                c0799j.f3332a = c1512q.f6788V;
                c1512q.mo3767i(new C0800K(c0799j));
            }
        }
        this.f6717A = this.f6739z;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        return this.f6719C.mo3772r();
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: s */
    public final long mo3773s() {
        return -9223372036854775807L;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
        this.f6719C.mo3774u(j3);
    }
}
