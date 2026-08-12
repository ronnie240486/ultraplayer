package p105h2;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: h2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1707g extends C1713j implements NavigableSet {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1688T f7675j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707g(C1688T c1688t, NavigableMap navigableMap) {
        super(c1688t, navigableMap);
        this.f7675j = c1688t;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo4146e().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C1703e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C1707g(this.f7675j, mo4146e().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo4146e().floorKey(obj);
    }

    @Override // p105h2.C1713j
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo4146e() {
        return (NavigableMap) ((SortedMap) this.f7669g);
    }

    @Override // p105h2.C1713j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo4146e().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo4146e().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C1699c c1699c = (C1699c) iterator();
        if (!c1699c.hasNext()) {
            return null;
        }
        Object next = c1699c.next();
        c1699c.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // p105h2.C1713j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p105h2.C1713j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        return new C1707g(this.f7675j, mo4146e().headMap(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z3, Object obj2, boolean z4) {
        return new C1707g(this.f7675j, mo4146e().subMap(obj, z3, obj2, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        return new C1707g(this.f7675j, mo4146e().tailMap(obj, z3));
    }
}
