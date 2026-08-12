package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1202M0 extends AbstractC1282g2 {
    private static final C1202M0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private InterfaceC1302l2 zzh = C1180G2.f5631j;

    static {
        C1202M0 c1202m0 = new C1202M0();
        zzb = c1202m0;
        AbstractC1282g2.m3259e(C1202M0.class, c1202m0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C1198L0.class});
        }
        if (i4 == 3) {
            return new C1202M0();
        }
        if (i4 == 4) {
            return new C1240W(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
