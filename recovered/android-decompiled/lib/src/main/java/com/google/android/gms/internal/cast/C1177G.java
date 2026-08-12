package com.google.android.gms.internal.cast;

import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1177G extends AbstractC1181H {

    /* JADX INFO: renamed from: i */
    public final transient int f5621i;

    /* JADX INFO: renamed from: j */
    public final transient int f5622j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC1181H f5623k;

    public C1177G(AbstractC1181H abstractC1181H, int i3, int i4) {
        this.f5623k = abstractC1181H;
        this.f5621i = i3;
        this.f5622j = i4;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: g */
    public final int mo3127g() {
        return this.f5623k.mo3128h() + this.f5621i + this.f5622j;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0610a.m1498M(i3, this.f5622j);
        return this.f5623k.get(i3 + this.f5621i);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: h */
    public final int mo3128h() {
        return this.f5623k.mo3128h() + this.f5621i;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: i */
    public final Object[] mo3129i() {
        return this.f5623k.mo3129i();
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1181H, java.util.List
    /* JADX INFO: renamed from: j */
    public final AbstractC1181H subList(int i3, int i4) {
        AbstractC0610a.m1500Q(i3, i4, this.f5622j);
        int i5 = this.f5621i;
        return this.f5623k.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5622j;
    }
}
