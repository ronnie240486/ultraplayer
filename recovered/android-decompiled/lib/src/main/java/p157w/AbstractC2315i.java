package p157w;

import android.os.Build;
import android.os.LocaleList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: w.i */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2315i {
    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ LocaleList m4939c(Object obj) {
        return (LocaleList) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4942f(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        executorService.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
