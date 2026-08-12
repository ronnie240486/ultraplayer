package p105h2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: h2.i */
/* JADX INFO: loaded from: classes.dex */
public class C1711i extends C1701d implements SortedMap {

    /* JADX INFO: renamed from: k */
    public SortedSet f7678k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1688T f7679l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711i(C1688T c1688t, SortedMap sortedMap) {
        super(c1688t, sortedMap);
        this.f7679l = c1688t;
    }

    /* JADX INFO: renamed from: b */
    public SortedSet mo4141b() {
        return new C1713j(this.f7679l, mo4143d());
    }

    @Override // p105h2.C1701d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f7678k;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo4141b = mo4141b();
        this.f7678k = sortedSetMo4141b;
        return sortedSetMo4141b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo4143d().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedMap mo4143d() {
        return (SortedMap) this.f7660i;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo4143d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C1711i(this.f7679l, mo4143d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo4143d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C1711i(this.f7679l, mo4143d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C1711i(this.f7679l, mo4143d().tailMap(obj));
    }
}
