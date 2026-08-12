package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1276f0 extends AbstractC1282g2 {
    private static final InterfaceC1294j2 zzb = new C1196K2();
    private static final C1276f0 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC1290i2 zzh = C1286h2.f5911j;

    static {
        C1276f0 c1276f0 = new C1276f0();
        zzd = c1276f0;
        AbstractC1282g2.m3259e(C1276f0.class, c1276f0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", C1256a0.f5763B});
        }
        if (i4 == 3) {
            return new C1276f0();
        }
        if (i4 == 4) {
            return new C1240W(zzd);
        }
        if (i4 != 5) {
            return null;
        }
        return zzd;
    }
}
