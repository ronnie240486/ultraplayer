package p105h2;

import java.util.Objects;

/* JADX INFO: renamed from: h2.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1678I extends AbstractC1670A {
    @Override // p105h2.AbstractC1670A
    /* JADX INFO: renamed from: b */
    public final AbstractC1670A mo4103b(Object obj) {
        obj.getClass();
        m4102a(obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1679J m4125f() {
        int i3 = this.f7590b;
        if (i3 == 0) {
            int i4 = AbstractC1679J.f7605i;
            return C1702d0.f7663p;
        }
        if (i3 != 1) {
            AbstractC1679J abstractC1679JM4127m = AbstractC1679J.m4127m(i3, this.f7589a);
            this.f7590b = abstractC1679JM4127m.size();
            this.f7591c = true;
            return abstractC1679JM4127m;
        }
        Object obj = this.f7589a[0];
        Objects.requireNonNull(obj);
        int i5 = AbstractC1679J.f7605i;
        return new C1714j0(obj);
    }
}
