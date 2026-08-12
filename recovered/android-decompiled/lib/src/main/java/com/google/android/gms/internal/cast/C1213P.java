package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1213P extends AbstractC1189J {

    /* JADX INFO: renamed from: j */
    public final transient C1224S f5679j;

    /* JADX INFO: renamed from: k */
    public final transient C1217Q f5680k;

    public C1213P(C1224S c1224s, C1217Q c1217q) {
        this.f5679j = c1224s;
        this.f5680k = c1217q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5679j.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: e */
    public final int mo3126e(Object[] objArr) {
        return this.f5680k.mo3126e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5680k.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5679j.f5697l;
    }
}
