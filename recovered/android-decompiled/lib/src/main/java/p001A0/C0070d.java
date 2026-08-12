package p001A0;

import p145s0.AbstractC2246s;
import p145s0.C2251x;
import p145s0.C2253z;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: A0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0070d extends AbstractC2246s {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2252y f108b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0069c f109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070d(C0069c c0069c, InterfaceC2252y interfaceC2252y, InterfaceC2252y interfaceC2252y2) {
        super(interfaceC2252y);
        this.f109c = c0069c;
        this.f108b = interfaceC2252y2;
    }

    @Override // p145s0.AbstractC2246s, p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        C2251x c2251xMo355i = this.f108b.mo355i(j3);
        C2253z c2253z = c2251xMo355i.f9683a;
        long j4 = c2253z.f9686a;
        long j5 = this.f109c.f106h;
        C2253z c2253z2 = new C2253z(j4, c2253z.f9687b + j5);
        C2253z c2253z3 = c2251xMo355i.f9684b;
        return new C2251x(c2253z2, new C2253z(c2253z3.f9686a, c2253z3.f9687b + j5));
    }
}
