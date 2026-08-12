package p124n;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2017d implements Collection {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2018e f8765g;

    public C2017d(C2018e c2018e) {
        this.f8765g = c2018e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8765g.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8765g.m4589f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8765g.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2014a(this.f8765g, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2018e c2018e = this.f8765g;
        int iM4589f = c2018e.m4589f(obj);
        if (iM4589f < 0) {
            return false;
        }
        c2018e.m4591h(iM4589f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2018e c2018e = this.f8765g;
        int i3 = c2018e.f8791i;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (collection.contains(c2018e.m4592i(i4))) {
                c2018e.m4591h(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2018e c2018e = this.f8765g;
        int i3 = c2018e.f8791i;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (!collection.contains(c2018e.m4592i(i4))) {
                c2018e.m4591h(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8765g.f8791i;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2018e c2018e = this.f8765g;
        int i3 = c2018e.f8791i;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c2018e.m4592i(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8765g.m4571j(1, objArr);
    }
}
