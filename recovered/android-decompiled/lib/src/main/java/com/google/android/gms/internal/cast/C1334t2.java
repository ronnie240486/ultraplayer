package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1334t2 extends AbstractC1234U1 implements RandomAccess, InterfaceC1298k2, InterfaceC1172E2 {

    /* JADX INFO: renamed from: j */
    public static final C1334t2 f5968j = new C1334t2(new long[0], 0, false);

    /* JADX INFO: renamed from: h */
    public long[] f5969h;

    /* JADX INFO: renamed from: i */
    public int f5970i;

    public C1334t2(long[] jArr, int i3, boolean z3) {
        super(z3);
        this.f5969h = jArr;
        this.f5970i = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        long jLongValue = ((Long) obj).longValue();
        m3194e();
        if (i3 < 0 || i3 > (i4 = this.f5970i)) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f5970i);
        }
        int i5 = i3 + 1;
        long[] jArr = this.f5969h;
        if (i4 < jArr.length) {
            System.arraycopy(jArr, i3, jArr, i5, i4 - i3);
        } else {
            long[] jArr2 = new long[((i4 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            System.arraycopy(this.f5969h, i3, jArr2, i5, this.f5970i - i3);
            this.f5969h = jArr2;
        }
        this.f5969h[i3] = jLongValue;
        this.f5970i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3194e();
        Charset charset = AbstractC1306m2.f5927a;
        collection.getClass();
        if (!(collection instanceof C1334t2)) {
            return super.addAll(collection);
        }
        C1334t2 c1334t2 = (C1334t2) collection;
        int i3 = c1334t2.f5970i;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.f5970i;
        if (Integer.MAX_VALUE - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        long[] jArr = this.f5969h;
        if (i5 > jArr.length) {
            this.f5969h = Arrays.copyOf(jArr, i5);
        }
        System.arraycopy(c1334t2.f5969h, 0, this.f5969h, this.f5970i, c1334t2.f5970i);
        this.f5970i = i5;
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
        if (!(obj instanceof C1334t2)) {
            return super.equals(obj);
        }
        C1334t2 c1334t2 = (C1334t2) obj;
        if (this.f5970i != c1334t2.f5970i) {
            return false;
        }
        long[] jArr = c1334t2.f5969h;
        for (int i3 = 0; i3 < this.f5970i; i3++) {
            if (this.f5969h[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1302l2
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ InterfaceC1302l2 mo3140f(int i3) {
        if (i3 >= this.f5970i) {
            return new C1334t2(Arrays.copyOf(this.f5969h, i3), this.f5970i, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: g */
    public final void m3409g(int i3) {
        if (i3 < 0 || i3 >= this.f5970i) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f5970i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        m3409g(i3);
        return Long.valueOf(this.f5969h[i3]);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.f5970i; i4++) {
            long j3 = this.f5969h[i4];
            Charset charset = AbstractC1306m2.f5927a;
            i3 = (i3 * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i3 = this.f5970i;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f5969h[i4] == jLongValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        m3194e();
        m3409g(i3);
        long[] jArr = this.f5969h;
        long j3 = jArr[i3];
        int i4 = this.f5970i;
        if (i3 < i4 - 1) {
            System.arraycopy(jArr, i3 + 1, jArr, i3, (i4 - i3) - 1);
        }
        this.f5970i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        m3194e();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f5969h;
        System.arraycopy(jArr, i4, jArr, i3, this.f5970i - i4);
        this.f5970i -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m3194e();
        m3409g(i3);
        long[] jArr = this.f5969h;
        long j3 = jArr[i3];
        jArr[i3] = jLongValue;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5970i;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m3194e();
        int i3 = this.f5970i;
        long[] jArr = this.f5969h;
        if (i3 == jArr.length) {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            this.f5969h = jArr2;
        }
        long[] jArr3 = this.f5969h;
        int i4 = this.f5970i;
        this.f5970i = i4 + 1;
        jArr3[i4] = jLongValue;
        return true;
    }
}
