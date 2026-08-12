package com.google.android.gms.internal.cast;

import p049Q1.C0513b;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.f2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1278f2 implements Cloneable {

    /* JADX INFO: renamed from: g */
    public final AbstractC1282g2 f5901g;

    /* JADX INFO: renamed from: h */
    public AbstractC1282g2 f5902h;

    public AbstractC1278f2(AbstractC1282g2 abstractC1282g2) {
        this.f5901g = abstractC1282g2;
        if (abstractC1282g2.m3263g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5902h = (AbstractC1282g2) abstractC1282g2.mo3096h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1282g2 m3254a() {
        AbstractC1282g2 abstractC1282g2M3255b = m3255b();
        byte bByteValue = ((Byte) abstractC1282g2M3255b.mo3096h(1, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue != 0) {
                boolean zMo3103a = C1176F2.f5618c.m3131a(abstractC1282g2M3255b.getClass()).mo3103a(abstractC1282g2M3255b);
                abstractC1282g2M3255b.mo3096h(2, true == zMo3103a ? abstractC1282g2M3255b : null);
            }
            throw new C0513b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return abstractC1282g2M3255b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1282g2 m3255b() {
        if (!this.f5902h.m3263g()) {
            return this.f5902h;
        }
        AbstractC1282g2 abstractC1282g2 = this.f5902h;
        abstractC1282g2.getClass();
        C1176F2.f5618c.m3131a(abstractC1282g2.getClass()).mo3110h(abstractC1282g2);
        abstractC1282g2.m3261d();
        return this.f5902h;
    }

    /* JADX INFO: renamed from: c */
    public final void m3256c() {
        if (this.f5902h.m3263g()) {
            return;
        }
        AbstractC1282g2 abstractC1282g2 = (AbstractC1282g2) this.f5901g.mo3096h(4, null);
        C1176F2.f5618c.m3131a(abstractC1282g2.getClass()).mo3104b(abstractC1282g2, this.f5902h);
        this.f5902h = abstractC1282g2;
    }

    public final Object clone() {
        AbstractC1278f2 abstractC1278f2 = (AbstractC1278f2) this.f5901g.mo3096h(5, null);
        abstractC1278f2.f5902h = m3255b();
        return abstractC1278f2;
    }
}
