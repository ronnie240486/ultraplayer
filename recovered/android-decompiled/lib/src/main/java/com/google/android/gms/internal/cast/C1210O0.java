package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1210O0 extends AbstractC1282g2 {
    private static final InterfaceC1294j2 zzb = new C1196K2();
    private static final C1210O0 zzd;
    private int zze;
    private boolean zzg;
    private boolean zzh;
    private C1337u1 zzi;
    private boolean zzj;
    private long zzl;
    private long zzm;
    private String zzf = "";
    private InterfaceC1290i2 zzk = C1286h2.f5911j;

    static {
        C1210O0 c1210o0 = new C1210O0();
        zzd = c1210o0;
        AbstractC1282g2.m3259e(C1210O0.class, c1210o0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzd, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ࠬ\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzi", "zzj", "zzk", C1256a0.f5791z, "zzh", "zzl", "zzm"});
        }
        if (i4 == 3) {
            return new C1210O0();
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
