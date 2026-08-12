package p126n1;

/* JADX INFO: renamed from: n1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2047b {

    /* JADX INFO: renamed from: a */
    public final String f8920a;

    public C2047b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f8920a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2047b)) {
            return false;
        }
        return this.f8920a.equals(((C2047b) obj).f8920a);
    }

    public final int hashCode() {
        return this.f8920a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.f8920a + "\"}";
    }
}
