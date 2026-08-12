package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1329s1 extends AbstractC1282g2 {
    private static final C1329s1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC1302l2 zzg;
    private InterfaceC1302l2 zzh;
    private int zzi;

    static {
        C1329s1 c1329s1 = new C1329s1();
        zzb = c1329s1;
        AbstractC1282g2.m3259e(C1329s1.class, c1329s1);
    }

    public C1329s1() {
        C1180G2 c1180g2 = C1180G2.f5631j;
        this.zzg = c1180g2;
        this.zzh = c1180g2;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", C1256a0.f5789x, "zzf", C1256a0.f5790y, "zzg", C1194K0.class, "zzh", C1194K0.class, "zzi", C1165D.f5590x});
        }
        if (i4 == 3) {
            return new C1329s1();
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
