package p105h2;

import java.util.Comparator;

/* JADX INFO: renamed from: h2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1729w extends AbstractC1731y {
    /* JADX INFO: renamed from: f */
    public static AbstractC1731y m4181f(int i3) {
        if (i3 < 0) {
            return AbstractC1731y.f7721b;
        }
        return i3 > 0 ? AbstractC1731y.f7722c : AbstractC1731y.f7720a;
    }

    @Override // p105h2.AbstractC1731y
    /* JADX INFO: renamed from: a */
    public final AbstractC1731y mo4182a(int i3, int i4) {
        return m4181f(Integer.compare(i3, i4));
    }

    @Override // p105h2.AbstractC1731y
    /* JADX INFO: renamed from: b */
    public final AbstractC1731y mo4183b(Object obj, Object obj2, Comparator comparator) {
        return m4181f(comparator.compare(obj, obj2));
    }

    @Override // p105h2.AbstractC1731y
    /* JADX INFO: renamed from: c */
    public final AbstractC1731y mo4184c(boolean z3, boolean z4) {
        return m4181f(Boolean.compare(z3, z4));
    }

    @Override // p105h2.AbstractC1731y
    /* JADX INFO: renamed from: d */
    public final AbstractC1731y mo4185d(boolean z3, boolean z4) {
        return m4181f(Boolean.compare(z4, z3));
    }

    @Override // p105h2.AbstractC1731y
    /* JADX INFO: renamed from: e */
    public final int mo4186e() {
        return 0;
    }
}
