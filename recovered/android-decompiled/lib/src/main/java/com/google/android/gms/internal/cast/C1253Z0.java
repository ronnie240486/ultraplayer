package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1253Z0 extends AbstractC1282g2 {
    private static final C1253Z0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        C1253Z0 c1253z0 = new C1253Z0();
        zzb = c1253z0;
        AbstractC1282g2.m3259e(C1253Z0.class, c1253z0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006ဆ\u0005", new Object[]{"zzd", "zze", "zzf", C1256a0.f5769d, "zzg", "zzh", "zzi", C1165D.f5587u, "zzj"});
        }
        if (i4 == 3) {
            return new C1253Z0();
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
