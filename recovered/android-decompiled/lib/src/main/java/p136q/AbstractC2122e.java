package p136q;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: q.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2122e {
    /* JADX INFO: renamed from: a */
    public static int m4665a(AppOpsManager appOpsManager, String str, int i3, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i3, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m4666b(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static AppOpsManager m4667c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
