package p052S;

import p055T.C0552O;
import p055T.InterfaceC0551N;
import p064W.InterfaceC0642j;
import p082b0.C1060a;
import p082b0.C1069j;

/* JADX INFO: renamed from: S.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0527c implements InterfaceC0642j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1807g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1808h;

    public /* synthetic */ C0527c(int i3, int i4) {
        this.f1807g = i4;
        this.f1808h = i3;
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public final void mo214g(Object obj) {
        switch (this.f1807g) {
            case 0:
                ((InterfaceC0551N) obj).mo1395w(this.f1808h);
                break;
            case 1:
                ((InterfaceC0551N) obj).mo1381c(this.f1808h);
                break;
            case 2:
                ((InterfaceC0551N) obj).mo1395w(this.f1808h);
                break;
            default:
                C1069j c1069j = (C1069j) obj;
                c1069j.getClass();
                int i3 = this.f1808h;
                if (i3 == 1) {
                    c1069j.f4872u = true;
                }
                c1069j.f4862k = i3;
                break;
        }
    }

    public /* synthetic */ C0527c(C1060a c1060a, int i3, C0552O c0552o, C0552O c0552o2) {
        this.f1807g = 3;
        this.f1808h = i3;
    }
}
