package p145s0;

/* JADX INFO: renamed from: s0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2231d implements InterfaceC2252y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2233f f9602a;

    /* JADX INFO: renamed from: b */
    public final long f9603b;

    /* JADX INFO: renamed from: c */
    public final long f9604c;

    /* JADX INFO: renamed from: d */
    public final long f9605d;

    /* JADX INFO: renamed from: e */
    public final long f9606e;

    /* JADX INFO: renamed from: f */
    public final long f9607f;

    public C2231d(InterfaceC2233f interfaceC2233f, long j3, long j4, long j5, long j6, long j7) {
        this.f9602a = interfaceC2233f;
        this.f9603b = j3;
        this.f9604c = j4;
        this.f9605d = j5;
        this.f9606e = j6;
        this.f9607f = j7;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return true;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        C2253z c2253z = new C2253z(j3, C2232e.m4830a(this.f9602a.mo547d(j3), 0L, this.f9604c, this.f9605d, this.f9606e, this.f9607f));
        return new C2251x(c2253z, c2253z);
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f9603b;
    }
}
