package p077a0;

import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: a0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0832i0 {

    /* JADX INFO: renamed from: c */
    public static final C0832i0 f3524c;

    /* JADX INFO: renamed from: a */
    public final long f3525a;

    /* JADX INFO: renamed from: b */
    public final long f3526b;

    static {
        C0832i0 c0832i0 = new C0832i0(0L, 0L);
        new C0832i0(Long.MAX_VALUE, Long.MAX_VALUE);
        new C0832i0(Long.MAX_VALUE, 0L);
        new C0832i0(0L, Long.MAX_VALUE);
        f3524c = c0832i0;
    }

    public C0832i0(long j3, long j4) {
        AbstractC0646n.m1625c(j3 >= 0);
        AbstractC0646n.m1625c(j4 >= 0);
        this.f3525a = j3;
        this.f3526b = j4;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005c A[RETURN] */
    /* JADX INFO: renamed from: a */
    public final long m2102a(long j3, long j4, long j5) {
        long j6 = this.f3526b;
        long j7 = this.f3525a;
        if (j7 == 0 && j6 == 0) {
            return j3;
        }
        int i3 = AbstractC0632A.f2454a;
        long j8 = j3 - j7;
        if (((j7 ^ j3) & (j3 ^ j8)) < 0) {
            j8 = Long.MIN_VALUE;
        }
        long j9 = j3 + j6;
        if (((j6 ^ j9) & (j3 ^ j9)) < 0) {
            j9 = Long.MAX_VALUE;
        }
        boolean z3 = false;
        boolean z4 = j8 <= j4 && j4 <= j9;
        if (j8 <= j5 && j5 <= j9) {
            z3 = true;
        }
        if (z4 && z3) {
            if (Math.abs(j4 - j3) <= Math.abs(j5 - j3)) {
                return j4;
            }
            return j5;
        }
        if (!z4) {
            if (z3) {
                return j5;
            }
            return j8;
        }
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0832i0.class == obj.getClass()) {
            C0832i0 c0832i0 = (C0832i0) obj;
            if (this.f3525a == c0832i0.f3525a && this.f3526b == c0832i0.f3526b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3525a) * 31) + ((int) this.f3526b);
    }
}
