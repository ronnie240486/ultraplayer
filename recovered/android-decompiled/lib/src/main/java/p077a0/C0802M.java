package p077a0;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p011E.C0111d;
import p045P0.AbstractC0462h;
import p048Q0.C0505d;
import p055T.AbstractC0558V;
import p055T.C0559W;
import p055T.C0560X;
import p055T.C0561Y;
import p055T.C0566b0;
import p055T.C0568c0;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p067X.C0687s;
import p082b0.C1061b;
import p085c0.ExecutorC1148x;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.AbstractC1731y;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1687S;
import p105h2.C1688T;
import p105h2.C1690V;
import p105h2.C1692X;
import p105h2.C1720n;
import p114k0.C1907A;
import p114k0.C1938d;
import p114k0.C1945g0;
import p114k0.InterfaceC1931Z;
import p114k0.InterfaceC1965y;
import p125n0.AbstractC2044u;
import p125n0.C2024a;
import p125n0.C2025b;
import p125n0.C2031h;
import p125n0.C2033j;
import p125n0.C2034k;
import p125n0.C2035l;
import p125n0.C2040q;
import p125n0.C2041r;
import p125n0.C2043t;
import p125n0.C2045v;
import p125n0.InterfaceC2037n;
import p125n0.InterfaceC2042s;
import p129o0.C2065e;
import p129o0.InterfaceC2064d;

/* JADX INFO: renamed from: a0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0802M {

    /* JADX INFO: renamed from: a */
    public final Object f3338a;

    /* JADX INFO: renamed from: b */
    public final Object f3339b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1931Z[] f3340c;

    /* JADX INFO: renamed from: d */
    public boolean f3341d;

    /* JADX INFO: renamed from: e */
    public boolean f3342e;

    /* JADX INFO: renamed from: f */
    public boolean f3343f;

    /* JADX INFO: renamed from: g */
    public C0803N f3344g;

    /* JADX INFO: renamed from: h */
    public boolean f3345h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f3346i;

    /* JADX INFO: renamed from: j */
    public final AbstractC0827g[] f3347j;

    /* JADX INFO: renamed from: k */
    public final AbstractC2044u f3348k;

    /* JADX INFO: renamed from: l */
    public final C0816a0 f3349l;

    /* JADX INFO: renamed from: m */
    public C0802M f3350m;

    /* JADX INFO: renamed from: n */
    public C1945g0 f3351n;

    /* JADX INFO: renamed from: o */
    public C2045v f3352o;

    /* JADX INFO: renamed from: p */
    public long f3353p;

    public C0802M(AbstractC0827g[] abstractC0827gArr, long j3, AbstractC2044u abstractC2044u, C2065e c2065e, C0816a0 c0816a0, C0803N c0803n, C2045v c2045v) {
        this.f3347j = abstractC0827gArr;
        this.f3353p = j3;
        this.f3348k = abstractC2044u;
        this.f3349l = c0816a0;
        C1907A c1907a = c0803n.f3354a;
        this.f3339b = c1907a.f8311a;
        this.f3344g = c0803n;
        this.f3351n = C1945g0.f8525d;
        this.f3352o = c2045v;
        this.f3340c = new InterfaceC1931Z[abstractC0827gArr.length];
        this.f3346i = new boolean[abstractC0827gArr.length];
        c0816a0.getClass();
        int i3 = C0828g0.f3494k;
        Pair pair = (Pair) c1907a.f8311a;
        Object obj = pair.first;
        C1907A c1907aM4421a = c1907a.m4421a(pair.second);
        C0814Z c0814z = (C0814Z) c0816a0.f3418d.get(obj);
        c0814z.getClass();
        c0816a0.f3421g.add(c0814z);
        C0813Y c0813y = (C0813Y) c0816a0.f3420f.get(c0814z);
        if (c0813y != null) {
            c0813y.f3404a.m4486d(c0813y.f3405b);
        }
        c0814z.f3409c.add(c1907aM4421a);
        InterfaceC1965y interfaceC1965yMo3776a = c0814z.f3407a.mo3776a(c1907aM4421a, c2065e, c0803n.f3355b);
        c0816a0.f3417c.put(interfaceC1965yMo3776a, c0814z);
        c0816a0.m2049c();
        long j4 = c0803n.f3357d;
        this.f3338a = j4 != -9223372036854775807L ? new C1938d(interfaceC1965yMo3776a, true, 0L, j4) : interfaceC1965yMo3776a;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, k0.y] */
    /* JADX INFO: renamed from: a */
    public final long m2004a(C2045v c2045v, long j3, boolean z3, boolean[] zArr) {
        AbstractC0827g[] abstractC0827gArr;
        InterfaceC1931Z[] interfaceC1931ZArr;
        int i3 = 0;
        while (true) {
            boolean z4 = true;
            if (i3 >= c2045v.f8912a) {
                break;
            }
            if (z3 || !c2045v.m4618a(this.f3352o, i3)) {
                z4 = false;
            }
            this.f3346i[i3] = z4;
            i3++;
        }
        int i4 = 0;
        while (true) {
            abstractC0827gArr = this.f3347j;
            int length = abstractC0827gArr.length;
            interfaceC1931ZArr = this.f3340c;
            if (i4 >= length) {
                break;
            }
            if (abstractC0827gArr[i4].f3478h == -2) {
                interfaceC1931ZArr[i4] = null;
            }
            i4++;
        }
        m2005b();
        this.f3352o = c2045v;
        m2006c();
        long jMo3764f = this.f3338a.mo3764f(c2045v.f8914c, this.f3346i, this.f3340c, zArr, j3);
        for (int i5 = 0; i5 < abstractC0827gArr.length; i5++) {
            if (abstractC0827gArr[i5].f3478h == -2 && this.f3352o.m4619b(i5)) {
                interfaceC1931ZArr[i5] = new C1528a(9);
            }
        }
        this.f3343f = false;
        for (int i6 = 0; i6 < interfaceC1931ZArr.length; i6++) {
            if (interfaceC1931ZArr[i6] != null) {
                AbstractC0646n.m1630h(c2045v.m4619b(i6));
                if (abstractC0827gArr[i6].f3478h != -2) {
                    this.f3343f = true;
                }
            } else {
                AbstractC0646n.m1630h(c2045v.f8914c[i6] == null);
            }
        }
        return jMo3764f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2005b() {
        if (this.f3350m != null) {
            return;
        }
        int i3 = 0;
        while (true) {
            C2045v c2045v = this.f3352o;
            if (i3 >= c2045v.f8912a) {
                return;
            }
            boolean zM4619b = c2045v.m4619b(i3);
            InterfaceC2042s interfaceC2042s = this.f3352o.f8914c[i3];
            if (zM4619b && interfaceC2042s != null) {
                interfaceC2042s.mo4435q();
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2006c() {
        if (this.f3350m != null) {
            return;
        }
        int i3 = 0;
        while (true) {
            C2045v c2045v = this.f3352o;
            if (i3 >= c2045v.f8912a) {
                return;
            }
            boolean zM4619b = c2045v.m4619b(i3);
            InterfaceC2042s interfaceC2042s = this.f3352o.f8914c[i3];
            if (zM4619b && interfaceC2042s != null) {
                interfaceC2042s.mo4430k();
            }
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k0.b0] */
    /* JADX INFO: renamed from: d */
    public final long m2007d() {
        if (!this.f3342e) {
            return this.f3344g.f3355b;
        }
        long jMo3766h = this.f3343f ? this.f3338a.mo3766h() : Long.MIN_VALUE;
        return jMo3766h == Long.MIN_VALUE ? this.f3344g.f3358e : jMo3766h;
    }

    /* JADX INFO: renamed from: e */
    public final long m2008e() {
        return this.f3344g.f3355b + this.f3353p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k0.y] */
    /* JADX INFO: renamed from: f */
    public final void m2009f(float f, AbstractC0558V abstractC0558V, boolean z3) {
        this.f3342e = true;
        this.f3351n = this.f3338a.mo3762d();
        C2045v c2045vM2013j = m2013j(f, abstractC0558V, z3);
        C0803N c0803n = this.f3344g;
        long jMax = c0803n.f3355b;
        long j3 = c0803n.f3358e;
        if (j3 != -9223372036854775807L && jMax >= j3) {
            jMax = Math.max(0L, j3 - 1);
        }
        long jM2004a = m2004a(c2045vM2013j, jMax, false, new boolean[this.f3347j.length]);
        long j4 = this.f3353p;
        C0803N c0803n2 = this.f3344g;
        this.f3353p = (c0803n2.f3355b - jM2004a) + j4;
        this.f3344g = c0803n2.m2016b(jM2004a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k0.b0] */
    /* JADX INFO: renamed from: g */
    public final boolean m2010g() {
        if (this.f3342e) {
            return !this.f3343f || this.f3338a.mo3766h() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2011h() {
        if (this.f3342e) {
            return m2010g() || m2007d() - this.f3344g.f3355b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k0.y] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final void m2012i() {
        m2005b();
        ?? r3 = this.f3338a;
        try {
            boolean z3 = r3 instanceof C1938d;
            C0816a0 c0816a0 = this.f3349l;
            if (z3) {
                c0816a0.m2052f(((C1938d) r3).f8488g);
            } else {
                c0816a0.m2052f(r3);
            }
        } catch (RuntimeException e3) {
            AbstractC0646n.m1636n("MediaPeriodHolder", "Period release failed.", e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0359  */
    /* JADX INFO: renamed from: j */
    public final C2045v m2013j(float f, AbstractC0558V abstractC0558V, boolean z3) {
        final C2033j c2033j;
        Pair pairM4611i;
        C1945g0[] c1945g0Arr;
        int[] iArr;
        final boolean z4;
        String str;
        C1945g0[] c1945g0Arr2;
        boolean z5;
        C1692X c1692xM4120r;
        InterfaceC2042s c2025b;
        int i3;
        int[] iArr2;
        Object obj;
        C2041r c2041r;
        int[][][] iArr3;
        int i4;
        C1945g0[] c1945g0Arr3;
        C0559W c0559w;
        C1945g0[] c1945g0Arr4;
        C2035l c2035l;
        int[] iArr4;
        AbstractC2044u abstractC2044u = this.f3348k;
        AbstractC0827g[] abstractC0827gArr = this.f3347j;
        C1945g0 c1945g0 = this.f3351n;
        abstractC2044u.getClass();
        int[] iArr5 = new int[abstractC0827gArr.length + 1];
        int length = abstractC0827gArr.length + 1;
        C0559W[][] c0559wArr = new C0559W[length][];
        int[][][] iArr6 = new int[abstractC0827gArr.length + 1][][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = c1945g0.f8526a;
            c0559wArr[i5] = new C0559W[i6];
            iArr6[i5] = new int[i6][];
        }
        Object obj2 = null;
        int length2 = abstractC0827gArr.length;
        final int[] iArr7 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr7[i7] = abstractC0827gArr[i7].mo2078A();
        }
        int i8 = 0;
        while (i8 < c1945g0.f8526a) {
            C0559W c0559wM4499a = c1945g0.m4499a(i8);
            boolean z6 = c0559wM4499a.f1994c == 5;
            int length3 = abstractC0827gArr.length;
            int i9 = 0;
            int i10 = 0;
            boolean z7 = true;
            while (i10 < abstractC0827gArr.length) {
                AbstractC0827g abstractC0827g = abstractC0827gArr[i10];
                int i11 = i8;
                boolean z8 = z6;
                int iMax = 0;
                for (int i12 = 0; i12 < c0559wM4499a.f1992a; i12++) {
                    iMax = Math.max(iMax, abstractC0827g.mo2099z(c0559wM4499a.f1995d[i12]) & 7);
                }
                boolean z9 = iArr5[i10] == 0;
                if (iMax > i9 || (iMax == i9 && z8 && !z7 && z9)) {
                    i9 = iMax;
                    z7 = z9;
                    length3 = i10;
                }
                i10++;
                i8 = i11;
                z6 = z8;
            }
            int i13 = i8;
            if (length3 == abstractC0827gArr.length) {
                iArr4 = new int[c0559wM4499a.f1992a];
            } else {
                AbstractC0827g abstractC0827g2 = abstractC0827gArr[length3];
                int[] iArr8 = new int[c0559wM4499a.f1992a];
                for (int i14 = 0; i14 < c0559wM4499a.f1992a; i14++) {
                    iArr8[i14] = abstractC0827g2.mo2099z(c0559wM4499a.f1995d[i14]);
                }
                iArr4 = iArr8;
            }
            int i15 = iArr5[length3];
            c0559wArr[length3][i15] = c0559wM4499a;
            iArr6[length3][i15] = iArr4;
            iArr5[length3] = i15 + 1;
            i8 = i13 + 1;
        }
        C1945g0[] c1945g0Arr5 = new C1945g0[abstractC0827gArr.length];
        String[] strArr = new String[abstractC0827gArr.length];
        int[] iArr9 = new int[abstractC0827gArr.length];
        for (int i16 = 0; i16 < abstractC0827gArr.length; i16++) {
            int i17 = iArr5[i16];
            c1945g0Arr5[i16] = new C1945g0((C0559W[]) AbstractC0632A.m1573N(i17, c0559wArr[i16]));
            iArr6[i16] = (int[][]) AbstractC0632A.m1573N(i17, iArr6[i16]);
            strArr[i16] = abstractC0827gArr[i16].mo2082i();
            iArr9[i16] = abstractC0827gArr[i16].f3478h;
        }
        C0687s c0687s = new C0687s(iArr9, c1945g0Arr5, iArr7, iArr6, new C1945g0((C0559W[]) AbstractC0632A.m1573N(iArr5[abstractC0827gArr.length], c0559wArr[abstractC0827gArr.length])));
        int[][][] iArr10 = iArr6;
        final C2040q c2040q = (C2040q) abstractC2044u;
        synchronized (c2040q.f8901c) {
            try {
                c2033j = c2040q.f8905g;
                if (c2033j.f8864x && AbstractC0632A.f2454a >= 32 && (c2035l = c2040q.f8906h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    AbstractC0646n.m1631i(looperMyLooper);
                    if (((C2034k) c2035l.f8871d) == null && ((Handler) c2035l.f8870c) == null) {
                        c2035l.f8871d = new C2034k(c2040q);
                        Handler handler = new Handler(looperMyLooper);
                        c2035l.f8870c = handler;
                        ((Spatializer) c2035l.f8869b).addOnSpatializerStateChangedListener(new ExecutorC1148x(handler, 0), (C2034k) c2035l.f8871d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i18 = c0687s.f2635a;
        C2041r[] c2041rArr = new C2041r[i18];
        c2033j.f2037m.getClass();
        Pair pairM4611i2 = C2040q.m4611i(2, c0687s, iArr10, new C1061b(c2033j, 3, iArr7), new C0505d(9));
        C0561Y c0561y = c2033j.f2037m;
        if (pairM4611i2 == null) {
            c0561y.getClass();
            pairM4611i = C2040q.m4611i(4, c0687s, iArr10, new C0111d(21, c2033j), new C0505d(7));
        } else {
            pairM4611i = null;
        }
        if (pairM4611i != null) {
            c2041rArr[((Integer) pairM4611i.second).intValue()] = (C2041r) pairM4611i.first;
        } else if (pairM4611i2 != null) {
            c2041rArr[((Integer) pairM4611i2.second).intValue()] = (C2041r) pairM4611i2.first;
        }
        int i19 = 0;
        while (true) {
            c1945g0Arr = (C1945g0[]) c0687s.f2637c;
            iArr = (int[]) c0687s.f2636b;
            if (i19 >= c0687s.f2635a) {
                z4 = false;
                break;
            }
            if (2 == iArr[i19] && c1945g0Arr[i19].f8526a > 0) {
                z4 = true;
                break;
            }
            i19++;
        }
        Pair pairM4611i3 = C2040q.m4611i(1, c0687s, iArr10, new InterfaceC2037n() { // from class: n0.d
            @Override // p125n0.InterfaceC2037n
            /* JADX INFO: renamed from: f */
            public final C1692X mo549f(int i20, C0559W c0559w2, int[] iArr11) {
                C2040q c2040q2 = c2040q;
                c2040q2.getClass();
                C2028e c2028e = new C2028e(c2040q2);
                int i21 = iArr7[i20];
                C1673D c1673dM4116m = AbstractC1676G.m4116m();
                int i22 = 0;
                while (i22 < c0559w2.f1992a) {
                    int i23 = i20;
                    C0559W c0559w3 = c0559w2;
                    c1673dM4116m.m4102a(new C2029f(i23, c0559w3, i22, c2033j, iArr11[i22], z4, c2028e, i21));
                    i22++;
                    i20 = i23;
                    c0559w2 = c0559w3;
                }
                return c1673dM4116m.m4112f();
            }
        }, new C0505d(8));
        if (pairM4611i3 != null) {
            c2041rArr[((Integer) pairM4611i3.second).intValue()] = (C2041r) pairM4611i3.first;
        }
        if (pairM4611i3 == null) {
            str = null;
        } else {
            C2041r c2041r2 = (C2041r) pairM4611i3.first;
            str = c2041r2.f8908a.f1995d[c2041r2.f8909b[0]].f2144d;
        }
        c0561y.getClass();
        Pair pairM4611i4 = C2040q.m4611i(3, c0687s, iArr10, new C1061b(c2033j, 4, str), new C0505d(10));
        if (pairM4611i4 != null) {
            c2041rArr[((Integer) pairM4611i4.second).intValue()] = (C2041r) pairM4611i4.first;
        }
        int i20 = 0;
        while (i20 < i18) {
            int i21 = iArr[i20];
            if (i21 == 2 || i21 == 1 || i21 == 3 || i21 == 4) {
                iArr3 = iArr10;
                i4 = i20;
                c1945g0Arr3 = c1945g0Arr;
            } else {
                C1945g0 c1945g1 = c1945g0Arr[i20];
                int[][] iArr11 = iArr10[i20];
                C0559W c0559w2 = null;
                C2031h c2031h = null;
                int i22 = 0;
                int i23 = 0;
                while (i22 < c1945g1.f8526a) {
                    C0559W c0559wM4499a2 = c1945g1.m4499a(i22);
                    int[] iArr12 = iArr11[i22];
                    int[][][] iArr13 = iArr10;
                    C1945g0 c1945g2 = c1945g1;
                    C2031h c2031h2 = c2031h;
                    int i24 = i20;
                    int i25 = 0;
                    while (i25 < c0559wM4499a2.f1992a) {
                        int i26 = i25;
                        if (AbstractC0462h.m1163c(iArr12[i25], c2033j.f8865y)) {
                            c0559w = c0559wM4499a2;
                            C2031h c2031h3 = new C2031h(c0559wM4499a2.f1995d[i26], iArr12[i26]);
                            if (c2031h2 != null) {
                                c1945g0Arr4 = c1945g0Arr;
                                if (AbstractC1731y.f7720a.mo4184c(c2031h3.f8847h, c2031h2.f8847h).mo4184c(c2031h3.f8846g, c2031h2.f8846g).mo4186e() > 0) {
                                }
                            } else {
                                c1945g0Arr4 = c1945g0Arr;
                            }
                            c2031h2 = c2031h3;
                            i23 = i26;
                            c0559w2 = c0559w;
                        } else {
                            c0559w = c0559wM4499a2;
                            c1945g0Arr4 = c1945g0Arr;
                        }
                        i25 = i26 + 1;
                        c0559wM4499a2 = c0559w;
                        c1945g0Arr = c1945g0Arr4;
                    }
                    i22++;
                    i20 = i24;
                    c1945g1 = c1945g2;
                    c2031h = c2031h2;
                    iArr10 = iArr13;
                }
                iArr3 = iArr10;
                i4 = i20;
                c1945g0Arr3 = c1945g0Arr;
                c2041rArr[i4] = c0559w2 == null ? null : new C2041r(c0559w2, new int[]{i23});
            }
            i20 = i4 + 1;
            iArr10 = iArr3;
            c1945g0Arr = c1945g0Arr3;
        }
        int i27 = c0687s.f2635a;
        HashMap map = new HashMap();
        int i28 = 0;
        while (true) {
            c1945g0Arr2 = (C1945g0[]) c0687s.f2637c;
            if (i28 >= i27) {
                break;
            }
            C2040q.m4608c(c1945g0Arr2[i28], c2033j, map);
            i28++;
        }
        C2040q.m4608c((C1945g0) c0687s.f2640f, c2033j, map);
        for (int i29 = 0; i29 < i27; i29++) {
            C0560X c0560x = (C0560X) map.get(Integer.valueOf(((int[]) c0687s.f2636b)[i29]));
            if (c0560x != null) {
                AbstractC1676G abstractC1676G = c0560x.f1998b;
                if (abstractC1676G.isEmpty()) {
                    c2041r = null;
                } else {
                    C1945g0 c1945g3 = c1945g0Arr2[i29];
                    C0559W c0559w3 = c0560x.f1997a;
                    int iIndexOf = c1945g3.f8527b.indexOf(c0559w3);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        c2041r = new C2041r(c0559w3, AbstractC1303m.m3287J(abstractC1676G));
                    } else {
                        c2041r = null;
                    }
                }
                c2041rArr[i29] = c2041r;
            }
        }
        int i30 = c0687s.f2635a;
        for (int i31 = 0; i31 < i30; i31++) {
            C1945g0 c1945g4 = ((C1945g0[]) c0687s.f2637c)[i31];
            Map map2 = (Map) c2033j.f8858A.get(i31);
            if (map2 != null && map2.containsKey(c1945g4)) {
                Map map3 = (Map) c2033j.f8858A.get(i31);
                if (map3 != null && map3.get(c1945g4) != null) {
                    throw new ClassCastException();
                }
                c2041rArr[i31] = null;
            }
        }
        for (int i32 = 0; i32 < i18; i32++) {
            int i33 = ((int[]) c0687s.f2636b)[i32];
            if (c2033j.f8859B.get(i32) || c2033j.f2042r.contains(Integer.valueOf(i33))) {
                c2041rArr[i32] = null;
            }
        }
        C1528a c1528a = c2040q.f8903e;
        InterfaceC2064d interfaceC2064d = c2040q.f8911b;
        AbstractC0646n.m1631i(interfaceC2064d);
        c1528a.getClass();
        ArrayList arrayList = new ArrayList();
        int i34 = 0;
        while (i34 < c2041rArr.length) {
            C2041r c2041r3 = c2041rArr[i34];
            if (c2041r3 == null || c2041r3.f8909b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                C1673D c1673dM4116m = AbstractC1676G.m4116m();
                c1673dM4116m.m4102a(new C2024a(0L, 0L));
                arrayList.add(c1673dM4116m);
                obj = obj2;
            }
            i34++;
            obj2 = obj;
        }
        int length4 = c2041rArr.length;
        long[][] jArr = new long[length4][];
        for (int i35 = 0; i35 < c2041rArr.length; i35++) {
            C2041r c2041r4 = c2041rArr[i35];
            if (c2041r4 == null) {
                jArr[i35] = new long[0];
            } else {
                int[] iArr14 = c2041r4.f8909b;
                jArr[i35] = new long[iArr14.length];
                for (int i36 = 0; i36 < iArr14.length; i36++) {
                    long j3 = c2041r4.f8908a.f1995d[iArr14[i36]].f2150j;
                    long[] jArr2 = jArr[i35];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i36] = j3;
                }
                Arrays.sort(jArr[i35]);
            }
        }
        int[] iArr15 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i37 = 0; i37 < length4; i37++) {
            long[] jArr4 = jArr[i37];
            jArr3[i37] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        C2025b.m4597u(arrayList, jArr3);
        AbstractC1723q.m4153b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(C1690V.f7626h);
        C1687S c1687s = new C1687S();
        C1688T c1688t = new C1688T(treeMap);
        c1688t.f7625l = c1687s;
        int i38 = 0;
        while (i38 < length4) {
            long[] jArr5 = jArr[i38];
            if (jArr5.length <= 1) {
                i3 = length4;
                iArr2 = iArr15;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i39 = 0;
                while (true) {
                    long[] jArr6 = jArr[i38];
                    i3 = length4;
                    double dLog = 0.0d;
                    if (i39 >= jArr6.length) {
                        break;
                    }
                    int[] iArr16 = iArr15;
                    long j4 = jArr6[i39];
                    if (j4 != -1) {
                        dLog = Math.log(j4);
                    }
                    dArr[i39] = dLog;
                    i39++;
                    length4 = i3;
                    iArr15 = iArr16;
                }
                iArr2 = iArr15;
                int i40 = length5 - 1;
                double d3 = dArr[i40] - dArr[0];
                int i41 = 0;
                while (i41 < i40) {
                    double d4 = dArr[i41];
                    int i42 = i41 + 1;
                    Double dValueOf = Double.valueOf(d3 == 0.0d ? 1.0d : (((d4 + dArr[i42]) * 0.5d) - dArr[0]) / d3);
                    Integer numValueOf = Integer.valueOf(i38);
                    double d5 = d3;
                    Map map4 = c1688t.f7623j;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        Collection collectionM4134c = c1688t.m4134c();
                        if (!collectionM4134c.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        c1688t.f7624k++;
                        map4.put(dValueOf, collectionM4134c);
                    } else if (collection.add(numValueOf)) {
                        c1688t.f7624k++;
                    }
                    i41 = i42;
                    d3 = d5;
                }
            }
            i38++;
            length4 = i3;
            iArr15 = iArr2;
            interfaceC2064d = interfaceC2064d;
        }
        InterfaceC2064d interfaceC2064d2 = interfaceC2064d;
        int[] iArr17 = iArr15;
        C1720n c1720n = c1688t.f7693h;
        if (c1720n == null) {
            c1720n = new C1720n(0, c1688t);
            c1688t.f7693h = c1720n;
        }
        AbstractC1676G abstractC1676GM4117n = AbstractC1676G.m4117n(c1720n);
        for (int i43 = 0; i43 < abstractC1676GM4117n.size(); i43++) {
            int iIntValue = ((Integer) abstractC1676GM4117n.get(i43)).intValue();
            int i44 = iArr17[iIntValue] + 1;
            iArr17[iIntValue] = i44;
            jArr3[iIntValue] = jArr[iIntValue][i44];
            C2025b.m4597u(arrayList, jArr3);
        }
        for (int i45 = 0; i45 < c2041rArr.length; i45++) {
            if (arrayList.get(i45) != null) {
                jArr3[i45] = jArr3[i45] * 2;
            }
        }
        C2025b.m4597u(arrayList, jArr3);
        C1673D c1673dM4116m2 = AbstractC1676G.m4116m();
        for (int i46 = 0; i46 < arrayList.size(); i46++) {
            C1673D c1673d = (C1673D) arrayList.get(i46);
            c1673dM4116m2.m4102a(c1673d == null ? C1692X.f7629k : c1673d.m4112f());
        }
        C1692X c1692xM4112f = c1673dM4116m2.m4112f();
        InterfaceC2042s[] interfaceC2042sArr = new InterfaceC2042s[c2041rArr.length];
        for (int i47 = 0; i47 < c2041rArr.length; i47++) {
            C2041r c2041r5 = c2041rArr[i47];
            if (c2041r5 != null) {
                int[] iArr18 = c2041r5.f8909b;
                if (iArr18.length != 0) {
                    if (iArr18.length == 1) {
                        c2025b = new C2043t(c2041r5.f8908a, new int[]{iArr18[0]});
                    } else {
                        long j5 = 25000;
                        c2025b = new C2025b(c2041r5.f8908a, iArr18, interfaceC2064d2, 10000, j5, j5, (AbstractC1676G) c1692xM4112f.get(i47));
                    }
                    interfaceC2042sArr[i47] = c2025b;
                }
            }
        }
        C0830h0[] c0830h0Arr = new C0830h0[i18];
        for (int i48 = 0; i48 < i18; i48++) {
            c0830h0Arr[i48] = (c2033j.f8859B.get(i48) || c2033j.f2042r.contains(Integer.valueOf(((int[]) c0687s.f2636b)[i48])) || (((int[]) c0687s.f2636b)[i48] != -2 && interfaceC2042sArr[i48] == null)) ? null : C0830h0.f3516c;
        }
        c2033j.f2037m.getClass();
        Pair pairCreate = Pair.create(c0830h0Arr, interfaceC2042sArr);
        InterfaceC2042s[] interfaceC2042sArr2 = (InterfaceC2042s[]) pairCreate.second;
        List[] listArr = new List[interfaceC2042sArr2.length];
        for (int i49 = 0; i49 < interfaceC2042sArr2.length; i49++) {
            InterfaceC2042s interfaceC2042s = interfaceC2042sArr2[i49];
            if (interfaceC2042s != null) {
                c1692xM4120r = AbstractC1676G.m4120r(interfaceC2042s);
            } else {
                C1674E c1674e = AbstractC1676G.f7601h;
                c1692xM4120r = C1692X.f7629k;
            }
            listArr[i49] = c1692xM4120r;
        }
        C1673D c1673d2 = new C1673D(4);
        for (int i50 = 0; i50 < c0687s.f2635a; i50++) {
            C1945g0[] c1945g0Arr6 = (C1945g0[]) c0687s.f2637c;
            C1945g0 c1945g5 = c1945g0Arr6[i50];
            List list = listArr[i50];
            int i51 = 0;
            while (i51 < c1945g5.f8526a) {
                C0559W c0559wM4499a3 = c1945g5.m4499a(i51);
                int i52 = c1945g0Arr6[i50].m4499a(i51).f1992a;
                int[] iArr19 = new int[i52];
                int i53 = 0;
                int i54 = 0;
                while (i53 < i52) {
                    List[] listArr2 = listArr;
                    if ((((int[][][]) c0687s.f2639e)[i50][i51][i53] & 7) == 4) {
                        iArr19[i54] = i53;
                        i54++;
                    }
                    i53++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr19, i54);
                C1945g0[] c1945g0Arr7 = c1945g0Arr6;
                String str2 = null;
                int i55 = 0;
                boolean z10 = false;
                int i56 = 0;
                int iMin = 16;
                while (i55 < iArrCopyOf.length) {
                    String str3 = c1945g0Arr7[i50].m4499a(i51).f1995d[iArrCopyOf[i55]].f2154n;
                    int i57 = i56 + 1;
                    if (i56 == 0) {
                        str2 = str3;
                    } else {
                        z10 = (!Objects.equals(str2, str3)) | z10;
                    }
                    iMin = Math.min(iMin, ((int[][][]) c0687s.f2639e)[i50][i51][i55] & 24);
                    i55++;
                    i56 = i57;
                }
                if (z10) {
                    iMin = Math.min(iMin, ((int[]) c0687s.f2638d)[i50]);
                }
                boolean z11 = iMin != 0;
                int i58 = c0559wM4499a3.f1992a;
                int[] iArr20 = new int[i58];
                boolean[] zArr = new boolean[i58];
                for (int i59 = 0; i59 < c0559wM4499a3.f1992a; i59++) {
                    iArr20[i59] = ((int[][][]) c0687s.f2639e)[i50][i51][i59] & 7;
                    int i60 = 0;
                    while (true) {
                        if (i60 >= list.size()) {
                            z5 = false;
                            break;
                        }
                        InterfaceC2042s interfaceC2042s2 = (InterfaceC2042s) list.get(i60);
                        if (interfaceC2042s2.mo4424b().equals(c0559wM4499a3) && interfaceC2042s2.mo4438t(i59) != -1) {
                            z5 = true;
                            break;
                        }
                        i60++;
                    }
                    zArr[i59] = z5;
                }
                c1673d2.m4102a(new C0566b0(c0559wM4499a3, z11, iArr20, zArr));
                i51++;
                listArr = listArr3;
                c1945g0Arr6 = c1945g0Arr7;
            }
        }
        int i61 = 0;
        while (true) {
            C1945g0 c1945g6 = (C1945g0) c0687s.f2640f;
            if (i61 >= c1945g6.f8526a) {
                break;
            }
            C0559W c0559wM4499a4 = c1945g6.m4499a(i61);
            int[] iArr21 = new int[c0559wM4499a4.f1992a];
            Arrays.fill(iArr21, 0);
            c1673d2.m4102a(new C0566b0(c0559wM4499a4, false, iArr21, new boolean[c0559wM4499a4.f1992a]));
            i61++;
        }
        C2045v c2045v = new C2045v((C0830h0[]) pairCreate.first, (InterfaceC2042s[]) pairCreate.second, new C0568c0(c1673d2.m4112f()), c0687s);
        for (int i62 = 0; i62 < c2045v.f8912a; i62++) {
            if (c2045v.m4619b(i62)) {
                AbstractC0646n.m1630h(c2045v.f8914c[i62] != null || this.f3347j[i62].f3478h == -2);
            } else {
                AbstractC0646n.m1630h(c2045v.f8914c[i62] == null);
            }
        }
        for (InterfaceC2042s interfaceC2042s3 : c2045v.f8914c) {
            if (interfaceC2042s3 != null) {
                interfaceC2042s3.mo4431l(f);
                interfaceC2042s3.mo4425d(z3);
            }
        }
        return c2045v;
    }

    /* JADX INFO: renamed from: k */
    public final void m2014k() {
        Object obj = this.f3338a;
        if (obj instanceof C1938d) {
            long j3 = this.f3344g.f3357d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            C1938d c1938d = (C1938d) obj;
            c1938d.f8492k = 0L;
            c1938d.f8493l = j3;
        }
    }
}
