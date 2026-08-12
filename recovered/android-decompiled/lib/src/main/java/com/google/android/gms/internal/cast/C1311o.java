package com.google.android.gms.internal.cast;

import android.os.Looper;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1311o {

    /* JADX INFO: renamed from: c */
    public static final C0296b f5945c = new C0296b("MediaRouterOPTListener", null);

    /* JADX INFO: renamed from: a */
    public final C1335u f5946a;

    /* JADX INFO: renamed from: b */
    public final HandlerC0784e f5947b;

    public C1311o(C1335u c1335u) {
        AbstractC0491s.m1213e(c1335u);
        this.f5946a = c1335u;
        this.f5947b = new HandlerC0784e(Looper.getMainLooper(), 3);
    }
}
