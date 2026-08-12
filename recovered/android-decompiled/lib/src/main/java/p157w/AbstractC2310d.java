package p157w;

import java.util.Locale;
import p164y.AbstractC2369c;

/* JADX INFO: renamed from: w.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2310d {

    /* JADX INFO: renamed from: a */
    public static final Locale[] f9830a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: a */
    public static Locale m4928a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4929b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f9830a;
            for (Locale locale3 : localeArr) {
                if (locale3.equals(locale)) {
                    return false;
                }
            }
            for (Locale locale4 : localeArr) {
                if (locale4.equals(locale2)) {
                    return false;
                }
            }
            String strM4962a = AbstractC2369c.m4962a(locale);
            if (!strM4962a.isEmpty()) {
                return strM4962a.equals(AbstractC2369c.m4962a(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
        }
        return false;
    }
}
