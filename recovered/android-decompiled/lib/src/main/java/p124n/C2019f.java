package p124n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2019f implements Collection, Set {

    /* JADX INFO: renamed from: j */
    public static Object[] f8769j;

    /* JADX INFO: renamed from: k */
    public static int f8770k;

    /* JADX INFO: renamed from: l */
    public static Object[] f8771l;

    /* JADX INFO: renamed from: m */
    public static int f8772m;

    /* JADX INFO: renamed from: n */
    public static final Object f8773n = new Object();

    /* JADX INFO: renamed from: o */
    public static final Object f8774o = new Object();

    /* JADX INFO: renamed from: g */
    public int[] f8775g;

    /* JADX INFO: renamed from: h */
    public Object[] f8776h;

    /* JADX INFO: renamed from: i */
    public int f8777i;

    public C2019f(int i3) {
        if (i3 == 0) {
            this.f8775g = AbstractC2020g.f8778a;
            this.f8776h = AbstractC2020g.f8779b;
        } else {
            m4573e(i3);
        }
        this.f8777i = 0;
    }

    /* JADX INFO: renamed from: g */
    public static void m4572g(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (f8774o) {
                try {
                    if (f8772m < 10) {
                        objArr[0] = f8771l;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8771l = objArr;
                        f8772m++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f8773n) {
                try {
                    if (f8770k < 10) {
                        objArr[0] = f8769j;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f8769j = objArr;
                        f8770k++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int iM4574h;
        int i4 = this.f8777i;
        if (obj == null) {
            iM4574h = m4575i();
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iM4574h = m4574h(iHashCode, obj);
        }
        if (iM4574h >= 0) {
            return false;
        }
        int i5 = ~iM4574h;
        int[] iArr = this.f8775g;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f8776h;
            m4573e(i6);
            if (i4 != this.f8777i) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8775g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8776h, 0, objArr.length);
            }
            m4572g(iArr, objArr, i4);
        }
        if (i5 < i4) {
            int[] iArr3 = this.f8775g;
            int i7 = i5 + 1;
            int i8 = i4 - i5;
            System.arraycopy(iArr3, i5, iArr3, i7, i8);
            Object[] objArr2 = this.f8776h;
            System.arraycopy(objArr2, i5, objArr2, i7, i8);
        }
        int i9 = this.f8777i;
        if (i4 == i9) {
            int[] iArr4 = this.f8775g;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.f8776h[i5] = obj;
                this.f8777i = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f8777i;
        int i3 = this.f8777i;
        int[] iArr = this.f8775g;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8776h;
            m4573e(size);
            int i4 = this.f8777i;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f8775g, 0, i4);
                System.arraycopy(objArr, 0, this.f8776h, 0, this.f8777i);
            }
            m4572g(iArr, objArr, this.f8777i);
        }
        if (this.f8777i != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i3 = this.f8777i;
        if (i3 != 0) {
            int[] iArr = this.f8775g;
            Object[] objArr = this.f8776h;
            this.f8775g = AbstractC2020g.f8778a;
            this.f8776h = AbstractC2020g.f8779b;
            this.f8777i = 0;
            m4572g(iArr, objArr, i3);
        }
        if (this.f8777i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m4575i() : m4574h(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m4573e(int i3) {
        if (i3 == 8) {
            synchronized (f8774o) {
                try {
                    Object[] objArr = f8771l;
                    if (objArr != null) {
                        try {
                            this.f8776h = objArr;
                            f8771l = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f8775g = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f8772m--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f8771l = null;
                        f8772m = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i3 == 4) {
            synchronized (f8773n) {
                try {
                    Object[] objArr2 = f8769j;
                    if (objArr2 != null) {
                        try {
                            this.f8776h = objArr2;
                            f8769j = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f8775g = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f8770k--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f8769j = null;
                        f8770k = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f8775g = new int[i3];
        this.f8776h = new Object[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f8777i != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f8777i; i3++) {
                try {
                    if (!set.contains(this.f8776h[i3])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final int m4574h(int i3, Object obj) {
        int i4 = this.f8777i;
        if (i4 == 0) {
            return -1;
        }
        try {
            int iM4577a = AbstractC2020g.m4577a(i4, i3, this.f8775g);
            if (iM4577a < 0 || obj.equals(this.f8776h[iM4577a])) {
                return iM4577a;
            }
            int i5 = iM4577a + 1;
            while (i5 < i4 && this.f8775g[i5] == i3) {
                if (obj.equals(this.f8776h[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = iM4577a - 1; i6 >= 0 && this.f8775g[i6] == i3; i6--) {
                if (obj.equals(this.f8776h[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8775g;
        int i3 = this.f8777i;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    /* JADX INFO: renamed from: i */
    public final int m4575i() {
        int i3 = this.f8777i;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM4577a = AbstractC2020g.m4577a(i3, 0, this.f8775g);
            if (iM4577a < 0 || this.f8776h[iM4577a] == null) {
                return iM4577a;
            }
            int i4 = iM4577a + 1;
            while (i4 < i3 && this.f8775g[i4] == 0) {
                if (this.f8776h[i4] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM4577a - 1; i5 >= 0 && this.f8775g[i5] == 0; i5--) {
                if (this.f8776h[i5] == null) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8777i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2014a(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m4576j(int i3) {
        int i4 = this.f8777i;
        Object[] objArr = this.f8776h;
        Object obj = objArr[i3];
        if (i4 <= 1) {
            clear();
            return;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f8775g;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i3 < i5) {
                int i6 = i3 + 1;
                int i7 = i5 - i3;
                System.arraycopy(iArr, i6, iArr, i3, i7);
                Object[] objArr2 = this.f8776h;
                System.arraycopy(objArr2, i6, objArr2, i3, i7);
            }
            this.f8776h[i5] = null;
        } else {
            m4573e(i4 > 8 ? i4 + (i4 >> 1) : 8);
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f8775g, 0, i3);
                System.arraycopy(objArr, 0, this.f8776h, 0, i3);
            }
            if (i3 < i5) {
                int i8 = i3 + 1;
                int i9 = i5 - i3;
                System.arraycopy(iArr, i8, this.f8775g, i3, i9);
                System.arraycopy(objArr, i8, this.f8776h, i3, i9);
            }
        }
        if (i4 != this.f8777i) {
            throw new ConcurrentModificationException();
        }
        this.f8777i = i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM4575i = obj == null ? m4575i() : m4574h(obj.hashCode(), obj);
        if (iM4575i < 0) {
            return false;
        }
        m4576j(iM4575i);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i3 = this.f8777i - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f8776h[i3])) {
                m4576j(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8777i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i3 = this.f8777i;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f8776h, 0, objArr, 0, i3);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8777i * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8777i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8776h[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f8777i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f8777i);
        }
        System.arraycopy(this.f8776h, 0, objArr, 0, this.f8777i);
        int length = objArr.length;
        int i3 = this.f8777i;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
