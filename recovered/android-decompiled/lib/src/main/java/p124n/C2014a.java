package p124n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2014a implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f8755g;

    /* JADX INFO: renamed from: h */
    public int f8756h;

    /* JADX INFO: renamed from: i */
    public boolean f8757i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8758j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f8759k;

    public C2014a(int i3) {
        this.f8755g = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8756h < this.f8755g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM4590g;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f8756h;
        switch (this.f8758j) {
            case 0:
                objM4590g = ((C2018e) this.f8759k).m4590g(i3);
                break;
            case 1:
                objM4590g = ((C2018e) this.f8759k).m4592i(i3);
                break;
            default:
                objM4590g = ((C2019f) this.f8759k).f8776h[i3];
                break;
        }
        this.f8756h++;
        this.f8757i = true;
        return objM4590g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8757i) {
            throw new IllegalStateException();
        }
        int i3 = this.f8756h - 1;
        this.f8756h = i3;
        switch (this.f8758j) {
            case 0:
                ((C2018e) this.f8759k).m4591h(i3);
                break;
            case 1:
                ((C2018e) this.f8759k).m4591h(i3);
                break;
            default:
                ((C2019f) this.f8759k).m4576j(i3);
                break;
        }
        this.f8755g--;
        this.f8757i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2014a(C2018e c2018e, int i3) {
        this(c2018e.f8791i);
        this.f8758j = i3;
        switch (i3) {
            case 1:
                this.f8759k = c2018e;
                this(c2018e.f8791i);
                break;
            default:
                this.f8759k = c2018e;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2014a(C2019f c2019f) {
        this(c2019f.f8777i);
        this.f8758j = 2;
        this.f8759k = c2019f;
    }
}
