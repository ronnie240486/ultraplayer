package p091e;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: e.p */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1485p implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
