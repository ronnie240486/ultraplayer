package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1292j0 extends AbstractC1282g2 {
    private static final C1292j0 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private InterfaceC1302l2 zzi;
    private InterfaceC1302l2 zzj;
    private String zzk;

    static {
        C1292j0 c1292j0 = new C1292j0();
        zzb = c1292j0;
        AbstractC1282g2.m3259e(C1292j0.class, c1292j0);
    }

    public C1292j0() {
        C1180G2 c1180g2 = C1180G2.f5631j;
        this.zzi = c1180g2;
        this.zzj = c1180g2;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", C1165D.f5576j, "zzf", "zzg", C1165D.f5590x, "zzh", "zzi", C1273e1.class, "zzj", C1273e1.class, "zzk"});
        }
        if (i4 == 3) {
            return new C1292j0();
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
