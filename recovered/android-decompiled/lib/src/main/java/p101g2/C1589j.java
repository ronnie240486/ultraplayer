package p101g2;

import p077a0.C0841q;

/* JADX INFO: renamed from: g2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1589j implements InterfaceC1587h {

    /* JADX INFO: renamed from: j */
    public static final C0841q f7199j = new C0841q(2);

    /* JADX INFO: renamed from: g */
    public final Object f7200g = new Object();

    /* JADX INFO: renamed from: h */
    public volatile InterfaceC1587h f7201h;

    /* JADX INFO: renamed from: i */
    public Object f7202i;

    public C1589j(InterfaceC1587h interfaceC1587h) {
        this.f7201h = interfaceC1587h;
    }

    @Override // p101g2.InterfaceC1587h
    public final Object get() {
        InterfaceC1587h interfaceC1587h = this.f7201h;
        C0841q c0841q = f7199j;
        if (interfaceC1587h != c0841q) {
            synchronized (this.f7200g) {
                try {
                    if (this.f7201h != c0841q) {
                        Object obj = this.f7201h.get();
                        this.f7202i = obj;
                        this.f7201h = c0841q;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f7202i;
    }

    public final String toString() {
        Object obj = this.f7201h;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f7199j) {
            obj = "<supplier that returned " + this.f7202i + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
