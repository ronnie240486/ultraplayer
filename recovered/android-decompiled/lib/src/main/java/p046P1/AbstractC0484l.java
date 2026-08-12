package p046P1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p034L1.AbstractC0351f;
import p060U1.AbstractC0610a;
import p060U1.C0612c;
import p124n.C2022i;
import p157w.AbstractC2309c;
import p157w.C2312f;
import p157w.C2316j;

/* JADX INFO: renamed from: P1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0484l {

    /* JADX INFO: renamed from: a */
    public static final C2022i f1616a = new C2022i();

    /* JADX INFO: renamed from: b */
    public static Locale f1617b;

    /* JADX INFO: renamed from: a */
    public static String m1198a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C0612c.m1534a(context).f2316a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1199b(Context context, int i3) {
        Resources resources = context.getResources();
        String strM1198a = m1198a(context);
        if (i3 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM1198a);
        }
        if (i3 == 2) {
            return AbstractC0610a.m1522y(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM1198a);
        }
        if (i3 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM1198a);
        }
        if (i3 == 5) {
            return m1201d(context, "common_google_play_services_invalid_account_text", strM1198a);
        }
        if (i3 == 7) {
            return m1201d(context, "common_google_play_services_network_error_text", strM1198a);
        }
        if (i3 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM1198a);
        }
        if (i3 == 20) {
            return m1201d(context, "common_google_play_services_restricted_profile_text", strM1198a);
        }
        switch (i3) {
            case 16:
                return m1201d(context, "common_google_play_services_api_unavailable_text", strM1198a);
            case 17:
                return m1201d(context, "common_google_play_services_sign_in_failed_text", strM1198a);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM1198a);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM1198a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1200c(Context context, int i3) {
        Resources resources = context.getResources();
        switch (i3) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m1202e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m1202e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i3);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m1202e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m1202e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m1201d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM1202e = m1202e(context, str);
        if (strM1202e == null) {
            strM1202e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM1202e, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m1202e(Context context, String str) {
        Resources resourcesForApplication;
        C2022i c2022i = f1616a;
        synchronized (c2022i) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new C2312f(new C2316j(AbstractC2309c.m4926a(configuration))) : C2312f.m4933a(configuration.locale)).f9832a.get(0);
                if (!locale.equals(f1617b)) {
                    c2022i.clear();
                    f1617b = locale;
                }
                String str2 = (String) c2022i.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = AbstractC0351f.f1135a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f1616a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
