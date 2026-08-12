package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1268d0 {

    /* JADX INFO: renamed from: d */
    public static final C0296b f5826d = new C0296b("ApplicationAnalyticsUtils", null);

    /* JADX INFO: renamed from: e */
    public static final String f5827e = "21.4.0";

    /* JADX INFO: renamed from: a */
    public final String f5828a;

    /* JADX INFO: renamed from: b */
    public final Map f5829b;

    /* JADX INFO: renamed from: c */
    public final Map f5830c;

    public C1268d0(String str, Bundle bundle) {
        this.f5828a = str;
        this.f5829b = AbstractC2003a.m4551x("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.f5830c = AbstractC2003a.m4551x("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    /* JADX INFO: renamed from: a */
    public final C1328s0 m3245a(C1264c0 c1264c0, int i3) {
        int iIntValue;
        int iIntValue2;
        C1324r0 c1324r0M3246b = m3246b(c1264c0);
        C1304m0 c1304m0M3335m = C1308n0.m3335m(c1324r0M3246b.m3393d());
        Map map = this.f5830c;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i3);
            if (map.containsKey(numValueOf)) {
                Integer num = (Integer) map.get(numValueOf);
                AbstractC0491s.m1213e(num);
                iIntValue = num.intValue();
            } else {
                iIntValue = i3 + 10000;
            }
        } else {
            iIntValue = i3 + 10000;
        }
        c1304m0M3335m.m3256c();
        C1308n0.m3340r((C1308n0) c1304m0M3335m.f5902h, iIntValue);
        Map map2 = this.f5829b;
        if (map2 != null) {
            Integer numValueOf2 = Integer.valueOf(i3);
            if (map2.containsKey(numValueOf2)) {
                Integer num2 = (Integer) map2.get(numValueOf2);
                AbstractC0491s.m1213e(num2);
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = i3 + 10000;
            }
        } else {
            iIntValue2 = i3 + 10000;
        }
        c1304m0M3335m.m3256c();
        C1308n0.m3341s((C1308n0) c1304m0M3335m.f5902h, iIntValue2);
        c1324r0M3246b.m3394e((C1308n0) c1304m0M3335m.m3254a());
        return (C1328s0) c1324r0M3246b.m3254a();
    }

    /* JADX INFO: renamed from: b */
    public final C1324r0 m3246b(C1264c0 c1264c0) {
        long jLongValue;
        C1324r0 c1324r0M3395m = C1328s0.m3395m();
        long j3 = c1264c0.f5816d;
        c1324r0M3395m.m3256c();
        C1328s0.m3402t((C1328s0) c1324r0M3395m.f5902h, j3);
        int i3 = c1264c0.f5817e;
        c1264c0.f5817e = i3 + 1;
        c1324r0M3395m.m3256c();
        C1328s0.m3397o((C1328s0) c1324r0M3395m.f5902h, i3);
        String str = c1264c0.f5815c;
        if (str != null) {
            c1324r0M3395m.m3256c();
            C1328s0.m3407y((C1328s0) c1324r0M3395m.f5902h, str);
        }
        String str2 = c1264c0.f5820h;
        if (str2 != null) {
            c1324r0M3395m.m3256c();
            C1328s0.m3403u((C1328s0) c1324r0M3395m.f5902h, str2);
        }
        C1296k0 c1296k0M3276l = C1300l0.m3276l();
        c1296k0M3276l.m3256c();
        C1300l0.m3278n((C1300l0) c1296k0M3276l.f5902h, f5827e);
        c1296k0M3276l.m3256c();
        C1300l0.m3277m((C1300l0) c1296k0M3276l.f5902h, this.f5828a);
        C1300l0 c1300l0 = (C1300l0) c1296k0M3276l.m3254a();
        c1324r0M3395m.m3256c();
        C1328s0.m3400r((C1328s0) c1324r0M3395m.f5902h, c1300l0);
        C1304m0 c1304m0M3334l = C1308n0.m3334l();
        if (c1264c0.f5814b != null) {
            C1190J0 c1190j0M3175l = C1194K0.m3175l();
            String str3 = c1264c0.f5814b;
            c1190j0M3175l.m3256c();
            C1194K0.m3176m((C1194K0) c1190j0M3175l.f5902h, str3);
            C1194K0 c1194k0 = (C1194K0) c1190j0M3175l.m3254a();
            c1304m0M3334l.m3256c();
            C1308n0.m3337o((C1308n0) c1304m0M3334l.f5902h, c1194k0);
        }
        c1304m0M3334l.m3256c();
        C1308n0.m3338p((C1308n0) c1304m0M3334l.f5902h, false);
        String str4 = c1264c0.f5818f;
        if (str4 != null) {
            try {
                String strReplace = str4.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException e3) {
                Object[] objArr = {str4};
                C0296b c0296b = f5826d;
                Log.w(c0296b.f788a, c0296b.m833d("receiverSessionId %s is not valid for hash", objArr), e3);
                jLongValue = 0;
            }
            c1304m0M3334l.m3256c();
            C1308n0.m3339q((C1308n0) c1304m0M3334l.f5902h, jLongValue);
        }
        int i4 = c1264c0.f5819g;
        c1304m0M3334l.m3256c();
        C1308n0.m3342t((C1308n0) c1304m0M3334l.f5902h, i4);
        boolean z3 = c1264c0.f5813a.f5810e == 2;
        c1304m0M3334l.m3256c();
        C1308n0.m3343u((C1308n0) c1304m0M3334l.f5902h, z3);
        boolean z4 = c1264c0.f5821i;
        c1304m0M3334l.m3256c();
        C1308n0.m3346x((C1308n0) c1304m0M3334l.f5902h, z4);
        c1324r0M3395m.m3256c();
        C1328s0.m3398p((C1328s0) c1324r0M3395m.f5902h, (C1308n0) c1304m0M3334l.m3254a());
        return c1324r0M3395m;
    }
}
