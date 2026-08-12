package p136q;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: q.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2121d {
    /* JADX INFO: renamed from: a */
    public static <T> T m4661a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: b */
    public static int m4662b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m4663c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m4664d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
