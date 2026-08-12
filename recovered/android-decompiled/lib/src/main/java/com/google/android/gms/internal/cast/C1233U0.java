package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1233U0 extends AbstractC1282g2 {
    private static final C1233U0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private C1221R0 zzg;

    static {
        C1233U0 c1233u0 = new C1233U0();
        zzb = c1233u0;
        AbstractC1282g2.m3259e(C1233U0.class, c1233u0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new C1233U0();
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
