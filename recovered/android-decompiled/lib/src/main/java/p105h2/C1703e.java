package p105h2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: h2.e */
/* JADX INFO: loaded from: classes.dex */
public class C1703e extends AbstractC1712i0 {

    /* JADX INFO: renamed from: g */
    public final Map f7669g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1688T f7670h;

    public C1703e(C1688T c1688t, Map map) {
        this.f7670h = c1688t;
        map.getClass();
        this.f7669g = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C1699c c1699c = (C1699c) it;
            if (!c1699c.hasNext()) {
                return;
            }
            c1699c.next();
            c1699c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7669g.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f7669g.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f7669g.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7669g.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7669g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1699c(this, this.f7669g.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f7669g.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f7670h.f7624k -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7669g.size();
    }
}
