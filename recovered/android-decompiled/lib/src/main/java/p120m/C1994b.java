package p120m;

import java.util.Iterator;

/* JADX INFO: renamed from: m.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1994b extends AbstractC1997e implements Iterator {

    /* JADX INFO: renamed from: g */
    public C1995c f8700g;

    /* JADX INFO: renamed from: h */
    public C1995c f8701h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8702i;

    public C1994b(C1995c c1995c, C1995c c1995c2, int i3) {
        this.f8702i = i3;
        this.f8700g = c1995c2;
        this.f8701h = c1995c;
    }

    @Override // p120m.AbstractC1997e
    /* JADX INFO: renamed from: a */
    public final void mo4524a(C1995c c1995c) {
        C1995c c1995c2;
        C1995c c1995cM4525b = null;
        if (this.f8700g == c1995c && c1995c == this.f8701h) {
            this.f8701h = null;
            this.f8700g = null;
        }
        C1995c c1995c3 = this.f8700g;
        if (c1995c3 == c1995c) {
            switch (this.f8702i) {
                case 0:
                    c1995c2 = c1995c3.f8706j;
                    break;
                default:
                    c1995c2 = c1995c3.f8705i;
                    break;
            }
            this.f8700g = c1995c2;
        }
        C1995c c1995c4 = this.f8701h;
        if (c1995c4 == c1995c) {
            C1995c c1995c5 = this.f8700g;
            if (c1995c4 != c1995c5 && c1995c5 != null) {
                c1995cM4525b = m4525b(c1995c4);
            }
            this.f8701h = c1995cM4525b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1995c m4525b(C1995c c1995c) {
        switch (this.f8702i) {
            case 0:
                return c1995c.f8705i;
            default:
                return c1995c.f8706j;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8701h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1995c c1995c = this.f8701h;
        C1995c c1995c2 = this.f8700g;
        this.f8701h = (c1995c == c1995c2 || c1995c2 == null) ? null : m4525b(c1995c);
        return c1995c;
    }
}
