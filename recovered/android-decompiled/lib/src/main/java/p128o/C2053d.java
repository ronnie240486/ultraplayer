package p128o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: o.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2053d extends AbstractC0664e {

    /* JADX INFO: renamed from: i */
    public final AtomicReferenceFieldUpdater f8933i;

    /* JADX INFO: renamed from: j */
    public final AtomicReferenceFieldUpdater f8934j;

    /* JADX INFO: renamed from: k */
    public final AtomicReferenceFieldUpdater f8935k;

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceFieldUpdater f8936l;

    /* JADX INFO: renamed from: m */
    public final AtomicReferenceFieldUpdater f8937m;

    public C2053d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8933i = atomicReferenceFieldUpdater;
        this.f8934j = atomicReferenceFieldUpdater2;
        this.f8935k = atomicReferenceFieldUpdater3;
        this.f8936l = atomicReferenceFieldUpdater4;
        this.f8937m = atomicReferenceFieldUpdater5;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: F */
    public final void mo1761F(C2055f c2055f, C2055f c2055f2) {
        this.f8934j.lazySet(c2055f, c2055f2);
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: G */
    public final void mo1762G(C2055f c2055f, Thread thread) {
        this.f8933i.lazySet(c2055f, thread);
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: e */
    public final boolean mo1767e(AbstractC2056g abstractC2056g, C2052c c2052c, C2052c c2052c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8936l;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2056g, c2052c, c2052c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2056g) == c2052c);
        return false;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: f */
    public final boolean mo1768f(AbstractC2056g abstractC2056g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8937m;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2056g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2056g) == obj);
        return false;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: g */
    public final boolean mo1769g(AbstractC2056g abstractC2056g, C2055f c2055f, C2055f c2055f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8935k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2056g, c2055f, c2055f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2056g) == c2055f);
        return false;
    }
}
