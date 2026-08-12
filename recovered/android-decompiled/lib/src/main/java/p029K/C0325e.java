package p029K;

/* JADX INFO: renamed from: K.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0325e {

    /* JADX INFO: renamed from: a */
    public final long f897a;

    /* JADX INFO: renamed from: b */
    public final long f898b;

    public C0325e(long j3, long j4) {
        if (j4 == 0) {
            this.f897a = 0L;
            this.f898b = 1L;
        } else {
            this.f897a = j3;
            this.f898b = j4;
        }
    }

    public final String toString() {
        return this.f897a + "/" + this.f898b;
    }
}
