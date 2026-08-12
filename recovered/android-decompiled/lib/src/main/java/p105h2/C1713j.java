package p105h2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: h2.j */
/* JADX INFO: loaded from: classes.dex */
public class C1713j extends C1703e implements SortedSet {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1688T f7680i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713j(C1688T c1688t, SortedMap sortedMap) {
        super(c1688t, sortedMap);
        this.f7680i = c1688t;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo4146e().comparator();
    }

    /* JADX INFO: renamed from: e */
    public SortedMap mo4146e() {
        return (SortedMap) this.f7669g;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo4146e().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C1713j(this.f7680i, mo4146e().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo4146e().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C1713j(this.f7680i, mo4146e().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C1713j(this.f7680i, mo4146e().tailMap(obj));
    }
}
