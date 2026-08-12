package p105h2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: h2.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1679J extends AbstractC1671B implements Set {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f7605i = 0;

    /* JADX INFO: renamed from: h */
    public transient AbstractC1676G f7606h;

    /* JADX INFO: renamed from: l */
    public static int m4126l(int i3) {
        int iMax = Math.max(i3, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC1679J m4127m(int i3, Object... objArr) {
        if (i3 == 0) {
            return C1702d0.f7663p;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C1714j0(obj);
        }
        int iM4126l = m4126l(i3);
        Object[] objArr2 = new Object[iM4126l];
        int i4 = iM4126l - 1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0462h.m1165e(i7, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM4164m = AbstractC1723q.m4164m(iHashCode);
            while (true) {
                int i8 = iM4164m & i4;
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
                iM4164m++;
            }
        }
        Arrays.fill(objArr, i6, i3, (Object) null);
        if (i6 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C1714j0(obj4);
        }
        if (m4126l(i6) < iM4126l / 2) {
            return m4127m(i6, objArr);
        }
        int length = objArr.length;
        if (i6 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i6);
        }
        return new C1702d0(i5, i4, i6, objArr, objArr2);
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC1679J m4128n(Collection collection) {
        if ((collection instanceof AbstractC1679J) && !(collection instanceof SortedSet)) {
            AbstractC1679J abstractC1679J = (AbstractC1679J) collection;
            if (!abstractC1679J.mo4111k()) {
                return abstractC1679J;
            }
        }
        Object[] array = collection.toArray();
        return m4127m(array.length, array);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: e */
    public AbstractC1676G mo4106e() {
        AbstractC1676G abstractC1676G = this.f7606h;
        if (abstractC1676G != null) {
            return abstractC1676G;
        }
        AbstractC1676G abstractC1676GMo4129o = mo4129o();
        this.f7606h = abstractC1676GMo4129o;
        return abstractC1676GMo4129o;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1679J) && (this instanceof C1702d0)) {
            AbstractC1679J abstractC1679J = (AbstractC1679J) obj;
            abstractC1679J.getClass();
            if ((abstractC1679J instanceof C1702d0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC1723q.m4156e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC1723q.m4159h(this);
    }

    /* JADX INFO: renamed from: o */
    public AbstractC1676G mo4129o() {
        Object[] array = toArray(AbstractC1671B.f7592g);
        C1674E c1674e = AbstractC1676G.f7601h;
        return AbstractC1676G.m4115l(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC1718l0 iterator();
}
