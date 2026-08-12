package p091e;

import android.content.res.Configuration;
import android.os.LocaleList;
import p157w.C2312f;

/* JADX INFO: renamed from: e.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1491v {
    /* JADX INFO: renamed from: a */
    public static void m3722a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static C2312f m3723b(Configuration configuration) {
        return C2312f.m4934b(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m3724c(C2312f c2312f) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2312f.f9832a.mo4936b()));
    }

    /* JADX INFO: renamed from: d */
    public static void m3725d(Configuration configuration, C2312f c2312f) {
        configuration.setLocales(LocaleList.forLanguageTags(c2312f.f9832a.mo4936b()));
    }
}
