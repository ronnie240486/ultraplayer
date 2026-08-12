package p145s0;

/* JADX INFO: renamed from: s0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2251x {

    /* JADX INFO: renamed from: a */
    public final C2253z f9683a;

    /* JADX INFO: renamed from: b */
    public final C2253z f9684b;

    public C2251x(C2253z c2253z, C2253z c2253z2) {
        this.f9683a = c2253z;
        this.f9684b = c2253z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2251x.class == obj.getClass()) {
            C2251x c2251x = (C2251x) obj;
            if (this.f9683a.equals(c2251x.f9683a) && this.f9684b.equals(c2251x.f9684b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9684b.hashCode() + (this.f9683a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C2253z c2253z = this.f9683a;
        sb.append(c2253z);
        C2253z c2253z2 = this.f9684b;
        if (c2253z.equals(c2253z2)) {
            str = "";
        } else {
            str = ", " + c2253z2;
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
