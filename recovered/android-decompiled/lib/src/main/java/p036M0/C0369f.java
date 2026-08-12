package p036M0;

import android.util.SparseArray;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.C0671c;

/* JADX INFO: renamed from: M0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0369f implements InterfaceC0366c {

    /* JADX INFO: renamed from: a */
    public final int f1182a;

    /* JADX INFO: renamed from: b */
    public final int f1183b;

    /* JADX INFO: renamed from: c */
    public final Object f1184c;

    public C0369f(int i3, int i4, SparseArray sparseArray) {
        this.f1182a = i3;
        this.f1183b = i4;
        this.f1184c = sparseArray;
    }

    @Override // p036M0.InterfaceC0366c
    /* JADX INFO: renamed from: a */
    public int mo1005a() {
        return this.f1182a;
    }

    @Override // p036M0.InterfaceC0366c
    /* JADX INFO: renamed from: b */
    public int mo1006b() {
        return this.f1183b;
    }

    @Override // p036M0.InterfaceC0366c
    /* JADX INFO: renamed from: c */
    public int mo1007c() {
        int i3 = this.f1182a;
        return i3 == -1 ? ((C0651s) this.f1184c).m1691y() : i3;
    }

    public C0369f(C0671c c0671c, C0583o c0583o) {
        C0651s c0651s = c0671c.f2571i;
        this.f1184c = c0651s;
        c0651s.m1665G(12);
        int iM1691y = c0651s.m1691y();
        if ("audio/raw".equals(c0583o.f2154n)) {
            int iM1606y = AbstractC0632A.m1606y(c0583o.f2132E, c0583o.f2130C);
            if (iM1691y == 0 || iM1691y % iM1606y != 0) {
                AbstractC0646n.m1647y("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iM1606y + ", stsz sample size: " + iM1691y);
                iM1691y = iM1606y;
            }
        }
        this.f1182a = iM1691y == 0 ? -1 : iM1691y;
        this.f1183b = c0651s.m1691y();
    }
}
