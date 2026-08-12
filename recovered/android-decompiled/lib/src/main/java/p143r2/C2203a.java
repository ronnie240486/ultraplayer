package p143r2;

import java.io.Serializable;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: r2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2203a implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Object f9491g;

    /* JADX INFO: renamed from: h */
    public final Object f9492h;

    public C2203a(Object obj, Object obj2) {
        this.f9491g = obj;
        this.f9492h = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2203a)) {
            return false;
        }
        C2203a c2203a = (C2203a) obj;
        return AbstractC2364c.m4950a(this.f9491g, c2203a.f9491g) && AbstractC2364c.m4950a(this.f9492h, c2203a.f9492h);
    }

    public final int hashCode() {
        Object obj = this.f9491g;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9492h;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f9491g + ", " + this.f9492h + ')';
    }
}
