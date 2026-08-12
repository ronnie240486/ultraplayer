package p105h2;

import androidx.fragment.app.AbstractC0948N;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p101g2.InterfaceC1584e;

/* JADX INFO: renamed from: h2.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1680K extends AbstractC1718l0 {

    /* JADX INFO: renamed from: g */
    public int f7607g;

    /* JADX INFO: renamed from: h */
    public Object f7608h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7609i;

    /* JADX INFO: renamed from: j */
    public final Iterator f7610j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f7611k;

    public C1680K() {
        this.f7607g = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i3 = this.f7607g;
        if (i3 == 4) {
            throw new IllegalStateException();
        }
        int iM2507b = AbstractC0948N.m2507b(i3);
        if (iM2507b == 0) {
            return true;
        }
        if (iM2507b == 2) {
            return false;
        }
        this.f7607g = 4;
        switch (this.f7609i) {
            case 0:
                do {
                    Iterator it = this.f7610j;
                    if (!it.hasNext()) {
                        this.f7607g = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((InterfaceC1584e) this.f7611k).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f7610j;
                    if (!it2.hasNext()) {
                        this.f7607g = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((C1706f0) this.f7611k).f7674h.contains(next));
                break;
        }
        this.f7608h = next;
        if (this.f7607g == 3) {
            return false;
        }
        this.f7607g = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7607g = 2;
        Object obj = this.f7608h;
        this.f7608h = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1680K(Iterator it, InterfaceC1584e interfaceC1584e) {
        this();
        this.f7609i = 0;
        this.f7610j = it;
        this.f7611k = interfaceC1584e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1680K(C1706f0 c1706f0) {
        this();
        this.f7609i = 1;
        this.f7611k = c1706f0;
        this.f7610j = c1706f0.f7673g.iterator();
    }
}
