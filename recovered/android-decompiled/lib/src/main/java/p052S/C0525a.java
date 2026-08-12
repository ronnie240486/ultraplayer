package p052S;

import p055T.C0552O;
import p055T.InterfaceC0551N;
import p064W.InterfaceC0642j;

/* JADX INFO: renamed from: S.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0525a implements InterfaceC0642j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1802g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0552O f1803h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0552O f1804i;

    public /* synthetic */ C0525a(int i3, C0552O c0552o, C0552O c0552o2) {
        this.f1802g = i3;
        this.f1803h = c0552o;
        this.f1804i = c0552o2;
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public final void mo214g(Object obj) {
        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj;
        switch (this.f1802g) {
            case 0:
                interfaceC0551N.getClass();
                interfaceC0551N.mo1380b(1, this.f1803h, this.f1804i);
                break;
            case 1:
                interfaceC0551N.getClass();
                interfaceC0551N.mo1380b(0, this.f1803h, this.f1804i);
                break;
            default:
                interfaceC0551N.getClass();
                interfaceC0551N.mo1380b(4, this.f1803h, this.f1804i);
                break;
        }
    }
}
