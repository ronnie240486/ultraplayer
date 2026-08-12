package p105h2;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: h2.c */
/* JADX INFO: loaded from: classes.dex */
public class C1699c implements Iterator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7647g = 0;

    /* JADX INFO: renamed from: h */
    public final Iterator f7648h;

    /* JADX INFO: renamed from: i */
    public Object f7649i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f7650j;

    public C1699c(C1717l c1717l) {
        this.f7650j = c1717l;
        Collection collection = c1717l.f7685h;
        this.f7649i = collection;
        this.f7648h = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m4137a() {
        C1717l c1717l = (C1717l) this.f7650j;
        c1717l.m4150g();
        if (c1717l.f7685h != ((Collection) this.f7649i)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7647g) {
            case 0:
                break;
            case 1:
                break;
            default:
                m4137a();
                break;
        }
        return this.f7648h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7647g) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f7648h.next();
                this.f7649i = (Collection) entry.getValue();
                return ((C1701d) this.f7650j).m4140a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f7648h.next();
                this.f7649i = entry2;
                return entry2.getKey();
            default:
                m4137a();
                return this.f7648h.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7647g) {
            case 0:
                if (!(((Collection) this.f7649i) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f7648h.remove();
                C1701d c1701d = (C1701d) this.f7650j;
                c1701d.f7661j.f7624k -= ((Collection) this.f7649i).size();
                ((Collection) this.f7649i).clear();
                this.f7649i = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f7649i;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f7648h.remove();
                C1703e c1703e = (C1703e) this.f7650j;
                c1703e.f7670h.f7624k -= collection.size();
                collection.clear();
                this.f7649i = null;
                return;
            default:
                this.f7648h.remove();
                C1717l c1717l = (C1717l) this.f7650j;
                c1717l.f7688k.f7624k--;
                c1717l.m4151h();
                return;
        }
    }

    public C1699c(C1717l c1717l, ListIterator listIterator) {
        this.f7650j = c1717l;
        this.f7649i = c1717l.f7685h;
        this.f7648h = listIterator;
    }

    public C1699c(C1703e c1703e, Iterator it) {
        this.f7648h = it;
        this.f7650j = c1703e;
    }

    public C1699c(C1701d c1701d) {
        this.f7650j = c1701d;
        this.f7648h = c1701d.f7660i.entrySet().iterator();
    }
}
