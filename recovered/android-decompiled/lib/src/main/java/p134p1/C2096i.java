package p134p1;

import java.util.ArrayList;

/* JADX INFO: renamed from: p1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2096i extends AbstractC2102o {

    /* JADX INFO: renamed from: a */
    public final ArrayList f9115a;

    public C2096i(ArrayList arrayList) {
        this.f9115a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2102o)) {
            return false;
        }
        return this.f9115a.equals(((C2096i) ((AbstractC2102o) obj)).f9115a);
    }

    public final int hashCode() {
        return this.f9115a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f9115a + "}";
    }
}
