package p145s0;

import java.util.Arrays;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2236i implements InterfaceC2252y {

    /* JADX INFO: renamed from: a */
    public final int f9620a;

    /* JADX INFO: renamed from: b */
    public final int[] f9621b;

    /* JADX INFO: renamed from: c */
    public final long[] f9622c;

    /* JADX INFO: renamed from: d */
    public final long[] f9623d;

    /* JADX INFO: renamed from: e */
    public final long[] f9624e;

    /* JADX INFO: renamed from: f */
    public final long f9625f;

    public C2236i(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9621b = iArr;
        this.f9622c = jArr;
        this.f9623d = jArr2;
        this.f9624e = jArr3;
        int length = iArr.length;
        this.f9620a = length;
        if (length > 0) {
            this.f9625f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9625f = 0L;
        }
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return true;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        long[] jArr = this.f9624e;
        int iM1586e = AbstractC0632A.m1586e(jArr, j3, true);
        long j4 = jArr[iM1586e];
        long[] jArr2 = this.f9622c;
        C2253z c2253z = new C2253z(j4, jArr2[iM1586e]);
        if (j4 >= j3 || iM1586e == this.f9620a - 1) {
            return new C2251x(c2253z, c2253z);
        }
        int i3 = iM1586e + 1;
        return new C2251x(c2253z, new C2253z(jArr[i3], jArr2[i3]));
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f9625f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f9620a + ", sizes=" + Arrays.toString(this.f9621b) + ", offsets=" + Arrays.toString(this.f9622c) + ", timeUs=" + Arrays.toString(this.f9624e) + ", durationsUs=" + Arrays.toString(this.f9623d) + ")";
    }
}
