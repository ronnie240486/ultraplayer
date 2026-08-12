package p083b1;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.RunnableC0892b;
import androidx.media3.p080ui.SubtitleView;
import java.util.List;
import p000A.C0031d;
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
import p055T.C0556T;
import p055T.C0564a0;
import p055T.C0568c0;
import p055T.C0574f0;
import p055T.InterfaceC0551N;
import p055T.InterfaceC0553P;
import p061V.C0615c;
import p064W.AbstractC0632A;
import p077a0.RunnableC0804O;

/* JADX INFO: renamed from: b1.A */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1072A implements InterfaceC0551N, View.OnClickListener, InterfaceC1108r, InterfaceC1099i {

    /* JADX INFO: renamed from: g */
    public final C0556T f4883g = new C0556T();

    /* JADX INFO: renamed from: h */
    public Object f4884h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1076E f4885i;

    public ViewOnClickListenerC1072A(C1076E c1076e) {
        this.f4885i = c1076e;
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void mo1369A(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: B */
    public final void mo1370B() {
        C1076E c1076e = this.f4885i;
        View view = c1076e.f4901i;
        if (view != null) {
            view.setVisibility(4);
            if (!c1076e.m2907b()) {
                c1076e.m2908c();
                return;
            }
            ImageView imageView = c1076e.f4905m;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
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
    public final void mo1376I(int i3, boolean z3) {
        C1076E c1076e = this.f4885i;
        c1076e.m2916k();
        if (!c1076e.m2909d() || !c1076e.f4896J) {
            c1076e.m2910e(false);
            return;
        }
        C1109s c1109s = c1076e.f4910r;
        if (c1109s != null) {
            c1109s.m2947f();
        }
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
    public final void mo1380b(int i3, C0552O c0552o, C0552O c0552o2) {
        C1109s c1109s;
        C1076E c1076e = this.f4885i;
        if (c1076e.m2909d() && c1076e.f4896J && (c1109s = c1076e.f4910r) != null) {
            c1109s.m2947f();
        }
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: c */
    public final void mo1381c(int i3) {
        C1076E c1076e = this.f4885i;
        c1076e.m2916k();
        c1076e.m2918m();
        if (!c1076e.m2909d() || !c1076e.f4896J) {
            c1076e.m2910e(false);
            return;
        }
        C1109s c1109s = c1076e.f4910r;
        if (c1109s != null) {
            c1109s.m2947f();
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

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: h */
    public final void mo1384h(C0615c c0615c) {
        SubtitleView subtitleView = this.f4885i.f4907o;
        if (subtitleView != null) {
            subtitleView.setCues(c0615c.f2373a);
        }
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo1385i(C0564a0 c0564a0) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo1386j(C0550M c0550m) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo1387k(AbstractC0547J abstractC0547J) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: m */
    public final void mo1388m(C0574f0 c0574f0) {
        C1076E c1076e;
        InterfaceC0553P interfaceC0553P;
        if (c0574f0.equals(C0574f0.f2070d) || (interfaceC0553P = (c1076e = this.f4885i).f4917y) == null || interfaceC0553P.mo1304g() == 1) {
            return;
        }
        c1076e.m2915j();
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: o */
    public final void mo1389o(C0568c0 c0568c0) {
        C1076E c1076e = this.f4885i;
        InterfaceC0553P interfaceC0553P = c1076e.f4917y;
        interfaceC0553P.getClass();
        AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
        AbstractC0558V abstractC0558VMo1324w = abstractC0402b.m1089U(17) ? interfaceC0553P.mo1324w() : AbstractC0558V.f1991a;
        if (abstractC0558VMo1324w.m1415p()) {
            this.f4884h = null;
        } else {
            boolean zM1089U = abstractC0402b.m1089U(30);
            C0556T c0556t = this.f4883g;
            if (!zM1089U || interfaceC0553P.mo1327z().f2055a.isEmpty()) {
                Object obj = this.f4884h;
                if (obj != null) {
                    int iMo1328b = abstractC0558VMo1324w.mo1328b(obj);
                    if (iMo1328b != -1) {
                        if (interfaceC0553P.mo1292N() == abstractC0558VMo1324w.mo1329f(iMo1328b, c0556t, false).f1968c) {
                            return;
                        }
                    }
                    this.f4884h = null;
                }
            } else {
                this.f4884h = abstractC0558VMo1324w.mo1329f(interfaceC0553P.mo1084F(), c0556t, true).f1967b;
            }
        }
        c1076e.m2919n(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4885i.m2914i();
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
    public final void mo1394v(int i3, int i4) {
        if (AbstractC0632A.f2454a == 34) {
            C1076E c1076e = this.f4885i;
            if ((c1076e.f4902j instanceof SurfaceView) && c1076e.f4898L) {
                C0031d c0031d = c1076e.f4904l;
                c0031d.getClass();
                c1076e.f4913u.post(new RunnableC0804O(c0031d, (SurfaceView) c1076e.f4902j, new RunnableC0892b(8, c1076e), 3));
            }
        }
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void mo1395w(int i3) {
    }
}
