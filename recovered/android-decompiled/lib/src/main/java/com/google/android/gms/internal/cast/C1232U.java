package com.google.android.gms.internal.cast;

import java.util.Iterator;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.U */
/* JADX INFO: loaded from: classes.dex */
public final class C1232U extends AbstractC1189J {

    /* JADX INFO: renamed from: j */
    public final transient Object f5712j;

    public C1232U(Object obj) {
        this.f5712j = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5712j.equals(obj);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: e */
    public final int mo3126e(Object[] objArr) {
        objArr[0] = this.f5712j;
        return 1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1189J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5712j.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C1193K(this.f5712j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0462h.m1166f("[", this.f5712j.toString(), "]");
    }
}
