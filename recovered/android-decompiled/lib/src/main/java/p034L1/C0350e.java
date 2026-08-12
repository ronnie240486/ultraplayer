package p034L1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.zuxoplayer.app.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p046P1.AbstractC0491s;
import p060U1.AbstractC0610a;
import p060U1.C0611b;
import p060U1.C0612c;

/* JADX INFO: renamed from: L1.e */
/* JADX INFO: loaded from: classes.dex */
public class C0350e {

    /* JADX INFO: renamed from: a */
    public static final int f1133a;

    /* JADX INFO: renamed from: b */
    public static final C0350e f1134b;

    static {
        AtomicBoolean atomicBoolean = AbstractC0351f.f1135a;
        f1133a = 12451000;
        f1134b = new C0350e();
    }

    /* JADX INFO: renamed from: a */
    public Intent m957a(int i3, Context context, String str) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && AbstractC0610a.m1522y(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f1133a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                C0611b c0611bM1534a = C0612c.m1534a(context);
                sb.append(c0611bM1534a.f2316a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:78:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x015f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x016f, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public int m958b(Context context, int i3) {
        boolean z3;
        PackageInfo packageInfo;
        int i4;
        int i5;
        ApplicationInfo applicationInfo;
        boolean z4 = false;
        AtomicBoolean atomicBoolean = AbstractC0351f.f1135a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !AbstractC0351f.f1136b.get()) {
            synchronized (AbstractC0491s.f1637a) {
                try {
                    if (!AbstractC0491s.f1638b) {
                        AbstractC0491s.f1638b = true;
                        try {
                            Bundle bundle = C0612c.m1534a(context).f2316a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                AbstractC0491s.f1639c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e3);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i6 = AbstractC0491s.f1639c;
            if (i6 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i6 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f1133a + " but found " + i6 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (AbstractC0610a.m1522y(context)) {
            z3 = false;
        } else {
            if (AbstractC0610a.f2307e == null) {
                AbstractC0610a.f2307e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (AbstractC0610a.f2307e.booleanValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i7 = 9;
        if (z3) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C0352g.m967z(context);
            if (!C0352g.m966L(packageInfo2)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z3) {
                AbstractC0491s.m1213e(packageInfo);
                if (!C0352g.m966L(packageInfo)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z3 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i4 = packageInfo2.versionCode;
                    if (i4 == -1) {
                        i5 = -1;
                    } else {
                        i5 = i4 / 1000;
                    }
                    if (i5 < (i3 != -1 ? i3 / 1000 : -1)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i3 + " but found " + i4);
                        i7 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e4) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e4);
                                i7 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i7 = 0;
                        } else {
                            i7 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z3) {
                i4 = packageInfo2.versionCode;
                if (i4 == -1) {
                    i5 = -1;
                } else {
                    i5 = i4 / 1000;
                }
                if (i5 < (i3 != -1 ? i3 / 1000 : -1)) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i3 + " but found " + i4);
                    i7 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                }
            } else {
                i4 = packageInfo2.versionCode;
                if (i4 == -1) {
                    i5 = -1;
                } else {
                    i5 = i4 / 1000;
                }
                if (i5 < (i3 != -1 ? i3 / 1000 : -1)) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i3 + " but found " + i4);
                    i7 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i7 == 18) {
            z4 = true;
        } else if (i7 == 1) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                do {
                    if (!it.hasNext()) {
                        z4 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                    }
                } while (!"com.google.android.gms".equals(it.next().getAppPackageName()));
                z4 = true;
            } catch (PackageManager.NameNotFoundException | Exception unused4) {
            }
        }
        if (z4) {
            return 18;
        }
        return i7;
    }
}
