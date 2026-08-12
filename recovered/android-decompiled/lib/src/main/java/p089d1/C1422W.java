package p089d1;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: d1.W */
/* JADX INFO: loaded from: classes.dex */
public final class C1422W {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1423X f6281a;

    public C1422W(C1423X c1423x) {
        this.f6281a = c1423x;
    }

    /* JADX INFO: renamed from: a */
    public static void m3549a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    /* JADX INFO: renamed from: b */
    public final void m3550b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        C1423X c1423x = this.f6281a;
        c1423x.f6283g = string;
        c1423x.f6284h = bundle.getString("transferableTitle");
    }
}
