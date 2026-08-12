package p036M0;

import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: M0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0387x {

    /* JADX INFO: renamed from: a */
    public final C0384u f1336a;

    /* JADX INFO: renamed from: b */
    public final int f1337b;

    /* JADX INFO: renamed from: c */
    public final long[] f1338c;

    /* JADX INFO: renamed from: d */
    public final int[] f1339d;

    /* JADX INFO: renamed from: e */
    public final int f1340e;

    /* JADX INFO: renamed from: f */
    public final long[] f1341f;

    /* JADX INFO: renamed from: g */
    public final int[] f1342g;

    /* JADX INFO: renamed from: h */
    public final long f1343h;

    public C0387x(C0384u c0384u, long[] jArr, int[] iArr, int i3, long[] jArr2, int[] iArr2, long j3) {
        AbstractC0646n.m1625c(iArr.length == jArr2.length);
        AbstractC0646n.m1625c(jArr.length == jArr2.length);
        AbstractC0646n.m1625c(iArr2.length == jArr2.length);
        this.f1336a = c0384u;
        this.f1338c = jArr;
        this.f1339d = iArr;
        this.f1340e = i3;
        this.f1341f = jArr2;
        this.f1342g = iArr2;
        this.f1343h = j3;
        this.f1337b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1065a(long j3) {
        long[] jArr = this.f1341f;
        for (int iM1582a = AbstractC0632A.m1582a(jArr, j3, true); iM1582a < jArr.length; iM1582a++) {
            if ((this.f1342g[iM1582a] & 1) != 0) {
                return iM1582a;
            }
        }
        return -1;
    }
}
