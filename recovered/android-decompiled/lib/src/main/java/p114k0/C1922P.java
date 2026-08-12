package p114k0;

/* JADX INFO: renamed from: k0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1922P {

    /* JADX INFO: renamed from: a */
    public final int f8371a;

    /* JADX INFO: renamed from: b */
    public final boolean f8372b;

    public C1922P(int i3, boolean z3) {
        this.f8371a = i3;
        this.f8372b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1922P.class != obj.getClass()) {
            return false;
        }
        C1922P c1922p = (C1922P) obj;
        return this.f8371a == c1922p.f8371a && this.f8372b == c1922p.f8372b;
    }

    public final int hashCode() {
        return (this.f8371a * 31) + (this.f8372b ? 1 : 0);
    }
}
