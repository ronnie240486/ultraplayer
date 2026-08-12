package p055T;

import java.util.Objects;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0585q {

    /* JADX INFO: renamed from: a */
    public final String f2168a;

    /* JADX INFO: renamed from: b */
    public final String f2169b;

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
    }

    public C0585q(String str, String str2) {
        this.f2168a = AbstractC0632A.m1572M(str);
        this.f2169b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0585q.class == obj.getClass()) {
            C0585q c0585q = (C0585q) obj;
            if (Objects.equals(this.f2168a, c0585q.f2168a) && Objects.equals(this.f2169b, c0585q.f2169b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2169b.hashCode() * 31;
        String str = this.f2168a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
