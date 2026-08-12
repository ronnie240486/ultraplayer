package p148t;

import android.graphics.Insets;

/* JADX INFO: renamed from: t.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2264c {

    /* JADX INFO: renamed from: e */
    public static final C2264c f9697e = new C2264c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f9698a;

    /* JADX INFO: renamed from: b */
    public final int f9699b;

    /* JADX INFO: renamed from: c */
    public final int f9700c;

    /* JADX INFO: renamed from: d */
    public final int f9701d;

    public C2264c(int i3, int i4, int i5, int i6) {
        this.f9698a = i3;
        this.f9699b = i4;
        this.f9700c = i5;
        this.f9701d = i6;
    }

    /* JADX INFO: renamed from: a */
    public static C2264c m4862a(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f9697e : new C2264c(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: b */
    public final Insets m4863b() {
        return AbstractC2263b.m4861a(this.f9698a, this.f9699b, this.f9700c, this.f9701d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2264c.class != obj.getClass()) {
            return false;
        }
        C2264c c2264c = (C2264c) obj;
        return this.f9701d == c2264c.f9701d && this.f9698a == c2264c.f9698a && this.f9700c == c2264c.f9700c && this.f9699b == c2264c.f9699b;
    }

    public final int hashCode() {
        return (((((this.f9698a * 31) + this.f9699b) * 31) + this.f9700c) * 31) + this.f9701d;
    }

    public final String toString() {
        return "Insets{left=" + this.f9698a + ", top=" + this.f9699b + ", right=" + this.f9700c + ", bottom=" + this.f9701d + '}';
    }
}
