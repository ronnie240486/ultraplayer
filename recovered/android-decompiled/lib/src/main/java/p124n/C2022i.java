package p124n;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: n.i */
/* JADX INFO: loaded from: classes.dex */
public class C2022i {

    /* JADX INFO: renamed from: j */
    public static Object[] f8785j;

    /* JADX INFO: renamed from: k */
    public static int f8786k;

    /* JADX INFO: renamed from: l */
    public static Object[] f8787l;

    /* JADX INFO: renamed from: m */
    public static int f8788m;

    /* JADX INFO: renamed from: g */
    public int[] f8789g = AbstractC2020g.f8778a;

    /* JADX INFO: renamed from: h */
    public Object[] f8790h = AbstractC2020g.f8779b;

    /* JADX INFO: renamed from: i */
    public int f8791i = 0;

    /* JADX INFO: renamed from: b */
    public static void m4584b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (C2022i.class) {
                try {
                    if (f8788m < 10) {
                        objArr[0] = f8787l;
                        objArr[1] = iArr;
                        for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8787l = objArr;
                        f8788m++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2022i.class) {
                try {
                    if (f8786k < 10) {
                        objArr[0] = f8785j;
                        objArr[1] = iArr;
                        for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f8785j = objArr;
                        f8786k++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4585a(int i3) {
        if (i3 == 8) {
            synchronized (C2022i.class) {
                try {
                    Object[] objArr = f8787l;
                    if (objArr != null) {
                        this.f8790h = objArr;
                        f8787l = (Object[]) objArr[0];
                        this.f8789g = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8788m--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i3 == 4) {
            synchronized (C2022i.class) {
                try {
                    Object[] objArr2 = f8785j;
                    if (objArr2 != null) {
                        this.f8790h = objArr2;
                        f8785j = (Object[]) objArr2[0];
                        this.f8789g = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8786k--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f8789g = new int[i3];
        this.f8790h = new Object[i3 << 1];
    }

    /* JADX INFO: renamed from: c */
    public final int m4586c(int i3, Object obj) {
        int i4 = this.f8791i;
        if (i4 == 0) {
            return -1;
        }
        try {
            int iM4577a = AbstractC2020g.m4577a(i4, i3, this.f8789g);
            if (iM4577a < 0 || obj.equals(this.f8790h[iM4577a << 1])) {
                return iM4577a;
            }
            int i5 = iM4577a + 1;
            while (i5 < i4 && this.f8789g[i5] == i3) {
                if (obj.equals(this.f8790h[i5 << 1])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = iM4577a - 1; i6 >= 0 && this.f8789g[i6] == i3; i6--) {
                if (obj.equals(this.f8790h[i6 << 1])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i3 = this.f8791i;
        if (i3 > 0) {
            int[] iArr = this.f8789g;
            Object[] objArr = this.f8790h;
            this.f8789g = AbstractC2020g.f8778a;
            this.f8790h = AbstractC2020g.f8779b;
            this.f8791i = 0;
            m4584b(iArr, objArr, i3);
        }
        if (this.f8791i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m4587d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m4589f(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m4587d(Object obj) {
        return obj == null ? m4588e() : m4586c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m4588e() {
        int i3 = this.f8791i;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM4577a = AbstractC2020g.m4577a(i3, 0, this.f8789g);
            if (iM4577a < 0 || this.f8790h[iM4577a << 1] == null) {
                return iM4577a;
            }
            int i4 = iM4577a + 1;
            while (i4 < i3 && this.f8789g[i4] == 0) {
                if (this.f8790h[i4 << 1] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM4577a - 1; i5 >= 0 && this.f8789g[i5] == 0; i5--) {
                if (this.f8790h[i5 << 1] == null) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2022i) {
                C2022i c2022i = (C2022i) obj;
                if (this.f8791i != c2022i.f8791i) {
                    return false;
                }
                for (int i3 = 0; i3 < this.f8791i; i3++) {
                    Object objM4590g = m4590g(i3);
                    Object objM4592i = m4592i(i3);
                    Object orDefault = c2022i.getOrDefault(objM4590g, null);
                    if (objM4592i == null) {
                        if (orDefault != null || !c2022i.containsKey(objM4590g)) {
                            return false;
                        }
                    } else if (!objM4592i.equals(orDefault)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f8791i != map.size()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f8791i; i4++) {
                    Object objM4590g2 = m4590g(i4);
                    Object objM4592i2 = m4592i(i4);
                    Object obj2 = map.get(objM4590g2);
                    if (objM4592i2 == null) {
                        if (obj2 != null || !map.containsKey(objM4590g2)) {
                            return false;
                        }
                    } else if (!objM4592i2.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m4589f(Object obj) {
        int i3 = this.f8791i * 2;
        Object[] objArr = this.f8790h;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4590g(int i3) {
        return this.f8790h[i3 << 1];
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM4587d = m4587d(obj);
        return iM4587d >= 0 ? this.f8790h[(iM4587d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m4591h(int i3) {
        Object[] objArr = this.f8790h;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f8791i;
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f8789g;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i3 < i6) {
                int i7 = i3 + 1;
                int i8 = i6 - i3;
                System.arraycopy(iArr, i7, iArr, i3, i8);
                Object[] objArr2 = this.f8790h;
                System.arraycopy(objArr2, i7 << 1, objArr2, i4, i8 << 1);
            }
            Object[] objArr3 = this.f8790h;
            int i9 = i6 << 1;
            objArr3[i9] = null;
            objArr3[i9 + 1] = null;
        } else {
            m4585a(i5 > 8 ? i5 + (i5 >> 1) : 8);
            if (i5 != this.f8791i) {
                throw new ConcurrentModificationException();
            }
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f8789g, 0, i3);
                System.arraycopy(objArr, 0, this.f8790h, 0, i4);
            }
            if (i3 < i6) {
                int i10 = i3 + 1;
                int i11 = i6 - i3;
                System.arraycopy(iArr, i10, this.f8789g, i3, i11);
                System.arraycopy(objArr, i10 << 1, this.f8790h, i4, i11 << 1);
            }
        }
        if (i5 != this.f8791i) {
            throw new ConcurrentModificationException();
        }
        this.f8791i = i6;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f8789g;
        Object[] objArr = this.f8790h;
        int i3 = this.f8791i;
        int i4 = 1;
        int i5 = 0;
        int iHashCode = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m4592i(int i3) {
        return this.f8790h[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f8791i <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int iM4586c;
        int i4 = this.f8791i;
        if (obj == null) {
            iM4586c = m4588e();
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iM4586c = m4586c(iHashCode, obj);
        }
        if (iM4586c >= 0) {
            int i5 = (iM4586c << 1) + 1;
            Object[] objArr = this.f8790h;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~iM4586c;
        int[] iArr = this.f8789g;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.f8790h;
            m4585a(i7);
            if (i4 != this.f8791i) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8789g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f8790h, 0, objArr2.length);
            }
            m4584b(iArr, objArr2, i4);
        }
        if (i6 < i4) {
            int[] iArr3 = this.f8789g;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f8790h;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f8791i - i6) << 1);
        }
        int i9 = this.f8791i;
        if (i4 == i9) {
            int[] iArr4 = this.f8789g;
            if (i6 < iArr4.length) {
                iArr4[i6] = i3;
                Object[] objArr4 = this.f8790h;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f8791i = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iM4587d = m4587d(obj);
        if (iM4587d >= 0) {
            return m4591h(iM4587d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM4587d = m4587d(obj);
        if (iM4587d < 0) {
            return null;
        }
        int i3 = (iM4587d << 1) + 1;
        Object[] objArr = this.f8790h;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f8791i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8791i * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8791i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objM4590g = m4590g(i3);
            if (objM4590g != this) {
                sb.append(objM4590g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM4592i = m4592i(i3);
            if (objM4592i != this) {
                sb.append(objM4592i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM4587d = m4587d(obj);
        if (iM4587d < 0) {
            return false;
        }
        Object objM4592i = m4592i(iM4587d);
        if (obj2 != objM4592i && (obj2 == null || !obj2.equals(objM4592i))) {
            return false;
        }
        m4591h(iM4587d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM4587d = m4587d(obj);
        if (iM4587d < 0) {
            return false;
        }
        Object objM4592i = m4592i(iM4587d);
        if (objM4592i != obj2 && (obj2 == null || !obj2.equals(objM4592i))) {
            return false;
        }
        int i3 = (iM4587d << 1) + 1;
        Object[] objArr = this.f8790h;
        Object obj4 = objArr[i3];
        objArr[i3] = obj3;
        return true;
    }
}
