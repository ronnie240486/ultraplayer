package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p045P0.AbstractC0462h;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1189J extends AbstractC1169E implements Set {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f5642i = 0;

    /* JADX INFO: renamed from: h */
    public transient AbstractC1181H f5643h;

    /* JADX INFO: renamed from: j */
    public static int m3147j(int i3) {
        int iMax = Math.max(i3, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC1189J m3148k(int i3, Object... objArr) {
        if (i3 == 0) {
            return C1228T.f5705p;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new C1232U(obj);
        }
        int iM3147j = m3147j(i3);
        Object[] objArr2 = new Object[iM3147j];
        int i4 = iM3147j - 1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0462h.m1165e(i7, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM4549v = AbstractC2003a.m4549v(iHashCode);
            while (true) {
                int i8 = iM4549v & i4;
                Object obj3 = objArr2[i8];
                if (obj3 == null) {
                    objArr[i6] = obj2;
                    objArr2[i8] = obj2;
                    i5 += iHashCode;
                    i6++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM4549v++;
            }
        }
        Arrays.fill(objArr, i6, i3, (Object) null);
        if (i6 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C1232U(obj4);
        }
        if (m3147j(i6) < iM3147j / 2) {
            return m3148k(i6, objArr);
        }
        int length = objArr.length;
        if (i6 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i6);
        }
        return new C1228T(i5, i4, i6, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1189J) && (this instanceof C1228T)) {
            AbstractC1189J abstractC1189J = (AbstractC1189J) obj;
            abstractC1189J.getClass();
            if ((abstractC1189J instanceof C1228T) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
