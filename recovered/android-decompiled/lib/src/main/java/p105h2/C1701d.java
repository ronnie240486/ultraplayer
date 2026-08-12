package p105h2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: h2.d */
/* JADX INFO: loaded from: classes.dex */
public class C1701d extends AbstractMap {

    /* JADX INFO: renamed from: g */
    public transient C1697b f7658g;

    /* JADX INFO: renamed from: h */
    public transient C1720n f7659h;

    /* JADX INFO: renamed from: i */
    public final transient Map f7660i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1688T f7661j;

    public C1701d(C1688T c1688t, Map map) {
        this.f7661j = c1688t;
        this.f7660i = map;
    }

    /* JADX INFO: renamed from: a */
    public final C1672C m4140a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C1688T c1688t = this.f7661j;
        c1688t.getClass();
        List list = (List) collection;
        return new C1672C(key, list instanceof RandomAccess ? new C1709h(c1688t, key, list, null) : new C1717l(c1688t, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C1688T c1688t = this.f7661j;
        if (this.f7660i == c1688t.f7623j) {
            c1688t.m4133b();
            return;
        }
        C1699c c1699c = new C1699c(this);
        while (c1699c.hasNext()) {
            c1699c.next();
            c1699c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f7660i;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1697b c1697b = this.f7658g;
        if (c1697b != null) {
            return c1697b;
        }
        C1697b c1697b2 = new C1697b(this);
        this.f7658g = c1697b2;
        return c1697b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f7660i.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f7660i;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C1688T c1688t = this.f7661j;
        c1688t.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C1709h(c1688t, obj, list, null) : new C1717l(c1688t, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f7660i.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set c1713j;
        C1688T c1688t = this.f7661j;
        Set set = c1688t.f7692g;
        if (set != null) {
            return set;
        }
        Map map = c1688t.f7623j;
        if (map instanceof NavigableMap) {
            c1713j = new C1707g(c1688t, (NavigableMap) map);
        } else {
            c1713j = map instanceof SortedMap ? new C1713j(c1688t, (SortedMap) map) : new C1703e(c1688t, map);
        }
        c1688t.f7692g = c1713j;
        return c1713j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f7660i.remove(obj);
        if (collection == null) {
            return null;
        }
        C1688T c1688t = this.f7661j;
        Collection collectionM4134c = c1688t.m4134c();
        collectionM4134c.addAll(collection);
        c1688t.f7624k -= collection.size();
        collection.clear();
        return collectionM4134c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7660i.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f7660i.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1720n c1720n = this.f7659h;
        if (c1720n != null) {
            return c1720n;
        }
        C1720n c1720n2 = new C1720n(this);
        this.f7659h = c1720n2;
        return c1720n2;
    }
}
