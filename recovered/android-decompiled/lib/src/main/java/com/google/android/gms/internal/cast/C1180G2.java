package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.G2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1180G2 extends AbstractC1234U1 implements RandomAccess {

    /* JADX INFO: renamed from: j */
    public static final C1180G2 f5631j = new C1180G2(new Object[0], 0, false);

    /* JADX INFO: renamed from: h */
    public Object[] f5632h;

    /* JADX INFO: renamed from: i */
    public int f5633i;

    public C1180G2(Object[] objArr, int i3, boolean z3) {
        super(z3);
        this.f5632h = objArr;
        this.f5633i = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        m3194e();
        if (i3 < 0 || i3 > (i4 = this.f5633i)) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f5633i);
        }
        int i5 = i3 + 1;
        Object[] objArr = this.f5632h;
        if (i4 < objArr.length) {
            System.arraycopy(objArr, i3, objArr, i5, i4 - i3);
        } else {
            Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            System.arraycopy(this.f5632h, i3, objArr2, i5, this.f5633i - i3);
            this.f5632h = objArr2;
        }
        this.f5632h[i3] = obj;
        this.f5633i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1302l2
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ InterfaceC1302l2 mo3140f(int i3) {
        if (i3 >= this.f5633i) {
            return new C1180G2(Arrays.copyOf(this.f5632h, i3), this.f5633i, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: g */
    public final void m3141g(int i3) {
        if (i3 < 0 || i3 >= this.f5633i) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f5633i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        m3141g(i3);
        return this.f5632h[i3];
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        m3194e();
        m3141g(i3);
        Object[] objArr = this.f5632h;
        Object obj = objArr[i3];
        int i4 = this.f5633i;
        if (i3 < i4 - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (i4 - i3) - 1);
        }
        this.f5633i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        m3194e();
        m3141g(i3);
        Object[] objArr = this.f5632h;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5633i;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3194e();
        int i3 = this.f5633i;
        Object[] objArr = this.f5632h;
        if (i3 == objArr.length) {
            this.f5632h = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5632h;
        int i4 = this.f5633i;
        this.f5633i = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
