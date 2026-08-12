package p052S;

import p016F1.AbstractC0191h;
import p016F1.C0187d;
import p016F1.InterfaceC0193j;
import p019G1.AbstractC0232g;
import p046P1.AbstractC0491s;
import p064W.AbstractC0646n;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: S.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0531g extends AbstractC0232g implements InterfaceC0193j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0532h f1816g;

    public C0531g(C0532h c0532h) {
        this.f1816g = c0532h;
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: a */
    public final void mo681a(AbstractC0191h abstractC0191h, int i3) {
        this.f1816g.m1303f0(null);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: b */
    public final void mo682b(AbstractC0191h abstractC0191h, int i3) {
        AbstractC0646n.m1635m("CastPlayer", "Session start failed. Error code " + i3 + ": " + AbstractC2003a.m4541n(i3));
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: c */
    public final void mo683c(AbstractC0191h abstractC0191h, int i3) {
        AbstractC0646n.m1635m("CastPlayer", "Session resume failed. Error code " + i3 + ": " + AbstractC2003a.m4541n(i3));
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo684d(AbstractC0191h abstractC0191h, String str) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: e */
    public final void mo685e(AbstractC0191h abstractC0191h, String str) {
        C0187d c0187d = (C0187d) abstractC0191h;
        c0187d.getClass();
        AbstractC0491s.m1210b();
        this.f1816g.m1303f0(c0187d.f463j);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: f */
    public final void mo686f(AbstractC0191h abstractC0191h, boolean z3) {
        C0187d c0187d = (C0187d) abstractC0191h;
        c0187d.getClass();
        AbstractC0491s.m1210b();
        this.f1816g.m1303f0(c0187d.f463j);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: g */
    public final void mo687g(AbstractC0191h abstractC0191h, int i3) {
        this.f1816g.m1303f0(null);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo688h(AbstractC0191h abstractC0191h) {
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo689i(AbstractC0191h abstractC0191h) {
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: m */
    public final void mo653m() {
        C0532h c0532h = this.f1816g;
        c0532h.m1317m0();
        c0532h.f1829k.m1617b();
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: n */
    public final void mo654n() {
        this.f1816g.m1309i0();
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: j */
    public final void mo650j() {
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: k */
    public final void mo651k() {
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: l */
    public final void mo652l() {
    }
}
