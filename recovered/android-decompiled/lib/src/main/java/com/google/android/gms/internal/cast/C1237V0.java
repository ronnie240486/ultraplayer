package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1237V0 extends AbstractC1282g2 {
    private static final C1237V0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C1237V0 c1237v0 = new C1237V0();
        zzb = c1237v0;
        AbstractC1282g2.m3259e(C1237V0.class, c1237v0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", C1165D.f5589w, "zzf"});
        }
        if (i4 == 3) {
            return new C1237V0();
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
