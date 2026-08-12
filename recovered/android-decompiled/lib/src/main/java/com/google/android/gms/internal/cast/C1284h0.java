package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1284h0 extends AbstractC1282g2 {
    private static final InterfaceC1294j2 zzb = new C1196K2();
    private static final C1284h0 zzd;
    private int zze;
    private C1300l0 zzf;
    private C1245X0 zzg;
    private InterfaceC1302l2 zzh = C1180G2.f5631j;
    private InterfaceC1290i2 zzi = C1286h2.f5911j;

    static {
        C1284h0 c1284h0 = new C1284h0();
        zzd = c1284h0;
        AbstractC1282g2.m3259e(C1284h0.class, c1284h0);
    }

    /* JADX INFO: renamed from: l */
    public static C1280g0 m3268l() {
        return (C1280g0) zzd.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3269m(C1284h0 c1284h0, C1300l0 c1300l0) {
        c1284h0.zzf = c1300l0;
        c1284h0.zze |= 1;
    }

    /* JADX INFO: renamed from: n */
    public static void m3270n(C1284h0 c1284h0, ArrayList arrayList) {
        RandomAccess randomAccess = c1284h0.zzi;
        if (!((AbstractC1234U1) randomAccess).f5713g) {
            C1286h2 c1286h2 = (C1286h2) randomAccess;
            int i3 = c1286h2.f5913i;
            int i4 = i3 == 0 ? 10 : i3 + i3;
            if (i4 < i3) {
                throw new IllegalArgumentException();
            }
            c1284h0.zzi = new C1286h2(Arrays.copyOf(c1286h2.f5912h, i4), c1286h2.f5913i, true);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((C1286h2) c1284h0.zzi).m3271g(((EnumC1272e0) obj).f5898g);
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", C1237V0.class, "zzi", C1256a0.f5763B});
        }
        if (i4 == 3) {
            return new C1284h0();
        }
        if (i4 == 4) {
            return new C1280g0(zzd);
        }
        if (i4 != 5) {
            return null;
        }
        return zzd;
    }
}
