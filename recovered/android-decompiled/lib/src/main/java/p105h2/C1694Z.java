package p105h2;

import java.util.Map;

/* JADX INFO: renamed from: h2.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C1694Z extends AbstractC1679J {

    /* JADX INFO: renamed from: j */
    public final transient C1700c0 f7633j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f7634k;

    /* JADX INFO: renamed from: l */
    public final transient int f7635l;

    public C1694Z(C1700c0 c1700c0, Object[] objArr, int i3) {
        this.f7633j = c1700c0;
        this.f7634k = objArr;
        this.f7635l = i3;
    }

    @Override // p105h2.AbstractC1671B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7633j.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: g */
    public final int mo4107g(int i3, Object[] objArr) {
        return mo4106e().mo4107g(i3, objArr);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: k */
    public final boolean mo4111k() {
        return true;
    }

    @Override // p105h2.AbstractC1679J
    /* JADX INFO: renamed from: o */
    public final AbstractC1676G mo4129o() {
        return new C1693Y(this);
    }

    @Override // p105h2.AbstractC1679J
    /* JADX INFO: renamed from: p */
    public final AbstractC1718l0 iterator() {
        return mo4106e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7635l;
    }
}
