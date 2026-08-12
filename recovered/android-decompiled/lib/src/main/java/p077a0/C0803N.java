package p077a0;

import java.util.Objects;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p114k0.C1907A;

/* JADX INFO: renamed from: a0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0803N {

    /* JADX INFO: renamed from: a */
    public final C1907A f3354a;

    /* JADX INFO: renamed from: b */
    public final long f3355b;

    /* JADX INFO: renamed from: c */
    public final long f3356c;

    /* JADX INFO: renamed from: d */
    public final long f3357d;

    /* JADX INFO: renamed from: e */
    public final long f3358e;

    /* JADX INFO: renamed from: f */
    public final boolean f3359f;

    /* JADX INFO: renamed from: g */
    public final boolean f3360g;

    /* JADX INFO: renamed from: h */
    public final boolean f3361h;

    /* JADX INFO: renamed from: i */
    public final boolean f3362i;

    public C0803N(C1907A c1907a, long j3, long j4, long j5, long j6, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7 = true;
        AbstractC0646n.m1625c(!z6 || z4);
        AbstractC0646n.m1625c(!z5 || z4);
        if (z3 && (z4 || z5 || z6)) {
            z7 = false;
        }
        AbstractC0646n.m1625c(z7);
        this.f3354a = c1907a;
        this.f3355b = j3;
        this.f3356c = j4;
        this.f3357d = j5;
        this.f3358e = j6;
        this.f3359f = z3;
        this.f3360g = z4;
        this.f3361h = z5;
        this.f3362i = z6;
    }

    /* JADX INFO: renamed from: a */
    public final C0803N m2015a(long j3) {
        if (j3 == this.f3356c) {
            return this;
        }
        return new C0803N(this.f3354a, this.f3355b, j3, this.f3357d, this.f3358e, this.f3359f, this.f3360g, this.f3361h, this.f3362i);
    }

    /* JADX INFO: renamed from: b */
    public final C0803N m2016b(long j3) {
        if (j3 == this.f3355b) {
            return this;
        }
        return new C0803N(this.f3354a, j3, this.f3356c, this.f3357d, this.f3358e, this.f3359f, this.f3360g, this.f3361h, this.f3362i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0803N.class == obj.getClass()) {
            C0803N c0803n = (C0803N) obj;
            if (this.f3355b == c0803n.f3355b && this.f3356c == c0803n.f3356c && this.f3357d == c0803n.f3357d && this.f3358e == c0803n.f3358e && this.f3359f == c0803n.f3359f && this.f3360g == c0803n.f3360g && this.f3361h == c0803n.f3361h && this.f3362i == c0803n.f3362i) {
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(this.f3354a, c0803n.f3354a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3354a.hashCode() + 527) * 31) + ((int) this.f3355b)) * 31) + ((int) this.f3356c)) * 31) + ((int) this.f3357d)) * 31) + ((int) this.f3358e)) * 31) + (this.f3359f ? 1 : 0)) * 31) + (this.f3360g ? 1 : 0)) * 31) + (this.f3361h ? 1 : 0)) * 31) + (this.f3362i ? 1 : 0);
    }
}
