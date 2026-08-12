package p114k0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import p009D0.C0106b;
import p034L1.C0352g;
import p040N1.C0437r;
import p055T.AbstractC0545H;
import p055T.C0538A;
import p055T.C0539B;
import p055T.C0542E;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p055T.C0589u;
import p055T.C0590v;
import p055T.C0591w;
import p055T.C0592x;
import p055T.C0593y;
import p055T.C0594z;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p070Y.InterfaceC0710g;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2238k;

/* JADX INFO: renamed from: k0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1955o implements InterfaceC1966z {

    /* JADX INFO: renamed from: a */
    public final C0437r f8549a;

    /* JADX INFO: renamed from: b */
    public final C0106b f8550b;

    /* JADX INFO: renamed from: c */
    public final long f8551c;

    /* JADX INFO: renamed from: d */
    public final long f8552d;

    /* JADX INFO: renamed from: e */
    public final long f8553e;

    /* JADX INFO: renamed from: f */
    public final float f8554f;

    /* JADX INFO: renamed from: g */
    public final float f8555g;

    /* JADX INFO: renamed from: h */
    public boolean f8556h;

    public C1955o(C0106b c0106b, C2238k c2238k) {
        this.f8550b = c0106b;
        C0352g c0352g = new C0352g(12);
        C0437r c0437r = new C0437r();
        c0437r.f1484b = c2238k;
        c0437r.f1488f = c0352g;
        c0437r.f1485c = new HashMap();
        c0437r.f1486d = new HashMap();
        c0437r.f1483a = true;
        this.f8549a = c0437r;
        if (c0106b != ((C0106b) c0437r.f1487e)) {
            c0437r.f1487e = c0106b;
            ((HashMap) c0437r.f1485c).clear();
            ((HashMap) c0437r.f1486d).clear();
        }
        this.f8551c = -9223372036854775807L;
        this.f8552d = -9223372036854775807L;
        this.f8553e = -9223372036854775807L;
        this.f8554f = -3.4028235E38f;
        this.f8555g = -3.4028235E38f;
        this.f8556h = true;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1966z m4508d(Class cls, C0106b c0106b) {
        try {
            return (InterfaceC1966z) cls.getConstructor(InterfaceC0710g.class).newInstance(c0106b);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: a */
    public final InterfaceC1966z mo2582a(boolean z3) {
        this.f8556h = z3;
        C0437r c0437r = this.f8549a;
        c0437r.f1483a = z3;
        C2238k c2238k = (C2238k) c0437r.f1484b;
        synchronized (c2238k) {
            c2238k.f9637b = z3;
        }
        Iterator it = ((HashMap) c0437r.f1486d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC1966z) it.next()).mo2582a(z3);
        }
        return this;
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: b */
    public final InterfaceC1966z mo2583b(C0352g c0352g) {
        C0437r c0437r = this.f8549a;
        c0437r.f1488f = c0352g;
        C2238k c2238k = (C2238k) c0437r.f1484b;
        synchronized (c2238k) {
            c2238k.f9638c = c0352g;
        }
        Iterator it = ((HashMap) c0437r.f1486d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC1966z) it.next()).mo2583b(c0352g);
        }
        return this;
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: c */
    public final AbstractC1932a mo2584c(C0539B c0539b) {
        long j3;
        Uri uri;
        String str;
        C0593y c0593y;
        C0539B c0539b2 = c0539b;
        c0539b2.f1875b.getClass();
        String scheme = c0539b2.f1875b.f2199a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c0539b2.f1875b.f2200b, "application/x-image-uri")) {
            long j4 = c0539b2.f1875b.f2204f;
            int i3 = AbstractC0632A.f2454a;
            throw null;
        }
        C0593y c0593y2 = c0539b2.f1875b;
        int iM1564E = AbstractC0632A.m1564E(c0593y2.f2199a, c0593y2.f2200b);
        if (c0539b2.f1875b.f2204f != -9223372036854775807L) {
            C2238k c2238k = (C2238k) this.f8549a.f1484b;
            synchronized (c2238k) {
                c2238k.f9639d = 1;
            }
        }
        try {
            C0437r c0437r = this.f8549a;
            HashMap map = (HashMap) c0437r.f1486d;
            InterfaceC1966z interfaceC1966z = (InterfaceC1966z) map.get(Integer.valueOf(iM1564E));
            if (interfaceC1966z == null) {
                interfaceC1966z = (InterfaceC1966z) c0437r.m1150b(iM1564E).get();
                interfaceC1966z.mo2583b((C0352g) c0437r.f1488f);
                interfaceC1966z.mo2582a(c0437r.f1483a);
                map.put(Integer.valueOf(iM1564E), interfaceC1966z);
            }
            C0591w c0591wM1454a = c0539b2.f1876c.m1454a();
            C0592x c0592x = c0539b2.f1876c;
            if (c0592x.f2194a == -9223372036854775807L) {
                c0591wM1454a.f2189a = this.f8551c;
            }
            if (c0592x.f2197d == -3.4028235E38f) {
                c0591wM1454a.f2192d = this.f8554f;
            }
            if (c0592x.f2198e == -3.4028235E38f) {
                c0591wM1454a.f2193e = this.f8555g;
            }
            if (c0592x.f2195b == -9223372036854775807L) {
                c0591wM1454a.f2190b = this.f8552d;
            }
            if (c0592x.f2196c == -9223372036854775807L) {
                c0591wM1454a.f2191c = this.f8553e;
            }
            C0592x c0592x2 = new C0592x(c0591wM1454a);
            if (!c0592x2.equals(c0539b2.f1876c)) {
                C0437r c0437r2 = new C0437r();
                List list = Collections.EMPTY_LIST;
                AbstractC1676G abstractC1676G = C1692X.f7629k;
                C0594z c0594z = C0594z.f2205a;
                C0589u c0589u = c0539b2.f1878e;
                C0587s c0587s = new C0587s();
                c0587s.f2181a = c0589u.f2182a;
                String str2 = c0539b2.f1874a;
                C0542E c0542e = c0539b2.f1877d;
                c0539b2.f1876c.m1454a();
                C0594z c0594z2 = c0539b2.f1879f;
                C0593y c0593y3 = c0539b2.f1875b;
                if (c0593y3 != null) {
                    String str3 = c0593y3.f2200b;
                    Uri uri2 = c0593y3.f2199a;
                    list = c0593y3.f2202d;
                    abstractC1676G = c0593y3.f2203e;
                    C0590v c0590v = c0593y3.f2201c;
                    C0437r c0437rM1452a = c0590v != null ? c0590v.m1452a() : new C0437r();
                    str = str3;
                    j3 = c0593y3.f2204f;
                    uri = uri2;
                    c0437r2 = c0437rM1452a;
                } else {
                    j3 = -9223372036854775807L;
                    uri = null;
                    str = null;
                }
                List list2 = list;
                AbstractC1676G abstractC1676G2 = abstractC1676G;
                C0591w c0591wM1454a2 = c0592x2.m1454a();
                AbstractC0646n.m1630h(((Uri) c0437r2.f1485c) == null || ((UUID) c0437r2.f1484b) != null);
                if (uri != null) {
                    c0593y = new C0593y(uri, str, ((UUID) c0437r2.f1484b) != null ? new C0590v(c0437r2) : null, list2, abstractC1676G2, j3);
                } else {
                    c0593y = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = str2;
                C0589u c0589u2 = new C0589u(c0587s);
                C0592x c0592x3 = new C0592x(c0591wM1454a2);
                if (c0542e == null) {
                    c0542e = C0542E.f1910D;
                }
                c0539b2 = new C0539B(str4, c0589u2, c0593y, c0592x3, c0542e, c0594z2);
            }
            AbstractC1932a abstractC1932aMo2584c = interfaceC1966z.mo2584c(c0539b2);
            AbstractC1676G abstractC1676G3 = c0539b2.f1875b.f2203e;
            if (!abstractC1676G3.isEmpty()) {
                AbstractC1932a[] abstractC1932aArr = new AbstractC1932a[abstractC1676G3.size() + 1];
                abstractC1932aArr[0] = abstractC1932aMo2584c;
                if (abstractC1676G3.size() > 0) {
                    if (!this.f8556h) {
                        this.f8550b.getClass();
                        C0538A c0538a = (C0538A) abstractC1676G3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        C1674E c1674e = AbstractC1676G.f7601h;
                        C1692X c1692x = C1692X.f7629k;
                        List list3 = Collections.EMPTY_LIST;
                        C1692X c1692x2 = C1692X.f7629k;
                        C0594z c0594z3 = C0594z.f2205a;
                        Uri uri3 = Uri.EMPTY;
                        c0538a.getClass();
                        throw null;
                    }
                    C0582n c0582n = new C0582n();
                    ((C0538A) abstractC1676G3.get(0)).getClass();
                    ArrayList arrayList = AbstractC0545H.f1942a;
                    c0582n.f2114m = null;
                    ((C0538A) abstractC1676G3.get(0)).getClass();
                    c0582n.f2105d = null;
                    ((C0538A) abstractC1676G3.get(0)).getClass();
                    c0582n.f2106e = 0;
                    ((C0538A) abstractC1676G3.get(0)).getClass();
                    c0582n.f2107f = 0;
                    ((C0538A) abstractC1676G3.get(0)).getClass();
                    c0582n.f2103b = null;
                    ((C0538A) abstractC1676G3.get(0)).getClass();
                    c0582n.f2102a = null;
                    new C0583o(c0582n);
                    ((C0538A) abstractC1676G3.get(0)).getClass();
                    throw null;
                }
                abstractC1932aMo2584c = new C1917K(abstractC1932aArr);
            }
            long j5 = c0539b2.f1878e.f2182a;
            if (j5 != Long.MIN_VALUE) {
                abstractC1932aMo2584c = new C1944g(abstractC1932aMo2584c, j5, true);
            }
            c0539b2.f1875b.getClass();
            c0539b2.f1875b.getClass();
            return abstractC1932aMo2584c;
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
