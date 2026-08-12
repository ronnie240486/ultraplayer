package p039N0;

import java.io.EOFException;
import java.io.IOException;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p145s0.C2237j;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: N0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0406b implements InterfaceC0411g {

    /* JADX INFO: renamed from: c */
    public final C0410f f1362c;

    /* JADX INFO: renamed from: d */
    public final long f1363d;

    /* JADX INFO: renamed from: e */
    public final long f1364e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0413i f1365f;

    /* JADX INFO: renamed from: g */
    public int f1366g;

    /* JADX INFO: renamed from: h */
    public long f1367h;

    /* JADX INFO: renamed from: i */
    public long f1368i;

    /* JADX INFO: renamed from: j */
    public long f1369j;

    /* JADX INFO: renamed from: k */
    public long f1370k;

    /* JADX INFO: renamed from: l */
    public long f1371l;

    /* JADX INFO: renamed from: m */
    public long f1372m;

    /* JADX INFO: renamed from: n */
    public long f1373n;

    public C0406b(AbstractC0413i abstractC0413i, long j3, long j4, long j5, long j6, boolean z3) {
        AbstractC0646n.m1625c(j3 >= 0 && j4 > j3);
        this.f1365f = abstractC0413i;
        this.f1363d = j3;
        this.f1364e = j4;
        if (j5 == j4 - j3 || z3) {
            this.f1367h = j6;
            this.f1366g = 4;
        } else {
            this.f1366g = 0;
        }
        this.f1362c = new C0410f();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: c */
    public final long mo974c(C2237j c2237j) throws IOException {
        long j3;
        long j4;
        long j5;
        long jM1591j;
        int i3 = this.f1366g;
        long j6 = this.f1364e;
        C0410f c0410f = this.f1362c;
        if (i3 == 0) {
            j3 = 0;
            long j7 = c2237j.f9629j;
            this.f1368i = j7;
            this.f1366g = 1;
            long j8 = j6 - 65307;
            if (j8 > j7) {
                return j8;
            }
        } else if (i3 != 1) {
            if (i3 == 2) {
                j4 = 2;
                long j9 = this.f1370k;
                long j10 = this.f1371l;
                if (j9 == j10) {
                    jM1591j = -1;
                    j5 = -1;
                } else {
                    long j11 = c2237j.f9629j;
                    if (c0410f.m1107b(c2237j, j10)) {
                        c0410f.m1106a(c2237j, false);
                        c2237j.f9631l = 0;
                        long j12 = this.f1369j;
                        long j13 = c0410f.f1385b;
                        long j14 = j12 - j13;
                        int i4 = c0410f.f1387d + c0410f.f1388e;
                        if (0 > j14 || j14 >= 72000) {
                            if (j14 < 0) {
                                this.f1371l = j11;
                                this.f1373n = j13;
                            } else {
                                this.f1370k = c2237j.f9629j + ((long) i4);
                                this.f1372m = j13;
                            }
                            long j15 = this.f1371l;
                            long j16 = this.f1370k;
                            if (j15 - j16 < 100000) {
                                this.f1371l = j16;
                                j5 = -1;
                                jM1591j = j16;
                            } else {
                                j5 = -1;
                                jM1591j = AbstractC0632A.m1591j((((j15 - j16) * j14) / (this.f1373n - this.f1372m)) + (c2237j.f9629j - (((long) i4) * (j14 <= 0 ? 2L : 1L))), j16, j15 - 1);
                            }
                        } else {
                            jM1591j = -1;
                            j5 = -1;
                        }
                    } else {
                        jM1591j = this.f1370k;
                        if (jM1591j == j11) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j5 = -1;
                    }
                }
                if (jM1591j != j5) {
                    return jM1591j;
                }
                this.f1366g = 3;
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j5 = -1;
                c0410f = c0410f;
                j4 = 2;
            }
            long j17 = j5;
            while (true) {
                c0410f.m1107b(c2237j, j17);
                c0410f.m1106a(c2237j, false);
                if (c0410f.f1385b > this.f1369j) {
                    c2237j.f9631l = 0;
                    this.f1366g = 4;
                    return -(this.f1372m + j4);
                }
                c2237j.mo335d(c0410f.f1387d + c0410f.f1388e);
                this.f1370k = c2237j.f9629j;
                this.f1372m = c0410f.f1385b;
                j17 = -1;
            }
        } else {
            j3 = 0;
        }
        c0410f.f1384a = 0;
        c0410f.f1385b = j3;
        c0410f.f1386c = 0;
        c0410f.f1387d = 0;
        c0410f.f1388e = 0;
        if (!c0410f.m1107b(c2237j, -1L)) {
            throw new EOFException();
        }
        c0410f.m1106a(c2237j, false);
        c2237j.mo335d(c0410f.f1387d + c0410f.f1388e);
        long j18 = c0410f.f1385b;
        while ((c0410f.f1384a & 4) != 4 && c0410f.m1107b(c2237j, -1L) && c2237j.f9629j < j6 && c0410f.m1106a(c2237j, true)) {
            try {
                c2237j.mo335d(c0410f.f1387d + c0410f.f1388e);
                j18 = c0410f.f1385b;
            } catch (EOFException unused) {
            }
        }
        this.f1367h = j18;
        this.f1366g = 4;
        return this.f1368i;
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: p */
    public final InterfaceC2252y mo987p() {
        if (this.f1367h != 0) {
            return new C0405a(this);
        }
        return null;
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: r */
    public final void mo989r(long j3) {
        this.f1369j = AbstractC0632A.m1591j(j3, 0L, this.f1367h - 1);
        this.f1366g = 2;
        this.f1370k = this.f1363d;
        this.f1371l = this.f1364e;
        this.f1372m = 0L;
        this.f1373n = this.f1367h;
    }
}
