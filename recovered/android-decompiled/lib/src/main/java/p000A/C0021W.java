package p000A;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: A.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0021W implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f20g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewGroup f21h;

    public C0021W(ViewGroup viewGroup) {
        this.f21h = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20g < this.f21h.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f20g;
        this.f20g = i3 + 1;
        View childAt = this.f21h.getChildAt(i3);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i3 = this.f20g - 1;
        this.f20g = i3;
        this.f21h.removeViewAt(i3);
    }
}
