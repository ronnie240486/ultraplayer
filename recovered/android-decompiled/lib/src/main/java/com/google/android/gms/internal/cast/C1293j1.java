package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1293j1 extends AbstractC1282g2 {
    private static final C1293j1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C1293j1 c1293j1 = new C1293j1();
        zzb = c1293j1;
        AbstractC1282g2.m3259e(C1293j1.class, c1293j1);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            C1256a0 c1256a0 = C1256a0.f5775j;
            return new C1184H2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", c1256a0, "zzf", c1256a0});
        }
        if (i4 == 3) {
            return new C1293j1();
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
