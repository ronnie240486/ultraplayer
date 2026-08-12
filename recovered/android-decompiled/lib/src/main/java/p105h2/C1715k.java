package p105h2;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: h2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1715k extends C1699c implements ListIterator {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1717l f7682k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715k(C1717l c1717l) {
        super(c1717l);
        this.f7682k = c1717l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C1717l c1717l = this.f7682k;
        boolean zIsEmpty = c1717l.isEmpty();
        m4148b().add(obj);
        c1717l.f7689l.f7624k++;
        if (zIsEmpty) {
            c1717l.m4149e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ListIterator m4148b() {
        m4137a();
        return (ListIterator) this.f7648h;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m4148b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m4148b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m4148b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m4148b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m4148b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715k(C1717l c1717l, int i3) {
        super(c1717l, ((List) c1717l.f7685h).listIterator(i3));
        this.f7682k = c1717l;
    }
}
