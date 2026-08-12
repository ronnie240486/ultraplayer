package p120m;

import java.util.Iterator;

/* JADX INFO: renamed from: m.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1996d extends AbstractC1997e implements Iterator {

    /* JADX INFO: renamed from: g */
    public C1995c f8707g;

    /* JADX INFO: renamed from: h */
    public boolean f8708h = true;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1998f f8709i;

    public C1996d(C1998f c1998f) {
        this.f8709i = c1998f;
    }

    @Override // p120m.AbstractC1997e
    /* JADX INFO: renamed from: a */
    public final void mo4524a(C1995c c1995c) {
        C1995c c1995c2 = this.f8707g;
        if (c1995c == c1995c2) {
            C1995c c1995c3 = c1995c2.f8706j;
            this.f8707g = c1995c3;
            this.f8708h = c1995c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8708h) {
            return this.f8709i.f8710g != null;
        }
        C1995c c1995c = this.f8707g;
        return (c1995c == null || c1995c.f8705i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8708h) {
            this.f8708h = false;
            this.f8707g = this.f8709i.f8710g;
        } else {
            C1995c c1995c = this.f8707g;
            this.f8707g = c1995c != null ? c1995c.f8705i : null;
        }
        return this.f8707g;
    }
}
