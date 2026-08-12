package p077a0;

import android.util.Pair;
import java.util.ArrayList;
import p011E.C0111d;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0565b;
import p064W.AbstractC0646n;
import p064W.C0655w;
import p082b0.C1064e;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p114k0.C1907A;

/* JADX INFO: renamed from: a0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0805P {

    /* JADX INFO: renamed from: c */
    public final C1064e f3369c;

    /* JADX INFO: renamed from: d */
    public final C0655w f3370d;

    /* JADX INFO: renamed from: e */
    public final C0111d f3371e;

    /* JADX INFO: renamed from: f */
    public long f3372f;

    /* JADX INFO: renamed from: g */
    public int f3373g;

    /* JADX INFO: renamed from: h */
    public boolean f3374h;

    /* JADX INFO: renamed from: i */
    public C0802M f3375i;

    /* JADX INFO: renamed from: j */
    public C0802M f3376j;

    /* JADX INFO: renamed from: k */
    public C0802M f3377k;

    /* JADX INFO: renamed from: l */
    public C0802M f3378l;

    /* JADX INFO: renamed from: m */
    public int f3379m;

    /* JADX INFO: renamed from: n */
    public Object f3380n;

    /* JADX INFO: renamed from: o */
    public long f3381o;

    /* JADX INFO: renamed from: a */
    public final C0556T f3367a = new C0556T();

    /* JADX INFO: renamed from: b */
    public final C0557U f3368b = new C0557U();

    /* JADX INFO: renamed from: p */
    public ArrayList f3382p = new ArrayList();

    public C0805P(C1064e c1064e, C0655w c0655w, C0111d c0111d) {
        this.f3369c = c1064e;
        this.f3370d = c0655w;
        this.f3371e = c0111d;
    }

    /* JADX INFO: renamed from: m */
    public static C1907A m2017m(AbstractC0558V abstractC0558V, Object obj, long j3, long j4, C0557U c0557u, C0556T c0556t) {
        abstractC0558V.mo1410g(obj, c0556t);
        abstractC0558V.m1414n(c0556t.f1968c, c0557u);
        abstractC0558V.mo1328b(obj);
        int i3 = c0556t.f1972g.f2045a;
        if (i3 != 0) {
            if (i3 == 1) {
                c0556t.m1401f(0);
            }
            c0556t.f1972g.getClass();
            c0556t.m1402g(0);
        }
        abstractC0558V.mo1410g(obj, c0556t);
        int iM1398c = c0556t.m1398c(j3);
        return iM1398c == -1 ? new C1907A(c0556t.m1397b(j3), j4, obj) : new C1907A(obj, iM1398c, c0556t.m1400e(iM1398c), j4, -1);
    }

    /* JADX INFO: renamed from: a */
    public final C0802M m2018a() {
        C0802M c0802m = this.f3375i;
        if (c0802m == null) {
            return null;
        }
        if (c0802m == this.f3376j) {
            this.f3376j = c0802m.f3350m;
        }
        c0802m.m2012i();
        int i3 = this.f3379m - 1;
        this.f3379m = i3;
        if (i3 == 0) {
            this.f3377k = null;
            C0802M c0802m2 = this.f3375i;
            this.f3380n = c0802m2.f3339b;
            this.f3381o = c0802m2.f3344g.f3354a.f8314d;
        }
        this.f3375i = this.f3375i.f3350m;
        m2028k();
        return this.f3375i;
    }

    /* JADX INFO: renamed from: b */
    public final void m2019b() {
        if (this.f3379m == 0) {
            return;
        }
        C0802M c0802m = this.f3375i;
        AbstractC0646n.m1631i(c0802m);
        this.f3380n = c0802m.f3339b;
        this.f3381o = c0802m.f3344g.f3354a.f8314d;
        while (c0802m != null) {
            c0802m.m2012i();
            c0802m = c0802m.f3350m;
        }
        this.f3375i = null;
        this.f3377k = null;
        this.f3376j = null;
        this.f3379m = 0;
        m2028k();
    }

    /* JADX INFO: renamed from: c */
    public final C0803N m2020c(AbstractC0558V abstractC0558V, C0802M c0802m, long j3) {
        AbstractC0558V abstractC0558V2;
        C0556T c0556t;
        Object obj;
        long j4;
        long j5;
        long j6;
        long jM2031o;
        C0803N c0803n = c0802m.f3344g;
        long j7 = (c0802m.f3353p + c0803n.f3358e) - j3;
        if (c0803n.f3360g) {
            C0803N c0803n2 = c0802m.f3344g;
            C1907A c1907a = c0803n2.f3354a;
            int iM1408d = abstractC0558V.m1408d(abstractC0558V.mo1328b(c1907a.f8311a), this.f3367a, this.f3368b, this.f3373g, this.f3374h);
            if (iM1408d != -1) {
                C0556T c0556t2 = this.f3367a;
                int i3 = abstractC0558V.mo1329f(iM1408d, c0556t2, true).f1968c;
                Object obj2 = c0556t2.f1967b;
                obj2.getClass();
                long j8 = c1907a.f8314d;
                if (abstractC0558V.mo1332m(i3, this.f3368b, 0L).f1988n == iM1408d) {
                    Pair pairM1412j = abstractC0558V.m1412j(this.f3368b, this.f3367a, i3, -9223372036854775807L, Math.max(0L, j7));
                    if (pairM1412j != null) {
                        Object obj3 = pairM1412j.first;
                        long jLongValue = ((Long) pairM1412j.second).longValue();
                        C0802M c0802m2 = c0802m.f3350m;
                        if (c0802m2 == null || !c0802m2.f3339b.equals(obj3)) {
                            jM2031o = m2031o(obj3);
                            if (jM2031o == -1) {
                                jM2031o = this.f3372f;
                                this.f3372f = 1 + jM2031o;
                            }
                        } else {
                            jM2031o = c0802m2.f3344g.f3354a.f8314d;
                        }
                        obj = obj3;
                        j4 = jLongValue;
                        j6 = jM2031o;
                        j5 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j4 = 0;
                    j5 = 0;
                    j6 = j8;
                }
                C1907A c1907aM2017m = m2017m(abstractC0558V, obj, j4, j6, this.f3368b, this.f3367a);
                if (j5 != -9223372036854775807L && c0803n2.f3356c != -9223372036854775807L) {
                    int i4 = abstractC0558V.mo1410g(c1907a.f8311a, c0556t2).f1972g.f2045a;
                    c0556t2.f1972g.getClass();
                    if (i4 > 0) {
                        c0556t2.m1402g(0);
                    }
                }
                return m2021d(abstractC0558V, c1907aM2017m, j5, j4);
            }
            return null;
        }
        C1907A c1907a2 = c0803n.f3354a;
        Object obj4 = c1907a2.f8311a;
        C0556T c0556t3 = this.f3367a;
        abstractC0558V.mo1410g(obj4, c0556t3);
        boolean zM4422b = c1907a2.m4422b();
        Object obj5 = c1907a2.f8311a;
        if (!zM4422b) {
            int i5 = c1907a2.f8315e;
            if (i5 != -1) {
                c0556t3.m1401f(i5);
            }
            int iM1400e = c0556t3.m1400e(i5);
            c0556t3.m1402g(i5);
            if (iM1400e != c0556t3.f1972g.m1430a(i5).f2018a) {
                return m2022e(abstractC0558V, c1907a2.f8311a, c1907a2.f8315e, iM1400e, c0803n.f3358e, c1907a2.f8314d);
            }
            abstractC0558V.mo1410g(obj5, c0556t3);
            c0556t3.m1399d(i5);
            c0556t3.f1972g.m1430a(i5).getClass();
            return m2023f(abstractC0558V, c1907a2.f8311a, 0L, c0803n.f3358e, c1907a2.f8314d);
        }
        C0565b c0565b = c0556t3.f1972g;
        int i6 = c1907a2.f8312b;
        int i7 = c0565b.m1430a(i6).f2018a;
        if (i7 == -1) {
            return null;
        }
        int iM1428a = c0556t3.f1972g.m1430a(i6).m1428a(c1907a2.f8313c);
        if (iM1428a < i7) {
            return m2022e(abstractC0558V, c1907a2.f8311a, i6, iM1428a, c0803n.f3356c, c1907a2.f8314d);
        }
        long jLongValue2 = c0803n.f3356c;
        if (jLongValue2 == -9223372036854775807L) {
            c0556t = c0556t3;
            abstractC0558V2 = abstractC0558V;
            Pair pairM1412j2 = abstractC0558V2.m1412j(this.f3368b, c0556t, c0556t.f1968c, -9223372036854775807L, Math.max(0L, j7));
            if (pairM1412j2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairM1412j2.second).longValue();
        } else {
            abstractC0558V2 = abstractC0558V;
            c0556t = c0556t3;
        }
        abstractC0558V2.mo1410g(obj5, c0556t);
        int i8 = c1907a2.f8312b;
        c0556t.m1399d(i8);
        c0556t.f1972g.m1430a(i8).getClass();
        return m2023f(abstractC0558V2, c1907a2.f8311a, Math.max(0L, jLongValue2), c0803n.f3356c, c1907a2.f8314d);
    }

    /* JADX INFO: renamed from: d */
    public final C0803N m2021d(AbstractC0558V abstractC0558V, C1907A c1907a, long j3, long j4) {
        abstractC0558V.mo1410g(c1907a.f8311a, this.f3367a);
        if (!c1907a.m4422b()) {
            return m2023f(abstractC0558V, c1907a.f8311a, j4, j3, c1907a.f8314d);
        }
        return m2022e(abstractC0558V, c1907a.f8311a, c1907a.f8312b, c1907a.f8313c, j3, c1907a.f8314d);
    }

    /* JADX INFO: renamed from: e */
    public final C0803N m2022e(AbstractC0558V abstractC0558V, Object obj, int i3, int i4, long j3, long j4) {
        C1907A c1907a = new C1907A(obj, i3, i4, j4, -1);
        C0556T c0556t = this.f3367a;
        long jM1396a = abstractC0558V.mo1410g(obj, c0556t).m1396a(i3, i4);
        if (i4 == c0556t.m1400e(i3)) {
            c0556t.f1972g.getClass();
        }
        c0556t.m1402g(i3);
        long jMax = 0;
        if (jM1396a != -9223372036854775807L && 0 >= jM1396a) {
            jMax = Math.max(0L, jM1396a - 1);
        }
        return new C0803N(c1907a, jMax, j3, -9223372036854775807L, jM1396a, false, false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final C0803N m2023f(AbstractC0558V abstractC0558V, Object obj, long j3, long j4, long j5) {
        long j6;
        C0556T c0556t = this.f3367a;
        abstractC0558V.mo1410g(obj, c0556t);
        int iM1397b = c0556t.m1397b(j3);
        if (iM1397b != -1) {
            c0556t.m1401f(iM1397b);
        }
        boolean z3 = false;
        if (iM1397b != -1) {
            c0556t.m1402g(iM1397b);
        } else if (c0556t.f1972g.f2045a > 0) {
            c0556t.m1402g(0);
        }
        C1907A c1907a = new C1907A(iM1397b, j5, obj);
        if (!c1907a.m4422b() && iM1397b == -1) {
            z3 = true;
        }
        boolean zM2026i = m2026i(abstractC0558V, c1907a);
        boolean zM2025h = m2025h(abstractC0558V, c1907a, z3);
        if (iM1397b != -1) {
            c0556t.m1402g(iM1397b);
        }
        if (iM1397b != -1) {
            c0556t.m1399d(iM1397b);
            j6 = 0;
        } else {
            j6 = -9223372036854775807L;
        }
        long j7 = (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? c0556t.f1969d : j6;
        return new C0803N(c1907a, (j7 == -9223372036854775807L || j3 < j7) ? j3 : Math.max(0L, j7 - ((long) 1)), j4, j6, j7, false, z3, zM2026i, zM2025h);
    }

    /* JADX INFO: renamed from: g */
    public final C0803N m2024g(AbstractC0558V abstractC0558V, C0803N c0803n) {
        long j3;
        long jM1396a;
        C1907A c1907a = c0803n.f3354a;
        boolean zM4422b = c1907a.m4422b();
        int i3 = c1907a.f8315e;
        boolean z3 = !zM4422b && i3 == -1;
        boolean zM2026i = m2026i(abstractC0558V, c1907a);
        boolean zM2025h = m2025h(abstractC0558V, c1907a, z3);
        Object obj = c1907a.f8311a;
        C0556T c0556t = this.f3367a;
        abstractC0558V.mo1410g(obj, c0556t);
        if (c1907a.m4422b() || i3 == -1) {
            j3 = -9223372036854775807L;
        } else {
            c0556t.m1399d(i3);
            j3 = 0;
        }
        boolean zM4422b2 = c1907a.m4422b();
        int i4 = c1907a.f8312b;
        if (zM4422b2) {
            jM1396a = c0556t.m1396a(i4, c1907a.f8313c);
        } else {
            jM1396a = (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? c0556t.f1969d : j3;
        }
        if (c1907a.m4422b()) {
            c0556t.m1402g(i4);
        } else if (i3 != -1) {
            c0556t.m1402g(i3);
        }
        return new C0803N(c1907a, c0803n.f3355b, c0803n.f3356c, j3, jM1396a, false, z3, zM2026i, zM2025h);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2025h(AbstractC0558V abstractC0558V, C1907A c1907a, boolean z3) {
        int iMo1328b = abstractC0558V.mo1328b(c1907a.f8311a);
        if (!abstractC0558V.mo1332m(abstractC0558V.mo1329f(iMo1328b, this.f3367a, false).f1968c, this.f3368b, 0L).f1983i) {
            if (abstractC0558V.m1408d(iMo1328b, this.f3367a, this.f3368b, this.f3373g, this.f3374h) == -1 && z3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2026i(AbstractC0558V abstractC0558V, C1907A c1907a) {
        if (!c1907a.m4422b() && c1907a.f8315e == -1) {
            Object obj = c1907a.f8311a;
            if (abstractC0558V.mo1332m(abstractC0558V.mo1410g(obj, this.f3367a).f1968c, this.f3368b, 0L).f1989o == abstractC0558V.mo1328b(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m2027j() {
        C0802M c0802m = this.f3378l;
        if (c0802m == null || c0802m.m2011h()) {
            this.f3378l = null;
            for (int i3 = 0; i3 < this.f3382p.size(); i3++) {
                C0802M c0802m2 = (C0802M) this.f3382p.get(i3);
                if (!c0802m2.m2011h()) {
                    this.f3378l = c0802m2;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2028k() {
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        for (C0802M c0802m = this.f3375i; c0802m != null; c0802m = c0802m.f3350m) {
            c1673dM4116m.m4102a(c0802m.f3344g.f3354a);
        }
        C0802M c0802m2 = this.f3376j;
        this.f3370d.m1698c(new RunnableC0804O(this, c1673dM4116m, c0802m2 == null ? null : c0802m2.f3344g.f3354a, 0));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2029l(C0802M c0802m) {
        AbstractC0646n.m1631i(c0802m);
        boolean z3 = false;
        if (c0802m.equals(this.f3377k)) {
            return false;
        }
        this.f3377k = c0802m;
        while (true) {
            c0802m = c0802m.f3350m;
            if (c0802m == null) {
                break;
            }
            if (c0802m == this.f3376j) {
                this.f3376j = this.f3375i;
                z3 = true;
            }
            c0802m.m2012i();
            this.f3379m--;
        }
        C0802M c0802m2 = this.f3377k;
        c0802m2.getClass();
        if (c0802m2.f3350m != null) {
            c0802m2.m2005b();
            c0802m2.f3350m = null;
            c0802m2.m2006c();
        }
        m2028k();
        return z3;
    }

    /* JADX INFO: renamed from: n */
    public final C1907A m2030n(AbstractC0558V abstractC0558V, Object obj, long j3) {
        long jM2031o;
        int iMo1328b;
        Object obj2 = obj;
        C0556T c0556t = this.f3367a;
        int i3 = abstractC0558V.mo1410g(obj2, c0556t).f1968c;
        Object obj3 = this.f3380n;
        if (obj3 == null || (iMo1328b = abstractC0558V.mo1328b(obj3)) == -1 || abstractC0558V.mo1329f(iMo1328b, c0556t, false).f1968c != i3) {
            C0802M c0802m = this.f3375i;
            while (true) {
                if (c0802m == null) {
                    C0802M c0802m2 = this.f3375i;
                    while (true) {
                        if (c0802m2 == null) {
                            jM2031o = m2031o(obj2);
                            if (jM2031o != -1) {
                                break;
                            }
                            jM2031o = this.f3372f;
                            this.f3372f = 1 + jM2031o;
                            if (this.f3375i != null) {
                                break;
                            }
                            this.f3380n = obj2;
                            this.f3381o = jM2031o;
                            break;
                        }
                        int iMo1328b2 = abstractC0558V.mo1328b(c0802m2.f3339b);
                        if (iMo1328b2 != -1 && abstractC0558V.mo1329f(iMo1328b2, c0556t, false).f1968c == i3) {
                            jM2031o = c0802m2.f3344g.f3354a.f8314d;
                            break;
                        }
                        c0802m2 = c0802m2.f3350m;
                    }
                } else {
                    if (c0802m.f3339b.equals(obj2)) {
                        jM2031o = c0802m.f3344g.f3354a.f8314d;
                        break;
                    }
                    c0802m = c0802m.f3350m;
                }
            }
        } else {
            jM2031o = this.f3381o;
        }
        abstractC0558V.mo1410g(obj2, c0556t);
        int i4 = c0556t.f1968c;
        C0557U c0557u = this.f3368b;
        abstractC0558V.m1414n(i4, c0557u);
        boolean z3 = false;
        for (int iMo1328b3 = abstractC0558V.mo1328b(obj); iMo1328b3 >= c0557u.f1988n; iMo1328b3--) {
            abstractC0558V.mo1329f(iMo1328b3, c0556t, true);
            boolean z4 = c0556t.f1972g.f2045a > 0;
            z3 |= z4;
            if (c0556t.m1398c(c0556t.f1969d) != -1) {
                obj2 = c0556t.f1967b;
                obj2.getClass();
            }
            if (z3 && (!z4 || c0556t.f1969d != 0)) {
                break;
            }
        }
        return m2017m(abstractC0558V, obj2, j3, jM2031o, this.f3368b, this.f3367a);
    }

    /* JADX INFO: renamed from: o */
    public final long m2031o(Object obj) {
        for (int i3 = 0; i3 < this.f3382p.size(); i3++) {
            C0802M c0802m = (C0802M) this.f3382p.get(i3);
            if (c0802m.f3339b.equals(obj)) {
                return c0802m.f3344g.f3354a.f8314d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2032p(AbstractC0558V abstractC0558V) {
        AbstractC0558V abstractC0558V2;
        C0802M c0802m;
        C0802M c0802m2 = this.f3375i;
        if (c0802m2 == null) {
            return true;
        }
        int iMo1328b = abstractC0558V.mo1328b(c0802m2.f3339b);
        while (true) {
            abstractC0558V2 = abstractC0558V;
            iMo1328b = abstractC0558V2.m1408d(iMo1328b, this.f3367a, this.f3368b, this.f3373g, this.f3374h);
            while (true) {
                c0802m2.getClass();
                c0802m = c0802m2.f3350m;
                if (c0802m == null || c0802m2.f3344g.f3360g) {
                    break;
                }
                c0802m2 = c0802m;
            }
            if (iMo1328b == -1 || c0802m == null || abstractC0558V2.mo1328b(c0802m.f3339b) != iMo1328b) {
                break;
            }
            c0802m2 = c0802m;
            abstractC0558V = abstractC0558V2;
        }
        boolean zM2029l = m2029l(c0802m2);
        c0802m2.f3344g = m2024g(abstractC0558V2, c0802m2.f3344g);
        return !zM2029l;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2033q(AbstractC0558V abstractC0558V, long j3, long j4) {
        C0803N c0803nM2024g;
        C0802M c0802m = this.f3375i;
        C0802M c0802m2 = null;
        while (c0802m != null) {
            C0803N c0803n = c0802m.f3344g;
            if (c0802m2 == null) {
                c0803nM2024g = m2024g(abstractC0558V, c0803n);
            } else {
                C0803N c0803nM2020c = m2020c(abstractC0558V, c0802m2, j3);
                if (c0803nM2020c == null) {
                    return !m2029l(c0802m2);
                }
                if (c0803n.f3355b != c0803nM2020c.f3355b || !c0803n.f3354a.equals(c0803nM2020c.f3354a)) {
                    return !m2029l(c0802m2);
                }
                c0803nM2024g = c0803nM2020c;
            }
            c0802m.f3344g = c0803nM2024g.m2015a(c0803n.f3356c);
            long j5 = c0803n.f3358e;
            if (j5 != -9223372036854775807L) {
                long j6 = c0803nM2024g.f3358e;
                if (j5 != j6) {
                    c0802m.m2014k();
                    boolean z3 = c0802m == this.f3376j && !c0802m.f3344g.f3359f && (j4 == Long.MIN_VALUE || j4 >= ((j6 > (-9223372036854775807L) ? 1 : (j6 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0802m.f3353p + j6));
                    if (m2029l(c0802m) || z3) {
                        return false;
                    }
                }
            }
            c0802m2 = c0802m;
            c0802m = c0802m.f3350m;
        }
        return true;
    }
}
