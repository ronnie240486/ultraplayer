package p162x1;

import java.util.Set;

/* JADX INFO: renamed from: x1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2353b {

    /* JADX INFO: renamed from: a */
    public final long f9882a;

    /* JADX INFO: renamed from: b */
    public final long f9883b;

    /* JADX INFO: renamed from: c */
    public final Set f9884c;

    public C2353b(long j3, long j4, Set set) {
        this.f9882a = j3;
        this.f9883b = j4;
        this.f9884c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2353b) {
            C2353b c2353b = (C2353b) obj;
            if (this.f9882a == c2353b.f9882a && this.f9883b == c2353b.f9883b && this.f9884c.equals(c2353b.f9884c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9882a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j4 = this.f9883b;
        return this.f9884c.hashCode() ^ ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f9882a + ", maxAllowedDelay=" + this.f9883b + ", flags=" + this.f9884c + "}";
    }
}
