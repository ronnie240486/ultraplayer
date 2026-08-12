package p055T;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p034L1.C0352g;
import p040N1.C0437r;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.C1692X;

/* JADX INFO: renamed from: T.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0557U {

    /* JADX INFO: renamed from: q */
    public static final Object f1973q = new Object();

    /* JADX INFO: renamed from: r */
    public static final C0539B f1974r;

    /* JADX INFO: renamed from: b */
    public Object f1976b;

    /* JADX INFO: renamed from: d */
    public C0352g f1978d;

    /* JADX INFO: renamed from: e */
    public long f1979e;

    /* JADX INFO: renamed from: f */
    public long f1980f;

    /* JADX INFO: renamed from: g */
    public long f1981g;

    /* JADX INFO: renamed from: h */
    public boolean f1982h;

    /* JADX INFO: renamed from: i */
    public boolean f1983i;

    /* JADX INFO: renamed from: j */
    public C0592x f1984j;

    /* JADX INFO: renamed from: k */
    public boolean f1985k;

    /* JADX INFO: renamed from: l */
    public long f1986l;

    /* JADX INFO: renamed from: m */
    public long f1987m;

    /* JADX INFO: renamed from: n */
    public int f1988n;

    /* JADX INFO: renamed from: o */
    public int f1989o;

    /* JADX INFO: renamed from: p */
    public long f1990p;

    /* JADX INFO: renamed from: a */
    public Object f1975a = f1973q;

    /* JADX INFO: renamed from: c */
    public C0539B f1977c = f1974r;

    static {
        C0593y c0593y;
        C0587s c0587s = new C0587s();
        C0437r c0437r = new C0437r();
        List list = Collections.EMPTY_LIST;
        C1692X c1692x = C1692X.f7629k;
        C0591w c0591w = new C0591w();
        C0594z c0594z = C0594z.f2205a;
        Uri uri = Uri.EMPTY;
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
        f1974r = new C0539B("androidx.media3.common.Timeline", new C0589u(c0587s), c0593y, new C0592x(c0591w), C0542E.f1910D, c0594z);
        AbstractC0462h.m1167g(1, 2, 3, 4, 5);
        AbstractC0462h.m1167g(6, 7, 8, 9, 10);
        AbstractC0632A.m1566G(11);
        AbstractC0632A.m1566G(12);
        AbstractC0632A.m1566G(13);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1404a() {
        return this.f1984j != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1405b(Object obj, C0539B c0539b, C0352g c0352g, long j3, long j4, long j5, boolean z3, boolean z4, C0592x c0592x, long j6, long j7, int i3, int i4, long j8) {
        this.f1975a = obj;
        this.f1977c = c0539b != null ? c0539b : f1974r;
        if (c0539b != null) {
            C0593y c0593y = c0539b.f1875b;
        }
        this.f1976b = null;
        this.f1978d = c0352g;
        this.f1979e = j3;
        this.f1980f = j4;
        this.f1981g = j5;
        this.f1982h = z3;
        this.f1983i = z4;
        this.f1984j = c0592x;
        this.f1986l = j6;
        this.f1987m = j7;
        this.f1988n = i3;
        this.f1989o = i4;
        this.f1990p = j8;
        this.f1985k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0557U.class.equals(obj.getClass())) {
            return false;
        }
        C0557U c0557u = (C0557U) obj;
        return Objects.equals(this.f1975a, c0557u.f1975a) && Objects.equals(this.f1977c, c0557u.f1977c) && Objects.equals(this.f1978d, c0557u.f1978d) && Objects.equals(this.f1984j, c0557u.f1984j) && this.f1979e == c0557u.f1979e && this.f1980f == c0557u.f1980f && this.f1981g == c0557u.f1981g && this.f1982h == c0557u.f1982h && this.f1983i == c0557u.f1983i && this.f1985k == c0557u.f1985k && this.f1986l == c0557u.f1986l && this.f1987m == c0557u.f1987m && this.f1988n == c0557u.f1988n && this.f1989o == c0557u.f1989o && this.f1990p == c0557u.f1990p;
    }

    public final int hashCode() {
        int iHashCode = (this.f1977c.hashCode() + ((this.f1975a.hashCode() + 217) * 31)) * 31;
        C0352g c0352g = this.f1978d;
        int iHashCode2 = (iHashCode + (c0352g == null ? 0 : c0352g.hashCode())) * 31;
        C0592x c0592x = this.f1984j;
        int iHashCode3 = (iHashCode2 + (c0592x != null ? c0592x.hashCode() : 0)) * 31;
        long j3 = this.f1979e;
        int i3 = (iHashCode3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f1980f;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f1981g;
        int i5 = (((((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f1982h ? 1 : 0)) * 31) + (this.f1983i ? 1 : 0)) * 31) + (this.f1985k ? 1 : 0)) * 31;
        long j6 = this.f1986l;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f1987m;
        int i7 = (((((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f1988n) * 31) + this.f1989o) * 31;
        long j8 = this.f1990p;
        return i7 + ((int) (j8 ^ (j8 >>> 32)));
    }
}
