package p105h2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: h2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1695a implements Iterator {

    /* JADX INFO: renamed from: g */
    public final Iterator f7636g;

    /* JADX INFO: renamed from: h */
    public Object f7637h = null;

    /* JADX INFO: renamed from: i */
    public Collection f7638i = null;

    /* JADX INFO: renamed from: j */
    public Iterator f7639j = EnumC1681L.f7612g;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1688T f7640k;

    public C1695a(C1688T c1688t) {
        this.f7640k = c1688t;
        this.f7636g = c1688t.f7623j.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7636g.hasNext() || this.f7639j.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f7639j.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f7636g.next();
            this.f7637h = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f7638i = collection;
            this.f7639j = collection.iterator();
        }
        return this.f7639j.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7639j.remove();
        Collection collection = this.f7638i;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f7636g.remove();
        }
        this.f7640k.f7624k--;
    }
}
