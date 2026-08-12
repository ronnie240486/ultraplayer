package p105h2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p101g2.InterfaceC1583d;

/* JADX INFO: renamed from: h2.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1685P extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: g */
    public final AbstractCollection f7620g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1583d f7621h;

    /* JADX WARN: Multi-variable type inference failed */
    public C1685P(List list, InterfaceC1583d interfaceC1583d) {
        list.getClass();
        this.f7620g = (AbstractCollection) list;
        this.f7621h = interfaceC1583d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7620g.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new C1683N(this, this.f7620g.listIterator(i3), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        this.f7620g.subList(i3, i4).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7620g.size();
    }
}
