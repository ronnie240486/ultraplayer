package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1325r1 extends AbstractC1282g2 {
    private static final C1325r1 zzb;
    private int zzd;
    private int zze;
    private InterfaceC1302l2 zzf;
    private InterfaceC1302l2 zzg;
    private int zzh;

    static {
        C1325r1 c1325r1 = new C1325r1();
        zzb = c1325r1;
        AbstractC1282g2.m3259e(C1325r1.class, c1325r1);
    }

    public C1325r1() {
        C1180G2 c1180g2 = C1180G2.f5631j;
        this.zzf = c1180g2;
        this.zzg = c1180g2;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", C1256a0.f5788w, "zzf", C1273e1.class, "zzg", C1273e1.class, "zzh"});
        }
        if (i4 == 3) {
            return new C1325r1();
        }
        if (i4 == 4) {
            return new C1269d1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
