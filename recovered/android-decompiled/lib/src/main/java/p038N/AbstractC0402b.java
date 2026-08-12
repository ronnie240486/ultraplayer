package p038N;

import android.support.v4.media.session.C0858A;
import java.util.LinkedHashMap;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0557U;
import p055T.InterfaceC0553P;
import p064W.AbstractC0632A;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: N.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0402b implements InterfaceC0553P {

    /* JADX INFO: renamed from: a */
    public Object f1360a;

    public AbstractC0402b(int i3) {
        switch (i3) {
            case 1:
                this.f1360a = new C0557U();
                break;
            default:
                this.f1360a = new LinkedHashMap();
                break;
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: E */
    public long mo1083E() {
        return mo1291M();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: F */
    public int mo1084F() {
        return mo1292N();
    }

    /* JADX INFO: renamed from: Q */
    public String mo1085Q() {
        return null;
    }

    /* JADX INFO: renamed from: R */
    public long m1086R() {
        AbstractC0558V abstractC0558VMo1324w = mo1324w();
        if (abstractC0558VMo1324w.m1415p()) {
            return -9223372036854775807L;
        }
        return AbstractC0632A.m1581V(abstractC0558VMo1324w.mo1332m(mo1292N(), (C0557U) this.f1360a, 0L).f1987m);
    }

    /* JADX INFO: renamed from: S */
    public C0539B m1087S() {
        AbstractC0558V abstractC0558VMo1324w = mo1324w();
        if (abstractC0558VMo1324w.m1415p()) {
            return null;
        }
        return abstractC0558VMo1324w.mo1332m(mo1292N(), (C0557U) this.f1360a, 0L).f1977c;
    }

    /* JADX INFO: renamed from: T */
    public void m1088T(int i3) {
        mo1092X(-1, -9223372036854775807L, false);
    }

    /* JADX INFO: renamed from: U */
    public boolean m1089U(int i3) {
        return mo1320q().f1952a.f2090a.get(i3);
    }

    /* JADX INFO: renamed from: V */
    public boolean m1090V() {
        AbstractC0558V abstractC0558VMo1324w = mo1324w();
        return !abstractC0558VMo1324w.m1415p() && abstractC0558VMo1324w.mo1332m(mo1292N(), (C0557U) this.f1360a, 0L).m1404a();
    }

    /* JADX INFO: renamed from: W */
    public boolean m1091W() {
        return mo1304g() == 3 && mo1322t() && mo1321r() == 0;
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo1092X(int i3, long j3, boolean z3);

    /* JADX INFO: renamed from: Y */
    public void m1093Y(int i3, long j3) {
        mo1092X(mo1292N(), j3, false);
    }

    /* JADX INFO: renamed from: Z */
    public void m1094Z() {
        int iMo1409e;
        int iMo1409e2;
        if (mo1324w().m1415p() || mo1310j()) {
            m1088T(9);
            return;
        }
        AbstractC0558V abstractC0558VMo1324w = mo1324w();
        if (abstractC0558VMo1324w.m1415p()) {
            iMo1409e = -1;
        } else {
            int iMo1292N = mo1292N();
            int iMo1300e = mo1300e();
            if (iMo1300e == 1) {
                iMo1300e = 0;
            }
            iMo1409e = abstractC0558VMo1324w.mo1409e(iMo1292N, iMo1300e, mo1282B());
        }
        if (!(iMo1409e != -1)) {
            if (m1090V()) {
                AbstractC0558V abstractC0558VMo1324w2 = mo1324w();
                if (!abstractC0558VMo1324w2.m1415p() && abstractC0558VMo1324w2.mo1332m(mo1292N(), (C0557U) this.f1360a, 0L).f1983i) {
                    mo1092X(mo1292N(), -9223372036854775807L, false);
                    return;
                }
            }
            m1088T(9);
            return;
        }
        AbstractC0558V abstractC0558VMo1324w3 = mo1324w();
        if (abstractC0558VMo1324w3.m1415p()) {
            iMo1409e2 = -1;
        } else {
            int iMo1292N2 = mo1292N();
            int iMo1300e2 = mo1300e();
            if (iMo1300e2 == 1) {
                iMo1300e2 = 0;
            }
            iMo1409e2 = abstractC0558VMo1324w3.mo1409e(iMo1292N2, iMo1300e2, mo1282B());
        }
        if (iMo1409e2 == -1) {
            m1088T(9);
        } else if (iMo1409e2 == mo1292N()) {
            mo1092X(mo1292N(), -9223372036854775807L, true);
        } else {
            mo1092X(iMo1409e2, -9223372036854775807L, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1095a(C0858A c0858a);

    /* JADX INFO: renamed from: a0 */
    public void m1096a0() {
        int iMo1413k;
        int iMo1413k2;
        int iMo1413k3;
        if (mo1324w().m1415p() || mo1310j()) {
            m1088T(7);
            return;
        }
        AbstractC0558V abstractC0558VMo1324w = mo1324w();
        if (abstractC0558VMo1324w.m1415p()) {
            iMo1413k = -1;
        } else {
            int iMo1292N = mo1292N();
            int iMo1300e = mo1300e();
            if (iMo1300e == 1) {
                iMo1300e = 0;
            }
            iMo1413k = abstractC0558VMo1324w.mo1413k(iMo1292N, iMo1300e, mo1282B());
        }
        boolean z3 = iMo1413k != -1;
        if (m1090V()) {
            AbstractC0558V abstractC0558VMo1324w2 = mo1324w();
            if (!(!abstractC0558VMo1324w2.m1415p() && abstractC0558VMo1324w2.mo1332m(mo1292N(), (C0557U) this.f1360a, 0L).f1982h)) {
                if (!z3) {
                    m1088T(7);
                    return;
                }
                AbstractC0558V abstractC0558VMo1324w3 = mo1324w();
                if (abstractC0558VMo1324w3.m1415p()) {
                    iMo1413k3 = -1;
                } else {
                    int iMo1292N2 = mo1292N();
                    int iMo1300e2 = mo1300e();
                    if (iMo1300e2 == 1) {
                        iMo1300e2 = 0;
                    }
                    iMo1413k3 = abstractC0558VMo1324w3.mo1413k(iMo1292N2, iMo1300e2, mo1282B());
                }
                if (iMo1413k3 == -1) {
                    m1088T(7);
                    return;
                } else if (iMo1413k3 == mo1292N()) {
                    mo1092X(mo1292N(), -9223372036854775807L, true);
                    return;
                } else {
                    mo1092X(iMo1413k3, -9223372036854775807L, false);
                    return;
                }
            }
        }
        if (!z3 || mo1291M() > mo1281A()) {
            m1093Y(7, 0L);
            return;
        }
        AbstractC0558V abstractC0558VMo1324w4 = mo1324w();
        if (abstractC0558VMo1324w4.m1415p()) {
            iMo1413k2 = -1;
        } else {
            int iMo1292N3 = mo1292N();
            int iMo1300e3 = mo1300e();
            if (iMo1300e3 == 1) {
                iMo1300e3 = 0;
            }
            iMo1413k2 = abstractC0558VMo1324w4.mo1413k(iMo1292N3, iMo1300e3, mo1282B());
        }
        if (iMo1413k2 == -1) {
            m1088T(7);
        } else if (iMo1413k2 == mo1292N()) {
            mo1092X(mo1292N(), -9223372036854775807L, true);
        } else {
            mo1092X(iMo1413k2, -9223372036854775807L, false);
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: n */
    public long mo1097n() {
        return mo1291M();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: s */
    public long mo1098s() {
        return mo1291M();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: u */
    public long mo1099u() {
        return m1086R();
    }

    public AbstractC0402b(InterfaceC2226E interfaceC2226E) {
        this.f1360a = interfaceC2226E;
    }
}
