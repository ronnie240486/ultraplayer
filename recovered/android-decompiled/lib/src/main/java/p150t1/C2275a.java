package p150t1;

import p139q2.InterfaceC2180a;
import p146s1.InterfaceC2254a;

/* JADX INFO: renamed from: t1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2275a implements InterfaceC2180a, InterfaceC2254a {

    /* JADX INFO: renamed from: i */
    public static final Object f9743i = new Object();

    /* JADX INFO: renamed from: g */
    public volatile InterfaceC2276b f9744g;

    /* JADX INFO: renamed from: h */
    public volatile Object f9745h = f9743i;

    public C2275a(InterfaceC2276b interfaceC2276b) {
        this.f9744g = interfaceC2276b;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2180a m4884a(InterfaceC2276b interfaceC2276b) {
        return interfaceC2276b instanceof C2275a ? interfaceC2276b : new C2275a(interfaceC2276b);
    }

    @Override // p139q2.InterfaceC2180a
    public final Object get() {
        Object obj;
        Object obj2 = this.f9745h;
        Object obj3 = f9743i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9745h;
                if (obj == obj3) {
                    obj = this.f9744g.get();
                    Object obj4 = this.f9745h;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f9745h = obj;
                    this.f9744g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
