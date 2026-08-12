package p070Y;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p105h2.AbstractC1723q;
import p105h2.C1708g0;

/* JADX INFO: renamed from: Y.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0718o implements Map {

    /* JADX INFO: renamed from: g */
    public final Map f2754g;

    public C0718o(Map map) {
        this.f2754g = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f2754g.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f2754g.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C1708g0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC1723q.m4157f(this.f2754g.entrySet(), new C0717n(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC1723q.m4155d(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f2754g.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1723q.m4159h(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f2754g;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC1723q.m4157f(this.f2754g.keySet(), new C0717n(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f2754g.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f2754g.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f2754g.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f2754g;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f2754g.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f2754g.values();
    }
}
