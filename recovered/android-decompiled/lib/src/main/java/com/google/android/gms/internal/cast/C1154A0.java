package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1154A0 extends AbstractC1282g2 {
    private static final C1154A0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C1154A0 c1154a0 = new C1154A0();
        zzb = c1154a0;
        AbstractC1282g2.m3259e(C1154A0.class, c1154a0);
    }

    /* JADX INFO: renamed from: l */
    public static C1356z0 m3091l() {
        return (C1356z0) zzb.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3092m(C1154A0 c1154a0, int i3) {
        c1154a0.zzd |= 2;
        c1154a0.zzf = i3;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m3093n(C1154A0 c1154a0, int i3) {
        c1154a0.zzd |= 4;
        c1154a0.zzg = i3;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m3094o(C1154A0 c1154a0, int i3) {
        c1154a0.zzd |= 8;
        c1154a0.zzh = i3;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3095p(C1154A0 c1154a0, int i3) {
        c1154a0.zze = i3 - 1;
        c1154a0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C1256a0.f5784s, "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new C1154A0();
        }
        if (i4 == 4) {
            return new C1356z0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
