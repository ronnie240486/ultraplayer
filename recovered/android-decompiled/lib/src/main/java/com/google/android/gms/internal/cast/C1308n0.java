package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1308n0 extends AbstractC1282g2 {
    private static final C1308n0 zzb;
    private int zzd;
    private C1194K0 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private C1293j1 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        C1308n0 c1308n0 = new C1308n0();
        zzb = c1308n0;
        AbstractC1282g2.m3259e(C1308n0.class, c1308n0);
    }

    /* JADX INFO: renamed from: l */
    public static C1304m0 m3334l() {
        return (C1304m0) zzb.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static C1304m0 m3335m(C1308n0 c1308n0) {
        AbstractC1278f2 abstractC1278f2M3265j = zzb.m3265j();
        AbstractC1282g2 abstractC1282g2 = abstractC1278f2M3265j.f5901g;
        if (!abstractC1282g2.equals(c1308n0)) {
            if (!abstractC1278f2M3265j.f5902h.m3263g()) {
                AbstractC1282g2 abstractC1282g3 = (AbstractC1282g2) abstractC1282g2.mo3096h(4, null);
                C1176F2.f5618c.m3131a(abstractC1282g3.getClass()).mo3104b(abstractC1282g3, abstractC1278f2M3265j.f5902h);
                abstractC1278f2M3265j.f5902h = abstractC1282g3;
            }
            AbstractC1282g2 abstractC1282g4 = abstractC1278f2M3265j.f5902h;
            C1176F2.f5618c.m3131a(abstractC1282g4.getClass()).mo3104b(abstractC1282g4, c1308n0);
        }
        return (C1304m0) abstractC1278f2M3265j;
    }

    /* JADX INFO: renamed from: n */
    public static C1308n0 m3336n() {
        return zzb;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m3337o(C1308n0 c1308n0, C1194K0 c1194k0) {
        c1308n0.zze = c1194k0;
        c1308n0.zzd |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3338p(C1308n0 c1308n0, boolean z3) {
        c1308n0.zzd |= 2;
        c1308n0.zzf = z3;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m3339q(C1308n0 c1308n0, long j3) {
        c1308n0.zzd |= 4;
        c1308n0.zzg = j3;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m3340r(C1308n0 c1308n0, int i3) {
        c1308n0.zzd |= 64;
        c1308n0.zzk = i3;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m3341s(C1308n0 c1308n0, int i3) {
        c1308n0.zzd |= 128;
        c1308n0.zzl = i3;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m3342t(C1308n0 c1308n0, int i3) {
        c1308n0.zzd |= 1024;
        c1308n0.zzo = i3;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m3343u(C1308n0 c1308n0, boolean z3) {
        c1308n0.zzd |= 2048;
        c1308n0.zzp = z3;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m3344v(C1308n0 c1308n0, int i3) {
        c1308n0.zzd |= 4096;
        c1308n0.zzq = i3;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m3345w(C1308n0 c1308n0, int i3) {
        c1308n0.zzd |= 8192;
        c1308n0.zzr = i3;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m3346x(C1308n0 c1308n0, boolean z3) {
        c1308n0.zzd |= 16384;
        c1308n0.zzs = z3;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C1165D.f5578l, "zzj", C1165D.f5577k, "zzk", "zzl", "zzm", "zzn", C1165D.f5591y, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i4 == 3) {
            return new C1308n0();
        }
        if (i4 == 4) {
            return new C1304m0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
