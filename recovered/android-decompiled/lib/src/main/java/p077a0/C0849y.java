package p077a0;

import p036M0.C0380q;
import p055T.C0574f0;
import p055T.C0582n;
import p055T.C0583o;
import p055T.InterfaceC0551N;
import p064W.InterfaceC0642j;
import p082b0.C1060a;
import p082b0.C1069j;

/* JADX INFO: renamed from: a0.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0849y implements InterfaceC0642j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3608g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0574f0 f3609h;

    public /* synthetic */ C0849y(C0574f0 c0574f0) {
        this.f3609h = c0574f0;
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public final void mo214g(Object obj) {
        switch (this.f3608g) {
            case 0:
                ((InterfaceC0551N) obj).mo1388m(this.f3609h);
                break;
            default:
                C1069j c1069j = (C1069j) obj;
                C0380q c0380q = c1069j.f4866o;
                C0574f0 c0574f0 = this.f3609h;
                if (c0380q != null) {
                    C0583o c0583o = (C0583o) c0380q.f1292i;
                    if (c0583o.f2162v == -1) {
                        C0582n c0582nM1447a = c0583o.m1447a();
                        c0582nM1447a.f2121t = c0574f0.f2071a;
                        c0582nM1447a.f2122u = c0574f0.f2072b;
                        c1069j.f4866o = new C0380q(new C0583o(c0582nM1447a), c0380q.f1291h, (String) c0380q.f1293j, 2);
                    }
                }
                int i3 = c0574f0.f2071a;
                break;
        }
    }

    public /* synthetic */ C0849y(C1060a c1060a, C0574f0 c0574f0) {
        this.f3609h = c0574f0;
    }
}
