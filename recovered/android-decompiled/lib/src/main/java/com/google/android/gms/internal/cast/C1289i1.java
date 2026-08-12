package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1289i1 extends AbstractC1282g2 {
    private static final C1289i1 zzb;
    private int zzd;
    private InterfaceC1302l2 zze;
    private InterfaceC1302l2 zzf;
    private C1309n1 zzg;

    static {
        C1289i1 c1289i1 = new C1289i1();
        zzb = c1289i1;
        AbstractC1282g2.m3259e(C1289i1.class, c1289i1);
    }

    public C1289i1() {
        C1180G2 c1180g2 = C1180G2.f5631j;
        this.zze = c1180g2;
        this.zzf = c1180g2;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", C1321q1.class, "zzf", C1186I0.class, "zzg"});
        }
        if (i4 == 3) {
            return new C1289i1();
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
