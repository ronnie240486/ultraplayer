package p105h2;

import java.util.Objects;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: h2.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1698b0 extends AbstractC1676G {

    /* JADX INFO: renamed from: i */
    public final transient Object[] f7644i;

    /* JADX INFO: renamed from: j */
    public final transient int f7645j;

    /* JADX INFO: renamed from: k */
    public final transient int f7646k;

    public C1698b0(Object[] objArr, int i3, int i4) {
        this.f7644i = objArr;
        this.f7645j = i3;
        this.f7646k = i4;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0230e.m729g(i3, this.f7646k);
        Object obj = this.f7644i[(i3 * 2) + this.f7645j];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: k */
    public final boolean mo4111k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7646k;
    }
}
