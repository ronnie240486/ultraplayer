package p166y1;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2376a {

    /* JADX INFO: renamed from: f */
    public static final C2376a f9956f = new C2376a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a */
    public final long f9957a;

    /* JADX INFO: renamed from: b */
    public final int f9958b;

    /* JADX INFO: renamed from: c */
    public final int f9959c;

    /* JADX INFO: renamed from: d */
    public final long f9960d;

    /* JADX INFO: renamed from: e */
    public final int f9961e;

    public C2376a(long j3, int i3, int i4, long j4, int i5) {
        this.f9957a = j3;
        this.f9958b = i3;
        this.f9959c = i4;
        this.f9960d = j4;
        this.f9961e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2376a) {
            C2376a c2376a = (C2376a) obj;
            if (this.f9957a == c2376a.f9957a && this.f9958b == c2376a.f9958b && this.f9959c == c2376a.f9959c && this.f9960d == c2376a.f9960d && this.f9961e == c2376a.f9961e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9957a;
        int i3 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f9958b) * 1000003) ^ this.f9959c) * 1000003;
        long j4 = this.f9960d;
        return this.f9961e ^ ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f9957a + ", loadBatchSize=" + this.f9958b + ", criticalSectionEnterTimeoutMs=" + this.f9959c + ", eventCleanUpAge=" + this.f9960d + ", maxBlobByteSizePerRow=" + this.f9961e + "}";
    }
}
