package p091e;

import android.view.ViewGroup;
import p000A.AbstractC0016Q;
import p000A.C0026a0;

/* JADX INFO: renamed from: e.r */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1487r implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6629g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LayoutInflaterFactory2C1458C f6630h;

    public /* synthetic */ RunnableC1487r(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C, int i3) {
        this.f6629g = i3;
        this.f6630h = layoutInflaterFactory2C1458C;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f6629g) {
            case 0:
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6630h;
                if ((layoutInflaterFactory2C1458C.f6478g0 & 1) != 0) {
                    layoutInflaterFactory2C1458C.m3669u(0);
                }
                if ((layoutInflaterFactory2C1458C.f6478g0 & 4096) != 0) {
                    layoutInflaterFactory2C1458C.m3669u(108);
                }
                layoutInflaterFactory2C1458C.f6477f0 = false;
                layoutInflaterFactory2C1458C.f6478g0 = 0;
                break;
            default:
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C2 = this.f6630h;
                layoutInflaterFactory2C1458C2.f6448C.showAtLocation(layoutInflaterFactory2C1458C2.f6447B, 55, 0, 0);
                C0026a0 c0026a0 = layoutInflaterFactory2C1458C2.f6450E;
                if (c0026a0 != null) {
                    c0026a0.m105b();
                }
                if (!(layoutInflaterFactory2C1458C2.f6452G && (viewGroup = layoutInflaterFactory2C1458C2.f6453H) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C1458C2.f6447B.setAlpha(1.0f);
                    layoutInflaterFactory2C1458C2.f6447B.setVisibility(0);
                } else {
                    layoutInflaterFactory2C1458C2.f6447B.setAlpha(0.0f);
                    C0026a0 c0026a0M79a = AbstractC0016Q.m79a(layoutInflaterFactory2C1458C2.f6447B);
                    c0026a0M79a.m104a(1.0f);
                    layoutInflaterFactory2C1458C2.f6450E = c0026a0M79a;
                    c0026a0M79a.m107d(new C1489t(0, this));
                }
                break;
        }
    }
}
