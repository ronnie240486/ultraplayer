package com.google.android.gms.internal.cast;

import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1163C1 extends AbstractC0610a {
    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: L */
    public final C1155A1 mo1526L(AbstractC1179G1 abstractC1179G1) {
        C1155A1 c1155a1;
        C1155A1 c1155a2 = C1155A1.f5541d;
        synchronized (abstractC1179G1) {
            c1155a1 = abstractC1179G1.f5629j;
            if (c1155a1 != c1155a2) {
                abstractC1179G1.f5629j = c1155a2;
            }
        }
        return c1155a1;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: N */
    public final C1175F1 mo1527N(AbstractC1179G1 abstractC1179G1) {
        C1175F1 c1175f1;
        C1175F1 c1175f2 = C1175F1.f5615c;
        synchronized (abstractC1179G1) {
            c1175f1 = abstractC1179G1.f5630k;
            if (c1175f1 != c1175f2) {
                abstractC1179G1.f5630k = c1175f2;
            }
        }
        return c1175f1;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: P */
    public final void mo1528P(C1175F1 c1175f1, C1175F1 c1175f2) {
        c1175f1.f5617b = c1175f2;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: R */
    public final void mo1529R(C1175F1 c1175f1, Thread thread) {
        c1175f1.f5616a = thread;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: T */
    public final boolean mo1530T(AbstractC1179G1 abstractC1179G1, Object obj, Object obj2) {
        synchronized (abstractC1179G1) {
            try {
                if (abstractC1179G1.f5628i != obj) {
                    return false;
                }
                abstractC1179G1.f5628i = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: U */
    public final boolean mo1531U(AbstractC1179G1 abstractC1179G1, C1175F1 c1175f1, C1175F1 c1175f2) {
        synchronized (abstractC1179G1) {
            try {
                if (abstractC1179G1.f5630k != c1175f1) {
                    return false;
                }
                abstractC1179G1.f5630k = c1175f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
