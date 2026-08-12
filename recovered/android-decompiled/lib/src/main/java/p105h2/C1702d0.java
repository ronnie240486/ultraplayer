package p105h2;

/* JADX INFO: renamed from: h2.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1702d0 extends AbstractC1679J {

    /* JADX INFO: renamed from: o */
    public static final Object[] f7662o;

    /* JADX INFO: renamed from: p */
    public static final C1702d0 f7663p;

    /* JADX INFO: renamed from: j */
    public final transient Object[] f7664j;

    /* JADX INFO: renamed from: k */
    public final transient int f7665k;

    /* JADX INFO: renamed from: l */
    public final transient Object[] f7666l;

    /* JADX INFO: renamed from: m */
    public final transient int f7667m;

    /* JADX INFO: renamed from: n */
    public final transient int f7668n;

    static {
        Object[] objArr = new Object[0];
        f7662o = objArr;
        f7663p = new C1702d0(0, 0, 0, objArr, objArr);
    }

    public C1702d0(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        this.f7664j = objArr;
        this.f7665k = i3;
        this.f7666l = objArr2;
        this.f7667m = i4;
        this.f7668n = i5;
    }

    @Override // p105h2.AbstractC1671B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f7666l;
            if (objArr.length != 0) {
                int iM4165n = AbstractC1723q.m4165n(obj);
                while (true) {
                    int i3 = iM4165n & this.f7667m;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM4165n = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: g */
    public final int mo4107g(int i3, Object[] objArr) {
        Object[] objArr2 = this.f7664j;
        int i4 = this.f7668n;
        System.arraycopy(objArr2, 0, objArr, i3, i4);
        return i3 + i4;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: h */
    public final Object[] mo4108h() {
        return this.f7664j;
    }

    @Override // p105h2.AbstractC1679J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7665k;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: i */
    public final int mo4109i() {
        return this.f7668n;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: j */
    public final int mo4110j() {
        return 0;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: k */
    public final boolean mo4111k() {
        return false;
    }

    @Override // p105h2.AbstractC1679J
    /* JADX INFO: renamed from: o */
    public final AbstractC1676G mo4129o() {
        return AbstractC1676G.m4115l(this.f7668n, this.f7664j);
    }

    @Override // p105h2.AbstractC1679J
    /* JADX INFO: renamed from: p */
    public final AbstractC1718l0 iterator() {
        return mo4106e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7668n;
    }
}
