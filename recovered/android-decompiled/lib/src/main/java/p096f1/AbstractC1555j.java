package p096f1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p095f0.C1528a;
import p128o.C2060k;

/* JADX INFO: renamed from: f1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1555j {

    /* JADX INFO: renamed from: a */
    public static final C2060k f7059a = new C2060k();

    /* JADX INFO: renamed from: b */
    public static final Object f7060b = new Object();

    /* JADX INFO: renamed from: c */
    public static C1528a f7061c = null;

    /* JADX INFO: renamed from: a */
    public static long m3875a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC1553h.m3872a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C1528a m3876b() {
        C1528a c1528a = new C1528a(4);
        f7061c = c1528a;
        f7059a.m4628h(c1528a);
        return f7061c;
    }

    /* JADX INFO: renamed from: c */
    public static void m3877c(Context context, boolean z3) {
        C1554i c1554iM3873a;
        int i3;
        if (z3 || f7061c == null) {
            synchronized (f7060b) {
                if (!z3) {
                    try {
                        if (f7061c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28 && i4 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i5 = 0;
                    boolean z4 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z5 = file2.exists() && length2 > 0;
                    try {
                        long jM3875a = m3875a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c1554iM3873a = C1554i.m3873a(file3);
                            } catch (IOException unused) {
                                m3876b();
                                return;
                            }
                        } else {
                            c1554iM3873a = null;
                        }
                        if (c1554iM3873a != null && c1554iM3873a.f7057c == jM3875a && (i3 = c1554iM3873a.f7056b) != 2) {
                            i5 = i3;
                        } else if (z4) {
                            i5 = 1;
                        } else if (z5) {
                            i5 = 2;
                        }
                        if (z3 && z5 && i5 != 1) {
                            i5 = 2;
                        }
                        C1554i c1554i = new C1554i(1, (c1554iM3873a == null || c1554iM3873a.f7056b != 2 || i5 != 1 || length >= c1554iM3873a.f7058d) ? i5 : 3, jM3875a, length2);
                        if (c1554iM3873a == null || !c1554iM3873a.equals(c1554i)) {
                            try {
                                c1554i.m3874b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m3876b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m3876b();
                        return;
                    }
                }
                m3876b();
            }
        }
    }
}
