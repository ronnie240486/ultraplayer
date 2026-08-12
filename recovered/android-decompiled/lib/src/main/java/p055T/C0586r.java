package p055T;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p040N1.C0437r;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1692X;

/* JADX INFO: renamed from: T.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0586r {

    /* JADX INFO: renamed from: a */
    public String f2170a;

    /* JADX INFO: renamed from: b */
    public Uri f2171b;

    /* JADX INFO: renamed from: c */
    public String f2172c;

    /* JADX INFO: renamed from: i */
    public C0542E f2178i;

    /* JADX INFO: renamed from: d */
    public final C0587s f2173d = new C0587s();

    /* JADX INFO: renamed from: e */
    public C0437r f2174e = new C0437r();

    /* JADX INFO: renamed from: f */
    public final List f2175f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: g */
    public final AbstractC1676G f2176g = C1692X.f7629k;

    /* JADX INFO: renamed from: j */
    public final C0591w f2179j = new C0591w();

    /* JADX INFO: renamed from: k */
    public final C0594z f2180k = C0594z.f2205a;

    /* JADX INFO: renamed from: h */
    public final long f2177h = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final C0539B m1450a() {
        C0593y c0593y;
        C0437r c0437r = this.f2174e;
        AbstractC0646n.m1630h(((Uri) c0437r.f1485c) == null || ((UUID) c0437r.f1484b) != null);
        Uri uri = this.f2171b;
        if (uri != null) {
            String str = this.f2172c;
            C0437r c0437r2 = this.f2174e;
            c0593y = new C0593y(uri, str, ((UUID) c0437r2.f1484b) != null ? new C0590v(c0437r2) : null, this.f2175f, this.f2176g, this.f2177h);
        } else {
            c0593y = null;
        }
        String str2 = this.f2170a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        C0587s c0587s = this.f2173d;
        c0587s.getClass();
        C0589u c0589u = new C0589u(c0587s);
        C0591w c0591w = this.f2179j;
        c0591w.getClass();
        C0592x c0592x = new C0592x(c0591w);
        C0542E c0542e = this.f2178i;
        if (c0542e == null) {
            c0542e = C0542E.f1910D;
        }
        return new C0539B(str3, c0589u, c0593y, c0592x, c0542e, this.f2180k);
    }
}
