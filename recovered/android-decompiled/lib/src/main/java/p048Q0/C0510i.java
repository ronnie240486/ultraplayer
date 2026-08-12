package p048Q0;

import p045P0.C0461g;

/* JADX INFO: renamed from: Q0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0510i extends C0461g implements Comparable {

    /* JADX INFO: renamed from: q */
    public long f1745q;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0510i c0510i = (C0510i) obj;
        if (m1787c(4) != c0510i.m1787c(4)) {
            return m1787c(4) ? 1 : -1;
        }
        long j3 = this.f3146m - c0510i.f3146m;
        if (j3 == 0) {
            j3 = this.f1745q - c0510i.f1745q;
            if (j3 == 0) {
                return 0;
            }
        }
        return j3 > 0 ? 1 : -1;
    }
}
