package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1257a1 extends AbstractC1282g2 {
    private static final C1257a1 zzb;
    private int zzd;
    private long zze;
    private InterfaceC1298k2 zzf;
    private InterfaceC1298k2 zzg;

    static {
        C1257a1 c1257a1 = new C1257a1();
        zzb = c1257a1;
        AbstractC1282g2.m3259e(C1257a1.class, c1257a1);
    }

    public C1257a1() {
        C1334t2 c1334t2 = C1334t2.f5968j;
        this.zzf = c1334t2;
        this.zzg = c1334t2;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new C1257a1();
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
