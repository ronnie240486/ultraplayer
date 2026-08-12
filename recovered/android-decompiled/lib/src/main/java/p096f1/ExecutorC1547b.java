package p096f1;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1547b implements Executor {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7043g;

    /* JADX INFO: renamed from: a */
    private final void m3848a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7043g) {
            case 0:
                runnable.run();
                break;
        }
    }
}
