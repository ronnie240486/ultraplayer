package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1309n1 extends AbstractC1282g2 {
    private static final C1309n1 zzb;
    private int zzd;
    private C1288i0 zze;

    static {
        C1309n1 c1309n1 = new C1309n1();
        zzb = c1309n1;
        AbstractC1282g2.m3259e(C1309n1.class, c1309n1);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new C1309n1();
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
