package p105h2;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: h2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1705f extends C1711i implements NavigableMap {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1688T f7672m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705f(C1688T c1688t, NavigableMap navigableMap) {
        super(c1688t, navigableMap);
        this.f7672m = c1688t;
    }

    @Override // p105h2.C1711i
    /* JADX INFO: renamed from: b */
    public final SortedSet mo4141b() {
        return new C1707g(this.f7672m, mo4143d());
    }

    @Override // p105h2.C1711i
    /* JADX INFO: renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo4143d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m4140a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo4143d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C1705f(this.f7672m, mo4143d().descendingMap());
    }

    /* JADX INFO: renamed from: e */
    public final C1672C m4144e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionM4134c = this.f7672m.m4134c();
        collectionM4134c.addAll((Collection) entry.getValue());
        it.remove();
        return new C1672C(entry.getKey(), Collections.unmodifiableList((List) collectionM4134c));
    }

    @Override // p105h2.C1711i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo4143d() {
        return (NavigableMap) ((SortedMap) this.f7660i);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo4143d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m4140a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo4143d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m4140a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo4143d().floorKey(obj);
    }

    @Override // p105h2.C1711i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo4143d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m4140a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo4143d().higherKey(obj);
    }

    @Override // p105h2.C1711i, p105h2.C1701d, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo4143d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m4140a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo4143d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m4140a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo4143d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m4144e(((C1697b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m4144e(((C1697b) ((C1701d) descendingMap()).entrySet()).iterator());
    }

    @Override // p105h2.C1711i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p105h2.C1711i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z3) {
        return new C1705f(this.f7672m, mo4143d().headMap(obj, z3));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z3, Object obj2, boolean z4) {
        return new C1705f(this.f7672m, mo4143d().subMap(obj, z3, obj2, z4));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z3) {
        return new C1705f(this.f7672m, mo4143d().tailMap(obj, z3));
    }
}
