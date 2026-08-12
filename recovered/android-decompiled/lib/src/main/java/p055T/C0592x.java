package p055T;

import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0592x {

    /* JADX INFO: renamed from: a */
    public final long f2194a;

    /* JADX INFO: renamed from: b */
    public final long f2195b;

    /* JADX INFO: renamed from: c */
    public final long f2196c;

    /* JADX INFO: renamed from: d */
    public final float f2197d;

    /* JADX INFO: renamed from: e */
    public final float f2198e;

    static {
        new C0591w().m1453a();
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(2);
        AbstractC0632A.m1566G(3);
        AbstractC0632A.m1566G(4);
    }

    public C0592x(C0591w c0591w) {
        long j3 = c0591w.f2189a;
        long j4 = c0591w.f2190b;
        long j5 = c0591w.f2191c;
        float f = c0591w.f2192d;
        float f3 = c0591w.f2193e;
        this.f2194a = j3;
        this.f2195b = j4;
        this.f2196c = j5;
        this.f2197d = f;
        this.f2198e = f3;
    }

    /* JADX INFO: renamed from: a */
    public final C0591w m1454a() {
        C0591w c0591w = new C0591w();
        c0591w.f2189a = this.f2194a;
        c0591w.f2190b = this.f2195b;
        c0591w.f2191c = this.f2196c;
        c0591w.f2192d = this.f2197d;
        c0591w.f2193e = this.f2198e;
        return c0591w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0592x)) {
            return false;
        }
        C0592x c0592x = (C0592x) obj;
        return this.f2194a == c0592x.f2194a && this.f2195b == c0592x.f2195b && this.f2196c == c0592x.f2196c && this.f2197d == c0592x.f2197d && this.f2198e == c0592x.f2198e;
    }

    public final int hashCode() {
        long j3 = this.f2194a;
        long j4 = this.f2195b;
        int i3 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2196c;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        float f = this.f2197d;
        int iFloatToIntBits = (i4 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f3 = this.f2198e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
