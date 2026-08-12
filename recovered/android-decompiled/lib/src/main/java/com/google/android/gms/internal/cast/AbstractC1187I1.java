package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.I1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1187I1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3146a(Unsafe unsafe, AbstractC1179G1 abstractC1179G1, long j3, Object obj, Object obj2) {
        while (!AbstractC1183H1.m3144a(unsafe, abstractC1179G1, j3, obj, obj2)) {
            if (unsafe.getObject(abstractC1179G1, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
