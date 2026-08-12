package p124n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: n.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2015b implements Set {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2018e f8760g;

    public C2015b(C2018e c2018e) {
        this.f8760g = c2018e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8760g.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8760g.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C2018e c2018e = this.f8760g;
        c2018e.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c2018e.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2018e c2018e = this.f8760g;
        int iHashCode = 0;
        for (int i3 = c2018e.f8791i - 1; i3 >= 0; i3--) {
            Object objM4590g = c2018e.m4590g(i3);
            iHashCode += objM4590g == null ? 0 : objM4590g.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8760g.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2014a(this.f8760g, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2018e c2018e = this.f8760g;
        int iM4587d = c2018e.m4587d(obj);
        if (iM4587d < 0) {
            return false;
        }
        c2018e.m4591h(iM4587d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2018e c2018e = this.f8760g;
        int i3 = c2018e.f8791i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c2018e.remove(it.next());
        }
        return i3 != c2018e.f8791i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2018e c2018e = this.f8760g;
        int i3 = c2018e.f8791i;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(c2018e.m4590g(i4))) {
                c2018e.m4591h(i4);
            }
        }
        return i3 != c2018e.f8791i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8760g.f8791i;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2018e c2018e = this.f8760g;
        int i3 = c2018e.f8791i;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c2018e.m4590g(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8760g.m4571j(0, objArr);
    }
}
