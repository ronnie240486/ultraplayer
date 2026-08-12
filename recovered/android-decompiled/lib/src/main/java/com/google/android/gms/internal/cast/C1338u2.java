package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1338u2 implements InterfaceC1354y2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1354y2[] f5980a;

    public C1338u2(InterfaceC1354y2... interfaceC1354y2Arr) {
        this.f5980a = interfaceC1354y2Arr;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1354y2
    /* JADX INFO: renamed from: a */
    public final C1184H2 mo3247a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            InterfaceC1354y2 interfaceC1354y2 = this.f5980a[i3];
            if (interfaceC1354y2.mo3248b(cls)) {
                return interfaceC1354y2.mo3247a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1354y2
    /* JADX INFO: renamed from: b */
    public final boolean mo3248b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (this.f5980a[i3].mo3248b(cls)) {
                return true;
            }
        }
        return false;
    }
}
