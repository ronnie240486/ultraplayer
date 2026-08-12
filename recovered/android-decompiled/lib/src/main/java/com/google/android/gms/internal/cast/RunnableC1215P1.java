package com.google.android.gms.internal.cast;

import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1215P1 extends AbstractC1179G1 implements Runnable {

    /* JADX INFO: renamed from: p */
    public final Runnable f5681p;

    public RunnableC1215P1(Runnable runnable) {
        super(12);
        runnable.getClass();
        this.f5681p = runnable;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1179G1
    /* JADX INFO: renamed from: e0 */
    public final String mo3136e0() {
        return AbstractC0462h.m1166f("task=[", this.f5681p.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5681p.run();
        } catch (Error | RuntimeException e3) {
            if (AbstractC1179G1.f5626n.mo1530T(this, null, new C1357z1(e3))) {
                AbstractC1179G1.m3134i0(this);
            }
            throw e3;
        }
    }
}
