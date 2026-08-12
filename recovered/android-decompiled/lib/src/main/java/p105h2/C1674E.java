package p105h2;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: h2.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1674E extends AbstractC1718l0 implements ListIterator {

    /* JADX INFO: renamed from: g */
    public final int f7595g;

    /* JADX INFO: renamed from: h */
    public int f7596h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1676G f7597i;

    public C1674E(AbstractC1676G abstractC1676G, int i3) {
        int size = abstractC1676G.size();
        AbstractC0230e.m731i(i3, size);
        this.f7595g = size;
        this.f7596h = i3;
        this.f7597i = abstractC1676G;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4113a(int i3) {
        return this.f7597i.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7596h < this.f7595g;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7596h > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f7596h;
        this.f7596h = i3 + 1;
        return m4113a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7596h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f7596h - 1;
        this.f7596h = i3;
        return m4113a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7596h - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
