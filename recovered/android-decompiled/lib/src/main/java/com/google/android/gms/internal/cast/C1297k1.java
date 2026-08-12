package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1297k1 extends AbstractC1282g2 {
    private static final C1297k1 zzb;
    private int zzd;
    private C1194K0 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private InterfaceC1302l2 zzk = C1180G2.f5631j;

    static {
        C1297k1 c1297k1 = new C1297k1();
        zzb = c1297k1;
        AbstractC1282g2.m3259e(C1297k1.class, c1297k1);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", C1256a0.f5777l, "zzg", C1256a0.f5776k, "zzh", C1165D.f5590x, "zzi", C1165D.f5580n, "zzj", "zzk", C1194K0.class});
        }
        if (i4 == 3) {
            return new C1297k1();
        }
        if (i4 == 4) {
            return new C1269d1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
