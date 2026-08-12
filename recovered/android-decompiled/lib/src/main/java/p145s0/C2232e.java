package p145s0;

import p064W.AbstractC0632A;

/* JADX INFO: renamed from: s0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2232e {

    /* JADX INFO: renamed from: a */
    public final long f9608a;

    /* JADX INFO: renamed from: b */
    public final long f9609b;

    /* JADX INFO: renamed from: c */
    public final long f9610c;

    /* JADX INFO: renamed from: d */
    public long f9611d = 0;

    /* JADX INFO: renamed from: e */
    public long f9612e;

    /* JADX INFO: renamed from: f */
    public long f9613f;

    /* JADX INFO: renamed from: g */
    public long f9614g;

    /* JADX INFO: renamed from: h */
    public long f9615h;

    public C2232e(long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f9608a = j3;
        this.f9609b = j4;
        this.f9612e = j5;
        this.f9613f = j6;
        this.f9614g = j7;
        this.f9610c = j8;
        this.f9615h = m4830a(j4, 0L, j5, j6, j7, j8);
    }

    /* JADX INFO: renamed from: a */
    public static long m4830a(long j3, long j4, long j5, long j6, long j7, long j8) {
        if (j6 + 1 >= j7 || j4 + 1 >= j5) {
            return j6;
        }
        long j9 = (long) ((j3 - j4) * ((j7 - j6) / (j5 - j4)));
        return AbstractC0632A.m1591j(((j9 + j6) - j8) - (j9 / 20), j6, j7 - 1);
    }
}
