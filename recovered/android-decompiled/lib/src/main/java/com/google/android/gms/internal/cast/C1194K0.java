package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1194K0 extends AbstractC1282g2 {
    private static final C1194K0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C1194K0 c1194k0 = new C1194K0();
        zzb = c1194k0;
        AbstractC1282g2.m3259e(C1194K0.class, c1194k0);
    }

    /* JADX INFO: renamed from: l */
    public static C1190J0 m3175l() {
        return (C1190J0) zzb.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3176m(C1194K0 c1194k0, String str) {
        str.getClass();
        c1194k0.zzd |= 1;
        c1194k0.zze = str;
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
            return new C1194K0();
        }
        if (i4 == 4) {
            return new C1190J0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
