package p077a0;

import android.os.SystemClock;
import java.util.List;
import p055T.AbstractC0558V;
import p055T.C0548K;
import p055T.C0555S;
import p064W.AbstractC0632A;
import p105h2.C1692X;
import p114k0.C1907A;
import p114k0.C1945g0;
import p125n0.C2045v;

/* JADX INFO: renamed from: a0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0818b0 {

    /* JADX INFO: renamed from: u */
    public static final C1907A f3430u = new C1907A(new Object());

    /* JADX INFO: renamed from: a */
    public final AbstractC0558V f3431a;

    /* JADX INFO: renamed from: b */
    public final C1907A f3432b;

    /* JADX INFO: renamed from: c */
    public final long f3433c;

    /* JADX INFO: renamed from: d */
    public final long f3434d;

    /* JADX INFO: renamed from: e */
    public final int f3435e;

    /* JADX INFO: renamed from: f */
    public final C0839o f3436f;

    /* JADX INFO: renamed from: g */
    public final boolean f3437g;

    /* JADX INFO: renamed from: h */
    public final C1945g0 f3438h;

    /* JADX INFO: renamed from: i */
    public final C2045v f3439i;

    /* JADX INFO: renamed from: j */
    public final List f3440j;

    /* JADX INFO: renamed from: k */
    public final C1907A f3441k;

    /* JADX INFO: renamed from: l */
    public final boolean f3442l;

    /* JADX INFO: renamed from: m */
    public final int f3443m;

    /* JADX INFO: renamed from: n */
    public final int f3444n;

    /* JADX INFO: renamed from: o */
    public final C0548K f3445o;

    /* JADX INFO: renamed from: p */
    public final boolean f3446p;

    /* JADX INFO: renamed from: q */
    public volatile long f3447q;

    /* JADX INFO: renamed from: r */
    public volatile long f3448r;

    /* JADX INFO: renamed from: s */
    public volatile long f3449s;

    /* JADX INFO: renamed from: t */
    public volatile long f3450t;

    public C0818b0(AbstractC0558V abstractC0558V, C1907A c1907a, long j3, long j4, int i3, C0839o c0839o, boolean z3, C1945g0 c1945g0, C2045v c2045v, List list, C1907A c1907a2, boolean z4, int i4, int i5, C0548K c0548k, long j5, long j6, long j7, long j8, boolean z5) {
        this.f3431a = abstractC0558V;
        this.f3432b = c1907a;
        this.f3433c = j3;
        this.f3434d = j4;
        this.f3435e = i3;
        this.f3436f = c0839o;
        this.f3437g = z3;
        this.f3438h = c1945g0;
        this.f3439i = c2045v;
        this.f3440j = list;
        this.f3441k = c1907a2;
        this.f3442l = z4;
        this.f3443m = i4;
        this.f3444n = i5;
        this.f3445o = c0548k;
        this.f3447q = j5;
        this.f3448r = j6;
        this.f3449s = j7;
        this.f3450t = j8;
        this.f3446p = z5;
    }

    /* JADX INFO: renamed from: i */
    public static C0818b0 m2060i(C2045v c2045v) {
        C0555S c0555s = AbstractC0558V.f1991a;
        C1907A c1907a = f3430u;
        return new C0818b0(c0555s, c1907a, -9223372036854775807L, 0L, 1, null, false, C1945g0.f8525d, c2045v, C1692X.f7629k, c1907a, false, 1, 0, C0548K.f1948d, 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: a */
    public final C0818b0 m2061a() {
        return new C0818b0(this.f3431a, this.f3432b, this.f3433c, this.f3434d, this.f3435e, this.f3436f, this.f3437g, this.f3438h, this.f3439i, this.f3440j, this.f3441k, this.f3442l, this.f3443m, this.f3444n, this.f3445o, this.f3447q, this.f3448r, m2069j(), SystemClock.elapsedRealtime(), this.f3446p);
    }

    /* JADX INFO: renamed from: b */
    public final C0818b0 m2062b(C1907A c1907a) {
        return new C0818b0(this.f3431a, this.f3432b, this.f3433c, this.f3434d, this.f3435e, this.f3436f, this.f3437g, this.f3438h, this.f3439i, this.f3440j, c1907a, this.f3442l, this.f3443m, this.f3444n, this.f3445o, this.f3447q, this.f3448r, this.f3449s, this.f3450t, this.f3446p);
    }

    /* JADX INFO: renamed from: c */
    public final C0818b0 m2063c(C1907A c1907a, long j3, long j4, long j5, long j6, C1945g0 c1945g0, C2045v c2045v, List list) {
        return new C0818b0(this.f3431a, c1907a, j4, j5, this.f3435e, this.f3436f, this.f3437g, c1945g0, c2045v, list, this.f3441k, this.f3442l, this.f3443m, this.f3444n, this.f3445o, this.f3447q, j6, j3, SystemClock.elapsedRealtime(), this.f3446p);
    }

    /* JADX INFO: renamed from: d */
    public final C0818b0 m2064d(int i3, int i4, boolean z3) {
        return new C0818b0(this.f3431a, this.f3432b, this.f3433c, this.f3434d, this.f3435e, this.f3436f, this.f3437g, this.f3438h, this.f3439i, this.f3440j, this.f3441k, z3, i3, i4, this.f3445o, this.f3447q, this.f3448r, this.f3449s, this.f3450t, this.f3446p);
    }

    /* JADX INFO: renamed from: e */
    public final C0818b0 m2065e(C0839o c0839o) {
        return new C0818b0(this.f3431a, this.f3432b, this.f3433c, this.f3434d, this.f3435e, c0839o, this.f3437g, this.f3438h, this.f3439i, this.f3440j, this.f3441k, this.f3442l, this.f3443m, this.f3444n, this.f3445o, this.f3447q, this.f3448r, this.f3449s, this.f3450t, this.f3446p);
    }

    /* JADX INFO: renamed from: f */
    public final C0818b0 m2066f(C0548K c0548k) {
        return new C0818b0(this.f3431a, this.f3432b, this.f3433c, this.f3434d, this.f3435e, this.f3436f, this.f3437g, this.f3438h, this.f3439i, this.f3440j, this.f3441k, this.f3442l, this.f3443m, this.f3444n, c0548k, this.f3447q, this.f3448r, this.f3449s, this.f3450t, this.f3446p);
    }

    /* JADX INFO: renamed from: g */
    public final C0818b0 m2067g(int i3) {
        return new C0818b0(this.f3431a, this.f3432b, this.f3433c, this.f3434d, i3, this.f3436f, this.f3437g, this.f3438h, this.f3439i, this.f3440j, this.f3441k, this.f3442l, this.f3443m, this.f3444n, this.f3445o, this.f3447q, this.f3448r, this.f3449s, this.f3450t, this.f3446p);
    }

    /* JADX INFO: renamed from: h */
    public final C0818b0 m2068h(AbstractC0558V abstractC0558V) {
        return new C0818b0(abstractC0558V, this.f3432b, this.f3433c, this.f3434d, this.f3435e, this.f3436f, this.f3437g, this.f3438h, this.f3439i, this.f3440j, this.f3441k, this.f3442l, this.f3443m, this.f3444n, this.f3445o, this.f3447q, this.f3448r, this.f3449s, this.f3450t, this.f3446p);
    }

    /* JADX INFO: renamed from: j */
    public final long m2069j() {
        long j3;
        long j4;
        if (!m2070k()) {
            return this.f3449s;
        }
        do {
            j3 = this.f3450t;
            j4 = this.f3449s;
        } while (j3 != this.f3450t);
        return AbstractC0632A.m1571L(AbstractC0632A.m1581V(j4) + ((long) ((SystemClock.elapsedRealtime() - j3) * this.f3445o.f1949a)));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2070k() {
        return this.f3435e == 3 && this.f3442l && this.f3444n == 0;
    }
}
