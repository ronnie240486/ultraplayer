package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1248Y extends AbstractC1282g2 {
    private static final C1248Y zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private C1244X zzi;
    private int zzj;

    static {
        C1248Y c1248y = new C1248Y();
        zzb = c1248y;
        AbstractC1282g2.m3259e(C1248Y.class, c1248y);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"zzd", "zze", "zzf", C1165D.f5575i, "zzg", "zzh", "zzi", "zzj", C1165D.f5574h});
        }
        if (i4 == 3) {
            return new C1248Y();
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
