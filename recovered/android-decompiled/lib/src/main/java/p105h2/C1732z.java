package p105h2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: h2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1732z extends AbstractC1691W implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Comparator[] f7723g;

    public C1732z(C1722p c1722p, C1722p c1722p2) {
        this.f7723g = new Comparator[]{c1722p, c1722p2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f7723g;
            if (i3 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i3].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i3++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1732z) {
            return Arrays.equals(this.f7723g, ((C1732z) obj).f7723g);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7723g);
    }

    public final String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f7723g) + ")";
    }
}
