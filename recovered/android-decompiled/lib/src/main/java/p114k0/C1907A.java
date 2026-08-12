package p114k0;

/* JADX INFO: renamed from: k0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1907A {

    /* JADX INFO: renamed from: a */
    public final Object f8311a;

    /* JADX INFO: renamed from: b */
    public final int f8312b;

    /* JADX INFO: renamed from: c */
    public final int f8313c;

    /* JADX INFO: renamed from: d */
    public final long f8314d;

    /* JADX INFO: renamed from: e */
    public final int f8315e;

    public C1907A(Object obj) {
        this(-1L, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C1907A m4421a(Object obj) {
        if (this.f8311a.equals(obj)) {
            return this;
        }
        return new C1907A(obj, this.f8312b, this.f8313c, this.f8314d, this.f8315e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4422b() {
        return this.f8312b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1907A)) {
            return false;
        }
        C1907A c1907a = (C1907A) obj;
        return this.f8311a.equals(c1907a.f8311a) && this.f8312b == c1907a.f8312b && this.f8313c == c1907a.f8313c && this.f8314d == c1907a.f8314d && this.f8315e == c1907a.f8315e;
    }

    public final int hashCode() {
        return ((((((((this.f8311a.hashCode() + 527) * 31) + this.f8312b) * 31) + this.f8313c) * 31) + ((int) this.f8314d)) * 31) + this.f8315e;
    }

    public C1907A(long j3, Object obj) {
        this(obj, -1, -1, j3, -1);
    }

    public C1907A(int i3, long j3, Object obj) {
        this(obj, -1, -1, j3, i3);
    }

    public C1907A(Object obj, int i3, int i4, long j3, int i5) {
        this.f8311a = obj;
        this.f8312b = i3;
        this.f8313c = i4;
        this.f8314d = j3;
        this.f8315e = i5;
    }
}
