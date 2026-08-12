package p064W;

import java.math.RoundingMode;

/* JADX INFO: renamed from: W.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0656x {

    /* JADX INFO: renamed from: a */
    public long f2530a;

    /* JADX INFO: renamed from: b */
    public long f2531b;

    /* JADX INFO: renamed from: c */
    public long f2532c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f2533d = new ThreadLocal();

    public C0656x(long j3) {
        m1707g(j3);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m1701a(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m1706f()) {
                long jLongValue = this.f2530a;
                if (jLongValue == 9223372036854775806L) {
                    Long l3 = (Long) this.f2533d.get();
                    l3.getClass();
                    jLongValue = l3.longValue();
                }
                this.f2531b = jLongValue - j3;
                notifyAll();
            }
            this.f2532c = j3;
            return j3 + this.f2531b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m1702b(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j4 = this.f2532c;
            if (j4 != -9223372036854775807L) {
                int i3 = AbstractC0632A.f2454a;
                long jM1577R = AbstractC0632A.m1577R(j4, 90000L, 1000000L, RoundingMode.DOWN);
                long j5 = (4294967296L + jM1577R) / 8589934592L;
                long j6 = ((j5 - 1) * 8589934592L) + j3;
                long j7 = (j5 * 8589934592L) + j3;
                j3 = Math.abs(j6 - jM1577R) < Math.abs(j7 - jM1577R) ? j6 : j7;
            }
            long j8 = j3;
            int i4 = AbstractC0632A.f2454a;
            return m1701a(AbstractC0632A.m1577R(j8, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m1703c(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j4 = this.f2532c;
        if (j4 != -9223372036854775807L) {
            int i3 = AbstractC0632A.f2454a;
            long jM1577R = AbstractC0632A.m1577R(j4, 90000L, 1000000L, RoundingMode.DOWN);
            long j5 = jM1577R / 8589934592L;
            Long.signum(j5);
            long j6 = (j5 * 8589934592L) + j3;
            j3 = j6 >= jM1577R ? j6 : ((j5 + 1) * 8589934592L) + j3;
        }
        long j7 = j3;
        int i4 = AbstractC0632A.f2454a;
        return m1701a(AbstractC0632A.m1577R(j7, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m1704d() {
        long j3;
        j3 = this.f2530a;
        if (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) {
            j3 = -9223372036854775807L;
        }
        return j3;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m1705e() {
        return this.f2531b;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m1706f() {
        return this.f2531b != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m1707g(long j3) {
        this.f2530a = j3;
        this.f2531b = j3 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f2532c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m1708h(long j3, boolean z3) {
        try {
            AbstractC0646n.m1630h(this.f2530a == 9223372036854775806L);
            if (m1706f()) {
                return;
            }
            if (z3) {
                this.f2533d.set(Long.valueOf(j3));
            } else {
                while (!m1706f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
