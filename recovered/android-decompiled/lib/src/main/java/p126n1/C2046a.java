package p126n1;

import com.google.android.gms.internal.cast.C1328s0;

/* JADX INFO: renamed from: n1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2046a {

    /* JADX INFO: renamed from: a */
    public final Integer f8917a;

    /* JADX INFO: renamed from: b */
    public final C1328s0 f8918b;

    /* JADX INFO: renamed from: c */
    public final EnumC2048c f8919c;

    public C2046a(Integer num, C1328s0 c1328s0, EnumC2048c enumC2048c) {
        this.f8917a = num;
        this.f8918b = c1328s0;
        this.f8919c = enumC2048c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2046a)) {
            return false;
        }
        C2046a c2046a = (C2046a) obj;
        if (this.f8917a.equals(c2046a.f8917a)) {
            return this.f8918b.equals(c2046a.f8918b) && this.f8919c.equals(c2046a.f8919c);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8917a.hashCode() ^ 1000003) * 1000003) ^ this.f8918b.hashCode()) * 1000003) ^ this.f8919c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f8917a + ", payload=" + this.f8918b + ", priority=" + this.f8919c + "}";
    }
}
