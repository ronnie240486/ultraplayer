package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p003B.AbstractC0080b;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.Q1 */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC1219Q1 extends C1203M1 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f5686h;

    public ScheduledExecutorServiceC1219Q1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f5686h = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.cast.C1203M1, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC0080b.m387y(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        RunnableFutureC1226S1 runnableFutureC1226S1 = new RunnableFutureC1226S1(Executors.callable(runnable, null));
        return new ScheduledFutureC1207N1(runnableFutureC1226S1, this.f5686h.schedule(runnableFutureC1226S1, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        RunnableC1215P1 runnableC1215P1 = new RunnableC1215P1(runnable);
        return new ScheduledFutureC1207N1(runnableC1215P1, this.f5686h.scheduleAtFixedRate(runnableC1215P1, j3, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        RunnableC1215P1 runnableC1215P1 = new RunnableC1215P1(runnable);
        return new ScheduledFutureC1207N1(runnableC1215P1, this.f5686h.scheduleWithFixedDelay(runnableC1215P1, j3, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        RunnableFutureC1226S1 runnableFutureC1226S1 = new RunnableFutureC1226S1(callable);
        return new ScheduledFutureC1207N1(runnableFutureC1226S1, this.f5686h.schedule(runnableFutureC1226S1, j3, timeUnit));
    }
}
