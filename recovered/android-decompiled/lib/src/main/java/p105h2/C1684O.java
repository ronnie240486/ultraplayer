package p105h2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p101g2.InterfaceC1583d;

/* JADX INFO: renamed from: h2.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1684O extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: g */
    public final AbstractCollection f7618g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1583d f7619h;

    /* JADX WARN: Multi-variable type inference failed */
    public C1684O(List list, InterfaceC1583d interfaceC1583d) {
        list.getClass();
        this.f7618g = (AbstractCollection) list;
        this.f7619h = interfaceC1583d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        return this.f7619h.apply(this.f7618g.get(i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7618g.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new C1683N(this, this.f7618g.listIterator(i3), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        return this.f7619h.apply(this.f7618g.remove(i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        this.f7618g.subList(i3, i4).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7618g.size();
    }
}
