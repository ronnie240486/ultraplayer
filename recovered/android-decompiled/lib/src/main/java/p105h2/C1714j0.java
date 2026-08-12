package p105h2;

/* JADX INFO: renamed from: h2.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1714j0 extends AbstractC1679J {

    /* JADX INFO: renamed from: j */
    public final transient Object f7681j;

    public C1714j0(Object obj) {
        obj.getClass();
        this.f7681j = obj;
    }

    @Override // p105h2.AbstractC1671B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7681j.equals(obj);
    }

    @Override // p105h2.AbstractC1679J, p105h2.AbstractC1671B
    /* JADX INFO: renamed from: e */
    public final AbstractC1676G mo4106e() {
        return AbstractC1676G.m4120r(this.f7681j);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: g */
    public final int mo4107g(int i3, Object[] objArr) {
        objArr[i3] = this.f7681j;
        return i3 + 1;
    }

    @Override // p105h2.AbstractC1679J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7681j.hashCode();
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: k */
    public final boolean mo4111k() {
        return false;
    }

    @Override // p105h2.AbstractC1679J
    /* JADX INFO: renamed from: p */
    public final AbstractC1718l0 iterator() {
        return new C1682M(this.f7681j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f7681j.toString() + ']';
    }
}
