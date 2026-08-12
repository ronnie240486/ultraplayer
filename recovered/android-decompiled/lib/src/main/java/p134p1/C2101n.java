package p134p1;

/* JADX INFO: renamed from: p1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2101n extends AbstractC2109v {

    /* JADX INFO: renamed from: a */
    public final EnumC2108u f9131a;

    /* JADX INFO: renamed from: b */
    public final EnumC2107t f9132b;

    public C2101n(EnumC2108u enumC2108u, EnumC2107t enumC2107t) {
        this.f9131a = enumC2108u;
        this.f9132b = enumC2107t;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2109v) {
            AbstractC2109v abstractC2109v = (AbstractC2109v) obj;
            EnumC2108u enumC2108u = this.f9131a;
            if (enumC2108u != null ? enumC2108u.equals(((C2101n) abstractC2109v).f9131a) : ((C2101n) abstractC2109v).f9131a == null) {
                EnumC2107t enumC2107t = this.f9132b;
                if (enumC2107t != null ? enumC2107t.equals(((C2101n) abstractC2109v).f9132b) : ((C2101n) abstractC2109v).f9132b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC2108u enumC2108u = this.f9131a;
        int iHashCode = ((enumC2108u == null ? 0 : enumC2108u.hashCode()) ^ 1000003) * 1000003;
        EnumC2107t enumC2107t = this.f9132b;
        return (enumC2107t != null ? enumC2107t.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f9131a + ", mobileSubtype=" + this.f9132b + "}";
    }
}
