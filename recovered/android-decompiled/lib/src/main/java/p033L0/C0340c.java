package p033L0;

import android.util.Pair;
import p064W.AbstractC0632A;
import p145s0.C2251x;
import p145s0.C2253z;

/* JADX INFO: renamed from: L0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0340c implements InterfaceC0343f {

    /* JADX INFO: renamed from: a */
    public final long[] f1085a;

    /* JADX INFO: renamed from: b */
    public final long[] f1086b;

    /* JADX INFO: renamed from: c */
    public final long f1087c;

    public C0340c(long j3, long[] jArr, long[] jArr2) {
        this.f1085a = jArr;
        this.f1086b = jArr2;
        this.f1087c = j3 == -9223372036854775807L ? AbstractC0632A.m1571L(jArr2[jArr2.length - 1]) : j3;
    }

    /* JADX INFO: renamed from: a */
    public static Pair m946a(long j3, long[] jArr, long[] jArr2) {
        int iM1586e = AbstractC0632A.m1586e(jArr, j3, true);
        long j4 = jArr[iM1586e];
        long j5 = jArr2[iM1586e];
        int i3 = iM1586e + 1;
        if (i3 == jArr.length) {
            return Pair.create(Long.valueOf(j4), Long.valueOf(j5));
        }
        long j6 = jArr[i3];
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) ((j6 == j4 ? 0.0d : (j3 - j4) / (j6 - j4)) * (jArr2[i3] - j5))) + j5));
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return true;
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: d */
    public final long mo942d(long j3) {
        return AbstractC0632A.m1571L(((Long) m946a(j3, this.f1085a, this.f1086b).second).longValue());
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: g */
    public final long mo943g() {
        return -1L;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        Pair pairM946a = m946a(AbstractC0632A.m1581V(AbstractC0632A.m1591j(j3, 0L, this.f1087c)), this.f1086b, this.f1085a);
        C2253z c2253z = new C2253z(AbstractC0632A.m1571L(((Long) pairM946a.first).longValue()), ((Long) pairM946a.second).longValue());
        return new C2251x(c2253z, c2253z);
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: k */
    public final int mo944k() {
        return -2147483647;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f1087c;
    }
}
