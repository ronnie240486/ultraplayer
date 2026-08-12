package p129o0;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p045P0.C0466l;
import p046P1.C0475c;
import p064W.C0650r;
import p064W.C0653u;
import p064W.RunnableC0647o;
import p070Y.InterfaceC0701A;
import p082b0.C1060a;
import p082b0.C1064e;
import p089d1.C1447t;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1692X;
import p105h2.C1700c0;
import p114k0.C1907A;

/* JADX INFO: renamed from: o0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2068h implements InterfaceC2064d, InterfaceC0701A {

    /* JADX INFO: renamed from: n */
    public static final C1692X f8976n = AbstractC1676G.m4119q(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: o */
    public static final C1692X f8977o = AbstractC1676G.m4119q(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: p */
    public static final C1692X f8978p = AbstractC1676G.m4119q(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: q */
    public static final C1692X f8979q = AbstractC1676G.m4119q(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: r */
    public static final C1692X f8980r = AbstractC1676G.m4119q(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: s */
    public static final C1692X f8981s = AbstractC1676G.m4119q(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: t */
    public static C2068h f8982t;

    /* JADX INFO: renamed from: a */
    public final C1700c0 f8983a;

    /* JADX INFO: renamed from: b */
    public final C1447t f8984b = new C1447t(18);

    /* JADX INFO: renamed from: c */
    public final C0653u f8985c;

    /* JADX INFO: renamed from: d */
    public final boolean f8986d;

    /* JADX INFO: renamed from: e */
    public final C2078r f8987e;

    /* JADX INFO: renamed from: f */
    public int f8988f;

    /* JADX INFO: renamed from: g */
    public long f8989g;

    /* JADX INFO: renamed from: h */
    public long f8990h;

    /* JADX INFO: renamed from: i */
    public long f8991i;

    /* JADX INFO: renamed from: j */
    public long f8992j;

    /* JADX INFO: renamed from: k */
    public long f8993k;

    /* JADX INFO: renamed from: l */
    public long f8994l;

    /* JADX INFO: renamed from: m */
    public int f8995m;

    public C2068h(Context context, HashMap map, int i3, C0653u c0653u, boolean z3) {
        this.f8983a = C1700c0.m4138a(map);
        this.f8987e = new C2078r(i3);
        this.f8985c = c0653u;
        this.f8986d = z3;
        if (context == null) {
            this.f8995m = 0;
            this.f8993k = m4632a(0);
            return;
        }
        C0650r c0650rM1652c = C0650r.m1652c(context);
        int iM1654d = c0650rM1652c.m1654d();
        this.f8995m = iM1654d;
        this.f8993k = m4632a(iM1654d);
        C2066f c2066f = new C2066f(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) c0650rM1652c.f2515i;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c2066f));
        ((Handler) c0650rM1652c.f2514h).post(new RunnableC0647o(c0650rM1652c, 0, c2066f));
    }

    /* JADX INFO: renamed from: a */
    public final long m4632a(int i3) {
        Integer numValueOf = Integer.valueOf(i3);
        C1700c0 c1700c0 = this.f8983a;
        Long l3 = (Long) c1700c0.get(numValueOf);
        if (l3 == null) {
            l3 = (Long) c1700c0.get(0);
        }
        if (l3 == null) {
            l3 = 1000000L;
        }
        return l3.longValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m4633b(int i3, long j3, long j4) {
        final int i4;
        final long j5;
        final long j6;
        if (i3 == 0 && j3 == 0 && j4 == this.f8994l) {
            return;
        }
        this.f8994l = j4;
        for (final C2063c c2063c : (CopyOnWriteArrayList) this.f8984b.f6406h) {
            if (c2063c.f8963c) {
                i4 = i3;
                j5 = j3;
                j6 = j4;
            } else {
                i4 = i3;
                j5 = j3;
                j6 = j4;
                c2063c.f8961a.post(new Runnable() { // from class: o0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1064e c1064e = c2063c.f8962b;
                        C0475c c0475c = c1064e.f4829j;
                        C1060a c1060aM2833O = c1064e.m2833O(((AbstractC1676G) c0475c.f1569b).isEmpty() ? null : (C1907A) AbstractC1723q.m4158g((AbstractC1676G) c0475c.f1569b));
                        c1064e.m2836R(c1060aM2833O, 1006, new C0466l(c1060aM2833O, i4, j5, j6));
                    }
                });
            }
            i3 = i4;
            j3 = j5;
            j4 = j6;
        }
    }
}
