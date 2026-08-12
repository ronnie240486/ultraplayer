package p096f1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: f1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1553h {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m3872a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
