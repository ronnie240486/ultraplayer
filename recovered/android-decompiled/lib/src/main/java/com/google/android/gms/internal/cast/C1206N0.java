package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1206N0 extends AbstractC1282g2 {
    private static final C1206N0 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private C1253Z0 zzi;
    private int zzj;
    private boolean zzk;

    static {
        C1206N0 c1206n0 = new C1206N0();
        zzb = c1206n0;
        AbstractC1282g2.m3259e(C1206N0.class, c1206n0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", C1165D.f5590x, "zzg", C1165D.f5592z, "zzh", C1165D.f5579m, "zzi", "zzj", C1165D.f5591y, "zzk"});
        }
        if (i4 == 3) {
            return new C1206N0();
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
