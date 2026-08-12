package p101g2;

import java.io.Serializable;

/* JADX INFO: renamed from: g2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1588i implements InterfaceC1587h, Serializable {

    /* JADX INFO: renamed from: g */
    public final transient Object f7195g = new Object();

    /* JADX INFO: renamed from: h */
    public final InterfaceC1587h f7196h;

    /* JADX INFO: renamed from: i */
    public volatile transient boolean f7197i;

    /* JADX INFO: renamed from: j */
    public transient Object f7198j;

    public C1588i(InterfaceC1587h interfaceC1587h) {
        this.f7196h = interfaceC1587h;
    }

    @Override // p101g2.InterfaceC1587h
    public final Object get() {
        if (!this.f7197i) {
            synchronized (this.f7195g) {
                try {
                    if (!this.f7197i) {
                        Object obj = this.f7196h.get();
                        this.f7198j = obj;
                        this.f7197i = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f7198j;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f7197i) {
            obj = "<supplier that returned " + this.f7198j + ">";
        } else {
            obj = this.f7196h;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
