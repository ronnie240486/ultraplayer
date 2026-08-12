package p055T;

import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p105h2.AbstractC1679J;
import p105h2.AbstractC1723q;
import p105h2.C1692X;
import p105h2.C1700c0;

/* JADX INFO: renamed from: T.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0564a0 {

    /* JADX INFO: renamed from: s */
    public static final C0564a0 f2024s = new C0564a0(new C0562Z());

    /* JADX INFO: renamed from: a */
    public final int f2025a;

    /* JADX INFO: renamed from: b */
    public final int f2026b;

    /* JADX INFO: renamed from: c */
    public final int f2027c;

    /* JADX INFO: renamed from: d */
    public final int f2028d;

    /* JADX INFO: renamed from: e */
    public final int f2029e;

    /* JADX INFO: renamed from: f */
    public final int f2030f;

    /* JADX INFO: renamed from: g */
    public final boolean f2031g;

    /* JADX INFO: renamed from: h */
    public final C1692X f2032h;

    /* JADX INFO: renamed from: i */
    public final C1692X f2033i;

    /* JADX INFO: renamed from: j */
    public final int f2034j;

    /* JADX INFO: renamed from: k */
    public final int f2035k;

    /* JADX INFO: renamed from: l */
    public final C1692X f2036l;

    /* JADX INFO: renamed from: m */
    public final C0561Y f2037m;

    /* JADX INFO: renamed from: n */
    public final C1692X f2038n;

    /* JADX INFO: renamed from: o */
    public final int f2039o;

    /* JADX INFO: renamed from: p */
    public final int f2040p;

    /* JADX INFO: renamed from: q */
    public final C1700c0 f2041q;

    /* JADX INFO: renamed from: r */
    public final AbstractC1679J f2042r;

    static {
        AbstractC0462h.m1167g(1, 2, 3, 4, 5);
        AbstractC0462h.m1167g(6, 7, 8, 9, 10);
        AbstractC0462h.m1167g(11, 12, 13, 14, 15);
        AbstractC0462h.m1167g(16, 17, 18, 19, 20);
        AbstractC0462h.m1167g(21, 22, 23, 24, 25);
        AbstractC0462h.m1167g(26, 27, 28, 29, 30);
        AbstractC0632A.m1566G(31);
    }

    public C0564a0(C0562Z c0562z) {
        this.f2025a = c0562z.f2000a;
        this.f2026b = c0562z.f2001b;
        this.f2027c = c0562z.f2002c;
        this.f2028d = c0562z.f2003d;
        this.f2029e = c0562z.f2004e;
        this.f2030f = c0562z.f2005f;
        this.f2031g = c0562z.f2006g;
        this.f2032h = c0562z.f2007h;
        this.f2033i = c0562z.f2008i;
        this.f2034j = c0562z.f2009j;
        this.f2035k = c0562z.f2010k;
        this.f2036l = c0562z.f2011l;
        this.f2037m = c0562z.f2012m;
        this.f2038n = c0562z.f2013n;
        this.f2039o = c0562z.f2014o;
        this.f2040p = c0562z.f2015p;
        this.f2041q = C1700c0.m4138a(c0562z.f2016q);
        this.f2042r = AbstractC1679J.m4128n(c0562z.f2017r);
    }

    /* JADX INFO: renamed from: a */
    public C0562Z mo1429a() {
        C0562Z c0562z = new C0562Z();
        c0562z.m1420c(this);
        return c0562z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0564a0 c0564a0 = (C0564a0) obj;
        if (this.f2025a != c0564a0.f2025a || this.f2026b != c0564a0.f2026b || this.f2027c != c0564a0.f2027c || this.f2028d != c0564a0.f2028d || this.f2031g != c0564a0.f2031g || this.f2029e != c0564a0.f2029e || this.f2030f != c0564a0.f2030f || !this.f2032h.equals(c0564a0.f2032h) || !this.f2033i.equals(c0564a0.f2033i) || this.f2034j != c0564a0.f2034j || this.f2035k != c0564a0.f2035k || !this.f2036l.equals(c0564a0.f2036l) || !this.f2037m.equals(c0564a0.f2037m) || !this.f2038n.equals(c0564a0.f2038n) || this.f2039o != c0564a0.f2039o || this.f2040p != c0564a0.f2040p) {
            return false;
        }
        C1700c0 c1700c0 = this.f2041q;
        c1700c0.getClass();
        return AbstractC1723q.m4155d(c1700c0, c0564a0.f2041q) && this.f2042r.equals(c0564a0.f2042r);
    }

    public int hashCode() {
        int iHashCode = (this.f2036l.hashCode() + ((((((this.f2033i.hashCode() + ((this.f2032h.hashCode() + ((((((((((((((this.f2025a + 31) * 31) + this.f2026b) * 31) + this.f2027c) * 31) + this.f2028d) * 28629151) + (this.f2031g ? 1 : 0)) * 31) + this.f2029e) * 31) + this.f2030f) * 31)) * 961)) * 961) + this.f2034j) * 31) + this.f2035k) * 31)) * 31;
        this.f2037m.getClass();
        return this.f2042r.hashCode() + ((this.f2041q.hashCode() + ((((((this.f2038n.hashCode() + ((iHashCode + 29791) * 31)) * 31) + this.f2039o) * 31) + this.f2040p) * 28629151)) * 31);
    }
}
