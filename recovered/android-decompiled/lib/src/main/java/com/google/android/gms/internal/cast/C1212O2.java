package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.O2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1212O2 implements Iterator {

    /* JADX INFO: renamed from: g */
    public final Iterator f5678g;

    public C1212O2(C1216P2 c1216p2) {
        this.f5678g = c1216p2.f5682g.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5678g.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f5678g.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
