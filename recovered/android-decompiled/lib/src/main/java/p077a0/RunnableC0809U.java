package p077a0;

import android.util.Pair;
import p082b0.C1064e;
import p114k0.C1907A;

/* JADX INFO: renamed from: a0.U */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0809U implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3388g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0812X f3389h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Pair f3390i;

    public /* synthetic */ RunnableC0809U(C0812X c0812x, Pair pair, int i3) {
        this.f3388g = i3;
        this.f3389h = c0812x;
        this.f3390i = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3388g) {
            case 0:
                C1064e c1064e = this.f3389h.f3403h.f3422h;
                Pair pair = this.f3390i;
                c1064e.mo2042p(((Integer) pair.first).intValue(), (C1907A) pair.second);
                break;
            case 1:
                C1064e c1064e2 = this.f3389h.f3403h.f3422h;
                Pair pair2 = this.f3390i;
                c1064e2.mo2046z(((Integer) pair2.first).intValue(), (C1907A) pair2.second);
                break;
            default:
                C1064e c1064e3 = this.f3389h.f3403h.f3422h;
                Pair pair3 = this.f3390i;
                c1064e3.mo2040l(((Integer) pair3.first).intValue(), (C1907A) pair3.second);
                break;
        }
    }
}
