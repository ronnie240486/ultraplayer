package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;
import p067X.C0679k;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1259b {

    /* JADX INFO: renamed from: a */
    public final long f5792a;

    /* JADX INFO: renamed from: b */
    public long f5793b;

    /* JADX INFO: renamed from: c */
    public long f5794c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f5795d;

    /* JADX INFO: renamed from: e */
    public final int f5796e;

    public C1259b(C0679k c0679k) {
        this.f5796e = c0679k.f2594a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f5792a = jCurrentTimeMillis;
        this.f5793b = jCurrentTimeMillis;
        this.f5795d = new AtomicInteger(1);
    }
}
