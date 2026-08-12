package p105h2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: renamed from: h2.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1688T extends AbstractC1721o implements Serializable {

    /* JADX INFO: renamed from: j */
    public final transient Map f7623j;

    /* JADX INFO: renamed from: k */
    public transient int f7624k;

    /* JADX INFO: renamed from: l */
    public transient C1687S f7625l;

    public C1688T(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f7623j = map;
    }

    @Override // p105h2.AbstractC1721o
    /* JADX INFO: renamed from: a */
    public final Map mo4132a() {
        Map c1711i;
        Map map = this.f7694i;
        if (map != null) {
            return map;
        }
        Map map2 = this.f7623j;
        if (map2 instanceof NavigableMap) {
            c1711i = new C1705f(this, (NavigableMap) map2);
        } else {
            c1711i = map2 instanceof SortedMap ? new C1711i(this, (SortedMap) map2) : new C1701d(this, map2);
        }
        this.f7694i = c1711i;
        return c1711i;
    }

    /* JADX INFO: renamed from: b */
    public final void m4133b() {
        Map map = this.f7623j;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f7624k = 0;
    }

    /* JADX INFO: renamed from: c */
    public final Collection m4134c() {
        return (List) this.f7625l.get();
    }
}
