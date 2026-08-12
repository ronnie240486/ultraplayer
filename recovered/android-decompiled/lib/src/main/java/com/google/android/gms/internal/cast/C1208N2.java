package com.google.android.gms.internal.cast;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.N2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1208N2 implements ListIterator {

    /* JADX INFO: renamed from: g */
    public final ListIterator f5666g;

    public C1208N2(C1216P2 c1216p2, int i3) {
        this.f5666g = c1216p2.f5682g.listIterator(i3);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5666g.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5666g.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f5666g.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5666g.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f5666g.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5666g.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
