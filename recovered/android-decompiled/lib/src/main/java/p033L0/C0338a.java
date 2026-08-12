package p033L0;

import p145s0.C2251x;
import p145s0.C2253z;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: L0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0338a implements InterfaceC0343f, InterfaceC2252y {

    /* JADX INFO: renamed from: a */
    public final long f1073a;

    /* JADX INFO: renamed from: b */
    public final long f1074b;

    /* JADX INFO: renamed from: c */
    public final int f1075c;

    /* JADX INFO: renamed from: d */
    public final long f1076d;

    /* JADX INFO: renamed from: e */
    public final int f1077e;

    /* JADX INFO: renamed from: f */
    public final long f1078f;

    /* JADX INFO: renamed from: g */
    public final boolean f1079g;

    /* JADX INFO: renamed from: h */
    public final long f1080h;

    /* JADX INFO: renamed from: i */
    public final int f1081i;

    /* JADX INFO: renamed from: j */
    public final int f1082j;

    /* JADX INFO: renamed from: k */
    public final boolean f1083k;

    /* JADX INFO: renamed from: l */
    public final long f1084l;

    public C0338a(long j3, long j4, int i3, int i4, boolean z3) {
        this.f1073a = j3;
        this.f1074b = j4;
        this.f1075c = i4 == -1 ? 1 : i4;
        this.f1077e = i3;
        this.f1079g = z3;
        if (j3 == -1) {
            this.f1076d = -1L;
            this.f1078f = -9223372036854775807L;
        } else {
            long j5 = j3 - j4;
            this.f1076d = j5;
            this.f1078f = (Math.max(0L, j5) * 8000000) / ((long) i3);
        }
        this.f1080h = j4;
        this.f1081i = i3;
        this.f1082j = i4;
        this.f1083k = z3;
        this.f1084l = j3 == -1 ? -1L : j3;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return this.f1076d != -1 || this.f1079g;
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: d */
    public final long mo942d(long j3) {
        return (Math.max(0L, j3 - this.f1074b) * 8000000) / ((long) this.f1077e);
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: g */
    public final long mo943g() {
        return this.f1084l;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        long j4 = this.f1074b;
        long j5 = this.f1076d;
        if (j5 == -1 && !this.f1079g) {
            C2253z c2253z = new C2253z(0L, j4);
            return new C2251x(c2253z, c2253z);
        }
        int i3 = this.f1077e;
        long j6 = this.f1075c;
        long jMin = (((((long) i3) * j3) / 8000000) / j6) * j6;
        if (j5 != -1) {
            jMin = Math.min(jMin, j5 - j6);
        }
        long jMax = Math.max(jMin, 0L) + j4;
        long jMax2 = (Math.max(0L, jMax - j4) * 8000000) / ((long) i3);
        C2253z c2253z2 = new C2253z(jMax2, jMax);
        if (j5 != -1 && jMax2 < j3) {
            long j7 = jMax + j6;
            if (j7 < this.f1073a) {
                return new C2251x(c2253z2, new C2253z((Math.max(0L, j7 - j4) * 8000000) / ((long) i3), j7));
            }
        }
        return new C2251x(c2253z2, c2253z2);
    }

    @Override // p033L0.InterfaceC0343f
    /* JADX INFO: renamed from: k */
    public final int mo944k() {
        return this.f1081i;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f1078f;
    }
}
