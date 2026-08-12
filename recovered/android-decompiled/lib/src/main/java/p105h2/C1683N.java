package p105h2;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: renamed from: h2.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1683N extends AbstractC1716k0 implements ListIterator {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7616h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractList f7617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1683N(AbstractList abstractList, ListIterator listIterator, int i3) {
        super(listIterator);
        this.f7616h = i3;
        this.f7617i = abstractList;
    }

    @Override // p105h2.AbstractC1716k0
    /* JADX INFO: renamed from: a */
    public final Object mo4131a(Object obj) {
        switch (this.f7616h) {
            case 0:
                return ((C1684O) this.f7617i).f7619h.apply(obj);
            default:
                return ((C1685P) this.f7617i).f7621h.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f7683g).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f7683g).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo4131a(((ListIterator) this.f7683g).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f7683g).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
