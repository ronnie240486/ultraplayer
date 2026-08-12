package p040N1;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1152a;
import p034L1.C0346a;
import p037M1.C0391d;
import p037M1.InterfaceC0390c;
import p046P1.C0476d;
import p046P1.C0479g;
import p046P1.C0480h;
import p046P1.C0481i;
import p046P1.C0497y;
import p075Z1.HandlerC0784e;
import p097f2.C1563g;
import p097f2.InterfaceC1557a;

/* JADX INFO: renamed from: N1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0441v implements InterfaceC1557a {

    /* JADX INFO: renamed from: g */
    public final C0424e f1492g;

    /* JADX INFO: renamed from: h */
    public final int f1493h;

    /* JADX INFO: renamed from: i */
    public final C0421b f1494i;

    /* JADX INFO: renamed from: j */
    public final long f1495j;

    /* JADX INFO: renamed from: k */
    public final long f1496k;

    public C0441v(C0424e c0424e, int i3, C0421b c0421b, long j3, long j4) {
        this.f1492g = c0424e;
        this.f1493h = i3;
        this.f1494i = c0421b;
        this.f1495j = j3;
        this.f1496k = j4;
    }

    /* JADX INFO: renamed from: a */
    public static C0476d m1153a(C0435p c0435p, AbstractC1152a abstractC1152a, int i3) {
        C0497y c0497y = abstractC1152a.f5535v;
        C0476d c0476d = c0497y == null ? null : c0497y.f1651j;
        if (c0476d != null && c0476d.f1575h) {
            int[] iArr = c0476d.f1577j;
            int i4 = 0;
            if (iArr == null) {
                int[] iArr2 = c0476d.f1579l;
                if (iArr2 != null) {
                    while (i4 < iArr2.length) {
                        if (iArr2[i4] == i3) {
                            return null;
                        }
                        i4++;
                    }
                }
            } else {
                while (i4 < iArr.length) {
                    if (iArr[i4] != i3) {
                        i4++;
                    }
                }
            }
            if (c0435p.f1479m < c0476d.f1578k) {
                return c0476d;
            }
        }
        return null;
    }

    @Override // p097f2.InterfaceC1557a
    /* JADX INFO: renamed from: l */
    public final void mo524l(C1563g c1563g) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3;
        long j4;
        int iElapsedRealtime;
        C0424e c0424e = this.f1492g;
        if (c0424e.m1125a()) {
            C0481i c0481i = (C0481i) C0480h.m1197b().f1607a;
            if (c0481i == null || c0481i.f1609h) {
                C0435p c0435p = (C0435p) c0424e.f1454p.get(this.f1494i);
                if (c0435p != null) {
                    InterfaceC0390c interfaceC0390c = c0435p.f1469c;
                    if (interfaceC0390c instanceof AbstractC1152a) {
                        AbstractC1152a abstractC1152a = (AbstractC1152a) interfaceC0390c;
                        long j5 = this.f1495j;
                        boolean z3 = j5 > 0;
                        int i8 = abstractC1152a.f5530q;
                        if (c0481i != null) {
                            z3 &= c0481i.f1610i;
                            boolean z4 = abstractC1152a.f5535v != null;
                            int i9 = c0481i.f1611j;
                            i5 = c0481i.f1608g;
                            if (!z4 || abstractC1152a.mo1066a()) {
                                i3 = c0481i.f1612k;
                            } else {
                                C0476d c0476dM1153a = m1153a(c0435p, abstractC1152a, this.f1493h);
                                if (c0476dM1153a == null) {
                                    return;
                                }
                                boolean z5 = c0476dM1153a.f1576i && j5 > 0;
                                i3 = c0476dM1153a.f1578k;
                                z3 = z5;
                            }
                            i4 = i9;
                        } else {
                            i3 = 100;
                            i4 = 5000;
                            i5 = 0;
                        }
                        if (c1563g.m3888e()) {
                            i6 = 0;
                            i7 = 0;
                        } else {
                            Exception excM3886c = c1563g.m3886c();
                            if (excM3886c instanceof C0391d) {
                                Status status = ((C0391d) excM3886c).f1345g;
                                int i10 = status.f5497g;
                                C0346a c0346a = status.f5500j;
                                if (c0346a == null) {
                                    i6 = i10;
                                } else {
                                    i7 = c0346a.f1122h;
                                    i6 = i10;
                                }
                            } else {
                                i6 = 101;
                            }
                            i7 = -1;
                        }
                        if (z3) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            j3 = j5;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f1496k);
                            j4 = jCurrentTimeMillis;
                        } else {
                            j3 = 0;
                            j4 = 0;
                            iElapsedRealtime = -1;
                        }
                        C0442w c0442w = new C0442w(new C0479g(this.f1493h, i6, i7, j3, j4, null, null, i8, iElapsedRealtime), i5, i4, i3);
                        HandlerC0784e handlerC0784e = c0424e.f1457s;
                        handlerC0784e.sendMessage(handlerC0784e.obtainMessage(18, c0442w));
                    }
                }
            }
        }
    }
}
