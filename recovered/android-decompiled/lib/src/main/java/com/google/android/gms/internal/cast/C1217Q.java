package com.google.android.gms.internal.cast;

import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1217Q extends AbstractC1181H {

    /* JADX INFO: renamed from: i */
    public final transient Object[] f5683i;

    /* JADX INFO: renamed from: j */
    public final transient int f5684j;

    /* JADX INFO: renamed from: k */
    public final transient int f5685k;

    public C1217Q(Object[] objArr, int i3, int i4) {
        this.f5683i = objArr;
        this.f5684j = i3;
        this.f5685k = i4;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0610a.m1498M(i3, this.f5685k);
        Object obj = this.f5683i[i3 + i3 + this.f5684j];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5685k;
    }
}
