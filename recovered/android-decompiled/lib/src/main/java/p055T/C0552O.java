package p055T;

import java.util.Arrays;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: T.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0552O {

    /* JADX INFO: renamed from: a */
    public final Object f1954a;

    /* JADX INFO: renamed from: b */
    public final int f1955b;

    /* JADX INFO: renamed from: c */
    public final C0539B f1956c;

    /* JADX INFO: renamed from: d */
    public final Object f1957d;

    /* JADX INFO: renamed from: e */
    public final int f1958e;

    /* JADX INFO: renamed from: f */
    public final long f1959f;

    /* JADX INFO: renamed from: g */
    public final long f1960g;

    /* JADX INFO: renamed from: h */
    public final int f1961h;

    /* JADX INFO: renamed from: i */
    public final int f1962i;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
        AbstractC0632A.m1566G(5);
        AbstractC0632A.m1566G(6);
    }

    public C0552O(Object obj, int i3, C0539B c0539b, Object obj2, int i4, long j3, long j4, int i5, int i6) {
        this.f1954a = obj;
        this.f1955b = i3;
        this.f1956c = c0539b;
        this.f1957d = obj2;
        this.f1958e = i4;
        this.f1959f = j3;
        this.f1960g = j4;
        this.f1961h = i5;
        this.f1962i = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0552O.class == obj.getClass()) {
            C0552O c0552o = (C0552O) obj;
            if (this.f1955b == c0552o.f1955b && this.f1958e == c0552o.f1958e && this.f1959f == c0552o.f1959f && this.f1960g == c0552o.f1960g && this.f1961h == c0552o.f1961h && this.f1962i == c0552o.f1962i && AbstractC2003a.m4538k(this.f1956c, c0552o.f1956c) && AbstractC2003a.m4538k(this.f1954a, c0552o.f1954a) && AbstractC2003a.m4538k(this.f1957d, c0552o.f1957d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1954a, Integer.valueOf(this.f1955b), this.f1956c, this.f1957d, Integer.valueOf(this.f1958e), Long.valueOf(this.f1959f), Long.valueOf(this.f1960g), Integer.valueOf(this.f1961h), Integer.valueOf(this.f1962i)});
    }
}
