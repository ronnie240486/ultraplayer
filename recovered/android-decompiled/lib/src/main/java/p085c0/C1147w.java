package p085c0;

import android.os.SystemClock;

/* JADX INFO: renamed from: c0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1147w {

    /* JADX INFO: renamed from: a */
    public Exception f5333a;

    /* JADX INFO: renamed from: b */
    public long f5334b = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public long f5335c = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final void m3044a(Exception exc) {
        boolean z3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f5333a == null) {
            this.f5333a = exc;
        }
        if (this.f5334b == -9223372036854775807L) {
            synchronized (C1150z.f5339j0) {
                z3 = C1150z.f5341l0 > 0;
            }
            if (!z3) {
                this.f5334b = 200 + jElapsedRealtime;
            }
        }
        long j3 = this.f5334b;
        if (j3 == -9223372036854775807L || jElapsedRealtime < j3) {
            this.f5335c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f5333a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f5333a;
        this.f5333a = null;
        this.f5334b = -9223372036854775807L;
        this.f5335c = -9223372036854775807L;
        throw exc3;
    }
}
