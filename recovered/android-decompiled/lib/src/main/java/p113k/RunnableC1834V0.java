package p113k;

import androidx.appcompat.widget.Toolbar;
import p110j.C1774o;

/* JADX INFO: renamed from: k.V0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1834V0 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8095g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Toolbar f8096h;

    public /* synthetic */ RunnableC1834V0(Toolbar toolbar, int i3) {
        this.f8095g = i3;
        this.f8096h = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8095g) {
            case 0:
                C1840Y0 c1840y0 = this.f8096h.f3915R;
                C1774o c1774o = c1840y0 == null ? null : c1840y0.f8112h;
                if (c1774o != null) {
                    c1774o.collapseActionView();
                }
                break;
            default:
                this.f8096h.m2352m();
                break;
        }
    }
}
