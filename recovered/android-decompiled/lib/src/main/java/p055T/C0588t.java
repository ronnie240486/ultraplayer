package p055T;

import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.t */
/* JADX INFO: loaded from: classes.dex */
public class C0588t {

    /* JADX INFO: renamed from: a */
    public final long f2182a;

    static {
        new C0588t(new C0587s());
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(2);
        AbstractC0632A.m1566G(3);
        AbstractC0632A.m1566G(4);
        AbstractC0632A.m1566G(5);
        AbstractC0632A.m1566G(6);
    }

    public C0588t(C0587s c0587s) {
        c0587s.getClass();
        int i3 = AbstractC0632A.f2454a;
        this.f2182a = c0587s.f2181a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0588t)) {
            return false;
        }
        C0588t c0588t = (C0588t) obj;
        c0588t.getClass();
        return this.f2182a == c0588t.f2182a;
    }

    public final int hashCode() {
        long j3 = this.f2182a;
        return ((((int) 0) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 29791;
    }
}
