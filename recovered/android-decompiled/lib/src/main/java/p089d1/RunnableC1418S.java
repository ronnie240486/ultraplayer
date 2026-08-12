package p089d1;

import android.util.SparseArray;

/* JADX INFO: renamed from: d1.S */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1418S implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6268g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1419T f6269h;

    public /* synthetic */ RunnableC1418S(C1419T c1419t, int i3) {
        this.f6268g = i3;
        this.f6269h = c1419t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6268g) {
            case 0:
                SparseArray sparseArray = this.f6269h.f6277h;
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C1422W) sparseArray.valueAt(i3)).getClass();
                    C1422W.m3549a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                C1419T c1419t = this.f6269h;
                ServiceConnectionC1425Z serviceConnectionC1425Z = c1419t.f6278i;
                if (serviceConnectionC1425Z.f6305n == c1419t) {
                    serviceConnectionC1425Z.m3564k();
                }
                break;
        }
    }
}
