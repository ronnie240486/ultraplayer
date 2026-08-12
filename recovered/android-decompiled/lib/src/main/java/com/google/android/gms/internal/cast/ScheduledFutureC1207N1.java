package com.google.android.gms.internal.cast;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p119l2.InterfaceFutureC1992b;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.N1 */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC1207N1 extends AbstractC1303m implements ScheduledFuture, InterfaceFutureC1992b, Future {

    /* JADX INFO: renamed from: i */
    public final AbstractC1179G1 f5664i;

    /* JADX INFO: renamed from: j */
    public final ScheduledFuture f5665j;

    public ScheduledFutureC1207N1(AbstractC1179G1 abstractC1179G1, ScheduledFuture scheduledFuture) {
        super(11);
        this.f5664i = abstractC1179G1;
        this.f5665j = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean zCancel = this.f5664i.cancel(z3);
        if (zCancel) {
            this.f5665j.cancel(z3);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f5665j.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5664i.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f5665j.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5664i.f5628i instanceof C1349x1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5664i.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f5664i.get(j3, timeUnit);
    }
}
