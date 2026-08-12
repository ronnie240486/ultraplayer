package p130o1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p034L1.C0352g;
import p046P1.C0475c;
import p089d1.C1447t;
import p131o2.C2084d;
import p134p1.AbstractC2088a;
import p134p1.AbstractC2102o;
import p134p1.AbstractC2104q;
import p134p1.AbstractC2105r;
import p134p1.AbstractC2106s;
import p134p1.AbstractC2109v;
import p134p1.C2089b;
import p134p1.C2090c;
import p134p1.C2091d;
import p134p1.C2092e;
import p134p1.C2093f;
import p134p1.C2094g;
import p134p1.C2095h;
import p134p1.C2096i;
import p134p1.C2097j;
import p134p1.C2098k;
import p134p1.C2099l;
import p134p1.C2101n;
import p134p1.EnumC2107t;
import p134p1.EnumC2108u;
import p138q1.C2172h;
import p142r1.InterfaceC2202g;

/* JADX INFO: renamed from: o1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2080b implements InterfaceC2202g {

    /* JADX INFO: renamed from: a */
    public final C1447t f9035a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f9036b;

    /* JADX INFO: renamed from: c */
    public final Context f9037c;

    /* JADX INFO: renamed from: d */
    public final URL f9038d;

    /* JADX INFO: renamed from: e */
    public final C0352g f9039e;

    /* JADX INFO: renamed from: f */
    public final C0352g f9040f;

    /* JADX INFO: renamed from: g */
    public final int f9041g;

    public C2080b(Context context, C0352g c0352g, C0352g c0352g2) {
        C2084d c2084d = new C2084d();
        C2090c c2090c = C2090c.f9079a;
        c2084d.m4645a(AbstractC2102o.class, c2090c);
        c2084d.m4645a(C2096i.class, c2090c);
        C2093f c2093f = C2093f.f9092a;
        c2084d.m4645a(AbstractC2106s.class, c2093f);
        c2084d.m4645a(C2099l.class, c2093f);
        C2091d c2091d = C2091d.f9081a;
        c2084d.m4645a(AbstractC2104q.class, c2091d);
        c2084d.m4645a(C2097j.class, c2091d);
        C2089b c2089b = C2089b.f9066a;
        c2084d.m4645a(AbstractC2088a.class, c2089b);
        c2084d.m4645a(C2095h.class, c2089b);
        C2092e c2092e = C2092e.f9084a;
        c2084d.m4645a(AbstractC2105r.class, c2092e);
        c2084d.m4645a(C2098k.class, c2092e);
        C2094g c2094g = C2094g.f9100a;
        c2084d.m4645a(AbstractC2109v.class, c2094g);
        c2084d.m4645a(C2101n.class, c2094g);
        c2084d.f9052d = true;
        this.f9035a = new C1447t(19, c2084d);
        this.f9037c = context;
        this.f9036b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f9038d = m4643b(C2079a.f9030c);
        this.f9039e = c0352g2;
        this.f9040f = c0352g;
        this.f9041g = 40000;
    }

    /* JADX INFO: renamed from: b */
    public static URL m4643b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException("Invalid url: " + str, e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x0110  */
    /* JADX INFO: renamed from: a */
    public final C2172h m4644a(C2172h c2172h) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f9036b.getActiveNetworkInfo();
        C0475c c0475cM4758c = c2172h.m4758c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c0475cM4758c.f1572e;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i3));
        c0475cM4758c.m1192a("model", Build.MODEL);
        c0475cM4758c.m1192a("hardware", Build.HARDWARE);
        c0475cM4758c.m1192a("device", Build.DEVICE);
        c0475cM4758c.m1192a("product", Build.PRODUCT);
        c0475cM4758c.m1192a("os-uild", Build.ID);
        c0475cM4758c.m1192a("manufacturer", Build.MANUFACTURER);
        c0475cM4758c.m1192a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c0475cM4758c.f1572e;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i4 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC2108u.f9137g;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c0475cM4758c.f1572e;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC2107t.f9135g;
                subtype = 100;
            } else if (((EnumC2107t) EnumC2107t.f9135g.get(subtype)) == null) {
            }
            map = (HashMap) c0475cM4758c.f1572e;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c0475cM4758c.m1192a("country", Locale.getDefault().getCountry());
            c0475cM4758c.m1192a("locale", Locale.getDefault().getLanguage());
            Context context = this.f9037c;
            c0475cM4758c.m1192a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("TransportRuntime.".concat("CctTransportBackend"), "Unable to find version code for package", e3);
            }
            c0475cM4758c.m1192a("application_build", Integer.toString(i4));
            return c0475cM4758c.m1194d();
        }
        SparseArray sparseArray3 = EnumC2107t.f9135g;
        subtype = 0;
        map = (HashMap) c0475cM4758c.f1572e;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c0475cM4758c.m1192a("country", Locale.getDefault().getCountry());
        c0475cM4758c.m1192a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f9037c;
        c0475cM4758c.m1192a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i4 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c0475cM4758c.m1192a("application_build", Integer.toString(i4));
        return c0475cM4758c.m1194d();
    }
}
