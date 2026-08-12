package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p016F1.AbstractBinderC0196m;
import p028J1.C0296b;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.c */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1263c extends AbstractBinderC0196m {

    /* JADX INFO: renamed from: f */
    public static final C0296b f5807f = new C0296b("AppVisibilityProxy", null);

    /* JADX INFO: renamed from: g */
    public static final int f5808g = 1;

    /* JADX INFO: renamed from: d */
    public final Set f5809d;

    /* JADX INFO: renamed from: e */
    public int f5810e;

    public BinderC1263c() {
        super(0, "com.google.android.gms.cast.framework.IAppVisibilityListener");
        this.f5809d = Collections.synchronizedSet(new HashSet());
        this.f5810e = f5808g;
    }
}
