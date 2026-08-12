package p055T;

import java.util.Collections;
import java.util.List;
import p064W.AbstractC0632A;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: T.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0560X {

    /* JADX INFO: renamed from: a */
    public final C0559W f1997a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1676G f1998b;

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
    }

    public C0560X(C0559W c0559w, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c0559w.f1992a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f1997a = c0559w;
        this.f1998b = AbstractC1676G.m4117n(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0560X.class == obj.getClass()) {
            C0560X c0560x = (C0560X) obj;
            if (this.f1997a.equals(c0560x.f1997a) && this.f1998b.equals(c0560x.f1998b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1998b.hashCode() * 31) + this.f1997a.hashCode();
    }
}
