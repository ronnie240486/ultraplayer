package p088d0;

import android.os.Handler;
import androidx.activity.RunnableC0892b;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1381e implements InterfaceC1389m {

    /* JADX INFO: renamed from: g */
    public final C1387k f6150g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1384h f6151h;

    /* JADX INFO: renamed from: i */
    public boolean f6152i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1382f f6153j;

    public C1381e(C1382f c1382f, C1387k c1387k) {
        this.f6153j = c1382f;
        this.f6150g = c1387k;
    }

    @Override // p088d0.InterfaceC1389m
    /* JADX INFO: renamed from: a */
    public final void mo2829a() {
        Handler handler = this.f6153j.f6172u;
        handler.getClass();
        AbstractC0632A.m1574O(handler, new RunnableC0892b(11, this));
    }
}
