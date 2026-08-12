package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1336u0 extends AbstractC1282g2 {
    private static final C1336u0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        C1336u0 c1336u0 = new C1336u0();
        zzb = c1336u0;
        AbstractC1282g2.m3259e(C1336u0.class, c1336u0);
    }

    /* JADX INFO: renamed from: l */
    public static C1332t0 m3413l() {
        return (C1332t0) zzb.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3414m(C1336u0 c1336u0, int i3) {
        c1336u0.zzd |= 2;
        c1336u0.zzf = i3;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m3415n(C1336u0 c1336u0, int i3) {
        c1336u0.zzd |= 4;
        c1336u0.zzg = i3;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m3416o(C1336u0 c1336u0, int i3) {
        c1336u0.zzd |= 8;
        c1336u0.zzh = i3;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3417p(C1336u0 c1336u0, int i3) {
        c1336u0.zzd |= 16;
        c1336u0.zzi = i3;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m3418q(C1336u0 c1336u0, int i3) {
        c1336u0.zze = i3 - 1;
        c1336u0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", C1256a0.f5782q, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i4 == 3) {
            return new C1336u0();
        }
        if (i4 == 4) {
            return new C1332t0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
