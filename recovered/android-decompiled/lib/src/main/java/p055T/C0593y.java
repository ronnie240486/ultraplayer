package p055T;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p105h2.AbstractC1676G;
import p105h2.C1673D;

/* JADX INFO: renamed from: T.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0593y {

    /* JADX INFO: renamed from: a */
    public final Uri f2199a;

    /* JADX INFO: renamed from: b */
    public final String f2200b;

    /* JADX INFO: renamed from: c */
    public final C0590v f2201c;

    /* JADX INFO: renamed from: d */
    public final List f2202d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1676G f2203e;

    /* JADX INFO: renamed from: f */
    public final long f2204f;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
        AbstractC0632A.m1566G(5);
        AbstractC0632A.m1566G(6);
        AbstractC0632A.m1566G(7);
    }

    public C0593y(Uri uri, String str, C0590v c0590v, List list, AbstractC1676G abstractC1676G, long j3) {
        this.f2199a = uri;
        this.f2200b = AbstractC0545H.m1364l(str);
        this.f2201c = c0590v;
        this.f2202d = list;
        this.f2203e = abstractC1676G;
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        for (int i3 = 0; i3 < abstractC1676G.size(); i3++) {
            ((C0538A) abstractC1676G.get(i3)).getClass();
            c1673dM4116m.m4102a(new C0538A());
        }
        c1673dM4116m.m4112f();
        this.f2204f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0593y)) {
            return false;
        }
        C0593y c0593y = (C0593y) obj;
        return this.f2199a.equals(c0593y.f2199a) && Objects.equals(this.f2200b, c0593y.f2200b) && Objects.equals(this.f2201c, c0593y.f2201c) && this.f2202d.equals(c0593y.f2202d) && this.f2203e.equals(c0593y.f2203e) && Long.valueOf(this.f2204f).equals(Long.valueOf(c0593y.f2204f));
    }

    public final int hashCode() {
        int iHashCode = this.f2199a.hashCode() * 31;
        String str = this.f2200b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C0590v c0590v = this.f2201c;
        return (int) ((((long) ((this.f2203e.hashCode() + ((this.f2202d.hashCode() + ((iHashCode2 + (c0590v != null ? c0590v.hashCode() : 0)) * 961)) * 961)) * 31)) * 31) + this.f2204f);
    }
}
