package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1249Y0 extends AbstractC1282g2 {
    private static final C1249Y0 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        C1249Y0 c1249y0 = new C1249Y0();
        zzb = c1249y0;
        AbstractC1282g2.m3259e(C1249Y0.class, c1249y0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", C1256a0.f5768c, "zzf", "zzg", C1165D.f5580n});
        }
        if (i4 == 3) {
            return new C1249Y0();
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
