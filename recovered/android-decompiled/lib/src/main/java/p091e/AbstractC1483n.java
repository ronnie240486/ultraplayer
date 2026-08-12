package p091e;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: e.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1483n {
    /* JADX INFO: renamed from: a */
    public static LocaleList m3714a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m3715b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
