package p073Z;

import p099g0.C1572b;

/* JADX INFO: renamed from: Z.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0773h extends Thread {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1572b f3151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0773h(C1572b c1572b) {
        super("ExoPlayer:SimpleDecoder");
        this.f3151g = c1572b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e3) {
                throw new IllegalStateException(e3);
            }
        } while (this.f3151g.m3906i());
    }
}
