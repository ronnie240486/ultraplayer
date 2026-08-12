package com.google.android.gms.internal.cast;

import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1197L extends AbstractC1181H {

    /* JADX INFO: renamed from: k */
    public static final C1197L f5651k = new C1197L(0, new Object[0]);

    /* JADX INFO: renamed from: i */
    public final transient Object[] f5652i;

    /* JADX INFO: renamed from: j */
    public final transient int f5653j;

    public C1197L(int i3, Object[] objArr) {
        this.f5652i = objArr;
        this.f5653j = i3;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1181H, com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: e */
    public final int mo3126e(Object[] objArr) {
        Object[] objArr2 = this.f5652i;
        int i3 = this.f5653j;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: g */
    public final int mo3127g() {
        return this.f5653j;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0610a.m1498M(i3, this.f5653j);
        Object obj = this.f5652i[i3];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: h */
    public final int mo3128h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: i */
    public final Object[] mo3129i() {
        return this.f5652i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5653j;
    }
}
