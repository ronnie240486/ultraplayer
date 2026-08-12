package p105h2;

import java.util.Objects;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: h2.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1692X extends AbstractC1676G {

    /* JADX INFO: renamed from: k */
    public static final C1692X f7629k = new C1692X(0, new Object[0]);

    /* JADX INFO: renamed from: i */
    public final transient Object[] f7630i;

    /* JADX INFO: renamed from: j */
    public final transient int f7631j;

    public C1692X(int i3, Object[] objArr) {
        this.f7630i = objArr;
        this.f7631j = i3;
    }

    @Override // p105h2.AbstractC1676G, p105h2.AbstractC1671B
    /* JADX INFO: renamed from: g */
    public final int mo4107g(int i3, Object[] objArr) {
        Object[] objArr2 = this.f7630i;
        int i4 = this.f7631j;
        System.arraycopy(objArr2, 0, objArr, i3, i4);
        return i3 + i4;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0230e.m729g(i3, this.f7631j);
        Object obj = this.f7630i[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: h */
    public final Object[] mo4108h() {
        return this.f7630i;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: i */
    public final int mo4109i() {
        return this.f7631j;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7631j;
    }
}
