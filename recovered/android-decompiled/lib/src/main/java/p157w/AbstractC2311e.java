package p157w;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: w.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2311e {
    /* JADX INFO: renamed from: a */
    public static LocaleList m4930a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: b */
    public static LocaleList m4931b() {
        return LocaleList.getAdjustedDefault();
    }

    /* JADX INFO: renamed from: c */
    public static LocaleList m4932c() {
        return LocaleList.getDefault();
    }
}
