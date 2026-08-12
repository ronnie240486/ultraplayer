package com.google.android.gms.internal.cast;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1173F extends AbstractC1236V implements ListIterator {

    /* JADX INFO: renamed from: g */
    public final int f5612g;

    /* JADX INFO: renamed from: h */
    public int f5613h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1181H f5614i;

    public C1173F(AbstractC1181H abstractC1181H, int i3) {
        int size = abstractC1181H.size();
        AbstractC0610a.m1499O(i3, size);
        this.f5612g = size;
        this.f5613h = i3;
        this.f5614i = abstractC1181H;
    }

    /* JADX INFO: renamed from: a */
    public final Object m3130a(int i3) {
        return this.f5614i.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5613h < this.f5612g;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5613h > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f5613h;
        this.f5613h = i3 + 1;
        return m3130a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5613h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f5613h - 1;
        this.f5613h = i3;
        return m3130a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5613h - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
