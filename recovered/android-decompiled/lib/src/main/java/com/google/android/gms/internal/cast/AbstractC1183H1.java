package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.H1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1183H1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3144a(Unsafe unsafe, AbstractC1179G1 abstractC1179G1, long j3, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1179G1, j3, obj, obj2)) {
            if (unsafe.getObject(abstractC1179G1, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
