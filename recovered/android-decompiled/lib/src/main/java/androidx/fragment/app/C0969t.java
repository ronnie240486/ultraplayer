package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.C0908a;
import java.util.ArrayList;
import java.util.Map;
import p053S0.C0536b;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0969t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0937C f4261b;

    public /* synthetic */ C0969t(AbstractC0937C abstractC0937C, int i3) {
        this.f4260a = i3;
        this.f4261b = abstractC0937C;
    }

    /* JADX INFO: renamed from: a */
    public final void m2545a(Object obj) {
        switch (this.f4260a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    iArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue() ? 0 : -1;
                }
                AbstractC0937C abstractC0937C = this.f4261b;
                C0975z c0975z = (C0975z) abstractC0937C.f4053C.pollFirst();
                if (c0975z == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    C0536b c0536b = abstractC0937C.f4066c;
                    String str = c0975z.f4271g;
                    if (c0536b.m1336d(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                C0908a c0908a = (C0908a) obj;
                AbstractC0937C abstractC0937C2 = this.f4261b;
                C0975z c0975z2 = (C0975z) abstractC0937C2.f4053C.pollFirst();
                if (c0975z2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    C0536b c0536b2 = abstractC0937C2.f4066c;
                    String str2 = c0975z2.f4271g;
                    AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM1336d = c0536b2.m1336d(str2);
                    if (abstractComponentCallbacksC0963nM1336d == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0963nM1336d.m2541p(c0975z2.f4272h, c0908a.f3776g, c0908a.f3777h);
                    }
                }
                break;
            default:
                C0908a c0908a2 = (C0908a) obj;
                AbstractC0937C abstractC0937C3 = this.f4261b;
                C0975z c0975z3 = (C0975z) abstractC0937C3.f4053C.pollFirst();
                if (c0975z3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    C0536b c0536b3 = abstractC0937C3.f4066c;
                    String str3 = c0975z3.f4271g;
                    AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM1336d2 = c0536b3.m1336d(str3);
                    if (abstractComponentCallbacksC0963nM1336d2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0963nM1336d2.m2541p(c0975z3.f4272h, c0908a2.f3776g, c0908a2.f3777h);
                    }
                }
                break;
        }
    }
}
