package p105h2;

import java.io.Serializable;

/* JADX INFO: renamed from: h2.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1690V extends AbstractC1691W implements Serializable {

    /* JADX INFO: renamed from: h */
    public static final C1690V f7626h = new C1690V(0);

    /* JADX INFO: renamed from: i */
    public static final C1690V f7627i = new C1690V(1);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7628g;

    public /* synthetic */ C1690V(int i3) {
        this.f7628g = i3;
    }

    @Override // p105h2.AbstractC1691W
    /* JADX INFO: renamed from: a */
    public final AbstractC1691W mo4136a() {
        switch (this.f7628g) {
            case 0:
                return f7627i;
            default:
                return f7626h;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7628g) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f7628g) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
