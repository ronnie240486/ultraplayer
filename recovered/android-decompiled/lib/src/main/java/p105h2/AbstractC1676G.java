package p105h2;

import androidx.fragment.app.AbstractC0948N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p019G1.AbstractC0230e;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: h2.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1676G extends AbstractC1671B implements List, RandomAccess {

    /* JADX INFO: renamed from: h */
    public static final C1674E f7601h = new C1674E(C1692X.f7629k, 0);

    /* JADX INFO: renamed from: l */
    public static C1692X m4115l(int i3, Object[] objArr) {
        return i3 == 0 ? C1692X.f7629k : new C1692X(i3, objArr);
    }

    /* JADX INFO: renamed from: m */
    public static C1673D m4116m() {
        return new C1673D(4);
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC1676G m4117n(Collection collection) {
        if (!(collection instanceof AbstractC1671B)) {
            Object[] array = collection.toArray();
            AbstractC1723q.m4152a(array.length, array);
            return m4115l(array.length, array);
        }
        AbstractC1676G abstractC1676GMo4106e = ((AbstractC1671B) collection).mo4106e();
        if (!abstractC1676GMo4106e.mo4111k()) {
            return abstractC1676GMo4106e;
        }
        Object[] array2 = abstractC1676GMo4106e.toArray(AbstractC1671B.f7592g);
        return m4115l(array2.length, array2);
    }

    /* JADX INFO: renamed from: o */
    public static C1692X m4118o(Object[] objArr) {
        if (objArr.length == 0) {
            return C1692X.f7629k;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC1723q.m4152a(objArr2.length, objArr2);
        return m4115l(objArr2.length, objArr2);
    }

    /* JADX INFO: renamed from: q */
    public static C1692X m4119q(Long l3, Long l4, Long l5, Long l6, Long l7) {
        Object[] objArr = {l3, l4, l5, l6, l7};
        AbstractC1723q.m4152a(5, objArr);
        return m4115l(5, objArr);
    }

    /* JADX INFO: renamed from: r */
    public static C1692X m4120r(Object obj) {
        Object[] objArr = {obj};
        AbstractC1723q.m4152a(1, objArr);
        return m4115l(1, objArr);
    }

    /* JADX INFO: renamed from: s */
    public static C1692X m4121s(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1723q.m4152a(2, objArr);
        return m4115l(2, objArr);
    }

    /* JADX INFO: renamed from: t */
    public static C1692X m4122t(AbstractC1691W abstractC1691W, List list) {
        abstractC1691W.getClass();
        if (!AbstractC0948N.m2506a(list)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        AbstractC1723q.m4152a(array.length, array);
        Arrays.sort(array, abstractC1691W);
        return m4115l(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p105h2.AbstractC1671B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC2003a.m4538k(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        if (AbstractC2003a.m4538k(get(i3), list.get(i3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: g */
    public int mo4107g(int i3, Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i3 + i4] = get(i4);
        }
        return i3 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 = ~(~(get(i4).hashCode() + (i3 * 31)));
        }
        return i3;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final C1674E listIterator(int i3) {
        AbstractC0230e.m731i(i3, size());
        return isEmpty() ? f7601h : new C1674E(this, i3);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC1676G subList(int i3, int i4) {
        AbstractC0230e.m732j(i3, i4, size());
        int i5 = i4 - i3;
        if (i5 == size()) {
            return this;
        }
        return i5 == 0 ? C1692X.f7629k : new C1675F(this, i3, i5);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: e */
    public final AbstractC1676G mo4106e() {
        return this;
    }
}
