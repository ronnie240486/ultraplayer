package p128o;

import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: o.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2054e extends AbstractC0664e {
    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: F */
    public final void mo1761F(C2055f c2055f, C2055f c2055f2) {
        c2055f.f8940b = c2055f2;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: G */
    public final void mo1762G(C2055f c2055f, Thread thread) {
        c2055f.f8939a = thread;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: e */
    public final boolean mo1767e(AbstractC2056g abstractC2056g, C2052c c2052c, C2052c c2052c2) {
        synchronized (abstractC2056g) {
            try {
                if (abstractC2056g.f8946h != c2052c) {
                    return false;
                }
                abstractC2056g.f8946h = c2052c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: f */
    public final boolean mo1768f(AbstractC2056g abstractC2056g, Object obj, Object obj2) {
        synchronized (abstractC2056g) {
            try {
                if (abstractC2056g.f8945g != obj) {
                    return false;
                }
                abstractC2056g.f8945g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: g */
    public final boolean mo1769g(AbstractC2056g abstractC2056g, C2055f c2055f, C2055f c2055f2) {
        synchronized (abstractC2056g) {
            try {
                if (abstractC2056g.f8947i != c2055f) {
                    return false;
                }
                abstractC2056g.f8947i = c2055f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
