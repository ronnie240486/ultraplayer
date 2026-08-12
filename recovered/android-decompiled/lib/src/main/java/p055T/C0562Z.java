package p055T;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p064W.AbstractC0632A;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: T.Z */
/* JADX INFO: loaded from: classes.dex */
public class C0562Z {

    /* JADX INFO: renamed from: a */
    public int f2000a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b */
    public int f2001b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public int f2002c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f2003d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f2004e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f2005f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public boolean f2006g = true;

    /* JADX INFO: renamed from: h */
    public C1692X f2007h;

    /* JADX INFO: renamed from: i */
    public C1692X f2008i;

    /* JADX INFO: renamed from: j */
    public int f2009j;

    /* JADX INFO: renamed from: k */
    public int f2010k;

    /* JADX INFO: renamed from: l */
    public C1692X f2011l;

    /* JADX INFO: renamed from: m */
    public C0561Y f2012m;

    /* JADX INFO: renamed from: n */
    public C1692X f2013n;

    /* JADX INFO: renamed from: o */
    public int f2014o;

    /* JADX INFO: renamed from: p */
    public int f2015p;

    /* JADX INFO: renamed from: q */
    public HashMap f2016q;

    /* JADX INFO: renamed from: r */
    public HashSet f2017r;

    public C0562Z() {
        C1674E c1674e = AbstractC1676G.f7601h;
        C1692X c1692x = C1692X.f7629k;
        this.f2007h = c1692x;
        this.f2008i = c1692x;
        this.f2009j = Integer.MAX_VALUE;
        this.f2010k = Integer.MAX_VALUE;
        this.f2011l = c1692x;
        this.f2012m = C0561Y.f1999a;
        this.f2013n = c1692x;
        this.f2014o = 0;
        this.f2015p = 0;
        this.f2016q = new HashMap();
        this.f2017r = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public C0564a0 mo1418a() {
        return new C0564a0(this);
    }

    /* JADX INFO: renamed from: b */
    public C0562Z mo1419b(int i3) {
        Iterator it = this.f2016q.values().iterator();
        while (it.hasNext()) {
            if (((C0560X) it.next()).f1997a.f1994c == i3) {
                it.remove();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m1420c(C0564a0 c0564a0) {
        this.f2000a = c0564a0.f2025a;
        this.f2001b = c0564a0.f2026b;
        this.f2002c = c0564a0.f2027c;
        this.f2003d = c0564a0.f2028d;
        this.f2004e = c0564a0.f2029e;
        this.f2005f = c0564a0.f2030f;
        this.f2006g = c0564a0.f2031g;
        this.f2007h = c0564a0.f2032h;
        this.f2008i = c0564a0.f2033i;
        this.f2009j = c0564a0.f2034j;
        this.f2010k = c0564a0.f2035k;
        this.f2011l = c0564a0.f2036l;
        this.f2012m = c0564a0.f2037m;
        this.f2013n = c0564a0.f2038n;
        this.f2014o = c0564a0.f2039o;
        this.f2015p = c0564a0.f2040p;
        this.f2017r = new HashSet(c0564a0.f2042r);
        this.f2016q = new HashMap(c0564a0.f2041q);
    }

    /* JADX INFO: renamed from: d */
    public C0562Z mo1421d() {
        this.f2015p = -3;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0562Z mo1422e(C0560X c0560x) {
        C0559W c0559w = c0560x.f1997a;
        mo1419b(c0559w.f1994c);
        this.f2016q.put(c0559w, c0560x);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C0562Z mo1423f() {
        return mo1424g(new String[0]);
    }

    /* JADX INFO: renamed from: g */
    public C0562Z mo1424g(String... strArr) {
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        for (String str : strArr) {
            str.getClass();
            c1673dM4116m.m4102a(AbstractC0632A.m1572M(str));
        }
        this.f2013n = c1673dM4116m.m4112f();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C0562Z mo1425h() {
        this.f2014o = 0;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C0562Z mo1426i(int i3) {
        this.f2017r.remove(Integer.valueOf(i3));
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C0562Z mo1427j(int i3, int i4) {
        this.f2004e = i3;
        this.f2005f = i4;
        this.f2006g = true;
        return this;
    }
}
