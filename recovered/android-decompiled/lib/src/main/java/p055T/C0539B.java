package p055T;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p040N1.C0437r;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: T.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0539B {

    /* JADX INFO: renamed from: g */
    public static final C0539B f1873g;

    /* JADX INFO: renamed from: a */
    public final String f1874a;

    /* JADX INFO: renamed from: b */
    public final C0593y f1875b;

    /* JADX INFO: renamed from: c */
    public final C0592x f1876c;

    /* JADX INFO: renamed from: d */
    public final C0542E f1877d;

    /* JADX INFO: renamed from: e */
    public final C0589u f1878e;

    /* JADX INFO: renamed from: f */
    public final C0594z f1879f;

    static {
        C0587s c0587s = new C0587s();
        C1674E c1674e = AbstractC1676G.f7601h;
        C1692X c1692x = C1692X.f7629k;
        List list = Collections.EMPTY_LIST;
        C1692X c1692x2 = C1692X.f7629k;
        C0591w c0591w = new C0591w();
        f1873g = new C0539B("", new C0589u(c0587s), null, new C0592x(c0591w), C0542E.f1910D, C0594z.f2205a);
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
        AbstractC0632A.m1566G(5);
    }

    public C0539B(String str, C0589u c0589u, C0593y c0593y, C0592x c0592x, C0542E c0542e, C0594z c0594z) {
        this.f1874a = str;
        this.f1875b = c0593y;
        this.f1876c = c0592x;
        this.f1877d = c0542e;
        this.f1878e = c0589u;
        this.f1879f = c0594z;
    }

    /* JADX INFO: renamed from: a */
    public static C0539B m1347a(String str) {
        C0593y c0593y;
        C0587s c0587s = new C0587s();
        C0437r c0437r = new C0437r();
        List list = Collections.EMPTY_LIST;
        C1692X c1692x = C1692X.f7629k;
        C0591w c0591w = new C0591w();
        C0594z c0594z = C0594z.f2205a;
        Uri uri = str == null ? null : Uri.parse(str);
        AbstractC0646n.m1630h(((Uri) c0437r.f1485c) == null || ((UUID) c0437r.f1484b) != null);
        C0590v c0590v = null;
        if (uri != null) {
            if (((UUID) c0437r.f1484b) != null) {
                c0590v = new C0590v(c0437r);
            }
            c0593y = new C0593y(uri, null, c0590v, list, c1692x, -9223372036854775807L);
        } else {
            c0593y = null;
        }
        return new C0539B("", new C0589u(c0587s), c0593y, new C0592x(c0591w), C0542E.f1910D, c0594z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0539B)) {
            return false;
        }
        C0539B c0539b = (C0539B) obj;
        String str = c0539b.f1874a;
        int i3 = AbstractC0632A.f2454a;
        return Objects.equals(this.f1874a, str) && this.f1878e.equals(c0539b.f1878e) && Objects.equals(this.f1875b, c0539b.f1875b) && this.f1876c.equals(c0539b.f1876c) && Objects.equals(this.f1877d, c0539b.f1877d) && Objects.equals(this.f1879f, c0539b.f1879f);
    }

    public final int hashCode() {
        int iHashCode = this.f1874a.hashCode() * 31;
        C0593y c0593y = this.f1875b;
        int iHashCode2 = (this.f1877d.hashCode() + ((this.f1878e.hashCode() + ((this.f1876c.hashCode() + ((iHashCode + (c0593y != null ? c0593y.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f1879f.getClass();
        return iHashCode2;
    }
}
