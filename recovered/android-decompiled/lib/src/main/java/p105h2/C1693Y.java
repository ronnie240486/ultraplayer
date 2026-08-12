package p105h2;

import java.util.AbstractMap;
import java.util.Objects;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: h2.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1693Y extends AbstractC1676G {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1694Z f7632i;

    public C1693Y(C1694Z c1694z) {
        this.f7632i = c1694z;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        C1694Z c1694z = this.f7632i;
        AbstractC0230e.m729g(i3, c1694z.f7635l);
        int i4 = i3 * 2;
        Object[] objArr = c1694z.f7634k;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: k */
    public final boolean mo4111k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7632i.f7635l;
    }
}
