package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p053S0.C0536b;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: androidx.emoji2.text.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0920j extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ AbstractC0610a f4014n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ThreadPoolExecutor f4015o;

    public C0920j(AbstractC0610a abstractC0610a, ThreadPoolExecutor threadPoolExecutor) {
        this.f4014n = abstractC0610a;
        this.f4015o = threadPoolExecutor;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: A */
    public final void mo1524A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4015o;
        try {
            this.f4014n.mo1524A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: B */
    public final void mo1525B(C0536b c0536b) {
        ThreadPoolExecutor threadPoolExecutor = this.f4015o;
        try {
            this.f4014n.mo1525B(c0536b);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
