package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1347x implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5984g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5985h;

    public /* synthetic */ RunnableC1347x(int i3, Object obj) {
        this.f5984g = i3;
        this.f5985h = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5984g) {
            case 0:
                List list = ((C1355z) this.f5985h).f5999e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 1:
                C1260b0 c1260b0 = (C1260b0) this.f5985h;
                C1264c0 c1264c0 = c1260b0.f5804g;
                if (c1264c0 != null) {
                    c1260b0.f5798a.m3180a((C1328s0) c1260b0.f5800c.m3246b(c1264c0).m3254a(), 223);
                }
                c1260b0.m3240e();
                return;
            default:
                C1166D0 c1166d0 = (C1166D0) this.f5985h;
                if (c1166d0.f5601f.isEmpty()) {
                    return;
                }
                HashSet hashSet = c1166d0.f5602g;
                HashSet hashSet2 = c1166d0.f5601f;
                long j3 = true != hashSet.equals(hashSet2) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j4 = c1166d0.f5603h;
                if (j4 == 0 || jCurrentTimeMillis - j4 >= j3) {
                    C1166D0.f5593i.m831b("Upload the feature usage report.", new Object[0]);
                    C1296k0 c1296k0M3276l = C1300l0.m3276l();
                    String str = C1166D0.f5594j;
                    c1296k0M3276l.m3256c();
                    C1300l0.m3278n((C1300l0) c1296k0M3276l.f5902h, str);
                    c1296k0M3276l.m3256c();
                    C1300l0.m3277m((C1300l0) c1296k0M3276l.f5902h, c1166d0.f5598c);
                    C1300l0 c1300l0 = (C1300l0) c1296k0M3276l.m3254a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet2);
                    C1280g0 c1280g0M3268l = C1284h0.m3268l();
                    c1280g0M3268l.m3256c();
                    C1284h0.m3270n((C1284h0) c1280g0M3268l.f5902h, arrayList);
                    c1280g0M3268l.m3256c();
                    C1284h0.m3269m((C1284h0) c1280g0M3268l.f5902h, c1300l0);
                    C1284h0 c1284h0 = (C1284h0) c1280g0M3268l.m3254a();
                    C1324r0 c1324r0M3395m = C1328s0.m3395m();
                    c1324r0M3395m.m3256c();
                    C1328s0.m3401s((C1328s0) c1324r0M3395m.f5902h, c1284h0);
                    c1166d0.f5596a.m3180a((C1328s0) c1324r0M3395m.m3254a(), 243);
                    SharedPreferences sharedPreferences = c1166d0.f5597b;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!hashSet.equals(hashSet2)) {
                        hashSet.clear();
                        hashSet.addAll(hashSet2);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String string = Integer.toString(((EnumC1272e0) it.next()).f5898g);
                            String str2 = "feature_usage_timestamp_reported_feature_" + string;
                            if (!sharedPreferences.contains(str2)) {
                                str2 = "feature_usage_timestamp_detected_feature_" + string;
                            }
                            String str3 = "feature_usage_timestamp_reported_feature_" + string;
                            if (!TextUtils.equals(str2, str3)) {
                                long j5 = sharedPreferences.getLong(str2, 0L);
                                editorEdit.remove(str2);
                                if (j5 != 0) {
                                    editorEdit.putLong(str3, j5);
                                }
                            }
                        }
                    }
                    c1166d0.f5603h = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
