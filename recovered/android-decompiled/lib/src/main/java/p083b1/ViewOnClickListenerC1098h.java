package p083b1;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;
import p038N.AbstractC0402b;
import p055T.AbstractC0547J;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0542E;
import p055T.C0544G;
import p055T.C0548K;
import p055T.C0549L;
import p055T.C0550M;
import p055T.C0552O;
import p055T.C0564a0;
import p055T.C0568c0;
import p055T.C0574f0;
import p055T.InterfaceC0551N;
import p055T.InterfaceC0553P;
import p061V.C0615c;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: b1.h */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1098h implements InterfaceC0551N, InterfaceC1083L, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1109s f5037g;

    public ViewOnClickListenerC1098h(C1109s c1109s) {
        this.f5037g = c1109s;
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void mo1369A(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void mo1370B() {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void mo1371C(AbstractC0547J abstractC0547J) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void mo1372D(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void mo1373E(C0544G c0544g) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void mo1374F(List list) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void mo1375H(int i3, boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void mo1376I(int i3, boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void mo1377J(C0549L c0549l) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void mo1378K(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo1379a(int i3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo1380b(int i3, C0552O c0552o, C0552O c0552o2) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo1381c(int i3) {
    }

    @Override // p083b1.InterfaceC1083L
    /* JADX INFO: renamed from: d */
    public final void mo2925d(long j3) {
        C1109s c1109s = this.f5037g;
        TextView textView = c1109s.f5077J;
        if (textView != null) {
            textView.setText(AbstractC0632A.m1560A(c1109s.f5079L, c1109s.f5080M, j3));
        }
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo1382e(int i3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo1383f(C0542E c0542e) {
    }

    @Override // p083b1.InterfaceC1083L
    /* JADX INFO: renamed from: g */
    public final void mo2926g(long j3) {
        C1109s c1109s = this.f5037g;
        c1109s.f5130w0 = true;
        TextView textView = c1109s.f5077J;
        if (textView != null) {
            textView.setText(AbstractC0632A.m1560A(c1109s.f5079L, c1109s.f5080M, j3));
        }
        c1109s.f5097g.m2968f();
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo1384h(C0615c c0615c) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo1385i(C0564a0 c0564a0) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: j */
    public final void mo1386j(C0550M c0550m) {
        boolean zM1368a = c0550m.m1368a(4, 5, 13);
        C1109s c1109s = this.f5037g;
        if (zM1368a) {
            c1109s.m2954m();
        }
        if (c0550m.m1368a(4, 5, 7, 13)) {
            c1109s.m2956o();
        }
        if (c0550m.m1368a(8, 13)) {
            c1109s.m2957p();
        }
        if (c0550m.m1368a(9, 13)) {
            c1109s.m2959r();
        }
        if (c0550m.m1368a(8, 9, 11, 0, 16, 17, 13)) {
            c1109s.m2953l();
        }
        if (c0550m.m1368a(11, 0, 13)) {
            c1109s.m2960s();
        }
        if (c0550m.m1368a(12, 13)) {
            c1109s.m2955n();
        }
        if (c0550m.m1368a(2, 13)) {
            c1109s.m2961t();
        }
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo1387k(AbstractC0547J abstractC0547J) {
    }

    @Override // p083b1.InterfaceC1083L
    /* JADX INFO: renamed from: l */
    public final void mo2927l(long j3, boolean z3) {
        InterfaceC0553P interfaceC0553P;
        C1109s c1109s = this.f5037g;
        c1109s.f5130w0 = false;
        if (!z3 && (interfaceC0553P = c1109s.f5116p0) != null) {
            if (c1109s.f5128v0) {
                AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
                if (abstractC0402b.m1089U(17) && abstractC0402b.m1089U(10)) {
                    AbstractC0558V abstractC0558VMo1324w = abstractC0402b.mo1324w();
                    int iMo1333o = abstractC0558VMo1324w.mo1333o();
                    int i3 = 0;
                    while (true) {
                        long jM1581V = AbstractC0632A.m1581V(abstractC0558VMo1324w.mo1332m(i3, c1109s.f5082O, 0L).f1987m);
                        if (j3 < jM1581V) {
                            break;
                        }
                        if (i3 == iMo1333o - 1) {
                            j3 = jM1581V;
                            break;
                        } else {
                            j3 -= jM1581V;
                            i3++;
                        }
                    }
                    abstractC0402b.mo1092X(i3, j3, false);
                }
            } else {
                AbstractC0402b abstractC0402b2 = (AbstractC0402b) interfaceC0553P;
                if (abstractC0402b2.m1089U(5)) {
                    abstractC0402b2.m1093Y(5, j3);
                }
            }
            c1109s.m2956o();
        }
        c1109s.f5097g.m2969g();
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo1388m(C0574f0 c0574f0) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo1389o(C0568c0 c0568c0) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1109s c1109s = this.f5037g;
        InterfaceC0553P interfaceC0553P = c1109s.f5116p0;
        if (interfaceC0553P == null) {
            return;
        }
        C1114x c1114x = c1109s.f5097g;
        c1114x.m2969g();
        if (c1109s.f5123t == view) {
            AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
            if (abstractC0402b.m1089U(9)) {
                abstractC0402b.m1094Z();
                return;
            }
            return;
        }
        if (c1109s.f5121s == view) {
            AbstractC0402b abstractC0402b2 = (AbstractC0402b) interfaceC0553P;
            if (abstractC0402b2.m1089U(7)) {
                abstractC0402b2.m1096a0();
                return;
            }
            return;
        }
        if (c1109s.f5127v == view) {
            if (interfaceC0553P.mo1304g() != 4) {
                AbstractC0402b abstractC0402b3 = (AbstractC0402b) interfaceC0553P;
                if (abstractC0402b3.m1089U(12)) {
                    long jMo1291M = abstractC0402b3.mo1291M() + abstractC0402b3.mo1312k();
                    long jMo1099u = abstractC0402b3.mo1099u();
                    if (jMo1099u != -9223372036854775807L) {
                        jMo1291M = Math.min(jMo1291M, jMo1099u);
                    }
                    abstractC0402b3.m1093Y(12, Math.max(jMo1291M, 0L));
                    return;
                }
                return;
            }
            return;
        }
        if (c1109s.f5129w == view) {
            AbstractC0402b abstractC0402b4 = (AbstractC0402b) interfaceC0553P;
            if (abstractC0402b4.m1089U(11)) {
                long jMo1291M2 = abstractC0402b4.mo1291M() + (-abstractC0402b4.mo1294P());
                long jMo1099u2 = abstractC0402b4.mo1099u();
                if (jMo1099u2 != -9223372036854775807L) {
                    jMo1291M2 = Math.min(jMo1291M2, jMo1099u2);
                }
                abstractC0402b4.m1093Y(11, Math.max(jMo1291M2, 0L));
                return;
            }
            return;
        }
        if (c1109s.f5125u == view) {
            if (AbstractC0632A.m1579T(interfaceC0553P, c1109s.f5126u0)) {
                AbstractC0632A.m1563D(interfaceC0553P);
                return;
            }
            AbstractC0402b abstractC0402b5 = (AbstractC0402b) interfaceC0553P;
            if (abstractC0402b5.m1089U(1)) {
                abstractC0402b5.mo1308i(false);
                return;
            }
            return;
        }
        if (c1109s.f5135z == view) {
            if (((AbstractC0402b) interfaceC0553P).m1089U(15)) {
                int iMo1300e = interfaceC0553P.mo1300e();
                int i3 = c1109s.f5136z0;
                for (int i4 = 1; i4 <= 2; i4++) {
                    int i5 = (iMo1300e + i4) % 3;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2 || (i3 & 2) == 0) {
                            }
                        } else if ((i3 & 1) == 0) {
                        }
                    }
                    iMo1300e = i5;
                }
                interfaceC0553P.mo1296c(iMo1300e);
                return;
            }
            return;
        }
        if (c1109s.f5062A == view) {
            if (((AbstractC0402b) interfaceC0553P).m1089U(14)) {
                interfaceC0553P.mo1323v(!interfaceC0553P.mo1282B());
                return;
            }
            return;
        }
        View view2 = c1109s.f5072F;
        if (view2 == view) {
            c1114x.m2968f();
            c1109s.m2945d(c1109s.f5107l, view2);
            return;
        }
        View view3 = c1109s.f5074G;
        if (view3 == view) {
            c1114x.m2968f();
            c1109s.m2945d(c1109s.f5109m, view3);
            return;
        }
        View view4 = c1109s.f5075H;
        if (view4 == view) {
            c1114x.m2968f();
            c1109s.m2945d(c1109s.f5113o, view4);
            return;
        }
        ImageView imageView = c1109s.f5066C;
        if (imageView == view) {
            c1114x.m2968f();
            c1109s.m2945d(c1109s.f5111n, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1109s c1109s = this.f5037g;
        if (c1109s.f5073F0) {
            c1109s.f5097g.m2969g();
        }
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo1390q(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo1391r(C0548K c0548k) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void mo1392t() {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void mo1393u(C0539B c0539b, int i3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void mo1394v(int i3, int i4) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void mo1395w(int i3) {
    }
}
