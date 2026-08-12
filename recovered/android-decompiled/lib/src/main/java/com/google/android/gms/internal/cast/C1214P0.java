package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1214P0 extends AbstractC1282g2 {
    private static final C1214P0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC1290i2 zzg;
    private InterfaceC1290i2 zzh;
    private InterfaceC1302l2 zzi;
    private InterfaceC1302l2 zzj;
    private int zzk;

    static {
        C1214P0 c1214p0 = new C1214P0();
        zzb = c1214p0;
        AbstractC1282g2.m3259e(C1214P0.class, c1214p0);
    }

    public C1214P0() {
        C1286h2 c1286h2 = C1286h2.f5911j;
        this.zzg = c1286h2;
        this.zzh = c1286h2;
        C1180G2 c1180g2 = C1180G2.f5631j;
        this.zzi = c1180g2;
        this.zzj = c1180g2;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", C1165D.f5564B, "zzg", "zzh", "zzi", "zzj", "zzk", C1165D.f5590x});
        }
        if (i4 == 3) {
            return new C1214P0();
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
