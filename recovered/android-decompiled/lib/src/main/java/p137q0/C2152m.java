package p137q0;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.cast.C1323r;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import p055T.AbstractC0545H;
import p055T.C0574f0;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0653u;
import p064W.C0655w;
import p089d1.C1447t;
import p096f1.ExecutorC1547b;
import p104h1.C1656m;
import p105h2.C1692X;

/* JADX INFO: renamed from: q0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2152m {

    /* JADX INFO: renamed from: o */
    public static final ExecutorC1547b f9292o = new ExecutorC1547b(1);

    /* JADX INFO: renamed from: a */
    public final C2149j f9293a;

    /* JADX INFO: renamed from: b */
    public final C2156q f9294b;

    /* JADX INFO: renamed from: c */
    public final C2160u f9295c;

    /* JADX INFO: renamed from: d */
    public final C2151l f9296d;

    /* JADX INFO: renamed from: e */
    public final C1692X f9297e;

    /* JADX INFO: renamed from: f */
    public final C1323r f9298f;

    /* JADX INFO: renamed from: g */
    public final C0653u f9299g;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArraySet f9300h;

    /* JADX INFO: renamed from: i */
    public C0583o f9301i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2154o f9302j;

    /* JADX INFO: renamed from: k */
    public C0655w f9303k;

    /* JADX INFO: renamed from: l */
    public Pair f9304l;

    /* JADX INFO: renamed from: m */
    public int f9305m;

    /* JADX INFO: renamed from: n */
    public int f9306n;

    public C2152m(C2147h c2147h) {
        C2149j c2149j = new C2149j(this, c2147h.f9268a);
        this.f9293a = c2149j;
        C0653u c0653u = c2147h.f9273f;
        this.f9299g = c0653u;
        C2156q c2156q = c2147h.f9269b;
        this.f9294b = c2156q;
        c2156q.f9319k = c0653u;
        C2160u c2160u = new C2160u(new C1447t(21, this), c2156q);
        this.f9295c = c2160u;
        C2151l c2151l = c2147h.f9271d;
        AbstractC0646n.m1631i(c2151l);
        this.f9296d = c2151l;
        this.f9297e = c2147h.f9272e;
        this.f9298f = new C1323r(c2156q, c2160u);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f9300h = copyOnWriteArraySet;
        this.f9306n = 0;
        copyOnWriteArraySet.add(c2149j);
    }

    /* JADX INFO: renamed from: a */
    public static void m4743a(C2152m c2152m, long j3, long j4) {
        C2160u c2160u = c2152m.f9295c;
        C1656m c1656m = c2160u.f9349f;
        int i3 = c1656m.f7542c;
        if (i3 == 0) {
            return;
        }
        if (i3 == 0) {
            throw new NoSuchElementException();
        }
        long j5 = ((long[]) c1656m.f7540a)[c1656m.f7541b];
        Long l3 = (Long) c2160u.f9348e.m1016h(j5);
        C2156q c2156q = c2160u.f9345b;
        if (l3 != null && l3.longValue() != c2160u.f9352i) {
            c2160u.f9352i = l3.longValue();
            c2156q.m4747d(2);
        }
        int iM4744a = c2160u.f9345b.m4744a(j5, j3, j4, c2160u.f9352i, false, c2160u.f9346c);
        C2152m c2152m2 = (C2152m) c2160u.f9344a.f6406h;
        if (iM4744a != 0 && iM4744a != 1) {
            if (iM4744a != 2 && iM4744a != 3 && iM4744a != 4) {
                if (iM4744a != 5) {
                    throw new IllegalStateException(String.valueOf(iM4744a));
                }
                return;
            }
            c2160u.f9353j = j5;
            c1656m.m4086d();
            for (C2149j c2149j : c2152m2.f9300h) {
                c2149j.f9289m.execute(new RunnableC2148i(c2149j, c2149j.f9288l, 2));
            }
            AbstractC0646n.m1631i(null);
            throw null;
        }
        c2160u.f9353j = j5;
        long jM4086d = c1656m.m4086d();
        C0574f0 c0574f0 = (C0574f0) c2160u.f9347d.m1016h(jM4086d);
        if (c0574f0 != null && !c0574f0.equals(C0574f0.f2070d) && !c0574f0.equals(c2160u.f9351h)) {
            c2160u.f9351h = c0574f0;
            C0582n c0582n = new C0582n();
            c0582n.f2121t = c0574f0.f2071a;
            c0582n.f2122u = c0574f0.f2072b;
            c0582n.f2114m = AbstractC0545H.m1364l("video/raw");
            c2152m2.f9301i = new C0583o(c0582n);
            for (C2149j c2149j2 : c2152m2.f9300h) {
                c2149j2.f9289m.execute(new RunnableC2148i(c2149j2, c2149j2.f9288l, c0574f0));
            }
        }
        boolean z3 = c2156q.f9312d != 3;
        c2156q.f9312d = 3;
        c2156q.f9319k.getClass();
        c2156q.f9314f = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
        if (z3 && c2152m2.f9304l != null) {
            for (C2149j c2149j3 : c2152m2.f9300h) {
                c2149j3.f9289m.execute(new RunnableC2148i(c2149j3, c2149j3.f9288l, 1));
            }
        }
        if (c2152m2.f9302j != null) {
            C0583o c0583o = c2152m2.f9301i;
            C0583o c0583o2 = c0583o == null ? new C0583o(new C0582n()) : c0583o;
            InterfaceC2154o interfaceC2154o = c2152m2.f9302j;
            c2152m2.f9299g.getClass();
            interfaceC2154o.mo1904d(jM4086d, System.nanoTime(), c0583o2, null);
        }
        AbstractC0646n.m1631i(null);
        throw null;
    }
}
