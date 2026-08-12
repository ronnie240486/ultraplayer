package p105h2;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: h2.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1682M extends AbstractC1718l0 {

    /* JADX INFO: renamed from: g */
    public final Object f7614g;

    /* JADX INFO: renamed from: h */
    public boolean f7615h;

    public C1682M(Object obj) {
        this.f7614g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7615h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7615h) {
            throw new NoSuchElementException();
        }
        this.f7615h = true;
        return this.f7614g;
    }
}
