package p105h2;

import java.util.Iterator;

/* JADX INFO: renamed from: h2.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1716k0 implements Iterator {

    /* JADX INFO: renamed from: g */
    public final Iterator f7683g;

    public AbstractC1716k0(Iterator it) {
        it.getClass();
        this.f7683g = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo4131a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7683g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo4131a(this.f7683g.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7683g.remove();
    }
}
