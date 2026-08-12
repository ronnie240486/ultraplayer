package p128o;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import p119l2.InterfaceFutureC1992b;

/* JADX INFO: renamed from: o.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2059j implements InterfaceFutureC1992b {

    /* JADX INFO: renamed from: g */
    public final WeakReference f8953g;

    /* JADX INFO: renamed from: h */
    public final C2058i f8954h = new C2058i(this);

    public C2059j(C2057h c2057h) {
        this.f8953g = new WeakReference(c2057h);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        C2057h c2057h = (C2057h) this.f8953g.get();
        boolean zCancel = this.f8954h.cancel(z3);
        if (zCancel && c2057h != null) {
            c2057h.f8948a = null;
            c2057h.f8949b = null;
            c2057h.f8950c.m4628h(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8954h.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8954h.f8945g instanceof C2050a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8954h.isDone();
    }

    public final String toString() {
        return this.f8954h.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f8954h.get(j3, timeUnit);
    }
}
