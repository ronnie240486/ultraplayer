package p101g2;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: g2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1585f implements InterfaceC1584e, Serializable {

    /* JADX INFO: renamed from: g */
    public final List f7187g;

    public C1585f(List list) {
        this.f7187g = list;
    }

    @Override // p101g2.InterfaceC1584e
    public final boolean apply(Object obj) {
        int i3 = 0;
        while (true) {
            List list = this.f7187g;
            if (i3 >= list.size()) {
                return true;
            }
            if (!((InterfaceC1584e) list.get(i3)).apply(obj)) {
                return false;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1585f) {
            return this.f7187g.equals(((C1585f) obj).f7187g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7187g.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z3 = true;
        for (Object obj : this.f7187g) {
            if (!z3) {
                sb.append(',');
            }
            sb.append(obj);
            z3 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
