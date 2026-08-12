package p089d1;

import java.util.ArrayList;

/* JADX INFO: renamed from: d1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1428b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1433f f6316a;

    public /* synthetic */ C1428b(C1433f c1433f) {
        this.f6316a = c1433f;
    }

    /* JADX INFO: renamed from: a */
    public void m3570a(AbstractC1446s abstractC1446s, C1442o c1442o, ArrayList arrayList) {
        C1433f c1433f = this.f6316a;
        if (abstractC1446s != c1433f.f6354y || c1442o == null) {
            if (abstractC1446s == c1433f.f6334e) {
                if (c1442o != null) {
                    c1433f.m3586n(c1433f.f6333d, c1442o);
                }
                c1433f.f6333d.m3504n(arrayList);
                return;
            }
            return;
        }
        C1402B c1402b = c1433f.f6353x.f6216a;
        String strM3610d = c1442o.m3610d();
        C1403C c1403c = new C1403C(c1402b, strM3610d, c1433f.m3574b(c1402b, strM3610d), false);
        c1403c.m3499i(c1442o);
        if (c1433f.f6333d == c1403c) {
            return;
        }
        c1433f.m3580h(c1433f, c1403c, c1433f.f6354y, 3, c1433f.f6353x, arrayList);
        c1433f.f6353x = null;
        c1433f.f6354y = null;
    }
}
