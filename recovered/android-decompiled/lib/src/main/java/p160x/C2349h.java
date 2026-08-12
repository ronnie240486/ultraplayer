package p160x;

import android.os.Process;

/* JADX INFO: renamed from: x.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2349h extends Thread {

    /* JADX INFO: renamed from: g */
    public final int f9865g;

    public C2349h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f9865g = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f9865g);
        super.run();
    }
}
