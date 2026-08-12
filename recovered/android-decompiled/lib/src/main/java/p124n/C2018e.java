package p124n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import p105h2.C1725s;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2018e extends C2022i implements Map {

    /* JADX INFO: renamed from: n */
    public C1725s f8766n;

    /* JADX INFO: renamed from: o */
    public C2015b f8767o;

    /* JADX INFO: renamed from: p */
    public C2017d f8768p;

    @Override // java.util.Map
    public final Set entrySet() {
        C1725s c1725s = this.f8766n;
        if (c1725s != null) {
            return c1725s;
        }
        C1725s c1725s2 = new C1725s(this, 2);
        this.f8766n = c1725s2;
        return c1725s2;
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m4571j(int i3, Object[] objArr) {
        int i4 = this.f8791i;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = this.f8790h[(i5 << 1) + i3];
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2015b c2015b = this.f8767o;
        if (c2015b != null) {
            return c2015b;
        }
        C2015b c2015b2 = new C2015b(this);
        this.f8767o = c2015b2;
        return c2015b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f8791i;
        int i3 = this.f8791i;
        int[] iArr = this.f8789g;
        if (iArr.length < size) {
            Object[] objArr = this.f8790h;
            m4585a(size);
            if (this.f8791i > 0) {
                System.arraycopy(iArr, 0, this.f8789g, 0, i3);
                System.arraycopy(objArr, 0, this.f8790h, 0, i3 << 1);
            }
            C2022i.m4584b(iArr, objArr, i3);
        }
        if (this.f8791i != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2017d c2017d = this.f8768p;
        if (c2017d != null) {
            return c2017d;
        }
        C2017d c2017d2 = new C2017d(this);
        this.f8768p = c2017d2;
        return c2017d2;
    }
}
