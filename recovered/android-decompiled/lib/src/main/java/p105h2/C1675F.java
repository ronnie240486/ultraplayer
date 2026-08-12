package p105h2;

import java.util.Iterator;
import java.util.ListIterator;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: h2.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1675F extends AbstractC1676G {

    /* JADX INFO: renamed from: i */
    public final transient int f7598i;

    /* JADX INFO: renamed from: j */
    public final transient int f7599j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC1676G f7600k;

    public C1675F(AbstractC1676G abstractC1676G, int i3, int i4) {
        this.f7600k = abstractC1676G;
        this.f7598i = i3;
        this.f7599j = i4;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0230e.m729g(i3, this.f7599j);
        return this.f7600k.get(i3 + this.f7598i);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: h */
    public final Object[] mo4108h() {
        return this.f7600k.mo4108h();
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: i */
    public final int mo4109i() {
        return this.f7600k.mo4110j() + this.f7598i + this.f7599j;
    }

    @Override // p105h2.AbstractC1676G, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: j */
    public final int mo4110j() {
        return this.f7600k.mo4110j() + this.f7598i;
    }

    @Override // p105h2.AbstractC1671B
    /* JADX INFO: renamed from: k */
    public final boolean mo4111k() {
        return true;
    }

    @Override // p105h2.AbstractC1676G, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7599j;
    }

    @Override // p105h2.AbstractC1676G, java.util.List
    /* JADX INFO: renamed from: u */
    public final AbstractC1676G subList(int i3, int i4) {
        AbstractC0230e.m732j(i3, i4, this.f7599j);
        int i5 = this.f7598i;
        return this.f7600k.subList(i3 + i5, i4 + i5);
    }

    @Override // p105h2.AbstractC1676G, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
        return listIterator(i3);
    }
}
