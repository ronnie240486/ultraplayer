package p134p1;

/* JADX INFO: renamed from: p1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2097j extends AbstractC2104q {

    /* JADX INFO: renamed from: a */
    public final C2095h f9116a;

    public C2097j(C2095h c2095h) {
        this.f9116a = c2095h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2104q)) {
            return false;
        }
        AbstractC2104q abstractC2104q = (AbstractC2104q) obj;
        Object obj2 = EnumC2103p.f9133g;
        ((C2097j) abstractC2104q).getClass();
        return obj2.equals(obj2) && this.f9116a.equals(((C2097j) abstractC2104q).f9116a);
    }

    public final int hashCode() {
        return ((EnumC2103p.f9133g.hashCode() ^ 1000003) * 1000003) ^ this.f9116a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC2103p.f9133g + ", androidClientInfo=" + this.f9116a + "}";
    }
}
