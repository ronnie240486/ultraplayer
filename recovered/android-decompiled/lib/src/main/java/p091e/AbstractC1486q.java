package p091e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p124n.C2014a;
import p124n.C2019f;
import p157w.C2312f;

/* JADX INFO: renamed from: e.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1486q {

    /* JADX INFO: renamed from: g */
    public static final ExecutorC1484o f6620g = new ExecutorC1484o(new ExecutorC1485p());

    /* JADX INFO: renamed from: h */
    public static final int f6621h = -100;

    /* JADX INFO: renamed from: i */
    public static C2312f f6622i = null;

    /* JADX INFO: renamed from: j */
    public static C2312f f6623j = null;

    /* JADX INFO: renamed from: k */
    public static Boolean f6624k = null;

    /* JADX INFO: renamed from: l */
    public static boolean f6625l = false;

    /* JADX INFO: renamed from: m */
    public static final C2019f f6626m = new C2019f(0);

    /* JADX INFO: renamed from: n */
    public static final Object f6627n = new Object();

    /* JADX INFO: renamed from: o */
    public static final Object f6628o = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean m3717c(Context context) {
        if (f6624k == null) {
            try {
                int i3 = AbstractServiceC1464I.f6512g;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1464I.class), Build.VERSION.SDK_INT >= 24 ? AbstractC1463H.m3678a() | 128 : 640).metaData;
                if (bundle != null) {
                    f6624k = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f6624k = Boolean.FALSE;
            }
        }
        return f6624k.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static void m3718g(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C) {
        synchronized (f6627n) {
            try {
                C2019f c2019f = f6626m;
                c2019f.getClass();
                C2014a c2014a = new C2014a(c2019f);
                while (c2014a.hasNext()) {
                    AbstractC1486q abstractC1486q = (AbstractC1486q) ((WeakReference) c2014a.next()).get();
                    if (abstractC1486q == layoutInflaterFactory2C1458C || abstractC1486q == null) {
                        c2014a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3655a();

    /* JADX INFO: renamed from: d */
    public abstract void mo3656d();

    /* JADX INFO: renamed from: e */
    public abstract void mo3657e();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo3658h(int i3);

    /* JADX INFO: renamed from: i */
    public abstract void mo3659i(int i3);

    /* JADX INFO: renamed from: j */
    public abstract void mo3660j(View view);

    /* JADX INFO: renamed from: k */
    public abstract void mo3661k(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: l */
    public abstract void mo3662l(CharSequence charSequence);
}
