package p105h2;

import java.io.Serializable;
import java.util.Arrays;
import p101g2.InterfaceC1583d;

/* JADX INFO: renamed from: h2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1722p extends AbstractC1691W implements Serializable {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1583d f7695g;

    /* JADX INFO: renamed from: h */
    public final AbstractC1691W f7696h;

    public C1722p(InterfaceC1583d interfaceC1583d, AbstractC1691W abstractC1691W) {
        this.f7695g = interfaceC1583d;
        this.f7696h = abstractC1691W;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC1583d interfaceC1583d = this.f7695g;
        return this.f7696h.compare(interfaceC1583d.apply(obj), interfaceC1583d.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1722p) {
            C1722p c1722p = (C1722p) obj;
            if (this.f7695g.equals(c1722p.f7695g) && this.f7696h.equals(c1722p.f7696h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7695g, this.f7696h});
    }

    public final String toString() {
        return this.f7696h + ".onResultOf(" + this.f7695g + ")";
    }
}
