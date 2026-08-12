package p105h2;

/* JADX INFO: renamed from: h2.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1696a0 extends AbstractC1679J {

    /* JADX INFO: renamed from: j */
    public final transient C1700c0 f7641j;

    /* JADX INFO: renamed from: k */
    public final transient C1698b0 f7642k;

    public C1696a0(C1700c0 c1700c0, C1698b0 c1698b0) {
        this.f7641j = c1700c0;
        this.f7642k = c1698b0;
    }

    @Override // p105h2.AbstractC1671B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7641j.get(obj) != null;
    }

    @Override // p105h2.AbstractC1679J, p105h2.AbstractC1671B
    /* JADX INFO: renamed from: e */
    public final AbstractC1676G mo4106e() {
        return this.f7642k;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: g */
    public final int mo4107g(int i3, Object[] objArr) {
        return this.f7642k.mo4107g(i3, objArr);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: k */
    public final boolean mo4111k() {
        return true;
    }

    @Override // p105h2.AbstractC1679J
    /* JADX INFO: renamed from: p */
    public final AbstractC1718l0 iterator() {
        return this.f7642k.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7641j.f7657l;
    }
}
