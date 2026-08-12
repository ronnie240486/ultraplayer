package p170z2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000A.C0022X;
import p143r2.C2204b;
import p143r2.C2206d;
import p151t2.EnumC2278a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: z2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2392a implements Iterator {

    /* JADX INFO: renamed from: g */
    public int f9983g;

    /* JADX INFO: renamed from: h */
    public Object f9984h;

    /* JADX INFO: renamed from: i */
    public Iterator f9985i;

    /* JADX INFO: renamed from: j */
    public C0022X f9986j;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m4975a() {
        int i3 = this.f9983g;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f9983g);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        Object c2204b;
        while (true) {
            int i3 = this.f9983g;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2 || i3 == 3) {
                        return true;
                    }
                    if (i3 == 4) {
                        return false;
                    }
                    throw m4975a();
                }
                Iterator it = this.f9985i;
                AbstractC2364c.m4951b(it);
                if (it.hasNext()) {
                    this.f9983g = 2;
                    return true;
                }
                this.f9985i = null;
            }
            this.f9983g = 5;
            C0022X c0022x = this.f9986j;
            AbstractC2364c.m4951b(c0022x);
            this.f9986j = null;
            C2206d c2206d = C2206d.f9498c;
            c0022x.getClass();
            C2392a c2392a = c0022x.f22g;
            AbstractC2364c.m4951b(c2392a);
            try {
                c2204b = c0022x.m95a(c2206d);
                if (c2204b == EnumC2278a.f9747g) {
                    continue;
                } else {
                    c2392a.getClass();
                    if (c2204b instanceof C2204b) {
                        throw ((C2204b) c2204b).f9493g;
                    }
                    c2392a.f9983g = 4;
                }
            } catch (Throwable th) {
                c2204b = new C2204b(th);
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f9983g;
        if (i3 == 0 || i3 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i3 == 2) {
            this.f9983g = 1;
            Iterator it = this.f9985i;
            AbstractC2364c.m4951b(it);
            return it.next();
        }
        if (i3 != 3) {
            throw m4975a();
        }
        this.f9983g = 0;
        Object obj = this.f9984h;
        this.f9984h = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
