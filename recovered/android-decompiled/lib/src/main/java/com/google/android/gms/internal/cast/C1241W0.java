package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1241W0 extends AbstractC1282g2 {
    private static final C1241W0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C1241W0 c1241w0 = new C1241W0();
        zzb = c1241w0;
        AbstractC1282g2.m3259e(C1241W0.class, c1241w0);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", C1256a0.f5767b, "zzf", "zzg", C1256a0.f5765D});
        }
        if (i4 == 3) {
            return new C1241W0();
        }
        if (i4 == 4) {
            return new C1240W(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zzh = abstractC1282g2 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
