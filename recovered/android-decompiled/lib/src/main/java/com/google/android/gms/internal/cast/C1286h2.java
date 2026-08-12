package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1286h2 extends AbstractC1234U1 implements RandomAccess, InterfaceC1290i2, InterfaceC1172E2 {

    /* JADX INFO: renamed from: j */
    public static final C1286h2 f5911j = new C1286h2(new int[0], 0, false);

    /* JADX INFO: renamed from: h */
    public int[] f5912h;

    /* JADX INFO: renamed from: i */
    public int f5913i;

    public C1286h2(int[] iArr, int i3, boolean z3) {
        super(z3);
        this.f5912h = iArr;
        this.f5913i = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int iIntValue = ((Integer) obj).intValue();
        m3194e();
        if (i3 < 0 || i3 > (i4 = this.f5913i)) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f5913i);
        }
        int i5 = i3 + 1;
        int[] iArr = this.f5912h;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i3, iArr, i5, i4 - i3);
        } else {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.f5912h, i3, iArr2, i5, this.f5913i - i3);
            this.f5912h = iArr2;
        }
        this.f5912h[i3] = iIntValue;
        this.f5913i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3194e();
        Charset charset = AbstractC1306m2.f5927a;
        collection.getClass();
        if (!(collection instanceof C1286h2)) {
            return super.addAll(collection);
        }
        C1286h2 c1286h2 = (C1286h2) collection;
        int i3 = c1286h2.f5913i;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.f5913i;
        if (Integer.MAX_VALUE - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        int[] iArr = this.f5912h;
        if (i5 > iArr.length) {
            this.f5912h = Arrays.copyOf(iArr, i5);
        }
        System.arraycopy(c1286h2.f5912h, 0, this.f5912h, this.f5913i, c1286h2.f5913i);
        this.f5913i = i5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1286h2)) {
            return super.equals(obj);
        }
        C1286h2 c1286h2 = (C1286h2) obj;
        if (this.f5913i != c1286h2.f5913i) {
            return false;
        }
        int[] iArr = c1286h2.f5912h;
        for (int i3 = 0; i3 < this.f5913i; i3++) {
            if (this.f5912h[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1302l2
    /* JADX INFO: renamed from: f */
    public final InterfaceC1302l2 mo3140f(int i3) {
        if (i3 >= this.f5913i) {
            return new C1286h2(Arrays.copyOf(this.f5912h, i3), this.f5913i, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: g */
    public final void m3271g(int i3) {
        m3194e();
        int i4 = this.f5913i;
        int[] iArr = this.f5912h;
        if (i4 == iArr.length) {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.f5912h = iArr2;
        }
        int[] iArr3 = this.f5912h;
        int i5 = this.f5913i;
        this.f5913i = i5 + 1;
        iArr3[i5] = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        m3272h(i3);
        return Integer.valueOf(this.f5912h[i3]);
    }

    /* JADX INFO: renamed from: h */
    public final void m3272h(int i3) {
        if (i3 < 0 || i3 >= this.f5913i) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f5913i);
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.f5913i; i4++) {
            i3 = (i3 * 31) + this.f5912h[i4];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i3 = this.f5913i;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f5912h[i4] == iIntValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        m3194e();
        m3272h(i3);
        int[] iArr = this.f5912h;
        int i4 = iArr[i3];
        int i5 = this.f5913i;
        if (i3 < i5 - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (i5 - i3) - 1);
        }
        this.f5913i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        m3194e();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5912h;
        System.arraycopy(iArr, i4, iArr, i3, this.f5913i - i4);
        this.f5913i -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m3194e();
        m3272h(i3);
        int[] iArr = this.f5912h;
        int i4 = iArr[i3];
        iArr[i3] = iIntValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5913i;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m3271g(((Integer) obj).intValue());
        return true;
    }
}
