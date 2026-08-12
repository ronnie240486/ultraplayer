package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1300l0 extends AbstractC1282g2 {
    private static final C1300l0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C1300l0 c1300l0 = new C1300l0();
        zzb = c1300l0;
        AbstractC1282g2.m3259e(C1300l0.class, c1300l0);
    }

    /* JADX INFO: renamed from: l */
    public static C1296k0 m3276l() {
        return (C1296k0) zzb.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3277m(C1300l0 c1300l0, String str) {
        str.getClass();
        c1300l0.zzd |= 1;
        c1300l0.zze = str;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m3278n(C1300l0 c1300l0, String str) {
        str.getClass();
        c1300l0.zzd |= 2;
        c1300l0.zzf = str;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C1300l0();
        }
        if (i4 == 4) {
            return new C1296k0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
