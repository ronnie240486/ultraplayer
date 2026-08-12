package p061V;

import android.os.Bundle;
import android.text.Spanned;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: V.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0616d {

    /* JADX INFO: renamed from: a */
    public static final String f2374a;

    /* JADX INFO: renamed from: b */
    public static final String f2375b;

    /* JADX INFO: renamed from: c */
    public static final String f2376c;

    /* JADX INFO: renamed from: d */
    public static final String f2377d;

    /* JADX INFO: renamed from: e */
    public static final String f2378e;

    static {
        int i3 = AbstractC0632A.f2454a;
        f2374a = Integer.toString(0, 36);
        f2375b = Integer.toString(1, 36);
        f2376c = Integer.toString(2, 36);
        f2377d = Integer.toString(3, 36);
        f2378e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m1537a(Spanned spanned, Object obj, int i3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f2374a, spanned.getSpanStart(obj));
        bundle2.putInt(f2375b, spanned.getSpanEnd(obj));
        bundle2.putInt(f2376c, spanned.getSpanFlags(obj));
        bundle2.putInt(f2377d, i3);
        if (bundle != null) {
            bundle2.putBundle(f2378e, bundle);
        }
        return bundle2;
    }
}
