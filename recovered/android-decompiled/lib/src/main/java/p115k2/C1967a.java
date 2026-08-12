package p115k2;

import java.io.Serializable;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: k2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1967a implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f8591i = 0;

    /* JADX INFO: renamed from: g */
    public final int[] f8592g;

    /* JADX INFO: renamed from: h */
    public final int f8593h;

    static {
        new C1967a(new int[0]);
    }

    public C1967a(int[] iArr) {
        int length = iArr.length;
        this.f8592g = iArr;
        this.f8593h = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1967a) {
            C1967a c1967a = (C1967a) obj;
            int i3 = c1967a.f8593h;
            int i4 = this.f8593h;
            if (i4 == i3) {
                for (int i5 = 0; i5 < i4; i5++) {
                    AbstractC0230e.m729g(i5, i4);
                    int i6 = this.f8592g[i5];
                    AbstractC0230e.m729g(i5, c1967a.f8593h);
                    if (i6 == c1967a.f8592g[i5]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.f8593h; i4++) {
            i3 = (i3 * 31) + this.f8592g[i4];
        }
        return i3;
    }

    public final String toString() {
        int i3 = this.f8593h;
        if (i3 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i3 * 5);
        sb.append('[');
        int[] iArr = this.f8592g;
        sb.append(iArr[0]);
        for (int i4 = 1; i4 < i3; i4++) {
            sb.append(", ");
            sb.append(iArr[i4]);
        }
        sb.append(']');
        return sb.toString();
    }
}
