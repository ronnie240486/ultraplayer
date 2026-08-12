package p055T;

/* JADX INFO: renamed from: T.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0550M {

    /* JADX INFO: renamed from: a */
    public final C0581m f1953a;

    public C0550M(C0581m c0581m) {
        this.f1953a = c0581m;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1368a(int... iArr) {
        C0581m c0581m = this.f1953a;
        for (int i3 : iArr) {
            if (c0581m.f2090a.get(i3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0550M) {
            return this.f1953a.equals(((C0550M) obj).f1953a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1953a.hashCode();
    }
}
