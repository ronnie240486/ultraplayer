package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1345w1 extends AbstractC1282g2 {
    private static final C1345w1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C1345w1 c1345w1 = new C1345w1();
        zzb = c1345w1;
        AbstractC1282g2.m3259e(C1345w1.class, c1345w1);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", C1256a0.f5764C, "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new C1345w1();
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
