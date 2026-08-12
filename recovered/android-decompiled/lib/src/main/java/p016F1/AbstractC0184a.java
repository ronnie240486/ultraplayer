package p016F1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.mediarouter.app.C1033b;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.C1166D0;
import com.google.android.gms.internal.cast.EnumC1272e0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p089d1.C1451x;

/* JADX INFO: renamed from: F1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0184a {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f421a;

    /* JADX INFO: renamed from: b */
    public static final Object f422b;

    static {
        AbstractC0491s.m1212d("CastButtonFactory", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        new ArrayList();
        f421a = new ArrayList();
        f422b = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m669a(Context context, C1033b c1033b) {
        C0185b c0185bM670a;
        AbstractC0491s.m1210b();
        if (c1033b != null) {
            AbstractC0491s.m1210b();
            C0296b c0296b = C0185b.f423k;
            AbstractC0491s.m1210b();
            C1451x c1451xM3639b = null;
            try {
                c0185bM670a = C0185b.m670a(context);
            } catch (RuntimeException e3) {
                Object[] objArr = {e3};
                C0296b c0296b2 = C0185b.f423k;
                Log.e(c0296b2.f788a, c0296b2.m833d("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", objArr));
                c0185bM670a = null;
            }
            if (c0185bM670a != null) {
                AbstractC0491s.m1210b();
                try {
                    C0197n c0197n = (C0197n) c0185bM670a.f427b;
                    Parcel parcelM1895q0 = c0197n.m1895q0(c0197n.m1894e0(), 1);
                    Bundle bundle = (Bundle) AbstractC1339v.m3419a(parcelM1895q0, Bundle.CREATOR);
                    parcelM1895q0.recycle();
                    c1451xM3639b = C1451x.m3639b(bundle);
                } catch (RemoteException e4) {
                    C0185b.f423k.m830a(e4, "Unable to call %s on %s.", "getMergedSelectorAsBundle", InterfaceC0199p.class.getSimpleName());
                }
                if (c1451xM3639b != null) {
                    c1033b.setRouteSelector(c1451xM3639b);
                }
            }
            synchronized (f422b) {
                f421a.add(new WeakReference(c1033b));
            }
        }
        C1166D0.m3123a(EnumC1272e0.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }
}
