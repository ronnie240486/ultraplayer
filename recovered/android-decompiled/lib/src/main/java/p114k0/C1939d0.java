package p114k0;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p034L1.C0352g;
import p040N1.C0437r;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0542E;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0565b;
import p055T.C0587s;
import p055T.C0590v;
import p055T.C0591w;
import p055T.C0592x;
import p055T.C0593y;
import p055T.C0594z;
import p064W.AbstractC0646n;
import p105h2.C1692X;

/* JADX INFO: renamed from: k0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1939d0 extends AbstractC0558V {

    /* JADX INFO: renamed from: n */
    public static final Object f8495n = new Object();

    /* JADX INFO: renamed from: b */
    public final long f8496b;

    /* JADX INFO: renamed from: c */
    public final long f8497c;

    /* JADX INFO: renamed from: d */
    public final long f8498d;

    /* JADX INFO: renamed from: e */
    public final long f8499e;

    /* JADX INFO: renamed from: f */
    public final long f8500f;

    /* JADX INFO: renamed from: g */
    public final long f8501g;

    /* JADX INFO: renamed from: h */
    public final boolean f8502h;

    /* JADX INFO: renamed from: i */
    public final boolean f8503i;

    /* JADX INFO: renamed from: j */
    public final boolean f8504j;

    /* JADX INFO: renamed from: k */
    public final C0352g f8505k;

    /* JADX INFO: renamed from: l */
    public final C0539B f8506l;

    /* JADX INFO: renamed from: m */
    public final C0592x f8507m;

    static {
        C0587s c0587s = new C0587s();
        C0437r c0437r = new C0437r();
        List list = Collections.EMPTY_LIST;
        C1692X c1692x = C1692X.f7629k;
        C0591w c0591w = new C0591w();
        C0594z c0594z = C0594z.f2205a;
        Uri uri = Uri.EMPTY;
        AbstractC0646n.m1630h(((Uri) c0437r.f1485c) == null || ((UUID) c0437r.f1484b) != null);
        if (uri != null) {
            new C0593y(uri, null, ((UUID) c0437r.f1484b) != null ? new C0590v(c0437r) : null, list, c1692x, -9223372036854775807L);
        }
        c0587s.m1451a();
        c0591w.m1453a();
        C0542E c0542e = C0542E.f1910D;
    }

    public C1939d0(long j3, long j4, long j5, long j6, long j7, long j8, boolean z3, boolean z4, boolean z5, C0352g c0352g, C0539B c0539b, C0592x c0592x) {
        this.f8496b = j3;
        this.f8497c = j4;
        this.f8498d = j5;
        this.f8499e = j6;
        this.f8500f = j7;
        this.f8501g = j8;
        this.f8502h = z3;
        this.f8503i = z4;
        this.f8504j = z5;
        this.f8505k = c0352g;
        c0539b.getClass();
        this.f8506l = c0539b;
        this.f8507m = c0592x;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: b */
    public final int mo1328b(Object obj) {
        return f8495n.equals(obj) ? 0 : -1;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: f */
    public final C0556T mo1329f(int i3, C0556T c0556t, boolean z3) {
        AbstractC0646n.m1628f(i3, 1);
        Object obj = z3 ? f8495n : null;
        long j3 = -this.f8500f;
        c0556t.getClass();
        c0556t.m1403h(null, obj, 0, this.f8498d, j3, C0565b.f2043c, false);
        return c0556t;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: h */
    public final int mo1330h() {
        return 1;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: l */
    public final Object mo1331l(int i3) {
        AbstractC0646n.m1628f(i3, 1);
        return f8495n;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: m */
    public final C0557U mo1332m(int i3, C0557U c0557u, long j3) {
        long j4;
        AbstractC0646n.m1628f(i3, 1);
        long j5 = this.f8501g;
        boolean z3 = this.f8503i;
        if (!z3 || this.f8504j || j3 == 0) {
            j4 = j5;
        } else {
            long j6 = this.f8499e;
            if (j6 != -9223372036854775807L) {
                j5 += j3;
                if (j5 <= j6) {
                    j4 = j5;
                }
            }
            j4 = -9223372036854775807L;
        }
        c0557u.m1405b(C0557U.f1973q, this.f8506l, this.f8505k, this.f8496b, this.f8497c, -9223372036854775807L, this.f8502h, z3, this.f8507m, j4, this.f8499e, 0, 0, this.f8500f);
        return c0557u;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: o */
    public final int mo1333o() {
        return 1;
    }
}
