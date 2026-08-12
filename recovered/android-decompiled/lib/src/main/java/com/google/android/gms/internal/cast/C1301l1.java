package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1301l1 extends AbstractC1282g2 {
    private static final C1301l1 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private InterfaceC1302l2 zzg = C1180G2.f5631j;

    static {
        C1301l1 c1301l1 = new C1301l1();
        zzb = c1301l1;
        AbstractC1282g2.m3259e(C1301l1.class, c1301l1);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", C1305m1.class});
        }
        if (i4 == 3) {
            return new C1301l1();
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
