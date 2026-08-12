package p105h2;

import androidx.fragment.app.AbstractC0948N;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import p045P0.AbstractC0462h;
import p101g2.C1585f;
import p101g2.InterfaceC1583d;
import p101g2.InterfaceC1584e;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: h2.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1723q {
    /* JADX INFO: renamed from: a */
    public static void m4152a(int i3, Object[] objArr) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(AbstractC0462h.m1165e(i4, "at index "));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4153b(int i3, String str) {
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i3);
    }

    /* JADX INFO: renamed from: c */
    public static Object m4154c(int i3) {
        if (i3 < 2 || i3 > 1073741824 || Integer.highestOneBit(i3) != i3) {
            throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i3 <= 256) {
            return new byte[i3];
        }
        return i3 <= 65536 ? new short[i3] : new int[i3];
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4155d(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4156e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C1708g0 m4157f(Set set, InterfaceC1584e interfaceC1584e) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C1708g0)) {
                set.getClass();
                return new C1708g0(set, interfaceC1584e);
            }
            C1708g0 c1708g0 = (C1708g0) set;
            InterfaceC1584e interfaceC1584e2 = c1708g0.f7677h;
            interfaceC1584e2.getClass();
            return new C1708g0(c1708g0.f7676g, new C1585f(Arrays.asList(interfaceC1584e2, interfaceC1584e)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C1708g0)) {
            set2.getClass();
            return new C1710h0(set2, interfaceC1584e);
        }
        C1708g0 c1708g1 = (C1708g0) set2;
        InterfaceC1584e interfaceC1584e3 = c1708g1.f7677h;
        interfaceC1584e3.getClass();
        return new C1710h0((SortedSet) c1708g1.f7676g, new C1585f(Arrays.asList(interfaceC1584e3, interfaceC1584e)));
    }

    /* JADX INFO: renamed from: g */
    public static Object m4158g(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: h */
    public static int m4159h(Set set) {
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }

    /* JADX INFO: renamed from: i */
    public static C1706f0 m4160i(AbstractC1679J abstractC1679J, AbstractC1679J abstractC1679J2) {
        if (abstractC1679J == null) {
            throw new NullPointerException("set1");
        }
        if (abstractC1679J2 != null) {
            return new C1706f0(abstractC1679J, abstractC1679J2);
        }
        throw new NullPointerException("set2");
    }

    /* JADX INFO: renamed from: j */
    public static int m4161j(int i3, int i4, int i5) {
        return (i3 & (~i5)) | (i4 & i5);
    }

    /* JADX INFO: renamed from: k */
    public static int m4162k(Object obj, Object obj2, int i3, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM4165n = m4165n(obj);
        int i4 = iM4165n & i3;
        int iM4166o = m4166o(i4, obj3);
        if (iM4166o != 0) {
            int i5 = ~i3;
            int i6 = iM4165n & i5;
            int i7 = -1;
            while (true) {
                int i8 = iM4166o - 1;
                int i9 = iArr[i8];
                if ((i9 & i5) == i6 && AbstractC2003a.m4538k(obj, objArr[i8]) && (objArr2 == null || AbstractC2003a.m4538k(obj2, objArr2[i8]))) {
                    int i10 = i9 & i3;
                    if (i7 == -1) {
                        m4167p(i4, i10, obj3);
                        return i8;
                    }
                    iArr[i7] = m4161j(iArr[i7], i10, i3);
                    return i8;
                }
                int i11 = i9 & i3;
                if (i11 == 0) {
                    break;
                }
                i7 = i8;
                iM4166o = i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static void m4163l(List list, InterfaceC1584e interfaceC1584e, int i3, int i4) {
        for (int size = list.size() - 1; size > i4; size--) {
            if (interfaceC1584e.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            list.remove(i5);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m4164m(int i3) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: n */
    public static int m4165n(Object obj) {
        return m4164m(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: o */
    public static int m4166o(int i3, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i3] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i3] & 65535 : ((int[]) obj)[i3];
    }

    /* JADX INFO: renamed from: p */
    public static void m4167p(int i3, int i4, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i4;
        } else {
            ((int[]) obj)[i3] = i4;
        }
    }

    /* JADX INFO: renamed from: q */
    public static AbstractList m4168q(List list, InterfaceC1583d interfaceC1583d) {
        return AbstractC0948N.m2506a(list) ? new C1684O(list, interfaceC1583d) : new C1685P(list, interfaceC1583d);
    }
}
