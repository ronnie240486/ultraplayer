package p003B;

import android.media.MediaCodec;
import android.os.Build;
import com.google.android.gms.internal.cast.C1203M1;
import com.google.android.gms.internal.cast.ScheduledExecutorServiceC1219Q1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: B.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0080b {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern m366d() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern m367e(int i3, int i4) {
        return new MediaCodec.CryptoInfo.Pattern(i3, i4);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m378p() {
    }

    /* JADX INFO: renamed from: x */
    public static void m386x(C1203M1 c1203m1) {
        ExecutorService executorService;
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || c1203m1 != ForkJoinPool.commonPool()) && !(zIsTerminated = (executorService = c1203m1.f5660g).isTerminated())) {
            c1203m1.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        c1203m1.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m387y(ScheduledExecutorServiceC1219Q1 scheduledExecutorServiceC1219Q1) {
        ExecutorService executorService;
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC1219Q1 != ForkJoinPool.commonPool()) && !(zIsTerminated = (executorService = scheduledExecutorServiceC1219Q1.f5660g).isTerminated())) {
            scheduledExecutorServiceC1219Q1.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        scheduledExecutorServiceC1219Q1.shutdownNow();
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
