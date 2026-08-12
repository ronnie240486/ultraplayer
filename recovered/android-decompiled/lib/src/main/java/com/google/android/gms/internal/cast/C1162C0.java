package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1162C0 extends AbstractC1282g2 {
    private static final C1162C0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C1162C0 c1162c0 = new C1162C0();
        zzb = c1162c0;
        AbstractC1282g2.m3259e(C1162C0.class, c1162c0);
    }

    /* JADX INFO: renamed from: l */
    public static C1158B0 m3120l() {
        return (C1158B0) zzb.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3121m(C1162C0 c1162c0, int i3) {
        c1162c0.zzd |= 2;
        c1162c0.zzf = i3;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m3122n(C1162C0 c1162c0, int i3) {
        c1162c0.zze = i3 - 1;
        c1162c0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", C1256a0.f5787v, "zzf"});
        }
        if (i4 == 3) {
            return new C1162C0();
        }
        if (i4 == 4) {
            return new C1158B0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
