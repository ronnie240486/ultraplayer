package p052S;

import p055T.InterfaceC0551N;
import p064W.InterfaceC0642j;

/* JADX INFO: renamed from: S.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0529e implements InterfaceC0642j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1812g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1813h;

    public /* synthetic */ C0529e(int i3, boolean z3) {
        this.f1812g = i3;
        this.f1813h = z3;
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public final void mo214g(Object obj) {
        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj;
        switch (this.f1812g) {
            case 0:
                interfaceC0551N.mo1378K(this.f1813h);
                break;
            case 1:
                interfaceC0551N.mo1390q(this.f1813h);
                break;
            default:
                interfaceC0551N.mo1372D(this.f1813h);
                break;
        }
    }
}
