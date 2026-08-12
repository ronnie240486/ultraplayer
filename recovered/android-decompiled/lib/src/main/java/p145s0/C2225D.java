package p145s0;

import java.util.Arrays;

/* JADX INFO: renamed from: s0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2225D {

    /* JADX INFO: renamed from: a */
    public final int f9551a;

    /* JADX INFO: renamed from: b */
    public final byte[] f9552b;

    /* JADX INFO: renamed from: c */
    public final int f9553c;

    /* JADX INFO: renamed from: d */
    public final int f9554d;

    public C2225D(int i3, int i4, int i5, byte[] bArr) {
        this.f9551a = i3;
        this.f9552b = bArr;
        this.f9553c = i4;
        this.f9554d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2225D.class == obj.getClass()) {
            C2225D c2225d = (C2225D) obj;
            if (this.f9551a == c2225d.f9551a && this.f9553c == c2225d.f9553c && this.f9554d == c2225d.f9554d && Arrays.equals(this.f9552b, c2225d.f9552b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9552b) + (this.f9551a * 31)) * 31) + this.f9553c) * 31) + this.f9554d;
    }
}
