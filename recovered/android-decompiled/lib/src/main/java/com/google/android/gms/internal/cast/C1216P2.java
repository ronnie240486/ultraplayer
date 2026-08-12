package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.P2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1216P2 extends AbstractList implements RandomAccess, InterfaceC1318p2 {

    /* JADX INFO: renamed from: g */
    public final C1314o2 f5682g;

    public C1216P2(C1314o2 c1314o2) {
        this.f5682g = c1314o2;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1318p2
    /* JADX INFO: renamed from: b */
    public final List mo3181b() {
        return Collections.unmodifiableList(this.f5682g.f5948h);
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1318p2
    /* JADX INFO: renamed from: c */
    public final InterfaceC1318p2 mo3182c() {
        return this;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1318p2
    /* JADX INFO: renamed from: d */
    public final Object mo3183d(int i3) {
        return this.f5682g.f5948h.get(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        return this.f5682g.get(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1212O2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new C1208N2(this, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5682g.f5948h.size();
    }
}
