package p135p2;

/* JADX INFO: renamed from: p2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2111a implements InterfaceC2114d {

    /* JADX INFO: renamed from: a */
    public final int f9141a;

    public C2111a(int i3) {
        this.f9141a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC2114d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC2114d)) {
            return false;
        }
        C2111a c2111a = (C2111a) ((InterfaceC2114d) obj);
        if (this.f9141a != c2111a.f9141a) {
            return false;
        }
        Object obj2 = EnumC2113c.f9143g;
        c2111a.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f9141a) + (EnumC2113c.f9143g.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9141a + "intEncoding=" + EnumC2113c.f9143g + ')';
    }
}
