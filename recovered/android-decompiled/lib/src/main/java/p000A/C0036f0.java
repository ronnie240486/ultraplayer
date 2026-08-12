package p000A;

import android.view.WindowInsets;
import p148t.C2264c;

/* JADX INFO: renamed from: A.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C0036f0 extends AbstractC0040h0 {

    /* JADX INFO: renamed from: a */
    public final WindowInsets.Builder f51a;

    public C0036f0() {
        this.f51a = AbstractC0034e0.m192f();
    }

    @Override // p000A.AbstractC0040h0
    /* JADX INFO: renamed from: b */
    public C0056p0 mo180b() {
        m213a();
        C0056p0 c0056p0M316c = C0056p0.m316c(this.f51a.build(), null);
        c0056p0M316c.f81a.mo221k(null);
        return c0056p0M316c;
    }

    @Override // p000A.AbstractC0040h0
    /* JADX INFO: renamed from: c */
    public void mo181c(C2264c c2264c) {
        this.f51a.setStableInsets(c2264c.m4863b());
    }

    @Override // p000A.AbstractC0040h0
    /* JADX INFO: renamed from: d */
    public void mo182d(C2264c c2264c) {
        this.f51a.setSystemWindowInsets(c2264c.m4863b());
    }

    public C0036f0(C0056p0 c0056p0) {
        WindowInsets.Builder builderM192f;
        super(c0056p0);
        WindowInsets windowInsetsM317b = c0056p0.m317b();
        if (windowInsetsM317b != null) {
            builderM192f = AbstractC0034e0.m193g(windowInsetsM317b);
        } else {
            builderM192f = AbstractC0034e0.m192f();
        }
        this.f51a = builderM192f;
    }
}
