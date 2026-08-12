package p105h2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p101g2.InterfaceC1584e;

/* JADX INFO: renamed from: h2.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C1708g0 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: g */
    public final Set f7676g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1584e f7677h;

    public C1708g0(Set set, InterfaceC1584e interfaceC1584e) {
        this.f7676g = set;
        this.f7677h = interfaceC1584e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f7677h.apply(obj)) {
            return this.f7676g.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f7677h.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f7676g.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f7676g;
        boolean z3 = set instanceof RandomAccess;
        InterfaceC1584e interfaceC1584e = this.f7677h;
        if (!z3 || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC1584e.getClass();
            while (it.hasNext()) {
                if (interfaceC1584e.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC1584e.getClass();
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            if (!interfaceC1584e.apply(obj)) {
                if (i4 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC1723q.m4163l(list, interfaceC1584e, i3, i4);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC1723q.m4163l(list, interfaceC1584e, i3, i4);
                        return;
                    }
                }
                i3++;
            }
        }
        list.subList(i3, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f7676g;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f7677h.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC1723q.m4156e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1723q.m4159h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f7676g.iterator();
        InterfaceC1584e interfaceC1584e = this.f7677h;
        if (interfaceC1584e == null) {
            throw new NullPointerException("predicate");
        }
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (interfaceC1584e.apply(it.next())) {
                break;
            }
            i3++;
        }
        return true ^ (i3 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f7676g.iterator();
        it.getClass();
        InterfaceC1584e interfaceC1584e = this.f7677h;
        interfaceC1584e.getClass();
        return new C1680K(it, interfaceC1584e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f7676g.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f7676g.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7677h.apply(next) && collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f7676g.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7677h.apply(next) && !collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f7676g.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (this.f7677h.apply(it.next())) {
                i3++;
            }
        }
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C1680K c1680k = (C1680K) it;
            if (!c1680k.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c1680k.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C1680K c1680k = (C1680K) it;
            if (c1680k.hasNext()) {
                arrayList.add(c1680k.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
