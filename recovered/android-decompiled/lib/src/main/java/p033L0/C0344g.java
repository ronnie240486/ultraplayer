package p033L0;

import p064W.AbstractC0632A;
import p145s0.C2251x;
import p145s0.C2253z;

/* JADX INFO: renamed from: L0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0344g implements InterfaceC0343f {

    /* JADX INFO: renamed from: a */
    public final long[] f1108a;

    /* JADX INFO: renamed from: b */
    public final long[] f1109b;

    /* JADX INFO: renamed from: c */
    public final long f1110c;

    /* JADX INFO: renamed from: d */
    public final long f1111d;

    /* JADX INFO: renamed from: e */
    public final int f1112e;

    public C0344g(long[] jArr, long[] jArr2, long j3, long j4, int i3) {
        this.f1108a = jArr;
        this.f1109b = jArr2;
        this.f1110c = j3;
        this.f1111d = j4;
        this.f1112e = i3;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return true;
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: d */
    public final long mo942d(long j3) {
        return this.f1108a[AbstractC0632A.m1586e(this.f1109b, j3, true)];
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: g */
    public final long mo943g() {
        return this.f1111d;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        long[] jArr = this.f1108a;
        int iM1586e = AbstractC0632A.m1586e(jArr, j3, true);
        long j4 = jArr[iM1586e];
        long[] jArr2 = this.f1109b;
        C2253z c2253z = new C2253z(j4, jArr2[iM1586e]);
        if (j4 >= j3 || iM1586e == jArr.length - 1) {
            return new C2251x(c2253z, c2253z);
        }
        int i3 = iM1586e + 1;
        return new C2251x(c2253z, new C2253z(jArr[i3], jArr2[i3]));
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: k */
    public final int mo944k() {
        return this.f1112e;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f1110c;
    }
}
