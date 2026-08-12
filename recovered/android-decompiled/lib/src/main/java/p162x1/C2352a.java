package p162x1;

import java.util.HashMap;
import p034L1.C0352g;
import p126n1.EnumC2048c;

/* JADX INFO: renamed from: x1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2352a {

    /* JADX INFO: renamed from: a */
    public final C0352g f9880a;

    /* JADX INFO: renamed from: b */
    public final HashMap f9881b;

    public C2352a(C0352g c0352g, HashMap map) {
        this.f9880a = c0352g;
        this.f9881b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m4947a(EnumC2048c enumC2048c, long j3, int i3) {
        long jM969D = j3 - this.f9880a.m969D();
        C2353b c2353b = (C2353b) this.f9881b.get(enumC2048c);
        long j4 = c2353b.f9882a;
        int i4 = i3 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i4) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j4 > 1 ? j4 : 2L) * ((long) i4)))), jM969D), c2353b.f9883b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2352a)) {
            return false;
        }
        C2352a c2352a = (C2352a) obj;
        return this.f9880a.equals(c2352a.f9880a) && this.f9881b.equals(c2352a.f9881b);
    }

    public final int hashCode() {
        return ((this.f9880a.hashCode() ^ 1000003) * 1000003) ^ this.f9881b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f9880a + ", values=" + this.f9881b + "}";
    }
}
