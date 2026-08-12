package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1242W1 implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f5722g = 0;

    /* JADX INFO: renamed from: h */
    public final int f5723h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1250Y1 f5724i;

    public C1242W1(C1250Y1 c1250y1) {
        this.f5724i = c1250y1;
        this.f5723h = c1250y1.mo3215h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5722g < this.f5723h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f5722g;
        if (i3 >= this.f5723h) {
            throw new NoSuchElementException();
        }
        this.f5722g = i3 + 1;
        return Byte.valueOf(this.f5724i.mo3214g(i3));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
