package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1320q0 extends AbstractC1282g2 {
    private static final C1320q0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
        C1320q0 c1320q0 = new C1320q0();
        zzb = c1320q0;
        AbstractC1282g2.m3259e(C1320q0.class, c1320q0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", C1256a0.f5775j, "zzf", C1256a0.f5773h, "zzg", C1256a0.f5774i, "zzh", "zzi"});
        }
        if (i4 == 3) {
            return new C1320q0();
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
