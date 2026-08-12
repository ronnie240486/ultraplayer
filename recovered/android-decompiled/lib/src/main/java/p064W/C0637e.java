package p064W;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p088d0.C1387k;

/* JADX INFO: renamed from: W.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0637e implements Iterable {

    /* JADX INFO: renamed from: g */
    public final Object f2476g = new Object();

    /* JADX INFO: renamed from: h */
    public final HashMap f2477h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Set f2478i = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: j */
    public List f2479j = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public final int m1614e(C1387k c1387k) {
        int iIntValue;
        synchronized (this.f2476g) {
            try {
                iIntValue = this.f2477h.containsKey(c1387k) ? ((Integer) this.f2477h.get(c1387k)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: g */
    public final void m1615g(C1387k c1387k) {
        synchronized (this.f2476g) {
            try {
                Integer num = (Integer) this.f2477h.get(c1387k);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f2479j);
                arrayList.remove(c1387k);
                this.f2479j = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f2477h.remove(c1387k);
                    HashSet hashSet = new HashSet(this.f2478i);
                    hashSet.remove(c1387k);
                    this.f2478i = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f2477h.put(c1387k, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f2476g) {
            it = this.f2479j.iterator();
        }
        return it;
    }
}
