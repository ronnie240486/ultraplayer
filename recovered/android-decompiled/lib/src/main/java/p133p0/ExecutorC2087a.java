package p133p0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p082b0.C1063d;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2087a implements Executor {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ExecutorService f9064g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1063d f9065h;

    public ExecutorC2087a(ExecutorService executorService, C1063d c1063d) {
        this.f9064g = executorService;
        this.f9065h = c1063d;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9064g.execute(runnable);
    }
}
