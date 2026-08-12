package p137q0;

import p055T.C0574f0;

/* JADX INFO: renamed from: q0.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2148i implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9275g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2163x f9276h;

    public /* synthetic */ RunnableC2148i(C2149j c2149j, InterfaceC2163x interfaceC2163x, int i3) {
        this.f9275g = i3;
        this.f9276h = interfaceC2163x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9275g) {
            case 0:
                this.f9276h.getClass();
                break;
            case 1:
                this.f9276h.mo3628q();
                break;
            default:
                this.f9276h.mo3629s();
                break;
        }
    }

    public /* synthetic */ RunnableC2148i(C2149j c2149j, InterfaceC2163x interfaceC2163x, C0574f0 c0574f0) {
        this.f9275g = 0;
        this.f9276h = interfaceC2163x;
    }
}
