package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1193K extends AbstractC1236V {

    /* JADX INFO: renamed from: g */
    public boolean f5648g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5649h;

    public C1193K(Object obj) {
        this.f5649h = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f5648g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5648g) {
            throw new NoSuchElementException();
        }
        this.f5648g = true;
        return this.f5649h;
    }
}
