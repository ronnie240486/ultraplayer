package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1337u1 extends AbstractC1282g2 {
    private static final InterfaceC1294j2 zzb = new C1196K2();
    private static final C1337u1 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private InterfaceC1290i2 zzh = C1286h2.f5911j;
    private InterfaceC1302l2 zzj = C1180G2.f5631j;

    static {
        C1337u1 c1337u1 = new C1337u1();
        zzd = c1337u1;
        AbstractC1282g2.m3259e(C1337u1.class, c1337u1);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", C1256a0.f5762A, "zzg", C1165D.f5590x, "zzh", C1256a0.f5791z, "zzi", C1165D.f5584r, "zzj", C1333t1.class, "zzk"});
        }
        if (i4 == 3) {
            return new C1337u1();
        }
        if (i4 == 4) {
            return new C1269d1(zzd);
        }
        if (i4 != 5) {
            return null;
        }
        return zzd;
    }
}
