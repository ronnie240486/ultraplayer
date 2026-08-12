package p039N0;

import java.math.BigInteger;
import p064W.AbstractC0632A;
import p145s0.C2251x;
import p145s0.C2253z;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: N0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0405a implements InterfaceC2252y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0406b f1361a;

    public C0405a(C0406b c0406b) {
        this.f1361a = c0406b;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return true;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        C0406b c0406b = this.f1361a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) c0406b.f1365f.f1402i) * j3) / 1000000);
        long j4 = c0406b.f1364e;
        long j5 = c0406b.f1363d;
        C2253z c2253z = new C2253z(j3, AbstractC0632A.m1591j((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j5)).divide(BigInteger.valueOf(c0406b.f1367h)).longValue() + j5) - 30000, c0406b.f1363d, j4 - 1));
        return new C2251x(c2253z, c2253z);
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        C0406b c0406b = this.f1361a;
        return (c0406b.f1367h * 1000000) / ((long) c0406b.f1365f.f1402i);
    }
}
