package p085c0;

import android.os.Handler;
import java.util.concurrent.Executor;
import p089d1.HandlerC1430c;

/* JADX INFO: renamed from: c0.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1148x implements Executor {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5336g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Handler f5337h;

    public /* synthetic */ ExecutorC1148x(Handler handler, int i3) {
        this.f5336g = i3;
        this.f5337h = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5336g) {
            case 0:
                this.f5337h.post(runnable);
                break;
            default:
                ((HandlerC1430c) this.f5337h).post(runnable);
                break;
        }
    }
}
