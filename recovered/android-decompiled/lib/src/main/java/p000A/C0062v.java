package p000A;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: A.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0062v implements Iterator {

    /* JADX INFO: renamed from: g */
    public final ArrayList f84g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public Iterator f85h;

    public C0062v(C0021W c0021w) {
        this.f85h = c0021w;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f85h.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C0021W c0021w = viewGroup != null ? new C0021W(viewGroup) : null;
        ArrayList arrayList = this.f84g;
        if (c0021w != null && c0021w.hasNext()) {
            arrayList.add(this.f85h);
            this.f85h = c0021w;
            return next;
        }
        while (!this.f85h.hasNext() && !arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            this.f85h = (Iterator) arrayList.get(AbstractC2003a.m4539l(arrayList));
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            arrayList.remove(AbstractC2003a.m4539l(arrayList));
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
