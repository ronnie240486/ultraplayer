package p105h2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: h2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1724r implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f7697g;

    /* JADX INFO: renamed from: h */
    public int f7698h;

    /* JADX INFO: renamed from: i */
    public int f7699i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1727u f7700j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f7701k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1727u f7702l;

    public C1724r(C1727u c1727u, int i3) {
        this.f7701k = i3;
        this.f7702l = c1727u;
        this.f7700j = c1727u;
        this.f7697g = c1727u.f7713k;
        this.f7698h = c1727u.isEmpty() ? -1 : 0;
        this.f7699i = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7698h >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c1726t;
        C1727u c1727u = this.f7700j;
        if (c1727u.f7713k != this.f7697g) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f7698h;
        this.f7699i = i3;
        switch (this.f7701k) {
            case 0:
                c1726t = this.f7702l.m4178i()[i3];
                break;
            case 1:
                c1726t = new C1726t(this.f7702l, i3);
                break;
            default:
                c1726t = this.f7702l.m4179j()[i3];
                break;
        }
        int i4 = this.f7698h + 1;
        if (i4 >= c1727u.f7714l) {
            i4 = -1;
        }
        this.f7698h = i4;
        return c1726t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1727u c1727u = this.f7700j;
        int i3 = c1727u.f7713k;
        int i4 = this.f7697g;
        if (i3 != i4) {
            throw new ConcurrentModificationException();
        }
        int i5 = this.f7699i;
        if (i5 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f7697g = i4 + 32;
        c1727u.remove(c1727u.m4178i()[i5]);
        this.f7698h--;
        this.f7699i = -1;
    }
}
