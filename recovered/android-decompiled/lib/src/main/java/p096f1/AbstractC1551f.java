package p096f1;

import android.view.Choreographer;

/* JADX INFO: renamed from: f1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1551f {
    /* JADX INFO: renamed from: a */
    public static void m3870a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: f1.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                runnable.run();
            }
        });
    }
}
