package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1201M extends AbstractC1181H {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1205N f5659i;

    public C1201M(C1205N c1205n) {
        this.f5659i = c1205n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        C1205N c1205n = this.f5659i;
        AbstractC0610a.m1498M(i3, c1205n.f5663l);
        int i4 = i3 + i3;
        Object[] objArr = c1205n.f5662k;
        Object obj = objArr[i4];
        obj.getClass();
        Object obj2 = objArr[i4 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5659i.f5663l;
    }
}
