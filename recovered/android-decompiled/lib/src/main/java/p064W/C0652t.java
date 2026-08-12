package p064W;

/* JADX INFO: renamed from: W.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0652t {

    /* JADX INFO: renamed from: c */
    public static final C0652t f2523c = new C0652t(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f2524a;

    /* JADX INFO: renamed from: b */
    public final int f2525b;

    static {
        new C0652t(0, 0);
    }

    public C0652t(int i3, int i4) {
        AbstractC0646n.m1625c((i3 == -1 || i3 >= 0) && (i4 == -1 || i4 >= 0));
        this.f2524a = i3;
        this.f2525b = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0652t) {
            C0652t c0652t = (C0652t) obj;
            if (this.f2524a == c0652t.f2524a && this.f2525b == c0652t.f2525b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2524a;
        return ((i3 >>> 16) | (i3 << 16)) ^ this.f2525b;
    }

    public final String toString() {
        return this.f2524a + "x" + this.f2525b;
    }
}
