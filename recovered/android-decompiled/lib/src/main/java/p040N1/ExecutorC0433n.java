package p040N1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import p014F.RunnableC0153b;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: N1.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0433n implements Executor {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1465g;

    /* JADX INFO: renamed from: h */
    public final Object f1466h;

    public /* synthetic */ ExecutorC0433n(int i3, Object obj) {
        this.f1465g = i3;
        this.f1466h = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1465g) {
            case 0:
                ((HandlerC0784e) this.f1466h).post(runnable);
                return;
            case 1:
                ((HandlerC0784e) this.f1466h).post(runnable);
                return;
            case 2:
                ((ExecutorService) this.f1466h).execute(new RunnableC0153b(21, runnable));
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f1466h;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC0433n() {
        this.f1465g = 1;
        HandlerC0784e handlerC0784e = new HandlerC0784e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1466h = handlerC0784e;
    }
}
