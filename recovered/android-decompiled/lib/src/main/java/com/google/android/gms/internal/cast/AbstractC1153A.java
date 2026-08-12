package com.google.android.gms.internal.cast;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153A {

    /* JADX INFO: renamed from: a */
    public static final int f5540a;

    static {
        f5540a = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }
}
