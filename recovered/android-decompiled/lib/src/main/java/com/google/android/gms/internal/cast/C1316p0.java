package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1316p0 extends AbstractC1282g2 {
    private static final C1316p0 zzb;
    private int zzd;
    private int zze;

    static {
        C1316p0 c1316p0 = new C1316p0();
        zzb = c1316p0;
        AbstractC1282g2.m3259e(C1316p0.class, c1316p0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C1165D.f5581o});
        }
        if (i4 == 3) {
            return new C1316p0();
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
