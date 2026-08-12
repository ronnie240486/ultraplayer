package p046P1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: P1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0498z {

    /* JADX INFO: renamed from: d */
    public static final Uri f1652d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    public final String f1653a;

    /* JADX INFO: renamed from: b */
    public final String f1654b;

    /* JADX INFO: renamed from: c */
    public final boolean f1655c;

    public C0498z(String str, boolean z3) {
        AbstractC0491s.m1211c(str);
        this.f1653a = str;
        AbstractC0491s.m1211c("com.google.android.gms");
        this.f1654b = "com.google.android.gms";
        this.f1655c = z3;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m1217a(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.f1653a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f1655c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f1652d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e3) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e3.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f1654b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0498z)) {
            return false;
        }
        C0498z c0498z = (C0498z) obj;
        return AbstractC0491s.m1216h(this.f1653a, c0498z.f1653a) && AbstractC0491s.m1216h(this.f1654b, c0498z.f1654b) && AbstractC0491s.m1216h(null, null) && this.f1655c == c0498z.f1655c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1653a, this.f1654b, null, 4225, Boolean.valueOf(this.f1655c)});
    }

    public final String toString() {
        String str = this.f1653a;
        if (str != null) {
            return str;
        }
        AbstractC0491s.m1213e(null);
        throw null;
    }
}
