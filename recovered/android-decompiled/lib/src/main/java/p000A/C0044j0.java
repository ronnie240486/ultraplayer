package p000A;

import android.view.WindowInsets;
import p148t.C2264c;

/* JADX INFO: renamed from: A.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C0044j0 extends AbstractC0042i0 {

    /* JADX INFO: renamed from: k */
    public C2264c f70k;

    public C0044j0(C0056p0 c0056p0, WindowInsets windowInsets) {
        super(c0056p0, windowInsets);
        this.f70k = null;
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: b */
    public C0056p0 mo224b() {
        return C0056p0.m316c(this.f59c.consumeStableInsets(), null);
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: c */
    public C0056p0 mo225c() {
        return C0056p0.m316c(this.f59c.consumeSystemWindowInsets(), null);
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: f */
    public final C2264c mo226f() {
        if (this.f70k == null) {
            WindowInsets windowInsets = this.f59c;
            this.f70k = C2264c.m4862a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f70k;
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: i */
    public boolean mo227i() {
        return this.f59c.isConsumed();
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: m */
    public void mo228m(C2264c c2264c) {
        this.f70k = c2264c;
    }
}
