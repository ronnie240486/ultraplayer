package com.google.android.gms.internal.cast;

import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1160B2 implements InterfaceC1188I2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1230T1 f5560a;

    /* JADX INFO: renamed from: b */
    public final C1204M2 f5561b;

    /* JADX INFO: renamed from: c */
    public final C1262b2 f5562c;

    public C1160B2(C1204M2 c1204m2, C1262b2 c1262b2, AbstractC1230T1 abstractC1230T1) {
        this.f5561b = c1204m2;
        this.f5562c = c1262b2;
        this.f5560a = abstractC1230T1;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: a */
    public final boolean mo3103a(Object obj) {
        this.f5562c.getClass();
        AbstractC0462h.m1169i(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: b */
    public final void mo3104b(Object obj, Object obj2) {
        AbstractC1192J2.m3164o(this.f5561b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: c */
    public final int mo3105c(AbstractC1282g2 abstractC1282g2) {
        this.f5561b.getClass();
        abstractC1282g2.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: d */
    public final boolean mo3106d(AbstractC1282g2 abstractC1282g2, AbstractC1282g2 abstractC1282g3) {
        this.f5561b.getClass();
        return abstractC1282g2.zzc.equals(abstractC1282g3.zzc);
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: e */
    public final int mo3107e(AbstractC1282g2 abstractC1282g2) {
        this.f5561b.getClass();
        C1200L2 c1200l2 = abstractC1282g2.zzc;
        int i3 = c1200l2.f5657c;
        if (i3 != -1) {
            return i3;
        }
        c1200l2.f5657c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: f */
    public final void mo3108f(Object obj, C1342v2 c1342v2) {
        this.f5562c.getClass();
        AbstractC0462h.m1169i(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: g */
    public final AbstractC1282g2 mo3109g() {
        AbstractC1230T1 abstractC1230T1 = this.f5560a;
        return abstractC1230T1 instanceof AbstractC1282g2 ? (AbstractC1282g2) ((AbstractC1282g2) abstractC1230T1).mo3096h(4, null) : ((AbstractC1278f2) ((AbstractC1282g2) abstractC1230T1).mo3096h(5, null)).m3255b();
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: h */
    public final void mo3110h(Object obj) {
        this.f5561b.getClass();
        C1200L2 c1200l2 = ((AbstractC1282g2) obj).zzc;
        if (c1200l2.f5658d) {
            c1200l2.f5658d = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }
}
