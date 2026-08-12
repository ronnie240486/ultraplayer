package p168z;

import java.util.Objects;

/* JADX INFO: renamed from: z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2388b {

    /* JADX INFO: renamed from: a */
    public final Object f9981a;

    /* JADX INFO: renamed from: b */
    public final Object f9982b;

    public C2388b(Object obj, Object obj2) {
        this.f9981a = obj;
        this.f9982b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2388b)) {
            return false;
        }
        C2388b c2388b = (C2388b) obj;
        return Objects.equals(c2388b.f9981a, this.f9981a) && Objects.equals(c2388b.f9982b, this.f9982b);
    }

    public final int hashCode() {
        Object obj = this.f9981a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f9982b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f9981a + " " + this.f9982b + "}";
    }
}
