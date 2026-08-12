package p105h2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: h2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1720n extends AbstractCollection {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7690g;

    /* JADX INFO: renamed from: h */
    public final Object f7691h;

    public /* synthetic */ C1720n(int i3, Serializable serializable) {
        this.f7690g = i3;
        this.f7691h = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f7690g) {
            case 0:
                ((C1688T) this.f7691h).m4133b();
                break;
            case 1:
                ((C1727u) this.f7691h).clear();
                break;
            default:
                ((C1701d) this.f7691h).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f7690g) {
            case 0:
                Iterator it = ((C1688T) this.f7691h).mo4132a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C1701d) this.f7691h).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f7690g) {
            case 2:
                return ((C1701d) this.f7691h).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7690g) {
            case 0:
                return new C1695a((C1688T) this.f7691h);
            case 1:
                C1727u c1727u = (C1727u) this.f7691h;
                Map mapM4171b = c1727u.m4171b();
                return mapM4171b != null ? mapM4171b.values().iterator() : new C1724r(c1727u, 2);
            default:
                return new C1686Q(((C1701d) this.f7691h).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f7690g) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C1701d c1701d = (C1701d) this.f7691h;
                    for (Map.Entry entry : c1701d.entrySet()) {
                        if (AbstractC2003a.m4538k(obj, entry.getValue())) {
                            c1701d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f7690g) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C1701d c1701d = (C1701d) this.f7691h;
                    for (Map.Entry entry : c1701d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1701d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f7690g) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C1701d c1701d = (C1701d) this.f7691h;
                    for (Map.Entry entry : c1701d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1701d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f7690g) {
            case 0:
                return ((C1688T) this.f7691h).f7624k;
            case 1:
                return ((C1727u) this.f7691h).size();
            default:
                return ((C1701d) this.f7691h).f7660i.size();
        }
    }

    public C1720n(C1701d c1701d) {
        this.f7690g = 2;
        this.f7691h = c1701d;
    }
}
