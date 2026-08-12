package p147s2;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p122m1.AbstractC2003a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: s2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2255a extends AbstractList implements List {

    /* JADX INFO: renamed from: j */
    public static final Object[] f9688j = new Object[0];

    /* JADX INFO: renamed from: g */
    public int f9689g;

    /* JADX INFO: renamed from: h */
    public Object[] f9690h = f9688j;

    /* JADX INFO: renamed from: i */
    public int f9691i;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int length;
        int i4 = this.f9691i;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
        }
        if (i3 == i4) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        m4847g(i4 + 1);
        int iM4849i = m4849i(this.f9689g + i3);
        int i5 = this.f9691i;
        if (i3 < ((i5 + 1) >> 1)) {
            if (iM4849i == 0) {
                Object[] objArr = this.f9690h;
                AbstractC2364c.m4954e(objArr, "<this>");
                iM4849i = objArr.length;
            }
            int i6 = iM4849i - 1;
            int i7 = this.f9689g;
            if (i7 == 0) {
                Object[] objArr2 = this.f9690h;
                AbstractC2364c.m4954e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i7 - 1;
            }
            int i8 = this.f9689g;
            if (i6 >= i8) {
                Object[] objArr3 = this.f9690h;
                objArr3[length] = objArr3[i8];
                AbstractC2256b.m4850e0(i8, i8 + 1, i6 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f9690h;
                AbstractC2256b.m4850e0(i8 - 1, i8, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f9690h;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC2256b.m4850e0(0, 1, i6 + 1, objArr5, objArr5);
            }
            this.f9690h[i6] = obj;
            this.f9689g = length;
        } else {
            int iM4849i2 = m4849i(this.f9689g + i5);
            if (iM4849i < iM4849i2) {
                Object[] objArr6 = this.f9690h;
                AbstractC2256b.m4850e0(iM4849i + 1, iM4849i, iM4849i2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f9690h;
                AbstractC2256b.m4850e0(1, 0, iM4849i2, objArr7, objArr7);
                Object[] objArr8 = this.f9690h;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC2256b.m4850e0(iM4849i + 1, iM4849i, objArr8.length - 1, objArr8, objArr8);
            }
            this.f9690h[iM4849i] = obj;
        }
        this.f9691i++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        AbstractC2364c.m4954e(collection, "elements");
        int i4 = this.f9691i;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i5 = this.f9691i;
        if (i3 == i5) {
            return addAll(collection);
        }
        m4847g(collection.size() + i5);
        int iM4849i = m4849i(this.f9689g + this.f9691i);
        int iM4849i2 = m4849i(this.f9689g + i3);
        int size = collection.size();
        if (i3 >= ((this.f9691i + 1) >> 1)) {
            int i6 = iM4849i2 + size;
            if (iM4849i2 < iM4849i) {
                int i7 = size + iM4849i;
                Object[] objArr = this.f9690h;
                if (i7 <= objArr.length) {
                    AbstractC2256b.m4850e0(i6, iM4849i2, iM4849i, objArr, objArr);
                } else if (i6 >= objArr.length) {
                    AbstractC2256b.m4850e0(i6 - objArr.length, iM4849i2, iM4849i, objArr, objArr);
                } else {
                    int length = iM4849i - (i7 - objArr.length);
                    AbstractC2256b.m4850e0(0, length, iM4849i, objArr, objArr);
                    Object[] objArr2 = this.f9690h;
                    AbstractC2256b.m4850e0(i6, iM4849i2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f9690h;
                AbstractC2256b.m4850e0(size, 0, iM4849i, objArr3, objArr3);
                Object[] objArr4 = this.f9690h;
                if (i6 >= objArr4.length) {
                    AbstractC2256b.m4850e0(i6 - objArr4.length, iM4849i2, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC2256b.m4850e0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f9690h;
                    AbstractC2256b.m4850e0(i6, iM4849i2, objArr5.length - size, objArr5, objArr5);
                }
            }
            m4846e(iM4849i2, collection);
            return true;
        }
        int i8 = this.f9689g;
        int length2 = i8 - size;
        if (iM4849i2 < i8) {
            Object[] objArr6 = this.f9690h;
            AbstractC2256b.m4850e0(length2, i8, objArr6.length, objArr6, objArr6);
            if (size >= iM4849i2) {
                Object[] objArr7 = this.f9690h;
                AbstractC2256b.m4850e0(objArr7.length - size, 0, iM4849i2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f9690h;
                AbstractC2256b.m4850e0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f9690h;
                AbstractC2256b.m4850e0(0, size, iM4849i2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f9690h;
            AbstractC2256b.m4850e0(length2, i8, iM4849i2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f9690h;
            length2 += objArr11.length;
            int i9 = iM4849i2 - i8;
            int length3 = objArr11.length - length2;
            if (length3 >= i9) {
                AbstractC2256b.m4850e0(length2, i8, iM4849i2, objArr11, objArr11);
            } else {
                AbstractC2256b.m4850e0(length2, i8, i8 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f9690h;
                AbstractC2256b.m4850e0(0, this.f9689g + length3, iM4849i2, objArr12, objArr12);
            }
        }
        this.f9689g = length2;
        int length4 = iM4849i2 - size;
        if (length4 < 0) {
            length4 += this.f9690h.length;
        }
        m4846e(length4, collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m4847g(this.f9691i + 1);
        int length = this.f9689g;
        if (length == 0) {
            Object[] objArr = this.f9690h;
            AbstractC2364c.m4954e(objArr, "<this>");
            length = objArr.length;
        }
        int i3 = length - 1;
        this.f9689g = i3;
        this.f9690h[i3] = obj;
        this.f9691i++;
    }

    public final void addLast(Object obj) {
        m4847g(this.f9691i + 1);
        this.f9690h[m4849i(this.f9689g + this.f9691i)] = obj;
        this.f9691i++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iM4849i = m4849i(this.f9689g + this.f9691i);
        int i3 = this.f9689g;
        if (i3 < iM4849i) {
            Object[] objArr = this.f9690h;
            AbstractC2364c.m4954e(objArr, "<this>");
            Arrays.fill(objArr, i3, iM4849i, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9690h;
            Arrays.fill(objArr2, this.f9689g, objArr2.length, (Object) null);
            Object[] objArr3 = this.f9690h;
            AbstractC2364c.m4954e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, iM4849i, (Object) null);
        }
        this.f9689g = 0;
        this.f9691i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m4846e(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9690h.length;
        while (i3 < length && it.hasNext()) {
            this.f9690h[i3] = it.next();
            i3++;
        }
        int i4 = this.f9689g;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f9690h[i5] = it.next();
        }
        this.f9691i = collection.size() + this.f9691i;
    }

    /* JADX INFO: renamed from: g */
    public final void m4847g(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9690h;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f9688j) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f9690h = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        AbstractC2256b.m4850e0(0, this.f9689g, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f9690h;
        int length2 = objArr3.length;
        int i5 = this.f9689g;
        AbstractC2256b.m4850e0(length2 - i5, 0, i5, objArr3, objArr2);
        this.f9689g = 0;
        this.f9690h = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f9691i;
        if (i3 >= 0 && i3 < i4) {
            return this.f9690h[m4849i(this.f9689g + i3)];
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }

    /* JADX INFO: renamed from: h */
    public final int m4848h(int i3) {
        Object[] objArr = this.f9690h;
        AbstractC2364c.m4954e(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: i */
    public final int m4849i(int i3) {
        Object[] objArr = this.f9690h;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int iM4849i = m4849i(this.f9689g + this.f9691i);
        int length = this.f9689g;
        if (length < iM4849i) {
            while (length < iM4849i) {
                if (AbstractC2364c.m4950a(obj, this.f9690h[length])) {
                    i3 = this.f9689g;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM4849i) {
            return -1;
        }
        int length2 = this.f9690h.length;
        while (length < length2) {
            if (AbstractC2364c.m4950a(obj, this.f9690h[length])) {
                i3 = this.f9689g;
            } else {
                length++;
            }
        }
        for (int i4 = 0; i4 < iM4849i; i4++) {
            if (AbstractC2364c.m4950a(obj, this.f9690h[i4])) {
                length = i4 + this.f9690h.length;
                i3 = this.f9689g;
            }
        }
        return -1;
        return length - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f9691i == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int iM4849i = m4849i(this.f9689g + this.f9691i);
        int i4 = this.f9689g;
        if (i4 < iM4849i) {
            length = iM4849i - 1;
            if (i4 <= length) {
                while (!AbstractC2364c.m4950a(obj, this.f9690h[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f9689g;
                return length - i3;
            }
            return -1;
        }
        if (i4 > iM4849i) {
            for (int i5 = iM4849i - 1; -1 < i5; i5--) {
                if (AbstractC2364c.m4950a(obj, this.f9690h[i5])) {
                    length = i5 + this.f9690h.length;
                    i3 = this.f9689g;
                    return length - i3;
                }
            }
            Object[] objArr = this.f9690h;
            AbstractC2364c.m4954e(objArr, "<this>");
            length = objArr.length - 1;
            int i6 = this.f9689g;
            if (i6 <= length) {
                while (!AbstractC2364c.m4950a(obj, this.f9690h[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i3 = this.f9689g;
                return length - i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        int i4 = this.f9691i;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
        }
        if (i3 == AbstractC2003a.m4539l(this)) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        int iM4849i = m4849i(this.f9689g + i3);
        Object[] objArr = this.f9690h;
        Object obj = objArr[iM4849i];
        if (i3 < (this.f9691i >> 1)) {
            int i5 = this.f9689g;
            if (iM4849i >= i5) {
                AbstractC2256b.m4850e0(i5 + 1, i5, iM4849i, objArr, objArr);
            } else {
                AbstractC2256b.m4850e0(1, 0, iM4849i, objArr, objArr);
                Object[] objArr2 = this.f9690h;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.f9689g;
                AbstractC2256b.m4850e0(i6 + 1, i6, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f9690h;
            int i7 = this.f9689g;
            objArr3[i7] = null;
            this.f9689g = m4848h(i7);
        } else {
            int iM4849i2 = m4849i(AbstractC2003a.m4539l(this) + this.f9689g);
            if (iM4849i <= iM4849i2) {
                Object[] objArr4 = this.f9690h;
                AbstractC2256b.m4850e0(iM4849i, iM4849i + 1, iM4849i2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f9690h;
                AbstractC2256b.m4850e0(iM4849i, iM4849i + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f9690h;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC2256b.m4850e0(0, 1, iM4849i2 + 1, objArr6, objArr6);
            }
            this.f9690h[iM4849i2] = null;
        }
        this.f9691i--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM4849i;
        AbstractC2364c.m4954e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9690h.length != 0) {
            int iM4849i2 = m4849i(this.f9689g + this.f9691i);
            int i3 = this.f9689g;
            if (i3 < iM4849i2) {
                iM4849i = i3;
                while (i3 < iM4849i2) {
                    Object obj = this.f9690h[i3];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f9690h[iM4849i] = obj;
                        iM4849i++;
                    }
                    i3++;
                }
                Object[] objArr = this.f9690h;
                AbstractC2364c.m4954e(objArr, "<this>");
                Arrays.fill(objArr, iM4849i, iM4849i2, (Object) null);
            } else {
                int length = this.f9690h.length;
                int i4 = i3;
                boolean z4 = false;
                while (i3 < length) {
                    Object[] objArr2 = this.f9690h;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f9690h[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                iM4849i = m4849i(i4);
                for (int i5 = 0; i5 < iM4849i2; i5++) {
                    Object[] objArr3 = this.f9690h;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f9690h[iM4849i] = obj3;
                        iM4849i = m4848h(iM4849i);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                int length2 = iM4849i - this.f9689g;
                if (length2 < 0) {
                    length2 += this.f9690h.length;
                }
                this.f9691i = length2;
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f9690h;
        int i3 = this.f9689g;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f9689g = m4848h(i3);
        this.f9691i--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iM4849i = m4849i(AbstractC2003a.m4539l(this) + this.f9689g);
        Object[] objArr = this.f9690h;
        Object obj = objArr[iM4849i];
        objArr[iM4849i] = null;
        this.f9691i--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM4849i;
        AbstractC2364c.m4954e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9690h.length != 0) {
            int iM4849i2 = m4849i(this.f9689g + this.f9691i);
            int i3 = this.f9689g;
            if (i3 < iM4849i2) {
                iM4849i = i3;
                while (i3 < iM4849i2) {
                    Object obj = this.f9690h[i3];
                    if (collection.contains(obj)) {
                        this.f9690h[iM4849i] = obj;
                        iM4849i++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                Object[] objArr = this.f9690h;
                AbstractC2364c.m4954e(objArr, "<this>");
                Arrays.fill(objArr, iM4849i, iM4849i2, (Object) null);
            } else {
                int length = this.f9690h.length;
                int i4 = i3;
                boolean z4 = false;
                while (i3 < length) {
                    Object[] objArr2 = this.f9690h;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f9690h[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                iM4849i = m4849i(i4);
                for (int i5 = 0; i5 < iM4849i2; i5++) {
                    Object[] objArr3 = this.f9690h;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f9690h[iM4849i] = obj3;
                        iM4849i = m4848h(iM4849i);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                int length2 = iM4849i - this.f9689g;
                if (length2 < 0) {
                    length2 += this.f9690h.length;
                }
                this.f9691i = length2;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int i4 = this.f9691i;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
        }
        int iM4849i = m4849i(this.f9689g + i3);
        Object[] objArr = this.f9690h;
        Object obj2 = objArr[iM4849i];
        objArr[iM4849i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9691i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f9691i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC2364c.m4954e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f9691i;
        if (length < i3) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            AbstractC2364c.m4952c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM4849i = m4849i(this.f9689g + this.f9691i);
        int i4 = this.f9689g;
        if (i4 < iM4849i) {
            AbstractC2256b.m4850e0(0, i4, iM4849i, this.f9690h, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9690h;
            AbstractC2256b.m4850e0(0, this.f9689g, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f9690h;
            AbstractC2256b.m4850e0(objArr3.length - this.f9689g, 0, iM4849i, objArr3, objArr);
        }
        int length2 = objArr.length;
        int i5 = this.f9691i;
        if (length2 > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC2364c.m4954e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m4847g(collection.size() + this.f9691i);
        m4846e(m4849i(this.f9689g + this.f9691i), collection);
        return true;
    }
}
