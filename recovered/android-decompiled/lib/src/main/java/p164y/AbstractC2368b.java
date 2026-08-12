package p164y;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: y.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2368b {
    /* JADX INFO: renamed from: a */
    public static ULocale m4959a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m4960b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m4961c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
