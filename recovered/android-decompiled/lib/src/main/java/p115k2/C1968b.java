package p115k2;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: k2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1968b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: g */
    public final int[] f8594g;

    /* JADX INFO: renamed from: h */
    public final int f8595h;

    /* JADX INFO: renamed from: i */
    public final int f8596i;

    public C1968b(int i3, int i4, int[] iArr) {
        this.f8594g = iArr;
        this.f8595h = i3;
        this.f8596i = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return AbstractC1303m.m3329v(((Integer) obj).intValue(), this.f8595h, this.f8596i, this.f8594g) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1968b)) {
            return super.equals(obj);
        }
        C1968b c1968b = (C1968b) obj;
        int size = size();
        if (c1968b.size() != size) {
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f8594g[this.f8595h + i3] != c1968b.f8594g[c1968b.f8595h + i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        AbstractC0230e.m729g(i3, size());
        return Integer.valueOf(this.f8594g[this.f8595h + i3]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i4 = this.f8595h; i4 < this.f8596i; i4++) {
            i3 = (i3 * 31) + this.f8594g[i4];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f8594g;
        int i3 = this.f8595h;
        int iM3329v = AbstractC1303m.m3329v(iIntValue, i3, this.f8596i, iArr);
        if (iM3329v >= 0) {
            return iM3329v - i3;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i3;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i4 = this.f8596i;
            do {
                i4--;
                i3 = this.f8595h;
                if (i4 < i3) {
                    i4 = -1;
                    break;
                }
            } while (this.f8594g[i4] != iIntValue);
            if (i4 >= 0) {
                return i4 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        Integer num = (Integer) obj;
        AbstractC0230e.m729g(i3, size());
        int i4 = this.f8595h + i3;
        int[] iArr = this.f8594g;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8596i - this.f8595h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        AbstractC0230e.m732j(i3, i4, size());
        if (i3 == i4) {
            return Collections.EMPTY_LIST;
        }
        int i5 = this.f8595h;
        return new C1968b(i3 + i5, i5 + i4, this.f8594g);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f8594g;
        int i3 = this.f8595h;
        sb.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 >= this.f8596i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i3]);
        }
    }
}
