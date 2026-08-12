package p077a0;

import android.util.Pair;
import p082b0.C1064e;
import p114k0.C1907A;
import p114k0.C1963w;

/* JADX INFO: renamed from: a0.T */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0808T implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3384g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0812X f3385h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Pair f3386i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1963w f3387j;

    public /* synthetic */ RunnableC0808T(C0812X c0812x, Pair pair, C1963w c1963w, int i3) {
        this.f3384g = i3;
        this.f3385h = c0812x;
        this.f3386i = pair;
        this.f3387j = c1963w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3384g) {
            case 0:
                C1064e c1064e = this.f3385h.f3403h.f3422h;
                Pair pair = this.f3386i;
                int iIntValue = ((Integer) pair.first).intValue();
                C1907A c1907a = (C1907A) pair.second;
                c1907a.getClass();
                c1064e.mo2044x(iIntValue, c1907a, this.f3387j);
                break;
            default:
                C1064e c1064e2 = this.f3385h.f3403h.f3422h;
                Pair pair2 = this.f3386i;
                c1064e2.mo2045y(((Integer) pair2.first).intValue(), (C1907A) pair2.second, this.f3387j);
                break;
        }
    }
}
