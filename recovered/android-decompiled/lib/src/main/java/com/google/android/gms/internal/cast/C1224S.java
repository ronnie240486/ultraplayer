package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p045P0.AbstractC0462h;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1224S implements Map, Serializable {

    /* JADX INFO: renamed from: m */
    public static final C1224S f5691m = new C1224S(null, new Object[0], 0);

    /* JADX INFO: renamed from: g */
    public transient C1205N f5692g;

    /* JADX INFO: renamed from: h */
    public transient C1213P f5693h;

    /* JADX INFO: renamed from: i */
    public transient C1217Q f5694i;

    /* JADX INFO: renamed from: j */
    public final transient Object f5695j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f5696k;

    /* JADX INFO: renamed from: l */
    public final transient int f5697l;

    public C1224S(Object obj, Object[] objArr, int i3) {
        this.f5695j = obj;
        this.f5696k = objArr;
        this.f5697l = i3;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v6 short[], r4v11 ??, r4v7 ??, r4v8 byte[], r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:676)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    /* JADX INFO: renamed from: a */
    public static void m3192a(java.util.Set r18) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C1224S.m3192a(java.util.Set):void");
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
        C1217Q c1217q = this.f5694i;
        if (c1217q == null) {
            c1217q = new C1217Q(this.f5696k, 1, this.f5697l);
            this.f5694i = c1217q;
        }
        return c1217q.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1205N c1205n = this.f5692g;
        if (c1205n != null) {
            return c1205n;
        }
        C1205N c1205n2 = new C1205N(this, this.f5696k, this.f5697l);
        this.f5692g = c1205n2;
        return c1205n2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i3 = this.f5697l;
            Object[] objArr = this.f5696k;
            if (i3 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f5695j;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM4549v = AbstractC2003a.m4549v(obj.hashCode());
                    while (true) {
                        int i4 = iM4549v & length;
                        int i5 = bArr[i4] & 255;
                        if (i5 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iM4549v = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM4549v2 = AbstractC2003a.m4549v(obj.hashCode());
                    while (true) {
                        int i6 = iM4549v2 & length2;
                        char c = (char) sArr[i6];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iM4549v2 = i6 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM4549v3 = AbstractC2003a.m4549v(obj.hashCode());
                    while (true) {
                        int i7 = iM4549v3 & length3;
                        int i8 = iArr[i7];
                        if (i8 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i8])) {
                            obj2 = objArr[i8 ^ 1];
                        } else {
                            iM4549v3 = i7 + 1;
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
        C1205N c1205n = this.f5692g;
        if (c1205n == null) {
            c1205n = new C1205N(this, this.f5696k, this.f5697l);
            this.f5692g = c1205n;
        }
        Iterator it = c1205n.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1213P c1213p = this.f5693h;
        if (c1213p != null) {
            return c1213p;
        }
        C1213P c1213p2 = new C1213P(this, new C1217Q(this.f5696k, 0, this.f5697l));
        this.f5693h = c1213p2;
        return c1213p2;
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
        return this.f5697l;
    }

    public final String toString() {
        int i3 = this.f5697l;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i3) * 8, 1073741824L));
        sb.append('{');
        boolean z3 = true;
        for (Map.Entry entry : (C1205N) entrySet()) {
            if (!z3) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z3 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C1217Q c1217q = this.f5694i;
        if (c1217q != null) {
            return c1217q;
        }
        C1217Q c1217q2 = new C1217Q(this.f5696k, 1, this.f5697l);
        this.f5694i = c1217q2;
        return c1217q2;
    }
}
