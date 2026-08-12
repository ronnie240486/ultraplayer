package p105h2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p122m1.AbstractC2003a;
import p124n.C2016c;
import p124n.C2018e;

/* JADX INFO: renamed from: h2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1725s extends AbstractSet {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7703g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Map f7704h;

    public /* synthetic */ C1725s(Map map, int i3) {
        this.f7703g = i3;
        this.f7704h = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f7703g) {
            case 0:
                ((C1727u) this.f7704h).clear();
                break;
            case 1:
                ((C1727u) this.f7704h).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f7703g) {
            case 0:
                C1727u c1727u = (C1727u) this.f7704h;
                Map mapM4171b = c1727u.m4171b();
                if (mapM4171b != null) {
                    return mapM4171b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM4173d = c1727u.m4173d(entry.getKey());
                    if (iM4173d != -1 && AbstractC2003a.m4538k(c1727u.m4179j()[iM4173d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((C1727u) this.f7704h).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7703g) {
            case 0:
                C1727u c1727u = (C1727u) this.f7704h;
                Map mapM4171b = c1727u.m4171b();
                return mapM4171b != null ? mapM4171b.entrySet().iterator() : new C1724r(c1727u, 1);
            case 1:
                C1727u c1727u2 = (C1727u) this.f7704h;
                Map mapM4171b2 = c1727u2.m4171b();
                return mapM4171b2 != null ? mapM4171b2.keySet().iterator() : new C1724r(c1727u2, 0);
            default:
                return new C2016c((C2018e) this.f7704h);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f7703g) {
            case 0:
                C1727u c1727u = (C1727u) this.f7704h;
                Map mapM4171b = c1727u.m4171b();
                if (mapM4171b != null) {
                    return mapM4171b.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c1727u.m4175f()) {
                        int iM4172c = c1727u.m4172c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c1727u.f7709g;
                        Objects.requireNonNull(obj2);
                        int iM4162k = AbstractC1723q.m4162k(key, value, iM4172c, obj2, c1727u.m4177h(), c1727u.m4178i(), c1727u.m4179j());
                        if (iM4162k != -1) {
                            c1727u.m4174e(iM4162k, iM4172c);
                            c1727u.f7714l--;
                            c1727u.f7713k += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                C1727u c1727u2 = (C1727u) this.f7704h;
                Map mapM4171b2 = c1727u2.m4171b();
                if (mapM4171b2 != null) {
                    return mapM4171b2.keySet().remove(obj);
                }
                return c1727u2.m4176g(obj) != C1727u.f7708p;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7703g) {
            case 0:
                return ((C1727u) this.f7704h).size();
            case 1:
                return ((C1727u) this.f7704h).size();
            default:
                return ((C2018e) this.f7704h).f8791i;
        }
    }
}
