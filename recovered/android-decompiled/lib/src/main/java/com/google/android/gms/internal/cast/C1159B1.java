package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p060U1.AbstractC0610a;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1159B1 extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final AtomicReferenceFieldUpdater f5555n;

    /* JADX INFO: renamed from: o */
    public final AtomicReferenceFieldUpdater f5556o;

    /* JADX INFO: renamed from: p */
    public final AtomicReferenceFieldUpdater f5557p;

    /* JADX INFO: renamed from: q */
    public final AtomicReferenceFieldUpdater f5558q;

    /* JADX INFO: renamed from: r */
    public final AtomicReferenceFieldUpdater f5559r;

    public C1159B1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5555n = atomicReferenceFieldUpdater;
        this.f5556o = atomicReferenceFieldUpdater2;
        this.f5557p = atomicReferenceFieldUpdater3;
        this.f5558q = atomicReferenceFieldUpdater4;
        this.f5559r = atomicReferenceFieldUpdater5;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: L */
    public final C1155A1 mo1526L(AbstractC1179G1 abstractC1179G1) {
        return (C1155A1) this.f5558q.getAndSet(abstractC1179G1, C1155A1.f5541d);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: N */
    public final C1175F1 mo1527N(AbstractC1179G1 abstractC1179G1) {
        return (C1175F1) this.f5557p.getAndSet(abstractC1179G1, C1175F1.f5615c);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: P */
    public final void mo1528P(C1175F1 c1175f1, C1175F1 c1175f2) {
        this.f5556o.lazySet(c1175f1, c1175f2);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: R */
    public final void mo1529R(C1175F1 c1175f1, Thread thread) {
        this.f5555n.lazySet(c1175f1, thread);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: T */
    public final boolean mo1530T(AbstractC1179G1 abstractC1179G1, Object obj, Object obj2) {
        return AbstractC0664e.m1744c0(this.f5559r, abstractC1179G1, obj, obj2);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: U */
    public final boolean mo1531U(AbstractC1179G1 abstractC1179G1, C1175F1 c1175f1, C1175F1 c1175f2) {
        return AbstractC0664e.m1744c0(this.f5557p, abstractC1179G1, c1175f1, c1175f2);
    }
}
