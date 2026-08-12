package p077a0;

import p055T.C0552O;
import p055T.InterfaceC0551N;
import p064W.InterfaceC0642j;
import p138q1.C2174j;
import p162x1.C2360i;
import p169z1.InterfaceC2390b;

/* JADX INFO: renamed from: a0.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0848x implements InterfaceC0642j, InterfaceC2390b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3605g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3606h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3607i;

    public /* synthetic */ C0848x(int i3, C0552O c0552o, C0552O c0552o2) {
        this.f3605g = i3;
        this.f3606h = c0552o;
        this.f3607i = c0552o2;
    }

    @Override // p169z1.InterfaceC2390b
    /* JADX INFO: renamed from: e */
    public Object mo548e() {
        ((C2360i) this.f3606h).f9909d.m4948a((C2174j) this.f3607i, this.f3605g + 1, false);
        return null;
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public void mo214g(Object obj) {
        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj;
        interfaceC0551N.getClass();
        interfaceC0551N.mo1380b(this.f3605g, (C0552O) this.f3606h, (C0552O) this.f3607i);
    }

    public /* synthetic */ C0848x(C2360i c2360i, C2174j c2174j, int i3) {
        this.f3606h = c2360i;
        this.f3607i = c2174j;
        this.f3605g = i3;
    }
}
