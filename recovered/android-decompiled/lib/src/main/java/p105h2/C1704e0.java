package p105h2;

import java.io.Serializable;

/* JADX INFO: renamed from: h2.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1704e0 extends AbstractC1691W implements Serializable {

    /* JADX INFO: renamed from: g */
    public final AbstractC1691W f7671g;

    public C1704e0(AbstractC1691W abstractC1691W) {
        this.f7671g = abstractC1691W;
    }

    @Override // p105h2.AbstractC1691W
    /* JADX INFO: renamed from: a */
    public final AbstractC1691W mo4136a() {
        return this.f7671g;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f7671g.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1704e0) {
            return this.f7671g.equals(((C1704e0) obj).f7671g);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f7671g.hashCode();
    }

    public final String toString() {
        return this.f7671g + ".reverse()";
    }
}
