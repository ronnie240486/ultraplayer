package p105h2;

import java.io.Serializable;
import p048Q0.C0505d;

/* JADX INFO: renamed from: h2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1728v extends AbstractC1691W implements Serializable {

    /* JADX INFO: renamed from: g */
    public final C0505d f7718g;

    public C1728v(C0505d c0505d) {
        this.f7718g = c0505d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f7718g.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1728v) {
            return this.f7718g.equals(((C1728v) obj).f7718g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7718g.hashCode();
    }

    public final String toString() {
        return this.f7718g.toString();
    }
}
