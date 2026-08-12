package p066W1;

import android.os.Process;

/* JADX INFO: renamed from: W1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0663d extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
