package p105h2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: h2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1727u extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: p */
    public static final Object f7708p = new Object();

    /* JADX INFO: renamed from: g */
    public transient Object f7709g;

    /* JADX INFO: renamed from: h */
    public transient int[] f7710h;

    /* JADX INFO: renamed from: i */
    public transient Object[] f7711i;

    /* JADX INFO: renamed from: j */
    public transient Object[] f7712j;

    /* JADX INFO: renamed from: k */
    public transient int f7713k;

    /* JADX INFO: renamed from: l */
    public transient int f7714l;

    /* JADX INFO: renamed from: m */
    public transient C1725s f7715m;

    /* JADX INFO: renamed from: n */
    public transient C1725s f7716n;

    /* JADX INFO: renamed from: o */
    public transient C1720n f7717o;

    /* JADX INFO: renamed from: a */
    public static C1727u m4170a(int i3) {
        C1727u c1727u = new C1727u();
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c1727u.f7713k = Math.min(Math.max(i3, 1), 1073741823);
        return c1727u;
    }

    /* JADX INFO: renamed from: b */
    public final Map m4171b() {
        Object obj = this.f7709g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m4172c() {
        return (1 << (this.f7713k & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m4175f()) {
            return;
        }
        this.f7713k += 32;
        Map mapM4171b = m4171b();
        if (mapM4171b != null) {
            this.f7713k = Math.min(Math.max(size(), 3), 1073741823);
            mapM4171b.clear();
            this.f7709g = null;
            this.f7714l = 0;
            return;
        }
        Arrays.fill(m4178i(), 0, this.f7714l, (Object) null);
        Arrays.fill(m4179j(), 0, this.f7714l, (Object) null);
        Object obj = this.f7709g;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m4177h(), 0, this.f7714l, 0);
        this.f7714l = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM4171b = m4171b();
        if (mapM4171b != null) {
            return mapM4171b.containsKey(obj);
        }
        return m4173d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM4171b = m4171b();
        if (mapM4171b != null) {
            return mapM4171b.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f7714l; i3++) {
            if (AbstractC2003a.m4538k(obj, m4179j()[i3])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m4173d(Object obj) {
        if (m4175f()) {
            return -1;
        }
        int iM4165n = AbstractC1723q.m4165n(obj);
        int iM4172c = m4172c();
        Object obj2 = this.f7709g;
        Objects.requireNonNull(obj2);
        int iM4166o = AbstractC1723q.m4166o(iM4165n & iM4172c, obj2);
        if (iM4166o == 0) {
            return -1;
        }
        int i3 = ~iM4172c;
        int i4 = iM4165n & i3;
        do {
            int i5 = iM4166o - 1;
            int i6 = m4177h()[i5];
            if ((i6 & i3) == i4 && AbstractC2003a.m4538k(obj, m4178i()[i5])) {
                return i5;
            }
            iM4166o = i6 & iM4172c;
        } while (iM4166o != 0);
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m4174e(int i3, int i4) {
        Object obj = this.f7709g;
        Objects.requireNonNull(obj);
        int[] iArrM4177h = m4177h();
        Object[] objArrM4178i = m4178i();
        Object[] objArrM4179j = m4179j();
        int size = size();
        int i5 = size - 1;
        if (i3 >= i5) {
            objArrM4178i[i3] = null;
            objArrM4179j[i3] = null;
            iArrM4177h[i3] = 0;
            return;
        }
        Object obj2 = objArrM4178i[i5];
        objArrM4178i[i3] = obj2;
        objArrM4179j[i3] = objArrM4179j[i5];
        objArrM4178i[i5] = null;
        objArrM4179j[i5] = null;
        iArrM4177h[i3] = iArrM4177h[i5];
        iArrM4177h[i5] = 0;
        int iM4165n = AbstractC1723q.m4165n(obj2) & i4;
        int iM4166o = AbstractC1723q.m4166o(iM4165n, obj);
        if (iM4166o == size) {
            AbstractC1723q.m4167p(iM4165n, i3 + 1, obj);
            return;
        }
        while (true) {
            int i6 = iM4166o - 1;
            int i7 = iArrM4177h[i6];
            int i8 = i7 & i4;
            if (i8 == size) {
                iArrM4177h[i6] = AbstractC1723q.m4161j(i7, i3 + 1, i4);
                return;
            }
            iM4166o = i8;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1725s c1725s = this.f7716n;
        if (c1725s != null) {
            return c1725s;
        }
        C1725s c1725s2 = new C1725s(this, 0);
        this.f7716n = c1725s2;
        return c1725s2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4175f() {
        return this.f7709g == null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4176g(Object obj) {
        boolean zM4175f = m4175f();
        Object obj2 = f7708p;
        if (!zM4175f) {
            int iM4172c = m4172c();
            Object obj3 = this.f7709g;
            Objects.requireNonNull(obj3);
            int iM4162k = AbstractC1723q.m4162k(obj, null, iM4172c, obj3, m4177h(), m4178i(), null);
            if (iM4162k != -1) {
                Object obj4 = m4179j()[iM4162k];
                m4174e(iM4162k, iM4172c);
                this.f7714l--;
                this.f7713k += 32;
                return obj4;
            }
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM4171b = m4171b();
        if (mapM4171b != null) {
            return mapM4171b.get(obj);
        }
        int iM4173d = m4173d(obj);
        if (iM4173d == -1) {
            return null;
        }
        return m4179j()[iM4173d];
    }

    /* JADX INFO: renamed from: h */
    public final int[] m4177h() {
        int[] iArr = this.f7710h;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public final Object[] m4178i() {
        Object[] objArr = this.f7711i;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m4179j() {
        Object[] objArr = this.f7712j;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: k */
    public final int m4180k(int i3, int i4, int i5, int i6) {
        Object objM4154c = AbstractC1723q.m4154c(i4);
        int i7 = i4 - 1;
        if (i6 != 0) {
            AbstractC1723q.m4167p(i5 & i7, i6 + 1, objM4154c);
        }
        Object obj = this.f7709g;
        Objects.requireNonNull(obj);
        int[] iArrM4177h = m4177h();
        for (int i8 = 0; i8 <= i3; i8++) {
            int iM4166o = AbstractC1723q.m4166o(i8, obj);
            while (iM4166o != 0) {
                int i9 = iM4166o - 1;
                int i10 = iArrM4177h[i9];
                int i11 = ((~i3) & i10) | i8;
                int i12 = i11 & i7;
                int iM4166o2 = AbstractC1723q.m4166o(i12, objM4154c);
                AbstractC1723q.m4167p(i12, iM4166o, objM4154c);
                iArrM4177h[i9] = AbstractC1723q.m4161j(i11, iM4166o2, i7);
                iM4166o = i10 & i3;
            }
        }
        this.f7709g = objM4154c;
        this.f7713k = AbstractC1723q.m4161j(this.f7713k, 32 - Integer.numberOfLeadingZeros(i7), 31);
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1725s c1725s = this.f7715m;
        if (c1725s != null) {
            return c1725s;
        }
        C1725s c1725s2 = new C1725s(this, 1);
        this.f7715m = c1725s2;
        return c1725s2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107 A[LOOP:1: B:43:0x00f0->B:46:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb A[EDGE_INSN: B:67:0x00eb->B:41:0x00eb BREAK  A[LOOP:1: B:43:0x00f0->B:46:0x0107], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0105 -> B:41:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p105h2.C1727u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM4171b = m4171b();
        if (mapM4171b != null) {
            return mapM4171b.remove(obj);
        }
        Object objM4176g = m4176g(obj);
        if (objM4176g == f7708p) {
            return null;
        }
        return objM4176g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM4171b = m4171b();
        return mapM4171b != null ? mapM4171b.size() : this.f7714l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1720n c1720n = this.f7717o;
        if (c1720n != null) {
            return c1720n;
        }
        C1720n c1720n2 = new C1720n(1, this);
        this.f7717o = c1720n2;
        return c1720n2;
    }
}
