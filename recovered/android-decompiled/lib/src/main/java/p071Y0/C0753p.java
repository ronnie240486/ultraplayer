package p071Y0;

import android.support.v4.media.session.C0858A;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0573f;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0633a;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0684p;
import p067X.C0682n;
import p067X.C0683o;
import p067X.C0687s;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0753p implements InterfaceC0745h {

    /* JADX INFO: renamed from: a */
    public final C0858A f2995a;

    /* JADX INFO: renamed from: b */
    public final boolean f2996b;

    /* JADX INFO: renamed from: c */
    public final boolean f2997c;

    /* JADX INFO: renamed from: g */
    public long f3001g;

    /* JADX INFO: renamed from: i */
    public String f3003i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2226E f3004j;

    /* JADX INFO: renamed from: k */
    public C0752o f3005k;

    /* JADX INFO: renamed from: l */
    public boolean f3006l;

    /* JADX INFO: renamed from: n */
    public boolean f3008n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f3002h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final C0760w f2998d = new C0760w(7);

    /* JADX INFO: renamed from: e */
    public final C0760w f2999e = new C0760w(8);

    /* JADX INFO: renamed from: f */
    public final C0760w f3000f = new C0760w(6);

    /* JADX INFO: renamed from: m */
    public long f3007m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final C0651s f3009o = new C0651s();

    public C0753p(C0858A c0858a, boolean z3, boolean z4) {
        this.f2995a = c0858a;
        this.f2996b = z3;
        this.f2997c = z4;
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x011f  */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX INFO: renamed from: a */
    public final void m1864a(byte[] bArr, int i3, int i4) {
        boolean zM1251h;
        boolean zM1251h2;
        boolean z3;
        boolean z4;
        int iM1256m;
        boolean z5;
        int i5;
        int iM1252i;
        int i6;
        int iM1257n;
        int iM1257n2;
        int i7;
        if (!this.f3006l || this.f3005k.f2978c) {
            this.f2998d.m1867a(bArr, i3, i4);
            this.f2999e.m1867a(bArr, i3, i4);
        }
        this.f3000f.m1867a(bArr, i3, i4);
        C0752o c0752o = this.f3005k;
        if (c0752o.f2986k) {
            int i8 = i4 - i3;
            byte[] bArr2 = c0752o.f2982g;
            int length = bArr2.length;
            int i9 = c0752o.f2983h + i8;
            if (length < i9) {
                c0752o.f2982g = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i3, c0752o.f2982g, c0752o.f2983h, i8);
            int i10 = c0752o.f2983h + i8;
            c0752o.f2983h = i10;
            byte[] bArr3 = c0752o.f2982g;
            C0508g c0508g = c0752o.f2981f;
            c0508g.f1731b = bArr3;
            c0508g.f1733d = 0;
            c0508g.f1732c = i10;
            c0508g.f1734e = 0;
            c0508g.m1244a();
            if (c0508g.m1247d(8)) {
                c0508g.m1262s();
                int iM1252i2 = c0508g.m1252i(2);
                c0508g.m1263t(5);
                if (c0508g.m1248e()) {
                    c0508g.m1256m();
                    if (c0508g.m1248e()) {
                        int iM1256m2 = c0508g.m1256m();
                        if (!c0752o.f2978c) {
                            c0752o.f2986k = false;
                            C0751n c0751n = c0752o.f2989n;
                            c0751n.f2964e = iM1256m2;
                            c0751n.f2961b = true;
                            return;
                        }
                        if (c0508g.m1248e()) {
                            int iM1256m3 = c0508g.m1256m();
                            SparseArray sparseArray = c0752o.f2980e;
                            if (sparseArray.indexOfKey(iM1256m3) < 0) {
                                c0752o.f2986k = false;
                                return;
                            }
                            C0682n c0682n = (C0682n) sparseArray.get(iM1256m3);
                            C0683o c0683o = (C0683o) c0752o.f2979d.get(c0682n.f2608a);
                            if (c0683o.f2619j) {
                                if (!c0508g.m1247d(2)) {
                                    return;
                                } else {
                                    c0508g.m1263t(2);
                                }
                            }
                            int i11 = c0683o.f2621l;
                            if (c0508g.m1247d(i11)) {
                                int iM1252i3 = c0508g.m1252i(i11);
                                if (!c0683o.f2620k) {
                                    if (c0508g.m1247d(1)) {
                                        zM1251h = c0508g.m1251h();
                                        if (zM1251h) {
                                            if (!c0508g.m1247d(1)) {
                                                return;
                                            }
                                            zM1251h2 = c0508g.m1251h();
                                            z3 = true;
                                        }
                                        if (c0752o.f2984i == 5) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            iM1256m = 0;
                                        } else if (!c0508g.m1248e()) {
                                            return;
                                        } else {
                                            iM1256m = c0508g.m1256m();
                                        }
                                        z5 = c0682n.f2609b;
                                        i5 = c0683o.f2622m;
                                        if (i5 == 0) {
                                            i7 = c0683o.f2623n;
                                            if (!c0508g.m1247d(i7)) {
                                                return;
                                            }
                                            iM1252i = c0508g.m1252i(i7);
                                            if (z5 || zM1251h) {
                                                i6 = 0;
                                                iM1257n = 0;
                                                iM1257n2 = 0;
                                            } else {
                                                if (!c0508g.m1248e()) {
                                                    return;
                                                }
                                                iM1257n2 = c0508g.m1257n();
                                                i6 = 0;
                                                iM1257n = 0;
                                            }
                                        } else if (i5 == 1 || c0683o.f2624o) {
                                            iM1252i = 0;
                                            i6 = 0;
                                            iM1257n = 0;
                                            iM1257n2 = 0;
                                        } else {
                                            if (!c0508g.m1248e()) {
                                                return;
                                            }
                                            int iM1257n3 = c0508g.m1257n();
                                            if (!z5 || zM1251h) {
                                                i6 = iM1257n3;
                                                iM1252i = 0;
                                                iM1257n = 0;
                                                iM1257n2 = 0;
                                            } else {
                                                if (!c0508g.m1248e()) {
                                                    return;
                                                }
                                                iM1257n = c0508g.m1257n();
                                                iM1257n2 = 0;
                                                i6 = iM1257n3;
                                                iM1252i = 0;
                                            }
                                        }
                                        C0751n c0751n2 = c0752o.f2989n;
                                        c0751n2.f2962c = c0683o;
                                        c0751n2.f2963d = iM1252i2;
                                        c0751n2.f2964e = iM1256m2;
                                        c0751n2.f2965f = iM1252i3;
                                        c0751n2.f2966g = iM1256m3;
                                        c0751n2.f2967h = zM1251h;
                                        c0751n2.f2968i = z3;
                                        c0751n2.f2969j = zM1251h2;
                                        c0751n2.f2970k = z4;
                                        c0751n2.f2971l = iM1256m;
                                        c0751n2.f2972m = iM1252i;
                                        c0751n2.f2973n = iM1257n2;
                                        c0751n2.f2974o = i6;
                                        c0751n2.f2975p = iM1257n;
                                        c0751n2.f2960a = true;
                                        c0751n2.f2961b = true;
                                        c0752o.f2986k = false;
                                    }
                                    return;
                                }
                                zM1251h = false;
                                zM1251h2 = false;
                                z3 = false;
                                if (c0752o.f2984i == 5) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    iM1256m = 0;
                                } else if (!c0508g.m1248e()) {
                                    return;
                                } else {
                                    iM1256m = c0508g.m1256m();
                                }
                                z5 = c0682n.f2609b;
                                i5 = c0683o.f2622m;
                                if (i5 == 0) {
                                    i7 = c0683o.f2623n;
                                    if (!c0508g.m1247d(i7)) {
                                        return;
                                    }
                                    iM1252i = c0508g.m1252i(i7);
                                    if (z5) {
                                    }
                                    i6 = 0;
                                    iM1257n = 0;
                                    iM1257n2 = 0;
                                } else {
                                    if (i5 == 1) {
                                    }
                                    iM1252i = 0;
                                    i6 = 0;
                                    iM1257n = 0;
                                    iM1257n2 = 0;
                                }
                                C0751n c0751n3 = c0752o.f2989n;
                                c0751n3.f2962c = c0683o;
                                c0751n3.f2963d = iM1252i2;
                                c0751n3.f2964e = iM1256m2;
                                c0751n3.f2965f = iM1252i3;
                                c0751n3.f2966g = iM1256m3;
                                c0751n3.f2967h = zM1251h;
                                c0751n3.f2968i = z3;
                                c0751n3.f2969j = zM1251h2;
                                c0751n3.f2970k = z4;
                                c0751n3.f2971l = iM1256m;
                                c0751n3.f2972m = iM1252i;
                                c0751n3.f2973n = iM1257n2;
                                c0751n3.f2974o = i6;
                                c0751n3.f2975p = iM1257n;
                                c0751n3.f2960a = true;
                                c0751n3.f2961b = true;
                                c0752o.f2986k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        this.f3001g = 0L;
        this.f3008n = false;
        this.f3007m = -9223372036854775807L;
        AbstractC0684p.m1788a(this.f3002h);
        this.f2998d.m1873g();
        this.f2999e.m1873g();
        this.f3000f.m1873g();
        ((C0687s) this.f2995a.f3641j).m1801c(0);
        C0752o c0752o = this.f3005k;
        if (c0752o != null) {
            c0752o.f2986k = false;
            c0752o.f2990o = false;
            C0751n c0751n = c0752o.f2989n;
            c0751n.f2961b = false;
            c0751n.f2960a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) {
        boolean z3;
        long j3;
        int i3;
        long j4;
        int i4;
        int i5;
        boolean z4;
        AbstractC0646n.m1631i(this.f3004j);
        int i6 = AbstractC0632A.f2454a;
        int i7 = c0651s.f2521b;
        int i8 = c0651s.f2522c;
        byte[] bArr = c0651s.f2520a;
        this.f3001g += (long) c0651s.m1667a();
        this.f3004j.mo1173b(c0651s.m1667a(), c0651s);
        while (true) {
            int iM1789b = AbstractC0684p.m1789b(bArr, i7, i8, this.f3002h);
            if (iM1789b == i8) {
                m1864a(bArr, i7, i8);
                return;
            }
            int i9 = iM1789b + 3;
            int i10 = bArr[i9] & 31;
            int i11 = iM1789b - i7;
            if (i11 > 0) {
                m1864a(bArr, i7, iM1789b);
            }
            int i12 = i8 - iM1789b;
            long j5 = this.f3001g - ((long) i12);
            int i13 = i11 < 0 ? -i11 : 0;
            long j6 = this.f3007m;
            boolean z5 = this.f3006l;
            C0858A c0858a = this.f2995a;
            C0760w c0760w = this.f2999e;
            C0760w c0760w2 = this.f2998d;
            C0687s c0687s = (C0687s) c0858a.f3641j;
            if (!z5 || this.f3005k.f2978c) {
                c0760w2.m1871e(i13);
                c0760w.m1871e(i13);
                if (this.f3006l) {
                    i12 = i12;
                    i8 = i8;
                    bArr = bArr;
                    i9 = i9;
                    j5 = j5;
                    if (c0760w2.f3099d) {
                        C0683o c0683oM1796i = AbstractC0684p.m1796i((byte[]) c0760w2.f3101f, 3, c0760w2.f3100e);
                        c0687s.getClass();
                        int i14 = c0683oM1796i.f2628s;
                        AbstractC0646n.m1630h(i14 >= 0);
                        c0687s.f2635a = i14;
                        c0687s.m1801c(i14);
                        this.f3005k.f2979d.append(c0683oM1796i.f2613d, c0683oM1796i);
                        c0760w2.m1873g();
                    } else if (c0760w.f3099d) {
                        C0508g c0508g = new C0508g((byte[]) c0760w.f3101f, 4, c0760w.f3100e);
                        int iM1256m = c0508g.m1256m();
                        int iM1256m2 = c0508g.m1256m();
                        c0508g.m1262s();
                        this.f3005k.f2980e.append(iM1256m, new C0682n(iM1256m, iM1256m2, c0508g.m1251h()));
                        c0760w.m1873g();
                    }
                } else if (c0760w2.f3099d && c0760w.f3099d) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) c0760w2.f3101f, c0760w2.f3100e));
                    arrayList.add(Arrays.copyOf((byte[]) c0760w.f3101f, c0760w.f3100e));
                    C0683o c0683oM1796i2 = AbstractC0684p.m1796i((byte[]) c0760w2.f3101f, 3, c0760w2.f3100e);
                    C0508g c0508g2 = new C0508g((byte[]) c0760w.f3101f, 4, c0760w.f3100e);
                    int iM1256m3 = c0508g2.m1256m();
                    int iM1256m4 = c0508g2.m1256m();
                    c0508g2.m1262s();
                    C0682n c0682n = new C0682n(iM1256m3, iM1256m4, c0508g2.m1251h());
                    byte[] bArr2 = AbstractC0633a.f2468a;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c0683oM1796i2.f2610a), Integer.valueOf(c0683oM1796i2.f2611b), Integer.valueOf(c0683oM1796i2.f2612c));
                    InterfaceC2226E interfaceC2226E = this.f3004j;
                    C0582n c0582n = new C0582n();
                    c0582n.f2102a = this.f3003i;
                    c0582n.f2114m = AbstractC0545H.m1364l("video/avc");
                    c0582n.f2111j = str;
                    c0582n.f2121t = c0683oM1796i2.f2614e;
                    c0582n.f2122u = c0683oM1796i2.f2615f;
                    c0582n.f2091A = new C0573f(c0683oM1796i2.f2625p, c0683oM1796i2.f2626q, c0683oM1796i2.f2627r, c0683oM1796i2.f2617h + 8, c0683oM1796i2.f2618i + 8, null);
                    c0582n.f2125x = c0683oM1796i2.f2616g;
                    c0582n.f2117p = arrayList;
                    int i15 = c0683oM1796i2.f2628s;
                    c0582n.f2116o = i15;
                    interfaceC2226E.mo1176e(new C0583o(c0582n));
                    this.f3006l = true;
                    c0687s.getClass();
                    AbstractC0646n.m1630h(i15 >= 0);
                    c0687s.f2635a = i15;
                    c0687s.m1801c(i15);
                    this.f3005k.f2979d.append(c0683oM1796i2.f2613d, c0683oM1796i2);
                    this.f3005k.f2980e.append(iM1256m3, c0682n);
                    c0760w2.m1873g();
                    c0760w.m1873g();
                }
            }
            C0760w c0760w3 = this.f3000f;
            if (c0760w3.m1871e(i13)) {
                int iM1798k = AbstractC0684p.m1798k((byte[]) c0760w3.f3101f, c0760w3.f3100e);
                byte[] bArr3 = (byte[]) c0760w3.f3101f;
                C0651s c0651s2 = this.f3009o;
                c0651s2.m1663E(bArr3, iM1798k);
                c0651s2.m1665G(4);
                c0687s.m1799a(j6, c0651s2);
            }
            C0752o c0752o = this.f3005k;
            boolean z6 = this.f3006l;
            if (c0752o.f2984i == 9) {
                if (z6 && c0752o.f2990o) {
                    j3 = c0752o.f2985j;
                    i3 = i12 + ((int) (j5 - j3));
                    j4 = c0752o.f2992q;
                    if (j4 != -9223372036854775807L) {
                        c0752o.f2976a.mo1172a(j4, c0752o.f2993r ? 1 : 0, (int) (j3 - c0752o.f2991p), i3, null);
                    }
                }
                c0752o.f2991p = c0752o.f2985j;
                c0752o.f2992q = c0752o.f2987l;
                z3 = false;
                c0752o.f2993r = false;
                c0752o.f2990o = true;
            } else {
                if (c0752o.f2978c) {
                    C0751n c0751n = c0752o.f2989n;
                    C0751n c0751n2 = c0752o.f2988m;
                    if (c0751n.f2960a) {
                        if (c0751n2.f2960a) {
                            C0683o c0683o = c0751n.f2962c;
                            AbstractC0646n.m1631i(c0683o);
                            C0683o c0683o2 = c0751n2.f2962c;
                            AbstractC0646n.m1631i(c0683o2);
                            if (c0751n.f2965f == c0751n2.f2965f && c0751n.f2966g == c0751n2.f2966g && c0751n.f2967h == c0751n2.f2967h && ((!c0751n.f2968i || !c0751n2.f2968i || c0751n.f2969j == c0751n2.f2969j) && ((i4 = c0751n.f2963d) == (i5 = c0751n2.f2963d) || (i4 != 0 && i5 != 0)))) {
                                int i16 = c0683o2.f2622m;
                                int i17 = c0683o.f2622m;
                                if ((i17 != 0 || i16 != 0 || (c0751n.f2972m == c0751n2.f2972m && c0751n.f2973n == c0751n2.f2973n)) && ((i17 != 1 || i16 != 1 || (c0751n.f2974o == c0751n2.f2974o && c0751n.f2975p == c0751n2.f2975p)) && (z4 = c0751n.f2970k) == c0751n2.f2970k && (!z4 || c0751n.f2971l == c0751n2.f2971l))) {
                                }
                            }
                        }
                        if (z6) {
                            j3 = c0752o.f2985j;
                            i3 = i12 + ((int) (j5 - j3));
                            j4 = c0752o.f2992q;
                            if (j4 != -9223372036854775807L) {
                                c0752o.f2976a.mo1172a(j4, c0752o.f2993r ? 1 : 0, (int) (j3 - c0752o.f2991p), i3, null);
                            }
                        }
                        c0752o.f2991p = c0752o.f2985j;
                        c0752o.f2992q = c0752o.f2987l;
                        z3 = false;
                        c0752o.f2993r = false;
                        c0752o.f2990o = true;
                    }
                }
                z3 = false;
            }
            c0752o.m1863a();
            if (c0752o.f2993r) {
                this.f3008n = z3;
            }
            long j7 = this.f3007m;
            if (!this.f3006l || this.f3005k.f2978c) {
                c0760w2.m1874h(i10);
                c0760w.m1874h(i10);
            }
            c0760w3.m1874h(i10);
            C0752o c0752o2 = this.f3005k;
            boolean z7 = this.f3008n;
            c0752o2.f2984i = i10;
            c0752o2.f2987l = j7;
            c0752o2.f2985j = j5;
            c0752o2.f2994s = z7;
            if (c0752o2.f2977b && i10 == 1) {
                C0751n c0751n3 = c0752o2.f2988m;
                c0752o2.f2988m = c0752o2.f2989n;
                c0752o2.f2989n = c0751n3;
                c0751n3.f2961b = false;
                c0751n3.f2960a = false;
                c0752o2.f2983h = 0;
                c0752o2.f2986k = true;
            } else if (c0752o2.f2978c) {
                if (i10 != 5 && i10 != 1) {
                    if (i10 == 2) {
                    }
                }
                C0751n c0751n4 = c0752o2.f2988m;
                c0752o2.f2988m = c0752o2.f2989n;
                c0752o2.f2989n = c0751n4;
                c0751n4.f2961b = false;
                c0751n4.f2960a = false;
                c0752o2.f2983h = 0;
                c0752o2.f2986k = true;
            }
            i8 = i8;
            bArr = bArr;
            i7 = i9;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
        AbstractC0646n.m1631i(this.f3004j);
        int i3 = AbstractC0632A.f2454a;
        if (z3) {
            ((C0687s) this.f2995a.f3641j).m1801c(0);
            C0752o c0752o = this.f3005k;
            long j3 = this.f3001g;
            c0752o.m1863a();
            c0752o.f2985j = j3;
            long j4 = c0752o.f2992q;
            if (j4 != -9223372036854775807L) {
                boolean z4 = c0752o.f2993r;
                c0752o.f2976a.mo1172a(j4, z4 ? 1 : 0, (int) (j3 - c0752o.f2991p), 0, null);
            }
            c0752o.f2990o = false;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f3003i = c0736g.f2836e;
        c0736g.m1849b();
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 2);
        this.f3004j = interfaceC2226EMo344p;
        this.f3005k = new C0752o(interfaceC2226EMo344p, this.f2996b, this.f2997c);
        this.f2995a.m2180t(interfaceC2242o, c0736g);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f3007m = j3;
        this.f3008n = ((i3 & 2) != 0) | this.f3008n;
    }
}
