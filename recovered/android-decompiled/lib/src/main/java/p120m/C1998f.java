package p120m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: m.f */
/* JADX INFO: loaded from: classes.dex */
public class C1998f implements Iterable {

    /* JADX INFO: renamed from: g */
    public C1995c f8710g;

    /* JADX INFO: renamed from: h */
    public C1995c f8711h;

    /* JADX INFO: renamed from: i */
    public final WeakHashMap f8712i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    public int f8713j = 0;

    /* JADX INFO: renamed from: e */
    public C1995c mo4522e(Object obj) {
        C1995c c1995c = this.f8710g;
        while (c1995c != null && !c1995c.f8703g.equals(obj)) {
            c1995c = c1995c.f8705i;
        }
        return c1995c;
    }

    public final boolean equals(Object obj) {
        C1994b c1994b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1998f)) {
            return false;
        }
        C1998f c1998f = (C1998f) obj;
        if (this.f8713j != c1998f.f8713j) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1998f.iterator();
        while (true) {
            c1994b = (C1994b) it;
            if (!c1994b.hasNext()) {
                break;
            }
            C1994b c1994b2 = (C1994b) it2;
            if (!c1994b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1994b.next();
            Object next = c1994b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c1994b.hasNext() || ((C1994b) it2).hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public Object mo4523g(Object obj) {
        C1995c c1995cMo4522e = mo4522e(obj);
        if (c1995cMo4522e == null) {
            return null;
        }
        this.f8713j--;
        WeakHashMap weakHashMap = this.f8712i;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1997e) it.next()).mo4524a(c1995cMo4522e);
            }
        }
        C1995c c1995c = c1995cMo4522e.f8706j;
        if (c1995c != null) {
            c1995c.f8705i = c1995cMo4522e.f8705i;
        } else {
            this.f8710g = c1995cMo4522e.f8705i;
        }
        C1995c c1995c2 = c1995cMo4522e.f8705i;
        if (c1995c2 != null) {
            c1995c2.f8706j = c1995c;
        } else {
            this.f8711h = c1995c;
        }
        c1995cMo4522e.f8705i = null;
        c1995cMo4522e.f8706j = null;
        return c1995cMo4522e.f8704h;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C1994b c1994b = (C1994b) it;
            if (!c1994b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1994b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1994b c1994b = new C1994b(this.f8710g, this.f8711h, 0);
        this.f8712i.put(c1994b, Boolean.FALSE);
        return c1994b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1994b c1994b = (C1994b) it;
            if (!c1994b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1994b.next()).toString());
            if (c1994b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
