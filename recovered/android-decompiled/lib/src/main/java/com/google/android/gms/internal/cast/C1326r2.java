package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1326r2 extends AbstractC1330s2 {
    @Override // com.google.android.gms.internal.cast.AbstractC1330s2
    /* JADX INFO: renamed from: a */
    public final void mo3351a(long j3, Object obj) {
        AbstractC1234U1 abstractC1234U1 = (AbstractC1234U1) ((InterfaceC1302l2) AbstractC1235U2.m3201g(j3, obj));
        if (abstractC1234U1.f5713g) {
            abstractC1234U1.f5713g = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1330s2
    /* JADX INFO: renamed from: b */
    public final void mo3352b(long j3, Object obj, Object obj2) {
        InterfaceC1302l2 interfaceC1302l2Mo3140f = (InterfaceC1302l2) AbstractC1235U2.m3201g(j3, obj);
        InterfaceC1302l2 interfaceC1302l2 = (InterfaceC1302l2) AbstractC1235U2.m3201g(j3, obj2);
        int size = interfaceC1302l2Mo3140f.size();
        int size2 = interfaceC1302l2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1234U1) interfaceC1302l2Mo3140f).f5713g) {
                interfaceC1302l2Mo3140f = interfaceC1302l2Mo3140f.mo3140f(size2 + size);
            }
            interfaceC1302l2Mo3140f.addAll(interfaceC1302l2);
        }
        if (size > 0) {
            interfaceC1302l2 = interfaceC1302l2Mo3140f;
        }
        AbstractC1235U2.m3205k(j3, obj, interfaceC1302l2);
    }
}
