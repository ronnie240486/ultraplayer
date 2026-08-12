package p082b0;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import p000A.C0041i;
import p011E.C0111d;
import p046P1.C0475c;
import p052S.C0527c;
import p055T.AbstractC0547J;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0542E;
import p055T.C0544G;
import p055T.C0548K;
import p055T.C0549L;
import p055T.C0550M;
import p055T.C0552O;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0564a0;
import p055T.C0567c;
import p055T.C0568c0;
import p055T.C0574f0;
import p055T.InterfaceC0551N;
import p061V.C0615c;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0645m;
import p064W.C0653u;
import p064W.C0655w;
import p064W.InterfaceC0642j;
import p077a0.C0792C;
import p077a0.C0839o;
import p077a0.C0849y;
import p088d0.InterfaceC1388l;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p105h2.C1700c0;
import p114k0.C1907A;
import p114k0.C1958r;
import p114k0.C1963w;
import p114k0.InterfaceC1913G;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1064e implements InterfaceC0551N, InterfaceC1913G, InterfaceC1388l {

    /* JADX INFO: renamed from: g */
    public final C0653u f4826g;

    /* JADX INFO: renamed from: h */
    public final C0556T f4827h;

    /* JADX INFO: renamed from: i */
    public final C0557U f4828i;

    /* JADX INFO: renamed from: j */
    public final C0475c f4829j;

    /* JADX INFO: renamed from: k */
    public final SparseArray f4830k;

    /* JADX INFO: renamed from: l */
    public C0645m f4831l;

    /* JADX INFO: renamed from: m */
    public C0792C f4832m;

    /* JADX INFO: renamed from: n */
    public C0655w f4833n;

    /* JADX INFO: renamed from: o */
    public boolean f4834o;

    public C1064e(C0653u c0653u) {
        c0653u.getClass();
        this.f4826g = c0653u;
        int i3 = AbstractC0632A.f2454a;
        Looper looperMyLooper = Looper.myLooper();
        this.f4831l = new C0645m(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, c0653u, new C1062c(1));
        C0556T c0556t = new C0556T();
        this.f4827h = c0556t;
        this.f4828i = new C0557U();
        C0475c c0475c = new C0475c();
        c0475c.f1568a = c0556t;
        C1674E c1674e = AbstractC1676G.f7601h;
        c0475c.f1569b = C1692X.f7629k;
        c0475c.f1570c = C1700c0.f7651m;
        this.f4829j = c0475c;
        this.f4830k = new SparseArray();
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: A */
    public final void mo1369A(boolean z3) {
        m2836R(m2831M(), 3, new C1063d(3));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: C */
    public final void mo1371C(AbstractC0547J abstractC0547J) {
        C1907A c1907a;
        C1060a c1060aM2831M = (!(abstractC0547J instanceof C0839o) || (c1907a = ((C0839o) abstractC0547J).f3570n) == null) ? m2831M() : m2833O(c1907a);
        m2836R(c1060aM2831M, 10, new C0111d(c1060aM2831M, (Object) abstractC0547J, 13));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: D */
    public final void mo1372D(boolean z3) {
        m2836R(m2835Q(), 23, new C1062c(25));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: E */
    public final void mo1373E(C0544G c0544g) {
        m2836R(m2831M(), 28, new C0041i(19));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: F */
    public final void mo1374F(List list) {
        m2836R(m2831M(), 27, new C1062c(0));
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: G */
    public final void mo2035G(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        m2836R(m2834P(i3, c1907a), 1002, new C1062c(17));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: H */
    public final void mo1375H(int i3, boolean z3) {
        m2836R(m2831M(), -1, new C0041i(17));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: I */
    public final void mo1376I(int i3, boolean z3) {
        m2836R(m2831M(), 5, new C0041i(28));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: J */
    public final void mo1377J(C0549L c0549l) {
        m2836R(m2831M(), 13, new C1063d(5));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: K */
    public final void mo1378K(boolean z3) {
        m2836R(m2831M(), 7, new C0041i(21));
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: L */
    public final void mo2036L(int i3, C1907A c1907a, Exception exc) {
        m2836R(m2834P(i3, c1907a), 1024, new C1062c(19));
    }

    /* JADX INFO: renamed from: M */
    public final C1060a m2831M() {
        return m2833O((C1907A) this.f4829j.f1571d);
    }

    /* JADX INFO: renamed from: N */
    public final C1060a m2832N(AbstractC0558V abstractC0558V, int i3, C1907A c1907a) {
        C1907A c1907a2 = abstractC0558V.m1415p() ? null : c1907a;
        this.f4826g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = abstractC0558V.equals(this.f4832m.mo1324w()) && i3 == this.f4832m.mo1292N();
        long jM1581V = 0;
        if (c1907a2 == null || !c1907a2.m4422b()) {
            if (z3) {
                jM1581V = this.f4832m.mo1097n();
            } else if (!abstractC0558V.m1415p()) {
                jM1581V = AbstractC0632A.m1581V(abstractC0558V.mo1332m(i3, this.f4828i, 0L).f1986l);
            }
        } else if (z3 && this.f4832m.m1913g0() == c1907a2.f8312b && this.f4832m.m1914h0() == c1907a2.f8313c) {
            jM1581V = this.f4832m.mo1291M();
        }
        C1907A c1907a3 = (C1907A) this.f4829j.f1571d;
        AbstractC0558V abstractC0558VMo1324w = this.f4832m.mo1324w();
        int iMo1292N = this.f4832m.mo1292N();
        long jMo1291M = this.f4832m.mo1291M();
        C0792C c0792c = this.f4832m;
        c0792c.m1931z0();
        return new C1060a(jElapsedRealtime, abstractC0558V, i3, c1907a2, jM1581V, abstractC0558VMo1324w, iMo1292N, c1907a3, jMo1291M, AbstractC0632A.m1581V(c0792c.f3243f0.f3448r));
    }

    /* JADX INFO: renamed from: O */
    public final C1060a m2833O(C1907A c1907a) {
        this.f4832m.getClass();
        AbstractC0558V abstractC0558V = c1907a == null ? null : (AbstractC0558V) ((C1700c0) this.f4829j.f1570c).get(c1907a);
        if (c1907a != null && abstractC0558V != null) {
            return m2832N(abstractC0558V, abstractC0558V.mo1410g(c1907a.f8311a, this.f4827h).f1968c, c1907a);
        }
        int iMo1292N = this.f4832m.mo1292N();
        AbstractC0558V abstractC0558VMo1324w = this.f4832m.mo1324w();
        if (iMo1292N >= abstractC0558VMo1324w.mo1333o()) {
            abstractC0558VMo1324w = AbstractC0558V.f1991a;
        }
        return m2832N(abstractC0558VMo1324w, iMo1292N, null);
    }

    /* JADX INFO: renamed from: P */
    public final C1060a m2834P(int i3, C1907A c1907a) {
        this.f4832m.getClass();
        if (c1907a != null) {
            return ((AbstractC0558V) ((C1700c0) this.f4829j.f1570c).get(c1907a)) != null ? m2833O(c1907a) : m2832N(AbstractC0558V.f1991a, i3, c1907a);
        }
        AbstractC0558V abstractC0558VMo1324w = this.f4832m.mo1324w();
        if (i3 >= abstractC0558VMo1324w.mo1333o()) {
            abstractC0558VMo1324w = AbstractC0558V.f1991a;
        }
        return m2832N(abstractC0558VMo1324w, i3, null);
    }

    /* JADX INFO: renamed from: Q */
    public final C1060a m2835Q() {
        return m2833O((C1907A) this.f4829j.f1573f);
    }

    /* JADX INFO: renamed from: R */
    public final void m2836R(C1060a c1060a, int i3, InterfaceC0642j interfaceC0642j) {
        this.f4830k.put(i3, c1060a);
        this.f4831l.m1621f(i3, interfaceC0642j);
    }

    /* JADX INFO: renamed from: S */
    public final void m2837S(C0792C c0792c, Looper looper) {
        AbstractC0646n.m1630h(this.f4832m == null || ((AbstractC1676G) this.f4829j.f1569b).isEmpty());
        c0792c.getClass();
        this.f4832m = c0792c;
        this.f4833n = this.f4826g.m1693a(looper, null);
        C0645m c0645m = this.f4831l;
        this.f4831l = new C0645m(c0645m.f2499d, looper, c0645m.f2496a, new C1061b(this, 0, c0792c), c0645m.f2504i);
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: a */
    public final void mo1379a(int i3) {
        m2836R(m2831M(), 6, new C0041i(23));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: b */
    public final void mo1380b(int i3, C0552O c0552o, C0552O c0552o2) {
        if (i3 == 1) {
            this.f4834o = false;
        }
        C0792C c0792c = this.f4832m;
        c0792c.getClass();
        C0475c c0475c = this.f4829j;
        c0475c.f1571d = C0475c.m1188f(c0792c, (AbstractC1676G) c0475c.f1569b, (C1907A) c0475c.f1572e, (C0556T) c0475c.f1568a);
        C1060a c1060aM2831M = m2831M();
        m2836R(c1060aM2831M, 11, new C0527c(c1060aM2831M, i3, c0552o, c0552o2));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: c */
    public final void mo1381c(int i3) {
        m2836R(m2831M(), 4, new C1062c(4));
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: d */
    public final void mo2038d(int i3, C1907A c1907a, int i4) {
        m2836R(m2834P(i3, c1907a), 1022, new C1062c(18));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: e */
    public final void mo1382e(int i3) {
        C0792C c0792c = this.f4832m;
        c0792c.getClass();
        C0475c c0475c = this.f4829j;
        c0475c.f1571d = C0475c.m1188f(c0792c, (AbstractC1676G) c0475c.f1569b, (C1907A) c0475c.f1572e, (C0556T) c0475c.f1568a);
        c0475c.m1196k(c0792c.mo1324w());
        m2836R(m2831M(), 0, new C1063d(6));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: f */
    public final void mo1383f(C0542E c0542e) {
        m2836R(m2831M(), 14, new C1062c(21));
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: g */
    public final void mo2039g(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w, IOException iOException, boolean z3) {
        C1060a c1060aM2834P = m2834P(i3, c1907a);
        m2836R(c1060aM2834P, 1003, new C0111d(c1060aM2834P, c1958r, c1963w, iOException, z3));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: h */
    public final void mo1384h(C0615c c0615c) {
        m2836R(m2831M(), 27, new C1062c(12));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: i */
    public final void mo1385i(C0564a0 c0564a0) {
        m2836R(m2831M(), 19, new C1063d(2));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: k */
    public final void mo1387k(AbstractC0547J abstractC0547J) {
        C1907A c1907a;
        m2836R((!(abstractC0547J instanceof C0839o) || (c1907a = ((C0839o) abstractC0547J).f3570n) == null) ? m2831M() : m2833O(c1907a), 10, new C0041i(27));
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: l */
    public final void mo2040l(int i3, C1907A c1907a) {
        m2836R(m2834P(i3, c1907a), 1025, new C1062c(27));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: m */
    public final void mo1388m(C0574f0 c0574f0) {
        C1060a c1060aM2835Q = m2835Q();
        m2836R(c1060aM2835Q, 25, new C0849y(c1060aM2835Q, c0574f0));
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: n */
    public final void mo2041n(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        m2836R(m2834P(i3, c1907a), 1001, new C1062c(20));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: o */
    public final void mo1389o(C0568c0 c0568c0) {
        m2836R(m2831M(), 2, new C0041i(24));
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: p */
    public final void mo2042p(int i3, C1907A c1907a) {
        m2836R(m2834P(i3, c1907a), 1023, new C1062c(28));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: q */
    public final void mo1390q(boolean z3) {
        m2836R(m2831M(), 9, new C1063d(1));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: r */
    public final void mo1391r(C0548K c0548k) {
        m2836R(m2831M(), 12, new C0041i(14));
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: s */
    public final void mo2043s(int i3, C1907A c1907a, C1958r c1958r, C1963w c1963w) {
        m2836R(m2834P(i3, c1907a), 1000, new C1062c(15));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: t */
    public final void mo1392t() {
        C0567c c0567c = C0567c.f2052b;
        m2836R(m2835Q(), 20, new C0041i(18));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: u */
    public final void mo1393u(C0539B c0539b, int i3) {
        m2836R(m2831M(), 1, new C0041i(15));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: v */
    public final void mo1394v(int i3, int i4) {
        m2836R(m2835Q(), 24, new C1062c(13));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: w */
    public final void mo1395w(int i3) {
        m2836R(m2831M(), 8, new C1062c(22));
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: x */
    public final void mo2044x(int i3, C1907A c1907a, C1963w c1963w) {
        m2836R(m2834P(i3, c1907a), 1005, new C1062c(23));
    }

    @Override // p114k0.InterfaceC1913G
    /* JADX INFO: renamed from: y */
    public final void mo2045y(int i3, C1907A c1907a, C1963w c1963w) {
        C1060a c1060aM2834P = m2834P(i3, c1907a);
        m2836R(c1060aM2834P, 1004, new C1061b(c1060aM2834P, 1, c1963w));
    }

    @Override // p088d0.InterfaceC1388l
    /* JADX INFO: renamed from: z */
    public final void mo2046z(int i3, C1907A c1907a) {
        m2836R(m2834P(i3, c1907a), 1027, new C1062c(24));
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: B */
    public final void mo1370B() {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: j */
    public final void mo1386j(C0550M c0550m) {
    }
}
