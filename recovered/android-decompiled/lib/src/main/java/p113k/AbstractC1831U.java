package p113k;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: k.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1831U {
    /* JADX INFO: renamed from: a */
    public static LocaleList m4341a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m4342b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
