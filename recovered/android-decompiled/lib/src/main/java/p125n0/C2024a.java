package p125n0;

/* JADX INFO: renamed from: n0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2024a {

    /* JADX INFO: renamed from: a */
    public final long f8796a;

    /* JADX INFO: renamed from: b */
    public final long f8797b;

    public C2024a(long j3, long j4) {
        this.f8796a = j3;
        this.f8797b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2024a)) {
            return false;
        }
        C2024a c2024a = (C2024a) obj;
        return this.f8796a == c2024a.f8796a && this.f8797b == c2024a.f8797b;
    }

    public final int hashCode() {
        return (((int) this.f8796a) * 31) + ((int) this.f8797b);
    }
}
