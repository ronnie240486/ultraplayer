package p105h2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p036M0.C0380q;

/* JADX INFO: renamed from: h2.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1700c0 implements Map, Serializable {

    /* JADX INFO: renamed from: m */
    public static final C1700c0 f7651m = new C1700c0(null, new Object[0], 0);

    /* JADX INFO: renamed from: g */
    public transient C1694Z f7652g;

    /* JADX INFO: renamed from: h */
    public transient C1696a0 f7653h;

    /* JADX INFO: renamed from: i */
    public transient C1698b0 f7654i;

    /* JADX INFO: renamed from: j */
    public final transient Object f7655j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f7656k;

    /* JADX INFO: renamed from: l */
    public final transient int f7657l;

    public C1700c0(Object obj, Object[] objArr, int i3) {
        this.f7655j = obj;
        this.f7656k = objArr;
        this.f7657l = i3;
    }

    /* JADX INFO: renamed from: a */
    public static C1700c0 m4138a(Map map) {
        if ((map instanceof C1700c0) && !(map instanceof SortedMap)) {
            C1700c0 c1700c0 = (C1700c0) map;
            c1700c0.getClass();
            return c1700c0;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z3 = setEntrySet != null;
        C0380q c0380q = new C0380q(z3 ? setEntrySet.size() : 4, 5);
        if (z3) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) c0380q.f1292i;
            if (size > objArr.length) {
                c0380q.f1292i = Arrays.copyOf(objArr, AbstractC1670A.m4101e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c0380q.m1051n(entry.getKey(), entry.getValue());
        }
        return c0380q.m1042a();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1679J entrySet() {
        C1694Z c1694z = this.f7652g;
        if (c1694z != null) {
            return c1694z;
        }
        C1694Z c1694z2 = new C1694Z(this, this.f7656k, this.f7657l);
        this.f7652g = c1694z2;
        return c1694z2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C1698b0 c1698b0 = this.f7654i;
        if (c1698b0 == null) {
            c1698b0 = new C1698b0(this.f7656k, 1, this.f7657l);
            this.f7654i = c1698b0;
        }
        return c1698b0.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC1723q.m4155d(this, obj);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f7656k;
            if (this.f7657l == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f7655j;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM4164m = AbstractC1723q.m4164m(obj.hashCode());
                    while (true) {
                        int i3 = iM4164m & length;
                        int i4 = bArr[i3] & 255;
                        if (i4 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iM4164m = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM4164m2 = AbstractC1723q.m4164m(obj.hashCode());
                    while (true) {
                        int i5 = iM4164m2 & length2;
                        int i6 = sArr[i5] & 65535;
                        if (i6 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iM4164m2 = i5 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM4164m3 = AbstractC1723q.m4164m(obj.hashCode());
                    while (true) {
                        int i7 = iM4164m3 & length3;
                        int i8 = iArr[i7];
                        if (i8 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i8])) {
                            obj2 = objArr[i8 ^ 1];
                        } else {
                            iM4164m3 = i7 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1723q.m4159h(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1696a0 c1696a0 = this.f7653h;
        if (c1696a0 != null) {
            return c1696a0;
        }
        C1696a0 c1696a1 = new C1696a0(this, new C1698b0(this.f7656k, 0, this.f7657l));
        this.f7653h = c1696a1;
        return c1696a1;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7657l;
    }

    public final String toString() {
        int i3 = this.f7657l;
        AbstractC1723q.m4153b(i3, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i3) * 8, 1073741824L));
        sb.append('{');
        AbstractC1718l0 it = ((C1694Z) entrySet()).iterator();
        boolean z3 = true;
        while (true) {
            C1674E c1674e = (C1674E) it;
            if (!c1674e.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c1674e.next();
            if (!z3) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z3 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1698b0 c1698b0 = this.f7654i;
        if (c1698b0 != null) {
            return c1698b0;
        }
        C1698b0 c1698b1 = new C1698b0(this.f7656k, 1, this.f7657l);
        this.f7654i = c1698b1;
        return c1698b1;
    }
}
