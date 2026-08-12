package p077a0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p011E.C0111d;
import p045P0.AbstractC0462h;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0548K;
import p055T.C0555S;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0583o;
import p055T.C0592x;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0650r;
import p064W.C0653u;
import p064W.C0654v;
import p064W.C0655w;
import p064W.RunnableC0647o;
import p070Y.C0712i;
import p071Y0.C0760w;
import p082b0.C1064e;
import p082b0.C1071l;
import p085c0.C1120B;
import p088d0.C1383g;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1692X;
import p107i0.C1747b;
import p114k0.AbstractC1932a;
import p114k0.C1907A;
import p114k0.C1934b;
import p114k0.C1937c0;
import p114k0.C1945g0;
import p114k0.InterfaceC1931Z;
import p114k0.InterfaceC1935b0;
import p114k0.InterfaceC1964x;
import p114k0.InterfaceC1965y;
import p121m0.C2002d;
import p125n0.AbstractC2044u;
import p125n0.C2040q;
import p125n0.C2045v;
import p125n0.InterfaceC2042s;
import p129o0.C2065e;
import p129o0.C2068h;
import p129o0.InterfaceC2064d;

/* JADX INFO: renamed from: a0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0797H implements Handler.Callback, InterfaceC1964x, InterfaceC0820c0 {

    /* JADX INFO: renamed from: c0 */
    public static final long f3280c0 = AbstractC0632A.m1581V(10000);

    /* JADX INFO: renamed from: A */
    public final C0833j f3281A;

    /* JADX INFO: renamed from: B */
    public final long f3282B;

    /* JADX INFO: renamed from: C */
    public final C1071l f3283C;

    /* JADX INFO: renamed from: D */
    public final C1064e f3284D;

    /* JADX INFO: renamed from: E */
    public final C0655w f3285E;

    /* JADX INFO: renamed from: F */
    public C0832i0 f3286F;

    /* JADX INFO: renamed from: G */
    public C0818b0 f3287G;

    /* JADX INFO: renamed from: H */
    public C0760w f3288H;

    /* JADX INFO: renamed from: I */
    public boolean f3289I;

    /* JADX INFO: renamed from: J */
    public boolean f3290J;

    /* JADX INFO: renamed from: K */
    public boolean f3291K;

    /* JADX INFO: renamed from: L */
    public boolean f3292L;

    /* JADX INFO: renamed from: M */
    public long f3293M;

    /* JADX INFO: renamed from: N */
    public boolean f3294N;

    /* JADX INFO: renamed from: O */
    public int f3295O;

    /* JADX INFO: renamed from: P */
    public boolean f3296P;

    /* JADX INFO: renamed from: Q */
    public boolean f3297Q;

    /* JADX INFO: renamed from: R */
    public boolean f3298R;

    /* JADX INFO: renamed from: S */
    public boolean f3299S;

    /* JADX INFO: renamed from: T */
    public int f3300T;

    /* JADX INFO: renamed from: U */
    public C0796G f3301U;

    /* JADX INFO: renamed from: V */
    public long f3302V;

    /* JADX INFO: renamed from: W */
    public long f3303W;

    /* JADX INFO: renamed from: X */
    public int f3304X;

    /* JADX INFO: renamed from: Y */
    public boolean f3305Y;

    /* JADX INFO: renamed from: Z */
    public C0839o f3306Z;

    /* JADX INFO: renamed from: a0 */
    public long f3307a0;

    /* JADX INFO: renamed from: b0 */
    public C0843s f3308b0;

    /* JADX INFO: renamed from: g */
    public final AbstractC0827g[] f3309g;

    /* JADX INFO: renamed from: h */
    public final Set f3310h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0827g[] f3311i;

    /* JADX INFO: renamed from: j */
    public final boolean[] f3312j;

    /* JADX INFO: renamed from: k */
    public final AbstractC2044u f3313k;

    /* JADX INFO: renamed from: l */
    public final C2045v f3314l;

    /* JADX INFO: renamed from: m */
    public final C0836l f3315m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2064d f3316n;

    /* JADX INFO: renamed from: o */
    public final C0655w f3317o;

    /* JADX INFO: renamed from: p */
    public final C0650r f3318p;

    /* JADX INFO: renamed from: q */
    public final Looper f3319q;

    /* JADX INFO: renamed from: r */
    public final C0557U f3320r;

    /* JADX INFO: renamed from: s */
    public final C0556T f3321s;

    /* JADX INFO: renamed from: t */
    public final long f3322t;

    /* JADX INFO: renamed from: u */
    public final C0837m f3323u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f3324v;

    /* JADX INFO: renamed from: w */
    public final C0653u f3325w;

    /* JADX INFO: renamed from: x */
    public final C0846v f3326x;

    /* JADX INFO: renamed from: y */
    public final C0805P f3327y;

    /* JADX INFO: renamed from: z */
    public final C0816a0 f3328z;

    public C0797H(AbstractC0827g[] abstractC0827gArr, AbstractC2044u abstractC2044u, C2045v c2045v, C0836l c0836l, InterfaceC2064d interfaceC2064d, int i3, boolean z3, C1064e c1064e, C0832i0 c0832i0, C0833j c0833j, long j3, Looper looper, C0653u c0653u, C0846v c0846v, C1071l c1071l) {
        C0843s c0843s = C0843s.f3596a;
        this.f3326x = c0846v;
        this.f3309g = abstractC0827gArr;
        this.f3313k = abstractC2044u;
        this.f3314l = c2045v;
        this.f3315m = c0836l;
        this.f3316n = interfaceC2064d;
        this.f3295O = i3;
        this.f3296P = z3;
        this.f3286F = c0832i0;
        this.f3281A = c0833j;
        this.f3282B = j3;
        this.f3290J = false;
        this.f3325w = c0653u;
        this.f3283C = c1071l;
        this.f3308b0 = c0843s;
        this.f3284D = c1064e;
        this.f3307a0 = -9223372036854775807L;
        this.f3293M = -9223372036854775807L;
        this.f3322t = c0836l.f3554g;
        C0555S c0555s = AbstractC0558V.f1991a;
        C0818b0 c0818b0M2060i = C0818b0.m2060i(c2045v);
        this.f3287G = c0818b0M2060i;
        this.f3288H = new C0760w(c0818b0M2060i);
        this.f3311i = new AbstractC0827g[abstractC0827gArr.length];
        this.f3312j = new boolean[abstractC0827gArr.length];
        C2040q c2040q = (C2040q) abstractC2044u;
        c2040q.getClass();
        for (int i4 = 0; i4 < abstractC0827gArr.length; i4++) {
            AbstractC0827g abstractC0827g = abstractC0827gArr[i4];
            abstractC0827g.f3481k = i4;
            abstractC0827g.f3482l = c1071l;
            abstractC0827g.f3483m = c0653u;
            this.f3311i[i4] = abstractC0827g;
            AbstractC0827g abstractC0827g2 = this.f3311i[i4];
            synchronized (abstractC0827g2.f3477g) {
                abstractC0827g2.f3493w = c2040q;
            }
        }
        this.f3323u = new C0837m(this, c0653u);
        this.f3324v = new ArrayList();
        this.f3310h = Collections.newSetFromMap(new IdentityHashMap());
        this.f3320r = new C0557U();
        this.f3321s = new C0556T();
        abstractC2044u.f8910a = this;
        abstractC2044u.f8911b = interfaceC2064d;
        this.f3305Y = true;
        C0655w c0655wM1693a = c0653u.m1693a(looper, null);
        this.f3285E = c0655wM1693a;
        this.f3327y = new C0805P(c1064e, c0655wM1693a, new C0111d(12, this));
        this.f3328z = new C0816a0(this, c1064e, c0655wM1693a, c1071l);
        C0650r c0650r = new C0650r();
        c0650r.f2516j = new Object();
        c0650r.f2514h = null;
        c0650r.f2515i = null;
        c0650r.f2513g = 0;
        this.f3318p = c0650r;
        Looper looperM1657g = c0650r.m1657g();
        this.f3319q = looperM1657g;
        this.f3317o = c0653u.m1693a(looperM1657g, this);
    }

    /* JADX INFO: renamed from: K */
    public static Pair m1933K(AbstractC0558V abstractC0558V, C0796G c0796g, boolean z3, int i3, boolean z4, C0557U c0557u, C0556T c0556t) {
        int iM1934L;
        AbstractC0558V abstractC0558V2 = c0796g.f3277a;
        if (abstractC0558V.m1415p()) {
            return null;
        }
        AbstractC0558V abstractC0558V3 = abstractC0558V2.m1415p() ? abstractC0558V : abstractC0558V2;
        try {
            Pair pairM1411i = abstractC0558V3.m1411i(c0557u, c0556t, c0796g.f3278b, c0796g.f3279c);
            if (!abstractC0558V.equals(abstractC0558V3)) {
                if (abstractC0558V.mo1328b(pairM1411i.first) == -1) {
                    if (!z3 || (iM1934L = m1934L(c0557u, c0556t, i3, z4, pairM1411i.first, abstractC0558V3, abstractC0558V)) == -1) {
                        return null;
                    }
                    return abstractC0558V.m1411i(c0557u, c0556t, iM1934L, -9223372036854775807L);
                }
                if (abstractC0558V3.mo1410g(pairM1411i.first, c0556t).f1971f && abstractC0558V3.mo1332m(c0556t.f1968c, c0557u, 0L).f1988n == abstractC0558V3.mo1328b(pairM1411i.first)) {
                    return abstractC0558V.m1411i(c0557u, c0556t, abstractC0558V.mo1410g(pairM1411i.first, c0556t).f1968c, c0796g.f3279c);
                }
            }
            return pairM1411i;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static int m1934L(C0557U c0557u, C0556T c0556t, int i3, boolean z3, Object obj, AbstractC0558V abstractC0558V, AbstractC0558V abstractC0558V2) {
        AbstractC0558V abstractC0558V3 = abstractC0558V;
        Object obj2 = abstractC0558V3.mo1332m(abstractC0558V3.mo1410g(obj, c0556t).f1968c, c0557u, 0L).f1975a;
        for (int i4 = 0; i4 < abstractC0558V2.mo1333o(); i4++) {
            if (abstractC0558V2.mo1332m(i4, c0557u, 0L).f1975a.equals(obj2)) {
                return i4;
            }
        }
        int iMo1328b = abstractC0558V3.mo1328b(obj);
        int iMo1330h = abstractC0558V3.mo1330h();
        int i5 = 0;
        int iMo1328b2 = -1;
        while (i5 < iMo1330h && iMo1328b2 == -1) {
            AbstractC0558V abstractC0558V4 = abstractC0558V3;
            int iM1408d = abstractC0558V4.m1408d(iMo1328b, c0556t, c0557u, i3, z3);
            if (iM1408d == -1) {
                break;
            }
            iMo1328b2 = abstractC0558V2.mo1328b(abstractC0558V4.mo1331l(iM1408d));
            i5++;
            abstractC0558V3 = abstractC0558V4;
            iMo1328b = iM1408d;
        }
        if (iMo1328b2 == -1) {
            return -1;
        }
        return abstractC0558V2.mo1329f(iMo1328b2, c0556t, false).f1968c;
    }

    /* JADX INFO: renamed from: S */
    public static void m1935S(AbstractC0827g abstractC0827g, long j3) {
        abstractC0827g.f3490t = true;
        if (abstractC0827g instanceof C2002d) {
            C2002d c2002d = (C2002d) abstractC0827g;
            AbstractC0646n.m1630h(c2002d.f3490t);
            c2002d.f8732P = j3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k0.b0, k0.y] */
    /* JADX INFO: renamed from: q */
    public static boolean m1936q(C0802M c0802m) {
        if (c0802m != null) {
            try {
                ?? r3 = c0802m.f3338a;
                if (c0802m.f3342e) {
                    for (InterfaceC1931Z interfaceC1931Z : c0802m.f3340c) {
                        if (interfaceC1931Z != null) {
                            interfaceC1931Z.mo3788u();
                        }
                    }
                } else {
                    r3.mo3768j();
                }
                if ((!c0802m.f3342e ? 0L : r3.mo3772r()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1937r(AbstractC0827g abstractC0827g) {
        return abstractC0827g.f3484n != 0;
    }

    /* JADX INFO: renamed from: A */
    public final void m1938A() {
        this.f3288H.m1872f(1);
        int i3 = 0;
        m1944G(false, false, false, true);
        C0836l c0836l = this.f3315m;
        c0836l.getClass();
        long id = Thread.currentThread().getId();
        long j3 = c0836l.f3556i;
        AbstractC0646n.m1629g("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j3 == -1 || j3 == id);
        c0836l.f3556i = id;
        HashMap map = c0836l.f3555h;
        C1071l c1071l = this.f3283C;
        if (!map.containsKey(c1071l)) {
            map.put(c1071l, new C0835k());
        }
        C0835k c0835k = (C0835k) map.get(c1071l);
        c0835k.getClass();
        int i4 = c0836l.f3553f;
        if (i4 == -1) {
            i4 = 13107200;
        }
        c0835k.f3547b = i4;
        c0835k.f3546a = false;
        m1966c0(this.f3287G.f3431a.m1415p() ? 4 : 2);
        C2068h c2068h = (C2068h) this.f3316n;
        c2068h.getClass();
        C0816a0 c0816a0 = this.f3328z;
        AbstractC0646n.m1630h(!c0816a0.f3425k);
        c0816a0.f3426l = c2068h;
        while (true) {
            ArrayList arrayList = c0816a0.f3416b;
            if (i3 >= arrayList.size()) {
                c0816a0.f3425k = true;
                this.f3317o.m1700e(2);
                return;
            } else {
                C0814Z c0814z = (C0814Z) arrayList.get(i3);
                c0816a0.m2051e(c0814z);
                c0816a0.f3421g.add(c0814z);
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final synchronized boolean m1939B() {
        if (!this.f3289I && this.f3319q.getThread().isAlive()) {
            this.f3317o.m1700e(7);
            m1990o0(new C0840p(1, this), this.f3282B);
            return this.f3289I;
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final void m1940C() {
        try {
            m1944G(true, false, true, false);
            m1941D();
            C0836l c0836l = this.f3315m;
            if (c0836l.f3555h.remove(this.f3283C) != null) {
                c0836l.m2109d();
            }
            if (c0836l.f3555h.isEmpty()) {
                c0836l.f3556i = -1L;
            }
            m1966c0(1);
            this.f3318p.m1658h();
            synchronized (this) {
                this.f3289I = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f3318p.m1658h();
            synchronized (this) {
                this.f3289I = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m1941D() {
        for (int i3 = 0; i3 < this.f3309g.length; i3++) {
            AbstractC0827g abstractC0827g = this.f3311i[i3];
            synchronized (abstractC0827g.f3477g) {
                abstractC0827g.f3493w = null;
            }
            AbstractC0827g abstractC0827g2 = this.f3309g[i3];
            AbstractC0646n.m1630h(abstractC0827g2.f3484n == 0);
            abstractC0827g2.mo2089p();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1942E(int i3, int i4, C1937c0 c1937c0) throws Throwable {
        this.f3288H.m1872f(1);
        C0816a0 c0816a0 = this.f3328z;
        c0816a0.getClass();
        AbstractC0646n.m1625c(i3 >= 0 && i3 <= i4 && i4 <= c0816a0.f3416b.size());
        c0816a0.f3424j = c1937c0;
        c0816a0.m2053g(i3, i4);
        m1985m(c0816a0.m2048b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public final void m1943F() throws C0839o {
        int i3;
        float f = this.f3323u.mo2003f().f1949a;
        C0805P c0805p = this.f3327y;
        C0802M c0802m = c0805p.f3375i;
        C0802M c0802m2 = c0805p.f3376j;
        C2045v c2045v = null;
        C0802M c0802m3 = c0802m;
        boolean z3 = true;
        while (c0802m3 != null && c0802m3.f3342e) {
            C0818b0 c0818b0 = this.f3287G;
            C2045v c2045vM2013j = c0802m3.m2013j(f, c0818b0.f3431a, c0818b0.f3442l);
            C2045v c2045v2 = c0802m3 == this.f3327y.f3375i ? c2045vM2013j : c2045v;
            C2045v c2045v3 = c0802m3.f3352o;
            if (c2045v3 != null) {
                int length = c2045v3.f8914c.length;
                InterfaceC2042s[] interfaceC2042sArr = c2045vM2013j.f8914c;
                if (length == interfaceC2042sArr.length) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= interfaceC2042sArr.length) {
                            if (c0802m3 == c0802m2) {
                                z3 = false;
                            }
                            c0802m3 = c0802m3.f3350m;
                            c2045v = c2045v2;
                        } else if (c2045vM2013j.m4618a(c2045v3, i4)) {
                            i4++;
                        }
                    }
                }
            }
            if (!z3) {
                this.f3327y.m2029l(c0802m3);
                if (c0802m3.f3342e) {
                    i3 = 4;
                    c0802m3.m2004a(c2045vM2013j, Math.max(c0802m3.f3344g.f3355b, this.f3302V - c0802m3.f3353p), false, new boolean[c0802m3.f3347j.length]);
                }
                m1983l(true);
                if (this.f3287G.f3435e != i3) {
                    m1993t();
                    m1984l0();
                    this.f3317o.m1700e(2);
                    return;
                }
                return;
            }
            C0805P c0805p2 = this.f3327y;
            C0802M c0802m4 = c0805p2.f3375i;
            boolean zM2029l = c0805p2.m2029l(c0802m4);
            boolean[] zArr = new boolean[this.f3309g.length];
            c2045v2.getClass();
            long jM2004a = c0802m4.m2004a(c2045v2, this.f3287G.f3449s, zM2029l, zArr);
            C0818b0 c0818b1 = this.f3287G;
            boolean z4 = (c0818b1.f3435e == 4 || jM2004a == c0818b1.f3449s) ? false : true;
            C0818b0 c0818b2 = this.f3287G;
            this.f3287G = m1991p(c0818b2.f3432b, jM2004a, c0818b2.f3433c, c0818b2.f3434d, z4, 5);
            if (z4) {
                m1946I(jM2004a);
            }
            boolean[] zArr2 = new boolean[this.f3309g.length];
            int i5 = 0;
            while (true) {
                AbstractC0827g[] abstractC0827gArr = this.f3309g;
                if (i5 >= abstractC0827gArr.length) {
                    break;
                }
                AbstractC0827g abstractC0827g = abstractC0827gArr[i5];
                boolean zM1937r = m1937r(abstractC0827g);
                zArr2[i5] = zM1937r;
                InterfaceC1931Z interfaceC1931Z = c0802m4.f3340c[i5];
                if (zM1937r) {
                    if (interfaceC1931Z != abstractC0827g.f3485o) {
                        m1963b(i5);
                    } else if (zArr[i5]) {
                        long j3 = this.f3302V;
                        abstractC0827g.f3490t = false;
                        abstractC0827g.f3488r = j3;
                        abstractC0827g.f3489s = j3;
                        abstractC0827g.mo2088o(j3, false);
                    }
                }
                i5++;
            }
            m1967d(zArr2, this.f3302V);
            i3 = 4;
            m1983l(true);
            if (this.f3287G.f3435e != i3) {
                m1993t();
                m1984l0();
                this.f3317o.m1700e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb A[PHI: r5 r6 r8
      0x00bb: PHI (r5v5 k0.A) = (r5v4 k0.A), (r5v20 k0.A) binds: [B:34:0x0090, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r6v2 long) = (r6v1 long), (r6v22 long) binds: [B:34:0x0090, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r8v2 long) = (r8v1 long), (r8v9 long) binds: [B:34:0x0090, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX INFO: renamed from: G */
    public final void m1944G(boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC0827g[] abstractC0827gArr;
        long j3;
        long j4;
        long j5;
        boolean z7;
        C1907A c1907a;
        AbstractC0558V abstractC0558V;
        List list;
        this.f3317o.m1699d(2);
        this.f3306Z = null;
        m1988n0(false, true);
        C0837m c0837m = this.f3323u;
        c0837m.f3562l = false;
        C0834j0 c0834j0 = c0837m.f3557g;
        if (c0834j0.f3543i) {
            c0834j0.m2104c(c0834j0.mo2001b());
            c0834j0.f3543i = false;
        }
        this.f3302V = 1000000000000L;
        int i3 = 0;
        while (true) {
            abstractC0827gArr = this.f3309g;
            if (i3 >= abstractC0827gArr.length) {
                break;
            }
            try {
                m1963b(i3);
            } catch (C0839o | RuntimeException e3) {
                AbstractC0646n.m1636n("ExoPlayerImplInternal", "Disable failed.", e3);
            }
            i3++;
        }
        if (z3) {
            for (AbstractC0827g abstractC0827g : abstractC0827gArr) {
                if (this.f3310h.remove(abstractC0827g)) {
                    try {
                        abstractC0827g.m2097x();
                    } catch (RuntimeException e4) {
                        AbstractC0646n.m1636n("ExoPlayerImplInternal", "Reset failed.", e4);
                    }
                }
            }
        }
        this.f3300T = 0;
        C0818b0 c0818b0 = this.f3287G;
        C1907A c1907a2 = c0818b0.f3432b;
        long jLongValue = c0818b0.f3449s;
        if (this.f3287G.f3432b.m4422b()) {
            j3 = this.f3287G.f3433c;
        } else {
            C0818b0 c0818b1 = this.f3287G;
            C0556T c0556t = this.f3321s;
            C1907A c1907a3 = c0818b1.f3432b;
            AbstractC0558V abstractC0558V2 = c0818b1.f3431a;
            if (abstractC0558V2.m1415p() || abstractC0558V2.mo1410g(c1907a3.f8311a, c0556t).f1971f) {
                j3 = this.f3287G.f3433c;
            } else {
                j3 = this.f3287G.f3449s;
            }
        }
        if (z4) {
            this.f3301U = null;
            Pair pairM1975h = m1975h(this.f3287G.f3431a);
            c1907a2 = (C1907A) pairM1975h.first;
            jLongValue = ((Long) pairM1975h.second).longValue();
            j3 = -9223372036854775807L;
            if (c1907a2.equals(this.f3287G.f3432b)) {
                j4 = jLongValue;
                j5 = j3;
                z7 = false;
            } else {
                j4 = jLongValue;
                j5 = -9223372036854775807L;
                z7 = true;
            }
        } else {
            j4 = jLongValue;
            j5 = j3;
            z7 = false;
        }
        this.f3327y.m2019b();
        this.f3294N = false;
        AbstractC0558V abstractC0558V3 = this.f3287G.f3431a;
        if (z5 && (abstractC0558V3 instanceof C0828g0)) {
            C0828g0 c0828g0 = (C0828g0) abstractC0558V3;
            C1937c0 c1937c0 = this.f3328z.f3424j;
            AbstractC0558V[] abstractC0558VArr = c0828g0.f3501h;
            AbstractC0558V[] abstractC0558VArr2 = new AbstractC0558V[abstractC0558VArr.length];
            for (int i4 = 0; i4 < abstractC0558VArr.length; i4++) {
                abstractC0558VArr2[i4] = new C0826f0(abstractC0558VArr[i4]);
            }
            C0828g0 c0828g1 = new C0828g0(abstractC0558VArr2, c0828g0.f3502i, c1937c0);
            if (c1907a2.f8312b != -1) {
                c0828g1.mo1410g(c1907a2.f8311a, this.f3321s);
                int i5 = this.f3321s.f1968c;
                C0557U c0557u = this.f3320r;
                c0828g1.mo1332m(i5, c0557u, 0L);
                if (c0557u.m1404a()) {
                    abstractC0558V = c0828g1;
                    c1907a = new C1907A(c1907a2.f8314d, c1907a2.f8311a);
                } else {
                    abstractC0558V = c0828g1;
                    c1907a = c1907a2;
                }
            } else {
                abstractC0558V = c0828g1;
                c1907a = c1907a2;
            }
        } else {
            c1907a = c1907a2;
            abstractC0558V = abstractC0558V3;
        }
        C0818b0 c0818b2 = this.f3287G;
        int i6 = c0818b2.f3435e;
        C0839o c0839o = z6 ? null : c0818b2.f3436f;
        C1945g0 c1945g0 = z7 ? C1945g0.f8525d : c0818b2.f3438h;
        C2045v c2045v = z7 ? this.f3314l : c0818b2.f3439i;
        if (z7) {
            C1674E c1674e = AbstractC1676G.f7601h;
            list = C1692X.f7629k;
        } else {
            list = c0818b2.f3440j;
        }
        this.f3287G = new C0818b0(abstractC0558V, c1907a, j5, j4, i6, c0839o, false, c1945g0, c2045v, list, c1907a, c0818b2.f3442l, c0818b2.f3443m, c0818b2.f3444n, c0818b2.f3445o, j4, 0L, j4, 0L, false);
        if (z5) {
            C0805P c0805p = this.f3327y;
            if (!c0805p.f3382p.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < c0805p.f3382p.size(); i7++) {
                    ((C0802M) c0805p.f3382p.get(i7)).m2012i();
                }
                c0805p.f3382p = arrayList;
                c0805p.f3378l = null;
                c0805p.m2027j();
            }
            C0816a0 c0816a0 = this.f3328z;
            HashMap map = c0816a0.f3420f;
            for (C0813Y c0813y : map.values()) {
                try {
                    c0813y.f3404a.m4492n(c0813y.f3405b);
                } catch (RuntimeException e5) {
                    AbstractC0646n.m1636n("MediaSourceList", "Failed to release child source.", e5);
                }
                AbstractC1932a abstractC1932a = c0813y.f3404a;
                C0812X c0812x = c0813y.f3406c;
                abstractC1932a.m4494q(c0812x);
                c0813y.f3404a.m4493p(c0812x);
            }
            map.clear();
            c0816a0.f3421g.clear();
            c0816a0.f3425k = false;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1945H() {
        C0802M c0802m = this.f3327y.f3375i;
        this.f3291K = c0802m != null && c0802m.f3344g.f3361h && this.f3290J;
    }

    /* JADX INFO: renamed from: I */
    public final void m1946I(long j3) {
        C0802M c0802m = this.f3327y.f3375i;
        long j4 = j3 + (c0802m == null ? 1000000000000L : c0802m.f3353p);
        this.f3302V = j4;
        this.f3323u.f3557g.m2104c(j4);
        for (AbstractC0827g abstractC0827g : this.f3309g) {
            if (m1937r(abstractC0827g)) {
                long j5 = this.f3302V;
                abstractC0827g.f3490t = false;
                abstractC0827g.f3488r = j5;
                abstractC0827g.f3489s = j5;
                abstractC0827g.mo2088o(j5, false);
            }
        }
        for (C0802M c0802m2 = r0.f3375i; c0802m2 != null; c0802m2 = c0802m2.f3350m) {
            for (InterfaceC2042s interfaceC2042s : c0802m2.f3352o.f8914c) {
                if (interfaceC2042s != null) {
                    interfaceC2042s.mo4433o();
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m1947J(AbstractC0558V abstractC0558V, AbstractC0558V abstractC0558V2) {
        if (abstractC0558V.m1415p() && abstractC0558V2.m1415p()) {
            return;
        }
        ArrayList arrayList = this.f3324v;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0462h.m1169i(arrayList.get(size));
            throw null;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1948M(long j3) {
        this.f3317o.f2529a.sendEmptyMessageAtTime(2, j3 + ((this.f3287G.f3435e != 3 || m1968d0()) ? f3280c0 : 1000L));
    }

    /* JADX INFO: renamed from: N */
    public final void m1949N(boolean z3) throws C0839o {
        C1907A c1907a = this.f3327y.f3375i.f3344g.f3354a;
        long jM1951P = m1951P(c1907a, this.f3287G.f3449s, true, false);
        if (jM1951P != this.f3287G.f3449s) {
            C0818b0 c0818b0 = this.f3287G;
            this.f3287G = m1991p(c1907a, jM1951P, c0818b0.f3433c, c0818b0.f3434d, z3, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, k0.y] */
    /* JADX INFO: renamed from: O */
    public final void m1950O(C0796G c0796g) throws Throwable {
        long jLongValue;
        C1907A c1907aM2030n;
        long j3;
        boolean z3;
        long j4;
        long j5;
        C0802M c0802m;
        long jMo3761c;
        C0818b0 c0818b0;
        int i3;
        long j6;
        C1907A c1907a;
        int i4;
        long j7;
        boolean z4;
        C0805P c0805p;
        boolean z5;
        long jM1951P;
        boolean z6;
        C1907A c1907a2;
        long j8;
        C0797H c0797h = this;
        c0797h.f3288H.m1872f(1);
        Pair pairM1933K = m1933K(c0797h.f3287G.f3431a, c0796g, true, c0797h.f3295O, c0797h.f3296P, c0797h.f3320r, c0797h.f3321s);
        try {
            if (pairM1933K != null) {
                Object obj = pairM1933K.first;
                jLongValue = ((Long) pairM1933K.second).longValue();
                long j9 = c0796g.f3279c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                c1907aM2030n = c0797h.f3327y.m2030n(c0797h.f3287G.f3431a, obj, jLongValue);
                if (c1907aM2030n.m4422b()) {
                    c0797h.f3287G.f3431a.mo1410g(c1907aM2030n.f8311a, c0797h.f3321s);
                    if (c0797h.f3321s.m1400e(c1907aM2030n.f8312b) == c1907aM2030n.f8313c) {
                        c0797h.f3321s.f1972g.getClass();
                    }
                    j4 = j9;
                    z3 = true;
                    jLongValue = 0;
                } else {
                    j3 = 0;
                    z3 = c0796g.f3279c == -9223372036854775807L;
                    j4 = j9;
                }
                if (c0797h.f3287G.f3431a.m1415p()) {
                    if (pairM1933K == null) {
                        if (c0797h.f3287G.f3435e != 1) {
                            c0797h.m1966c0(4);
                        }
                        c0797h.m1944G(false, true, false, true);
                    } else {
                        if (c1907aM2030n.equals(c0797h.f3287G.f3432b)) {
                            try {
                                try {
                                    c0802m = c0797h.f3327y.f3375i;
                                    if (c0802m == null && c0802m.f3342e && jLongValue != j3) {
                                        jMo3761c = c0802m.f3338a.mo3761c(jLongValue, c0797h.f3286F);
                                    } else {
                                        jMo3761c = jLongValue;
                                    }
                                    if (AbstractC0632A.m1581V(jMo3761c) != AbstractC0632A.m1581V(c0797h.f3287G.f3449s) && ((i3 = (c0818b0 = c0797h.f3287G).f3435e) == 2 || i3 == 3)) {
                                        j6 = c0818b0.f3449s;
                                        z3 = z3;
                                        c1907a = c1907aM2030n;
                                        i4 = 2;
                                        j7 = j6;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z3 = z3;
                                    c1907aM2030n = c1907aM2030n;
                                    j5 = jLongValue;
                                    j4 = j4;
                                    c0797h.f3287G = c0797h.m1991p(c1907aM2030n, j5, j4, j5, z3, 2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c1907aM2030n = c1907aM2030n;
                                j5 = jLongValue;
                                c0797h.f3287G = c0797h.m1991p(c1907aM2030n, j5, j4, j5, z3, 2);
                                throw th;
                            }
                        } else {
                            jMo3761c = jLongValue;
                        }
                        try {
                            if (c0797h.f3287G.f3435e == 4) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c0805p = c0797h.f3327y;
                            if (c0805p.f3375i != c0805p.f3376j) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            jM1951P = c0797h.m1951P(c1907aM2030n, jMo3761c, z5, z4);
                            if (jLongValue != jM1951P) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z3 |= z6;
                            try {
                                C0818b0 c0818b1 = c0797h.f3287G;
                                c1907a2 = c1907aM2030n;
                                try {
                                    AbstractC0558V abstractC0558V = c0818b1.f3431a;
                                    j8 = j4;
                                    try {
                                        c0797h.m1986m0(abstractC0558V, c1907a2, abstractC0558V, c0818b1.f3432b, j8, true);
                                        c1907a = c1907a2;
                                        j4 = j8;
                                        j6 = jM1951P;
                                        i4 = 2;
                                        j7 = j6;
                                        c0797h = this;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c1907aM2030n = c1907a2;
                                        j4 = j8;
                                        j5 = jM1951P;
                                        c0797h.f3287G = c0797h.m1991p(c1907aM2030n, j5, j4, j5, z3, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c1907aM2030n = c1907a2;
                                    j4 = j4;
                                    j5 = jM1951P;
                                    c0797h.f3287G = c0797h.m1991p(c1907aM2030n, j5, j4, j5, z3, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            j4 = j4;
                            j5 = jLongValue;
                            c0797h.f3287G = c0797h.m1991p(c1907aM2030n, j5, j4, j5, z3, 2);
                            throw th;
                        }
                    }
                    c0797h.f3287G = c0797h.m1991p(c1907a, j6, j4, j7, z3, i4);
                    return;
                }
                c0797h.f3301U = c0796g;
                z3 = z3;
                c1907a = c1907aM2030n;
                j6 = jLongValue;
                i4 = 2;
                j7 = j6;
                c0797h = this;
                c0797h.f3287G = c0797h.m1991p(c1907a, j6, j4, j7, z3, i4);
                return;
            }
            Pair pairM1975h = c0797h.m1975h(c0797h.f3287G.f3431a);
            c1907aM2030n = (C1907A) pairM1975h.first;
            jLongValue = ((Long) pairM1975h.second).longValue();
            z3 = !c0797h.f3287G.f3431a.m1415p();
            j4 = -9223372036854775807L;
            if (c0797h.f3287G.f3431a.m1415p()) {
                if (pairM1933K == null) {
                    if (c0797h.f3287G.f3435e != 1) {
                        c0797h.m1966c0(4);
                    }
                    c0797h.m1944G(false, true, false, true);
                } else {
                    if (c1907aM2030n.equals(c0797h.f3287G.f3432b)) {
                        c0802m = c0797h.f3327y.f3375i;
                        if (c0802m == null) {
                            jMo3761c = jLongValue;
                        } else {
                            jMo3761c = jLongValue;
                        }
                        if (AbstractC0632A.m1581V(jMo3761c) != AbstractC0632A.m1581V(c0797h.f3287G.f3449s)) {
                        }
                    } else {
                        jMo3761c = jLongValue;
                    }
                    if (c0797h.f3287G.f3435e == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c0805p = c0797h.f3327y;
                    if (c0805p.f3375i != c0805p.f3376j) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    jM1951P = c0797h.m1951P(c1907aM2030n, jMo3761c, z5, z4);
                    if (jLongValue != jM1951P) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z3 |= z6;
                    C0818b0 c0818b2 = c0797h.f3287G;
                    c1907a2 = c1907aM2030n;
                    AbstractC0558V abstractC0558V2 = c0818b2.f3431a;
                    j8 = j4;
                    c0797h.m1986m0(abstractC0558V2, c1907a2, abstractC0558V2, c0818b2.f3432b, j8, true);
                    c1907a = c1907a2;
                    j4 = j8;
                    j6 = jM1951P;
                    i4 = 2;
                    j7 = j6;
                    c0797h = this;
                }
                c0797h.f3287G = c0797h.m1991p(c1907a, j6, j4, j7, z3, i4);
                return;
            }
            c0797h.f3301U = c0796g;
            z3 = z3;
            c1907a = c1907aM2030n;
            j6 = jLongValue;
            i4 = 2;
            j7 = j6;
            c0797h = this;
            c0797h.f3287G = c0797h.m1991p(c1907a, j6, j4, j7, z3, i4);
            return;
        } catch (Throwable th7) {
            th = th7;
        }
        j3 = 0;
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, k0.y] */
    /* JADX INFO: renamed from: P */
    public final long m1951P(C1907A c1907a, long j3, boolean z3, boolean z4) throws C0839o {
        AbstractC0827g[] abstractC0827gArr;
        m1976h0();
        m1988n0(false, true);
        if (z4 || this.f3287G.f3435e == 3) {
            m1966c0(2);
        }
        C0805P c0805p = this.f3327y;
        C0802M c0802m = c0805p.f3375i;
        C0802M c0802m2 = c0802m;
        while (c0802m2 != null && !c1907a.equals(c0802m2.f3344g.f3354a)) {
            c0802m2 = c0802m2.f3350m;
        }
        if (z3 || c0802m != c0802m2 || (c0802m2 != null && c0802m2.f3353p + j3 < 0)) {
            int i3 = 0;
            while (true) {
                abstractC0827gArr = this.f3309g;
                if (i3 >= abstractC0827gArr.length) {
                    break;
                }
                m1963b(i3);
                i3++;
            }
            if (c0802m2 != null) {
                while (c0805p.f3375i != c0802m2) {
                    c0805p.m2018a();
                }
                c0805p.m2029l(c0802m2);
                c0802m2.f3353p = 1000000000000L;
                m1967d(new boolean[abstractC0827gArr.length], c0805p.f3376j.m2008e());
            }
        }
        if (c0802m2 != null) {
            c0805p.m2029l(c0802m2);
            if (!c0802m2.f3342e) {
                c0802m2.f3344g = c0802m2.f3344g.m2016b(j3);
            } else if (c0802m2.f3343f) {
                ?? r9 = c0802m2.f3338a;
                j3 = r9.mo3769n(j3);
                r9.mo3770o(j3 - this.f3322t);
            }
            m1946I(j3);
            m1993t();
        } else {
            c0805p.m2019b();
            m1946I(j3);
        }
        m1983l(false);
        this.f3317o.m1700e(2);
        return j3;
    }

    /* JADX INFO: renamed from: Q */
    public final void m1952Q(C0824e0 c0824e0) {
        Looper looper = c0824e0.f3463f;
        Looper looper2 = this.f3319q;
        C0655w c0655w = this.f3317o;
        if (looper != looper2) {
            c0655w.m1697a(15, c0824e0).m1695b();
            return;
        }
        synchronized (c0824e0) {
        }
        try {
            c0824e0.f3458a.mo1903c(c0824e0.f3461d, c0824e0.f3462e);
            c0824e0.m2072b(true);
            int i3 = this.f3287G.f3435e;
            if (i3 == 3 || i3 == 2) {
                c0655w.m1700e(2);
            }
        } catch (Throwable th) {
            c0824e0.m2072b(true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m1953R(C0824e0 c0824e0) {
        Looper looper = c0824e0.f3463f;
        if (looper.getThread().isAlive()) {
            this.f3325w.m1693a(looper, null).m1698c(new RunnableC0647o(this, 2, c0824e0));
        } else {
            AbstractC0646n.m1647y("TAG", "Trying to send message on a dead thread.");
            c0824e0.m2072b(false);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m1954T(boolean z3, AtomicBoolean atomicBoolean) {
        if (this.f3297Q != z3) {
            this.f3297Q = z3;
            if (!z3) {
                for (AbstractC0827g abstractC0827g : this.f3309g) {
                    if (!m1937r(abstractC0827g) && this.f3310h.remove(abstractC0827g)) {
                        abstractC0827g.m2097x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m1955U(C0794E c0794e) throws Throwable {
        this.f3288H.m1872f(1);
        int i3 = c0794e.f3269c;
        ArrayList arrayList = c0794e.f3267a;
        C1937c0 c1937c0 = c0794e.f3268b;
        if (i3 != -1) {
            this.f3301U = new C0796G(new C0828g0(arrayList, c1937c0), c0794e.f3269c, c0794e.f3270d);
        }
        C0816a0 c0816a0 = this.f3328z;
        ArrayList arrayList2 = c0816a0.f3416b;
        c0816a0.m2053g(0, arrayList2.size());
        m1985m(c0816a0.m2047a(arrayList2.size(), arrayList, c1937c0), false);
    }

    /* JADX INFO: renamed from: V */
    public final void m1956V(boolean z3) throws C0839o {
        this.f3290J = z3;
        m1945H();
        if (this.f3291K) {
            C0805P c0805p = this.f3327y;
            if (c0805p.f3376j != c0805p.f3375i) {
                m1949N(true);
                m1983l(false);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m1957W(int i3, int i4, boolean z3, boolean z4) {
        this.f3288H.m1872f(z4 ? 1 : 0);
        this.f3287G = this.f3287G.m2064d(i4, i3, z3);
        m1988n0(false, false);
        for (C0802M c0802m = this.f3327y.f3375i; c0802m != null; c0802m = c0802m.f3350m) {
            for (InterfaceC2042s interfaceC2042s : c0802m.f3352o.f8914c) {
                if (interfaceC2042s != null) {
                    interfaceC2042s.mo4425d(z3);
                }
            }
        }
        if (!m1968d0()) {
            m1976h0();
            m1984l0();
            return;
        }
        int i5 = this.f3287G.f3435e;
        C0655w c0655w = this.f3317o;
        if (i5 != 3) {
            if (i5 == 2) {
                c0655w.m1700e(2);
            }
        } else {
            C0837m c0837m = this.f3323u;
            c0837m.f3562l = true;
            c0837m.f3557g.m2105e();
            m1972f0();
            c0655w.m1700e(2);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m1958X(C0548K c0548k) {
        this.f3317o.m1699d(16);
        C0837m c0837m = this.f3323u;
        c0837m.mo2002d(c0548k);
        C0548K c0548kMo2003f = c0837m.mo2003f();
        m1989o(c0548kMo2003f, c0548kMo2003f.f1949a, true, true);
    }

    /* JADX INFO: renamed from: Y */
    public final void m1959Y(C0843s c0843s) {
        this.f3308b0 = c0843s;
        AbstractC0558V abstractC0558V = this.f3287G.f3431a;
        C0805P c0805p = this.f3327y;
        c0805p.getClass();
        c0843s.getClass();
        if (c0805p.f3382p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < c0805p.f3382p.size(); i3++) {
            ((C0802M) c0805p.f3382p.get(i3)).m2012i();
        }
        c0805p.f3382p = arrayList;
        c0805p.f3378l = null;
        c0805p.m2027j();
    }

    /* JADX INFO: renamed from: Z */
    public final void m1960Z(int i3) throws C0839o {
        this.f3295O = i3;
        AbstractC0558V abstractC0558V = this.f3287G.f3431a;
        C0805P c0805p = this.f3327y;
        c0805p.f3373g = i3;
        if (!c0805p.m2032p(abstractC0558V)) {
            m1949N(true);
        }
        m1983l(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m1961a(C0794E c0794e, int i3) throws Throwable {
        this.f3288H.m1872f(1);
        C0816a0 c0816a0 = this.f3328z;
        if (i3 == -1) {
            i3 = c0816a0.f3416b.size();
        }
        m1985m(c0816a0.m2047a(i3, c0794e.f3267a, c0794e.f3268b), false);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1962a0(boolean z3) throws C0839o {
        this.f3296P = z3;
        AbstractC0558V abstractC0558V = this.f3287G.f3431a;
        C0805P c0805p = this.f3327y;
        c0805p.f3374h = z3;
        if (!c0805p.m2032p(abstractC0558V)) {
            m1949N(true);
        }
        m1983l(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m1963b(int i3) {
        AbstractC0827g abstractC0827g = this.f3309g[i3];
        if (m1937r(abstractC0827g)) {
            m1997x(i3, false);
            C0837m c0837m = this.f3323u;
            if (abstractC0827g == c0837m.f3559i) {
                c0837m.f3560j = null;
                c0837m.f3559i = null;
                c0837m.f3561k = true;
            }
            int i4 = abstractC0827g.f3484n;
            if (i4 == 2) {
                AbstractC0646n.m1630h(i4 == 2);
                abstractC0827g.f3484n = 1;
                abstractC0827g.mo2092s();
            }
            AbstractC0646n.m1630h(abstractC0827g.f3484n == 1);
            abstractC0827g.f3479i.m526n();
            abstractC0827g.f3484n = 0;
            abstractC0827g.f3485o = null;
            abstractC0827g.f3486p = null;
            abstractC0827g.f3490t = false;
            abstractC0827g.mo2086m();
            this.f3300T--;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1964b0(C1937c0 c1937c0) throws Throwable {
        this.f3288H.m1872f(1);
        C0816a0 c0816a0 = this.f3328z;
        int size = c0816a0.f3416b.size();
        if (c1937c0.f8486b.length != size) {
            c1937c0 = new C1937c0(new Random(c1937c0.f8485a.nextLong())).m4495a(size);
        }
        c0816a0.f3424j = c1937c0;
        m1985m(c0816a0.m2048b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:233:0x03df  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:322:0x0521  */
    /* JADX WARN: Code duplicated, block: B:371:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:381:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:383:0x0605  */
    /* JADX WARN: Code duplicated, block: B:385:0x060d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0611  */
    /* JADX WARN: Code duplicated, block: B:393:0x0623  */
    /* JADX WARN: Code duplicated, block: B:418:0x067d  */
    /* JADX WARN: Code duplicated, block: B:515:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:383:0x0605, please report this as an issue */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, k0.y] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k0.y] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.lang.Object, k0.y] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, k0.y] */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Object, k0.b0] */
    /* JADX INFO: renamed from: c */
    public final void m1965c() throws C0839o {
        long j3;
        boolean z3;
        boolean z4;
        C0839o c0839o;
        boolean z5;
        boolean z6;
        C0802M c0802m;
        C0833j c0833j;
        long j4;
        long j5;
        int i3;
        int i4;
        boolean zM1992s;
        boolean z7;
        boolean z8;
        int i5;
        C0802M c0802m2;
        C0805P c0805p;
        C0802M c0802m3;
        C0802M c0802m4;
        boolean z9;
        AbstractC0827g[] abstractC0827gArr;
        this.f3325w.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f3317o.m1699d(2);
        long j6 = -9223372036854775807L;
        if (this.f3287G.f3431a.m1415p() || !this.f3328z.f3425k) {
            j3 = -9223372036854775807L;
            z3 = true;
            z4 = false;
            c0839o = null;
        } else {
            C0805P c0805p2 = this.f3327y;
            long j7 = this.f3302V;
            C0802M c0802m5 = c0805p2.f3377k;
            if (c0802m5 != null) {
                AbstractC0646n.m1630h(c0802m5.f3350m == null);
                if (c0802m5.f3342e) {
                    c0802m5.f3338a.mo3774u(j7 - c0802m5.f3353p);
                }
            }
            C0805P c0805p3 = this.f3327y;
            C0802M c0802m6 = c0805p3.f3377k;
            if (c0802m6 == null || (!c0802m6.f3344g.f3362i && c0802m6.m2010g() && c0805p3.f3377k.f3344g.f3358e != -9223372036854775807L && c0805p3.f3379m < 100)) {
                C0805P c0805p4 = this.f3327y;
                long j8 = this.f3302V;
                C0818b0 c0818b0 = this.f3287G;
                C0802M c0802m7 = c0805p4.f3377k;
                C0803N c0803nM2021d = c0802m7 == null ? c0805p4.m2021d(c0818b0.f3431a, c0818b0.f3432b, c0818b0.f3433c, c0818b0.f3449s) : c0805p4.m2020c(c0818b0.f3431a, c0802m7, j8);
                if (c0803nM2021d != null) {
                    C0805P c0805p5 = this.f3327y;
                    C0802M c0802m8 = c0805p5.f3377k;
                    long j9 = c0802m8 == null ? 1000000000000L : (c0802m8.f3353p + c0802m8.f3344g.f3358e) - c0803nM2021d.f3355b;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= c0805p5.f3382p.size()) {
                            j3 = j6;
                            c0802m2 = null;
                            break;
                        }
                        C0803N c0803n = ((C0802M) c0805p5.f3382p.get(i6)).f3344g;
                        long j10 = c0803n.f3358e;
                        j3 = j6;
                        if ((j10 == j6 || j10 == c0803nM2021d.f3358e) && c0803n.f3355b == c0803nM2021d.f3355b && c0803n.f3354a.equals(c0803nM2021d.f3354a)) {
                            c0802m2 = (C0802M) c0805p5.f3382p.remove(i6);
                            break;
                        } else {
                            i6++;
                            j6 = j3;
                        }
                    }
                    if (c0802m2 == null) {
                        C0797H c0797h = (C0797H) c0805p5.f3371e.f148h;
                        C2065e c2065e = c0797h.f3315m.f3548a;
                        c0797h.f3308b0.getClass();
                        c0802m2 = new C0802M(c0797h.f3311i, j9, c0797h.f3313k, c2065e, c0797h.f3328z, c0803nM2021d, c0797h.f3314l);
                    } else {
                        c0802m2.f3344g = c0803nM2021d;
                        c0802m2.f3353p = j9;
                    }
                    C0802M c0802m9 = c0805p5.f3377k;
                    if (c0802m9 == null) {
                        c0805p5.f3375i = c0802m2;
                        c0805p5.f3376j = c0802m2;
                    } else if (c0802m2 != c0802m9.f3350m) {
                        c0802m9.m2005b();
                        c0802m9.f3350m = c0802m2;
                        c0802m9.m2006c();
                    }
                    c0805p5.f3380n = null;
                    c0805p5.f3377k = c0802m2;
                    c0805p5.f3379m++;
                    c0805p5.m2028k();
                    if (!c0802m2.f3341d) {
                        long j11 = c0803nM2021d.f3355b;
                        c0802m2.f3341d = true;
                        c0802m2.f3338a.mo3771q(this, j11);
                    } else if (c0802m2.f3342e) {
                        this.f3317o.m1697a(8, c0802m2.f3338a).m1695b();
                    }
                    if (this.f3327y.f3375i == c0802m2) {
                        m1946I(c0803nM2021d.f3355b);
                    }
                    m1983l(false);
                } else {
                    j3 = -9223372036854775807L;
                }
            } else {
                j3 = -9223372036854775807L;
            }
            if (this.f3294N) {
                this.f3294N = m1936q(this.f3327y.f3377k);
                m1978i0();
            } else {
                m1993t();
            }
            C0805P c0805p6 = this.f3327y;
            C0802M c0802m10 = c0805p6.f3376j;
            if (c0802m10 != null) {
                C0802M c0802m11 = c0802m10.f3350m;
                AbstractC0827g[] abstractC0827gArr2 = this.f3309g;
                if (c0802m11 == null || this.f3291K) {
                    if (c0802m10.f3344g.f3362i || this.f3291K) {
                        for (int i7 = 0; i7 < abstractC0827gArr2.length; i7++) {
                            AbstractC0827g abstractC0827g = abstractC0827gArr2[i7];
                            InterfaceC1931Z interfaceC1931Z = c0802m10.f3340c[i7];
                            if (interfaceC1931Z != null && abstractC0827g.f3485o == interfaceC1931Z && abstractC0827g.m2083j()) {
                                long j12 = c0802m10.f3344g.f3358e;
                                m1935S(abstractC0827g, (j12 == j3 || j12 == Long.MIN_VALUE) ? j3 : j12 + c0802m10.f3353p);
                            }
                        }
                    }
                } else if (c0802m10.f3342e) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= abstractC0827gArr2.length) {
                            C0802M c0802m12 = c0802m10.f3350m;
                            if (!c0802m12.f3342e && this.f3302V < c0802m12.m2008e()) {
                                break;
                            }
                            C2045v c2045v = c0802m10.f3352o;
                            C0802M c0802m13 = c0805p6.f3376j;
                            AbstractC0646n.m1631i(c0802m13);
                            c0805p6.f3376j = c0802m13.f3350m;
                            c0805p6.m2028k();
                            C0802M c0802m14 = c0805p6.f3376j;
                            AbstractC0646n.m1631i(c0802m14);
                            C2045v c2045v2 = c0802m14.f3352o;
                            AbstractC0558V abstractC0558V = this.f3287G.f3431a;
                            m1986m0(abstractC0558V, c0802m14.f3344g.f3354a, abstractC0558V, c0802m10.f3344g.f3354a, -9223372036854775807L, false);
                            if (c0802m14.f3342e && c0802m14.f3338a.mo3773s() != j3) {
                                long jM2008e = c0802m14.m2008e();
                                for (AbstractC0827g abstractC0827g2 : abstractC0827gArr2) {
                                    if (abstractC0827g2.f3485o != null) {
                                        m1935S(abstractC0827g2, jM2008e);
                                    }
                                }
                                if (!c0802m14.m2010g()) {
                                    c0805p6.m2029l(c0802m14);
                                    m1983l(false);
                                    m1993t();
                                    break;
                                }
                                break;
                            }
                            for (int i9 = 0; i9 < abstractC0827gArr2.length; i9++) {
                                boolean zM4619b = c2045v.m4619b(i9);
                                boolean zM4619b2 = c2045v2.m4619b(i9);
                                if (zM4619b && !abstractC0827gArr2[i9].f3490t) {
                                    boolean z10 = this.f3311i[i9].f3478h == -2;
                                    C0830h0 c0830h0 = c2045v.f8913b[i9];
                                    C0830h0 c0830h1 = c2045v2.f8913b[i9];
                                    if (!zM4619b2 || !c0830h1.equals(c0830h0) || z10) {
                                        m1935S(abstractC0827gArr2[i9], c0802m14.m2008e());
                                    }
                                }
                            }
                            break;
                        }
                        AbstractC0827g abstractC0827g3 = abstractC0827gArr2[i8];
                        InterfaceC1931Z interfaceC1931Z2 = c0802m10.f3340c[i8];
                        if (abstractC0827g3.f3485o != interfaceC1931Z2) {
                            break;
                        }
                        if (interfaceC1931Z2 != null && !abstractC0827g3.m2083j()) {
                            C0802M c0802m15 = c0802m10.f3350m;
                            if (!c0802m10.f3344g.f3359f || !c0802m15.f3342e || (!(abstractC0827g3 instanceof C2002d) && !(abstractC0827g3 instanceof C1747b) && abstractC0827g3.f3489s < c0802m15.m2008e())) {
                                break;
                            }
                        }
                        i8++;
                    }
                }
            }
            C0805P c0805p7 = this.f3327y;
            C0802M c0802m16 = c0805p7.f3376j;
            if (c0802m16 != null && c0805p7.f3375i != c0802m16 && !c0802m16.f3345h) {
                C2045v c2045v3 = c0802m16.f3352o;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    abstractC0827gArr = this.f3309g;
                    if (i10 >= abstractC0827gArr.length) {
                        break;
                    }
                    AbstractC0827g abstractC0827g4 = abstractC0827gArr[i10];
                    if (m1937r(abstractC0827g4)) {
                        InterfaceC1931Z interfaceC1931Z3 = abstractC0827g4.f3485o;
                        InterfaceC1931Z[] interfaceC1931ZArr = c0802m16.f3340c;
                        boolean z12 = interfaceC1931Z3 != interfaceC1931ZArr[i10];
                        if (!c2045v3.m4619b(i10) || z12) {
                            if (!abstractC0827g4.f3490t) {
                                InterfaceC2042s interfaceC2042s = c2045v3.f8914c[i10];
                                int length = interfaceC2042s != null ? interfaceC2042s.length() : 0;
                                C0583o[] c0583oArr = new C0583o[length];
                                for (int i11 = 0; i11 < length; i11++) {
                                    c0583oArr[i11] = interfaceC2042s.mo4428i(i11);
                                }
                                abstractC0827g4.m2096w(c0583oArr, interfaceC1931ZArr[i10], c0802m16.m2008e(), c0802m16.f3353p, c0802m16.f3344g.f3354a);
                                boolean z13 = this.f3299S;
                                if (z13 && z13) {
                                    this.f3299S = false;
                                    if (this.f3287G.f3446p) {
                                        this.f3317o.m1700e(2);
                                    }
                                }
                            } else if (abstractC0827g4.mo2084k()) {
                                m1963b(i10);
                            } else {
                                z11 = true;
                            }
                        }
                    }
                    i10++;
                }
                if (!z11) {
                    m1967d(new boolean[abstractC0827gArr.length], this.f3327y.f3376j.m2008e());
                }
            }
            boolean z14 = false;
            while (m1968d0() && !this.f3291K && (c0802m3 = (c0805p = this.f3327y).f3375i) != null && (c0802m4 = c0802m3.f3350m) != null && this.f3302V >= c0802m4.m2008e() && c0802m4.f3345h) {
                if (z14) {
                    m1995v();
                }
                C0802M c0802mM2018a = c0805p.m2018a();
                c0802mM2018a.getClass();
                if (this.f3287G.f3432b.f8311a.equals(c0802mM2018a.f3344g.f3354a.f8311a)) {
                    C1907A c1907a = this.f3287G.f3432b;
                    if (c1907a.f8312b == -1) {
                        C1907A c1907a2 = c0802mM2018a.f3344g.f3354a;
                        if (c1907a2.f8312b != -1 || c1907a.f8315e == c1907a2.f8315e) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                C0803N c0803n2 = c0802mM2018a.f3344g;
                C1907A c1907a3 = c0803n2.f3354a;
                boolean z15 = z9;
                long j13 = c0803n2.f3355b;
                this.f3287G = m1991p(c1907a3, j13, c0803n2.f3356c, j13, !z15, 0);
                m1945H();
                m1984l0();
                if (this.f3287G.f3435e == 3) {
                    m1972f0();
                }
                C2045v c2045v4 = c0805p.f3375i.f3352o;
                int i12 = 0;
                while (true) {
                    AbstractC0827g[] abstractC0827gArr3 = this.f3309g;
                    if (i12 < abstractC0827gArr3.length) {
                        if (c2045v4.m4619b(i12)) {
                            abstractC0827gArr3[i12].mo2080g();
                        }
                        i12++;
                    }
                }
                z14 = true;
            }
            z3 = true;
            z4 = false;
            c0839o = null;
            this.f3308b0.getClass();
        }
        int i13 = this.f3287G.f3435e;
        if (i13 == z3 || i13 == 4) {
            return;
        }
        C0802M c0802m17 = this.f3327y.f3375i;
        if (c0802m17 == null) {
            m1948M(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        m1984l0();
        if (c0802m17.f3342e) {
            this.f3325w.getClass();
            this.f3303W = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
            c0802m17.f3338a.mo3770o(this.f3287G.f3449s - this.f3322t);
            boolean z16 = true;
            z5 = true;
            int i14 = 0;
            while (true) {
                AbstractC0827g[] abstractC0827gArr4 = this.f3309g;
                if (i14 >= abstractC0827gArr4.length) {
                    break;
                }
                AbstractC0827g abstractC0827g5 = abstractC0827gArr4[i14];
                if (m1937r(abstractC0827g5)) {
                    boolean z17 = z16;
                    abstractC0827g5.mo2095v(this.f3302V, this.f3303W);
                    boolean z18 = z17 && abstractC0827g5.mo2084k();
                    boolean z19 = c0802m17.f3340c[i14] != abstractC0827g5.f3485o;
                    boolean z20 = z19 || (!z19 && abstractC0827g5.m2083j()) || abstractC0827g5.mo2085l() || abstractC0827g5.mo2084k();
                    m1997x(i14, z20);
                    z5 = z5 && z20;
                    if (!z20) {
                        m1996w(i14);
                    }
                    z16 = z18;
                } else {
                    m1997x(i14, z4);
                }
                i14++;
            }
            z6 = z16;
        } else {
            c0802m17.f3338a.mo3768j();
            z5 = true;
            z6 = true;
        }
        long j14 = c0802m17.f3344g.f3358e;
        boolean z21 = z6 && c0802m17.f3342e && (j14 == j3 || j14 <= this.f3287G.f3449s);
        if (z21 && this.f3291K) {
            this.f3291K = z4;
            m1957W(this.f3287G.f3444n, 5, z4, z4);
        }
        if (z21 && c0802m17.f3344g.f3362i) {
            m1966c0(4);
            m1976h0();
        } else {
            C0818b0 c0818b1 = this.f3287G;
            if (c0818b1.f3435e == 2) {
                if (this.f3300T == 0) {
                    zM1992s = m1992s();
                } else if (z5) {
                    if (c0818b1.f3437g) {
                        C0805P c0805p8 = this.f3327y;
                        long j15 = m1970e0(c0818b1.f3431a, c0805p8.f3375i.f3344g.f3354a) ? this.f3281A.f3534h : j3;
                        C0802M c0802m18 = c0805p8.f3377k;
                        boolean z22 = c0802m18.m2010g() && c0802m18.f3344g.f3362i;
                        boolean z23 = c0802m18.f3344g.f3354a.m4422b() && !c0802m18.f3342e;
                        if (!z22 && !z23) {
                            long jM1977i = m1977i(c0802m18.m2007d());
                            AbstractC0558V abstractC0558V2 = this.f3287G.f3431a;
                            float f = this.f3323u.mo2003f().f1949a;
                            boolean z24 = this.f3287G.f3442l;
                            boolean z25 = this.f3292L;
                            C0836l c0836l = this.f3315m;
                            c0836l.getClass();
                            long jM1607z = AbstractC0632A.m1607z(jM1977i, f);
                            long jMin = z25 ? c0836l.f3552e : c0836l.f3551d;
                            if (j15 != j3) {
                                jMin = Math.min(j15 / 2, jMin);
                            }
                            if (jMin > 0 && jM1607z < jMin) {
                                C2065e c2065e2 = c0836l.f3548a;
                                synchronized (c2065e2) {
                                    i4 = c2065e2.f8967d * c2065e2.f8965b;
                                }
                                if (i4 < c0836l.m2107b()) {
                                    zM1992s = false;
                                }
                            }
                        }
                    }
                    zM1992s = true;
                } else {
                    zM1992s = false;
                }
                if (zM1992s) {
                    m1966c0(3);
                    this.f3306Z = c0839o;
                    if (m1968d0()) {
                        m1988n0(z4, z4);
                        C0837m c0837m = this.f3323u;
                        c0837m.f3562l = z3;
                        c0837m.f3557g.m2105e();
                        m1972f0();
                    }
                } else if (this.f3287G.f3435e == 3) {
                    m1988n0(m1968d0(), z4);
                    m1966c0(2);
                    if (this.f3292L) {
                        for (c0802m = this.f3327y.f3375i; c0802m != null; c0802m = c0802m.f3350m) {
                            for (InterfaceC2042s interfaceC2042s2 : c0802m.f3352o.f8914c) {
                                if (interfaceC2042s2 != null) {
                                    interfaceC2042s2.mo4436r();
                                }
                            }
                        }
                        c0833j = this.f3281A;
                        j4 = c0833j.f3534h;
                        if (j4 != j3) {
                            long j16 = j4 + c0833j.f3528b;
                            c0833j.f3534h = j16;
                            j5 = c0833j.f3533g;
                            if (j5 != j3) {
                                c0833j.f3534h = j5;
                            }
                            c0833j.f3538l = j3;
                        }
                    }
                    m1976h0();
                }
            } else if (this.f3287G.f3435e == 3 && (this.f3300T != 0 ? !z5 : !m1992s())) {
                m1988n0(m1968d0(), z4);
                m1966c0(2);
                if (this.f3292L) {
                    while (c0802m != null) {
                        while (i3 < r5) {
                            if (interfaceC2042s2 != null) {
                                interfaceC2042s2.mo4436r();
                            }
                        }
                    }
                    c0833j = this.f3281A;
                    j4 = c0833j.f3534h;
                    if (j4 != j3) {
                        long j17 = j4 + c0833j.f3528b;
                        c0833j.f3534h = j17;
                        j5 = c0833j.f3533g;
                        if (j5 != j3 && j17 > j5) {
                            c0833j.f3534h = j5;
                        }
                        c0833j.f3538l = j3;
                    }
                }
                m1976h0();
            }
        }
        if (this.f3287G.f3435e == 2) {
            int i15 = 0;
            while (true) {
                AbstractC0827g[] abstractC0827gArr5 = this.f3309g;
                if (i15 >= abstractC0827gArr5.length) {
                    break;
                }
                if (m1937r(abstractC0827gArr5[i15]) && this.f3309g[i15].f3485o == c0802m17.f3340c[i15]) {
                    m1996w(i15);
                }
                i15++;
            }
            C0818b0 c0818b2 = this.f3287G;
            if (c0818b2.f3437g || c0818b2.f3448r >= 500000 || !m1936q(this.f3327y.f3377k)) {
                z7 = false;
            } else {
                z7 = true;
            }
        } else {
            z7 = false;
        }
        if (!z7) {
            this.f3307a0 = -9223372036854775807L;
        } else if (this.f3307a0 == -9223372036854775807L) {
            this.f3325w.getClass();
            this.f3307a0 = SystemClock.elapsedRealtime();
        } else {
            this.f3325w.getClass();
            if (SystemClock.elapsedRealtime() - this.f3307a0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z26 = m1968d0() && this.f3287G.f3435e == 3;
        if (!this.f3299S || !this.f3298R || !z26) {
            z3 = false;
        }
        C0818b0 c0818b3 = this.f3287G;
        if (c0818b3.f3446p != z3) {
            z8 = z3;
            this.f3287G = new C0818b0(c0818b3.f3431a, c0818b3.f3432b, c0818b3.f3433c, c0818b3.f3434d, c0818b3.f3435e, c0818b3.f3436f, c0818b3.f3437g, c0818b3.f3438h, c0818b3.f3439i, c0818b3.f3440j, c0818b3.f3441k, c0818b3.f3442l, c0818b3.f3443m, c0818b3.f3444n, c0818b3.f3445o, c0818b3.f3447q, c0818b3.f3448r, c0818b3.f3449s, c0818b3.f3450t, z8);
            z4 = false;
        } else {
            z8 = z3;
        }
        this.f3298R = z4;
        if (!z8 && (i5 = this.f3287G.f3435e) != 4 && (z26 || i5 == 2 || (i5 == 3 && this.f3300T != 0))) {
            m1948M(jUptimeMillis);
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1966c0(int i3) {
        C0818b0 c0818b0 = this.f3287G;
        if (c0818b0.f3435e != i3) {
            if (i3 != 2) {
                this.f3307a0 = -9223372036854775807L;
            }
            this.f3287G = c0818b0.m2067g(i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX INFO: renamed from: d */
    public final void m1967d(boolean[] zArr, long j3) throws C0839o {
        AbstractC0827g[] abstractC0827gArr;
        Set set;
        C0805P c0805p;
        InterfaceC0801L interfaceC0801L;
        C0805P c0805p2 = this.f3327y;
        C0802M c0802m = c0805p2.f3376j;
        C2045v c2045v = c0802m.f3352o;
        int i3 = 0;
        while (true) {
            abstractC0827gArr = this.f3309g;
            int length = abstractC0827gArr.length;
            set = this.f3310h;
            if (i3 >= length) {
                break;
            }
            if (!c2045v.m4619b(i3) && set.remove(abstractC0827gArr[i3])) {
                abstractC0827gArr[i3].m2097x();
            }
            i3++;
        }
        int i4 = 0;
        while (i4 < abstractC0827gArr.length) {
            if (c2045v.m4619b(i4)) {
                boolean z3 = zArr[i4];
                AbstractC0827g abstractC0827g = abstractC0827gArr[i4];
                if (m1937r(abstractC0827g)) {
                    c0805p = c0805p2;
                } else {
                    C0802M c0802m2 = c0805p2.f3376j;
                    boolean z4 = c0802m2 == c0805p2.f3375i;
                    C2045v c2045v2 = c0802m2.f3352o;
                    C0830h0 c0830h0 = c2045v2.f8913b[i4];
                    InterfaceC2042s interfaceC2042s = c2045v2.f8914c[i4];
                    int length2 = interfaceC2042s != null ? interfaceC2042s.length() : 0;
                    C0583o[] c0583oArr = new C0583o[length2];
                    for (int i5 = 0; i5 < length2; i5++) {
                        c0583oArr[i5] = interfaceC2042s.mo4428i(i5);
                    }
                    boolean z5 = m1968d0() && this.f3287G.f3435e == 3;
                    boolean z6 = !z3 && z5;
                    this.f3300T++;
                    set.add(abstractC0827g);
                    InterfaceC1931Z interfaceC1931Z = c0802m2.f3340c[i4];
                    c0805p = c0805p2;
                    long j4 = c0802m2.f3353p;
                    C0803N c0803n = c0802m2.f3344g;
                    AbstractC0646n.m1630h(abstractC0827g.f3484n == 0);
                    abstractC0827g.f3480j = c0830h0;
                    abstractC0827g.f3484n = 1;
                    abstractC0827g.mo2087n(z6, z4);
                    boolean z7 = z4;
                    abstractC0827g.m2096w(c0583oArr, interfaceC1931Z, j3, j4, c0803n.f3354a);
                    abstractC0827g.f3490t = false;
                    abstractC0827g.f3488r = j3;
                    abstractC0827g.f3489s = j3;
                    abstractC0827g.mo2088o(j3, z6);
                    abstractC0827g.mo1903c(11, new C0793D(this));
                    C0837m c0837m = this.f3323u;
                    c0837m.getClass();
                    InterfaceC0801L interfaceC0801LMo2081h = abstractC0827g.mo2081h();
                    if (interfaceC0801LMo2081h != null && interfaceC0801LMo2081h != (interfaceC0801L = c0837m.f3560j)) {
                        if (interfaceC0801L != null) {
                            throw new C0839o(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c0837m.f3560j = interfaceC0801LMo2081h;
                        c0837m.f3559i = abstractC0827g;
                        ((C1120B) interfaceC0801LMo2081h).mo2002d((C0548K) c0837m.f3557g.f3545k);
                    }
                    if (z5 && z7) {
                        AbstractC0646n.m1630h(abstractC0827g.f3484n == 1);
                        abstractC0827g.f3484n = 2;
                        abstractC0827g.mo2091r();
                    }
                }
            } else {
                c0805p = c0805p2;
            }
            i4++;
            c0805p2 = c0805p;
        }
        c0802m.f3345h = true;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m1968d0() {
        C0818b0 c0818b0 = this.f3287G;
        return c0818b0.f3442l && c0818b0.f3444n == 0;
    }

    @Override // p114k0.InterfaceC1964x
    /* JADX INFO: renamed from: e */
    public final void mo1969e(InterfaceC1965y interfaceC1965y) {
        this.f3317o.m1697a(8, interfaceC1965y).m1695b();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m1970e0(AbstractC0558V abstractC0558V, C1907A c1907a) {
        if (c1907a.m4422b() || abstractC0558V.m1415p()) {
            return false;
        }
        int i3 = abstractC0558V.mo1410g(c1907a.f8311a, this.f3321s).f1968c;
        C0557U c0557u = this.f3320r;
        abstractC0558V.m1414n(i3, c0557u);
        return c0557u.m1404a() && c0557u.f1983i && c0557u.f1980f != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public final long m1971f(AbstractC0558V abstractC0558V, Object obj, long j3) {
        C0556T c0556t = this.f3321s;
        int i3 = abstractC0558V.mo1410g(obj, c0556t).f1968c;
        C0557U c0557u = this.f3320r;
        abstractC0558V.m1414n(i3, c0557u);
        if (c0557u.f1980f == -9223372036854775807L || !c0557u.m1404a() || !c0557u.f1983i) {
            return -9223372036854775807L;
        }
        long j4 = c0557u.f1981g;
        return AbstractC0632A.m1571L((j4 == -9223372036854775807L ? System.currentTimeMillis() : j4 + SystemClock.elapsedRealtime()) - c0557u.f1980f) - (j3 + c0556t.f1970e);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1972f0() {
        C0802M c0802m = this.f3327y.f3375i;
        if (c0802m == null) {
            return;
        }
        C2045v c2045v = c0802m.f3352o;
        int i3 = 0;
        while (true) {
            AbstractC0827g[] abstractC0827gArr = this.f3309g;
            if (i3 >= abstractC0827gArr.length) {
                return;
            }
            if (c2045v.m4619b(i3)) {
                AbstractC0827g abstractC0827g = abstractC0827gArr[i3];
                int i4 = abstractC0827g.f3484n;
                if (i4 == 1) {
                    AbstractC0646n.m1630h(i4 == 1);
                    abstractC0827g.f3484n = 2;
                    abstractC0827g.mo2091r();
                }
            }
            i3++;
        }
    }

    @Override // p114k0.InterfaceC1933a0
    /* JADX INFO: renamed from: g */
    public final void mo1973g(InterfaceC1935b0 interfaceC1935b0) {
        this.f3317o.m1697a(9, (InterfaceC1965y) interfaceC1935b0).m1695b();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1974g0(boolean z3, boolean z4) {
        m1944G(z3 || !this.f3297Q, false, true, false);
        this.f3288H.m1872f(z4 ? 1 : 0);
        C0836l c0836l = this.f3315m;
        if (c0836l.f3555h.remove(this.f3283C) != null) {
            c0836l.m2109d();
        }
        m1966c0(1);
    }

    /* JADX INFO: renamed from: h */
    public final Pair m1975h(AbstractC0558V abstractC0558V) {
        long j3 = 0;
        if (abstractC0558V.m1415p()) {
            return Pair.create(C0818b0.f3430u, 0L);
        }
        Pair pairM1411i = abstractC0558V.m1411i(this.f3320r, this.f3321s, abstractC0558V.mo1406a(this.f3296P), -9223372036854775807L);
        C1907A c1907aM2030n = this.f3327y.m2030n(abstractC0558V, pairM1411i.first, 0L);
        long jLongValue = ((Long) pairM1411i.second).longValue();
        if (c1907aM2030n.m4422b()) {
            Object obj = c1907aM2030n.f8311a;
            C0556T c0556t = this.f3321s;
            abstractC0558V.mo1410g(obj, c0556t);
            if (c1907aM2030n.f8313c == c0556t.m1400e(c1907aM2030n.f8312b)) {
                c0556t.f1972g.getClass();
            }
        } else {
            j3 = jLongValue;
        }
        return Pair.create(c1907aM2030n, Long.valueOf(j3));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1976h0() {
        int i3;
        C0837m c0837m = this.f3323u;
        c0837m.f3562l = false;
        C0834j0 c0834j0 = c0837m.f3557g;
        if (c0834j0.f3543i) {
            c0834j0.m2104c(c0834j0.mo2001b());
            c0834j0.f3543i = false;
        }
        for (AbstractC0827g abstractC0827g : this.f3309g) {
            if (m1937r(abstractC0827g) && (i3 = abstractC0827g.f3484n) == 2) {
                AbstractC0646n.m1630h(i3 == 2);
                abstractC0827g.f3484n = 1;
                abstractC0827g.mo2092s();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z3;
        boolean z4;
        C0802M c0802m;
        int i3;
        C0802M c0802m2;
        int i4 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z5 = message.arg1 != 0;
                    int i5 = message.arg2;
                    m1957W(i5 >> 4, i5 & 15, z5, true);
                    break;
                case 2:
                    m1965c();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    m1950O((C0796G) message.obj);
                    break;
                case 4:
                    m1958X((C0548K) message.obj);
                    break;
                case 5:
                    this.f3286F = (C0832i0) message.obj;
                    break;
                case 6:
                    m1974g0(false, true);
                    break;
                case 7:
                    m1940C();
                    return true;
                case 8:
                    m1987n((InterfaceC1965y) message.obj);
                    break;
                case 9:
                    m1979j((InterfaceC1965y) message.obj);
                    break;
                case 10:
                    m1943F();
                    break;
                case 11:
                    m1960Z(message.arg1);
                    break;
                case 12:
                    m1962a0(message.arg1 != 0);
                    break;
                case 13:
                    m1954T(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C0824e0 c0824e0 = (C0824e0) message.obj;
                    c0824e0.getClass();
                    m1952Q(c0824e0);
                    break;
                case 15:
                    m1953R((C0824e0) message.obj);
                    break;
                case 16:
                    C0548K c0548k = (C0548K) message.obj;
                    m1989o(c0548k, c0548k.f1949a, true, false);
                    break;
                case 17:
                    m1955U((C0794E) message.obj);
                    break;
                case 18:
                    m1961a((C0794E) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC0462h.m1169i(message.obj);
                    m1999z();
                    throw null;
                case 20:
                    m1942E(message.arg1, message.arg2, (C1937c0) message.obj);
                    break;
                case 21:
                    m1964b0((C1937c0) message.obj);
                    break;
                case 22:
                    m1998y();
                    break;
                case 23:
                    m1956V(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m1943F();
                    m1949N(true);
                    break;
                case 26:
                    m1943F();
                    m1949N(true);
                    break;
                case 27:
                    m1982k0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m1959Y((C0843s) message.obj);
                    break;
                case 29:
                    m1938A();
                    break;
            }
        } catch (C0546I e3) {
            boolean z6 = e3.f1944g;
            int i6 = e3.f1945h;
            if (i6 == 1) {
                i4 = z6 ? 3001 : 3003;
            } else if (i6 == 4) {
                i4 = z6 ? 3002 : 3004;
            }
            m1981k(e3, i4);
        } catch (C0712i e4) {
            m1981k(e4, e4.f2721g);
        } catch (C0839o e5) {
            e = e5;
            int i7 = e.f3565i;
            C0805P c0805p = this.f3327y;
            if (i7 == 1 && (c0802m2 = c0805p.f3376j) != null) {
                e = new C0839o(e.getMessage(), e.getCause(), e.f1946g, e.f3565i, e.f3566j, e.f3567k, e.f3568l, e.f3569m, c0802m2.f3344g.f3354a, e.f1947h, e.f3571o);
            }
            if (e.f3571o && (this.f3306Z == null || (i3 = e.f1946g) == 5004 || i3 == 5003)) {
                AbstractC0646n.m1648z("ExoPlayerImplInternal", "Recoverable renderer error", e);
                C0839o c0839o = this.f3306Z;
                if (c0839o != null) {
                    c0839o.addSuppressed(e);
                    e = this.f3306Z;
                } else {
                    this.f3306Z = e;
                }
                C0655w c0655w = this.f3317o;
                C0654v c0654vM1697a = c0655w.m1697a(25, e);
                c0655w.getClass();
                Message message2 = c0654vM1697a.f2527a;
                message2.getClass();
                c0655w.f2529a.sendMessageAtFrontOfQueue(message2);
                c0654vM1697a.m1694a();
            } else {
                C0839o c0839o2 = this.f3306Z;
                if (c0839o2 != null) {
                    c0839o2.addSuppressed(e);
                    e = this.f3306Z;
                }
                AbstractC0646n.m1636n("ExoPlayerImplInternal", "Playback error", e);
                z3 = true;
                if (e.f3565i == 1) {
                    if (c0805p.f3375i != c0805p.f3376j) {
                        while (true) {
                            c0802m = c0805p.f3375i;
                            if (c0802m == c0805p.f3376j) {
                                break;
                            }
                            c0805p.m2018a();
                        }
                        c0802m.getClass();
                        m1995v();
                        C0803N c0803n = c0802m.f3344g;
                        C1907A c1907a = c0803n.f3354a;
                        long j3 = c0803n.f3355b;
                        this.f3287G = m1991p(c1907a, j3, c0803n.f3356c, j3, true, 0);
                    }
                    z4 = false;
                    z3 = true;
                } else {
                    z4 = false;
                }
                m1974g0(z3, z4);
                this.f3287G = this.f3287G.m2065e(e);
            }
            m1995v();
            return z3;
        } catch (C1383g e6) {
            m1981k(e6, e6.f6176g);
        } catch (RuntimeException e7) {
            C0839o c0839o3 = new C0839o(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC0646n.m1636n("ExoPlayerImplInternal", "Playback error", c0839o3);
            m1974g0(true, false);
            this.f3287G = this.f3287G.m2065e(c0839o3);
        } catch (C1934b e8) {
            m1981k(e8, 1002);
        } catch (IOException e9) {
            m1981k(e9, 2000);
        }
        z3 = true;
        m1995v();
        return z3;
    }

    /* JADX INFO: renamed from: i */
    public final long m1977i(long j3) {
        C0802M c0802m = this.f3327y.f3377k;
        if (c0802m == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f3302V - c0802m.f3353p));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k0.b0] */
    /* JADX INFO: renamed from: i0 */
    public final void m1978i0() {
        C0802M c0802m = this.f3327y.f3377k;
        boolean z3 = this.f3294N || (c0802m != null && c0802m.f3338a.mo3759a());
        C0818b0 c0818b0 = this.f3287G;
        if (z3 != c0818b0.f3437g) {
            this.f3287G = new C0818b0(c0818b0.f3431a, c0818b0.f3432b, c0818b0.f3433c, c0818b0.f3434d, c0818b0.f3435e, c0818b0.f3436f, z3, c0818b0.f3438h, c0818b0.f3439i, c0818b0.f3440j, c0818b0.f3441k, c0818b0.f3442l, c0818b0.f3443m, c0818b0.f3444n, c0818b0.f3445o, c0818b0.f3447q, c0818b0.f3448r, c0818b0.f3449s, c0818b0.f3450t, c0818b0.f3446p);
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, k0.b0] */
    /* JADX INFO: renamed from: j */
    public final void m1979j(InterfaceC1965y interfaceC1965y) {
        C0805P c0805p = this.f3327y;
        C0802M c0802m = c0805p.f3377k;
        if (c0802m == null || c0802m.f3338a != interfaceC1965y) {
            C0802M c0802m2 = c0805p.f3378l;
            if (c0802m2 == null || c0802m2.f3338a != interfaceC1965y) {
                return;
            }
            m1994u();
            return;
        }
        long j3 = this.f3302V;
        if (c0802m != null) {
            AbstractC0646n.m1630h(c0802m.f3350m == null);
            if (c0802m.f3342e) {
                c0802m.f3338a.mo3774u(j3 - c0802m.f3353p);
            }
        }
        m1993t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: j0 */
    public final void m1980j0(C2045v c2045v) {
        C0802M c0802m = this.f3327y.f3377k;
        c0802m.getClass();
        m1977i(c0802m.m2007d());
        if (m1970e0(this.f3287G.f3431a, c0802m.f3344g.f3354a)) {
            long j3 = this.f3281A.f3534h;
        }
        AbstractC0558V abstractC0558V = this.f3287G.f3431a;
        float f = this.f3323u.mo2003f().f1949a;
        boolean z3 = this.f3287G.f3442l;
        InterfaceC2042s[] interfaceC2042sArr = c2045v.f8914c;
        C0836l c0836l = this.f3315m;
        C0835k c0835k = (C0835k) c0836l.f3555h.get(this.f3283C);
        c0835k.getClass();
        int iMax = c0836l.f3553f;
        if (iMax == -1) {
            int length = interfaceC2042sArr.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 13107200;
                if (i3 < length) {
                    InterfaceC2042s interfaceC2042s = interfaceC2042sArr[i3];
                    if (interfaceC2042s != null) {
                        switch (interfaceC2042s.mo4424b().f1994c) {
                            case -2:
                                i5 = 0;
                                i4 += i5;
                                break;
                            case -1:
                            case 1:
                                i4 += i5;
                                break;
                            case 0:
                                i5 = 144310272;
                                i4 += i5;
                                break;
                            case 2:
                                i5 = 131072000;
                                i4 += i5;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            case 4:
                            case 5:
                            case 6:
                                i5 = 131072;
                                i4 += i5;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i3++;
                } else {
                    iMax = Math.max(13107200, i4);
                }
            }
        }
        c0835k.f3547b = iMax;
        c0836l.m2109d();
    }

    /* JADX INFO: renamed from: k */
    public final void m1981k(IOException iOException, int i3) {
        C0839o c0839o = new C0839o(0, iOException, i3);
        C0802M c0802m = this.f3327y.f3375i;
        if (c0802m != null) {
            C0803N c0803n = c0802m.f3344g;
            c0839o = new C0839o(c0839o.getMessage(), c0839o.getCause(), c0839o.f1946g, c0839o.f3565i, c0839o.f3566j, c0839o.f3567k, c0839o.f3568l, c0839o.f3569m, c0803n.f3354a, c0839o.f1947h, c0839o.f3571o);
        }
        AbstractC0646n.m1636n("ExoPlayerImplInternal", "Playback error", c0839o);
        m1974g0(false, false);
        this.f3287G = this.f3287G.m2065e(c0839o);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m1982k0(int i3, int i4, List list) throws Throwable {
        this.f3288H.m1872f(1);
        C0816a0 c0816a0 = this.f3328z;
        c0816a0.getClass();
        ArrayList arrayList = c0816a0.f3416b;
        AbstractC0646n.m1625c(i3 >= 0 && i3 <= i4 && i4 <= arrayList.size());
        AbstractC0646n.m1625c(list.size() == i4 - i3);
        for (int i5 = i3; i5 < i4; i5++) {
            ((C0814Z) arrayList.get(i5)).f3407a.mo3782r((C0539B) list.get(i5 - i3));
        }
        m1985m(c0816a0.m2048b(), false);
    }

    /* JADX INFO: renamed from: l */
    public final void m1983l(boolean z3) {
        C0802M c0802m = this.f3327y.f3377k;
        C1907A c1907a = c0802m == null ? this.f3287G.f3432b : c0802m.f3344g.f3354a;
        boolean zEquals = this.f3287G.f3441k.equals(c1907a);
        if (!zEquals) {
            this.f3287G = this.f3287G.m2062b(c1907a);
        }
        C0818b0 c0818b0 = this.f3287G;
        c0818b0.f3447q = c0802m == null ? c0818b0.f3449s : c0802m.m2007d();
        C0818b0 c0818b1 = this.f3287G;
        c0818b1.f3448r = m1977i(c0818b1.f3447q);
        if ((!zEquals || z3) && c0802m != null && c0802m.f3342e) {
            m1980j0(c0802m.f3352o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, k0.y] */
    /* JADX INFO: renamed from: l0 */
    public final void m1984l0() {
        long j3;
        int i3;
        C0548K c0548kMo2003f;
        long j4;
        float f;
        C0802M c0802m = this.f3327y.f3375i;
        if (c0802m == null) {
            return;
        }
        long jMo3773s = c0802m.f3342e ? c0802m.f3338a.mo3773s() : -9223372036854775807L;
        if (jMo3773s != -9223372036854775807L) {
            if (!c0802m.m2010g()) {
                this.f3327y.m2029l(c0802m);
                m1983l(false);
                m1993t();
            }
            m1946I(jMo3773s);
            if (jMo3773s != this.f3287G.f3449s) {
                C0818b0 c0818b0 = this.f3287G;
                j3 = -9223372036854775807L;
                i3 = 16;
                this.f3287G = m1991p(c0818b0.f3432b, jMo3773s, c0818b0.f3433c, jMo3773s, true, 5);
            } else {
                j3 = -9223372036854775807L;
                i3 = 16;
            }
        } else {
            j3 = -9223372036854775807L;
            i3 = 16;
            C0837m c0837m = this.f3323u;
            boolean z3 = c0802m != this.f3327y.f3376j;
            AbstractC0827g abstractC0827g = c0837m.f3559i;
            C0834j0 c0834j0 = c0837m.f3557g;
            if (abstractC0827g == null || abstractC0827g.mo2084k() || ((z3 && c0837m.f3559i.f3484n != 2) || (!c0837m.f3559i.mo2085l() && (z3 || c0837m.f3559i.m2083j())))) {
                c0837m.f3561k = true;
                if (c0837m.f3562l) {
                    c0834j0.m2105e();
                }
            } else {
                InterfaceC0801L interfaceC0801L = c0837m.f3560j;
                interfaceC0801L.getClass();
                long jMo2001b = interfaceC0801L.mo2001b();
                if (!c0837m.f3561k) {
                    c0834j0.m2104c(jMo2001b);
                    c0548kMo2003f = interfaceC0801L.mo2003f();
                    if (!c0548kMo2003f.equals((C0548K) c0834j0.f3545k)) {
                        c0834j0.mo2002d(c0548kMo2003f);
                        c0837m.f3558h.f3317o.m1697a(16, c0548kMo2003f).m1695b();
                    }
                } else if (jMo2001b >= c0834j0.mo2001b()) {
                    c0837m.f3561k = false;
                    if (c0837m.f3562l) {
                        c0834j0.m2105e();
                    }
                    c0834j0.m2104c(jMo2001b);
                    c0548kMo2003f = interfaceC0801L.mo2003f();
                    if (!c0548kMo2003f.equals((C0548K) c0834j0.f3545k)) {
                        c0834j0.mo2002d(c0548kMo2003f);
                        c0837m.f3558h.f3317o.m1697a(16, c0548kMo2003f).m1695b();
                    }
                } else if (c0834j0.f3543i) {
                    c0834j0.m2104c(c0834j0.mo2001b());
                    c0834j0.f3543i = false;
                }
            }
            long jMo2001b2 = c0837m.mo2001b();
            this.f3302V = jMo2001b2;
            long j5 = jMo2001b2 - c0802m.f3353p;
            long j6 = this.f3287G.f3449s;
            if (!this.f3324v.isEmpty() && !this.f3287G.f3432b.m4422b()) {
                if (this.f3305Y) {
                    this.f3305Y = false;
                }
                C0818b0 c0818b1 = this.f3287G;
                c0818b1.f3431a.mo1328b(c0818b1.f3432b.f8311a);
                int iMin = Math.min(this.f3304X, this.f3324v.size());
                if (iMin > 0 && this.f3324v.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.f3324v.size() && this.f3324v.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.f3304X = iMin;
            }
            if (this.f3323u.mo2000a()) {
                boolean z4 = !this.f3288H.f3099d;
                C0818b0 c0818b2 = this.f3287G;
                this.f3287G = m1991p(c0818b2.f3432b, j5, c0818b2.f3433c, j5, z4, 6);
            } else {
                C0818b0 c0818b3 = this.f3287G;
                c0818b3.f3449s = j5;
                c0818b3.f3450t = SystemClock.elapsedRealtime();
            }
        }
        this.f3287G.f3447q = this.f3327y.f3377k.m2007d();
        C0818b0 c0818b4 = this.f3287G;
        c0818b4.f3448r = m1977i(c0818b4.f3447q);
        C0818b0 c0818b5 = this.f3287G;
        if (c0818b5.f3442l && c0818b5.f3435e == 3 && m1970e0(c0818b5.f3431a, c0818b5.f3432b)) {
            C0818b0 c0818b6 = this.f3287G;
            if (c0818b6.f3445o.f1949a == 1.0f) {
                C0833j c0833j = this.f3281A;
                long jM1971f = m1971f(c0818b6.f3431a, c0818b6.f3432b.f8311a, c0818b6.f3449s);
                long j7 = this.f3287G.f3448r;
                if (c0833j.f3529c != j3) {
                    long j8 = jM1971f - j7;
                    long j9 = c0833j.f3539m;
                    if (j9 == j3) {
                        c0833j.f3539m = j8;
                        c0833j.f3540n = 0L;
                    } else {
                        long jMax = Math.max(j8, (long) ((j8 * 9.999871E-4f) + (j9 * 0.999f)));
                        c0833j.f3539m = jMax;
                        c0833j.f3540n = (long) ((9.999871E-4f * Math.abs(j8 - jMax)) + (c0833j.f3540n * 0.999f));
                    }
                    if (c0833j.f3538l != j3) {
                        j4 = 1000;
                        f = SystemClock.elapsedRealtime() - c0833j.f3538l < 1000 ? c0833j.f3537k : 1.0f;
                    } else {
                        j4 = 1000;
                    }
                    c0833j.f3538l = SystemClock.elapsedRealtime();
                    long j10 = (c0833j.f3540n * 3) + c0833j.f3539m;
                    if (c0833j.f3534h > j10) {
                        float fM1571L = AbstractC0632A.m1571L(j4);
                        long[] jArr = {j10, c0833j.f3531e, c0833j.f3534h - (((long) ((c0833j.f3537k - 1.0f) * fM1571L)) + ((long) ((c0833j.f3535i - 1.0f) * fM1571L)))};
                        long j11 = jArr[0];
                        for (int i4 = 1; i4 < 3; i4++) {
                            long j12 = jArr[i4];
                            if (j12 > j11) {
                                j11 = j12;
                            }
                        }
                        c0833j.f3534h = j11;
                    } else {
                        long jM1591j = AbstractC0632A.m1591j(jM1971f - ((long) (Math.max(0.0f, c0833j.f3537k - 1.0f) / 1.0E-7f)), c0833j.f3534h, j10);
                        c0833j.f3534h = jM1591j;
                        long j13 = c0833j.f3533g;
                        if (j13 != j3 && jM1591j > j13) {
                            c0833j.f3534h = j13;
                        }
                    }
                    long j14 = jM1971f - c0833j.f3534h;
                    if (Math.abs(j14) < c0833j.f3527a) {
                        c0833j.f3537k = 1.0f;
                    } else {
                        c0833j.f3537k = AbstractC0632A.m1589h((1.0E-7f * j14) + 1.0f, c0833j.f3536j, c0833j.f3535i);
                    }
                    f = c0833j.f3537k;
                }
                if (this.f3323u.mo2003f().f1949a != f) {
                    C0548K c0548k = new C0548K(f, this.f3287G.f3445o.f1950b);
                    this.f3317o.m1699d(i3);
                    this.f3323u.mo2002d(c0548k);
                    m1989o(this.f3287G.f3445o, this.f3323u.mo2003f().f1949a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:193:0x0348  */
    /* JADX WARN: Code duplicated, block: B:194:0x034a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0355  */
    /* JADX WARN: Code duplicated, block: B:201:0x0360  */
    /* JADX WARN: Code duplicated, block: B:203:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x037e  */
    /* JADX WARN: Code duplicated, block: B:212:0x038a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0390  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T.V] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v16, types: [a0.G] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [a0.G] */
    /* JADX WARN: Type inference failed for: r2v24, types: [T.V] */
    /* JADX WARN: Type inference failed for: r2v29, types: [a0.b0] */
    /* JADX WARN: Type inference failed for: r2v60, types: [a0.P] */
    /* JADX WARN: Type inference failed for: r33v0, types: [a0.H] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31, types: [T.V] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
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
    /* JADX INFO: renamed from: m */
    public final void m1985m(AbstractC0558V abstractC0558V, boolean z3) throws Throwable {
        long j3;
        C1907A c1907a;
        char c;
        C0557U c0557u;
        Object obj;
        int iMo1406a;
        int i3;
        Object obj2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        AbstractC0558V abstractC0558V2;
        C0556T c0556t;
        int i4;
        long j4;
        long j5;
        C0795F c0795f;
        int i5;
        long jLongValue;
        int iMo1406a2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        char c2;
        ?? r11;
        C1907A c1907a2;
        long j6;
        ?? r12;
        char c3;
        ?? r7;
        long jMax;
        int i6;
        ?? r13;
        long j7;
        C1907A c1907a3;
        Object obj3;
        boolean z12;
        int i7;
        char c4;
        C0818b0 c0818b0 = this.f3287G;
        C0796G c0796g = this.f3301U;
        C0805P c0805p = this.f3327y;
        int i8 = this.f3295O;
        boolean z13 = this.f3296P;
        C0557U c0557u2 = this.f3320r;
        C0556T c0556t2 = this.f3321s;
        if (abstractC0558V.m1415p()) {
            abstractC0558V2 = abstractC0558V;
            c0795f = new C0795F(C0818b0.f3430u, 0L, -9223372036854775807L, false, true, false);
            c2 = 4;
            j3 = -9223372036854775807L;
        } else {
            C1907A c1907a4 = c0818b0.f3432b;
            j3 = -9223372036854775807L;
            Object obj4 = c1907a4.f8311a;
            AbstractC0558V abstractC0558V3 = c0818b0.f3431a;
            boolean z14 = abstractC0558V3.m1415p() || abstractC0558V3.mo1410g(c1907a4.f8311a, c0556t2).f1971f;
            long jLongValue2 = (c0818b0.f3432b.m4422b() || z14) ? c0818b0.f3433c : c0818b0.f3449s;
            if (c0796g != null) {
                c1907a = c1907a4;
                c = 4;
                Pair pairM1933K = m1933K(abstractC0558V, c0796g, true, i8, z13, c0557u2, c0556t2);
                if (pairM1933K == null) {
                    iMo1406a2 = abstractC0558V.mo1406a(z13);
                    jLongValue = jLongValue2;
                    z11 = true;
                    z9 = false;
                    z10 = false;
                } else {
                    if (c0796g.f3279c == -9223372036854775807L) {
                        iMo1406a2 = abstractC0558V.mo1410g(pairM1933K.first, c0556t2).f1968c;
                        jLongValue = jLongValue2;
                        z8 = false;
                    } else {
                        obj4 = pairM1933K.first;
                        jLongValue = ((Long) pairM1933K.second).longValue();
                        iMo1406a2 = -1;
                        z8 = true;
                    }
                    z9 = c0818b0.f3435e == 4;
                    z10 = z8;
                    z11 = false;
                }
                iMo1406a = iMo1406a2;
                z5 = z11;
                z4 = z9;
                obj = obj4;
                z6 = z10;
                jLongValue2 = jLongValue;
                c0557u = c0557u2;
                i3 = -1;
            } else {
                c1907a = c1907a4;
                c = 4;
                c = 4;
                if (c0818b0.f3431a.m1415p()) {
                    iMo1406a = abstractC0558V.mo1406a(z13);
                    c0557u = c0557u2;
                    obj = obj4;
                } else if (abstractC0558V.mo1328b(obj4) == -1) {
                    obj = obj4;
                    int iM1934L = m1934L(c0557u2, c0556t2, i8, z13, obj, c0818b0.f3431a, abstractC0558V);
                    c0557u = c0557u2;
                    if (iM1934L == -1) {
                        c0556t2 = c0556t2;
                        iM1934L = abstractC0558V.mo1406a(z13);
                        z7 = true;
                    } else {
                        c0556t2 = c0556t2;
                        z7 = false;
                    }
                    iMo1406a = iM1934L;
                    z5 = z7;
                    jLongValue2 = jLongValue2;
                    i3 = -1;
                    z4 = false;
                    z6 = false;
                } else {
                    c0557u = c0557u2;
                    obj = obj4;
                    if (jLongValue2 == -9223372036854775807L) {
                        iMo1406a = abstractC0558V.mo1410g(obj, c0556t2).f1968c;
                    } else if (z14) {
                        c0818b0.f3431a.mo1410g(c1907a.f8311a, c0556t2);
                        if (c0818b0.f3431a.mo1332m(c0556t2.f1968c, c0557u, 0L).f1988n == c0818b0.f3431a.mo1328b(c1907a.f8311a)) {
                            Pair pairM1411i = abstractC0558V.m1411i(c0557u, c0556t2, abstractC0558V.mo1410g(obj, c0556t2).f1968c, c0556t2.f1970e + jLongValue2);
                            obj2 = pairM1411i.first;
                            jLongValue2 = ((Long) pairM1411i.second).longValue();
                        } else {
                            obj2 = obj;
                            jLongValue2 = jLongValue2;
                        }
                        obj = obj2;
                        iMo1406a = -1;
                        i3 = -1;
                        z4 = false;
                        z5 = false;
                        z6 = true;
                    } else {
                        jLongValue2 = jLongValue2;
                        iMo1406a = -1;
                        i3 = -1;
                        z4 = false;
                        z5 = false;
                        z6 = false;
                    }
                }
                i3 = -1;
                z4 = false;
                z5 = false;
                z6 = false;
            }
            if (iMo1406a != i3) {
                int i9 = iMo1406a;
                C0556T c0556t3 = c0556t2;
                i4 = -1;
                abstractC0558V2 = abstractC0558V;
                Pair pairM1411i2 = abstractC0558V2.m1411i(c0557u, c0556t3, i9, -9223372036854775807L);
                c0556t = c0556t3;
                obj = pairM1411i2.first;
                jLongValue2 = ((Long) pairM1411i2.second).longValue();
                j4 = -9223372036854775807L;
            } else {
                abstractC0558V2 = abstractC0558V;
                c0556t = c0556t2;
                i4 = -1;
                j4 = jLongValue2;
            }
            C1907A c1907aM2030n = c0805p.m2030n(abstractC0558V2, obj, jLongValue2);
            int i10 = c1907aM2030n.f8315e;
            boolean z15 = c1907a.f8311a.equals(obj) && !c1907a.m4422b() && !c1907aM2030n.m4422b() && (i10 == i4 || ((i5 = c1907a.f8315e) != i4 && i10 >= i5));
            C0556T c0556tMo1410g = abstractC0558V2.mo1410g(obj, c0556t);
            if (!z14 && jLongValue2 == j4 && c1907a.f8311a.equals(c1907aM2030n.f8311a)) {
                if (c1907a.m4422b()) {
                    c0556tMo1410g.m1402g(c1907a.f8312b);
                }
                if (c1907aM2030n.m4422b()) {
                    c0556tMo1410g.m1402g(c1907aM2030n.f8312b);
                }
            }
            C1907A c1907a5 = !z15 ? c1907aM2030n : c1907a;
            if (!c1907a5.m4422b()) {
                j5 = jLongValue2;
            } else if (c1907a5.equals(c1907a)) {
                jLongValue2 = c0818b0.f3449s;
                j5 = jLongValue2;
            } else {
                abstractC0558V2.mo1410g(c1907a5.f8311a, c0556t);
                if (c1907a5.f8313c == c0556t.m1400e(c1907a5.f8312b)) {
                    c0556t.f1972g.getClass();
                }
                j5 = 0;
            }
            c0795f = new C0795F(c1907a5, j5, j4, z4, z5, z6);
            c2 = c;
        }
        C1907A c1907a6 = c0795f.f3271a;
        long j8 = c0795f.f3273c;
        boolean z16 = c0795f.f3274d;
        long jM1951P = c0795f.f3272b;
        boolean z17 = (this.f3287G.f3432b.equals(c1907a6) && jM1951P == this.f3287G.f3449s) ? false : true;
        try {
            if (c0795f.f3275e) {
                if (this.f3287G.f3435e != 1) {
                    m1966c0(c2 == true ? 1 : 0);
                }
                m1944G(false, false, false, true);
            }
            AbstractC0827g[] abstractC0827gArr = this.f3309g;
            int length = abstractC0827gArr.length;
            ?? r8 = 0;
            while (r8 < length) {
                AbstractC0827g abstractC0827g = abstractC0827gArr[r8];
                AbstractC0558V abstractC0558V4 = abstractC0827g.f3492v;
                int i11 = AbstractC0632A.f2454a;
                if (!Objects.equals(abstractC0558V4, abstractC0558V2)) {
                    abstractC0827g.f3492v = abstractC0558V2;
                }
                r8++;
            }
            try {
                if (z17) {
                    r8 = abstractC0558V2;
                    c4 = 0;
                    r13 = 0;
                    c3 = 0;
                    c2 = 0;
                    if (r8.m1415p()) {
                        c1907a2 = c1907a6;
                        r13 = c4;
                    } else {
                        try {
                            for (C0802M c0802m = this.f3327y.f3375i; c0802m != null; c0802m = c0802m.f3350m) {
                                if (c0802m.f3344g.f3354a.equals(c1907a6)) {
                                    c0802m.f3344g = this.f3327y.m2024g(r8, c0802m.f3344g);
                                    c0802m.m2014k();
                                }
                            }
                            C0805P c0805p2 = this.f3327y;
                            c1907a2 = c1907a6;
                            try {
                                jM1951P = m1951P(c1907a2, jM1951P, c0805p2.f3375i != c0805p2.f3376j, z16);
                            } catch (Throwable th) {
                                th = th;
                                jM1951P = jM1951P;
                                r7 = r8;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c1907a2 = c1907a6;
                            r7 = r8;
                            c3 = c2;
                        }
                    }
                    C0818b0 c0818b1 = this.f3287G;
                    AbstractC0558V abstractC0558V5 = c0818b1.f3431a;
                    C1907A c1907a7 = c0818b1.f3432b;
                    if (c0795f.f3276f) {
                        j7 = jM1951P;
                    } else {
                        j7 = j3;
                    }
                    c1907a3 = c1907a2;
                    m1986m0(abstractC0558V, c1907a3, abstractC0558V5, c1907a7, j7, false);
                    if (z17) {
                        C0818b0 c0818b2 = this.f3287G;
                        obj3 = c0818b2.f3432b.f8311a;
                        AbstractC0558V abstractC0558V6 = c0818b2.f3431a;
                        if (z17) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        long j9 = this.f3287G.f3434d;
                        if (abstractC0558V.mo1328b(obj3) == -1) {
                            i7 = 4;
                        } else {
                            i7 = 3;
                        }
                        this.f3287G = m1991p(c1907a3, jM1951P, j8, j9, z12, i7);
                    } else {
                        C0818b0 c0818b3 = this.f3287G;
                        obj3 = c0818b3.f3432b.f8311a;
                        AbstractC0558V abstractC0558V7 = c0818b3.f3431a;
                        if (z17) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        long j10 = this.f3287G.f3434d;
                        if (abstractC0558V.mo1328b(obj3) == -1) {
                            i7 = 4;
                        } else {
                            i7 = 3;
                        }
                        this.f3287G = m1991p(c1907a3, jM1951P, j8, j10, z12, i7);
                    }
                    m1945H();
                    m1947J(r2, this.f3287G.f3431a);
                    this.f3287G = this.f3287G.m2068h(r2);
                    if (!abstractC0558V.m1415p()) {
                        this.f3301U = r13;
                    }
                    m1983l(false);
                    this.f3317o.m1700e(2);
                    return;
                }
                try {
                    C0805P c0805p3 = this.f3327y;
                    long j11 = this.f3302V;
                    C0802M c0802m2 = c0805p3.f3376j;
                    try {
                        if (c0802m2 == null) {
                            jMax = 0;
                        } else {
                            jMax = c0802m2.f3353p;
                            if (c0802m2.f3342e) {
                                int i12 = 0;
                                while (true) {
                                    AbstractC0827g[] abstractC0827gArr2 = this.f3309g;
                                    C0805P c0805p4 = c0805p3;
                                    try {
                                        if (i12 >= abstractC0827gArr2.length) {
                                            abstractC0558V = abstractC0558V;
                                            c0805p3 = c0805p4;
                                            c2 = 0;
                                            break;
                                        }
                                        try {
                                            if (m1937r(abstractC0827gArr2[i12])) {
                                                AbstractC0827g abstractC0827g2 = abstractC0827gArr2[i12];
                                                i6 = i12;
                                                if (abstractC0827g2.f3485o == c0802m2.f3340c[i6]) {
                                                    long j12 = abstractC0827g2.f3489s;
                                                    if (j12 == Long.MIN_VALUE) {
                                                        c0805p3 = c0805p4;
                                                        jMax = Long.MIN_VALUE;
                                                    } else {
                                                        jMax = Math.max(j12, jMax);
                                                    }
                                                    c1907a2 = c1907a6;
                                                    r7 = r8;
                                                    c3 = c2;
                                                    j6 = j8;
                                                    r11 = r7;
                                                    r12 = c3;
                                                }
                                            } else {
                                                i6 = i12;
                                            }
                                            i12 = i6 + 1;
                                            c0805p3 = c0805p4;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r8 = abstractC0558V;
                                            c2 = 0;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                                c4 = c2;
                                if (!c0805p3.m2033q(abstractC0558V, j11, jMax)) {
                                    m1949N(false);
                                    c4 = c2;
                                }
                                c1907a2 = c1907a6;
                                r13 = c4;
                                C0818b0 c0818b4 = this.f3287G;
                                AbstractC0558V abstractC0558V8 = c0818b4.f3431a;
                                C1907A c1907a8 = c0818b4.f3432b;
                                if (c0795f.f3276f) {
                                    j7 = jM1951P;
                                } else {
                                    j7 = j3;
                                }
                                c1907a3 = c1907a2;
                                m1986m0(abstractC0558V, c1907a3, abstractC0558V8, c1907a8, j7, false);
                                if (z17 || j8 != this.f3287G.f3433c) {
                                    C0818b0 c0818b5 = this.f3287G;
                                    obj3 = c0818b5.f3432b.f8311a;
                                    AbstractC0558V abstractC0558V9 = c0818b5.f3431a;
                                    if (z17 || !z3 || abstractC0558V9.m1415p() || abstractC0558V9.mo1410g(obj3, this.f3321s).f1971f) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    long j13 = this.f3287G.f3434d;
                                    if (abstractC0558V.mo1328b(obj3) == -1) {
                                        i7 = 4;
                                    } else {
                                        i7 = 3;
                                    }
                                    this.f3287G = m1991p(c1907a3, jM1951P, j8, j13, z12, i7);
                                }
                                m1945H();
                                m1947J(r2, this.f3287G.f3431a);
                                this.f3287G = this.f3287G.m2068h(r2);
                                if (!abstractC0558V.m1415p()) {
                                    this.f3301U = r13;
                                }
                                m1983l(false);
                                this.f3317o.m1700e(2);
                                return;
                            }
                        }
                        c4 = c2;
                        if (!c0805p3.m2033q(abstractC0558V, j11, jMax)) {
                            m1949N(false);
                            c4 = c2;
                        }
                        c1907a2 = c1907a6;
                        r13 = c4;
                        C0818b0 c0818b6 = this.f3287G;
                        AbstractC0558V abstractC0558V10 = c0818b6.f3431a;
                        C1907A c1907a9 = c0818b6.f3432b;
                        if (c0795f.f3276f) {
                            j7 = jM1951P;
                        } else {
                            j7 = j3;
                        }
                        c1907a3 = c1907a2;
                        m1986m0(abstractC0558V, c1907a3, abstractC0558V10, c1907a9, j7, false);
                        if (z17) {
                            C0818b0 c0818b7 = this.f3287G;
                            obj3 = c0818b7.f3432b.f8311a;
                            AbstractC0558V abstractC0558V11 = c0818b7.f3431a;
                            if (z17) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            long j14 = this.f3287G.f3434d;
                            if (abstractC0558V.mo1328b(obj3) == -1) {
                                i7 = 4;
                            } else {
                                i7 = 3;
                            }
                            this.f3287G = m1991p(c1907a3, jM1951P, j8, j14, z12, i7);
                        } else {
                            C0818b0 c0818b8 = this.f3287G;
                            obj3 = c0818b8.f3432b.f8311a;
                            AbstractC0558V abstractC0558V12 = c0818b8.f3431a;
                            if (z17) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            long j15 = this.f3287G.f3434d;
                            if (abstractC0558V.mo1328b(obj3) == -1) {
                                i7 = 4;
                            } else {
                                i7 = 3;
                            }
                            this.f3287G = m1991p(c1907a3, jM1951P, j8, j15, z12, i7);
                        }
                        m1945H();
                        m1947J(r2, this.f3287G.f3431a);
                        this.f3287G = this.f3287G.m2068h(r2);
                        if (!abstractC0558V.m1415p()) {
                            this.f3301U = r13;
                        }
                        m1983l(false);
                        this.f3317o.m1700e(2);
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        r8 = abstractC0558V;
                    }
                    c2 = 0;
                    break;
                } catch (Throwable th6) {
                    th = th6;
                    r8 = abstractC0558V;
                    c2 = 0;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            r11 = abstractC0558V2;
            c1907a2 = c1907a6;
            j6 = j8;
            r12 = 0;
        }
        C0818b0 c0818b9 = this.f3287G;
        AbstractC0558V abstractC0558V13 = c0818b9.f3431a;
        C1907A c1907a10 = c0818b9.f3432b;
        C1907A c1907a11 = c1907a2;
        m1986m0(r11, c1907a11, abstractC0558V13, c1907a10, c0795f.f3276f ? jM1951P : j3, false);
        if (z17 || j6 != this.f3287G.f3433c) {
            C0818b0 c0818b10 = this.f3287G;
            Object obj5 = c0818b10.f3432b.f8311a;
            AbstractC0558V abstractC0558V14 = c0818b10.f3431a;
            this.f3287G = m1991p(c1907a11, jM1951P, j6, this.f3287G.f3434d, z17 && z3 && !abstractC0558V14.m1415p() && !abstractC0558V14.mo1410g(obj5, this.f3321s).f1971f, r11.mo1328b(obj5) == -1 ? 4 : 3);
        }
        m1945H();
        m1947J(r11, this.f3287G.f3431a);
        this.f3287G = this.f3287G.m2068h(r11);
        if (!r11.m1415p()) {
            this.f3301U = r12;
        }
        m1983l(false);
        this.f3317o.m1700e(2);
        throw th;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1986m0(AbstractC0558V abstractC0558V, C1907A c1907a, AbstractC0558V abstractC0558V2, C1907A c1907a2, long j3, boolean z3) {
        if (!m1970e0(abstractC0558V, c1907a)) {
            C0548K c0548k = c1907a.m4422b() ? C0548K.f1948d : this.f3287G.f3445o;
            C0837m c0837m = this.f3323u;
            if (c0837m.mo2003f().equals(c0548k)) {
                return;
            }
            this.f3317o.m1699d(16);
            c0837m.mo2002d(c0548k);
            m1989o(this.f3287G.f3445o, c0548k.f1949a, false, false);
            return;
        }
        Object obj = c1907a.f8311a;
        C0556T c0556t = this.f3321s;
        int i3 = abstractC0558V.mo1410g(obj, c0556t).f1968c;
        C0557U c0557u = this.f3320r;
        abstractC0558V.m1414n(i3, c0557u);
        C0592x c0592x = c0557u.f1984j;
        C0833j c0833j = this.f3281A;
        c0833j.getClass();
        c0833j.f3529c = AbstractC0632A.m1571L(c0592x.f2194a);
        c0833j.f3532f = AbstractC0632A.m1571L(c0592x.f2195b);
        c0833j.f3533g = AbstractC0632A.m1571L(c0592x.f2196c);
        float f = c0592x.f2197d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c0833j.f3536j = f;
        float f3 = c0592x.f2198e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        c0833j.f3535i = f3;
        if (f == 1.0f && f3 == 1.0f) {
            c0833j.f3529c = -9223372036854775807L;
        }
        c0833j.m2103a();
        if (j3 != -9223372036854775807L) {
            c0833j.f3530d = m1971f(abstractC0558V, obj, j3);
            c0833j.m2103a();
            return;
        }
        if (!Objects.equals(!abstractC0558V2.m1415p() ? abstractC0558V2.mo1332m(abstractC0558V2.mo1410g(c1907a2.f8311a, c0556t).f1968c, c0557u, 0L).f1975a : null, c0557u.f1975a) || z3) {
            c0833j.f3530d = -9223372036854775807L;
            c0833j.m2103a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1987n(InterfaceC1965y interfaceC1965y) throws C0839o {
        C0802M c0802m;
        C0805P c0805p = this.f3327y;
        C0802M c0802m2 = c0805p.f3377k;
        int i3 = 0;
        boolean z3 = c0802m2 != null && c0802m2.f3338a == interfaceC1965y;
        C0837m c0837m = this.f3323u;
        if (z3) {
            c0802m2.getClass();
            if (!c0802m2.f3342e) {
                float f = c0837m.mo2003f().f1949a;
                C0818b0 c0818b0 = this.f3287G;
                c0802m2.m2009f(f, c0818b0.f3431a, c0818b0.f3442l);
            }
            m1980j0(c0802m2.f3352o);
            if (c0802m2 == c0805p.f3375i) {
                m1946I(c0802m2.f3344g.f3355b);
                m1967d(new boolean[this.f3309g.length], c0805p.f3376j.m2008e());
                C0818b0 c0818b1 = this.f3287G;
                C1907A c1907a = c0818b1.f3432b;
                C0803N c0803n = c0802m2.f3344g;
                long j3 = c0818b1.f3433c;
                long j4 = c0803n.f3355b;
                this.f3287G = m1991p(c1907a, j4, j3, j4, false, 5);
            }
            m1993t();
            return;
        }
        while (true) {
            if (i3 >= c0805p.f3382p.size()) {
                c0802m = null;
                break;
            }
            c0802m = (C0802M) c0805p.f3382p.get(i3);
            if (c0802m.f3338a == interfaceC1965y) {
                break;
            } else {
                i3++;
            }
        }
        if (c0802m != null) {
            AbstractC0646n.m1630h(!c0802m.f3342e);
            float f3 = c0837m.mo2003f().f1949a;
            C0818b0 c0818b2 = this.f3287G;
            c0802m.m2009f(f3, c0818b2.f3431a, c0818b2.f3442l);
            C0802M c0802m3 = c0805p.f3378l;
            if (c0802m3 == null || c0802m3.f3338a != interfaceC1965y) {
                return;
            }
            m1994u();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1988n0(boolean z3, boolean z4) {
        long jElapsedRealtime;
        this.f3292L = z3;
        if (!z3 || z4) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f3325w.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f3293M = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: o */
    public final void m1989o(C0548K c0548k, float f, boolean z3, boolean z4) {
        int i3;
        if (z3) {
            if (z4) {
                this.f3288H.m1872f(1);
            }
            this.f3287G = this.f3287G.m2066f(c0548k);
        }
        float f3 = c0548k.f1949a;
        C0802M c0802m = this.f3327y.f3375i;
        while (true) {
            i3 = 0;
            if (c0802m == null) {
                break;
            }
            InterfaceC2042s[] interfaceC2042sArr = c0802m.f3352o.f8914c;
            int length = interfaceC2042sArr.length;
            while (i3 < length) {
                InterfaceC2042s interfaceC2042s = interfaceC2042sArr[i3];
                if (interfaceC2042s != null) {
                    interfaceC2042s.mo4431l(f3);
                }
                i3++;
            }
            c0802m = c0802m.f3350m;
        }
        AbstractC0827g[] abstractC0827gArr = this.f3309g;
        int length2 = abstractC0827gArr.length;
        while (i3 < length2) {
            AbstractC0827g abstractC0827g = abstractC0827gArr[i3];
            if (abstractC0827g != null) {
                abstractC0827g.mo2098y(f, c0548k.f1949a);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m1990o0(C0840p c0840p, long j3) {
        this.f3325w.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j3;
        boolean z3 = false;
        while (!((Boolean) c0840p.get()).booleanValue() && j3 > 0) {
            try {
                this.f3325w.getClass();
                wait(j3);
            } catch (InterruptedException unused) {
                z3 = true;
            }
            this.f3325w.getClass();
            j3 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: p */
    public final C0818b0 m1991p(C1907A c1907a, long j3, long j4, long j5, boolean z3, int i3) {
        C1692X c1692xM4112f;
        boolean z4;
        int i4;
        this.f3305Y = (!this.f3305Y && j3 == this.f3287G.f3449s && c1907a.equals(this.f3287G.f3432b)) ? false : true;
        m1945H();
        C0818b0 c0818b0 = this.f3287G;
        C1945g0 c1945g0 = c0818b0.f3438h;
        C2045v c2045v = c0818b0.f3439i;
        List list = c0818b0.f3440j;
        if (this.f3328z.f3425k) {
            C0802M c0802m = this.f3327y.f3375i;
            c1945g0 = c0802m == null ? C1945g0.f8525d : c0802m.f3351n;
            c2045v = c0802m == null ? this.f3314l : c0802m.f3352o;
            InterfaceC2042s[] interfaceC2042sArr = c2045v.f8914c;
            C1673D c1673d = new C1673D(4);
            boolean z5 = false;
            for (InterfaceC2042s interfaceC2042s : interfaceC2042sArr) {
                if (interfaceC2042s != null) {
                    C0544G c0544g = interfaceC2042s.mo4428i(0).f2152l;
                    if (c0544g == null) {
                        c1673d.m4102a(new C0544G(new InterfaceC0543F[0]));
                    } else {
                        c1673d.m4102a(c0544g);
                        z5 = true;
                    }
                }
            }
            if (z5) {
                c1692xM4112f = c1673d.m4112f();
            } else {
                C1674E c1674e = AbstractC1676G.f7601h;
                c1692xM4112f = C1692X.f7629k;
            }
            list = c1692xM4112f;
            if (c0802m != null) {
                C0803N c0803n = c0802m.f3344g;
                if (c0803n.f3356c != j4) {
                    c0802m.f3344g = c0803n.m2015a(j4);
                }
            }
            C0802M c0802m2 = this.f3327y.f3375i;
            if (c0802m2 != null) {
                C2045v c2045v2 = c0802m2.f3352o;
                int i5 = 0;
                boolean z6 = false;
                while (true) {
                    AbstractC0827g[] abstractC0827gArr = this.f3309g;
                    if (i5 >= abstractC0827gArr.length) {
                        z4 = true;
                        break;
                    }
                    if (c2045v2.m4619b(i5)) {
                        i4 = 1;
                        if (abstractC0827gArr[i5].f3478h != 1) {
                            z4 = false;
                            break;
                        }
                        if (c2045v2.f8913b[i5].f3517a != 0) {
                            z6 = true;
                        }
                    } else {
                        i4 = 1;
                    }
                    i5 += i4;
                }
                boolean z7 = z6 && z4;
                if (z7 != this.f3299S) {
                    this.f3299S = z7;
                    if (!z7 && this.f3287G.f3446p) {
                        this.f3317o.m1700e(2);
                    }
                }
            }
        } else if (!c1907a.equals(c0818b0.f3432b)) {
            c1945g0 = C1945g0.f8525d;
            c2045v = this.f3314l;
            list = C1692X.f7629k;
        }
        C1945g0 c1945g1 = c1945g0;
        C2045v c2045v3 = c2045v;
        List list2 = list;
        if (z3) {
            C0760w c0760w = this.f3288H;
            if (!c0760w.f3099d || c0760w.f3100e == 5) {
                c0760w.f3097b = true;
                c0760w.f3099d = true;
                c0760w.f3100e = i3;
            } else {
                AbstractC0646n.m1625c(i3 == 5);
            }
        }
        C0818b0 c0818b1 = this.f3287G;
        return c0818b1.m2063c(c1907a, j3, j4, j5, m1977i(c0818b1.f3447q), c1945g1, c2045v3, list2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1992s() {
        C0802M c0802m = this.f3327y.f3375i;
        long j3 = c0802m.f3344g.f3358e;
        if (c0802m.f3342e) {
            return j3 == -9223372036854775807L || this.f3287G.f3449s < j3 || !m1968d0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, k0.y] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, k0.b0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k0.b0] */
    /* JADX INFO: renamed from: t */
    public final void m1993t() {
        boolean zM2108c;
        if (m1936q(this.f3327y.f3377k)) {
            C0802M c0802m = this.f3327y.f3377k;
            long jM1977i = m1977i(!c0802m.f3342e ? 0L : c0802m.f3338a.mo3772r());
            C0802M c0802m2 = this.f3327y.f3375i;
            long j3 = m1970e0(this.f3287G.f3431a, c0802m.f3344g.f3354a) ? this.f3281A.f3534h : -9223372036854775807L;
            C1071l c1071l = this.f3283C;
            AbstractC0558V abstractC0558V = this.f3287G.f3431a;
            float f = this.f3323u.mo2003f().f1949a;
            boolean z3 = this.f3287G.f3442l;
            C0798I c0798i = new C0798I(c1071l, jM1977i, f, this.f3292L, j3);
            zM2108c = this.f3315m.m2108c(c0798i);
            C0802M c0802m3 = this.f3327y.f3375i;
            if (!zM2108c && c0802m3.f3342e && jM1977i < 500000 && this.f3322t > 0) {
                c0802m3.f3338a.mo3770o(this.f3287G.f3449s);
                zM2108c = this.f3315m.m2108c(c0798i);
            }
        } else {
            zM2108c = false;
        }
        this.f3294N = zM2108c;
        if (zM2108c) {
            C0802M c0802m4 = this.f3327y.f3377k;
            c0802m4.getClass();
            C0799J c0799j = new C0799J();
            c0799j.f3332a = this.f3302V - c0802m4.f3353p;
            float f3 = this.f3323u.mo2003f().f1949a;
            AbstractC0646n.m1625c(f3 > 0.0f || f3 == -3.4028235E38f);
            c0799j.f3333b = f3;
            long j4 = this.f3293M;
            AbstractC0646n.m1625c(j4 >= 0 || j4 == -9223372036854775807L);
            c0799j.f3334c = j4;
            C0800K c0800k = new C0800K(c0799j);
            AbstractC0646n.m1630h(c0802m4.f3350m == null);
            c0802m4.f3338a.mo3767i(c0800k);
        }
        m1978i0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k0.b0, k0.y] */
    /* JADX INFO: renamed from: u */
    public final void m1994u() {
        C0805P c0805p = this.f3327y;
        c0805p.m2027j();
        C0802M c0802m = c0805p.f3378l;
        if (c0802m != null) {
            if (!c0802m.f3341d || c0802m.f3342e) {
                ?? r3 = c0802m.f3338a;
                if (r3.mo3759a()) {
                    return;
                }
                AbstractC0558V abstractC0558V = this.f3287G.f3431a;
                if (c0802m.f3342e) {
                    r3.mo3766h();
                }
                Iterator it = this.f3315m.f3555h.values().iterator();
                while (it.hasNext()) {
                    if (((C0835k) it.next()).f3546a) {
                        return;
                    }
                }
                if (!c0802m.f3341d) {
                    C0803N c0803n = c0802m.f3344g;
                    c0802m.f3341d = true;
                    r3.mo3771q(this, c0803n.f3355b);
                    return;
                }
                C0799J c0799j = new C0799J();
                c0799j.f3332a = this.f3302V - c0802m.f3353p;
                float f = this.f3323u.mo2003f().f1949a;
                AbstractC0646n.m1625c(f > 0.0f || f == -3.4028235E38f);
                c0799j.f3333b = f;
                long j3 = this.f3293M;
                AbstractC0646n.m1625c(j3 >= 0 || j3 == -9223372036854775807L);
                c0799j.f3334c = j3;
                C0800K c0800k = new C0800K(c0799j);
                AbstractC0646n.m1630h(c0802m.f3350m == null);
                r3.mo3767i(c0800k);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1995v() {
        C0760w c0760w = this.f3288H;
        C0818b0 c0818b0 = this.f3287G;
        boolean z3 = c0760w.f3097b | (((C0818b0) c0760w.f3101f) != c0818b0);
        c0760w.f3097b = z3;
        c0760w.f3101f = c0818b0;
        if (z3) {
            C0792C c0792c = this.f3326x.f3602g;
            c0792c.f3248i.m1698c(new RunnableC0647o(c0792c, 1, c0760w));
            this.f3288H = new C0760w(this.f3287G);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1996w(int i3) {
        AbstractC0827g abstractC0827g = this.f3309g[i3];
        try {
            InterfaceC1931Z interfaceC1931Z = abstractC0827g.f3485o;
            interfaceC1931Z.getClass();
            interfaceC1931Z.mo3788u();
        } catch (IOException | RuntimeException e3) {
            int i4 = abstractC0827g.f3478h;
            if (i4 != 3 && i4 != 5) {
                throw e3;
            }
            C2045v c2045v = this.f3327y.f3375i.f3352o;
            AbstractC0646n.m1636n("ExoPlayerImplInternal", "Disabling track due to error: " + C0583o.m1446c(c2045v.f8914c[i3].mo4426e()), e3);
            C2045v c2045v2 = new C2045v((C0830h0[]) c2045v.f8913b.clone(), (InterfaceC2042s[]) c2045v.f8914c.clone(), c2045v.f8915d, c2045v.f8916e);
            c2045v2.f8913b[i3] = null;
            c2045v2.f8914c[i3] = null;
            m1963b(i3);
            C0802M c0802m = this.f3327y.f3375i;
            c0802m.m2004a(c2045v2, this.f3287G.f3449s, false, new boolean[c0802m.f3347j.length]);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1997x(int i3, boolean z3) {
        boolean[] zArr = this.f3312j;
        if (zArr[i3] != z3) {
            zArr[i3] = z3;
            this.f3285E.m1698c(new RunnableC0821d(this, i3, z3));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1998y() throws Throwable {
        m1985m(this.f3328z.m2048b(), true);
    }

    /* JADX INFO: renamed from: z */
    public final void m1999z() {
        this.f3288H.m1872f(1);
        throw null;
    }
}
