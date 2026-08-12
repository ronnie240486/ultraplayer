package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p016F1.C0192i;
import p028J1.C0296b;
import p028J1.C0313s;
import p138q1.C2173i;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1209O {

    /* JADX INFO: renamed from: i */
    public static final C0296b f5667i = new C0296b("ClientCastAnalytics", null);

    /* JADX INFO: renamed from: j */
    public static final boolean f5668j = true;

    /* JADX INFO: renamed from: a */
    public final C0192i f5669a;

    /* JADX INFO: renamed from: b */
    public final C1335u f5670b;

    /* JADX INFO: renamed from: c */
    public final BinderC1263c f5671c;

    /* JADX INFO: renamed from: e */
    public Long f5673e;

    /* JADX INFO: renamed from: g */
    public C2173i f5675g;

    /* JADX INFO: renamed from: h */
    public int f5676h = 1;

    /* JADX INFO: renamed from: d */
    public final String f5672d = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: f */
    public final ExecutorService f5674f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public C1209O(Context context, C0313s c0313s, C0192i c0192i, C1335u c1335u, BinderC1263c binderC1263c) {
        this.f5669a = c0192i;
        this.f5670b = c1335u;
        this.f5671c = binderC1263c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3180a(C1328s0 c1328s0, int i3) {
        this.f5674f.execute(new RunnableC1315p(this, c1328s0, i3, 1));
    }
}
