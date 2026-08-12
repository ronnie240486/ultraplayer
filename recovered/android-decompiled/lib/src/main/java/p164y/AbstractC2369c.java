package p164y;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: y.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2369c {

    /* JADX INFO: renamed from: a */
    public static final Method f9922a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f9922a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4962a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2368b.m4961c(AbstractC2368b.m4959a(AbstractC2368b.m4960b(locale)));
        }
        try {
            return AbstractC2367a.m4958a((Locale) f9922a.invoke(null, locale));
        } catch (IllegalAccessException e3) {
            Log.w("ICUCompat", e3);
            return AbstractC2367a.m4958a(locale);
        } catch (InvocationTargetException e4) {
            Log.w("ICUCompat", e4);
            return AbstractC2367a.m4958a(locale);
        }
    }
}
