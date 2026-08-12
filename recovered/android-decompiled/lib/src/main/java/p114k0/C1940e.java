package p114k0;

import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0565b;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: k0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1940e extends AbstractC1956p {

    /* JADX INFO: renamed from: c */
    public final long f8508c;

    /* JADX INFO: renamed from: d */
    public final long f8509d;

    /* JADX INFO: renamed from: e */
    public final long f8510e;

    /* JADX INFO: renamed from: f */
    public final boolean f8511f;

    public C1940e(AbstractC0558V abstractC0558V, long j3, long j4) throws C1942f {
        super(abstractC0558V);
        boolean z3 = false;
        if (abstractC0558V.mo1330h() != 1) {
            throw new C1942f(0);
        }
        C0557U c0557uMo1332m = abstractC0558V.mo1332m(0, new C0557U(), 0L);
        long jMax = Math.max(0L, j3);
        if (!c0557uMo1332m.f1985k && jMax != 0 && !c0557uMo1332m.f1982h) {
            throw new C1942f(1);
        }
        long jMax2 = j4 == Long.MIN_VALUE ? c0557uMo1332m.f1987m : Math.max(0L, j4);
        long j5 = c0557uMo1332m.f1987m;
        if (j5 != -9223372036854775807L) {
            long j6 = jMax2 > j5 ? j5 : jMax2;
            if (jMax > j6) {
                throw new C1942f(2, jMax, j6);
            }
            jMax2 = j6;
        }
        this.f8508c = jMax;
        this.f8509d = jMax2;
        this.f8510e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c0557uMo1332m.f1983i && (jMax2 == -9223372036854775807L || (j5 != -9223372036854775807L && jMax2 == j5))) {
            z3 = true;
        }
        this.f8511f = z3;
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: f */
    public final C0556T mo1329f(int i3, C0556T c0556t, boolean z3) {
        this.f8557b.mo1329f(0, c0556t, z3);
        long j3 = c0556t.f1970e - this.f8508c;
        long j4 = this.f8510e;
        c0556t.m1403h(c0556t.f1966a, c0556t.f1967b, 0, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, j3, C0565b.f2043c, false);
        return c0556t;
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: m */
    public final C0557U mo1332m(int i3, C0557U c0557u, long j3) {
        this.f8557b.mo1332m(0, c0557u, 0L);
        long j4 = c0557u.f1990p;
        long j5 = this.f8508c;
        c0557u.f1990p = j4 + j5;
        c0557u.f1987m = this.f8510e;
        c0557u.f1983i = this.f8511f;
        long j6 = c0557u.f1986l;
        if (j6 != -9223372036854775807L) {
            long jMax = Math.max(j6, j5);
            c0557u.f1986l = jMax;
            long j7 = this.f8509d;
            if (j7 != -9223372036854775807L) {
                jMax = Math.min(jMax, j7);
            }
            c0557u.f1986l = jMax - j5;
        }
        long jM1581V = AbstractC0632A.m1581V(j5);
        long j8 = c0557u.f1979e;
        if (j8 != -9223372036854775807L) {
            c0557u.f1979e = j8 + jM1581V;
        }
        long j9 = c0557u.f1980f;
        if (j9 != -9223372036854775807L) {
            c0557u.f1980f = j9 + jM1581V;
        }
        return c0557u;
    }
}
