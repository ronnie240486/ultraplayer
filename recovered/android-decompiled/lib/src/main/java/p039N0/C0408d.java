package p039N0;

import java.util.Arrays;
import java.util.List;
import p009D0.C0106b;
import p034L1.C0352g;
import p036M0.C0365b;
import p055T.C0546I;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.AbstractC2229b;
import p145s0.C2237j;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: N0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0408d implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public InterfaceC2242o f1376a;

    /* JADX INFO: renamed from: b */
    public AbstractC0413i f1377b;

    /* JADX INFO: renamed from: c */
    public boolean f1378c;

    /* JADX INFO: renamed from: b */
    public final boolean m1103b(C2237j c2237j) {
        boolean zM4828w;
        C0410f c0410f = new C0410f();
        if (c0410f.m1106a(c2237j, true) && (c0410f.f1384a & 2) == 2) {
            int iMin = Math.min(c0410f.f1388e, 8);
            C0651s c0651s = new C0651s(iMin);
            c2237j.mo338i(c0651s.f2520a, 0, iMin, false);
            c0651s.m1665G(0);
            if (c0651s.m1667a() >= 5 && c0651s.m1687u() == 127 && c0651s.m1689w() == 1179402563) {
                this.f1377b = new C0407c();
                return true;
            }
            c0651s.m1665G(0);
            try {
                zM4828w = AbstractC2229b.m4828w(1, c0651s, true);
            } catch (C0546I unused) {
                zM4828w = false;
            }
            if (zM4828w) {
                this.f1377b = new C0415k();
            } else {
                c0651s.m1665G(0);
                if (C0412h.m1108e(c0651s, C0412h.f1391o)) {
                    this.f1377b = new C0412h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        int i3;
        byte[] bArr;
        AbstractC0646n.m1631i(this.f1376a);
        if (this.f1377b == null) {
            C2237j c2237j = (C2237j) interfaceC2241n;
            if (!m1103b(c2237j)) {
                throw C0546I.m1365a(null, "Failed to determine bitstream type");
            }
            c2237j.f9631l = 0;
        }
        if (!this.f1378c) {
            InterfaceC2226E interfaceC2226EMo344p = this.f1376a.mo344p(0, 1);
            this.f1376a.mo341l();
            AbstractC0413i abstractC0413i = this.f1377b;
            abstractC0413i.f1396c = this.f1376a;
            abstractC0413i.f1395b = interfaceC2226EMo344p;
            abstractC0413i.mo1102d(true);
            this.f1378c = true;
        }
        AbstractC0413i abstractC0413i2 = this.f1377b;
        AbstractC0646n.m1631i(abstractC0413i2.f1395b);
        int i4 = AbstractC0632A.f2454a;
        int i5 = abstractC0413i2.f1401h;
        C0409e c0409e = abstractC0413i2.f1394a;
        if (i5 != 0) {
            if (i5 == 1) {
                ((C2237j) interfaceC2241n).mo335d((int) abstractC0413i2.f1399f);
                abstractC0413i2.f1401h = 2;
                return 0;
            }
            if (i5 != 2) {
                if (i5 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            C2237j c2237j2 = (C2237j) interfaceC2241n;
            long jMo974c = abstractC0413i2.f1397d.mo974c(c2237j2);
            if (jMo974c >= 0) {
                c0587s.f2181a = jMo974c;
                return 1;
            }
            if (jMo974c < -1) {
                abstractC0413i2.mo1109a(-(jMo974c + 2));
            }
            if (!abstractC0413i2.f1405l) {
                InterfaceC2252y interfaceC2252yMo987p = abstractC0413i2.f1397d.mo987p();
                AbstractC0646n.m1631i(interfaceC2252yMo987p);
                abstractC0413i2.f1396c.mo333b(interfaceC2252yMo987p);
                abstractC0413i2.f1405l = true;
            }
            if (abstractC0413i2.f1404k <= 0 && !c0409e.m1105b(c2237j2)) {
                abstractC0413i2.f1401h = 3;
                return -1;
            }
            abstractC0413i2.f1404k = 0L;
            C0651s c0651s = (C0651s) c0409e.f1383k;
            long jMo1100b = abstractC0413i2.mo1100b(c0651s);
            if (jMo1100b >= 0) {
                long j3 = abstractC0413i2.f1400g;
                if (j3 + jMo1100b >= abstractC0413i2.f1398e) {
                    long j4 = (j3 * 1000000) / ((long) abstractC0413i2.f1402i);
                    abstractC0413i2.f1395b.mo1173b(c0651s.f2522c, c0651s);
                    abstractC0413i2.f1395b.mo1172a(j4, 1, c0651s.f2522c, 0, null);
                    abstractC0413i2.f1398e = -1L;
                }
            }
            abstractC0413i2.f1400g += jMo1100b;
            return 0;
        }
        while (true) {
            C2237j c2237j3 = (C2237j) interfaceC2241n;
            if (!c0409e.m1105b(c2237j3)) {
                abstractC0413i2.f1401h = 3;
                return -1;
            }
            long j5 = c2237j3.f9629j;
            long j6 = abstractC0413i2.f1399f;
            abstractC0413i2.f1404k = j5 - j6;
            C0106b c0106b = abstractC0413i2.f1403j;
            C0651s c0651s2 = (C0651s) c0409e.f1383k;
            if (!abstractC0413i2.mo1101c(c0651s2, j6, c0106b)) {
                C0583o c0583o = (C0583o) abstractC0413i2.f1403j.f140h;
                abstractC0413i2.f1402i = c0583o.f2131D;
                if (!abstractC0413i2.f1406m) {
                    abstractC0413i2.f1395b.mo1176e(c0583o);
                    abstractC0413i2.f1406m = true;
                }
                C0365b c0365b = (C0365b) abstractC0413i2.f1403j.f141i;
                if (c0365b == null) {
                    long j7 = ((C2237j) interfaceC2241n).f9628i;
                    if (j7 == -1) {
                        abstractC0413i2.f1397d = new C0352g(8);
                    } else {
                        C0410f c0410f = (C0410f) c0409e.f1382j;
                        i3 = 2;
                        abstractC0413i2.f1397d = new C0406b(abstractC0413i2, abstractC0413i2.f1399f, j7, c0410f.f1387d + c0410f.f1388e, c0410f.f1385b, (c0410f.f1384a & 4) != 0);
                    }
                    abstractC0413i2.f1401h = i3;
                    bArr = c0651s2.f2520a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    c0651s2.m1663E(Arrays.copyOf(bArr, Math.max(65025, c0651s2.f2522c)), c0651s2.f2522c);
                    return 0;
                }
                abstractC0413i2.f1397d = c0365b;
                i3 = 2;
                abstractC0413i2.f1401h = i3;
                bArr = c0651s2.f2520a;
                if (bArr.length == 65025) {
                    return 0;
                }
                c0651s2.m1663E(Arrays.copyOf(bArr, Math.max(65025, c0651s2.f2522c)), c0651s2.f2522c);
                return 0;
            }
            abstractC0413i2.f1399f = ((C2237j) interfaceC2241n).f9629j;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        try {
            return m1103b((C2237j) interfaceC2241n);
        } catch (C0546I unused) {
            return false;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f1376a = interfaceC2242o;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        AbstractC0413i abstractC0413i = this.f1377b;
        if (abstractC0413i != null) {
            C0409e c0409e = abstractC0413i.f1394a;
            C0410f c0410f = (C0410f) c0409e.f1382j;
            c0410f.f1384a = 0;
            c0410f.f1385b = 0L;
            c0410f.f1386c = 0;
            c0410f.f1387d = 0;
            c0410f.f1388e = 0;
            ((C0651s) c0409e.f1383k).m1662D(0);
            c0409e.f1379g = -1;
            c0409e.f1381i = false;
            if (j3 == 0) {
                abstractC0413i.mo1102d(!abstractC0413i.f1405l);
                return;
            }
            if (abstractC0413i.f1401h != 0) {
                long j5 = (((long) abstractC0413i.f1402i) * j4) / 1000000;
                abstractC0413i.f1398e = j5;
                InterfaceC0411g interfaceC0411g = abstractC0413i.f1397d;
                int i3 = AbstractC0632A.f2454a;
                interfaceC0411g.mo989r(j5);
                abstractC0413i.f1401h = 2;
            }
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}
