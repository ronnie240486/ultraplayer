package p105h2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: h2.l */
/* JADX INFO: loaded from: classes.dex */
public class C1717l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: g */
    public final Object f7684g;

    /* JADX INFO: renamed from: h */
    public Collection f7685h;

    /* JADX INFO: renamed from: i */
    public final C1717l f7686i;

    /* JADX INFO: renamed from: j */
    public final Collection f7687j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1688T f7688k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1688T f7689l;

    public C1717l(C1688T c1688t, Object obj, List list, C1717l c1717l) {
        this.f7689l = c1688t;
        this.f7688k = c1688t;
        this.f7684g = obj;
        this.f7685h = list;
        this.f7686i = c1717l;
        this.f7687j = c1717l == null ? null : c1717l.f7685h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4150g();
        boolean zIsEmpty = this.f7685h.isEmpty();
        boolean zAdd = this.f7685h.add(obj);
        if (zAdd) {
            this.f7688k.f7624k++;
            if (zIsEmpty) {
                m4149e();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f7685h.addAll(collection);
        if (zAddAll) {
            this.f7688k.f7624k += this.f7685h.size() - size;
            if (size == 0) {
                m4149e();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f7685h.clear();
        this.f7688k.f7624k -= size;
        m4151h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m4150g();
        return this.f7685h.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m4150g();
        return this.f7685h.containsAll(collection);
    }

    /* JADX INFO: renamed from: e */
    public final void m4149e() {
        C1717l c1717l = this.f7686i;
        if (c1717l != null) {
            c1717l.m4149e();
        } else {
            this.f7688k.f7623j.put(this.f7684g, this.f7685h);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m4150g();
        return this.f7685h.equals(obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m4150g() {
        Collection collection;
        C1717l c1717l = this.f7686i;
        if (c1717l != null) {
            c1717l.m4150g();
            if (c1717l.f7685h != this.f7687j) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f7685h.isEmpty() || (collection = (Collection) this.f7688k.f7623j.get(this.f7684g)) == null) {
                return;
            }
            this.f7685h = collection;
        }
    }

    @Override // java.util.List
    public final Object get(int i3) {
        m4150g();
        return ((List) this.f7685h).get(i3);
    }

    /* JADX INFO: renamed from: h */
    public final void m4151h() {
        C1717l c1717l = this.f7686i;
        if (c1717l != null) {
            c1717l.m4151h();
        } else if (this.f7685h.isEmpty()) {
            this.f7688k.f7623j.remove(this.f7684g);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m4150g();
        return this.f7685h.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m4150g();
        return ((List) this.f7685h).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m4150g();
        return new C1699c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m4150g();
        return ((List) this.f7685h).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m4150g();
        return new C1715k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m4150g();
        boolean zRemove = this.f7685h.remove(obj);
        if (zRemove) {
            this.f7688k.f7624k--;
            m4151h();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f7685h.removeAll(collection);
        if (zRemoveAll) {
            this.f7688k.f7624k += this.f7685h.size() - size;
            m4151h();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f7685h.retainAll(collection);
        if (zRetainAll) {
            this.f7688k.f7624k += this.f7685h.size() - size;
            m4151h();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        m4150g();
        return ((List) this.f7685h).set(i3, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m4150g();
        return this.f7685h.size();
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        m4150g();
        List listSubList = ((List) this.f7685h).subList(i3, i4);
        C1717l c1717l = this.f7686i;
        if (c1717l == null) {
            c1717l = this;
        }
        C1688T c1688t = this.f7689l;
        c1688t.getClass();
        boolean z3 = listSubList instanceof RandomAccess;
        Object obj = this.f7684g;
        return z3 ? new C1709h(c1688t, obj, listSubList, c1717l) : new C1717l(c1688t, obj, listSubList, c1717l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m4150g();
        return this.f7685h.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        m4150g();
        return new C1715k(this, i3);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        m4150g();
        Object objRemove = ((List) this.f7685h).remove(i3);
        this.f7689l.f7624k--;
        m4151h();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        m4150g();
        boolean zIsEmpty = this.f7685h.isEmpty();
        ((List) this.f7685h).add(i3, obj);
        this.f7689l.f7624k++;
        if (zIsEmpty) {
            m4149e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f7685h).addAll(i3, collection);
        if (zAddAll) {
            this.f7689l.f7624k += this.f7685h.size() - size;
            if (size == 0) {
                m4149e();
            }
        }
        return zAddAll;
    }
}
