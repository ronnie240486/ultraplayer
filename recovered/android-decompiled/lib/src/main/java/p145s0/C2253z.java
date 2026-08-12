package p145s0;

/* JADX INFO: renamed from: s0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2253z {

    /* JADX INFO: renamed from: c */
    public static final C2253z f9685c = new C2253z(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f9686a;

    /* JADX INFO: renamed from: b */
    public final long f9687b;

    public C2253z(long j3, long j4) {
        this.f9686a = j3;
        this.f9687b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2253z.class == obj.getClass()) {
            C2253z c2253z = (C2253z) obj;
            if (this.f9686a == c2253z.f9686a && this.f9687b == c2253z.f9687b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9686a) * 31) + ((int) this.f9687b);
    }

    public final String toString() {
        return "[timeUs=" + this.f9686a + ", position=" + this.f9687b + "]";
    }
}
