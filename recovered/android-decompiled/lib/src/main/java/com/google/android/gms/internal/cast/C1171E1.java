package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import p060U1.AbstractC0610a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.E1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1171E1 extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public static final Unsafe f5606n;

    /* JADX INFO: renamed from: o */
    public static final long f5607o;

    /* JADX INFO: renamed from: p */
    public static final long f5608p;

    /* JADX INFO: renamed from: q */
    public static final long f5609q;

    /* JADX INFO: renamed from: r */
    public static final long f5610r;

    /* JADX INFO: renamed from: s */
    public static final long f5611s;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C1167D1());
        }
        try {
            f5608p = unsafe.objectFieldOffset(AbstractC1179G1.class.getDeclaredField("k"));
            f5607o = unsafe.objectFieldOffset(AbstractC1179G1.class.getDeclaredField("j"));
            f5609q = unsafe.objectFieldOffset(AbstractC1179G1.class.getDeclaredField("i"));
            f5610r = unsafe.objectFieldOffset(C1175F1.class.getDeclaredField("a"));
            f5611s = unsafe.objectFieldOffset(C1175F1.class.getDeclaredField("b"));
            f5606n = unsafe;
        } catch (NoSuchFieldException e4) {
            throw new RuntimeException(e4);
        } catch (RuntimeException e5) {
            throw e5;
        }
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: L */
    public final C1155A1 mo1526L(AbstractC1179G1 abstractC1179G1) {
        C1155A1 c1155a1;
        C1155A1 c1155a2 = C1155A1.f5541d;
        while (true) {
            c1155a1 = abstractC1179G1.f5629j;
            if (c1155a2 == c1155a1) {
                break;
            }
            AbstractC1179G1 abstractC1179G2 = abstractC1179G1;
            if (AbstractC1187I1.m3146a(f5606n, abstractC1179G2, f5607o, c1155a1, c1155a2)) {
                break;
            }
            abstractC1179G1 = abstractC1179G2;
        }
        return c1155a1;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: N */
    public final C1175F1 mo1527N(AbstractC1179G1 abstractC1179G1) {
        C1175F1 c1175f1;
        C1175F1 c1175f2 = C1175F1.f5615c;
        do {
            c1175f1 = abstractC1179G1.f5630k;
            if (c1175f2 == c1175f1) {
                break;
            }
        } while (!mo1531U(abstractC1179G1, c1175f1, c1175f2));
        return c1175f1;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: P */
    public final void mo1528P(C1175F1 c1175f1, C1175F1 c1175f2) {
        f5606n.putObject(c1175f1, f5611s, c1175f2);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: R */
    public final void mo1529R(C1175F1 c1175f1, Thread thread) {
        f5606n.putObject(c1175f1, f5610r, thread);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: T */
    public final boolean mo1530T(AbstractC1179G1 abstractC1179G1, Object obj, Object obj2) {
        return AbstractC1187I1.m3146a(f5606n, abstractC1179G1, f5609q, obj, obj2);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: U */
    public final boolean mo1531U(AbstractC1179G1 abstractC1179G1, C1175F1 c1175f1, C1175F1 c1175f2) {
        return AbstractC1187I1.m3146a(f5606n, abstractC1179G1, f5608p, c1175f1, c1175f2);
    }
}
