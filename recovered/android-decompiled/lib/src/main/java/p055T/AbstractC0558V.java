package p055T;

import android.util.Pair;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0558V {

    /* JADX INFO: renamed from: a */
    public static final C0555S f1991a = new C0555S();

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(2);
    }

    /* JADX INFO: renamed from: a */
    public int mo1406a(boolean z3) {
        return m1415p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1328b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo1407c(boolean z3) {
        if (m1415p()) {
            return -1;
        }
        return mo1333o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m1408d(int i3, C0556T c0556t, C0557U c0557u, int i4, boolean z3) {
        int i5 = mo1329f(i3, c0556t, false).f1968c;
        if (mo1332m(i5, c0557u, 0L).f1989o != i3) {
            return i3 + 1;
        }
        int iMo1409e = mo1409e(i5, i4, z3);
        if (iMo1409e == -1) {
            return -1;
        }
        return mo1332m(iMo1409e, c0557u, 0L).f1988n;
    }

    /* JADX INFO: renamed from: e */
    public int mo1409e(int i3, int i4, boolean z3) {
        if (i4 == 0) {
            if (i3 == mo1407c(z3)) {
                return -1;
            }
            return i3 + 1;
        }
        if (i4 == 1) {
            return i3;
        }
        if (i4 == 2) {
            return i3 == mo1407c(z3) ? mo1406a(z3) : i3 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iMo1407c;
        if (this != obj) {
            if (obj instanceof AbstractC0558V) {
                AbstractC0558V abstractC0558V = (AbstractC0558V) obj;
                if (abstractC0558V.mo1333o() == mo1333o() && abstractC0558V.mo1330h() == mo1330h()) {
                    C0557U c0557u = new C0557U();
                    C0556T c0556t = new C0556T();
                    C0557U c0557u2 = new C0557U();
                    C0556T c0556t2 = new C0556T();
                    for (int i3 = 0; i3 < mo1333o(); i3++) {
                        if (mo1332m(i3, c0557u, 0L).equals(abstractC0558V.mo1332m(i3, c0557u2, 0L))) {
                        }
                    }
                    for (int i4 = 0; i4 < mo1330h(); i4++) {
                        if (mo1329f(i4, c0556t, true).equals(abstractC0558V.mo1329f(i4, c0556t2, true))) {
                        }
                    }
                    int iMo1406a = mo1406a(true);
                    if (iMo1406a == abstractC0558V.mo1406a(true) && (iMo1407c = mo1407c(true)) == abstractC0558V.mo1407c(true)) {
                        while (iMo1406a != iMo1407c) {
                            int iMo1409e = mo1409e(iMo1406a, 0, true);
                            if (iMo1409e == abstractC0558V.mo1409e(iMo1406a, 0, true)) {
                                iMo1406a = iMo1409e;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract C0556T mo1329f(int i3, C0556T c0556t, boolean z3);

    /* JADX INFO: renamed from: g */
    public C0556T mo1410g(Object obj, C0556T c0556t) {
        return mo1329f(mo1328b(obj), c0556t, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo1330h();

    public int hashCode() {
        C0557U c0557u = new C0557U();
        C0556T c0556t = new C0556T();
        int iMo1333o = mo1333o() + 217;
        for (int i3 = 0; i3 < mo1333o(); i3++) {
            iMo1333o = (iMo1333o * 31) + mo1332m(i3, c0557u, 0L).hashCode();
        }
        int iMo1330h = mo1330h() + (iMo1333o * 31);
        for (int i4 = 0; i4 < mo1330h(); i4++) {
            iMo1330h = (iMo1330h * 31) + mo1329f(i4, c0556t, true).hashCode();
        }
        int iMo1406a = mo1406a(true);
        while (iMo1406a != -1) {
            iMo1330h = (iMo1330h * 31) + iMo1406a;
            iMo1406a = mo1409e(iMo1406a, 0, true);
        }
        return iMo1330h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m1411i(C0557U c0557u, C0556T c0556t, int i3, long j3) {
        Pair pairM1412j = m1412j(c0557u, c0556t, i3, j3, 0L);
        pairM1412j.getClass();
        return pairM1412j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m1412j(C0557U c0557u, C0556T c0556t, int i3, long j3, long j4) {
        AbstractC0646n.m1628f(i3, mo1333o());
        mo1332m(i3, c0557u, j4);
        if (j3 == -9223372036854775807L) {
            j3 = c0557u.f1986l;
            if (j3 == -9223372036854775807L) {
                return null;
            }
        }
        int i4 = c0557u.f1988n;
        mo1329f(i4, c0556t, false);
        while (i4 < c0557u.f1989o && c0556t.f1970e != j3) {
            int i5 = i4 + 1;
            if (mo1329f(i5, c0556t, false).f1970e > j3) {
                break;
            }
            i4 = i5;
        }
        mo1329f(i4, c0556t, true);
        long jMin = j3 - c0556t.f1970e;
        long j5 = c0556t.f1969d;
        if (j5 != -9223372036854775807L) {
            jMin = Math.min(jMin, j5 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c0556t.f1967b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo1413k(int i3, int i4, boolean z3) {
        if (i4 == 0) {
            if (i3 == mo1406a(z3)) {
                return -1;
            }
            return i3 - 1;
        }
        if (i4 == 1) {
            return i3;
        }
        if (i4 == 2) {
            return i3 == mo1406a(z3) ? mo1407c(z3) : i3 - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo1331l(int i3);

    /* JADX INFO: renamed from: m */
    public abstract C0557U mo1332m(int i3, C0557U c0557u, long j3);

    /* JADX INFO: renamed from: n */
    public final void m1414n(int i3, C0557U c0557u) {
        mo1332m(i3, c0557u, 0L);
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo1333o();

    /* JADX INFO: renamed from: p */
    public final boolean m1415p() {
        return mo1333o() == 0;
    }
}
