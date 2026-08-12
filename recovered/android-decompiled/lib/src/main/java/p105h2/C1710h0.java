package p105h2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p101g2.InterfaceC1584e;

/* JADX INFO: renamed from: h2.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1710h0 extends C1708g0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f7676g).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f7676g.iterator();
        it.getClass();
        InterfaceC1584e interfaceC1584e = this.f7677h;
        interfaceC1584e.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC1584e.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C1710h0(((SortedSet) this.f7676g).headSet(obj), this.f7677h);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f7676g;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f7677h.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C1710h0(((SortedSet) this.f7676g).subSet(obj, obj2), this.f7677h);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C1710h0(((SortedSet) this.f7676g).tailSet(obj), this.f7677h);
    }
}
